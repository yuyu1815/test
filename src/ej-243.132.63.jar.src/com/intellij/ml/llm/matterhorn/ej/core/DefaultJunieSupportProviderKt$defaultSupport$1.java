/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.docker.ProjectDockerFileExtractor;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0003\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\b\020\006\032\0020\007H\026J\b\020\b\032\0020\tH\026J\026\020\n\032\b\022\004\022\0020\f0\0132\006\020\004\032\0020\005H\026J\b\020\r\032\0020\016H\026¨\006\017"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/DefaultJunieSupportProviderKt$defaultSupport$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;", "getIssueWorker", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;", "type", "Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;", "getSingleStepWorker", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;", "getActionName", "", "getResolveIssueArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "getProjectDockerFileExtractor", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;", "ej-core"})
/*    */ public final class DefaultJunieSupportProviderKt$defaultSupport$1 implements ElectricJuniorSupport {
/* 10 */   public JuniePreconditionChecker getPreconditionChecker() { return ElectricJuniorSupport.DefaultImpls.getPreconditionChecker(this); } public Object customizeSession(ExecutionSession session, Path envSetupSciptPath, Path projectDir, Continuation<? super Result<Unit, ? extends Exception>> $completion) { return ElectricJuniorSupport.DefaultImpls.customizeSession(this, session, envSetupSciptPath, projectDir, $completion); }
/*    */    public AbstractIssueAgentWorker getIssueWorker(IssueType type) {
/* 12 */     Intrinsics.checkNotNullParameter(type, "type"); throw new IllegalStateException("Should not be called".toString());
/*    */   }
/*    */   
/*    */   public AbstractIssueSingleStepAgentWorker getSingleStepWorker() {
/* 16 */     throw new IllegalStateException("Should not be called".toString());
/*    */   }
/*    */   
/*    */   public String getActionName() {
/* 20 */     throw new IllegalStateException("Should not be called".toString());
/*    */   }
/*    */   
/*    */   public ArtifactType<TaskResult> getResolveIssueArtifactType(IssueType type) {
/* 24 */     Intrinsics.checkNotNullParameter(type, "type"); throw new IllegalStateException("Should not be called".toString());
/*    */   }
/*    */   
/*    */   public ProjectDockerFileExtractor getProjectDockerFileExtractor() {
/* 28 */     return (ProjectDockerFileExtractor)new DefaultDockerFileExtractor();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\DefaultJunieSupportProviderKt$defaultSupport$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */