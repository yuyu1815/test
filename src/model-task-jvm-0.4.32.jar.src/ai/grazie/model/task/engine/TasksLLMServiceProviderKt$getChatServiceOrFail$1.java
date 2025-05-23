package ai.grazie.model.task.engine;

import ai.grazie.model.llm.chat.v5.LLMChatService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "TasksLLMServiceProvider.kt", l = {19}, i = {0}, s = {"L$0"}, n = {"profile"}, m = "getChatServiceOrFail", c = "ai.grazie.model.task.engine.TasksLLMServiceProviderKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class TasksLLMServiceProviderKt$getChatServiceOrFail$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  TasksLLMServiceProviderKt$getChatServiceOrFail$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return TasksLLMServiceProviderKt.getChatServiceOrFail(null, null, (Continuation<? super LLMChatService>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\TasksLLMServiceProviderKt$getChatServiceOrFail$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */