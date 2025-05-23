package ai.grazie.model.task.id;

import ai.grazie.model.task.annotation.ExperimentalTask;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\002\006\007R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005\001\004\b\t\n\013ø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Lai/grazie/model/task/id/TaskTagDescriptor;", "", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "Experimental", "Stable", "Lai/grazie/model/task/id/Hidden;", "Lai/grazie/model/task/id/Internal;", "Lai/grazie/model/task/id/TaskTagDescriptor$Experimental;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "model-task"})
public interface TaskTagDescriptor {
  @NotNull
  TaskTag getTag();
  
  @ExperimentalTask
  @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\n\n\002\030\002\n\002\030\002\n\000\bg\030\0002\0020\001ø\001\000\002\006\n\004\b!0\001¨\006\002À\006\001"}, d2 = {"Lai/grazie/model/task/id/TaskTagDescriptor$Experimental;", "Lai/grazie/model/task/id/TaskTagDescriptor;", "model-task"})
  public static interface Experimental extends TaskTagDescriptor {}
  
  @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\n\n\002\030\002\n\002\030\002\n\000\bf\030\0002\0020\001ø\001\000\002\006\n\004\b!0\001¨\006\002À\006\001"}, d2 = {"Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "Lai/grazie/model/task/id/TaskTagDescriptor;", "model-task"})
  public static interface Stable extends TaskTagDescriptor {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\id\TaskTagDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */