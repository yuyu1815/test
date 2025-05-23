package com.intellij.ml.llm.matterhorn.ej.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {597}, i = {}, s = {}, n = {}, m = "createCritiqueResponse", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AbstractIssueSingleStepAgentWorker$createCritiqueResponse$1 extends ContinuationImpl {
  int label;
  
  AbstractIssueSingleStepAgentWorker$createCritiqueResponse$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AbstractIssueSingleStepAgentWorker.access$createCritiqueResponse(AbstractIssueSingleStepAgentWorker.this, null, 0, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractIssueSingleStepAgentWorker$createCritiqueResponse$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */