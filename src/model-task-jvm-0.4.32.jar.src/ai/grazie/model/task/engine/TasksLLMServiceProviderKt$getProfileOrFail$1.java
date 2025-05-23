package ai.grazie.model.task.engine;

import ai.grazie.model.llm.profile.LLMProfile;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "TasksLLMServiceProvider.kt", l = {27}, i = {0}, s = {"L$0"}, n = {"profile"}, m = "getProfileOrFail", c = "ai.grazie.model.task.engine.TasksLLMServiceProviderKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class TasksLLMServiceProviderKt$getProfileOrFail$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  TasksLLMServiceProviderKt$getProfileOrFail$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return TasksLLMServiceProviderKt.getProfileOrFail(null, null, (Continuation<? super LLMProfile>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\TasksLLMServiceProviderKt$getProfileOrFail$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */