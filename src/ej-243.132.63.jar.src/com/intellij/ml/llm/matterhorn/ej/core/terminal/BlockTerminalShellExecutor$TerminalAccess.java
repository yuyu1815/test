/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.BlockTerminalView;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$TerminalAccess;", "", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "view", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;)V", "getSession", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "getView", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ej-core"})
/*    */ final class TerminalAccess
/*    */ {
/*    */   @NotNull
/*    */   private final BlockTerminalSession session;
/*    */   @NotNull
/*    */   private final BlockTerminalView view;
/*    */   
/*    */   public TerminalAccess(@NotNull BlockTerminalSession session, @NotNull BlockTerminalView view) {
/* 56 */     this.session = session; this.view = view; } @NotNull public final BlockTerminalSession getSession() { return this.session; } @NotNull public final BlockTerminalView getView() { return this.view; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final BlockTerminalSession component1() {
/*    */     return this.session;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final BlockTerminalView component2() {
/*    */     return this.view;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TerminalAccess copy(@NotNull BlockTerminalSession session, @NotNull BlockTerminalView view) {
/*    */     Intrinsics.checkNotNullParameter(session, "session");
/*    */     Intrinsics.checkNotNullParameter(view, "view");
/*    */     return new TerminalAccess(session, view);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TerminalAccess(session=" + this.session + ", view=" + this.view + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.session.hashCode();
/*    */     return result * 31 + this.view.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TerminalAccess))
/*    */       return false; 
/*    */     TerminalAccess terminalAccess = (TerminalAccess)other;
/*    */     return !Intrinsics.areEqual(this.session, terminalAccess.session) ? false : (!!Intrinsics.areEqual(this.view, terminalAccess.view));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\BlockTerminalShellExecutor$TerminalAccess.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */