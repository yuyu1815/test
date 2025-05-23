/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\bg\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\007\032\0020\0032\006\020\004\032\0020\005H\026J\030\020\b\032\0020\0032\006\020\004\032\0020\0052\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelListener;", "", "blockCreated", "", "block", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "blockRemoved", "blockFinalized", "blockInfoUpdated", "newInfo", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlockInfo;", "ej-core"})
/*    */ @Internal
/*    */ public interface TerminalOutputModelListener { void blockCreated(@NotNull CommandBlock paramCommandBlock); void blockRemoved(@NotNull CommandBlock paramCommandBlock);
/*    */   void blockFinalized(@NotNull CommandBlock paramCommandBlock);
/*    */   void blockInfoUpdated(@NotNull CommandBlock paramCommandBlock, @NotNull CommandBlockInfo paramCommandBlockInfo);
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*  8 */   public static final class DefaultImpls { public static void blockCreated(@NotNull TerminalOutputModelListener $this, @NotNull CommandBlock block) { Intrinsics.checkNotNullParameter(block, "block"); } public static void blockRemoved(@NotNull TerminalOutputModelListener $this, @NotNull CommandBlock block) {
/*  9 */       Intrinsics.checkNotNullParameter(block, "block");
/*    */     }
/*    */     
/* 12 */     public static void blockFinalized(@NotNull TerminalOutputModelListener $this, @NotNull CommandBlock block) { Intrinsics.checkNotNullParameter(block, "block"); } public static void blockInfoUpdated(@NotNull TerminalOutputModelListener $this, @NotNull CommandBlock block, @NotNull CommandBlockInfo newInfo) {
/* 13 */       Intrinsics.checkNotNullParameter(block, "block"); Intrinsics.checkNotNullParameter(newInfo, "newInfo");
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputModelListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */