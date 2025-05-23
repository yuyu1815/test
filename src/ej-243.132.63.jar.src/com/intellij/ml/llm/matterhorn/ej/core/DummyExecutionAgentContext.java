/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import ai.grazie.annotation.TestOnly;
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.HumanInLoop;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditServiceImpl;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionEnvironment;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.project.ProjectUtil;
/*     */ import com.intellij.openapi.vcs.changes.Change;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NotImplementedError;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000r\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\002\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007¢\006\004\b\b\020\tJ\026\020C\032\0020D2\f\020<\032\b\022\004\022\0020>0=H\026J\016\020E\032\b\022\004\022\0020>0=H\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\n\020\013R\016\020\004\032\0020\005X\004¢\006\002\n\000R\020\020\006\032\004\030\0010\007X\004¢\006\002\n\000R\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017R\034\020\020\032\004\030\0010\021X\016¢\006\016\n\000\032\004\b\022\020\023\"\004\b\024\020\025R\034\020\026\032\004\030\0010\027X\016¢\006\016\n\000\032\004\b\030\020\031\"\004\b\032\020\033R\032\020\034\032\0020\035X\016¢\006\016\n\000\032\004\b\036\020\037\"\004\b \020!R\024\020\"\032\0020#8VX\004¢\006\006\032\004\b$\020%R\024\020&\032\0020'8VX\004¢\006\006\032\004\b(\020)R$\020+\032\0020'2\006\020*\032\0020'8V@VX\016¢\006\f\032\004\b,\020)\"\004\b-\020.R(\0200\032\004\030\0010/2\b\020*\032\004\030\0010/8V@VX\016¢\006\f\032\004\b1\0202\"\004\b3\0204R\024\0205\032\0020\0078VX\004¢\006\006\032\004\b6\0207R\024\0208\032\002098VX\004¢\006\006\032\004\b:\020;R&\020<\032\016\022\n\022\b\022\004\022\0020>0=0=8VX\004¢\006\f\022\004\b?\020@\032\004\bA\020B¨\006F"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/DummyExecutionAgentContext;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "project", "Lcom/intellij/openapi/project/Project;", "agentContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentContext;", "environment", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentContext;Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "sessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "getSessionHistory", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "currentAgentState", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "getCurrentAgentState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "setCurrentAgentState", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;)V", "agentParameters", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;", "getAgentParameters", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;", "setAgentParameters", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;)V", "disableDirChange", "", "getDisableDirChange", "()Z", "setDisableDirChange", "(Z)V", "executionContext", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "getExecutionContext", "()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "projectDir", "Lcom/intellij/openapi/vfs/VirtualFile;", "getProjectDir", "()Lcom/intellij/openapi/vfs/VirtualFile;", "value", "currentDir", "getCurrentDir", "setCurrentDir", "(Lcom/intellij/openapi/vfs/VirtualFile;)V", "Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;", "currentScreenPosition", "getCurrentScreenPosition", "()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;", "setCurrentScreenPosition", "(Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;)V", "executionEnvironment", "getExecutionEnvironment", "()Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;", "editService", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditService;", "getEditService", "()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditService;", "changes", "", "Lcom/intellij/openapi/vcs/changes/Change;", "getChanges$annotations", "()V", "getChanges", "()Ljava/util/List;", "pushChange", "", "popChange", "ej-core"})
/*     */ public final class DummyExecutionAgentContext
/*     */   implements ExecutionAgentContext
/*     */ {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final AgentContext agentContext;
/*     */   @Nullable
/*     */   private final ExecutionEnvironment environment;
/*     */   @NotNull
/*     */   private final AgentSessionHistory sessionHistory;
/*     */   @Nullable
/*     */   private AgentState currentAgentState;
/*     */   @Nullable
/*     */   private AgentParameters agentParameters;
/*     */   private boolean disableDirChange;
/*     */   
/*     */   @NotNull
/*     */   public Project getProject() {
/*     */     return this.project;
/*     */   }
/*     */   
/*     */   public DummyExecutionAgentContext(@NotNull Project project, @NotNull AgentContext agentContext, @Nullable ExecutionEnvironment environment) {
/* 284 */     this.project = project;
/* 285 */     this.agentContext = agentContext;
/* 286 */     this.environment = environment;
/*     */     
/* 288 */     this.sessionHistory = AgentSessionHistory.Companion.initialHistoryContext(); } @NotNull public AgentSessionHistory getSessionHistory() { return this.sessionHistory; } @Nullable
/* 289 */   public AgentState getCurrentAgentState() { return this.currentAgentState; } public void setCurrentAgentState(@Nullable AgentState <set-?>) { this.currentAgentState = <set-?>; } @Nullable
/* 290 */   public AgentParameters getAgentParameters() { return this.agentParameters; } public void setAgentParameters(@Nullable AgentParameters <set-?>) { this.agentParameters = <set-?>; }
/* 291 */   public boolean getDisableDirChange() { return this.disableDirChange; } public void setDisableDirChange(boolean <set-?>) { this.disableDirChange = <set-?>; }
/*     */   @NotNull
/* 293 */   public ExecutionContext getExecutionContext() { throw new NotImplementedError("DummyExecutionAgentContext doesn't have ExecutionContext"); } @NotNull
/*     */   public VirtualFile getProjectDir() {
/* 295 */     Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(getProject())); return ProjectUtil.guessProjectDir(getProject());
/*     */   }
/*     */   @NotNull
/* 298 */   public VirtualFile getCurrentDir() { return this.agentContext.getCurrentDir(); } public void setCurrentDir(@NotNull VirtualFile value) {
/* 299 */     Intrinsics.checkNotNullParameter(value, "value"); this.agentContext.setCurrentDir(value);
/*     */   }
/*     */   @Nullable
/* 302 */   public FileWithLine getCurrentScreenPosition() { return this.agentContext.getCurrentScreenPosition(); } public void setCurrentScreenPosition(@Nullable FileWithLine value) {
/* 303 */     this.agentContext.setCurrentScreenPosition(value);
/*     */   } @NotNull
/*     */   public ExecutionEnvironment getExecutionEnvironment() {
/* 306 */     if (this.environment != null) {
/* 307 */       return this.environment;
/*     */     }
/* 309 */     throw new NotImplementedError("DummyExecutionAgentContext doesn't have ExecutionEnvironment");
/*     */   }
/*     */   @NotNull
/* 312 */   public EditService getEditService() { return (EditService)new EditServiceImpl(this, DummyExecutionAgentContext::_get_editService_$lambda$0, 
/*     */         
/* 314 */         HumanInLoop.Companion.getALLOW_ALL()); } private static final Unit _get_editService_$lambda$0(CustomArtifactEvent it) { Intrinsics.checkNotNullParameter(it, "it"); System.out.println(it); return Unit.INSTANCE; }
/*     */   
/*     */   @NotNull
/*     */   public List<List<Change>> getChanges() {
/* 318 */     return this.agentContext.getChanges();
/*     */   }
/*     */   public void pushChange(@NotNull List<? extends Change> changes) {
/* 321 */     Intrinsics.checkNotNullParameter(changes, "changes"); this.agentContext.pushChange(changes);
/*     */   }
/*     */   @NotNull
/*     */   public List<Change> popChange() {
/* 325 */     return this.agentContext.popChange();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\DummyExecutionAgentContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */