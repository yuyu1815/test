/*    */ package ai.grazie.model.task.library.v2.code.completion;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\004\bÇ\002\030\0002\0020\001:\002\f\rB\007\b\002¢\006\002\020\002J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\b\b\002\020\013\032\0020\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\016"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeMultiLineAllCompleteTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "fast", "Lai/grazie/model/task/exec/TaskCall;", "prefix", "", "suffix", "Fast", "Schema", "model-task"})
/*    */ public final class CodeMultiLineAllCompleteTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 11 */   public static final CodeMultiLineAllCompleteTask INSTANCE = new CodeMultiLineAllCompleteTask(); @NotNull private static final TaskName name = new TaskName("code-multi-line-all-complete"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TaskCall fast(@NotNull String prefix, @NotNull String suffix) {
/* 20 */     Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(suffix, "suffix"); return new TaskCall(getName().tag(Fast.INSTANCE.getTag()), TaskParameters.Companion.build(new CodeMultiLineAllCompleteTask$fast$1(prefix, suffix))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 21 */   static final class CodeMultiLineAllCompleteTask$fast$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)CodeMultiLineAllCompleteTask.Schema.INSTANCE.getPrefix(), this.$prefix);
/* 22 */       $this$build.add((AttributeDescriptor)CodeMultiLineAllCompleteTask.Schema.INSTANCE.getSuffix(), this.$suffix); }
/*    */      CodeMultiLineAllCompleteTask$fast$1(String $prefix, String $suffix) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\b\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\032\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\005¢\006\b\n\000\032\004\b\f\020\n¨\006\r"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeMultiLineAllCompleteTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll", "()Ljava/util/List;", "prefix", "getPrefix", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "suffix", "getSuffix", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 28 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text prefix = new AttributeDescriptor.Text("prefix"); @NotNull public final AttributeDescriptor.Text getPrefix() { return prefix; } @NotNull
/* 29 */     private static final AttributeDescriptor.Text suffix = new AttributeDescriptor.Text("suffix"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getSuffix() { return suffix; }
/*    */     @NotNull
/* 31 */     public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[2]; arrayOfText[0] = prefix; arrayOfText[1] = suffix; all = CollectionsKt.listOf((Object[])arrayOfText); }
/*    */      }
/*    */   
/*    */   @Deprecated(message = "Use Default tag instead")
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeMultiLineAllCompleteTask$Fast;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*    */   public static final class Fast implements TaskTagDescriptor.Stable {
/*    */     @NotNull
/* 38 */     public static final Fast INSTANCE = new Fast(); @NotNull private static final TaskTag tag = new TaskTag("fast"); @NotNull public TaskTag getTag() { return tag; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\completion\CodeMultiLineAllCompleteTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */