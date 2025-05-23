/*    */ package com.intellij.ml.llm.matterhorn.ej.pycharm;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueAgentWorker;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ElectricJuniorSupport;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.IssueType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.JuniePreconditionChecker;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionSession;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.docker.ProjectDockerFileExtractor;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\b\020\b\032\0020\tH\026J\b\020\n\032\0020\013H\026J\026\020\f\032\b\022\004\022\0020\0160\r2\006\020\006\032\0020\007H\026J\b\020\017\032\0020\020H\026R\024\020\021\032\0020\022X\004¢\006\b\n\000\032\004\b\023\020\024¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PycharmElectricJuniorSupport;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;", "<init>", "()V", "getIssueWorker", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;", "type", "Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;", "getSingleStepWorker", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;", "getActionName", "", "getResolveIssueArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "getProjectDockerFileExtractor", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;", "preconditionChecker", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker;", "getPreconditionChecker", "()Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker;", "ej-pycharm"})
/*    */ public final class PycharmElectricJuniorSupport
/*    */   implements ElectricJuniorSupport
/*    */ {
/*    */   @Nullable
/*    */   public Object customizeSession(@NotNull ExecutionSession session, @Nullable Path envSetupSciptPath, @NotNull Path projectDir, @NotNull Continuation $completion) {
/* 38 */     return ElectricJuniorSupport.DefaultImpls.customizeSession(this, session, envSetupSciptPath, projectDir, $completion); } @NotNull
/* 39 */   public AbstractIssueAgentWorker getIssueWorker(@NotNull IssueType type) { Intrinsics.checkNotNullParameter(type, "type"); switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) { case 1: case 2:  }  throw new NoWhenBranchMatchedException(); }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public AbstractIssueSingleStepAgentWorker getSingleStepWorker() {
/* 45 */     return new PythonIssueSingleStepAgentWorker();
/*    */   }
/*    */   @NotNull
/*    */   public String getActionName() {
/* 49 */     return "PyCharmSupportAction";
/*    */   }
/*    */   @NotNull
/*    */   public ArtifactType<TaskResult> getResolveIssueArtifactType(@NotNull IssueType type) {
/* 53 */     Intrinsics.checkNotNullParameter(type, "type"); switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) { case 1: case 2:  }  throw new NoWhenBranchMatchedException();
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public ProjectDockerFileExtractor getProjectDockerFileExtractor() {
/* 59 */     return new PythonDockerFileExtractor();
/*    */   }
/*    */   @NotNull
/* 62 */   private final JuniePreconditionChecker preconditionChecker = (JuniePreconditionChecker)new PycharmJuniePrecondition(); @NotNull public JuniePreconditionChecker getPreconditionChecker() { return this.preconditionChecker; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\pycharm\PycharmElectricJuniorSupport.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */