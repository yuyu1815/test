/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header;
/*     */ 
/*     */ import androidx.compose.ui.Modifier;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskChainState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.statistics.CompositeUiAction;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.collections.immutable.PersistentList;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\007\b\007\030\0002\0020\001:\001\034B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007¢\006\004\b\t\020\nJ\006\020\017\032\0020\020J\030\020\021\032\0020\f2\006\020\022\032\0020\0232\006\020\024\032\0020\bH\002J\006\020\025\032\0020\026J\006\020\027\032\0020\026J\006\020\030\032\0020\026J\006\020\031\032\0020\026J\006\020\032\032\0020\026J\006\020\033\032\0020\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\031\020\013\032\n\022\006\022\004\030\0010\f0\007¢\006\b\n\000\032\004\b\r\020\016¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;", "parent", "Lkotlinx/coroutines/CoroutineScope;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;", "hasChanges", "Lkotlinx/coroutines/flow/StateFlow;", "", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Lkotlinx/coroutines/flow/StateFlow;)V", "uiState", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getTaskIds", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel$TaskIds;", "computeUiState", "taskChain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "hasAnyChanges", "back", "", "stop", "done", "declineAll", "startAgain", "reportIssue", "TaskIds", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nTaskHeaderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskHeaderViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,180:1\n149#2:181\n149#2:182\n149#2:183\n*S KotlinDebug\n*F\n+ 1 TaskHeaderViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel\n*L\n79#1:181\n81#1:182\n121#1:183\n*E\n"})
/*     */ public final class TaskHeaderViewModel extends ViewModel {
/*     */   @NotNull
/*     */   private final TaskChainDetailsViewModel model;
/*     */   @NotNull
/*     */   private final StateFlow<TaskHeaderState> uiState;
/*     */   public static final int $stable = 8;
/*     */   
/*  27 */   public TaskHeaderViewModel(@NotNull CoroutineScope parent, @NotNull TaskChainDetailsViewModel model, @NotNull StateFlow hasChanges) { super(parent, "TaskHeaderViewModel");
/*     */ 
/*     */ 
/*     */     
/*     */     this.model = model;
/*     */ 
/*     */     
/*  34 */     this.uiState = FlowKt.stateIn(FlowKt.combine((Flow)this.model.getLiveTaskChain().getChain(), (Flow)hasChanges, new TaskHeaderViewModel$uiState$1(null)), 
/*  35 */         getScope(), 
/*  36 */         SharingStarted.Companion.getLazily(), 
/*  37 */         null); } @NotNull public final StateFlow<TaskHeaderState> getUiState() { return this.uiState; } @DebugMetadata(f = "TaskHeaderViewModel.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.TaskHeaderViewModel$uiState$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "taskChain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "hasChanges", ""}) static final class TaskHeaderViewModel$uiState$1 extends SuspendLambda implements Function3<TaskChainEntity, Boolean, Continuation<? super TaskHeaderState>, Object> {
/*     */     int label; TaskHeaderViewModel$uiState$1(Continuation $completion) { super(3, $completion); } public final Object invokeSuspend(Object $result) { TaskChainEntity taskChain; boolean hasChanges; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); taskChain = (TaskChainEntity)this.L$0; hasChanges = this.Z$0; return TaskHeaderViewModel.this.computeUiState(taskChain, hasChanges); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(TaskChainEntity p1, boolean p2, Continuation<? super TaskHeaderViewModel$uiState$1> p3) { TaskHeaderViewModel$uiState$1 taskHeaderViewModel$uiState$1 = new TaskHeaderViewModel$uiState$1(p3); taskHeaderViewModel$uiState$1.L$0 = p1; taskHeaderViewModel$uiState$1.Z$0 = p2; return taskHeaderViewModel$uiState$1.invokeSuspend(Unit.INSTANCE); }
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel$TaskIds;", "", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "issueId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;)V", "getChainId", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "getIssueId", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ej-ui"}) @StabilityInferred(parameters = 0) public static final class TaskIds {
/*  40 */     @NotNull private final TaskChainId chainId; public TaskIds(@NotNull TaskChainId chainId, @NotNull TaskId issueId) { this.chainId = chainId; this.issueId = issueId; } @NotNull private final TaskId issueId; public static final int $stable = 8; @NotNull public final TaskChainId getChainId() { return this.chainId; } @NotNull public final TaskId getIssueId() { return this.issueId; } @NotNull public final TaskChainId component1() { return this.chainId; } @NotNull public final TaskId component2() { return this.issueId; } @NotNull public final TaskIds copy(@NotNull TaskChainId chainId, @NotNull TaskId issueId) { Intrinsics.checkNotNullParameter(chainId, "chainId"); Intrinsics.checkNotNullParameter(issueId, "issueId"); return new TaskIds(chainId, issueId); } @NotNull public String toString() { return "TaskIds(chainId=" + this.chainId + ", issueId=" + this.issueId + ")"; }
/*     */     public int hashCode() { result = this.chainId.hashCode(); return result * 31 + this.issueId.hashCode(); }
/*     */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof TaskIds)) return false;  TaskIds taskIds = (TaskIds)other; return !Intrinsics.areEqual(this.chainId, taskIds.chainId) ? false : (!!Intrinsics.areEqual(this.issueId, taskIds.issueId)); } }
/*  43 */   @NotNull public final TaskIds getTaskIds() { TaskChainEntity chainEntity = (TaskChainEntity)this.model.getLiveTaskChain().getChain().getValue();
/*  44 */     PersistentList tasks = (PersistentList)this.model.getLiveTaskChain().getTasks().getValue();
/*  45 */     return new TaskIds(chainEntity.getId(), ((LiveTaskSnapshot)CollectionsKt.last((List)tasks)).getTask().getId()); } private final TaskHeaderState computeUiState(TaskChainEntity taskChain, boolean hasAnyChanges) { boolean isFinished; int $this$dp$iv; Modifier iconModifier; int $i$f$getDp, i;
/*     */     Action doneButton;
/*     */     int j;
/*     */     Action declineButton, startAgainButton;
/*  49 */     if (taskChain.getName() == null) taskChain.getName();  String taskName = "Thinking";
/*     */     
/*  51 */     switch (WhenMappings.$EnumSwitchMapping$0[taskChain.getState().ordinal()]) {
/*     */       case 1:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 2:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 3:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 4:
/*     */       case 5:
/*     */       case 6:
/*     */       case 7:
/*  77 */         isFinished = (taskChain.getState() == TaskChainState.Finished);
/*     */         
/*  79 */         i = 10; j = 0; i = 20; j = 0;
/*     */         
/*  81 */         i = 10; j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 181 */         iconModifier = isFinished ? SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default((Modifier)Modifier.Companion, 0.0F, 0.0F, Dp.constructor-impl(i), 0.0F, 11, null), Dp.constructor-impl(i)) : PaddingKt.padding-qDBjuR0$default((Modifier)Modifier.Companion, 0.0F, 0.0F, 
/* 182 */             Dp.constructor-impl(i), 0.0F, 11, null);
/*     */         if (isFinished) {
/*     */           String name = hasAnyChanges ? "Done" : "Okay";
/*     */         } else {
/*     */         
/*     */         } 
/*     */         doneButton = null;
/*     */         if (taskChain.getState() != TaskChainState.Done) {
/*     */           String name = hasAnyChanges ? "Decline" : "Not okay";
/*     */         } else {
/*     */         
/*     */         } 
/*     */         declineButton = null;
/*     */         startAgainButton = new Action("Start again", this::computeUiState$lambda$5);
/*     */       case 8:
/*     */         $this$dp$iv = 10;
/*     */         $i$f$getDp = 0;
/*     */     } 
/*     */     throw new NoWhenBranchMatchedException(); }
/*     */ 
/*     */   
/*     */   private static final Unit computeUiState$lambda$0(TaskHeaderViewModel this$0) {
/*     */     this$0.stop();
/*     */     TaskIds taskIds = this$0.getTaskIds();
/*     */     TaskChainId chainId = taskIds.component1();
/*     */     TaskId taskId = taskIds.component2();
/*     */     CompositeUiAction.INSTANCE.logStopTaskButtonClicked(chainId, taskId);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit computeUiState$lambda$1(TaskHeaderViewModel this$0) {
/*     */     this$0.stop();
/*     */     TaskIds taskIds = this$0.getTaskIds();
/*     */     TaskChainId chainId = taskIds.component1();
/*     */     TaskId taskId = taskIds.component2();
/*     */     CompositeUiAction.INSTANCE.logStopTaskButtonClicked(chainId, taskId);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit computeUiState$lambda$2(TaskHeaderViewModel this$0) {
/*     */     this$0.stop();
/*     */     TaskIds taskIds = this$0.getTaskIds();
/*     */     TaskChainId chainId = taskIds.component1();
/*     */     TaskId taskId = taskIds.component2();
/*     */     CompositeUiAction.INSTANCE.logStopTaskButtonClicked(chainId, taskId);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit computeUiState$lambda$3(TaskHeaderViewModel this$0) {
/*     */     this$0.done();
/*     */     TaskIds taskIds = this$0.getTaskIds();
/*     */     TaskChainId chainId = taskIds.component1();
/*     */     TaskId taskId = taskIds.component2();
/*     */     CompositeUiAction.INSTANCE.logDoneTaskButtonClicked(chainId, taskId);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit computeUiState$lambda$4(TaskHeaderViewModel this$0) {
/*     */     this$0.declineAll();
/*     */     TaskIds taskIds = this$0.getTaskIds();
/*     */     TaskChainId chainId = taskIds.component1();
/*     */     TaskId taskId = taskIds.component2();
/*     */     CompositeUiAction.INSTANCE.logDeclineTaskButtonClicked(chainId, taskId);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit computeUiState$lambda$5(TaskHeaderViewModel this$0) {
/*     */     this$0.startAgain();
/*     */     TaskIds taskIds = this$0.getTaskIds();
/*     */     TaskChainId chainId = taskIds.component1();
/*     */     TaskId taskId = taskIds.component2();
/*     */     CompositeUiAction.INSTANCE.logStartAgainButtonClicked(chainId, taskId);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit computeUiState$lambda$6(TaskHeaderViewModel this$0) {
/*     */     this$0.startAgain();
/*     */     TaskIds taskIds = this$0.getTaskIds();
/*     */     TaskChainId chainId = taskIds.component1();
/*     */     TaskId taskId = taskIds.component2();
/*     */     CompositeUiAction.INSTANCE.logStartAgainButtonClicked(chainId, taskId);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public final void back() {
/*     */     this.model.openMainPage();
/*     */   }
/*     */   
/*     */   public final void stop() {
/*     */     this.model.stop();
/*     */   }
/*     */   
/*     */   public final void done() {
/*     */     this.model.done();
/*     */   }
/*     */   
/*     */   public final void declineAll() {
/*     */     this.model.declineAll();
/*     */   }
/*     */   
/*     */   public final void startAgain() {
/*     */     this.model.startAgain();
/*     */   }
/*     */   
/*     */   public final void reportIssue() {
/*     */     this.model.reportIssue();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\header\TaskHeaderViewModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */