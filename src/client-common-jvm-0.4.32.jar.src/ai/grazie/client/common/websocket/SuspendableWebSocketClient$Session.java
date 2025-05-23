/*    */ package ai.grazie.client.common.websocket;
/*    */ 
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlinx.coroutines.channels.ReceiveChannel;
/*    */ import kotlinx.coroutines.channels.SendChannel;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B?\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0040\006\022\034\020\007\032\030\b\001\022\n\022\b\022\004\022\0020\n0\t\022\006\022\004\030\0010\0010\b¢\006\002\020\013J\017\020\023\032\b\022\004\022\0020\0040\003HÆ\003J\017\020\024\032\b\022\004\022\0020\0040\006HÆ\003J$\020\025\032\030\b\001\022\n\022\b\022\004\022\0020\n0\t\022\006\022\004\030\0010\0010\bHÆ\003¢\006\002\020\rJN\020\026\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\016\b\002\020\005\032\b\022\004\022\0020\0040\0062\036\b\002\020\007\032\030\b\001\022\n\022\b\022\004\022\0020\n0\t\022\006\022\004\030\0010\0010\bHÆ\001¢\006\002\020\027J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\034HÖ\001J\t\020\035\032\0020\036HÖ\001R)\020\007\032\030\b\001\022\n\022\b\022\004\022\0020\n0\t\022\006\022\004\030\0010\0010\b¢\006\n\n\002\020\016\032\004\b\f\020\rR\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\017\020\020R\027\020\005\032\b\022\004\022\0020\0040\006¢\006\b\n\000\032\004\b\021\020\022¨\006\037"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;", "", "incoming", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;", "outgoing", "Lkotlinx/coroutines/channels/SendChannel;", "close", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/jvm/functions/Function1;)V", "getClose", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "component1", "component2", "component3", "copy", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/jvm/functions/Function1;)Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;", "equals", "", "other", "hashCode", "", "toString", "", "client-common"})
/*    */ public final class Session {
/*    */   @NotNull
/*    */   private final ReceiveChannel<SuspendableWebSocketClient.Frame> incoming;
/*    */   
/* 15 */   public Session(@NotNull ReceiveChannel<SuspendableWebSocketClient.Frame> incoming, @NotNull SendChannel<SuspendableWebSocketClient.Frame> outgoing, @NotNull Function1<Continuation<? super Unit>, Object> close) { this.incoming = incoming; this.outgoing = outgoing; this.close = close; } @NotNull private final SendChannel<SuspendableWebSocketClient.Frame> outgoing; @NotNull private final Function1<Continuation<? super Unit>, Object> close; @NotNull public final ReceiveChannel<SuspendableWebSocketClient.Frame> getIncoming() { return this.incoming; } @NotNull public final SendChannel<SuspendableWebSocketClient.Frame> getOutgoing() { return this.outgoing; } @NotNull public final Function1<Continuation<? super Unit>, Object> getClose() { return this.close; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ReceiveChannel<SuspendableWebSocketClient.Frame> component1() {
/*    */     return this.incoming;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SendChannel<SuspendableWebSocketClient.Frame> component2() {
/*    */     return this.outgoing;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function1<Continuation<? super Unit>, Object> component3() {
/*    */     return this.close;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Session copy(@NotNull ReceiveChannel<? extends SuspendableWebSocketClient.Frame> incoming, @NotNull SendChannel<? super SuspendableWebSocketClient.Frame> outgoing, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> close) {
/*    */     Intrinsics.checkNotNullParameter(incoming, "incoming");
/*    */     Intrinsics.checkNotNullParameter(outgoing, "outgoing");
/*    */     Intrinsics.checkNotNullParameter(close, "close");
/*    */     return new Session(incoming, outgoing, close);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Session(incoming=" + this.incoming + ", outgoing=" + this.outgoing + ", close=" + this.close + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.incoming.hashCode();
/*    */     result = result * 31 + this.outgoing.hashCode();
/*    */     return result * 31 + this.close.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Session))
/*    */       return false; 
/*    */     Session session = (Session)other;
/*    */     return !Intrinsics.areEqual(this.incoming, session.incoming) ? false : (!Intrinsics.areEqual(this.outgoing, session.outgoing) ? false : (!!Intrinsics.areEqual(this.close, session.close)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\websocket\SuspendableWebSocketClient$Session.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */