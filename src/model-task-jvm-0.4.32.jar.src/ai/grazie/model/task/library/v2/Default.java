/*    */ package ai.grazie.model.task.library.v2;
/*    */ import ai.grazie.model.task.id.TaskTag;
/*    */ import ai.grazie.model.task.id.TaskTagDescriptor;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/v2/Default;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*    */ public final class Default implements TaskTagDescriptor.Stable {
/*    */   @NotNull
/*    */   public TaskTag getTag() {
/* 11 */     return TaskTag.Companion.getDefault();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Default INSTANCE = new Default();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\Default.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */