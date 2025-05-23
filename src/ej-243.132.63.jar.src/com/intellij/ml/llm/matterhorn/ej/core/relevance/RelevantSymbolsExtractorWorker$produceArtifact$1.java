package com.intellij.ml.llm.matterhorn.ej.core.relevance;

import com.intellij.ml.llm.matterhorn.ArtifactResponse;
import com.intellij.ml.llm.matterhorn.ExecutionContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "RelevantSymbolsExtractorWorker.kt", l = {191, 192, 198, 200, 202, 207, 209, 212, 214}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, n = {"this", "input", "context", "this", "input", "context", "context", "parameters", "extractorContext", "context", "parameters", "extractorContext", "relevantSymbols", "startTime", "context", "parameters", "extractorContext", "relevantSymbols", "relevantImports", "startTime", "context", "extractorContext", "relevantSymbols", "relevantImports", "relevantImportsStr", "context", "extractorContext", "relevantSymbols", "relevantImportsStr", "context", "relevantSymbols", "relevantImportsStr", "bestRelevantFiles"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.RelevantSymbolsExtractorWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class RelevantSymbolsExtractorWorker$produceArtifact$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  long J$0;
  
  int label;
  
  RelevantSymbolsExtractorWorker$produceArtifact$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return RelevantSymbolsExtractorWorker.this.produceArtifact((RelevantSymbolsExtractorInput)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<RelevantSymbolsExtractorResponse>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\RelevantSymbolsExtractorWorker$produceArtifact$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */