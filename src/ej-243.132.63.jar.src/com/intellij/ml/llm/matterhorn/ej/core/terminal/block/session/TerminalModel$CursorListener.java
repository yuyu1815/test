/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ 
/*     */ import com.jediterm.terminal.CursorShape;
/*     */ import com.jediterm.terminal.emulator.mouse.MouseFormat;
/*     */ import com.jediterm.terminal.emulator.mouse.MouseMode;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\bf\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\005H\026J\022\020\007\032\0020\0032\b\020\b\032\004\030\0010\tH\026J\020\020\n\032\0020\0032\006\020\013\032\0020\fH\026J\020\020\r\032\0020\0032\006\020\016\032\0020\017H\026J\020\020\020\032\0020\0032\006\020\021\032\0020\022H\026¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$CursorListener;", "", "onPositionChanged", "", "cursorX", "", "cursorY", "onShapeChanged", "shape", "Lcom/jediterm/terminal/CursorShape;", "onVisibilityChanged", "visible", "", "onMouseModeChanged", "mode", "Lcom/jediterm/terminal/emulator/mouse/MouseMode;", "onMouseFormatChanged", "format", "Lcom/jediterm/terminal/emulator/mouse/MouseFormat;", "ej-core"})
/*     */ public interface CursorListener
/*     */ {
/*     */   void onPositionChanged(int paramInt1, int paramInt2);
/*     */   
/*     */   void onShapeChanged(@Nullable CursorShape paramCursorShape);
/*     */   
/*     */   void onVisibilityChanged(boolean paramBoolean);
/*     */   
/*     */   void onMouseModeChanged(@NotNull MouseMode paramMouseMode);
/*     */   
/*     */   void onMouseFormatChanged(@NotNull MouseFormat paramMouseFormat);
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls
/*     */   {
/*     */     public static void onPositionChanged(@NotNull TerminalModel.CursorListener $this, int cursorX, int cursorY) {}
/*     */     
/*     */     public static void onShapeChanged(@NotNull TerminalModel.CursorListener $this, @Nullable CursorShape shape) {}
/*     */     
/*     */     public static void onVisibilityChanged(@NotNull TerminalModel.CursorListener $this, boolean visible) {}
/*     */     
/*     */     public static void onMouseModeChanged(@NotNull TerminalModel.CursorListener $this, @NotNull MouseMode mode) {
/* 221 */       Intrinsics.checkNotNullParameter(mode, "mode");
/*     */     } public static void onMouseFormatChanged(@NotNull TerminalModel.CursorListener $this, @NotNull MouseFormat format) {
/* 223 */       Intrinsics.checkNotNullParameter(format, "format");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\TerminalModel$CursorListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */