package ai.grazie.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\020\016\n\002\030\002\n\002\b\002\032\030\020\000\032\0020\001*\b\022\004\022\0020\0010\002H@¢\006\002\020\003¨\006\004"}, d2 = {"toText", "", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
public final class CoroutinesKt {
  @Nullable
  public static final Object toText(@NotNull Flow $this$toText, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof ai/grazie/utils/CoroutinesKt$toText$1
    //   4: ifeq -> 36
    //   7: aload_1
    //   8: checkcast ai/grazie/utils/CoroutinesKt$toText$1
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
    //   33: goto -> 45
    //   36: new ai/grazie/utils/CoroutinesKt$toText$1
    //   39: dup
    //   40: aload_1
    //   41: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
    //   44: astore_3
    //   45: aload_3
    //   46: getfield result : Ljava/lang/Object;
    //   49: astore_2
    //   50: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   53: astore #4
    //   55: aload_3
    //   56: getfield label : I
    //   59: tableswitch default -> 131, 0 -> 80, 1 -> 106
    //   80: aload_2
    //   81: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   84: aload_0
    //   85: aconst_null
    //   86: aload_3
    //   87: iconst_1
    //   88: aconst_null
    //   89: aload_3
    //   90: iconst_1
    //   91: putfield label : I
    //   94: invokestatic toList$default : (Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   97: dup
    //   98: aload #4
    //   100: if_acmpne -> 111
    //   103: aload #4
    //   105: areturn
    //   106: aload_2
    //   107: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   110: aload_2
    //   111: checkcast java/lang/Iterable
    //   114: ldc ''
    //   116: checkcast java/lang/CharSequence
    //   119: aconst_null
    //   120: aconst_null
    //   121: iconst_0
    //   122: aconst_null
    //   123: aconst_null
    //   124: bipush #62
    //   126: aconst_null
    //   127: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
    //   130: areturn
    //   131: new java/lang/IllegalStateException
    //   134: dup
    //   135: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   137: invokespecial <init> : (Ljava/lang/String;)V
    //   140: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #9	-> 53
    //   #9	-> 84
    //   #9	-> 103
    //   #9	-> 111
    //   #9	-> 131
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   84	13	0	$this$toText	Lkotlinx/coroutines/flow/Flow;
    //   0	141	1	$completion	Lkotlin/coroutines/Continuation;
    //   45	86	3	$continuation	Lkotlin/coroutines/Continuation;
    //   50	81	2	$result	Ljava/lang/Object;
  }
  
  @DebugMetadata(f = "Coroutines.kt", l = {9}, i = {}, s = {}, n = {}, m = "toText", c = "ai.grazie.utils.CoroutinesKt")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class CoroutinesKt$toText$1 extends ContinuationImpl {
    int label;
    
    CoroutinesKt$toText$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return CoroutinesKt.toText(null, (Continuation<? super String>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\CoroutinesKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */