/*    */ package ai.grazie.model.task;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lai/grazie/model/task/TaskCallData;", "", "taskName", "Lai/grazie/model/task/id/TaskName;", "parameters", "Lai/grazie/utils/data/DataHolder;", "(Lai/grazie/model/task/id/TaskName;Lai/grazie/utils/data/DataHolder;)V", "getParameters", "()Lai/grazie/utils/data/DataHolder;", "getTaskName", "()Lai/grazie/model/task/id/TaskName;", "model-task"})
/*    */ public final class TaskCallData {
/*    */   @NotNull
/*    */   private final TaskName taskName;
/*    */   
/*  9 */   public TaskCallData(@NotNull TaskName taskName, @NotNull DataHolder parameters) { this.taskName = taskName;
/* 10 */     this.parameters = parameters; } @NotNull private final DataHolder parameters; @NotNull public final DataHolder getParameters() { return this.parameters; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TaskName getTaskName() {
/*    */     return this.taskName;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\TaskCallData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */