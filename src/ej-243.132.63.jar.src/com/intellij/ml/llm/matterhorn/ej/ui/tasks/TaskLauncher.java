package com.intellij.ml.llm.matterhorn.ej.ui.tasks;

import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskEntity;
import com.intellij.openapi.project.Project;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J6\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH¦@¢\006\002\020\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskLauncher;", "", "launch", "Lkotlinx/coroutines/Job;", "project", "Lcom/intellij/openapi/project/Project;", "task", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;", "updater", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-ui"})
public interface TaskLauncher {
  @Nullable
  Object launch(@NotNull Project paramProject, @NotNull TaskEntity paramTaskEntity, @NotNull TaskSnapshotUpdater paramTaskSnapshotUpdater, @NotNull TaskChainId paramTaskChainId, @NotNull CoroutineScope paramCoroutineScope, @NotNull Continuation<? super Job> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\TaskLauncher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */