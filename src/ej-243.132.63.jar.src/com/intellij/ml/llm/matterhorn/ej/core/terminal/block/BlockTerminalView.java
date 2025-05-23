/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*     */ 
/*     */ import com.intellij.find.SearchSession;
/*     */ import com.intellij.ide.SaveAndSyncHandler;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalOutputView;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalSelectionController;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptController;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptView;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.CommandFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.GeneratorFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.TerminalModel;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.actionSystem.DataSink;
/*     */ import com.intellij.openapi.application.WriteIntentReadAction;
/*     */ import com.intellij.openapi.editor.event.DocumentEvent;
/*     */ import com.intellij.openapi.editor.event.DocumentListener;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import com.intellij.openapi.wm.IdeFocusManager;
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import com.intellij.ui.util.UiSizeUtilKt;
/*     */ import com.jediterm.core.util.TermSize;
/*     */ import com.jediterm.terminal.TtyConnector;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.geom.Dimension2D;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import javax.swing.JComponent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\b\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\b\000\030\0002\0020\0012\0020\002:\001FB'\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\004\b\013\020\fJ\030\020%\032\0020&2\006\020'\032\0020(2\006\020)\032\0020*H\026J\020\020+\032\0020&2\006\020,\032\0020-H\003J\b\020.\032\0020&H\002J\b\020/\032\0020&H\002J\030\0200\032\0020&2\006\0201\032\0020 2\006\0202\032\0020 H\002J\b\0203\032\0020&H\002J\020\0204\032\0020&2\006\0205\032\00206H\026J\b\0207\032\0020&H\002J\n\0208\032\004\030\0010*H\026J\f\0209\032\006\022\002\b\0030:H\026J\b\020;\032\0020-H\026J\030\020<\032\0020&2\006\020=\032\0020>2\006\020?\032\0020@H\026J\020\020A\032\0020&2\006\020B\032\00206H\026J\b\020C\032\0020&H\026J\016\020D\032\b\022\004\022\0020-0EH\002R\016\020\003\032\0020\004X\004¢\006\002\n\000R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\r\020\016R\016\020\007\032\0020\bX\004¢\006\002\n\000R\016\020\017\032\0020\020X\004¢\006\002\n\000R\016\020\021\032\0020\022X\004¢\006\002\n\000R\016\020\023\032\0020\024X\004¢\006\002\n\000R\021\020\025\032\0020\026¢\006\b\n\000\032\004\b\027\020\030R\021\020\031\032\0020\032¢\006\b\n\000\032\004\b\033\020\034R\020\020\035\032\004\030\0010\036X\016¢\006\002\n\000R\024\020\037\032\0020 X\004¢\006\b\n\000\032\004\b!\020\"R\024\020#\032\0020 8VX\004¢\006\006\032\004\b$\020\"¨\006G"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalContentView;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalCommandExecutor;", "project", "Lcom/intellij/openapi/project/Project;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "terminalTitle", "Lcom/intellij/terminal/TerminalTitle;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;Lcom/intellij/terminal/TerminalTitle;)V", "getSession", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "controller", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;", "selectionController", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionController;", "focusModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;", "outputView", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputView;", "getOutputView", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputView;", "promptView", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView;", "getPromptView", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView;", "alternateBufferView", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalView;", "component", "Ljavax/swing/JComponent;", "getComponent", "()Ljavax/swing/JComponent;", "preferredFocusableComponent", "getPreferredFocusableComponent", "connectToTty", "", "ttyConnector", "Lcom/jediterm/terminal/TtyConnector;", "initialTermSize", "Lcom/jediterm/core/util/TermSize;", "alternateBufferStateChanged", "enabled", "", "installAlternateBufferPanel", "installPromptAndOutput", "installTypingEventsForwarding", "origin", "destination", "installActions", "startCommandExecution", "command", "", "updateTerminalSize", "getTerminalSize", "getTerminalSizeInitializedFuture", "Ljava/util/concurrent/CompletableFuture;", "isFocused", "addTerminationCallback", "onTerminated", "Ljava/lang/Runnable;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "sendCommandToExecute", "shellCommand", "dispose", "getDisposed", "Lkotlin/Function0;", "BlockTerminalPanel", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nBlockTerminalView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalView.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
/*     */ public final class BlockTerminalView implements TerminalContentView, TerminalCommandExecutor {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final BlockTerminalSession session;
/*     */   @NotNull
/*     */   private final JBTerminalSystemSettingsProviderBase settings;
/*     */   @NotNull
/*     */   private final BlockTerminalController controller;
/*     */   @NotNull
/*     */   private final TerminalSelectionController selectionController;
/*     */   
/*  54 */   public BlockTerminalView(@NotNull Project project, @NotNull BlockTerminalSession session, @NotNull JBTerminalSystemSettingsProviderBase settings, @NotNull TerminalTitle terminalTitle) { this.project = project;
/*  55 */     this.session = session;
/*  56 */     this.settings = settings;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  61 */     this.focusModel = new TerminalFocusModel(this.project, this);
/*     */     
/*  63 */     this.outputView = new TerminalOutputView(this.project, this.session, this.settings, this.focusModel);
/*  64 */     this.promptView = new TerminalPromptView(this.project, this.settings, this.session, this);
/*     */ 
/*     */     
/*  67 */     this.component = new BlockTerminalPanel();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     this.selectionController = new TerminalSelectionController(this.focusModel, this.outputView.getController().getSelectionModel(), this.outputView.getController().getOutputModel());
/*  79 */     this.controller = new BlockTerminalController(this.project, this.session, this.outputView.getController(), this.promptView.getController(), this.selectionController, this.focusModel);
/*     */     
/*  81 */     Disposer.register(this, (Disposable)this.outputView);
/*  82 */     Disposer.register(this, (Disposable)this.promptView);
/*     */     
/*  84 */     this.promptView.getController().addListener(new TerminalPromptController.PromptStateListener() { public void commandSearchRequested() { TerminalPromptController.PromptStateListener.DefaultImpls.commandSearchRequested(this); } public void commandHistoryStateChanged(boolean showing) { TerminalPromptController.PromptStateListener.DefaultImpls.commandHistoryStateChanged(this, showing); }
/*     */            public void promptVisibilityChanged(boolean visible) {
/*  86 */             boolean wasActive = BlockTerminalView.this.focusModel.isActive();
/*  87 */             BlockTerminalView.this.getPromptView().getComponent().setVisible(visible);
/*  88 */             BlockTerminalView.this.getComponent().revalidate();
/*  89 */             if (wasActive) {
/*  90 */               IdeFocusManager.getInstance(BlockTerminalView.this.project).requestFocus(BlockTerminalView.this.getPreferredFocusableComponent(), true);
/*     */             }
/*     */           } }
/*     */       );
/*  94 */     this.promptView.getController().setPromptIsVisible(false);
/*     */     
/*  96 */     this.promptView.getController().getModel().getEditor().getDocument().addDocumentListener(new DocumentListener() {
/*     */           public void documentChanged(DocumentEvent event) {
/*  98 */             Intrinsics.checkNotNullParameter(event, "event"); if (UiSizeUtilKt.getPreferredHeight(BlockTerminalView.this.getPromptView().getComponent()) != BlockTerminalView.this.getPromptView().getComponent().getHeight()) {
/*  99 */               BlockTerminalView.this.getComponent().revalidate();
/*     */             }
/*     */           }
/*     */         });
/*     */     
/* 104 */     TerminalOutputController.addDocumentListener$default(this.outputView.getController(), new DocumentListener() {
/*     */           public void documentChanged(DocumentEvent event) {
/* 106 */             Intrinsics.checkNotNullParameter(event, "event"); BlockTerminalView.this.getComponent().revalidate();
/*     */           }
/*     */         }null, 2, null);
/*     */     
/* 110 */     getComponent().addComponentListener(new ComponentAdapter() {
/*     */           public void componentResized(ComponentEvent e) {
/* 112 */             BlockTerminalView.this.updateTerminalSize();
/*     */           }
/*     */         });
/*     */     
/* 116 */     getComponent().addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mousePressed(MouseEvent e) {
/* 119 */             Intrinsics.checkNotNullParameter(e, "e"); IdeFocusManager.getInstance(BlockTerminalView.this.project).requestFocus(BlockTerminalView.this.getPreferredFocusableComponent(), true);
/*     */           }
/*     */         });
/*     */     
/* 123 */     TerminalModel.addTerminalListener$default(this.session.getModel(), new TerminalModel.TerminalListener() { public void onSizeChanged(int width, int height) { TerminalModel.TerminalListener.DefaultImpls.onSizeChanged(this, width, height); } public void onWindowTitleChanged(String title) { TerminalModel.TerminalListener.DefaultImpls.onWindowTitleChanged(this, title); } public void onCommandRunningChanged(boolean isRunning) { TerminalModel.TerminalListener.DefaultImpls.onCommandRunningChanged(this, isRunning); } public void onBracketedPasteModeChanged(boolean bracketed) { TerminalModel.TerminalListener.DefaultImpls.onBracketedPasteModeChanged(this, bracketed); } public void onAlternateBufferChanged(boolean enabled) {
/*     */             // Byte code:
/*     */             //   0: aload_0
/*     */             //   1: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;
/*     */             //   4: invokestatic access$getDisposed : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;)Lkotlin/jvm/functions/Function0;
/*     */             //   7: invokestatic any : ()Lcom/intellij/openapi/application/ModalityState;
/*     */             //   10: dup
/*     */             //   11: ldc 'any(...)'
/*     */             //   13: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */             //   16: aload_0
/*     */             //   17: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;
/*     */             //   20: iload_1
/*     */             //   21: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;Z)Ljava/lang/Runnable;
/*     */             //   26: invokestatic invokeLater : (Lkotlin/jvm/functions/Function0;Lcom/intellij/openapi/application/ModalityState;Ljava/lang/Runnable;)V
/*     */             //   29: return
/*     */             // Line number table:
/*     */             //   Java source line number -> byte code offset
/*     */             //   #125	-> 0
/*     */             //   #128	-> 29
/*     */             // Local variable table:
/*     */             //   start	length	slot	name	descriptor
/*     */             //   0	30	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView$6;
/*     */             //   0	30	1	enabled	Z
/*     */           } private static final void onAlternateBufferChanged$lambda$0(BlockTerminalView this$0, boolean $enabled) {
/* 126 */             BlockTerminalView.this.alternateBufferStateChanged($enabled);
/*     */           } }
/*     */         null, 2, null);
/*     */ 
/*     */     
/* 131 */     TerminalTitleKt.bindApplicationTitle(terminalTitle, (Terminal)this.session.getController$ej_core(), this);
/*     */     
/* 133 */     BlockTerminalController.addListener$default(this.controller, new BlockTerminalController.BlockTerminalControllerListener() {
/*     */           public void searchSessionStarted(SearchSession session) {
/* 135 */             Intrinsics.checkNotNullParameter(session, "session"); Intrinsics.checkNotNullExpressionValue(session.getComponent(), "getComponent(...)"); BlockTerminalView.this.getOutputView().installSearchComponent(session.getComponent());
/*     */           }
/*     */           
/*     */           public void searchSessionFinished(SearchSession session) {
/* 139 */             Intrinsics.checkNotNullParameter(session, "session"); Intrinsics.checkNotNullExpressionValue(session.getComponent(), "getComponent(...)"); BlockTerminalView.this.getOutputView().removeSearchComponent(session.getComponent());
/*     */           }
/*     */         }null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 146 */     installTypingEventsForwarding(this.outputView.getPreferredFocusableComponent(), this.promptView.getPreferredFocusableComponent());
/*     */     
/* 148 */     installPromptAndOutput();
/*     */     
/* 150 */     installActions();
/*     */     
/* 152 */     TerminalFocusModel.addListener$default(this.focusModel, new TerminalFocusModel.TerminalFocusListener() { public void promptFocused() { TerminalFocusModel.TerminalFocusListener.DefaultImpls.promptFocused(this); }
/*     */           
/* 154 */           public void activeStateChanged(boolean isActive) { if (isActive) {
/* 155 */               if (GeneralSettings.Companion.getInstance().isSaveOnFrameDeactivation()) {
/* 156 */                 WriteIntentReadAction.run(null::activeStateChanged$lambda$0);
/*     */               
/*     */               }
/*     */             
/*     */             }
/*     */             else {
/*     */               
/* 163 */               SaveAndSyncHandler.Companion.getInstance().scheduleRefresh();
/*     */             }  }
/*     */           private static final void activeStateChanged$lambda$0() { FileDocumentManager.getInstance().saveAllDocuments(); }
/*     */         },  null, 2, null);
/* 167 */     this.session.getCommandManager$ej_core().addListener(new ShellCommandListener() { public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); } public void generatorFinished(GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void shellInfoReceived(String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void commandHistoryReceived(String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandStarted(String command) { ShellCommandListener.DefaultImpls.commandStarted(this, command); } public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); } public void initialized() { ShellCommandListener.DefaultImpls.initialized(this); }
/*     */            public void commandFinished(CommandFinishedEvent event) {
/* 169 */             Intrinsics.checkNotNullParameter(event, "event"); SaveAndSyncHandler.Companion.getInstance().scheduleRefresh();
/*     */           } }
/* 171 */         this); }
/*     */   @NotNull private final TerminalFocusModel focusModel;
/*     */   @NotNull private final TerminalOutputView outputView;
/*     */   @NotNull private final TerminalPromptView promptView;
/* 175 */   @Nullable private SimpleTerminalView alternateBufferView; @NotNull private final JComponent component; @NotNull public final BlockTerminalSession getSession() { return this.session; } @NotNull public final TerminalOutputView getOutputView() { return this.outputView; } @NotNull public final TerminalPromptView getPromptView() { return this.promptView; } @NotNull public JComponent getComponent() { return this.component; } @NotNull public JComponent getPreferredFocusableComponent() { Intrinsics.checkNotNull(this.alternateBufferView); Intrinsics.checkNotNull(this.controller.getSearchSession()); Intrinsics.checkNotNullExpressionValue(this.controller.getSearchSession().getComponent().getSearchTextComponent(), "getSearchTextComponent(...)"); return (this.alternateBufferView != null) ? this.alternateBufferView.getPreferredFocusableComponent() : ((this.controller.getSearchSession() != null) ? this.controller.getSearchSession().getComponent().getSearchTextComponent() : ((this.promptView.getComponent().isVisible() && this.selectionController.getPrimarySelection() == null) ? this.promptView.getPreferredFocusableComponent() : this.outputView.getPreferredFocusableComponent())); } public void connectToTty(@NotNull TtyConnector ttyConnector, @NotNull TermSize initialTermSize) { Intrinsics.checkNotNullParameter(ttyConnector, "ttyConnector"); Intrinsics.checkNotNullParameter(initialTermSize, "initialTermSize"); this.session.getController$ej_core().resize(initialTermSize, RequestOrigin.User);
/* 176 */     this.session.start(ttyConnector); }
/*     */ 
/*     */   
/*     */   @RequiresEdt(generateAssertion = false)
/*     */   private final void alternateBufferStateChanged(boolean enabled) {
/* 181 */     if (enabled)
/* 182 */     { installAlternateBufferPanel(); }
/*     */     else
/*     */     
/* 185 */     { if (this.alternateBufferView != null) { SimpleTerminalView it = this.alternateBufferView;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 345 */         int $i$a$-let-BlockTerminalView$alternateBufferStateChanged$1 = 0; Disposer.dispose(it); } else {  }  this.alternateBufferView = null; installPromptAndOutput(); }  this.outputView.getController().alternateBufferStateChanged$ej_core(enabled); IdeFocusManager.getInstance(this.project).requestFocus(getPreferredFocusableComponent(), true); Intrinsics.checkNotNullExpressionValue(ModalityState.any(), "any(...)"); TerminalUiUtilsKt.invokeLater(getDisposed(), ModalityState.any(), this::alternateBufferStateChanged$lambda$1); } private static final void alternateBufferStateChanged$lambda$1(BlockTerminalView this$0) { this$0.updateTerminalSize(); } private final void installAlternateBufferPanel() { SimpleTerminalView view = new SimpleTerminalView(this.project, this.settings, this.session, false); Disposer.register(this, view); this.alternateBufferView = view; JComponent $this$installAlternateBufferPanel_u24lambda_u242 = getComponent(); int $i$a$-with-BlockTerminalView$installAlternateBufferPanel$1 = 0; $this$installAlternateBufferPanel_u24lambda_u242.removeAll(); $this$installAlternateBufferPanel_u24lambda_u242.add(view.getComponent()); $this$installAlternateBufferPanel_u24lambda_u242.revalidate(); } @Nullable public TermSize getTerminalSize() { Intrinsics.checkNotNull(this.alternateBufferView); SimpleTerminalView simpleTerminalView = this.alternateBufferView; int $i$a$-let-BlockTerminalView$getTerminalSize$1 = 0; TerminalPromptView it = this.promptView; int $i$a$-let-BlockTerminalView$getTerminalSize$2 = 0;
/*     */     Pair pair = (this.alternateBufferView != null) ? TuplesKt.to(Integer.valueOf(simpleTerminalView.getTerminalWidth()), simpleTerminalView.getCharSize()) : TuplesKt.to(Integer.valueOf(it.getTerminalWidth()), it.getCharSize());
/*     */     int width = ((Number)pair.component1()).intValue();
/*     */     Dimension2D charSize = (Dimension2D)pair.component2();
/*     */     return (width > 0 && getComponent().getHeight() > 0) ? TerminalUiUtils.INSTANCE.calculateTerminalSize(new Dimension(width, getComponent().getHeight()), charSize) : null; }
/*     */ 
/*     */   
/*     */   private final void installPromptAndOutput() {
/*     */     JComponent $this$installPromptAndOutput_u24lambda_u243 = getComponent();
/*     */     int $i$a$-with-BlockTerminalView$installPromptAndOutput$1 = 0;
/*     */     $this$installPromptAndOutput_u24lambda_u243.removeAll();
/*     */     $this$installPromptAndOutput_u24lambda_u243.add(this.outputView.getComponent());
/*     */     $this$installPromptAndOutput_u24lambda_u243.add(this.promptView.getComponent());
/*     */     $this$installPromptAndOutput_u24lambda_u243.revalidate();
/*     */   }
/*     */   
/*     */   private final void installTypingEventsForwarding(JComponent origin, JComponent destination) {
/*     */     origin.addKeyListener(new BlockTerminalView$installTypingEventsForwarding$1(this));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView$installTypingEventsForwarding$1", "Ljava/awt/event/KeyAdapter;", "keyTyped", "", "e", "Ljava/awt/event/KeyEvent;", "ej-core"})
/*     */   public static final class BlockTerminalView$installTypingEventsForwarding$1 extends KeyAdapter {
/*     */     BlockTerminalView$installTypingEventsForwarding$1(BlockTerminalView $receiver) {}
/*     */     
/*     */     public void keyTyped(KeyEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       if (e.getID() == 400 && this.$destination.isShowing()) {
/*     */         e.consume();
/*     */         IdeFocusManager.getInstance(BlockTerminalView.this.project).requestFocus(this.$destination, true);
/*     */         KeyEvent newEvent = new KeyEvent(this.$destination, e.getID(), e.getWhen(), e.getModifiers(), e.getKeyCode(), e.getKeyChar(), e.getKeyLocation());
/*     */         this.$destination.dispatchEvent(newEvent);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private final void installActions() {}
/*     */   
/*     */   public void startCommandExecution(@NotNull String command) {
/*     */     Intrinsics.checkNotNullParameter(command, "command");
/*     */     this.controller.startCommandExecution(command);
/*     */   }
/*     */   
/*     */   private final void updateTerminalSize() {
/*     */     if (getTerminalSizeInitializedFuture().isDone()) {
/*     */       TermSize newSize;
/*     */       if (getTerminalSize() == null) {
/*     */         getTerminalSize();
/*     */         return;
/*     */       } 
/*     */       this.controller.resize(newSize);
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public CompletableFuture<?> getTerminalSizeInitializedFuture() {
/*     */     CompletableFuture componentSizeInitializedFuture = TerminalUiUtils.INSTANCE.getComponentSizeInitializedFuture(getComponent());
/*     */     CompletableFuture terminalWidthInitializedFuture = this.promptView.getTerminalWidthInitializedFuture();
/*     */     CompletableFuture[] arrayOfCompletableFuture = new CompletableFuture[2];
/*     */     arrayOfCompletableFuture[0] = componentSizeInitializedFuture;
/*     */     arrayOfCompletableFuture[1] = terminalWidthInitializedFuture;
/*     */     Intrinsics.checkNotNullExpressionValue(CompletableFuture.allOf((CompletableFuture<?>[])arrayOfCompletableFuture), "allOf(...)");
/*     */     return CompletableFuture.allOf((CompletableFuture<?>[])arrayOfCompletableFuture);
/*     */   }
/*     */   
/*     */   public boolean isFocused() {
/*     */     return (this.outputView.getComponent().hasFocus() || this.promptView.getComponent().hasFocus());
/*     */   }
/*     */   
/*     */   public void addTerminationCallback(@NotNull Runnable onTerminated, @NotNull Disposable parentDisposable) {
/*     */     Intrinsics.checkNotNullParameter(onTerminated, "onTerminated");
/*     */     Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable");
/*     */     this.session.addTerminationCallback(onTerminated, parentDisposable);
/*     */   }
/*     */   
/*     */   public void sendCommandToExecute(@NotNull String shellCommand) {
/*     */     Intrinsics.checkNotNullParameter(shellCommand, "shellCommand");
/*     */     this.controller.startCommandExecution(shellCommand);
/*     */   }
/*     */   
/*     */   public void dispose() {}
/*     */   
/*     */   private final Function0<Boolean> getDisposed() {
/*     */     return TerminalUiUtilsKt.getDisposed((Editor)this.outputView.getController().getOutputModel().getEditor());
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\004\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J\020\020\005\032\0020\0062\006\020\007\032\0020\bH\026J\b\020\t\032\0020\006H\026J\020\020\n\032\0020\0062\006\020\013\032\0020\fH\002¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView$BlockTerminalPanel;", "Ljavax/swing/JPanel;", "Lcom/intellij/openapi/actionSystem/UiDataProvider;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;)V", "uiDataSnapshot", "", "sink", "Lcom/intellij/openapi/actionSystem/DataSink;", "doLayout", "layoutPromptAndOutput", "rect", "Ljava/awt/Rectangle;", "ej-core"})
/*     */   private final class BlockTerminalPanel extends JPanel implements UiDataProvider {
/*     */     public BlockTerminalPanel() {
/*     */       setBackground((Color)TerminalUi.INSTANCE.defaultBackground((Editor)BlockTerminalView.this.getOutputView().getController().getOutputModel().getEditor()));
/*     */     }
/*     */     
/*     */     public void uiDataSnapshot(@NotNull DataSink sink) {
/*     */       Intrinsics.checkNotNullParameter(sink, "sink");
/*     */       sink.set(TerminalPromptController.Companion.getKEY(), BlockTerminalView.this.getPromptView().getController());
/*     */       sink.set(TerminalOutputController.Companion.getKEY(), BlockTerminalView.this.getOutputView().getController());
/*     */       sink.set(TerminalOutputModel.Companion.getKEY(), BlockTerminalView.this.getOutputView().getController().getOutputModel());
/*     */       BlockTerminalView.this.alternateBufferView;
/*     */       sink.set(SimpleTerminalController.Companion.getKEY(), (BlockTerminalView.this.alternateBufferView != null) ? BlockTerminalView.this.alternateBufferView.getController() : null);
/*     */       sink.set(BlockTerminalController.Companion.getKEY(), BlockTerminalView.this.controller);
/*     */       sink.set(TerminalSelectionController.Companion.getKEY(), BlockTerminalView.this.selectionController);
/*     */       sink.set(TerminalFocusModel.Companion.getKEY(), BlockTerminalView.this.focusModel);
/*     */       sink.set(BlockTerminalSession.Companion.getDATA_KEY(), BlockTerminalView.this.getSession());
/*     */     }
/*     */     
/*     */     public void doLayout() {
/*     */       Component component;
/*     */       Rectangle rect = getBounds();
/*     */       JBInsets.removeFrom(rect, getInsets());
/*     */       switch (getComponentCount()) {
/*     */         case 1:
/*     */           component = getComponent(0);
/*     */           component.setBounds(rect);
/*     */           return;
/*     */         case 2:
/*     */           Intrinsics.checkNotNull(rect);
/*     */           layoutPromptAndOutput(rect);
/*     */           return;
/*     */       } 
/*     */       throw new IllegalStateException("Maximum 2 components expected".toString());
/*     */     }
/*     */     
/*     */     private final void layoutPromptAndOutput(Rectangle rect) {
/*     */       Component topComponent = getComponent(0);
/*     */       Component bottomComponent = getComponent(1);
/*     */       Dimension topPrefSize = topComponent.isVisible() ? topComponent.getPreferredSize() : new Dimension();
/*     */       Dimension bottomPrefSize = bottomComponent.isVisible() ? bottomComponent.getPreferredSize() : new Dimension();
/*     */       int bottomHeight = Math.max(rect.height - topPrefSize.height, bottomPrefSize.height);
/*     */       int topHeight = rect.height - bottomHeight;
/*     */       topComponent.setBounds(new Rectangle(rect.x, rect.y, rect.width, topHeight));
/*     */       bottomComponent.setBounds(new Rectangle(rect.x, rect.y + topHeight, rect.width, bottomHeight));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\BlockTerminalView.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */