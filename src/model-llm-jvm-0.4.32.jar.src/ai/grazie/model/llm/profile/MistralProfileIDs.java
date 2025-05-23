/*    */ package ai.grazie.model.llm.profile;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÇ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/model/llm/profile/MistralProfileIDs;", "", "()V", "Chat", "Completion", "model-llm"})
/*    */ public final class MistralProfileIDs {
/*    */   @NotNull
/*    */   public static final MistralProfileIDs INSTANCE = new MistralProfileIDs();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\020\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\007R\034\020\013\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\f\020\002\032\004\b\r\020\007R\034\020\016\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\017\020\002\032\004\b\020\020\007R\034\020\021\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\022\020\002\032\004\b\023\020\007¨\006\024"}, d2 = {"Lai/grazie/model/llm/profile/MistralProfileIDs$Chat;", "", "()V", "MistralLarge", "Lai/grazie/model/llm/profile/LLMProfileID;", "getMistralLarge$annotations", "getMistralLarge", "()Lai/grazie/model/llm/profile/LLMProfileID;", "MistralSmall", "getMistralSmall$annotations", "getMistralSmall", "OpenMistral7B", "getOpenMistral7B$annotations", "getOpenMistral7B", "OpenMixtral8x22B", "getOpenMixtral8x22B$annotations", "getOpenMixtral8x22B", "OpenMixtral8x7B", "getOpenMixtral8x7B$annotations", "getOpenMixtral8x7B", "model-llm"})
/*    */   public static final class Chat { @NotNull
/* 10 */     public static final Chat INSTANCE = new Chat(); @NotNull private static final LLMProfileID OpenMistral7B = new LLMProfileID("mistral-open-7b"); @NotNull public final LLMProfileID getOpenMistral7B() { return OpenMistral7B; }
/*    */      @NotNull
/* 12 */     private static final LLMProfileID OpenMixtral8x7B = new LLMProfileID("mixtral-open-8x7b"); @NotNull public final LLMProfileID getOpenMixtral8x7B() { return OpenMixtral8x7B; }
/*    */      @NotNull
/* 14 */     private static final LLMProfileID OpenMixtral8x22B = new LLMProfileID("mixtral-open-8x22b"); @NotNull public final LLMProfileID getOpenMixtral8x22B() { return OpenMixtral8x22B; }
/*    */      @NotNull
/* 16 */     private static final LLMProfileID MistralSmall = new LLMProfileID("mistral-small"); @NotNull public final LLMProfileID getMistralSmall() { return MistralSmall; }
/*    */      @NotNull
/* 18 */     private static final LLMProfileID MistralLarge = new LLMProfileID("mistral-large"); @NotNull public final LLMProfileID getMistralLarge() { return MistralLarge; }
/*    */      }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007¨\006\b"}, d2 = {"Lai/grazie/model/llm/profile/MistralProfileIDs$Completion;", "", "()V", "Codestral", "Lai/grazie/model/llm/profile/LLMProfileID;", "getCodestral$annotations", "getCodestral", "()Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */   public static final class Completion { @NotNull
/* 23 */     public static final Completion INSTANCE = new Completion(); @NotNull private static final LLMProfileID Codestral = new LLMProfileID("mistral-codestral"); @NotNull public final LLMProfileID getCodestral() { return Codestral; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\MistralProfileIDs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */