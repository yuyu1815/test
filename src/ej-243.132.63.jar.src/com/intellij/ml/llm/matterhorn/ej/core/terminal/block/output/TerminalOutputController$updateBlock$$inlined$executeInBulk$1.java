/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nTerminalUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalUiUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtilsKt$executeInBulk$1\n+ 2 TerminalOutputController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController\n*L\n1#1,314:1\n353#2,23:315\n*E\n"})
/*     */ public final class TerminalOutputController$updateBlock$$inlined$executeInBulk$1
/*     */   implements Runnable
/*     */ {
/*     */   public TerminalOutputController$updateBlock$$inlined$executeInBulk$1(CommandBlock paramCommandBlock, TerminalOutputController paramTerminalOutputController, PartialCommandOutput paramPartialCommandOutput) {}
/*     */   
/*     */   public final void run() {
/* 313 */     Ref.ObjectRef objectRef = this.$result; int $i$a$-executeInBulk-TerminalOutputController$updateBlock$1 = 0;
/*     */     
/* 315 */     boolean isPostponedNewLine = (CommandBlockImplKt.getWithPrompt(this.$block$inlined) || CommandBlockImplKt.getWithCommand(this.$block$inlined));
/* 316 */     if (isPostponedNewLine && !CommandBlockImplKt.getWithOutput(this.$block$inlined)) {
/* 317 */       TerminalOutputController.access$getEditor$p(TerminalOutputController.this).getDocument().insertString(this.$block$inlined.getEndOffset(), "\n");
/*     */     }
/*     */     
/* 320 */     if (this.$output$inlined.isChangesDiscarded())
/*     */     {
/*     */       
/* 323 */       this.$block$inlined.setTrimmedLinesCount(this.$output$inlined.getLogicalLineIndex());
/*     */     }
/*     */     
/* 326 */     int outputStartLine = TerminalOutputController.access$getEditor$p(TerminalOutputController.this).getDocument().getLineNumber(this.$block$inlined.getOutputStartOffset());
/* 327 */     int replaceStartLine = outputStartLine + this.$output$inlined.getLogicalLineIndex() - this.$block$inlined.getTrimmedLinesCount();
/* 328 */     if (replaceStartLine >= TerminalOutputController.access$getEditor$p(TerminalOutputController.this).getDocument().getLineCount() && TerminalOutputController.access$getEditor$p(TerminalOutputController.this).getDocument().getTextLength() > 0) {
/* 329 */       String newLines = StringsKt.repeat("\n", replaceStartLine - TerminalOutputController.access$getEditor$p(TerminalOutputController.this).getDocument().getLineCount() + 1);
/* 330 */       TerminalOutputController.access$getEditor$p(TerminalOutputController.this).getDocument().insertString(TerminalOutputController.access$getEditor$p(TerminalOutputController.this).getDocument().getTextLength(), newLines);
/*     */     } 
/*     */     
/* 333 */     int replaceStartOffset = TerminalOutputController.access$getEditor$p(TerminalOutputController.this).getDocument().getLineStartOffset(replaceStartLine);
/* 334 */     TerminalOutputController.access$getEditor$p(TerminalOutputController.this).getDocument().replaceString(replaceStartOffset, this.$block$inlined.getEndOffset(), this.$output$inlined.getText());
/*     */     
/* 336 */     TerminalOutputController.access$updateHighlightings(TerminalOutputController.this, this.$block$inlined, replaceStartOffset, this.$output$inlined.getStyles());
/* 337 */     objectRef.element = Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputController$updateBlock$$inlined$executeInBulk$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */