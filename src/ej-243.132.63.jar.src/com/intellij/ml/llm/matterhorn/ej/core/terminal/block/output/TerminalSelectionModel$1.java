/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelListener;", "blockRemoved", "", "block", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "ej-core"})
/*    */ public final class null
/*    */   implements TerminalOutputModelListener
/*    */ {
/*    */   public void blockInfoUpdated(CommandBlock block, CommandBlockInfo newInfo) {
/* 31 */     TerminalOutputModelListener.DefaultImpls.blockInfoUpdated(this, block, newInfo); } public void blockFinalized(CommandBlock block) { TerminalOutputModelListener.DefaultImpls.blockFinalized(this, block); } public void blockCreated(CommandBlock block) { TerminalOutputModelListener.DefaultImpls.blockCreated(this, block); }
/*    */    public void blockRemoved(CommandBlock block) {
/* 33 */     Intrinsics.checkNotNullParameter(block, "block"); TerminalSelectionModel.this.setSelectedBlocks(CollectionsKt.minus(TerminalSelectionModel.this.getSelectedBlocks(), block));
/* 34 */     if (TerminalSelectionModel.this.getHoveredBlock() == block)
/* 35 */       TerminalSelectionModel.this.setHoveredBlock(null); 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalSelectionModel$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */