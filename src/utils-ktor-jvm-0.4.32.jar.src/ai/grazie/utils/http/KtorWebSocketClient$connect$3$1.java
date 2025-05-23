/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.plugins.websocket.DefaultClientWebSocketSession;
/*    */ import io.ktor.websocket.CloseReason;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "KtorWebSocketClient.kt", l = {50}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.KtorWebSocketClient$connect$3$1")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\002\020\000\032\0020\001H@"}, d2 = {"<anonymous>", ""})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function1<Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(DefaultClientWebSocketSession $$this$webSocket, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 50 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this) == object) return object;  WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super null> $completion) {
/*    */     return (Continuation<Unit>)new Object(this.$$this$webSocket, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((null)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\KtorWebSocketClient$connect$3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */