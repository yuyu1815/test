package com.intellij.ml.llm.matterhorn.ej.ui;

import com.intellij.ml.llm.matterhorn.Artifact;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ResolveIssueAgentAction.kt", l = {120, 143, 146, 162, 162}, i = {0, 1, 1, 2}, s = {"L$0", "L$0", "L$1", "L$0"}, n = {"this", "this", "context", "context"}, m = "executeMessage", c = "com.intellij.ml.llm.matterhorn.ej.ui.ExecuteArtifactRequestUserMessage")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ExecuteArtifactRequestUserMessage$executeMessage$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  ExecuteArtifactRequestUserMessage$executeMessage$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ExecuteArtifactRequestUserMessage.this.executeMessage((Continuation<? super Artifact<O>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ExecuteArtifactRequestUserMessage$executeMessage$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */