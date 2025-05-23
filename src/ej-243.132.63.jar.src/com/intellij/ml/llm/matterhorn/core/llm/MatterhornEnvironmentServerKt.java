package com.intellij.ml.llm.matterhorn.core.llm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\002\032\020\020\000\032\004\030\0010\001H@¢\006\002\020\002¨\006\003"}, d2 = {"getMatterhornEnvironmentServerPort", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core-llm"})
public final class MatterhornEnvironmentServerKt {
  @Nullable
  public static final Object getMatterhornEnvironmentServerPort(@NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerKt$getMatterhornEnvironmentServerPort$1
    //   4: ifeq -> 36
    //   7: aload_0
    //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerKt$getMatterhornEnvironmentServerPort$1
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
    //   36: new com/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerKt$getMatterhornEnvironmentServerPort$1
    //   39: dup
    //   40: aload_0
    //   41: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
    //   44: astore_3
    //   45: aload_3
    //   46: getfield result : Ljava/lang/Object;
    //   49: astore_2
    //   50: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   53: astore #4
    //   55: aload_3
    //   56: getfield label : I
    //   59: tableswitch default -> 143, 0 -> 80, 1 -> 117
    //   80: aload_2
    //   81: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   84: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;
    //   87: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
    //   90: getstatic com/intellij/ml/llm/matterhorn/settings/CoreProperties.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;
    //   93: invokevirtual getMATTERHORN_ENVIRONMENT_SERVER_PORT : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
    //   96: invokevirtual getName : ()Ljava/lang/String;
    //   99: aload_3
    //   100: aload_3
    //   101: iconst_1
    //   102: putfield label : I
    //   105: invokevirtual getSetting : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   108: dup
    //   109: aload #4
    //   111: if_acmpne -> 122
    //   114: aload #4
    //   116: areturn
    //   117: aload_2
    //   118: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   121: aload_2
    //   122: checkcast java/lang/String
    //   125: astore_1
    //   126: aload_1
    //   127: ifnull -> 141
    //   130: nop
    //   131: aload_1
    //   132: invokestatic parseInt : (Ljava/lang/String;)I
    //   135: invokestatic boxInt : (I)Ljava/lang/Integer;
    //   138: goto -> 142
    //   141: aconst_null
    //   142: areturn
    //   143: new java/lang/IllegalStateException
    //   146: dup
    //   147: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   149: invokespecial <init> : (Ljava/lang/String;)V
    //   152: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #29	-> 53
    //   #31	-> 84
    //   #30	-> 84
    //   #29	-> 114
    //   #31	-> 126
    //   #31	-> 130
    //   #30	-> 131
    //   #31	-> 141
    //   #30	-> 142
    //   #29	-> 143
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	153	0	$completion	Lkotlin/coroutines/Continuation;
    //   45	98	3	$continuation	Lkotlin/coroutines/Continuation;
    //   50	93	2	$result	Ljava/lang/Object;
  }
  
  @DebugMetadata(f = "MatterhornEnvironmentServer.kt", l = {30}, i = {}, s = {}, n = {}, m = "getMatterhornEnvironmentServerPort", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornEnvironmentServerKt")
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  static final class MatterhornEnvironmentServerKt$getMatterhornEnvironmentServerPort$1 extends ContinuationImpl {
    int label;
    
    MatterhornEnvironmentServerKt$getMatterhornEnvironmentServerPort$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return MatterhornEnvironmentServerKt.getMatterhornEnvironmentServerPort((Continuation<? super Integer>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\MatterhornEnvironmentServerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */