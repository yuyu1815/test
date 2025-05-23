package com.intellij.ml.llm.matterhorn.ej.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AgentIssue.kt", l = {150}, i = {}, s = {}, n = {}, m = "parse", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentIssue$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AgentIssue$Companion$parse$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  AgentIssue$Companion$parse$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AgentIssue.Companion.this.parse(null, null, (Continuation<? super AgentIssue>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentIssue$Companion$parse$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */