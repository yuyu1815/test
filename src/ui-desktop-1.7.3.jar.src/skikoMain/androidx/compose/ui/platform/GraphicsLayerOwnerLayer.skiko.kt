/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.compose.ui.platform

import androidx.compose.ui.geometry.MutableRect
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.isUnspecified
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.Fields
import androidx.compose.ui.graphics.GraphicsContext
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.layer.GraphicsLayer
import androidx.compose.ui.graphics.layer.drawLayer
import androidx.compose.ui.graphics.layer.setOutline
import androidx.compose.ui.graphics.prepareTransformationMatrix
import androidx.compose.ui.internal.checkPreconditionNotNull
import androidx.compose.ui.internal.requirePrecondition
import androidx.compose.ui.node.OwnedLayer
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection


internal class GraphicsLayerOwnerLayer(
    private var graphicsLayer: GraphicsLayer,
    // when we have a context it means the object is created by us and we need to release it
    private val context: GraphicsContext?,
    drawBlock: (canvas: Canvas, parentLayer: GraphicsLayer?) -> Unit,
    invalidateParentLayer: () -> Unit,
) : OwnedLayer {
    private var drawBlock: ((canvas: Canvas, parentLayer: GraphicsLayer?) -> Unit)? = drawBlock
    private var invalidateParentLayer: (() -> Unit)? = invalidateParentLayer

    private var size: IntSize = IntSize(Int.MAX_VALUE, Int.MAX_VALUE)
    private var isDestroyed = false
    private val matrixCache = Matrix()
    private var inverseMatrixCache: Matrix? = null

    private var isDirty = false

    private var density = Density(1f)
    private var layoutDirection = LayoutDirection.Ltr
    private val scope = CanvasDrawScope()
    private var mutatedFields: Int = 0
    private var transformOrigin: TransformOrigin = TransformOrigin.Center
    private var outline: Outline? = null

    private var isMatrixDirty = false
    private var isInverseMatrixDirty = false
    private var isIdentity = true

    override fun updateLayerProperties(scope: ReusableGraphicsLayerScope) {
        val maybeChangedFields = scope.mutatedFields or mutatedFields
        this.layoutDirection = scope.layoutDirection
        this.density = scope.graphicsDensity
        if (maybeChangedFields and Fields.TransformOrigin != 0) {
            this.transformOrigin = scope.transformOrigin
        }
        if (maybeChangedFields and Fields.ScaleX != 0) {
            graphicsLayer.scaleX = scope.scaleX
        }
        if (maybeChangedFields and Fields.ScaleY != 0) {
            graphicsLayer.scaleY = scope.scaleY
        }
        if (maybeChangedFields and Fields.Alpha != 0) {
            graphicsLayer.alpha = scope.alpha
        }
        if (maybeChangedFields and Fields.TranslationX != 0) {
            graphicsLayer.translationX = scope.translationX
        }
        if (maybeChangedFields and Fields.TranslationY != 0) {
            graphicsLayer.translationY = scope.translationY
        }
        if (maybeChangedFields and Fields.ShadowElevation != 0) {
            graphicsLayer.shadowElevation = scope.shadowElevation
        }
        if (maybeChangedFields and Fields.AmbientShadowColor != 0) {
            graphicsLayer.ambientShadowColor = scope.ambientShadowColor
        }
        if (maybeChangedFields and Fields.SpotShadowColor != 0) {
            graphicsLayer.spotShadowColor = scope.spotShadowColor
        }
        if (maybeChangedFields and Fields.RotationZ != 0) {
            graphicsLayer.rotationZ = scope.rotationZ
        }
        if (maybeChangedFields and Fields.RotationX != 0) {
            graphicsLayer.rotationX = scope.rotationX
        }
        if (maybeChangedFields and Fields.RotationY != 0) {
            graphicsLayer.rotationY = scope.rotationY
        }
        if (maybeChangedFields and Fields.CameraDistance != 0) {
            graphicsLayer.cameraDistance = scope.cameraDistance
        }
        if (maybeChangedFields and Fields.TransformOrigin != 0) {
            if (transformOrigin == TransformOrigin.Center) {
                graphicsLayer.pivotOffset = Offset.Unspecified
            } else {
                graphicsLayer.pivotOffset =
                    Offset(
                        transformOrigin.pivotFractionX * size.width,
                        transformOrigin.pivotFractionY * size.height
                    )
            }
        }
        if (maybeChangedFields and Fields.Clip != 0) {
            graphicsLayer.clip = scope.clip
        }
        if (maybeChangedFields and Fields.RenderEffect != 0) {
            graphicsLayer.renderEffect = scope.renderEffect
        }
        if (maybeChangedFields and Fields.CompositingStrategy != 0) {
            graphicsLayer.compositingStrategy =
                when (scope.compositingStrategy) {
                    CompositingStrategy.Auto -> androidx.compose.ui.graphics.layer.CompositingStrategy.Auto
                    CompositingStrategy.Offscreen -> androidx.compose.ui.graphics.layer.CompositingStrategy.Offscreen
                    CompositingStrategy.ModulateAlpha -> androidx.compose.ui.graphics.layer.CompositingStrategy.ModulateAlpha
                    else -> throw IllegalStateException("Not supported composition strategy")
                }
        }
        if (maybeChangedFields and Fields.MatrixAffectingFields != 0) {
            isMatrixDirty = true
            isInverseMatrixDirty = true
        }

        var outlineChanged = false

        if (outline != scope.outline) {
            outlineChanged = true
            outline = scope.outline
            updateOutline()
        }

        mutatedFields = scope.mutatedFields
        if (maybeChangedFields != 0 || outlineChanged) {
            invalidate()
        }
    }

    private fun updateOutline() {
        val outline = outline ?: return
        graphicsLayer.setOutline(outline)
    }

    override fun isInLayer(position: Offset): Boolean {
        val x = position.x
        val y = position.y

        if (graphicsLayer.clip) {
            return isInOutline(graphicsLayer.outline, x, y)
        }

        return true
    }

    override fun move(position: IntOffset) {
        graphicsLayer.topLeft = position
        invalidate()
    }

    override fun resize(size: IntSize) {
        if (size != this.size) {
            this.size = size
            invalidate()
        }
    }

    private var drawnWithEnabledZ = false

    override fun drawLayer(canvas: Canvas, parentLayer: GraphicsLayer?) {
        updateDisplayList()
        drawnWithEnabledZ = graphicsLayer.shadowElevation > 0
        scope.drawContext.also {
            it.canvas = canvas
            it.graphicsLayer = parentLayer
        }
        scope.drawLayer(graphicsLayer)
    }

    override fun updateDisplayList() {
        if (isDirty) {
            if (transformOrigin != TransformOrigin.Center && graphicsLayer.size != size) {
                graphicsLayer.pivotOffset =
                    Offset(
                        transformOrigin.pivotFractionX * size.width,
                        transformOrigin.pivotFractionY * size.height
                    )
            }
            graphicsLayer.record(density, layoutDirection, size, recordLambda)
            isDirty = false
        }
    }

    private val recordLambda: DrawScope.() -> Unit = {
        drawIntoCanvas { canvas ->
            this@GraphicsLayerOwnerLayer.drawBlock?.let { it(canvas, drawContext.graphicsLayer) }
        }
    }

    override fun invalidate() {
        if (!isDirty && !isDestroyed) {
            // Parent layer caches drawing into skia's picture, so we need to reset it
            invalidateParentLayer?.invoke()
            isDirty = true
        }
    }

    override fun destroy() {
        drawBlock = null
        invalidateParentLayer = null
        isDestroyed = true
        isDirty = false
        context?.releaseGraphicsLayer(graphicsLayer)
    }

    override fun mapOffset(point: Offset, inverse: Boolean): Offset {
        val matrix =
            if (inverse) {
                getInverseMatrix() ?: return Offset.Infinite
            } else {
                getMatrix()
            }
        return if (isIdentity) {
            point
        } else {
            matrix.map(point)
        }
    }

    override fun mapBounds(rect: MutableRect, inverse: Boolean) {
        val matrix = if (inverse) getInverseMatrix() else getMatrix()
        if (!isIdentity) {
            if (matrix == null) {
                rect.set(0f, 0f, 0f, 0f)
            } else {
                matrix.map(rect)
            }
        }
    }

    override fun reuseLayer(
        drawBlock: (canvas: Canvas, parentLayer: GraphicsLayer?) -> Unit,
        invalidateParentLayer: () -> Unit
    ) {
        val context =
            checkPreconditionNotNull(context) {
                "currently reuse is only supported when we manage the layer lifecycle"
            }
        requirePrecondition(graphicsLayer.isReleased) {
            "layer should have been released before reuse"
        }

        // recreate a layer
        graphicsLayer = context.createGraphicsLayer()
        isDestroyed = false

        // apply new params
        this.drawBlock = drawBlock
        this.invalidateParentLayer = invalidateParentLayer

        // reset mutable variables to their initial values
        isMatrixDirty = false
        isInverseMatrixDirty = false
        isIdentity = true
        matrixCache.reset()
        inverseMatrixCache?.reset()
        transformOrigin = TransformOrigin.Center
        drawnWithEnabledZ = false
        size = IntSize(Int.MAX_VALUE, Int.MAX_VALUE)
        outline = null
        mutatedFields = 0
    }

    override fun transform(matrix: Matrix) {
        matrix.timesAssign(getMatrix())
    }

    override fun inverseTransform(matrix: Matrix) {
        val inverse = getInverseMatrix()
        if (inverse != null) {
            matrix.timesAssign(inverse)
        }
    }

    private fun getMatrix(): Matrix {
        updateMatrix()
        return matrixCache
    }

    private fun getInverseMatrix(): Matrix? {
        val inverseMatrix = inverseMatrixCache ?: Matrix().also { inverseMatrixCache = it }
        if (!isInverseMatrixDirty) {
            if (inverseMatrix[0, 0].isNaN()) {
                return null
            }
            return inverseMatrix
        }
        isInverseMatrixDirty = false
        val matrix = getMatrix()
        return if (isIdentity) {
            matrix
        } else if (matrix.invertTo(inverseMatrix)) {
            inverseMatrix
        } else {
            inverseMatrix[0, 0] = Float.NaN
            null
        }
    }

    private fun updateMatrix() = with(graphicsLayer) {
        val pivotX: Float
        val pivotY: Float
        if (pivotOffset.isUnspecified) {
            pivotX = size.width / 2f
            pivotY = size.height / 2f
        } else {
            pivotX = pivotOffset.x
            pivotY = pivotOffset.y
        }
        prepareTransformationMatrix(
            matrix = matrixCache,
            pivotX = pivotX,
            pivotY = pivotY,
            translationX = translationX,
            translationY = translationY,
            rotationX = rotationX,
            rotationY = rotationY,
            rotationZ = rotationZ,
            scaleX = scaleX,
            scaleY = scaleY,
            cameraDistance = cameraDistance
        )
    }
}
