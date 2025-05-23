package com.intellij.ml.llm.matterhorn.ej.core.tasks;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "RecentTaskChainServiceImpl.kt", l = {123, 139, 140}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1"}, n = {"this", "taskStorage", "changedChains", "inconsistentChains", "finalTaskChainsEntities", "chain", "taskStorage", "inconsistentChains", "finalTaskChainsEntities", "taskStorage", "finalTaskChainsEntities"}, m = "patchInconsistentTasks", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChainServiceImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class RecentTaskChainServiceImpl$patchInconsistentTasks$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  int label;
  
  RecentTaskChainServiceImpl$patchInconsistentTasks$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return RecentTaskChainServiceImpl.access$patchInconsistentTasks(RecentTaskChainServiceImpl.this, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\RecentTaskChainServiceImpl$patchInconsistentTasks$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */