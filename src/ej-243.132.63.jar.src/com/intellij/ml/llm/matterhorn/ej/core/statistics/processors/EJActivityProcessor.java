package com.intellij.ml.llm.matterhorn.ej.core.statistics.processors;

import com.intellij.internal.statistic.StructuredIdeActivity;
import com.intellij.ml.llm.matterhorn.ArtifactId;
import com.intellij.ml.llm.matterhorn.ArtifactStatistic;
import com.intellij.ml.llm.matterhorn.ej.core.statistics.EJResultStatus;
import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
import com.intellij.openapi.project.Project;
import java.util.Collection;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\036\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\bf\030\0002\0020\001Jn\020\006\032\0020\0072\n\020\b\032\006\022\002\b\0030\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\0232\f\020\024\032\b\022\004\022\0020\0210\0252\f\020\026\032\b\022\004\022\0020\0210\0252\f\020\027\032\b\022\004\022\0020\0210\0252\006\020\030\032\0020\021H&J<\020\031\032\0020\0322\006\020\033\032\0020\0072\n\020\b\032\006\022\002\b\0030\t2\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\034\032\0020\0352\006\020\036\032\0020\037H&J8\020 \032\0020\0072\n\020!\032\006\022\002\b\0030\t2\n\020\b\032\006\022\002\b\0030\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\017H&JF\020\"\032\0020\0322\006\020\033\032\0020\0072\n\020\b\032\006\022\002\b\0030\t2\006\020\f\032\0020\r2\006\020\016\032\0020\0172\b\020#\032\004\030\0010\0212\006\020\034\032\0020\0352\006\020\036\032\0020\037H&J,\020$\032\0020\0322\006\020\n\032\0020\0132\b\020\f\032\004\030\0010\r2\b\020\016\032\004\030\0010\0172\006\020%\032\0020\021H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005¨\006&"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/processors/EJActivityProcessor;", "", "enabled", "", "getEnabled", "()Z", "logGenerationStarted", "Lcom/intellij/internal/statistic/StructuredIdeActivity;", "artifactId", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "project", "Lcom/intellij/openapi/project/Project;", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "taskId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "taskDescription", "", "vcsStateId", "Ljava/util/UUID;", "recentFilesAddedToContext", "", "openFilesAddedToContext", "explicitlySelectedUserPaths", "ejVersion", "logGenerationFinished", "", "activity", "status", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;", "modelStats", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "logGenerationStepStarted", "parentArtifactId", "logGenerationStepFinished", "agentAction", "logTrajectoryEntry", "trajectoryEntry", "ej-core"})
public interface EJActivityProcessor {
  boolean getEnabled();
  
  @NotNull
  StructuredIdeActivity logGenerationStarted(@NotNull ArtifactId<?> paramArtifactId, @NotNull Project paramProject, @NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId, @NotNull String paramString1, @NotNull UUID paramUUID, @NotNull Collection<String> paramCollection1, @NotNull Collection<String> paramCollection2, @NotNull Collection<String> paramCollection3, @NotNull String paramString2);
  
  void logGenerationFinished(@NotNull StructuredIdeActivity paramStructuredIdeActivity, @NotNull ArtifactId<?> paramArtifactId, @NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId, @NotNull EJResultStatus paramEJResultStatus, @NotNull ArtifactStatistic paramArtifactStatistic);
  
  @NotNull
  StructuredIdeActivity logGenerationStepStarted(@NotNull ArtifactId<?> paramArtifactId1, @NotNull ArtifactId<?> paramArtifactId2, @NotNull Project paramProject, @NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId);
  
  void logGenerationStepFinished(@NotNull StructuredIdeActivity paramStructuredIdeActivity, @NotNull ArtifactId<?> paramArtifactId, @NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId, @Nullable String paramString, @NotNull EJResultStatus paramEJResultStatus, @NotNull ArtifactStatistic paramArtifactStatistic);
  
  void logTrajectoryEntry(@NotNull Project paramProject, @Nullable TaskChainId paramTaskChainId, @Nullable TaskId paramTaskId, @NotNull String paramString);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\statistics\processors\EJActivityProcessor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */