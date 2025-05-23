package com.intellij.ml.llm.matterhorn.core.llm.grazie;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 GrazieLLMProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy\n*L\n1#1,218:1\n57#2:219\n58#2:237\n285#3,17:220\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(GrazieLLMProxy paramGrazieLLMProxy) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getAnthropicContentChoices$$inlined$mapNotNull$1$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getAnthropicContentChoices$$inlined$mapNotNull$1$2$1
    //   11: astore_3
    //   12: aload_3
    //   13: getfield label : I
    //   16: ldc -2147483648
    //   18: iand
    //   19: ifeq -> 36
    //   22: aload_3
    //   23: dup
    //   24: getfield label : I
    //   27: ldc -2147483648
    //   29: isub
    //   30: putfield label : I
    //   33: goto -> 46
    //   36: new com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getAnthropicContentChoices$$inlined$mapNotNull$1$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getAnthropicContentChoices$$inlined$mapNotNull$1$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 357, 0 -> 84, 1 -> 342
    //   84: aload #4
    //   86: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   89: aload_0
    //   90: getfield $this_unsafeFlow : Lkotlinx/coroutines/flow/FlowCollector;
    //   93: aload_1
    //   94: astore #6
    //   96: astore #7
    //   98: iconst_0
    //   99: istore #8
    //   101: aload #6
    //   103: aload_3
    //   104: checkcast kotlin/coroutines/Continuation
    //   107: pop
    //   108: checkcast ai/grazie/model/llm/data/stream/LLMStreamData
    //   111: astore #9
    //   113: iconst_0
    //   114: istore #10
    //   116: aload #9
    //   118: astore #11
    //   120: aload #11
    //   122: instanceof ai/grazie/model/llm/data/stream/LLMStreamText
    //   125: ifeq -> 181
    //   128: new com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$AIAnswerChoiceIndex
    //   131: dup
    //   132: new com/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice
    //   135: dup
    //   136: aload #9
    //   138: checkcast ai/grazie/model/llm/data/stream/LLMStreamText
    //   141: invokevirtual getContent : ()Ljava/lang/String;
    //   144: aconst_null
    //   145: aconst_null
    //   146: bipush #6
    //   148: aconst_null
    //   149: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   152: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswerChoice
    //   155: aload #9
    //   157: checkcast ai/grazie/model/llm/data/stream/LLMStreamText
    //   160: invokevirtual getChoiceIndex : ()Ljava/lang/Integer;
    //   163: dup
    //   164: ifnull -> 173
    //   167: invokevirtual intValue : ()I
    //   170: goto -> 175
    //   173: pop
    //   174: iconst_0
    //   175: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;I)V
    //   178: goto -> 306
    //   181: aload #11
    //   183: instanceof ai/grazie/model/llm/data/stream/LLMStreamFunctionCall
    //   186: ifeq -> 278
    //   189: new com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$AIAnswerChoiceIndex
    //   192: dup
    //   193: aload #9
    //   195: checkcast ai/grazie/model/llm/data/stream/LLMStreamFunctionCall
    //   198: invokevirtual getName : ()Ljava/lang/String;
    //   201: astore #12
    //   203: aload #12
    //   205: ifnonnull -> 219
    //   208: aload #9
    //   210: checkcast ai/grazie/model/llm/data/stream/LLMStreamFunctionCall
    //   213: invokevirtual getContent : ()Ljava/lang/String;
    //   216: goto -> 226
    //   219: aload #12
    //   221: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   226: astore #13
    //   228: invokestatic emptyList : ()Ljava/util/List;
    //   231: astore #12
    //   233: new com/intellij/ml/llm/matterhorn/llm/AIToolUseAnswerChoice
    //   236: dup
    //   237: aload #12
    //   239: aload #13
    //   241: aconst_null
    //   242: aconst_null
    //   243: bipush #12
    //   245: aconst_null
    //   246: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   249: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswerChoice
    //   252: aload #9
    //   254: checkcast ai/grazie/model/llm/data/stream/LLMStreamFunctionCall
    //   257: invokevirtual getChoiceIndex : ()Ljava/lang/Integer;
    //   260: dup
    //   261: ifnull -> 270
    //   264: invokevirtual intValue : ()I
    //   267: goto -> 272
    //   270: pop
    //   271: iconst_0
    //   272: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;I)V
    //   275: goto -> 306
    //   278: aload #11
    //   280: instanceof ai/grazie/model/llm/data/stream/LLMStreamQuotaMetaData
    //   283: ifeq -> 305
    //   286: aload_0
    //   287: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
    //   290: aload #9
    //   292: checkcast ai/grazie/model/llm/data/stream/LLMStreamQuotaMetaData
    //   295: invokevirtual getUpdated : ()Lai/grazie/quota/Quota;
    //   298: invokevirtual reportQuota : (Lai/grazie/quota/Quota;)V
    //   301: aconst_null
    //   302: goto -> 306
    //   305: aconst_null
    //   306: nop
    //   307: astore #14
    //   309: aload #14
    //   311: ifnull -> 353
    //   314: aload #14
    //   316: astore #15
    //   318: aload #7
    //   320: aload #15
    //   322: aload_3
    //   323: aload_3
    //   324: iconst_1
    //   325: putfield label : I
    //   328: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   333: dup
    //   334: aload #5
    //   336: if_acmpne -> 352
    //   339: aload #5
    //   341: areturn
    //   342: iconst_0
    //   343: istore #8
    //   345: aload #4
    //   347: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   350: aload #4
    //   352: pop
    //   353: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   356: areturn
    //   357: new java/lang/IllegalStateException
    //   360: dup
    //   361: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   363: invokespecial <init> : (Ljava/lang/String;)V
    //   366: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #49	-> 89
    //   #219	-> 101
    //   #220	-> 116
    //   #221	-> 120
    //   #222	-> 181
    //   #224	-> 193
    //   #225	-> 203
    //   #226	-> 219
    //   #224	-> 226
    //   #228	-> 228
    //   #223	-> 233
    //   #228	-> 237
    //   #224	-> 239
    //   #223	-> 241
    //   #229	-> 252
    //   #222	-> 272
    //   #231	-> 278
    //   #232	-> 286
    //   #233	-> 301
    //   #235	-> 305
    //   #236	-> 306
    //   #219	-> 307
    //   #237	-> 318
    //   #0	-> 339
    //   #49	-> 352
    //   #0	-> 357
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	84	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getAnthropicContentChoices$$inlined$mapNotNull$1$2;
    //   181	12	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getAnthropicContentChoices$$inlined$mapNotNull$1$2;
    //   278	23	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getAnthropicContentChoices$$inlined$mapNotNull$1$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	15	6	value	Ljava/lang/Object;
    //   98	209	7	$this$mapNotNull_u24lambda_u246	Lkotlinx/coroutines/flow/FlowCollector;
    //   307	26	7	$this$mapNotNull_u24lambda_u246	Lkotlinx/coroutines/flow/FlowCollector;
    //   113	60	9	it	Lai/grazie/model/llm/data/stream/LLMStreamData;
    //   181	89	9	it	Lai/grazie/model/llm/data/stream/LLMStreamData;
    //   278	23	9	it	Lai/grazie/model/llm/data/stream/LLMStreamData;
    //   203	23	12	name	Ljava/lang/String;
    //   318	15	15	transformed	Ljava/lang/Object;
    //   116	191	10	$i$a$-mapNotNull-GrazieLLMProxy$getAnthropicContentChoices$3	I
    //   0	367	2	$completion	Lkotlin/coroutines/Continuation;
    //   101	241	8	$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1	I
    //   46	311	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	305	4	$result	Ljava/lang/Object;
    //   345	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\grazie\GrazieLLMProxy$getAnthropicContentChoices$$inlined$mapNotNull$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */