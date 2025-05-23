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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R:\020\003\032\"\022\036\022\034\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b\022\020\023R\021\020\024\032\0020\r¢\006\b\n\000\032\004\b\025\020\017R\021\020\026\032\0020\021¢\006\b\n\000\032\004\b\027\020\023¨\006\030"}, d2 = {"Lai/grazie/model/task/library/code/CodeEditCommitMessageTask$LLM$IJ$Slow$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll$annotations", "getAll", "()Ljava/util/List;", "descriptionLength", "Lai/grazie/utils/attributes/AttributeDescriptor$OptInt;", "getDescriptionLength", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptInt;", "diff", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getDiff", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "summaryLength", "getSummaryLength", "text", "getText", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 31 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text diff = new AttributeDescriptor.Text("diff"); @NotNull public final AttributeDescriptor.Text getDiff() { return diff; } @NotNull
/* 32 */   private static final AttributeDescriptor.Text text = new AttributeDescriptor.Text("text"); @NotNull public final AttributeDescriptor.Text getText() { return text; } @NotNull
/* 33 */   private static final AttributeDescriptor.OptInt summaryLength = new AttributeDescriptor.OptInt("summaryLength"); @NotNull public final AttributeDescriptor.OptInt getSummaryLength() { return summaryLength; } @NotNull
/* 34 */   private static final AttributeDescriptor.OptInt descriptionLength = new AttributeDescriptor.OptInt("descriptionLength"); @NotNull public final AttributeDescriptor.OptInt getDescriptionLength() { return descriptionLength; } @NotNull
/*    */   private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull
/*    */   public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() {
/* 37 */     return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[4]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)diff; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)text; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)summaryLength; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)descriptionLength; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\code\CodeEditCommitMessageTask$LLM$IJ$Slow$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */