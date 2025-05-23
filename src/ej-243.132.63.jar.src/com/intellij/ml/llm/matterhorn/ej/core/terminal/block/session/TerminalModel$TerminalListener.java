/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\005\bf\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\005H\026J\020\020\007\032\0020\0032\006\020\b\032\0020\tH\026J\020\020\n\032\0020\0032\006\020\013\032\0020\fH\026J\020\020\r\032\0020\0032\006\020\016\032\0020\fH\026J\020\020\017\032\0020\0032\006\020\020\032\0020\fH\026¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$TerminalListener;", "", "onSizeChanged", "", "width", "", "height", "onWindowTitleChanged", "title", "", "onCommandRunningChanged", "isRunning", "", "onAlternateBufferChanged", "enabled", "onBracketedPasteModeChanged", "bracketed", "ej-core"})
/*     */ public interface TerminalListener
/*     */ {
/*     */   void onSizeChanged(int paramInt1, int paramInt2);
/*     */   
/*     */   void onWindowTitleChanged(@NotNull String paramString);
/*     */   
/*     */   void onCommandRunningChanged(boolean paramBoolean);
/*     */   
/*     */   void onAlternateBufferChanged(boolean paramBoolean);
/*     */   
/*     */   void onBracketedPasteModeChanged(boolean paramBoolean);
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls
/*     */   {
/*     */     public static void onSizeChanged(@NotNull TerminalModel.TerminalListener $this, int width, int height) {}
/*     */     
/*     */     public static void onWindowTitleChanged(@NotNull TerminalModel.TerminalListener $this, @NotNull String title) {
/* 205 */       Intrinsics.checkNotNullParameter(title, "title");
/*     */     }
/*     */     
/*     */     public static void onCommandRunningChanged(@NotNull TerminalModel.TerminalListener $this, boolean isRunning) {}
/*     */     
/*     */     public static void onAlternateBufferChanged(@NotNull TerminalModel.TerminalListener $this, boolean enabled) {}
/*     */     
/*     */     public static void onBracketedPasteModeChanged(@NotNull TerminalModel.TerminalListener $this, boolean bracketed) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\TerminalModel$TerminalListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */