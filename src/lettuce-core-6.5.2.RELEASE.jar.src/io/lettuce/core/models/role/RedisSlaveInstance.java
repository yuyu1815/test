package io.lettuce.core.models.role;

import java.io.Serializable;

import io.lettuce.core.internal.LettuceAssert;

/**
 * Redis replica instance.
 *
 * @author Mark Paluch
 * @since 3.0
 * @deprecated since 6.0, in favor or {@link RedisReplicaInstance}.
 */
@SuppressWarnings("serial")
@Deprecated
public class RedisSlaveInstance extends RedisReplicaInstance implements RedisInstance, Serializable {

    public RedisSlaveInstance() {
    }

    /**
     * Constructs a {@link RedisSlaveInstance}
     *
     * @param master master for the replication, must not be {@code null}
     * @param state replica state, must not be {@code null}
     */
    RedisSlaveInstance(ReplicationPartner master, State state) {
        super(master, state);
    }

    /**
     * @return always {@link io.lettuce.core.models.role.RedisInstance.Role#SLAVE}
     */
    @Override
    public Role getRole() {
        return Role.SLAVE;
    }

    /**
     *
     * @return the replication master.
     */
    public ReplicationPartner getMaster() {
        return getUpstream();
    }

    public void setMaster(ReplicationPartner master) {
        LettuceAssert.notNull(master, "Master must not be null");
        setUpstream(master);
    }

}
