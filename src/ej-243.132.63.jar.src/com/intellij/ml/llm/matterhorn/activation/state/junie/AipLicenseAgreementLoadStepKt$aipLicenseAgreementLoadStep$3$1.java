package com.intellij.ml.llm.matterhorn.activation.state.junie;

import com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityCallable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "aipLicenseAgreementLoadStep.kt", l = {48, 50, 55}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1(ActivityCallable $loadCallable, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 185, 0 -> 40, 1 -> 76, 2 -> 112, 3 -> 176
    //   40: aload_1
    //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   44: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
    //   47: pop
    //   48: iconst_1
    //   49: getstatic kotlin/time/DurationUnit.MINUTES : Lkotlin/time/DurationUnit;
    //   52: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
    //   55: aload_0
    //   56: checkcast kotlin/coroutines/Continuation
    //   59: aload_0
    //   60: iconst_1
    //   61: putfield label : I
    //   64: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   67: dup
    //   68: aload #5
    //   70: if_acmpne -> 81
    //   73: aload #5
    //   75: areturn
    //   76: aload_1
    //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   80: aload_1
    //   81: pop
    //   82: aload_0
    //   83: getfield $loadCallable : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;
    //   86: invokeinterface invoke : ()Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;
    //   91: aload_0
    //   92: checkcast kotlin/coroutines/Continuation
    //   95: aload_0
    //   96: iconst_2
    //   97: putfield label : I
    //   100: invokevirtual awaitOpResult : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   103: dup
    //   104: aload #5
    //   106: if_acmpne -> 117
    //   109: aload #5
    //   111: areturn
    //   112: aload_1
    //   113: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   116: aload_1
    //   117: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult
    //   120: astore_2
    //   121: aload_2
    //   122: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded
    //   125: ifeq -> 142
    //   128: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
    //   131: pop
    //   132: iconst_1
    //   133: getstatic kotlin/time/DurationUnit.DAYS : Lkotlin/time/DurationUnit;
    //   136: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
    //   139: goto -> 153
    //   142: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
    //   145: pop
    //   146: iconst_1
    //   147: getstatic kotlin/time/DurationUnit.HOURS : Lkotlin/time/DurationUnit;
    //   150: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
    //   153: lstore_3
    //   154: lload_3
    //   155: aload_0
    //   156: checkcast kotlin/coroutines/Continuation
    //   159: aload_0
    //   160: iconst_3
    //   161: putfield label : I
    //   164: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   167: dup
    //   168: aload #5
    //   170: if_acmpne -> 181
    //   173: aload #5
    //   175: areturn
    //   176: aload_1
    //   177: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   180: aload_1
    //   181: pop
    //   182: goto -> 82
    //   185: new java/lang/IllegalStateException
    //   188: dup
    //   189: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   191: invokespecial <init> : (Ljava/lang/String;)V
    //   194: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #47	-> 3
    //   #48	-> 44
    //   #48	-> 59
    //   #47	-> 73
    //   #49	-> 81
    //   #50	-> 82
    //   #47	-> 109
    //   #51	-> 121
    //   #52	-> 122
    //   #53	-> 142
    //   #51	-> 153
    //   #55	-> 154
    //   #47	-> 173
    //   #55	-> 181
    //   #47	-> 185
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   121	1	2	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
    //   154	13	3	delayUntilUpdate	J
    //   0	195	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1;
    //   44	141	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1> $completion) {
    return (Continuation<Unit>)new AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1(this.$loadCallable, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */