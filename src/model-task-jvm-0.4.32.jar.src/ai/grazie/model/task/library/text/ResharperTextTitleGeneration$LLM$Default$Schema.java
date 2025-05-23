/*    */ package ai.grazie.model.task.library.text;
/*    */ 
/*    */ import ai.grazie.model.task.exec.OptLLMChatAttr;
/*    */ import ai.grazie.model.task.exec.TaskParametersAttributes;
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lai/grazie/model/task/library/text/ResharperTextTitleGeneration$LLM$Default$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/model/task/exec/OptLLMChatAttr;", "getAll$annotations", "getAll", "()Ljava/util/List;", "chat", "getChat", "()Lai/grazie/model/task/exec/OptLLMChatAttr;", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 22 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final OptLLMChatAttr chat = TaskParametersAttributes.Chat.INSTANCE.getHistory(); @NotNull public final OptLLMChatAttr getChat() { return chat; }
/*    */   
/*    */   @NotNull
/* 25 */   private static final List<OptLLMChatAttr> all = CollectionsKt.listOf(chat); @NotNull public List<OptLLMChatAttr> getAll() { return all; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\text\ResharperTextTitleGeneration$LLM$Default$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */