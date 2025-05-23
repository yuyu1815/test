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

package androidx.compose.foundation.text.input.internal

import androidx.compose.foundation.text.input.TextFieldCharSequence

internal actual fun CharSequence.toCharArray(
    destination: CharArray,
    destinationOffset: Int,
    startIndex: Int,
    endIndex: Int
) {
    @Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
    when (this) {
        is TextFieldCharSequence -> toCharArray(
            destination,
            destinationOffset,
            startIndex,
            endIndex
        )
        else -> {
            rangeCheck(start = startIndex, end = endIndex, length = length) {
                "Expected source [$startIndex, $endIndex) to be in [0, $length)"
            }
            val copyLength = endIndex - startIndex
            rangeCheck(
                start = destinationOffset,
                end = destinationOffset + copyLength,
                length = destination.size
            ) {
                "Expected destination [$destinationOffset, ${destinationOffset + copyLength}) " +
                    "to be in [0, ${destination.size})"
            }

            for (i in 0 until copyLength) {
                destination[destinationOffset + i] = get(startIndex + i)
            }
        }
    }
}

private inline fun rangeCheck(start: Int, end: Int, length: Int, lazyMessage: () -> String) {
    require((start >= 0) && (start <= end) && (end <= length), lazyMessage)
}
