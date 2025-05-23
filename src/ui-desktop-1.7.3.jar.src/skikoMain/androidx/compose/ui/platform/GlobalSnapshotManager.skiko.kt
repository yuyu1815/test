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

package androidx.compose.ui.platform

import androidx.compose.runtime.snapshots.Snapshot
import kotlinx.atomicfu.atomic
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.launch

/**
 * Platform-specific mechanism for starting a monitor of global snapshot state writes
 * in order to schedule the periodic dispatch of snapshot apply notifications.
 * This process should remain platform-specific; it is tied to the threading and update model of
 * a particular platform and framework target.
 *
 * Composition bootstrapping mechanisms for a particular platform/framework should call
 * [ensureStarted] during setup to initialize periodic global snapshot notifications.
 */
internal object GlobalSnapshotManager {
    private val started = atomic(0)
    private val sent = atomic(0)

    fun ensureStarted() {
        if (started.compareAndSet(0, 1)) {
            val channel = Channel<Unit>(1)
            CoroutineScope(GlobalSnapshotManagerDispatcher).launch {
                channel.consumeEach {
                    sent.compareAndSet(1, 0)
                    Snapshot.sendApplyNotifications()
                }
            }
            Snapshot.registerGlobalWriteObserver {
                if (sent.compareAndSet(0, 1)) {
                    channel.trySend(Unit)
                }
            }
        }
    }
}

internal expect val GlobalSnapshotManagerDispatcher: CoroutineDispatcher