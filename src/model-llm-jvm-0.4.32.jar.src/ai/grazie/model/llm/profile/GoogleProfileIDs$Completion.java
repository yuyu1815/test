/*    */ package ai.grazie.model.llm.profile;
/*    */ 
/*    */ import ai.grazie.model.llm.annotation.ExperimentalLLM;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\007¨\006\013"}, d2 = {"Lai/grazie/model/llm/profile/GoogleProfileIDs$Completion;", "", "()V", "CodeBison", "Lai/grazie/model/llm/profile/LLMProfileID;", "getCodeBison$annotations", "getCodeBison", "()Lai/grazie/model/llm/profile/LLMProfileID;", "CodeGecko", "getCodeGecko$annotations", "getCodeGecko", "model-llm"})
/*    */ public final class Completion
/*    */ {
/*    */   @NotNull
/* 32 */   public static final Completion INSTANCE = new Completion(); @NotNull private static final LLMProfileID CodeGecko = new LLMProfileID("google-completion-code-gecko"); @NotNull public final LLMProfileID getCodeGecko() { return CodeGecko; }
/*    */   
/*    */   @NotNull
/* 35 */   private static final LLMProfileID CodeBison = new LLMProfileID("google-completion-code-bison"); @NotNull public final LLMProfileID getCodeBison() { return CodeBison; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\GoogleProfileIDs$Completion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */