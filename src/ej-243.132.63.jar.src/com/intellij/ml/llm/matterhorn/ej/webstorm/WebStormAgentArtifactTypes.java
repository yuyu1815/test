/*    */ package com.intellij.ml.llm.matterhorn.ej.webstorm;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\027\020\t\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\n\020\bR\027\020\013\032\b\022\004\022\0020\f0\005¢\006\b\n\000\032\004\b\r\020\bR\027\020\016\032\b\022\004\022\0020\0170\005¢\006\b\n\000\032\004\b\020\020\b¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/webstorm/WebStormAgentArtifactTypes;", "", "<init>", "()V", "SWEPatchArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "getSWEPatchArtifactType", "()Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "WebStormChatArtifactType", "getWebStormChatArtifactType", "AgentSingleStepPlan", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "getAgentSingleStepPlan", "ProjectCheckArtifactType", "", "getProjectCheckArtifactType", "ej-webstorm"})
/*    */ @SourceDebugExtension({"SMAP\nWebStormAgentArtifactTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebStormAgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/webstorm/WebStormAgentArtifactTypes\n+ 2 AgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentArtifactTypes\n*L\n1#1,14:1\n65#2,2:15\n65#2,2:17\n65#2,2:19\n65#2,2:21\n*S KotlinDebug\n*F\n+ 1 WebStormAgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/webstorm/WebStormAgentArtifactTypes\n*L\n8#1:15,2\n9#1:17,2\n10#1:19,2\n12#1:21,2\n*E\n"})
/*    */ public final class WebStormAgentArtifactTypes {
/*    */   @NotNull
/*  8 */   public static final WebStormAgentArtifactTypes INSTANCE = new WebStormAgentArtifactTypes(); @NotNull private static final ArtifactType<TaskResult> SWEPatchArtifactType; @NotNull private static final ArtifactType<TaskResult> WebStormChatArtifactType; @NotNull public final ArtifactType<TaskResult> getSWEPatchArtifactType() { return SWEPatchArtifactType; } @NotNull private static final ArtifactType<AgentResponse> AgentSingleStepPlan; @NotNull private static final ArtifactType<Boolean> ProjectCheckArtifactType; static { AgentArtifactTypes agentArtifactTypes1 = AgentArtifactTypes.INSTANCE; String str1 = "webstorm_swe_patch"; ArtifactRequestExecutor executor$iv = (ArtifactRequestExecutor)new WebStormIssueAgentWorker(); int $i$f$artifactType = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 15 */     Intrinsics.checkNotNull(SerializersKt.serializer(TaskResult.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); KSerializer contentSerializer$iv = SerializersKt.serializer(TaskResult.class);
/* 16 */     SWEPatchArtifactType = new ArtifactType(str1, contentSerializer$iv, executor$iv, false, 8, null); AgentArtifactTypes this_$iv = AgentArtifactTypes.INSTANCE; String name$iv = "webstorm_chat"; executor$iv = (ArtifactRequestExecutor)new WebStormChatAgentWorker(); $i$f$artifactType = 0;
/* 17 */     Intrinsics.checkNotNull(SerializersKt.serializer(TaskResult.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(TaskResult.class);
/* 18 */     WebStormChatArtifactType = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = AgentArtifactTypes.INSTANCE; name$iv = "webstorm_swe_next_step"; executor$iv = (ArtifactRequestExecutor)new WebStormIssueSingleStepAgentWorker(); $i$f$artifactType = 0;
/* 19 */     Intrinsics.checkNotNull(SerializersKt.serializer(AgentResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(AgentResponse.class);
/* 20 */     AgentSingleStepPlan = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = AgentArtifactTypes.INSTANCE; name$iv = "webstorm_project_check_artifact_type"; executor$iv = (ArtifactRequestExecutor)new WebStormProjectCheckWorker(); $i$f$artifactType = 0;
/* 21 */     Intrinsics.checkNotNull(SerializersKt.serializer(Boolean.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(Boolean.class);
/* 22 */     ProjectCheckArtifactType = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactType<TaskResult> getWebStormChatArtifactType() {
/*    */     return WebStormChatArtifactType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactType<AgentResponse> getAgentSingleStepPlan() {
/*    */     return AgentSingleStepPlan;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactType<Boolean> getProjectCheckArtifactType() {
/*    */     return ProjectCheckArtifactType;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\webstorm\WebStormAgentArtifactTypes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */