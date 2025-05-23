/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptState;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.CommandFinishedEvent;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.GeneratorFinishedEvent;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.util.Disposer;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl$initialize$2", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "initialized", "", "ej-core"})
/*    */ public final class TerminalWidgetImpl$initialize$2
/*    */   implements ShellCommandListener
/*    */ {
/*    */   TerminalWidgetImpl$initialize$2(Disposable $listenersDisposable) {}
/*    */   
/*    */   public void promptShown() {
/* 81 */     ShellCommandListener.DefaultImpls.promptShown(this); } public void commandStarted(String command) { ShellCommandListener.DefaultImpls.commandStarted(this, command); } public void commandFinished(CommandFinishedEvent event) { ShellCommandListener.DefaultImpls.commandFinished(this, event); } public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandHistoryReceived(String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void shellInfoReceived(String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void generatorFinished(GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); }
/*    */    public void initialized() {
/* 83 */     TerminalWidgetImpl.this.getSessionInitializedPromise().complete(Boolean.valueOf(true));
/* 84 */     Disposer.dispose(this.$listenersDisposable);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\TerminalWidgetImpl$initialize$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */