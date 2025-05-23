/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import com.intellij.codeWithMe.ClientId;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\007\032\0020\b2\006\020\t\032\0020\nR\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands$Companion;", "", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands$CommandsProvider;", "isProductSpecificAllowedCommand", "", "command", "", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nProductSpecificAllowedCommands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSpecificAllowedCommands.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,50:1\n40#2,3:51\n*S KotlinDebug\n*F\n+ 1 ProductSpecificAllowedCommands.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands$Companion\n*L\n48#1:51,3\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   public final boolean isProductSpecificAllowedCommand(@NotNull String command) {
/* 48 */     Intrinsics.checkNotNullParameter(command, "command"); int $i$f$service = 0;
/*    */ 
/*    */     
/* 51 */     Class<ProductSpecificAllowedCommands> serviceClass$iv = ProductSpecificAllowedCommands.class;
/* 52 */     if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) { ApplicationManager.getApplication().getService(serviceClass$iv);
/* 53 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')'); }
/*    */     
/*    */     ProductSpecificAllowedCommands.access$getRegex$p((ProductSpecificAllowedCommands)ApplicationManager.getApplication().getService(serviceClass$iv));
/*    */     return (ProductSpecificAllowedCommands.access$getRegex$p((ProductSpecificAllowedCommands)ApplicationManager.getApplication().getService(serviceClass$iv)) != null) ? ((ProductSpecificAllowedCommands.access$getRegex$p((ProductSpecificAllowedCommands)ApplicationManager.getApplication().getService(serviceClass$iv)).matches(command) == true)) : false;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\ProductSpecificAllowedCommands$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */