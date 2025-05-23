package ai.grazie.api.gateway.client.api.llm;

import ai.grazie.model.cloud.sse.continuous.ContinuousSSEEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\t\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\n"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSEV2$$inlined$map$3$2", "ai/grazie/client/common/cloud/SuspendableCloudClient$receiveContinuousSSEV2$$inlined$receiveContinuousSSEV2$2$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 4 Extensions.kt\nai/grazie/model/cloud/sse/continuous/ExtensionsKt\n*L\n1#1,218:1\n50#2:219\n105#3:220\n32#4,15:221\n*S KotlinDebug\n*F\n+ 1 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n*L\n105#1:221,15\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(FlowCollector $receiver, ContinuousSSEEvent.Companion paramCompanion) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$receiveContinuousSSEV2$default$3$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$receiveContinuousSSEV2$default$3$2$1
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
    //   36: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$receiveContinuousSSEV2$default$3$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$receiveContinuousSSEV2$default$3$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 473, 0 -> 84, 1 -> 458
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
    //   112: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent
    //   115: astore #10
    //   117: iconst_0
    //   118: istore #11
    //   120: iconst_0
    //   121: istore #12
    //   123: aload_0
    //   124: getfield receiver$inlined : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
    //   127: pop
    //   128: iconst_0
    //   129: istore #13
    //   131: aload #10
    //   133: astore #14
    //   135: aload #14
    //   137: instanceof ai/grazie/model/cloud/sse/continuous/Data
    //   140: ifeq -> 168
    //   143: aload #10
    //   145: dup
    //   146: ifnonnull -> 159
    //   149: new java/lang/NullPointerException
    //   152: dup
    //   153: ldc 'null cannot be cast to non-null type ai.grazie.api.gateway.api.llm.LlmAPI.Chat.Stream.V7.LLMData'
    //   155: invokespecial <init> : (Ljava/lang/String;)V
    //   158: athrow
    //   159: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMData
    //   162: checkcast ai/grazie/model/cloud/sse/continuous/Data
    //   165: goto -> 433
    //   168: aload #14
    //   170: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent
    //   173: ifeq -> 282
    //   176: aload #10
    //   178: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent
    //   181: astore #15
    //   183: aload #15
    //   185: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Timeout
    //   188: ifeq -> 212
    //   191: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Timeout
    //   194: dup
    //   195: aload #10
    //   197: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent
    //   200: invokevirtual getMessage : ()Ljava/lang/String;
    //   203: invokespecial <init> : (Ljava/lang/String;)V
    //   206: checkcast java/lang/Throwable
    //   209: goto -> 281
    //   212: aload #15
    //   214: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Cancellation
    //   217: ifeq -> 241
    //   220: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Cancellation
    //   223: dup
    //   224: aload #10
    //   226: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Cancellation
    //   229: invokevirtual getReason : ()Ljava/lang/String;
    //   232: invokespecial <init> : (Ljava/lang/String;)V
    //   235: checkcast java/lang/Throwable
    //   238: goto -> 281
    //   241: aload #15
    //   243: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Error
    //   246: ifeq -> 273
    //   249: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Error
    //   252: dup
    //   253: aload #10
    //   255: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Error
    //   258: invokevirtual getErrorMessage : ()Ljava/lang/String;
    //   261: aconst_null
    //   262: iconst_2
    //   263: aconst_null
    //   264: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   267: checkcast java/lang/Throwable
    //   270: goto -> 281
    //   273: new kotlin/NoWhenBranchMatchedException
    //   276: dup
    //   277: invokespecial <init> : ()V
    //   280: athrow
    //   281: athrow
    //   282: aload #14
    //   284: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2
    //   287: ifeq -> 425
    //   290: aload #10
    //   292: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2
    //   295: astore #15
    //   297: aload #15
    //   299: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Timeout
    //   302: ifeq -> 326
    //   305: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Timeout
    //   308: dup
    //   309: aload #10
    //   311: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2
    //   314: invokevirtual getMessage : ()Ljava/lang/String;
    //   317: invokespecial <init> : (Ljava/lang/String;)V
    //   320: checkcast java/lang/Throwable
    //   323: goto -> 424
    //   326: aload #15
    //   328: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Cancellation
    //   331: ifeq -> 355
    //   334: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Cancellation
    //   337: dup
    //   338: aload #10
    //   340: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Cancellation
    //   343: invokevirtual getReason : ()Ljava/lang/String;
    //   346: invokespecial <init> : (Ljava/lang/String;)V
    //   349: checkcast java/lang/Throwable
    //   352: goto -> 424
    //   355: aload #15
    //   357: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$PrematureEnd
    //   360: ifeq -> 384
    //   363: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$PrematureEnd
    //   366: dup
    //   367: aload #10
    //   369: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$PrematureEnd
    //   372: invokevirtual getReason : ()Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;
    //   375: invokespecial <init> : (Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;)V
    //   378: checkcast java/lang/Throwable
    //   381: goto -> 424
    //   384: aload #15
    //   386: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Error
    //   389: ifeq -> 416
    //   392: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Error
    //   395: dup
    //   396: aload #10
    //   398: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Error
    //   401: invokevirtual getErrorMessage : ()Ljava/lang/String;
    //   404: aconst_null
    //   405: iconst_2
    //   406: aconst_null
    //   407: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   410: checkcast java/lang/Throwable
    //   413: goto -> 424
    //   416: new kotlin/NoWhenBranchMatchedException
    //   419: dup
    //   420: invokespecial <init> : ()V
    //   423: athrow
    //   424: athrow
    //   425: new kotlin/NoWhenBranchMatchedException
    //   428: dup
    //   429: invokespecial <init> : ()V
    //   432: athrow
    //   433: nop
    //   434: nop
    //   435: aload #9
    //   437: swap
    //   438: aload_3
    //   439: aload_3
    //   440: iconst_1
    //   441: putfield label : I
    //   444: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   449: dup
    //   450: aload #5
    //   452: if_acmpne -> 468
    //   455: aload #5
    //   457: areturn
    //   458: iconst_0
    //   459: istore #8
    //   461: aload #4
    //   463: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   466: aload #4
    //   468: pop
    //   469: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   472: areturn
    //   473: new java/lang/IllegalStateException
    //   476: dup
    //   477: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   479: invokespecial <init> : (Ljava/lang/String;)V
    //   482: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #49	-> 89
    //   #219	-> 101
    //   #220	-> 123
    //   #221	-> 131
    //   #222	-> 135
    //   #223	-> 168
    //   #224	-> 176
    //   #225	-> 183
    //   #226	-> 212
    //   #227	-> 241
    //   #230	-> 282
    //   #231	-> 290
    //   #232	-> 297
    //   #233	-> 326
    //   #234	-> 355
    //   #235	-> 384
    //   #221	-> 433
    //   #220	-> 434
    //   #219	-> 435
    //   #0	-> 455
    //   #49	-> 468
    //   #0	-> 473
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	39	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$receiveContinuousSSEV2$default$3$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	19	6	value	Ljava/lang/Object;
    //   98	19	7	$this$map_u24lambda_u245	Lkotlinx/coroutines/flow/FlowCollector;
    //   117	42	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   168	44	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   212	29	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   241	32	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   282	44	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   326	29	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   355	29	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   384	32	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   131	303	13	$i$f$handle	I
    //   120	315	11	$i$f$receiveContinuousSSEV2$handle$4	I
    //   123	312	12	$i$a$-map-SuspendableClientExtensionsKt$receiveContinuousSSEV2$4	I
    //   0	483	2	$completion	Lkotlin/coroutines/Continuation;
    //   101	357	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   46	427	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	421	4	$result	Ljava/lang/Object;
    //   461	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\llm\LlmAPIClient$V7$chat$$inlined$receiveContinuousSSEV2$default$3$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */