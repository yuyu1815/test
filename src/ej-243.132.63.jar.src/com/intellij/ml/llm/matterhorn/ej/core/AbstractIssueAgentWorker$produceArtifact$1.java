package com.intellij.ml.llm.matterhorn.ej.core;

import com.intellij.ml.llm.matterhorn.ArtifactResponse;
import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractIssueAgentWorker.kt", l = {81, 83, 84, 85, 94, 105, 149, 176}, i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0"}, n = {"$this", "input", "context", "previousTasksInfo", "$this", "input", "context", "previousTasksInfo", "executionAgentContext", "$this", "input", "context", "previousTasksInfo", "executionAgentContext", "ideInitialState", "$this", "input", "context", "previousTasksInfo", "executionAgentContext", "ideInitialState", "explicitlySelectedContextFiles", "$this", "input", "context", "executionAgentContext", "ideInitialState", "explicitlySelectedContextFiles", "agentParameters", "$this", "input", "context", "executionAgentContext", "ideInitialState", "explicitlySelectedContextFiles", "agentParameters", "agentState", "uniqueNames", "stepName", "step"}, m = "produceArtifact$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueAgentWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AbstractIssueAgentWorker$produceArtifact$1 extends ContinuationImpl {
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
  
  int I$0;
  
  int label;
  
  AbstractIssueAgentWorker$produceArtifact$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AbstractIssueAgentWorker.produceArtifact$suspendImpl(AbstractIssueAgentWorker.this, null, null, (Continuation<? super ArtifactResponse<TaskResult>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractIssueAgentWorker$produceArtifact$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */