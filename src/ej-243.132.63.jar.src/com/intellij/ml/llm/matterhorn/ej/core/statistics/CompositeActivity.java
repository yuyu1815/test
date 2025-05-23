/*     */ package com.intellij.ml.llm.matterhorn.ej.core.statistics;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.statistics.processors.EJActivityProcessor;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\036\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\030\0002\0020\001:\001'B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006Jr\020\t\032\b\022\004\022\0020\n0\0032\n\020\013\032\006\022\002\b\0030\f2\006\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\0242\006\020\025\032\0020\0262\f\020\027\032\b\022\004\022\0020\0240\0302\f\020\031\032\b\022\004\022\0020\0240\0302\f\020\032\032\b\022\004\022\0020\0240\0302\006\020\033\032\0020\024JF\020\034\032\b\022\004\022\0020\0350\0032\f\020\036\032\b\022\004\022\0020\n0\0032\n\020\013\032\006\022\002\b\0030\f2\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\037\032\0020 2\006\020!\032\0020\"J<\020#\032\b\022\004\022\0020\n0\0032\n\020$\032\006\022\002\b\0030\f2\n\020\013\032\006\022\002\b\0030\f2\006\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\022JP\020%\032\b\022\004\022\0020\0350\0032\f\020\036\032\b\022\004\022\0020\n0\0032\n\020\013\032\006\022\002\b\0030\f2\006\020\017\032\0020\0202\006\020\021\032\0020\0222\b\020&\032\004\030\0010\0242\006\020\037\032\0020 2\006\020!\032\0020\"R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\b¨\006("}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/CompositeActivity;", "", "activityProcessors", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/processors/EJActivityProcessor;", "<init>", "(Ljava/util/List;)V", "getActivityProcessors", "()Ljava/util/List;", "logGenerationStarted", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/CompositeActivity$CustomActivity;", "artifactId", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "project", "Lcom/intellij/openapi/project/Project;", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "taskId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "taskDescription", "", "vcsStateId", "Ljava/util/UUID;", "recentFilesAddedToContext", "", "openFilesAddedToContext", "explicitlySelectedUserPaths", "ejVersion", "logGenerationFinished", "", "activities", "status", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/EJResultStatus;", "modelStats", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "logGenerationStepStarted", "parentArtifactId", "logGenerationStepFinished", "agentAction", "CustomActivity", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nCompositeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeActivity.kt\ncom/intellij/ml/llm/matterhorn/ej/core/statistics/CompositeActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n774#2:103\n865#2,2:104\n1557#2:106\n1628#2,3:107\n1557#2:110\n1628#2,3:111\n774#2:114\n865#2,2:115\n1557#2:117\n1628#2,3:118\n1557#2:121\n1628#2,3:122\n*S KotlinDebug\n*F\n+ 1 CompositeActivity.kt\ncom/intellij/ml/llm/matterhorn/ej/core/statistics/CompositeActivity\n*L\n29#1:103\n29#1:104,2\n30#1:106\n30#1:107,3\n53#1:110\n53#1:111,3\n71#1:114\n71#1:115,2\n72#1:117\n72#1:118,3\n91#1:121\n91#1:122,3\n*E\n"})
/*     */ public final class CompositeActivity {
/*     */   @NotNull
/*     */   private final List<EJActivityProcessor> activityProcessors;
/*     */   
/*  13 */   public CompositeActivity(@NotNull List<EJActivityProcessor> activityProcessors) { this.activityProcessors = activityProcessors; } @NotNull public final List<EJActivityProcessor> getActivityProcessors() { return this.activityProcessors; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/CompositeActivity$CustomActivity;", "", "activity", "Lcom/intellij/internal/statistic/StructuredIdeActivity;", "activityProcessor", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/processors/EJActivityProcessor;", "<init>", "(Lcom/intellij/internal/statistic/StructuredIdeActivity;Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/processors/EJActivityProcessor;)V", "getActivity", "()Lcom/intellij/internal/statistic/StructuredIdeActivity;", "getActivityProcessor", "()Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/processors/EJActivityProcessor;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ej-core"}) public static final class CustomActivity { @NotNull
/*     */     private final StructuredIdeActivity activity; @NotNull
/*  15 */     private final EJActivityProcessor activityProcessor; public CustomActivity(@NotNull StructuredIdeActivity activity, @NotNull EJActivityProcessor activityProcessor) { this.activity = activity; this.activityProcessor = activityProcessor; } @NotNull public final StructuredIdeActivity getActivity() { return this.activity; } @NotNull public final StructuredIdeActivity component1() { return this.activity; } @NotNull public final EJActivityProcessor component2() { return this.activityProcessor; } @NotNull public final CustomActivity copy(@NotNull StructuredIdeActivity activity, @NotNull EJActivityProcessor activityProcessor) { Intrinsics.checkNotNullParameter(activity, "activity"); Intrinsics.checkNotNullParameter(activityProcessor, "activityProcessor"); return new CustomActivity(activity, activityProcessor); } @NotNull public final EJActivityProcessor getActivityProcessor() { return this.activityProcessor; }
/*     */     @NotNull
/*     */     public String toString() { return "CustomActivity(activity=" + this.activity + ", activityProcessor=" + this.activityProcessor + ")"; } public int hashCode() { result = this.activity.hashCode();
/*     */       return result * 31 + this.activityProcessor.hashCode(); } public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof CustomActivity))
/*     */         return false; 
/*     */       CustomActivity customActivity = (CustomActivity)other;
/*     */       return !Intrinsics.areEqual(this.activity, customActivity.activity) ? false : (!!Intrinsics.areEqual(this.activityProcessor, customActivity.activityProcessor));
/*     */     } }
/*     */    @NotNull
/*     */   public final List<CustomActivity> logGenerationStarted(@NotNull ArtifactId artifactId, @NotNull Project project, @NotNull TaskChainId chainId, @NotNull TaskId taskId, @NotNull String taskDescription, @NotNull UUID vcsStateId, @NotNull Collection recentFilesAddedToContext, @NotNull Collection openFilesAddedToContext, @NotNull Collection explicitlySelectedUserPaths, @NotNull String ejVersion) {
/*  28 */     Intrinsics.checkNotNullParameter(artifactId, "artifactId"); Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(taskId, "taskId"); Intrinsics.checkNotNullParameter(taskDescription, "taskDescription"); Intrinsics.checkNotNullParameter(vcsStateId, "vcsStateId"); Intrinsics.checkNotNullParameter(recentFilesAddedToContext, "recentFilesAddedToContext"); Intrinsics.checkNotNullParameter(openFilesAddedToContext, "openFilesAddedToContext"); Intrinsics.checkNotNullParameter(explicitlySelectedUserPaths, "explicitlySelectedUserPaths"); Intrinsics.checkNotNullParameter(ejVersion, "ejVersion"); List<EJActivityProcessor> list1 = this.activityProcessors;
/*  29 */     int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 103 */     List<EJActivityProcessor> list2 = list1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 104 */     for (EJActivityProcessor element$iv$iv : list2) { EJActivityProcessor it = element$iv$iv; int $i$a$-filter-CompositeActivity$logGenerationStarted$1 = 0; if (it.getEnabled()) collection.add(element$iv$iv);  }
/* 105 */      Iterable $this$filter$iv = collection; int $i$f$map = 0;
/* 106 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 107 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 108 */       EJActivityProcessor eJActivityProcessor = (EJActivityProcessor)item$iv$iv; Collection collection1 = destination$iv$iv; int $i$a$-map-CompositeActivity$logGenerationStarted$2 = 0;
/* 109 */     }  return (List<CustomActivity>)destination$iv$iv; } @NotNull public final List<Unit> logGenerationFinished(@NotNull List activities, @NotNull ArtifactId artifactId, @NotNull TaskChainId chainId, @NotNull TaskId taskId, @NotNull EJResultStatus status, @NotNull ArtifactStatistic modelStats) { Intrinsics.checkNotNullParameter(activities, "activities"); Intrinsics.checkNotNullParameter(artifactId, "artifactId"); Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(taskId, "taskId"); Intrinsics.checkNotNullParameter(status, "status"); Intrinsics.checkNotNullParameter(modelStats, "modelStats"); Iterable $this$map$iv = activities; int $i$f$map = 0;
/* 110 */     Iterable iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 111 */     for (Object item$iv$iv : iterable1) {
/* 112 */       CustomActivity customActivity = (CustomActivity)item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-CompositeActivity$logGenerationFinished$1 = 0;
/* 113 */     }  return (List<Unit>)destination$iv$iv; } @NotNull public final List<CustomActivity> logGenerationStepStarted(@NotNull ArtifactId parentArtifactId, @NotNull ArtifactId artifactId, @NotNull Project project, @NotNull TaskChainId chainId, @NotNull TaskId taskId) { Intrinsics.checkNotNullParameter(parentArtifactId, "parentArtifactId"); Intrinsics.checkNotNullParameter(artifactId, "artifactId"); Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(taskId, "taskId"); List<EJActivityProcessor> list1 = this.activityProcessors; int $i$f$filter = 0;
/* 114 */     List<EJActivityProcessor> list2 = list1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 115 */     for (EJActivityProcessor element$iv$iv : list2) { EJActivityProcessor it = element$iv$iv; int $i$a$-filter-CompositeActivity$logGenerationStepStarted$1 = 0; if (it.getEnabled()) collection.add(element$iv$iv);  }
/* 116 */      Iterable $this$filter$iv = collection; int $i$f$map = 0;
/* 117 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 118 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 119 */       EJActivityProcessor eJActivityProcessor = (EJActivityProcessor)item$iv$iv; Collection collection1 = destination$iv$iv; int $i$a$-map-CompositeActivity$logGenerationStepStarted$2 = 0;
/* 120 */     }  return (List<CustomActivity>)destination$iv$iv; } @NotNull public final List<Unit> logGenerationStepFinished(@NotNull List activities, @NotNull ArtifactId artifactId, @NotNull TaskChainId chainId, @NotNull TaskId taskId, @Nullable String agentAction, @NotNull EJResultStatus status, @NotNull ArtifactStatistic modelStats) { Intrinsics.checkNotNullParameter(activities, "activities"); Intrinsics.checkNotNullParameter(artifactId, "artifactId"); Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(taskId, "taskId"); Intrinsics.checkNotNullParameter(status, "status"); Intrinsics.checkNotNullParameter(modelStats, "modelStats"); Iterable $this$map$iv = activities; int $i$f$map = 0;
/* 121 */     Iterable iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 122 */     for (Object item$iv$iv : iterable1) {
/* 123 */       CustomActivity customActivity = (CustomActivity)item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-CompositeActivity$logGenerationStepFinished$1 = 0;
/* 124 */     }  return (List<Unit>)destination$iv$iv; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\statistics\CompositeActivity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */