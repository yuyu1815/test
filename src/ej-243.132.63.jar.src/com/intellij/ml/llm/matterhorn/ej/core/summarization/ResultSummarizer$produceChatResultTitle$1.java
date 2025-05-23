package com.intellij.ml.llm.matterhorn.ej.core.summarization;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ResultSummarizer.kt", l = {50}, i = {}, s = {}, n = {}, m = "produceChatResultTitle", c = "com.intellij.ml.llm.matterhorn.ej.core.summarization.ResultSummarizer")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ResultSummarizer$produceChatResultTitle$1 extends ContinuationImpl {
  int label;
  
  ResultSummarizer$produceChatResultTitle$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ResultSummarizer.this.produceChatResultTitle(null, null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\summarization\ResultSummarizer$produceChatResultTitle$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */