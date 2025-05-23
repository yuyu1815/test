/*    */ package ai.grazie.model.task.library.text;
/*    */ 
/*    */ import ai.grazie.model.task.exec.OptLLMChatAttr;
/*    */ import ai.grazie.model.task.exec.TaskParametersAttributes;
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R:\020\003\032\"\022\036\022\034\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b\022\020\023¨\006\024"}, d2 = {"Lai/grazie/model/task/library/text/TextGrazieAIChatTask$LLM$Basic$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll$annotations", "getAll", "()Ljava/util/List;", "history", "Lai/grazie/model/task/exec/OptLLMChatAttr;", "getHistory", "()Lai/grazie/model/task/exec/OptLLMChatAttr;", "userPrompt", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getUserPrompt", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 35 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text userPrompt = new AttributeDescriptor.Text("userPrompt"); @NotNull public final AttributeDescriptor.Text getUserPrompt() { return userPrompt; } @NotNull
/* 36 */   private static final OptLLMChatAttr history = TaskParametersAttributes.Chat.INSTANCE.getHistory(); @NotNull public final OptLLMChatAttr getHistory() { return history; } @NotNull
/*    */   private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull
/*    */   public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() {
/* 39 */     return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[2]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)userPrompt; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)history; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\text\TextGrazieAIChatTask$LLM$Basic$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */