/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.TerminalFocusModel;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionController$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel$TerminalFocusListener;", "promptFocused", "", "ej-core"})
/*    */ public final class null
/*    */   implements TerminalFocusModel.TerminalFocusListener
/*    */ {
/*    */   public void activeStateChanged(boolean isActive) {
/* 38 */     TerminalFocusModel.TerminalFocusListener.DefaultImpls.activeStateChanged(this, isActive);
/*    */   } public void promptFocused() {
/* 40 */     TerminalSelectionController.this.clearSelection();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalSelectionController$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */