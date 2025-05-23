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

package androidx.compose.foundation

import androidx.compose.runtime.Composable

// TODO(https://github.com/JetBrains/compose-multiplatform/issues/3360) Support localization
//  the current values are copied from compose\foundation\foundation\src\androidMain\res\values-en-rGB\strings.xml
internal actual object BasicTooltipStrings {
    @Composable
    actual fun label() = "show tooltip"
    @Composable
    actual fun description() = "tooltip"
}
