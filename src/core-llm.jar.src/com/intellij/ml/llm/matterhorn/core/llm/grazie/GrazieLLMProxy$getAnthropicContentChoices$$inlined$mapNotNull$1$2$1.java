package com.intellij.ml.llm.matterhorn.core.llm.grazie;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
@DebugMetadata(f = "GrazieLLMProxy.kt", l = {237}, i = {}, s = {}, n = {}, m = "emit", c = "com.intellij.ml.llm.matterhorn.core.llm.grazie.GrazieLLMProxy$getAnthropicContentChoices$$inlined$mapNotNull$1$2")
public final class null extends ContinuationImpl {
  int label;
  
  Object L$0;
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GrazieLLMProxy$getAnthropicContentChoices$$inlined$mapNotNull$1.null.this.emit(null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\grazie\GrazieLLMProxy$getAnthropicContentChoices$$inlined$mapNotNull$1$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */