/*    */ package ai.grazie.model.task.library.v2.vcs.fleet;
/*    */ import ai.grazie.model.task.exec.TaskCall;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\004\bÇ\002\030\0002\0020\001:\001\016B\007\b\002¢\006\002\020\002J(\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\0130\n2\006\020\f\032\0020\0132\n\b\002\020\r\032\004\030\0010\013R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/fleet/VcsGenerateCommitMessageV2Task;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "diff", "", "", "text", "instruction", "Schema", "model-task"})
/*    */ public final class VcsGenerateCommitMessageV2Task implements TaskNameDescriptor {
/*    */   @NotNull
/* 13 */   public static final VcsGenerateCommitMessageV2Task INSTANCE = new VcsGenerateCommitMessageV2Task(); @NotNull private static final TaskName name = new TaskName("vcs-generate-commit-message-v2"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TaskCall default(@NotNull List<String> diff, @NotNull String text, @Nullable String instruction) {
/* 25 */     Intrinsics.checkNotNullParameter(diff, "diff"); Intrinsics.checkNotNullParameter(text, "text"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new VcsGenerateCommitMessageV2Task$default$1(diff, text, instruction))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 26 */   static final class VcsGenerateCommitMessageV2Task$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)VcsGenerateCommitMessageV2Task.Schema.INSTANCE.getDiff(), this.$diff);
/* 27 */       $this$build.add((AttributeDescriptor)VcsGenerateCommitMessageV2Task.Schema.INSTANCE.getText(), this.$text);
/* 28 */       $this$build.add((AttributeDescriptor)VcsGenerateCommitMessageV2Task.Schema.INSTANCE.getInstruction(), this.$instruction); }
/*    */     
/*    */     VcsGenerateCommitMessageV2Task$default$1(List<String> $diff, String $text, String $instruction) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R:\020\003\032\"\022\036\022\034\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b\022\020\023R\021\020\024\032\0020\021¢\006\b\n\000\032\004\b\025\020\023¨\006\026"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/fleet/VcsGenerateCommitMessageV2Task$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll$annotations", "getAll", "()Ljava/util/List;", "diff", "Lai/grazie/model/task/library/v2/vcs/fleet/VcsDiffAttr;", "getDiff", "()Lai/grazie/model/task/library/v2/vcs/fleet/VcsDiffAttr;", "instruction", "Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "getInstruction", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "text", "getText", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 35 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final VcsDiffAttr diff = new VcsDiffAttr("diff"); @NotNull public final VcsDiffAttr getDiff() { return diff; } @NotNull
/* 36 */     private static final AttributeDescriptor.OptText text = new AttributeDescriptor.OptText("text"); @NotNull public final AttributeDescriptor.OptText getText() { return text; } @NotNull
/* 37 */     private static final AttributeDescriptor.OptText instruction = new AttributeDescriptor.OptText("instruction"); @NotNull private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull public final AttributeDescriptor.OptText getInstruction() { return instruction; }
/*    */     
/*    */     @NotNull
/* 40 */     public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[3]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)diff; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)text; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)instruction; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\fleet\VcsGenerateCommitMessageV2Task.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */