/*     */ package ai.grazie.client.ktor;
/*     */ 
/*     */ import io.ktor.client.request.HttpRequestBuilder;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendFunction;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ 
/*     */ @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {197}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient$receiveLineStream$3")
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\020\016\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""})
/*     */ final class GrazieKtorHTTPClient$receiveLineStream$3 extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
/*     */   int label;
/*     */   
/*     */   GrazieKtorHTTPClient$receiveLineStream$3(HttpRequestBuilder $builder, Function1<String, Boolean> $isLastLine, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore_3
/*     */     //   4: aload_0
/*     */     //   5: getfield label : I
/*     */     //   8: tableswitch default -> 99, 0 -> 32, 1 -> 89
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
/*     */     //   55: new ai/grazie/client/ktor/GrazieKtorHTTPClient$receiveLineStream$3$1
/*     */     //   58: dup
/*     */     //   59: aload_2
/*     */     //   60: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   63: checkcast kotlin/jvm/functions/Function2
/*     */     //   66: aload_0
/*     */     //   67: getfield $isLastLine : Lkotlin/jvm/functions/Function1;
/*     */     //   70: aload_0
/*     */     //   71: checkcast kotlin/coroutines/Continuation
/*     */     //   74: aload_0
/*     */     //   75: iconst_1
/*     */     //   76: putfield label : I
/*     */     //   79: invokestatic readLineStream : (Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   82: dup
/*     */     //   83: aload_3
/*     */     //   84: if_acmpne -> 94
/*     */     //   87: aload_3
/*     */     //   88: areturn
/*     */     //   89: aload_1
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: pop
/*     */     //   95: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   98: areturn
/*     */     //   99: new java/lang/IllegalStateException
/*     */     //   102: dup
/*     */     //   103: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   105: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   108: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #197	-> 3
/*     */     //   #197	-> 44
/*     */     //   #197	-> 87
/*     */     //   #197	-> 94
/*     */     //   #197	-> 99
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   44	38	2	$this$flow	Lkotlinx/coroutines/flow/FlowCollector;
/*     */     //   0	109	0	this	Lai/grazie/client/ktor/GrazieKtorHTTPClient$receiveLineStream$3;
/*     */     //   36	63	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super GrazieKtorHTTPClient$receiveLineStream$3> $completion) {
/*     */     GrazieKtorHTTPClient$receiveLineStream$3 grazieKtorHTTPClient$receiveLineStream$3 = new GrazieKtorHTTPClient$receiveLineStream$3(this.$builder, this.$isLastLine, $completion);
/*     */     grazieKtorHTTPClient$receiveLineStream$3.L$0 = value;
/*     */     return (Continuation<Unit>)grazieKtorHTTPClient$receiveLineStream$3;
/*     */   }
/*     */   
/*     */   public final Object invoke(FlowCollector p1, Continuation<?> p2) {
/*     */     return ((GrazieKtorHTTPClient$receiveLineStream$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-ktor-jvm-0.4.32.jar!\ai\grazie\client\ktor\GrazieKtorHTTPClient$receiveLineStream$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */