package com.intellij.ml.llm.matterhorn.ej.ui.tasks;

import com.intellij.ml.llm.matterhorn.HumanInLoopResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "HumanInLoopImpl.kt", l = {58, 58, 66, 67, 79, 86}, i = {0, 0, 1, 1, 2, 2, 2, 3, 4}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$0"}, n = {"this", "action", "this", "action", "this", "action", "deferredResponse", "deferredResponse", "deferredResponse"}, m = "shouldAllowAction", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.HumanInLoopImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class HumanInLoopImpl$shouldAllowAction$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  HumanInLoopImpl$shouldAllowAction$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return HumanInLoopImpl.this.shouldAllowAction(null, (Continuation<? super HumanInLoopResponse>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\HumanInLoopImpl$shouldAllowAction$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */