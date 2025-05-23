/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptController;
/*    */ import com.intellij.openapi.wm.IdeFocusManager;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController$PromptStateListener;", "promptVisibilityChanged", "", "visible", "", "ej-core"})
/*    */ public final class null
/*    */   implements TerminalPromptController.PromptStateListener
/*    */ {
/*    */   public void commandSearchRequested() {
/* 84 */     TerminalPromptController.PromptStateListener.DefaultImpls.commandSearchRequested(this); } public void commandHistoryStateChanged(boolean showing) { TerminalPromptController.PromptStateListener.DefaultImpls.commandHistoryStateChanged(this, showing); }
/*    */    public void promptVisibilityChanged(boolean visible) {
/* 86 */     boolean wasActive = BlockTerminalView.access$getFocusModel$p(BlockTerminalView.this).isActive();
/* 87 */     BlockTerminalView.this.getPromptView().getComponent().setVisible(visible);
/* 88 */     BlockTerminalView.this.getComponent().revalidate();
/* 89 */     if (wasActive)
/* 90 */       IdeFocusManager.getInstance(BlockTerminalView.access$getProject$p(BlockTerminalView.this)).requestFocus(BlockTerminalView.this.getPreferredFocusableComponent(), true); 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\BlockTerminalView$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */