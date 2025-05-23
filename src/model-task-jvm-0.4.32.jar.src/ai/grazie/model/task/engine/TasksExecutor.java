package ai.grazie.model.task.engine;

import ai.grazie.model.task.Task;
import ai.grazie.model.task.data.v3.TaskStreamData;
import ai.grazie.utils.data.DataHolder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\036\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H¦@¢\006\002\020\bJ,\020\t\032\b\022\004\022\0020\0130\n2\006\020\004\032\0020\0052\006\020\f\032\0020\r2\006\020\006\032\0020\007H¦@¢\006\002\020\016ø\001\000\002\006\n\004\b!0\001¨\006\017À\006\001"}, d2 = {"Lai/grazie/model/task/engine/TasksExecutor;", "", "canExecute", "", "task", "Lai/grazie/model/task/Task;", "context", "Lai/grazie/model/task/engine/TaskExecutionContext;", "(Lai/grazie/model/task/Task;Lai/grazie/model/task/engine/TaskExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/task/data/v3/TaskStreamData;", "parameters", "Lai/grazie/utils/data/DataHolder;", "(Lai/grazie/model/task/Task;Lai/grazie/utils/data/DataHolder;Lai/grazie/model/task/engine/TaskExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-task"})
public interface TasksExecutor {
  @Nullable
  Object canExecute(@NotNull Task paramTask, @NotNull TaskExecutionContext paramTaskExecutionContext, @NotNull Continuation<? super Boolean> paramContinuation);
  
  @Nullable
  Object execute(@NotNull Task paramTask, @NotNull DataHolder paramDataHolder, @NotNull TaskExecutionContext paramTaskExecutionContext, @NotNull Continuation<? super Flow<? extends TaskStreamData>> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\TasksExecutor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */