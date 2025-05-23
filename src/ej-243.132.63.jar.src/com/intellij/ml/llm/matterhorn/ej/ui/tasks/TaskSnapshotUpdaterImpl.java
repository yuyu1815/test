/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.HumanInLoopRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskSnapshot;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.ProgressEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskChainState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.StepEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskStorage;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.collections.immutable.PersistentList;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000b\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\b\002\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J+\020\f\032\0020\r2!\020\016\032\035\022\023\022\0210\020¢\006\f\b\021\022\b\b\022\022\004\b\b(\023\022\004\022\0020\0200\017H\026J\026\020\024\032\0020\r2\006\020\022\032\0020\025H@¢\006\002\020\026J\026\020\027\032\0020\r2\006\020\030\032\0020\031H@¢\006\002\020\032J\016\020\033\032\0020\rH@¢\006\002\020\034J\030\020\035\032\0020\r2\b\020\036\032\004\030\0010\025H@¢\006\002\020\026J\030\020\037\032\0020\r2\b\020 \032\004\030\0010!H@¢\006\002\020\"J\030\020#\032\0020\r2\b\020$\032\004\030\0010%H@¢\006\002\020&J\030\020'\032\0020\r2\b\020(\032\004\030\0010)H@¢\006\002\020*R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\024\020+\032\0020\0208VX\004¢\006\006\032\004\b,\020-¨\006."}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdaterImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;", "taskChainSnapshot", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "storage", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;Lkotlinx/coroutines/CoroutineScope;)V", "update", "", "updater", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;", "Lkotlin/ParameterName;", "name", "newValue", "tryUpdateName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateState", "newState", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateError", "errorText", "updateHumanInLoopRequest", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCurrentActionJob", "job", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProgress", "progress", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "getValue", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nTaskServiceInternal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskServiceInternal.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdaterImpl\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,525:1\n226#2,5:526\n*S KotlinDebug\n*F\n+ 1 TaskServiceInternal.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdaterImpl\n*L\n345#1:526,5\n*E\n"})
/*     */ final class TaskSnapshotUpdaterImpl
/*     */   implements TaskSnapshotUpdater
/*     */ {
/*     */   @NotNull
/*     */   private final LiveTaskChainImpl taskChainSnapshot;
/*     */   @NotNull
/*     */   private final TaskChainId chainId;
/*     */   @NotNull
/*     */   private final TaskStorage storage;
/*     */   @NotNull
/*     */   private final CoroutineScope scope;
/*     */   
/*     */   public TaskSnapshotUpdaterImpl(@NotNull LiveTaskChainImpl taskChainSnapshot, @NotNull TaskChainId chainId, @NotNull TaskStorage storage, @NotNull CoroutineScope scope) {
/* 339 */     this.taskChainSnapshot = taskChainSnapshot;
/* 340 */     this.chainId = chainId;
/* 341 */     this.storage = storage;
/* 342 */     this.scope = scope;
/*     */   }
/*     */   public void update(@NotNull Function1 updater) {
/* 345 */     Intrinsics.checkNotNullParameter(updater, "updater"); MutableStateFlow<PersistentList<LiveTaskSnapshot>> $this$update$iv = this.taskChainSnapshot.getTasks(); int $i$f$update = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     while (true) {
/* 527 */       Object prevValue$iv = $this$update$iv.getValue();
/* 528 */       PersistentList it = (PersistentList)prevValue$iv; int $i$a$-update-TaskSnapshotUpdaterImpl$update$1 = 0; LiveTaskSnapshot oldLastTask = (LiveTaskSnapshot)CollectionsKt.last((List)it); LiveTaskSnapshot newLastTask = (LiveTaskSnapshot)updater.invoke(oldLastTask); StepEntity firstStep = (StepEntity)CollectionsKt.firstOrNull((List)newLastTask.getSteps()); if (firstStep != null && !((firstStep.getType() == StepType.Prompt) ? 1 : 0)) { int $i$a$-require-TaskSnapshotUpdaterImpl$update$1$1 = 0; String str = "First step must always be prompt"; throw new IllegalArgumentException(str.toString()); }  int i; Iterator<StepEntity> iterator; for (iterator = ((Iterable)newLastTask.getSteps()).iterator(), i = 0; iterator.hasNext(); ) { int index = i; i++; StepEntity newStep = iterator.next(); StepEntity oldStep = (StepEntity)CollectionsKt.getOrNull((List)oldLastTask.getSteps(), index); if (!Intrinsics.areEqual(oldStep, newStep)) BuildersKt.launch$default(this.scope, (CoroutineContext)TaskStorage.Companion.getDispatcher(), null, new TaskSnapshotUpdaterImpl$update$1$2(index, newLastTask, newStep, null), 2, null);  }  if (!Intrinsics.areEqual(oldLastTask.getTask(), newLastTask.getTask())) BuildersKt.launch$default(this.scope, (CoroutineContext)TaskStorage.Companion.getDispatcher(), null, new TaskSnapshotUpdaterImpl$update$1$3(newLastTask, null), 2, null);  Object nextValue$iv = it.set(CollectionsKt.getLastIndex((List)it), newLastTask);
/* 529 */       if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv))
/*     */         return; 
/*     */     } 
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {359}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskSnapshotUpdaterImpl$update$1$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class TaskSnapshotUpdaterImpl$update$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskSnapshotUpdaterImpl$update$1$2(int $index, LiveTaskSnapshot $newLastTask, StepEntity $newStep, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (TaskSnapshotUpdaterImpl.this.storage.saveStep(TaskSnapshotUpdaterImpl.this.chainId, this.$index, this.$newLastTask.getTask().getId(), this.$newStep, (Continuation)this) == object)
/*     */             return object; 
/*     */           TaskSnapshotUpdaterImpl.this.storage.saveStep(TaskSnapshotUpdaterImpl.this.chainId, this.$index, this.$newLastTask.getTask().getId(), this.$newStep, (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskSnapshotUpdaterImpl$update$1$2> $completion) {
/*     */       return (Continuation<Unit>)new TaskSnapshotUpdaterImpl$update$1$2(this.$index, this.$newLastTask, this.$newStep, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((TaskSnapshotUpdaterImpl$update$1$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {366}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskSnapshotUpdaterImpl$update$1$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class TaskSnapshotUpdaterImpl$update$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskSnapshotUpdaterImpl$update$1$3(LiveTaskSnapshot $newLastTask, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (TaskSnapshotUpdaterImpl.this.storage.saveTask(TaskSnapshotUpdaterImpl.this.chainId, this.$newLastTask.getTask(), (Continuation)this) == object)
/*     */             return object; 
/*     */           TaskSnapshotUpdaterImpl.this.storage.saveTask(TaskSnapshotUpdaterImpl.this.chainId, this.$newLastTask.getTask(), (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskSnapshotUpdaterImpl$update$1$3> $completion) {
/*     */       return (Continuation<Unit>)new TaskSnapshotUpdaterImpl$update$1$3(this.$newLastTask, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((TaskSnapshotUpdaterImpl$update$1$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object tryUpdateName(@NotNull String name, @NotNull Continuation<? super Unit> $completion) {
/*     */     String oldName = ((TaskChainEntity)this.taskChainSnapshot.getChain().getValue()).getName();
/*     */     if (oldName == null) {
/*     */       if (this.taskChainSnapshot.updateName(name, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */         return this.taskChainSnapshot.updateName(name, $completion); 
/*     */       this.taskChainSnapshot.updateName(name, $completion);
/*     */       return Unit.INSTANCE;
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object updateState(@NotNull TaskChainState newState, @NotNull Continuation<? super Unit> $completion) {
/*     */     if (this.taskChainSnapshot.updateState(newState, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return this.taskChainSnapshot.updateState(newState, $completion); 
/*     */     this.taskChainSnapshot.updateState(newState, $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object complete(@NotNull Continuation<? super Unit> $completion) {
/*     */     if (this.taskChainSnapshot.complete($completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return this.taskChainSnapshot.complete($completion); 
/*     */     this.taskChainSnapshot.complete($completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object updateError(@Nullable String errorText, @NotNull Continuation<? super Unit> $completion) {
/*     */     if (this.taskChainSnapshot.updateErrorText(errorText, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return this.taskChainSnapshot.updateErrorText(errorText, $completion); 
/*     */     this.taskChainSnapshot.updateErrorText(errorText, $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object updateHumanInLoopRequest(@Nullable HumanInLoopRequest request, @NotNull Continuation $completion) {
/*     */     this.taskChainSnapshot.getHumanInLoopRequest().setValue(request);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object updateCurrentActionJob(@Nullable Job job, @NotNull Continuation $completion) {
/*     */     this.taskChainSnapshot.getCurrentJob().setValue(job);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object updateProgress(@Nullable ProgressEntity progress, @NotNull Continuation $completion) {
/*     */     this.taskChainSnapshot.getProgress().setValue(progress);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public LiveTaskSnapshot getValue() {
/*     */     return (LiveTaskSnapshot)CollectionsKt.last((List)this.taskChainSnapshot.getTasks().getValue());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\TaskSnapshotUpdaterImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */