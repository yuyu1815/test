package com.intellij.ml.llm.matterhorn.ej.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractChatAgentWorker.kt", l = {15}, i = {0}, s = {"L$0"}, n = {"state"}, m = "getResult$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractChatAgentWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AbstractChatAgentWorker$getResult$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  AbstractChatAgentWorker$getResult$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AbstractChatAgentWorker.getResult$suspendImpl(AbstractChatAgentWorker.this, null, null, (Continuation<? super AbstractIssueAgentWorker.ResultContent>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractChatAgentWorker$getResult$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */