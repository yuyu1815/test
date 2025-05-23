/*    */ package ai.grazie.model.task.library.text;
/*    */ import ai.grazie.model.task.annotation.ExperimentalTask;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskTag;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Deprecated(message = "Replace with V2 task descriptor")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\bÇ\002\030\0002\0020\001:\001\013B\007\b\002¢\006\002\020\002J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\007R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\f"}, d2 = {"Lai/grazie/model/task/library/text/TextAIAgentTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "text", "", "LLM", "model-task"})
/*    */ public final class TextAIAgentTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 13 */   public static final TextAIAgentTask INSTANCE = new TextAIAgentTask(); @NotNull private static final TaskName name = new TaskName("text-ai-agent"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ExperimentalTask
/*    */   @NotNull
/*    */   public final TaskCall default(@NotNull String text)
/*    */   {
/* 23 */     Intrinsics.checkNotNullParameter(text, "text"); return new TaskCall(getName().tag(LLM.Grazie.Default.INSTANCE.getTag()), TaskParameters.Companion.build(new TextAIAgentTask$default$1(text))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 24 */   static final class TextAIAgentTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TextAIAgentTask.LLM.Grazie.Schema.INSTANCE.getText(), this.$text); } TextAIAgentTask$default$1(String $text) { super(1); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\bÆ\002\030\0002\0020\001:\001\003B\007\b\002¢\006\002\020\002¨\006\004"}, d2 = {"Lai/grazie/model/task/library/text/TextAIAgentTask$LLM;", "", "()V", "Grazie", "model-task"})
/*    */   public static final class LLM { @NotNull
/*    */     public static final LLM INSTANCE = new LLM(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÆ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/model/task/library/text/TextAIAgentTask$LLM$Grazie;", "", "()V", "Default", "Schema", "model-task"})
/*    */     public static final class Grazie { @NotNull
/*    */       public static final Grazie INSTANCE = new Grazie();
/*    */       @ExperimentalTask
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextAIAgentTask$LLM$Grazie$Default;", "Lai/grazie/model/task/id/TaskTagDescriptor$Experimental;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*    */       public static final class Default implements TaskTagDescriptor.Experimental { @NotNull
/* 32 */         public static final Default INSTANCE = new Default(); @NotNull private static final TaskTag tag = new TaskTag("llm-grazie-default"); @NotNull public TaskTag getTag() { return tag; }
/*    */          }
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lai/grazie/model/task/library/text/TextAIAgentTask$LLM$Grazie$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "text", "getText", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "model-task"})
/*    */       public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 36 */         public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text text = new AttributeDescriptor.Text("text"); @NotNull public final AttributeDescriptor.Text getText() { return text; }
/*    */         
/*    */         @NotNull
/* 39 */         private static final List<AttributeDescriptor.Text> all = CollectionsKt.listOf(text); @NotNull public List<AttributeDescriptor.Text> getAll() { return all; } } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÆ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/model/task/library/text/TextAIAgentTask$LLM$Grazie;", "", "()V", "Default", "Schema", "model-task"}) public static final class Grazie { @NotNull public static final Grazie INSTANCE = new Grazie(); @ExperimentalTask @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextAIAgentTask$LLM$Grazie$Default;", "Lai/grazie/model/task/id/TaskTagDescriptor$Experimental;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"}) public static final class Default implements TaskTagDescriptor.Experimental { @NotNull public static final Default INSTANCE = new Default(); @NotNull private static final TaskTag tag = new TaskTag("llm-grazie-default"); @NotNull public TaskTag getTag() { return tag; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lai/grazie/model/task/library/text/TextAIAgentTask$LLM$Grazie$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "text", "getText", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "model-task"}) public static final class Schema implements TaskSchemaDescriptor { @NotNull public static final Schema INSTANCE = new Schema(); @NotNull private static final List<AttributeDescriptor.Text> all = CollectionsKt.listOf(text); @NotNull private static final AttributeDescriptor.Text text = new AttributeDescriptor.Text("text"); @NotNull public final AttributeDescriptor.Text getText() { return text; } @NotNull public List<AttributeDescriptor.Text> getAll() { return all; }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   @ExperimentalTask
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextAIAgentTask$LLM$Grazie$Default;", "Lai/grazie/model/task/id/TaskTagDescriptor$Experimental;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*    */   public static final class Default implements TaskTagDescriptor.Experimental {
/*    */     @NotNull
/*    */     public static final Default INSTANCE = new Default();
/*    */     @NotNull
/*    */     private static final TaskTag tag = new TaskTag("llm-grazie-default");
/*    */     
/*    */     @NotNull
/*    */     public TaskTag getTag() {
/*    */       return tag;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\text\TextAIAgentTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */