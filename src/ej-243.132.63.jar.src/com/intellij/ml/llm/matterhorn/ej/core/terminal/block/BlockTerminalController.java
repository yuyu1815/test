/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*     */ 
/*     */ import com.intellij.find.FindModel;
/*     */ import com.intellij.find.SearchSession;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.BlockTerminalSearchSession;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.CommandBlock;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalOutputController;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalOutputModelListener;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptController;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptRenderingInfo;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.CommandFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.GeneratorFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandSentListener;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.actionSystem.DataKey;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import com.intellij.util.concurrency.annotations.RequiresEdt;
/*     */ import com.jediterm.core.util.TermSize;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000z\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\002\b\003\b\000\030\000 12\0020\001:\00201B7\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\006\020\f\032\0020\r¢\006\004\b\016\020\017J\016\020\030\032\0020\0312\006\020\032\032\0020\033J\020\020\034\032\0020\0312\006\020\035\032\0020\036H\007J\034\020\037\032\0020\0312\b\020\035\032\004\030\0010\0362\b\020 \032\004\030\0010!H\003J\020\020\"\032\0020\0312\006\020#\032\0020$H\002J\b\020%\032\0020\031H\007J\b\020&\032\0020\031H\007J\b\020'\032\0020\031H\007J\b\020(\032\0020\031H\002J\032\020)\032\0020\0312\006\020*\032\0020\0222\n\b\002\020+\032\004\030\0010,J\016\020-\032\b\022\004\022\0020/0.H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\016\020\f\032\0020\rX\004¢\006\002\n\000R\024\020\020\032\b\022\004\022\0020\0220\021X\004¢\006\002\n\000R\"\020\025\032\004\030\0010\0242\b\020\023\032\004\030\0010\024@BX\016¢\006\b\n\000\032\004\b\026\020\027¨\0062"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;", "", "project", "Lcom/intellij/openapi/project/Project;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "outputController", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;", "promptController", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController;", "selectionController", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionController;", "focusModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionController;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;)V", "listeners", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$BlockTerminalControllerListener;", "value", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession;", "searchSession", "getSearchSession", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession;", "resize", "", "newSize", "Lcom/jediterm/core/util/TermSize;", "startCommandExecution", "command", "", "startCommandBlock", "prompt", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "finishCommandBlock", "exitCode", "", "startSearchSession", "activateSearchSession", "finishSearchSession", "onSearchClosed", "addListener", "listener", "disposable", "Lcom/intellij/openapi/Disposable;", "getDisposed", "Lkotlin/Function0;", "", "BlockTerminalControllerListener", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nBlockTerminalController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1863#2,2:202\n1863#2,2:205\n1#3:204\n*S KotlinDebug\n*F\n+ 1 BlockTerminalController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController\n*L\n155#1:202,2\n175#1:205,2\n*E\n"})
/*     */ public final class BlockTerminalController {
/*  34 */   public BlockTerminalController(@NotNull Project project, @NotNull BlockTerminalSession session, @NotNull TerminalOutputController outputController, @NotNull TerminalPromptController promptController, @NotNull TerminalSelectionController selectionController, @NotNull TerminalFocusModel focusModel) { this.project = project;
/*  35 */     this.session = session;
/*  36 */     this.outputController = outputController;
/*  37 */     this.promptController = promptController;
/*  38 */     this.selectionController = selectionController;
/*  39 */     this.focusModel = focusModel;
/*     */     
/*  41 */     this.listeners = new CopyOnWriteArrayList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  47 */     BlockTerminalSession.addCommandListener$default(this.session, new ShellCommandListener() { public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); } public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandHistoryReceived(String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void generatorFinished(GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); }
/*     */           
/*  49 */           public void initialized() { BlockTerminalController.this.finishCommandBlock(0); }
/*     */           public void commandFinished(CommandFinishedEvent event) { Intrinsics.checkNotNullParameter(event, "event"); BlockTerminalController.this.finishCommandBlock(event.getExitCode()); TerminalUsageTriggerCollector.INSTANCE.triggerCommandFinished-Wn2Vu4Y(BlockTerminalController.this.project, event.getCommand(), event.getExitCode(), event.getDuration-UwyO8pc()); }
/*     */           public void commandStarted(String command) { // Byte code:
/*     */             //   0: aload_1
/*     */             //   1: ldc 'command'
/*     */             //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */             //   6: aload_0
/*     */             //   7: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;
/*     */             //   10: invokestatic access$getDisposed : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;)Lkotlin/jvm/functions/Function0;
/*     */             //   13: invokestatic any : ()Lcom/intellij/openapi/application/ModalityState;
/*     */             //   16: dup
/*     */             //   17: ldc 'any(...)'
/*     */             //   19: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */             //   22: aload_0
/*     */             //   23: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;
/*     */             //   26: aload_1
/*     */             //   27: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */             //   32: invokestatic invokeLater : (Lkotlin/jvm/functions/Function0;Lcom/intellij/openapi/application/ModalityState;Ljava/lang/Runnable;)V
/*     */             //   35: return
/*     */             // Line number table:
/*     */             //   Java source line number -> byte code offset
/*     */             //   #67	-> 6
/*     */             //   #72	-> 35
/*     */             // Local variable table:
/*     */             //   start	length	slot	name	descriptor
/*     */             //   0	36	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$1;
/*     */             //   0	36	1	command	Ljava/lang/String; } private static final void commandStarted$lambda$0(BlockTerminalController this$0, String $command) { if (!BlockTerminalController.this.outputController.isCommandRunning()) BlockTerminalController.this.startCommandBlock($command, BlockTerminalController.this.promptController.getModel().getRenderingInfo());  } }null, 2, null); this.session.getCommandExecutionManager$ej_core().addListener(new ShellCommandSentListener()
/*     */         {
/*     */           public void generatorCommandSent(String generatorCommand) { ShellCommandSentListener.DefaultImpls.generatorCommandSent(this, generatorCommand); } public void userCommandSent(String userCommand) { // Byte code:
/*     */             //   0: aload_1
/*     */             //   1: ldc 'userCommand'
/*     */             //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */             //   6: aload_0
/*     */             //   7: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;
/*     */             //   10: invokestatic access$getDisposed : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;)Lkotlin/jvm/functions/Function0;
/*     */             //   13: invokestatic any : ()Lcom/intellij/openapi/application/ModalityState;
/*     */             //   16: dup
/*     */             //   17: ldc 'any(...)'
/*     */             //   19: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */             //   22: aload_0
/*     */             //   23: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;
/*     */             //   26: aload_1
/*     */             //   27: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */             //   32: invokestatic invokeLaterIfNeeded : (Lkotlin/jvm/functions/Function0;Lcom/intellij/openapi/application/ModalityState;Ljava/lang/Runnable;)V
/*     */             //   35: return
/*     */             // Line number table:
/*     */             //   Java source line number -> byte code offset
/*     */             //   #77	-> 6
/*     */             //   #86	-> 35
/*     */             // Local variable table:
/*     */             //   start	length	slot	name	descriptor
/*     */             //   0	36	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$2;
/*     */             //   0	36	1	userCommand	Ljava/lang/String; } private static final void userCommandSent$lambda$1(BlockTerminalController this$0, String $userCommand) { // Byte code:
/*     */             //   0: aload_0
/*     */             //   1: invokestatic access$getOutputController$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;
/*     */             //   4: aload_0
/*     */             //   5: aload_1
/*     */             //   6: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*     */             //   11: invokevirtual doWhenNextBlockCanBeStarted : (Lkotlin/jvm/functions/Function0;)V
/*     */             //   14: return
/*     */             // Line number table:
/*     */             //   Java source line number -> byte code offset
/*     */             //   #82	-> 0
/*     */             //   #85	-> 14
/*     */             // Local variable table:
/*     */             //   start	length	slot	name	descriptor
/*     */             //   0	15	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;
/*  53 */             //   0	15	1	$userCommand	Ljava/lang/String; } public void shellInfoReceived(String rawShellInfo) { Intrinsics.checkNotNullParameter(rawShellInfo, "rawShellInfo"); Object $this$thisLogger$iv = this; int $i$f$thisLogger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 202 */             Intrinsics.checkNotNullExpressionValue(Logger.getInstance(null.class), "getInstance(...)"); Logger.getInstance(null.class).info("Started shell info: " + rawShellInfo); } private static final Unit userCommandSent$lambda$1$lambda$0(BlockTerminalController this$0, String $userCommand) { BlockTerminalController.this.startCommandBlock($userCommand, BlockTerminalController.this.promptController.getModel().getRenderingInfo()); return Unit.INSTANCE; } }); startCommandBlock(null, null); } @Nullable public final BlockTerminalSearchSession getSearchSession() { return this.searchSession; } public final void resize(@NotNull TermSize newSize) { Intrinsics.checkNotNullParameter(newSize, "newSize"); this.session.postResize(newSize); } @RequiresEdt public final void startCommandExecution(@NotNull String command) { Intrinsics.checkNotNullParameter(command, "command"); if (StringsKt.isBlank(command)) { TerminalPromptModelKt.clearCommandAndResetChangesHistory(this.promptController.getModel()); this.outputController.insertEmptyLine(); } else { this.session.getCommandExecutionManager$ej_core().sendCommandToExecute(command); TerminalUsageLocalStorage.Companion.getInstance().recordCommandExecuted(this.session.getShellIntegration().getShellType().toString()); }  TerminalUsageTriggerCollector.triggerCommandStarted(this.project, command, true); } @RequiresEdt(generateAssertion = false) private final void startCommandBlock(String command, TerminalPromptRenderingInfo prompt) { this.outputController.startCommandBlock(command, prompt); Intrinsics.checkNotNullExpressionValue(Disposer.newDisposable((Disposable)this.session), "newDisposable(...)"); Disposable disposable = Disposer.newDisposable((Disposable)this.session); this.outputController.getOutputModel().addListener(new BlockTerminalController$startCommandBlock$1(disposable), disposable); this.session.getModel().setCommandRunning(true); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$startCommandBlock$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelListener;", "blockCreated", "", "block", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "ej-core"}) public static final class BlockTerminalController$startCommandBlock$1 implements TerminalOutputModelListener { BlockTerminalController$startCommandBlock$1(Disposable $disposable) {} public void blockRemoved(CommandBlock block) { TerminalOutputModelListener.DefaultImpls.blockRemoved(this, block); } public void blockFinalized(CommandBlock block) { TerminalOutputModelListener.DefaultImpls.blockFinalized(this, block); } public void blockInfoUpdated(CommandBlock block, CommandBlockInfo newInfo) { TerminalOutputModelListener.DefaultImpls.blockInfoUpdated(this, block, newInfo); } public void blockCreated(CommandBlock block) { Intrinsics.checkNotNullParameter(block, "block"); BlockTerminalController.this.promptController.setPromptIsVisible(false); Disposer.dispose(this.$disposable); } } private final void finishCommandBlock(int exitCode) { this.outputController.finishCommandBlock(exitCode); this.session.getModel().setCommandRunning(false); Intrinsics.checkNotNullExpressionValue(ModalityState.any(), "any(...)"); TerminalUiUtilsKt.invokeLater(getDisposed(), ModalityState.any(), this::finishCommandBlock$lambda$0); } private static final void finishCommandBlock$lambda$0(BlockTerminalController this$0) { TerminalPromptModelKt.clearCommandAndResetChangesHistory(this$0.promptController.getModel()); this$0.promptController.setPromptIsVisible(true); } @RequiresEdt public final void startSearchSession() { FindModel findModel = new FindModel(); findModel.copyFrom(FindManager.getInstance(this.project).getFindInFileModel()); findModel.setWholeWordsOnly(false); BlockTerminalSearchSession.Companion.setSearchInBlock(findModel, (this.selectionController.getPrimarySelection() != null)); EditorEx editor = this.outputController.getOutputModel().getEditor(); FindUtil.configureFindModel(false, (Editor)editor, findModel, false); findModel.setGlobal(false); BlockTerminalSearchSession session = new BlockTerminalSearchSession(this.project, editor, findModel, this.outputController.getOutputModel(), this.outputController.getSelectionModel(), new BlockTerminalController$startSearchSession$session$1(this)); this.searchSession = session; Iterable<BlockTerminalControllerListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0; Iterator<BlockTerminalControllerListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); BlockTerminalControllerListener it = (BlockTerminalControllerListener)element$iv; int $i$a$-forEach-BlockTerminalController$startSearchSession$1 = 0; it.searchSessionStarted((SearchSession)session); }  session.getComponent().requestFocusInTheSearchFieldAndSelectContent(this.project); } @RequiresEdt public final void activateSearchSession() { BlockTerminalSearchSession session; if (this.searchSession == null) return;  EditorEx editor = this.outputController.getOutputModel().getEditor(); session.getComponent().requestFocusInTheSearchFieldAndSelectContent(this.project); FindUtil.configureFindModel(false, (Editor)editor, session.getFindModel(), false); BlockTerminalSearchSession.Companion.setSearchInBlock(session.getFindModel(), (this.selectionController.getPrimarySelection() != null)); session.getFindModel().setGlobal(false); }
/*     */   @RequiresEdt public final void finishSearchSession() { if (this.searchSession != null) { this.searchSession.close(); } else {  }  }
/* 204 */   private final void onSearchClosed() { BlockTerminalSearchSession session; Iterator<BlockTerminalControllerListener> iterator; if (this.searchSession != null) { session = this.searchSession; int $i$a$-let-BlockTerminalController$onSearchClosed$1 = 0; Iterable<BlockTerminalControllerListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0;
/* 205 */       iterator = $this$forEach$iv.iterator(); } else { this.searchSession = null; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); BlockTerminalControllerListener it = (BlockTerminalControllerListener)element$iv; int $i$a$-forEach-BlockTerminalController$onSearchClosed$1$1 = 0;
/*     */       it.searchSessionFinished((SearchSession)session); }
/*     */      }
/*     */ 
/*     */   
/*     */   public final void addListener(@NotNull BlockTerminalControllerListener listener, @Nullable Disposable disposable) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'listener'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getfield listeners : Ljava/util/List;
/*     */     //   11: aload_1
/*     */     //   12: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   17: pop
/*     */     //   18: aload_2
/*     */     //   19: ifnull -> 33
/*     */     //   22: aload_2
/*     */     //   23: aload_0
/*     */     //   24: aload_1
/*     */     //   25: <illegal opcode> dispose : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$BlockTerminalControllerListener;)Lcom/intellij/openapi/Disposable;
/*     */     //   30: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #184	-> 7
/*     */     //   #185	-> 18
/*     */     //   #186	-> 22
/*     */     //   #188	-> 33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;
/*     */     //   0	34	1	listener	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$BlockTerminalControllerListener;
/*     */     //   0	34	2	disposable	Lcom/intellij/openapi/Disposable;
/*     */   }
/*     */   
/*     */   private static final void addListener$lambda$4(BlockTerminalController this$0, BlockTerminalControllerListener $listener) {
/*     */     this$0.listeners.remove($listener);
/*     */   }
/*     */   
/*     */   private final Function0<Boolean> getDisposed() {
/*     */     return TerminalUiUtilsKt.getDisposed((Editor)this.outputController.getOutputModel().getEditor());
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$BlockTerminalControllerListener;", "", "searchSessionStarted", "", "session", "Lcom/intellij/find/SearchSession;", "searchSessionFinished", "ej-core"})
/*     */   public static interface BlockTerminalControllerListener {
/*     */     void searchSessionStarted(@NotNull SearchSession param1SearchSession);
/*     */     
/*     */     void searchSessionFinished(@NotNull SearchSession param1SearchSession);
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     public static final class DefaultImpls {
/*     */       public static void searchSessionStarted(@NotNull BlockTerminalController.BlockTerminalControllerListener $this, @NotNull SearchSession session) {
/*     */         Intrinsics.checkNotNullParameter(session, "session");
/*     */       }
/*     */       
/*     */       public static void searchSessionFinished(@NotNull BlockTerminalController.BlockTerminalControllerListener $this, @NotNull SearchSession session) {
/*     */         Intrinsics.checkNotNullParameter(session, "session");
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$Companion;", "", "<init>", "()V", "KEY", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;", "getKEY", "()Lcom/intellij/openapi/actionSystem/DataKey;", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final DataKey<BlockTerminalController> getKEY() {
/*     */       return BlockTerminalController.KEY;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final BlockTerminalSession session;
/*     */   @NotNull
/*     */   private final TerminalOutputController outputController;
/*     */   @NotNull
/*     */   private final TerminalPromptController promptController;
/*     */   @NotNull
/*     */   private final TerminalSelectionController selectionController;
/*     */   @NotNull
/*     */   private final TerminalFocusModel focusModel;
/*     */   @NotNull
/*     */   private final List<BlockTerminalControllerListener> listeners;
/*     */   @Nullable
/*     */   private BlockTerminalSearchSession searchSession;
/*     */   @NotNull
/*     */   private static final DataKey<BlockTerminalController> KEY = DataKey.Companion.create("Junie.BlockTerminalController");
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\BlockTerminalController.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */