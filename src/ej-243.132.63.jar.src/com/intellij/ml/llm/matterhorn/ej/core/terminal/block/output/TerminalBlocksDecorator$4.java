/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.TerminalFocusModel;
/*     */ import com.intellij.util.concurrency.EdtScheduler;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$4", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel$TerminalFocusListener;", "activeStateChanged", "", "isActive", "", "ej-core"})
/*     */ public final class null
/*     */   implements TerminalFocusModel.TerminalFocusListener
/*     */ {
/*     */   public void promptFocused() {
/* 114 */     TerminalFocusModel.TerminalFocusListener.DefaultImpls.promptFocused(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void activeStateChanged(boolean isActive) {
/* 119 */     EdtScheduler.Companion.getInstance().schedule(150, TerminalBlocksDecorator.this::activeStateChanged$lambda$0); } private static final void activeStateChanged$lambda$0(TerminalBlocksDecorator this$0) {
/* 120 */     if (!TerminalBlocksDecorator.access$getEditor$p(TerminalBlocksDecorator.this).isDisposed())
/* 121 */       TerminalBlocksDecorator.access$updateSelectionDecorationState(TerminalBlocksDecorator.this, TerminalBlocksDecorator.access$getSelectionModel$p(TerminalBlocksDecorator.this).getSelectedBlocks()); 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalBlocksDecorator$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */