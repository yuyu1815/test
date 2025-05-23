/*    */ package com.intellij.ml.llm.matterhorn.ej.rubymine;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentResponse;
/*    */ import kotlin.Metadata;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\016\020\004\032\b\022\004\022\0020\0060\005H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rubymine/RubyMineIssueAgentWorker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;", "<init>", "()V", "getSingleStepArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "ej-rubymine"})
/*    */ public final class RubyMineIssueAgentWorker extends AbstractIssueAgentWorker {
/*    */   @NotNull
/*    */   public ArtifactType<AgentResponse> getSingleStepArtifactType() {
/* 10 */     return RubyMineAgentArtifactTypes.INSTANCE.getAgentSingleStepPlan();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rubymine\RubyMineIssueAgentWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */