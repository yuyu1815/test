/*    */ package ai.grazie.model.llm.profile;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÇ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/model/llm/profile/GoogleProfileIDs;", "", "()V", "Chat", "Completion", "model-llm"})
/*    */ public final class GoogleProfileIDs {
/*    */   @NotNull
/*    */   public static final GoogleProfileIDs INSTANCE = new GoogleProfileIDs();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\024\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\034\020\007\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\b\020\002\032\004\b\t\020\006R\021\020\n\032\0020\004¢\006\b\n\000\032\004\b\013\020\006R\021\020\f\032\0020\004¢\006\b\n\000\032\004\b\r\020\006R\021\020\016\032\0020\004¢\006\b\n\000\032\004\b\017\020\006R\021\020\020\032\0020\004¢\006\b\n\000\032\004\b\021\020\006R\034\020\022\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\023\020\002\032\004\b\024\020\006R\034\020\025\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\026\020\002\032\004\b\027\020\006¨\006\030"}, d2 = {"Lai/grazie/model/llm/profile/GoogleProfileIDs$Chat;", "", "()V", "Bison", "Lai/grazie/model/llm/profile/LLMProfileID;", "getBison", "()Lai/grazie/model/llm/profile/LLMProfileID;", "CodeBison", "getCodeBison$annotations", "getCodeBison", "GeminiFlash1_5", "getGeminiFlash1_5", "GeminiFlash2_0", "getGeminiFlash2_0", "GeminiFlashLite2_0", "getGeminiFlashLite2_0", "GeminiPro1_5", "getGeminiPro1_5", "GeminiPro2_0", "getGeminiPro2_0$annotations", "getGeminiPro2_0", "GeminiThinking2_0", "getGeminiThinking2_0$annotations", "getGeminiThinking2_0", "model-llm"})
/*    */   public static final class Chat { @NotNull
/* 10 */     public static final Chat INSTANCE = new Chat(); @NotNull private static final LLMProfileID Bison = new LLMProfileID("google-chat-bison"); @NotNull public final LLMProfileID getBison() { return Bison; }
/*    */     
/*    */     @NotNull
/* 13 */     private static final LLMProfileID CodeBison = new LLMProfileID("google-chat-code-bison"); @NotNull public final LLMProfileID getCodeBison() { return CodeBison; }
/*    */      @NotNull
/* 15 */     private static final LLMProfileID GeminiPro1_5 = new LLMProfileID("google-chat-gemini-pro-1.5"); @NotNull public final LLMProfileID getGeminiPro1_5() { return GeminiPro1_5; }
/*    */      @NotNull
/* 17 */     private static final LLMProfileID GeminiFlash1_5 = new LLMProfileID("google-chat-gemini-flash-1.5"); @NotNull public final LLMProfileID getGeminiFlash1_5() { return GeminiFlash1_5; }
/*    */      @NotNull
/* 19 */     private static final LLMProfileID GeminiFlash2_0 = new LLMProfileID("google-chat-gemini-flash-2.0"); @NotNull public final LLMProfileID getGeminiFlash2_0() { return GeminiFlash2_0; }
/*    */      @NotNull
/* 21 */     private static final LLMProfileID GeminiFlashLite2_0 = new LLMProfileID("google-chat-gemini-flash-lite-2.0"); @NotNull public final LLMProfileID getGeminiFlashLite2_0() { return GeminiFlashLite2_0; }
/*    */     
/*    */     @NotNull
/* 24 */     private static final LLMProfileID GeminiPro2_0 = new LLMProfileID("google-chat-gemini-pro-2.0"); @NotNull public final LLMProfileID getGeminiPro2_0() { return GeminiPro2_0; }
/*    */     
/*    */     @NotNull
/* 27 */     private static final LLMProfileID GeminiThinking2_0 = new LLMProfileID("google-chat-gemini-thinking-flash-2.0"); @NotNull public final LLMProfileID getGeminiThinking2_0() { return GeminiThinking2_0; }
/*    */      }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\007¨\006\013"}, d2 = {"Lai/grazie/model/llm/profile/GoogleProfileIDs$Completion;", "", "()V", "CodeBison", "Lai/grazie/model/llm/profile/LLMProfileID;", "getCodeBison$annotations", "getCodeBison", "()Lai/grazie/model/llm/profile/LLMProfileID;", "CodeGecko", "getCodeGecko$annotations", "getCodeGecko", "model-llm"})
/*    */   public static final class Completion { @NotNull
/* 32 */     public static final Completion INSTANCE = new Completion(); @NotNull private static final LLMProfileID CodeGecko = new LLMProfileID("google-completion-code-gecko"); @NotNull public final LLMProfileID getCodeGecko() { return CodeGecko; }
/*    */     
/*    */     @NotNull
/* 35 */     private static final LLMProfileID CodeBison = new LLMProfileID("google-completion-code-bison"); @NotNull public final LLMProfileID getCodeBison() { return CodeBison; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\GoogleProfileIDs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */