package com.intellij.ml.llm.matterhorn.ej.core.history_processors;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "CompressHistoryProcessor.kt", l = {276, 283}, i = {0, 0, 1, 1, 1}, s = {"L$0", "Z$0", "L$0", "L$1", "Z$0"}, n = {"codeRanges", "fileWasEdited", "codeRanges", "path", "fileWasEdited"}, m = "printOneFile", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.CompressHistoryProcessor")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class CompressHistoryProcessor$printOneFile$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  boolean Z$0;
  
  int label;
  
  CompressHistoryProcessor$printOneFile$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return CompressHistoryProcessor.access$printOneFile(CompressHistoryProcessor.this, null, null, null, false, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\CompressHistoryProcessor$printOneFile$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */