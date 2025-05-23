/*     */ package com.intellij.ml.llm.matterhorn.ej.core.tasks;
/*     */ 
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.components.ServicesKt;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainService$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainService;", "project", "Lcom/intellij/openapi/project/Project;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nRecentTaskChainServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentTaskChainServiceImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainService$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,181:1\n31#2,2:182\n*S KotlinDebug\n*F\n+ 1 RecentTaskChainServiceImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainService$Companion\n*L\n22#1:182,2\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   @NotNull
/*     */   public final RecentTaskChainService getInstance(@NotNull Project project) {
/*  22 */     Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     Class<RecentTaskChainService> serviceClass$iv = RecentTaskChainService.class;
/* 183 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return (RecentTaskChainService)$this$service$iv.getService(serviceClass$iv);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\RecentTaskChainService$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */