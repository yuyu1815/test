/*     */ package com.intellij.ml.llm.matterhorn.ej.core.tasks;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\004\bf\030\000 \r2\0020\001:\001\rJ\034\020\002\032\020\022\f\022\n\022\004\022\0020\005\030\0010\0040\003H¦@¢\006\002\020\006J\026\020\007\032\0020\b2\006\020\t\032\0020\nH¦@¢\006\002\020\013J\016\020\f\032\0020\bH¦@¢\006\002\020\006¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainService;", "", "getRecentTaskChains", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/collections/immutable/ImmutableCollection;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeTask", "", "taskChainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAllTasks", "Companion", "ej-core"})
/*     */ public interface RecentTaskChainService {
/*     */   @NotNull
/*     */   public static final Companion Companion = Companion.$$INSTANCE;
/*     */   
/*     */   @Nullable
/*     */   Object getRecentTaskChains(@NotNull Continuation<? super StateFlow<? extends ImmutableCollection<RecentTaskChain>>> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object removeTask(@NotNull TaskChainId paramTaskChainId, @NotNull Continuation<? super Unit> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object removeAllTasks(@NotNull Continuation<? super Unit> paramContinuation);
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainService$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainService;", "project", "Lcom/intellij/openapi/project/Project;", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nRecentTaskChainServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentTaskChainServiceImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainService$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,181:1\n31#2,2:182\n*S KotlinDebug\n*F\n+ 1 RecentTaskChainServiceImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainService$Companion\n*L\n22#1:182,2\n*E\n"})
/*     */   public static final class Companion {
/*     */     @NotNull
/*     */     public final RecentTaskChainService getInstance(@NotNull Project project) {
/*  22 */       Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 182 */       Class<RecentTaskChainService> serviceClass$iv = RecentTaskChainService.class;
/* 183 */       if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return (RecentTaskChainService)$this$service$iv.getService(serviceClass$iv);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\RecentTaskChainService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */