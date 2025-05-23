/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.markup.CustomHighlighterRenderer;
/*    */ import com.intellij.openapi.editor.markup.RangeHighlighter;
/*    */ import com.intellij.util.ui.JBUI;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Rectangle;
/*    */ import java.awt.geom.Rectangle2D;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/BlockSeparatorRenderer;", "Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;", "<init>", "()V", "paint", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "highlighter", "Lcom/intellij/openapi/editor/markup/RangeHighlighter;", "g", "Ljava/awt/Graphics;", "ej-core"})
/*    */ public final class BlockSeparatorRenderer implements CustomHighlighterRenderer {
/*    */   public void paint(@NotNull Editor editor, @NotNull RangeHighlighter highlighter, @NotNull Graphics g) {
/* 17 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(highlighter, "highlighter"); Intrinsics.checkNotNullParameter(g, "g"); if (highlighter.getEndOffset() == editor.getDocument().getTextLength()) {
/*    */       return;
/*    */     }
/*    */     
/* 21 */     Intrinsics.checkNotNullExpressionValue(editor.getScrollingModel().getVisibleArea(), "getVisibleArea(...)"); Rectangle visibleArea = editor.getScrollingModel().getVisibleArea();
/* 22 */     float rightX = visibleArea.width - JBUI.scale(19);
/* 23 */     float bottomY = (editor.offsetToXY(highlighter.getEndOffset())).y + editor.getLineHeight() + JBUI.scale(6);
/* 24 */     Rectangle2D.Float rect = new Rectangle2D.Float(0.0F, bottomY, rightX, 1.0F);
/*    */     
/* 26 */     Intrinsics.checkNotNull(g.create(), "null cannot be cast to non-null type java.awt.Graphics2D"); Graphics2D g2d = (Graphics2D)g.create();
/*    */     try {
/* 28 */       g2d.setColor(TerminalUi.INSTANCE.promptSeparatorColor(editor));
/* 29 */       g2d.fill(rect);
/*    */     } finally {
/*    */       
/* 32 */       g2d.dispose();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\ui\BlockSeparatorRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */