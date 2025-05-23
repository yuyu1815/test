package com.intellij.ml.llm.matterhorn.ej.core.history_processors;

import com.intellij.ml.llm.matterhorn.ArtifactResponse;
import com.intellij.ml.llm.matterhorn.ExecutionContext;
import com.intellij.ml.llm.matterhorn.ej.core.AgentState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AddStepsInfo.kt", l = {33}, i = {}, s = {}, n = {}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.AddStepsInfo")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AddStepsInfo$produceArtifact$1 extends ContinuationImpl {
  int label;
  
  AddStepsInfo$produceArtifact$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AddStepsInfo.this.produceArtifact((AgentState)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<Last5ObservationsResponse>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\AddStepsInfo$produceArtifact$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */