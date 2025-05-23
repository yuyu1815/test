package com.intellij.ml.llm.matterhorn.ej.idea;

import com.intellij.ml.llm.matterhorn.ej.core.AgentParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "IdeaIssueSingleStepAgentWorker.kt", l = {30, 32}, i = {0}, s = {"L$0"}, n = {"propertyProvider"}, m = "getAgentParameters", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaIssueSingleStepAgentWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class IdeaIssueSingleStepAgentWorker$getAgentParameters$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  IdeaIssueSingleStepAgentWorker$getAgentParameters$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return IdeaIssueSingleStepAgentWorker.this.getAgentParameters(null, (Continuation<? super AgentParameters>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\IdeaIssueSingleStepAgentWorker$getAgentParameters$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */