/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.CommandFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.GeneratorFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.plugins.terminal.fus.TerminalUsageTriggerCollector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000#\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J\020\020\004\032\0020\0032\006\020\005\032\0020\006H\026J\020\020\007\032\0020\0032\006\020\b\032\0020\tH\026J\020\020\n\032\0020\0032\006\020\013\032\0020\006H\026¨\006\f"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "initialized", "", "shellInfoReceived", "rawShellInfo", "", "commandFinished", "event", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;", "commandStarted", "command", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nBlockTerminalController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$1\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,201:1\n24#2:202\n*S KotlinDebug\n*F\n+ 1 BlockTerminalController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$1\n*L\n53#1:202\n*E\n"})
/*     */ public final class null
/*     */   implements ShellCommandListener
/*     */ {
/*     */   public void promptShown() {
/*  47 */     ShellCommandListener.DefaultImpls.promptShown(this); } public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandHistoryReceived(String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void generatorFinished(GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); }
/*     */    public void initialized() {
/*  49 */     BlockTerminalController.access$finishCommandBlock(BlockTerminalController.this, 0);
/*     */   }
/*     */   
/*     */   public void shellInfoReceived(String rawShellInfo) {
/*  53 */     Intrinsics.checkNotNullParameter(rawShellInfo, "rawShellInfo"); Object $this$thisLogger$iv = this; int $i$f$thisLogger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 202 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(null.class), "getInstance(...)"); Logger.getInstance(null.class).info("Started shell info: " + rawShellInfo);
/*     */   }
/*     */   
/*     */   public void commandFinished(CommandFinishedEvent event) {
/*     */     Intrinsics.checkNotNullParameter(event, "event");
/*     */     BlockTerminalController.access$finishCommandBlock(BlockTerminalController.this, event.getExitCode());
/*     */     TerminalUsageTriggerCollector.INSTANCE.triggerCommandFinished-Wn2Vu4Y(BlockTerminalController.access$getProject$p(BlockTerminalController.this), event.getCommand(), event.getExitCode(), event.getDuration-UwyO8pc());
/*     */   }
/*     */   
/*     */   public void commandStarted(String command) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'command'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;
/*     */     //   10: invokestatic access$getDisposed : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;)Lkotlin/jvm/functions/Function0;
/*     */     //   13: invokestatic any : ()Lcom/intellij/openapi/application/ModalityState;
/*     */     //   16: dup
/*     */     //   17: ldc 'any(...)'
/*     */     //   19: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   22: aload_0
/*     */     //   23: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;
/*     */     //   26: aload_1
/*     */     //   27: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */     //   32: invokestatic invokeLater : (Lkotlin/jvm/functions/Function0;Lcom/intellij/openapi/application/ModalityState;Ljava/lang/Runnable;)V
/*     */     //   35: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #67	-> 6
/*     */     //   #72	-> 35
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	36	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$1;
/*     */     //   0	36	1	command	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private static final void commandStarted$lambda$0(BlockTerminalController this$0, String $command) {
/*     */     if (!BlockTerminalController.access$getOutputController$p(BlockTerminalController.this).isCommandRunning())
/*     */       BlockTerminalController.access$startCommandBlock(BlockTerminalController.this, $command, BlockTerminalController.access$getPromptController$p(BlockTerminalController.this).getModel().getRenderingInfo()); 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\BlockTerminalController$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */