/*    */ package ai.grazie.model.task.library.v2.code.completion;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*    */ import ai.grazie.model.task.library.code.attributes.ContextItemArray;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R&\020\003\032\024\022\020\022\016\022\002\b\003\022\002\b\003\022\002\b\0030\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\r¢\006\b\n\000\032\004\b\021\020\017R\021\020\022\032\0020\r¢\006\b\n\000\032\004\b\023\020\017R\021\020\024\032\0020\r¢\006\b\n\000\032\004\b\025\020\017¨\006\026"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeCompleteSlow$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "getAll", "()Ljava/util/List;", "context", "Lai/grazie/model/task/library/code/attributes/ContextItemArray;", "getContext", "()Lai/grazie/model/task/library/code/attributes/ContextItemArray;", "filepath", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getFilepath", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "language", "getLanguage", "prefix", "getPrefix", "suffix", "getSuffix", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 27 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text prefix = new AttributeDescriptor.Text("prefix"); @NotNull public final AttributeDescriptor.Text getPrefix() { return prefix; } @NotNull
/* 28 */   private static final AttributeDescriptor.Text suffix = new AttributeDescriptor.Text("suffix"); @NotNull public final AttributeDescriptor.Text getSuffix() { return suffix; } @NotNull
/* 29 */   private static final ContextItemArray context = new ContextItemArray("context"); @NotNull public final ContextItemArray getContext() { return context; } @NotNull
/* 30 */   private static final AttributeDescriptor.Text language = new AttributeDescriptor.Text("language"); @NotNull public final AttributeDescriptor.Text getLanguage() { return language; } @NotNull
/* 31 */   private static final AttributeDescriptor.Text filepath = new AttributeDescriptor.Text("filepath"); @NotNull public final AttributeDescriptor.Text getFilepath() { return filepath; } @NotNull
/*    */   private static final List<AttributeDescriptor<?, ?, ?>> all; @NotNull
/* 33 */   public List<AttributeDescriptor<?, ?, ?>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[5]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)prefix; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)suffix; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)language; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)context; arrayOfAttributeDescriptor[4] = (AttributeDescriptor)filepath; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\completion\CodeCompleteSlow$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */