/*    */ package ai.grazie.model.task.engine;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020\034\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\bf\030\000 \n2\0020\001:\001\nJ\023\020\007\032\004\030\0010\0042\006\020\b\032\0020\tH¦\002R\030\020\002\032\b\022\004\022\0020\0040\003X¦\004¢\006\006\032\004\b\005\020\006ø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Lai/grazie/model/task/engine/TasksRegistry;", "Lai/grazie/model/task/roster/TasksRoster;", "tasks", "", "Lai/grazie/model/task/Task;", "getTasks", "()Ljava/lang/Iterable;", "get", "id", "Lai/grazie/model/task/id/TaskID;", "Companion", "model-task"})
/*    */ public interface TasksRegistry extends TasksRoster {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   Iterable<Task> getTasks();
/*    */   
/*    */   @Nullable
/*    */   Task get(@NotNull TaskID paramTaskID);
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\034\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\024\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0070\006¨\006\b"}, d2 = {"Lai/grazie/model/task/engine/TasksRegistry$Companion;", "", "()V", "of", "Lai/grazie/model/task/engine/TasksRegistry;", "tasks", "", "Lai/grazie/model/task/Task;", "model-task"})
/*    */   public static final class Companion {
/*    */     @NotNull
/*    */     public final TasksRegistry of(@NotNull Iterable<? extends Task> tasks) {
/* 18 */       Intrinsics.checkNotNullParameter(tasks, "tasks"); return new DefaultTasksRegistry(tasks);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\TasksRegistry.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */