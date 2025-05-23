/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ import com.intellij.codeWithMe.ClientId;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmStatic;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\007¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalOptions$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalOptions;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nBlockTerminalOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalOptions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalOptions$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,64:1\n40#2,3:65\n*S KotlinDebug\n*F\n+ 1 BlockTerminalOptions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalOptions$Companion\n*L\n62#1:65,3\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public final BlockTerminalOptions getInstance() {
/* 62 */     int $i$f$service = 0;
/*    */ 
/*    */     
/* 65 */     Class<BlockTerminalOptions> serviceClass$iv = BlockTerminalOptions.class;
/* 66 */     if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) { ApplicationManager.getApplication().getService(serviceClass$iv);
/* 67 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')'); }
/*    */     
/*    */     return (BlockTerminalOptions)ApplicationManager.getApplication().getService(serviceClass$iv);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\BlockTerminalOptions$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */