package com.intellij.ml.llm.matterhorn.ej.ui.statistics.processors;

import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
import java.nio.file.Path;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\n\n\002\030\002\n\000\n\002\030\002\n\002\b\020\bf\030\0002\0020\001J\b\020\006\032\0020\007H&J\020\020\b\032\0020\0072\006\020\t\032\0020\nH&J\020\020\013\032\0020\0072\006\020\t\032\0020\nH&J\020\020\f\032\0020\0072\006\020\r\032\0020\003H&J\020\020\016\032\0020\0072\006\020\017\032\0020\003H&J\020\020\020\032\0020\0072\006\020\017\032\0020\003H&J\b\020\021\032\0020\007H&J\020\020\022\032\0020\0072\006\020\017\032\0020\003H&J\030\020\023\032\0020\0072\006\020\024\032\0020\0252\006\020\026\032\0020\027H&J\030\020\030\032\0020\0072\006\020\024\032\0020\0252\006\020\026\032\0020\027H&J\030\020\031\032\0020\0072\006\020\024\032\0020\0252\006\020\026\032\0020\027H&J\030\020\032\032\0020\0072\006\020\024\032\0020\0252\006\020\026\032\0020\027H&J\030\020\033\032\0020\0072\006\020\024\032\0020\0252\006\020\026\032\0020\027H&J\030\020\034\032\0020\0072\006\020\024\032\0020\0252\006\020\026\032\0020\027H&J\030\020\035\032\0020\0072\006\020\024\032\0020\0252\006\020\026\032\0020\027H&J\020\020\036\032\0020\0072\006\020\024\032\0020\025H&J\020\020\037\032\0020\0072\006\020\024\032\0020\025H&J\020\020 \032\0020\0072\006\020\024\032\0020\025H&J\020\020!\032\0020\0072\006\020\024\032\0020\025H&J\020\020\"\032\0020\0072\006\020\024\032\0020\025H&J\020\020#\032\0020\0072\006\020\024\032\0020\025H&J\030\020$\032\0020\0072\006\020\024\032\0020\0252\006\020\026\032\0020\027H&J \020%\032\0020\0072\006\020&\032\0020\0032\006\020\024\032\0020\0252\006\020\026\032\0020\027H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005¨\006'"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/processors/EJUIEventsProcessor;", "", "enabled", "", "getEnabled", "()Z", "logTaskRecentFilesButtonClicked", "", "logTaskRecentFileAdded", "path", "Ljava/nio/file/Path;", "logTaskRecentFileRemoved", "logCommandAutoApproveChecked", "checked", "logTaskDescriptionFocus", "followUp", "logTaskDescriptionInput", "logExampleClicked", "logSubmitTask", "logStopTaskButtonClicked", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "taskId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "logDoneTaskButtonClicked", "logStartAgainButtonClicked", "logDeclineTaskButtonClicked", "logRollbackTaskButtonClicked", "logGoBackTaskButtonClicked", "logCancelStepTaskButtonClicked", "logStopTaskMenuClicked", "logStartAgainTaskMenuClicked", "logRollbackTaskMenuClicked", "logDeleteTaskMenuClicked", "logDeleteAllTaskMenuClicked", "logTaskReopenFromHistory", "logAskConfirmationShowed", "logAskConfirmationAnswered", "isConfirmed", "ej-ui"})
public interface EJUIEventsProcessor {
  boolean getEnabled();
  
  void logTaskRecentFilesButtonClicked();
  
  void logTaskRecentFileAdded(@NotNull Path paramPath);
  
  void logTaskRecentFileRemoved(@NotNull Path paramPath);
  
  void logCommandAutoApproveChecked(boolean paramBoolean);
  
  void logTaskDescriptionFocus(boolean paramBoolean);
  
  void logTaskDescriptionInput(boolean paramBoolean);
  
  void logExampleClicked();
  
  void logSubmitTask(boolean paramBoolean);
  
  void logStopTaskButtonClicked(@NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId);
  
  void logDoneTaskButtonClicked(@NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId);
  
  void logStartAgainButtonClicked(@NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId);
  
  void logDeclineTaskButtonClicked(@NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId);
  
  void logRollbackTaskButtonClicked(@NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId);
  
  void logGoBackTaskButtonClicked(@NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId);
  
  void logCancelStepTaskButtonClicked(@NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId);
  
  void logStopTaskMenuClicked(@NotNull TaskChainId paramTaskChainId);
  
  void logStartAgainTaskMenuClicked(@NotNull TaskChainId paramTaskChainId);
  
  void logRollbackTaskMenuClicked(@NotNull TaskChainId paramTaskChainId);
  
  void logDeleteTaskMenuClicked(@NotNull TaskChainId paramTaskChainId);
  
  void logDeleteAllTaskMenuClicked(@NotNull TaskChainId paramTaskChainId);
  
  void logTaskReopenFromHistory(@NotNull TaskChainId paramTaskChainId);
  
  void logAskConfirmationShowed(@NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId);
  
  void logAskConfirmationAnswered(boolean paramBoolean, @NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\statistics\processors\EJUIEventsProcessor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */