/*    */ package ai.grazie.model.task.library.v2.code;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R0\020\003\032\036\022\032\022\030\022\004\022\0020\006\022\004\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\021\020\023\032\0020\f¢\006\b\n\000\032\004\b\024\020\016R\021\020\025\032\0020\020¢\006\b\n\000\032\004\b\026\020\022R\021\020\027\032\0020\f¢\006\b\n\000\032\004\b\030\020\016¨\006\031"}, d2 = {"Lai/grazie/model/task/library/v2/code/CodeRewriteTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "Lai/grazie/utils/attributes/Attributes$Value$Text;", "", "getAll", "()Ljava/util/List;", "instructions", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getInstructions", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "language", "Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "getLanguage", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "prefix", "getPrefix", "selection", "getSelection", "suffix", "getSuffix", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 42 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text instructions = new AttributeDescriptor.Text("instructions"); @NotNull public final AttributeDescriptor.Text getInstructions() { return instructions; } @NotNull
/* 43 */   private static final AttributeDescriptor.OptText selection = new AttributeDescriptor.OptText("selection"); @NotNull public final AttributeDescriptor.OptText getSelection() { return selection; } @NotNull
/* 44 */   private static final AttributeDescriptor.Text prefix = new AttributeDescriptor.Text("prefix"); @NotNull public final AttributeDescriptor.Text getPrefix() { return prefix; } @NotNull
/* 45 */   private static final AttributeDescriptor.Text suffix = new AttributeDescriptor.Text("suffix"); @NotNull public final AttributeDescriptor.Text getSuffix() { return suffix; } @NotNull
/* 46 */   private static final AttributeDescriptor.OptText language = new AttributeDescriptor.OptText("language"); @NotNull public final AttributeDescriptor.OptText getLanguage() { return language; } @NotNull
/*    */   private static final List<AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, ? extends String>> all; @NotNull
/* 48 */   public List<AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, ? extends String>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[5]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)instructions; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)selection; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)prefix; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)suffix; arrayOfAttributeDescriptor[4] = (AttributeDescriptor)language; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\CodeRewriteTask$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */