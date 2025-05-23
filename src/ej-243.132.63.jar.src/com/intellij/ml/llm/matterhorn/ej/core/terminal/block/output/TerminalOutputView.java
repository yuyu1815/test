/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.find.SearchReplaceComponent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.TerminalFocusModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*     */ import com.intellij.openapi.actionSystem.CommonDataKeys;
/*     */ import com.intellij.openapi.actionSystem.DataSink;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.impl.DocumentImpl;
/*     */ import com.intellij.openapi.editor.impl.EditorImpl;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import com.intellij.util.concurrency.annotations.RequiresEdt;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.util.Iterator;
/*     */ import javax.swing.BoundedRangeModel;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLayeredPane;
/*     */ import javax.swing.JScrollBar;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001:\001\"B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J\020\020\030\032\0020\0312\006\020\032\032\0020\033H\007J\020\020\034\032\0020\0312\006\020\032\032\0020\033H\007J\020\020\035\032\0020\0272\006\020\006\032\0020\007H\002J\020\020\036\032\0020\0312\006\020\037\032\0020 H\002J\b\020!\032\0020\031H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b\022\020\023R\021\020\024\032\0020\0218F¢\006\006\032\004\b\025\020\023R\016\020\026\032\0020\027X\004¢\006\002\n\000¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputView;", "Lcom/intellij/openapi/Disposable;", "project", "Lcom/intellij/openapi/project/Project;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "focusModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;)V", "controller", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;", "getController", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;", "component", "Ljavax/swing/JComponent;", "getComponent", "()Ljavax/swing/JComponent;", "preferredFocusableComponent", "getPreferredFocusableComponent", "editor", "Lcom/intellij/openapi/editor/impl/EditorImpl;", "installSearchComponent", "", "searchComponent", "Lcom/intellij/find/SearchReplaceComponent;", "removeSearchComponent", "createEditor", "stickScrollBarToBottom", "verticalScrollBar", "Ljavax/swing/JScrollBar;", "dispose", "TerminalOutputPanel", "ej-core"})
/*     */ public final class TerminalOutputView implements Disposable {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final TerminalOutputController controller;
/*     */   @NotNull
/*     */   private final JComponent component;
/*     */   @NotNull
/*     */   private final EditorImpl editor;
/*     */   
/*  36 */   public TerminalOutputView(@NotNull Project project, @NotNull BlockTerminalSession session, @NotNull JBTerminalSystemSettingsProviderBase settings, @NotNull TerminalFocusModel focusModel) { this.project = project;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  49 */     this.editor = createEditor(settings);
/*  50 */     this.controller = new TerminalOutputController(this.project, (EditorEx)this.editor, session, settings, focusModel);
/*  51 */     this.component = (JComponent)new TerminalOutputPanel(); }
/*     */   @NotNull
/*     */   public final TerminalOutputController getController() {
/*     */     return this.controller;
/*     */   } @RequiresEdt
/*  56 */   public final void installSearchComponent(@NotNull SearchReplaceComponent searchComponent) { Intrinsics.checkNotNullParameter(searchComponent, "searchComponent"); Intrinsics.checkNotNull(JLayeredPane.POPUP_LAYER, "null cannot be cast to non-null type kotlin.Any"); this.component.add((Component)searchComponent, JLayeredPane.POPUP_LAYER);
/*  57 */     this.component.revalidate();
/*  58 */     this.component.repaint(); }
/*     */   @NotNull public final JComponent getComponent() { return this.component; }
/*     */   @NotNull
/*     */   public final JComponent getPreferredFocusableComponent() { Intrinsics.checkNotNullExpressionValue(this.editor.getContentComponent(), "getContentComponent(...)");
/*     */     return (JComponent)this.editor.getContentComponent(); } @RequiresEdt
/*  63 */   public final void removeSearchComponent(@NotNull SearchReplaceComponent searchComponent) { Intrinsics.checkNotNullParameter(searchComponent, "searchComponent"); this.component.remove((Component)searchComponent);
/*  64 */     this.component.revalidate();
/*  65 */     this.component.repaint(); }
/*     */ 
/*     */   
/*     */   private final EditorImpl createEditor(JBTerminalSystemSettingsProviderBase settings) {
/*  69 */     DocumentImpl document = new DocumentImpl("", true);
/*  70 */     EditorImpl editor = TerminalUiUtils.INSTANCE.createOutputEditor((Document)document, this.project, settings);
/*  71 */     editor.getSettings().setUseSoftWraps(true);
/*  72 */     TerminalUi.INSTANCE.useTerminalDefaultBackground((EditorEx)editor, this);
/*  73 */     Intrinsics.checkNotNullExpressionValue(editor.getScrollPane().getVerticalScrollBar(), "getVerticalScrollBar(...)"); stickScrollBarToBottom(editor.getScrollPane().getVerticalScrollBar());
/*  74 */     return editor;
/*     */   }
/*     */   
/*     */   private final void stickScrollBarToBottom(JScrollBar verticalScrollBar) {
/*  78 */     verticalScrollBar.getModel().addChangeListener(new TerminalOutputView$stickScrollBarToBottom$1(verticalScrollBar)); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\005\n\002\020\b\n\002\b\013\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\024\032\0020\0252\b\020\026\032\004\030\0010\027H\026R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\004\020\005\"\004\b\006\020\007R\032\020\b\032\0020\tX\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\rR\032\020\016\032\0020\tX\016¢\006\016\n\000\032\004\b\017\020\013\"\004\b\020\020\rR\032\020\021\032\0020\tX\016¢\006\016\n\000\032\004\b\022\020\013\"\004\b\023\020\r¨\006\030"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputView$stickScrollBarToBottom$1", "Ljavax/swing/event/ChangeListener;", "preventRecursion", "", "getPreventRecursion", "()Z", "setPreventRecursion", "(Z)V", "prevValue", "", "getPrevValue", "()I", "setPrevValue", "(I)V", "prevMaximum", "getPrevMaximum", "setPrevMaximum", "prevExtent", "getPrevExtent", "setPrevExtent", "stateChanged", "", "e", "Ljavax/swing/event/ChangeEvent;", "ej-core"})
/*  79 */   public static final class TerminalOutputView$stickScrollBarToBottom$1 implements ChangeListener { private boolean preventRecursion; private int prevValue; private int prevMaximum; private int prevExtent; TerminalOutputView$stickScrollBarToBottom$1(JScrollBar $verticalScrollBar) {} public final boolean getPreventRecursion() { return this.preventRecursion; } public final void setPreventRecursion(boolean <set-?>) { this.preventRecursion = <set-?>; }
/*  80 */     public final int getPrevValue() { return this.prevValue; } public final void setPrevValue(int <set-?>) { this.prevValue = <set-?>; }
/*  81 */     public final int getPrevMaximum() { return this.prevMaximum; } public final void setPrevMaximum(int <set-?>) { this.prevMaximum = <set-?>; }
/*  82 */     public final int getPrevExtent() { return this.prevExtent; } public final void setPrevExtent(int <set-?>) { this.prevExtent = <set-?>; }
/*     */     
/*     */     public void stateChanged(ChangeEvent e) {
/*  85 */       if (this.preventRecursion)
/*     */         return; 
/*  87 */       BoundedRangeModel model = this.$verticalScrollBar.getModel();
/*  88 */       int maximum = model.getMaximum();
/*  89 */       int extent = model.getExtent();
/*     */       
/*  91 */       if (extent != this.prevExtent || maximum != this.prevMaximum)
/*     */       {
/*  93 */         if (this.prevValue == this.prevMaximum - this.prevExtent) {
/*  94 */           this.preventRecursion = true;
/*     */           try {
/*  96 */             model.setValue(maximum - extent);
/*     */           } finally {
/*     */             
/*  99 */             this.preventRecursion = false;
/*     */           } 
/*     */         } 
/*     */       }
/*     */       
/* 104 */       this.prevValue = model.getValue();
/* 105 */       this.prevMaximum = model.getMaximum();
/* 106 */       this.prevExtent = model.getExtent();
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 112 */     EditorFactory.getInstance().releaseEditor((Editor)this.editor);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\b\004\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J\020\020\005\032\0020\0062\006\020\007\032\0020\bH\026J\b\020\t\032\0020\nH\026J\b\020\013\032\0020\006H\026J\020\020\f\032\0020\0062\006\020\r\032\0020\016H\002J\020\020\017\032\0020\0062\006\020\r\032\0020\016H\002¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputView$TerminalOutputPanel;", "Lcom/intellij/ui/components/JBLayeredPane;", "Lcom/intellij/openapi/actionSystem/UiDataProvider;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputView;)V", "uiDataSnapshot", "", "sink", "Lcom/intellij/openapi/actionSystem/DataSink;", "getPreferredSize", "Ljava/awt/Dimension;", "doLayout", "layoutEditor", "component", "Ljava/awt/Component;", "layoutSearchComponent", "ej-core"})
/*     */   private final class TerminalOutputPanel extends JBLayeredPane implements UiDataProvider { public TerminalOutputPanel() {
/* 117 */       setOpaque(false);
/* 118 */       Intrinsics.checkNotNull(JLayeredPane.DEFAULT_LAYER, "null cannot be cast to non-null type kotlin.Any"); add(TerminalOutputView.this.editor.getComponent(), JLayeredPane.DEFAULT_LAYER);
/*     */     }
/*     */     
/*     */     public void uiDataSnapshot(@NotNull DataSink sink) {
/* 122 */       Intrinsics.checkNotNullParameter(sink, "sink"); Intrinsics.checkNotNullExpressionValue(CommonDataKeys.EDITOR, "EDITOR"); sink.set(CommonDataKeys.EDITOR, TerminalOutputView.this.editor);
/*     */     }
/*     */     @NotNull
/*     */     public Dimension getPreferredSize() {
/* 126 */       Intrinsics.checkNotNullExpressionValue(TerminalOutputView.this.editor.getPreferredSize(), "getPreferredSize(...)"); return (TerminalOutputView.this.editor.getDocument().getTextLength() == 0) ? new Dimension() : TerminalOutputView.this.editor.getPreferredSize();
/*     */     }
/*     */     
/*     */     public void doLayout() {
/* 130 */       for (Iterator<Component> iterator = ArrayIteratorKt.iterator((Object[])getComponents()); iterator.hasNext(); ) { Component component = iterator.next();
/* 131 */         Component component1 = component;
/* 132 */         if (Intrinsics.areEqual(component1, TerminalOutputView.this.editor.getComponent())) { Intrinsics.checkNotNull(component); layoutEditor(component); continue; }
/* 133 */          if (component1 instanceof SearchReplaceComponent) layoutSearchComponent(component);
/*     */          }
/*     */     
/*     */     }
/*     */     
/*     */     private final void layoutEditor(Component component) {
/* 139 */       int prefHeight = (component.getPreferredSize()).height;
/* 140 */       int compHeight = Math.min(getHeight(), prefHeight);
/* 141 */       component.setBounds(0, getHeight() - compHeight, getWidth(), compHeight);
/*     */     }
/*     */     
/*     */     private final void layoutSearchComponent(Component component) {
/* 145 */       Dimension prefSize = component.getPreferredSize();
/* 146 */       Dimension maxSize = component.getMaximumSize();
/* 147 */       int compWidth = Math.min(getWidth(), Math.min(prefSize.width, maxSize.width));
/* 148 */       int compHeight = Math.min(prefSize.height, maxSize.height);
/* 149 */       component.setBounds(getWidth() - compWidth, 0, compWidth, compHeight);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputView.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */