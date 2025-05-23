package ai.grazie.model.task;

import ai.grazie.model.task.data.TaskStreamData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableTasksService.kt", l = {28}, i = {}, s = {}, n = {}, m = "execute$suspendImpl", c = "ai.grazie.model.task.SuspendableTasksService")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableTasksService$execute$2 extends ContinuationImpl {
  int label;
  
  SuspendableTasksService$execute$2(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableTasksService.execute$suspendImpl(SuspendableTasksService.this, null, (Continuation<? super Flow<? extends TaskStreamData>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\SuspendableTasksService$execute$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */