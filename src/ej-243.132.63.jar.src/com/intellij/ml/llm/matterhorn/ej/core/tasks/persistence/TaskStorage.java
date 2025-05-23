/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\006\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\t\bf\030\000 \"2\0020\001:\001\"J\036\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H¦@¢\006\002\020\bJ\034\020\t\032\b\022\004\022\0020\0130\n2\006\020\004\032\0020\005H¦@¢\006\002\020\fJ \020\r\032\004\030\0010\0072\006\020\004\032\0020\0052\006\020\016\032\0020\013H¦@¢\006\002\020\017J.\020\020\032\0020\0032\006\020\004\032\0020\0052\006\020\021\032\0020\0222\006\020\023\032\0020\0132\006\020\024\032\0020\025H¦@¢\006\002\020\026J$\020\027\032\b\022\004\022\0020\0250\n2\006\020\004\032\0020\0052\006\020\023\032\0020\013H¦@¢\006\002\020\017J\026\020\030\032\0020\0032\006\020\031\032\0020\032H¦@¢\006\002\020\033J\024\020\034\032\b\022\004\022\0020\0050\nH¦@¢\006\002\020\035J\030\020\036\032\004\030\0010\0322\006\020\037\032\0020\005H¦@¢\006\002\020\fJ\026\020 \032\0020\0032\006\020\037\032\0020\005H¦@¢\006\002\020\fJ\016\020!\032\0020\003H¦@¢\006\002\020\035¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;", "", "saveTask", "", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "task", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAllTaskIds", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTask", "id", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveStep", "index", "", "taskId", "step", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;ILcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAllSteps", "saveChain", "taskChain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAllChainIds", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadChain", "taskChainId", "removeTaskChain", "removeAllTaskChains", "Companion", "ej-core"}) public interface TaskStorage { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE; @Nullable
/*    */   Object saveTask(@NotNull TaskChainId paramTaskChainId, @NotNull TaskEntity paramTaskEntity, @NotNull Continuation<? super Unit> paramContinuation); @Nullable
/*    */   Object loadAllTaskIds(@NotNull TaskChainId paramTaskChainId, @NotNull Continuation<? super List<TaskId>> paramContinuation); @Nullable
/*    */   Object loadTask(@NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId, @NotNull Continuation<? super TaskEntity> paramContinuation); @Nullable
/*    */   Object saveStep(@NotNull TaskChainId paramTaskChainId, int paramInt, @NotNull TaskId paramTaskId, @NotNull StepEntity paramStepEntity, @NotNull Continuation<? super Unit> paramContinuation); @Nullable
/*    */   Object loadAllSteps(@NotNull TaskChainId paramTaskChainId, @NotNull TaskId paramTaskId, @NotNull Continuation<? super List<StepEntity>> paramContinuation); @Nullable
/*    */   Object saveChain(@NotNull TaskChainEntity paramTaskChainEntity, @NotNull Continuation<? super Unit> paramContinuation); @Nullable
/*    */   Object loadAllChainIds(@NotNull Continuation<? super List<TaskChainId>> paramContinuation); @Nullable
/*    */   Object loadChain(@NotNull TaskChainId paramTaskChainId, @NotNull Continuation<? super TaskChainEntity> paramContinuation); @Nullable
/*    */   Object removeTaskChain(@NotNull TaskChainId paramTaskChainId, @NotNull Continuation<? super Unit> paramContinuation); @Nullable
/*    */   Object removeAllTaskChains(@NotNull Continuation<? super Unit> paramContinuation); @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;", "project", "Lcom/intellij/openapi/project/Project;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "ej-core"})
/*    */   @SourceDebugExtension({"SMAP\nTaskStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskStorage.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,39:1\n31#2,2:40\n*S KotlinDebug\n*F\n+ 1 TaskStorage.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage$Companion\n*L\n15#1:40,2\n*E\n"})
/*    */   public static final class Companion { @NotNull
/* 15 */     public final TaskStorage getInstance(@NotNull Project project) { Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
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
/* 40 */       Class<TaskStorage> serviceClass$iv = TaskStorage.class;
/* 41 */       if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return (TaskStorage)$this$service$iv.getService(serviceClass$iv); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     private static final CoroutineDispatcher dispatcher = Dispatchers.getIO().limitedParallelism(1);
/*    */     
/*    */     @NotNull
/*    */     public final CoroutineDispatcher getDispatcher() {
/*    */       return dispatcher;
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskStorage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */