/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.critique.CritiqueResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.critique.TaskReportCritiqueResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.edit_workers.EditAgentResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.history_processors.CompressHistoryProcessorResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.history_processors.Last5ObservationsResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.RelevantSymbolsExtractorResponse;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerializersKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000n\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J1\0200\032\b\022\004\022\002H10\005\"\006\b\000\0201\030\0012\006\0202\032\002032\020\0204\032\f\022\002\b\003\022\004\022\002H105H\bJ\037\0206\032\b\022\004\022\002H10\005\"\006\b\000\0201\030\0012\006\0202\032\00203H\bJ8\0207\032\b\022\004\022\002H10\005\"\022\b\000\0208*\f\022\002\b\003\022\004\022\002H105\"\006\b\001\0201\030\0012\006\0204\032\002H8H\b¢\006\002\0209R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\027\020\t\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\n\020\bR\027\020\013\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\f\020\bR\027\020\r\032\b\022\004\022\0020\0160\005¢\006\b\n\000\032\004\b\017\020\bR\027\020\020\032\b\022\004\022\0020\0210\005¢\006\b\n\000\032\004\b\022\020\bR\027\020\023\032\b\022\004\022\0020\0240\005¢\006\b\n\000\032\004\b\025\020\bR\027\020\026\032\b\022\004\022\0020\0240\005¢\006\b\n\000\032\004\b\027\020\bR\027\020\030\032\b\022\004\022\0020\0240\005¢\006\b\n\000\032\004\b\031\020\bR\027\020\032\032\b\022\004\022\0020\0330\005¢\006\b\n\000\032\004\b\034\020\bR\027\020\035\032\b\022\004\022\0020\0360\005¢\006\b\n\000\032\004\b\037\020\bR\027\020 \032\b\022\004\022\0020\0360\005¢\006\b\n\000\032\004\b!\020\bR\027\020\"\032\b\022\004\022\0020\0360\005¢\006\b\n\000\032\004\b#\020\bR\027\020$\032\b\022\004\022\0020%0\005¢\006\b\n\000\032\004\b&\020\bR\027\020'\032\b\022\004\022\0020(0\005¢\006\b\n\000\032\004\b)\020\bR\027\020*\032\b\022\004\022\0020+0\005¢\006\b\n\000\032\004\b,\020\bR\027\020-\032\b\022\004\022\0020.0\005¢\006\b\n\000\032\004\b/\020\b¨\006:"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentArtifactTypes;", "", "<init>", "()V", "Last5ObservationsArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsResponse;", "getLast5ObservationsArtifactType", "()Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Last5ObservationsWStepsInfoArtifactType", "getLast5ObservationsWStepsInfoArtifactType", "AddStepsInfoArtifactType", "getAddStepsInfoArtifactType", "VoidHistoryProcessorArtifactType", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/VoidHistoryProcessorResponse;", "getVoidHistoryProcessorArtifactType", "CompressHistoryProcessorArtifactType", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessorResponse;", "getCompressHistoryProcessorArtifactType", "RankingCritique", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;", "getRankingCritique", "EditCritique", "getEditCritique", "NebiusCritique", "getNebiusCritique", "TaskReportCritique", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueResponse;", "getTaskReportCritique", "SearchReplaceWorkerArtifact", "Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentResponse;", "getSearchReplaceWorkerArtifact", "ReplaceLinesWorkerArtifact", "getReplaceLinesWorkerArtifact", "RewriteFileWorkerArtifact", "getRewriteFileWorkerArtifact", "RelevantSymbolsArtifactType", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorResponse;", "getRelevantSymbolsArtifactType", "ProjectStrArtifactType", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrResponse;", "getProjectStrArtifactType", "ChatArtifactType", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "getChatArtifactType", "AgentSingleStepChat", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "getAgentSingleStepChat", "artifactType", "O", "name", "", "executor", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "builtinArtifactType", "artifactTypeByWorker", "W", "(Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;)Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAgentArtifactTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentArtifactTypes\n*L\n1#1,77:1\n65#1,2:78\n65#1,2:80\n65#1,2:82\n65#1,2:84\n65#1,2:86\n65#1,2:88\n65#1,2:90\n65#1,2:92\n65#1,2:94\n65#1,2:96\n65#1,2:98\n65#1,2:100\n65#1,2:102\n65#1,2:104\n65#1,2:106\n65#1,2:108\n*S KotlinDebug\n*F\n+ 1 AgentArtifactTypes.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentArtifactTypes\n*L\n37#1:78,2\n40#1:80,2\n43#1:82,2\n44#1:84,2\n47#1:86,2\n50#1:88,2\n51#1:90,2\n52#1:92,2\n53#1:94,2\n54#1:96,2\n55#1:98,2\n56#1:100,2\n57#1:102,2\n58#1:104,2\n60#1:106,2\n61#1:108,2\n*E\n"})
/*     */ public final class AgentArtifactTypes {
/*     */   @NotNull
/*     */   public static final AgentArtifactTypes INSTANCE;
/*     */   @NotNull
/*     */   private static final ArtifactType<Last5ObservationsResponse> Last5ObservationsArtifactType;
/*     */   @NotNull
/*     */   private static final ArtifactType<Last5ObservationsResponse> Last5ObservationsWStepsInfoArtifactType;
/*     */   @NotNull
/*     */   private static final ArtifactType<Last5ObservationsResponse> AddStepsInfoArtifactType;
/*     */   @NotNull
/*     */   private static final ArtifactType<VoidHistoryProcessorResponse> VoidHistoryProcessorArtifactType;
/*     */   @NotNull
/*     */   private static final ArtifactType<CompressHistoryProcessorResponse> CompressHistoryProcessorArtifactType;
/*     */   @NotNull
/*     */   private static final ArtifactType<CritiqueResponse> RankingCritique;
/*     */   @NotNull
/*     */   private static final ArtifactType<CritiqueResponse> EditCritique;
/*     */   
/*     */   @NotNull
/*  37 */   public final ArtifactType<Last5ObservationsResponse> getLast5ObservationsArtifactType() { return Last5ObservationsArtifactType; } @NotNull private static final ArtifactType<CritiqueResponse> NebiusCritique; @NotNull private static final ArtifactType<TaskReportCritiqueResponse> TaskReportCritique; @NotNull private static final ArtifactType<EditAgentResponse> SearchReplaceWorkerArtifact; @NotNull private static final ArtifactType<EditAgentResponse> ReplaceLinesWorkerArtifact; @NotNull private static final ArtifactType<EditAgentResponse> RewriteFileWorkerArtifact; @NotNull private static final ArtifactType<RelevantSymbolsExtractorResponse> RelevantSymbolsArtifactType; @NotNull private static final ArtifactType<ProjectStrResponse> ProjectStrArtifactType; @NotNull private static final ArtifactType<TaskResult> ChatArtifactType; @NotNull private static final ArtifactType<AgentResponse> AgentSingleStepChat; static { AgentArtifactTypes agentArtifactTypes1 = INSTANCE = new AgentArtifactTypes(); String str1 = "last_5_observations";
/*  38 */     ArtifactRequestExecutor artifactRequestExecutor1 = (ArtifactRequestExecutor)new Last5ObservationsHistoryProcessor();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$artifactType = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     Intrinsics.checkNotNull(SerializersKt.serializer(Last5ObservationsResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); KSerializer contentSerializer$iv = SerializersKt.serializer(Last5ObservationsResponse.class);
/*  79 */     Last5ObservationsArtifactType = new ArtifactType(str1, contentSerializer$iv, artifactRequestExecutor1, false, 8, null); AgentArtifactTypes this_$iv = INSTANCE; String name$iv = "last_5_observations_w_steps_info"; ArtifactRequestExecutor executor$iv = (ArtifactRequestExecutor)new Last5ObservationsWStepsInfo(); $i$f$artifactType = 0;
/*  80 */     Intrinsics.checkNotNull(SerializersKt.serializer(Last5ObservationsResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(Last5ObservationsResponse.class);
/*  81 */     Last5ObservationsWStepsInfoArtifactType = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "add_steps_info"; executor$iv = (ArtifactRequestExecutor)new AddStepsInfo(); $i$f$artifactType = 0;
/*  82 */     Intrinsics.checkNotNull(SerializersKt.serializer(Last5ObservationsResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(Last5ObservationsResponse.class);
/*  83 */     AddStepsInfoArtifactType = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "void_history_processor"; executor$iv = (ArtifactRequestExecutor)new VoidHistoryProcessor(); $i$f$artifactType = 0;
/*  84 */     Intrinsics.checkNotNull(SerializersKt.serializer(VoidHistoryProcessorResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(VoidHistoryProcessorResponse.class);
/*  85 */     VoidHistoryProcessorArtifactType = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "compress_history_processor"; executor$iv = (ArtifactRequestExecutor)new CompressHistoryProcessor(); $i$f$artifactType = 0;
/*  86 */     Intrinsics.checkNotNull(SerializersKt.serializer(CompressHistoryProcessorResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(CompressHistoryProcessorResponse.class);
/*  87 */     CompressHistoryProcessorArtifactType = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "ranking_critique"; executor$iv = (ArtifactRequestExecutor)new RankingCritique(); $i$f$artifactType = 0;
/*  88 */     Intrinsics.checkNotNull(SerializersKt.serializer(CritiqueResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(CritiqueResponse.class);
/*  89 */     RankingCritique = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "edit_critique"; executor$iv = (ArtifactRequestExecutor)new EditCritique(); $i$f$artifactType = 0;
/*  90 */     Intrinsics.checkNotNull(SerializersKt.serializer(CritiqueResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(CritiqueResponse.class);
/*  91 */     EditCritique = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "nebius_critique"; executor$iv = (ArtifactRequestExecutor)new NebiusCritique(); $i$f$artifactType = 0;
/*  92 */     Intrinsics.checkNotNull(SerializersKt.serializer(CritiqueResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(CritiqueResponse.class);
/*  93 */     NebiusCritique = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "task_report_critique"; executor$iv = (ArtifactRequestExecutor)new TaskReportReportCritique(); $i$f$artifactType = 0;
/*  94 */     Intrinsics.checkNotNull(SerializersKt.serializer(TaskReportCritiqueResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(TaskReportCritiqueResponse.class);
/*  95 */     TaskReportCritique = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "search_replace_worker"; executor$iv = (ArtifactRequestExecutor)new SearchReplaceWorker(); $i$f$artifactType = 0;
/*  96 */     Intrinsics.checkNotNull(SerializersKt.serializer(EditAgentResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(EditAgentResponse.class);
/*  97 */     SearchReplaceWorkerArtifact = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "replace_lines_worker"; executor$iv = (ArtifactRequestExecutor)new ReplaceLinesWorker(); $i$f$artifactType = 0;
/*  98 */     Intrinsics.checkNotNull(SerializersKt.serializer(EditAgentResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(EditAgentResponse.class);
/*  99 */     ReplaceLinesWorkerArtifact = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "rewrite_file_worker"; executor$iv = (ArtifactRequestExecutor)new RewriteFileWorker(); $i$f$artifactType = 0;
/* 100 */     Intrinsics.checkNotNull(SerializersKt.serializer(EditAgentResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(EditAgentResponse.class);
/* 101 */     RewriteFileWorkerArtifact = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "relevant_symbols_extractor"; executor$iv = (ArtifactRequestExecutor)new RelevantSymbolsExtractorWorker(); $i$f$artifactType = 0;
/* 102 */     Intrinsics.checkNotNull(SerializersKt.serializer(RelevantSymbolsExtractorResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(RelevantSymbolsExtractorResponse.class);
/* 103 */     RelevantSymbolsArtifactType = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "project_str_worker"; executor$iv = (ArtifactRequestExecutor)new ProjectStrWorker(); $i$f$artifactType = 0;
/* 104 */     Intrinsics.checkNotNull(SerializersKt.serializer(ProjectStrResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(ProjectStrResponse.class);
/* 105 */     ProjectStrArtifactType = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "chat"; executor$iv = new ChatAgentWorker(); $i$f$artifactType = 0;
/* 106 */     Intrinsics.checkNotNull(SerializersKt.serializer(TaskResult.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(TaskResult.class);
/* 107 */     ChatArtifactType = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); this_$iv = INSTANCE; name$iv = "chat_next_idea"; executor$iv = new ChatSingleStepAgentWorker(); $i$f$artifactType = 0;
/* 108 */     Intrinsics.checkNotNull(SerializersKt.serializer(AgentResponse.class), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<O of com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes.artifactType>"); contentSerializer$iv = SerializersKt.serializer(AgentResponse.class);
/* 109 */     AgentSingleStepChat = new ArtifactType(name$iv, contentSerializer$iv, executor$iv, false, 8, null); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<Last5ObservationsResponse> getLast5ObservationsWStepsInfoArtifactType() {
/*     */     return Last5ObservationsWStepsInfoArtifactType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<Last5ObservationsResponse> getAddStepsInfoArtifactType() {
/*     */     return AddStepsInfoArtifactType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<VoidHistoryProcessorResponse> getVoidHistoryProcessorArtifactType() {
/*     */     return VoidHistoryProcessorArtifactType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<CompressHistoryProcessorResponse> getCompressHistoryProcessorArtifactType() {
/*     */     return CompressHistoryProcessorArtifactType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<CritiqueResponse> getRankingCritique() {
/*     */     return RankingCritique;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<CritiqueResponse> getEditCritique() {
/*     */     return EditCritique;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<CritiqueResponse> getNebiusCritique() {
/*     */     return NebiusCritique;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<TaskReportCritiqueResponse> getTaskReportCritique() {
/*     */     return TaskReportCritique;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<EditAgentResponse> getSearchReplaceWorkerArtifact() {
/*     */     return SearchReplaceWorkerArtifact;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<EditAgentResponse> getReplaceLinesWorkerArtifact() {
/*     */     return ReplaceLinesWorkerArtifact;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<EditAgentResponse> getRewriteFileWorkerArtifact() {
/*     */     return RewriteFileWorkerArtifact;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<RelevantSymbolsExtractorResponse> getRelevantSymbolsArtifactType() {
/*     */     return RelevantSymbolsArtifactType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<ProjectStrResponse> getProjectStrArtifactType() {
/*     */     return ProjectStrArtifactType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<TaskResult> getChatArtifactType() {
/*     */     return ChatArtifactType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactType<AgentResponse> getAgentSingleStepChat() {
/*     */     return AgentSingleStepChat;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentArtifactTypes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */