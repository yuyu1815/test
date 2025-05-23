package ai.grazie.model.task.engine;

import ai.grazie.model.task.Task;
import ai.grazie.utils.data.DataHolder;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\013\n\002\030\002\n\002\b\002\bf\030\0002\0020\001JC\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\006\020\006\032\0020\0072\006\020\b\032\0020\0052\027\020\t\032\023\022\004\022\0020\004\022\004\022\0020\0130\n¢\006\002\b\fH¦@¢\006\002\020\rø\001\000\002\006\n\004\b!0\001¨\006\016À\006\001"}, d2 = {"Lai/grazie/model/task/engine/ContainerTask;", "Lai/grazie/model/task/engine/ExecutableTask;", "resolve", "Lkotlin/Pair;", "Lai/grazie/model/task/Task;", "Lai/grazie/utils/data/DataHolder;", "context", "Lai/grazie/model/task/engine/TaskExecutionContext;", "parameters", "filter", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lai/grazie/model/task/engine/TaskExecutionContext;Lai/grazie/utils/data/DataHolder;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-task"})
public interface ContainerTask extends ExecutableTask {
  @Nullable
  Object resolve(@NotNull TaskExecutionContext paramTaskExecutionContext, @NotNull DataHolder paramDataHolder, @NotNull Function1<? super Task, Boolean> paramFunction1, @NotNull Continuation<? super Pair<? extends Task, DataHolder>> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\ContainerTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */