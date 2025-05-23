/*    */ package ai.grazie.model.task.id;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\rHÖ\001J\t\020\016\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lai/grazie/model/task/id/TaskModelID;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "model-task"})
/*    */ public final class TaskModelID {
/*    */   @NotNull
/*    */   private final String id;
/*    */   
/* 11 */   public TaskModelID(@NotNull String id) { this.id = id; } @NotNull public final String getId() { return this.id; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskModelID copy(@NotNull String id) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     return new TaskModelID(id);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TaskModelID(id=" + this.id + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.id.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TaskModelID))
/*    */       return false; 
/*    */     TaskModelID taskModelID = (TaskModelID)other;
/*    */     return !!Intrinsics.areEqual(this.id, taskModelID.id);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\id\TaskModelID.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */