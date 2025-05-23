/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.error.TerminalPromptErrorDescription;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.lang.TerminalPromptFileType;
/*     */ import com.intellij.openapi.actionSystem.ActionGroup;
/*     */ import com.intellij.openapi.actionSystem.ActionManager;
/*     */ import com.intellij.openapi.actionSystem.ActionToolbar;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.colors.EditorColorsScheme;
/*     */ import com.intellij.openapi.editor.impl.EditorImpl;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.CheckedDisposable;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import com.intellij.ui.EditorTextField;
/*     */ import com.intellij.util.ui.JBInsets;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Rectangle;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.border.Border;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\006\b\000\030\0002\0020\0012\0020\002:\0017B'\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\004\b\013\020\fJ\n\020+\032\006\022\002\b\0030*J\020\020,\032\0020-2\006\020.\032\0020/H\026J\b\0200\032\0020-H\026J\b\0201\032\00202H\002J\020\0203\032\0020(2\006\0204\032\0020\022H\002J\024\0205\032\006\022\002\b\0030*2\006\020'\032\0020(H\003J\b\0206\032\0020-H\026R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\017\020\020R\021\020\021\032\0020\0228F¢\006\006\032\004\b\023\020\024R\016\020\025\032\0020\026X\004¢\006\002\n\000R\021\020\027\032\0020\0228F¢\006\006\032\004\b\030\020\024R\021\020\031\032\0020\0328F¢\006\006\032\004\b\033\020\034R\021\020\035\032\0020\0368F¢\006\006\032\004\b\037\020 R\016\020!\032\0020\"X\004¢\006\002\n\000R\016\020#\032\0020$X\004¢\006\002\n\000R\016\020%\032\0020&X\004¢\006\002\n\000R\016\020'\032\0020(X\004¢\006\002\n\000R\022\020)\032\006\022\002\b\0030*X\004¢\006\002\n\000¨\0068"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController$PromptStateListener;", "Lcom/intellij/openapi/Disposable;", "project", "Lcom/intellij/openapi/project/Project;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "commandExecutor", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalCommandExecutor;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalCommandExecutor;)V", "controller", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController;", "getController", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController;", "component", "Ljavax/swing/JComponent;", "getComponent", "()Ljavax/swing/JComponent;", "promptPanel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView$TerminalPromptPanel;", "preferredFocusableComponent", "getPreferredFocusableComponent", "terminalWidth", "", "getTerminalWidth", "()I", "charSize", "Ljava/awt/geom/Dimension2D;", "getCharSize", "()Ljava/awt/geom/Dimension2D;", "editor", "Lcom/intellij/openapi/editor/impl/EditorImpl;", "commandHistoryPresenter", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;", "commandSearchPresenter", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchPresenter;", "toolbar", "Lcom/intellij/openapi/actionSystem/ActionToolbar;", "toolbarSizeInitializedFuture", "Ljava/util/concurrent/CompletableFuture;", "getTerminalWidthInitializedFuture", "commandHistoryStateChanged", "", "showing", "", "commandSearchRequested", "createPromptTextField", "Lcom/intellij/ui/EditorTextField;", "createToolbar", "targetComponent", "scheduleToolbarUpdate", "dispose", "TerminalPromptPanel", "ej-core"})
/*     */ public final class TerminalPromptView implements TerminalPromptController.PromptStateListener, Disposable {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final JBTerminalSystemSettingsProviderBase settings;
/*     */   @NotNull
/*     */   private final TerminalPromptController controller;
/*     */   @NotNull
/*     */   private final TerminalPromptPanel promptPanel;
/*     */   @NotNull
/*     */   private final EditorImpl editor;
/*     */   @NotNull
/*     */   private final CommandHistoryPresenter commandHistoryPresenter;
/*     */   @NotNull
/*     */   private final CommandSearchPresenter commandSearchPresenter;
/*     */   @NotNull
/*     */   private final ActionToolbar toolbar;
/*     */   @NotNull
/*     */   private final CompletableFuture<?> toolbarSizeInitializedFuture;
/*     */   
/*  54 */   public TerminalPromptView(@NotNull Project project, @NotNull JBTerminalSystemSettingsProviderBase settings, @NotNull BlockTerminalSession session, @NotNull TerminalCommandExecutor commandExecutor) { this.project = project;
/*  55 */     this.settings = settings;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  87 */     EditorTextField editorTextField = createPromptTextField();
/*  88 */     Intrinsics.checkNotNull(editorTextField.getEditor(true), "null cannot be cast to non-null type com.intellij.openapi.editor.impl.EditorImpl"); this.editor = (EditorImpl)editorTextField.getEditor(true);
/*  89 */     this.controller = new TerminalPromptController(this.project, (EditorEx)this.editor, session, commandExecutor);
/*  90 */     this.controller.addListener(this);
/*     */     
/*  92 */     this.commandHistoryPresenter = new CommandHistoryPresenter(this.project, (Editor)this.editor, this.controller);
/*  93 */     this.commandSearchPresenter = new CommandSearchPresenter(this.project, (Editor)this.editor, this.controller.getModel());
/*     */     
/*  95 */     Intrinsics.checkNotNullExpressionValue(this.editor.getContentComponent(), "getContentComponent(...)"); this.toolbar = createToolbar((JComponent)this.editor.getContentComponent());
/*  96 */     this.toolbarSizeInitializedFuture = scheduleToolbarUpdate(this.toolbar);
/*     */     
/*  98 */     Intrinsics.checkNotNullExpressionValue(this.toolbar.getComponent(), "getComponent(...)"); this.promptPanel = new TerminalPromptPanel((JComponent)editorTextField, this.toolbar.getComponent());
/*     */     
/* 100 */     Intrinsics.checkNotNullExpressionValue(JBUI.Borders.empty(6, 
/* 101 */           19, 
/* 102 */           12, 
/* 103 */           0), "empty(...)"); JBEmptyBorder innerBorder = JBUI.Borders.empty(6, 19, 12, 0);
/* 104 */     Color color = TerminalUi.INSTANCE.promptSeparatorColor((Editor)this.editor); JBInsets jBInsets = 
/* 105 */       new JBInsets(1, 0, 0, 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     TerminalPromptView$outerBorder$1 outerBorder = new TerminalPromptView$outerBorder$1(color, jBInsets);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     this.promptPanel.setBorder(JBUI.Borders.compound((Border)outerBorder, (Border)innerBorder));
/*     */ 
/*     */     
/* 123 */     this.promptPanel.addMouseListener(new MouseAdapter() {
/*     */           public void mousePressed(MouseEvent e) {
/* 125 */             IdeFocusManager.getInstance(TerminalPromptView.this.project).requestFocus((Component)TerminalPromptView.this.editor.getContentComponent(), true);
/*     */           }
/*     */         });
/*     */     
/* 129 */     this.controller.getModel().addErrorStateListener(new TerminalPromptErrorStateListener()
/*     */         {
/*     */           public void errorStateChanged(TerminalPromptErrorDescription description) {
/* 132 */             Intrinsics.checkNotNullExpressionValue(TerminalPromptView.this.editor.getColorsScheme(), "getColorsScheme(...)"); JComponent errorComponent = (description != null) ? TerminalPromptErrorUtil.INSTANCE.createErrorComponent(description, TerminalPromptView.this.editor.getColorsScheme()) : 
/*     */               
/* 134 */               null;
/* 135 */             TerminalPromptView.this.promptPanel.setBottomComponent(errorComponent);
/*     */           }
/* 137 */         }this); }
/*     */   @RequiresEdt public void promptVisibilityChanged(boolean visible) { TerminalPromptController.PromptStateListener.DefaultImpls.promptVisibilityChanged(this, visible); }
/*     */   @NotNull public final TerminalPromptController getController() { return this.controller; }
/*     */   @NotNull
/*     */   public final JComponent getComponent() { return this.promptPanel; } @NotNull
/* 142 */   public final CompletableFuture<?> getTerminalWidthInitializedFuture() { return this.toolbarSizeInitializedFuture; }
/*     */   @NotNull public final JComponent getPreferredFocusableComponent() { Intrinsics.checkNotNullExpressionValue(this.editor.getContentComponent(), "getContentComponent(...)"); return (JComponent)this.editor.getContentComponent(); }
/*     */   public final int getTerminalWidth() { int availableWidth = this.promptPanel.getAvailableContentWidth(); int scrollBarWidth = this.editor.getScrollPane().getVerticalScrollBar().getWidth(); return availableWidth - scrollBarWidth; }
/*     */   @NotNull public final Dimension2D getCharSize() { return TerminalUiUtilsKt.getCharSize((Editor)this.editor); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000+\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\004*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J:\020\006\032\0020\0072\006\020\004\032\0020\0052\b\020\b\032\004\030\0010\t2\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\r\032\0020\0132\006\020\016\032\0020\013H\026¨\006\017"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView$outerBorder$1", "Lcom/intellij/ui/border/CustomLineBorder;", "getBorderInsets", "Ljava/awt/Insets;", "c", "Ljava/awt/Component;", "paintBorder", "", "g", "Ljava/awt/Graphics;", "x", "", "y", "w", "h", "ej-core"}) public static final class TerminalPromptView$outerBorder$1 extends CustomLineBorder {
/* 146 */     TerminalPromptView$outerBorder$1(Color $super_call_param$1, JBInsets $super_call_param$2) { super($super_call_param$1, (Insets)$super_call_param$2); } public Insets getBorderInsets(Component c) { Intrinsics.checkNotNullParameter(c, "c"); if (c.getY() == 0) { Intrinsics.checkNotNullExpressionValue(JBInsets.emptyInsets(), "emptyInsets(...)"); return (Insets)JBInsets.emptyInsets(); }  Intrinsics.checkNotNullExpressionValue(super.getBorderInsets(c), "getBorderInsets(...)"); return super.getBorderInsets(c); } public void paintBorder(Component c, Graphics g, int x, int y, int w, int h) { Intrinsics.checkNotNullParameter(c, "c"); if (c.getY() != 0) super.paintBorder(c, g, x, y, w, h);  } } public void commandHistoryStateChanged(boolean showing) { if (showing) {
/* 147 */       List<String> history = this.controller.getCommandHistory();
/* 148 */       if (!history.isEmpty()) {
/* 149 */         this.commandHistoryPresenter.showCommandHistory(history);
/*     */       }
/*     */     } else {
/*     */       
/* 153 */       this.commandHistoryPresenter.onCommandHistoryClosed();
/*     */     }  }
/*     */ 
/*     */   
/*     */   public void commandSearchRequested() {
/* 158 */     List<String> history = this.controller.getCommandHistory();
/* 159 */     if (!history.isEmpty()) {
/* 160 */       this.commandSearchPresenter.showCommandSearch(history);
/*     */     }
/*     */   }
/*     */   
/*     */   private final EditorTextField createPromptTextField() {
/* 165 */     Project project = this.project; TerminalPromptFileType terminalPromptFileType = TerminalPromptFileType.INSTANCE; TerminalPromptView$createPromptTextField$textField$1 textField = new TerminalPromptView$createPromptTextField$textField$1(project, terminalPromptFileType);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     textField.setOneLineMode(false);
/* 176 */     textField.setDisposedWith(this);
/* 177 */     textField.setAlignmentX(0.0F);
/*     */     
/* 179 */     Intrinsics.checkNotNull(textField.getEditor(true), "null cannot be cast to non-null type com.intellij.openapi.editor.impl.EditorImpl"); EditorImpl editor = (EditorImpl)textField.getEditor(true);
/* 180 */     editor.getSettings().setUseSoftWraps(true);
/* 181 */     editor.getSettings().setShowingSpecialChars(false);
/* 182 */     editor.getScrollPane().setBorder((Border)JBUI.Borders.empty());
/* 183 */     editor.getScrollPane().setVerticalScrollBarPolicy(20);
/* 184 */     editor.getScrollPane().setHorizontalScrollBarPolicy(31);
/* 185 */     editor.setVerticalScrollbarVisible(true);
/* 186 */     editor.getGutterComponentEx().setPaintBackground(false);
/* 187 */     TerminalUi.INSTANCE.useTerminalDefaultBackground((EditorEx)editor, this);
/* 188 */     EditorColorsScheme editorColorsScheme1 = editor.getColorsScheme(), $this$createPromptTextField_u24lambda_u240 = editorColorsScheme1; int $i$a$-apply-TerminalPromptView$createPromptTextField$1 = 0;
/* 189 */     $this$createPromptTextField_u24lambda_u240.setEditorFontName(this.settings.getTerminalFont().getFontName());
/* 190 */     $this$createPromptTextField_u24lambda_u240.setEditorFontSize(this.settings.getTerminalFont().getSize());
/* 191 */     $this$createPromptTextField_u24lambda_u240.setLineSpacing(1.0F);
/*     */     
/* 193 */     $this$createPromptTextField_u24lambda_u240.setColor(EditorColors.READONLY_FRAGMENT_BACKGROUND_COLOR, null);
/*     */     
/* 195 */     editor.getCaretModel().getPrimaryCaret().setVisualAttributes(new CaretVisualAttributes(null, CaretVisualAttributes.Weight.HEAVY));
/* 196 */     editor.putUserData(AutoPopupController.SHOW_BOTTOM_PANEL_IN_LOOKUP_UI, Boolean.valueOf(false));
/*     */     
/* 198 */     VirtualFile it = FileDocumentManager.getInstance().getFile((Document)editor.getDocument()); int $i$a$-let-TerminalPromptView$createPromptTextField$2 = 0;
/* 199 */     editor.setFile(it);
/* 200 */     it.putUserData(NavBarModelExtension.IGNORE_IN_NAVBAR, Boolean.valueOf(true));
/*     */ 
/*     */     
/*     */     FileDocumentManager.getInstance().getFile((Document)editor.getDocument());
/*     */ 
/*     */     
/* 206 */     editor.setContextMenuGroupId("Terminal.PromptContextMenu");
/*     */     
/* 208 */     return textField; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026J\b\020\006\032\0020\003H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView$createPromptTextField$textField$1", "Lcom/intellij/ui/EditorTextField;", "setBackground", "", "bg", "Ljava/awt/Color;", "updateUI", "ej-core"}) public static final class TerminalPromptView$createPromptTextField$textField$1 extends EditorTextField {
/*     */     TerminalPromptView$createPromptTextField$textField$1(Project $super_call_param$1, TerminalPromptFileType $super_call_param$2) { super($super_call_param$1, (FileType)$super_call_param$2); } public void setBackground(Color bg) {}
/*     */     public void updateUI() { super.updateUI();
/*     */       setFont(EditorUtil.getEditorFont()); } }
/* 212 */   private final ActionToolbar createToolbar(JComponent targetComponent) { ActionManager actionManager = ActionManager.getInstance();
/* 213 */     Intrinsics.checkNotNull(actionManager.getAction("Terminal.PromptToolbar"), "null cannot be cast to non-null type com.intellij.openapi.actionSystem.ActionGroup"); ActionGroup toolbarGroup = (ActionGroup)actionManager.getAction("Terminal.PromptToolbar");
/* 214 */     Intrinsics.checkNotNullExpressionValue(actionManager.createActionToolbar("TerminalPrompt", toolbarGroup, true), "createActionToolbar(...)"); ActionToolbar toolbar = actionManager.createActionToolbar("TerminalPrompt", toolbarGroup, true);
/* 215 */     toolbar.setTargetComponent(targetComponent);
/* 216 */     toolbar.getComponent().setOpaque(false);
/* 217 */     toolbar.getComponent().setBorder((Border)JBUI.Borders.emptyRight(10));
/* 218 */     return toolbar; }
/*     */ 
/*     */   
/*     */   @RequiresEdt
/*     */   private final CompletableFuture<?> scheduleToolbarUpdate(ActionToolbar toolbar) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: checkcast com/intellij/openapi/Disposable
/*     */     //   4: invokestatic newCheckedDisposable : (Lcom/intellij/openapi/Disposable;)Lcom/intellij/openapi/util/CheckedDisposable;
/*     */     //   7: dup
/*     */     //   8: ldc_w 'newCheckedDisposable(...)'
/*     */     //   11: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: astore_2
/*     */     //   15: new java/util/concurrent/CompletableFuture
/*     */     //   18: dup
/*     */     //   19: invokespecial <init> : ()V
/*     */     //   22: astore_3
/*     */     //   23: aload_2
/*     */     //   24: checkcast com/intellij/openapi/Disposable
/*     */     //   27: aload_3
/*     */     //   28: <illegal opcode> dispose : (Ljava/util/concurrent/CompletableFuture;)Lcom/intellij/openapi/Disposable;
/*     */     //   33: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*     */     //   36: aload_2
/*     */     //   37: <illegal opcode> invoke : (Lcom/intellij/openapi/util/CheckedDisposable;)Lkotlin/jvm/functions/Function0;
/*     */     //   42: astore #4
/*     */     //   44: aload #4
/*     */     //   46: invokestatic any : ()Lcom/intellij/openapi/application/ModalityState;
/*     */     //   49: dup
/*     */     //   50: ldc_w 'any(...)'
/*     */     //   53: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   56: aload_1
/*     */     //   57: aload_2
/*     */     //   58: aload_3
/*     */     //   59: aload #4
/*     */     //   61: <illegal opcode> run : (Lcom/intellij/openapi/actionSystem/ActionToolbar;Lcom/intellij/openapi/util/CheckedDisposable;Ljava/util/concurrent/CompletableFuture;Lkotlin/jvm/functions/Function0;)Ljava/lang/Runnable;
/*     */     //   66: invokestatic invokeLater : (Lkotlin/jvm/functions/Function0;Lcom/intellij/openapi/application/ModalityState;Ljava/lang/Runnable;)V
/*     */     //   69: aload_3
/*     */     //   70: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #224	-> 0
/*     */     //   #225	-> 15
/*     */     //   #226	-> 23
/*     */     //   #232	-> 36
/*     */     //   #235	-> 44
/*     */     //   #257	-> 69
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   15	56	2	disposable	Lcom/intellij/openapi/util/CheckedDisposable;
/*     */     //   23	48	3	future	Ljava/util/concurrent/CompletableFuture;
/*     */     //   44	27	4	isDisposed	Lkotlin/jvm/functions/Function0;
/*     */     //   0	71	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView;
/*     */     //   0	71	1	toolbar	Lcom/intellij/openapi/actionSystem/ActionToolbar;
/*     */   }
/*     */   
/*     */   private static final void scheduleToolbarUpdate$lambda$2(CompletableFuture $future) {
/* 227 */     if (!$future.isDone())
/* 228 */       $future.completeExceptionally(new IllegalStateException("parent disposed")); 
/*     */   }
/*     */   
/*     */   private static final boolean scheduleToolbarUpdate$lambda$3(CheckedDisposable $disposable) {
/* 232 */     return $disposable.isDisposed();
/*     */   }
/*     */   
/*     */   private static final void scheduleToolbarUpdate$lambda$6(ActionToolbar $toolbar, CheckedDisposable $disposable, CompletableFuture<Unit> $future, Function0<Boolean> $isDisposed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokeinterface getComponent : ()Ljavax/swing/JComponent;
/*     */     //   6: iconst_1
/*     */     //   7: invokestatic markAsShowing : (Ljavax/swing/JComponent;Z)V
/*     */     //   10: aload_0
/*     */     //   11: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView$scheduleToolbarUpdate$2$1
/*     */     //   14: dup
/*     */     //   15: aload_3
/*     */     //   16: aload_2
/*     */     //   17: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Ljava/util/concurrent/CompletableFuture;)V
/*     */     //   20: checkcast com/intellij/openapi/actionSystem/ActionToolbarListener
/*     */     //   23: aload_1
/*     */     //   24: checkcast com/intellij/openapi/Disposable
/*     */     //   27: invokeinterface addListener : (Lcom/intellij/openapi/actionSystem/ActionToolbarListener;Lcom/intellij/openapi/Disposable;)V
/*     */     //   32: aload_2
/*     */     //   33: aload_1
/*     */     //   34: aload_0
/*     */     //   35: <illegal opcode> invoke : (Lcom/intellij/openapi/util/CheckedDisposable;Lcom/intellij/openapi/actionSystem/ActionToolbar;)Lkotlin/jvm/functions/Function2;
/*     */     //   40: <illegal opcode> accept : (Lkotlin/jvm/functions/Function2;)Ljava/util/function/BiConsumer;
/*     */     //   45: invokevirtual whenComplete : (Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   48: pop
/*     */     //   49: aload_0
/*     */     //   50: invokeinterface updateActionsAsync : ()Ljava/util/concurrent/Future;
/*     */     //   55: pop
/*     */     //   56: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #238	-> 0
/*     */     //   #240	-> 10
/*     */     //   #247	-> 23
/*     */     //   #240	-> 27
/*     */     //   #249	-> 32
/*     */     //   #254	-> 49
/*     */     //   #255	-> 56
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	57	0	$toolbar	Lcom/intellij/openapi/actionSystem/ActionToolbar;
/*     */     //   0	57	1	$disposable	Lcom/intellij/openapi/util/CheckedDisposable;
/*     */     //   0	57	2	$future	Ljava/util/concurrent/CompletableFuture;
/*     */     //   0	57	3	$isDisposed	Lkotlin/jvm/functions/Function0;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView$scheduleToolbarUpdate$2$1", "Lcom/intellij/openapi/actionSystem/ActionToolbarListener;", "actionsUpdated", "", "ej-core"})
/*     */   public static final class TerminalPromptView$scheduleToolbarUpdate$2$1 implements ActionToolbarListener {
/*     */     TerminalPromptView$scheduleToolbarUpdate$2$1(Function0<Boolean> $isDisposed, CompletableFuture<Unit> $future) {}
/*     */     
/* 243 */     public void actionsUpdated() { Intrinsics.checkNotNullExpressionValue(ModalityState.any(), "any(...)"); TerminalUiUtilsKt.invokeLater(this.$isDisposed, ModalityState.any(), this.$future::actionsUpdated$lambda$0); } private static final void actionsUpdated$lambda$0(CompletableFuture<Unit> $future) {
/* 244 */       $future.complete(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final void scheduleToolbarUpdate$lambda$6$lambda$5(Function2 $tmp0, Object p0, Object p1) {
/* 249 */     $tmp0.invoke(p0, p1); } private static final Unit scheduleToolbarUpdate$lambda$6$lambda$4(CheckedDisposable $disposable, ActionToolbar $toolbar, Unit paramUnit, Throwable paramThrowable) {
/* 250 */     Disposer.dispose((Disposable)$disposable);
/* 251 */     UIUtil.markAsShowing($toolbar.getComponent(), false);
/* 252 */     return Unit.INSTANCE;
/*     */   }
/*     */   public void dispose() {}
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\020\020\b\032\0020\t2\b\020\n\032\004\030\0010\003J\006\020\013\032\0020\fJ\b\020\r\032\0020\016H\026J\b\020\017\032\0020\tH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\003X\004¢\006\002\n\000R\020\020\007\032\004\030\0010\003X\016¢\006\002\n\000¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView$TerminalPromptPanel;", "Ljavax/swing/JPanel;", "mainComponent", "Ljavax/swing/JComponent;", "sideComponent", "<init>", "(Ljavax/swing/JComponent;Ljavax/swing/JComponent;)V", "bottomComponent", "setBottomComponent", "", "component", "getAvailableContentWidth", "", "getPreferredSize", "Ljava/awt/Dimension;", "doLayout", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nTerminalPromptView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalPromptView.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView$TerminalPromptPanel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
/*     */   private static final class TerminalPromptPanel extends JPanel { @NotNull
/*     */     private final JComponent mainComponent;
/*     */     @NotNull
/*     */     private final JComponent sideComponent;
/*     */     @Nullable
/*     */     private JComponent bottomComponent;
/*     */     
/*     */     public TerminalPromptPanel(@NotNull JComponent mainComponent, @NotNull JComponent sideComponent) {
/* 265 */       super((LayoutManager)null);
/*     */       
/*     */       this.mainComponent = mainComponent;
/*     */       this.sideComponent = sideComponent;
/* 269 */       setOpaque(false);
/* 270 */       add(this.mainComponent);
/* 271 */       add(this.sideComponent);
/*     */     }
/*     */     
/*     */     public final void setBottomComponent(@Nullable JComponent component) {
/* 275 */       if (this.bottomComponent != null) { JComponent it = this.bottomComponent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 322 */         int $i$a$-let-TerminalPromptView$TerminalPromptPanel$setBottomComponent$1 = 0;
/*     */         remove(it); }
/*     */       else
/*     */       {  }
/*     */       
/*     */       if (component != null)
/*     */         add(component); 
/*     */       this.bottomComponent = component;
/*     */       revalidate();
/*     */       repaint();
/*     */     }
/*     */     
/*     */     public final int getAvailableContentWidth() {
/*     */       return getWidth() - (getInsets()).left - (getInsets()).right - (this.sideComponent.getPreferredSize()).width;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Dimension getPreferredSize() {
/*     */       Dimension mainComponentSize = this.mainComponent.getPreferredSize();
/*     */       if (this.bottomComponent == null || this.bottomComponent.getPreferredSize() == null)
/*     */         this.bottomComponent.getPreferredSize(); 
/*     */       Dimension bottomComponentSize = new Dimension(0, 0);
/*     */       Dimension sideComponentSize = this.sideComponent.getPreferredSize();
/*     */       Dimension size = new Dimension(mainComponentSize.width + sideComponentSize.width, mainComponentSize.height + bottomComponentSize.height);
/*     */       JBInsets.addTo(size, getInsets());
/*     */       return size;
/*     */     }
/*     */     
/*     */     public void doLayout() {
/*     */       Rectangle rect = new Rectangle(0, 0, getWidth(), getHeight());
/*     */       JBInsets.removeFrom(rect, getInsets());
/*     */       Dimension sidePrefSize = this.sideComponent.getPreferredSize();
/*     */       Dimension mainPrefSize = this.mainComponent.getPreferredSize();
/*     */       if (this.bottomComponent == null || this.bottomComponent.getPreferredSize() == null)
/*     */         this.bottomComponent.getPreferredSize(); 
/*     */       Dimension bottomPrefSize = new Dimension(0, 0);
/*     */       int sideComponentX = Math.max(rect.x + rect.width - sidePrefSize.width, 0);
/*     */       this.sideComponent.setBounds(sideComponentX, rect.y, sidePrefSize.width, sidePrefSize.height);
/*     */       int mainHeight = Math.min(rect.height, mainPrefSize.height);
/*     */       this.mainComponent.setBounds(rect.x, rect.y, rect.width - sidePrefSize.width, mainHeight);
/*     */       int bottomHeight = Math.min(rect.height - mainHeight, bottomPrefSize.height);
/*     */       if (this.bottomComponent != null) {
/*     */         this.bottomComponent.setBounds(rect.x, rect.y + mainHeight, rect.width, bottomHeight);
/*     */       } else {
/*     */       
/*     */       } 
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptView.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */