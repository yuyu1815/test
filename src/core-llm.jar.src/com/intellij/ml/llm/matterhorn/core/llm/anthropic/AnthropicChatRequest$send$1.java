package com.intellij.ml.llm.matterhorn.core.llm.anthropic;

import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AnthropicChatRequest.kt", l = {125}, i = {0}, s = {"L$0"}, n = {"$this"}, m = "send$suspendImpl", c = "com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicChatRequest")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AnthropicChatRequest$send$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  AnthropicChatRequest$send$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AnthropicChatRequest.send$suspendImpl(AnthropicChatRequest.this, null, (Continuation<? super AIAnswer>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicChatRequest$send$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */