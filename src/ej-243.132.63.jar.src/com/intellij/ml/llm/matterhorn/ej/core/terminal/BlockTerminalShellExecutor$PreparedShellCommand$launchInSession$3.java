/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.CommandFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.GeneratorFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandOutputScraperImpl;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "commandFinished", "", "event", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nBlockTerminalShellExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,342:1\n24#2:343\n61#2,5:344\n*S KotlinDebug\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3\n*L\n312#1:343\n312#1:344,5\n*E\n"})
/*     */ public final class BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3
/*     */   implements ShellCommandListener
/*     */ {
/*     */   BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3(BlockTerminalShellExecutor.PreparedShellCommand $receiver) {}
/*     */   
/*     */   public void initialized() {
/* 309 */     ShellCommandListener.DefaultImpls.initialized(this); } public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); } public void commandStarted(String command) { ShellCommandListener.DefaultImpls.commandStarted(this, command); } public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandHistoryReceived(String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void shellInfoReceived(String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void generatorFinished(GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); }
/*     */ 
/*     */   
/*     */   public void commandFinished(CommandFinishedEvent event) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'event'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield $scraper : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl;
/*     */     //   10: invokevirtual scrapeOutput : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;
/*     */     //   13: invokevirtual component1 : ()Ljava/lang/String;
/*     */     //   16: astore_2
/*     */     //   17: aload_0
/*     */     //   18: astore_3
/*     */     //   19: iconst_0
/*     */     //   20: istore #4
/*     */     //   22: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3
/*     */     //   24: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   27: dup
/*     */     //   28: ldc 'getInstance(...)'
/*     */     //   30: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   33: astore_3
/*     */     //   34: aload_0
/*     */     //   35: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */     //   38: astore #5
/*     */     //   40: aconst_null
/*     */     //   41: astore #4
/*     */     //   43: iconst_0
/*     */     //   44: istore #6
/*     */     //   46: aload_3
/*     */     //   47: invokevirtual isDebugEnabled : ()Z
/*     */     //   50: ifeq -> 79
/*     */     //   53: aload_3
/*     */     //   54: astore #8
/*     */     //   56: iconst_0
/*     */     //   57: istore #7
/*     */     //   59: aload_1
/*     */     //   60: aload #5
/*     */     //   62: aload_2
/*     */     //   63: invokestatic access$toDebug : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   66: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   71: aload #8
/*     */     //   73: swap
/*     */     //   74: aload #4
/*     */     //   76: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   79: nop
/*     */     //   80: aload_0
/*     */     //   81: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */     //   84: aload_2
/*     */     //   85: invokestatic access$normalizeActualOutput : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   88: astore_3
/*     */     //   89: aload_0
/*     */     //   90: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */     //   93: invokevirtual getPromisedResult : ()Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   96: new com/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult
/*     */     //   99: dup
/*     */     //   100: aload_3
/*     */     //   101: aload_1
/*     */     //   102: invokevirtual getExitCode : ()I
/*     */     //   105: invokespecial <init> : (Ljava/lang/String;I)V
/*     */     //   108: invokeinterface complete : (Ljava/lang/Object;)Z
/*     */     //   113: pop
/*     */     //   114: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #311	-> 6
/*     */     //   #312	-> 17
/*     */     //   #343	-> 22
/*     */     //   #312	-> 34
/*     */     //   #344	-> 40
/*     */     //   #345	-> 46
/*     */     //   #346	-> 53
/*     */     //   #313	-> 59
/*     */     //   #346	-> 74
/*     */     //   #348	-> 79
/*     */     //   #315	-> 80
/*     */     //   #316	-> 89
/*     */     //   #317	-> 114
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   22	11	4	$i$f$thisLogger	I
/*     */     //   19	14	3	$this$thisLogger$iv	Ljava/lang/Object;
/*     */     //   59	12	7	$i$a$-debug$default-BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3$commandFinished$1	I
/*     */     //   46	34	6	$i$f$debug	I
/*     */     //   40	40	3	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   43	37	4	e$iv	Ljava/lang/Exception;
/*     */     //   17	98	2	text	Ljava/lang/String;
/*     */     //   89	26	3	normalizedText	Ljava/lang/String;
/*     */     //   0	115	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3;
/*     */     //   0	115	1	event	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */