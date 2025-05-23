/*    */ package com.intellij.ml.llm.matterhorn.ej.clion;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ElectricJuniorSupport;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.IssueType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.docker.ProjectDockerFileExtractor;
/*    */ import java.nio.file.Path;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\b\020\b\032\0020\tH\026J\b\020\n\032\0020\013H\026J\026\020\f\032\b\022\004\022\0020\0160\r2\006\020\006\032\0020\007H\026J\b\020\017\032\0020\020H\026¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/clion/CLionElectricJuniorSupport;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;", "<init>", "()V", "getIssueWorker", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;", "type", "Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;", "getSingleStepWorker", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;", "getActionName", "", "getResolveIssueArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "getProjectDockerFileExtractor", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;", "ej-clion"})
/*    */ public final class CLionElectricJuniorSupport implements ElectricJuniorSupport {
/*    */   @Nullable
/* 12 */   public Object customizeSession(@NotNull ExecutionSession session, @Nullable Path envSetupSciptPath, @NotNull Path projectDir, @NotNull Continuation $completion) { return ElectricJuniorSupport.DefaultImpls.customizeSession(this, session, envSetupSciptPath, projectDir, $completion); } @NotNull public JuniePreconditionChecker getPreconditionChecker() { return ElectricJuniorSupport.DefaultImpls.getPreconditionChecker(this); } @NotNull
/*    */   public AbstractIssueAgentWorker getIssueWorker(@NotNull IssueType type) {
/* 14 */     Intrinsics.checkNotNullParameter(type, "type"); return new CLionIssueAgentWorker();
/*    */   }
/*    */   @NotNull
/*    */   public AbstractIssueSingleStepAgentWorker getSingleStepWorker() {
/* 18 */     return new CLionIssueSingleStepAgentWorker();
/*    */   }
/*    */   @NotNull
/*    */   public String getActionName() {
/* 22 */     return "CLionSupportAction";
/*    */   }
/*    */   @NotNull
/*    */   public ArtifactType<TaskResult> getResolveIssueArtifactType(@NotNull IssueType type) {
/* 26 */     Intrinsics.checkNotNullParameter(type, "type"); return CLionAgentArtifactTypes.INSTANCE.getSWEPatchArtifactType();
/*    */   }
/*    */   @NotNull
/*    */   public ProjectDockerFileExtractor getProjectDockerFileExtractor() {
/* 30 */     return (ProjectDockerFileExtractor)new DefaultDockerFileExtractor();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\clion\CLionElectricJuniorSupport.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */