/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.components.ServicesKt;
/*     */ import com.intellij.util.ApplicationKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingService$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingService;", "core"})
/*     */ @SourceDebugExtension({"SMAP\nRootExecutionContextFileLoggingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootExecutionContextFileLoggingService.kt\ncom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingService$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,106:1\n31#2,2:107\n*S KotlinDebug\n*F\n+ 1 RootExecutionContextFileLoggingService.kt\ncom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingService$Companion\n*L\n60#1:107,2\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final RootExecutionContextFileLoggingService getInstance() {
/*  60 */     ComponentManager $this$service$iv = (ComponentManager)ApplicationKt.getApplication(); int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 107 */     Class<RootExecutionContextFileLoggingService> serviceClass$iv = RootExecutionContextFileLoggingService.class;
/* 108 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return (RootExecutionContextFileLoggingService)$this$service$iv.getService(serviceClass$iv);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\RootExecutionContextFileLoggingService$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */