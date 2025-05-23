/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\b`\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026J \020\007\032\0020\0032\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\fH\026J \020\r\032\0020\0032\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\fH\026J \020\016\032\0020\0032\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\fH\026J \020\017\032\0020\0032\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\fH\026J \020\020\032\0020\0032\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\021H\026¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventsHandler;", "", "keyTyped", "", "e", "Ljava/awt/event/KeyEvent;", "keyPressed", "mousePressed", "x", "", "y", "event", "Ljava/awt/event/MouseEvent;", "mouseReleased", "mouseMoved", "mouseDragged", "mouseWheelMoved", "Ljava/awt/event/MouseWheelEvent;", "ej-core"})
/*    */ public interface TerminalEventsHandler { void keyTyped(@NotNull KeyEvent paramKeyEvent); void keyPressed(@NotNull KeyEvent paramKeyEvent); void mousePressed(int paramInt1, int paramInt2, @NotNull MouseEvent paramMouseEvent);
/*    */   void mouseReleased(int paramInt1, int paramInt2, @NotNull MouseEvent paramMouseEvent);
/*    */   void mouseMoved(int paramInt1, int paramInt2, @NotNull MouseEvent paramMouseEvent);
/*    */   void mouseDragged(int paramInt1, int paramInt2, @NotNull MouseEvent paramMouseEvent);
/*    */   void mouseWheelMoved(int paramInt1, int paramInt2, @NotNull MouseWheelEvent paramMouseWheelEvent);
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*  9 */   public static final class DefaultImpls { public static void keyTyped(@NotNull TerminalEventsHandler $this, @NotNull KeyEvent e) { Intrinsics.checkNotNullParameter(e, "e"); } public static void keyPressed(@NotNull TerminalEventsHandler $this, @NotNull KeyEvent e) {
/* 10 */       Intrinsics.checkNotNullParameter(e, "e");
/*    */     }
/* 12 */     public static void mousePressed(@NotNull TerminalEventsHandler $this, int x, int y, @NotNull MouseEvent event) { Intrinsics.checkNotNullParameter(event, "event"); }
/* 13 */     public static void mouseReleased(@NotNull TerminalEventsHandler $this, int x, int y, @NotNull MouseEvent event) { Intrinsics.checkNotNullParameter(event, "event"); }
/* 14 */     public static void mouseMoved(@NotNull TerminalEventsHandler $this, int x, int y, @NotNull MouseEvent event) { Intrinsics.checkNotNullParameter(event, "event"); }
/* 15 */     public static void mouseDragged(@NotNull TerminalEventsHandler $this, int x, int y, @NotNull MouseEvent event) { Intrinsics.checkNotNullParameter(event, "event"); } public static void mouseWheelMoved(@NotNull TerminalEventsHandler $this, int x, int y, @NotNull MouseWheelEvent event) {
/* 16 */       Intrinsics.checkNotNullParameter(event, "event");
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalEventsHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */