package ai.grazie.model.task;

import ai.grazie.model.task.id.TaskNameDescriptor;
import ai.grazie.model.task.id.TaskTagDescriptor;
import ai.grazie.model.task.validation.TaskSchema;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\rø\001\000\002\006\n\004\b!0\001¨\006\016À\006\001"}, d2 = {"Lai/grazie/model/task/Task;", "", "nameDescriptor", "Lai/grazie/model/task/id/TaskNameDescriptor;", "getNameDescriptor", "()Lai/grazie/model/task/id/TaskNameDescriptor;", "schema", "Lai/grazie/model/task/validation/TaskSchema;", "getSchema", "()Lai/grazie/model/task/validation/TaskSchema;", "tagDescriptor", "Lai/grazie/model/task/id/TaskTagDescriptor;", "getTagDescriptor", "()Lai/grazie/model/task/id/TaskTagDescriptor;", "model-task"})
public interface Task {
  @NotNull
  TaskNameDescriptor getNameDescriptor();
  
  @NotNull
  TaskTagDescriptor getTagDescriptor();
  
  @NotNull
  TaskSchema getSchema();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\Task.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */