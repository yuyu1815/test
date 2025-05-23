/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020!\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\b\007\030\000 02\0020\001:\0010B)\022\f\020\002\032\b\022\004\022\0020\0040\003\022\022\020\005\032\016\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\004\b\t\020\nJ\036\020\035\032\0020\b2\006\020\036\032\0020\0202\f\020\037\032\b\022\002\b\003\030\0010\017H\026J\024\020 \032\0020\b2\n\020\036\032\006\022\002\b\0030!H\026J\020\020\"\032\0020\b2\006\020\036\032\0020#H\026J\020\020$\032\0020\b2\006\020\036\032\0020%H\026J \020&\032\0020\b2\n\020'\032\0060(j\002`)2\n\020*\032\006\022\002\b\0030\017H\026J\024\020+\032\0020\0342\n\020*\032\006\022\002\b\0030\017H\002J\036\020,\032\0020\b2\006\020-\032\0020.2\f\020\037\032\b\022\002\b\003\030\0010\017H\026J\024\020/\032\0020\b2\n\020*\032\006\022\002\b\0030\017H\002R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\013\020\fR\032\020\005\032\016\022\004\022\0020\007\022\004\022\0020\b0\006X\004¢\006\002\n\000R2\020\r\032&\022\b\022\006\022\002\b\0030\017\022\004\022\0020\0200\016j\022\022\b\022\006\022\002\b\0030\017\022\004\022\0020\020`\021X\004¢\006\002\n\000RF\020\022\032:\022\b\022\006\022\002\b\0030\017\022\016\022\f\022\b\022\006\022\002\b\0030\0170\0230\016j\034\022\b\022\006\022\002\b\0030\017\022\016\022\f\022\b\022\006\022\002\b\0030\0170\023`\021X\004¢\006\002\n\000R&\020\024\032\032\022\b\022\006\022\002\b\0030\0170\025j\f\022\b\022\006\022\002\b\0030\017`\026X\004¢\006\002\n\000R\036\020\027\032\022\022\004\022\0020\0310\030j\b\022\004\022\0020\031`\032X\004¢\006\002\n\000R2\020\033\032&\022\b\022\006\022\002\b\0030\017\022\004\022\0020\0340\016j\022\022\b\022\006\022\002\b\0030\017\022\004\022\0020\034`\021X\004¢\006\002\n\000¨\0061"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;", "singleStepArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "eventCallback", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ArtifactType;Lkotlin/jvm/functions/Function1;)V", "getSingleStepArtifactType", "()Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "artifactsMap", "Ljava/util/HashMap;", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "Lkotlin/collections/HashMap;", "childArtifactsMap", "", "finishedArtifacts", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "steps", "Ljava/util/ArrayList;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;", "Lkotlin/collections/ArrayList;", "artifactIdToStepIndexMap", "", "onUnfinishedArtifactCreated", "artifact", "requester", "onArtifactFinished", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "onArtifactCancelled", "Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;", "onArtifactFailed", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "onException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "artifactId", "getStepIndexMaybeCreating", "onCustomEvent", "event", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "cleanUpArtifact", "Companion", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nStepsBuildingContextListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepsBuildingContextListener.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n381#2,7:221\n1#3:228\n*S KotlinDebug\n*F\n+ 1 StepsBuildingContextListener.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener\n*L\n38#1:221,7\n*E\n"})
/*     */ public final class StepsBuildingContextListener implements RootExecutionContextListener { @NotNull
/*     */   public static final Companion Companion = new Companion(null); @NotNull
/*     */   private final ArtifactType<AgentResponse> singleStepArtifactType; @NotNull
/*     */   private final Function1<StepBuildingEvent, Unit> eventCallback; @NotNull
/*     */   private final HashMap<ArtifactId<?>, Artifactual> artifactsMap;
/*     */   @NotNull
/*     */   private final HashMap<ArtifactId<?>, List<ArtifactId<?>>> childArtifactsMap;
/*     */   @NotNull
/*     */   private final HashSet<ArtifactId<?>> finishedArtifacts;
/*     */   @NotNull
/*     */   private final ArrayList<StepEntity> steps;
/*     */   
/*  17 */   public StepsBuildingContextListener(@NotNull ArtifactType<AgentResponse> singleStepArtifactType, @NotNull Function1<StepBuildingEvent, Unit> eventCallback) { this.singleStepArtifactType = singleStepArtifactType;
/*  18 */     this.eventCallback = eventCallback;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  28 */     this.artifactsMap = new HashMap<>();
/*  29 */     this.childArtifactsMap = new HashMap<>();
/*  30 */     this.finishedArtifacts = new HashSet<>();
/*  31 */     this.steps = new ArrayList<>();
/*  32 */     this.artifactIdToStepIndexMap = new HashMap<>(); }
/*     */   @NotNull private final HashMap<ArtifactId<?>, Integer> artifactIdToStepIndexMap;
/*     */   public static final int $stable = 8;
/*     */   @NotNull private static final String RESENDING_LLM_REQUEST_STATUS = "Resending LLM request";
/*     */   @NotNull private static final String TROUBLES_ACCESSING_LLM_STATUS = "We are having trouble accessing LLM...";
/*     */   @NotNull
/*     */   private static final String SENDING_LLM_REQUEST_STATUS = "Sending LLM request";
/*     */   @NotNull
/*     */   private static final String REFORMULATING_REQUEST_STATUS = "Reformulating request";
/*     */   @NotNull
/*     */   private static final String CHECKING_ERRORS_STATUS = "Checking errors"; public void onUnfinishedArtifactUpdated(@NotNull Artifactual artifact) { RootExecutionContextListener.DefaultImpls.onUnfinishedArtifactUpdated(this, artifact); } public void onCancellation(@NotNull CancellationException e) { RootExecutionContextListener.DefaultImpls.onCancellation(this, e); } public void onTrajectoryElement(@NotNull TrajectoryElement element, @NotNull ExecutionContext context) { RootExecutionContextListener.DefaultImpls.onTrajectoryElement(this, element, context); } public void onContextRegistering(@NotNull RootExecutionContext context) { RootExecutionContextListener.DefaultImpls.onContextRegistering(this, context); } public void onContextClosed(@NotNull RootExecutionContext context) { RootExecutionContextListener.DefaultImpls.onContextClosed(this, context); } @NotNull
/*     */   public final ArtifactType<AgentResponse> getSingleStepArtifactType() { return this.singleStepArtifactType; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\005XT¢\006\002\n\000R\016\020\t\032\0020\005XT¢\006\002\n\000¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener$Companion;", "", "<init>", "()V", "RESENDING_LLM_REQUEST_STATUS", "", "TROUBLES_ACCESSING_LLM_STATUS", "SENDING_LLM_REQUEST_STATUS", "REFORMULATING_REQUEST_STATUS", "CHECKING_ERRORS_STATUS", "ej-ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {} } public synchronized void onUnfinishedArtifactCreated(@NotNull Artifactual artifact, @Nullable ArtifactId<?> requester) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'artifact'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield artifactsMap : Ljava/util/HashMap;
/*     */     //   10: checkcast java/util/Map
/*     */     //   13: aload_1
/*     */     //   14: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   19: aload_1
/*     */     //   20: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   25: pop
/*     */     //   26: aload_2
/*     */     //   27: ifnull -> 108
/*     */     //   30: aload_0
/*     */     //   31: getfield childArtifactsMap : Ljava/util/HashMap;
/*     */     //   34: checkcast java/util/Map
/*     */     //   37: astore #4
/*     */     //   39: iconst_0
/*     */     //   40: istore #5
/*     */     //   42: aload #4
/*     */     //   44: aload_2
/*     */     //   45: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   50: astore #6
/*     */     //   52: aload #6
/*     */     //   54: ifnonnull -> 88
/*     */     //   57: iconst_0
/*     */     //   58: istore #7
/*     */     //   60: new java/util/ArrayList
/*     */     //   63: dup
/*     */     //   64: invokespecial <init> : ()V
/*     */     //   67: checkcast java/util/List
/*     */     //   70: astore #7
/*     */     //   72: aload #4
/*     */     //   74: aload_2
/*     */     //   75: aload #7
/*     */     //   77: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   82: pop
/*     */     //   83: aload #7
/*     */     //   85: goto -> 90
/*     */     //   88: aload #6
/*     */     //   90: nop
/*     */     //   91: checkcast java/util/List
/*     */     //   94: astore_3
/*     */     //   95: aload_3
/*     */     //   96: aload_1
/*     */     //   97: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   102: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   107: pop
/*     */     //   108: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #36	-> 6
/*     */     //   #37	-> 26
/*     */     //   #38	-> 30
/*     */     //   #221	-> 42
/*     */     //   #222	-> 52
/*     */     //   #223	-> 57
/*     */     //   #38	-> 60
/*     */     //   #223	-> 70
/*     */     //   #224	-> 72
/*     */     //   #225	-> 83
/*     */     //   #227	-> 88
/*     */     //   #222	-> 90
/*     */     //   #38	-> 91
/*     */     //   #39	-> 95
/*     */     //   #41	-> 108
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   60	10	7	$i$a$-getOrPut-StepsBuildingContextListener$onUnfinishedArtifactCreated$childList$1	I
/*     */     //   72	13	7	answer$iv	Ljava/lang/Object;
/*     */     //   42	49	5	$i$f$getOrPut	I
/*     */     //   52	39	6	value$iv	Ljava/lang/Object;
/*     */     //   39	52	4	$this$getOrPut$iv	Ljava/util/Map;
/*     */     //   95	12	3	childList	Ljava/util/List;
/*     */     //   0	109	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;
/*     */     //   0	109	1	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*  45 */     //   0	109	2	requester	Lcom/intellij/ml/llm/matterhorn/ArtifactId; } public synchronized void onArtifactFinished(@NotNull Artifact artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); this.artifactsMap.put(artifact.getId(), artifact);
/*  46 */     this.finishedArtifacts.add(artifact.getId());
/*  47 */     if (Intrinsics.areEqual(artifact.getId().getType(), this.singleStepArtifactType)) {
/*  48 */       cleanUpArtifact(artifact.getId());
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void onArtifactCancelled(@NotNull CancelledArtifact artifact) {
/*  54 */     Intrinsics.checkNotNullParameter(artifact, "artifact"); this.artifactsMap.put(artifact.getId(), artifact);
/*  55 */     this.finishedArtifacts.add(artifact.getId());
/*  56 */     cleanUpArtifact(artifact.getId());
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void onArtifactFailed(@NotNull FailedArtifact artifact) {
/*  61 */     Intrinsics.checkNotNullParameter(artifact, "artifact"); this.artifactsMap.put(artifact.getId(), artifact);
/*  62 */     this.finishedArtifacts.add(artifact.getId());
/*  63 */     cleanUpArtifact(artifact.getId());
/*  64 */     ShellExecutor.ShellInitException exceptionToImitate = (artifact.getReasoning().getReason() instanceof com.intellij.ml.llm.matterhorn.FailureReason.ProblemsWithShell) ? 
/*  65 */       new ShellExecutor.ShellInitException() : 
/*  66 */       null;
/*  67 */     this.eventCallback.invoke(new StepBuildingEvent.ErrorOccurred((Exception)exceptionToImitate));
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void onException(@NotNull Exception e, @NotNull ArtifactId artifactId) {
/*  72 */     Intrinsics.checkNotNullParameter(e, "e"); Intrinsics.checkNotNullParameter(artifactId, "artifactId"); this.eventCallback.invoke(new StepBuildingEvent.ErrorOccurred(e));
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int getStepIndexMaybeCreating(ArtifactId<?> artifactId) {
/*  88 */     Integer existingStepIndex = this.artifactIdToStepIndexMap.get(artifactId);
/*  89 */     if (existingStepIndex == null) {
/*  90 */       int index = this.steps.size(); Integer integer = Integer.valueOf(index);
/*  91 */       this.artifactIdToStepIndexMap.put(artifactId, integer);
/*  92 */       this.steps.add(new StepEntity(null, null, null, null, null, null, 24, null));
/*  93 */       return index;
/*     */     } 
/*  95 */     return existingStepIndex.intValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void onCustomEvent(@NotNull CustomArtifactEvent event, @Nullable ArtifactId<?> requester) {
/* 104 */     Intrinsics.checkNotNullParameter(event, "event"); CustomArtifactEvent customArtifactEvent = event;
/*     */     
/* 106 */     if (customArtifactEvent instanceof StepMetaInfoAppearedEvent)
/* 107 */     { if (!((requester != null) ? 1 : 0))
/*     */       
/*     */       { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 228 */         int $i$a$-require-StepsBuildingContextListener$onCustomEvent$1 = 0; String str = "Parent for StepMetaInfoAppearedEvent is null"; throw new IllegalArgumentException(str.toString()); }  int stepIndex = getStepIndexMaybeCreating(requester); StepEntity newStepEntity = StepEntity.copy$default(this.steps.get(stepIndex), ((StepMetaInfoAppearedEvent)event).getStepName(), ((StepMetaInfoAppearedEvent)event).getStepType(), null, null, null, null, 60, null); this.steps.set(stepIndex, newStepEntity); this.eventCallback.invoke(new StepBuildingEvent.StepUpdated(newStepEntity, stepIndex)); } else if (customArtifactEvent instanceof EditEvent) { if (!((requester != null) ? 1 : 0)) { int $i$a$-require-StepsBuildingContextListener$onCustomEvent$2 = 0;
/*     */         String str = "Parent for EditEvent is null";
/*     */         throw new IllegalArgumentException(str.toString()); }
/*     */       
/*     */       int stepIndex = getStepIndexMaybeCreating(requester);
/*     */       StepEntity newStepEntity = StepEntity.copy$default(this.steps.get(stepIndex), null, null, null, ((EditEvent)event).getChanges(), null, null, 55, null);
/*     */       this.steps.set(stepIndex, newStepEntity);
/*     */       this.eventCallback.invoke(new StepBuildingEvent.StepUpdated(newStepEntity, stepIndex)); }
/*     */     else if (customArtifactEvent instanceof StepSummaryCreatedEvent)
/*     */     { ArtifactId<?> stepArtifactId = ((StepSummaryCreatedEvent)event).getStepArtifactId();
/*     */       int stepIndex = getStepIndexMaybeCreating(stepArtifactId);
/*     */       StepEntity newStepEntity = StepEntity.copy$default(this.steps.get(stepIndex), null, null, ((StepSummaryCreatedEvent)event).getStepSummary(), null, null, null, 59, null);
/*     */       this.steps.set(stepIndex, newStepEntity);
/*     */       this.eventCallback.invoke(new StepBuildingEvent.StepUpdated(newStepEntity, stepIndex));
/*     */       this.eventCallback.invoke(new StepBuildingEvent.ProgressUpdated(null)); }
/*     */     else if (customArtifactEvent instanceof TaskResultCreatedEvent)
/*     */     { this.eventCallback.invoke(new StepBuildingEvent.ResultAppeared(((TaskResultCreatedEvent)event).getTaskResult()));
/*     */       this.eventCallback.invoke(new StepBuildingEvent.ProgressUpdated(null)); }
/*     */     else if (customArtifactEvent instanceof TaskSummaryCreatedEvent)
/*     */     { this.eventCallback.invoke(new StepBuildingEvent.NameAppeared(((TaskSummaryCreatedEvent)event).getTaskSummary()));
/*     */       this.eventCallback.invoke(new StepBuildingEvent.ProgressUpdated(null)); }
/*     */     else if (customArtifactEvent instanceof AgentStateUpdatedEvent)
/*     */     { this.eventCallback.invoke(new StepBuildingEvent.AgentStateUpdated(((AgentStateUpdatedEvent)event).getState()));
/*     */       this.eventCallback.invoke(new StepBuildingEvent.ProgressUpdated(null)); }
/*     */     else if (customArtifactEvent instanceof AgentSessionUpdatedEvent)
/*     */     { this.eventCallback.invoke(new StepBuildingEvent.AgentSessionHistoryUpdated(((AgentSessionUpdatedEvent)event).getHistorySnapshot()));
/*     */       this.eventCallback.invoke(new StepBuildingEvent.ProgressUpdated(null)); }
/*     */     else if (customArtifactEvent instanceof PlanUpdatedEvent)
/*     */     { this.eventCallback.invoke(new StepBuildingEvent.PlanUpdated(((PlanUpdatedEvent)event).getPlan()));
/*     */       this.eventCallback.invoke(new StepBuildingEvent.ProgressUpdated(null)); }
/*     */     else if (customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.llm.LongDelayDetected)
/*     */     { this.eventCallback.invoke(new StepBuildingEvent.ProgressUpdated(new ProgressEntity("We are having trouble accessing LLM...", ProgressLevel.Warn))); }
/*     */     else if (customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.llm.LlmRequestFailed)
/*     */     { this.eventCallback.invoke(new StepBuildingEvent.ProgressUpdated(new ProgressEntity("Resending LLM request", ProgressLevel.Warn))); }
/*     */     else if (customArtifactEvent instanceof LlmRequestEvent)
/*     */     { if (((LlmRequestEvent)event).getAttemptNumber() == 0)
/*     */         this.eventCallback.invoke(new StepBuildingEvent.ProgressUpdated(new ProgressEntity("Sending LLM request", ProgressLevel.Info)));  }
/*     */     else if (customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.ej.core.ActionRequestBuildingFailed)
/*     */     { this.eventCallback.invoke(new StepBuildingEvent.ProgressUpdated(new ProgressEntity("Reformulating request", ProgressLevel.Warn))); }
/*     */     else if (customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.llm.LlmResponseEvent)
/*     */     { this.eventCallback.invoke(new StepBuildingEvent.ProgressUpdated(null)); }
/*     */     else if (customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.ej.core.actions.edit.SemanticCheckStarted)
/*     */     { this.eventCallback.invoke(new StepBuildingEvent.ProgressUpdated(new ProgressEntity("Checking errors", ProgressLevel.Info))); }
/*     */     else if (customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.ej.core.actions.edit.SemanticCheckFinished)
/*     */     { this.eventCallback.invoke(new StepBuildingEvent.ProgressUpdated(null)); }
/*     */     else if (customArtifactEvent instanceof TerminalSessionStartedEvent)
/*     */     { this.eventCallback.invoke(new StepBuildingEvent.TerminalSessionStarted(((TerminalSessionStartedEvent)event).getTerminalUid(), ((TerminalSessionStartedEvent)event).getOpenTerminalAction())); }
/*     */     else if (customArtifactEvent instanceof TerminalSessionFinishedEvent)
/*     */     { this.eventCallback.invoke(new StepBuildingEvent.TerminalSessionFinished(((TerminalSessionFinishedEvent)event).getTerminalUid(), ((TerminalSessionFinishedEvent)event).getSessionLog())); }
/*     */   
/*     */   }
/*     */   
/*     */   private final synchronized void cleanUpArtifact(ArtifactId artifactId) {
/*     */     this.artifactsMap.remove(artifactId);
/*     */     this.finishedArtifacts.remove(artifactId);
/*     */     List childIds = this.childArtifactsMap.remove(artifactId);
/*     */     if (childIds != null)
/*     */       for (ArtifactId<?> childId : (Iterable<ArtifactId<?>>)childIds)
/*     */         cleanUpArtifact(childId);  
/*     */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\StepsBuildingContextListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */