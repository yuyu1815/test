/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskChain;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskService;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.ExplicitTaskContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.PreviousTasksInfo;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.util.messages.Topic;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\b\007\030\000 #2\0020\0012\0020\002:\001#B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J(\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\0222\b\020\023\032\004\030\0010\024H@¢\006\002\020\025J\026\020\026\032\0020\0272\006\020\017\032\0020\020H@¢\006\002\020\030J \020\031\032\0020\0322\006\020\017\032\0020\0202\b\020\033\032\004\030\0010\016H@¢\006\002\020\034J\026\020\035\032\0020\0272\006\020\017\032\0020\020H@¢\006\002\020\030J\026\020\036\032\0020\0372\006\020 \032\0020\020H@¢\006\002\020\030J\026\020!\032\0020\0272\006\020\017\032\0020\020H@¢\006\002\020\030J\b\020\"\032\0020\027H\026R\016\020\003\032\0020\004X\004¢\006\002\n\000R\033\020\007\032\0020\b8BX\002¢\006\f\n\004\b\013\020\f\032\004\b\t\020\n¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;", "Lcom/intellij/openapi/Disposable;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "delegate", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;", "getDelegate", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;", "delegate$delegate", "Lkotlin/Lazy;", "start", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;", "previousTasksInfo", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "declineStartingFrom", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus;", "startingFrom", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "done", "observeTaskChain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;", "taskChainId", "continueTask", "dispose", "Companion", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class TaskServiceImpl implements TaskService, Disposable {
/* 22 */   public TaskServiceImpl(@NotNull Project project) { this.project = project;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 27 */     this.delegate$delegate = LazyKt.lazy(this::delegate_delegate$lambda$0); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceImpl$Companion;", "", "<init>", "()V", "TOPIC", "Lcom/intellij/util/messages/Topic;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskListener;", "getTOPIC", "()Lcom/intellij/util/messages/Topic;", "ej-ui"}) public static final class Companion { private Companion() {} @NotNull public final Topic<TaskListener> getTOPIC() { return TaskServiceImpl.TOPIC; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Project project; private final TaskServiceInternal getDelegate() { Lazy lazy = this.delegate$delegate; return (TaskServiceInternal)lazy.getValue(); } @NotNull private final Lazy delegate$delegate; public static final int $stable = 8; @NotNull
/* 28 */   private static final Topic<TaskListener> TOPIC = new Topic(TaskListener.class); private static final TaskServiceInternal delegate_delegate$lambda$0(TaskServiceImpl this$0) { TaskLauncher launcher = Registry.Companion.is("matterhorn.debug.ui.mode") ? DebugTaskLauncher.INSTANCE : new AITaskLauncher();
/* 29 */     return new TaskServiceInternal(this$0.project, launcher, TaskStorage.Companion.getInstance(this$0.project)); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object start(@NotNull TaskChainId chainId, @NotNull ExplicitTaskContext context, @Nullable PreviousTasksInfo previousTasksInfo, @NotNull Continuation<? super TaskId> $completion) {
/* 37 */     return getDelegate().start(chainId, context, previousTasksInfo, $completion);
/*    */   }
/*    */   @Nullable
/*    */   public Object stop(@NotNull TaskChainId chainId, @NotNull Continuation<? super Unit> $completion) {
/* 41 */     if (getDelegate().stop(chainId, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return getDelegate().stop(chainId, $completion);  getDelegate().stop(chainId, $completion); return Unit.INSTANCE;
/*    */   }
/*    */   @Nullable
/*    */   public Object declineStartingFrom(@NotNull TaskChainId chainId, @Nullable TaskId startingFrom, @NotNull Continuation<? super TaskService.DeclineStatus> $completion) {
/* 45 */     return getDelegate().declineStartingFrom(chainId, startingFrom, $completion);
/*    */   }
/*    */   @Nullable
/*    */   public Object done(@NotNull TaskChainId chainId, @NotNull Continuation<? super Unit> $completion) {
/* 49 */     if (getDelegate().done(chainId, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return getDelegate().done(chainId, $completion);  getDelegate().done(chainId, $completion); return Unit.INSTANCE;
/*    */   }
/*    */   @Nullable
/*    */   public Object observeTaskChain(@NotNull TaskChainId taskChainId, @NotNull Continuation<? super LiveTaskChain> $completion) {
/* 53 */     return getDelegate().observeTaskChain(taskChainId, $completion);
/*    */   }
/*    */   @Nullable
/*    */   public Object continueTask(@NotNull TaskChainId chainId, @NotNull Continuation<? super Unit> $completion) {
/* 57 */     if (getDelegate().continueTask(chainId, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return getDelegate().continueTask(chainId, $completion);  getDelegate().continueTask(chainId, $completion); return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   public void dispose() {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\TaskServiceImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */