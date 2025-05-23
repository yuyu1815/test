/*     */ package com.intellij.ml.llm.matterhorn.ej.core.statistics;
/*     */ import com.intellij.internal.statistic.eventLog.events.DoubleEventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.EnumEventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventFields;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import com.intellij.internal.statistic.eventLog.events.IntEventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.LongEventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.StringEventField;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactStatistic;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*     */ import java.util.Collection;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000h\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\036\n\002\b\004\n\002\020\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b&\030\000 +2\0020\0012\0020\002:\001+B\007¢\006\004\b\003\020\004J\b\020\007\032\0020\006H\026Jn\020\013\032\0020\f2\n\020\r\032\006\022\002\b\0030\0162\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\0242\006\020\025\032\0020\0262\006\020\027\032\0020\0302\f\020\031\032\b\022\004\022\0020\0260\0322\f\020\033\032\b\022\004\022\0020\0260\0322\f\020\034\032\b\022\004\022\0020\0260\0322\006\020\035\032\0020\026H\026J,\020\036\032\0020\0372\006\020\017\032\0020\0202\b\020\021\032\004\030\0010\0222\b\020\023\032\004\030\0010\0242\006\020 \032\0020\026H\026J<\020!\032\0020\0372\006\020\"\032\0020\f2\n\020\r\032\006\022\002\b\0030\0162\006\020\021\032\0020\0222\006\020\023\032\0020\0242\006\020#\032\0020$2\006\020%\032\0020&H\026J8\020'\032\0020\f2\n\020(\032\006\022\002\b\0030\0162\n\020\r\032\006\022\002\b\0030\0162\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\024H\026JF\020)\032\0020\0372\006\020\"\032\0020\f2\n\020\r\032\006\022\002\b\0030\0162\006\020\021\032\0020\0222\006\020\023\032\0020\0242\b\020*\032\004\030\0010\0262\006\020#\032\0020$2\006\020%\032\0020&H\026R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\tX\004¢\006\002\n\000¨\006,"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJEventLogger;", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/processors/EJActivityProcessor;", "Lcom/intellij/internal/statistic/service/fus/collectors/CounterUsagesCollector;", "<init>", "()V", "GROUP", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "getGroup", "GENERATION_ACTIVITY", "Lcom/intellij/internal/statistic/IdeActivityDefinition;", "GENERATION_STEP_ACTIVITY", "logGenerationStarted", "Lcom/intellij/internal/statistic/StructuredIdeActivity;", "artifactId", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "project", "Lcom/intellij/openapi/project/Project;", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "taskId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "taskDescription", "", "vcsStateId", "Ljava/util/UUID;", "recentFilesAddedToContext", "", "openFilesAddedToContext", "explicitlySelectedUserPaths", "ejVersion", "logTrajectoryEntry", "", "trajectoryEntry", "logGenerationFinished", "activity", "status", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;", "modelStats", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "logGenerationStepStarted", "parentArtifactId", "logGenerationStepFinished", "agentAction", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAbstractEJEventLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractEJEventLogger.kt\ncom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJEventLogger\n+ 2 EventFields.kt\ncom/intellij/internal/statistic/eventLog/events/EventFields\n*L\n1#1,328:1\n262#2,3:329\n262#2,3:332\n*S KotlinDebug\n*F\n+ 1 AbstractEJEventLogger.kt\ncom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJEventLogger\n*L\n133#1:329,3\n134#1:332,3\n*E\n"})
/*     */ public abstract class AbstractEJEventLogger extends CounterUsagesCollector implements EJActivityProcessor {
/*     */   @NotNull
/*  21 */   private final EventLogGroup GROUP = new EventLogGroup("matterhorn.ej.events", 5, "FUS", "Matterhorn EJ plugin generation events"); @NotNull
/*  22 */   public EventLogGroup getGroup() { return this.GROUP; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\"\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\027\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\031\020\t\032\n\022\006\022\004\030\0010\0060\n¢\006\b\n\000\032\004\b\013\020\fR\031\020\r\032\n\022\006\022\004\030\0010\0060\n¢\006\b\n\000\032\004\b\016\020\fR\031\020\017\032\n\022\006\022\004\030\0010\0060\n¢\006\b\n\000\032\004\b\020\020\fR\031\020\021\032\n\022\006\022\004\030\0010\0060\n¢\006\b\n\000\032\004\b\022\020\fR\021\020\023\032\0020\024¢\006\b\n\000\032\004\b\025\020\026R\021\020\027\032\0020\024¢\006\b\n\000\032\004\b\030\020\026R\027\020\031\032\b\022\004\022\0020\0330\032¢\006\b\n\000\032\004\b\034\020\035R\027\020\036\032\b\022\004\022\0020\0330\032¢\006\b\n\000\032\004\b\037\020\035R\021\020 \032\0020!¢\006\b\n\000\032\004\b\"\020#R\021\020$\032\0020!¢\006\b\n\000\032\004\b%\020#R\021\020&\032\0020!¢\006\b\n\000\032\004\b'\020#R\021\020(\032\0020)¢\006\b\n\000\032\004\b*\020+R\021\020,\032\0020)¢\006\b\n\000\032\004\b-\020+R\021\020.\032\0020\024¢\006\b\n\000\032\004\b/\020\026R\021\0200\032\0020\024¢\006\b\n\000\032\004\b1\020\026R\021\0202\032\0020\024¢\006\b\n\000\032\004\b3\020\026R\021\0204\032\0020!¢\006\b\n\000\032\004\b5\020#R\021\0206\032\0020!¢\006\b\n\000\032\004\b7\020#R\021\0208\032\0020\024¢\006\b\n\000\032\004\b9\020\026R\021\020:\032\0020\024¢\006\b\n\000\032\004\b;\020\026R\021\020<\032\0020\024¢\006\b\n\000\032\004\b=\020\026R\021\020>\032\0020\024¢\006\b\n\000\032\004\b?\020\026R\021\020@\032\0020A¢\006\b\n\000\032\004\bB\020CR\021\020D\032\0020A¢\006\b\n\000\032\004\bE\020C¨\006F"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJEventLogger$Companion;", "", "<init>", "()V", "STEP_TYPES", "", "", "getSTEP_TYPES", "()Ljava/util/Set;", "ARTIFACT_ID", "Lcom/intellij/internal/statistic/eventLog/events/EventField;", "getARTIFACT_ID", "()Lcom/intellij/internal/statistic/eventLog/events/EventField;", "PARENT_ARTIFACT_ID", "getPARENT_ARTIFACT_ID", "CHAIN_ID", "getCHAIN_ID", "ISSUE_ID", "getISSUE_ID", "START_TIME_MS", "Lcom/intellij/internal/statistic/eventLog/events/LongEventField;", "getSTART_TIME_MS", "()Lcom/intellij/internal/statistic/eventLog/events/LongEventField;", "DURATION_MS", "getDURATION_MS", "EXIT_STATUS", "Lcom/intellij/internal/statistic/eventLog/events/EnumEventField;", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;", "getEXIT_STATUS", "()Lcom/intellij/internal/statistic/eventLog/events/EnumEventField;", "STEP_RESULT", "getSTEP_RESULT", "RECENT_FILES_ADDED_TO_CONTEXT_COUNT", "Lcom/intellij/internal/statistic/eventLog/events/IntEventField;", "getRECENT_FILES_ADDED_TO_CONTEXT_COUNT", "()Lcom/intellij/internal/statistic/eventLog/events/IntEventField;", "OPEN_FILES_ADDED_TO_CONTEXT_COUNT", "getOPEN_FILES_ADDED_TO_CONTEXT_COUNT", "EXPLICITLY_SELECTED_USER_PATHS_COUNT", "getEXPLICITLY_SELECTED_USER_PATHS_COUNT", "STEP_TYPE", "Lcom/intellij/internal/statistic/eventLog/events/StringEventField;", "getSTEP_TYPE", "()Lcom/intellij/internal/statistic/eventLog/events/StringEventField;", "EJ_VERSION", "getEJ_VERSION", "ARTIFACT_STATS_TIME_MS", "getARTIFACT_STATS_TIME_MS", "MODEL_STATS_TIME_MS", "getMODEL_STATS_TIME_MS", "MODEL_STATS_CACHED_TIME_MS", "getMODEL_STATS_CACHED_TIME_MS", "MODEL_STATS_REQUESTS", "getMODEL_STATS_REQUESTS", "MODEL_STATS_CACHED_REQUESTS", "getMODEL_STATS_CACHED_REQUESTS", "MODEL_STATS_INPUT_TOKENS", "getMODEL_STATS_INPUT_TOKENS", "MODEL_STATS_OUTPUT_TOKENS", "getMODEL_STATS_OUTPUT_TOKENS", "MODEL_STATS_CACHE_INPUT_TOKENS", "getMODEL_STATS_CACHE_INPUT_TOKENS", "MODEL_STATS_CACHE_CREATE_INPUT_TOKENS", "getMODEL_STATS_CACHE_CREATE_INPUT_TOKENS", "MODEL_STATS_COST", "Lcom/intellij/internal/statistic/eventLog/events/DoubleEventField;", "getMODEL_STATS_COST", "()Lcom/intellij/internal/statistic/eventLog/events/DoubleEventField;", "MODEL_STATS_CACHED_COST", "getMODEL_STATS_CACHED_COST", "ej-core"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*     */     public final Set<String> getSTEP_TYPES() {
/*  25 */       return AbstractEJEventLogger.STEP_TYPES;
/*     */     }
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
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final EventField<String> getARTIFACT_ID() {
/* 127 */       return AbstractEJEventLogger.ARTIFACT_ID; } @NotNull
/* 128 */     public final EventField<String> getPARENT_ARTIFACT_ID() { return AbstractEJEventLogger.PARENT_ARTIFACT_ID; } @NotNull
/* 129 */     public final EventField<String> getCHAIN_ID() { return AbstractEJEventLogger.CHAIN_ID; } @NotNull
/* 130 */     public final EventField<String> getISSUE_ID() { return AbstractEJEventLogger.ISSUE_ID; } @NotNull
/* 131 */     public final LongEventField getSTART_TIME_MS() { return AbstractEJEventLogger.START_TIME_MS; } @NotNull
/* 132 */     public final LongEventField getDURATION_MS() { return AbstractEJEventLogger.DURATION_MS; } @NotNull
/* 133 */     public final EnumEventField<EJResultStatus> getEXIT_STATUS() { return AbstractEJEventLogger.EXIT_STATUS; } @NotNull
/* 134 */     public final EnumEventField<EJResultStatus> getSTEP_RESULT() { return AbstractEJEventLogger.STEP_RESULT; } @NotNull
/* 135 */     public final IntEventField getRECENT_FILES_ADDED_TO_CONTEXT_COUNT() { return AbstractEJEventLogger.RECENT_FILES_ADDED_TO_CONTEXT_COUNT; } @NotNull
/* 136 */     public final IntEventField getOPEN_FILES_ADDED_TO_CONTEXT_COUNT() { return AbstractEJEventLogger.OPEN_FILES_ADDED_TO_CONTEXT_COUNT; } @NotNull
/* 137 */     public final IntEventField getEXPLICITLY_SELECTED_USER_PATHS_COUNT() { return AbstractEJEventLogger.EXPLICITLY_SELECTED_USER_PATHS_COUNT; } @NotNull
/* 138 */     public final StringEventField getSTEP_TYPE() { return AbstractEJEventLogger.STEP_TYPE; } @NotNull
/* 139 */     public final StringEventField getEJ_VERSION() { return AbstractEJEventLogger.EJ_VERSION; }
/*     */     @NotNull
/* 141 */     public final LongEventField getARTIFACT_STATS_TIME_MS() { return AbstractEJEventLogger.ARTIFACT_STATS_TIME_MS; } @NotNull
/* 142 */     public final LongEventField getMODEL_STATS_TIME_MS() { return AbstractEJEventLogger.MODEL_STATS_TIME_MS; } @NotNull
/* 143 */     public final LongEventField getMODEL_STATS_CACHED_TIME_MS() { return AbstractEJEventLogger.MODEL_STATS_CACHED_TIME_MS; } @NotNull
/* 144 */     public final IntEventField getMODEL_STATS_REQUESTS() { return AbstractEJEventLogger.MODEL_STATS_REQUESTS; } @NotNull
/* 145 */     public final IntEventField getMODEL_STATS_CACHED_REQUESTS() { return AbstractEJEventLogger.MODEL_STATS_CACHED_REQUESTS; } @NotNull
/* 146 */     public final LongEventField getMODEL_STATS_INPUT_TOKENS() { return AbstractEJEventLogger.MODEL_STATS_INPUT_TOKENS; } @NotNull
/* 147 */     public final LongEventField getMODEL_STATS_OUTPUT_TOKENS() { return AbstractEJEventLogger.MODEL_STATS_OUTPUT_TOKENS; } @NotNull
/* 148 */     public final LongEventField getMODEL_STATS_CACHE_INPUT_TOKENS() { return AbstractEJEventLogger.MODEL_STATS_CACHE_INPUT_TOKENS; } @NotNull
/* 149 */     public final LongEventField getMODEL_STATS_CACHE_CREATE_INPUT_TOKENS() { return AbstractEJEventLogger.MODEL_STATS_CACHE_CREATE_INPUT_TOKENS; } @NotNull
/* 150 */     public final DoubleEventField getMODEL_STATS_COST() { return AbstractEJEventLogger.MODEL_STATS_COST; } @NotNull
/* 151 */     public final DoubleEventField getMODEL_STATS_CACHED_COST() { return AbstractEJEventLogger.MODEL_STATS_CACHED_COST; }
/*     */      }
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
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*     */     String[] arrayOfString = new String[85];
/*     */     arrayOfString[0] = "unknown";
/*     */     arrayOfString[1] = "add_npm_dependency";
/*     */     arrayOfString[2] = "create";
/*     */     arrayOfString[3] = "replace_lines";
/*     */     arrayOfString[4] = "search_replace";
/*     */     arrayOfString[5] = "edit";
/*     */     arrayOfString[6] = "edit_symbol";
/*     */     arrayOfString[7] = "find_class_by_fqn";
/*     */     arrayOfString[8] = "find_file";
/*     */     arrayOfString[9] = "find_related_test";
/*     */     arrayOfString[10] = "goto";
/*     */     arrayOfString[11] = "npm_install";
/*     */     arrayOfString[12] = "open";
/*     */     arrayOfString[13] = "open_entire_file";
/*     */     arrayOfString[14] = "remove_npm_dependency";
/*     */     arrayOfString[15] = "rewrite_file";
/*     */     arrayOfString[16] = "npm_build";
/*     */     arrayOfString[17] = "npm_test";
/*     */     arrayOfString[18] = "run_test";
/*     */     arrayOfString[19] = "scroll_up";
/*     */     arrayOfString[20] = "scroll_down";
/*     */     arrayOfString[21] = "search_dir";
/*     */     arrayOfString[22] = "search_file";
/*     */     arrayOfString[23] = "search_project";
/*     */     arrayOfString[24] = "submit";
/*     */     arrayOfString[25] = "undo_edit";
/*     */     arrayOfString[26] = "get_file_structure";
/*     */     arrayOfString[27] = "SummarizeTaskDescription";
/*     */     arrayOfString[28] = "AgentStateMarker";
/*     */     arrayOfString[29] = "EditFileMarker";
/*     */     arrayOfString[30] = "NameMarker";
/*     */     arrayOfString[31] = "ReportGenerator";
/*     */     arrayOfString[32] = "StepSummary";
/*     */     arrayOfString[33] = "relevant_symbols_extractor";
/*     */     arrayOfString[34] = "void_history_processor";
/*     */     arrayOfString[35] = "compress_history_processor";
/*     */     arrayOfString[36] = "project_str_worker";
/*     */     arrayOfString[37] = "NameMarker";
/*     */     arrayOfString[38] = "void_history_processor";
/*     */     arrayOfString[39] = "last_5_observations";
/*     */     arrayOfString[40] = "last_5_observations_w_steps_info";
/*     */     arrayOfString[41] = "add_steps_info";
/*     */     arrayOfString[42] = "ranking_critique";
/*     */     arrayOfString[43] = "edit_critique";
/*     */     arrayOfString[44] = "nebius_critique";
/*     */     arrayOfString[45] = "search_replace_worker";
/*     */     arrayOfString[46] = "replace_lines_worker";
/*     */     arrayOfString[47] = "rewrite_file_worker";
/*     */     arrayOfString[48] = "swe_patch";
/*     */     arrayOfString[49] = "swe_next_step";
/*     */     arrayOfString[50] = "swe_next_step_idea";
/*     */     arrayOfString[51] = "swe_patch_idea";
/*     */     arrayOfString[52] = "phpstorm_swe_patch";
/*     */     arrayOfString[53] = "phpstorm_swe_next_step";
/*     */     arrayOfString[54] = "rider_swe_patch";
/*     */     arrayOfString[55] = "rider_swe_next_step";
/*     */     arrayOfString[56] = "webstorm_swe_patch";
/*     */     arrayOfString[57] = "webstorm_swe_next_step";
/*     */     arrayOfString[58] = "goland_swe_patch";
/*     */     arrayOfString[59] = "goland_swe_next_step";
/*     */     arrayOfString[60] = "rubymine_swe_patch";
/*     */     arrayOfString[61] = "rubymine_swe_next_step";
/*     */     arrayOfString[62] = "rustrover_swe_patch";
/*     */     arrayOfString[63] = "rustrover_swe_next_step";
/*     */     arrayOfString[64] = "ls";
/*     */     arrayOfString[65] = "cd";
/*     */     arrayOfString[66] = "find";
/*     */     arrayOfString[67] = "cat";
/*     */     arrayOfString[68] = "rm";
/*     */     arrayOfString[69] = "grep";
/*     */     arrayOfString[70] = "curl";
/*     */     arrayOfString[71] = "git";
/*     */     arrayOfString[72] = "python";
/*     */     arrayOfString[73] = "python3";
/*     */     arrayOfString[74] = "pip";
/*     */     arrayOfString[75] = "pip3";
/*     */     arrayOfString[76] = "pytest";
/*     */     arrayOfString[77] = "conda";
/*     */     arrayOfString[78] = "java";
/*     */     arrayOfString[79] = "javac";
/*     */     arrayOfString[80] = "kotlinc";
/*     */     arrayOfString[81] = "mvn";
/*     */     arrayOfString[82] = "mvnw";
/*     */     arrayOfString[83] = "gradle";
/*     */     arrayOfString[84] = "gradlew";
/*     */     STEP_TYPES = SetsKt.setOf((Object[])arrayOfString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final EventField<String> ARTIFACT_ID = EventFields.ShortAnonymizedField$default("artifact_id", null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final EventField<String> PARENT_ARTIFACT_ID = EventFields.ShortAnonymizedField$default("parent_artifact_id", null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final EventField<String> CHAIN_ID = EventFields.ShortAnonymizedField$default("chain_id", null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final EventField<String> ISSUE_ID = EventFields.ShortAnonymizedField$default("issue_id", null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final LongEventField START_TIME_MS = EventFields.Long$default("start_time_ms", null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final LongEventField DURATION_MS = EventFields.Long$default("duration_ms", null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*     */     EventFields eventFields1 = EventFields.INSTANCE;
/*     */     String name$iv = "exit_status";
/* 330 */     Function1 transform$iv = eventFields1.getDefaultEnumTransform(); int $i$f$Enum = 0;
/* 331 */     EXIT_STATUS = new EnumEventField(name$iv, EJResultStatus.class, null, transform$iv); EventFields $this$iv = EventFields.INSTANCE;
/*     */     name$iv = "step_result";
/* 333 */     transform$iv = $this$iv.getDefaultEnumTransform(); $i$f$Enum = 0;
/* 334 */     STEP_RESULT = new EnumEventField(name$iv, EJResultStatus.class, null, transform$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final IntEventField RECENT_FILES_ADDED_TO_CONTEXT_COUNT = EventFields.Int("recent_files_added_to_context_count");
/*     */   @NotNull
/*     */   private static final IntEventField OPEN_FILES_ADDED_TO_CONTEXT_COUNT = EventFields.Int("open_files_added_to_context_count");
/*     */   @NotNull
/*     */   private static final IntEventField EXPLICITLY_SELECTED_USER_PATHS_COUNT = EventFields.Int("explicitly_selected_user_paths_count");
/*     */   @NotNull
/*     */   private static final StringEventField STEP_TYPE = EventFields.String("step_type", CollectionsKt.toList(STEP_TYPES));
/*     */   @NotNull
/*     */   private static final StringEventField EJ_VERSION = EventFields.StringValidatedByRegexpReference$default("ej_version", "version", null, 4, null);
/*     */   @NotNull
/*     */   private static final LongEventField ARTIFACT_STATS_TIME_MS = EventFields.Long$default("artifact_stats_time_ms", null, 2, null);
/*     */   @NotNull
/*     */   private static final LongEventField MODEL_STATS_TIME_MS = EventFields.Long$default("model_stats_time_ms", null, 2, null);
/*     */   @NotNull
/*     */   private static final LongEventField MODEL_STATS_CACHED_TIME_MS = EventFields.Long$default("model_stats_cached_time_ms", null, 2, null);
/*     */   @NotNull
/*     */   private static final IntEventField MODEL_STATS_REQUESTS = EventFields.Int("model_stats_requests");
/*     */   @NotNull
/*     */   private static final IntEventField MODEL_STATS_CACHED_REQUESTS = EventFields.Int("model_stats_cached_requests");
/*     */   @NotNull
/*     */   private static final LongEventField MODEL_STATS_INPUT_TOKENS = EventFields.Long$default("model_stats_input_tokens", null, 2, null);
/*     */   @NotNull
/*     */   private static final LongEventField MODEL_STATS_OUTPUT_TOKENS = EventFields.Long$default("model_stats_output_tokens", null, 2, null);
/*     */   @NotNull
/*     */   private static final LongEventField MODEL_STATS_CACHE_INPUT_TOKENS = EventFields.Long$default("model_stats_cache_input_tokens", null, 2, null);
/*     */   @NotNull
/*     */   private static final LongEventField MODEL_STATS_CACHE_CREATE_INPUT_TOKENS = EventFields.Long$default("model_stats_cache_create_input_tokens", null, 2, null);
/*     */   @NotNull
/*     */   private static final DoubleEventField MODEL_STATS_COST = EventFields.Double("model_stats_cost");
/*     */   @NotNull
/*     */   private static final DoubleEventField MODEL_STATS_CACHED_COST = EventFields.Double("model_stats_cached_cost");
/*     */   @NotNull
/*     */   private final IdeActivityDefinition GENERATION_ACTIVITY;
/*     */   @NotNull
/*     */   private final IdeActivityDefinition GENERATION_STEP_ACTIVITY;
/*     */   @NotNull
/*     */   private static final Set<String> STEP_TYPES;
/*     */   @NotNull
/*     */   private static final EnumEventField<EJResultStatus> EXIT_STATUS;
/*     */   @NotNull
/*     */   private static final EnumEventField<EJResultStatus> STEP_RESULT;
/*     */   
/*     */   public AbstractEJEventLogger() {
/*     */     EventField[] arrayOfEventField = new EventField[9];
/*     */     arrayOfEventField[0] = ARTIFACT_ID;
/*     */     arrayOfEventField[1] = CHAIN_ID;
/*     */     arrayOfEventField[2] = ISSUE_ID;
/*     */     arrayOfEventField[3] = (EventField)START_TIME_MS;
/*     */     arrayOfEventField[4] = (EventField)AbstractEJVcsStateLogger.Companion.getVCS_STATE_ID$ej_core();
/*     */     arrayOfEventField[5] = (EventField)RECENT_FILES_ADDED_TO_CONTEXT_COUNT;
/*     */     arrayOfEventField[6] = (EventField)OPEN_FILES_ADDED_TO_CONTEXT_COUNT;
/*     */     arrayOfEventField[7] = (EventField)EXPLICITLY_SELECTED_USER_PATHS_COUNT;
/*     */     arrayOfEventField[8] = (EventField)EJ_VERSION;
/*     */     arrayOfEventField = new EventField[16];
/*     */     arrayOfEventField[0] = ARTIFACT_ID;
/*     */     arrayOfEventField[1] = CHAIN_ID;
/*     */     arrayOfEventField[2] = ISSUE_ID;
/*     */     arrayOfEventField[3] = (EventField)DURATION_MS;
/*     */     arrayOfEventField[4] = (EventField)EXIT_STATUS;
/*     */     arrayOfEventField[5] = (EventField)ARTIFACT_STATS_TIME_MS;
/*     */     arrayOfEventField[6] = (EventField)MODEL_STATS_TIME_MS;
/*     */     arrayOfEventField[7] = (EventField)MODEL_STATS_CACHED_TIME_MS;
/*     */     arrayOfEventField[8] = (EventField)MODEL_STATS_REQUESTS;
/*     */     arrayOfEventField[9] = (EventField)MODEL_STATS_CACHED_REQUESTS;
/*     */     arrayOfEventField[10] = (EventField)MODEL_STATS_INPUT_TOKENS;
/*     */     arrayOfEventField[11] = (EventField)MODEL_STATS_OUTPUT_TOKENS;
/*     */     arrayOfEventField[12] = (EventField)MODEL_STATS_CACHE_INPUT_TOKENS;
/*     */     arrayOfEventField[13] = (EventField)MODEL_STATS_CACHE_CREATE_INPUT_TOKENS;
/*     */     arrayOfEventField[14] = (EventField)MODEL_STATS_COST;
/*     */     arrayOfEventField[15] = (EventField)MODEL_STATS_CACHED_COST;
/*     */     this.GENERATION_ACTIVITY = EventLogGroup.registerIdeActivity$default(this.GROUP, "ej_generation", arrayOfEventField, arrayOfEventField, null, false, 24, null);
/*     */     arrayOfEventField = new EventField[5];
/*     */     arrayOfEventField[0] = PARENT_ARTIFACT_ID;
/*     */     arrayOfEventField[1] = ARTIFACT_ID;
/*     */     arrayOfEventField[2] = CHAIN_ID;
/*     */     arrayOfEventField[3] = ISSUE_ID;
/*     */     arrayOfEventField[4] = (EventField)START_TIME_MS;
/*     */     arrayOfEventField = new EventField[18];
/*     */     arrayOfEventField[0] = PARENT_ARTIFACT_ID;
/*     */     arrayOfEventField[1] = ARTIFACT_ID;
/*     */     arrayOfEventField[2] = CHAIN_ID;
/*     */     arrayOfEventField[3] = ISSUE_ID;
/*     */     arrayOfEventField[4] = (EventField)STEP_TYPE;
/*     */     arrayOfEventField[5] = (EventField)STEP_RESULT;
/*     */     arrayOfEventField[6] = (EventField)DURATION_MS;
/*     */     arrayOfEventField[7] = (EventField)ARTIFACT_STATS_TIME_MS;
/*     */     arrayOfEventField[8] = (EventField)MODEL_STATS_TIME_MS;
/*     */     arrayOfEventField[9] = (EventField)MODEL_STATS_CACHED_TIME_MS;
/*     */     arrayOfEventField[10] = (EventField)MODEL_STATS_REQUESTS;
/*     */     arrayOfEventField[11] = (EventField)MODEL_STATS_CACHED_REQUESTS;
/*     */     arrayOfEventField[12] = (EventField)MODEL_STATS_INPUT_TOKENS;
/*     */     arrayOfEventField[13] = (EventField)MODEL_STATS_OUTPUT_TOKENS;
/*     */     arrayOfEventField[14] = (EventField)MODEL_STATS_CACHE_INPUT_TOKENS;
/*     */     arrayOfEventField[15] = (EventField)MODEL_STATS_CACHE_CREATE_INPUT_TOKENS;
/*     */     arrayOfEventField[16] = (EventField)MODEL_STATS_COST;
/*     */     arrayOfEventField[17] = (EventField)MODEL_STATS_CACHED_COST;
/*     */     this.GENERATION_STEP_ACTIVITY = EventLogGroup.registerIdeActivity$default(this.GROUP, "ej_generation_step", arrayOfEventField, arrayOfEventField, null, false, 24, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public StructuredIdeActivity logGenerationStarted(@NotNull ArtifactId artifactId, @NotNull Project project, @NotNull TaskChainId chainId, @NotNull TaskId taskId, @NotNull String taskDescription, @NotNull UUID vcsStateId, @NotNull Collection recentFilesAddedToContext, @NotNull Collection openFilesAddedToContext, @NotNull Collection explicitlySelectedUserPaths, @NotNull String ejVersion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'artifactId'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'project'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'chainId'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #4
/*     */     //   20: ldc 'taskId'
/*     */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   25: aload #5
/*     */     //   27: ldc 'taskDescription'
/*     */     //   29: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   32: aload #6
/*     */     //   34: ldc 'vcsStateId'
/*     */     //   36: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   39: aload #7
/*     */     //   41: ldc 'recentFilesAddedToContext'
/*     */     //   43: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   46: aload #8
/*     */     //   48: ldc 'openFilesAddedToContext'
/*     */     //   50: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   53: aload #9
/*     */     //   55: ldc 'explicitlySelectedUserPaths'
/*     */     //   57: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   60: aload #10
/*     */     //   62: ldc 'ejVersion'
/*     */     //   64: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   67: getstatic java/util/concurrent/TimeUnit.NANOSECONDS : Ljava/util/concurrent/TimeUnit;
/*     */     //   70: invokestatic nanoTime : ()J
/*     */     //   73: invokevirtual toMillis : (J)J
/*     */     //   76: lstore #11
/*     */     //   78: aload_1
/*     */     //   79: aload_3
/*     */     //   80: aload #4
/*     */     //   82: lload #11
/*     */     //   84: aload #6
/*     */     //   86: aload #7
/*     */     //   88: aload #8
/*     */     //   90: aload #9
/*     */     //   92: aload #10
/*     */     //   94: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;JLjava/util/UUID;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*     */     //   99: astore #13
/*     */     //   101: aload_0
/*     */     //   102: getfield GENERATION_ACTIVITY : Lcom/intellij/internal/statistic/IdeActivityDefinition;
/*     */     //   105: aload_2
/*     */     //   106: aload #13
/*     */     //   108: invokevirtual started : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;)Lcom/intellij/internal/statistic/StructuredIdeActivity;
/*     */     //   111: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #224	-> 67
/*     */     //   #225	-> 78
/*     */     //   #238	-> 101
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   78	34	11	startedTimestamp	J
/*     */     //   101	11	13	dataSupplier	Lkotlin/jvm/functions/Function0;
/*     */     //   0	112	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJEventLogger;
/*     */     //   0	112	1	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   0	112	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	112	3	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   0	112	4	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   0	112	5	taskDescription	Ljava/lang/String;
/*     */     //   0	112	6	vcsStateId	Ljava/util/UUID;
/*     */     //   0	112	7	recentFilesAddedToContext	Ljava/util/Collection;
/*     */     //   0	112	8	openFilesAddedToContext	Ljava/util/Collection;
/*     */     //   0	112	9	explicitlySelectedUserPaths	Ljava/util/Collection;
/*     */     //   0	112	10	ejVersion	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private static final List logGenerationStarted$lambda$0(ArtifactId $artifactId, TaskChainId $chainId, TaskId $taskId, long $startedTimestamp, UUID $vcsStateId, Collection $recentFilesAddedToContext, Collection $openFilesAddedToContext, Collection $explicitlySelectedUserPaths, String $ejVersion) {
/*     */     EventPair[] arrayOfEventPair = new EventPair[9];
/*     */     arrayOfEventPair[0] = ARTIFACT_ID.with($artifactId.toString());
/*     */     arrayOfEventPair[1] = CHAIN_ID.with($chainId.toString());
/*     */     arrayOfEventPair[2] = ISSUE_ID.with($taskId.toString());
/*     */     arrayOfEventPair[3] = START_TIME_MS.with(Long.valueOf($startedTimestamp));
/*     */     arrayOfEventPair[4] = AbstractEJVcsStateLogger.Companion.getVCS_STATE_ID$ej_core().with($vcsStateId.toString());
/*     */     arrayOfEventPair[5] = RECENT_FILES_ADDED_TO_CONTEXT_COUNT.with(Integer.valueOf($recentFilesAddedToContext.size()));
/*     */     arrayOfEventPair[6] = OPEN_FILES_ADDED_TO_CONTEXT_COUNT.with(Integer.valueOf($openFilesAddedToContext.size()));
/*     */     arrayOfEventPair[7] = EXPLICITLY_SELECTED_USER_PATHS_COUNT.with(Integer.valueOf($explicitlySelectedUserPaths.size()));
/*     */     arrayOfEventPair[8] = EJ_VERSION.with(StatsUtilsKt.normalizeVersion($ejVersion));
/*     */     return CollectionsKt.listOf((Object[])arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logTrajectoryEntry(@NotNull Project project, @Nullable TaskChainId chainId, @Nullable TaskId taskId, @NotNull String trajectoryEntry) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Intrinsics.checkNotNullParameter(trajectoryEntry, "trajectoryEntry");
/*     */   }
/*     */   
/*     */   public void logGenerationFinished(@NotNull StructuredIdeActivity activity, @NotNull ArtifactId artifactId, @NotNull TaskChainId chainId, @NotNull TaskId taskId, @NotNull EJResultStatus status, @NotNull ArtifactStatistic modelStats) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'activity'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'artifactId'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'chainId'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #4
/*     */     //   20: ldc 'taskId'
/*     */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   25: aload #5
/*     */     //   27: ldc 'status'
/*     */     //   29: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   32: aload #6
/*     */     //   34: ldc 'modelStats'
/*     */     //   36: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   39: getstatic java/util/concurrent/TimeUnit.NANOSECONDS : Ljava/util/concurrent/TimeUnit;
/*     */     //   42: invokestatic nanoTime : ()J
/*     */     //   45: aload_1
/*     */     //   46: invokevirtual getStartedTimestamp : ()J
/*     */     //   49: lsub
/*     */     //   50: invokevirtual toMillis : (J)J
/*     */     //   53: lstore #7
/*     */     //   55: aload_1
/*     */     //   56: aload_2
/*     */     //   57: aload_3
/*     */     //   58: aload #4
/*     */     //   60: lload #7
/*     */     //   62: aload #5
/*     */     //   64: aload #6
/*     */     //   66: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;JLcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;)Lkotlin/jvm/functions/Function0;
/*     */     //   71: invokevirtual finished : (Lkotlin/jvm/functions/Function0;)Lcom/intellij/internal/statistic/StructuredIdeActivity;
/*     */     //   74: pop
/*     */     //   75: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #253	-> 39
/*     */     //   #254	-> 55
/*     */     //   #274	-> 75
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   55	21	7	durationMs	J
/*     */     //   0	76	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJEventLogger;
/*     */     //   0	76	1	activity	Lcom/intellij/internal/statistic/StructuredIdeActivity;
/*     */     //   0	76	2	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   0	76	3	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   0	76	4	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   0	76	5	status	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;
/*     */     //   0	76	6	modelStats	Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;
/*     */   }
/*     */   
/*     */   private static final List logGenerationFinished$lambda$1(ArtifactId $artifactId, TaskChainId $chainId, TaskId $taskId, long $durationMs, EJResultStatus $status, ArtifactStatistic $modelStats) {
/*     */     EventPair[] arrayOfEventPair = new EventPair[16];
/*     */     arrayOfEventPair[0] = ARTIFACT_ID.with($artifactId.toString());
/*     */     arrayOfEventPair[1] = CHAIN_ID.with($chainId.toString());
/*     */     arrayOfEventPair[2] = ISSUE_ID.with($taskId.toString());
/*     */     arrayOfEventPair[3] = DURATION_MS.with(Long.valueOf($durationMs));
/*     */     arrayOfEventPair[4] = EXIT_STATUS.with($status);
/*     */     arrayOfEventPair[5] = ARTIFACT_STATS_TIME_MS.with(Long.valueOf($modelStats.getArtifactTime()));
/*     */     arrayOfEventPair[6] = MODEL_STATS_TIME_MS.with(Long.valueOf($modelStats.getModelTime()));
/*     */     arrayOfEventPair[7] = MODEL_STATS_CACHED_TIME_MS.with(Long.valueOf($modelStats.getModelCachedTime()));
/*     */     arrayOfEventPair[8] = MODEL_STATS_REQUESTS.with(Integer.valueOf($modelStats.getRequests()));
/*     */     arrayOfEventPair[9] = MODEL_STATS_CACHED_REQUESTS.with(Integer.valueOf($modelStats.getCachedRequests()));
/*     */     arrayOfEventPair[10] = MODEL_STATS_INPUT_TOKENS.with(Long.valueOf($modelStats.getInputTokens()));
/*     */     arrayOfEventPair[11] = MODEL_STATS_OUTPUT_TOKENS.with(Long.valueOf($modelStats.getOutputTokens()));
/*     */     arrayOfEventPair[12] = MODEL_STATS_CACHE_INPUT_TOKENS.with(Long.valueOf($modelStats.getCacheInputTokens()));
/*     */     arrayOfEventPair[13] = MODEL_STATS_CACHE_CREATE_INPUT_TOKENS.with(Long.valueOf($modelStats.getCacheCreateInputTokens()));
/*     */     arrayOfEventPair[14] = MODEL_STATS_COST.with(Double.valueOf($modelStats.getCost()));
/*     */     arrayOfEventPair[15] = MODEL_STATS_CACHED_COST.with(Double.valueOf($modelStats.getCachedCost()));
/*     */     return CollectionsKt.listOf((Object[])arrayOfEventPair);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public StructuredIdeActivity logGenerationStepStarted(@NotNull ArtifactId parentArtifactId, @NotNull ArtifactId artifactId, @NotNull Project project, @NotNull TaskChainId chainId, @NotNull TaskId taskId) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'parentArtifactId'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc 'artifactId'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload_3
/*     */     //   14: ldc 'project'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #4
/*     */     //   21: ldc 'chainId'
/*     */     //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   26: aload #5
/*     */     //   28: ldc 'taskId'
/*     */     //   30: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   33: getstatic java/util/concurrent/TimeUnit.NANOSECONDS : Ljava/util/concurrent/TimeUnit;
/*     */     //   36: invokestatic nanoTime : ()J
/*     */     //   39: invokevirtual toMillis : (J)J
/*     */     //   42: lstore #6
/*     */     //   44: aload_1
/*     */     //   45: aload_2
/*     */     //   46: aload #4
/*     */     //   48: aload #5
/*     */     //   50: lload #6
/*     */     //   52: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;J)Lkotlin/jvm/functions/Function0;
/*     */     //   57: astore #8
/*     */     //   59: aload_0
/*     */     //   60: getfield GENERATION_STEP_ACTIVITY : Lcom/intellij/internal/statistic/IdeActivityDefinition;
/*     */     //   63: aload_3
/*     */     //   64: aload #8
/*     */     //   66: invokevirtual started : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;)Lcom/intellij/internal/statistic/StructuredIdeActivity;
/*     */     //   69: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #283	-> 33
/*     */     //   #284	-> 44
/*     */     //   #293	-> 59
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   44	26	6	startedTimestamp	J
/*     */     //   59	11	8	dataSupplier	Lkotlin/jvm/functions/Function0;
/*     */     //   0	70	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJEventLogger;
/*     */     //   0	70	1	parentArtifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   0	70	2	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   0	70	3	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	70	4	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   0	70	5	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */   }
/*     */   
/*     */   private static final List logGenerationStepStarted$lambda$2(ArtifactId $parentArtifactId, ArtifactId $artifactId, TaskChainId $chainId, TaskId $taskId, long $startedTimestamp) {
/*     */     EventPair[] arrayOfEventPair = new EventPair[5];
/*     */     arrayOfEventPair[0] = PARENT_ARTIFACT_ID.with($parentArtifactId.toString());
/*     */     arrayOfEventPair[1] = ARTIFACT_ID.with($artifactId.toString());
/*     */     arrayOfEventPair[2] = CHAIN_ID.with($chainId.toString());
/*     */     arrayOfEventPair[3] = ISSUE_ID.with($taskId.toString());
/*     */     arrayOfEventPair[4] = START_TIME_MS.with(Long.valueOf($startedTimestamp));
/*     */     return CollectionsKt.listOf((Object[])arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logGenerationStepFinished(@NotNull StructuredIdeActivity activity, @NotNull ArtifactId artifactId, @NotNull TaskChainId chainId, @NotNull TaskId taskId, @Nullable String agentAction, @NotNull EJResultStatus status, @NotNull ArtifactStatistic modelStats) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'activity'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'artifactId'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'chainId'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #4
/*     */     //   20: ldc 'taskId'
/*     */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   25: aload #6
/*     */     //   27: ldc 'status'
/*     */     //   29: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   32: aload #7
/*     */     //   34: ldc 'modelStats'
/*     */     //   36: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   39: getstatic java/util/concurrent/TimeUnit.NANOSECONDS : Ljava/util/concurrent/TimeUnit;
/*     */     //   42: invokestatic nanoTime : ()J
/*     */     //   45: aload_1
/*     */     //   46: invokevirtual getStartedTimestamp : ()J
/*     */     //   49: lsub
/*     */     //   50: invokevirtual toMillis : (J)J
/*     */     //   53: lstore #8
/*     */     //   55: aload_1
/*     */     //   56: aload_2
/*     */     //   57: aload_3
/*     */     //   58: aload #4
/*     */     //   60: aload #5
/*     */     //   62: aload #6
/*     */     //   64: lload #8
/*     */     //   66: aload #7
/*     */     //   68: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;JLcom/intellij/ml/llm/matterhorn/ArtifactStatistic;)Lkotlin/jvm/functions/Function0;
/*     */     //   73: invokevirtual finished : (Lkotlin/jvm/functions/Function0;)Lcom/intellij/internal/statistic/StructuredIdeActivity;
/*     */     //   76: pop
/*     */     //   77: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #305	-> 39
/*     */     //   #306	-> 55
/*     */     //   #327	-> 77
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   55	23	8	durationMs	J
/*     */     //   0	78	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJEventLogger;
/*     */     //   0	78	1	activity	Lcom/intellij/internal/statistic/StructuredIdeActivity;
/*     */     //   0	78	2	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   0	78	3	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   0	78	4	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   0	78	5	agentAction	Ljava/lang/String;
/*     */     //   0	78	6	status	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;
/*     */     //   0	78	7	modelStats	Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;
/*     */   }
/*     */   
/*     */   private static final List logGenerationStepFinished$lambda$3(ArtifactId $artifactId, TaskChainId $chainId, TaskId $taskId, String $agentAction, EJResultStatus $status, long $durationMs, ArtifactStatistic $modelStats) {
/*     */     EventPair[] arrayOfEventPair = new EventPair[17];
/*     */     arrayOfEventPair[0] = ARTIFACT_ID.with($artifactId.toString());
/*     */     arrayOfEventPair[1] = CHAIN_ID.with($chainId.toString());
/*     */     arrayOfEventPair[2] = ISSUE_ID.with($taskId.toString());
/*     */     arrayOfEventPair[3] = STEP_TYPE.with(StatsUtilsKt.getCommand($agentAction));
/*     */     arrayOfEventPair[4] = STEP_RESULT.with($status);
/*     */     arrayOfEventPair[5] = DURATION_MS.with(Long.valueOf($durationMs));
/*     */     arrayOfEventPair[6] = ARTIFACT_STATS_TIME_MS.with(Long.valueOf($modelStats.getArtifactTime()));
/*     */     arrayOfEventPair[7] = MODEL_STATS_TIME_MS.with(Long.valueOf($modelStats.getModelTime()));
/*     */     arrayOfEventPair[8] = MODEL_STATS_CACHED_TIME_MS.with(Long.valueOf($modelStats.getModelCachedTime()));
/*     */     arrayOfEventPair[9] = MODEL_STATS_REQUESTS.with(Integer.valueOf($modelStats.getRequests()));
/*     */     arrayOfEventPair[10] = MODEL_STATS_CACHED_REQUESTS.with(Integer.valueOf($modelStats.getCachedRequests()));
/*     */     arrayOfEventPair[11] = MODEL_STATS_INPUT_TOKENS.with(Long.valueOf($modelStats.getInputTokens()));
/*     */     arrayOfEventPair[12] = MODEL_STATS_OUTPUT_TOKENS.with(Long.valueOf($modelStats.getOutputTokens()));
/*     */     arrayOfEventPair[13] = MODEL_STATS_CACHE_INPUT_TOKENS.with(Long.valueOf($modelStats.getCacheInputTokens()));
/*     */     arrayOfEventPair[14] = MODEL_STATS_CACHE_CREATE_INPUT_TOKENS.with(Long.valueOf($modelStats.getCacheCreateInputTokens()));
/*     */     arrayOfEventPair[15] = MODEL_STATS_COST.with(Double.valueOf($modelStats.getCost()));
/*     */     arrayOfEventPair[16] = MODEL_STATS_CACHED_COST.with(Double.valueOf($modelStats.getCachedCost()));
/*     */     return CollectionsKt.listOf((Object[])arrayOfEventPair);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\statistics\AbstractEJEventLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */