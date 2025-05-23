/*    */ package ai.grazie.model.llm.profile;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006¨\006\r"}, d2 = {"Lai/grazie/model/llm/profile/MetaProfileIDs$Llama;", "", "()V", "Llama_3_1_70B", "Lai/grazie/model/llm/profile/LLMProfileID;", "getLlama_3_1_70B", "()Lai/grazie/model/llm/profile/LLMProfileID;", "Llama_3_1_8B", "getLlama_3_1_8B", "Llama_3_2_3B", "getLlama_3_2_3B", "Llama_3_3_70B", "getLlama_3_3_70B", "model-llm"})
/*    */ public final class Llama {
/*    */   @NotNull
/*  8 */   public static final Llama INSTANCE = new Llama(); @NotNull private static final LLMProfileID Llama_3_1_8B = new LLMProfileID("llama-3.1-8B"); @NotNull public final LLMProfileID getLlama_3_1_8B() { return Llama_3_1_8B; }
/*    */    @NotNull
/* 10 */   private static final LLMProfileID Llama_3_1_70B = new LLMProfileID("llama-3.1-70B"); @NotNull public final LLMProfileID getLlama_3_1_70B() { return Llama_3_1_70B; }
/*    */    @NotNull
/* 12 */   private static final LLMProfileID Llama_3_2_3B = new LLMProfileID("llama-3-2-3B"); @NotNull public final LLMProfileID getLlama_3_2_3B() { return Llama_3_2_3B; }
/*    */    @NotNull
/* 14 */   private static final LLMProfileID Llama_3_3_70B = new LLMProfileID("llama-3.3-70B"); @NotNull public final LLMProfileID getLlama_3_3_70B() { return Llama_3_3_70B; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\MetaProfileIDs$Llama.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */