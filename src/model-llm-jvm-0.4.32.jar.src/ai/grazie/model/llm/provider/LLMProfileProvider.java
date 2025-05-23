package ai.grazie.model.llm.provider;

import ai.grazie.model.llm.profile.LLMProfile;
import ai.grazie.model.llm.profile.LLMProfileID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\022\020\002\032\004\030\0010\0032\006\020\004\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\006À\006\001"}, d2 = {"Lai/grazie/model/llm/provider/LLMProfileProvider;", "", "profile", "Lai/grazie/model/llm/profile/LLMProfile;", "id", "Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
public interface LLMProfileProvider {
  @Nullable
  LLMProfile profile(@NotNull LLMProfileID paramLLMProfileID);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\provider\LLMProfileProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */