/*    */ package com.intellij.ml.llm.matterhorn.ej.pycharm;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\027\020\t\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\n\020\bR\027\020\013\032\b\022\004\022\0020\f0\005¢\006\b\n\000\032\004\b\r\020\bR\027\020\016\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\017\020\bR\027\020\020\032\b\022\004\022\0020\0210\005¢\006\b\n\000\032\004\b\022\020\b¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PyCharmAgentArtifactTypes;", "", "<init>", "()V", "SWEPatchArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "getSWEPatchArtifactType", "()Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "PythonChatArtifactType", "getPythonChatArtifactType", "AgentSingleStepIssuePlan", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "getAgentSingleStepIssuePlan", "CloudAgentArtifactType", "getCloudAgentArtifactType", "ProjectCheckArtifactType", "", "getProjectCheckArtifactType", "ej-pycharm"})
/*    */ @SourceDebugExtension({"SMAP\nPyCharmAgentArtifactType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PyCharmAgentArtifactType.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/PyCharmAgentArtifactTypes\n+ 2 AgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentArtifactTypes\n*L\n1#1,19:1\n65#2,2:20\n65#2,2:22\n65#2,2:24\n75#2:26\n65#2,2:27\n*S KotlinDebug\n*F\n+ 1 PyCharmAgentArtifactType.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/PyCharmAgentArtifactTypes\n*L\n9#1:20,2\n10#1:22,2\n11#1:24,2\n13#1:26\n15#1:27,2\n*E\n"})
/*    */ public final class PyCharmAgentArtifactTypes {
/*    */   @NotNull
/*  9 */   public static final PyCharmAgentArtifactTypes INSTANCE = new PyCharmAgentArtifactTypes(); @NotNull private static final ArtifactType<TaskResult> SWEPatchArtifactType; @NotNull private static final ArtifactType<TaskResult> PythonChatArtifactType; @NotNull public final ArtifactType<TaskResult> getSWEPatchArtifactType() { return SWEPatchArtifactType; } @NotNull private static final ArtifactType<AgentResponse> AgentSingleStepIssuePlan; @NotNull private static final ArtifactType<TaskResult> CloudAgentArtifactType; @NotNull private static final ArtifactType<Boolean> ProjectCheckArtifactType; static { AgentArtifactTypes agentArtifactTypes1 = AgentArtifactTypes.INSTANCE; String str2 = "swe_patch"; ArtifactRequestExecutor artifactRequestExecutor2 = (ArtifactRequestExecutor)new PythonIssueAgentWorker(); int $i$f$artifactType = 0;
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
/* 20 */     Intrinsics.checkNotNull(SerializersKt.serializer(TaskResult.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); KSerializer contentSerializer$iv = SerializersKt.serializer(TaskResult.class);
/* 21 */     SWEPatchArtifactType = new ArtifactType(str2, contentSerializer$iv, artifactRequestExecutor2, false, 8, null); AgentArtifactTypes this_$iv = AgentArtifactTypes.INSTANCE; String str1 = "python_chat"; artifactRequestExecutor2 = (ArtifactRequestExecutor)new PythonChatAgentWorker(); $i$f$artifactType = 0;
/* 22 */     Intrinsics.checkNotNull(SerializersKt.serializer(TaskResult.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(TaskResult.class);
/* 23 */     PythonChatArtifactType = new ArtifactType(str1, contentSerializer$iv, artifactRequestExecutor2, false, 8, null); this_$iv = AgentArtifactTypes.INSTANCE; str1 = "swe_next_step"; artifactRequestExecutor2 = (ArtifactRequestExecutor)new PythonIssueSingleStepAgentWorker(); $i$f$artifactType = 0;
/* 24 */     Intrinsics.checkNotNull(SerializersKt.serializer(AgentResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(AgentResponse.class);
/* 25 */     AgentSingleStepIssuePlan = new ArtifactType(str1, contentSerializer$iv, artifactRequestExecutor2, false, 8, null); this_$iv = AgentArtifactTypes.INSTANCE; ArtifactRequestExecutor executor$iv = (ArtifactRequestExecutor)new PythonMultiAgentWorker(); int $i$f$artifactTypeByWorker = 0;
/* 26 */     Intrinsics.checkNotNullExpressionValue(executor$iv.getClass().getSimpleName(), "getSimpleName(...)"); CloudAgentArtifactType = new ArtifactType(StringsKt.removeSuffix(executor$iv.getClass().getSimpleName(), "Worker"), TaskResult.Companion.serializer(), executor$iv, false, 8, null); this_$iv = AgentArtifactTypes.INSTANCE; String name$iv = "pycharm_project_check_artifact_type"; ArtifactRequestExecutor artifactRequestExecutor1 = (ArtifactRequestExecutor)new PyCharmProjectCheckWorker(); $i$f$artifactType = 0;
/* 27 */     Intrinsics.checkNotNull(SerializersKt.serializer(Boolean.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(Boolean.class);
/* 28 */     ProjectCheckArtifactType = new ArtifactType(name$iv, contentSerializer$iv, artifactRequestExecutor1, false, 8, null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactType<TaskResult> getPythonChatArtifactType() {
/*    */     return PythonChatArtifactType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactType<AgentResponse> getAgentSingleStepIssuePlan() {
/*    */     return AgentSingleStepIssuePlan;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactType<TaskResult> getCloudAgentArtifactType() {
/*    */     return CloudAgentArtifactType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactType<Boolean> getProjectCheckArtifactType() {
/*    */     return ProjectCheckArtifactType;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\pycharm\PyCharmAgentArtifactTypes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */