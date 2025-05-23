/*    */ package ai.grazie.model.task.library.v2.code.completion;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\b\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\032\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\005¢\006\b\n\000\032\004\b\f\020\n¨\006\r"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeMultiLineAllCompleteTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll", "()Ljava/util/List;", "prefix", "getPrefix", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "suffix", "getSuffix", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 28 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text prefix = new AttributeDescriptor.Text("prefix"); @NotNull public final AttributeDescriptor.Text getPrefix() { return prefix; } @NotNull
/* 29 */   private static final AttributeDescriptor.Text suffix = new AttributeDescriptor.Text("suffix"); @NotNull public final AttributeDescriptor.Text getSuffix() { return suffix; } @NotNull
/*    */   private static final List<AttributeDescriptor.Text> all; @NotNull
/* 31 */   public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[2]; arrayOfText[0] = prefix; arrayOfText[1] = suffix; all = CollectionsKt.listOf((Object[])arrayOfText); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\completion\CodeMultiLineAllCompleteTask$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */