/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalUi;
/*     */ import com.intellij.openapi.actionSystem.CommonDataKeys;
/*     */ import com.intellij.openapi.actionSystem.DataSink;
/*     */ import com.intellij.openapi.actionSystem.UiDataProvider;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Color;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.border.Border;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\0012\0020\002B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalView$SimpleTerminalPanel;", "Ljavax/swing/JPanel;", "Lcom/intellij/openapi/actionSystem/UiDataProvider;", "editor", "Lcom/intellij/openapi/editor/Editor;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalView;Lcom/intellij/openapi/editor/Editor;)V", "uiDataSnapshot", "", "sink", "Lcom/intellij/openapi/actionSystem/DataSink;", "ej-core"})
/*     */ final class SimpleTerminalPanel
/*     */   extends JPanel
/*     */   implements UiDataProvider
/*     */ {
/*     */   public SimpleTerminalPanel(Editor editor) {
/*  95 */     setBackground((Color)TerminalUi.INSTANCE.defaultBackground(editor));
/*  96 */     setBorder((Border)JBUI.Borders.emptyLeft(4));
/*  97 */     setLayout(new BorderLayout());
/*  98 */     add(editor.getComponent(), "Center");
/*     */   }
/*     */   
/*     */   public void uiDataSnapshot(@NotNull DataSink sink) {
/* 102 */     Intrinsics.checkNotNullParameter(sink, "sink"); Intrinsics.checkNotNullExpressionValue(CommonDataKeys.EDITOR, "EDITOR"); sink.set(CommonDataKeys.EDITOR, SimpleTerminalView.access$getEditor$p(SimpleTerminalView.this));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\SimpleTerminalView$SimpleTerminalPanel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */