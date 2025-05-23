package com.intellij.ml.llm.matterhorn.ej.ui.tasks;

import com.intellij.ml.llm.matterhorn.HumanInLoopResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "HumanInLoopImpl.kt", l = {99, 99, 106, 107, 119}, i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0"}, n = {"this", "path", "before", "after", "this", "path", "before", "after", "this", "path", "before", "after", "deferredResponse", "deferredResponse"}, m = "shouldAllowEdit", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.HumanInLoopImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class HumanInLoopImpl$shouldAllowEdit$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  int label;
  
  HumanInLoopImpl$shouldAllowEdit$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return HumanInLoopImpl.this.shouldAllowEdit(null, null, null, (Continuation<? super HumanInLoopResponse>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\HumanInLoopImpl$shouldAllowEdit$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */