package com.intellij.ml.llm.matterhorn.ej.core.relevance;

import com.intellij.ml.llm.matterhorn.ArtifactResponse;
import com.intellij.ml.llm.matterhorn.ExecutionContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ProjectStrWorker.kt", l = {155}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"this", "useSlash", "rootNode", "nodeLimitExceeded"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.ProjectStrWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ProjectStrWorker$produceArtifact$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  ProjectStrWorker$produceArtifact$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ProjectStrWorker.this.produceArtifact((ProjectStrInput)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<ProjectStrResponse>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\ProjectStrWorker$produceArtifact$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */