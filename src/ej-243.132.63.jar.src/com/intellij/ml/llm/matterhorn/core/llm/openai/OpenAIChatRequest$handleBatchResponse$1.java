package com.intellij.ml.llm.matterhorn.core.llm.openai;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "OpenAIChatRequest.kt", l = {68, 71, 75}, i = {1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "response", "stopReasons", "this", "stopReasons", "json"}, m = "handleBatchResponse", c = "com.intellij.ml.llm.matterhorn.core.llm.openai.OpenAIChatRequest")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class OpenAIChatRequest$handleBatchResponse$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  OpenAIChatRequest$handleBatchResponse$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return OpenAIChatRequest.access$handleBatchResponse(OpenAIChatRequest.this, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIChatRequest$handleBatchResponse$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */