package ai.grazie.model.llm.chat.v5;

import ai.grazie.model.llm.chat.multimodal.LLMMultiModalChat;
import ai.grazie.model.llm.data.stream.LLMStreamData;
import ai.grazie.model.llm.profile.WithLLMProfile;
import ai.grazie.model.llm.prompt.LLMPromptID;
import ai.grazie.utils.annotations.ExperimentalAPI;
import ai.grazie.utils.attributes.Attributes;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H@¢\006\002\020\007J.\020\002\032\b\022\004\022\0020\0040\0032\006\020\b\032\0020\t2\006\020\002\032\0020\n2\b\b\002\020\013\032\0020\fH@¢\006\002\020\rJ.\020\002\032\b\022\004\022\0020\0040\0032\006\020\b\032\0020\t2\006\020\002\032\0020\0162\b\b\002\020\013\032\0020\fH¦@¢\006\002\020\017ø\001\000\002\006\n\004\b!0\001¨\006\020À\006\001"}, d2 = {"Lai/grazie/model/llm/chat/v5/LLMChatService;", "Lai/grazie/model/llm/profile/WithLLMProfile;", "chat", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "request", "Lai/grazie/model/llm/chat/v5/LLMChatRequest;", "(Lai/grazie/model/llm/chat/v5/LLMChatRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/model/llm/chat/v5/LLMChat;", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-llm"})
public interface LLMChatService extends WithLLMProfile {
  @Nullable
  Object chat(@NotNull LLMPromptID paramLLMPromptID, @NotNull LLMChat paramLLMChat, @NotNull Attributes paramAttributes, @NotNull Continuation<? super Flow<? extends LLMStreamData>> paramContinuation);
  
  @ExperimentalAPI
  @Nullable
  default Object chat(@NotNull LLMPromptID prompt, @NotNull LLMMultiModalChat chat, @NotNull Attributes parameters, @NotNull Continuation<? super Flow<? extends LLMStreamData>> $completion) {
    return chat$suspendImpl(this, prompt, chat, parameters, $completion);
  }
  
  @Nullable
  default Object chat(@NotNull LLMChatRequest request, @NotNull Continuation<? super Flow<? extends LLMStreamData>> $completion) {
    return chat$suspendImpl(this, request, $completion);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\v5\LLMChatService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */