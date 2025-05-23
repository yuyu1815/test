/*   */ package ai.grazie.model.llm.profile;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\032\020\002\032\0020\0038VX\004¢\006\f\022\004\b\004\020\005\032\004\b\006\020\007R\022\020\b\032\0020\tX¦\004¢\006\006\032\004\b\n\020\013ø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Lai/grazie/model/llm/profile/WithLLMProfile;", "", "id", "Lai/grazie/model/llm/profile/LLMProfileID;", "getId$annotations", "()V", "getId", "()Lai/grazie/model/llm/profile/LLMProfileID;", "profile", "Lai/grazie/model/llm/profile/LLMProfile;", "getProfile", "()Lai/grazie/model/llm/profile/LLMProfile;", "model-llm"})
/*   */ public interface WithLLMProfile {
/*   */   @NotNull
/*   */   default LLMProfileID getId() {
/* 7 */     return getProfile().getId();
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   LLMProfile getProfile();
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\WithLLMProfile.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */