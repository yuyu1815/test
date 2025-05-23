package com.intellij.ml.llm.matterhorn.ej.core;

import com.intellij.ml.llm.matterhorn.ExecutionContext;
import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditService;
import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionEnvironment;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.changes.Change;
import com.intellij.openapi.vfs.VirtualFile;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000n\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\005\bf\030\0002\0020\001J\026\020%\032\0020&2\f\020 \032\b\022\004\022\0020\"0!H&J\016\020'\032\b\022\004\022\0020\"0!H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\rR\030\020\016\032\0020\013X¦\016¢\006\f\032\004\b\017\020\r\"\004\b\020\020\021R\032\020\022\032\004\030\0010\023X¦\016¢\006\f\032\004\b\024\020\025\"\004\b\026\020\027R\022\020\030\032\0020\031X¦\004¢\006\006\032\004\b\032\020\033R\022\020\034\032\0020\035X¦\004¢\006\006\032\004\b\036\020\037R\036\020 \032\016\022\n\022\b\022\004\022\0020\"0!0!X¦\004¢\006\006\032\004\b#\020$R\022\020(\032\0020)X¦\004¢\006\006\032\004\b*\020+R\032\020,\032\004\030\0010-X¦\016¢\006\f\032\004\b.\020/\"\004\b0\0201R\032\0202\032\004\030\00103X¦\016¢\006\f\032\004\b4\0205\"\004\b6\0207R\030\0208\032\00209X¦\016¢\006\f\032\004\b:\020;\"\004\b<\020=¨\006>"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "", "executionContext", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "getExecutionContext", "()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "project", "Lcom/intellij/openapi/project/Project;", "getProject", "()Lcom/intellij/openapi/project/Project;", "projectDir", "Lcom/intellij/openapi/vfs/VirtualFile;", "getProjectDir", "()Lcom/intellij/openapi/vfs/VirtualFile;", "currentDir", "getCurrentDir", "setCurrentDir", "(Lcom/intellij/openapi/vfs/VirtualFile;)V", "currentScreenPosition", "Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;", "getCurrentScreenPosition", "()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;", "setCurrentScreenPosition", "(Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;)V", "executionEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;", "getExecutionEnvironment", "()Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;", "editService", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditService;", "getEditService", "()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditService;", "changes", "", "Lcom/intellij/openapi/vcs/changes/Change;", "getChanges", "()Ljava/util/List;", "pushChange", "", "popChange", "sessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "getSessionHistory", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "currentAgentState", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "getCurrentAgentState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "setCurrentAgentState", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;)V", "agentParameters", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;", "getAgentParameters", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;", "setAgentParameters", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;)V", "disableDirChange", "", "getDisableDirChange", "()Z", "setDisableDirChange", "(Z)V", "ej-core"})
public interface ExecutionAgentContext {
  @NotNull
  ExecutionContext getExecutionContext();
  
  @NotNull
  Project getProject();
  
  @NotNull
  VirtualFile getProjectDir();
  
  @NotNull
  VirtualFile getCurrentDir();
  
  void setCurrentDir(@NotNull VirtualFile paramVirtualFile);
  
  @Nullable
  FileWithLine getCurrentScreenPosition();
  
  void setCurrentScreenPosition(@Nullable FileWithLine paramFileWithLine);
  
  @NotNull
  ExecutionEnvironment getExecutionEnvironment();
  
  @NotNull
  EditService getEditService();
  
  @NotNull
  List<List<Change>> getChanges();
  
  void pushChange(@NotNull List<? extends Change> paramList);
  
  @NotNull
  List<Change> popChange();
  
  @NotNull
  AgentSessionHistory getSessionHistory();
  
  @Nullable
  AgentState getCurrentAgentState();
  
  void setCurrentAgentState(@Nullable AgentState paramAgentState);
  
  @Nullable
  AgentParameters getAgentParameters();
  
  void setAgentParameters(@Nullable AgentParameters paramAgentParameters);
  
  boolean getDisableDirChange();
  
  void setDisableDirChange(boolean paramBoolean);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\ExecutionAgentContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */