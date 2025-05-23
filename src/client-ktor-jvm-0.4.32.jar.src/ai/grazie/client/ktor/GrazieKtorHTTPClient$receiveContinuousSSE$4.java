/*     */ package ai.grazie.client.ktor;
/*     */ 
/*     */ import ai.grazie.model.cloud.sse.ServerSentEvent;
/*     */ import io.ktor.client.request.HttpRequestBuilder;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendFunction;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ 
/*     */ @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {185}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient$receiveContinuousSSE$4")
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lai/grazie/model/cloud/sse/ServerSentEvent;"})
/*     */ final class GrazieKtorHTTPClient$receiveContinuousSSE$4 extends SuspendLambda implements Function2<FlowCollector<? super ServerSentEvent>, Continuation<? super Unit>, Object> {
/*     */   int label;
/*     */   
/*     */   GrazieKtorHTTPClient$receiveContinuousSSE$4(HttpRequestBuilder $builder, boolean $reconnect, Function2<ServerSentEvent, Continuation<? super Boolean>, Object> $isEnd, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore_3
/*     */     //   4: aload_0
/*     */     //   5: getfield label : I
/*     */     //   8: tableswitch default -> 123, 0 -> 32, 1 -> 113
/*     */     //   32: aload_1
/*     */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   36: aload_0
/*     */     //   37: getfield L$0 : Ljava/lang/Object;
/*     */     //   40: checkcast kotlinx/coroutines/flow/FlowCollector
/*     */     //   43: astore_2
/*     */     //   44: aload_0
/*     */     //   45: getfield this$0 : Lai/grazie/client/ktor/GrazieKtorHTTPClient;
/*     */     //   48: invokestatic access$getClient$p : (Lai/grazie/client/ktor/GrazieKtorHTTPClient;)Lio/ktor/client/HttpClient;
/*     */     //   51: aload_0
/*     */     //   52: getfield $builder : Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   55: iconst_1
/*     */     //   56: aload_0
/*     */     //   57: getfield $reconnect : Z
/*     */     //   60: ifne -> 67
/*     */     //   63: iconst_1
/*     */     //   64: goto -> 68
/*     */     //   67: iconst_0
/*     */     //   68: new ai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$4$1
/*     */     //   71: dup
/*     */     //   72: aload_0
/*     */     //   73: getfield $isEnd : Lkotlin/jvm/functions/Function2;
/*     */     //   76: aconst_null
/*     */     //   77: invokespecial <init> : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
/*     */     //   80: checkcast kotlin/jvm/functions/Function2
/*     */     //   83: new ai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$4$2
/*     */     //   86: dup
/*     */     //   87: aload_2
/*     */     //   88: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   91: checkcast kotlin/jvm/functions/Function2
/*     */     //   94: aload_0
/*     */     //   95: checkcast kotlin/coroutines/Continuation
/*     */     //   98: aload_0
/*     */     //   99: iconst_1
/*     */     //   100: putfield label : I
/*     */     //   103: invokestatic readSse : (Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   106: dup
/*     */     //   107: aload_3
/*     */     //   108: if_acmpne -> 118
/*     */     //   111: aload_3
/*     */     //   112: areturn
/*     */     //   113: aload_1
/*     */     //   114: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   117: aload_1
/*     */     //   118: pop
/*     */     //   119: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   122: areturn
/*     */     //   123: new java/lang/IllegalStateException
/*     */     //   126: dup
/*     */     //   127: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   129: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   132: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #184	-> 3
/*     */     //   #185	-> 44
/*     */     //   #184	-> 111
/*     */     //   #186	-> 118
/*     */     //   #184	-> 123
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   44	62	2	$this$flow	Lkotlinx/coroutines/flow/FlowCollector;
/*     */     //   0	133	0	this	Lai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$4;
/*     */     //   36	87	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super GrazieKtorHTTPClient$receiveContinuousSSE$4> $completion) {
/*     */     GrazieKtorHTTPClient$receiveContinuousSSE$4 grazieKtorHTTPClient$receiveContinuousSSE$4 = new GrazieKtorHTTPClient$receiveContinuousSSE$4(this.$builder, this.$reconnect, this.$isEnd, $completion);
/*     */     grazieKtorHTTPClient$receiveContinuousSSE$4.L$0 = value;
/*     */     return (Continuation<Unit>)grazieKtorHTTPClient$receiveContinuousSSE$4;
/*     */   }
/*     */   
/*     */   public final Object invoke(FlowCollector p1, Continuation<?> p2) {
/*     */     return ((GrazieKtorHTTPClient$receiveContinuousSSE$4)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-ktor-jvm-0.4.32.jar!\ai\grazie\client\ktor\GrazieKtorHTTPClient$receiveContinuousSSE$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */