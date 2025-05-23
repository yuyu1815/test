package ai.grazie.model.llm.completion;

import ai.grazie.model.llm.data.stream.LLMStreamData;
import ai.grazie.model.llm.profile.WithLLMProfile;
import ai.grazie.model.llm.prompt.LLMPromptID;
import ai.grazie.utils.attributes.Attributes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J8\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\b2\b\b\002\020\n\032\0020\013H¦@¢\006\002\020\fø\001\000\002\006\n\004\b!0\001¨\006\rÀ\006\001"}, d2 = {"Lai/grazie/model/llm/completion/LLMCompletionService;", "Lai/grazie/model/llm/profile/WithLLMProfile;", "complete", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "prefix", "", "postfix", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/model/llm/prompt/LLMPromptID;Ljava/lang/String;Ljava/lang/String;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-llm"})
public interface LLMCompletionService extends WithLLMProfile {
  @Nullable
  Object complete(@NotNull LLMPromptID paramLLMPromptID, @NotNull String paramString1, @NotNull String paramString2, @NotNull Attributes paramAttributes, @NotNull Continuation<? super Flow<? extends LLMStreamData>> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\completion\LLMCompletionService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */