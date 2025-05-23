package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ExecutionContext.kt", l = {121}, i = {0}, s = {"L$0"}, n = {"this"}, m = "getOrCreateArtifact", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ExecutionContext$getOrCreateArtifact$2<I, O> extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  ExecutionContext$getOrCreateArtifact$2(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ExecutionContext.this.getOrCreateArtifact((ArtifactRequest<?, ?>)null, (ProjectFileStructure)null, (Continuation<? super Artifact<?>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ExecutionContext$getOrCreateArtifact$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */