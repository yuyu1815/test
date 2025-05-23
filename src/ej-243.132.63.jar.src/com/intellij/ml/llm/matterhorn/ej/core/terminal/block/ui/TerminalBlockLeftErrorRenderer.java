/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui;
/*    */ 
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.ex.EditorEx;
/*    */ import com.intellij.openapi.editor.markup.LineMarkerRenderer;
/*    */ import com.intellij.terminal.BlockTerminalColors;
/*    */ import com.intellij.util.ui.JBUI;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Rectangle;
/*    */ import java.awt.RenderingHints;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\020\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalBlockLeftErrorRenderer;", "Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "<init>", "()V", "paint", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "g", "Ljava/awt/Graphics;", "r", "Ljava/awt/Rectangle;", "ej-core"})
/*    */ public class TerminalBlockLeftErrorRenderer implements LineMarkerRenderer {
/*    */   public void paint(@NotNull Editor editor, @NotNull Graphics g, @NotNull Rectangle r) {
/* 19 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(g, "g"); Intrinsics.checkNotNullParameter(r, "r"); int gutterWidth = ((EditorEx)editor).getGutterComponentEx().getWidth();
/* 20 */     int offset = JBUI.scale(2);
/* 21 */     int x = gutterWidth - JBUI.scale(9);
/* 22 */     int y = r.y + offset;
/* 23 */     int width = JBUI.scale(3);
/* 24 */     int height = r.height - JBUI.scale(6) - 2 * offset;
/* 25 */     int arc = JBUI.scale(4);
/*    */     
/* 27 */     Intrinsics.checkNotNull(g.create(), "null cannot be cast to non-null type java.awt.Graphics2D"); Graphics2D g2d = (Graphics2D)g.create();
/*    */     try {
/* 29 */       g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/* 30 */       g2d.setColor(((EditorEx)editor).getColorsScheme().getColor(BlockTerminalColors.ERROR_BLOCK_STROKE_COLOR));
/* 31 */       g2d.fillRoundRect(x, y, width, height, arc, arc);
/*    */     } finally {
/*    */       
/* 34 */       g2d.dispose();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\ui\TerminalBlockLeftErrorRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */