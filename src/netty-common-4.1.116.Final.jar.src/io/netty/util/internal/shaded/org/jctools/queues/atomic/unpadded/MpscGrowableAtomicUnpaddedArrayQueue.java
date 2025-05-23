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
package io.netty.util.internal.shaded.org.jctools.queues.atomic.unpadded;

import io.netty.util.internal.shaded.org.jctools.util.Pow2;
import io.netty.util.internal.shaded.org.jctools.util.RangeUtil;
import java.util.concurrent.atomic.*;
import io.netty.util.internal.shaded.org.jctools.queues.*;
import static io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicQueueUtil.*;
import io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode;

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.atomic.unpadded.JavaParsingAtomicUnpaddedLinkedQueueGenerator
 * which can found in the jctools-build module. The original source file is MpscGrowableArrayQueue.java.
 *
 * An MPSC array queue which starts at <i>initialCapacity</i> and grows to <i>maxCapacity</i> in linked chunks,
 * doubling theirs size every time until the full blown backing array is used.
 * The queue grows only when the current chunk is full and elements are not copied on
 * resize, instead a link to the new chunk is stored in the old chunk for the consumer to follow.
 */
public class MpscGrowableAtomicUnpaddedArrayQueue<E> extends MpscChunkedAtomicUnpaddedArrayQueue<E> {

    public MpscGrowableAtomicUnpaddedArrayQueue(int maxCapacity) {
        super(Math.max(2, Pow2.roundToPowerOfTwo(maxCapacity / 8)), maxCapacity);
    }

    /**
     * @param initialCapacity the queue initial capacity. If chunk size is fixed this will be the chunk size.
     *                        Must be 2 or more.
     * @param maxCapacity     the maximum capacity will be rounded up to the closest power of 2 and will be the
     *                        upper limit of number of elements in this queue. Must be 4 or more and round up to a larger
     *                        power of 2 than initialCapacity.
     */
    public MpscGrowableAtomicUnpaddedArrayQueue(int initialCapacity, int maxCapacity) {
        super(initialCapacity, maxCapacity);
    }

    @Override
    protected int getNextBufferSize(AtomicReferenceArray<E> buffer) {
        final long maxSize = maxQueueCapacity / 2;
        RangeUtil.checkLessThanOrEqual(length(buffer), maxSize, "buffer.length");
        final int newSize = 2 * (length(buffer) - 1);
        return newSize + 1;
    }

    @Override
    protected long getCurrentBufferCapacity(long mask) {
        return (mask + 2 == maxQueueCapacity) ? maxQueueCapacity : mask;
    }
}
