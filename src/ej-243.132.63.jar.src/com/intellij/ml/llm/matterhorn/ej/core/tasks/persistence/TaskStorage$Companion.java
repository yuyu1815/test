/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.CoroutineDispatcher;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;", "project", "Lcom/intellij/openapi/project/Project;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nTaskStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskStorage.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,39:1\n31#2,2:40\n*S KotlinDebug\n*F\n+ 1 TaskStorage.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage$Companion\n*L\n15#1:40,2\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final TaskStorage getInstance(@NotNull Project project) {
/* 15 */     Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
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
/* 40 */     Class<TaskStorage> serviceClass$iv = TaskStorage.class;
/* 41 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return (TaskStorage)$this$service$iv.getService(serviceClass$iv);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final CoroutineDispatcher dispatcher = Dispatchers.getIO().limitedParallelism(1);
/*    */   
/*    */   @NotNull
/*    */   public final CoroutineDispatcher getDispatcher() {
/*    */     return dispatcher;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskStorage$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */