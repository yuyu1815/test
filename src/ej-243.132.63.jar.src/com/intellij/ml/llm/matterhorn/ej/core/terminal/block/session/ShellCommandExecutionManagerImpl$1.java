/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptState;
/*     */ import com.intellij.terminal.completion.spec.ShellCommandResult;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J\020\020\004\032\0020\0032\006\020\005\032\0020\006H\026J\020\020\007\032\0020\0032\006\020\b\032\0020\tH\026J\020\020\n\032\0020\0032\006\020\b\032\0020\013H\026¨\006\f"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "initialized", "", "commandStarted", "command", "", "commandFinished", "event", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;", "generatorFinished", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent;", "ej-core"})
/*     */ public final class null
/*     */   implements ShellCommandListener
/*     */ {
/*     */   public void promptShown() {
/*  83 */     ShellCommandListener.DefaultImpls.promptShown(this); } public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandHistoryReceived(String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void shellInfoReceived(String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); }
/*     */   
/*  85 */   public void initialized() { ShellCommandExecutionManagerImpl.access$debugStatus(ShellCommandExecutionManagerImpl.this, "<initialized>");
/*  86 */     ShellCommandExecutionManagerImpl.access$getLock$p(ShellCommandExecutionManagerImpl.this).withLock(ShellCommandExecutionManagerImpl.this::initialized$lambda$0);
/*     */ 
/*     */     
/*  89 */     ShellCommandExecutionManagerImpl.access$processQueueIfReady(ShellCommandExecutionManagerImpl.this); }
/*     */   private static final Unit initialized$lambda$0(ShellCommandExecutionManagerImpl this$0, ShellCommandExecutionManagerImpl.Lock.AfterLockActionRegistrar it) { Intrinsics.checkNotNullParameter(it, "it"); ShellCommandExecutionManagerImpl.access$setInitialized$p(ShellCommandExecutionManagerImpl.this, true); return Unit.INSTANCE; }
/*     */   private static final Unit commandStarted$lambda$1(ShellCommandExecutionManagerImpl this$0, ShellCommandExecutionManagerImpl.Lock.AfterLockActionRegistrar it) { Intrinsics.checkNotNullParameter(it, "it"); if (ShellCommandExecutionManagerImpl.access$isCommandRunning$p(ShellCommandExecutionManagerImpl.this))
/*     */       ShellCommandExecutionManagerImpl.access$getLOG$cp().warn("Received command_started event, but previous command wasn't finished"); 
/*     */     ShellCommandExecutionManagerImpl.access$setCommandRunning$p(ShellCommandExecutionManagerImpl.this, true);
/*  94 */     return Unit.INSTANCE; } public void commandStarted(String command) { Intrinsics.checkNotNullParameter(command, "command"); ShellCommandExecutionManagerImpl.access$debugStatus(ShellCommandExecutionManagerImpl.this, "commandStarted: " + command + ">");
/*  95 */     ShellCommandExecutionManagerImpl.access$getLock$p(ShellCommandExecutionManagerImpl.this).withLock(ShellCommandExecutionManagerImpl.this::commandStarted$lambda$1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     ShellCommandExecutionManagerImpl.access$processQueueIfReady(ShellCommandExecutionManagerImpl.this); }
/*     */ 
/*     */   
/*     */   public void commandFinished(CommandFinishedEvent event) {
/* 105 */     Intrinsics.checkNotNullParameter(event, "event"); ShellCommandExecutionManagerImpl.access$debugStatus(ShellCommandExecutionManagerImpl.this, "commandFinished[?]: " + event + ">");
/* 106 */     ShellCommandExecutionManagerImpl.access$getLock$p(ShellCommandExecutionManagerImpl.this).withLock(ShellCommandExecutionManagerImpl.this::commandFinished$lambda$2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 113 */     ShellCommandExecutionManagerImpl.access$debugStatus(ShellCommandExecutionManagerImpl.this, "commandFinished[!!]-processQueue: " + event + ">");
/* 114 */     ShellCommandExecutionManagerImpl.access$processQueueIfReady(ShellCommandExecutionManagerImpl.this);
/*     */   } private static final Unit commandFinished$lambda$2(ShellCommandExecutionManagerImpl this$0, ShellCommandExecutionManagerImpl.Lock.AfterLockActionRegistrar it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     if (!ShellCommandExecutionManagerImpl.access$isCommandRunning$p(ShellCommandExecutionManagerImpl.this))
/*     */       ShellCommandExecutionManagerImpl.access$getLOG$cp().warn("Received command_finished event, but command wasn't started"); 
/*     */     ShellCommandExecutionManagerImpl.access$setCommandSent$p(ShellCommandExecutionManagerImpl.this, false);
/*     */     ShellCommandExecutionManagerImpl.access$setCommandRunning$p(ShellCommandExecutionManagerImpl.this, false);
/*     */     return Unit.INSTANCE;
/*     */   } public void generatorFinished(GeneratorFinishedEvent event) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'event'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */     //   10: aload_1
/*     */     //   11: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent;)Ljava/lang/String;
/*     */     //   16: invokestatic access$debugStatus : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Ljava/lang/String;)V
/*     */     //   19: aload_0
/*     */     //   20: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */     //   23: invokestatic access$getLock$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock;
/*     */     //   26: aload_0
/*     */     //   27: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */     //   30: aload_1
/*     */     //   31: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent;)Lkotlin/jvm/functions/Function1;
/*     */     //   36: invokevirtual withLock : (Lkotlin/jvm/functions/Function1;)V
/*     */     //   39: aload_0
/*     */     //   40: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */     //   43: invokestatic access$processQueueIfReady : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;)V
/*     */     //   46: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #118	-> 6
/*     */     //   #119	-> 19
/*     */     //   #139	-> 39
/*     */     //   #140	-> 46
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	47	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$1;
/*     */     //   0	47	1	event	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent;
/*     */   } private static final Unit generatorFinished$lambda$4(ShellCommandExecutionManagerImpl this$0, GeneratorFinishedEvent $event, ShellCommandExecutionManagerImpl.Lock.AfterLockActionRegistrar registrar) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 'registrar'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: invokestatic access$getRunningGenerator$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */     //   10: ifnonnull -> 31
/*     */     //   13: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   16: aload_1
/*     */     //   17: invokevirtual getRequestId : ()I
/*     */     //   20: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   25: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   28: goto -> 58
/*     */     //   31: aload_0
/*     */     //   32: invokestatic access$getRunningGenerator$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */     //   35: dup
/*     */     //   36: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   39: astore_3
/*     */     //   40: aload_0
/*     */     //   41: aconst_null
/*     */     //   42: invokestatic access$setRunningGenerator$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;)V
/*     */     //   45: aload_2
/*     */     //   46: aload_1
/*     */     //   47: aload_3
/*     */     //   48: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;)Lkotlin/jvm/functions/Function0;
/*     */     //   53: invokeinterface afterLock : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   58: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   61: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #120	-> 6
/*     */     //   #121	-> 13
/*     */     //   #124	-> 31
/*     */     //   #125	-> 40
/*     */     //   #126	-> 45
/*     */     //   #138	-> 58
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   40	18	3	runningGeneratorLocal	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */     //   0	62	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */     //   0	62	1	$event	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent;
/*     */     //   0	62	2	registrar	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;
/*     */   }
/*     */   private static final Unit generatorFinished$lambda$4$lambda$3(GeneratorFinishedEvent $event, ShellCommandExecutionManagerImpl.Generator $runningGeneratorLocal) {
/* 128 */     ShellCommandResult result = ShellCommandResult.Companion.create($event.getOutput(), $event.getExitCode());
/*     */ 
/*     */ 
/*     */     
/* 132 */     String msg = "Received generator_finished event (request_id=" + $event.getRequestId() + "), but " + $runningGeneratorLocal + " was expected";
/* 133 */     ShellCommandExecutionManagerImpl.access$getLOG$cp().warn(msg);
/* 134 */     ($event.getRequestId() == $runningGeneratorLocal.getRequestId()) ? $runningGeneratorLocal.getDeferred().complete(result) : $runningGeneratorLocal.getDeferred().completeExceptionally(new IllegalStateException(msg));
/*     */     
/* 136 */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandExecutionManagerImpl$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */