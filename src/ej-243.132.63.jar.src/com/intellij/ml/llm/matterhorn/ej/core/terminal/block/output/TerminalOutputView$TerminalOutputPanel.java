/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.openapi.actionSystem.CommonDataKeys;
/*     */ import com.intellij.openapi.actionSystem.DataSink;
/*     */ import com.intellij.openapi.actionSystem.UiDataProvider;
/*     */ import com.intellij.ui.components.JBLayeredPane;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.util.Iterator;
/*     */ import javax.swing.JLayeredPane;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.ArrayIteratorKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\b\004\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J\020\020\005\032\0020\0062\006\020\007\032\0020\bH\026J\b\020\t\032\0020\nH\026J\b\020\013\032\0020\006H\026J\020\020\f\032\0020\0062\006\020\r\032\0020\016H\002J\020\020\017\032\0020\0062\006\020\r\032\0020\016H\002¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputView$TerminalOutputPanel;", "Lcom/intellij/ui/components/JBLayeredPane;", "Lcom/intellij/openapi/actionSystem/UiDataProvider;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputView;)V", "uiDataSnapshot", "", "sink", "Lcom/intellij/openapi/actionSystem/DataSink;", "getPreferredSize", "Ljava/awt/Dimension;", "doLayout", "layoutEditor", "component", "Ljava/awt/Component;", "layoutSearchComponent", "ej-core"})
/*     */ final class TerminalOutputPanel
/*     */   extends JBLayeredPane
/*     */   implements UiDataProvider
/*     */ {
/*     */   public TerminalOutputPanel() {
/* 117 */     setOpaque(false);
/* 118 */     Intrinsics.checkNotNull(JLayeredPane.DEFAULT_LAYER, "null cannot be cast to non-null type kotlin.Any"); add(TerminalOutputView.access$getEditor$p(TerminalOutputView.this).getComponent(), JLayeredPane.DEFAULT_LAYER);
/*     */   }
/*     */   
/*     */   public void uiDataSnapshot(@NotNull DataSink sink) {
/* 122 */     Intrinsics.checkNotNullParameter(sink, "sink"); Intrinsics.checkNotNullExpressionValue(CommonDataKeys.EDITOR, "EDITOR"); sink.set(CommonDataKeys.EDITOR, TerminalOutputView.access$getEditor$p(TerminalOutputView.this));
/*     */   }
/*     */   @NotNull
/*     */   public Dimension getPreferredSize() {
/* 126 */     Intrinsics.checkNotNullExpressionValue(TerminalOutputView.access$getEditor$p(TerminalOutputView.this).getPreferredSize(), "getPreferredSize(...)"); return (TerminalOutputView.access$getEditor$p(TerminalOutputView.this).getDocument().getTextLength() == 0) ? new Dimension() : TerminalOutputView.access$getEditor$p(TerminalOutputView.this).getPreferredSize();
/*     */   }
/*     */   
/*     */   public void doLayout() {
/* 130 */     for (Iterator<Component> iterator = ArrayIteratorKt.iterator((Object[])getComponents()); iterator.hasNext(); ) { Component component = iterator.next();
/* 131 */       Component component1 = component;
/* 132 */       if (Intrinsics.areEqual(component1, TerminalOutputView.access$getEditor$p(TerminalOutputView.this).getComponent())) { Intrinsics.checkNotNull(component); layoutEditor(component); continue; }
/* 133 */        if (component1 instanceof com.intellij.find.SearchReplaceComponent) layoutSearchComponent(component);
/*     */        }
/*     */   
/*     */   }
/*     */   
/*     */   private final void layoutEditor(Component component) {
/* 139 */     int prefHeight = (component.getPreferredSize()).height;
/* 140 */     int compHeight = Math.min(getHeight(), prefHeight);
/* 141 */     component.setBounds(0, getHeight() - compHeight, getWidth(), compHeight);
/*     */   }
/*     */   
/*     */   private final void layoutSearchComponent(Component component) {
/* 145 */     Dimension prefSize = component.getPreferredSize();
/* 146 */     Dimension maxSize = component.getMaximumSize();
/* 147 */     int compWidth = Math.min(getWidth(), Math.min(prefSize.width, maxSize.width));
/* 148 */     int compHeight = Math.min(prefSize.height, maxSize.height);
/* 149 */     component.setBounds(getWidth() - compWidth, 0, compWidth, compHeight);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputView$TerminalOutputPanel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */