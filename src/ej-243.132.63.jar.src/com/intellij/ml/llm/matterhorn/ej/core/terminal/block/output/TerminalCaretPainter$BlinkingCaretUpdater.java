/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.editor.LogicalPosition;
/*     */ import com.intellij.util.concurrency.EdtExecutorService;
/*     */ import java.util.concurrent.ScheduledFuture;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\002\b\004\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\n\032\0020\013H\002J\b\020\f\032\0020\013H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\022\020\006\032\006\022\002\b\0030\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\016¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter$BlinkingCaretUpdater;", "Lcom/intellij/openapi/Disposable;", "position", "Lcom/intellij/openapi/editor/LogicalPosition;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter;Lcom/intellij/openapi/editor/LogicalPosition;)V", "updateFuture", "Ljava/util/concurrent/ScheduledFuture;", "paintCaret", "", "update", "", "dispose", "ej-core"})
/*     */ final class BlinkingCaretUpdater
/*     */   implements Disposable
/*     */ {
/*     */   @NotNull
/*     */   private final LogicalPosition position;
/*     */   @NotNull
/*     */   private final ScheduledFuture<?> updateFuture;
/*     */   private boolean paintCaret;
/*     */   
/*     */   public BlinkingCaretUpdater(LogicalPosition position) {
/* 154 */     this.position = position;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 159 */     long period = TerminalCaretPainter.access$getEditor$p(TerminalCaretPainter.this).getSettings().getCaretBlinkPeriod();
/* 160 */     this.updateFuture = EdtExecutorService.getScheduledExecutorInstance().scheduleWithFixedDelay(this::update, period, period, 
/* 161 */         TimeUnit.MILLISECONDS);
/*     */   }
/*     */   
/*     */   private final void update() {
/* 165 */     if (!TerminalCaretPainter.access$getEditor$p(TerminalCaretPainter.this).isDisposed()) {
/* 166 */       TerminalCaretPainter.access$removeHighlighter(TerminalCaretPainter.this);
/* 167 */       if (!TerminalCaretPainter.access$isDisposed$p(TerminalCaretPainter.this) && this.paintCaret) {
/* 168 */         TerminalCaretPainter.access$installCaretHighlighter(TerminalCaretPainter.this, this.position);
/*     */       }
/* 170 */       this.paintCaret = !this.paintCaret;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void dispose() {
/* 175 */     this.updateFuture.cancel(false);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalCaretPainter$BlinkingCaretUpdater.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */