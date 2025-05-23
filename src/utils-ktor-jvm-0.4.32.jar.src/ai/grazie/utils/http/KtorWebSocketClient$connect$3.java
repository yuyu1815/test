/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.plugins.websocket.DefaultClientWebSocketSession;
/*    */ import io.ktor.websocket.CloseReason;
/*    */ import io.ktor.websocket.Frame;
/*    */ import io.ktor.websocket.WebSocketSession;
/*    */ import io.ktor.websocket.WebSocketSessionKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function5;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.channels.ReceiveChannel;
/*    */ import kotlinx.coroutines.channels.SendChannel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "KtorWebSocketClient.kt", l = {50}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.KtorWebSocketClient$connect$3")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;"})
/*    */ final class KtorWebSocketClient$connect$3
/*    */   extends SuspendLambda
/*    */   implements Function2<DefaultClientWebSocketSession, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   KtorWebSocketClient$connect$3(Function5<CoroutineScope, ReceiveChannel<? extends Frame>, SendChannel<? super Frame>, Function1<? super Continuation<? super Unit>, ? extends Object>, Continuation<? super Unit>, Object> $process, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     DefaultClientWebSocketSession $this$webSocket;
/* 49 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$webSocket = (DefaultClientWebSocketSession)this.L$0;
/* 50 */         this.label = 1; if (this.$process.invoke($this$webSocket, $this$webSocket.getIncoming(), $this$webSocket.getOutgoing(), new Function1<Continuation<? super Unit>, Object>($this$webSocket, null) { int label; public final Continuation<Unit> create(Continuation<? super null> $completion) { return (Continuation)new Function1<>(this.$$this$webSocket, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this) == object) return object;  WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(Continuation<?> p1) { return ((null)create(p1)).invokeSuspend(Unit.INSTANCE); } }this) == object) return object;  this.$process.invoke($this$webSocket, $this$webSocket.getIncoming(), $this$webSocket.getOutgoing(), new Function1<Continuation<? super Unit>, Object>($this$webSocket, null) { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this) == object) return object;  WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super null> $completion) { return (Continuation)new Function1<>(this.$$this$webSocket, $completion); } public final Object invoke(Continuation<?> p1) { return ((null)create(p1)).invokeSuspend(Unit.INSTANCE); } }this);
/* 51 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super KtorWebSocketClient$connect$3> $completion) {
/*    */     KtorWebSocketClient$connect$3 ktorWebSocketClient$connect$3 = new KtorWebSocketClient$connect$3(this.$process, $completion);
/*    */     ktorWebSocketClient$connect$3.L$0 = value;
/*    */     return (Continuation<Unit>)ktorWebSocketClient$connect$3;
/*    */   }
/*    */   
/*    */   public final Object invoke(DefaultClientWebSocketSession p1, Continuation<?> p2) {
/*    */     return ((KtorWebSocketClient$connect$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\KtorWebSocketClient$connect$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */