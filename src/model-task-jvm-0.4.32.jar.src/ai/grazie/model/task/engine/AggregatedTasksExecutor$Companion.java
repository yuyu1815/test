/*    */ package ai.grazie.model.task.engine;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\034\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\007J\026\020\007\032\0020\0042\f\020\b\032\b\022\004\022\0020\n0\tH\007¨\006\013"}, d2 = {"Lai/grazie/model/task/engine/AggregatedTasksExecutor$Companion;", "", "()V", "fromRegistry", "Lai/grazie/model/task/engine/AggregatedTasksExecutor;", "registry", "Lai/grazie/model/task/engine/TasksRegistry;", "fromTasks", "tasks", "", "Lai/grazie/model/task/Task;", "model-task"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @Deprecated(message = "Use default constructor instead, deprecated on 13.12.2024")
/*    */   @NotNull
/*    */   public final AggregatedTasksExecutor fromTasks(@NotNull Iterable tasks) {
/* 67 */     Intrinsics.checkNotNullParameter(tasks, "tasks"); return new AggregatedTasksExecutor();
/*    */   }
/*    */   @Deprecated(message = "Use default constructor instead, deprecated on 13.12.2024")
/*    */   @NotNull
/*    */   public final AggregatedTasksExecutor fromRegistry(@NotNull TasksRegistry registry) {
/* 72 */     Intrinsics.checkNotNullParameter(registry, "registry"); return new AggregatedTasksExecutor();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\AggregatedTasksExecutor$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */