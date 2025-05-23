package com.intellij.ml.llm.matterhorn.ej.core.critique;

import com.intellij.ml.llm.matterhorn.ArtifactResponse;
import com.intellij.ml.llm.matterhorn.ExecutionContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AgentReportCritique.kt", l = {85, 91, 91, 92, 92, 94, 94, 106, 109, 109}, i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "I$0", "L$0", "I$0"}, n = {"this", "input", "context", "propertyProvider", "this", "context", "propertyProvider", "editCritiqueParameters", "issue", "actionsToRank", "choiceMessage", "this", "context", "propertyProvider", "editCritiqueParameters", "issue", "actionsToRank", "choiceMessage", "this", "context", "propertyProvider", "editCritiqueParameters", "issue", "actionsToRank", "choiceMessage", "this", "context", "propertyProvider", "editCritiqueParameters", "issue", "actionsToRank", "choiceMessage", "this", "context", "propertyProvider", "editCritiqueParameters", "issue", "actionsToRank", "choiceMessage", "it", "this", "context", "propertyProvider", "editCritiqueParameters", "issue", "actionsToRank", "choiceMessage", "this", "context", "propertyProvider", "actionsToRank", "choiceMessage", "actionsToRank", "choiceMessage", "response", "bestActionIdx", "actionsToRank", "bestActionIdx"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.TaskReportReportCritique")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class TaskReportReportCritique$produceArtifact$1 extends ContinuationImpl {
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
  
  TaskReportReportCritique$produceArtifact$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return TaskReportReportCritique.this.produceArtifact((TaskReportCritiqueInput)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<TaskReportCritiqueResponse>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\TaskReportReportCritique$produceArtifact$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */