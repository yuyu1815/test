/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.TerminalModel;
/*     */ import com.intellij.openapi.editor.LogicalPosition;
/*     */ import com.intellij.openapi.editor.event.EditorMouseEvent;
/*     */ import com.intellij.openapi.editor.event.EditorMouseMotionListener;
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcherKt$setupMouseListener$2", "Lcom/intellij/openapi/editor/event/EditorMouseMotionListener;", "mouseMoved", "", "event", "Lcom/intellij/openapi/editor/event/EditorMouseEvent;", "mouseDragged", "ej-core"})
/*     */ public final class TerminalEventDispatcherKt$setupMouseListener$2
/*     */   implements EditorMouseMotionListener
/*     */ {
/*     */   TerminalEventDispatcherKt$setupMouseListener$2(JBTerminalSystemSettingsProviderBase $settings, TerminalEventsHandler $eventsHandler, TerminalModel $model) {}
/*     */   
/*     */   public void mouseMoved(EditorMouseEvent event) {
/* 242 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); if (this.$settings.enableMouseReporting() && TerminalEventDispatcherKt.access$setupMouseListener$isRemoteMouseAction(this.$model, event.getMouseEvent())) {
/* 243 */       Intrinsics.checkNotNullExpressionValue(event.getLogicalPosition(), "getLogicalPosition(...)"); LogicalPosition p = event.getLogicalPosition();
/* 244 */       Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); this.$eventsHandler.mouseMoved(p.column, p.line + TerminalEventDispatcherKt.access$setupMouseListener$historyLinesCount(this.$model), event.getMouseEvent());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void mouseDragged(EditorMouseEvent event) {
/* 249 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); if (this.$settings.enableMouseReporting() && TerminalEventDispatcherKt.access$setupMouseListener$isRemoteMouseAction(this.$model, event.getMouseEvent())) {
/* 250 */       Intrinsics.checkNotNullExpressionValue(event.getLogicalPosition(), "getLogicalPosition(...)"); LogicalPosition p = event.getLogicalPosition();
/* 251 */       Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); this.$eventsHandler.mouseDragged(p.column, p.line + TerminalEventDispatcherKt.access$setupMouseListener$historyLinesCount(this.$model), event.getMouseEvent());
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalEventDispatcherKt$setupMouseListener$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */