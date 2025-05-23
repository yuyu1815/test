/*    */ package ai.grazie.model.task.library.v2.chat;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\024\020\002\032\0020\0038VX\004¢\006\006\032\004\b\004\020\005R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\b\020\tø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Lai/grazie/model/task/library/v2/chat/ChatTaskSchemaDescriptor;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "functions", "Lai/grazie/model/task/library/v2/chat/FunctionsAttr;", "getFunctions", "()Lai/grazie/model/task/library/v2/chat/FunctionsAttr;", "history", "Lai/grazie/model/task/library/v2/chat/TasksChatAttr;", "getHistory", "()Lai/grazie/model/task/library/v2/chat/TasksChatAttr;", "model-task"})
/*    */ public interface ChatTaskSchemaDescriptor
/*    */   extends TaskSchemaDescriptor {
/*    */   @NotNull
/*    */   default TasksChatAttr getHistory() {
/* 12 */     return new TasksChatAttr("history");
/*    */   }
/*    */   @NotNull
/*    */   default FunctionsAttr getFunctions() {
/* 16 */     return new FunctionsAttr("functions");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\ChatTaskSchemaDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */