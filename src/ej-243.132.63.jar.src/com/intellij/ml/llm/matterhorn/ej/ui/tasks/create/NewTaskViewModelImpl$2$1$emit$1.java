package com.intellij.ml.llm.matterhorn.ej.ui.tasks.create;

import com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChain;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.collections.immutable.ImmutableCollection;

@DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {131}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "sortedRecentTaskChains"}, m = "emit", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$2$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class NewTaskViewModelImpl$2$1$emit$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  public final Object invokeSuspend(Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return NewTaskViewModelImpl.null.null.this.emit((ImmutableCollection<RecentTaskChain>)null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\create\NewTaskViewModelImpl$2$1$emit$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */