/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ public final class DefaultImpls {
/*  8 */   public static void blockCreated(@NotNull TerminalOutputModelListener $this, @NotNull CommandBlock block) { Intrinsics.checkNotNullParameter(block, "block"); } public static void blockRemoved(@NotNull TerminalOutputModelListener $this, @NotNull CommandBlock block) {
/*  9 */     Intrinsics.checkNotNullParameter(block, "block");
/*    */   }
/*    */   
/* 12 */   public static void blockFinalized(@NotNull TerminalOutputModelListener $this, @NotNull CommandBlock block) { Intrinsics.checkNotNullParameter(block, "block"); } public static void blockInfoUpdated(@NotNull TerminalOutputModelListener $this, @NotNull CommandBlock block, @NotNull CommandBlockInfo newInfo) {
/* 13 */     Intrinsics.checkNotNullParameter(block, "block"); Intrinsics.checkNotNullParameter(newInfo, "newInfo");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputModelListener$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */