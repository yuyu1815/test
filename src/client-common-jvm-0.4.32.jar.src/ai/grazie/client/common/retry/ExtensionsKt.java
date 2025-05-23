/*    */ package ai.grazie.client.common.retry;
/*    */ import ai.grazie.utils.mpp.MPPLogger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\0008\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\020\003\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\006\032{\020\002\032\002H\003\"\004\b\000\020\004\"\004\b\001\020\003*\002H\0042\b\b\002\020\005\032\0020\0012\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\024\b\002\020\n\032\016\022\004\022\0020\f\022\004\022\0020\r0\0132'\020\016\032#\b\001\022\004\022\002H\004\022\n\022\b\022\004\022\002H\0030\020\022\006\022\004\030\0010\0210\017¢\006\002\b\022H@¢\006\002\020\023\032u\020\024\032\002H\003\"\004\b\000\020\004\"\004\b\001\020\003*\002H\0042\006\020\025\032\0020\t2\006\020\026\032\0020\0072\022\020\n\032\016\022\004\022\0020\f\022\004\022\0020\r0\0132\b\b\002\020\005\032\0020\0012'\020\016\032#\b\001\022\004\022\002H\004\022\n\022\b\022\004\022\002H\0030\020\022\006\022\004\030\0010\0210\017¢\006\002\b\022H@¢\006\002\020\027\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\030"}, d2 = {"retryLogger", "Lai/grazie/utils/mpp/MPPLogger;", "withHttpBackoff", "T", "Client", "logger", "retryStrategy", "Lai/grazie/client/common/retry/ClientRetryStrategy;", "retryCount", "", "retryOn", "Lkotlin/Function1;", "", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lai/grazie/utils/mpp/MPPLogger;Lai/grazie/client/common/retry/ClientRetryStrategy;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withRetry", "total", "strategy", "(Ljava/lang/Object;ILai/grazie/client/common/retry/ClientRetryStrategy;Lkotlin/jvm/functions/Function1;Lai/grazie/utils/mpp/MPPLogger;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */ public final class ExtensionsKt {
/*    */   @NotNull
/* 12 */   private static final MPPLogger retryLogger = LoggerFactory.INSTANCE.create("ai.grazie.client.common.retry");
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static final <Client, T> Object withRetry(Object $this$withRetry, int total, @NotNull ClientRetryStrategy strategy, @NotNull Function1 retryOn, @NotNull MPPLogger logger, @NotNull Function2 block, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #6
/*    */     //   2: instanceof ai/grazie/client/common/retry/ExtensionsKt$withRetry$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #6
/*    */     //   10: checkcast ai/grazie/client/common/retry/ExtensionsKt$withRetry$1
/*    */     //   13: astore #11
/*    */     //   15: aload #11
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #11
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 52
/*    */     //   41: new ai/grazie/client/common/retry/ExtensionsKt$withRetry$1
/*    */     //   44: dup
/*    */     //   45: aload #6
/*    */     //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   50: astore #11
/*    */     //   52: aload #11
/*    */     //   54: getfield result : Ljava/lang/Object;
/*    */     //   57: astore #10
/*    */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   62: astore #12
/*    */     //   64: aload #11
/*    */     //   66: getfield label : I
/*    */     //   69: tableswitch default -> 476, 0 -> 96, 1 -> 182, 2 -> 402
/*    */     //   96: aload #10
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: new kotlin/jvm/internal/Ref$IntRef
/*    */     //   104: dup
/*    */     //   105: invokespecial <init> : ()V
/*    */     //   108: astore #7
/*    */     //   110: nop
/*    */     //   111: nop
/*    */     //   112: aload #5
/*    */     //   114: aload_0
/*    */     //   115: aload #11
/*    */     //   117: aload #11
/*    */     //   119: aload_0
/*    */     //   120: putfield L$0 : Ljava/lang/Object;
/*    */     //   123: aload #11
/*    */     //   125: aload_2
/*    */     //   126: putfield L$1 : Ljava/lang/Object;
/*    */     //   129: aload #11
/*    */     //   131: aload_3
/*    */     //   132: putfield L$2 : Ljava/lang/Object;
/*    */     //   135: aload #11
/*    */     //   137: aload #4
/*    */     //   139: putfield L$3 : Ljava/lang/Object;
/*    */     //   142: aload #11
/*    */     //   144: aload #5
/*    */     //   146: putfield L$4 : Ljava/lang/Object;
/*    */     //   149: aload #11
/*    */     //   151: aload #7
/*    */     //   153: putfield L$5 : Ljava/lang/Object;
/*    */     //   156: aload #11
/*    */     //   158: iload_1
/*    */     //   159: putfield I$0 : I
/*    */     //   162: aload #11
/*    */     //   164: iconst_1
/*    */     //   165: putfield label : I
/*    */     //   168: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   173: dup
/*    */     //   174: aload #12
/*    */     //   176: if_acmpne -> 250
/*    */     //   179: aload #12
/*    */     //   181: areturn
/*    */     //   182: aload #11
/*    */     //   184: getfield I$0 : I
/*    */     //   187: istore_1
/*    */     //   188: aload #11
/*    */     //   190: getfield L$5 : Ljava/lang/Object;
/*    */     //   193: checkcast kotlin/jvm/internal/Ref$IntRef
/*    */     //   196: astore #7
/*    */     //   198: aload #11
/*    */     //   200: getfield L$4 : Ljava/lang/Object;
/*    */     //   203: checkcast kotlin/jvm/functions/Function2
/*    */     //   206: astore #5
/*    */     //   208: aload #11
/*    */     //   210: getfield L$3 : Ljava/lang/Object;
/*    */     //   213: checkcast ai/grazie/utils/mpp/MPPLogger
/*    */     //   216: astore #4
/*    */     //   218: aload #11
/*    */     //   220: getfield L$2 : Ljava/lang/Object;
/*    */     //   223: checkcast kotlin/jvm/functions/Function1
/*    */     //   226: astore_3
/*    */     //   227: aload #11
/*    */     //   229: getfield L$1 : Ljava/lang/Object;
/*    */     //   232: checkcast ai/grazie/client/common/retry/ClientRetryStrategy
/*    */     //   235: astore_2
/*    */     //   236: aload #11
/*    */     //   238: getfield L$0 : Ljava/lang/Object;
/*    */     //   241: astore_0
/*    */     //   242: nop
/*    */     //   243: aload #10
/*    */     //   245: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   248: aload #10
/*    */     //   250: areturn
/*    */     //   251: astore #8
/*    */     //   253: aload #8
/*    */     //   255: athrow
/*    */     //   256: astore #8
/*    */     //   258: aload_3
/*    */     //   259: aload #8
/*    */     //   261: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   266: checkcast java/lang/Boolean
/*    */     //   269: invokevirtual booleanValue : ()Z
/*    */     //   272: ifeq -> 473
/*    */     //   275: aload #7
/*    */     //   277: aload #7
/*    */     //   279: getfield element : I
/*    */     //   282: iconst_1
/*    */     //   283: iadd
/*    */     //   284: putfield element : I
/*    */     //   287: aload #7
/*    */     //   289: getfield element : I
/*    */     //   292: iload_1
/*    */     //   293: if_icmpge -> 473
/*    */     //   296: aload #4
/*    */     //   298: aload #8
/*    */     //   300: new ai/grazie/client/common/retry/ExtensionsKt$withRetry$2
/*    */     //   303: dup
/*    */     //   304: aload #7
/*    */     //   306: invokespecial <init> : (Lkotlin/jvm/internal/Ref$IntRef;)V
/*    */     //   309: checkcast kotlin/jvm/functions/Function0
/*    */     //   312: invokeinterface warning : (Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V
/*    */     //   317: aload_2
/*    */     //   318: aload #7
/*    */     //   320: getfield element : I
/*    */     //   323: aload #8
/*    */     //   325: invokeinterface getDelay : (ILjava/lang/Throwable;)Lai/grazie/utils/mpp/time/Duration;
/*    */     //   330: astore #9
/*    */     //   332: aload #9
/*    */     //   334: invokevirtual getMillis : ()J
/*    */     //   337: aload #11
/*    */     //   339: aload #11
/*    */     //   341: aload_0
/*    */     //   342: putfield L$0 : Ljava/lang/Object;
/*    */     //   345: aload #11
/*    */     //   347: aload_2
/*    */     //   348: putfield L$1 : Ljava/lang/Object;
/*    */     //   351: aload #11
/*    */     //   353: aload_3
/*    */     //   354: putfield L$2 : Ljava/lang/Object;
/*    */     //   357: aload #11
/*    */     //   359: aload #4
/*    */     //   361: putfield L$3 : Ljava/lang/Object;
/*    */     //   364: aload #11
/*    */     //   366: aload #5
/*    */     //   368: putfield L$4 : Ljava/lang/Object;
/*    */     //   371: aload #11
/*    */     //   373: aload #7
/*    */     //   375: putfield L$5 : Ljava/lang/Object;
/*    */     //   378: aload #11
/*    */     //   380: iload_1
/*    */     //   381: putfield I$0 : I
/*    */     //   384: aload #11
/*    */     //   386: iconst_2
/*    */     //   387: putfield label : I
/*    */     //   390: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   393: dup
/*    */     //   394: aload #12
/*    */     //   396: if_acmpne -> 469
/*    */     //   399: aload #12
/*    */     //   401: areturn
/*    */     //   402: aload #11
/*    */     //   404: getfield I$0 : I
/*    */     //   407: istore_1
/*    */     //   408: aload #11
/*    */     //   410: getfield L$5 : Ljava/lang/Object;
/*    */     //   413: checkcast kotlin/jvm/internal/Ref$IntRef
/*    */     //   416: astore #7
/*    */     //   418: aload #11
/*    */     //   420: getfield L$4 : Ljava/lang/Object;
/*    */     //   423: checkcast kotlin/jvm/functions/Function2
/*    */     //   426: astore #5
/*    */     //   428: aload #11
/*    */     //   430: getfield L$3 : Ljava/lang/Object;
/*    */     //   433: checkcast ai/grazie/utils/mpp/MPPLogger
/*    */     //   436: astore #4
/*    */     //   438: aload #11
/*    */     //   440: getfield L$2 : Ljava/lang/Object;
/*    */     //   443: checkcast kotlin/jvm/functions/Function1
/*    */     //   446: astore_3
/*    */     //   447: aload #11
/*    */     //   449: getfield L$1 : Ljava/lang/Object;
/*    */     //   452: checkcast ai/grazie/client/common/retry/ClientRetryStrategy
/*    */     //   455: astore_2
/*    */     //   456: aload #11
/*    */     //   458: getfield L$0 : Ljava/lang/Object;
/*    */     //   461: astore_0
/*    */     //   462: aload #10
/*    */     //   464: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   467: aload #10
/*    */     //   469: pop
/*    */     //   470: goto -> 110
/*    */     //   473: aload #8
/*    */     //   475: athrow
/*    */     //   476: new java/lang/IllegalStateException
/*    */     //   479: dup
/*    */     //   480: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   482: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   485: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 62
/*    */     //   #29	-> 101
/*    */     //   #30	-> 110
/*    */     //   #31	-> 111
/*    */     //   #32	-> 112
/*    */     //   #22	-> 179
/*    */     //   #33	-> 250
/*    */     //   #34	-> 253
/*    */     //   #35	-> 256
/*    */     //   #36	-> 258
/*    */     //   #37	-> 296
/*    */     //   #38	-> 317
/*    */     //   #39	-> 332
/*    */     //   #22	-> 399
/*    */     //   #40	-> 469
/*    */     //   #42	-> 473
/*    */     //   #22	-> 476
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	81	0	$this$withRetry	Ljava/lang/Object;
/*    */     //   242	9	0	$this$withRetry	Ljava/lang/Object;
/*    */     //   256	146	0	$this$withRetry	Ljava/lang/Object;
/*    */     //   462	11	0	$this$withRetry	Ljava/lang/Object;
/*    */     //   101	81	1	total	I
/*    */     //   188	63	1	total	I
/*    */     //   256	146	1	total	I
/*    */     //   408	65	1	total	I
/*    */     //   101	81	2	strategy	Lai/grazie/client/common/retry/ClientRetryStrategy;
/*    */     //   236	15	2	strategy	Lai/grazie/client/common/retry/ClientRetryStrategy;
/*    */     //   256	146	2	strategy	Lai/grazie/client/common/retry/ClientRetryStrategy;
/*    */     //   456	17	2	strategy	Lai/grazie/client/common/retry/ClientRetryStrategy;
/*    */     //   101	81	3	retryOn	Lkotlin/jvm/functions/Function1;
/*    */     //   227	24	3	retryOn	Lkotlin/jvm/functions/Function1;
/*    */     //   256	146	3	retryOn	Lkotlin/jvm/functions/Function1;
/*    */     //   447	26	3	retryOn	Lkotlin/jvm/functions/Function1;
/*    */     //   101	81	4	logger	Lai/grazie/utils/mpp/MPPLogger;
/*    */     //   218	33	4	logger	Lai/grazie/utils/mpp/MPPLogger;
/*    */     //   256	146	4	logger	Lai/grazie/utils/mpp/MPPLogger;
/*    */     //   438	35	4	logger	Lai/grazie/utils/mpp/MPPLogger;
/*    */     //   101	81	5	block	Lkotlin/jvm/functions/Function2;
/*    */     //   208	43	5	block	Lkotlin/jvm/functions/Function2;
/*    */     //   256	146	5	block	Lkotlin/jvm/functions/Function2;
/*    */     //   428	45	5	block	Lkotlin/jvm/functions/Function2;
/*    */     //   110	72	7	retry	Lkotlin/jvm/internal/Ref$IntRef;
/*    */     //   198	53	7	retry	Lkotlin/jvm/internal/Ref$IntRef;
/*    */     //   256	146	7	retry	Lkotlin/jvm/internal/Ref$IntRef;
/*    */     //   418	55	7	retry	Lkotlin/jvm/internal/Ref$IntRef;
/*    */     //   253	3	8	ce	Ljava/util/concurrent/CancellationException;
/*    */     //   258	74	8	e	Ljava/lang/Throwable;
/*    */     //   473	3	8	e	Ljava/lang/Throwable;
/*    */     //   332	61	9	delayInterval	Lai/grazie/utils/mpp/time/Duration;
/*    */     //   0	486	6	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   52	424	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   59	417	10	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   111	173	251	java/util/concurrent/CancellationException
/*    */     //   111	173	256	java/lang/Throwable
/*    */     //   242	251	251	java/util/concurrent/CancellationException
/*    */     //   242	251	256	java/lang/Throwable
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\003\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Client", "T", "invoke"})
/*    */   static final class ExtensionsKt$withRetry$2
/*    */     extends Lambda
/*    */     implements Function0<String>
/*    */   {
/*    */     ExtensionsKt$withRetry$2(Ref.IntRef $retry) {
/*    */       super(0);
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public final String invoke() {
/* 37 */       return "Request error occurred. Retry number:" + this.$retry.element + ".";
/*    */     } }
/*    */   @DebugMetadata(f = "Extensions.kt", l = {32, 39}, i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"}, n = {"$this$withRetry", "strategy", "retryOn", "logger", "block", "retry", "total", "$this$withRetry", "strategy", "retryOn", "logger", "block", "retry", "total"}, m = "withRetry", c = "ai.grazie.client.common.retry.ExtensionsKt")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class ExtensionsKt$withRetry$1<Client, T> extends ContinuationImpl {
/*    */     Object L$0; Object L$1; Object L$2; Object L$3; Object L$4; Object L$5; int I$0;
/*    */     int label;
/*    */     
/*    */     ExtensionsKt$withRetry$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return ExtensionsKt.withRetry(null, 0, null, null, null, null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\013\n\002\b\003\n\002\020\003\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\0020\005H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "Client", "T", "it", "", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"})
/*    */   static final class ExtensionsKt$withHttpBackoff$2 extends Lambda implements Function1<Throwable, Boolean> { public static final ExtensionsKt$withHttpBackoff$2 INSTANCE = new ExtensionsKt$withHttpBackoff$2();
/*    */     
/* 60 */     public final Boolean invoke(Throwable it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf((it instanceof HTTPStatusException && (((HTTPStatusException)it).isServerError() || it instanceof HTTPStatusException.TooManyRequests))); } ExtensionsKt$withHttpBackoff$2() {
/*    */       super(1);
/*    */     } } @Nullable
/*    */   public static final <Client, T> Object withHttpBackoff(Object $this$withHttpBackoff, @NotNull MPPLogger logger, @NotNull ClientRetryStrategy retryStrategy, int retryCount, @NotNull Function1<? super Throwable, Boolean> retryOn, @NotNull Function2<? super Object, ? super Continuation<?>, ? extends Object> block, @NotNull Continuation<?> $completion) {
/* 64 */     return withRetry($this$withHttpBackoff, retryCount, retryStrategy, retryOn, logger, block, $completion);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\retry\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */