/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ import com.jediterm.core.util.TermSize;
/*    */ import java.awt.event.ComponentAdapter;
/*    */ import java.awt.event.ComponentEvent;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/PlainTerminalView$1", "Ljava/awt/event/ComponentAdapter;", "componentResized", "", "e", "Ljava/awt/event/ComponentEvent;", "ej-core"})
/*    */ public final class null
/*    */   extends ComponentAdapter
/*    */ {
/*    */   public void componentResized(ComponentEvent e) {
/*    */     TermSize newSize;
/* 40 */     if (PlainTerminalView.this.getTerminalSize() == null) { PlainTerminalView.this.getTerminalSize(); return; }
/* 41 */      PlainTerminalView.access$getSession$p(PlainTerminalView.this).postResize(newSize);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\PlainTerminalView$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */