/*    */ package ai.grazie.model.task.library.text;
/*    */ 
/*    */ import ai.grazie.model.task.exec.TaskParametersAttributesExt;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/*    */ final class TextGrazieAIChatTask$LLM$Basic$Params$attributes$1
/*    */   extends Lambda
/*    */   implements Function1<AttributesBuilder, Unit>
/*    */ {
/*    */   public final void invoke(AttributesBuilder $this$build) {
/* 46 */     Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("userPrompt", TextGrazieAIChatTask.LLM.Basic.Params.this.getUserPrompt());
/*    */     
/* 48 */     TaskParametersAttributesExt taskParametersAttributesExt1 = TaskParametersAttributesExt.INSTANCE; TextGrazieAIChatTask.LLM.Basic.Params params = TextGrazieAIChatTask.LLM.Basic.Params.this; TaskParametersAttributesExt $this$invoke_u24lambda_u240 = taskParametersAttributesExt1; int $i$a$-with-TextGrazieAIChatTask$LLM$Basic$Params$attributes$1$1 = 0;
/* 49 */     $this$invoke_u24lambda_u240.chatHistoryOpt($this$build, params.getHistory());
/*    */   }
/*    */   
/*    */   TextGrazieAIChatTask$LLM$Basic$Params$attributes$1() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\text\TextGrazieAIChatTask$LLM$Basic$Params$attributes$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */