/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalOutputController;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalOutputModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalSelectionController;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptController;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalUi;
/*     */ import com.intellij.openapi.actionSystem.DataSink;
/*     */ import com.intellij.openapi.actionSystem.UiDataProvider;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.util.ui.JBInsets;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Rectangle;
/*     */ import javax.swing.JPanel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\004\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J\020\020\005\032\0020\0062\006\020\007\032\0020\bH\026J\b\020\t\032\0020\006H\026J\020\020\n\032\0020\0062\006\020\013\032\0020\fH\002¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView$BlockTerminalPanel;", "Ljavax/swing/JPanel;", "Lcom/intellij/openapi/actionSystem/UiDataProvider;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;)V", "uiDataSnapshot", "", "sink", "Lcom/intellij/openapi/actionSystem/DataSink;", "doLayout", "layoutPromptAndOutput", "rect", "Ljava/awt/Rectangle;", "ej-core"})
/*     */ final class BlockTerminalPanel
/*     */   extends JPanel
/*     */   implements UiDataProvider
/*     */ {
/*     */   public BlockTerminalPanel() {
/* 297 */     setBackground((Color)TerminalUi.INSTANCE.defaultBackground((Editor)BlockTerminalView.this.getOutputView().getController().getOutputModel().getEditor()));
/*     */   }
/*     */   
/*     */   public void uiDataSnapshot(@NotNull DataSink sink) {
/* 301 */     Intrinsics.checkNotNullParameter(sink, "sink"); sink.set(TerminalPromptController.Companion.getKEY(), BlockTerminalView.this.getPromptView().getController());
/* 302 */     sink.set(TerminalOutputController.Companion.getKEY(), BlockTerminalView.this.getOutputView().getController());
/* 303 */     sink.set(TerminalOutputModel.Companion.getKEY(), BlockTerminalView.this.getOutputView().getController().getOutputModel());
/* 304 */     BlockTerminalView.access$getAlternateBufferView$p(BlockTerminalView.this); sink.set(SimpleTerminalController.Companion.getKEY(), (BlockTerminalView.access$getAlternateBufferView$p(BlockTerminalView.this) != null) ? BlockTerminalView.access$getAlternateBufferView$p(BlockTerminalView.this).getController() : null);
/* 305 */     sink.set(BlockTerminalController.Companion.getKEY(), BlockTerminalView.access$getController$p(BlockTerminalView.this));
/* 306 */     sink.set(TerminalSelectionController.Companion.getKEY(), BlockTerminalView.access$getSelectionController$p(BlockTerminalView.this));
/* 307 */     sink.set(TerminalFocusModel.Companion.getKEY(), BlockTerminalView.access$getFocusModel$p(BlockTerminalView.this));
/* 308 */     sink.set(BlockTerminalSession.Companion.getDATA_KEY(), BlockTerminalView.this.getSession());
/*     */   }
/*     */   public void doLayout() {
/*     */     Component component;
/* 312 */     Rectangle rect = getBounds();
/* 313 */     JBInsets.removeFrom(rect, getInsets());
/* 314 */     switch (getComponentCount())
/*     */     
/*     */     { case 1:
/* 317 */         component = getComponent(0);
/* 318 */         component.setBounds(rect); return;
/*     */       case 2:
/* 320 */         Intrinsics.checkNotNull(rect); layoutPromptAndOutput(rect); return; }  throw new IllegalStateException(
/* 321 */         "Maximum 2 components expected".toString());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void layoutPromptAndOutput(Rectangle rect) {
/* 332 */     Component topComponent = getComponent(0);
/* 333 */     Component bottomComponent = getComponent(1);
/* 334 */     Dimension topPrefSize = topComponent.isVisible() ? topComponent.getPreferredSize() : new Dimension();
/* 335 */     Dimension bottomPrefSize = bottomComponent.isVisible() ? bottomComponent.getPreferredSize() : new Dimension();
/*     */     
/* 337 */     int bottomHeight = Math.max(rect.height - topPrefSize.height, bottomPrefSize.height);
/* 338 */     int topHeight = rect.height - bottomHeight;
/* 339 */     topComponent.setBounds(new Rectangle(rect.x, rect.y, rect.width, topHeight));
/* 340 */     bottomComponent.setBounds(new Rectangle(rect.x, rect.y + topHeight, rect.width, bottomHeight));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\BlockTerminalView$BlockTerminalPanel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */