/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditServiceImpl;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionEnvironment;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vcs.changes.Change;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000r\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\026\020+\032\0020,2\f\020-\032\b\022\004\022\0020/0.H\026J\016\0200\032\b\022\004\022\0020/0.H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\b\020\tR\024\020\n\032\0020\0138VX\004¢\006\006\032\004\b\f\020\rR\024\020\016\032\0020\0178VX\004¢\006\006\032\004\b\020\020\021R$\020\023\032\0020\0172\006\020\022\032\0020\0178V@VX\016¢\006\f\032\004\b\024\020\021\"\004\b\025\020\026R(\020\030\032\004\030\0010\0272\b\020\022\032\004\030\0010\0278V@VX\016¢\006\f\032\004\b\031\020\032\"\004\b\033\020\034R\032\020\035\032\0020\036X\016¢\006\016\n\000\032\004\b\037\020 \"\004\b!\020\"R\024\020#\032\0020$8VX\004¢\006\006\032\004\b%\020&R\024\020'\032\0020(X\004¢\006\b\n\000\032\004\b)\020*R \020-\032\016\022\n\022\b\022\004\022\0020/0.0.8VX\004¢\006\006\032\004\b1\0202R\024\0203\032\002048VX\004¢\006\006\032\004\b5\0206R\034\0207\032\004\030\00108X\016¢\006\016\n\000\032\004\b9\020:\"\004\b;\020<R\034\020=\032\004\030\0010>X\016¢\006\016\n\000\032\004\b?\020@\"\004\bA\020B¨\006C"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/SimpleExecutionAgentContext;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "agentContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentContext;", "executionContext", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentContext;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)V", "getExecutionContext", "()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "project", "Lcom/intellij/openapi/project/Project;", "getProject", "()Lcom/intellij/openapi/project/Project;", "projectDir", "Lcom/intellij/openapi/vfs/VirtualFile;", "getProjectDir", "()Lcom/intellij/openapi/vfs/VirtualFile;", "value", "currentDir", "getCurrentDir", "setCurrentDir", "(Lcom/intellij/openapi/vfs/VirtualFile;)V", "Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;", "currentScreenPosition", "getCurrentScreenPosition", "()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;", "setCurrentScreenPosition", "(Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;)V", "disableDirChange", "", "getDisableDirChange", "()Z", "setDisableDirChange", "(Z)V", "executionEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;", "getExecutionEnvironment", "()Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;", "editService", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditService;", "getEditService", "()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditService;", "pushChange", "", "changes", "", "Lcom/intellij/openapi/vcs/changes/Change;", "popChange", "getChanges", "()Ljava/util/List;", "sessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "getSessionHistory", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "currentAgentState", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "getCurrentAgentState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "setCurrentAgentState", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;)V", "agentParameters", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;", "getAgentParameters", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;", "setAgentParameters", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;)V", "ej-core"})
/*     */ public final class SimpleExecutionAgentContext
/*     */   implements ExecutionAgentContext
/*     */ {
/*     */   @NotNull
/*     */   private final AgentContext agentContext;
/*     */   @NotNull
/*     */   private final ExecutionContext executionContext;
/*     */   private boolean disableDirChange;
/*     */   @NotNull
/*     */   private final EditService editService;
/*     */   @Nullable
/*     */   private AgentState currentAgentState;
/*     */   @Nullable
/*     */   private AgentParameters agentParameters;
/*     */   
/*     */   @NotNull
/*     */   public ExecutionContext getExecutionContext() {
/*     */     return this.executionContext;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Project getProject() {
/*     */     return getExecutionContext().getRoot().getService().getProject();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public VirtualFile getProjectDir() {
/*     */     return getExecutionContext().getCurrentWorkingProjectDir();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public VirtualFile getCurrentDir() {
/*     */     return this.agentContext.getCurrentDir();
/*     */   }
/*     */   
/*     */   public void setCurrentDir(@NotNull VirtualFile value) {
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     this.agentContext.setCurrentDir(value);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public FileWithLine getCurrentScreenPosition() {
/*     */     return this.agentContext.getCurrentScreenPosition();
/*     */   }
/*     */   
/*     */   public void setCurrentScreenPosition(@Nullable FileWithLine value) {
/*     */     this.agentContext.setCurrentScreenPosition(value);
/*     */   }
/*     */   
/*     */   public boolean getDisableDirChange() {
/*     */     return this.disableDirChange;
/*     */   }
/*     */   
/*     */   public void setDisableDirChange(boolean <set-?>) {
/*     */     this.disableDirChange = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ExecutionEnvironment getExecutionEnvironment() {
/*     */     return this.agentContext.getExecutionEnvironment(getExecutionContext().getRoot());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public EditService getEditService() {
/*     */     return this.editService;
/*     */   }
/*     */   
/*     */   private static final Unit editService$lambda$0(SimpleExecutionAgentContext this$0, CustomArtifactEvent it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     this$0.getExecutionContext().sendEvent(it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public SimpleExecutionAgentContext(@NotNull AgentContext agentContext, @NotNull ExecutionContext executionContext) {
/* 237 */     this.agentContext = agentContext;
/* 238 */     this.executionContext = executionContext;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 258 */     this.editService = (EditService)new EditServiceImpl(
/* 259 */         this, 
/* 260 */         this::editService$lambda$0, 
/*     */ 
/*     */         
/* 263 */         getExecutionContext().getRoot().getHumanInLoop());
/*     */   }
/*     */   
/*     */   public void pushChange(@NotNull List<? extends Change> changes) {
/* 267 */     Intrinsics.checkNotNullParameter(changes, "changes"); this.agentContext.pushChange(changes);
/*     */   }
/*     */   @NotNull
/*     */   public List<Change> popChange() {
/* 271 */     return this.agentContext.popChange();
/*     */   } @NotNull
/*     */   public List<List<Change>> getChanges() {
/* 274 */     return this.agentContext.getChanges();
/*     */   }
/*     */   @NotNull
/* 277 */   public AgentSessionHistory getSessionHistory() { return this.agentContext.getSessionHistory(); }
/*     */   @Nullable
/* 279 */   public AgentState getCurrentAgentState() { return this.currentAgentState; } public void setCurrentAgentState(@Nullable AgentState <set-?>) { this.currentAgentState = <set-?>; } @Nullable
/* 280 */   public AgentParameters getAgentParameters() { return this.agentParameters; } public void setAgentParameters(@Nullable AgentParameters <set-?>) { this.agentParameters = <set-?>; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\SimpleExecutionAgentContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */