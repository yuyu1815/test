/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptModel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ public final class DefaultImpls {
/*    */   public static void commandHistoryShown(@NotNull CommandHistoryListener $this, @NotNull TerminalPromptModel promptModel) {
/* 10 */     Intrinsics.checkNotNullParameter(promptModel, "promptModel");
/*    */   } public static void commandHistoryAborted(@NotNull CommandHistoryListener $this, @NotNull TerminalPromptModel promptModel) {
/* 12 */     Intrinsics.checkNotNullParameter(promptModel, "promptModel");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandHistoryListener$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */