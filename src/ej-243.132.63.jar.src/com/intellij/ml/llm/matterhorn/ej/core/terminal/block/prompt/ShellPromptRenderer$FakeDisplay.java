/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*     */ 
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import com.jediterm.terminal.CursorShape;
/*     */ import com.jediterm.terminal.TerminalDisplay;
/*     */ import com.jediterm.terminal.emulator.mouse.MouseFormat;
/*     */ import com.jediterm.terminal.emulator.mouse.MouseMode;
/*     */ import com.jediterm.terminal.model.TerminalSelection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\030\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\tH\026J\022\020\013\032\0020\0072\b\020\f\032\004\030\0010\rH\026J\b\020\016\032\0020\007H\026J \020\017\032\0020\0072\006\020\020\032\0020\t2\006\020\021\032\0020\t2\006\020\022\032\0020\tH\026J\020\020\023\032\0020\0072\006\020\024\032\0020\025H\026J\020\020\026\032\0020\0072\006\020\026\032\0020\025H\026J\b\020\027\032\0020\030H\026J\020\020\031\032\0020\0072\006\020\032\032\0020\030H\026J\n\020\033\032\004\030\0010\034H\026J\020\020\035\032\0020\0072\006\020\036\032\0020\037H\026J\020\020 \032\0020\0072\006\020!\032\0020\"H\026J\b\020#\032\0020\025H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellPromptRenderer$FakeDisplay;", "Lcom/jediterm/terminal/TerminalDisplay;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "<init>", "(Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;)V", "setCursor", "", "x", "", "y", "setCursorShape", "cursorShape", "Lcom/jediterm/terminal/CursorShape;", "beep", "scrollArea", "scrollRegionTop", "scrollRegionSize", "dy", "setCursorVisible", "isCursorVisible", "", "useAlternateScreenBuffer", "getWindowTitle", "", "setWindowTitle", "windowTitle", "getSelection", "Lcom/jediterm/terminal/model/TerminalSelection;", "terminalMouseModeSet", "mouseMode", "Lcom/jediterm/terminal/emulator/mouse/MouseMode;", "setMouseFormat", "mouseFormat", "Lcom/jediterm/terminal/emulator/mouse/MouseFormat;", "ambiguousCharsAreDoubleWidth", "ej-core"})
/*     */ final class FakeDisplay
/*     */   implements TerminalDisplay
/*     */ {
/*     */   @NotNull
/*     */   private final JBTerminalSystemSettingsProviderBase settings;
/*     */   
/*     */   public FakeDisplay(@NotNull JBTerminalSystemSettingsProviderBase settings) {
/* 174 */     this.settings = settings;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCursor(int x, int y) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCursorShape(@Nullable CursorShape cursorShape) {}
/*     */ 
/*     */   
/*     */   public void beep() {}
/*     */ 
/*     */   
/*     */   public void scrollArea(int scrollRegionTop, int scrollRegionSize, int dy) {}
/*     */ 
/*     */   
/*     */   public void setCursorVisible(boolean isCursorVisible) {}
/*     */ 
/*     */   
/*     */   public void useAlternateScreenBuffer(boolean useAlternateScreenBuffer) {}
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String getWindowTitle() {
/* 200 */     return "";
/*     */   }
/*     */ 
/*     */   
/*     */   public void setWindowTitle(@NotNull String windowTitle) {
/* 205 */     Intrinsics.checkNotNullParameter(windowTitle, "windowTitle");
/*     */   } @Nullable
/*     */   public TerminalSelection getSelection() {
/* 208 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void terminalMouseModeSet(@NotNull MouseMode mouseMode) {
/* 213 */     Intrinsics.checkNotNullParameter(mouseMode, "mouseMode");
/*     */   }
/*     */   
/*     */   public void setMouseFormat(@NotNull MouseFormat mouseFormat) {
/* 217 */     Intrinsics.checkNotNullParameter(mouseFormat, "mouseFormat");
/*     */   } public boolean ambiguousCharsAreDoubleWidth() {
/* 219 */     return this.settings.ambiguousCharsAreDoubleWidth();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\ShellPromptRenderer$FakeDisplay.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */