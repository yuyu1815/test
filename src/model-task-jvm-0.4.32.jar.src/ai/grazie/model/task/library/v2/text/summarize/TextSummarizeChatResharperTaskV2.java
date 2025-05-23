/*    */ package ai.grazie.model.task.library.v2.text.summarize;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\bÇ\002\030\0002\0020\001:\001\007B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\b"}, d2 = {"Lai/grazie/model/task/library/v2/text/summarize/TextSummarizeChatResharperTaskV2;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "Schema", "model-task"})
/*    */ public final class TextSummarizeChatResharperTaskV2 implements TaskNameDescriptor {
/*    */   @NotNull
/*  9 */   public static final TextSummarizeChatResharperTaskV2 INSTANCE = new TextSummarizeChatResharperTaskV2(); @NotNull private static final TaskName name = new TaskName("text-summarize-chat-resharper-v2"); @NotNull public TaskName getName() { return name; }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R&\020\003\032\024\022\020\022\016\022\002\b\003\022\002\b\003\022\002\b\0030\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lai/grazie/model/task/library/v2/text/summarize/TextSummarizeChatResharperTaskV2$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "getAll", "()Ljava/util/List;", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 13 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final List<AttributeDescriptor<?, ?, ?>> all = CollectionsKt.emptyList(); @NotNull public List<AttributeDescriptor<?, ?, ?>> getAll() { return all; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\text\summarize\TextSummarizeChatResharperTaskV2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */