/*    */ package ai.grazie.model.llm.profile;
/*    */ 
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\013"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs$LLAMA$Code;", "", "()V", "Large", "Lai/grazie/model/llm/profile/LLMProfileID;", "getLarge", "()Lai/grazie/model/llm/profile/LLMProfileID;", "Medium", "getMedium", "Small", "getSmall", "model-llm"})
/*    */ public final class Code
/*    */ {
/*    */   @NotNull
/* 29 */   public static final Code INSTANCE = new Code(); @NotNull private static final LLMProfileID Small = new LLMProfileID("grazie-code-llama-7b"); @NotNull public final LLMProfileID getSmall() { return Small; }
/*    */    @NotNull
/* 31 */   private static final LLMProfileID Medium = new LLMProfileID("grazie-code-llama-13b"); @NotNull public final LLMProfileID getMedium() { return Medium; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 37 */   private static final LLMProfileID Large = new LLMProfileID("grazie-code-llama-70b-instruct"); @NotNull public final LLMProfileID getLarge() { return Large; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\GrazieLLMProfileIDs$LLAMA$Code.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */