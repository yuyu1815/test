/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.CommandBlock;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.CommandBlockInfo;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalOutputModelListener;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CompletableDeferred;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$2", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelListener;", "blockFinalized", "", "block", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "blockRemoved", "ej-core"})
/*     */ public final class BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$2
/*     */   implements TerminalOutputModelListener
/*     */ {
/*     */   BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$2(CompletableDeferred<Unit> $future) {}
/*     */   
/*     */   public void blockCreated(CommandBlock block) {
/* 190 */     TerminalOutputModelListener.DefaultImpls.blockCreated(this, block); } public void blockInfoUpdated(CommandBlock block, CommandBlockInfo newInfo) { TerminalOutputModelListener.DefaultImpls.blockInfoUpdated(this, block, newInfo); }
/*     */    public void blockFinalized(CommandBlock block) {
/* 192 */     Intrinsics.checkNotNullParameter(block, "block"); this.$future.complete(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   public void blockRemoved(CommandBlock block) {
/* 196 */     Intrinsics.checkNotNullParameter(block, "block"); this.$future.complete(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */