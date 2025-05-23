/*     */ package com.intellij.ml.llm.matterhorn.ej.core.statistics;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*     */ import com.intellij.ml.llm.matterhorn.Artifactual;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentExitStatus;
/*     */ import java.util.List;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000¨\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\017\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\013\n\000\030\0002\0020\001B=\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f\022\006\020\r\032\0020\016¢\006\004\b\017\020\020J\030\020&\032\0020'2\006\020(\032\0020)2\006\020\013\032\0020*H\026J\036\020+\032\0020'2\006\020,\032\0020$2\f\020-\032\b\022\002\b\003\030\0010!H\026J\020\020.\032\0020'2\006\020,\032\0020$H\026J\f\020/\032\00200*\00201H\002J\016\0202\032\00200*\004\030\00103H\002J\024\0204\032\0020'2\n\020,\032\006\022\002\b\00305H\026J\020\0206\032\0020'2\006\020,\032\00207H\026J\020\0208\032\0020'2\006\020,\032\00209H\026J\024\020:\032\0020'2\n\020;\032\0060<j\002`=H\026J \020>\032\0020'2\n\020;\032\0060?j\002`@2\n\020A\032\006\022\002\b\0030!H\026J\030\020B\032\0020'2\006\020,\032\0020$2\006\020C\032\00200H\002J\020\020D\032\002002\006\020,\032\00209H\002J\f\020E\032\00200*\0020FH\002J\022\020G\032\0020H*\b\022\002\b\003\030\0010!H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\021\020\022R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\023\020\024R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\025\020\026R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\027\020\030R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\031\020\032R\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\033\020\034R\016\020\035\032\0020\036X\004¢\006\002\n\000R$\020\037\032\030\022\b\022\006\022\002\b\0030!\022\n\022\b\022\004\022\0020\"0\0050 X\004¢\006\002\n\000R\036\020#\032\022\022\b\022\006\022\002\b\0030!\022\004\022\0020$0 X\004¢\006\002\n\000R\020\020%\032\004\030\0010$X\016¢\006\002\n\000¨\006I"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/StatisticsExecutionContextListener;", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;", "project", "Lcom/intellij/openapi/project/Project;", "activityProcessors", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/processors/EJActivityProcessor;", "vcsStateLogger", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJVcsStateLogger;", "task", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "taskChainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "<init>", "(Lcom/intellij/openapi/project/Project;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJVcsStateLogger;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "getActivityProcessors", "()Ljava/util/List;", "getVcsStateLogger", "()Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJVcsStateLogger;", "getTask", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;", "getContext", "()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "getTaskChainId", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "compositeActivity", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/CompositeActivity;", "activities", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/CompositeActivity$CustomActivity;", "artifacts", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "rootNode", "onTrajectoryElement", "", "element", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "onUnfinishedArtifactCreated", "artifact", "requester", "onUnfinishedArtifactUpdated", "toResultStatus", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;", "", "getStatus", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "onArtifactFinished", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "onArtifactCancelled", "Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;", "onArtifactFailed", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "onCancellation", "e", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "onException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "artifactId", "onFinished", "status", "getFailedStatus", "toEJResultStatus", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentExitStatus;", "isRootNode", "", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nStatisticsExecutionContextListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsExecutionContextListener.kt\ncom/intellij/ml/llm/matterhorn/ej/core/statistics/StatisticsExecutionContextListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinUtil.kt\ncom/intellij/openapi/observable/util/KotlinUtilKt\n*L\n1#1,211:1\n1863#2,2:212\n1557#2:214\n1628#2,3:215\n1755#2,3:218\n1863#2,2:226\n8#3,5:221\n*S KotlinDebug\n*F\n+ 1 StatisticsExecutionContextListener.kt\ncom/intellij/ml/llm/matterhorn/ej/core/statistics/StatisticsExecutionContextListener\n*L\n43#1:212,2\n74#1:214\n74#1:215,3\n105#1:218,3\n135#1:226,2\n112#1:221,5\n*E\n"})
/*     */ public final class StatisticsExecutionContextListener implements RootExecutionContextListener {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final List<EJActivityProcessor> activityProcessors;
/*     */   @NotNull
/*     */   private final AbstractEJVcsStateLogger vcsStateLogger;
/*     */   @NotNull
/*     */   private final TaskEntity task;
/*     */   @NotNull
/*     */   private final RootExecutionContext context;
/*     */   
/*  24 */   public void onCustomEvent(@NotNull CustomArtifactEvent event, @Nullable ArtifactId requester) { RootExecutionContextListener.DefaultImpls.onCustomEvent(this, event, requester); } @NotNull private final TaskChainId taskChainId; @NotNull private final CompositeActivity compositeActivity; @NotNull private final ConcurrentHashMap<ArtifactId<?>, List<CompositeActivity.CustomActivity>> activities; @NotNull private final ConcurrentHashMap<ArtifactId<?>, Artifactual> artifacts; @Nullable private Artifactual rootNode; public void onContextRegistering(@NotNull RootExecutionContext context) { RootExecutionContextListener.DefaultImpls.onContextRegistering(this, context); } public void onContextClosed(@NotNull RootExecutionContext context) { RootExecutionContextListener.DefaultImpls.onContextClosed(this, context); }
/*     */   
/*  26 */   public StatisticsExecutionContextListener(@NotNull Project project, @NotNull List<EJActivityProcessor> activityProcessors, @NotNull AbstractEJVcsStateLogger vcsStateLogger, @NotNull TaskEntity task, @NotNull RootExecutionContext context, @NotNull TaskChainId taskChainId) { this.project = project;
/*  27 */     this.activityProcessors = activityProcessors;
/*  28 */     this.vcsStateLogger = vcsStateLogger;
/*  29 */     this.task = task;
/*  30 */     this.context = context;
/*  31 */     this.taskChainId = taskChainId;
/*     */ 
/*     */     
/*  34 */     this.compositeActivity = new CompositeActivity(this.activityProcessors);
/*  35 */     this.activities = new ConcurrentHashMap<>();
/*  36 */     this.artifacts = new ConcurrentHashMap<>(); } @NotNull public final Project getProject() { return this.project; } @NotNull public final List<EJActivityProcessor> getActivityProcessors() { return this.activityProcessors; } @NotNull public final AbstractEJVcsStateLogger getVcsStateLogger() { return this.vcsStateLogger; }
/*     */   @NotNull public final TaskEntity getTask() { return this.task; }
/*     */   @NotNull public final RootExecutionContext getContext() { return this.context; }
/*     */   @NotNull public final TaskChainId getTaskChainId() { return this.taskChainId; }
/*  40 */   public void onTrajectoryElement(@NotNull TrajectoryElement element, @NotNull ExecutionContext context) { Intrinsics.checkNotNullParameter(element, "element"); Intrinsics.checkNotNullParameter(context, "context"); String trajectoryEntry = LogginUtilsKt.trajectoryElementToString(RootExecutionContext.Companion.getJson(), element);
/*  41 */     Pair idPair = AgentContextKt.getChainAndTaskIdPair(AgentContextKt.getExecutionAgentContext(context));
/*     */     
/*  43 */     Iterable<EJActivityProcessor> $this$forEach$iv = this.activityProcessors; int $i$f$forEach = 0;
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
/* 212 */     Iterator<EJActivityProcessor> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJActivityProcessor it = (EJActivityProcessor)element$iv; int $i$a$-forEach-StatisticsExecutionContextListener$onTrajectoryElement$1 = 0; }
/*     */      } public void onUnfinishedArtifactCreated(@NotNull Artifactual artifact, @Nullable ArtifactId<?> requester) { Intrinsics.checkNotNullParameter(artifact, "artifact"); if (this.rootNode == null)
/* 214 */     { UUID vcsStateId = UUID.randomUUID(); Intrinsics.checkNotNull(vcsStateId); this.vcsStateLogger.logVcsState(this.project, vcsStateId); Intrinsics.checkNotNull(((UnfinishedArtifact)artifact).getRequest().getDescription(), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.AgentIssue"); AgentIssue description = (AgentIssue)((UnfinishedArtifact)artifact).getRequest().getDescription(); EditorContext editorContext = (artifact instanceof UnfinishedArtifact && ((UnfinishedArtifact)artifact).getRequest().getDescription() instanceof AgentIssue) ? description.getEditorContext() : null; editorContext.getRecentFiles(); editorContext.getOpenFiles(); List list1 = this.task.getExplicitlySelectedContextFiles(); Collection collection = (Collection)((editorContext != null && editorContext.getOpenFiles() != null) ? editorContext.getOpenFiles() : CollectionsKt.emptyList()); UUID uUID2 = (UUID)((editorContext != null && editorContext.getRecentFiles() != null) ? editorContext.getRecentFiles() : CollectionsKt.emptyList()), uUID1 = vcsStateId; String str = this.task.getDescription(); TaskId taskId = this.task.getId(); TaskChainId taskChainId = this.taskChainId; Project project = this.project; ArtifactId artifactId = artifact.getId(); CompositeActivity compositeActivity = this.compositeActivity; int $i$f$map = 0; List list2 = list1; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 215 */       for (Object item$iv$iv : list2) {
/* 216 */         Path path = (Path)item$iv$iv; Collection<String> collection1 = destination$iv$iv; int $i$a$-map-StatisticsExecutionContextListener$onUnfinishedArtifactCreated$activity$1 = 0; collection1.add(path.toString());
/* 217 */       }  List<String> list = (List)destination$iv$iv; if (PluginUtilsKt.getJunieVersion() == null)
/*     */         PluginUtilsKt.getJunieVersion();  List<CompositeActivity.CustomActivity> activity = artifactId.logGenerationStarted((ArtifactId<?>)project, (Project)taskChainId, (TaskChainId)taskId, (TaskId)str, (String)uUID1, uUID2, collection, list, (Collection<String>)PluginUtilsKt.getJunieVersion(), ""); this.activities.put(artifact.getId(), activity); this.artifacts.put(artifact.getId(), artifact); this.rootNode = artifact; }
/*     */     else if (requester != null) { List<CompositeActivity.CustomActivity> activity = this.compositeActivity.logGenerationStepStarted(requester, artifact.getId(), this.project, this.taskChainId, this.task.getId()); this.activities.put(artifact.getId(), activity); }
/*     */      } public void onUnfinishedArtifactUpdated(@NotNull Artifactual artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); }
/*     */   private final EJResultStatus toResultStatus(String $this$toResultStatus) { return StringsKt.contains$default($this$toResultStatus, "Human rejected execution of the given action. Try doing something else.", false, 2, null) ? EJResultStatus.DECLINED : (StringsKt.contains$default($this$toResultStatus, "ERROR: User cancelled the action, try something else or run in background", false, 2, null) ? EJResultStatus.STOPPED : (StringsKt.startsWith$default($this$toResultStatus, "ERROR:", false, 2, null) ? EJResultStatus.ERROR : EJResultStatus.SUBMIT)); }
/*     */   private final EJResultStatus getStatus(MatterhornChatElement $this$getStatus) { // Byte code:
/*     */     //   0: nop
/*     */     //   1: aload_1
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   5: ifne -> 15
/*     */     //   8: aload_1
/*     */     //   9: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornMultiPartChatMessage
/*     */     //   12: ifeq -> 28
/*     */     //   15: aload_0
/*     */     //   16: aload_1
/*     */     //   17: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   22: invokespecial toResultStatus : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;
/*     */     //   25: goto -> 133
/*     */     //   28: aload_1
/*     */     //   29: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults
/*     */     //   32: ifeq -> 130
/*     */     //   35: aload_1
/*     */     //   36: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults
/*     */     //   39: invokevirtual getToolResults : ()Ljava/util/List;
/*     */     //   42: checkcast java/lang/Iterable
/*     */     //   45: astore_2
/*     */     //   46: iconst_0
/*     */     //   47: istore_3
/*     */     //   48: aload_2
/*     */     //   49: instanceof java/util/Collection
/*     */     //   52: ifeq -> 71
/*     */     //   55: aload_2
/*     */     //   56: checkcast java/util/Collection
/*     */     //   59: invokeinterface isEmpty : ()Z
/*     */     //   64: ifeq -> 71
/*     */     //   67: iconst_0
/*     */     //   68: goto -> 121
/*     */     //   71: aload_2
/*     */     //   72: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   77: astore #4
/*     */     //   79: aload #4
/*     */     //   81: invokeinterface hasNext : ()Z
/*     */     //   86: ifeq -> 120
/*     */     //   89: aload #4
/*     */     //   91: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   96: astore #5
/*     */     //   98: aload #5
/*     */     //   100: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornToolResult
/*     */     //   103: astore #6
/*     */     //   105: iconst_0
/*     */     //   106: istore #7
/*     */     //   108: aload #6
/*     */     //   110: invokevirtual isError : ()Z
/*     */     //   113: ifeq -> 79
/*     */     //   116: iconst_1
/*     */     //   117: goto -> 121
/*     */     //   120: iconst_0
/*     */     //   121: ifeq -> 130
/*     */     //   124: getstatic com/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus.ERROR : Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;
/*     */     //   127: goto -> 133
/*     */     //   130: getstatic com/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus.SUBMIT : Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;
/*     */     //   133: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #103	-> 0
/*     */     //   #104	-> 1
/*     */     //   #105	-> 28
/*     */     //   #218	-> 48
/*     */     //   #219	-> 71
/*     */     //   #105	-> 108
/*     */     //   #219	-> 113
/*     */     //   #220	-> 120
/*     */     //   #105	-> 121
/*     */     //   #106	-> 130
/*     */     //   #107	-> 133
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   108	5	7	$i$a$-any-StatisticsExecutionContextListener$getStatus$1	I
/*     */     //   105	8	6	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult;
/*     */     //   98	22	5	element$iv	Ljava/lang/Object;
/*     */     //   48	73	3	$i$f$any	I
/*     */     //   46	75	2	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   0	134	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/StatisticsExecutionContextListener;
/*     */     //   0	134	1	$this$getStatus	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement; }
/*     */   public void onArtifactFinished(@NotNull Artifact artifact) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'artifact'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: nop
/*     */     //   7: aload_0
/*     */     //   8: aload_1
/*     */     //   9: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   12: invokespecial isRootNode : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Z
/*     */     //   15: ifeq -> 90
/*     */     //   18: aload_0
/*     */     //   19: getfield context : Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   22: invokevirtual getService : ()Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   25: invokevirtual getCaches : ()Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
/*     */     //   28: getstatic com/intellij/ml/llm/matterhorn/CacheType.ExitStatus : Lcom/intellij/ml/llm/matterhorn/CacheType;
/*     */     //   31: invokeinterface loadSingle : (Lcom/intellij/ml/llm/matterhorn/CacheType;)Ljava/lang/String;
/*     */     //   36: dup
/*     */     //   37: ifnull -> 83
/*     */     //   40: astore #4
/*     */     //   42: iconst_0
/*     */     //   43: istore #5
/*     */     //   45: nop
/*     */     //   46: ldc_w com/intellij/ml/llm/matterhorn/ej/core/AgentExitStatus
/*     */     //   49: aload #4
/*     */     //   51: invokestatic valueOf : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
/*     */     //   54: astore #6
/*     */     //   56: goto -> 64
/*     */     //   59: astore #7
/*     */     //   61: aconst_null
/*     */     //   62: astore #6
/*     */     //   64: aload #6
/*     */     //   66: nop
/*     */     //   67: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentExitStatus
/*     */     //   70: dup
/*     */     //   71: ifnull -> 83
/*     */     //   74: aload_0
/*     */     //   75: swap
/*     */     //   76: invokespecial toEJResultStatus : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentExitStatus;)Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;
/*     */     //   79: dup
/*     */     //   80: ifnonnull -> 130
/*     */     //   83: pop
/*     */     //   84: getstatic com/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus.UNKNOWN : Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;
/*     */     //   87: goto -> 130
/*     */     //   90: nop
/*     */     //   91: aload_1
/*     */     //   92: invokevirtual getContent : ()Ljava/lang/Object;
/*     */     //   95: instanceof com/intellij/ml/llm/matterhorn/ej/core/AgentResponse
/*     */     //   98: ifeq -> 127
/*     */     //   101: aload_1
/*     */     //   102: invokevirtual getContent : ()Ljava/lang/Object;
/*     */     //   105: dup
/*     */     //   106: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.AgentResponse'
/*     */     //   109: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   112: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentResponse
/*     */     //   115: invokevirtual getActionResult : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   118: astore_3
/*     */     //   119: aload_0
/*     */     //   120: aload_3
/*     */     //   121: invokespecial getStatus : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;)Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;
/*     */     //   124: goto -> 130
/*     */     //   127: getstatic com/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus.SUBMIT : Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;
/*     */     //   130: astore_2
/*     */     //   131: aload_0
/*     */     //   132: aload_1
/*     */     //   133: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   136: aload_2
/*     */     //   137: invokespecial onFinished : (Lcom/intellij/ml/llm/matterhorn/Artifactual;Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;)V
/*     */     //   140: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #110	-> 6
/*     */     //   #111	-> 7
/*     */     //   #112	-> 18
/*     */     //   #221	-> 45
/*     */     //   #222	-> 46
/*     */     //   #224	-> 59
/*     */     //   #225	-> 61
/*     */     //   #221	-> 66
/*     */     //   #112	-> 67
/*     */     //   #113	-> 84
/*     */     //   #116	-> 90
/*     */     //   #117	-> 91
/*     */     //   #118	-> 101
/*     */     //   #119	-> 119
/*     */     //   #121	-> 127
/*     */     //   #110	-> 130
/*     */     //   #126	-> 131
/*     */     //   #127	-> 140
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   61	3	7	ex$iv	Ljava/lang/IllegalArgumentException;
/*     */     //   45	22	5	$i$f$toEnumOrNull	I
/*     */     //   42	25	4	$this$toEnumOrNull$iv	Ljava/lang/String;
/*     */     //   119	5	3	result	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   131	10	2	status	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;
/*     */     //   0	141	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/StatisticsExecutionContextListener;
/*     */     //   0	141	1	artifact	Lcom/intellij/ml/llm/matterhorn/Artifact;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   45	56	59	java/lang/IllegalArgumentException }
/*     */   public void onArtifactCancelled(@NotNull CancelledArtifact artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); onFinished((Artifactual)artifact, EJResultStatus.EXIT_CANCELLATION); }
/*     */   public void onArtifactFailed(@NotNull FailedArtifact artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); onFinished((Artifactual)artifact, getFailedStatus(artifact)); }
/* 226 */   public void onCancellation(@NotNull CancellationException e) { Intrinsics.checkNotNullParameter(e, "e"); Intrinsics.checkNotNullExpressionValue(this.activities.entrySet(), "<get-entries>(...)"); Iterable<Map.Entry<ArtifactId<?>, List<CompositeActivity.CustomActivity>>> $this$forEach$iv = this.activities.entrySet(); int $i$f$forEach = 0; Iterator<Map.Entry<ArtifactId<?>, List<CompositeActivity.CustomActivity>>> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object<ArtifactId<?>, List<CompositeActivity.CustomActivity>> element$iv = (Object<ArtifactId<?>, List<CompositeActivity.CustomActivity>>)iterator.next(); Map.Entry it = (Map.Entry)element$iv; int $i$a$-forEach-StatisticsExecutionContextListener$onCancellation$1 = 0;
/*     */       if ((Artifactual)this.artifacts.get(it.getKey()) == null) {
/*     */         (Artifactual)this.artifacts.get(it.getKey());
/*     */       } else {
/*     */         Artifactual artifact;
/*     */         onFinished(artifact, EJResultStatus.EXIT_CANCELLATION);
/*     */       }  }
/*     */      }
/*     */ 
/*     */   
/*     */   public void onException(@NotNull Exception e, @NotNull ArtifactId artifactId) {
/*     */     Artifactual artifact;
/*     */     Intrinsics.checkNotNullParameter(e, "e");
/*     */     Intrinsics.checkNotNullParameter(artifactId, "artifactId");
/*     */     if ((Artifactual)this.artifacts.get(artifactId) == null) {
/*     */       (Artifactual)this.artifacts.get(artifactId);
/*     */       return;
/*     */     } 
/*     */     onFinished(artifact, EJResultStatus.EXIT_EXCEPTION);
/*     */   }
/*     */   
/*     */   private final void onFinished(Artifactual artifact, EJResultStatus status) {
/*     */     List<CompositeActivity.CustomActivity> activities;
/*     */     if ((List)this.activities.get(artifact.getId()) == null) {
/*     */       (List)this.activities.get(artifact.getId());
/*     */       return;
/*     */     } 
/*     */     try {
/*     */       ArtifactStatistic statistics = this.context.calculateTotalStatistics(artifact, false);
/*     */       Intrinsics.checkNotNull(((Artifact)artifact).getContent(), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.AgentResponse");
/*     */       String action = (artifact instanceof Artifact && ((Artifact)artifact).getContent() instanceof AgentResponse) ? ((AgentResponse)((Artifact)artifact).getContent()).getActionRequest().getName() : ((artifact instanceof Artifact) ? ((Artifact)artifact).getId().getType().getName() : null);
/*     */       isRootNode(artifact.getId()) ? this.compositeActivity.logGenerationFinished(activities, artifact.getId(), this.taskChainId, this.task.getId(), status, statistics) : this.compositeActivity.logGenerationStepFinished(activities, artifact.getId(), this.taskChainId, this.task.getId(), action, status, statistics);
/*     */     } finally {
/*     */       this.activities.remove(artifact.getId());
/*     */     } 
/*     */   }
/*     */   
/*     */   private final EJResultStatus getFailedStatus(FailedArtifact artifact) {
/*     */     FailureReason failureReason = artifact.getReasoning().getReason();
/*     */     if (failureReason instanceof FailureReason.ProblemsWithShell) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return (failureReason instanceof FailureReason.ContextLengthExceeded) ? EJResultStatus.EXIT_CONTEXT : ((failureReason instanceof FailureReason.FormatError) ? EJResultStatus.EXIT_FORMAT : ((failureReason instanceof FailureReason.CostExceeded) ? EJResultStatus.EXIT_COST : ((failureReason instanceof FailureReason.PaymentRequired) ? EJResultStatus.EXIT_PAYMENT_REQUIRED : ((failureReason instanceof FailureReason.InferenceServerTimeout) ? EJResultStatus.EXIT_TIMEOUT : ((failureReason instanceof FailureReason.UnexpectedException) ? EJResultStatus.EXIT_UNEXPECTED_EXCEPTION : ((failureReason instanceof FailureReason.CountryForbidden) ? EJResultStatus.EXIT_COUNTRY_FORBIDDEN : ((failureReason instanceof FailureReason.BadResponseException) ? EJResultStatus.EXIT_UNEXPECTED_EXCEPTION : (EJResultStatus)"JD-Core does not support Kotlin")))))));
/*     */   }
/*     */   
/*     */   private final EJResultStatus toEJResultStatus(AgentExitStatus $this$toEJResultStatus) {
/*     */     switch (WhenMappings.$EnumSwitchMapping$0[$this$toEJResultStatus.ordinal()]) {
/*     */       case 1:
/*     */       
/*     */       case 2:
/*     */       
/*     */       case 3:
/*     */       
/*     */       case 4:
/*     */       
/*     */       case 5:
/*     */       
/*     */       case 6:
/*     */       
/*     */       case 7:
/*     */       
/*     */       case 8:
/*     */       
/*     */       case 9:
/*     */       
/*     */       case 10:
/*     */       
/*     */     } 
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   
/*     */   private final boolean isRootNode(ArtifactId $this$isRootNode) {
/*     */     if ($this$isRootNode != null)
/*     */       if (Intrinsics.areEqual((this.rootNode != null) ? this.rootNode.getId() : null, $this$isRootNode)); 
/*     */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\statistics\StatisticsExecutionContextListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */