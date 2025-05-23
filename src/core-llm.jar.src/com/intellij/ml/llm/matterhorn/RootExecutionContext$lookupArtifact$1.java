package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "RootExecutionContext.kt", l = {183}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "artifact"}, m = "lookupArtifact", c = "com.intellij.ml.llm.matterhorn.RootExecutionContext")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class RootExecutionContext$lookupArtifact$1<O> extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  RootExecutionContext$lookupArtifact$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return RootExecutionContext.this.lookupArtifact(null, (Continuation<? super Artifactual>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\RootExecutionContext$lookupArtifact$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */