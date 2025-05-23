/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.statistics;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.statistics.processors.EJUIEventsProcessor;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\020\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\t\032\0020\nJ\016\020\013\032\0020\n2\006\020\f\032\0020\rJ\016\020\016\032\0020\n2\006\020\f\032\0020\rJ\016\020\017\032\0020\n2\006\020\020\032\0020\021J\016\020\022\032\0020\n2\006\020\023\032\0020\021J\016\020\024\032\0020\n2\006\020\023\032\0020\021J\006\020\025\032\0020\nJ\016\020\026\032\0020\n2\006\020\023\032\0020\021J\026\020\027\032\0020\n2\006\020\030\032\0020\0312\006\020\032\032\0020\033J\026\020\034\032\0020\n2\006\020\030\032\0020\0312\006\020\032\032\0020\033J\026\020\035\032\0020\n2\006\020\030\032\0020\0312\006\020\032\032\0020\033J\026\020\036\032\0020\n2\006\020\030\032\0020\0312\006\020\032\032\0020\033J\026\020\037\032\0020\n2\006\020\030\032\0020\0312\006\020\032\032\0020\033J\026\020 \032\0020\n2\006\020\030\032\0020\0312\006\020\032\032\0020\033J\026\020!\032\0020\n2\006\020\030\032\0020\0312\006\020\032\032\0020\033J\016\020\"\032\0020\n2\006\020\030\032\0020\031J\016\020#\032\0020\n2\006\020\030\032\0020\031J\016\020$\032\0020\n2\006\020\030\032\0020\031J\016\020%\032\0020\n2\006\020\030\032\0020\031J\016\020&\032\0020\n2\006\020\030\032\0020\031J\016\020'\032\0020\n2\006\020\030\032\0020\031J\026\020(\032\0020\n2\006\020\030\032\0020\0312\006\020\032\032\0020\033J\036\020)\032\0020\n2\006\020*\032\0020\0212\006\020\030\032\0020\0312\006\020\032\032\0020\033R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006+"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/CompositeUiAction;", "", "<init>", "()V", "uiEventProcessors", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/processors/EJUIEventsProcessor;", "getUiEventProcessors", "()Ljava/util/List;", "logTaskRecentFilesButtonClicked", "", "logTaskRecentFileAdded", "path", "Ljava/nio/file/Path;", "logTaskRecentFileRemoved", "logCommandAutoApproveChecked", "checked", "", "logTaskDescriptionFocus", "followUp", "logTaskDescriptionInput", "logExampleClicked", "logSubmitTask", "logStopTaskButtonClicked", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "taskId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "logDoneTaskButtonClicked", "logStartAgainButtonClicked", "logDeclineTaskButtonClicked", "logRollbackTaskButtonClicked", "logGoBackTaskButtonClicked", "logCancelStepTaskButtonClicked", "logStopTaskMenuClicked", "logStartAgainTaskMenuClicked", "logRollbackTaskMenuClicked", "logDeleteTaskMenuClicked", "logDeleteAllTaskMenuClicked", "logTaskReopenFromHistory", "logAskConfirmationShowed", "logAskConfirmationAnswered", "isConfirmed", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nCompositeUiAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeUiAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/statistics/CompositeUiAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n774#2:64\n865#2,2:65\n1863#2,2:67\n774#2:69\n865#2,2:70\n1863#2,2:72\n774#2:74\n865#2,2:75\n1863#2,2:77\n774#2:79\n865#2,2:80\n1863#2,2:82\n774#2:84\n865#2,2:85\n1863#2,2:87\n774#2:89\n865#2,2:90\n1863#2,2:92\n774#2:94\n865#2,2:95\n1863#2,2:97\n774#2:99\n865#2,2:100\n1863#2,2:102\n774#2:104\n865#2,2:105\n1863#2,2:107\n774#2:109\n865#2,2:110\n1863#2,2:112\n774#2:114\n865#2,2:115\n1863#2,2:117\n774#2:119\n865#2,2:120\n1863#2,2:122\n774#2:124\n865#2,2:125\n1863#2,2:127\n774#2:129\n865#2,2:130\n1863#2,2:132\n774#2:134\n865#2,2:135\n1863#2,2:137\n774#2:139\n865#2,2:140\n1863#2,2:142\n774#2:144\n865#2,2:145\n1863#2,2:147\n774#2:149\n865#2,2:150\n1863#2,2:152\n774#2:154\n865#2,2:155\n1863#2,2:157\n774#2:159\n865#2,2:160\n1863#2,2:162\n774#2:164\n865#2,2:165\n1863#2,2:167\n774#2:169\n865#2,2:170\n1863#2,2:172\n774#2:174\n865#2,2:175\n1863#2,2:177\n*S KotlinDebug\n*F\n+ 1 CompositeUiAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/statistics/CompositeUiAction\n*L\n18#1:64\n18#1:65,2\n18#1:67,2\n20#1:69\n20#1:70,2\n20#1:72,2\n22#1:74\n22#1:75,2\n22#1:77,2\n24#1:79\n24#1:80,2\n24#1:82,2\n26#1:84\n26#1:85,2\n26#1:87,2\n28#1:89\n28#1:90,2\n28#1:92,2\n30#1:94\n30#1:95,2\n30#1:97,2\n32#1:99\n32#1:100,2\n32#1:102,2\n34#1:104\n34#1:105,2\n34#1:107,2\n36#1:109\n36#1:110,2\n36#1:112,2\n38#1:114\n38#1:115,2\n38#1:117,2\n40#1:119\n40#1:120,2\n40#1:122,2\n42#1:124\n42#1:125,2\n42#1:127,2\n44#1:129\n44#1:130,2\n44#1:132,2\n46#1:134\n46#1:135,2\n46#1:137,2\n48#1:139\n48#1:140,2\n48#1:142,2\n50#1:144\n50#1:145,2\n50#1:147,2\n52#1:149\n52#1:150,2\n52#1:152,2\n54#1:154\n54#1:155,2\n54#1:157,2\n56#1:159\n56#1:160,2\n56#1:162,2\n58#1:164\n58#1:165,2\n58#1:167,2\n60#1:169\n60#1:170,2\n60#1:172,2\n62#1:174\n62#1:175,2\n62#1:177,2\n*E\n"})
/*     */ public final class CompositeUiAction {
/*     */   @NotNull
/*  11 */   public final List<EJUIEventsProcessor> getUiEventProcessors() { return uiEventProcessors; } @NotNull
/*  12 */   public static final CompositeUiAction INSTANCE = new CompositeUiAction(); @NotNull private static final List<EJUIEventsProcessor> uiEventProcessors; public static final int $stable = 8; static {
/*  13 */     EJUIEventsProcessor[] arrayOfEJUIEventsProcessor = new EJUIEventsProcessor[2]; arrayOfEJUIEventsProcessor[0] = EJUiEventLogger.INSTANCE; arrayOfEJUIEventsProcessor[1] = EJUiPrivateEventLogger.INSTANCE; uiEventProcessors = BuildConfigKt.getConfig().getCanSendNonAnonymizedStats() ? CollectionsKt.listOf((Object[])arrayOfEJUIEventsProcessor) : 
/*     */       
/*  15 */       CollectionsKt.listOf(EJUiEventLogger.INSTANCE);
/*     */   }
/*     */   
/*  18 */   public final void logTaskRecentFilesButtonClicked() { Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  64 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/*  65 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logTaskRecentFilesButtonClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/*  66 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/*  67 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logTaskRecentFilesButtonClicked$2 = 0; it.logTaskRecentFilesButtonClicked(); }
/*     */      } public final void logTaskRecentFileAdded(@NotNull Path path) { Intrinsics.checkNotNullParameter(path, "path"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/*  69 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/*  70 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logTaskRecentFileAdded$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/*  71 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/*  72 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logTaskRecentFileAdded$2 = 0; it.logTaskRecentFileAdded(path); }
/*     */      } public final void logTaskRecentFileRemoved(@NotNull Path path) { Intrinsics.checkNotNullParameter(path, "path"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/*  74 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/*  75 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logTaskRecentFileRemoved$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/*  76 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/*  77 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logTaskRecentFileRemoved$2 = 0; it.logTaskRecentFileRemoved(path); }
/*     */      } public final void logCommandAutoApproveChecked(boolean checked) { Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/*  79 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/*  80 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logCommandAutoApproveChecked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/*  81 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/*  82 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logCommandAutoApproveChecked$2 = 0; it.logCommandAutoApproveChecked(checked); }
/*     */      } public final void logTaskDescriptionFocus(boolean followUp) { Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/*  84 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/*  85 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logTaskDescriptionFocus$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/*  86 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/*  87 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logTaskDescriptionFocus$2 = 0; it.logTaskDescriptionFocus(followUp); }
/*     */      } public final void logTaskDescriptionInput(boolean followUp) { Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/*  89 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/*  90 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logTaskDescriptionInput$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/*  91 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/*  92 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logTaskDescriptionInput$2 = 0; it.logTaskDescriptionInput(followUp); }
/*     */      } public final void logExampleClicked() { Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/*  94 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/*  95 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logExampleClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/*  96 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/*  97 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logExampleClicked$2 = 0; it.logExampleClicked(); }
/*     */      } public final void logSubmitTask(boolean followUp) { Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/*  99 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 100 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logSubmitTask$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 101 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 102 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logSubmitTask$2 = 0; it.logSubmitTask(followUp); }
/*     */      } public final void logStopTaskButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(taskId, "taskId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 104 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 105 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logStopTaskButtonClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 106 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 107 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logStopTaskButtonClicked$2 = 0; it.logStopTaskButtonClicked(chainId, taskId); }
/*     */      } public final void logDoneTaskButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(taskId, "taskId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 109 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 110 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logDoneTaskButtonClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 111 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 112 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logDoneTaskButtonClicked$2 = 0; it.logDoneTaskButtonClicked(chainId, taskId); }
/*     */      } public final void logStartAgainButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(taskId, "taskId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 114 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 115 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logStartAgainButtonClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 116 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 117 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logStartAgainButtonClicked$2 = 0; it.logStartAgainButtonClicked(chainId, taskId); }
/*     */      } public final void logDeclineTaskButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(taskId, "taskId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 119 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 120 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logDeclineTaskButtonClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 121 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 122 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logDeclineTaskButtonClicked$2 = 0; it.logDeclineTaskButtonClicked(chainId, taskId); }
/*     */      } public final void logRollbackTaskButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(taskId, "taskId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 124 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 125 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logRollbackTaskButtonClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 126 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 127 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logRollbackTaskButtonClicked$2 = 0; it.logRollbackTaskButtonClicked(chainId, taskId); }
/*     */      } public final void logGoBackTaskButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(taskId, "taskId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 129 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 130 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logGoBackTaskButtonClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 131 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 132 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logGoBackTaskButtonClicked$2 = 0; it.logGoBackTaskButtonClicked(chainId, taskId); }
/*     */      } public final void logCancelStepTaskButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(taskId, "taskId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 134 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 135 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logCancelStepTaskButtonClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 136 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 137 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logCancelStepTaskButtonClicked$2 = 0; it.logCancelStepTaskButtonClicked(chainId, taskId); }
/*     */      } public final void logStopTaskMenuClicked(@NotNull TaskChainId chainId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 139 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 140 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logStopTaskMenuClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 141 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 142 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logStopTaskMenuClicked$2 = 0; it.logStopTaskMenuClicked(chainId); }
/*     */      } public final void logStartAgainTaskMenuClicked(@NotNull TaskChainId chainId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 144 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 145 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logStartAgainTaskMenuClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 146 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 147 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logStartAgainTaskMenuClicked$2 = 0; it.logStartAgainTaskMenuClicked(chainId); }
/*     */      } public final void logRollbackTaskMenuClicked(@NotNull TaskChainId chainId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 149 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 150 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logRollbackTaskMenuClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 151 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 152 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logRollbackTaskMenuClicked$2 = 0; it.logRollbackTaskMenuClicked(chainId); }
/*     */      } public final void logDeleteTaskMenuClicked(@NotNull TaskChainId chainId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 154 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 155 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logDeleteTaskMenuClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 156 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 157 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logDeleteTaskMenuClicked$2 = 0; it.logDeleteTaskMenuClicked(chainId); }
/*     */      } public final void logDeleteAllTaskMenuClicked(@NotNull TaskChainId chainId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 159 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 160 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logDeleteAllTaskMenuClicked$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 161 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 162 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logDeleteAllTaskMenuClicked$2 = 0; it.logDeleteAllTaskMenuClicked(chainId); }
/*     */      } public final void logTaskReopenFromHistory(@NotNull TaskChainId chainId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 164 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 165 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logTaskReopenFromHistory$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 166 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 167 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logTaskReopenFromHistory$2 = 0; it.logTaskReopenFromHistory(chainId); }
/*     */      } public final void logAskConfirmationShowed(@NotNull TaskChainId chainId, @NotNull TaskId taskId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(taskId, "taskId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 169 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 170 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logAskConfirmationShowed$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 171 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 172 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logAskConfirmationShowed$2 = 0; it.logAskConfirmationShowed(chainId, taskId); }
/*     */      } public final void logAskConfirmationAnswered(boolean isConfirmed, @NotNull TaskChainId chainId, @NotNull TaskId taskId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(taskId, "taskId"); Iterable<EJUIEventsProcessor> $this$filter$iv = uiEventProcessors; int $i$f$filter = 0;
/* 174 */     Iterable<EJUIEventsProcessor> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 175 */     for (EJUIEventsProcessor element$iv$iv : iterable1) { EJUIEventsProcessor it = element$iv$iv; int $i$a$-filter-CompositeUiAction$logAskConfirmationAnswered$1 = 0; if (it.getEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 176 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 177 */     Iterator<EJUIEventsProcessor> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EJUIEventsProcessor it = (EJUIEventsProcessor)element$iv; int $i$a$-forEach-CompositeUiAction$logAskConfirmationAnswered$2 = 0;
/*     */       it.logAskConfirmationAnswered(isConfirmed, chainId, taskId); }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\statistics\CompositeUiAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */