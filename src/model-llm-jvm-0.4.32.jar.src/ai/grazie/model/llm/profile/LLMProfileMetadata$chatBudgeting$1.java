package ai.grazie.model.llm.profile;

import ai.grazie.model.llm.bdg.LLMChatBudgeting;
import ai.grazie.utils.mpp.money.Credit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LLMProfileMetadata.kt", l = {52}, i = {}, s = {}, n = {}, m = "chatBudgeting", c = "ai.grazie.model.llm.profile.LLMProfileMetadata")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class LLMProfileMetadata$chatBudgeting$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  LLMProfileMetadata$chatBudgeting$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LLMProfileMetadata.this.chatBudgeting(null, (Continuation<? super LLMChatBudgeting<Credit>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\LLMProfileMetadata$chatBudgeting$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */