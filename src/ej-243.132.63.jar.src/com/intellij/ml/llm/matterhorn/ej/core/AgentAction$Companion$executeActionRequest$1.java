package com.intellij.ml.llm.matterhorn.ej.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AgentActions.kt", l = {108, 110, 122, 156, 159, 165, 165, 165}, i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1"}, n = {"request", "context", "action", "output", "request", "context", "availableActions", "maxOutputLineLength", "maxOutputLines", "action", "output", "request", "context", "maxOutputLineLength", "maxOutputLines", "action", "output", "executor", "workDir", "command", "humanInLoop", "request", "context", "action", "output", "command", "humanInLoop", "job", "request", "context", "action", "output", "command", "humanInLoop", "job", "request", "context", "action", "output", "request", "context", "request", "context"}, m = "executeActionRequest", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentAction$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AgentAction$Companion$executeActionRequest$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  Object L$7;
  
  Object L$8;
  
  Object L$9;
  
  int label;
  
  AgentAction$Companion$executeActionRequest$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AgentAction.Companion.this.executeActionRequest(null, null, null, null, null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentAction$Companion$executeActionRequest$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */