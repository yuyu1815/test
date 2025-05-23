/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks;
/*    */ 
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.components.ServicesKt;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.util.messages.Topic;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007R\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;", "project", "Lcom/intellij/openapi/project/Project;", "TOPIC", "Lcom/intellij/util/messages/Topic;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainListener;", "getTOPIC", "()Lcom/intellij/util/messages/Topic;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nTaskService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskService.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,95:1\n31#2,2:96\n*S KotlinDebug\n*F\n+ 1 TaskService.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$Companion\n*L\n17#1:96,2\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final TaskService getInstance(@NotNull Project project) {
/* 17 */     Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
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
/* 96 */     Class<TaskService> serviceClass$iv = TaskService.class;
/* 97 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return (TaskService)$this$service$iv.getService(serviceClass$iv);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final Topic<TaskChainListener> TOPIC = Topic.create("matterhorn.task.chain.listener", TaskChainListener.class);
/*    */   
/*    */   @NotNull
/*    */   public final Topic<TaskChainListener> getTOPIC() {
/*    */     return TOPIC;
/*    */   }
/*    */   
/*    */   static {
/*    */     Intrinsics.checkNotNullExpressionValue(Topic.create("matterhorn.task.chain.listener", TaskChainListener.class), "create(...)");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\TaskService$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */