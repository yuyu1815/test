/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.netty.util.internal.shaded.org.jctools.queues;

import io.netty.util.internal.shaded.org.jctools.util.InternalAPI;

@InternalAPI
public final class MpscUnboundedXaddChunk<E> extends MpUnboundedXaddChunk<MpscUnboundedXaddChunk<E>, E>
{
    public MpscUnboundedXaddChunk(long index, MpscUnboundedXaddChunk<E> prev, int size, boolean pooled)
    {
        super(index, prev, size, pooled);

    }
}
