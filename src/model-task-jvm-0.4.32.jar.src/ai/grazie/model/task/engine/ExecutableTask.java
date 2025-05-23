package ai.grazie.model.task.engine;

import ai.grazie.model.task.Task;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005ø\001\000\002\006\n\004\b!0\001¨\006\006À\006\001"}, d2 = {"Lai/grazie/model/task/engine/ExecutableTask;", "Lai/grazie/model/task/Task;", "executor", "Lai/grazie/model/task/engine/TasksExecutor;", "getExecutor", "()Lai/grazie/model/task/engine/TasksExecutor;", "model-task"})
public interface ExecutableTask extends Task {
  @NotNull
  TasksExecutor getExecutor();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\ExecutableTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */