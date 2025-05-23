package com.intellij.ml.llm.matterhorn.activation.platform.util;

import com.intellij.openapi.components.ComponentManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 service.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/util/ServiceKt\n*L\n1#1,218:1\n50#2:219\n28#3:220\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(FlowCollector $receiver, ComponentManager paramComponentManager, Class paramClass) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof com/intellij/ml/llm/matterhorn/activation/platform/util/ServiceKt$dynamicPluginServiceFlow$$inlined$map$2$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast com/intellij/ml/llm/matterhorn/activation/platform/util/ServiceKt$dynamicPluginServiceFlow$$inlined$map$2$2$1
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
    //   36: new com/intellij/ml/llm/matterhorn/activation/platform/util/ServiceKt$dynamicPluginServiceFlow$$inlined$map$2$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/platform/util/ServiceKt$dynamicPluginServiceFlow$$inlined$map$2$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 221, 0 -> 88, 1 -> 155, 2 -> 206
    //   88: aload #4
    //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   93: aload_0
    //   94: getfield $this_unsafeFlow : Lkotlinx/coroutines/flow/FlowCollector;
    //   97: aload_1
    //   98: astore #6
    //   100: astore #7
    //   102: iconst_0
    //   103: istore #8
    //   105: aload #7
    //   107: astore #9
    //   109: aload #6
    //   111: aload_3
    //   112: checkcast kotlin/coroutines/Continuation
    //   115: pop
    //   116: checkcast kotlin/Unit
    //   119: pop
    //   120: iconst_0
    //   121: istore #10
    //   123: aload_0
    //   124: getfield $this_dynamicPluginServiceFlow$inlined : Lcom/intellij/openapi/components/ComponentManager;
    //   127: aload_0
    //   128: getfield $serviceInterface$inlined : Ljava/lang/Class;
    //   131: aload_3
    //   132: aload_3
    //   133: aload #9
    //   135: putfield L$0 : Ljava/lang/Object;
    //   138: aload_3
    //   139: iconst_1
    //   140: putfield label : I
    //   143: invokestatic getServiceAsync : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   146: dup
    //   147: aload #5
    //   149: if_acmpne -> 177
    //   152: aload #5
    //   154: areturn
    //   155: iconst_0
    //   156: istore #8
    //   158: iconst_0
    //   159: istore #10
    //   161: aload_3
    //   162: getfield L$0 : Ljava/lang/Object;
    //   165: checkcast kotlinx/coroutines/flow/FlowCollector
    //   168: astore #9
    //   170: aload #4
    //   172: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   175: aload #4
    //   177: nop
    //   178: aload #9
    //   180: swap
    //   181: aload_3
    //   182: aload_3
    //   183: aconst_null
    //   184: putfield L$0 : Ljava/lang/Object;
    //   187: aload_3
    //   188: iconst_2
    //   189: putfield label : I
    //   192: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   197: dup
    //   198: aload #5
    //   200: if_acmpne -> 216
    //   203: aload #5
    //   205: areturn
    //   206: iconst_0
    //   207: istore #8
    //   209: aload #4
    //   211: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   214: aload #4
    //   216: pop
    //   217: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   220: areturn
    //   221: new java/lang/IllegalStateException
    //   224: dup
    //   225: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   227: invokespecial <init> : (Ljava/lang/String;)V
    //   230: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #49	-> 93
    //   #219	-> 105
    //   #220	-> 123
    //   #0	-> 152
    //   #220	-> 177
    //   #219	-> 178
    //   #0	-> 203
    //   #49	-> 216
    //   #0	-> 221
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   93	53	0	this	Lcom/intellij/ml/llm/matterhorn/activation/platform/util/ServiceKt$dynamicPluginServiceFlow$$inlined$map$2$2;
    //   93	9	1	value	Ljava/lang/Object;
    //   102	18	6	value	Ljava/lang/Object;
    //   102	18	7	$this$map_u24lambda_u245	Lkotlinx/coroutines/flow/FlowCollector;
    //   123	32	10	$i$a$-map-ServiceKt$dynamicPluginServiceFlow$3	I
    //   0	231	2	$completion	Lkotlin/coroutines/Continuation;
    //   105	50	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   46	175	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	169	4	$result	Ljava/lang/Object;
    //   161	17	10	$i$a$-map-ServiceKt$dynamicPluginServiceFlow$3	I
    //   158	48	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   209	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platfor\\util\ServiceKt$dynamicPluginServiceFlow$$inlined$map$2$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */