package com.intellij.ml.llm.matterhorn.ej.ui.tasks;

import com.intellij.ml.llm.matterhorn.ej.core.HumanInLoopRequest;
import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskSnapshot;
import com.intellij.ml.llm.matterhorn.ej.core.tasks.ProgressEntity;
import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskChainState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\bf\030\0002\0020\001J+\020\002\032\0020\0032!\020\004\032\035\022\023\022\0210\006¢\006\f\b\007\022\b\b\b\022\004\b\b(\t\022\004\022\0020\0060\005H&J\026\020\n\032\0020\0032\006\020\b\032\0020\013H¦@¢\006\002\020\fJ\026\020\r\032\0020\0032\006\020\016\032\0020\017H¦@¢\006\002\020\020J\030\020\021\032\0020\0032\b\020\022\032\004\030\0010\013H¦@¢\006\002\020\fJ\030\020\023\032\0020\0032\b\020\024\032\004\030\0010\025H¦@¢\006\002\020\026J\030\020\027\032\0020\0032\b\020\030\032\004\030\0010\031H¦@¢\006\002\020\032J\030\020\033\032\0020\0032\b\020\034\032\004\030\0010\035H¦@¢\006\002\020\036J\016\020\037\032\0020\003H¦@¢\006\002\020 R\022\020!\032\0020\006X¦\004¢\006\006\032\004\b\"\020#¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;", "", "update", "", "updater", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;", "Lkotlin/ParameterName;", "name", "newValue", "tryUpdateName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateState", "newState", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateError", "errorText", "updateHumanInLoopRequest", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCurrentActionJob", "job", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProgress", "progress", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "getValue", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;", "ej-ui"})
public interface TaskSnapshotUpdater {
  void update(@NotNull Function1<? super LiveTaskSnapshot, LiveTaskSnapshot> paramFunction1);
  
  @Nullable
  Object tryUpdateName(@NotNull String paramString, @NotNull Continuation<? super Unit> paramContinuation);
  
  @Nullable
  Object updateState(@NotNull TaskChainState paramTaskChainState, @NotNull Continuation<? super Unit> paramContinuation);
  
  @Nullable
  Object updateError(@Nullable String paramString, @NotNull Continuation<? super Unit> paramContinuation);
  
  @Nullable
  Object updateHumanInLoopRequest(@Nullable HumanInLoopRequest paramHumanInLoopRequest, @NotNull Continuation<? super Unit> paramContinuation);
  
  @Nullable
  Object updateCurrentActionJob(@Nullable Job paramJob, @NotNull Continuation<? super Unit> paramContinuation);
  
  @Nullable
  Object updateProgress(@Nullable ProgressEntity paramProgressEntity, @NotNull Continuation<? super Unit> paramContinuation);
  
  @Nullable
  Object complete(@NotNull Continuation<? super Unit> paramContinuation);
  
  @NotNull
  LiveTaskSnapshot getValue();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\TaskSnapshotUpdater.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */