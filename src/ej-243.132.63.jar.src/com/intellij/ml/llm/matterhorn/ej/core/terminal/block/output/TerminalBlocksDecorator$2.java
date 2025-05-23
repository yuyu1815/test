/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.editor.Inlay;
/*     */ import com.intellij.openapi.editor.impl.RangeMarkerImpl;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026J\030\020\007\032\0020\0032\006\020\004\032\0020\0052\006\020\b\032\0020\tH\026¨\006\n"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$2", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelListener;", "blockFinalized", "", "block", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "blockRemoved", "blockInfoUpdated", "newInfo", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlockInfo;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalBlocksDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalBlocksDecorator.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n1#2:313\n*E\n"})
/*     */ public final class null
/*     */   implements TerminalOutputModelListener
/*     */ {
/*     */   public void blockCreated(CommandBlock block) {
/*  57 */     TerminalOutputModelListener.DefaultImpls.blockCreated(this, block);
/*     */   } public void blockFinalized(CommandBlock block) {
/*  59 */     Intrinsics.checkNotNullParameter(block, "block"); BlockDecoration it = (BlockDecoration)TerminalBlocksDecorator.access$getDecorations$p(TerminalBlocksDecorator.this).get(block); int $i$a$-let-TerminalBlocksDecorator$2$blockFinalized$1 = 0;
/*  60 */     it.getBackgroundHighlighter().setGreedyToRight(false);
/*  61 */     it.getCornersHighlighter().setGreedyToRight(false);
/*  62 */     Intrinsics.checkNotNull(it.getBottomInlay(), "null cannot be cast to non-null type com.intellij.openapi.editor.impl.RangeMarkerImpl"); ((RangeMarkerImpl)it.getBottomInlay()).setStickingToRight(false);
/*     */     (BlockDecoration)TerminalBlocksDecorator.access$getDecorations$p(TerminalBlocksDecorator.this).get(block);
/*     */   }
/*     */   public void blockRemoved(CommandBlock block) {
/*     */     CommandBlock firstBlock;
/*  67 */     Intrinsics.checkNotNullParameter(block, "block"); BlockDecoration blockDecoration1 = (BlockDecoration)TerminalBlocksDecorator.access$getDecorations$p(TerminalBlocksDecorator.this).get(block); TerminalBlocksDecorator terminalBlocksDecorator = TerminalBlocksDecorator.this; BlockDecoration it = blockDecoration1; int $i$a$-let-TerminalBlocksDecorator$2$blockRemoved$1 = 0;
/*  68 */     Disposer.dispose((Disposable)it.getTopInlay());
/*  69 */     Disposer.dispose((Disposable)it.getBottomInlay());
/*  70 */     if (it.getCommandToOutputInlay() != null) { Inlay<?> inlay = it.getCommandToOutputInlay();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 313 */       int $i$a$-let-TerminalBlocksDecorator$2$blockRemoved$1$1 = 0; Disposer.dispose((Disposable)inlay); } else { it.getCommandToOutputInlay(); }  if (it.getExitCodeInlay() != null) { Inlay<?> inlay = it.getExitCodeInlay(); int $i$a$-let-TerminalBlocksDecorator$2$blockRemoved$1$2 = 0;
/*     */       Disposer.dispose((Disposable)inlay); }
/*     */     else
/*     */     { it.getExitCodeInlay(); }
/*     */     
/*     */     TerminalBlocksDecorator.access$getEditor$p(terminalBlocksDecorator).getMarkupModel().removeHighlighter(it.getBackgroundHighlighter());
/*     */     TerminalBlocksDecorator.access$getEditor$p(terminalBlocksDecorator).getMarkupModel().removeHighlighter(it.getCornersHighlighter());
/*     */     (BlockDecoration)TerminalBlocksDecorator.access$getDecorations$p(TerminalBlocksDecorator.this).get(block);
/*     */     TerminalBlocksDecorator.access$getDecorations$p(TerminalBlocksDecorator.this).remove(block);
/*     */     if ((CommandBlock)CollectionsKt.firstOrNull(TerminalBlocksDecorator.access$getOutputModel$p(TerminalBlocksDecorator.this).getBlocks()) == null) {
/*     */       (CommandBlock)CollectionsKt.firstOrNull(TerminalBlocksDecorator.access$getOutputModel$p(TerminalBlocksDecorator.this).getBlocks());
/*     */       return;
/*     */     } 
/*     */     if ((BlockDecoration)TerminalBlocksDecorator.access$getDecorations$p(TerminalBlocksDecorator.this).get(firstBlock) != null && ((BlockDecoration)TerminalBlocksDecorator.access$getDecorations$p(TerminalBlocksDecorator.this).get(firstBlock)).getTopInlay() != null) {
/*     */       ((BlockDecoration)TerminalBlocksDecorator.access$getDecorations$p(TerminalBlocksDecorator.this).get(firstBlock)).getTopInlay().update();
/*     */     } else {
/*     */       ((BlockDecoration)TerminalBlocksDecorator.access$getDecorations$p(TerminalBlocksDecorator.this).get(firstBlock)).getTopInlay();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void blockInfoUpdated(CommandBlock block, CommandBlockInfo newInfo) {
/*     */     Intrinsics.checkNotNullParameter(block, "block");
/*     */     Intrinsics.checkNotNullParameter(newInfo, "newInfo");
/*     */     TerminalBlocksDecorator.access$updateDecorationState(TerminalBlocksDecorator.this, block);
/*     */     if (newInfo.getExitCode() != 0)
/*     */       TerminalBlocksDecorator.access$addExitCodeInlay(TerminalBlocksDecorator.this, block, newInfo.getExitCode()); 
/*     */     TerminalBlocksDecorator.access$updateCommandToOutputInlay(TerminalBlocksDecorator.this, block);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalBlocksDecorator$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */