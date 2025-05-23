package com.intellij.ml.llm.matterhorn.activation.data.repos;

import com.intellij.ml.llm.matterhorn.activation.data.model.RegionUrl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepositoryImpl;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository;", "<init>", "()V", "mapRegionUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/RegionUrl;", "rawUrl", "", "mapRegionUrl-dorYjGE", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data.repos"})
public final class JunieRegionUrlRepositoryImpl implements JunieRegionUrlRepository {
  @Nullable
  public Object mapRegionUrl-dorYjGE(@NotNull String rawUrl, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepositoryImpl$mapRegionUrl$1
    //   4: ifeq -> 39
    //   7: aload_2
    //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepositoryImpl$mapRegionUrl$1
    //   11: astore #6
    //   13: aload #6
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #6
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 50
    //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepositoryImpl$mapRegionUrl$1
    //   42: dup
    //   43: aload_0
    //   44: aload_2
    //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepositoryImpl;Lkotlin/coroutines/Continuation;)V
    //   48: astore #6
    //   50: aload #6
    //   52: getfield result : Ljava/lang/Object;
    //   55: astore #5
    //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   60: astore #7
    //   62: aload #6
    //   64: getfield label : I
    //   67: tableswitch default -> 151, 0 -> 88, 1 -> 131
    //   88: aload #5
    //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   93: aload_1
    //   94: invokestatic tryMapUrl : (Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;
    //   97: astore #4
    //   99: aload #4
    //   101: ldc 'tryMapUrl(...)'
    //   103: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   106: aload #4
    //   108: checkcast java/util/concurrent/CompletionStage
    //   111: aload #6
    //   113: aload #6
    //   115: iconst_1
    //   116: putfield label : I
    //   119: invokestatic await : (Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   122: dup
    //   123: aload #7
    //   125: if_acmpne -> 138
    //   128: aload #7
    //   130: areturn
    //   131: aload #5
    //   133: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   136: aload #5
    //   138: checkcast java/lang/String
    //   141: astore_3
    //   142: aload_3
    //   143: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   146: aload_3
    //   147: invokestatic constructor-impl : (Ljava/lang/String;)Ljava/lang/String;
    //   150: areturn
    //   151: new java/lang/IllegalStateException
    //   154: dup
    //   155: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   157: invokespecial <init> : (Ljava/lang/String;)V
    //   160: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #19	-> 60
    //   #20	-> 93
    //   #19	-> 128
    //   #21	-> 142
    //   #19	-> 151
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   93	6	1	rawUrl	Ljava/lang/String;
    //   142	9	3	mappedUrl	Ljava/lang/String;
    //   0	161	2	$completion	Lkotlin/coroutines/Continuation;
    //   50	101	6	$continuation	Lkotlin/coroutines/Continuation;
    //   57	94	5	$result	Ljava/lang/Object;
  }
  
  @DebugMetadata(f = "JunieRegionUrlRepository.kt", l = {20}, i = {}, s = {}, n = {}, m = "mapRegionUrl-dorYjGE", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieRegionUrlRepositoryImpl")
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  static final class JunieRegionUrlRepositoryImpl$mapRegionUrl$1 extends ContinuationImpl {
    int label;
    
    JunieRegionUrlRepositoryImpl$mapRegionUrl$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return (JunieRegionUrlRepositoryImpl.this.mapRegionUrl-dorYjGE(null, (Continuation<? super RegionUrl>)this) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? JunieRegionUrlRepositoryImpl.this.mapRegionUrl-dorYjGE(null, (Continuation<? super RegionUrl>)this) : RegionUrl.box-impl((String)JunieRegionUrlRepositoryImpl.this.mapRegionUrl-dorYjGE(null, (Continuation<? super RegionUrl>)this));
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieRegionUrlRepositoryImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */