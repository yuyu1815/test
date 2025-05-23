/*    */ package ai.grazie.model.llm.provider;
/*    */ import ai.grazie.model.llm.profile.LLMProfile;
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004¨\006\005"}, d2 = {"getProfileOrFail", "Lai/grazie/model/llm/profile/LLMProfile;", "Lai/grazie/model/llm/provider/LLMProfileProvider;", "profileID", "Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */ public final class LLMProfileProviderKt {
/*    */   @NotNull
/*    */   public static final LLMProfile getProfileOrFail(@NotNull LLMProfileProvider $this$getProfileOrFail, @NotNull LLMProfileID profileID) {
/* 12 */     Intrinsics.checkNotNullParameter($this$getProfileOrFail, "<this>"); Intrinsics.checkNotNullParameter(profileID, "profileID"); if ($this$getProfileOrFail.profile(profileID) == null) { $this$getProfileOrFail.profile(profileID); throw new IllegalStateException(("Failed to get " + profileID).toString()); }  return $this$getProfileOrFail.profile(profileID);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\provider\LLMProfileProviderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */