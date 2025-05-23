/*     */ package com.intellij.ml.llm.matterhorn.ej.core.statistics;
/*     */ import com.intellij.internal.statistic.StructuredIdeActivity;
/*     */ import com.intellij.internal.statistic.eventLog.EventLogGroup;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventFields;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import com.intellij.internal.statistic.eventLog.events.LongEventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.StringEventField;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactStatistic;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000t\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\036\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b&\030\000 /2\0020\0012\0020\002:\001/B\007¢\006\004\b\003\020\004J\b\020\007\032\0020\006H\026J,\020\f\032\0020\r2\006\020\016\032\0020\0172\b\020\020\032\004\030\0010\0212\b\020\022\032\004\030\0010\0232\006\020\024\032\0020\025H\026Jn\020\031\032\0020\0322\n\020\033\032\006\022\002\b\0030\0342\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020\035\032\0020\0252\006\020\036\032\0020\0372\f\020 \032\b\022\004\022\0020\0250!2\f\020\"\032\b\022\004\022\0020\0250!2\f\020#\032\b\022\004\022\0020\0250!2\006\020$\032\0020\025H\026J<\020%\032\0020\r2\006\020&\032\0020\0322\n\020\033\032\006\022\002\b\0030\0342\006\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020'\032\0020(2\006\020)\032\0020*H\026J8\020+\032\0020\0322\n\020,\032\006\022\002\b\0030\0342\n\020\033\032\006\022\002\b\0030\0342\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\023H\026JF\020-\032\0020\r2\006\020&\032\0020\0322\n\020\033\032\006\022\002\b\0030\0342\006\020\020\032\0020\0212\006\020\022\032\0020\0232\b\020.\032\004\030\0010\0252\006\020'\032\0020(2\006\020)\032\0020*H\026R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\016\020\026\032\0020\027X\004¢\006\002\n\000R\016\020\030\032\0020\027X\004¢\006\002\n\000¨\0060"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJPrivateEventLogger;", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/processors/EJActivityProcessor;", "Lcom/intellij/internal/statistic/service/fus/collectors/CounterUsagesCollector;", "<init>", "()V", "GROUP", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "getGroup", "TRAJECTORY_ENTRY", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/RequestPrivateData;", "EJ_TRAJECTORY", "Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "logTrajectoryEntry", "", "project", "Lcom/intellij/openapi/project/Project;", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "taskId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "trajectoryEntry", "", "GENERATION_ACTIVITY", "Lcom/intellij/internal/statistic/IdeActivityDefinition;", "GENERATION_STEP_ACTIVITY", "logGenerationStarted", "Lcom/intellij/internal/statistic/StructuredIdeActivity;", "artifactId", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "taskDescription", "vcsStateId", "Ljava/util/UUID;", "recentFilesAddedToContext", "", "openFilesAddedToContext", "explicitlySelectedUserPaths", "ejVersion", "logGenerationFinished", "activity", "status", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;", "modelStats", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "logGenerationStepStarted", "parentArtifactId", "logGenerationStepFinished", "agentAction", "Companion", "ej-core"})
/*     */ public abstract class AbstractEJPrivateEventLogger extends CounterUsagesCollector implements EJActivityProcessor {
/*     */   @NotNull
/*  23 */   private final EventLogGroup GROUP = new EventLogGroup("matterhorn.ej.private.events", 2, "MTHC", "Matterhorn EJ plugin non anonymous generation events"); @NotNull
/*  24 */   public EventLogGroup getGroup() { return this.GROUP; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\007R\021\020\n\032\0020\005¢\006\b\n\000\032\004\b\013\020\007R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\007R\021\020\016\032\0020\005¢\006\b\n\000\032\004\b\017\020\007R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b\022\020\023R\021\020\024\032\0020\021¢\006\b\n\000\032\004\b\025\020\023R\021\020\026\032\0020\005¢\006\b\n\000\032\004\b\027\020\007R\021\020\030\032\0020\005¢\006\b\n\000\032\004\b\031\020\007R\021\020\032\032\0020\005¢\006\b\n\000\032\004\b\033\020\007R\021\020\034\032\0020\035¢\006\b\n\000\032\004\b\036\020\037R\021\020 \032\0020\005¢\006\b\n\000\032\004\b!\020\007¨\006\""}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJPrivateEventLogger$Companion;", "", "<init>", "()V", "ARTIFACT_ID", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/RequestPrivateData;", "getARTIFACT_ID", "()Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/RequestPrivateData;", "PARENT_ARTIFACT_ID", "getPARENT_ARTIFACT_ID", "CHAIN_ID", "getCHAIN_ID", "ISSUE_ID", "getISSUE_ID", "TASK_DESCRIPTION", "getTASK_DESCRIPTION", "START_TIME_MS", "Lcom/intellij/internal/statistic/eventLog/events/LongEventField;", "getSTART_TIME_MS", "()Lcom/intellij/internal/statistic/eventLog/events/LongEventField;", "DURATION_MS", "getDURATION_MS", "RECENT_FILES_ADDED_TO_CONTEXT", "getRECENT_FILES_ADDED_TO_CONTEXT", "OPEN_FILES_ADDED_TO_CONTEXT", "getOPEN_FILES_ADDED_TO_CONTEXT", "EXPLICITLY_SELECTED_USER_PATHS", "getEXPLICITLY_SELECTED_USER_PATHS", "STEP_TYPE", "Lcom/intellij/internal/statistic/eventLog/events/StringEventField;", "getSTEP_TYPE", "()Lcom/intellij/internal/statistic/eventLog/events/StringEventField;", "EJ_VERSION", "getEJ_VERSION", "ej-core"})
/*     */   public static final class Companion { private Companion() {}
/*     */     @NotNull
/*  27 */     public final RequestPrivateData getARTIFACT_ID() { return AbstractEJPrivateEventLogger.ARTIFACT_ID; } @NotNull
/*  28 */     public final RequestPrivateData getPARENT_ARTIFACT_ID() { return AbstractEJPrivateEventLogger.PARENT_ARTIFACT_ID; } @NotNull
/*  29 */     public final RequestPrivateData getCHAIN_ID() { return AbstractEJPrivateEventLogger.CHAIN_ID; } @NotNull
/*  30 */     public final RequestPrivateData getISSUE_ID() { return AbstractEJPrivateEventLogger.ISSUE_ID; } @NotNull
/*  31 */     public final RequestPrivateData getTASK_DESCRIPTION() { return AbstractEJPrivateEventLogger.TASK_DESCRIPTION; } @NotNull
/*  32 */     public final LongEventField getSTART_TIME_MS() { return AbstractEJPrivateEventLogger.START_TIME_MS; } @NotNull
/*  33 */     public final LongEventField getDURATION_MS() { return AbstractEJPrivateEventLogger.DURATION_MS; } @NotNull
/*  34 */     public final RequestPrivateData getRECENT_FILES_ADDED_TO_CONTEXT() { return AbstractEJPrivateEventLogger.RECENT_FILES_ADDED_TO_CONTEXT; } @NotNull
/*  35 */     public final RequestPrivateData getOPEN_FILES_ADDED_TO_CONTEXT() { return AbstractEJPrivateEventLogger.OPEN_FILES_ADDED_TO_CONTEXT; } @NotNull
/*  36 */     public final RequestPrivateData getEXPLICITLY_SELECTED_USER_PATHS() { return AbstractEJPrivateEventLogger.EXPLICITLY_SELECTED_USER_PATHS; } @NotNull
/*  37 */     public final StringEventField getSTEP_TYPE() { return AbstractEJPrivateEventLogger.STEP_TYPE; } @NotNull
/*  38 */     public final RequestPrivateData getEJ_VERSION() { return AbstractEJPrivateEventLogger.EJ_VERSION; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private static final RequestPrivateData ARTIFACT_ID = new RequestPrivateData("artifact_id"); @NotNull private static final RequestPrivateData PARENT_ARTIFACT_ID = new RequestPrivateData("parent_artifact_id"); @NotNull private static final RequestPrivateData EJ_VERSION = new RequestPrivateData("ej_version"); @NotNull private static final RequestPrivateData CHAIN_ID = new RequestPrivateData("chain_id"); @NotNull private static final RequestPrivateData ISSUE_ID = new RequestPrivateData("issue_id"); @NotNull private static final RequestPrivateData TASK_DESCRIPTION = new RequestPrivateData("task_description"); @NotNull private static final LongEventField START_TIME_MS = EventFields.Long$default("start_time_ms", null, 2, null); @NotNull private static final LongEventField DURATION_MS = EventFields.Long$default("duration_ms", null, 2, null); @NotNull private static final RequestPrivateData RECENT_FILES_ADDED_TO_CONTEXT = new RequestPrivateData("recent_files_added_to_context"); @NotNull private static final RequestPrivateData OPEN_FILES_ADDED_TO_CONTEXT = new RequestPrivateData("open_files_added_to_context"); @NotNull
/*     */   private static final RequestPrivateData EXPLICITLY_SELECTED_USER_PATHS = new RequestPrivateData("explicitly_selected_user_paths"); @NotNull
/*     */   private static final StringEventField STEP_TYPE = EventFields.String("step_type", CollectionsKt.toList(AbstractEJEventLogger.Companion.getSTEP_TYPES())); @NotNull
/*  41 */   private final RequestPrivateData TRAJECTORY_ENTRY = new RequestPrivateData("artifact_id"); @NotNull
/*     */   private final VarargEventId EJ_TRAJECTORY; @NotNull
/*     */   private final IdeActivityDefinition GENERATION_ACTIVITY; @NotNull
/*     */   private final IdeActivityDefinition GENERATION_STEP_ACTIVITY; public AbstractEJPrivateEventLogger() {
/*  45 */     EventField[] arrayOfEventField = new EventField[3]; arrayOfEventField[0] = (EventField)CHAIN_ID; arrayOfEventField[1] = 
/*  46 */       (EventField)ISSUE_ID;
/*  47 */     arrayOfEventField[2] = (EventField)this.TRAJECTORY_ENTRY;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.EJ_TRAJECTORY = this.GROUP.registerVarargEvent("ej_trajectory", arrayOfEventField);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  66 */     arrayOfEventField = new EventField[9]; arrayOfEventField[0] = (EventField)ARTIFACT_ID; arrayOfEventField[1] = 
/*  67 */       (EventField)CHAIN_ID;
/*  68 */     arrayOfEventField[2] = (EventField)ISSUE_ID;
/*  69 */     arrayOfEventField[3] = (EventField)TASK_DESCRIPTION;
/*  70 */     arrayOfEventField[4] = (EventField)START_TIME_MS;
/*  71 */     arrayOfEventField[5] = (EventField)RECENT_FILES_ADDED_TO_CONTEXT;
/*  72 */     arrayOfEventField[6] = (EventField)OPEN_FILES_ADDED_TO_CONTEXT;
/*  73 */     arrayOfEventField[7] = (EventField)EXPLICITLY_SELECTED_USER_PATHS;
/*  74 */     arrayOfEventField[8] = (EventField)EJ_VERSION;
/*     */ 
/*     */     
/*  77 */     arrayOfEventField = new EventField[16]; arrayOfEventField[0] = (EventField)ARTIFACT_ID; arrayOfEventField[1] = 
/*  78 */       (EventField)CHAIN_ID;
/*  79 */     arrayOfEventField[2] = (EventField)ISSUE_ID;
/*  80 */     arrayOfEventField[3] = (EventField)DURATION_MS;
/*  81 */     arrayOfEventField[4] = (EventField)AbstractEJEventLogger.Companion.getEXIT_STATUS();
/*  82 */     arrayOfEventField[5] = (EventField)AbstractEJEventLogger.Companion.getARTIFACT_STATS_TIME_MS();
/*  83 */     arrayOfEventField[6] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_TIME_MS();
/*  84 */     arrayOfEventField[7] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_CACHED_TIME_MS();
/*  85 */     arrayOfEventField[8] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_REQUESTS();
/*  86 */     arrayOfEventField[9] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_CACHED_REQUESTS();
/*  87 */     arrayOfEventField[10] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_INPUT_TOKENS();
/*  88 */     arrayOfEventField[11] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_OUTPUT_TOKENS();
/*  89 */     arrayOfEventField[12] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_CACHE_INPUT_TOKENS();
/*  90 */     arrayOfEventField[13] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_CACHE_CREATE_INPUT_TOKENS();
/*  91 */     arrayOfEventField[14] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_COST();
/*  92 */     arrayOfEventField[15] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_CACHED_COST();
/*     */ 
/*     */     
/*     */     this.GENERATION_ACTIVITY = EventLogGroup.registerIdeActivity$default(this.GROUP, "ej_generation", arrayOfEventField, arrayOfEventField, null, false, 24, null);
/*     */ 
/*     */     
/*  98 */     arrayOfEventField = new EventField[5]; arrayOfEventField[0] = (EventField)PARENT_ARTIFACT_ID; arrayOfEventField[1] = (EventField)ARTIFACT_ID; arrayOfEventField[2] = (EventField)CHAIN_ID; arrayOfEventField[3] = (EventField)ISSUE_ID; arrayOfEventField[4] = (EventField)START_TIME_MS;
/*     */     
/* 100 */     arrayOfEventField = new EventField[18]; arrayOfEventField[0] = (EventField)PARENT_ARTIFACT_ID; arrayOfEventField[1] = 
/* 101 */       (EventField)ARTIFACT_ID;
/* 102 */     arrayOfEventField[2] = (EventField)CHAIN_ID;
/* 103 */     arrayOfEventField[3] = (EventField)ISSUE_ID;
/* 104 */     arrayOfEventField[4] = (EventField)STEP_TYPE;
/* 105 */     arrayOfEventField[5] = (EventField)AbstractEJEventLogger.Companion.getSTEP_RESULT();
/* 106 */     arrayOfEventField[6] = (EventField)DURATION_MS;
/* 107 */     arrayOfEventField[7] = (EventField)AbstractEJEventLogger.Companion.getARTIFACT_STATS_TIME_MS();
/* 108 */     arrayOfEventField[8] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_TIME_MS();
/* 109 */     arrayOfEventField[9] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_CACHED_TIME_MS();
/* 110 */     arrayOfEventField[10] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_REQUESTS();
/* 111 */     arrayOfEventField[11] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_CACHED_REQUESTS();
/* 112 */     arrayOfEventField[12] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_INPUT_TOKENS();
/* 113 */     arrayOfEventField[13] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_OUTPUT_TOKENS();
/* 114 */     arrayOfEventField[14] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_CACHE_INPUT_TOKENS();
/* 115 */     arrayOfEventField[15] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_CACHE_CREATE_INPUT_TOKENS();
/* 116 */     arrayOfEventField[16] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_COST();
/* 117 */     arrayOfEventField[17] = (EventField)AbstractEJEventLogger.Companion.getMODEL_STATS_CACHED_COST();
/*     */     this.GENERATION_STEP_ACTIVITY = EventLogGroup.registerIdeActivity$default(this.GROUP, "ej_generation_step", arrayOfEventField, arrayOfEventField, null, false, 24, null);
/*     */   } public void logTrajectoryEntry(@NotNull Project project, @Nullable TaskChainId chainId, @Nullable TaskId taskId, @NotNull String trajectoryEntry) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Intrinsics.checkNotNullParameter(trajectoryEntry, "trajectoryEntry");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     if (!getEnabled())
/*     */       return; 
/*     */     EventPair[] arrayOfEventPair = new EventPair[3];
/*     */     if (chainId == null || chainId.toString() == null)
/*     */       chainId.toString(); 
/*     */     false[CHAIN_ID] = chainId.toString().with("unknown");
/*     */     if (taskId == null || taskId.toString() == null)
/*     */       taskId.toString(); 
/*     */     true[ISSUE_ID] = taskId.toString().with("unknown");
/*     */     arrayOfEventPair[2] = this.TRAJECTORY_ENTRY.with(trajectoryEntry);
/*     */     arrayOfEventPair.log((Project)arrayOfEventPair, arrayOfEventPair);
/*     */   } @NotNull
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
/*     */     //   67: invokestatic getConfig : ()Lcom/intellij/ml/llm/matterhorn/configuration/Env;
/*     */     //   70: invokestatic assertCanSendNonAnonymizedStats : (Lcom/intellij/ml/llm/matterhorn/configuration/Env;)V
/*     */     //   73: getstatic java/util/concurrent/TimeUnit.NANOSECONDS : Ljava/util/concurrent/TimeUnit;
/*     */     //   76: invokestatic nanoTime : ()J
/*     */     //   79: invokevirtual toMillis : (J)J
/*     */     //   82: lstore #11
/*     */     //   84: aload_1
/*     */     //   85: aload_3
/*     */     //   86: aload #4
/*     */     //   88: aload #5
/*     */     //   90: lload #11
/*     */     //   92: aload #7
/*     */     //   94: aload #8
/*     */     //   96: aload #9
/*     */     //   98: aload #10
/*     */     //   100: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Ljava/lang/String;JLjava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*     */     //   105: astore #13
/*     */     //   107: aload_0
/*     */     //   108: getfield GENERATION_ACTIVITY : Lcom/intellij/internal/statistic/IdeActivityDefinition;
/*     */     //   111: aload_2
/*     */     //   112: aload #13
/*     */     //   114: invokevirtual started : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;)Lcom/intellij/internal/statistic/StructuredIdeActivity;
/*     */     //   117: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #133	-> 67
/*     */     //   #135	-> 73
/*     */     //   #136	-> 84
/*     */     //   #149	-> 107
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   84	34	11	startedTimestamp	J
/*     */     //   107	11	13	dataSupplier	Lkotlin/jvm/functions/Function0;
/*     */     //   0	118	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJPrivateEventLogger;
/*     */     //   0	118	1	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   0	118	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	118	3	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   0	118	4	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   0	118	5	taskDescription	Ljava/lang/String;
/*     */     //   0	118	6	vcsStateId	Ljava/util/UUID;
/*     */     //   0	118	7	recentFilesAddedToContext	Ljava/util/Collection;
/*     */     //   0	118	8	openFilesAddedToContext	Ljava/util/Collection;
/*     */     //   0	118	9	explicitlySelectedUserPaths	Ljava/util/Collection;
/*     */     //   0	118	10	ejVersion	Ljava/lang/String;
/*     */   } private static final List logGenerationStarted$lambda$0(ArtifactId $artifactId, TaskChainId $chainId, TaskId $taskId, String $taskDescription, long $startedTimestamp, Collection $recentFilesAddedToContext, Collection $openFilesAddedToContext, Collection $explicitlySelectedUserPaths, String $ejVersion) {
/* 138 */     EventPair[] arrayOfEventPair = new EventPair[9]; arrayOfEventPair[0] = ARTIFACT_ID.with($artifactId.toString()); arrayOfEventPair[1] = 
/* 139 */       CHAIN_ID.with($chainId.toString());
/* 140 */     arrayOfEventPair[2] = ISSUE_ID.with($taskId.toString());
/* 141 */     arrayOfEventPair[3] = TASK_DESCRIPTION.with($taskDescription);
/* 142 */     arrayOfEventPair[4] = START_TIME_MS.with(Long.valueOf($startedTimestamp));
/* 143 */     arrayOfEventPair[5] = RECENT_FILES_ADDED_TO_CONTEXT.with(CollectionsKt.joinToString$default($recentFilesAddedToContext, null, null, null, 0, null, null, 63, null));
/* 144 */     arrayOfEventPair[6] = OPEN_FILES_ADDED_TO_CONTEXT.with(CollectionsKt.joinToString$default($openFilesAddedToContext, null, null, null, 0, null, null, 63, null));
/* 145 */     arrayOfEventPair[7] = EXPLICITLY_SELECTED_USER_PATHS.with(CollectionsKt.joinToString$default($explicitlySelectedUserPaths, null, null, null, 0, null, null, 63, null));
/* 146 */     arrayOfEventPair[8] = EJ_VERSION.with($ejVersion);
/*     */     return CollectionsKt.listOf((Object[])arrayOfEventPair);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void logGenerationFinished(@NotNull StructuredIdeActivity activity, @NotNull ArtifactId artifactId, @NotNull TaskChainId chainId, @NotNull TaskId taskId, @NotNull EJResultStatus status, @NotNull ArtifactStatistic modelStats) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'activity'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc 'artifactId'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload_3
/*     */     //   14: ldc 'chainId'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #4
/*     */     //   21: ldc 'taskId'
/*     */     //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   26: aload #5
/*     */     //   28: ldc_w 'status'
/*     */     //   31: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   34: aload #6
/*     */     //   36: ldc_w 'modelStats'
/*     */     //   39: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   42: invokestatic getConfig : ()Lcom/intellij/ml/llm/matterhorn/configuration/Env;
/*     */     //   45: invokestatic assertCanSendNonAnonymizedStats : (Lcom/intellij/ml/llm/matterhorn/configuration/Env;)V
/*     */     //   48: getstatic java/util/concurrent/TimeUnit.NANOSECONDS : Ljava/util/concurrent/TimeUnit;
/*     */     //   51: invokestatic nanoTime : ()J
/*     */     //   54: aload_1
/*     */     //   55: invokevirtual getStartedTimestamp : ()J
/*     */     //   58: lsub
/*     */     //   59: invokevirtual toMillis : (J)J
/*     */     //   62: lstore #7
/*     */     //   64: aload_1
/*     */     //   65: aload_2
/*     */     //   66: aload_3
/*     */     //   67: aload #4
/*     */     //   69: lload #7
/*     */     //   71: aload #5
/*     */     //   73: aload #6
/*     */     //   75: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;JLcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;)Lkotlin/jvm/functions/Function0;
/*     */     //   80: invokevirtual finished : (Lkotlin/jvm/functions/Function0;)Lcom/intellij/internal/statistic/StructuredIdeActivity;
/*     */     //   83: pop
/*     */     //   84: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #160	-> 42
/*     */     //   #162	-> 48
/*     */     //   #163	-> 64
/*     */     //   #183	-> 84
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   64	21	7	durationMs	J
/*     */     //   0	85	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJPrivateEventLogger;
/*     */     //   0	85	1	activity	Lcom/intellij/internal/statistic/StructuredIdeActivity;
/*     */     //   0	85	2	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   0	85	3	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   0	85	4	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   0	85	5	status	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;
/*     */     //   0	85	6	modelStats	Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final List logGenerationFinished$lambda$1(ArtifactId $artifactId, TaskChainId $chainId, TaskId $taskId, long $durationMs, EJResultStatus $status, ArtifactStatistic $modelStats) {
/* 165 */     EventPair[] arrayOfEventPair = new EventPair[16]; arrayOfEventPair[0] = ARTIFACT_ID.with($artifactId.toString()); arrayOfEventPair[1] = 
/* 166 */       CHAIN_ID.with($chainId.toString());
/* 167 */     arrayOfEventPair[2] = ISSUE_ID.with($taskId.toString());
/* 168 */     arrayOfEventPair[3] = DURATION_MS.with(Long.valueOf($durationMs));
/* 169 */     arrayOfEventPair[4] = AbstractEJEventLogger.Companion.getEXIT_STATUS().with($status);
/* 170 */     arrayOfEventPair[5] = AbstractEJEventLogger.Companion.getARTIFACT_STATS_TIME_MS().with(Long.valueOf($modelStats.getArtifactTime()));
/* 171 */     arrayOfEventPair[6] = AbstractEJEventLogger.Companion.getMODEL_STATS_TIME_MS().with(Long.valueOf($modelStats.getModelTime()));
/* 172 */     arrayOfEventPair[7] = AbstractEJEventLogger.Companion.getMODEL_STATS_CACHED_TIME_MS().with(Long.valueOf($modelStats.getModelCachedTime()));
/* 173 */     arrayOfEventPair[8] = AbstractEJEventLogger.Companion.getMODEL_STATS_REQUESTS().with(Integer.valueOf($modelStats.getRequests()));
/* 174 */     arrayOfEventPair[9] = AbstractEJEventLogger.Companion.getMODEL_STATS_CACHED_REQUESTS().with(Integer.valueOf($modelStats.getCachedRequests()));
/* 175 */     arrayOfEventPair[10] = AbstractEJEventLogger.Companion.getMODEL_STATS_INPUT_TOKENS().with(Long.valueOf($modelStats.getInputTokens()));
/* 176 */     arrayOfEventPair[11] = AbstractEJEventLogger.Companion.getMODEL_STATS_OUTPUT_TOKENS().with(Long.valueOf($modelStats.getOutputTokens()));
/* 177 */     arrayOfEventPair[12] = AbstractEJEventLogger.Companion.getMODEL_STATS_CACHE_INPUT_TOKENS().with(Long.valueOf($modelStats.getCacheInputTokens()));
/* 178 */     arrayOfEventPair[13] = AbstractEJEventLogger.Companion.getMODEL_STATS_CACHE_CREATE_INPUT_TOKENS().with(Long.valueOf($modelStats.getCacheCreateInputTokens()));
/* 179 */     arrayOfEventPair[14] = AbstractEJEventLogger.Companion.getMODEL_STATS_COST().with(Double.valueOf($modelStats.getCost()));
/* 180 */     arrayOfEventPair[15] = AbstractEJEventLogger.Companion.getMODEL_STATS_CACHED_COST().with(Double.valueOf($modelStats.getCachedCost()));
/*     */     return CollectionsKt.listOf((Object[])arrayOfEventPair);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */     //   33: invokestatic getConfig : ()Lcom/intellij/ml/llm/matterhorn/configuration/Env;
/*     */     //   36: invokestatic assertCanSendNonAnonymizedStats : (Lcom/intellij/ml/llm/matterhorn/configuration/Env;)V
/*     */     //   39: getstatic java/util/concurrent/TimeUnit.NANOSECONDS : Ljava/util/concurrent/TimeUnit;
/*     */     //   42: invokestatic nanoTime : ()J
/*     */     //   45: invokevirtual toMillis : (J)J
/*     */     //   48: lstore #6
/*     */     //   50: aload_1
/*     */     //   51: aload_2
/*     */     //   52: aload #4
/*     */     //   54: aload #5
/*     */     //   56: lload #6
/*     */     //   58: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;J)Lkotlin/jvm/functions/Function0;
/*     */     //   63: astore #8
/*     */     //   65: aload_0
/*     */     //   66: getfield GENERATION_STEP_ACTIVITY : Lcom/intellij/internal/statistic/IdeActivityDefinition;
/*     */     //   69: aload_3
/*     */     //   70: aload #8
/*     */     //   72: invokevirtual started : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;)Lcom/intellij/internal/statistic/StructuredIdeActivity;
/*     */     //   75: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #192	-> 33
/*     */     //   #194	-> 39
/*     */     //   #195	-> 50
/*     */     //   #204	-> 65
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   50	26	6	startedTimestamp	J
/*     */     //   65	11	8	dataSupplier	Lkotlin/jvm/functions/Function0;
/*     */     //   0	76	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJPrivateEventLogger;
/*     */     //   0	76	1	parentArtifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   0	76	2	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   0	76	3	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	76	4	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   0	76	5	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final List logGenerationStepStarted$lambda$2(ArtifactId $parentArtifactId, ArtifactId $artifactId, TaskChainId $chainId, TaskId $taskId, long $startedTimestamp) {
/* 197 */     EventPair[] arrayOfEventPair = new EventPair[5]; arrayOfEventPair[0] = PARENT_ARTIFACT_ID.with($parentArtifactId.toString()); arrayOfEventPair[1] = 
/* 198 */       ARTIFACT_ID.with($artifactId.toString());
/* 199 */     arrayOfEventPair[2] = CHAIN_ID.with($chainId.toString());
/* 200 */     arrayOfEventPair[3] = ISSUE_ID.with($taskId.toString());
/* 201 */     arrayOfEventPair[4] = START_TIME_MS.with(Long.valueOf($startedTimestamp));
/*     */     return CollectionsKt.listOf((Object[])arrayOfEventPair);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void logGenerationStepFinished(@NotNull StructuredIdeActivity activity, @NotNull ArtifactId artifactId, @NotNull TaskChainId chainId, @NotNull TaskId taskId, @Nullable String agentAction, @NotNull EJResultStatus status, @NotNull ArtifactStatistic modelStats) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'activity'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc 'artifactId'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload_3
/*     */     //   14: ldc 'chainId'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #4
/*     */     //   21: ldc 'taskId'
/*     */     //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   26: aload #6
/*     */     //   28: ldc_w 'status'
/*     */     //   31: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   34: aload #7
/*     */     //   36: ldc_w 'modelStats'
/*     */     //   39: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   42: invokestatic getConfig : ()Lcom/intellij/ml/llm/matterhorn/configuration/Env;
/*     */     //   45: invokestatic assertCanSendNonAnonymizedStats : (Lcom/intellij/ml/llm/matterhorn/configuration/Env;)V
/*     */     //   48: getstatic java/util/concurrent/TimeUnit.NANOSECONDS : Ljava/util/concurrent/TimeUnit;
/*     */     //   51: invokestatic nanoTime : ()J
/*     */     //   54: aload_1
/*     */     //   55: invokevirtual getStartedTimestamp : ()J
/*     */     //   58: lsub
/*     */     //   59: invokevirtual toMillis : (J)J
/*     */     //   62: lstore #8
/*     */     //   64: aload_1
/*     */     //   65: aload_2
/*     */     //   66: aload_3
/*     */     //   67: aload #4
/*     */     //   69: aload #5
/*     */     //   71: aload #6
/*     */     //   73: lload #8
/*     */     //   75: aload #7
/*     */     //   77: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;JLcom/intellij/ml/llm/matterhorn/ArtifactStatistic;)Lkotlin/jvm/functions/Function0;
/*     */     //   82: invokevirtual finished : (Lkotlin/jvm/functions/Function0;)Lcom/intellij/internal/statistic/StructuredIdeActivity;
/*     */     //   85: pop
/*     */     //   86: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #216	-> 42
/*     */     //   #218	-> 48
/*     */     //   #219	-> 64
/*     */     //   #240	-> 86
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   64	23	8	durationMs	J
/*     */     //   0	87	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJPrivateEventLogger;
/*     */     //   0	87	1	activity	Lcom/intellij/internal/statistic/StructuredIdeActivity;
/*     */     //   0	87	2	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   0	87	3	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   0	87	4	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   0	87	5	agentAction	Ljava/lang/String;
/*     */     //   0	87	6	status	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;
/*     */     //   0	87	7	modelStats	Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final List logGenerationStepFinished$lambda$3(ArtifactId $artifactId, TaskChainId $chainId, TaskId $taskId, String $agentAction, EJResultStatus $status, long $durationMs, ArtifactStatistic $modelStats) {
/* 221 */     EventPair[] arrayOfEventPair = new EventPair[17]; arrayOfEventPair[0] = ARTIFACT_ID.with($artifactId.toString()); arrayOfEventPair[1] = 
/* 222 */       CHAIN_ID.with($chainId.toString());
/* 223 */     arrayOfEventPair[2] = ISSUE_ID.with($taskId.toString());
/* 224 */     arrayOfEventPair[3] = STEP_TYPE.with(StatsUtilsKt.getCommand($agentAction));
/* 225 */     arrayOfEventPair[4] = AbstractEJEventLogger.Companion.getSTEP_RESULT().with($status);
/* 226 */     arrayOfEventPair[5] = DURATION_MS.with(Long.valueOf($durationMs));
/* 227 */     arrayOfEventPair[6] = AbstractEJEventLogger.Companion.getARTIFACT_STATS_TIME_MS().with(Long.valueOf($modelStats.getArtifactTime()));
/* 228 */     arrayOfEventPair[7] = AbstractEJEventLogger.Companion.getMODEL_STATS_TIME_MS().with(Long.valueOf($modelStats.getModelTime()));
/* 229 */     arrayOfEventPair[8] = AbstractEJEventLogger.Companion.getMODEL_STATS_CACHED_TIME_MS().with(Long.valueOf($modelStats.getModelCachedTime()));
/* 230 */     arrayOfEventPair[9] = AbstractEJEventLogger.Companion.getMODEL_STATS_REQUESTS().with(Integer.valueOf($modelStats.getRequests()));
/* 231 */     arrayOfEventPair[10] = AbstractEJEventLogger.Companion.getMODEL_STATS_CACHED_REQUESTS().with(Integer.valueOf($modelStats.getCachedRequests()));
/* 232 */     arrayOfEventPair[11] = AbstractEJEventLogger.Companion.getMODEL_STATS_INPUT_TOKENS().with(Long.valueOf($modelStats.getInputTokens()));
/* 233 */     arrayOfEventPair[12] = AbstractEJEventLogger.Companion.getMODEL_STATS_OUTPUT_TOKENS().with(Long.valueOf($modelStats.getOutputTokens()));
/* 234 */     arrayOfEventPair[13] = AbstractEJEventLogger.Companion.getMODEL_STATS_CACHE_INPUT_TOKENS().with(Long.valueOf($modelStats.getCacheInputTokens()));
/* 235 */     arrayOfEventPair[14] = AbstractEJEventLogger.Companion.getMODEL_STATS_CACHE_CREATE_INPUT_TOKENS().with(Long.valueOf($modelStats.getCacheCreateInputTokens()));
/* 236 */     arrayOfEventPair[15] = AbstractEJEventLogger.Companion.getMODEL_STATS_COST().with(Double.valueOf($modelStats.getCost()));
/* 237 */     arrayOfEventPair[16] = AbstractEJEventLogger.Companion.getMODEL_STATS_CACHED_COST().with(Double.valueOf($modelStats.getCachedCost()));
/*     */     return CollectionsKt.listOf((Object[])arrayOfEventPair);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\statistics\AbstractEJPrivateEventLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */