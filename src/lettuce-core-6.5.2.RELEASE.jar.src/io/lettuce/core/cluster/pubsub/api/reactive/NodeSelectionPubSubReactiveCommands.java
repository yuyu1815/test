package io.lettuce.core.cluster.pubsub.api.reactive;

import io.lettuce.core.cluster.api.reactive.ReactiveExecutions;

/**
 * Reactive executed commands on a node selection for Pub/Sub.
 *
 * @author Mark Paluch
 * @since 4.4
 */
public interface NodeSelectionPubSubReactiveCommands<K, V> {

    /**
     * Listen for messages published to channels matching the given patterns.
     *
     * @param patterns the patterns
     * @return RedisFuture&lt;Void&gt; Future to synchronize {@code psubscribe} completion
     */
    ReactiveExecutions<Void> psubscribe(K... patterns);

    /**
     * Stop listening for messages posted to channels matching the given patterns.
     *
     * @param patterns the patterns
     * @return RedisFuture&lt;Void&gt; Future to synchronize {@code punsubscribe} completion
     */
    ReactiveExecutions<Void> punsubscribe(K... patterns);

    /**
     * Listen for messages published to the given channels.
     *
     * @param channels the channels
     * @return RedisFuture&lt;Void&gt; Future to synchronize {@code subscribe} completion
     */
    ReactiveExecutions<Void> subscribe(K... channels);

    /**
     * Stop listening for messages posted to the given channels.
     *
     * @param channels the channels
     * @return RedisFuture&lt;Void&gt; Future to synchronize {@code unsubscribe} completion.
     */
    ReactiveExecutions<Void> unsubscribe(K... channels);

    /**
     * Listen for messages published to the given shard channels.
     *
     * @param shardCchannels the channels
     * @return RedisFuture&lt;Void&gt; Future to synchronize {@code subscribe} completion
     * @since 6.4
     */
    ReactiveExecutions<Void> ssubscribe(K... shardCchannels);

    /**
     * Stop listening for messages posted to the given shard channels.
     *
     * @param shardCchannels the channels
     * @return RedisFuture&lt;Void&gt; Future to synchronize {@code unsubscribe} completion.
     * @since 6.4
     */
    ReactiveExecutions<Void> sunsubscribe(K... shardCchannels);

}
