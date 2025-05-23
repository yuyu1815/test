/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ 
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 actions.kt\ncom/intellij/openapi/command/ActionsKt$executeCommand$1\n+ 2 TerminalPromptSelectAllHandler.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptSelectAllHandler\n*L\n1#1,11:1\n19#2,2:12\n*E\n"})
/*    */ public final class TerminalPromptSelectAllHandler$doExecute$$inlined$executeCommand$default$1 implements Runnable {
/*    */   public final void run() {
/* 11 */     int $i$a$-executeCommand$default-TerminalPromptSelectAllHandler$doExecute$1 = 0;
/* 12 */     this.$editor$inlined.getSelectionModel().setSelection(this.$promptModel$inlined.getCommandStartOffset(), this.$editor$inlined.getDocument().getTextLength());
/*    */   }
/*    */   
/*    */   public TerminalPromptSelectAllHandler$doExecute$$inlined$executeCommand$default$1(Editor paramEditor, TerminalPromptModel paramTerminalPromptModel) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptSelectAllHandler$doExecute$$inlined$executeCommand$default$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */