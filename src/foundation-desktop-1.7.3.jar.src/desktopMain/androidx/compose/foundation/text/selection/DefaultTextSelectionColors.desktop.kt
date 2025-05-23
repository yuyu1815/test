/*
 * Copyright 2022 The Android Open Source Project
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

package androidx.compose.foundation.text.selection

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

/**
 * Default color used is the blue from the Compose logo, b/172679845 for context
 */
private val DefaultSelectionColor = Color(0xFF4286F4)

@Stable
internal actual val DefaultTextSelectionColors = TextSelectionColors(
    handleColor = DefaultSelectionColor,
    backgroundColor = DefaultSelectionColor.copy(alpha = 0.4f)
)
