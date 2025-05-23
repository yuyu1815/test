/*    */ package com.intellij.ml.llm.matterhorn.ej.goland;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\027\020\t\032\b\022\004\022\0020\n0\005¢\006\b\n\000\032\004\b\013\020\bR\027\020\f\032\b\022\004\022\0020\r0\005¢\006\b\n\000\032\004\b\016\020\b¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/goland/GoLandAgentArtifactTypes;", "", "<init>", "()V", "SWEPatchArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "getSWEPatchArtifactType", "()Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "AgentSingleStepIssuePlan", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "getAgentSingleStepIssuePlan", "ProjectCheckArtifactType", "", "getProjectCheckArtifactType", "ej-goland"})
/*    */ @SourceDebugExtension({"SMAP\nGoLandAgentArtifactTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoLandAgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/goland/GoLandAgentArtifactTypes\n+ 2 AgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentArtifactTypes\n*L\n1#1,14:1\n65#2,2:15\n65#2,2:17\n65#2,2:19\n*S KotlinDebug\n*F\n+ 1 GoLandAgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/goland/GoLandAgentArtifactTypes\n*L\n8#1:15,2\n9#1:17,2\n11#1:19,2\n*E\n"})
/*    */ public final class GoLandAgentArtifactTypes {
/*    */   @NotNull
/*  8 */   public static final GoLandAgentArtifactTypes INSTANCE = new GoLandAgentArtifactTypes(); @NotNull private static final ArtifactType<TaskResult> SWEPatchArtifactType; @NotNull private static final ArtifactType<AgentResponse> AgentSingleStepIssuePlan; @NotNull private static final ArtifactType<Boolean> ProjectCheckArtifactType; @NotNull public final ArtifactType<TaskResult> getSWEPatchArtifactType() { return SWEPatchArtifactType; } static { AgentArtifactTypes agentArtifactTypes1 = AgentArtifactTypes.INSTANCE; String str1 = "goland_swe_patch"; ArtifactRequestExecutor executor$iv = (ArtifactRequestExecutor)new GoLandIssueAgentWorker(); int $i$f$artifactType = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 15 */     Intrinsics.checkNotNull(SerializersKt.serializer(TaskResult.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); KSerializer contentSerializer$iv = SerializersKt.serializer(TaskResult.class);
/* 16 */     SWEPatchArtifactType = new ArtifactType(str1, contentSerializer$iv, executor$iv, false, 8, null); AgentArtifactTypes this_$iv = AgentArtifactTypes.INSTANCE; String name$iv = "goland_swe_next_step"; executor$iv = (ArtifactRequestExecutor)new GoLandIssueSingleStepAgentWorker(); $i$f$artifactType = 0;
/* 17 */     Intrinsics.checkNotNull(SerializersKt.serializer(AgentResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(AgentResponse.class);
/* 18 */     AgentSingleStepIssuePlan = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = AgentArtifactTypes.INSTANCE; name$iv = "goland_project_check_artifact_type"; executor$iv = (ArtifactRequestExecutor)new GoLandProjectCheckWorker(); $i$f$artifactType = 0;
/* 19 */     Intrinsics.checkNotNull(SerializersKt.serializer(Boolean.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(Boolean.class);
/* 20 */     ProjectCheckArtifactType = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactType<AgentResponse> getAgentSingleStepIssuePlan() {
/*    */     return AgentSingleStepIssuePlan;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactType<Boolean> getProjectCheckArtifactType() {
/*    */     return ProjectCheckArtifactType;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\goland\GoLandAgentArtifactTypes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */