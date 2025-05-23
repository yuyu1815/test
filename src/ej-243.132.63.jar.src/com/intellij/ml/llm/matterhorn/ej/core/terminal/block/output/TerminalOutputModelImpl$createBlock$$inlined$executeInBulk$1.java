/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptRenderingInfo;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.RangeMarker;
/*     */ import com.intellij.terminal.BlockTerminalColors;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nTerminalUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalUiUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtilsKt$executeInBulk$1\n+ 2 TerminalOutputModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl\n*L\n1#1,314:1\n62#2,28:315\n*E\n"})
/*     */ public final class TerminalOutputModelImpl$createBlock$$inlined$executeInBulk$1
/*     */   implements Runnable
/*     */ {
/*     */   public TerminalOutputModelImpl$createBlock$$inlined$executeInBulk$1(TerminalOutputModelImpl paramTerminalOutputModelImpl, TerminalPromptRenderingInfo paramTerminalPromptRenderingInfo, String paramString, int paramInt) {}
/*     */   
/*     */   public final void run() {
/* 313 */     Ref.ObjectRef objectRef = this.$result; int $i$a$-executeInBulk-TerminalOutputModelImpl$createBlock$block$1 = 0;
/*     */     
/* 315 */     if (TerminalOutputModelImpl.access$getDocument$p(TerminalOutputModelImpl.this).getTextLength() > 0) {
/* 316 */       TerminalOutputModelImpl.access$getDocument$p(TerminalOutputModelImpl.this).insertString(TerminalOutputModelImpl.access$getDocument$p(TerminalOutputModelImpl.this).getTextLength(), "\n");
/*     */     }
/* 318 */     int startOffset = TerminalOutputModelImpl.access$getDocument$p(TerminalOutputModelImpl.this).getTextLength();
/*     */     
/* 320 */     List<HighlightingInfo> blockHighlightings = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 328 */     if (this.$prompt$inlined != null) {
/* 329 */       TerminalOutputModelImpl.access$createBlock$lambda$1$appendTextWithHighlightings(TerminalOutputModelImpl.this, blockHighlightings, this.$prompt$inlined.getText(), this.$prompt$inlined.getHighlightings());
/*     */     }
/* 331 */     TextAttributesKeyAdapter commandAttributes = new TextAttributesKeyAdapter((Editor)TerminalOutputModelImpl.this.getEditor(), BlockTerminalColors.COMMAND);
/* 332 */     TextWithHighlightings commandAndRightPrompt = TerminalOutputModelImpl.Companion.createCommandAndRightPromptText$ej_core(this.$command$inlined, this.$prompt$inlined, commandAttributes, this.$terminalWidth$inlined);
/* 333 */     if ((((CharSequence)commandAndRightPrompt.getText()).length() > 0)) {
/* 334 */       TerminalOutputModelImpl.access$createBlock$lambda$1$appendTextWithHighlightings(TerminalOutputModelImpl.this, blockHighlightings, commandAndRightPrompt.getText(), commandAndRightPrompt.getHighlightings());
/*     */     }
/*     */     
/* 337 */     Intrinsics.checkNotNullExpressionValue(TerminalOutputModelImpl.access$getDocument$p(TerminalOutputModelImpl.this).createRangeMarker(startOffset, TerminalOutputModelImpl.access$getDocument$p(TerminalOutputModelImpl.this).getTextLength()), "createRangeMarker(...)"); RangeMarker marker = TerminalOutputModelImpl.access$getDocument$p(TerminalOutputModelImpl.this).createRangeMarker(startOffset, TerminalOutputModelImpl.access$getDocument$p(TerminalOutputModelImpl.this).getTextLength());
/* 338 */     marker.setGreedyToRight(true);
/* 339 */     CommandBlockImpl block = new CommandBlockImpl(this.$command$inlined, (this.$prompt$inlined != null) ? this.$prompt$inlined.getText() : null, (this.$prompt$inlined != null) ? this.$prompt$inlined.getRightText() : null, marker, commandAndRightPrompt.getText().length());
/* 340 */     TerminalOutputModelImpl.this.getBlocks().add(block);
/* 341 */     TerminalOutputModelImpl.this.putHighlightings(block, blockHighlightings);
/* 342 */     objectRef.element = block;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputModelImpl$createBlock$$inlined$executeInBulk$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */