package ai.grazie.model.task;

import ai.grazie.model.task.data.TaskStreamData;
import ai.grazie.model.task.data.v3.TaskStreamData;
import ai.grazie.model.task.exec.TaskCall;
import ai.grazie.model.task.exec.TaskParameters;
import ai.grazie.model.task.id.TaskID;
import ai.grazie.model.task.id.TaskName;
import ai.grazie.model.task.id.TaskTag;
import ai.grazie.model.task.roster.TasksRoster;
import ai.grazie.utils.data.DataHolder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J(\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\n\b\002\020\007\032\004\030\0010\bH¦@¢\006\002\020\tJ\034\020\002\032\b\022\004\022\0020\n0\0032\006\020\013\032\0020\fH@¢\006\002\020\rJ$\020\002\032\b\022\004\022\0020\n0\0032\006\020\016\032\0020\0172\006\020\020\032\0020\021H@¢\006\002\020\022J.\020\002\032\b\022\004\022\0020\0040\0032\006\020\023\032\0020\0242\b\020\007\032\004\030\0010\b2\006\020\020\032\0020\025H@¢\006\002\020\026J\016\020\027\032\0020\030H¦@¢\006\002\020\031ø\001\000\002\006\n\004\b!0\001¨\006\032À\006\001"}, d2 = {"Lai/grazie/model/task/SuspendableTasksService;", "", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/task/data/v3/TaskStreamData;", "taskCall", "Lai/grazie/model/task/TaskCallData;", "taskTag", "Lai/grazie/model/task/id/TaskTag;", "(Lai/grazie/model/task/TaskCallData;Lai/grazie/model/task/id/TaskTag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/model/task/data/TaskStreamData;", "call", "Lai/grazie/model/task/exec/TaskCall;", "(Lai/grazie/model/task/exec/TaskCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lai/grazie/model/task/id/TaskID;", "parameters", "Lai/grazie/model/task/exec/TaskParameters;", "(Lai/grazie/model/task/id/TaskID;Lai/grazie/model/task/exec/TaskParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "taskName", "Lai/grazie/model/task/id/TaskName;", "Lai/grazie/utils/data/DataHolder;", "(Lai/grazie/model/task/id/TaskName;Lai/grazie/model/task/id/TaskTag;Lai/grazie/utils/data/DataHolder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "roster", "Lai/grazie/model/task/roster/TasksRoster;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-task"})
@SourceDebugExtension({"SMAP\nSuspendableTasksService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableTasksService.kt\nai/grazie/model/task/SuspendableTasksService\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,33:1\n49#2:34\n51#2:38\n46#3:35\n51#3:37\n105#4:36\n*S KotlinDebug\n*F\n+ 1 SuspendableTasksService.kt\nai/grazie/model/task/SuspendableTasksService\n*L\n28#1:34\n28#1:38\n28#1:35\n28#1:37\n28#1:36\n*E\n"})
public interface SuspendableTasksService {
  @Nullable
  Object roster(@NotNull Continuation<? super TasksRoster> paramContinuation);
  
  @Nullable
  Object execute(@NotNull TaskCallData paramTaskCallData, @Nullable TaskTag paramTaskTag, @NotNull Continuation<? super Flow<? extends TaskStreamData>> paramContinuation);
  
  @Nullable
  default Object execute(@NotNull TaskName taskName, @Nullable TaskTag taskTag, @NotNull DataHolder parameters, @NotNull Continuation<? super Flow<? extends TaskStreamData>> $completion) {
    return execute$suspendImpl(this, taskName, taskTag, parameters, $completion);
  }
  
  @Deprecated(message = "in favour of `execute(TaskCallData)` or `execute(TaskName, TaskTag?, DataHolder)`")
  @Nullable
  default Object execute(@NotNull TaskCall call, @NotNull Continuation<? super Flow<? extends TaskStreamData>> $completion) {
    return execute$suspendImpl(this, call, $completion);
  }
  
  @Deprecated(message = "in favour of `execute(TaskCallData)` or `execute(TaskName, TaskTag?, DataHolder)`")
  @Nullable
  default Object execute(@NotNull TaskID id, @NotNull TaskParameters parameters, @NotNull Continuation<? super Flow<? extends TaskStreamData>> $completion) {
    return execute$suspendImpl(this, id, parameters, $completion);
  }
  
  @DebugMetadata(f = "SuspendableTasksService.kt", l = {28}, i = {}, s = {}, n = {}, m = "execute$suspendImpl", c = "ai.grazie.model.task.SuspendableTasksService")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableTasksService$execute$2 extends ContinuationImpl {
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
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\SuspendableTasksService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */