/*    */ package ai.grazie.model.task.library.v2.chat;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001B\007\b\004¢\006\002\020\002R\024\020\003\032\004\030\0010\004X¦\004¢\006\006\032\004\b\005\020\006\001\002\007\b¨\006\t"}, d2 = {"Lai/grazie/model/task/library/v2/chat/TasksChatTextMessage;", "Lai/grazie/model/task/library/v2/chat/TasksChatMessage;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "Lai/grazie/model/task/library/v2/chat/TasksChatAssistantMessage;", "Lai/grazie/model/task/library/v2/chat/TasksChatUserMessage;", "model-task"})
/*    */ public abstract class TasksChatTextMessage
/*    */   extends TasksChatMessage
/*    */ {
/*    */   private TasksChatTextMessage() {
/* 36 */     super(null);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public abstract String getContent();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\TasksChatTextMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */