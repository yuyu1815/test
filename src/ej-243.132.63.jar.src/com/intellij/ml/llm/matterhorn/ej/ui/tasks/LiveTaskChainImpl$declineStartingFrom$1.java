package com.intellij.ml.llm.matterhorn.ej.ui.tasks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "TaskServiceInternal.kt", l = {481}, i = {0, 0, 0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "I$0"}, n = {"this", "firstDeclinedId", "$this$update$iv", "prevValue$iv", "result", "declinedTask", "declining"}, m = "declineStartingFrom", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.LiveTaskChainImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class LiveTaskChainImpl$declineStartingFrom$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  int I$0;
  
  int label;
  
  LiveTaskChainImpl$declineStartingFrom$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LiveTaskChainImpl.this.declineStartingFrom(null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\LiveTaskChainImpl$declineStartingFrom$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */