/*    */ package ai.grazie.model.task.library.code;
/*    */ 
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R6\020\003\032\036\022\032\022\030\022\004\022\0020\006\022\004\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b\022\020\023R\021\020\024\032\0020\021¢\006\b\n\000\032\004\b\025\020\023¨\006\026"}, d2 = {"Lai/grazie/model/task/library/code/CodeGenerateCommitMessageTask$LLM$IJ$Slow$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "Lai/grazie/utils/attributes/Attributes$Value$Text;", "", "getAll$annotations", "getAll", "()Ljava/util/List;", "diff", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getDiff", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "instruction", "Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "getInstruction", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "text", "getText", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 46 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text diff = new AttributeDescriptor.Text("diff"); @NotNull public final AttributeDescriptor.Text getDiff() { return diff; } @NotNull
/* 47 */   private static final AttributeDescriptor.OptText text = new AttributeDescriptor.OptText("text"); @NotNull public final AttributeDescriptor.OptText getText() { return text; } @NotNull
/* 48 */   private static final AttributeDescriptor.OptText instruction = new AttributeDescriptor.OptText("instruction"); @NotNull public final AttributeDescriptor.OptText getInstruction() { return instruction; } @NotNull
/*    */   private static final List<AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, ? extends String>> all; @NotNull
/*    */   public List<AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, ? extends String>> getAll() {
/* 51 */     return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[3]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)diff; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)text; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)instruction; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\code\CodeGenerateCommitMessageTask$LLM$IJ$Slow$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */