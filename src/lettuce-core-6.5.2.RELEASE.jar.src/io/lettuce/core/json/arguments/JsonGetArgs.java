/*
 * Copyright 2024, Redis Ltd. and Contributors
 * All rights reserved.
 *
 * Licensed under the MIT License.
 */

package io.lettuce.core.json.arguments;

import io.lettuce.core.CompositeArgument;
import io.lettuce.core.protocol.CommandArgs;
import io.lettuce.core.protocol.CommandKeyword;

/**
 * Argument list builder for the Redis <a href="https://redis.io/commands/acl-setuser">JSON.GET</a> command.
 * <p>
 * {@link JsonGetArgs} is a mutable object and instances should be used only once to avoid shared mutable state.
 *
 * @author Tihomir Mateev
 * @since 6.5
 */
public class JsonGetArgs implements CompositeArgument {

    private String indent;

    private String newline;

    private String space;

    /**
     * Builder entry points for {@link JsonGetArgs}.
     */
    public static class Builder {

        /**
         * Utility constructor.
         */
        private Builder() {
        }

        /**
         * Creates new {@link JsonGetArgs} and sets the string used for indentation.
         *
         * @return new {@link JsonGetArgs} with indentation set.
         */
        public static JsonGetArgs indent(String indent) {
            return new JsonGetArgs().indent(indent);
        }

        /**
         * Creates new {@link JsonGetArgs} and sets the string used for newline.
         *
         * @return new {@link JsonGetArgs} with newline set.
         */
        public static JsonGetArgs newline(String newline) {
            return new JsonGetArgs().newline(newline);
        }

        /**
         * Creates new {@link JsonGetArgs} and sets the string used for spacing.
         *
         * @return new {@link JsonGetArgs} with spacing set.
         */
        public static JsonGetArgs space(String space) {
            return new JsonGetArgs().space(space);
        }

        /**
         * Creates new {@link JsonGetArgs} empty arguments.
         *
         * @return new {@link JsonGetArgs} with empty arguments set.
         */
        public static JsonGetArgs defaults() {
            return new JsonGetArgs().defaults();
        }

    }

    /**
     * Set the string used for indentation.
     *
     * @return {@code this}.
     */
    public JsonGetArgs indent(String indent) {

        this.indent = indent;
        return this;
    }

    /**
     * Set the string used for newline.
     *
     * @return {@code this}.
     */
    public JsonGetArgs newline(String newline) {

        this.newline = newline;
        return this;
    }

    /**
     * Set the string used for spacing.
     *
     * @return {@code this}.
     */
    public JsonGetArgs space(String space) {

        this.space = space;
        return this;
    }

    /**
     * Set empty arguments.
     *
     * @return {@code this}.
     */
    public JsonGetArgs defaults() {
        return this;
    }

    @Override
    public <K, V> void build(CommandArgs<K, V> args) {

        if (indent != null) {
            args.add(CommandKeyword.INDENT).add(indent);
        }

        if (newline != null) {
            args.add(CommandKeyword.NEWLINE).add(newline);
        }

        if (space != null) {
            args.add(CommandKeyword.SPACE).add(space);
        }
    }

}
