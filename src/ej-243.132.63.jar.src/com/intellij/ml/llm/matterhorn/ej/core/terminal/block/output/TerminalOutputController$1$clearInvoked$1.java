/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptState;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.CommandFinishedEvent;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.GeneratorFinishedEvent;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalUiUtilsKt;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.application.ModalityState;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.util.Disposer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$1$clearInvoked$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "commandFinished", "", "event", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;", "ej-core"})
/*    */ public final class TerminalOutputController$1$clearInvoked$1
/*    */   implements ShellCommandListener
/*    */ {
/*    */   TerminalOutputController$1$clearInvoked$1(Disposable $disposable) {}
/*    */   
/*    */   public void initialized() {
/* 74 */     ShellCommandListener.DefaultImpls.initialized(this); } public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); } public void commandStarted(String command) { ShellCommandListener.DefaultImpls.commandStarted(this, command); } public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandHistoryReceived(String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void shellInfoReceived(String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void generatorFinished(GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); }
/*    */    public void commandFinished(CommandFinishedEvent event) {
/* 76 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(ModalityState.any(), "any(...)"); TerminalUiUtilsKt.invokeLater(TerminalUiUtilsKt.getDisposed((Editor)TerminalOutputController.access$getEditor$p(TerminalOutputController.this)), ModalityState.any(), TerminalOutputController.this::commandFinished$lambda$0);
/*    */ 
/*    */     
/* 79 */     Disposer.dispose(this.$disposable);
/*    */   }
/*    */   
/*    */   private static final void commandFinished$lambda$0(TerminalOutputController this$0) {
/*    */     TerminalOutputController.this.getOutputModel().clearBlocks();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputController$1$clearInvoked$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */