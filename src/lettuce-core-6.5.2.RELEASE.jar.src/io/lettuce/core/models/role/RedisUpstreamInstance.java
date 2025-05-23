package io.lettuce.core.models.role;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import io.lettuce.core.internal.LettuceAssert;

/**
 * Represents a upstream instance.
 *
 * @author Mark Paluch
 * @since 6.0
 */
@SuppressWarnings("serial")
public class RedisUpstreamInstance implements RedisInstance, Serializable {

    private long replicationOffset;

    private List<ReplicationPartner> replicas = Collections.emptyList();

    public RedisUpstreamInstance() {
    }

    /**
     * Constructs a {@link RedisUpstreamInstance}
     *
     * @param replicationOffset the replication offset
     * @param replicas list of replicas, must not be {@code null} but may be empty
     */
    public RedisUpstreamInstance(long replicationOffset, List<ReplicationPartner> replicas) {
        LettuceAssert.notNull(replicas, "Replicas must not be null");
        this.replicationOffset = replicationOffset;
        this.replicas = replicas;
    }

    /**
     *
     * @return always {@link Role#UPSTREAM}
     */
    @Override
    public Role getRole() {
        return Role.UPSTREAM;
    }

    public long getReplicationOffset() {
        return replicationOffset;
    }

    @Deprecated
    public List<ReplicationPartner> getSlaves() {
        return getReplicas();
    }

    public List<ReplicationPartner> getReplicas() {
        return replicas;
    }

    public void setReplicationOffset(long replicationOffset) {
        this.replicationOffset = replicationOffset;
    }

    @Deprecated
    public void setSlaves(List<ReplicationPartner> replicas) {
        setReplicas(replicas);
    }

    public void setReplicas(List<ReplicationPartner> replicas) {
        LettuceAssert.notNull(replicas, "Replicas must not be null");
        this.replicas = replicas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [replicationOffset=").append(replicationOffset);
        sb.append(", replicas=").append(replicas);
        sb.append(']');
        return sb.toString();
    }

}
