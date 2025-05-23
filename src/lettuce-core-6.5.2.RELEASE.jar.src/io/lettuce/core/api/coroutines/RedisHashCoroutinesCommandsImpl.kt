/*
 * Copyright 2020-Present, Redis Ltd. and Contributors
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

package io.lettuce.core.api.coroutines

import io.lettuce.core.*
import io.lettuce.core.api.reactive.RedisHashReactiveCommands
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.reactive.asFlow
import kotlinx.coroutines.reactive.awaitFirstOrNull
import java.time.Duration
import java.time.Instant
import java.util.*


/**
 * Coroutine executed commands (based on reactive commands) for Hashes (Key-Value pairs).
 *
 * @param <K> Key type.
 * @param <V> Value type.
 * @author Mikhael Sokolov
 * @since 6.0
 */
@ExperimentalLettuceCoroutinesApi
internal class RedisHashCoroutinesCommandsImpl<K : Any, V : Any>(internal val ops: RedisHashReactiveCommands<K, V>) : RedisHashCoroutinesCommands<K, V> {

    override suspend fun hdel(key: K, vararg fields: K): Long? = ops.hdel(key, *fields).awaitFirstOrNull()

    override suspend fun hexists(key: K, field: K): Boolean? = ops.hexists(key, field).awaitFirstOrNull()

    override suspend fun hget(key: K, field: K): V? = ops.hget(key, field).awaitFirstOrNull()

    override suspend fun hincrby(key: K, field: K, amount: Long): Long? = ops.hincrby(key, field, amount).awaitFirstOrNull()

    override suspend fun hincrbyfloat(key: K, field: K, amount: Double): Double? =
        ops.hincrbyfloat(key, field, amount).awaitFirstOrNull()

    override fun hgetall(key: K): Flow<KeyValue<K, V>> = ops.hgetall(key).asFlow()

    override fun hkeys(key: K): Flow<K> = ops.hkeys(key).asFlow()

    override suspend fun hlen(key: K): Long? = ops.hlen(key).awaitFirstOrNull()

    override fun hmget(key: K, vararg fields: K): Flow<KeyValue<K, V>> =
        ops.hmget(key, *fields).asFlow()

    override suspend fun hrandfield(key: K): K? = ops.hrandfield(key).awaitFirstOrNull();

    override suspend fun hrandfield(key: K, count: Long): List<K> =
        ops.hrandfield(key, count).asFlow().toList()

    override suspend fun hrandfieldWithvalues(key: K): KeyValue<K, V>? =
        ops.hrandfieldWithvalues(key).awaitFirstOrNull();

    override suspend fun hrandfieldWithvalues(key: K, count: Long): List<KeyValue<K, V>> =
        ops.hrandfieldWithvalues(key, count).asFlow().toList()

    override suspend fun hmset(key: K, map: Map<K, V>): String? =
        ops.hmset(key, map).awaitFirstOrNull()

    override suspend fun hscan(key: K): MapScanCursor<K, V>? =
        ops.hscan(key).awaitFirstOrNull()

    override suspend fun hscanNovalues(key: K): KeyScanCursor<K>? =
        ops.hscanNovalues(key).awaitFirstOrNull()

    override suspend fun hscan(key: K, scanArgs: ScanArgs): MapScanCursor<K, V>? =
        ops.hscan(key, scanArgs).awaitFirstOrNull()

    override suspend fun hscanNovalues(key: K, scanArgs: ScanArgs): KeyScanCursor<K>? =
        ops.hscanNovalues(key, scanArgs).awaitFirstOrNull()

    override suspend fun hscan(
        key: K,
        scanCursor: ScanCursor,
        scanArgs: ScanArgs
    ): MapScanCursor<K, V>? = ops.hscan(key, scanCursor, scanArgs).awaitFirstOrNull()

    override suspend fun hscanNovalues(
        key: K,
        scanCursor: ScanCursor,
        scanArgs: ScanArgs
    ): KeyScanCursor<K>? = ops.hscanNovalues(key, scanCursor, scanArgs).awaitFirstOrNull()

    override suspend fun hscan(key: K, scanCursor: ScanCursor): MapScanCursor<K, V>? =
        ops.hscan(key, scanCursor).awaitFirstOrNull()

    override suspend fun hscanNovalues(key: K, scanCursor: ScanCursor): KeyScanCursor<K>? =
        ops.hscanNovalues(key, scanCursor).awaitFirstOrNull()

    override suspend fun hset(key: K, field: K, value: V): Boolean? = ops.hset(key, field, value).awaitFirstOrNull()

    override suspend fun hset(key: K, map: Map<K, V>): Long? = ops.hset(key, map).awaitFirstOrNull()

    override suspend fun hsetnx(key: K, field: K, value: V): Boolean? = ops.hsetnx(key, field, value).awaitFirstOrNull()

    override suspend fun hstrlen(key: K, field: K): Long? = ops.hstrlen(key, field).awaitFirstOrNull()

    override fun hvals(key: K): Flow<V> = ops.hvals(key).asFlow()

    override suspend fun hexpire(key: K, seconds: Long, vararg fields: K): List<Long> =
        ops.hexpire(key, seconds, *fields).asFlow().toList()

    override suspend fun hexpire(key: K, seconds: Long, expireArgs: ExpireArgs, vararg fields: K): List<Long> =
        ops.hexpire(key, seconds, expireArgs, *fields).asFlow().toList()

    override suspend fun hexpire(key: K, seconds: Duration, vararg fields: K): List<Long> =
        ops.hexpire(key, seconds, *fields).asFlow().toList()

    override suspend fun hexpire(
        key: K,
        seconds: Duration,
        expireArgs: ExpireArgs,
        vararg fields: K
    ): List<Long> =
        ops.hexpire(key, seconds, expireArgs, *fields).asFlow().toList()

    override suspend fun hexpireat(key: K, timestamp: Date, vararg fields: K): List<Long> =
        ops.hexpireat(key, timestamp, *fields).asFlow().toList()

    override suspend fun hexpireat(
        key: K,
        timestamp: Long,
        expireArgs: ExpireArgs,
        vararg fields: K
    ): List<Long> =
        ops.hexpireat(key, timestamp, expireArgs, *fields).asFlow().toList()

    override suspend fun hexpireat(key: K, timestamp: Instant, vararg fields: K): List<Long> =
        ops.hexpireat(key, timestamp, *fields).asFlow().toList()

    override suspend fun hexpireat(
        key: K,
        timestamp: Instant,
        expireArgs: ExpireArgs,
        vararg fields: K
    ): List<Long> =
        ops.hexpireat(key, timestamp, expireArgs, *fields).asFlow().toList()

    override suspend fun hexpireat(key: K, timestamp: Long, vararg fields: K): List<Long> =
        ops.hexpireat(key, timestamp, *fields).asFlow().toList()

    override suspend fun hexpireat(
        key: K,
        timestamp: Date,
        expireArgs: ExpireArgs,
        vararg fields: K
    ): List<Long> =
        ops.hexpireat(key, timestamp, expireArgs, *fields).asFlow().toList()

    override suspend fun hexpiretime(key: K, vararg fields: K): List<Long> =
        ops.hexpiretime(key).asFlow().toList()

    override suspend fun hpersist(key: K, vararg fields: K): List<Long> = ops.hpersist(key).asFlow().toList()

    override suspend fun hpexpire(key: K, milliseconds: Long, vararg fields: K): List<Long> =
        ops.hpexpire(key, milliseconds, *fields).asFlow().toList()

    override suspend fun hpexpire(
        key: K,
        milliseconds: Long,
        expireArgs: ExpireArgs,
        vararg fields: K
    ): List<Long> =
        ops.hpexpire(key, milliseconds, expireArgs, *fields).asFlow().toList()

    override suspend fun hpexpire(key: K, milliseconds: Duration, vararg fields: K): List<Long> =
        ops.hpexpire(key, milliseconds, *fields).asFlow().toList()

    override suspend fun hpexpire(
        key: K,
        milliseconds: Duration,
        expireArgs: ExpireArgs,
        vararg fields: K
    ): List<Long> =
        ops.hpexpire(key, milliseconds, expireArgs, *fields).asFlow().toList()

    override suspend fun hpexpireat(key: K, timestamp: Long, vararg fields: K): List<Long> =
        ops.hpexpireat(key, timestamp, *fields).asFlow().toList()

    override suspend fun hpexpireat(
        key: K,
        timestamp: Long,
        expireArgs: ExpireArgs,
        vararg fields: K
    ): List<Long> =
        ops.hpexpireat(key, timestamp, expireArgs, *fields).asFlow().toList()

    override suspend fun hpexpireat(key: K, timestamp: Date, vararg fields: K): List<Long> =
        ops.hpexpireat(key, timestamp, *fields).asFlow().toList()

    override suspend fun hpexpireat(
        key: K,
        timestamp: Date,
        expireArgs: ExpireArgs,
        vararg fields: K
    ): List<Long> =
        ops.hpexpireat(key, timestamp, expireArgs, *fields).asFlow().toList()

    override suspend fun hpexpireat(key: K, timestamp: Instant, vararg fields: K): List<Long> =
        ops.hpexpireat(key, timestamp, *fields).asFlow().toList()

    override suspend fun hpexpireat(
        key: K,
        timestamp: Instant,
        expireArgs: ExpireArgs,
        vararg fields: K
    ): List<Long> =
        ops.hpexpireat(key, timestamp, expireArgs, *fields).asFlow().toList()

    override suspend fun hpexpiretime(key: K, vararg fields: K): List<Long> =
        ops.hpexpiretime(key, *fields).asFlow().toList()

    override suspend fun httl(key: K, vararg fields: K): List<Long> =
        ops.httl(key, *fields).asFlow().toList()

    override suspend fun hpttl(key: K, vararg fields: K): List<Long> =
        ops.hpttl(key, *fields).asFlow().toList()
}

