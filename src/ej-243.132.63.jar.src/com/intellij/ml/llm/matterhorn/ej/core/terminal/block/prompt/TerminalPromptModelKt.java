/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\000¨\006\003"}, d2 = {"clearCommandAndResetChangesHistory", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "ej-core"})
/*    */ public final class TerminalPromptModelKt
/*    */ {
/*    */   public static final void clearCommandAndResetChangesHistory(@NotNull TerminalPromptModel $this$clearCommandAndResetChangesHistory) {
/* 58 */     Intrinsics.checkNotNullParameter($this$clearCommandAndResetChangesHistory, "<this>"); $this$clearCommandAndResetChangesHistory.setCommandText("");
/* 59 */     $this$clearCommandAndResetChangesHistory.getEditor().getCaretModel().moveToOffset($this$clearCommandAndResetChangesHistory.getEditor().getDocument().getTextLength());
/* 60 */     $this$clearCommandAndResetChangesHistory.resetChangesHistory();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptModelKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */