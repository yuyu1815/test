package io.lettuce.core.dynamic.segment;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import io.lettuce.core.internal.LettuceAssert;
import io.lettuce.core.protocol.CommandType;
import io.lettuce.core.protocol.ProtocolKeyword;

/**
 * Value object abstracting multiple {@link CommandSegment}s.
 *
 * @author Mark Paluch
 * @since 5.0
 */
public class CommandSegments implements Iterable<CommandSegment> {

    private final ProtocolKeyword commandType;

    private final List<CommandSegment> segments;

    /**
     * Create {@link CommandSegments} given a {@link List} of {@link CommandSegment}s.
     *
     * @param segments must not be {@code null.}
     */
    public CommandSegments(List<CommandSegment> segments) {

        LettuceAssert.isTrue(!segments.isEmpty(), "Command segments must not be empty");

        this.segments = segments.size() > 1 ? Collections.unmodifiableList(segments.subList(1, segments.size()))
                : Collections.emptyList();
        this.commandType = potentiallyResolveCommand(segments.get(0).asString());
    }

    /**
     * Attempt to resolve the {@code commandType} against {@link CommandType}. This allows reuse of settings associated with the
     * actual command type such as read-write routing. Subclasses may override this method.
     *
     * @param commandType must not be {@code null}.
     * @return the resolved {@link ProtocolKeyword}.
     * @since 5.0.5
     */
    protected ProtocolKeyword potentiallyResolveCommand(String commandType) {

        try {
            return CommandType.valueOf(commandType);
        } catch (IllegalArgumentException e) {
            return new StringCommandType(commandType);
        }
    }

    @Override
    public Iterator<CommandSegment> iterator() {
        return segments.iterator();
    }

    public ProtocolKeyword getCommandType() {
        return commandType;
    }

    public int size() {
        return segments.size();
    }

    static class StringCommandType implements ProtocolKeyword {

        private final byte[] commandTypeBytes;

        private final String commandType;

        StringCommandType(String commandType) {
            this.commandType = commandType;
            this.commandTypeBytes = commandType.getBytes();
        }

        @Override
        public byte[] getBytes() {
            return commandTypeBytes;
        }

        @Override
        public String toString() {
            return commandType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof StringCommandType))
                return false;

            StringCommandType that = (StringCommandType) o;

            return commandType.equals(that.commandType);
        }

        @Override
        public int hashCode() {
            return commandType.hashCode();
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCommandType().toString());

        for (CommandSegment segment : segments) {
            sb.append(' ').append(segment);
        }

        return sb.toString();
    }

}
