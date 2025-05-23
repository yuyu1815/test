package com.intellij.ml.llm.matterhorn.activation.data.repos;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 JunieIdeLicenseRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl\n*L\n1#1,218:1\n50#2:219\n66#3:220\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(FlowCollector $receiver) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$special$$inlined$map$1$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$special$$inlined$map$1$2$1
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
    //   36: new com/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$special$$inlined$map$1$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$special$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 163, 0 -> 84, 1 -> 148
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
    //   112: checkcast com/intellij/ui/LicensingFacade
    //   115: astore #10
    //   117: iconst_0
    //   118: istore #11
    //   120: aload #10
    //   122: invokestatic access$toAiFlag : (Lcom/intellij/ui/LicensingFacade;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;
    //   125: aload #9
    //   127: swap
    //   128: aload_3
    //   129: aload_3
    //   130: iconst_1
    //   131: putfield label : I
    //   134: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   139: dup
    //   140: aload #5
    //   142: if_acmpne -> 158
    //   145: aload #5
    //   147: areturn
    //   148: iconst_0
    //   149: istore #8
    //   151: aload #4
    //   153: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   156: aload #4
    //   158: pop
    //   159: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   162: areturn
    //   163: new java/lang/IllegalStateException
    //   166: dup
    //   167: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   169: invokespecial <init> : (Ljava/lang/String;)V
    //   172: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #49	-> 89
    //   #219	-> 101
    //   #220	-> 120
    //   #219	-> 125
    //   #0	-> 145
    //   #49	-> 158
    //   #0	-> 163
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	9	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$special$$inlined$map$1$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	19	6	value	Ljava/lang/Object;
    //   98	19	7	$this$map_u24lambda_u245	Lkotlinx/coroutines/flow/FlowCollector;
    //   117	8	10	facade	Lcom/intellij/ui/LicensingFacade;
    //   120	5	11	$i$a$-map-IdeLicenseRepositoryImpl$aiFlagFlow$1	I
    //   0	173	2	$completion	Lkotlin/coroutines/Continuation;
    //   101	47	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   46	117	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	111	4	$result	Ljava/lang/Object;
    //   151	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\IdeLicenseRepositoryImpl$special$$inlined$map$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */