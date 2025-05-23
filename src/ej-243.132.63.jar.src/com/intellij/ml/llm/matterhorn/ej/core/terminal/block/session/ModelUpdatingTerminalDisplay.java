/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalAlarmManager;
/*    */ import com.jediterm.core.util.TermSize;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b\000\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\030\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\rH\026J\022\020\017\032\0020\0132\b\020\020\032\004\030\0010\021H\026J\b\020\022\032\0020\013H\026J\030\020\023\032\0020\0132\006\020\024\032\0020\0252\006\020\026\032\0020\027H\026J \020\030\032\0020\0132\006\020\031\032\0020\r2\006\020\032\032\0020\r2\006\020\033\032\0020\rH\026J\020\020\034\032\0020\0132\006\020\035\032\0020\036H\026J\020\020\037\032\0020\0132\006\020\037\032\0020\036H\026J\b\020 \032\0020!H\026J\020\020\"\032\0020\0132\006\020#\032\0020!H\026J\n\020$\032\004\030\0010%H\026J\020\020&\032\0020\0132\006\020'\032\0020(H\026J\020\020)\032\0020\0132\006\020*\032\0020+H\026J\020\020,\032\0020\0132\006\020-\032\0020\036H\026J\b\020.\032\0020\036H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006/"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ModelUpdatingTerminalDisplay;", "Lcom/jediterm/terminal/TerminalDisplay;", "alarmManager", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalAlarmManager;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalAlarmManager;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;)V", "setCursor", "", "x", "", "y", "setCursorShape", "cursorShape", "Lcom/jediterm/terminal/CursorShape;", "beep", "onResize", "newTermSize", "Lcom/jediterm/core/util/TermSize;", "origin", "Lcom/jediterm/terminal/RequestOrigin;", "scrollArea", "scrollRegionTop", "scrollRegionSize", "dy", "setCursorVisible", "isCursorVisible", "", "useAlternateScreenBuffer", "getWindowTitle", "", "setWindowTitle", "windowTitle", "getSelection", "Lcom/jediterm/terminal/model/TerminalSelection;", "terminalMouseModeSet", "mouseMode", "Lcom/jediterm/terminal/emulator/mouse/MouseMode;", "setMouseFormat", "mouseFormat", "Lcom/jediterm/terminal/emulator/mouse/MouseFormat;", "setBracketedPasteMode", "enabled", "ambiguousCharsAreDoubleWidth", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nModelUpdatingTerminalDisplay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelUpdatingTerminalDisplay.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ModelUpdatingTerminalDisplay\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1863#2,2:67\n*S KotlinDebug\n*F\n+ 1 ModelUpdatingTerminalDisplay.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ModelUpdatingTerminalDisplay\n*L\n31#1:67,2\n*E\n"})
/*    */ public final class ModelUpdatingTerminalDisplay implements TerminalDisplay {
/*    */   @NotNull
/*    */   private final TerminalAlarmManager alarmManager;
/*    */   
/* 14 */   public ModelUpdatingTerminalDisplay(@NotNull TerminalAlarmManager alarmManager, @NotNull TerminalModel model, @NotNull JBTerminalSystemSettingsProviderBase settings) { this.alarmManager = alarmManager;
/* 15 */     this.model = model;
/* 16 */     this.settings = settings; } @NotNull
/*    */   private final TerminalModel model; @NotNull
/*    */   private final JBTerminalSystemSettingsProviderBase settings; public void setCursor(int x, int y) {
/* 19 */     this.model.setCursor(x, y);
/*    */   }
/*    */   
/*    */   public void setCursorShape(@Nullable CursorShape cursorShape) {
/* 23 */     this.model.setCursorShape(cursorShape);
/*    */   }
/*    */   
/*    */   public void beep() {
/* 27 */     this.alarmManager.beep();
/*    */   }
/*    */   
/*    */   public void onResize(@NotNull TermSize newTermSize, @NotNull RequestOrigin origin) {
/* 31 */     Intrinsics.checkNotNullParameter(newTermSize, "newTermSize"); Intrinsics.checkNotNullParameter(origin, "origin"); Iterable<TerminalModel.TerminalListener> $this$forEach$iv = this.model.getTerminalListeners$ej_core(); int $i$f$forEach = 0;
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
/* 67 */     Iterator<TerminalModel.TerminalListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); TerminalModel.TerminalListener it = (TerminalModel.TerminalListener)element$iv; int $i$a$-forEach-ModelUpdatingTerminalDisplay$onResize$1 = 0;
/*    */       it.onSizeChanged(newTermSize.getColumns(), newTermSize.getRows()); }
/*    */   
/*    */   }
/*    */   
/*    */   public void scrollArea(int scrollRegionTop, int scrollRegionSize, int dy) {}
/*    */   
/*    */   public void setCursorVisible(boolean isCursorVisible) {
/*    */     this.model.setCursorVisible(isCursorVisible);
/*    */   }
/*    */   
/*    */   public void useAlternateScreenBuffer(boolean useAlternateScreenBuffer) {
/*    */     this.model.setUseAlternateBuffer(useAlternateScreenBuffer);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getWindowTitle() {
/*    */     return this.model.getWindowTitle();
/*    */   }
/*    */   
/*    */   public void setWindowTitle(@NotNull String windowTitle) {
/*    */     Intrinsics.checkNotNullParameter(windowTitle, "windowTitle");
/*    */     this.model.setWindowTitle(windowTitle);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public TerminalSelection getSelection() {
/*    */     return null;
/*    */   }
/*    */   
/*    */   public void terminalMouseModeSet(@NotNull MouseMode mouseMode) {
/*    */     Intrinsics.checkNotNullParameter(mouseMode, "mouseMode");
/*    */     this.model.setMouseMode(mouseMode);
/*    */   }
/*    */   
/*    */   public void setMouseFormat(@NotNull MouseFormat mouseFormat) {
/*    */     Intrinsics.checkNotNullParameter(mouseFormat, "mouseFormat");
/*    */     this.model.setMouseFormat(mouseFormat);
/*    */   }
/*    */   
/*    */   public void setBracketedPasteMode(boolean enabled) {
/*    */     this.model.setBracketedPasteMode(enabled);
/*    */   }
/*    */   
/*    */   public boolean ambiguousCharsAreDoubleWidth() {
/*    */     return this.settings.ambiguousCharsAreDoubleWidth();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ModelUpdatingTerminalDisplay.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */