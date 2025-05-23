package com.intellij.ml.llm.matterhorn.ej.core.actions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "CallExpertAction.kt", l = {104}, i = {}, s = {}, n = {}, m = "parseArguments", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.CallExpertAgentAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class CallExpertAgentAction$parseArguments$1 extends ContinuationImpl {
  int label;
  
  CallExpertAgentAction$parseArguments$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return CallExpertAgentAction.access$parseArguments(CallExpertAgentAction.this, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\CallExpertAgentAction$parseArguments$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */