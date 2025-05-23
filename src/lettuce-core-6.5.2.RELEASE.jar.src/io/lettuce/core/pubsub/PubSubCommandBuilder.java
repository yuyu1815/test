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
package io.lettuce.core.pubsub;

import static io.lettuce.core.protocol.CommandKeyword.*;
import static io.lettuce.core.protocol.CommandType.*;

import java.util.List;
import java.util.Map;

import io.lettuce.core.codec.RedisCodec;
import io.lettuce.core.internal.LettuceAssert;
import io.lettuce.core.output.CommandOutput;
import io.lettuce.core.output.IntegerOutput;
import io.lettuce.core.output.KeyListOutput;
import io.lettuce.core.output.MapOutput;
import io.lettuce.core.protocol.BaseRedisCommandBuilder;
import io.lettuce.core.protocol.Command;
import io.lettuce.core.protocol.CommandArgs;
import io.lettuce.core.protocol.CommandType;

/**
 * Dedicated pub/sub command builder to build pub/sub commands.
 *
 * @author Mark Paluch
 * @author Tihomir Mateev
 * @author Ali Takavci
 * @since 4.2
 */
@SuppressWarnings("varargs")
class PubSubCommandBuilder<K, V> extends BaseRedisCommandBuilder<K, V> {

    static final String MUST_NOT_BE_EMPTY = "must not be empty";

    PubSubCommandBuilder(RedisCodec<K, V> codec) {
        super(codec);
    }

    Command<K, V, Long> publish(K channel, V message) {
        CommandArgs<K, V> args = new PubSubCommandArgs<>(codec).addKey(channel).addValue(message);
        return createCommand(PUBLISH, new IntegerOutput<>(codec), args);
    }

    Command<K, V, List<K>> pubsubChannels(K pattern) {
        CommandArgs<K, V> args = new PubSubCommandArgs<>(codec).add(CHANNELS).addKey(pattern);
        return createCommand(PUBSUB, new KeyListOutput<>(codec), args);
    }

    @SafeVarargs
    @SuppressWarnings({ "unchecked", "rawtypes" })
    final Command<K, V, Map<K, Long>> pubsubNumsub(K... channels) {
        LettuceAssert.notEmpty(channels, "Channels " + MUST_NOT_BE_EMPTY);

        CommandArgs<K, V> args = new PubSubCommandArgs<>(codec).add(NUMSUB).addKeys(channels);
        return createCommand(PUBSUB, new MapOutput<>((RedisCodec) codec), args);
    }

    Command<K, V, List<K>> pubsubShardChannels(K pattern) {
        CommandArgs<K, V> args = new PubSubCommandArgs<>(codec).add(SHARDCHANNELS).addKey(pattern);
        return createCommand(PUBSUB, new KeyListOutput<>(codec), args);
    }

    @SafeVarargs
    @SuppressWarnings({ "unchecked", "rawtypes" })
    final Command<K, V, Map<K, Long>> pubsubShardNumsub(K... shardChannels) {
        LettuceAssert.notEmpty(shardChannels, "Shard channels " + MUST_NOT_BE_EMPTY);

        CommandArgs<K, V> args = new PubSubCommandArgs<>(codec).add(SHARDNUMSUB).addKeys(shardChannels);
        return createCommand(PUBSUB, new MapOutput<>((RedisCodec) codec), args);
    }

    @SafeVarargs
    final Command<K, V, V> psubscribe(K... patterns) {
        LettuceAssert.notEmpty(patterns, "Patterns " + MUST_NOT_BE_EMPTY);

        return pubSubCommand(PSUBSCRIBE, new PubSubOutput<>(codec), patterns);
    }

    @SafeVarargs
    final Command<K, V, V> punsubscribe(K... patterns) {
        return pubSubCommand(PUNSUBSCRIBE, new PubSubOutput<>(codec), patterns);
    }

    Command<K, V, Long> spublish(K shardChannel, V message) {
        CommandArgs<K, V> args = new CommandArgs<>(codec).addKey(shardChannel).addValue(message);
        return createCommand(SPUBLISH, new IntegerOutput<>(codec), args);
    }

    @SafeVarargs
    final Command<K, V, V> ssubscribe(K... shardChannels) {
        LettuceAssert.notEmpty(shardChannels, "Shard channels " + MUST_NOT_BE_EMPTY);

        CommandArgs<K, V> args = new CommandArgs<>(codec).addKeys(shardChannels);
        return createCommand(SSUBSCRIBE, new PubSubOutput<>(codec), args);
    }

    @SafeVarargs
    final Command<K, V, V> subscribe(K... channels) {
        LettuceAssert.notEmpty(channels, "Channels " + MUST_NOT_BE_EMPTY);

        return pubSubCommand(SUBSCRIBE, new PubSubOutput<>(codec), channels);
    }

    @SafeVarargs
    final Command<K, V, V> sunsubscribe(K... shardChannels) {
        LettuceAssert.notEmpty(shardChannels, "Shard channels " + MUST_NOT_BE_EMPTY);

        CommandArgs<K, V> args = new CommandArgs<>(codec).addKeys(shardChannels);
        return createCommand(SUNSUBSCRIBE, new PubSubOutput<>(codec), args);
    }

    @SafeVarargs
    final Command<K, V, V> unsubscribe(K... channels) {
        return pubSubCommand(UNSUBSCRIBE, new PubSubOutput<>(codec), channels);
    }

    @SafeVarargs
    final <T> Command<K, V, T> pubSubCommand(CommandType type, CommandOutput<K, V, T> output, K... keys) {
        return new Command<>(type, output, new PubSubCommandArgs<>(codec).addKeys(keys));
    }

}
