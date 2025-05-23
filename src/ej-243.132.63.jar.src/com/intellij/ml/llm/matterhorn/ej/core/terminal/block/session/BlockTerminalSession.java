/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalAlarmManager;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.actionSystem.DataKey;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.util.Key;
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import com.intellij.terminal.TerminalColorPalette;
/*     */ import com.jediterm.core.typeahead.TerminalTypeAheadManager;
/*     */ import com.jediterm.core.util.TermSize;
/*     */ import com.jediterm.terminal.Terminal;
/*     */ import com.jediterm.terminal.TerminalExecutorServiceManager;
/*     */ import com.jediterm.terminal.TerminalOutputStream;
/*     */ import com.jediterm.terminal.TerminalStarter;
/*     */ import com.jediterm.terminal.TtyConnector;
/*     */ import com.jediterm.terminal.model.JediTermDebouncerImpl;
/*     */ import com.jediterm.terminal.model.JediTermTypeAheadModel;
/*     */ import com.jediterm.terminal.model.JediTerminal;
/*     */ import com.jediterm.terminal.model.StyleState;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.plugins.terminal.shell_integration.CommandBlockIntegration;
/*     */ import org.jetbrains.plugins.terminal.util.ShellIntegration;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020!\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b\000\030\000 E2\0020\001:\001EB\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\016\0206\032\002072\006\0208\032\00209J\026\020:\032\002072\006\020;\032\002012\006\020<\032\0020\001J\016\020=\032\002072\006\020>\032\0020?J\030\020@\032\002072\006\020A\032\0020B2\b\b\002\020<\032\0020\001J\f\020C\032\00207*\00209H\002J\b\020D\032\00207H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b\022\020\023R\034\020\024\032\n\022\006\022\004\030\0010\0260\025X\004¢\006\b\n\000\032\004\b\027\020\030R\024\020\031\032\0020\032X\004¢\006\b\n\000\032\004\b\033\020\034R\016\020\035\032\0020\036X\004¢\006\002\n\000R\016\020\037\032\0020 X\004¢\006\002\n\000R\024\020!\032\0020\"X\004¢\006\b\n\000\032\004\b#\020$R\024\020%\032\0020&X\004¢\006\b\n\000\032\004\b'\020(R\024\020)\032\0020*X\004¢\006\b\n\000\032\004\b+\020,R\016\020-\032\0020.X\004¢\006\002\n\000R\024\020/\032\b\022\004\022\0020100X\004¢\006\002\n\000R\021\0202\032\00203¢\006\b\n\000\032\004\b4\0205¨\006F"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "Lcom/intellij/openapi/Disposable;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "colorPalette", "Lcom/intellij/terminal/TerminalColorPalette;", "shellIntegration", "Lorg/jetbrains/plugins/terminal/util/ShellIntegration;", "<init>", "(Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;Lcom/intellij/terminal/TerminalColorPalette;Lorg/jetbrains/plugins/terminal/util/ShellIntegration;)V", "getSettings", "()Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "getColorPalette", "()Lcom/intellij/terminal/TerminalColorPalette;", "getShellIntegration", "()Lorg/jetbrains/plugins/terminal/util/ShellIntegration;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;", "getModel", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;", "terminalStarterFuture", "Ljava/util/concurrent/CompletableFuture;", "Lcom/jediterm/terminal/TerminalStarter;", "getTerminalStarterFuture$ej_core", "()Ljava/util/concurrent/CompletableFuture;", "terminalOutputStream", "Lcom/jediterm/terminal/TerminalOutputStream;", "getTerminalOutputStream$ej_core", "()Lcom/jediterm/terminal/TerminalOutputStream;", "executorServiceManager", "Lcom/jediterm/terminal/TerminalExecutorServiceManager;", "textBuffer", "Lcom/jediterm/terminal/model/TerminalTextBuffer;", "controller", "Lcom/jediterm/terminal/model/JediTerminal;", "getController$ej_core", "()Lcom/jediterm/terminal/model/JediTerminal;", "commandManager", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;", "getCommandManager$ej_core", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;", "commandExecutionManager", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManager;", "getCommandExecutionManager$ej_core", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManager;", "typeAheadManager", "Lcom/jediterm/core/typeahead/TerminalTypeAheadManager;", "terminationListeners", "", "Ljava/lang/Runnable;", "commandBlockIntegration", "Lorg/jetbrains/plugins/terminal/shell_integration/CommandBlockIntegration;", "getCommandBlockIntegration", "()Lorg/jetbrains/plugins/terminal/shell_integration/CommandBlockIntegration;", "start", "", "ttyConnector", "Lcom/jediterm/terminal/TtyConnector;", "addTerminationCallback", "onTerminated", "parentDisposable", "postResize", "newSize", "Lcom/jediterm/core/util/TermSize;", "addCommandListener", "listener", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "closeSafely", "dispose", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nBlockTerminalSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalSession.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,157:1\n24#2:158\n24#2:159\n24#2:160\n*S KotlinDebug\n*F\n+ 1 BlockTerminalSession.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession\n*L\n132#1:158\n103#1:159\n94#1:160\n*E\n"})
/*     */ public final class BlockTerminalSession implements Disposable {
/*  33 */   public BlockTerminalSession(@NotNull JBTerminalSystemSettingsProviderBase settings, @NotNull TerminalColorPalette colorPalette, @NotNull ShellIntegration shellIntegration) { this.settings = settings;
/*  34 */     this.colorPalette = colorPalette;
/*  35 */     this.shellIntegration = shellIntegration;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  44 */     this.terminalStarterFuture = new CompletableFuture<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  52 */     this.terminalOutputStream = (TerminalOutputStream)new FutureTerminalOutputStream(this.terminalStarterFuture);
/*     */     
/*  54 */     this.executorServiceManager = (TerminalExecutorServiceManager)new TerminalExecutorServiceManagerImpl();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  61 */     this.terminationListeners = new CopyOnWriteArrayList<>();
/*  62 */     Intrinsics.checkNotNull(this.shellIntegration.getCommandBlockIntegration()); this.commandBlockIntegration = this.shellIntegration.getCommandBlockIntegration();
/*     */ 
/*     */     
/*  65 */     StyleState styleState = new StyleState();
/*  66 */     this.textBuffer = TerminalBuffer_VersionDependent.INSTANCE.createTerminalBuffer(
/*  67 */         80, 24, styleState, AdvancedSettings.Companion.getInt("terminal.buffer.max.lines.count"));
/*     */     
/*  69 */     this.model = new TerminalModel(this.textBuffer);
/*  70 */     TerminalAlarmManager alarmManager = new TerminalAlarmManager(this.settings);
/*  71 */     this.controller = new JediTerminal(new ModelUpdatingTerminalDisplay(alarmManager, this.model, this.settings), this.textBuffer, styleState);
/*     */     
/*  73 */     this.commandManager = new ShellCommandManager(this);
/*  74 */     Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.intellij.openapi.Disposable"); this.commandExecutionManager = new ShellCommandExecutionManagerImpl(this, this.commandManager, this.shellIntegration, (Terminal)this.controller, this);
/*     */ 
/*     */     
/*  77 */     this.commandManager.addListener((ShellCommandListener)alarmManager, this);
/*     */     
/*  79 */     JediTermTypeAheadModel typeAheadTerminalModel = new JediTermTypeAheadModel((Terminal)this.controller, this.textBuffer, (SettingsProvider)this.settings);
/*  80 */     this.typeAheadManager = new TerminalTypeAheadManager((TypeAheadTerminalModel)typeAheadTerminalModel);
/*  81 */     JediTermDebouncerImpl typeAheadDebouncer = new JediTermDebouncerImpl(this.typeAheadManager::debounce, TerminalTypeAheadManager.MAX_TERMINAL_DELAY, this.executorServiceManager);
/*  82 */     this.typeAheadManager.setClearPredictionsDebouncer((Debouncer)typeAheadDebouncer); }
/*     */    @NotNull
/*     */   public final JBTerminalSystemSettingsProviderBase getSettings() {
/*     */     return this.settings;
/*     */   } @NotNull
/*     */   public final TerminalColorPalette getColorPalette() {
/*     */     return this.colorPalette;
/*     */   } private static final void start$lambda$0(TerminalStarter $terminalStarter, BlockTerminalSession this$0, TtyConnector $ttyConnector) {
/*     */     try {
/*  91 */       $terminalStarter.start();
/*     */     }
/*  93 */     catch (Throwable t) {
/*  94 */       Object $this$thisLogger$iv = this$0; int $i$f$thisLogger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 160 */       Intrinsics.checkNotNullExpressionValue(Logger.getInstance(BlockTerminalSession.class), "getInstance(...)"); Logger.getInstance(BlockTerminalSession.class).error(t);
/*     */     } finally {
/*     */       this$0.closeSafely($ttyConnector);
/*     */       for (Runnable terminationListener : this$0.terminationListeners) {
/*     */         try {
/*     */           terminationListener.run();
/*     */         } catch (Throwable t) {
/*     */           Object $this$thisLogger$iv = this$0;
/*     */           int $i$f$thisLogger = 0;
/*     */           Intrinsics.checkNotNullExpressionValue(Logger.getInstance(BlockTerminalSession.class), "getInstance(...)");
/*     */           Logger.getInstance(BlockTerminalSession.class).error("Unhandled exception in termination listener", t);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ShellIntegration getShellIntegration() {
/*     */     return this.shellIntegration;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TerminalModel getModel() {
/*     */     return this.model;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CompletableFuture<TerminalStarter> getTerminalStarterFuture$ej_core() {
/*     */     return this.terminalStarterFuture;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TerminalOutputStream getTerminalOutputStream$ej_core() {
/*     */     return this.terminalOutputStream;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final JediTerminal getController$ej_core() {
/*     */     return this.controller;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ShellCommandManager getCommandManager$ej_core() {
/*     */     return this.commandManager;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ShellCommandExecutionManager getCommandExecutionManager$ej_core() {
/*     */     return this.commandExecutionManager;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CommandBlockIntegration getCommandBlockIntegration() {
/*     */     return this.commandBlockIntegration;
/*     */   }
/*     */   
/*     */   public final void start(@NotNull TtyConnector ttyConnector) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'ttyConnector'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: new com/jediterm/terminal/TerminalStarter
/*     */     //   10: dup
/*     */     //   11: aload_0
/*     */     //   12: getfield controller : Lcom/jediterm/terminal/model/JediTerminal;
/*     */     //   15: aload_1
/*     */     //   16: new com/jediterm/terminal/TtyBasedArrayDataStream
/*     */     //   19: dup
/*     */     //   20: aload_1
/*     */     //   21: invokespecial <init> : (Lcom/jediterm/terminal/TtyConnector;)V
/*     */     //   24: checkcast com/jediterm/terminal/TerminalDataStream
/*     */     //   27: aload_0
/*     */     //   28: getfield typeAheadManager : Lcom/jediterm/core/typeahead/TerminalTypeAheadManager;
/*     */     //   31: aload_0
/*     */     //   32: getfield executorServiceManager : Lcom/jediterm/terminal/TerminalExecutorServiceManager;
/*     */     //   35: invokespecial <init> : (Lcom/jediterm/terminal/model/JediTerminal;Lcom/jediterm/terminal/TtyConnector;Lcom/jediterm/terminal/TerminalDataStream;Lcom/jediterm/core/typeahead/TerminalTypeAheadManager;Lcom/jediterm/terminal/TerminalExecutorServiceManager;)V
/*     */     //   38: astore_2
/*     */     //   39: aload_0
/*     */     //   40: getfield terminalStarterFuture : Ljava/util/concurrent/CompletableFuture;
/*     */     //   43: aload_2
/*     */     //   44: invokevirtual complete : (Ljava/lang/Object;)Z
/*     */     //   47: pop
/*     */     //   48: aload_0
/*     */     //   49: getfield executorServiceManager : Lcom/jediterm/terminal/TerminalExecutorServiceManager;
/*     */     //   52: invokeinterface getUnboundedExecutorService : ()Ljava/util/concurrent/ExecutorService;
/*     */     //   57: aload_2
/*     */     //   58: aload_0
/*     */     //   59: aload_1
/*     */     //   60: <illegal opcode> run : (Lcom/jediterm/terminal/TerminalStarter;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/jediterm/terminal/TtyConnector;)Ljava/lang/Runnable;
/*     */     //   65: invokeinterface submit : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
/*     */     //   70: pop
/*     */     //   71: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #86	-> 7
/*     */     //   #87	-> 27
/*     */     //   #86	-> 35
/*     */     //   #88	-> 39
/*     */     //   #89	-> 48
/*     */     //   #108	-> 71
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   39	33	2	terminalStarter	Lcom/jediterm/terminal/TerminalStarter;
/*     */     //   0	72	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   0	72	1	ttyConnector	Lcom/jediterm/terminal/TtyConnector;
/*     */   }
/*     */   
/*     */   public final void addTerminationCallback(@NotNull Runnable onTerminated, @NotNull Disposable parentDisposable) {
/*     */     Intrinsics.checkNotNullParameter(onTerminated, "onTerminated");
/*     */     Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable");
/*     */     TerminalUtil.addItem(this.terminationListeners, onTerminated, parentDisposable);
/*     */   }
/*     */   
/*     */   public final void postResize(@NotNull TermSize newSize) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'newSize'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getfield terminalStarterFuture : Ljava/util/concurrent/CompletableFuture;
/*     */     //   11: aload_1
/*     */     //   12: aload_0
/*     */     //   13: <illegal opcode> invoke : (Lcom/jediterm/core/util/TermSize;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;)Lkotlin/jvm/functions/Function1;
/*     */     //   18: <illegal opcode> accept : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
/*     */     //   23: invokevirtual thenAccept : (Ljava/util/function/Consumer;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   26: pop
/*     */     //   27: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #115	-> 7
/*     */     //   #121	-> 27
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	28	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   0	28	1	newSize	Lcom/jediterm/core/util/TermSize;
/*     */   }
/*     */   
/*     */   private static final void postResize$lambda$2(Function1 $tmp0, Object p0) {
/*     */     $tmp0.invoke(p0);
/*     */   }
/*     */   
/*     */   private static final Unit postResize$lambda$1(TermSize $newSize, BlockTerminalSession this$0, TerminalStarter it) {
/*     */     if (it != null && ($newSize.getColumns() != this$0.model.getWidth() || $newSize.getRows() != this$0.model.getHeight())) {
/*     */       this$0.typeAheadManager.onResize();
/*     */       it.postResize($newSize, RequestOrigin.User);
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public final void addCommandListener(@NotNull ShellCommandListener listener, @NotNull Disposable parentDisposable) {
/*     */     Intrinsics.checkNotNullParameter(listener, "listener");
/*     */     Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable");
/*     */     this.commandManager.addListener(listener, parentDisposable);
/*     */   }
/*     */   
/*     */   private final void closeSafely(TtyConnector $this$closeSafely) {
/*     */     try {
/*     */       $this$closeSafely.close();
/*     */     } catch (Throwable t) {
/*     */       Object $this$thisLogger$iv = $this$closeSafely;
/*     */       int $i$f$thisLogger = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TtyConnector.class), "getInstance(...)");
/*     */       Logger.getInstance(TtyConnector.class).error("Error closing TtyConnector", t);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void dispose() {
/*     */     this.terminalStarterFuture.complete(null);
/*     */     TerminalStarter it = this.terminalStarterFuture.getNow(null);
/*     */     int $i$a$-let-BlockTerminalSession$dispose$1 = 0;
/*     */     it.requestEmulatorStop();
/*     */     if (ApplicationManager.getApplication().isUnitTestMode()) {
/*     */       Intrinsics.checkNotNullExpressionValue(it.getTtyConnector(), "getTtyConnector(...)");
/*     */       closeSafely(it.getTtyConnector());
/*     */     } else {
/*     */       it.close();
/*     */     } 
/*     */     (TerminalStarter)this.terminalStarterFuture.getNow(null);
/*     */     this.executorServiceManager.shutdownWhenAllExecuted();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\027\020\t\032\b\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession$Companion;", "", "<init>", "()V", "KEY", "Lcom/intellij/openapi/util/Key;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "getKEY", "()Lcom/intellij/openapi/util/Key;", "DATA_KEY", "Lcom/intellij/openapi/actionSystem/DataKey;", "getDATA_KEY", "()Lcom/intellij/openapi/actionSystem/DataKey;", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final Key<BlockTerminalSession> getKEY() {
/*     */       return BlockTerminalSession.KEY;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final DataKey<BlockTerminalSession> getDATA_KEY() {
/*     */       return BlockTerminalSession.DATA_KEY;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final JBTerminalSystemSettingsProviderBase settings;
/*     */   @NotNull
/*     */   private final TerminalColorPalette colorPalette;
/*     */   @NotNull
/*     */   private final ShellIntegration shellIntegration;
/*     */   @NotNull
/*     */   private final TerminalModel model;
/*     */   @NotNull
/*     */   private final CompletableFuture<TerminalStarter> terminalStarterFuture;
/*     */   @NotNull
/*     */   private final TerminalOutputStream terminalOutputStream;
/*     */   @NotNull
/*     */   private final TerminalExecutorServiceManager executorServiceManager;
/*     */   @NotNull
/*     */   private final TerminalTextBuffer textBuffer;
/*     */   @NotNull
/*     */   private final JediTerminal controller;
/*     */   @NotNull
/*     */   private final ShellCommandManager commandManager;
/*     */   @NotNull
/*     */   private final ShellCommandExecutionManager commandExecutionManager;
/*     */   @NotNull
/*     */   private final TerminalTypeAheadManager typeAheadManager;
/*     */   @NotNull
/*     */   private final List<Runnable> terminationListeners;
/*     */   @NotNull
/*     */   private final CommandBlockIntegration commandBlockIntegration;
/*     */   @NotNull
/*     */   private static final Key<BlockTerminalSession> KEY = Key.create("TerminalSession");
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(Key.create("TerminalSession"), "create(...)");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final DataKey<BlockTerminalSession> DATA_KEY = DataKey.Companion.create("Junie.TerminalSession");
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\BlockTerminalSession.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */