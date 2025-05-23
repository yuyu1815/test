/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Service({Service.Level.PROJECT})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\b\001\030\000 \r2\0020\001:\001\rB\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\"\020\006\032\0020\0032\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\fR\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalScopeProvider;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "childScope", "name", "", "context", "Lkotlin/coroutines/CoroutineContext;", "supervisor", "", "Companion", "ej-core"})
/*    */ public final class BlockTerminalScopeProvider {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 13 */   public BlockTerminalScopeProvider(@NotNull CoroutineScope coroutineScope) { this.coroutineScope = coroutineScope; } @NotNull
/*    */   private final CoroutineScope coroutineScope; @NotNull
/* 15 */   public final CoroutineScope childScope(@NotNull String name, @NotNull CoroutineContext context, boolean supervisor) { Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(context, "context"); return CoroutineScopeKt.childScope(this.coroutineScope, name, context, supervisor); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalScopeProvider$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalScopeProvider;", "project", "Lcom/intellij/openapi/project/Project;", "ej-core"})
/*    */   @SourceDebugExtension({"SMAP\nBlockTerminalScopeProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalScopeProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalScopeProvider$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,22:1\n31#2,2:23\n*S KotlinDebug\n*F\n+ 1 BlockTerminalScopeProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalScopeProvider$Companion\n*L\n19#1:23,2\n*E\n"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/*    */     public final BlockTerminalScopeProvider getInstance(@NotNull Project project) {
/* 19 */       Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */       
/* 23 */       Class<BlockTerminalScopeProvider> serviceClass$iv = BlockTerminalScopeProvider.class;
/* 24 */       if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return (BlockTerminalScopeProvider)$this$service$iv.getService(serviceClass$iv);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\BlockTerminalScopeProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */