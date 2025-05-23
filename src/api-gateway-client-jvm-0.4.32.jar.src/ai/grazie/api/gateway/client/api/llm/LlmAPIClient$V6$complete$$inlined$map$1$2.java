package ai.grazie.api.gateway.client.api.llm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6\n*L\n1#1,218:1\n50#2:219\n249#3,4:220\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(FlowCollector $receiver) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$$inlined$map$1$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$$inlined$map$1$2$1
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
    //   36: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$$inlined$map$1$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 237, 0 -> 84, 1 -> 222
    //   84: aload #4
    //   86: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   89: aload_0
    //   90: getfield $this_unsafeFlow : Lkotlinx/coroutines/flow/FlowCollector;
    //   93: aload_1
    //   94: astore #6
    //   96: astore #7
    //   98: iconst_0
    //   99: istore #8
    //   101: aload #7
    //   103: astore #9
    //   105: aload #6
    //   107: aload_3
    //   108: checkcast kotlin/coroutines/Continuation
    //   111: pop
    //   112: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$LLMData
    //   115: astore #10
    //   117: iconst_0
    //   118: istore #11
    //   120: aload #10
    //   122: astore #12
    //   124: aload #12
    //   126: instanceof ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$LLMData$Content
    //   129: ifeq -> 153
    //   132: new ai/grazie/model/llm/data/stream/LLMStreamText
    //   135: dup
    //   136: aload #10
    //   138: invokevirtual getContent : ()Ljava/lang/String;
    //   141: aconst_null
    //   142: iconst_2
    //   143: aconst_null
    //   144: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   147: checkcast ai/grazie/model/llm/data/stream/LLMStreamData
    //   150: goto -> 198
    //   153: aload #12
    //   155: instanceof ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$LLMData$QuotaMetadata
    //   158: ifeq -> 190
    //   161: new ai/grazie/model/llm/data/stream/LLMStreamQuotaMetaData
    //   164: dup
    //   165: aload #10
    //   167: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$LLMData$QuotaMetadata
    //   170: invokevirtual getUpdated : ()Lai/grazie/quota/Quota;
    //   173: aload #10
    //   175: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$LLMData$QuotaMetadata
    //   178: invokevirtual getSpent : ()Lai/grazie/utils/mpp/money/Credit;
    //   181: invokespecial <init> : (Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;)V
    //   184: checkcast ai/grazie/model/llm/data/stream/LLMStreamData
    //   187: goto -> 198
    //   190: new kotlin/NoWhenBranchMatchedException
    //   193: dup
    //   194: invokespecial <init> : ()V
    //   197: athrow
    //   198: nop
    //   199: aload #9
    //   201: swap
    //   202: aload_3
    //   203: aload_3
    //   204: iconst_1
    //   205: putfield label : I
    //   208: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   213: dup
    //   214: aload #5
    //   216: if_acmpne -> 232
    //   219: aload #5
    //   221: areturn
    //   222: iconst_0
    //   223: istore #8
    //   225: aload #4
    //   227: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   230: aload #4
    //   232: pop
    //   233: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   236: areturn
    //   237: new java/lang/IllegalStateException
    //   240: dup
    //   241: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   243: invokespecial <init> : (Ljava/lang/String;)V
    //   246: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #49	-> 89
    //   #219	-> 101
    //   #220	-> 120
    //   #221	-> 124
    //   #222	-> 153
    //   #223	-> 198
    //   #219	-> 199
    //   #0	-> 219
    //   #49	-> 232
    //   #0	-> 237
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	9	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$$inlined$map$1$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	19	6	value	Ljava/lang/Object;
    //   98	19	7	$this$map_u24lambda_u245	Lkotlinx/coroutines/flow/FlowCollector;
    //   117	36	10	it	Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$LLMData;
    //   153	37	10	it	Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$LLMData;
    //   120	79	11	$i$a$-map-LlmAPIClient$V6$complete$2	I
    //   0	247	2	$completion	Lkotlin/coroutines/Continuation;
    //   101	121	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   46	191	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	185	4	$result	Ljava/lang/Object;
    //   225	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\llm\LlmAPIClient$V6$complete$$inlined$map$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */