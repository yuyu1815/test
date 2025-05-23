package com.intellij.ml.llm.matterhorn.ej.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AgentActions.kt", l = {219, 225}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"projectRoot", "res", "projectRoot", "res"}, m = "truncateLongOutput$ej_core", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentAction$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AgentAction$Companion$truncateLongOutput$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  AgentAction$Companion$truncateLongOutput$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AgentAction.Companion.this.truncateLongOutput$ej_core(null, null, null, null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentAction$Companion$truncateLongOutput$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */