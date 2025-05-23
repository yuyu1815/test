/*    */ package ai.grazie.model.task.library.v2.code.completion;
/*    */ import ai.grazie.model.task.library.code.attributes.ContextItemArray;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Deprecated(message = "in favour of `ai.grazie.gen.tasks.code.complete.llm.fast.CodeCompleteFastTaskDescriptor`, since 08 Jan 2025")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\bÇ\002\030\0002\0020\001:\001\007B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\b"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeCompleteFastTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "Schema", "model-task"})
/*    */ public final class CodeCompleteFastTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 11 */   public static final CodeCompleteFastTask INSTANCE = new CodeCompleteFastTask(); @NotNull private static final TaskName name = new TaskName("code-complete-fast"); @NotNull public TaskName getName() { return name; }
/*    */    @Deprecated(message = "in favour of `ai.grazie.gen.tasks.code.complete.llm.fast.CodeCompleteFastTaskParams`, since 08 Jan 2025")
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R2\020\003\032 \022\034\022\032\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\006\b\001\022\0020\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\021\020\023\032\0020\020¢\006\b\n\000\032\004\b\024\020\022R\021\020\025\032\0020\020¢\006\b\n\000\032\004\b\026\020\022¨\006\027"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeCompleteFastTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "Ljava/io/Serializable;", "getAll", "()Ljava/util/List;", "context", "Lai/grazie/model/task/library/code/attributes/ContextItemArray;", "getContext", "()Lai/grazie/model/task/library/code/attributes/ContextItemArray;", "filepath", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getFilepath", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "prefix", "getPrefix", "suffix", "getSuffix", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 15 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text prefix = new AttributeDescriptor.Text("prefix"); @NotNull public final AttributeDescriptor.Text getPrefix() { return prefix; } @NotNull
/* 16 */     private static final AttributeDescriptor.Text suffix = new AttributeDescriptor.Text("suffix"); @NotNull public final AttributeDescriptor.Text getSuffix() { return suffix; } @NotNull
/* 17 */     private static final AttributeDescriptor.Text filepath = new AttributeDescriptor.Text("filepath"); @NotNull public final AttributeDescriptor.Text getFilepath() { return filepath; } @NotNull
/* 18 */     private static final ContextItemArray context = new ContextItemArray("context"); @NotNull private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Serializable>> all; @NotNull public final ContextItemArray getContext() { return context; }
/*    */     @NotNull
/* 20 */     public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Serializable>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[4]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)prefix; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)suffix; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)filepath; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)context; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\completion\CodeCompleteFastTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */