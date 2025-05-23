package ai.grazie.model.llm.tokens;

import ai.grazie.model.llm.chat.v5.LLMChat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LLMTokenCounter.kt", l = {47}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "chat"}, m = "count", c = "ai.grazie.model.llm.tokens.LLMTokenCounter")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class LLMTokenCounter$count$4 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  LLMTokenCounter$count$4(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LLMTokenCounter.this.count((LLMChat)null, (Continuation<? super Integer>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\tokens\LLMTokenCounter$count$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */