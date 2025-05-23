package com.intellij.ml.llm.matterhorn.ej.core.history_processors;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "CompressHistoryProcessor.kt", l = {195, 219, 243, 254}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "input", "context", "processedObservations", "lastObservations", "historyObservations", "context", "processedObservations", "lastObservations", "context", "processedObservations", "trajectoryElementAgent", "context", "processedObservations", "trajectoryElementAgent"}, m = "processObservations", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.CompressHistoryProcessor")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class CompressHistoryProcessor$processObservations$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  int label;
  
  CompressHistoryProcessor$processObservations$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return CompressHistoryProcessor.access$processObservations(CompressHistoryProcessor.this, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\CompressHistoryProcessor$processObservations$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */