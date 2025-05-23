/*    */ package ai.grazie.model.task.library.v2.vcs.fleet;
/*    */ 
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/*    */ final class VcsGenerateCommitMessageV2Task$default$1
/*    */   extends Lambda
/*    */   implements Function1<TaskParametersBuilder, Unit>
/*    */ {
/*    */   public final void invoke(TaskParametersBuilder $this$build) {
/* 26 */     Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)VcsGenerateCommitMessageV2Task.Schema.INSTANCE.getDiff(), this.$diff);
/* 27 */     $this$build.add((AttributeDescriptor)VcsGenerateCommitMessageV2Task.Schema.INSTANCE.getText(), this.$text);
/* 28 */     $this$build.add((AttributeDescriptor)VcsGenerateCommitMessageV2Task.Schema.INSTANCE.getInstruction(), this.$instruction);
/*    */   }
/*    */   
/*    */   VcsGenerateCommitMessageV2Task$default$1(List<String> $diff, String $text, String $instruction) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\fleet\VcsGenerateCommitMessageV2Task$default$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */