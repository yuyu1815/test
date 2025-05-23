package ai.grazie.api.gateway.client.api.llm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\b\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSEV2$$inlined$map$1$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n*L\n1#1,218:1\n50#2:219\n102#3:220\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(FlowCollector $receiver) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$complete$$inlined$receiveContinuousSSEV2$default$1$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$complete$$inlined$receiveContinuousSSEV2$default$1$2$1
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
    //   36: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$complete$$inlined$receiveContinuousSSEV2$default$1$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$complete$$inlined$receiveContinuousSSEV2$default$1$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 158, 0 -> 84, 1 -> 143
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
    //   107: checkcast ai/grazie/model/cloud/sse/ServerSentEvent
    //   110: astore #10
    //   112: iconst_0
    //   113: istore #11
    //   115: aload #10
    //   117: invokevirtual getData : ()Ljava/lang/String;
    //   120: aload #9
    //   122: swap
    //   123: aload_3
    //   124: aload_3
    //   125: iconst_1
    //   126: putfield label : I
    //   129: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   134: dup
    //   135: aload #5
    //   137: if_acmpne -> 153
    //   140: aload #5
    //   142: areturn
    //   143: iconst_0
    //   144: istore #8
    //   146: aload #4
    //   148: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   151: aload #4
    //   153: pop
    //   154: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   157: areturn
    //   158: new java/lang/IllegalStateException
    //   161: dup
    //   162: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   164: invokespecial <init> : (Ljava/lang/String;)V
    //   167: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #49	-> 89
    //   #219	-> 101
    //   #220	-> 115
    //   #219	-> 120
    //   #0	-> 140
    //   #49	-> 153
    //   #0	-> 158
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	9	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$complete$$inlined$receiveContinuousSSEV2$default$1$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	14	6	value	Ljava/lang/Object;
    //   98	14	7	$this$map_u24lambda_u245	Lkotlinx/coroutines/flow/FlowCollector;
    //   112	8	10	it	Lai/grazie/model/cloud/sse/ServerSentEvent;
    //   115	5	11	$i$a$-map-SuspendableClientExtensionsKt$receiveContinuousSSEV2$2	I
    //   0	168	2	$completion	Lkotlin/coroutines/Continuation;
    //   101	42	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   46	112	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	106	4	$result	Ljava/lang/Object;
    //   146	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\llm\LlmAPIClient$V7$complete$$inlined$receiveContinuousSSEV2$default$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */