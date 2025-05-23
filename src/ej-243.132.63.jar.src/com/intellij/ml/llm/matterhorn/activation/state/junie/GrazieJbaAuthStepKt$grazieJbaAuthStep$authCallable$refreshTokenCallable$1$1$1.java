package com.intellij.ml.llm.matterhorn.activation.state.junie;

import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthData;
import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "grazieJbaAuthStep.kt", l = {79, 80}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\ngrazieJbaAuthStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 grazieJbaAuthStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1$1\n+ 2 GrazieResultMapper.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieResultMapperKt\n*L\n1#1,189:1\n37#2,3:190\n*S KotlinDebug\n*F\n+ 1 grazieJbaAuthStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1$1\n*L\n80#1:190,3\n*E\n"})
final class null extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GrazieResult<? extends GrazieAuthData>>, Object> {
  Object L$0;
  
  int label;
  
  null(String $apiUrl, GrazieAuthData $authData, Function1<Continuation<? super Unit>, Object> $onAuthRejected, Function1<Continuation<? super Unit>, Object> $onLicenseRejected, Function1<Continuation<? super Unit>, Object> $onAgreementRequired, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #12
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 189, 0 -> 36, 1 -> 69, 2 -> 160
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield $apiUrl : Ljava/lang/String;
    //   44: aload_0
    //   45: getfield $authData : Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
    //   48: aload_0
    //   49: checkcast kotlin/coroutines/Continuation
    //   52: aload_0
    //   53: iconst_1
    //   54: putfield label : I
    //   57: invokestatic access$refreshToken-1CSWKTE : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   60: dup
    //   61: aload #12
    //   63: if_acmpne -> 74
    //   66: aload #12
    //   68: areturn
    //   69: aload_1
    //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   73: aload_1
    //   74: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
    //   77: astore_2
    //   78: aload_0
    //   79: getfield $onAuthRejected : Lkotlin/jvm/functions/Function1;
    //   82: astore_3
    //   83: aload_0
    //   84: getfield $onLicenseRejected : Lkotlin/jvm/functions/Function1;
    //   87: astore #4
    //   89: aload_0
    //   90: getfield $onAgreementRequired : Lkotlin/jvm/functions/Function1;
    //   93: astore #5
    //   95: iconst_0
    //   96: istore #6
    //   98: aload_2
    //   99: astore #7
    //   101: aload #7
    //   103: astore #8
    //   105: iconst_0
    //   106: istore #9
    //   108: aload #8
    //   110: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
    //   113: ifeq -> 184
    //   116: aload #8
    //   118: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
    //   121: astore #10
    //   123: iconst_0
    //   124: istore #11
    //   126: aload_3
    //   127: aload #4
    //   129: aload #5
    //   131: aload #10
    //   133: invokevirtual getHttpError : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;
    //   136: aload_0
    //   137: aload_0
    //   138: aload #7
    //   140: putfield L$0 : Ljava/lang/Object;
    //   143: aload_0
    //   144: iconst_2
    //   145: putfield label : I
    //   148: invokestatic access$grazieJbaAuthStep_toclVnw$handleAuthFailure : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   151: dup
    //   152: aload #12
    //   154: if_acmpne -> 183
    //   157: aload #12
    //   159: areturn
    //   160: iconst_0
    //   161: istore #6
    //   163: iconst_0
    //   164: istore #9
    //   166: iconst_0
    //   167: istore #11
    //   169: aload_0
    //   170: getfield L$0 : Ljava/lang/Object;
    //   173: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
    //   176: astore #7
    //   178: aload_1
    //   179: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   182: aload_1
    //   183: pop
    //   184: nop
    //   185: aload #7
    //   187: nop
    //   188: areturn
    //   189: new java/lang/IllegalStateException
    //   192: dup
    //   193: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   195: invokespecial <init> : (Ljava/lang/String;)V
    //   198: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #78	-> 3
    //   #79	-> 40
    //   #78	-> 66
    //   #80	-> 78
    //   #190	-> 98
    //   #191	-> 108
    //   #80	-> 126
    //   #78	-> 157
    //   #80	-> 183
    //   #191	-> 184
    //   #192	-> 184
    //   #190	-> 185
    //   #192	-> 187
    //   #80	-> 188
    //   #78	-> 189
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   78	27	2	$this$onFailure$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
    //   105	18	8	$this$onFailure_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
    //   123	28	10	it	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;
    //   126	34	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1$1$1	I
    //   108	52	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
    //   98	62	6	$i$f$onFailure	I
    //   0	199	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1$1;
    //   40	149	1	$result	Ljava/lang/Object;
    //   169	15	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1$1$1	I
    //   166	19	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
    //   163	25	6	$i$f$onFailure	I
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
    return (Continuation<Unit>)new Object(this.$apiUrl, this.$authData, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */