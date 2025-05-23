/*    */ package ai.grazie.model.llm.utils;
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import ai.grazie.model.llm.provider.LLMServiceProvider;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004\032\022\020\005\032\0020\006*\0020\0022\006\020\003\032\0020\004¨\006\007"}, d2 = {"getChat", "Lai/grazie/model/llm/chat/v5/LLMChatService;", "Lai/grazie/model/llm/provider/LLMServiceProvider;", "profileID", "Lai/grazie/model/llm/profile/LLMProfileID;", "getCompletion", "Lai/grazie/model/llm/completion/LLMCompletionService;", "model-llm"})
/*    */ public final class LLMServiceProviderExtesionKt {
/*    */   @NotNull
/*    */   public static final LLMChatService getChat(@NotNull LLMServiceProvider $this$getChat, @NotNull LLMProfileID profileID) {
/* 10 */     Intrinsics.checkNotNullParameter($this$getChat, "<this>"); Intrinsics.checkNotNullParameter(profileID, "profileID"); if ($this$getChat.getChats(profileID) == null) { $this$getChat.getChats(profileID); ExtensionsKt.badRequest("No profile with ID " + profileID); throw new KotlinNothingValueException(); }  return $this$getChat.getChats(profileID);
/*    */   }
/*    */   @NotNull
/*    */   public static final LLMCompletionService getCompletion(@NotNull LLMServiceProvider $this$getCompletion, @NotNull LLMProfileID profileID) {
/* 14 */     Intrinsics.checkNotNullParameter($this$getCompletion, "<this>"); Intrinsics.checkNotNullParameter(profileID, "profileID"); if ($this$getCompletion.completions(profileID) == null) { $this$getCompletion.completions(profileID); ExtensionsKt.badRequest("No profile with ID " + profileID); throw new KotlinNothingValueException(); }  return $this$getCompletion.completions(profileID);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\ll\\utils\LLMServiceProviderExtesionKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */