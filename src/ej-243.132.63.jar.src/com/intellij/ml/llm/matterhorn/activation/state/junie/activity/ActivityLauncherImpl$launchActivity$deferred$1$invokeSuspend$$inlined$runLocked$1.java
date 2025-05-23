package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "ActivityLauncher.kt", l = {74}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityLauncherImpl$launchActivity$deferred$1$invokeSuspend$$inlined$runLocked$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\002\b\002\n\002\030\002\n\000\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n¨\006\003"}, d2 = {"<anonymous>", "Ret", "Lkotlinx/coroutines/CoroutineScope;", "com/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl$runLocked$2"})
@SourceDebugExtension({"SMAP\nActivityLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityLauncher.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl$runLocked$2\n+ 2 ActivityLauncher.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl$launchActivity$deferred$1\n*L\n1#1,73:1\n50#2:74\n*E\n"})
public final class ActivityLauncherImpl$launchActivity$deferred$1$invokeSuspend$$inlined$runLocked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Ret>, Object> {
  int label;
  
  public ActivityLauncherImpl$launchActivity$deferred$1$invokeSuspend$$inlined$runLocked$1(Continuation $completion, Function1 paramFunction1) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Continuation $completion) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 239, 0 -> 32, 1 -> 100
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield L$0 : Ljava/lang/Object;
    //   40: checkcast kotlinx/coroutines/CoroutineScope
    //   43: astore_3
    //   44: aload_3
    //   45: astore #4
    //   47: nop
    //   48: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
    //   51: pop
    //   52: aload #4
    //   54: astore #5
    //   56: iconst_0
    //   57: istore #6
    //   59: aload_0
    //   60: checkcast kotlin/coroutines/Continuation
    //   63: astore #7
    //   65: iconst_0
    //   66: istore #8
    //   68: aload_0
    //   69: getfield $block$inlined : Lkotlin/jvm/functions/Function1;
    //   72: aload_0
    //   73: aload_0
    //   74: iconst_1
    //   75: putfield label : I
    //   78: bipush #6
    //   80: invokestatic mark : (I)V
    //   83: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   88: bipush #7
    //   90: invokestatic mark : (I)V
    //   93: dup
    //   94: aload_2
    //   95: if_acmpne -> 112
    //   98: aload_2
    //   99: areturn
    //   100: iconst_0
    //   101: istore #6
    //   103: iconst_0
    //   104: istore #8
    //   106: nop
    //   107: aload_1
    //   108: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   111: aload_1
    //   112: nop
    //   113: nop
    //   114: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   117: astore #5
    //   119: goto -> 138
    //   122: astore #6
    //   124: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
    //   127: pop
    //   128: aload #6
    //   130: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
    //   133: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   136: astore #5
    //   138: aload #5
    //   140: astore #4
    //   142: aload_0
    //   143: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl;
    //   146: astore #9
    //   148: aload #4
    //   150: astore #5
    //   152: iconst_0
    //   153: istore #6
    //   155: aload #5
    //   157: aload #9
    //   159: invokestatic access$getResultMapper$p : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl;)Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;
    //   162: invokestatic toOpResult : (Ljava/lang/Object;Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
    //   165: astore #10
    //   167: aload #10
    //   169: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpCancellation
    //   172: ifne -> 185
    //   175: aload #9
    //   177: aload #10
    //   179: invokestatic access$setLatestOpResult : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl;Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;)V
    //   182: goto -> 204
    //   185: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   188: aload #10
    //   190: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpCancellation
    //   193: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   196: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Throwable;)Ljava/lang/String;
    //   201: invokevirtual trace : (Ljava/lang/String;)V
    //   204: aload #10
    //   206: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpUnhandledException
    //   209: ifeq -> 226
    //   212: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   215: aload #10
    //   217: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpUnhandledException
    //   220: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   223: invokevirtual error : (Ljava/lang/Throwable;)V
    //   226: nop
    //   227: aload #4
    //   229: astore #4
    //   231: aload #4
    //   233: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   236: aload #4
    //   238: areturn
    //   239: new java/lang/IllegalStateException
    //   242: dup
    //   243: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   245: invokespecial <init> : (Ljava/lang/String;)V
    //   248: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 3
    //   #58	-> 44
    //   #59	-> 59
    //   #74	-> 68
    //   #0	-> 98
    //   #74	-> 112
    //   #59	-> 113
    //   #58	-> 114
    //   #60	-> 142
    //   #61	-> 155
    //   #62	-> 167
    //   #63	-> 175
    //   #66	-> 185
    //   #68	-> 204
    //   #71	-> 212
    //   #73	-> 226
    //   #60	-> 227
    //   #73	-> 231
    //   #73	-> 238
    //   #0	-> 239
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	3	3	$this$withPermit	Lkotlinx/coroutines/CoroutineScope;
    //   152	15	5	result	Ljava/lang/Object;
    //   167	59	10	opResult	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
    //   68	32	8	$i$a$-runLocked-ActivityLauncherImpl$launchActivity$deferred$1$1	I
    //   0	249	1	$completion	Lkotlin/coroutines/Continuation;
    //   59	41	6	$i$a$-runCatching-ActivityLauncherImpl$runLocked$2$1	I
    //   155	72	6	$i$a$-also-ActivityLauncherImpl$runLocked$2$2	I
    //   0	249	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl$launchActivity$deferred$1$invokeSuspend$$inlined$runLocked$1;
    //   36	203	1	$result	Ljava/lang/Object;
    //   106	7	8	$i$a$-runLocked-ActivityLauncherImpl$launchActivity$deferred$1$1	I
    //   103	11	6	$i$a$-runCatching-ActivityLauncherImpl$runLocked$2$1	I
    // Exception table:
    //   from	to	target	type
    //   47	93	122	java/lang/Throwable
    //   106	119	122	java/lang/Throwable
  }
  
  public final Continuation<Unit> create(Object value, Continuation $completion) {
    ActivityLauncherImpl$launchActivity$deferred$1$invokeSuspend$$inlined$runLocked$1 activityLauncherImpl$launchActivity$deferred$1$invokeSuspend$$inlined$runLocked$1 = new ActivityLauncherImpl$launchActivity$deferred$1$invokeSuspend$$inlined$runLocked$1($completion, this.$block$inlined);
    activityLauncherImpl$launchActivity$deferred$1$invokeSuspend$$inlined$runLocked$1.L$0 = value;
    return (Continuation<Unit>)activityLauncherImpl$launchActivity$deferred$1$invokeSuspend$$inlined$runLocked$1;
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((ActivityLauncherImpl$launchActivity$deferred$1$invokeSuspend$$inlined$runLocked$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\ActivityLauncherImpl$launchActivity$deferred$1$invokeSuspend$$inlined$runLocked$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */