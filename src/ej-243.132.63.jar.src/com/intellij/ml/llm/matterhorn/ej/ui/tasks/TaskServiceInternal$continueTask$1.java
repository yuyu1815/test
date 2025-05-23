package com.intellij.ml.llm.matterhorn.ej.ui.tasks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "TaskServiceInternal.kt", l = {333, 334}, i = {}, s = {}, n = {}, m = "continueTask", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class TaskServiceInternal$continueTask$1 extends ContinuationImpl {
  int label;
  
  TaskServiceInternal$continueTask$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return TaskServiceInternal.this.continueTask(null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\TaskServiceInternal$continueTask$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */