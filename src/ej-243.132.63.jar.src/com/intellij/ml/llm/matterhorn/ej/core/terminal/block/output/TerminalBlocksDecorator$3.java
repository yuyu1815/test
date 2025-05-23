/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\002\b\005*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\0052\f\020\007\032\b\022\004\022\0020\0060\005H\026J\034\020\b\032\0020\0032\b\020\t\032\004\030\0010\0062\b\020\n\032\004\030\0010\006H\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$3", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$TerminalSelectionListener;", "selectionChanged", "", "oldSelection", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "newSelection", "hoverChanged", "oldHovered", "newHovered", "ej-core"})
/*     */ public final class null
/*     */   implements TerminalSelectionModel.TerminalSelectionListener
/*     */ {
/*     */   public void selectionChanged(List oldSelection, List newSelection) {
/*  96 */     Intrinsics.checkNotNullParameter(oldSelection, "oldSelection"); Intrinsics.checkNotNullParameter(newSelection, "newSelection"); for (CommandBlock block : oldSelection) {
/*  97 */       TerminalBlocksDecorator.access$updateDecorationState(TerminalBlocksDecorator.this, block);
/*     */     }
/*  99 */     TerminalBlocksDecorator.access$updateSelectionDecorationState(TerminalBlocksDecorator.this, newSelection);
/*     */   }
/*     */   
/*     */   public void hoverChanged(CommandBlock oldHovered, CommandBlock newHovered) {
/* 103 */     if (oldHovered != null && TerminalBlocksDecorator.access$getDecorations$p(TerminalBlocksDecorator.this).containsKey(oldHovered)) {
/* 104 */       TerminalBlocksDecorator.access$updateDecorationState(TerminalBlocksDecorator.this, oldHovered);
/*     */     }
/* 106 */     if (newHovered != null)
/* 107 */       TerminalBlocksDecorator.access$updateHoveredState(TerminalBlocksDecorator.this, newHovered); 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalBlocksDecorator$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */