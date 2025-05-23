package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ArtifactRequestExecutorService.kt", l = {154, 164, 165, 166}, i = {0, 0, 1, 2, 3}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"}, n = {"this", "context", "artifact", "artifact", "artifact"}, m = "getArtifactCore", c = "com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ArtifactRequestExecutorService$getArtifactCore$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  ArtifactRequestExecutorService$getArtifactCore$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ArtifactRequestExecutorService.access$getArtifactCore(ArtifactRequestExecutorService.this, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactRequestExecutorService$getArtifactCore$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */