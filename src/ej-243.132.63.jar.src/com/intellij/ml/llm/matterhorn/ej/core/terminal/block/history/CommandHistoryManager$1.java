/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptState;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.CommandFinishedEvent;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.GeneratorFinishedEvent;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\003*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\007\032\0020\005H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryManager$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "commandHistoryReceived", "", "history", "", "commandStarted", "command", "ej-core"})
/*    */ public final class null
/*    */   implements ShellCommandListener
/*    */ {
/*    */   public void initialized() {
/* 17 */     ShellCommandListener.DefaultImpls.initialized(this); } public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); } public void commandFinished(CommandFinishedEvent event) { ShellCommandListener.DefaultImpls.commandFinished(this, event); } public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void shellInfoReceived(String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void generatorFinished(GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); }
/*    */    public void commandHistoryReceived(String history) {
/* 19 */     Intrinsics.checkNotNullParameter(history, "history"); CommandHistoryManager.access$initCommandHistory(CommandHistoryManager.this, history);
/*    */   }
/*    */   
/*    */   public void commandStarted(String command) {
/* 23 */     Intrinsics.checkNotNullParameter(command, "command"); String trimmedCommand = StringsKt.trim(command).toString();
/* 24 */     if ((((CharSequence)trimmedCommand).length() > 0)) {
/*    */       
/* 26 */       CommandHistoryManager.access$getMutableHistory$p(CommandHistoryManager.this).remove(trimmedCommand);
/* 27 */       CommandHistoryManager.access$getMutableHistory$p(CommandHistoryManager.this).add(trimmedCommand);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandHistoryManager$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */