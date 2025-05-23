package ai.grazie.model.llm.bdg;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LLMCompletionBudgeting.kt", l = {36}, i = {0}, s = {"L$0"}, n = {"this"}, m = "generation", c = "ai.grazie.model.llm.bdg.LLMCompletionBudgeting")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class LLMCompletionBudgeting$generation$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  LLMCompletionBudgeting$generation$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LLMCompletionBudgeting.this.generation(null, (Continuation<? super LLMBudget<T>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\bdg\LLMCompletionBudgeting$generation$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */