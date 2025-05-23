package com.intellij.ml.llm.matterhorn.core.llm.grazie;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GrazieLLMProxy.kt", l = {214, 233}, i = {0}, s = {"L$0"}, n = {"this"}, m = "getOpenAIContentChoices", c = "com.intellij.ml.llm.matterhorn.core.llm.grazie.GrazieLLMProxy")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class GrazieLLMProxy$getOpenAIContentChoices$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  GrazieLLMProxy$getOpenAIContentChoices$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GrazieLLMProxy.access$getOpenAIContentChoices(GrazieLLMProxy.this, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\grazie\GrazieLLMProxy$getOpenAIContentChoices$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */