/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptState;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.terminal.completion.spec.ShellCommandResult;
/*     */ import com.intellij.util.EventDispatcher;
/*     */ import com.jediterm.terminal.Terminal;
/*     */ import com.jediterm.terminal.TerminalStarter;
/*     */ import java.nio.charset.Charset;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Queue;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.coroutines.CompletableDeferred;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.plugins.terminal.util.ShellIntegration;
/*     */ import org.jetbrains.plugins.terminal.util.ShellType;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\020\013\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\b\004\n\002\030\002\n\002\b\013\b\000\030\000 @2\0020\001:\003>?@B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\004\b\f\020\rJ\b\020\037\032\0020\032H\026J\030\020 \032\0020!2\006\020\"\032\0020#2\006\020$\032\0020\032H\002J\020\020%\032\0020!2\006\020&\032\0020\032H\002J\020\020'\032\0020!2\006\020(\032\0020\032H\026J\020\020)\032\0020!2\006\020*\032\0020\027H\026J\026\020+\032\b\022\004\022\0020-0,2\006\020(\032\0020\032H\026J\b\020.\032\0020!H\002J\016\020/\032\b\030\0010\025R\0020\000H\002J\036\0200\032\b\022\004\022\002H201\"\004\b\000\0202*\b\022\004\022\002H20\024H\002J \0203\032\0020!2\006\020(\032\0020\0322\006\0204\032\0020\0342\006\020\"\032\0020#H\002J\030\0203\032\0020!2\006\0205\032\002062\006\020(\032\0020\032H\002J\020\0207\032\0020!2\006\0208\032\0020\020H\026J\030\0207\032\0020!2\006\0208\032\0020\0202\006\020\n\032\0020\013H\026J\020\0209\032\0020!2\006\020:\032\0020\032H\002J\020\020;\032\0020!2\006\020<\032\0020\032H\002J\020\020=\032\0020\0322\006\020\b\032\0020\tH\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\024\020\016\032\b\022\004\022\0020\0200\017X\004¢\006\002\n\000R\016\020\021\032\0020\022X\004¢\006\002\n\000R\030\020\023\032\f\022\b\022\0060\025R\0020\0000\024X\004¢\006\002\n\000R\024\020\026\032\b\022\004\022\0020\0270\024X\004¢\006\002\n\000R\024\020\030\032\b\030\0010\025R\0020\000X\016¢\006\002\n\000R\024\020\031\032\b\022\004\022\0020\0320\024X\004¢\006\002\n\000R\016\020\033\032\0020\034X\016¢\006\002\n\000R\016\020\035\032\0020\034X\016¢\006\002\n\000R\016\020\036\032\0020\034X\016¢\006\002\n\000¨\006A"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManager;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "commandManager", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;", "shellIntegration", "Lorg/jetbrains/plugins/terminal/util/ShellIntegration;", "terminal", "Lcom/jediterm/terminal/Terminal;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;Lorg/jetbrains/plugins/terminal/util/ShellIntegration;Lcom/jediterm/terminal/Terminal;Lcom/intellij/openapi/Disposable;)V", "listeners", "Lcom/intellij/util/EventDispatcher;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandSentListener;", "lock", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock;", "scheduledGenerators", "Ljava/util/Queue;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;", "scheduledKeyBindings", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/KeyBinding;", "runningGenerator", "scheduledCommands", "", "isInitialized", "", "isCommandRunning", "isCommandSent", "toString", "cancelGenerators", "", "registrar", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;", "incompatibleCondition", "debugStatus", "tag", "sendCommandToExecute", "shellCommand", "sendKeyBinding", "keyBinding", "runGeneratorAsync", "Lkotlinx/coroutines/Deferred;", "Lcom/intellij/terminal/completion/spec/ShellCommandResult;", "processQueueIfReady", "pollNextGeneratorToRun", "drainToList", "", "T", "doSendCommandToExecute", "isGenerator", "starter", "Lcom/jediterm/terminal/TerminalStarter;", "addListener", "listener", "fireUserCommandSent", "userCommand", "fireGeneratorCommandSent", "generatorCommand", "createClearPromptShortcut", "Generator", "Lock", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nShellCommandExecutionManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShellCommandExecutionManagerImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 ShellCommandManager.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n61#2,5:464\n62#2,4:471\n62#2,4:478\n14#2:487\n215#3,2:469\n217#3:475\n215#3,2:476\n217#3:482\n1863#4,2:483\n1863#4,2:485\n*S KotlinDebug\n*F\n+ 1 ShellCommandExecutionManagerImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl\n*L\n168#1:464,5\n327#1:471,4\n332#1:478,4\n406#1:487\n327#1:469,2\n327#1:475\n332#1:476,2\n332#1:482\n160#1:483,2\n243#1:485,2\n*E\n"})
/*     */ public final class ShellCommandExecutionManagerImpl implements ShellCommandExecutionManager {
/*     */   public ShellCommandExecutionManagerImpl(@NotNull BlockTerminalSession session, @NotNull ShellCommandManager commandManager, @NotNull ShellIntegration shellIntegration, @NotNull Terminal terminal, @NotNull Disposable parentDisposable) {
/*  35 */     this.session = session;
/*     */     
/*  37 */     this.shellIntegration = shellIntegration;
/*  38 */     this.terminal = terminal;
/*  39 */     this.parentDisposable = parentDisposable;
/*     */ 
/*     */     
/*  42 */     Intrinsics.checkNotNullExpressionValue(EventDispatcher.create(ShellCommandSentListener.class), "create(...)"); this.listeners = EventDispatcher.create(ShellCommandSentListener.class);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  47 */     this.lock = new Lock();
/*     */ 
/*     */     
/*  50 */     this.scheduledGenerators = new LinkedList<>();
/*     */ 
/*     */     
/*  53 */     this.scheduledKeyBindings = new LinkedList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  59 */     this.scheduledCommands = new LinkedList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  83 */     commandManager.addListener(new ShellCommandListener() { public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); } public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandHistoryReceived(String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void shellInfoReceived(String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); }
/*     */           
/*  85 */           public void initialized() { ShellCommandExecutionManagerImpl.this.debugStatus("<initialized>");
/*  86 */             ShellCommandExecutionManagerImpl.this.lock.withLock(ShellCommandExecutionManagerImpl.this::initialized$lambda$0);
/*     */ 
/*     */             
/*  89 */             ShellCommandExecutionManagerImpl.this.processQueueIfReady(); } private static final Unit initialized$lambda$0(ShellCommandExecutionManagerImpl this$0, ShellCommandExecutionManagerImpl.Lock.AfterLockActionRegistrar it) {
/*     */             Intrinsics.checkNotNullParameter(it, "it");
/*     */             ShellCommandExecutionManagerImpl.this.isInitialized = true;
/*     */             return Unit.INSTANCE;
/*     */           }
/*  94 */           public void commandStarted(String command) { Intrinsics.checkNotNullParameter(command, "command"); ShellCommandExecutionManagerImpl.this.debugStatus("commandStarted: " + command + ">");
/*  95 */             ShellCommandExecutionManagerImpl.this.lock.withLock(ShellCommandExecutionManagerImpl.this::commandStarted$lambda$1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 101 */             ShellCommandExecutionManagerImpl.this.processQueueIfReady(); } private static final Unit commandStarted$lambda$1(ShellCommandExecutionManagerImpl this$0, ShellCommandExecutionManagerImpl.Lock.AfterLockActionRegistrar it) { Intrinsics.checkNotNullParameter(it, "it"); if (ShellCommandExecutionManagerImpl.this.isCommandRunning)
/*     */               ShellCommandExecutionManagerImpl.LOG.warn("Received command_started event, but previous command wasn't finished"); 
/*     */             ShellCommandExecutionManagerImpl.this.isCommandRunning = true;
/*     */             return Unit.INSTANCE; }
/* 105 */           public void commandFinished(CommandFinishedEvent event) { Intrinsics.checkNotNullParameter(event, "event"); ShellCommandExecutionManagerImpl.this.debugStatus("commandFinished[?]: " + event + ">");
/* 106 */             ShellCommandExecutionManagerImpl.this.lock.withLock(ShellCommandExecutionManagerImpl.this::commandFinished$lambda$2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 113 */             ShellCommandExecutionManagerImpl.this.debugStatus("commandFinished[!!]-processQueue: " + event + ">");
/* 114 */             ShellCommandExecutionManagerImpl.this.processQueueIfReady(); }
/*     */            private static final Unit commandFinished$lambda$2(ShellCommandExecutionManagerImpl this$0, ShellCommandExecutionManagerImpl.Lock.AfterLockActionRegistrar it) {
/*     */             Intrinsics.checkNotNullParameter(it, "it");
/*     */             if (!ShellCommandExecutionManagerImpl.this.isCommandRunning)
/*     */               ShellCommandExecutionManagerImpl.LOG.warn("Received command_finished event, but command wasn't started"); 
/*     */             ShellCommandExecutionManagerImpl.this.isCommandSent = false;
/*     */             ShellCommandExecutionManagerImpl.this.isCommandRunning = false;
/*     */             return Unit.INSTANCE;
/*     */           } public void generatorFinished(GeneratorFinishedEvent event) {
/*     */             // Byte code:
/*     */             //   0: aload_1
/*     */             //   1: ldc 'event'
/*     */             //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */             //   6: aload_0
/*     */             //   7: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */             //   10: aload_1
/*     */             //   11: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent;)Ljava/lang/String;
/*     */             //   16: invokestatic access$debugStatus : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Ljava/lang/String;)V
/*     */             //   19: aload_0
/*     */             //   20: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */             //   23: invokestatic access$getLock$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock;
/*     */             //   26: aload_0
/*     */             //   27: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */             //   30: aload_1
/*     */             //   31: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent;)Lkotlin/jvm/functions/Function1;
/*     */             //   36: invokevirtual withLock : (Lkotlin/jvm/functions/Function1;)V
/*     */             //   39: aload_0
/*     */             //   40: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */             //   43: invokestatic access$processQueueIfReady : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;)V
/*     */             //   46: return
/*     */             // Line number table:
/*     */             //   Java source line number -> byte code offset
/*     */             //   #118	-> 6
/*     */             //   #119	-> 19
/*     */             //   #139	-> 39
/*     */             //   #140	-> 46
/*     */             // Local variable table:
/*     */             //   start	length	slot	name	descriptor
/*     */             //   0	47	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$1;
/*     */             //   0	47	1	event	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent;
/*     */           } private static final Unit generatorFinished$lambda$4(ShellCommandExecutionManagerImpl this$0, GeneratorFinishedEvent $event, ShellCommandExecutionManagerImpl.Lock.AfterLockActionRegistrar registrar) {
/*     */             // Byte code:
/*     */             //   0: aload_2
/*     */             //   1: ldc 'registrar'
/*     */             //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */             //   6: aload_0
/*     */             //   7: invokestatic access$getRunningGenerator$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */             //   10: ifnonnull -> 31
/*     */             //   13: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */             //   16: aload_1
/*     */             //   17: invokevirtual getRequestId : ()I
/*     */             //   20: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */             //   25: invokevirtual warn : (Ljava/lang/String;)V
/*     */             //   28: goto -> 58
/*     */             //   31: aload_0
/*     */             //   32: invokestatic access$getRunningGenerator$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */             //   35: dup
/*     */             //   36: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */             //   39: astore_3
/*     */             //   40: aload_0
/*     */             //   41: aconst_null
/*     */             //   42: invokestatic access$setRunningGenerator$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;)V
/*     */             //   45: aload_2
/*     */             //   46: aload_1
/*     */             //   47: aload_3
/*     */             //   48: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;)Lkotlin/jvm/functions/Function0;
/*     */             //   53: invokeinterface afterLock : (Lkotlin/jvm/functions/Function0;)V
/*     */             //   58: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */             //   61: areturn
/*     */             // Line number table:
/*     */             //   Java source line number -> byte code offset
/*     */             //   #120	-> 6
/*     */             //   #121	-> 13
/*     */             //   #124	-> 31
/*     */             //   #125	-> 40
/*     */             //   #126	-> 45
/*     */             //   #138	-> 58
/*     */             // Local variable table:
/*     */             //   start	length	slot	name	descriptor
/*     */             //   40	18	3	runningGeneratorLocal	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */             //   0	62	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */             //   0	62	1	$event	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent;
/*     */             //   0	62	2	registrar	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;
/*     */           }
/*     */           private static final Unit generatorFinished$lambda$4$lambda$3(GeneratorFinishedEvent $event, ShellCommandExecutionManagerImpl.Generator $runningGeneratorLocal) {
/* 128 */             ShellCommandResult result = ShellCommandResult.Companion.create($event.getOutput(), $event.getExitCode());
/*     */ 
/*     */ 
/*     */             
/* 132 */             String msg = "Received generator_finished event (request_id=" + $event.getRequestId() + "), but " + $runningGeneratorLocal + " was expected";
/* 133 */             ShellCommandExecutionManagerImpl.LOG.warn(msg);
/* 134 */             ($event.getRequestId() == $runningGeneratorLocal.getRequestId()) ? $runningGeneratorLocal.getDeferred().complete(result) : $runningGeneratorLocal.getDeferred().completeExceptionally(new IllegalStateException(msg));
/*     */             
/* 136 */             return Unit.INSTANCE;
/*     */           } }
/* 141 */         this.parentDisposable);
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 145 */     return getClass().getSimpleName() + "@" + getClass().getSimpleName();
/*     */   }
/*     */   private final void cancelGenerators(Lock.AfterLockActionRegistrar registrar, String incompatibleCondition) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield runningGenerator : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */     //   4: dup
/*     */     //   5: ifnull -> 29
/*     */     //   8: astore_3
/*     */     //   9: iconst_0
/*     */     //   10: istore #4
/*     */     //   12: aload_1
/*     */     //   13: aload_3
/*     */     //   14: aload_2
/*     */     //   15: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*     */     //   20: invokeinterface afterLock : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   25: nop
/*     */     //   26: goto -> 31
/*     */     //   29: pop
/*     */     //   30: nop
/*     */     //   31: aload_0
/*     */     //   32: aconst_null
/*     */     //   33: putfield runningGenerator : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */     //   36: aload_0
/*     */     //   37: aload_0
/*     */     //   38: getfield scheduledGenerators : Ljava/util/Queue;
/*     */     //   41: invokespecial drainToList : (Ljava/util/Queue;)Ljava/util/List;
/*     */     //   44: invokestatic nullize : (Ljava/util/List;)Ljava/util/List;
/*     */     //   47: dup
/*     */     //   48: ifnull -> 85
/*     */     //   51: astore_3
/*     */     //   52: iconst_0
/*     */     //   53: istore #4
/*     */     //   55: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   58: aload_3
/*     */     //   59: aload_2
/*     */     //   60: <illegal opcode> makeConcatWithConstants : (Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   65: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   68: aload_1
/*     */     //   69: aload_3
/*     */     //   70: aload_2
/*     */     //   71: <illegal opcode> invoke : (Ljava/util/List;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*     */     //   76: invokeinterface afterLock : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   81: nop
/*     */     //   82: goto -> 87
/*     */     //   85: pop
/*     */     //   86: nop
/*     */     //   87: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #149	-> 0
/*     */     //   #150	-> 12
/*     */     //   #155	-> 25
/*     */     //   #149	-> 26
/*     */     //   #149	-> 29
/*     */     //   #156	-> 31
/*     */     //   #157	-> 36
/*     */     //   #158	-> 55
/*     */     //   #159	-> 68
/*     */     //   #165	-> 81
/*     */     //   #157	-> 82
/*     */     //   #157	-> 85
/*     */     //   #166	-> 87
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   12	14	4	$i$a$-let-ShellCommandExecutionManagerImpl$cancelGenerators$1	I
/*     */     //   9	17	3	runningGenerator	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */     //   55	27	4	$i$a$-let-ShellCommandExecutionManagerImpl$cancelGenerators$2	I
/*     */     //   52	30	3	cancelledGenerators	Ljava/util/List;
/*     */     //   0	88	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */     //   0	88	1	registrar	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;
/*     */     //   0	88	2	incompatibleCondition	Ljava/lang/String;
/*     */   }
/*     */   
/* 151 */   private static final Unit cancelGenerators$lambda$1$lambda$0(Generator $runningGenerator, String $incompatibleCondition) { String msg = "Unexpectedly running " + $runningGenerator + ", but " + $incompatibleCondition;
/* 152 */     LOG.warn(msg);
/* 153 */     $runningGenerator.getDeferred().completeExceptionally(new IllegalStateException(msg));
/* 154 */     return Unit.INSTANCE; } private final void debugStatus(String tag) { // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   3: astore_2
/*     */     //   4: aconst_null
/*     */     //   5: astore_3
/*     */     //   6: iconst_0
/*     */     //   7: istore #4
/*     */     //   9: aload_2
/*     */     //   10: invokevirtual isDebugEnabled : ()Z
/*     */     //   13: ifeq -> 43
/*     */     //   16: aload_2
/*     */     //   17: astore #6
/*     */     //   19: iconst_0
/*     */     //   20: istore #5
/*     */     //   22: aload_1
/*     */     //   23: aload_0
/*     */     //   24: getfield isCommandSent : Z
/*     */     //   27: aload_0
/*     */     //   28: getfield isCommandRunning : Z
/*     */     //   31: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ZZ)Ljava/lang/String;
/*     */     //   36: aload #6
/*     */     //   38: swap
/*     */     //   39: aload_3
/*     */     //   40: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   43: nop
/*     */     //   44: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #168	-> 0
/*     */     //   #464	-> 4
/*     */     //   #465	-> 9
/*     */     //   #466	-> 16
/*     */     //   #169	-> 22
/*     */     //   #466	-> 39
/*     */     //   #468	-> 43
/*     */     //   #170	-> 44
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   22	14	5	$i$a$-debug$default-ShellCommandExecutionManagerImpl$debugStatus$1	I
/*     */     //   9	35	4	$i$f$debug	I
/*     */     //   4	40	2	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   6	38	3	e$iv	Ljava/lang/Exception;
/*     */     //   0	45	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */     //   0	45	1	tag	Ljava/lang/String; } public void sendCommandToExecute(@NotNull String shellCommand) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'shellCommand'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield lock : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock;
/*     */     //   10: aload_0
/*     */     //   11: aload_1
/*     */     //   12: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
/*     */     //   17: invokevirtual withLock : (Lkotlin/jvm/functions/Function1;)V
/*     */     //   20: aload_0
/*     */     //   21: invokespecial processQueueIfReady : ()V
/*     */     //   24: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #178	-> 6
/*     */     //   #188	-> 20
/*     */     //   #189	-> 24
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */     //   0	25	1	shellCommand	Ljava/lang/String; } private static final Unit sendCommandToExecute$lambda$6(ShellCommandExecutionManagerImpl this$0, String $shellCommand, Lock.AfterLockActionRegistrar it) { Intrinsics.checkNotNullParameter(it, "it"); this$0.debugStatus("commandSent:" + $shellCommand); if (this$0.isCommandSent || this$0.isCommandRunning) LOG.info("Command '" + $shellCommand + "' is postponed until currently running command is finished");  if (!this$0.isInitialized) LOG.info("Command '" + $shellCommand + "' is postponed until `initialized` event is received");  this$0.scheduledCommands.offer($shellCommand); return Unit.INSTANCE; } public void sendKeyBinding(@NotNull KeyBinding keyBinding) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'keyBinding'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getfield lock : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock;
/*     */     //   11: aload_0
/*     */     //   12: aload_1
/*     */     //   13: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/KeyBinding;)Lkotlin/jvm/functions/Function1;
/*     */     //   18: invokevirtual withLock : (Lkotlin/jvm/functions/Function1;)V
/*     */     //   21: aload_0
/*     */     //   22: invokespecial processQueueIfReady : ()V
/*     */     //   25: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #198	-> 7
/*     */     //   #201	-> 21
/*     */     //   #202	-> 25
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	26	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */     //   0	26	1	keyBinding	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/KeyBinding; } private static final Unit sendKeyBinding$lambda$7(ShellCommandExecutionManagerImpl this$0, KeyBinding $keyBinding, Lock.AfterLockActionRegistrar it) { Intrinsics.checkNotNullParameter(it, "it"); this$0.scheduledKeyBindings.offer($keyBinding); return Unit.INSTANCE; } @NotNull public Deferred<ShellCommandResult> runGeneratorAsync(@NotNull String shellCommand) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'shellCommand'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator
/*     */     //   9: dup
/*     */     //   10: aload_0
/*     */     //   11: aload_1
/*     */     //   12: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Ljava/lang/String;)V
/*     */     //   15: astore_2
/*     */     //   16: aload_0
/*     */     //   17: getfield lock : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock;
/*     */     //   20: aload_0
/*     */     //   21: aload_2
/*     */     //   22: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;)Lkotlin/jvm/functions/Function1;
/*     */     //   27: invokevirtual withLock : (Lkotlin/jvm/functions/Function1;)V
/*     */     //   30: aload_0
/*     */     //   31: invokespecial processQueueIfReady : ()V
/*     */     //   34: aload_2
/*     */     //   35: invokevirtual getDeferred : ()Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   38: checkcast kotlinx/coroutines/Deferred
/*     */     //   41: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #212	-> 6
/*     */     //   #213	-> 16
/*     */     //   #216	-> 30
/*     */     //   #217	-> 34
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   16	26	2	generator	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */     //   0	42	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */     //   0	42	1	shellCommand	Ljava/lang/String; } private static final Unit runGeneratorAsync$lambda$8(ShellCommandExecutionManagerImpl this$0, Generator $generator, Lock.AfterLockActionRegistrar it) { Intrinsics.checkNotNullParameter(it, "it"); this$0.scheduledGenerators.offer($generator); return Unit.INSTANCE; } private final void processQueueIfReady() { this.lock.withLock(this::processQueueIfReady$lambda$12); }
/*     */   private static final Unit processQueueIfReady$lambda$12(ShellCommandExecutionManagerImpl this$0, Lock.AfterLockActionRegistrar registrar) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'registrar'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getfield isInitialized : Z
/*     */     //   11: ifne -> 26
/*     */     //   14: aload_0
/*     */     //   15: aload_1
/*     */     //   16: ldc_w 'not initialized yet'
/*     */     //   19: invokespecial cancelGenerators : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;Ljava/lang/String;)V
/*     */     //   22: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   25: areturn
/*     */     //   26: aload_0
/*     */     //   27: ldc_w 'processQueueIfReady[?]'
/*     */     //   30: invokespecial debugStatus : (Ljava/lang/String;)V
/*     */     //   33: aload_0
/*     */     //   34: getfield isCommandSent : Z
/*     */     //   37: ifne -> 47
/*     */     //   40: aload_0
/*     */     //   41: getfield isCommandRunning : Z
/*     */     //   44: ifeq -> 59
/*     */     //   47: aload_0
/*     */     //   48: aload_1
/*     */     //   49: ldc_w 'command is running'
/*     */     //   52: invokespecial cancelGenerators : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;Ljava/lang/String;)V
/*     */     //   55: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   58: areturn
/*     */     //   59: aload_0
/*     */     //   60: getfield runningGenerator : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */     //   63: ifnull -> 70
/*     */     //   66: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   69: areturn
/*     */     //   70: aload_0
/*     */     //   71: aload_0
/*     */     //   72: getfield scheduledKeyBindings : Ljava/util/Queue;
/*     */     //   75: invokespecial drainToList : (Ljava/util/Queue;)Ljava/util/List;
/*     */     //   78: astore_2
/*     */     //   79: aload_2
/*     */     //   80: checkcast java/util/Collection
/*     */     //   83: invokeinterface isEmpty : ()Z
/*     */     //   88: ifne -> 95
/*     */     //   91: iconst_1
/*     */     //   92: goto -> 96
/*     */     //   95: iconst_0
/*     */     //   96: ifeq -> 257
/*     */     //   99: aload_2
/*     */     //   100: checkcast java/lang/Iterable
/*     */     //   103: astore_3
/*     */     //   104: iconst_0
/*     */     //   105: istore #4
/*     */     //   107: aload_3
/*     */     //   108: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   113: astore #5
/*     */     //   115: aload #5
/*     */     //   117: invokeinterface hasNext : ()Z
/*     */     //   122: ifeq -> 167
/*     */     //   125: aload #5
/*     */     //   127: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   132: astore #6
/*     */     //   134: aload #6
/*     */     //   136: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/KeyBinding
/*     */     //   139: astore #7
/*     */     //   141: iconst_0
/*     */     //   142: istore #8
/*     */     //   144: aload_0
/*     */     //   145: getfield session : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   148: invokevirtual getTerminalOutputStream$ej_core : ()Lcom/jediterm/terminal/TerminalOutputStream;
/*     */     //   151: aload #7
/*     */     //   153: invokevirtual getBytes : ()[B
/*     */     //   156: iconst_0
/*     */     //   157: invokeinterface sendBytes : ([BZ)V
/*     */     //   162: nop
/*     */     //   163: nop
/*     */     //   164: goto -> 115
/*     */     //   167: nop
/*     */     //   168: aload_0
/*     */     //   169: getfield shellIntegration : Lorg/jetbrains/plugins/terminal/util/ShellIntegration;
/*     */     //   172: invokevirtual getShellType : ()Lorg/jetbrains/plugins/terminal/util/ShellType;
/*     */     //   175: getstatic org/jetbrains/plugins/terminal/util/ShellType.BASH : Lorg/jetbrains/plugins/terminal/util/ShellType;
/*     */     //   178: if_acmpne -> 257
/*     */     //   181: aload_0
/*     */     //   182: aload_0
/*     */     //   183: getfield terminal : Lcom/jediterm/terminal/Terminal;
/*     */     //   186: invokespecial createClearPromptShortcut : (Lcom/jediterm/terminal/Terminal;)Ljava/lang/String;
/*     */     //   189: astore_3
/*     */     //   190: aload_0
/*     */     //   191: getfield terminal : Lcom/jediterm/terminal/Terminal;
/*     */     //   194: bipush #10
/*     */     //   196: iconst_0
/*     */     //   197: invokeinterface getCodeForKey : (II)[B
/*     */     //   202: dup
/*     */     //   203: ldc_w 'getCodeForKey(...)'
/*     */     //   206: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   209: astore #5
/*     */     //   211: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */     //   214: dup
/*     */     //   215: ldc_w 'UTF_8'
/*     */     //   218: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   221: astore #6
/*     */     //   223: new java/lang/String
/*     */     //   226: dup
/*     */     //   227: aload #5
/*     */     //   229: aload #6
/*     */     //   231: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
/*     */     //   234: astore #4
/*     */     //   236: aload_0
/*     */     //   237: getfield session : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   240: invokevirtual getTerminalOutputStream$ej_core : ()Lcom/jediterm/terminal/TerminalOutputStream;
/*     */     //   243: aload_3
/*     */     //   244: aload #4
/*     */     //   246: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   251: iconst_0
/*     */     //   252: invokeinterface sendString : (Ljava/lang/String;Z)V
/*     */     //   257: aload_0
/*     */     //   258: getfield scheduledCommands : Ljava/util/Queue;
/*     */     //   261: invokeinterface poll : ()Ljava/lang/Object;
/*     */     //   266: checkcast java/lang/String
/*     */     //   269: astore_3
/*     */     //   270: aload_3
/*     */     //   271: ifnull -> 312
/*     */     //   274: aload_3
/*     */     //   275: astore #5
/*     */     //   277: iconst_0
/*     */     //   278: istore #6
/*     */     //   280: aload_0
/*     */     //   281: aload_1
/*     */     //   282: ldc_w 'user command is ready to execute'
/*     */     //   285: invokespecial cancelGenerators : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;Ljava/lang/String;)V
/*     */     //   288: aload_0
/*     */     //   289: ldc_w 'before doSendToExecute'
/*     */     //   292: invokespecial debugStatus : (Ljava/lang/String;)V
/*     */     //   295: aload_0
/*     */     //   296: iconst_1
/*     */     //   297: putfield isCommandSent : Z
/*     */     //   300: aload_0
/*     */     //   301: aload #5
/*     */     //   303: iconst_0
/*     */     //   304: aload_1
/*     */     //   305: invokespecial doSendCommandToExecute : (Ljava/lang/String;ZLcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;)V
/*     */     //   308: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   311: areturn
/*     */     //   312: aload_0
/*     */     //   313: invokespecial pollNextGeneratorToRun : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */     //   316: dup
/*     */     //   317: ifnull -> 346
/*     */     //   320: astore #5
/*     */     //   322: iconst_0
/*     */     //   323: istore #6
/*     */     //   325: aload_0
/*     */     //   326: aload #5
/*     */     //   328: putfield runningGenerator : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */     //   331: aload_0
/*     */     //   332: aload #5
/*     */     //   334: invokevirtual shellCommand : ()Ljava/lang/String;
/*     */     //   337: iconst_1
/*     */     //   338: aload_1
/*     */     //   339: invokespecial doSendCommandToExecute : (Ljava/lang/String;ZLcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;)V
/*     */     //   342: nop
/*     */     //   343: goto -> 348
/*     */     //   346: pop
/*     */     //   347: nop
/*     */     //   348: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   351: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #228	-> 7
/*     */     //   #229	-> 14
/*     */     //   #230	-> 22
/*     */     //   #232	-> 26
/*     */     //   #233	-> 33
/*     */     //   #234	-> 47
/*     */     //   #235	-> 55
/*     */     //   #237	-> 59
/*     */     //   #238	-> 66
/*     */     //   #241	-> 70
/*     */     //   #242	-> 79
/*     */     //   #242	-> 96
/*     */     //   #243	-> 99
/*     */     //   #485	-> 107
/*     */     //   #244	-> 144
/*     */     //   #245	-> 162
/*     */     //   #485	-> 163
/*     */     //   #486	-> 167
/*     */     //   #246	-> 168
/*     */     //   #247	-> 181
/*     */     //   #248	-> 190
/*     */     //   #248	-> 234
/*     */     //   #249	-> 236
/*     */     //   #253	-> 257
/*     */     //   #254	-> 280
/*     */     //   #255	-> 288
/*     */     //   #256	-> 295
/*     */     //   #257	-> 300
/*     */     //   #258	-> 308
/*     */     //   #260	-> 312
/*     */     //   #261	-> 325
/*     */     //   #262	-> 331
/*     */     //   #264	-> 342
/*     */     //   #260	-> 343
/*     */     //   #260	-> 346
/*     */     //   #265	-> 348
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   144	19	8	$i$a$-forEach-ShellCommandExecutionManagerImpl$processQueueIfReady$1$1	I
/*     */     //   141	22	7	keyBinding	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/KeyBinding;
/*     */     //   134	30	6	element$iv	Ljava/lang/Object;
/*     */     //   107	61	4	$i$f$forEach	I
/*     */     //   104	64	3	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   190	67	3	clearPrompt	Ljava/lang/String;
/*     */     //   236	21	4	enterCode	Ljava/lang/String;
/*     */     //   280	32	6	$i$a$-let-ShellCommandExecutionManagerImpl$processQueueIfReady$1$2	I
/*     */     //   277	35	5	command	Ljava/lang/String;
/*     */     //   325	18	6	$i$a$-let-ShellCommandExecutionManagerImpl$processQueueIfReady$1$3	I
/*     */     //   322	21	5	it	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;
/*     */     //   79	273	2	keyBindings	Ljava/util/List;
/*     */     //   0	352	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */     //   0	352	1	registrar	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar; }
/*     */   private final Generator pollNextGeneratorToRun() { Generator generator = null; do { generator = this.scheduledGenerators.poll(); } while (generator != null && !generator.getDeferred().isActive()); return generator; }
/*     */   private final <T> List<T> drainToList(Queue $this$drainToList) { ArrayList<Object> arrayList1 = new ArrayList($this$drainToList.size()), it = arrayList1; int $i$a$-also-ShellCommandExecutionManagerImpl$drainToList$1 = 0; while (!$this$drainToList.isEmpty()) { Intrinsics.checkNotNull($this$drainToList.poll()); it.add($this$drainToList.poll()); }  return arrayList1; }
/*     */   private final void doSendCommandToExecute(String shellCommand, boolean isGenerator, Lock.AfterLockActionRegistrar registrar) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield session : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   4: invokevirtual getTerminalStarterFuture$ej_core : ()Ljava/util/concurrent/CompletableFuture;
/*     */     //   7: aload_0
/*     */     //   8: aload_1
/*     */     //   9: aload_3
/*     */     //   10: iload_2
/*     */     //   11: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;Z)Lkotlin/jvm/functions/Function1;
/*     */     //   16: <illegal opcode> accept : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
/*     */     //   21: invokevirtual thenAccept : (Ljava/util/function/Consumer;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   24: pop
/*     */     //   25: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #287	-> 0
/*     */     //   #300	-> 25
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	26	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */     //   0	26	1	shellCommand	Ljava/lang/String;
/*     */     //   0	26	2	isGenerator	Z
/*     */     //   0	26	3	registrar	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar; }
/*     */   private static final void doSendCommandToExecute$lambda$16(Function1 $tmp0, Object p0) { $tmp0.invoke(p0); }
/* 160 */   private static final Unit cancelGenerators$lambda$4$lambda$3(List $cancelledGenerators, String $incompatibleCondition) { Iterable $this$forEach$iv = $cancelledGenerators; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 483 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Generator it = (Generator)element$iv; int $i$a$-forEach-ShellCommandExecutionManagerImpl$cancelGenerators$2$1$1 = 0; }  return Unit.INSTANCE; }
/*     */   private static final Unit doSendCommandToExecute$lambda$15(ShellCommandExecutionManagerImpl this$0, String $shellCommand, Lock.AfterLockActionRegistrar $registrar, boolean $isGenerator, TerminalStarter starter) { // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: dup
/*     */     //   3: ifnonnull -> 11
/*     */     //   6: pop
/*     */     //   7: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   10: areturn
/*     */     //   11: pop
/*     */     //   12: aload_0
/*     */     //   13: aload #4
/*     */     //   15: aload_1
/*     */     //   16: invokespecial doSendCommandToExecute : (Lcom/jediterm/terminal/TerminalStarter;Ljava/lang/String;)V
/*     */     //   19: aload_2
/*     */     //   20: iload_3
/*     */     //   21: aload_0
/*     */     //   22: aload_1
/*     */     //   23: <illegal opcode> invoke : (ZLcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*     */     //   28: invokeinterface afterLock : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   33: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   36: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #288	-> 0
/*     */     //   #289	-> 12
/*     */     //   #290	-> 19
/*     */     //   #299	-> 33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	37	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/*     */     //   0	37	1	$shellCommand	Ljava/lang/String;
/*     */     //   0	37	2	$registrar	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;
/*     */     //   0	37	3	$isGenerator	Z
/*     */     //   0	37	4	starter	Lcom/jediterm/terminal/TerminalStarter; }
/*     */   private static final Unit doSendCommandToExecute$lambda$15$lambda$14(boolean $isGenerator, ShellCommandExecutionManagerImpl this$0, String $shellCommand) { if ($isGenerator) { this$0.fireGeneratorCommandSent($shellCommand); } else { this$0.fireUserCommandSent($shellCommand); }  return Unit.INSTANCE; }
/*     */   private final void doSendCommandToExecute(TerminalStarter starter, String shellCommand) { debugStatus("doSendCommandToExecute"); String adjustedCommand = shellCommand; Intrinsics.checkNotNullExpressionValue(this.terminal.getCodeForKey(10, 0), "getCodeForKey(...)"); byte[] arrayOfByte = this.terminal.getCodeForKey(10, 0); Intrinsics.checkNotNullExpressionValue(StandardCharsets.UTF_8, "UTF_8"); Charset charset = StandardCharsets.UTF_8; String enterCode = new String(arrayOfByte, charset); Intrinsics.checkNotNullExpressionValue(System.lineSeparator(), "lineSeparator(...)"); if (this.session.getModel().isBracketedPasteMode() && (StringsKt.contains$default(adjustedCommand, "\n", false, 2, null) || StringsKt.contains$default(adjustedCommand, System.lineSeparator(), false, 2, null))) { adjustedCommand = Companion.bracketed(adjustedCommand); } else { adjustedCommand = StringsKt.replace$default(adjustedCommand, "\n", enterCode, false, 4, null); }  String clearPrompt = createClearPromptShortcut(this.terminal); TerminalUtil.sendCommandToExecute(clearPrompt + clearPrompt, starter); }
/*     */   public void addListener(@NotNull ShellCommandSentListener listener) { Intrinsics.checkNotNullParameter(listener, "listener"); this.listeners.addListener(listener, this.parentDisposable); } public void addListener(@NotNull ShellCommandSentListener listener, @NotNull Disposable parentDisposable) { Intrinsics.checkNotNullParameter(listener, "listener"); Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable"); this.listeners.addListener(listener, parentDisposable); } private final void fireUserCommandSent(String userCommand) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield listeners : Lcom/intellij/util/EventDispatcher;
/*     */     //   4: invokevirtual getMulticaster : ()Ljava/util/EventListener;
/*     */     //   7: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandSentListener
/*     */     //   10: aload_1
/*     */     //   11: invokeinterface userCommandSent : (Ljava/lang/String;)V
/*     */     //   16: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   19: astore_2
/*     */     //   20: aconst_null
/*     */     //   21: astore_3
/*     */     //   22: iconst_0
/*     */     //   23: istore #4
/*     */     //   25: aload_2
/*     */     //   26: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   29: astore #5
/*     */     //   31: iconst_0
/*     */     //   32: istore #6
/*     */     //   34: aload #5
/*     */     //   36: invokevirtual isDebugEnabled : ()Z
/*     */     //   39: ifeq -> 62
/*     */     //   42: aload #5
/*     */     //   44: astore #8
/*     */     //   46: iconst_0
/*     */     //   47: istore #7
/*     */     //   49: aload_1
/*     */     //   50: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   55: aload #8
/*     */     //   57: swap
/*     */     //   58: aload_3
/*     */     //   59: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   62: nop
/*     */     //   63: nop
/*     */     //   64: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #326	-> 0
/*     */     //   #327	-> 16
/*     */     //   #469	-> 20
/*     */     //   #470	-> 25
/*     */     //   #471	-> 34
/*     */     //   #472	-> 42
/*     */     //   #327	-> 49
/*     */     //   #472	-> 58
/*     */     //   #474	-> 62
/*     */     //   #475	-> 63
/*     */     //   #328	-> 64
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	6	7	$i$a$-debug$ej_core$default-ShellCommandExecutionManagerImpl$fireUserCommandSent$1	I
/*     */     //   34	29	6	$i$f$debug	I
/*     */     //   31	32	5	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   25	39	4	$i$f$debug$ej_core	I
/*     */     //   20	44	2	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   22	42	3	e$iv	Ljava/lang/Exception;
/*     */     //   0	65	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/* 487 */     //   0	65	1	userCommand	Ljava/lang/String; } static { int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ShellCommandExecutionManagerImpl.class), "getInstance(...)"); } private final void fireGeneratorCommandSent(String generatorCommand) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield listeners : Lcom/intellij/util/EventDispatcher;
/*     */     //   4: invokevirtual getMulticaster : ()Ljava/util/EventListener;
/*     */     //   7: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandSentListener
/*     */     //   10: aload_1
/*     */     //   11: invokeinterface generatorCommandSent : (Ljava/lang/String;)V
/*     */     //   16: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   19: astore_2
/*     */     //   20: aconst_null
/*     */     //   21: astore_3
/*     */     //   22: iconst_0
/*     */     //   23: istore #4
/*     */     //   25: aload_2
/*     */     //   26: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   29: astore #5
/*     */     //   31: iconst_0
/*     */     //   32: istore #6
/*     */     //   34: aload #5
/*     */     //   36: invokevirtual isDebugEnabled : ()Z
/*     */     //   39: ifeq -> 62
/*     */     //   42: aload #5
/*     */     //   44: astore #8
/*     */     //   46: iconst_0
/*     */     //   47: istore #7
/*     */     //   49: aload_1
/*     */     //   50: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   55: aload #8
/*     */     //   57: swap
/*     */     //   58: aload_3
/*     */     //   59: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   62: nop
/*     */     //   63: nop
/*     */     //   64: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #331	-> 0
/*     */     //   #332	-> 16
/*     */     //   #476	-> 20
/*     */     //   #477	-> 25
/*     */     //   #478	-> 34
/*     */     //   #479	-> 42
/*     */     //   #332	-> 49
/*     */     //   #479	-> 58
/*     */     //   #481	-> 62
/*     */     //   #482	-> 63
/*     */     //   #333	-> 64
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	6	7	$i$a$-debug$ej_core$default-ShellCommandExecutionManagerImpl$fireGeneratorCommandSent$1	I
/*     */     //   34	29	6	$i$f$debug	I
/*     */     //   31	32	5	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   25	39	4	$i$f$debug$ej_core	I
/*     */     //   20	44	2	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   22	42	3	e$iv	Ljava/lang/Exception;
/*     */     //   0	65	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;
/* 487 */     //   0	65	1	generatorCommand	Ljava/lang/String; } private final String createClearPromptShortcut(Terminal terminal) { Intrinsics.checkNotNull(terminal.getCodeForKey(36, 2)); return (WhenMappings.$EnumSwitchMapping$0[this.shellIntegration.getShellType().ordinal()] == 1) ? (SystemInfo.isUnix ? "\025" : new String(terminal.getCodeForKey(36, 2), Charsets.UTF_8)) : "\025"; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\004\b\004\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\006\020\002\032\0020\003J\b\020\017\032\0020\003H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\tR\027\020\n\032\b\022\004\022\0020\f0\013¢\006\b\n\000\032\004\b\r\020\016¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;", "", "shellCommand", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Ljava/lang/String;)V", "requestId", "", "getRequestId", "()I", "deferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/intellij/terminal/completion/spec/ShellCommandResult;", "getDeferred", "()Lkotlinx/coroutines/CompletableDeferred;", "toString", "ej-core"}) private final class Generator { @NotNull private final String shellCommand; private final int requestId; @NotNull private final CompletableDeferred<ShellCommandResult> deferred; public Generator(String shellCommand) { this.shellCommand = shellCommand; this.requestId = ShellCommandExecutionManagerImpl.NEXT_REQUEST_ID.incrementAndGet(); this.deferred = CompletableDeferredKt.CompletableDeferred$default(null, 1, null); } public final int getRequestId() { return this.requestId; } @NotNull public final CompletableDeferred<ShellCommandResult> getDeferred() { return this.deferred; } @NotNull public final String shellCommand() { String str1 = (WhenMappings.$EnumSwitchMapping$0[ShellCommandExecutionManagerImpl.this.shellIntegration.getShellType().ordinal()] == 1) ? StringUtil.wrapWithDoubleQuote(ShellCommandExecutionManagerImpl.Companion.escapePowerShellParameter(this.shellCommand)) : ParametersListUtil.escape(this.shellCommand); Intrinsics.checkNotNull(str1); String escapedCommand = str1; return "__jetbrains_intellij_run_generator " + this.requestId + " " + escapedCommand; } @NotNull public String toString() { return "Generator(command=" + this.shellCommand + ", requestId=" + this.requestId + ")"; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001:\001\nB\007¢\006\004\b\002\020\003J\032\020\005\032\0020\0062\022\020\007\032\016\022\004\022\0020\t\022\004\022\0020\0060\bR\016\020\004\032\0020\001X\004¢\006\002\n\000¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock;", "", "<init>", "()V", "lock", "withLock", "", "block", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;", "AfterLockActionRegistrar", "ej-core"}) @SourceDebugExtension({"SMAP\nShellCommandExecutionManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShellCommandExecutionManagerImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n1863#2,2:464\n*S KotlinDebug\n*F\n+ 1 ShellCommandExecutionManagerImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock\n*L\n396#1:464,2\n*E\n"}) private static final class Lock { @NotNull private final Object lock = new Object(); public final void withLock(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); List<Function0<Unit>> afterLockBlocks = new ArrayList(); try { synchronized (this.lock) { int $i$a$-synchronized-ShellCommandExecutionManagerImpl$Lock$withLock$1 = 0; block.invoke(new ShellCommandExecutionManagerImpl$Lock$withLock$1$1(afterLockBlocks)); Unit unit = Unit.INSTANCE; }  } finally { Iterable<Function0<Unit>> $this$forEach$iv = afterLockBlocks; int $i$f$forEach = 0; Iterator<Function0<Unit>> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object<Unit> element$iv = (Object<Unit>)iterator.next(); Function0 it = (Function0)element$iv; int $i$a$-forEach-ShellCommandExecutionManagerImpl$Lock$withLock$2 = 0; it.invoke(); }  }  } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\026\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0030\005H&¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;", "", "afterLock", "", "block", "Lkotlin/Function0;", "ej-core"}) public static interface AfterLockActionRegistrar { void afterLock(@NotNull Function0<Unit> param2Function0); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0030\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$withLock$1$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;", "afterLock", "", "block", "Lkotlin/Function0;", "ej-core"}) public static final class ShellCommandExecutionManagerImpl$Lock$withLock$1$1 implements AfterLockActionRegistrar { ShellCommandExecutionManagerImpl$Lock$withLock$1$1(List<Function0<Unit>> $afterLockBlocks) {} public void afterLock(Function0<Unit> block) { Intrinsics.checkNotNullParameter(block, "block"); this.$afterLockBlocks.add(block); } } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020$\n\002\020\f\n\002\b\006\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\017\032\0020\t2\006\020\020\032\0020\tJ\020\020\021\032\0020\t2\006\020\022\032\0020\tH\002R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tXT¢\006\002\n\000R\016\020\n\032\0020\tXT¢\006\002\n\000R \020\013\032\016\022\004\022\0020\r\022\004\022\0020\t0\fX\004¢\006\b\n\000\022\004\b\016\020\003¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Companion;", "", "<init>", "()V", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "NEXT_REQUEST_ID", "Ljava/util/concurrent/atomic/AtomicInteger;", "GENERATOR_COMMAND", "", "SHORTCUT_CTRL_U", "pwshCharsToEscape", "", "", "getPwshCharsToEscape$annotations", "escapePowerShellParameter", "parameter", "bracketed", "command", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final String escapePowerShellParameter(@NotNull String parameter) { Intrinsics.checkNotNullParameter(parameter, "parameter"); int i = parameter.length(); StringBuilder stringBuilder1 = new StringBuilder(i), $this$escapePowerShellParameter_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-ShellCommandExecutionManagerImpl$Companion$escapePowerShellParameter$1 = 0; byte b; int j; for (b = 0, j = parameter.length(); b < j; ) { char ch = parameter.charAt(b); if ((String)ShellCommandExecutionManagerImpl.pwshCharsToEscape.get(Character.valueOf(ch)) == null) (String)ShellCommandExecutionManagerImpl.pwshCharsToEscape.get(Character.valueOf(ch));  ((String)ShellCommandExecutionManagerImpl.pwshCharsToEscape.get(Character.valueOf(ch))).append(Character.valueOf(ch)); b++; }  Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)"); return stringBuilder1.toString(); } private final String bracketed(String command) { return "\033[200~" + command + "\033[201~"; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private static final AtomicInteger NEXT_REQUEST_ID = new AtomicInteger(0); static { Pair[] arrayOfPair = new Pair[11]; arrayOfPair[0] = TuplesKt.to(Character.valueOf('`'), "``"); arrayOfPair[1] = TuplesKt.to(Character.valueOf('"'), "`\""); arrayOfPair[2] = TuplesKt.to(Character.valueOf(false), "`0"); arrayOfPair[3] = TuplesKt.to(Character.valueOf('\007'), "`a"); arrayOfPair[4] = TuplesKt.to(Character.valueOf('\b'), "`b"); arrayOfPair[5] = TuplesKt.to(Character.valueOf('\f'), "`f"); arrayOfPair[6] = TuplesKt.to(Character.valueOf('\n'), "`n"); arrayOfPair[7] = TuplesKt.to(Character.valueOf('\r'), "`r"); arrayOfPair[8] = TuplesKt.to(Character.valueOf('\t'), "`t"); arrayOfPair[9] = TuplesKt.to(Character.valueOf('\013'), "'v"); arrayOfPair[10] = TuplesKt.to(Character.valueOf('$'), "`$"); pwshCharsToEscape = MapsKt.mapOf(arrayOfPair); } @NotNull private static final Logger LOG = Logger.getInstance(ShellCommandExecutionManagerImpl.class);
/*     */   @NotNull
/*     */   private final BlockTerminalSession session;
/*     */   @NotNull
/*     */   private final ShellIntegration shellIntegration;
/*     */   @NotNull
/*     */   private final Terminal terminal;
/*     */   @NotNull
/*     */   private final Disposable parentDisposable;
/*     */   @NotNull
/*     */   private final EventDispatcher<ShellCommandSentListener> listeners;
/*     */   @NotNull
/*     */   private final Lock lock;
/*     */   @NotNull
/*     */   private final Queue<Generator> scheduledGenerators;
/*     */   @NotNull
/*     */   private final Queue<KeyBinding> scheduledKeyBindings;
/*     */   @Nullable
/*     */   private Generator runningGenerator;
/*     */   @NotNull
/*     */   private final Queue<String> scheduledCommands;
/*     */   private boolean isInitialized;
/*     */   private boolean isCommandRunning;
/*     */   private boolean isCommandSent;
/*     */   @NotNull
/*     */   private static final String GENERATOR_COMMAND = "__jetbrains_intellij_run_generator";
/*     */   @NotNull
/*     */   private static final String SHORTCUT_CTRL_U = "\025";
/*     */   @NotNull
/*     */   private static final Map<Character, String> pwshCharsToEscape;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\026\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0030\005H&¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Lock$AfterLockActionRegistrar;", "", "afterLock", "", "block", "Lkotlin/Function0;", "ej-core"})
/*     */   public static interface AfterLockActionRegistrar {
/*     */     void afterLock(@NotNull Function0<Unit> param1Function0);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandExecutionManagerImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */