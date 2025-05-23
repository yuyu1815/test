/*    */ package ai.grazie.model.llm.definitions;
/*    */ 
/*    */ import ai.grazie.model.llm.parameters.LLMParameters;
/*    */ import ai.grazie.model.llm.profile.LLMProfile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class ParameterDefinition$validateParameters$2$1
/*    */   extends Lambda
/*    */   implements Function0<String>
/*    */ {
/*    */   ParameterDefinition$validateParameters$2$1(LLMProfile $profile, int $modelMaxOutputTokens) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   public final String invoke() {
/* 22 */     return "Parameter " + LLMParameters.INSTANCE.getLength() + " is bigger than " + this.$profile.getId() + " maximum output tokens limits: " + this.$modelMaxOutputTokens;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\ParameterDefinition$validateParameters$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */