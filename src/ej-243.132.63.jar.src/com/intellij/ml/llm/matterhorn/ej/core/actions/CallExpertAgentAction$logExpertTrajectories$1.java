package com.intellij.ml.llm.matterhorn.ej.core.actions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "CallExpertAction.kt", l = {125, 128, 130}, i = {0, 0, 0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, n = {"context", "prompt", "response", "curTrajectoryElementAgent", "context", "response", "curTrajectoryElementAgent"}, m = "logExpertTrajectories", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.CallExpertAgentAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class CallExpertAgentAction$logExpertTrajectories$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  CallExpertAgentAction$logExpertTrajectories$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return CallExpertAgentAction.access$logExpertTrajectories(CallExpertAgentAction.this, null, null, null, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\CallExpertAgentAction$logExpertTrajectories$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */