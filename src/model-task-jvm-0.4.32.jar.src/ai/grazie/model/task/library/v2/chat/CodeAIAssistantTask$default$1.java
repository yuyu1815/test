/*    */ package ai.grazie.model.task.library.v2.chat;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/*    */ final class CodeAIAssistantTask$default$1
/*    */   extends Lambda
/*    */   implements Function1<TaskParametersBuilder, Unit>
/*    */ {
/*    */   public final void invoke(TaskParametersBuilder $this$build) {
/* 20 */     Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)CodeAIAssistantTask.Schema.INSTANCE.getProduct(), this.$product);
/* 21 */     $this$build.add((AttributeDescriptor)CodeAIAssistantTask.Schema.INSTANCE.getHistory(), this.$history);
/* 22 */     $this$build.add((AttributeDescriptor)CodeAIAssistantTask.Schema.INSTANCE.getFunctions(), this.$functions);
/*    */   }
/*    */   
/*    */   CodeAIAssistantTask$default$1(CodeAIAssistantProduct $product, TasksChat $history, List<String> $functions) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\CodeAIAssistantTask$default$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */