/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;
/*    */ import kotlin.Result;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\b\001\030\000*\004\b\000\020\001*\006\b\001\020\002 \001*\006\b\002\020\003 \0012\b\022\004\022\002H\0020\004B/\022\f\020\005\032\b\022\004\022\0028\0000\006\022\030\020\007\032\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0028\0020\b¢\006\004\b\t\020\nJ\032\020\013\032\016\022\004\022\0028\001\022\004\022\0028\0020\fH@¢\006\002\020\rJ\026\020\016\032\b\022\004\022\0028\0000\017H@¢\006\004\b\020\020\rJ\b\020\021\032\0020\022H\026R\024\020\005\032\b\022\004\022\0028\0000\006X\004¢\006\002\n\000R \020\007\032\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0028\0020\bX\004¢\006\002\n\000¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;", "Ret", "Err", "Val", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;", "deferred", "Lkotlinx/coroutines/Deferred;", "resultMapper", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;", "<init>", "(Lkotlinx/coroutines/Deferred;Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;)V", "awaitOpResult", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitCatching", "Lkotlin/Result;", "awaitCatching-IoAF18A", "cancel", "", "state.junie.impl"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class ActivityHandle<Ret, Err, Val> implements OpHandle<Err> {
/*    */   public ActivityHandle(@NotNull Deferred<Ret> deferred, @NotNull OpResultMapper<Ret, Err, Val> resultMapper) {
/* 11 */     this.deferred = deferred;
/* 12 */     this.resultMapper = resultMapper;
/*    */   }
/*    */   @NotNull
/*    */   private final Deferred<Ret> deferred; @NotNull
/*    */   private final OpResultMapper<Ret, Err, Val> resultMapper; public static final int $stable = 8;
/*    */   
/*    */   @Nullable
/*    */   public Object awaitOpResult(@NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle$awaitOpResult$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle$awaitOpResult$1
/*    */     //   11: astore #4
/*    */     //   13: aload #4
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #4
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle$awaitOpResult$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #5
/*    */     //   61: aload #4
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 149, 0 -> 88, 1 -> 119
/*    */     //   88: aload_3
/*    */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   92: aload_0
/*    */     //   93: aload #4
/*    */     //   95: aload #4
/*    */     //   97: aload_0
/*    */     //   98: putfield L$0 : Ljava/lang/Object;
/*    */     //   101: aload #4
/*    */     //   103: iconst_1
/*    */     //   104: putfield label : I
/*    */     //   107: invokevirtual awaitCatching-IoAF18A : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   110: dup
/*    */     //   111: aload #5
/*    */     //   113: if_acmpne -> 139
/*    */     //   116: aload #5
/*    */     //   118: areturn
/*    */     //   119: aload #4
/*    */     //   121: getfield L$0 : Ljava/lang/Object;
/*    */     //   124: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle
/*    */     //   127: astore_0
/*    */     //   128: aload_3
/*    */     //   129: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   132: aload_3
/*    */     //   133: checkcast kotlin/Result
/*    */     //   136: invokevirtual unbox-impl : ()Ljava/lang/Object;
/*    */     //   139: astore_2
/*    */     //   140: aload_2
/*    */     //   141: aload_0
/*    */     //   142: getfield resultMapper : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;
/*    */     //   145: invokestatic toOpResult : (Ljava/lang/Object;Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
/*    */     //   148: areturn
/*    */     //   149: new java/lang/IllegalStateException
/*    */     //   152: dup
/*    */     //   153: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   155: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   158: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 59
/*    */     //   #16	-> 92
/*    */     //   #15	-> 116
/*    */     //   #16	-> 139
/*    */     //   #17	-> 140
/*    */     //   #15	-> 149
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	27	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;
/*    */     //   128	21	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;
/*    */     //   140	9	2	result	Ljava/lang/Object;
/*    */     //   0	159	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	99	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	93	3	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object awaitCatching-IoAF18A(@NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle$awaitCatching$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle$awaitCatching$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle$awaitCatching$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 192, 0 -> 88, 1 -> 134
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: astore_2
/*    */     //   95: nop
/*    */     //   96: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   99: pop
/*    */     //   100: aload_2
/*    */     //   101: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle
/*    */     //   104: astore_3
/*    */     //   105: iconst_0
/*    */     //   106: istore #4
/*    */     //   108: aload_3
/*    */     //   109: getfield deferred : Lkotlinx/coroutines/Deferred;
/*    */     //   112: aload #7
/*    */     //   114: aload #7
/*    */     //   116: iconst_1
/*    */     //   117: putfield label : I
/*    */     //   120: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   125: dup
/*    */     //   126: aload #8
/*    */     //   128: if_acmpne -> 145
/*    */     //   131: aload #8
/*    */     //   133: areturn
/*    */     //   134: iconst_0
/*    */     //   135: istore #4
/*    */     //   137: nop
/*    */     //   138: aload #6
/*    */     //   140: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   143: aload #6
/*    */     //   145: nop
/*    */     //   146: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   149: astore_3
/*    */     //   150: goto -> 168
/*    */     //   153: astore #4
/*    */     //   155: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   158: pop
/*    */     //   159: aload #4
/*    */     //   161: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*    */     //   164: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   167: astore_3
/*    */     //   168: aload_3
/*    */     //   169: astore_2
/*    */     //   170: aload_2
/*    */     //   171: invokestatic exceptionOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Throwable;
/*    */     //   174: dup
/*    */     //   175: ifnull -> 189
/*    */     //   178: astore_3
/*    */     //   179: iconst_0
/*    */     //   180: istore #5
/*    */     //   182: invokestatic ensureActive : ()V
/*    */     //   185: nop
/*    */     //   186: goto -> 190
/*    */     //   189: pop
/*    */     //   190: aload_2
/*    */     //   191: areturn
/*    */     //   192: new java/lang/IllegalStateException
/*    */     //   195: dup
/*    */     //   196: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   198: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   201: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 60
/*    */     //   #21	-> 93
/*    */     //   #22	-> 108
/*    */     //   #20	-> 131
/*    */     //   #22	-> 145
/*    */     //   #21	-> 146
/*    */     //   #23	-> 170
/*    */     //   #24	-> 182
/*    */     //   #25	-> 185
/*    */     //   #23	-> 186
/*    */     //   #21	-> 191
/*    */     //   #20	-> 192
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	2	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;
/*    */     //   105	20	3	$this$awaitCatching_IoAF18A_u24lambda_u240	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;
/*    */     //   108	26	4	$i$a$-runCatching-ActivityHandle$awaitCatching$2	I
/*    */     //   182	4	5	$i$a$-onFailure-ActivityHandle$awaitCatching$3	I
/*    */     //   0	202	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	142	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	135	6	$result	Ljava/lang/Object;
/*    */     //   137	9	4	$i$a$-runCatching-ActivityHandle$awaitCatching$2	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   95	125	153	java/lang/Throwable
/*    */     //   137	150	153	java/lang/Throwable
/*    */   }
/*    */   
/*    */   public void cancel() {
/* 29 */     this.deferred.cancel(new CancellationException("Cancelled through OpHandle.cancel()"));
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ActivityHandle.kt", l = {22}, i = {}, s = {}, n = {}, m = "awaitCatching-IoAF18A", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityHandle")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class ActivityHandle$awaitCatching$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     ActivityHandle$awaitCatching$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return (ActivityHandle.this.awaitCatching-IoAF18A((Continuation<? super Result<? extends Ret>>)this) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? ActivityHandle.this.awaitCatching-IoAF18A((Continuation<? super Result<? extends Ret>>)this) : Result.box-impl(ActivityHandle.this.awaitCatching-IoAF18A((Continuation<? super Result<? extends Ret>>)this));
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ActivityHandle.kt", l = {16}, i = {0}, s = {"L$0"}, n = {"this"}, m = "awaitOpResult", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityHandle")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class ActivityHandle$awaitOpResult$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     ActivityHandle$awaitOpResult$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return ActivityHandle.this.awaitOpResult((Continuation<? super OpResult<? extends Err, ? extends Val>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\ActivityHandle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */