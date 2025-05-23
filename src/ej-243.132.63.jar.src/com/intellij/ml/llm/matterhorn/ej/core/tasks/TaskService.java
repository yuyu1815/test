/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\bf\030\000 \0272\0020\001:\002\027\030J(\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\tH¦@¢\006\002\020\nJ\026\020\013\032\0020\f2\006\020\004\032\0020\005H¦@¢\006\002\020\rJ \020\016\032\0020\0172\006\020\004\032\0020\0052\b\020\020\032\004\030\0010\003H¦@¢\006\002\020\021J\026\020\022\032\0020\f2\006\020\004\032\0020\005H¦@¢\006\002\020\rJ\026\020\023\032\0020\f2\006\020\004\032\0020\005H¦@¢\006\002\020\rJ\026\020\024\032\0020\0252\006\020\026\032\0020\005H¦@¢\006\002\020\r¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;", "", "start", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;", "previousTasksInfo", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "declineStartingFrom", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus;", "startingFrom", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "done", "continueTask", "observeTaskChain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;", "taskChainId", "Companion", "DeclineStatus", "ej-core"})
/*    */ public interface TaskService { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE; @Nullable
/*    */   Object start(@NotNull TaskChainId paramTaskChainId, @NotNull ExplicitTaskContext paramExplicitTaskContext, @Nullable PreviousTasksInfo paramPreviousTasksInfo, @NotNull Continuation<? super TaskId> paramContinuation); @Nullable
/*    */   Object stop(@NotNull TaskChainId paramTaskChainId, @NotNull Continuation<? super Unit> paramContinuation); @Nullable
/*    */   Object declineStartingFrom(@NotNull TaskChainId paramTaskChainId, @Nullable TaskId paramTaskId, @NotNull Continuation<? super DeclineStatus> paramContinuation);
/*    */   @Nullable
/*    */   Object done(@NotNull TaskChainId paramTaskChainId, @NotNull Continuation<? super Unit> paramContinuation);
/*    */   @Nullable
/*    */   Object continueTask(@NotNull TaskChainId paramTaskChainId, @NotNull Continuation<? super Unit> paramContinuation);
/*    */   @Nullable
/*    */   Object observeTaskChain(@NotNull TaskChainId paramTaskChainId, @NotNull Continuation<? super LiveTaskChain> paramContinuation);
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007R\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;", "project", "Lcom/intellij/openapi/project/Project;", "TOPIC", "Lcom/intellij/util/messages/Topic;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainListener;", "getTOPIC", "()Lcom/intellij/util/messages/Topic;", "ej-core"})
/*    */   @SourceDebugExtension({"SMAP\nTaskService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskService.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,95:1\n31#2,2:96\n*S KotlinDebug\n*F\n+ 1 TaskService.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$Companion\n*L\n17#1:96,2\n*E\n"})
/*    */   public static final class Companion { @NotNull
/*    */     public final TaskService getInstance(@NotNull Project project) {
/* 17 */       Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 96 */       Class<TaskService> serviceClass$iv = TaskService.class;
/* 97 */       if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return (TaskService)$this$service$iv.getService(serviceClass$iv);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     private static final Topic<TaskChainListener> TOPIC = Topic.create("matterhorn.task.chain.listener", TaskChainListener.class);
/*    */     
/*    */     @NotNull
/*    */     public final Topic<TaskChainListener> getTOPIC() {
/*    */       return TOPIC;
/*    */     }
/*    */     
/*    */     static {
/*    */       Intrinsics.checkNotNullExpressionValue(Topic.create("matterhorn.task.chain.listener", TaskChainListener.class), "create(...)");
/*    */     } }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus;", "", "<init>", "(Ljava/lang/String;I)V", "DONE", "NOTHING_LEFT", "ej-core"})
/*    */   public enum DeclineStatus {
/*    */     DONE, NOTHING_LEFT;
/*    */     
/*    */     @NotNull
/*    */     public static EnumEntries<DeclineStatus> getEntries() {
/*    */       return $ENTRIES;
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\TaskService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */