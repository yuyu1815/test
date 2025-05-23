package ai.grazie.model.task.engine;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "TasksExecutor.kt", l = {56}, i = {}, s = {}, n = {}, m = "canExecute", c = "ai.grazie.model.task.engine.AggregatedTasksExecutor")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class AggregatedTasksExecutor$canExecute$1 extends ContinuationImpl {
  int label;
  
  AggregatedTasksExecutor$canExecute$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AggregatedTasksExecutor.this.canExecute(null, null, (Continuation<? super Boolean>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\AggregatedTasksExecutor$canExecute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */