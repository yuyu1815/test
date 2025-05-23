package com.intellij.ml.llm.matterhorn.ej.core.history_processors;

import com.intellij.ml.llm.matterhorn.ArtifactResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "CompressHistoryProcessor.kt", l = {266}, i = {}, s = {}, n = {}, m = "produceArtifact$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.CompressHistoryProcessor")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class CompressHistoryProcessor$produceArtifact$1 extends ContinuationImpl {
  int label;
  
  CompressHistoryProcessor$produceArtifact$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return CompressHistoryProcessor.produceArtifact$suspendImpl(CompressHistoryProcessor.this, null, null, (Continuation<? super ArtifactResponse<CompressHistoryProcessorResponse>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\CompressHistoryProcessor$produceArtifact$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */