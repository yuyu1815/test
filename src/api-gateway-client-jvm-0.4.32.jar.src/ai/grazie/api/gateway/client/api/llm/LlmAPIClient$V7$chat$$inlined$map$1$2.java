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
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7\n*L\n1#1,218:1\n50#2:219\n349#3,7:220\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(FlowCollector $receiver) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$map$1$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$map$1$2$1
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
    //   36: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$map$1$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 338, 0 -> 84, 1 -> 323
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
    //   112: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData
    //   115: astore #10
    //   117: iconst_0
    //   118: istore #11
    //   120: aload #10
    //   122: astore #12
    //   124: aload #12
    //   126: instanceof ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData$Content
    //   129: ifeq -> 158
    //   132: new ai/grazie/model/llm/data/stream/LLMStreamText
    //   135: dup
    //   136: aload #10
    //   138: invokevirtual getContent : ()Ljava/lang/String;
    //   141: aload #10
    //   143: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData$Content
    //   146: invokevirtual getChoiceIndex : ()Ljava/lang/Integer;
    //   149: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   152: checkcast ai/grazie/model/llm/data/stream/LLMStreamData
    //   155: goto -> 299
    //   158: aload #12
    //   160: instanceof ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData$FunctionCall
    //   163: ifeq -> 200
    //   166: new ai/grazie/model/llm/data/stream/LLMStreamFunctionCall
    //   169: dup
    //   170: aload #10
    //   172: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData$FunctionCall
    //   175: invokevirtual getName : ()Ljava/lang/String;
    //   178: aload #10
    //   180: invokevirtual getContent : ()Ljava/lang/String;
    //   183: aload #10
    //   185: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData$FunctionCall
    //   188: invokevirtual getChoiceIndex : ()Ljava/lang/Integer;
    //   191: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    //   194: checkcast ai/grazie/model/llm/data/stream/LLMStreamData
    //   197: goto -> 299
    //   200: aload #12
    //   202: instanceof ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData$QuotaMetadata
    //   205: ifeq -> 237
    //   208: new ai/grazie/model/llm/data/stream/LLMStreamQuotaMetaData
    //   211: dup
    //   212: aload #10
    //   214: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData$QuotaMetadata
    //   217: invokevirtual getUpdated : ()Lai/grazie/quota/Quota;
    //   220: aload #10
    //   222: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData$QuotaMetadata
    //   225: invokevirtual getSpent : ()Lai/grazie/utils/mpp/money/Credit;
    //   228: invokespecial <init> : (Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;)V
    //   231: checkcast ai/grazie/model/llm/data/stream/LLMStreamData
    //   234: goto -> 299
    //   237: aload #12
    //   239: instanceof ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData$FinishMetadata
    //   242: ifeq -> 274
    //   245: new ai/grazie/model/llm/data/stream/LLMStreamFinishMetaData
    //   248: dup
    //   249: aload #10
    //   251: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData$FinishMetadata
    //   254: invokevirtual getReason : ()Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;
    //   257: aload #10
    //   259: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData$FinishMetadata
    //   262: invokevirtual getChoiceIndex : ()Ljava/lang/Integer;
    //   265: invokespecial <init> : (Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;Ljava/lang/Integer;)V
    //   268: checkcast ai/grazie/model/llm/data/stream/LLMStreamData
    //   271: goto -> 299
    //   274: aload #12
    //   276: instanceof ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData$UnknownMetadata
    //   279: ifeq -> 291
    //   282: getstatic ai/grazie/model/llm/data/stream/LLMStreamUnknownMetaData.INSTANCE : Lai/grazie/model/llm/data/stream/LLMStreamUnknownMetaData;
    //   285: checkcast ai/grazie/model/llm/data/stream/LLMStreamData
    //   288: goto -> 299
    //   291: new kotlin/NoWhenBranchMatchedException
    //   294: dup
    //   295: invokespecial <init> : ()V
    //   298: athrow
    //   299: nop
    //   300: aload #9
    //   302: swap
    //   303: aload_3
    //   304: aload_3
    //   305: iconst_1
    //   306: putfield label : I
    //   309: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   314: dup
    //   315: aload #5
    //   317: if_acmpne -> 333
    //   320: aload #5
    //   322: areturn
    //   323: iconst_0
    //   324: istore #8
    //   326: aload #4
    //   328: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   331: aload #4
    //   333: pop
    //   334: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   337: areturn
    //   338: new java/lang/IllegalStateException
    //   341: dup
    //   342: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   344: invokespecial <init> : (Ljava/lang/String;)V
    //   347: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #49	-> 89
    //   #219	-> 101
    //   #220	-> 120
    //   #221	-> 124
    //   #222	-> 158
    //   #223	-> 200
    //   #224	-> 237
    //   #225	-> 274
    //   #226	-> 299
    //   #219	-> 300
    //   #0	-> 320
    //   #49	-> 333
    //   #0	-> 338
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	9	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$map$1$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	19	6	value	Ljava/lang/Object;
    //   98	19	7	$this$map_u24lambda_u245	Lkotlinx/coroutines/flow/FlowCollector;
    //   117	41	10	it	Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData;
    //   158	42	10	it	Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData;
    //   200	37	10	it	Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData;
    //   237	37	10	it	Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData;
    //   120	180	11	$i$a$-map-LlmAPIClient$V7$chat$4	I
    //   0	348	2	$completion	Lkotlin/coroutines/Continuation;
    //   101	222	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   46	292	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	286	4	$result	Ljava/lang/Object;
    //   326	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\llm\LlmAPIClient$V7$chat$$inlined$map$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */