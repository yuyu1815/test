/*    */ package ai.grazie.model.task.exec;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskID;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\024HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\025"}, d2 = {"Lai/grazie/model/task/exec/TaskCall;", "", "id", "Lai/grazie/model/task/id/TaskID;", "parameters", "Lai/grazie/model/task/exec/TaskParameters;", "(Lai/grazie/model/task/id/TaskID;Lai/grazie/model/task/exec/TaskParameters;)V", "getId", "()Lai/grazie/model/task/id/TaskID;", "getParameters", "()Lai/grazie/model/task/exec/TaskParameters;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model-task"})
/*    */ public final class TaskCall {
/*    */   @NotNull
/*    */   private final TaskID id;
/*    */   
/* 11 */   public TaskCall(@NotNull TaskID id, @NotNull TaskParameters parameters) { this.id = id; this.parameters = parameters; } @NotNull private final TaskParameters parameters; @NotNull public final TaskID getId() { return this.id; } @NotNull public final TaskParameters getParameters() { return this.parameters; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TaskID component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskParameters component2() {
/*    */     return this.parameters;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskCall copy(@NotNull TaskID id, @NotNull TaskParameters parameters) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(parameters, "parameters");
/*    */     return new TaskCall(id, parameters);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TaskCall(id=" + this.id + ", parameters=" + this.parameters + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.id.hashCode();
/*    */     return result * 31 + this.parameters.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TaskCall))
/*    */       return false; 
/*    */     TaskCall taskCall = (TaskCall)other;
/*    */     return !Intrinsics.areEqual(this.id, taskCall.id) ? false : (!!Intrinsics.areEqual(this.parameters, taskCall.parameters));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\exec\TaskCall.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */