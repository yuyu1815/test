package io.lettuce.core.cluster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.cluster.api.NodeSelectionSupport;
import io.lettuce.core.cluster.models.partitions.RedisClusterNode;

/**
 * Abstract base class to support node selections. A node selection represents a set of Redis Cluster nodes and allows command
 * execution on the selected cluster nodes.
 *
 * @param <API> API type.
 * @param <CMD> Command interface type to invoke multi-node operations.
 * @param <K> Key type.
 * @param <V> Value type.
 * @since 4.1
 * @author Mark Paluch
 */
abstract class AbstractNodeSelection<API, CMD, K, V> implements NodeSelectionSupport<API, CMD> {

    @Override
    public Map<RedisClusterNode, API> asMap() {

        List<RedisClusterNode> list = new ArrayList<>(nodes());
        Map<RedisClusterNode, API> map = new HashMap<>(list.size(), 1);

        list.forEach((key) -> map.put(key, getApi(key).join()));

        return map;
    }

    @Override
    public int size() {
        return nodes().size();
    }

    @Override
    public RedisClusterNode node(int index) {
        return nodes().get(index);
    }

    // This method is never called, the value is supplied by AOP magic, see NodeSelectionInvocationHandler
    @Override
    public CMD commands() {
        return null;
    }

    @Override
    public API commands(int index) {
        return getApi(node(index)).join();
    }

    /**
     * @return {@link Map} between a {@link RedisClusterNode} to its actual {@link StatefulRedisConnection}.
     */
    protected Map<RedisClusterNode, CompletableFuture<? extends StatefulRedisConnection<K, V>>> statefulMap() {
        return nodes().stream().collect(Collectors.toMap(redisClusterNode -> redisClusterNode, this::getConnection));
    }

    /**
     * Template method to be implemented by implementing classes to obtain a {@link StatefulRedisConnection}.
     *
     * @param redisClusterNode must not be {@code null}.
     * @return
     */
    protected abstract CompletableFuture<? extends StatefulRedisConnection<K, V>> getConnection(
            RedisClusterNode redisClusterNode);

    /**
     * Template method to be implemented by implementing classes to obtain a the API object given a {@link RedisClusterNode}.
     *
     * @param redisClusterNode must not be {@code null}.
     * @return
     */
    protected abstract CompletableFuture<API> getApi(RedisClusterNode redisClusterNode);

    /**
     * @return List of involved nodes
     */
    protected abstract List<RedisClusterNode> nodes();

}
