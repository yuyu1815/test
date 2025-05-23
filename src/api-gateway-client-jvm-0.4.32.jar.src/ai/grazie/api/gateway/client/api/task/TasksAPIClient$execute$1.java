package ai.grazie.api.gateway.client.api.task;

import ai.grazie.model.task.data.v3.TaskStreamData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "TasksAPIClient.kt", l = {62}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "execute", c = "ai.grazie.api.gateway.client.api.task.TasksAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class TasksAPIClient$execute$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  TasksAPIClient$execute$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return TasksAPIClient.this.execute(null, null, (Continuation<? super Flow<? extends TaskStreamData>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\task\TasksAPIClient$execute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */