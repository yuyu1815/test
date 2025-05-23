package com.intellij.ml.llm.matterhorn.ej.core.actions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GotoLineAgentAction.kt", l = {30, 43, 58}, i = {0, 1, 1, 1}, s = {"L$0", "L$0", "L$1", "L$2"}, n = {"context", "context", "lineNumber", "oldPosition"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.GotoLineAgentAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class GotoLineAgentAction$execute$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  GotoLineAgentAction$execute$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GotoLineAgentAction.this.execute(null, null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\GotoLineAgentAction$execute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */