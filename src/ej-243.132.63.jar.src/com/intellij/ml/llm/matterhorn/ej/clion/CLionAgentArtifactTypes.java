/*    */ package com.intellij.ml.llm.matterhorn.ej.clion;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\027\020\t\032\b\022\004\022\0020\n0\005¢\006\b\n\000\032\004\b\013\020\b¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/clion/CLionAgentArtifactTypes;", "", "<init>", "()V", "SWEPatchArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "getSWEPatchArtifactType", "()Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "AgentSingleStepPlan", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "getAgentSingleStepPlan", "ej-clion"})
/*    */ @SourceDebugExtension({"SMAP\nCLionAgentArtifactTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLionAgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/clion/CLionAgentArtifactTypes\n+ 2 AgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentArtifactTypes\n*L\n1#1,11:1\n65#2,2:12\n65#2,2:14\n*S KotlinDebug\n*F\n+ 1 CLionAgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/clion/CLionAgentArtifactTypes\n*L\n8#1:12,2\n9#1:14,2\n*E\n"})
/*    */ public final class CLionAgentArtifactTypes {
/*    */   @NotNull
/*  8 */   public static final CLionAgentArtifactTypes INSTANCE = new CLionAgentArtifactTypes(); @NotNull private static final ArtifactType<TaskResult> SWEPatchArtifactType; @NotNull private static final ArtifactType<AgentResponse> AgentSingleStepPlan; @NotNull public final ArtifactType<TaskResult> getSWEPatchArtifactType() { return SWEPatchArtifactType; } static { AgentArtifactTypes agentArtifactTypes1 = AgentArtifactTypes.INSTANCE; String str1 = "clion_swe_patch"; ArtifactRequestExecutor executor$iv = (ArtifactRequestExecutor)new CLionIssueAgentWorker(); int $i$f$artifactType = 0;
/*    */ 
/*    */ 
/*    */     
/* 12 */     Intrinsics.checkNotNull(SerializersKt.serializer(TaskResult.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); KSerializer contentSerializer$iv = SerializersKt.serializer(TaskResult.class);
/* 13 */     SWEPatchArtifactType = new ArtifactType(str1, contentSerializer$iv, executor$iv, false, 8, null); AgentArtifactTypes this_$iv = AgentArtifactTypes.INSTANCE; String name$iv = "clion_swe_next_step"; executor$iv = (ArtifactRequestExecutor)new CLionIssueSingleStepAgentWorker(); $i$f$artifactType = 0;
/* 14 */     Intrinsics.checkNotNull(SerializersKt.serializer(AgentResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(AgentResponse.class);
/* 15 */     AgentSingleStepPlan = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactType<AgentResponse> getAgentSingleStepPlan() {
/*    */     return AgentSingleStepPlan;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\clion\CLionAgentArtifactTypes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */