/*    */ package ai.grazie.model.task.engine;
/*    */ 
/*    */ import ai.grazie.model.task.Task;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\034\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\024\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0070\006¨\006\b"}, d2 = {"Lai/grazie/model/task/engine/TasksRegistry$Companion;", "", "()V", "of", "Lai/grazie/model/task/engine/TasksRegistry;", "tasks", "", "Lai/grazie/model/task/Task;", "model-task"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/*    */   public final TasksRegistry of(@NotNull Iterable<? extends Task> tasks) {
/* 18 */     Intrinsics.checkNotNullParameter(tasks, "tasks"); return new DefaultTasksRegistry(tasks);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\TasksRegistry$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */