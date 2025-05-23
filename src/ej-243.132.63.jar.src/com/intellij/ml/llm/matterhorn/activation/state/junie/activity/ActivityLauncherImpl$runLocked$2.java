/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Result;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.InlineMarker;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ @DebugMetadata(f = "ActivityLauncher.kt", l = {59}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityLauncherImpl$runLocked$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Ret", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ public final class ActivityLauncherImpl$runLocked$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Ret>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   public ActivityLauncherImpl$runLocked$2(ActivityLauncherImpl<Ret, Err, Val> $receiver, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore #8
/*    */     //   5: aload_0
/*    */     //   6: getfield label : I
/*    */     //   9: tableswitch default -> 211, 0 -> 32, 1 -> 82
/*    */     //   32: aload_1
/*    */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   36: aload_0
/*    */     //   37: getfield L$0 : Ljava/lang/Object;
/*    */     //   40: checkcast kotlinx/coroutines/CoroutineScope
/*    */     //   43: astore_2
/*    */     //   44: aload_2
/*    */     //   45: astore_3
/*    */     //   46: aload_0
/*    */     //   47: getfield $block : Lkotlin/jvm/functions/Function1;
/*    */     //   50: astore #4
/*    */     //   52: nop
/*    */     //   53: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   56: pop
/*    */     //   57: iconst_0
/*    */     //   58: istore #6
/*    */     //   60: aload #4
/*    */     //   62: aload_0
/*    */     //   63: aload_0
/*    */     //   64: iconst_1
/*    */     //   65: putfield label : I
/*    */     //   68: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   73: dup
/*    */     //   74: aload #8
/*    */     //   76: if_acmpne -> 91
/*    */     //   79: aload #8
/*    */     //   81: areturn
/*    */     //   82: iconst_0
/*    */     //   83: istore #6
/*    */     //   85: nop
/*    */     //   86: aload_1
/*    */     //   87: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   90: aload_1
/*    */     //   91: nop
/*    */     //   92: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   95: astore #5
/*    */     //   97: goto -> 116
/*    */     //   100: astore #6
/*    */     //   102: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   105: pop
/*    */     //   106: aload #6
/*    */     //   108: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*    */     //   111: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   114: astore #5
/*    */     //   116: aload #5
/*    */     //   118: astore_3
/*    */     //   119: aload_0
/*    */     //   120: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl;
/*    */     //   123: astore #4
/*    */     //   125: aload_3
/*    */     //   126: astore #5
/*    */     //   128: iconst_0
/*    */     //   129: istore #6
/*    */     //   131: aload #5
/*    */     //   133: aload #4
/*    */     //   135: invokestatic access$getResultMapper$p : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl;)Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;
/*    */     //   138: invokestatic toOpResult : (Ljava/lang/Object;Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
/*    */     //   141: astore #7
/*    */     //   143: aload #7
/*    */     //   145: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpCancellation
/*    */     //   148: ifne -> 161
/*    */     //   151: aload #4
/*    */     //   153: aload #7
/*    */     //   155: invokestatic access$setLatestOpResult : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl;Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;)V
/*    */     //   158: goto -> 180
/*    */     //   161: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   164: aload #7
/*    */     //   166: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpCancellation
/*    */     //   169: invokevirtual getCause : ()Ljava/lang/Throwable;
/*    */     //   172: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Throwable;)Ljava/lang/String;
/*    */     //   177: invokevirtual trace : (Ljava/lang/String;)V
/*    */     //   180: aload #7
/*    */     //   182: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpUnhandledException
/*    */     //   185: ifeq -> 202
/*    */     //   188: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   191: aload #7
/*    */     //   193: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpUnhandledException
/*    */     //   196: invokevirtual getCause : ()Ljava/lang/Throwable;
/*    */     //   199: invokevirtual error : (Ljava/lang/Throwable;)V
/*    */     //   202: nop
/*    */     //   203: aload_3
/*    */     //   204: astore_3
/*    */     //   205: aload_3
/*    */     //   206: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   209: aload_3
/*    */     //   210: areturn
/*    */     //   211: new java/lang/IllegalStateException
/*    */     //   214: dup
/*    */     //   215: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   217: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   220: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #57	-> 3
/*    */     //   #58	-> 44
/*    */     //   #59	-> 60
/*    */     //   #57	-> 79
/*    */     //   #59	-> 91
/*    */     //   #58	-> 92
/*    */     //   #60	-> 119
/*    */     //   #61	-> 131
/*    */     //   #62	-> 143
/*    */     //   #63	-> 151
/*    */     //   #66	-> 161
/*    */     //   #68	-> 180
/*    */     //   #71	-> 188
/*    */     //   #73	-> 202
/*    */     //   #60	-> 203
/*    */     //   #73	-> 205
/*    */     //   #73	-> 210
/*    */     //   #57	-> 211
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   44	8	2	$this$withPermit	Lkotlinx/coroutines/CoroutineScope;
/*    */     //   128	15	5	result	Ljava/lang/Object;
/*    */     //   143	59	7	opResult	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
/*    */     //   60	22	6	$i$a$-runCatching-ActivityLauncherImpl$runLocked$2$1	I
/*    */     //   131	72	6	$i$a$-also-ActivityLauncherImpl$runLocked$2$2	I
/*    */     //   0	221	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl$runLocked$2;
/*    */     //   36	175	1	$result	Ljava/lang/Object;
/*    */     //   85	7	6	$i$a$-runCatching-ActivityLauncherImpl$runLocked$2$1	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   52	73	100	java/lang/Throwable
/*    */     //   85	97	100	java/lang/Throwable
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend$$forInline(Object $result) {
/*    */     Object object;
/* 58 */     CoroutineScope $this$withPermit = (CoroutineScope)this.L$0, coroutineScope1 = $this$withPermit; Function1<Continuation<? super Ret>, Object> function1 = this.$block; try { object = coroutineScope1; int $i$a$-runCatching-ActivityLauncherImpl$runLocked$2$1 = 0;
/* 59 */       InlineMarker.mark(3); }
/*    */     catch (Throwable throwable)
/*    */     { object = Result.constructor-impl(ResultKt.createFailure(throwable)); }
/*    */   
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super ActivityLauncherImpl$runLocked$2> $completion) {
/*    */     ActivityLauncherImpl$runLocked$2 activityLauncherImpl$runLocked$2 = new ActivityLauncherImpl$runLocked$2(ActivityLauncherImpl.this, $completion);
/*    */     activityLauncherImpl$runLocked$2.L$0 = value;
/*    */     return (Continuation<Unit>)activityLauncherImpl$runLocked$2;
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((ActivityLauncherImpl$runLocked$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\ActivityLauncherImpl$runLocked$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */