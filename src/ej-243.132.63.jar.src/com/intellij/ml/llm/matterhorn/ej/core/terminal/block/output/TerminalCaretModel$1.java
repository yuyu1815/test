/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.TerminalModel;
/*    */ import com.jediterm.terminal.CursorShape;
/*    */ import com.jediterm.terminal.emulator.mouse.MouseFormat;
/*    */ import com.jediterm.terminal.emulator.mouse.MouseMode;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\005H\026J\020\020\007\032\0020\0032\006\020\b\032\0020\tH\026J\022\020\n\032\0020\0032\b\020\013\032\004\030\0010\fH\026¨\006\r"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$CursorListener;", "onPositionChanged", "", "cursorX", "", "cursorY", "onVisibilityChanged", "visible", "", "onShapeChanged", "shape", "Lcom/jediterm/terminal/CursorShape;", "ej-core"})
/*    */ public final class null
/*    */   implements TerminalModel.CursorListener
/*    */ {
/*    */   public void onMouseModeChanged(MouseMode mode) {
/* 37 */     TerminalModel.CursorListener.DefaultImpls.onMouseModeChanged(this, mode); } public void onMouseFormatChanged(MouseFormat format) { TerminalModel.CursorListener.DefaultImpls.onMouseFormatChanged(this, format); }
/*    */    public void onPositionChanged(int cursorX, int cursorY) {
/* 39 */     TerminalCaretModel.access$scheduleUpdate(TerminalCaretModel.this);
/*    */   }
/*    */   
/*    */   public void onVisibilityChanged(boolean visible) {
/* 43 */     TerminalCaretModel.access$scheduleUpdate(TerminalCaretModel.this);
/*    */   }
/*    */   
/*    */   public void onShapeChanged(CursorShape shape) {
/* 47 */     TerminalCaretModel.access$scheduleUpdate(TerminalCaretModel.this);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalCaretModel$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */