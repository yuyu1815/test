/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*    */ import java.util.LinkedHashSet;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.plugins.terminal.exp.completion.TerminalShellSupport;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020#\n\002\020\016\n\000\n\002\020 \n\000\n\002\020\002\n\002\b\002\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\f\020\013\032\b\022\004\022\0020\n0\fJ\020\020\r\032\0020\0162\006\020\017\032\0020\nH\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\024\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryManager;", "", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "promptModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;)V", "mutableHistory", "", "", "getHistory", "", "initCommandHistory", "", "history", "ej-core"})
/*    */ public final class CommandHistoryManager {
/*    */   public CommandHistoryManager(@NotNull BlockTerminalSession session, @NotNull TerminalPromptModel promptModel) {
/* 11 */     this.session = session;
/* 12 */     this.promptModel = promptModel;
/*    */     
/* 14 */     Intrinsics.checkNotNullExpressionValue(Collections.synchronizedSet(new LinkedHashSet()), "synchronizedSet(...)"); this.mutableHistory = Collections.synchronizedSet(new LinkedHashSet());
/*    */ 
/*    */     
/* 17 */     BlockTerminalSession.addCommandListener$default(this.session, new ShellCommandListener() { public void initialized() { ShellCommandListener.DefaultImpls.initialized(this); } public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); } public void commandFinished(CommandFinishedEvent event) { ShellCommandListener.DefaultImpls.commandFinished(this, event); } public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void shellInfoReceived(String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void generatorFinished(GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); }
/*    */            public void commandHistoryReceived(String history) {
/* 19 */             Intrinsics.checkNotNullParameter(history, "history"); CommandHistoryManager.this.initCommandHistory(history);
/*    */           }
/*    */           
/*    */           public void commandStarted(String command) {
/* 23 */             Intrinsics.checkNotNullParameter(command, "command"); String trimmedCommand = StringsKt.trim(command).toString();
/* 24 */             if ((((CharSequence)trimmedCommand).length() > 0)) {
/*    */               
/* 26 */               CommandHistoryManager.this.mutableHistory.remove(trimmedCommand);
/* 27 */               CommandHistoryManager.this.mutableHistory.add(trimmedCommand);
/*    */             } 
/*    */           } }
/*    */         null, 2, null);
/*    */   }
/*    */   @NotNull
/*    */   private final BlockTerminalSession session;
/*    */   @NotNull
/*    */   private final TerminalPromptModel promptModel;
/*    */   @NotNull
/*    */   private final Set<String> mutableHistory;
/*    */   
/*    */   @NotNull
/*    */   public final List<String> getHistory() {
/* 41 */     return CollectionsKt.toList(this.mutableHistory);
/*    */   }
/*    */   private final void initCommandHistory(String history) {
/*    */     TerminalShellSupport shellSupport;
/* 45 */     if (!this.mutableHistory.isEmpty()) {
/*    */       return;
/*    */     }
/* 48 */     if (TerminalShellSupport.Companion.findByShellType(this.session.getShellIntegration().getShellType()) == null) { TerminalShellSupport.Companion.findByShellType(this.session.getShellIntegration().getShellType()); return; }
/* 49 */      List unsortedHistory = shellSupport.parseCommandHistory(history);
/*    */ 
/*    */     
/* 52 */     LinkedHashSet historySet = new LinkedHashSet();
/* 53 */     for (int ind = unsortedHistory.size() - 1; -1 < ind; ind--) {
/* 54 */       historySet.add(unsortedHistory.get(ind));
/*    */     }
/*    */     
/* 57 */     SequencedSet<? extends String> reversedHistory = historySet.reversed();
/* 58 */     Intrinsics.checkNotNull(reversedHistory); this.mutableHistory.addAll(reversedHistory);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandHistoryManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */