package com.intellij.ml.llm.matterhorn.activation.state.junie;

import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieApiUrl;
import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
import com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityCallable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "grazieCloudUrlStep.kt", l = {52, 58}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieCloudUrlStepKt$grazieCloudUrlStep$2$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class GrazieCloudUrlStepKt$grazieCloudUrlStep$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  GrazieCloudUrlStepKt$grazieCloudUrlStep$2$1(ActivityCallable<GrazieResult<GrazieApiUrl>, GrazieResult.GrazieFailure, GrazieApiUrl> $resolveUrlCallable, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 145, 0 -> 36, 1 -> 71, 2 -> 136
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: nop
    //   41: aload_0
    //   42: getfield $resolveUrlCallable : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;
    //   45: invokeinterface invoke : ()Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;
    //   50: aload_0
    //   51: checkcast kotlin/coroutines/Continuation
    //   54: aload_0
    //   55: iconst_1
    //   56: putfield label : I
    //   59: invokevirtual awaitOpResult : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   62: dup
    //   63: aload #5
    //   65: if_acmpne -> 76
    //   68: aload #5
    //   70: areturn
    //   71: aload_1
    //   72: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   75: aload_1
    //   76: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult
    //   79: astore_2
    //   80: aload_2
    //   81: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded
    //   84: ifeq -> 101
    //   87: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
    //   90: pop
    //   91: iconst_2
    //   92: getstatic kotlin/time/DurationUnit.HOURS : Lkotlin/time/DurationUnit;
    //   95: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
    //   98: goto -> 113
    //   101: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
    //   104: pop
    //   105: bipush #10
    //   107: getstatic kotlin/time/DurationUnit.SECONDS : Lkotlin/time/DurationUnit;
    //   110: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
    //   113: lstore_3
    //   114: lload_3
    //   115: aload_0
    //   116: checkcast kotlin/coroutines/Continuation
    //   119: aload_0
    //   120: iconst_2
    //   121: putfield label : I
    //   124: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   127: dup
    //   128: aload #5
    //   130: if_acmpne -> 141
    //   133: aload #5
    //   135: areturn
    //   136: aload_1
    //   137: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   140: aload_1
    //   141: pop
    //   142: goto -> 40
    //   145: new java/lang/IllegalStateException
    //   148: dup
    //   149: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   151: invokespecial <init> : (Ljava/lang/String;)V
    //   154: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #50	-> 3
    //   #51	-> 40
    //   #52	-> 41
    //   #50	-> 68
    //   #54	-> 80
    //   #55	-> 81
    //   #56	-> 101
    //   #54	-> 113
    //   #58	-> 114
    //   #50	-> 133
    //   #58	-> 141
    //   #50	-> 145
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   80	1	2	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
    //   114	13	3	delayUntilUpdate	J
    //   0	155	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieCloudUrlStepKt$grazieCloudUrlStep$2$1;
    //   40	105	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super GrazieCloudUrlStepKt$grazieCloudUrlStep$2$1> $completion) {
    return (Continuation<Unit>)new GrazieCloudUrlStepKt$grazieCloudUrlStep$2$1(this.$resolveUrlCallable, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((GrazieCloudUrlStepKt$grazieCloudUrlStep$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\GrazieCloudUrlStepKt$grazieCloudUrlStep$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */