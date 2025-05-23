package com.intellij.ml.llm.matterhorn.activation.state.junie;

import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicense;
import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseRequestFailure;
import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseResult;
import com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityCallable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "aipLicenseFetchStep.kt", l = {113, 119}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseFetchStepKt$aipLicenseFetchStep$5$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class AipLicenseFetchStepKt$aipLicenseFetchStep$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  AipLicenseFetchStepKt$aipLicenseFetchStep$5$1(ActivityCallable<AipLicenseResult, AipLicenseRequestFailure, List<AipLicense>> $fetchCallable, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 144, 0 -> 36, 1 -> 71, 2 -> 135
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: nop
    //   41: aload_0
    //   42: getfield $fetchCallable : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;
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
    //   91: iconst_1
    //   92: getstatic kotlin/time/DurationUnit.DAYS : Lkotlin/time/DurationUnit;
    //   95: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
    //   98: goto -> 112
    //   101: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
    //   104: pop
    //   105: iconst_2
    //   106: getstatic kotlin/time/DurationUnit.MINUTES : Lkotlin/time/DurationUnit;
    //   109: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
    //   112: lstore_3
    //   113: lload_3
    //   114: aload_0
    //   115: checkcast kotlin/coroutines/Continuation
    //   118: aload_0
    //   119: iconst_2
    //   120: putfield label : I
    //   123: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   126: dup
    //   127: aload #5
    //   129: if_acmpne -> 140
    //   132: aload #5
    //   134: areturn
    //   135: aload_1
    //   136: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   139: aload_1
    //   140: pop
    //   141: goto -> 40
    //   144: new java/lang/IllegalStateException
    //   147: dup
    //   148: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   150: invokespecial <init> : (Ljava/lang/String;)V
    //   153: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #111	-> 3
    //   #112	-> 40
    //   #113	-> 41
    //   #111	-> 68
    //   #115	-> 80
    //   #116	-> 81
    //   #117	-> 101
    //   #115	-> 112
    //   #119	-> 113
    //   #111	-> 132
    //   #119	-> 140
    //   #111	-> 144
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   80	1	2	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
    //   113	13	3	delayUntilUpdate	J
    //   0	154	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$5$1;
    //   40	104	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super AipLicenseFetchStepKt$aipLicenseFetchStep$5$1> $completion) {
    return (Continuation<Unit>)new AipLicenseFetchStepKt$aipLicenseFetchStep$5$1(this.$fetchCallable, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((AipLicenseFetchStepKt$aipLicenseFetchStep$5$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseFetchStepKt$aipLicenseFetchStep$5$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */