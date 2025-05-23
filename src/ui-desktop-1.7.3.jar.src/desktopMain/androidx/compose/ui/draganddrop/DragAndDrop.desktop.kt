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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.painter.Painter
import java.awt.datatransfer.Transferable
import java.awt.dnd.DropTargetDragEvent
import java.awt.dnd.DropTargetDropEvent

/**
 * Encapsulates the information needed to start a drag-and-drop session from Compose on the desktop.
 */
@OptIn(ExperimentalComposeUiApi::class)
actual class DragAndDropTransferData(
    /**
     * The object being transferred during a drag-and-drop gesture.
     */
    @property:ExperimentalComposeUiApi
    val transferable: DragAndDropTransferable,

    /**
     * The transfer actions supported by the source of the drag-and-drop session.
     */
    @property:ExperimentalComposeUiApi
    val supportedActions: Iterable<DragAndDropTransferAction>,

    /**
     * The offset of the pointer relative to the drag decoration.
     */
    @property:ExperimentalComposeUiApi
    val dragDecorationOffset: Offset = Offset.Zero,

    /**
     * Invoked when the drag-and-drop gesture completes.
     *
     * The argument to the callback specifies the transfer action with which the gesture completed,
     * or `null` if the gesture did not complete successfully.
     */
    @property:ExperimentalComposeUiApi
    val onTransferCompleted: ((userAction: DragAndDropTransferAction?) -> Unit)? = null,
)

/**
 * Represents the actual object transferred during a drag-and-drop.
 */
@ExperimentalComposeUiApi
interface DragAndDropTransferable

/**
 * The possible actions on the transferred object in a drag-and-drop session.
 */
@ExperimentalComposeUiApi
class DragAndDropTransferAction private constructor(private val name: String) {
    override fun toString(): String {
        return name
    }

    companion object {
        /**
         * Indicates the dragged object should be copied into the target.
         */
        val Copy = DragAndDropTransferAction("Copy")

        /**
         * Indicates the dragged object should be moved ("cut" and "pasted") into the target.
         */
        val Move = DragAndDropTransferAction("Move")

        /**
         * Indicates the dragged object should be linked to at the target.
         */
        val Link = DragAndDropTransferAction("Link")
    }
}

/**
 * The event dispatched to [DragAndDropTarget] implementations during a drag-and-drop session.
 */
actual class DragAndDropEvent(
    /**
     * The action currently selected by the user.
     */
    @property:ExperimentalComposeUiApi
    val action: DragAndDropTransferAction?,

    /**
     * The underlying native event.
     */
    @property:ExperimentalComposeUiApi
    val nativeEvent: Any?,

    /**
     * The position of the dragged object relative to the root Compose container.
     */
    internal val positionInRootImpl: Offset
)


/**
 * The base class for [DragAndDropTransferable] for AWT that simply wraps an AWT [Transferable]
 * instance.
 */
internal interface AwtDragAndDropTransferable : DragAndDropTransferable {
    fun toAwtTransferable(): Transferable
}


/**
 * Returns a [DragAndDropTransferable] that simply wraps an AWT [Transferable] instance.
 */
@ExperimentalComposeUiApi
fun DragAndDropTransferable(transferable: Transferable): DragAndDropTransferable {
    return object: AwtDragAndDropTransferable {
        override fun toAwtTransferable() = transferable
    }
}


/**
 * Returns the AWT [Transferable] associated with the [DragAndDropEvent].
 */
@ExperimentalComposeUiApi
val DragAndDropEvent.awtTransferable: Transferable
    get() = when (nativeEvent) {
        is DropTargetDragEvent -> nativeEvent.transferable
        is DropTargetDropEvent -> nativeEvent.transferable
        else -> error("Unrecognized AWT drag event: $nativeEvent")
    }

/**
 * Returns the [DragData] associated with the given [DragAndDropEvent].
 */
@ExperimentalComposeUiApi
fun DragAndDropEvent.dragData(): DragData = awtTransferable.dragData()

/**
 * Represent data that is being dragged (or dropped) to a component from outside an application.
 */
@ExperimentalComposeUiApi
interface DragData {
    /**
     * Represents list of files drag and dropped to a component.
     */
    interface FilesList : DragData {
        /**
         * Returns list of file paths drag and droppped to an application in a URI format.
         */
        fun readFiles(): List<String>
    }

    /**
     * Represents an image drag and dropped to a component.
     */
    interface Image : DragData {
        /**
         * Returns an image drag and dropped to an application as a [Painter] type.
         */
        fun readImage(): Painter
    }

    /**
     * Represent text drag and dropped to a component.
     */
    interface Text : DragData {
        /**
         * Provides the best MIME type that describes text returned in [readText]
         */
        val bestMimeType: String

        /**
         * Returns a text dropped to an application.
         */
        fun readText(): String
    }
}

internal actual val DragAndDropEvent.positionInRoot: Offset
    get() = positionInRootImpl

