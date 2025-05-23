package ai.grazie.model.task.validation;

import ai.grazie.model.task.engine.TasksRegistry;
import ai.grazie.utils.data.DataHolder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H&ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Lai/grazie/model/task/validation/TaskSchema;", "", "validateParameters", "Lai/grazie/model/task/validation/TaskSchemaValidationResult;", "parameters", "Lai/grazie/utils/data/DataHolder;", "context", "Lai/grazie/model/task/engine/TasksRegistry;", "model-task"})
public interface TaskSchema {
  @NotNull
  TaskSchemaValidationResult validateParameters(@NotNull DataHolder paramDataHolder, @NotNull TasksRegistry paramTasksRegistry);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\validation\TaskSchema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */