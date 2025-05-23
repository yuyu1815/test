/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\0052\f\020\007\032\b\022\004\022\0020\0060\005H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$3", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$TerminalSelectionListener;", "selectionChanged", "", "oldSelection", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "newSelection", "ej-core"})
/*    */ public final class null
/*    */   implements TerminalSelectionModel.TerminalSelectionListener
/*    */ {
/*    */   public void hoverChanged(CommandBlock oldHovered, CommandBlock newHovered) {
/* 76 */     TerminalSelectionModel.TerminalSelectionListener.DefaultImpls.hoverChanged(this, oldHovered, newHovered);
/*    */   } public void selectionChanged(List oldSelection, List newSelection) {
/* 78 */     Intrinsics.checkNotNullParameter(oldSelection, "oldSelection"); Intrinsics.checkNotNullParameter(newSelection, "newSelection"); BlockTerminalSearchSession.Companion.setSearchInBlock(BlockTerminalSearchSession.access$getModel$p(BlockTerminalSearchSession.this), !newSelection.isEmpty());
/* 79 */     BlockTerminalSearchSession.access$getSearchResults$p(BlockTerminalSearchSession.this).clear();
/* 80 */     BlockTerminalSearchSession.access$updateResults(BlockTerminalSearchSession.this);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\BlockTerminalSearchSession$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */