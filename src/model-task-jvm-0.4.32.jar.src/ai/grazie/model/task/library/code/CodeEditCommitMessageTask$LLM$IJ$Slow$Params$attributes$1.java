/*    */ package ai.grazie.model.task.library.code;
/*    */ 
/*    */ import ai.grazie.utils.attributes.AttributesBuilder;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/*    */ final class CodeEditCommitMessageTask$LLM$IJ$Slow$Params$attributes$1
/*    */   extends Lambda
/*    */   implements Function1<AttributesBuilder, Unit>
/*    */ {
/*    */   public final void invoke(AttributesBuilder $this$build) {
/* 50 */     Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("diff", CodeEditCommitMessageTask.LLM.IJ.Slow.Params.this.getDiff());
/* 51 */     $this$build.text("text", CodeEditCommitMessageTask.LLM.IJ.Slow.Params.this.getText());
/* 52 */     $this$build.optInt("summaryLength", CodeEditCommitMessageTask.LLM.IJ.Slow.Params.this.getSummaryLength());
/* 53 */     $this$build.optInt("descriptionLength", CodeEditCommitMessageTask.LLM.IJ.Slow.Params.this.getDescriptionLength());
/*    */   }
/*    */   
/*    */   CodeEditCommitMessageTask$LLM$IJ$Slow$Params$attributes$1() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\code\CodeEditCommitMessageTask$LLM$IJ$Slow$Params$attributes$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */