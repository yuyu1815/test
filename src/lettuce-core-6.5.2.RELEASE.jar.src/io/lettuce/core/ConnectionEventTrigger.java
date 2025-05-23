package io.lettuce.core;

import java.net.SocketAddress;

import io.lettuce.core.event.EventBus;
import io.lettuce.core.event.connection.ConnectionActivatedEvent;
import io.lettuce.core.event.connection.ConnectionDeactivatedEvent;
import io.lettuce.core.protocol.CommandHandler;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.local.LocalAddress;

/**
 * @author Mark Paluch
 * @since 3.0
 */
class ConnectionEventTrigger extends ChannelInboundHandlerAdapter {

    private final ConnectionEvents connectionEvents;

    private final RedisChannelHandler<?, ?> connection;

    private final EventBus eventBus;

    ConnectionEventTrigger(ConnectionEvents connectionEvents, RedisChannelHandler<?, ?> connection, EventBus eventBus) {
        this.connectionEvents = connectionEvents;
        this.connection = connection;
        this.eventBus = eventBus;
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        connectionEvents.fireEventRedisConnected(connection, channel.remoteAddress());

        CommandHandler commandHandler = getCommandHandler(ctx);
        String epid = commandHandler.getEndpoint().getId();
        eventBus.publish(new ConnectionActivatedEvent(getRedisUri(channel), epid, commandHandler.getChannelId(), local(ctx),
                remote(ctx)));
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        connectionEvents.fireEventRedisDisconnected(connection);

        CommandHandler commandHandler = getCommandHandler(ctx);
        String epid = commandHandler.getEndpoint().getId();
        eventBus.publish(new ConnectionDeactivatedEvent(getRedisUri(ctx.channel()), epid, commandHandler.getChannelId(),
                local(ctx), remote(ctx)));
        super.channelInactive(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        connectionEvents.fireEventRedisExceptionCaught(connection, cause);
        super.exceptionCaught(ctx, cause);
    }

    static SocketAddress remote(ChannelHandlerContext ctx) {
        if (ctx.channel() != null && ctx.channel().remoteAddress() != null) {
            return ctx.channel().remoteAddress();
        }
        return new LocalAddress("unknown");
    }

    static SocketAddress local(ChannelHandlerContext ctx) {
        Channel channel = ctx.channel();
        if (channel != null && channel.localAddress() != null) {
            return channel.localAddress();
        }
        return LocalAddress.ANY;
    }

    private static String getRedisUri(Channel channel) {

        String redisUri = null;
        if (channel.hasAttr(ConnectionBuilder.REDIS_URI)) {
            redisUri = channel.attr(ConnectionBuilder.REDIS_URI).get();
        }

        return redisUri;
    }

    private static CommandHandler getCommandHandler(ChannelHandlerContext ctx) {
        return ctx.pipeline().get(CommandHandler.class);
    }

}
