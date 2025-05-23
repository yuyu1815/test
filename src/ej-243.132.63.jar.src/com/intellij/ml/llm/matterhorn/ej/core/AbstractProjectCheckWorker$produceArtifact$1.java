package com.intellij.ml.llm.matterhorn.ej.core;

import com.intellij.ml.llm.matterhorn.ArtifactResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractProjectCheckWorker.kt", l = {34, 35}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"$this", "input", "agentContext"}, m = "produceArtifact$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractProjectCheckWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AbstractProjectCheckWorker$produceArtifact$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  AbstractProjectCheckWorker$produceArtifact$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AbstractProjectCheckWorker.produceArtifact$suspendImpl(AbstractProjectCheckWorker.this, null, null, (Continuation<? super ArtifactResponse<Boolean>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractProjectCheckWorker$produceArtifact$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */