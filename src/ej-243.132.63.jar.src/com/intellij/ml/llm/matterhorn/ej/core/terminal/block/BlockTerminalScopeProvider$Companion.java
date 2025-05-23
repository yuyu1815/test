/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.components.ServicesKt;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalScopeProvider$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalScopeProvider;", "project", "Lcom/intellij/openapi/project/Project;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nBlockTerminalScopeProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalScopeProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalScopeProvider$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,22:1\n31#2,2:23\n*S KotlinDebug\n*F\n+ 1 BlockTerminalScopeProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalScopeProvider$Companion\n*L\n19#1:23,2\n*E\n"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final BlockTerminalScopeProvider getInstance(@NotNull Project project) {
/* 19 */     Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */     
/* 23 */     Class<BlockTerminalScopeProvider> serviceClass$iv = BlockTerminalScopeProvider.class;
/* 24 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return (BlockTerminalScopeProvider)$this$service$iv.getService(serviceClass$iv);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\BlockTerminalScopeProvider$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */