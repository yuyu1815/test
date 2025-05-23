/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\r\n\002\020\013\n\002\b\013\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B=\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\006\020\t\032\0020\n\022\016\b\002\020\013\032\b\022\004\022\0020\r0\f¢\006\004\b\016\020\017J\006\020\035\032\0020\000J\t\020\036\032\0020\003HÆ\003J\t\020\037\032\0020\005HÆ\003J\017\020 \032\b\022\004\022\0020\b0\007HÆ\003J\t\020!\032\0020\nHÆ\003J\017\020\"\032\b\022\004\022\0020\r0\fHÆ\003JG\020#\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\fHÆ\001J\023\020$\032\0020\0332\b\020%\032\004\030\0010\001HÖ\003J\t\020&\032\0020'HÖ\001J\t\020(\032\0020)HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\024\020\025R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\026\020\027R\027\020\013\032\b\022\004\022\0020\r0\f¢\006\b\n\000\032\004\b\030\020\031R\021\020\032\032\0020\0338F¢\006\006\032\004\b\032\020\034¨\006*"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;", "", "taskChainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "task", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;", "steps", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;", "terminalState", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;", "finishedSignal", "Lkotlinx/coroutines/CompletableDeferred;", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lkotlinx/collections/immutable/PersistentList;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;Lkotlinx/coroutines/CompletableDeferred;)V", "getTaskChainId", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "getTask", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;", "getSteps", "()Lkotlinx/collections/immutable/PersistentList;", "getTerminalState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;", "getFinishedSignal", "()Lkotlinx/coroutines/CompletableDeferred;", "isDeclined", "", "()Z", "withDeclined", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "ej-core"})
/*    */ public final class LiveTaskSnapshot { @NotNull
/*    */   private final TaskChainId taskChainId;
/*    */   @NotNull
/*    */   private final TaskEntity task;
/*    */   @NotNull
/*    */   private final PersistentList<StepEntity> steps;
/*    */   @NotNull
/*    */   private final TerminalState terminalState;
/*    */   @NotNull
/*    */   private final CompletableDeferred<Unit> finishedSignal;
/*    */   
/* 13 */   public LiveTaskSnapshot(@NotNull TaskChainId taskChainId, @NotNull TaskEntity task, @NotNull PersistentList<StepEntity> steps, @NotNull TerminalState terminalState, @NotNull CompletableDeferred<Unit> finishedSignal) { this.taskChainId = taskChainId;
/* 14 */     this.task = task;
/* 15 */     this.steps = steps;
/* 16 */     this.terminalState = terminalState;
/* 17 */     this.finishedSignal = finishedSignal; } @NotNull public final TaskChainId getTaskChainId() { return this.taskChainId; } @NotNull public final TaskEntity getTask() { return this.task; } @NotNull public final CompletableDeferred<Unit> getFinishedSignal() { return this.finishedSignal; }
/*    */   @NotNull public final PersistentList<StepEntity> getSteps() { return this.steps; }
/* 19 */   @NotNull public final TerminalState getTerminalState() { return this.terminalState; } public final boolean isDeclined() { return this.task.isDeclined(); }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final LiveTaskSnapshot withDeclined() {
/* 25 */     TaskEntity declinedTask = TaskEntity.copy$default(this.task, null, null, null, null, null, null, null, true, null, null, null, null, 3967, null);
/* 26 */     return this.task.isDeclined() ? this : copy$default(this, null, declinedTask, null, null, null, 29, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskChainId component1() {
/*    */     return this.taskChainId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskEntity component2() {
/*    */     return this.task;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PersistentList<StepEntity> component3() {
/*    */     return this.steps;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TerminalState component4() {
/*    */     return this.terminalState;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CompletableDeferred<Unit> component5() {
/*    */     return this.finishedSignal;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LiveTaskSnapshot copy(@NotNull TaskChainId taskChainId, @NotNull TaskEntity task, @NotNull PersistentList<StepEntity> steps, @NotNull TerminalState terminalState, @NotNull CompletableDeferred<Unit> finishedSignal) {
/*    */     Intrinsics.checkNotNullParameter(taskChainId, "taskChainId");
/*    */     Intrinsics.checkNotNullParameter(task, "task");
/*    */     Intrinsics.checkNotNullParameter(steps, "steps");
/*    */     Intrinsics.checkNotNullParameter(terminalState, "terminalState");
/*    */     Intrinsics.checkNotNullParameter(finishedSignal, "finishedSignal");
/*    */     return new LiveTaskSnapshot(taskChainId, task, steps, terminalState, finishedSignal);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LiveTaskSnapshot(taskChainId=" + this.taskChainId + ", task=" + this.task + ", steps=" + this.steps + ", terminalState=" + this.terminalState + ", finishedSignal=" + this.finishedSignal + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.taskChainId.hashCode();
/*    */     result = result * 31 + this.task.hashCode();
/*    */     result = result * 31 + this.steps.hashCode();
/*    */     result = result * 31 + this.terminalState.hashCode();
/*    */     return result * 31 + this.finishedSignal.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LiveTaskSnapshot))
/*    */       return false; 
/*    */     LiveTaskSnapshot liveTaskSnapshot = (LiveTaskSnapshot)other;
/*    */     return !Intrinsics.areEqual(this.taskChainId, liveTaskSnapshot.taskChainId) ? false : (!Intrinsics.areEqual(this.task, liveTaskSnapshot.task) ? false : (!Intrinsics.areEqual(this.steps, liveTaskSnapshot.steps) ? false : (!Intrinsics.areEqual(this.terminalState, liveTaskSnapshot.terminalState) ? false : (!!Intrinsics.areEqual(this.finishedSignal, liveTaskSnapshot.finishedSignal)))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\LiveTaskSnapshot.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */