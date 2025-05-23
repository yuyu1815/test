/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*     */ 
/*     */ import com.intellij.openapi.editor.event.CaretEvent;
/*     */ import com.intellij.openapi.editor.event.CaretListener;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\026R\016\020\004\032\0020\005X\016¢\006\002\n\000¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl$PreventMoveToPromptListener;", "Lcom/intellij/openapi/editor/event/CaretListener;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl;)V", "preventRecursion", "", "caretPositionChanged", "", "event", "Lcom/intellij/openapi/editor/event/CaretEvent;", "ej-core"})
/*     */ final class PreventMoveToPromptListener
/*     */   implements CaretListener
/*     */ {
/*     */   private boolean preventRecursion;
/*     */   
/*     */   public void caretPositionChanged(@NotNull CaretEvent event) {
/* 155 */     Intrinsics.checkNotNullParameter(event, "event"); if (this.preventRecursion)
/* 156 */       return;  int newOffset = TerminalPromptModelImpl.this.getEditor().logicalPositionToOffset(event.getNewPosition());
/* 157 */     if (newOffset < TerminalPromptModelImpl.this.getCommandStartOffset()) {
/* 158 */       this.preventRecursion = true;
/*     */       try {
/* 160 */         TerminalPromptModelImpl.this.getEditor().getCaretModel().moveToOffset(TerminalPromptModelImpl.this.getCommandStartOffset());
/*     */       } finally {
/*     */         
/* 163 */         this.preventRecursion = false;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptModelImpl$PreventMoveToPromptListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */