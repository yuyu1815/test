/*    */ package ai.grazie.model.task.roster;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskID;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\004\b\002\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005R\032\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lai/grazie/model/task/roster/TasksRoster$Companion$Default;", "Lai/grazie/model/task/roster/TasksRoster;", "ids", "", "Lai/grazie/model/task/id/TaskID;", "(Ljava/util/Set;)V", "getIds", "()Ljava/util/Set;", "model-task"})
/*    */ final class Default
/*    */   implements TasksRoster
/*    */ {
/*    */   @NotNull
/*    */   private final Set<TaskID> ids;
/*    */   
/*    */   public Default(@NotNull Set<TaskID> ids) {
/* 23 */     this.ids = ids; } @NotNull public Set<TaskID> getIds() { return this.ids; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\roster\TasksRoster$Companion$Default.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */