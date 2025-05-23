package ai.grazie.model.task.engine;

import ai.grazie.model.llm.chat.v5.LLMChatService;
import ai.grazie.model.llm.completion.LLMCompletionService;
import ai.grazie.model.llm.profile.LLMProfile;
import ai.grazie.model.llm.profile.LLMProfileID;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\"\n\002\b\002\n\002\020\013\n\002\b\002\bf\030\0002\0020\001J\030\020\002\032\004\030\0010\0032\006\020\004\032\0020\005H¦@¢\006\002\020\006J\030\020\007\032\004\030\0010\b2\006\020\004\032\0020\005H¦@¢\006\002\020\006J\030\020\t\032\004\030\0010\n2\006\020\004\032\0020\005H¦@¢\006\002\020\006J\024\020\013\032\b\022\004\022\0020\0050\fH¦@¢\006\002\020\rJ\026\020\016\032\0020\0172\006\020\004\032\0020\005H¦@¢\006\002\020\006J\026\020\020\032\0020\0172\006\020\004\032\0020\005H¦@¢\006\002\020\006ø\001\000\002\006\n\004\b!0\001¨\006\021À\006\001"}, d2 = {"Lai/grazie/model/task/engine/TasksLLMServiceProvider;", "", "getChatService", "Lai/grazie/model/llm/chat/v5/LLMChatService;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "(Lai/grazie/model/llm/profile/LLMProfileID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompletionService", "Lai/grazie/model/llm/completion/LLMCompletionService;", "getProfile", "Lai/grazie/model/llm/profile/LLMProfile;", "profilesWithChatSupport", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "supportsChats", "", "supportsCompletion", "model-task"})
public interface TasksLLMServiceProvider {
  @Nullable
  Object getProfile(@NotNull LLMProfileID paramLLMProfileID, @NotNull Continuation<? super LLMProfile> paramContinuation);
  
  @Nullable
  Object getChatService(@NotNull LLMProfileID paramLLMProfileID, @NotNull Continuation<? super LLMChatService> paramContinuation);
  
  @Nullable
  Object getCompletionService(@NotNull LLMProfileID paramLLMProfileID, @NotNull Continuation<? super LLMCompletionService> paramContinuation);
  
  @Nullable
  Object profilesWithChatSupport(@NotNull Continuation<? super Set<LLMProfileID>> paramContinuation);
  
  @Nullable
  Object supportsChats(@NotNull LLMProfileID paramLLMProfileID, @NotNull Continuation<? super Boolean> paramContinuation);
  
  @Nullable
  Object supportsCompletion(@NotNull LLMProfileID paramLLMProfileID, @NotNull Continuation<? super Boolean> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\TasksLLMServiceProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */