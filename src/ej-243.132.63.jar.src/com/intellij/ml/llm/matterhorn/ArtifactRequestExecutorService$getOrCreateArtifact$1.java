package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ArtifactRequestExecutorService.kt", l = {208, 238, 250, 251, 253, 322, 281, 322, 315, 316, 317, 322, 322}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 6, 6, 8, 8, 9, 9, 10, 10}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, n = {"this", "request", "source", "context", "supervisorScope", "artifactId", "this", "request", "context", "supervisorScope", "artifactId", "executor", "subContext", "stopwatch", "teamCityTestCase", "flowId", "this", "context", "supervisorScope", "artifactId", "executor", "subContext", "stopwatch", "teamCityTestCase", "flowId", "requestedArtifact", "this", "context", "supervisorScope", "artifactId", "executor", "subContext", "stopwatch", "teamCityTestCase", "flowId", "requestedArtifact", "this", "context", "supervisorScope", "artifactId", "executor", "subContext", "stopwatch", "teamCityTestCase", "flowId", "requestedArtifact", "subContext", "cancelledArtifact", "subContext", "failedArtifact", "subContext", "failedArtifact", "subContext", "failedArtifact"}, m = "getOrCreateArtifact", c = "com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ArtifactRequestExecutorService$getOrCreateArtifact$1<I, O> extends ContinuationImpl {
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
  
  int label;
  
  ArtifactRequestExecutorService$getOrCreateArtifact$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ArtifactRequestExecutorService.this.getOrCreateArtifact(null, null, null, null, (Continuation<? super ArtifactRequestExecutorService.ArtifactResult>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactRequestExecutorService$getOrCreateArtifact$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */