/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.TerminalModel;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.LogicalPosition;
/*     */ import com.intellij.openapi.editor.event.EditorMouseEvent;
/*     */ import com.intellij.openapi.editor.event.EditorMouseListener;
/*     */ import com.intellij.openapi.editor.event.EditorMouseMotionListener;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.ex.FocusChangeListener;
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import com.jediterm.terminal.emulator.mouse.MouseMode;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseWheelEvent;
/*     */ import java.awt.event.MouseWheelListener;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\032 \020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\000\0320\020\b\032\0020\0012\006\020\002\032\0020\0032\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\004\032\0020\0052\006\020\006\032\0020\007H\000¨\006\r"}, d2 = {"setupKeyEventDispatcher", "", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "eventsHandler", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventsHandler;", "disposable", "Lcom/intellij/openapi/Disposable;", "setupMouseListener", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;", "ej-core"})
/*     */ public final class TerminalEventDispatcherKt
/*     */ {
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\024¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcherKt$setupKeyEventDispatcher$eventDispatcher$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcher;", "handleKeyEvent", "", "e", "Ljava/awt/event/KeyEvent;", "ej-core"})
/*     */   public static final class TerminalEventDispatcherKt$setupKeyEventDispatcher$eventDispatcher$1
/*     */     extends TerminalEventDispatcher
/*     */   {
/*     */     TerminalEventDispatcherKt$setupKeyEventDispatcher$eventDispatcher$1(EditorEx $editor, Disposable $disposable, TerminalEventsHandler $eventsHandler) {
/*     */       super($editor, $disposable);
/*     */     }
/*     */     
/*     */     protected void handleKeyEvent(KeyEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       if (e.getID() == 400) {
/*     */         this.$eventsHandler.keyTyped(e);
/*     */       } else if (e.getID() == 401) {
/*     */         this.$eventsHandler.keyPressed(e);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcherKt$setupKeyEventDispatcher$1", "Lcom/intellij/openapi/editor/ex/FocusChangeListener;", "focusGained", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "focusLost", "ej-core"})
/*     */   public static final class TerminalEventDispatcherKt$setupKeyEventDispatcher$1
/*     */     implements FocusChangeListener
/*     */   {
/*     */     TerminalEventDispatcherKt$setupKeyEventDispatcher$1(TerminalEventDispatcher $eventDispatcher) {}
/*     */     
/*     */     public void focusGained(Editor editor) {
/*     */       Intrinsics.checkNotNullParameter(editor, "editor");
/*     */       List<AnAction> actionsToSkip = TerminalEventDispatcher.Companion.getActionsToSkip();
/*     */       this.$eventDispatcher.register(actionsToSkip);
/*     */     }
/*     */     
/*     */     public void focusLost(Editor editor) {
/*     */       Intrinsics.checkNotNullParameter(editor, "editor");
/*     */       this.$eventDispatcher.unregister();
/*     */     }
/*     */   }
/*     */   
/*     */   public static final void setupKeyEventDispatcher(@NotNull EditorEx editor, @NotNull TerminalEventsHandler eventsHandler, @NotNull Disposable disposable) {
/* 190 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(eventsHandler, "eventsHandler"); Intrinsics.checkNotNullParameter(disposable, "disposable"); TerminalEventDispatcher eventDispatcher = new TerminalEventDispatcherKt$setupKeyEventDispatcher$eventDispatcher$1(editor, disposable, eventsHandler);
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
/* 201 */     editor.addFocusListener(new TerminalEventDispatcherKt$setupKeyEventDispatcher$1(eventDispatcher), 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 210 */         disposable);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final boolean setupMouseListener$isRemoteMouseAction(TerminalModel $model, MouseEvent e) {
/* 219 */     return ($model.getMouseMode() != MouseMode.MOUSE_REPORTING_NONE && !e.isShiftDown());
/*     */   }
/*     */   
/* 222 */   private static final int setupMouseListener$historyLinesCount(TerminalModel $model) { return $model.getUseAlternateBuffer() ? 0 : $model.getHistoryLinesCount(); } public static final void setupMouseListener(@NotNull EditorEx editor, @NotNull JBTerminalSystemSettingsProviderBase settings, @NotNull TerminalModel model, @NotNull TerminalEventsHandler eventsHandler, @NotNull Disposable disposable) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'editor'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'settings'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc 'model'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_3
/*     */     //   19: ldc 'eventsHandler'
/*     */     //   21: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   24: aload #4
/*     */     //   26: ldc 'disposable'
/*     */     //   28: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   31: aload_0
/*     */     //   32: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcherKt$setupMouseListener$1
/*     */     //   35: dup
/*     */     //   36: aload_1
/*     */     //   37: aload_3
/*     */     //   38: aload_2
/*     */     //   39: invokespecial <init> : (Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventsHandler;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;)V
/*     */     //   42: checkcast com/intellij/openapi/editor/event/EditorMouseListener
/*     */     //   45: aload #4
/*     */     //   47: invokeinterface addEditorMouseListener : (Lcom/intellij/openapi/editor/event/EditorMouseListener;Lcom/intellij/openapi/Disposable;)V
/*     */     //   52: aload_0
/*     */     //   53: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcherKt$setupMouseListener$2
/*     */     //   56: dup
/*     */     //   57: aload_1
/*     */     //   58: aload_3
/*     */     //   59: aload_2
/*     */     //   60: invokespecial <init> : (Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventsHandler;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;)V
/*     */     //   63: checkcast com/intellij/openapi/editor/event/EditorMouseMotionListener
/*     */     //   66: aload #4
/*     */     //   68: invokeinterface addEditorMouseMotionListener : (Lcom/intellij/openapi/editor/event/EditorMouseMotionListener;Lcom/intellij/openapi/Disposable;)V
/*     */     //   73: aload_0
/*     */     //   74: aload_3
/*     */     //   75: aload_2
/*     */     //   76: <illegal opcode> mouseWheelMoved : (Lcom/intellij/openapi/editor/ex/EditorEx;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventsHandler;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;)Ljava/awt/event/MouseWheelListener;
/*     */     //   81: astore #5
/*     */     //   83: aload_0
/*     */     //   84: invokeinterface getScrollPane : ()Ljavax/swing/JScrollPane;
/*     */     //   89: aload #5
/*     */     //   91: invokevirtual addMouseWheelListener : (Ljava/awt/event/MouseWheelListener;)V
/*     */     //   94: aload #4
/*     */     //   96: aload_0
/*     */     //   97: aload #5
/*     */     //   99: <illegal opcode> dispose : (Lcom/intellij/openapi/editor/ex/EditorEx;Ljava/awt/event/MouseWheelListener;)Lcom/intellij/openapi/Disposable;
/*     */     //   104: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*     */     //   107: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #224	-> 31
/*     */     //   #238	-> 45
/*     */     //   #224	-> 47
/*     */     //   #240	-> 52
/*     */     //   #254	-> 66
/*     */     //   #240	-> 68
/*     */     //   #256	-> 73
/*     */     //   #260	-> 83
/*     */     //   #261	-> 94
/*     */     //   #264	-> 107
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   83	25	5	mouseWheelListener	Ljava/awt/event/MouseWheelListener;
/*     */     //   0	108	0	editor	Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   0	108	1	settings	Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;
/*     */     //   0	108	2	model	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;
/*     */     //   0	108	3	eventsHandler	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventsHandler;
/*     */     //   0	108	4	disposable	Lcom/intellij/openapi/Disposable;
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcherKt$setupMouseListener$1", "Lcom/intellij/openapi/editor/event/EditorMouseListener;", "mousePressed", "", "event", "Lcom/intellij/openapi/editor/event/EditorMouseEvent;", "mouseReleased", "ej-core"})
/*     */   public static final class TerminalEventDispatcherKt$setupMouseListener$1 implements EditorMouseListener { public void mousePressed(EditorMouseEvent event) {
/* 226 */       Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); if (this.$settings.enableMouseReporting() && TerminalEventDispatcherKt.setupMouseListener$isRemoteMouseAction(this.$model, event.getMouseEvent())) {
/* 227 */         Intrinsics.checkNotNullExpressionValue(event.getLogicalPosition(), "getLogicalPosition(...)"); LogicalPosition p = event.getLogicalPosition();
/* 228 */         Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); this.$eventsHandler.mousePressed(p.column, p.line + TerminalEventDispatcherKt.setupMouseListener$historyLinesCount(this.$model), event.getMouseEvent());
/*     */       } 
/*     */     }
/*     */     TerminalEventDispatcherKt$setupMouseListener$1(JBTerminalSystemSettingsProviderBase $settings, TerminalEventsHandler $eventsHandler, TerminalModel $model) {}
/*     */     public void mouseReleased(EditorMouseEvent event) {
/* 233 */       Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); if (this.$settings.enableMouseReporting() && TerminalEventDispatcherKt.setupMouseListener$isRemoteMouseAction(this.$model, event.getMouseEvent())) {
/* 234 */         Intrinsics.checkNotNullExpressionValue(event.getLogicalPosition(), "getLogicalPosition(...)"); LogicalPosition p = event.getLogicalPosition();
/* 235 */         Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); this.$eventsHandler.mouseReleased(p.column, p.line + TerminalEventDispatcherKt.setupMouseListener$historyLinesCount(this.$model), event.getMouseEvent());
/*     */       } 
/*     */     } }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcherKt$setupMouseListener$2", "Lcom/intellij/openapi/editor/event/EditorMouseMotionListener;", "mouseMoved", "", "event", "Lcom/intellij/openapi/editor/event/EditorMouseEvent;", "mouseDragged", "ej-core"})
/*     */   public static final class TerminalEventDispatcherKt$setupMouseListener$2 implements EditorMouseMotionListener { TerminalEventDispatcherKt$setupMouseListener$2(JBTerminalSystemSettingsProviderBase $settings, TerminalEventsHandler $eventsHandler, TerminalModel $model) {}
/*     */     
/*     */     public void mouseMoved(EditorMouseEvent event) {
/* 242 */       Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); if (this.$settings.enableMouseReporting() && TerminalEventDispatcherKt.setupMouseListener$isRemoteMouseAction(this.$model, event.getMouseEvent())) {
/* 243 */         Intrinsics.checkNotNullExpressionValue(event.getLogicalPosition(), "getLogicalPosition(...)"); LogicalPosition p = event.getLogicalPosition();
/* 244 */         Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); this.$eventsHandler.mouseMoved(p.column, p.line + TerminalEventDispatcherKt.setupMouseListener$historyLinesCount(this.$model), event.getMouseEvent());
/*     */       } 
/*     */     }
/*     */     
/*     */     public void mouseDragged(EditorMouseEvent event) {
/* 249 */       Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); if (this.$settings.enableMouseReporting() && TerminalEventDispatcherKt.setupMouseListener$isRemoteMouseAction(this.$model, event.getMouseEvent())) {
/* 250 */         Intrinsics.checkNotNullExpressionValue(event.getLogicalPosition(), "getLogicalPosition(...)"); LogicalPosition p = event.getLogicalPosition();
/* 251 */         Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); this.$eventsHandler.mouseDragged(p.column, p.line + TerminalEventDispatcherKt.setupMouseListener$historyLinesCount(this.$model), event.getMouseEvent());
/*     */       } 
/*     */     } }
/*     */ 
/*     */   
/*     */   private static final void setupMouseListener$lambda$0(EditorEx $editor, TerminalEventsHandler $eventsHandler, TerminalModel $model, MouseWheelEvent event) {
/* 257 */     Intrinsics.checkNotNullExpressionValue($editor.xyToLogicalPosition(event.getPoint()), "xyToLogicalPosition(...)"); LogicalPosition p = $editor.xyToLogicalPosition(event.getPoint());
/* 258 */     Intrinsics.checkNotNull(event); $eventsHandler.mouseWheelMoved(p.column, p.line + setupMouseListener$historyLinesCount($model), event);
/*     */   }
/*     */   
/*     */   private static final void setupMouseListener$lambda$1(EditorEx $editor, MouseWheelListener $mouseWheelListener) {
/* 262 */     $editor.getScrollPane().removeMouseWheelListener($mouseWheelListener);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalEventDispatcherKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */