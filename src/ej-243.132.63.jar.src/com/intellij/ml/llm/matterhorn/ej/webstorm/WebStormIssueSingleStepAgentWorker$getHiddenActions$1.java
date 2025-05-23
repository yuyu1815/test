package com.intellij.ml.llm.matterhorn.ej.webstorm;

import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "WebStormIssueSingleStepAgentWorker.kt", l = {22}, i = {}, s = {}, n = {}, m = "getHiddenActions", c = "com.intellij.ml.llm.matterhorn.ej.webstorm.WebStormIssueSingleStepAgentWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class WebStormIssueSingleStepAgentWorker$getHiddenActions$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  WebStormIssueSingleStepAgentWorker$getHiddenActions$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return WebStormIssueSingleStepAgentWorker.this.getHiddenActions(null, (Continuation<? super List<? extends AgentAction>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\webstorm\WebStormIssueSingleStepAgentWorker$getHiddenActions$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */