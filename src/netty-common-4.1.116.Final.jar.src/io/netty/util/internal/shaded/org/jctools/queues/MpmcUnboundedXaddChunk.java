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

import java.util.Arrays;

import static io.netty.util.internal.shaded.org.jctools.util.UnsafeLongArrayAccess.*;

@InternalAPI
public final class MpmcUnboundedXaddChunk<E> extends MpUnboundedXaddChunk<MpmcUnboundedXaddChunk<E>, E>
{
    private final long[] sequence;

    public MpmcUnboundedXaddChunk(long index, MpmcUnboundedXaddChunk<E> prev, int size, boolean pooled)
    {
        super(index, prev, size, pooled);
        if (pooled)
        {
            sequence = allocateLongArray(size);
            Arrays.fill(sequence, MpmcUnboundedXaddChunk.NOT_USED);
        }
        else
        {
            sequence = null;
        }
    }

    public void soSequence(int index, long e)
    {
        assert isPooled();
        soLongElement(sequence, calcLongElementOffset(index), e);
    }

    public long lvSequence(int index)
    {
        assert isPooled();
        return lvLongElement(sequence, calcLongElementOffset(index));
    }

    public void spinForSequence(int index, long e)
    {
        assert isPooled();
        final long[] sequence = this.sequence;
        final long offset = calcLongElementOffset(index);
        while (true)
        {
            if (lvLongElement(sequence, offset) == e)
            {
                break;
            }
        }
    }
}
