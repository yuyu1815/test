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

package androidx.compose.ui.draganddrop

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toPainter
import java.awt.Image
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.DataFlavor.selectBestTextFlavor
import java.awt.datatransfer.Transferable
import java.awt.image.BufferedImage
import java.io.File

@OptIn(ExperimentalComposeUiApi::class)
internal fun Transferable.dragData(): DragData {
    val bestTextFlavor = selectBestTextFlavor(transferDataFlavors)

    return when {
        isDataFlavorSupported(DataFlavor.javaFileListFlavor) ->
            DragDataFilesListImpl(this)

        isDataFlavorSupported(DataFlavor.imageFlavor) -> DragDataImageImpl(this)

        bestTextFlavor != null -> DragDataTextImpl(bestTextFlavor, this)

        else -> UnknownDragData
    }
}

@OptIn(ExperimentalComposeUiApi::class)
private object UnknownDragData : DragData

@Suppress("DEPRECATION_ERROR")
@OptIn(ExperimentalComposeUiApi::class)
private class DragDataFilesListImpl(
    private val transferable: Transferable
) : DragData.FilesList, androidx.compose.ui.DragData.FilesList {
    override fun readFiles(): List<String> {
        val files = transferable.getTransferData(DataFlavor.javaFileListFlavor) as List<*>
        return files.filterIsInstance<File>().map { it.toURI().toString() }
    }
}

@Suppress("DEPRECATION_ERROR")
@OptIn(ExperimentalComposeUiApi::class)
private class DragDataImageImpl(
    private val transferable: Transferable
) : DragData.Image, androidx.compose.ui.DragData.Image {
    override fun readImage(): Painter {
        return (transferable.getTransferData(DataFlavor.imageFlavor) as Image).painter()
    }

    private fun Image.painter(): Painter {
        if (this is BufferedImage) {
            return this.toPainter()
        }
        val bufferedImage =
            BufferedImage(getWidth(null), getHeight(null), BufferedImage.TYPE_INT_ARGB)

        val g2 = bufferedImage.createGraphics()
        try {
            g2.drawImage(this, 0, 0, null)
        } finally {
            g2.dispose()
        }

        return bufferedImage.toPainter()
    }
}

@Suppress("DEPRECATION_ERROR")
@OptIn(ExperimentalComposeUiApi::class)
private class DragDataTextImpl(
    private val bestTextFlavor: DataFlavor,
    private val transferable: Transferable
) : DragData.Text, androidx.compose.ui.DragData.Text {
    override val bestMimeType: String = bestTextFlavor.mimeType

    override fun readText(): String {
        val reader = bestTextFlavor.getReaderForText(transferable)
        return reader.readText()
    }
}

/**
 * Returns the same value as [Transferable.dragData] but as an instance of the deprecated
 * `androidx.compose.ui.DragData`. Remove this, along with the rest of the deprecated DnD API in 1.8
 */
@Suppress("DEPRECATION_ERROR")
internal fun Transferable.deprecatedDragData() = dragData() as androidx.compose.ui.DragData