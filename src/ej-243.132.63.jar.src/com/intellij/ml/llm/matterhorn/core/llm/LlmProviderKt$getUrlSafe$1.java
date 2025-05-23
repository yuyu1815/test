package com.intellij.ml.llm.matterhorn.core.llm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LlmProvider.kt", l = {54}, i = {0}, s = {"L$0"}, n = {"$this$getUrlSafe"}, m = "getUrlSafe", c = "com.intellij.ml.llm.matterhorn.core.llm.LlmProviderKt")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class LlmProviderKt$getUrlSafe$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  LlmProviderKt$getUrlSafe$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LlmProviderKt.getUrlSafe(null, null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\LlmProviderKt$getUrlSafe$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */