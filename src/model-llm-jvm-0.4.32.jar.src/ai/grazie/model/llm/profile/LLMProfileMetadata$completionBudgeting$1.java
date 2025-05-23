package ai.grazie.model.llm.profile;

import ai.grazie.model.llm.bdg.LLMCompletionBudgeting;
import ai.grazie.utils.mpp.money.Credit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LLMProfileMetadata.kt", l = {59}, i = {}, s = {}, n = {}, m = "completionBudgeting", c = "ai.grazie.model.llm.profile.LLMProfileMetadata")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class LLMProfileMetadata$completionBudgeting$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  LLMProfileMetadata$completionBudgeting$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LLMProfileMetadata.this.completionBudgeting(null, (Continuation<? super LLMCompletionBudgeting<Credit>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\LLMProfileMetadata$completionBudgeting$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */