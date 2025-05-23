/*    */ package com.intellij.ml.llm.matterhorn.ej.rubymine;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\027\020\t\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\n\020\bR\027\020\013\032\b\022\004\022\0020\f0\005¢\006\b\n\000\032\004\b\r\020\bR\027\020\016\032\b\022\004\022\0020\0170\005¢\006\b\n\000\032\004\b\020\020\b¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rubymine/RubyMineAgentArtifactTypes;", "", "<init>", "()V", "SWEPatchArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "getSWEPatchArtifactType", "()Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "SWEChatArtifactType", "getSWEChatArtifactType", "AgentSingleStepPlan", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "getAgentSingleStepPlan", "ProjectCheckArtifactType", "", "getProjectCheckArtifactType", "ej-rubymine"})
/*    */ @SourceDebugExtension({"SMAP\nRubyMineAgentArtifactTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RubyMineAgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/rubymine/RubyMineAgentArtifactTypes\n+ 2 AgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentArtifactTypes\n*L\n1#1,15:1\n65#2,2:16\n65#2,2:18\n65#2,2:20\n65#2,2:22\n*S KotlinDebug\n*F\n+ 1 RubyMineAgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/rubymine/RubyMineAgentArtifactTypes\n*L\n8#1:16,2\n9#1:18,2\n10#1:20,2\n12#1:22,2\n*E\n"})
/*    */ public final class RubyMineAgentArtifactTypes {
/*    */   @NotNull
/*  8 */   public static final RubyMineAgentArtifactTypes INSTANCE = new RubyMineAgentArtifactTypes(); @NotNull private static final ArtifactType<TaskResult> SWEPatchArtifactType; @NotNull private static final ArtifactType<TaskResult> SWEChatArtifactType; @NotNull public final ArtifactType<TaskResult> getSWEPatchArtifactType() { return SWEPatchArtifactType; } @NotNull private static final ArtifactType<AgentResponse> AgentSingleStepPlan; @NotNull private static final ArtifactType<Boolean> ProjectCheckArtifactType; static { AgentArtifactTypes agentArtifactTypes1 = AgentArtifactTypes.INSTANCE; String str1 = "rubymine_swe_patch"; ArtifactRequestExecutor executor$iv = (ArtifactRequestExecutor)new RubyMineIssueAgentWorker(); int $i$f$artifactType = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     Intrinsics.checkNotNull(SerializersKt.serializer(TaskResult.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); KSerializer contentSerializer$iv = SerializersKt.serializer(TaskResult.class);
/* 17 */     SWEPatchArtifactType = new ArtifactType(str1, contentSerializer$iv, executor$iv, false, 8, null); AgentArtifactTypes this_$iv = AgentArtifactTypes.INSTANCE; String name$iv = "rubymine_chat_swe_patch"; executor$iv = (ArtifactRequestExecutor)new RubyMineChatAgentWorker(); $i$f$artifactType = 0;
/* 18 */     Intrinsics.checkNotNull(SerializersKt.serializer(TaskResult.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(TaskResult.class);
/* 19 */     SWEChatArtifactType = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = AgentArtifactTypes.INSTANCE; name$iv = "rubymine_swe_next_step"; executor$iv = (ArtifactRequestExecutor)new RubyMineIssueSingleStepAgentWorker(); $i$f$artifactType = 0;
/* 20 */     Intrinsics.checkNotNull(SerializersKt.serializer(AgentResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(AgentResponse.class);
/* 21 */     AgentSingleStepPlan = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = AgentArtifactTypes.INSTANCE; name$iv = "rubymine_project_check_artifact_type"; executor$iv = (ArtifactRequestExecutor)new RubyMineProjectCheckWorker(); $i$f$artifactType = 0;
/* 22 */     Intrinsics.checkNotNull(SerializersKt.serializer(Boolean.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(Boolean.class);
/* 23 */     ProjectCheckArtifactType = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactType<TaskResult> getSWEChatArtifactType() {
/*    */     return SWEChatArtifactType;
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rubymine\RubyMineAgentArtifactTypes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */