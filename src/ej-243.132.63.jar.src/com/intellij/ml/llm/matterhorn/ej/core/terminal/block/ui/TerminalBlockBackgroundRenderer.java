/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.colors.ColorKey;
/*    */ import com.intellij.openapi.editor.markup.CustomHighlighterOrder;
/*    */ import com.intellij.openapi.editor.markup.RangeHighlighter;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Rectangle;
/*    */ import java.awt.geom.Rectangle2D;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\035\b\002\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007B\021\b\026\022\006\020\002\032\0020\003¢\006\004\b\006\020\bB\021\b\026\022\006\020\004\032\0020\005¢\006\004\b\006\020\tJ\b\020\n\032\0020\013H\026J \020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\023H\026R\020\020\002\032\004\030\0010\003X\004¢\006\002\n\000R\020\020\004\032\004\030\0010\005X\004¢\006\002\n\000¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalBlockBackgroundRenderer;", "Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;", "backgroundKey", "Lcom/intellij/openapi/editor/colors/ColorKey;", "gradientCache", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;", "<init>", "(Lcom/intellij/openapi/editor/colors/ColorKey;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;)V", "(Lcom/intellij/openapi/editor/colors/ColorKey;)V", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;)V", "getOrder", "Lcom/intellij/openapi/editor/markup/CustomHighlighterOrder;", "paint", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "highlighter", "Lcom/intellij/openapi/editor/markup/RangeHighlighter;", "g", "Ljava/awt/Graphics;", "ej-core"})
/*    */ public final class TerminalBlockBackgroundRenderer implements CustomHighlighterRenderer {
/*    */   @Nullable
/*    */   private final ColorKey backgroundKey;
/*    */   
/*    */   private TerminalBlockBackgroundRenderer(ColorKey backgroundKey, GradientTextureCache gradientCache) {
/* 20 */     this.backgroundKey = backgroundKey;
/* 21 */     this.gradientCache = gradientCache;
/*    */   } @Nullable
/*    */   private final GradientTextureCache gradientCache; public TerminalBlockBackgroundRenderer(@NotNull ColorKey backgroundKey) {
/* 24 */     this(backgroundKey, null);
/*    */   }
/*    */   
/* 27 */   public TerminalBlockBackgroundRenderer(@NotNull GradientTextureCache gradientCache) { this(null, gradientCache); } @NotNull
/*    */   public CustomHighlighterOrder getOrder() {
/* 29 */     return CustomHighlighterOrder.BEFORE_BACKGROUND;
/*    */   }
/*    */   public void paint(@NotNull Editor editor, @NotNull RangeHighlighter highlighter, @NotNull Graphics g) {
/* 32 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(highlighter, "highlighter"); Intrinsics.checkNotNullParameter(g, "g"); Intrinsics.checkNotNullExpressionValue(editor.getScrollingModel().getVisibleArea(), "getVisibleArea(...)"); Rectangle visibleArea = editor.getScrollingModel().getVisibleArea();
/* 33 */     int width = visibleArea.width - JBUI.scale(10);
/* 34 */     float topY = (editor.offsetToXY(highlighter.getStartOffset())).y;
/* 35 */     float bottomY = (editor.offsetToXY(highlighter.getEndOffset())).y + editor.getLineHeight();
/* 36 */     Rectangle2D.Float rect = new Rectangle2D.Float(0.0F, topY, width, bottomY - topY);
/*    */     
/* 38 */     Intrinsics.checkNotNull(g.create(), "null cannot be cast to non-null type java.awt.Graphics2D"); Graphics2D g2d = (Graphics2D)g.create();
/*    */     try {
/* 40 */       Paint it = TerminalBlockBackgroundRendererKt.getBlockBackgroundPaint(editor, g2d, width, this.gradientCache, this.backgroundKey); int $i$a$-let-TerminalBlockBackgroundRenderer$paint$1 = 0;
/* 41 */       g2d.setPaint(it);
/* 42 */       g2d.fill(rect);
/*    */       
/*    */       TerminalBlockBackgroundRendererKt.getBlockBackgroundPaint(editor, g2d, width, this.gradientCache, this.backgroundKey);
/*    */     } finally {
/* 46 */       g2d.dispose();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\ui\TerminalBlockBackgroundRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */