package io.lettuce.core.internal;

import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

import io.lettuce.core.TimeoutOptions;
import io.lettuce.core.protocol.RedisCommand;

/**
 * Provider for command timeout durations. Determines an individual timeout for each command and falls back to a default
 * timeout.
 *
 * @author Mark Paluch
 * @since 5.1
 * @see TimeoutOptions
 */
public class TimeoutProvider {

    private final Supplier<TimeoutOptions> timeoutOptionsSupplier;

    private final LongSupplier defaultTimeoutSupplier;

    private State state;

    /**
     * Creates a new {@link TimeoutProvider} given {@link TimeoutOptions supplier} and {@link LongSupplier default timeout
     * supplier in nano seconds}.
     *
     * @param timeoutOptionsSupplier must not be {@code null}.
     * @param defaultTimeoutNsSupplier must not be {@code null}.
     */
    public TimeoutProvider(Supplier<TimeoutOptions> timeoutOptionsSupplier, LongSupplier defaultTimeoutNsSupplier) {

        LettuceAssert.notNull(timeoutOptionsSupplier, "TimeoutOptionsSupplier must not be null");
        LettuceAssert.notNull(defaultTimeoutNsSupplier, "Default TimeoutSupplier must not be null");

        this.timeoutOptionsSupplier = timeoutOptionsSupplier;
        this.defaultTimeoutSupplier = defaultTimeoutNsSupplier;
    }

    /**
     * Returns the timeout in {@link TimeUnit#NANOSECONDS} for {@link RedisCommand}.
     *
     * @param command the command.
     * @return timeout in {@link TimeUnit#NANOSECONDS}.
     */
    public long getTimeoutNs(RedisCommand<?, ?, ?> command) {

        long timeoutNs = -1;

        State state = this.state;
        if (state == null) {
            state = this.state = new State(timeoutOptionsSupplier.get());
        }

        if (!state.applyDefaultTimeout) {
            timeoutNs = state.timeoutSource.getTimeUnit().toNanos(state.timeoutSource.getTimeout(command));
        }

        return timeoutNs >= 0 ? timeoutNs : defaultTimeoutSupplier.getAsLong();
    }

    static class State {

        final boolean applyDefaultTimeout;

        final TimeoutOptions.TimeoutSource timeoutSource;

        State(TimeoutOptions timeoutOptions) {

            this.timeoutSource = timeoutOptions.getSource();

            if (timeoutSource == null || !timeoutOptions.isTimeoutCommands() || timeoutOptions.isApplyConnectionTimeout()) {
                this.applyDefaultTimeout = true;
            } else {
                this.applyDefaultTimeout = false;
            }
        }

    }

}
