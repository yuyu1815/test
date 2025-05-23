package com.intellij.ml.llm.matterhorn.ej.core.critique;

import com.intellij.ml.llm.matterhorn.ArtifactResponse;
import com.intellij.ml.llm.matterhorn.ExecutionContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "NebiusCritique.kt", l = {75, 81, 84}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "I$1"}, n = {"this", "input", "context", "result", "critiqueSystemPrompt", "observations", "this", "input", "context", "result", "critiqueSystemPrompt", "observations", "actionToRank", "idx", "this", "input", "context", "result", "critiqueSystemPrompt", "observations", "actionToRank", "idx"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.NebiusCritique")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class NebiusCritique$produceArtifact$1 extends ContinuationImpl {
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
  
  int I$1;
  
  int label;
  
  NebiusCritique$produceArtifact$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return NebiusCritique.this.produceArtifact((CritiqueInput)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<CritiqueResponse>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\NebiusCritique$produceArtifact$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */