/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.TerminalModel;
/*     */ import kotlin.Metadata;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView$6", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$TerminalListener;", "onAlternateBufferChanged", "", "enabled", "", "ej-core"})
/*     */ public final class null
/*     */   implements TerminalModel.TerminalListener
/*     */ {
/*     */   public void onSizeChanged(int width, int height) {
/* 123 */     TerminalModel.TerminalListener.DefaultImpls.onSizeChanged(this, width, height); } public void onWindowTitleChanged(String title) { TerminalModel.TerminalListener.DefaultImpls.onWindowTitleChanged(this, title); } public void onCommandRunningChanged(boolean isRunning) { TerminalModel.TerminalListener.DefaultImpls.onCommandRunningChanged(this, isRunning); } public void onBracketedPasteModeChanged(boolean bracketed) { TerminalModel.TerminalListener.DefaultImpls.onBracketedPasteModeChanged(this, bracketed); }
/*     */   
/*     */   private static final void onAlternateBufferChanged$lambda$0(BlockTerminalView this$0, boolean $enabled) {
/* 126 */     BlockTerminalView.access$alternateBufferStateChanged(BlockTerminalView.this, $enabled);
/*     */   }
/*     */   
/*     */   public void onAlternateBufferChanged(boolean enabled) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;
/*     */     //   4: invokestatic access$getDisposed : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;)Lkotlin/jvm/functions/Function0;
/*     */     //   7: invokestatic any : ()Lcom/intellij/openapi/application/ModalityState;
/*     */     //   10: dup
/*     */     //   11: ldc 'any(...)'
/*     */     //   13: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   16: aload_0
/*     */     //   17: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;
/*     */     //   20: iload_1
/*     */     //   21: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;Z)Ljava/lang/Runnable;
/*     */     //   26: invokestatic invokeLater : (Lkotlin/jvm/functions/Function0;Lcom/intellij/openapi/application/ModalityState;Ljava/lang/Runnable;)V
/*     */     //   29: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #125	-> 0
/*     */     //   #128	-> 29
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	30	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView$6;
/*     */     //   0	30	1	enabled	Z
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\BlockTerminalView$6.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */