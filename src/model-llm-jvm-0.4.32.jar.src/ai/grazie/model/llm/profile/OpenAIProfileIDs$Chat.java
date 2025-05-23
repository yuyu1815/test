/*    */ package ai.grazie.model.llm.profile;
/*    */ import ai.grazie.model.llm.annotation.DevLLM;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\031\n\002\020\021\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\034\020\007\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\b\020\002\032\004\b\t\020\006R\021\020\n\032\0020\004¢\006\b\n\000\032\004\b\013\020\006R\021\020\f\032\0020\004¢\006\b\n\000\032\004\b\r\020\006R\021\020\016\032\0020\004¢\006\b\n\000\032\004\b\017\020\006R\021\020\020\032\0020\004¢\006\b\n\000\032\004\b\021\020\006R\034\020\022\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\023\020\002\032\004\b\024\020\006R\021\020\025\032\0020\004¢\006\b\n\000\032\004\b\026\020\006R\021\020\027\032\0020\004¢\006\b\n\000\032\004\b\030\020\006R\021\020\031\032\0020\004¢\006\b\n\000\032\004\b\032\020\006R\021\020\033\032\0020\004¢\006\b\n\000\032\004\b\034\020\006R\037\020\035\032\b\022\004\022\0020\0040\036¢\006\020\n\002\020\"\022\004\b\037\020\002\032\004\b \020!¨\006#"}, d2 = {"Lai/grazie/model/llm/profile/OpenAIProfileIDs$Chat;", "", "()V", "ChatGPT", "Lai/grazie/model/llm/profile/LLMProfileID;", "getChatGPT", "()Lai/grazie/model/llm/profile/LLMProfileID;", "ChatGPT16k", "getChatGPT16k$annotations", "getChatGPT16k", "GPT4", "getGPT4", "GPT4Turbo", "getGPT4Turbo", "GPT4_5", "getGPT4_5", "GPT4o", "getGPT4o", "GPT4oAlphaSnapshot", "getGPT4oAlphaSnapshot$annotations", "getGPT4oAlphaSnapshot", "GPT4oMini", "getGPT4oMini", "O1", "getO1", "O1Mini", "getO1Mini", "O3Mini", "getO3Mini", "all", "", "getAll$annotations", "getAll", "()[Lai/grazie/model/llm/profile/LLMProfileID;", "[Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */ public final class Chat {
/*    */   @NotNull
/* 11 */   public static final Chat INSTANCE = new Chat(); @NotNull private static final LLMProfileID GPT4 = new LLMProfileID("openai-gpt-4"); @NotNull public final LLMProfileID getGPT4() { return GPT4; } @NotNull
/* 12 */   private static final LLMProfileID GPT4Turbo = new LLMProfileID("openai-gpt-4-turbo"); @NotNull public final LLMProfileID getGPT4Turbo() { return GPT4Turbo; } @NotNull
/* 13 */   private static final LLMProfileID GPT4o = new LLMProfileID("openai-gpt-4o"); @NotNull public final LLMProfileID getGPT4o() { return GPT4o; }
/*    */    @NotNull
/* 15 */   private static final LLMProfileID GPT4oAlphaSnapshot = new LLMProfileID("openai-gpt-4o-alpha-snapshot"); @NotNull public final LLMProfileID getGPT4oAlphaSnapshot() { return GPT4oAlphaSnapshot; } @NotNull
/* 16 */   private static final LLMProfileID GPT4oMini = new LLMProfileID("openai-gpt-4o-mini"); @NotNull public final LLMProfileID getGPT4oMini() { return GPT4oMini; } @NotNull
/* 17 */   private static final LLMProfileID ChatGPT = new LLMProfileID("openai-chat-gpt"); @NotNull public final LLMProfileID getChatGPT() { return ChatGPT; }
/*    */    @NotNull
/* 19 */   private static final LLMProfileID ChatGPT16k = new LLMProfileID("openai-chat-gpt-16k"); @NotNull public final LLMProfileID getChatGPT16k() { return ChatGPT16k; }
/*    */    @NotNull
/* 21 */   private static final LLMProfileID O1 = new LLMProfileID("openai-o1"); @NotNull public final LLMProfileID getO1() { return O1; } @NotNull
/* 22 */   private static final LLMProfileID O1Mini = new LLMProfileID("openai-o1-mini"); @NotNull public final LLMProfileID getO1Mini() { return O1Mini; } @NotNull
/* 23 */   private static final LLMProfileID O3Mini = new LLMProfileID("openai-o3-mini"); @NotNull public final LLMProfileID getO3Mini() { return O3Mini; } @NotNull
/* 24 */   private static final LLMProfileID GPT4_5 = new LLMProfileID("openai-gpt4.5"); @NotNull public final LLMProfileID getGPT4_5() { return GPT4_5; } @NotNull
/*    */   private static final LLMProfileID[] all; @NotNull
/*    */   public final LLMProfileID[] getAll() {
/* 27 */     return all; } static { LLMProfileID[] arrayOfLLMProfileID = new LLMProfileID[11]; arrayOfLLMProfileID[0] = GPT4; arrayOfLLMProfileID[1] = GPT4Turbo; arrayOfLLMProfileID[2] = GPT4o; arrayOfLLMProfileID[3] = GPT4oMini; arrayOfLLMProfileID[4] = ChatGPT; arrayOfLLMProfileID[5] = ChatGPT16k; arrayOfLLMProfileID[6] = O1; arrayOfLLMProfileID[7] = O1Mini; arrayOfLLMProfileID[8] = O3Mini; arrayOfLLMProfileID[9] = GPT4_5; arrayOfLLMProfileID[10] = GPT4oAlphaSnapshot; all = arrayOfLLMProfileID; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\OpenAIProfileIDs$Chat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */