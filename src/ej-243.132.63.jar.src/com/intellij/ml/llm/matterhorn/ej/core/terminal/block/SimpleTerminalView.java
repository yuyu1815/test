/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalUi;
/*     */ import com.intellij.openapi.actionSystem.CommonDataKeys;
/*     */ import com.intellij.openapi.actionSystem.DataSink;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.ex.FocusChangeListener;
/*     */ import com.intellij.openapi.editor.impl.DocumentImpl;
/*     */ import com.intellij.openapi.editor.impl.EditorImpl;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import javax.swing.JComponent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\002\b\000\030\0002\0020\001:\001$B)\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t¢\006\004\b\n\020\013J\b\020 \032\0020\rH\002J\006\020!\032\0020\tJ\b\020\"\032\0020#H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\f\032\0020\rX\004¢\006\002\n\000R\021\020\016\032\0020\017¢\006\b\n\000\032\004\b\020\020\021R\021\020\022\032\0020\023¢\006\b\n\000\032\004\b\024\020\025R\021\020\026\032\0020\0238F¢\006\006\032\004\b\027\020\025R\021\020\030\032\0020\0318F¢\006\006\032\004\b\032\020\033R\021\020\034\032\0020\0358F¢\006\006\032\004\b\036\020\037¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalView;", "Lcom/intellij/openapi/Disposable;", "project", "Lcom/intellij/openapi/project/Project;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "withVerticalScroll", "", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Z)V", "editor", "Lcom/intellij/openapi/editor/impl/EditorImpl;", "controller", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController;", "getController", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController;", "component", "Ljavax/swing/JComponent;", "getComponent", "()Ljavax/swing/JComponent;", "preferredFocusableComponent", "getPreferredFocusableComponent", "terminalWidth", "", "getTerminalWidth", "()I", "charSize", "Ljava/awt/geom/Dimension2D;", "getCharSize", "()Ljava/awt/geom/Dimension2D;", "createEditor", "isFocused", "dispose", "", "SimpleTerminalPanel", "ej-core"})
/*     */ public final class SimpleTerminalView implements Disposable {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final JBTerminalSystemSettingsProviderBase settings;
/*     */   private final boolean withVerticalScroll;
/*     */   @NotNull
/*     */   private final EditorImpl editor;
/*     */   @NotNull
/*     */   private final SimpleTerminalController controller;
/*     */   @NotNull
/*     */   private final JComponent component;
/*     */   
/*  33 */   public SimpleTerminalView(@NotNull Project project, @NotNull JBTerminalSystemSettingsProviderBase settings, @NotNull BlockTerminalSession session, boolean withVerticalScroll) { this.project = project;
/*  34 */     this.settings = settings;
/*     */     
/*  36 */     this.withVerticalScroll = withVerticalScroll;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  56 */     this.editor = createEditor();
/*  57 */     this.controller = new SimpleTerminalController(this.settings, session, (EditorEx)this.editor);
/*  58 */     this.component = new SimpleTerminalPanel((Editor)this.editor);
/*  59 */     this.editor.addFocusListener(new FocusChangeListener() {
/*     */           public void focusGained(Editor editor) {
/*  61 */             Intrinsics.checkNotNullParameter(editor, "editor"); SimpleTerminalView.this.getController().setFocused(true);
/*     */           }
/*     */           
/*     */           public void focusLost(Editor editor) {
/*  65 */             Intrinsics.checkNotNullParameter(editor, "editor"); SimpleTerminalView.this.getController().setFocused(false);
/*     */           }
/*     */         }); }
/*     */   @NotNull
/*     */   public final SimpleTerminalController getController() { return this.controller; }
/*     */   @NotNull
/*  71 */   public final JComponent getComponent() { return this.component; } private final EditorImpl createEditor() { DocumentImpl document = new DocumentImpl("", true);
/*  72 */     EditorImpl editor = TerminalUiUtils.INSTANCE.createOutputEditor((Document)document, this.project, this.settings);
/*  73 */     TerminalUi.INSTANCE.useTerminalDefaultBackground((EditorEx)editor, this);
/*  74 */     editor.getSettings().setLineMarkerAreaShown(false);
/*  75 */     editor.getScrollPane().setVerticalScrollBarPolicy(this.withVerticalScroll ? 
/*  76 */         20 : 
/*     */         
/*  78 */         21);
/*  79 */     return editor; }
/*     */   @NotNull public final JComponent getPreferredFocusableComponent() { Intrinsics.checkNotNullExpressionValue(this.editor.getContentComponent(), "getContentComponent(...)"); return (JComponent)this.editor.getContentComponent(); }
/*     */   public final int getTerminalWidth() { Intrinsics.checkNotNullExpressionValue(this.editor.getScrollingModel().getVisibleArea(), "getVisibleArea(...)"); Rectangle visibleArea = this.editor.getScrollingModel().getVisibleArea(); int scrollBarWidth = this.editor.getScrollPane().getVerticalScrollBar().getWidth(); return visibleArea.width - scrollBarWidth; }
/*  82 */   @NotNull public final Dimension2D getCharSize() { return TerminalUiUtilsKt.getCharSize((Editor)this.editor); } public final boolean isFocused() { return this.editor.getContentComponent().hasFocus(); }
/*     */   
/*     */   public void dispose() {
/*  85 */     EditorFactory.getInstance().releaseEditor((Editor)this.editor);
/*  86 */     Disposer.dispose(this.controller);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\0012\0020\002B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalView$SimpleTerminalPanel;", "Ljavax/swing/JPanel;", "Lcom/intellij/openapi/actionSystem/UiDataProvider;", "editor", "Lcom/intellij/openapi/editor/Editor;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalView;Lcom/intellij/openapi/editor/Editor;)V", "uiDataSnapshot", "", "sink", "Lcom/intellij/openapi/actionSystem/DataSink;", "ej-core"})
/*     */   private final class SimpleTerminalPanel
/*     */     extends JPanel
/*     */     implements UiDataProvider
/*     */   {
/*     */     public SimpleTerminalPanel(Editor editor) {
/*  95 */       setBackground((Color)TerminalUi.INSTANCE.defaultBackground(editor));
/*  96 */       setBorder((Border)JBUI.Borders.emptyLeft(4));
/*  97 */       setLayout(new BorderLayout());
/*  98 */       add(editor.getComponent(), "Center");
/*     */     }
/*     */     
/*     */     public void uiDataSnapshot(@NotNull DataSink sink) {
/* 102 */       Intrinsics.checkNotNullParameter(sink, "sink"); Intrinsics.checkNotNullExpressionValue(CommonDataKeys.EDITOR, "EDITOR"); sink.set(CommonDataKeys.EDITOR, SimpleTerminalView.this.editor);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\SimpleTerminalView.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */