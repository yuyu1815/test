package ai.grazie.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000 \n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\003\n\002\030\002\n\002\b\002\0324\020\000\032\004\030\001H\001\"\004\b\000\020\0012\034\020\002\032\030\b\001\022\n\022\b\022\004\022\002H\0010\004\022\006\022\004\030\0010\0050\003H@¢\006\002\020\006\0323\020\007\032\004\030\001H\001\"\n\b\000\020\b\030\001*\0020\t\"\004\b\001\020\0012\f\020\002\032\b\022\004\022\002H\0010\nH\bø\001\000¢\006\002\020\013\002\007\n\005\b20\001¨\006\f"}, d2 = {"tryRun", "T", "body", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryRunWithException", "E", "", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "utils-common"})
public final class TryRunKt {
  @Nullable
  public static final <T> Object tryRun(@NotNull Function1 body, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof ai/grazie/utils/TryRunKt$tryRun$1
    //   4: ifeq -> 39
    //   7: aload_1
    //   8: checkcast ai/grazie/utils/TryRunKt$tryRun$1
    //   11: astore #5
    //   13: aload #5
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #5
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 49
    //   39: new ai/grazie/utils/TryRunKt$tryRun$1
    //   42: dup
    //   43: aload_1
    //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
    //   47: astore #5
    //   49: aload #5
    //   51: getfield result : Ljava/lang/Object;
    //   54: astore #4
    //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   59: astore #6
    //   61: aload #5
    //   63: getfield label : I
    //   66: tableswitch default -> 134, 0 -> 88, 1 -> 117
    //   88: aload #4
    //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   93: nop
    //   94: aload_0
    //   95: aload #5
    //   97: aload #5
    //   99: iconst_1
    //   100: putfield label : I
    //   103: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   108: dup
    //   109: aload #6
    //   111: if_acmpne -> 125
    //   114: aload #6
    //   116: areturn
    //   117: nop
    //   118: aload #4
    //   120: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   123: aload #4
    //   125: astore_2
    //   126: goto -> 132
    //   129: astore_3
    //   130: aconst_null
    //   131: astore_2
    //   132: aload_2
    //   133: areturn
    //   134: new java/lang/IllegalStateException
    //   137: dup
    //   138: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   140: invokespecial <init> : (Ljava/lang/String;)V
    //   143: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #3	-> 59
    //   #3	-> 93
    //   #4	-> 94
    //   #3	-> 114
    //   #4	-> 125
    //   #5	-> 129
    //   #6	-> 130
    //   #7	-> 133
    //   #3	-> 134
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   93	15	0	body	Lkotlin/jvm/functions/Function1;
    //   0	144	1	$completion	Lkotlin/coroutines/Continuation;
    //   49	85	5	$continuation	Lkotlin/coroutines/Continuation;
    //   56	78	4	$result	Ljava/lang/Object;
    // Exception table:
    //   from	to	target	type
    //   93	108	129	java/lang/Throwable
    //   117	126	129	java/lang/Throwable
  }
  
  @DebugMetadata(f = "tryRun.kt", l = {4}, i = {}, s = {}, n = {}, m = "tryRun", c = "ai.grazie.utils.TryRunKt")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class TryRunKt$tryRun$1<T> extends ContinuationImpl {
    int label;
    
    TryRunKt$tryRun$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return TryRunKt.tryRun(null, (Continuation)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\TryRunKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */