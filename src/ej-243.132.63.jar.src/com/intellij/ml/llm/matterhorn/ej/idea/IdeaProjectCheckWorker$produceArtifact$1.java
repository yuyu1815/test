package com.intellij.ml.llm.matterhorn.ej.idea;

import com.intellij.ml.llm.matterhorn.ArtifactResponse;
import com.intellij.ml.llm.matterhorn.ExecutionContext;
import com.intellij.ml.llm.matterhorn.ej.core.ProjectCheckInput;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "IdeaProjectCheckWorker.kt", l = {21, 22, 23, 24}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "input", "agentContext", "this", "input", "agentContext", "this", "input", "agentContext"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaProjectCheckWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class IdeaProjectCheckWorker$produceArtifact$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  IdeaProjectCheckWorker$produceArtifact$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return IdeaProjectCheckWorker.this.produceArtifact((ProjectCheckInput)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<Boolean>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\IdeaProjectCheckWorker$produceArtifact$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */