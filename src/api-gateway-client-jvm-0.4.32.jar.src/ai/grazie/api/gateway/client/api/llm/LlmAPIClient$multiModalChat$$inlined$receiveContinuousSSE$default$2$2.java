package ai.grazie.api.gateway.client.api.llm;

import ai.grazie.utils.json.JSON;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\t\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\n"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSE$$inlined$map$2$2", "ai/grazie/client/common/cloud/SuspendableCloudClient$receiveContinuousSSE$$inlined$receiveContinuousSSE$1$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n*L\n1#1,218:1\n50#2:219\n89#3:220\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(FlowCollector $receiver, KSerializer paramKSerializer, JSON paramJSON) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$multiModalChat$$inlined$receiveContinuousSSE$default$2$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$multiModalChat$$inlined$receiveContinuousSSE$default$2$2$1
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
    //   36: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$multiModalChat$$inlined$receiveContinuousSSE$default$2$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$multiModalChat$$inlined$receiveContinuousSSE$default$2$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 169, 0 -> 84, 1 -> 154
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
    //   107: checkcast java/lang/String
    //   110: astore #10
    //   112: iconst_0
    //   113: istore #11
    //   115: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
    //   118: aload #10
    //   120: aload_0
    //   121: getfield $serializer$inlined : Lkotlinx/serialization/KSerializer;
    //   124: aload_0
    //   125: getfield $json$inlined : Lai/grazie/utils/json/JSON;
    //   128: invokestatic parse : (Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;Ljava/lang/String;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   131: aload #9
    //   133: swap
    //   134: aload_3
    //   135: aload_3
    //   136: iconst_1
    //   137: putfield label : I
    //   140: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   145: dup
    //   146: aload #5
    //   148: if_acmpne -> 164
    //   151: aload #5
    //   153: areturn
    //   154: iconst_0
    //   155: istore #8
    //   157: aload #4
    //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   162: aload #4
    //   164: pop
    //   165: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   168: areturn
    //   169: new java/lang/IllegalStateException
    //   172: dup
    //   173: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   175: invokespecial <init> : (Ljava/lang/String;)V
    //   178: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #49	-> 89
    //   #219	-> 101
    //   #220	-> 115
    //   #219	-> 131
    //   #0	-> 151
    //   #49	-> 164
    //   #0	-> 169
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	42	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$multiModalChat$$inlined$receiveContinuousSSE$default$2$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	14	6	value	Ljava/lang/Object;
    //   98	14	7	$this$map_u24lambda_u245	Lkotlinx/coroutines/flow/FlowCollector;
    //   112	19	10	it	Ljava/lang/String;
    //   115	16	11	$i$a$-map-SuspendableClientExtensionsKt$receiveContinuousSSE$3	I
    //   0	179	2	$completion	Lkotlin/coroutines/Continuation;
    //   101	53	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   46	123	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	117	4	$result	Ljava/lang/Object;
    //   157	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\llm\LlmAPIClient$multiModalChat$$inlined$receiveContinuousSSE$default$2$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */