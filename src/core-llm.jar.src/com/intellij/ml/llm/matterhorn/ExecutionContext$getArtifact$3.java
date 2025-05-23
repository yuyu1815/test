package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ExecutionContext.kt", l = {189}, i = {0}, s = {"L$0"}, n = {"this"}, m = "getArtifact", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ExecutionContext$getArtifact$3<O> extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  ExecutionContext$getArtifact$3(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ExecutionContext.this.getArtifact((ArtifactType<?>)null, (Continuation<? super Artifact<?>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ExecutionContext$getArtifact$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */