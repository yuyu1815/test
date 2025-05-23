/*    */ package com.intellij.ml.llm.matterhorn.ej.rider;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.IssueType;
/*    */ import java.nio.file.Path;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\b\020\b\032\0020\tH\026J\b\020\n\032\0020\013H\026J\026\020\f\032\b\022\004\022\0020\0160\r2\006\020\006\032\0020\007H\026J\b\020\017\032\0020\020H\026R\024\020\021\032\0020\022X\004¢\006\b\n\000\032\004\b\023\020\024¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rider/RiderElectricJuniorSupport;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;", "<init>", "()V", "getIssueWorker", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;", "type", "Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;", "getSingleStepWorker", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;", "getActionName", "", "getResolveIssueArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "getProjectDockerFileExtractor", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;", "preconditionChecker", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker;", "getPreconditionChecker", "()Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker;", "ej-rider"})
/*    */ public final class RiderElectricJuniorSupport implements ElectricJuniorSupport {
/*    */   @Nullable
/* 10 */   public Object customizeSession(@NotNull ExecutionSession session, @Nullable Path envSetupSciptPath, @NotNull Path projectDir, @NotNull Continuation $completion) { return ElectricJuniorSupport.DefaultImpls.customizeSession(this, session, envSetupSciptPath, projectDir, $completion); } @NotNull
/* 11 */   public AbstractIssueAgentWorker getIssueWorker(@NotNull IssueType type) { Intrinsics.checkNotNullParameter(type, "type"); switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) { case 1: case 2:  }  throw new NoWhenBranchMatchedException(); }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public AbstractIssueSingleStepAgentWorker getSingleStepWorker() {
/* 17 */     return new RiderIssueSingleStepAgentWorker();
/*    */   }
/*    */   @NotNull
/*    */   public String getActionName() {
/* 21 */     return "RiderSupportAction";
/*    */   } @NotNull
/*    */   public ArtifactType<TaskResult> getResolveIssueArtifactType(@NotNull IssueType type) {
/* 24 */     Intrinsics.checkNotNullParameter(type, "type"); switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) { case 1: case 2:  }  throw new NoWhenBranchMatchedException();
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public ProjectDockerFileExtractor getProjectDockerFileExtractor() {
/* 30 */     return (ProjectDockerFileExtractor)new DefaultDockerFileExtractor();
/*    */   }
/*    */   @NotNull
/* 33 */   private final JuniePreconditionChecker preconditionChecker = (JuniePreconditionChecker)new RiderJuniePrecondition(); @NotNull public JuniePreconditionChecker getPreconditionChecker() { return this.preconditionChecker; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rider\RiderElectricJuniorSupport.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */