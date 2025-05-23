/*
 * Copyright 2011-Present, Redis Ltd. and Contributors
 * All rights reserved.
 *
 * Licensed under the MIT License.
 *
 * This file contains contributions from third-party contributors
 * licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.lettuce.core.output;

import java.nio.ByteBuffer;

import io.lettuce.core.codec.RedisCodec;
import io.lettuce.core.internal.LettuceAssert;

/**
 * Base class for Redis command outputs.
 *
 * <p>
 * Provides common decode methods and parsing functionality for output handling. Template methods that accept response values
 * throw {@link UnsupportedOperationException} unless overridden by the concrete implementation.
 * <p>
 * Command outputs may accumulate their state until a command is finished or emit partial results during the decode process.
 * Output implementations that wish to emit partial results can implement {@link StreamingOutput} push individual output
 * elements to a {@link StreamingOutput.Subscriber}.
 *
 * @param <K> Key type.
 * @param <V> Value type.
 * @param <T> Output type.
 * @author Will Glozer
 * @author Mark Paluch
 */
public abstract class CommandOutput<K, V, T> {

    protected final RedisCodec<K, V> codec;

    protected T output;

    protected String error;

    /**
     * Initialize a new instance that encodes and decodes keys and values using the supplied codec.
     *
     * @param codec Codec used to encode/decode keys and values, must not be {@code null}.
     * @param output Initial value of output.
     */
    public CommandOutput(RedisCodec<K, V> codec, T output) {
        LettuceAssert.notNull(codec, "RedisCodec must not be null");
        this.codec = codec;
        this.output = output;
    }

    /**
     * Get the command output.
     *
     * @return The command output.
     */
    public T get() {
        return output;
    }

    /**
     * Update the command output with a sequence of bytes, or {@code null}. Concrete {@link CommandOutput} implementations must
     * override this method to decode {@code bulk}/bytes response values.
     *
     * @param bytes The command output, or null.
     */
    public void set(ByteBuffer bytes) {
        throw new UnsupportedOperationException(getClass().getName() + " does not support set(ByteBuffer)");
    }

    /**
     * Update the command output with a sequence of bytes, or {@code null} representing a simple string. Concrete
     * {@link CommandOutput} implementations must override this method to decode {@code single}/bytes response values.
     *
     * @param bytes The command output, or null.
     */
    public void setSingle(ByteBuffer bytes) {
        set(bytes);
    }

    /**
     * Update the command output with a big number. Concrete {@link CommandOutput} implementations must override this method to
     * decode {@code big number} response values.
     *
     * @param bytes The command output, or null.
     * @since 6.0/RESP 3
     */
    public void setBigNumber(ByteBuffer bytes) {
        set(bytes);
    }

    /**
     * Update the command output with a 64-bit signed integer. Concrete {@link CommandOutput} implementations must override this
     * method to decode {@code number} (integer) response values.
     *
     * @param integer The command output.
     */
    public void set(long integer) {
        throw new UnsupportedOperationException(getClass().getName() + " does not support set(long)");
    }

    /**
     * Update the command output with a floating-point number. Concrete {@link CommandOutput} implementations must override this
     * method to decode {@code double} response values.
     *
     * @param number The command output.
     * @since 6.0/RESP 3
     */
    public void set(double number) {
        throw new UnsupportedOperationException(getClass().getName() + " does not support set(double)");
    }

    /**
     * Update the command output with a boolean. Concrete {@link CommandOutput} implementations must override this method to
     * decode {@code boolean} response values.
     *
     * @param value The command output.
     * @since 6.0/RESP 3
     */
    public void set(boolean value) {
        throw new UnsupportedOperationException(getClass().getName() + " does not support set(boolean)");
    }

    /**
     * Set command output to an error message from the server.
     *
     * @param error Error message.
     */
    public void setError(ByteBuffer error) {
        this.error = decodeAscii(error);
    }

    /**
     * Set command output to an error message from the client.
     *
     * @param error Error message.
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * Check if the command resulted in an error.
     *
     * @return true if command resulted in an error.
     */
    public boolean hasError() {
        return this.error != null;
    }

    /**
     * Get the error that occurred.
     *
     * @return The error.
     */
    public String getError() {
        return error;
    }

    /**
     * Mark the command output complete.
     *
     * @param depth Remaining depth of output queue.
     *
     */
    public void complete(int depth) {
        // nothing to do by default
    }

    protected String decodeAscii(ByteBuffer bytes) {
        if (bytes == null) {
            return null;
        }

        char[] chars = new char[bytes.remaining()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) bytes.get();
        }
        return new String(chars);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [output=").append(output);
        sb.append(", error='").append(error).append('\'');
        sb.append(']');
        return sb.toString();
    }

    /**
     * Mark the beginning of a multi sequence (array).
     *
     * @param count expected number of elements in this multi sequence.
     */
    public void multi(int count) {

    }

    /**
     * Mark the beginning of a multi sequence (array).
     *
     * @param count expected number of elements in this multi sequence.
     * @since 6.0/RESP 3
     */
    public void multiArray(int count) {
        multi(count);
    }

    /**
     * Mark the beginning of a multi sequence (push-array).
     *
     * @param count expected number of elements in this multi sequence.
     * @since 6.0/RESP 3
     */
    public void multiPush(int count) {
        multi(count);
    }

    /**
     * Mark the beginning of a multi sequence (map).
     *
     * @param count expected number of elements in this multi sequence.
     * @since 6.0/RESP 3
     */
    public void multiMap(int count) {
        multi(count * 2);
    }

    /**
     * Mark the beginning of a set.
     *
     * @param count expected number of elements in this multi sequence.
     * @since 6.0/RESP 3
     */
    public void multiSet(int count) {
        multi(count);
    }

}
