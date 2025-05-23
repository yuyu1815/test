/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.channels.Channel;
/*    */ 
/*    */ @DebugMetadata(f = "SuspendableBatchProcessor.kt", l = {118, 62}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"$this$coroutineScope", "$this$withLock_u24default$iv"}, m = "invokeSuspend", c = "ai.grazie.utils.SuspendableBatchProcessor$processWithBatching$2")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\b\002\n\002\030\002\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\003\"\004\b\001\020\002*\0020\004H@"}, d2 = {"<anonymous>", "", "Result", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ @SourceDebugExtension({"SMAP\nSuspendableBatchProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableBatchProcessor.kt\nai/grazie/utils/SuspendableBatchProcessor$processWithBatching$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,113:1\n116#2,10:114\n*S KotlinDebug\n*F\n+ 1 SuspendableBatchProcessor.kt\nai/grazie/utils/SuspendableBatchProcessor$processWithBatching$2\n*L\n54#1:114,10\n*E\n"})
/*    */ final class SuspendableBatchProcessor$processWithBatching$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Result>>, Object> {
/*    */   Object L$1;
/*    */   Object L$2;
/*    */   int label;
/*    */   
/*    */   SuspendableBatchProcessor$processWithBatching$2(List<T> $parameters, Channel<Result> $resultChannel, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore #10
/*    */     //   5: aload_0
/*    */     //   6: getfield label : I
/*    */     //   9: tableswitch default -> 273, 0 -> 36, 1 -> 111, 2 -> 267
/*    */     //   36: aload_1
/*    */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   40: aload_0
/*    */     //   41: getfield L$0 : Ljava/lang/Object;
/*    */     //   44: checkcast kotlinx/coroutines/CoroutineScope
/*    */     //   47: astore_2
/*    */     //   48: aload_0
/*    */     //   49: getfield this$0 : Lai/grazie/utils/SuspendableBatchProcessor;
/*    */     //   52: invokestatic access$getBufferMutex$p : (Lai/grazie/utils/SuspendableBatchProcessor;)Lkotlinx/coroutines/sync/Mutex;
/*    */     //   55: astore_3
/*    */     //   56: aload_0
/*    */     //   57: getfield this$0 : Lai/grazie/utils/SuspendableBatchProcessor;
/*    */     //   60: astore #5
/*    */     //   62: aconst_null
/*    */     //   63: astore #4
/*    */     //   65: iconst_0
/*    */     //   66: istore #6
/*    */     //   68: nop
/*    */     //   69: aload_3
/*    */     //   70: aload #4
/*    */     //   72: aload_0
/*    */     //   73: checkcast kotlin/coroutines/Continuation
/*    */     //   76: aload_0
/*    */     //   77: aload_2
/*    */     //   78: putfield L$0 : Ljava/lang/Object;
/*    */     //   81: aload_0
/*    */     //   82: aload_3
/*    */     //   83: putfield L$1 : Ljava/lang/Object;
/*    */     //   86: aload_0
/*    */     //   87: aload #5
/*    */     //   89: putfield L$2 : Ljava/lang/Object;
/*    */     //   92: aload_0
/*    */     //   93: iconst_1
/*    */     //   94: putfield label : I
/*    */     //   97: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   102: dup
/*    */     //   103: aload #10
/*    */     //   105: if_acmpne -> 147
/*    */     //   108: aload #10
/*    */     //   110: areturn
/*    */     //   111: iconst_0
/*    */     //   112: istore #6
/*    */     //   114: aload_0
/*    */     //   115: getfield L$2 : Ljava/lang/Object;
/*    */     //   118: checkcast ai/grazie/utils/SuspendableBatchProcessor
/*    */     //   121: astore #5
/*    */     //   123: aconst_null
/*    */     //   124: astore #4
/*    */     //   126: aload_0
/*    */     //   127: getfield L$1 : Ljava/lang/Object;
/*    */     //   130: checkcast kotlinx/coroutines/sync/Mutex
/*    */     //   133: astore_3
/*    */     //   134: aload_0
/*    */     //   135: getfield L$0 : Ljava/lang/Object;
/*    */     //   138: checkcast kotlinx/coroutines/CoroutineScope
/*    */     //   141: astore_2
/*    */     //   142: aload_1
/*    */     //   143: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   146: aload_1
/*    */     //   147: pop
/*    */     //   148: nop
/*    */     //   149: iconst_0
/*    */     //   150: istore #7
/*    */     //   152: aload #5
/*    */     //   154: invokestatic access$isBufferingInProgress$p : (Lai/grazie/utils/SuspendableBatchProcessor;)Z
/*    */     //   157: ifne -> 188
/*    */     //   160: aload #5
/*    */     //   162: iconst_1
/*    */     //   163: invokestatic access$setBufferingInProgress$p : (Lai/grazie/utils/SuspendableBatchProcessor;Z)V
/*    */     //   166: aload_2
/*    */     //   167: aconst_null
/*    */     //   168: aconst_null
/*    */     //   169: new ai/grazie/utils/SuspendableBatchProcessor$processWithBatching$2$1$1
/*    */     //   172: dup
/*    */     //   173: aload #5
/*    */     //   175: aconst_null
/*    */     //   176: invokespecial <init> : (Lai/grazie/utils/SuspendableBatchProcessor;Lkotlin/coroutines/Continuation;)V
/*    */     //   179: checkcast kotlin/jvm/functions/Function2
/*    */     //   182: iconst_3
/*    */     //   183: aconst_null
/*    */     //   184: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*    */     //   187: pop
/*    */     //   188: nop
/*    */     //   189: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   192: astore #8
/*    */     //   194: aload_3
/*    */     //   195: aload #4
/*    */     //   197: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */     //   202: goto -> 218
/*    */     //   205: astore #9
/*    */     //   207: aload_3
/*    */     //   208: aload #4
/*    */     //   210: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */     //   215: aload #9
/*    */     //   217: athrow
/*    */     //   218: nop
/*    */     //   219: aload_0
/*    */     //   220: getfield this$0 : Lai/grazie/utils/SuspendableBatchProcessor;
/*    */     //   223: aload_0
/*    */     //   224: getfield $parameters : Ljava/util/List;
/*    */     //   227: aload_0
/*    */     //   228: getfield $resultChannel : Lkotlinx/coroutines/channels/Channel;
/*    */     //   231: aload_0
/*    */     //   232: checkcast kotlin/coroutines/Continuation
/*    */     //   235: aload_0
/*    */     //   236: aconst_null
/*    */     //   237: putfield L$0 : Ljava/lang/Object;
/*    */     //   240: aload_0
/*    */     //   241: aconst_null
/*    */     //   242: putfield L$1 : Ljava/lang/Object;
/*    */     //   245: aload_0
/*    */     //   246: aconst_null
/*    */     //   247: putfield L$2 : Ljava/lang/Object;
/*    */     //   250: aload_0
/*    */     //   251: iconst_2
/*    */     //   252: putfield label : I
/*    */     //   255: invokestatic access$getResult : (Lai/grazie/utils/SuspendableBatchProcessor;Ljava/util/List;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   258: dup
/*    */     //   259: aload #10
/*    */     //   261: if_acmpne -> 272
/*    */     //   264: aload #10
/*    */     //   266: areturn
/*    */     //   267: aload_1
/*    */     //   268: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   271: aload_1
/*    */     //   272: areturn
/*    */     //   273: new java/lang/IllegalStateException
/*    */     //   276: dup
/*    */     //   277: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   279: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   282: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #53	-> 3
/*    */     //   #54	-> 48
/*    */     //   #114	-> 62
/*    */     //   #115	-> 68
/*    */     //   #118	-> 69
/*    */     //   #53	-> 108
/*    */     //   #119	-> 147
/*    */     //   #120	-> 149
/*    */     //   #55	-> 152
/*    */     //   #56	-> 160
/*    */     //   #57	-> 166
/*    */     //   #61	-> 188
/*    */     //   #120	-> 192
/*    */     //   #122	-> 194
/*    */     //   #123	-> 202
/*    */     //   #122	-> 205
/*    */     //   #119	-> 218
/*    */     //   #62	-> 219
/*    */     //   #53	-> 264
/*    */     //   #62	-> 272
/*    */     //   #53	-> 273
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   48	63	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*    */     //   142	46	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*    */     //   62	49	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   134	55	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   189	13	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   205	14	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   65	46	4	owner$iv	Ljava/lang/Object;
/*    */     //   134	55	4	owner$iv	Ljava/lang/Object;
/*    */     //   189	13	4	owner$iv	Ljava/lang/Object;
/*    */     //   205	14	4	owner$iv	Ljava/lang/Object;
/*    */     //   152	37	7	$i$a$-withLock$default-SuspendableBatchProcessor$processWithBatching$2$1	I
/*    */     //   68	43	6	$i$f$withLock	I
/*    */     //   0	283	0	this	Lai/grazie/utils/SuspendableBatchProcessor$processWithBatching$2;
/*    */     //   40	233	1	$result	Ljava/lang/Object;
/*    */     //   114	105	6	$i$f$withLock	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   148	194	205	finally
/*    */     //   205	207	205	finally
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super SuspendableBatchProcessor$processWithBatching$2> $completion) {
/*    */     SuspendableBatchProcessor$processWithBatching$2 suspendableBatchProcessor$processWithBatching$2 = new SuspendableBatchProcessor$processWithBatching$2(this.$parameters, this.$resultChannel, $completion);
/*    */     suspendableBatchProcessor$processWithBatching$2.L$0 = value;
/*    */     return (Continuation<Unit>)suspendableBatchProcessor$processWithBatching$2;
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((SuspendableBatchProcessor$processWithBatching$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SuspendableBatchProcessor$processWithBatching$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */