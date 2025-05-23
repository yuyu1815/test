package com.intellij.ml.llm.matterhorn.core.llm.grazie;

import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GrazieLLMProxy.kt", l = {120, 132, 133, 143, 153}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, n = {"$this", "send", "delaysValues", "delaysValuesForRateLimit", "delayValuesForAuthenticationIssue", "currentAttempt", "$this", "send", "delaysValues", "delaysValuesForRateLimit", "delayValuesForAuthenticationIssue", "currentAttempt", "$this", "send", "delaysValues", "delaysValuesForRateLimit", "delayValuesForAuthenticationIssue", "currentAttempt", "$this", "send", "delaysValues", "delaysValuesForRateLimit", "delayValuesForAuthenticationIssue", "currentAttempt", "$this", "send", "delaysValues", "delaysValuesForRateLimit", "delayValuesForAuthenticationIssue", "currentAttempt"}, m = "sendWithRecovery$suspendImpl", c = "com.intellij.ml.llm.matterhorn.core.llm.grazie.GrazieLLMProxy")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class GrazieLLMProxy$sendWithRecovery$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  int I$0;
  
  int label;
  
  GrazieLLMProxy$sendWithRecovery$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GrazieLLMProxy.sendWithRecovery$suspendImpl(GrazieLLMProxy.this, null, (Continuation<? super AIAnswer>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\grazie\GrazieLLMProxy$sendWithRecovery$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */