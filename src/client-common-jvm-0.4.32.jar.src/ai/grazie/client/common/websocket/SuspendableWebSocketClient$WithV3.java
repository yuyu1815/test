/*    */ package ai.grazie.client.common.websocket;
/*    */ 
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004¢\006\002\020\005JB\020\b\032\0020\t2\006\020\n\032\0020\0042\006\020\013\032\0020\f2\"\020\r\032\036\b\001\022\004\022\0020\017\022\n\022\b\022\004\022\0020\t0\020\022\006\022\004\030\0010\0210\016H@¢\006\002\020\022R\016\020\002\032\0020\001X\004¢\006\002\n\000R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\006\020\007¨\006\023"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$WithV3;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient;", "client", "token", "", "(Lai/grazie/client/common/websocket/SuspendableWebSocketClient;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "connect", "", "url", "options", "Lai/grazie/client/common/model/RequestOptions;", "body", "Lkotlin/Function2;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nSuspendableWebSocketClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableWebSocketClient.kt\nai/grazie/client/common/websocket/SuspendableWebSocketClient$WithV3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/*    */ public final class WithV3
/*    */   implements SuspendableWebSocketClient
/*    */ {
/*    */   @NotNull
/*    */   private final SuspendableWebSocketClient client;
/*    */   @NotNull
/*    */   private final String token;
/*    */   
/*    */   public WithV3(@NotNull SuspendableWebSocketClient client, @NotNull String token) {
/* 31 */     this.client = client; this.token = token; } @NotNull public final String getToken() { return this.token; } @Nullable
/*    */   public Object connect(@NotNull String url, @NotNull RequestOptions options, @NotNull Function2<? super SuspendableWebSocketClient.Session, ? super Continuation<? super Unit>, ? extends Object> body, @NotNull Continuation<? super Unit> $completion) {
/* 33 */     RequestOptions requestOptions1 = options, requestOptions2 = requestOptions1;
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
/* 72 */     String str = url; SuspendableWebSocketClient suspendableWebSocketClient = this.client; int $i$a$-also-SuspendableWebSocketClient$WithV3$connect$2 = 0;
/*    */     requestOptions2.getHeaders().add("Grazie-Authenticate-JWT", this.token);
/*    */     Unit unit = Unit.INSTANCE;
/*    */     if (suspendableWebSocketClient.connect(str, requestOptions1, body, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*    */       return suspendableWebSocketClient.connect(str, requestOptions1, body, $completion); 
/*    */     suspendableWebSocketClient.connect(str, requestOptions1, body, $completion);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\websocket\SuspendableWebSocketClient$WithV3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */