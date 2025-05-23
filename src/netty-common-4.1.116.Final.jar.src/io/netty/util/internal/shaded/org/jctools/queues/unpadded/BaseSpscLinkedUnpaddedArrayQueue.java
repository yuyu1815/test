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
package io.netty.util.internal.shaded.org.jctools.queues.unpadded;

import io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue;
import io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo;
import java.util.AbstractQueue;
import java.util.Iterator;
import static io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.length;
import static io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil.nextArrayOffset;
import static io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE;
import static io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.fieldOffset;
import static io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.*;
import io.netty.util.internal.shaded.org.jctools.queues.*;

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.unpadded.JavaParsingUnpaddedQueueGenerator
 * which can found in the jctools-build module. The original source file is BaseSpscLinkedArrayQueue.java.
 */
abstract class BaseSpscLinkedUnpaddedArrayQueuePrePad<E> extends AbstractQueue<E> implements IndexedQueue {
}

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.unpadded.JavaParsingUnpaddedQueueGenerator
 * which can found in the jctools-build module. The original source file is BaseSpscLinkedArrayQueue.java.
 */
abstract class BaseSpscLinkedUnpaddedArrayQueueConsumerColdFields<E> extends BaseSpscLinkedUnpaddedArrayQueuePrePad<E> {

    protected long consumerMask;

    protected E[] consumerBuffer;
}

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.unpadded.JavaParsingUnpaddedQueueGenerator
 * which can found in the jctools-build module. The original source file is BaseSpscLinkedArrayQueue.java.
 */
abstract class BaseSpscLinkedUnpaddedArrayQueueConsumerField<E> extends BaseSpscLinkedUnpaddedArrayQueueConsumerColdFields<E> {

    private final static long C_INDEX_OFFSET = fieldOffset(BaseSpscLinkedUnpaddedArrayQueueConsumerField.class, "consumerIndex");

    private volatile long consumerIndex;

    @Override
    public final long lvConsumerIndex() {
        return consumerIndex;
    }

    final long lpConsumerIndex() {
        return UNSAFE.getLong(this, C_INDEX_OFFSET);
    }

    final void soConsumerIndex(long newValue) {
        UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, newValue);
    }
}

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.unpadded.JavaParsingUnpaddedQueueGenerator
 * which can found in the jctools-build module. The original source file is BaseSpscLinkedArrayQueue.java.
 */
abstract class BaseSpscLinkedUnpaddedArrayQueueL2Pad<E> extends BaseSpscLinkedUnpaddedArrayQueueConsumerField<E> {
}

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.unpadded.JavaParsingUnpaddedQueueGenerator
 * which can found in the jctools-build module. The original source file is BaseSpscLinkedArrayQueue.java.
 */
abstract class BaseSpscLinkedUnpaddedArrayQueueProducerFields<E> extends BaseSpscLinkedUnpaddedArrayQueueL2Pad<E> {

    private final static long P_INDEX_OFFSET = fieldOffset(BaseSpscLinkedUnpaddedArrayQueueProducerFields.class, "producerIndex");

    private volatile long producerIndex;

    @Override
    public final long lvProducerIndex() {
        return producerIndex;
    }

    final void soProducerIndex(long newValue) {
        UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, newValue);
    }

    final long lpProducerIndex() {
        return UNSAFE.getLong(this, P_INDEX_OFFSET);
    }
}

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.unpadded.JavaParsingUnpaddedQueueGenerator
 * which can found in the jctools-build module. The original source file is BaseSpscLinkedArrayQueue.java.
 */
abstract class BaseSpscLinkedUnpaddedArrayQueueProducerColdFields<E> extends BaseSpscLinkedUnpaddedArrayQueueProducerFields<E> {

    protected long producerBufferLimit;

    // fixed for chunked and unbounded
    protected long producerMask;

    protected E[] producerBuffer;
}

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.unpadded.JavaParsingUnpaddedQueueGenerator
 * which can found in the jctools-build module. The original source file is BaseSpscLinkedArrayQueue.java.
 */
abstract class BaseSpscLinkedUnpaddedArrayQueue<E> extends BaseSpscLinkedUnpaddedArrayQueueProducerColdFields<E> implements MessagePassingQueue<E>, QueueProgressIndicators {

    private static final Object JUMP = new Object();

    @Override
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return IndexedQueueSizeUtil.size(this, IndexedQueueSizeUtil.PLAIN_DIVISOR);
    }

    @Override
    public final boolean isEmpty() {
        return IndexedQueueSizeUtil.isEmpty(this);
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    @Override
    public long currentProducerIndex() {
        return lvProducerIndex();
    }

    @Override
    public long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    protected final void soNext(E[] curr, E[] next) {
        long offset = nextArrayOffset(curr);
        soRefElement(curr, offset, next);
    }

    @SuppressWarnings("unchecked")
    protected final E[] lvNextArrayAndUnlink(E[] curr) {
        final long offset = nextArrayOffset(curr);
        final E[] nextBuffer = (E[]) lvRefElement(curr, offset);
        // prevent GC nepotism
        soRefElement(curr, offset, null);
        return nextBuffer;
    }

    @Override
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override
    public E relaxedPoll() {
        return poll();
    }

    @Override
    public E relaxedPeek() {
        return peek();
    }

    @Override
    public int drain(Consumer<E> c) {
        return MessagePassingQueueUtil.drain(this, c);
    }

    @Override
    public int fill(Supplier<E> s) {
        // result is a long because we want to have a safepoint check at regular intervals
        long result = 0;
        final int capacity = capacity();
        do {
            final int filled = fill(s, PortableJvmInfo.RECOMENDED_OFFER_BATCH);
            if (filled == 0) {
                return (int) result;
            }
            result += filled;
        } while (result <= capacity);
        return (int) result;
    }

    @Override
    public int drain(Consumer<E> c, int limit) {
        return MessagePassingQueueUtil.drain(this, c, limit);
    }

    @Override
    public int fill(Supplier<E> s, int limit) {
        if (null == s)
            throw new IllegalArgumentException("supplier is null");
        if (limit < 0)
            throw new IllegalArgumentException("limit is negative:" + limit);
        if (limit == 0)
            return 0;
        for (int i = 0; i < limit; i++) {
            // local load of field to avoid repeated loads after volatile reads
            final E[] buffer = producerBuffer;
            final long index = lpProducerIndex();
            final long mask = producerMask;
            final long offset = calcCircularRefElementOffset(index, mask);
            // expected hot path
            if (index < producerBufferLimit) {
                writeToQueue(buffer, s.get(), index, offset);
            } else {
                if (!offerColdPath(buffer, mask, index, offset, null, s)) {
                    return i;
                }
            }
        }
        return limit;
    }

    @Override
    public void drain(Consumer<E> c, WaitStrategy wait, ExitCondition exit) {
        MessagePassingQueueUtil.drain(this, c, wait, exit);
    }

    @Override
    public void fill(Supplier<E> s, WaitStrategy wait, ExitCondition exit) {
        MessagePassingQueueUtil.fill(this, s, wait, exit);
    }

    /**
     * {@inheritDoc}
     * <p>
     * This implementation is correct for single producer thread use only.
     */
    @Override
    public boolean offer(final E e) {
        // Objects.requireNonNull(e);
        if (null == e) {
            throw new NullPointerException();
        }
        // local load of field to avoid repeated loads after volatile reads
        final E[] buffer = producerBuffer;
        final long index = lpProducerIndex();
        final long mask = producerMask;
        final long offset = calcCircularRefElementOffset(index, mask);
        // expected hot path
        if (index < producerBufferLimit) {
            writeToQueue(buffer, e, index, offset);
            return true;
        }
        return offerColdPath(buffer, mask, index, offset, e, null);
    }

    abstract boolean offerColdPath(E[] buffer, long mask, long pIndex, long offset, E v, Supplier<? extends E> s);

    /**
     * {@inheritDoc}
     * <p>
     * This implementation is correct for single consumer thread use only.
     */
    @SuppressWarnings("unchecked")
    @Override
    public E poll() {
        // local load of field to avoid repeated loads after volatile reads
        final E[] buffer = consumerBuffer;
        final long index = lpConsumerIndex();
        final long mask = consumerMask;
        final long offset = calcCircularRefElementOffset(index, mask);
        final Object e = lvRefElement(buffer, offset);
        boolean isNextBuffer = e == JUMP;
        if (null != e && !isNextBuffer) {
            // this ensures correctness on 32bit platforms
            soConsumerIndex(index + 1);
            soRefElement(buffer, offset, null);
            return (E) e;
        } else if (isNextBuffer) {
            return newBufferPoll(buffer, index);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     * <p>
     * This implementation is correct for single consumer thread use only.
     */
    @SuppressWarnings("unchecked")
    @Override
    public E peek() {
        final E[] buffer = consumerBuffer;
        final long index = lpConsumerIndex();
        final long mask = consumerMask;
        final long offset = calcCircularRefElementOffset(index, mask);
        final Object e = lvRefElement(buffer, offset);
        if (e == JUMP) {
            return newBufferPeek(buffer, index);
        }
        return (E) e;
    }

    final void linkOldToNew(final long currIndex, final E[] oldBuffer, final long offset, final E[] newBuffer, final long offsetInNew, final E e) {
        soRefElement(newBuffer, offsetInNew, e);
        // link to next buffer and add next indicator as element of old buffer
        soNext(oldBuffer, newBuffer);
        soRefElement(oldBuffer, offset, JUMP);
        // index is visible after elements (isEmpty/poll ordering)
        // this ensures atomic write of long on 32bit platforms
        soProducerIndex(currIndex + 1);
    }

    final void writeToQueue(final E[] buffer, final E e, final long index, final long offset) {
        soRefElement(buffer, offset, e);
        // this ensures atomic write of long on 32bit platforms
        soProducerIndex(index + 1);
    }

    private E newBufferPeek(final E[] buffer, final long index) {
        E[] nextBuffer = lvNextArrayAndUnlink(buffer);
        consumerBuffer = nextBuffer;
        final long mask = length(nextBuffer) - 2;
        consumerMask = mask;
        final long offset = calcCircularRefElementOffset(index, mask);
        return lvRefElement(nextBuffer, offset);
    }

    private E newBufferPoll(final E[] buffer, final long index) {
        E[] nextBuffer = lvNextArrayAndUnlink(buffer);
        consumerBuffer = nextBuffer;
        final long mask = length(nextBuffer) - 2;
        consumerMask = mask;
        final long offset = calcCircularRefElementOffset(index, mask);
        final E n = lvRefElement(nextBuffer, offset);
        if (null == n) {
            throw new IllegalStateException("new buffer must have at least one element");
        } else {
            // this ensures correctness on 32bit platforms
            soConsumerIndex(index + 1);
            soRefElement(nextBuffer, offset, null);
            return n;
        }
    }
}
