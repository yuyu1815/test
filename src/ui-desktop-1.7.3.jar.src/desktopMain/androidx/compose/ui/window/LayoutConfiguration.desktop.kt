/*
 * Copyright 2021 The Android Open Source Project
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

package androidx.compose.ui.window

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import java.awt.Component
import java.awt.ComponentOrientation
import java.awt.GraphicsConfiguration
import java.awt.GraphicsEnvironment
import java.util.Locale

// TODO(demin): detect OS fontScale
//  font size can be changed on Windows 10 in Settings - Ease of Access,
//  on Ubuntu in Settings - Universal Access
//  on macOS there is no such setting
//  issue: https://github.com/JetBrains/compose-jb/issues/57

// TODO(demin) support RTL. see https://github.com/JetBrains/compose-jb/issues/872.
//  also, don't forget to search all LayoutDirection.Ltr in desktopMain

internal val GlobalDensity get() = GraphicsEnvironment.getLocalGraphicsEnvironment()
    .defaultScreenDevice
    .defaultConfiguration
    .density

internal val Component.density: Density get() = graphicsConfiguration.density

internal val Component.sizeInPx: Size
    get() {
        val scale = density.density
        return Size(
            width = width * scale,
            height = height * scale
        )
    }

private val GraphicsConfiguration.density: Density get() = Density(
    defaultTransform.scaleX.toFloat(),
    fontScale = 1f
)

internal val GlobalLayoutDirection get() = Locale.getDefault().layoutDirection

internal val Locale.layoutDirection: LayoutDirection
    get() = ComponentOrientation.getOrientation(this).layoutDirection

internal val ComponentOrientation.layoutDirection: LayoutDirection
    get() = when {
        isLeftToRight -> LayoutDirection.Ltr
        isHorizontal -> LayoutDirection.Rtl
        else -> LayoutDirection.Ltr
    }

internal val LayoutDirection.componentOrientation: ComponentOrientation
    get() = when(this) {
        LayoutDirection.Ltr -> ComponentOrientation.LEFT_TO_RIGHT
        LayoutDirection.Rtl -> ComponentOrientation.RIGHT_TO_LEFT
    }

/**
 * Compute the [LayoutDirection] the given AWT/Swing component should have, based on its own,
 * non-Compose attributes.
 */
internal fun layoutDirectionFor(component: Component): LayoutDirection {
    val orientation = component.componentOrientation
    return if (orientation != ComponentOrientation.UNKNOWN) {
        orientation.layoutDirection
    } else {
        // To preserve backwards compatibility we fall back to the locale
        return component.locale.layoutDirection
    }
}
