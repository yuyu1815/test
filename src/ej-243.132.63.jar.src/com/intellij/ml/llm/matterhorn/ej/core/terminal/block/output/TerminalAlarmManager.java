/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\006\020\b\032\0020\tJ\020\020\n\032\0020\t2\006\020\013\032\0020\fH\026J\020\020\r\032\0020\t2\006\020\016\032\0020\017H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\006\032\0020\007X\016¢\006\002\n\000¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalAlarmManager;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "<init>", "(Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;)V", "commandIsRunning", "", "beep", "", "commandStarted", "command", "", "commandFinished", "event", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;", "ej-core"})
/*    */ public final class TerminalAlarmManager implements ShellCommandListener {
/*    */   @NotNull
/*    */   private final JBTerminalSystemSettingsProviderBase settings;
/*    */   
/*  9 */   public TerminalAlarmManager(@NotNull JBTerminalSystemSettingsProviderBase settings) { this.settings = settings; } private boolean commandIsRunning; public void initialized() { ShellCommandListener.DefaultImpls.initialized(this); } public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); } public void promptStateUpdated(@NotNull TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandHistoryReceived(@NotNull String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void commandBufferReceived(@NotNull String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void shellInfoReceived(@NotNull String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void generatorFinished(@NotNull GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); }
/*    */ 
/*    */   
/*    */   public final void beep() {
/* 13 */     if (this.commandIsRunning && this.settings.audibleBell()) {
/* 14 */       Toolkit.getDefaultToolkit().beep();
/*    */     }
/*    */   }
/*    */   
/*    */   public void commandStarted(@NotNull String command) {
/* 19 */     Intrinsics.checkNotNullParameter(command, "command"); this.commandIsRunning = true;
/*    */   }
/*    */   
/*    */   public void commandFinished(@NotNull CommandFinishedEvent event) {
/* 23 */     Intrinsics.checkNotNullParameter(event, "event"); this.commandIsRunning = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalAlarmManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */