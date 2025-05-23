package com.intellij.ml.llm.matterhorn.activation.data.repos;

import com.intellij.ui.LicensingFacade;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 JunieIdeLicenseRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl\n*L\n1#1,218:1\n18#2:219\n19#2:221\n85#3:220\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(FlowCollector $receiver, LicensingFacade paramLicensingFacade) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$$inlined$filter$1$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$$inlined$filter$1$2$1
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
    //   36: new com/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$$inlined$filter$1$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$$inlined$filter$1$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 176, 0 -> 84, 1 -> 157
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
    //   108: checkcast com/intellij/ui/LicensingFacade
    //   111: astore #9
    //   113: iconst_0
    //   114: istore #10
    //   116: aload #9
    //   118: aload_0
    //   119: getfield $oldFacadeValue$inlined : Lcom/intellij/ui/LicensingFacade;
    //   122: if_acmpeq -> 129
    //   125: iconst_1
    //   126: goto -> 130
    //   129: iconst_0
    //   130: ifeq -> 171
    //   133: aload #7
    //   135: aload #6
    //   137: aload_3
    //   138: aload_3
    //   139: iconst_1
    //   140: putfield label : I
    //   143: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   148: dup
    //   149: aload #5
    //   151: if_acmpne -> 167
    //   154: aload #5
    //   156: areturn
    //   157: iconst_0
    //   158: istore #8
    //   160: aload #4
    //   162: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   165: aload #4
    //   167: pop
    //   168: goto -> 172
    //   171: nop
    //   172: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   175: areturn
    //   176: new java/lang/IllegalStateException
    //   179: dup
    //   180: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   182: invokespecial <init> : (Ljava/lang/String;)V
    //   185: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #49	-> 89
    //   #219	-> 101
    //   #220	-> 116
    //   #219	-> 130
    //   #0	-> 154
    //   #219	-> 167
    //   #221	-> 171
    //   #49	-> 172
    //   #0	-> 176
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	40	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$$inlined$filter$1$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	32	6	value	Ljava/lang/Object;
    //   130	18	6	value	Ljava/lang/Object;
    //   98	32	7	$this$filter_u24lambda_u240	Lkotlinx/coroutines/flow/FlowCollector;
    //   130	18	7	$this$filter_u24lambda_u240	Lkotlinx/coroutines/flow/FlowCollector;
    //   113	16	9	it	Lcom/intellij/ui/LicensingFacade;
    //   116	14	10	$i$a$-filter-IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$2	I
    //   0	186	2	$completion	Lkotlin/coroutines/Continuation;
    //   101	56	8	$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1	I
    //   46	130	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	124	4	$result	Ljava/lang/Object;
    //   160	12	8	$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$$inlined$filter$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */