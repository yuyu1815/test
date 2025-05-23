/*    */ package com.intellij.ml.llm.matterhorn.core.llm;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import reactor.netty.DisposableServer;
/*    */ import reactor.netty.http.server.HttpServerRoutes;
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
/*    */ @DebugMetadata(f = "MatterhornEnvironmentServer.kt", l = {55}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornEnvironmentServer$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lreactor/netty/DisposableServer;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super DisposableServer>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore_3
/*    */     //   4: aload_0
/*    */     //   5: getfield label : I
/*    */     //   8: tableswitch default -> 103, 0 -> 32, 1 -> 55
/*    */     //   32: aload_1
/*    */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   36: aload_0
/*    */     //   37: checkcast kotlin/coroutines/Continuation
/*    */     //   40: aload_0
/*    */     //   41: iconst_1
/*    */     //   42: putfield label : I
/*    */     //   45: invokestatic getMatterhornEnvironmentServerPort : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   48: dup
/*    */     //   49: aload_3
/*    */     //   50: if_acmpne -> 60
/*    */     //   53: aload_3
/*    */     //   54: areturn
/*    */     //   55: aload_1
/*    */     //   56: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   59: aload_1
/*    */     //   60: checkcast java/lang/Integer
/*    */     //   63: astore_2
/*    */     //   64: aload_2
/*    */     //   65: ifnull -> 101
/*    */     //   68: invokestatic create : ()Lreactor/netty/http/server/HttpServer;
/*    */     //   71: aload_2
/*    */     //   72: invokevirtual intValue : ()I
/*    */     //   75: invokevirtual port : (I)Lreactor/netty/http/server/HttpServer;
/*    */     //   78: aload_0
/*    */     //   79: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;
/*    */     //   82: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;)Lkotlin/jvm/functions/Function1;
/*    */     //   87: <illegal opcode> accept : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
/*    */     //   92: invokevirtual route : (Ljava/util/function/Consumer;)Lreactor/netty/http/server/HttpServer;
/*    */     //   95: invokevirtual bindNow : ()Lreactor/netty/DisposableServer;
/*    */     //   98: goto -> 102
/*    */     //   101: aconst_null
/*    */     //   102: areturn
/*    */     //   103: new java/lang/IllegalStateException
/*    */     //   106: dup
/*    */     //   107: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   109: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   112: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #54	-> 3
/*    */     //   #55	-> 40
/*    */     //   #54	-> 53
/*    */     //   #56	-> 64
/*    */     //   #57	-> 68
/*    */     //   #58	-> 101
/*    */     //   #54	-> 103
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   64	23	2	port	Ljava/lang/Integer;
/*    */     //   0	113	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer$1;
/*    */     //   36	67	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */     return (Continuation<Unit>)new Object(MatterhornEnvironmentServer.this, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$0(MatterhornEnvironmentServer this$0, HttpServerRoutes it) {
/* 57 */     Intrinsics.checkNotNull(it); MatterhornEnvironmentServer.access$setupRoutes(MatterhornEnvironmentServer.this, it); return Unit.INSTANCE; } private static final void invokeSuspend$lambda$1(Function1 $tmp0, Object p0) { $tmp0.invoke(p0); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\MatterhornEnvironmentServer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */