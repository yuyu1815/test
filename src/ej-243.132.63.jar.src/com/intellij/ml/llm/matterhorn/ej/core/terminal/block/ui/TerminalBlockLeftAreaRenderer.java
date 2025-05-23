/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.colors.ColorKey;
/*    */ import com.intellij.openapi.editor.ex.EditorEx;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Rectangle;
/*    */ import java.awt.geom.Path2D;
/*    */ import java.awt.geom.Rectangle2D;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B1\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003\022\n\b\002\020\005\032\004\030\0010\003\022\b\b\002\020\006\032\0020\007¢\006\004\b\b\020\tJ \020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\020\020\004\032\004\030\0010\003X\004¢\006\002\n\000R\020\020\005\032\004\030\0010\003X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalBlockLeftAreaRenderer;", "Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "backgroundKey", "Lcom/intellij/openapi/editor/colors/ColorKey;", "failoverBackgroundKey", "strokeBackgroundKey", "strokeWidth", "", "<init>", "(Lcom/intellij/openapi/editor/colors/ColorKey;Lcom/intellij/openapi/editor/colors/ColorKey;Lcom/intellij/openapi/editor/colors/ColorKey;I)V", "paint", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "g", "Ljava/awt/Graphics;", "r", "Ljava/awt/Rectangle;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nTerminalBlockLeftAreaRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalBlockLeftAreaRenderer.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalBlockLeftAreaRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/*    */ public final class TerminalBlockLeftAreaRenderer implements LineMarkerRenderer {
/*    */   @NotNull
/*    */   private final ColorKey backgroundKey;
/*    */   @Nullable
/*    */   private final ColorKey failoverBackgroundKey;
/*    */   
/*    */   public TerminalBlockLeftAreaRenderer(@NotNull ColorKey backgroundKey, @Nullable ColorKey failoverBackgroundKey, @Nullable ColorKey strokeBackgroundKey, int strokeWidth) {
/* 22 */     this.backgroundKey = backgroundKey;
/* 23 */     this.failoverBackgroundKey = failoverBackgroundKey;
/* 24 */     this.strokeBackgroundKey = strokeBackgroundKey;
/* 25 */     this.strokeWidth = strokeWidth;
/*    */   } @Nullable
/*    */   private final ColorKey strokeBackgroundKey; private final int strokeWidth; public void paint(@NotNull Editor editor, @NotNull Graphics g, @NotNull Rectangle r) {
/* 28 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(g, "g"); Intrinsics.checkNotNullParameter(r, "r"); float topIns = TerminalUiUtils.INSTANCE.toFloatAndScale(6);
/* 29 */     float blocksGap = TerminalUiUtils.INSTANCE.toFloatAndScale(0);
/* 30 */     float width = TerminalUiUtils.INSTANCE.toFloatAndScale(9);
/* 31 */     float arc = TerminalUiUtils.INSTANCE.toFloatAndScale(8);
/* 32 */     int selectionGap = JBUI.scale(1);
/*    */     
/* 34 */     int gutterWidth = ((EditorEx)editor).getGutterComponentEx().getWidth();
/*    */ 
/*    */     
/* 37 */     Rectangle2D.Float rect = new Rectangle2D.Float(gutterWidth - width, r.y - topIns + selectionGap, width, r.height + topIns - blocksGap - (selectionGap * 2));
/*    */ 
/*    */     
/* 40 */     Path2D.Float float_1 = new Path2D.Float(0), $this$paint_u24lambda_u240 = float_1; int $i$a$-apply-TerminalBlockLeftAreaRenderer$paint$outerPath$1 = 0;
/* 41 */     $this$paint_u24lambda_u240.moveTo(rect.x + rect.width, rect.y + rect.height);
/* 42 */     $this$paint_u24lambda_u240.lineTo(rect.x + arc, rect.y + rect.height);
/* 43 */     $this$paint_u24lambda_u240.quadTo(rect.x, rect.y + rect.height, rect.x, rect.y + rect.height - arc);
/* 44 */     $this$paint_u24lambda_u240.lineTo(rect.x, rect.y + arc);
/* 45 */     $this$paint_u24lambda_u240.quadTo(rect.x, rect.y, rect.x + arc, rect.y);
/* 46 */     $this$paint_u24lambda_u240.lineTo(rect.x + rect.width, rect.y);
/*    */     
/*    */     Path2D.Float outerPath = float_1;
/* 49 */     Path2D.Float $this$paint_u24lambda_u241 = $this$paint_u24lambda_u240 = new Path2D.Float(0); int $i$a$-apply-TerminalBlockLeftAreaRenderer$paint$path$1 = 0;
/* 50 */     $this$paint_u24lambda_u241.append(outerPath, false);
/* 51 */     $this$paint_u24lambda_u241.moveTo(rect.x + rect.width, rect.y);
/* 52 */     $this$paint_u24lambda_u241.lineTo(rect.x + rect.width, rect.y + rect.height);
/* 53 */     $this$paint_u24lambda_u241.closePath();
/*    */     Path2D.Float path = $this$paint_u24lambda_u240;
/* 55 */     ColorKey colorKey1 = this.strokeBackgroundKey, it = colorKey1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 98 */     int $i$a$-takeIf-TerminalBlockLeftAreaRenderer$paint$strokeBackgroundColor$1 = 0;
/*    */     Object object = ((this.strokeWidth > 0)) ? colorKey1 : null;
/*    */     int $i$a$-let-TerminalBlockLeftAreaRenderer$paint$strokeBackgroundColor$2 = 0;
/*    */     ((this.strokeWidth > 0)) ? colorKey1 : null;
/*    */     Color strokeBackgroundColor = ((((this.strokeWidth > 0)) ? colorKey1 : null) != null) ? ((EditorEx)editor).getColorsScheme().getColor((ColorKey)object) : null;
/*    */     float stroke = TerminalUiUtils.INSTANCE.toFloatAndScale(this.strokeWidth);
/*    */     Path2D.Float float_2 = new Path2D.Float(0), $this$paint_u24lambda_u244 = float_2;
/*    */     int $i$a$-apply-TerminalBlockLeftAreaRenderer$paint$strokePath$innerPath$1 = 0;
/*    */     $this$paint_u24lambda_u244.moveTo(rect.x + rect.width, rect.y + stroke);
/*    */     $this$paint_u24lambda_u244.lineTo(rect.x + arc, rect.y + stroke);
/*    */     $this$paint_u24lambda_u244.quadTo(rect.x + stroke, rect.y + stroke, rect.x + stroke, rect.y + arc);
/*    */     $this$paint_u24lambda_u244.lineTo(rect.x + stroke, rect.y + rect.height - arc);
/*    */     $this$paint_u24lambda_u244.quadTo(rect.x + stroke, rect.y + rect.height - stroke, rect.x + arc, rect.y + rect.height - stroke);
/*    */     $this$paint_u24lambda_u244.lineTo(rect.x + rect.width, rect.y + rect.height - stroke);
/*    */     innerPath = float_2;
/*    */     Path2D.Float $this$paint_u24lambda_u245 = float_2 = new Path2D.Float(0);
/*    */     int $i$a$-apply-TerminalBlockLeftAreaRenderer$paint$strokePath$1 = 0;
/*    */     $this$paint_u24lambda_u245.append(outerPath, false);
/*    */     $this$paint_u24lambda_u245.append(innerPath, false);
/*    */     $this$paint_u24lambda_u245.moveTo(rect.x + rect.width, rect.y);
/*    */     $this$paint_u24lambda_u245.lineTo(rect.x + rect.width, rect.y + stroke);
/*    */     $this$paint_u24lambda_u245.moveTo(rect.x + rect.width, rect.y + rect.height - stroke);
/*    */     $this$paint_u24lambda_u245.lineTo(rect.x + rect.width, rect.y + rect.height);
/*    */     $this$paint_u24lambda_u245.closePath();
/*    */     Path2D.Float strokePath = (strokeBackgroundColor != null) ? float_2 : null;
/*    */     Intrinsics.checkNotNull(g.create(), "null cannot be cast to non-null type java.awt.Graphics2D");
/*    */     Graphics2D g2d = (Graphics2D)g.create();
/*    */     try {
/*    */       g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/*    */       if (((EditorEx)editor).getColorsScheme().getColor(this.backgroundKey) == null)
/*    */         ((EditorEx)editor).getColorsScheme().getColor(this.backgroundKey); 
/*    */       ((EditorEx)editor).getColorsScheme().getColor(this.backgroundKey).setColor(((EditorEx)editor).getColorsScheme().getColor(this.failoverBackgroundKey));
/*    */       g2d.fill(path);
/*    */       if (strokePath != null) {
/*    */         g2d.setColor(strokeBackgroundColor);
/*    */         g2d.fill(strokePath);
/*    */       } 
/*    */     } finally {
/*    */       g2d.dispose();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\ui\TerminalBlockLeftAreaRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */