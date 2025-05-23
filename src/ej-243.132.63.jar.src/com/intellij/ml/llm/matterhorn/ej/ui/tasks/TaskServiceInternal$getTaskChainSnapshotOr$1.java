package com.intellij.ml.llm.matterhorn.ej.ui.tasks;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "TaskServiceInternal.kt", l = {530, 68, 69, 71, 76, 555, 104, 565}, i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 7, 7}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3"}, n = {"this", "taskChainId", "onAbsent", "$this$withLock_u24default$iv", "this", "taskChainId", "onAbsent", "this", "taskChainId", "onAbsent", "existingTaskChainEntity", "this", "taskChainId", "onAbsent", "existingTaskChainEntity", "destination$iv$iv", "taskId", "this", "taskChainId", "onAbsent", "existingTaskChainEntity", "destination$iv$iv", "loadedTask", "this", "taskChainId", "liveChain", "$this$withLock_u24default$iv", "this", "taskChainId", "this", "taskChainId", "chainSnapshot", "$this$withLock_u24default$iv"}, m = "getTaskChainSnapshotOr", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class TaskServiceInternal$getTaskChainSnapshotOr$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  int label;
  
  TaskServiceInternal$getTaskChainSnapshotOr$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return TaskServiceInternal.access$getTaskChainSnapshotOr(TaskServiceInternal.this, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\TaskServiceInternal$getTaskChainSnapshotOr$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */