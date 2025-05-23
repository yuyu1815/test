package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ArtifactRequestExecutorService.kt", l = {193}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"this", "type", "context", "relativePath"}, m = "getArtifact", c = "com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ArtifactRequestExecutorService$getArtifact$2<O> extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  ArtifactRequestExecutorService$getArtifact$2(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ArtifactRequestExecutorService.this.getArtifact((ArtifactType<?>)null, (ExecutionContext)null, (Continuation<? super Artifactual>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ArtifactRequestExecutorService$getArtifact$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */