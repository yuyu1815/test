package com.intellij.ml.llm.matterhorn.ej.webstorm;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "WebStormIssueAgentWorker.kt", l = {17, 18}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"executor", "executionDir"}, m = "setupCommandExecutor", c = "com.intellij.ml.llm.matterhorn.ej.webstorm.WebStormIssueAgentWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class WebStormIssueAgentWorker$setupCommandExecutor$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  WebStormIssueAgentWorker$setupCommandExecutor$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return WebStormIssueAgentWorker.this.setupCommandExecutor(null, null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\webstorm\WebStormIssueAgentWorker$setupCommandExecutor$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */