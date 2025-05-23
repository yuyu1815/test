/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import java.awt.event.MouseAdapter;
/*    */ import java.awt.event.MouseEvent;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport$install$mouseListener$1", "Ljava/awt/event/MouseAdapter;", "mousePressed", "", "e", "Ljava/awt/event/MouseEvent;", "ej-core"})
/*    */ public final class TerminalOutputEditorInputMethodSupport$install$mouseListener$1
/*    */   extends MouseAdapter
/*    */ {
/*    */   public void mousePressed(MouseEvent e) {
/* 43 */     if (TerminalOutputEditorInputMethodSupport.access$getInlay$p(TerminalOutputEditorInputMethodSupport.this) != null && !TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this).isDisposed())
/* 44 */       if (TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this).getContentComponent().getInputContext() != null) { TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this).getContentComponent().getInputContext().endComposition(); } else { TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this).getContentComponent().getInputContext(); }
/*    */        
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputEditorInputMethodSupport$install$mouseListener$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */