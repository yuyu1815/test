/*    */ package ai.grazie.model.task.library.code;
/*    */ 
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/*    */ final class CodeGenerateCommitMessageTask$LLM$IJ$Slow$defaults$1
/*    */   extends Lambda
/*    */   implements Function1<TaskParametersBuilder, Unit>
/*    */ {
/*    */   public static final CodeGenerateCommitMessageTask$LLM$IJ$Slow$defaults$1 INSTANCE = new CodeGenerateCommitMessageTask$LLM$IJ$Slow$defaults$1();
/*    */   
/*    */   public final void invoke(TaskParametersBuilder $this$build) {
/* 37 */     Intrinsics.checkNotNullParameter($this$build, "$this$build"); String defaultInstruction = "Avoid overly verbose descriptions or unnecessary details.\nStart with a short sentence in imperative form, no more than 50 characters long.\nThen leave an empty line and continue with a more detailed explanation.\nWrite only one sentence for the first part, and two or three sentences at most for the detailed explanation.";
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 42 */     $this$build.add((AttributeDescriptor)CodeGenerateCommitMessageTask.LLM.IJ.Slow.Schema.INSTANCE.getInstruction(), defaultInstruction);
/*    */   }
/*    */   
/*    */   CodeGenerateCommitMessageTask$LLM$IJ$Slow$defaults$1() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\code\CodeGenerateCommitMessageTask$LLM$IJ$Slow$defaults$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */