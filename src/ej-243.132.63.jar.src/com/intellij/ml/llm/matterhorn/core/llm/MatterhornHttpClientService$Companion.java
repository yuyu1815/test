/*    */ package com.intellij.ml.llm.matterhorn.core.llm;
/*    */ 
/*    */ import com.intellij.codeWithMe.ClientId;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\0058F¢\006\006\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService$Companion;", "", "<init>", "()V", "instance", "Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService;", "getInstance", "()Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService;", "core-llm"})
/*    */ @SourceDebugExtension({"SMAP\nMatterhornHttpClientService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornHttpClientService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,49:1\n40#2,3:50\n*S KotlinDebug\n*F\n+ 1 MatterhornHttpClientService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService$Companion\n*L\n47#1:50,3\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final MatterhornHttpClientService getInstance() {
/* 47 */     int $i$f$service = 0;
/*    */ 
/*    */     
/* 50 */     Class<MatterhornHttpClientService> serviceClass$iv = MatterhornHttpClientService.class;
/* 51 */     if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) { ApplicationManager.getApplication().getService(serviceClass$iv);
/* 52 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')'); }
/*    */     
/*    */     return (MatterhornHttpClientService)ApplicationManager.getApplication().getService(serviceClass$iv);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\MatterhornHttpClientService$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */