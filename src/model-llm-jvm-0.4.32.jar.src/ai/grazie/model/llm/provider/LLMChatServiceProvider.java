/*   */ package ai.grazie.model.llm.provider;
/*   */ import ai.grazie.model.llm.profile.LLMProfileID;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\022\020\002\032\004\030\0010\0032\006\020\004\032\0020\005H&J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lai/grazie/model/llm/provider/LLMChatServiceProvider;", "Lai/grazie/model/llm/provider/LLMProfileProvider;", "getChats", "Lai/grazie/model/llm/chat/v5/LLMChatService;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "getChatsOrFail", "model-llm"})
/*   */ public interface LLMChatServiceProvider extends LLMProfileProvider {
/*   */   @NotNull
/*   */   default LLMChatService getChatsOrFail(@NotNull LLMProfileID profile) {
/* 9 */     Intrinsics.checkNotNullParameter(profile, "profile"); if (getChats(profile) == null) { getChats(profile); throw new IllegalStateException(("Failed to get " + profile.getId()).toString()); }  return getChats(profile);
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   LLMChatService getChats(@NotNull LLMProfileID paramLLMProfileID);
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\provider\LLMChatServiceProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */