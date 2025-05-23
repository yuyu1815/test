/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui;
/*     */ 
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.colors.ColorKey;
/*     */ import com.intellij.openapi.editor.markup.RangeHighlighter;
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.geom.Path2D;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\005\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B3\b\002\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003\022\b\b\002\020\007\032\0020\b¢\006\004\b\t\020\nB'\b\026\022\006\020\002\032\0020\003\022\n\b\002\020\006\032\004\030\0010\003\022\b\b\002\020\007\032\0020\b¢\006\004\b\t\020\013B'\b\026\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\003\022\b\b\002\020\007\032\0020\b¢\006\004\b\t\020\fJ \020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\0242\006\020\025\032\0020\026H\026R\020\020\002\032\004\030\0010\003X\004¢\006\002\n\000R\020\020\004\032\004\030\0010\005X\004¢\006\002\n\000R\020\020\006\032\004\030\0010\003X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R\016\020\r\032\0020\016X\004¢\006\002\n\000¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalBlockCornersRenderer;", "Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;", "backgroundKey", "Lcom/intellij/openapi/editor/colors/ColorKey;", "gradientCache", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;", "strokeBackgroundKey", "strokeWidth", "", "<init>", "(Lcom/intellij/openapi/editor/colors/ColorKey;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;Lcom/intellij/openapi/editor/colors/ColorKey;I)V", "(Lcom/intellij/openapi/editor/colors/ColorKey;Lcom/intellij/openapi/editor/colors/ColorKey;I)V", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;Lcom/intellij/openapi/editor/colors/ColorKey;I)V", "separatorRenderer", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/BlockSeparatorRenderer;", "paint", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "highlighter", "Lcom/intellij/openapi/editor/markup/RangeHighlighter;", "g", "Ljava/awt/Graphics;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalBlockCornersRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalBlockCornersRenderer.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalBlockCornersRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n1#2:144\n*E\n"})
/*     */ public final class TerminalBlockCornersRenderer implements CustomHighlighterRenderer {
/*     */   @Nullable
/*     */   private final ColorKey backgroundKey;
/*     */   @Nullable
/*     */   private final GradientTextureCache gradientCache;
/*     */   
/*  25 */   private TerminalBlockCornersRenderer(ColorKey backgroundKey, GradientTextureCache gradientCache, ColorKey strokeBackgroundKey, int strokeWidth) { this.backgroundKey = backgroundKey;
/*  26 */     this.gradientCache = gradientCache;
/*  27 */     this.strokeBackgroundKey = strokeBackgroundKey;
/*  28 */     this.strokeWidth = strokeWidth;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  46 */     this.separatorRenderer = new BlockSeparatorRenderer(); }
/*     */   @Nullable private final ColorKey strokeBackgroundKey;
/*     */   private final int strokeWidth; @NotNull
/*  49 */   private final BlockSeparatorRenderer separatorRenderer; public TerminalBlockCornersRenderer(@NotNull ColorKey backgroundKey, @Nullable ColorKey strokeBackgroundKey, int strokeWidth) { this(backgroundKey, null, strokeBackgroundKey, strokeWidth); } public TerminalBlockCornersRenderer(@NotNull GradientTextureCache gradientCache, @Nullable ColorKey strokeBackgroundKey, int strokeWidth) { this(null, gradientCache, strokeBackgroundKey, strokeWidth); } public void paint(@NotNull Editor editor, @NotNull RangeHighlighter highlighter, @NotNull Graphics g) { Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(highlighter, "highlighter"); Intrinsics.checkNotNullParameter(g, "g"); float topIns = TerminalUiUtils.INSTANCE.toFloatAndScale(6);
/*  50 */     float bottomIns = TerminalUiUtils.INSTANCE.toFloatAndScale(6);
/*     */ 
/*     */     
/*  53 */     float cornerToBlock = JBUI.scale(10);
/*  54 */     float gap = TerminalUiUtils.INSTANCE.toFloatAndScale(0);
/*  55 */     float arc = TerminalUiUtils.INSTANCE.toFloatAndScale(8);
/*  56 */     int selectionGap = JBUI.scale(1);
/*     */     
/*  58 */     Intrinsics.checkNotNullExpressionValue(editor.getScrollingModel().getVisibleArea(), "getVisibleArea(...)"); Rectangle visibleArea = editor.getScrollingModel().getVisibleArea();
/*  59 */     float width = visibleArea.width - cornerToBlock;
/*  60 */     float topY = (editor.offsetToXY(highlighter.getStartOffset())).y - topIns + selectionGap;
/*  61 */     float bottomY = ((editor.offsetToXY(highlighter.getEndOffset())).y + editor.getLineHeight()) + bottomIns - selectionGap;
/*     */     
/*  63 */     Rectangle2D.Float topRect = new Rectangle2D.Float(0.0F, topY, width, topIns);
/*  64 */     Rectangle2D.Float bottomRect = new Rectangle2D.Float(0.0F, bottomY - bottomIns, width, bottomIns + gap);
/*  65 */     Path2D.Float float_1 = new Path2D.Float(0), $this$paint_u24lambda_u240 = float_1; int $i$a$-apply-TerminalBlockCornersRenderer$paint$topCornerPath$1 = 0;
/*  66 */     $this$paint_u24lambda_u240.moveTo(0.0F, topY);
/*  67 */     $this$paint_u24lambda_u240.lineTo(width - arc, topY);
/*  68 */     $this$paint_u24lambda_u240.quadTo(width, topY, width, topY + arc);
/*  69 */     $this$paint_u24lambda_u240.lineTo(width, topY + topIns);
/*  70 */     $this$paint_u24lambda_u240.lineTo(0.0F, topY + topIns);
/*  71 */     $this$paint_u24lambda_u240.lineTo(0.0F, topY);
/*  72 */     $this$paint_u24lambda_u240.closePath();
/*     */     Path2D.Float topCornerPath = float_1;
/*  74 */     Path2D.Float $this$paint_u24lambda_u241 = $this$paint_u24lambda_u240 = new Path2D.Float(0); int $i$a$-apply-TerminalBlockCornersRenderer$paint$bottomCornerPath$1 = 0;
/*  75 */     $this$paint_u24lambda_u241.moveTo(0.0F, bottomY - bottomIns);
/*  76 */     $this$paint_u24lambda_u241.lineTo(width, bottomY - bottomIns);
/*  77 */     $this$paint_u24lambda_u241.lineTo(width, bottomY - arc);
/*  78 */     $this$paint_u24lambda_u241.quadTo(width, bottomY, width - arc, bottomY);
/*  79 */     $this$paint_u24lambda_u241.lineTo(0.0F, bottomY);
/*  80 */     $this$paint_u24lambda_u241.lineTo(0.0F, bottomY - bottomIns);
/*  81 */     $this$paint_u24lambda_u241.closePath();
/*     */     Path2D.Float bottomCornerPath = $this$paint_u24lambda_u240;
/*  83 */     ColorKey colorKey1 = this.strokeBackgroundKey, it = colorKey1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     int $i$a$-takeIf-TerminalBlockCornersRenderer$paint$strokeBackground$1 = 0;
/*     */     Object object = ((this.strokeWidth > 0)) ? colorKey1 : null;
/*     */     int $i$a$-let-TerminalBlockCornersRenderer$paint$strokeBackground$2 = 0;
/*     */     ((this.strokeWidth > 0)) ? colorKey1 : null;
/*     */     Color strokeBackground = ((((this.strokeWidth > 0)) ? colorKey1 : null) != null) ? editor.getColorsScheme().getColor((ColorKey)object) : null;
/*     */     float stroke = TerminalUiUtils.INSTANCE.toFloatAndScale(this.strokeWidth);
/*     */     Path2D.Float float_2 = new Path2D.Float(0), $this$paint_u24lambda_u244 = float_2;
/*     */     int $i$a$-apply-TerminalBlockCornersRenderer$paint$strokePath$outerPath$1 = 0;
/*     */     $this$paint_u24lambda_u244.moveTo(0.0F, topY);
/*     */     $this$paint_u24lambda_u244.lineTo(width - arc, topY);
/*     */     $this$paint_u24lambda_u244.quadTo(width, topY, width, topY + arc);
/*     */     $this$paint_u24lambda_u244.lineTo(width, bottomY - arc);
/*     */     $this$paint_u24lambda_u244.quadTo(width, bottomY, width - arc, bottomY);
/*     */     $this$paint_u24lambda_u244.lineTo(0.0F, bottomY);
/*     */     outerPath = float_2;
/*     */     Path2D.Float $this$paint_u24lambda_u245 = $this$paint_u24lambda_u244 = new Path2D.Float(0);
/*     */     int $i$a$-apply-TerminalBlockCornersRenderer$paint$strokePath$innerPath$1 = 0;
/*     */     $this$paint_u24lambda_u245.moveTo(0.0F, topY + stroke);
/*     */     $this$paint_u24lambda_u245.lineTo(width - arc, topY + stroke);
/*     */     $this$paint_u24lambda_u245.quadTo(width - stroke, topY + stroke, width - stroke, topY + arc);
/*     */     $this$paint_u24lambda_u245.lineTo(width - stroke, bottomY - arc);
/*     */     $this$paint_u24lambda_u245.quadTo(width - stroke, bottomY - stroke, width - arc, bottomY - stroke);
/*     */     $this$paint_u24lambda_u245.lineTo(0.0F, bottomY - stroke);
/*     */     Path2D.Float innerPath = $this$paint_u24lambda_u244;
/*     */     Path2D.Float $this$paint_u24lambda_u246 = $this$paint_u24lambda_u244 = new Path2D.Float(0);
/*     */     int $i$a$-apply-TerminalBlockCornersRenderer$paint$strokePath$1 = 0;
/*     */     $this$paint_u24lambda_u246.append(outerPath, false);
/*     */     $this$paint_u24lambda_u246.append(innerPath, false);
/*     */     $this$paint_u24lambda_u246.moveTo(0.0F, topY);
/*     */     $this$paint_u24lambda_u246.lineTo(0.0F, topY + stroke);
/*     */     $this$paint_u24lambda_u246.moveTo(0.0F, bottomY - stroke);
/*     */     $this$paint_u24lambda_u246.lineTo(0.0F, bottomY);
/*     */     $this$paint_u24lambda_u246.closePath();
/*     */     Path2D.Float strokePath = (strokeBackground != null) ? $this$paint_u24lambda_u244 : null;
/*     */     Intrinsics.checkNotNull(g.create(), "null cannot be cast to non-null type java.awt.Graphics2D");
/*     */     Graphics2D g2d = (Graphics2D)g.create();
/*     */     try {
/*     */       g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/*     */       g2d.setColor((Color)TerminalUi.INSTANCE.defaultBackground(editor));
/*     */       g2d.fill(topRect);
/*     */       g2d.fill(bottomRect);
/*     */       Paint paint = TerminalBlockBackgroundRendererKt.getBlockBackgroundPaint(editor, g2d, (int)width, this.gradientCache, this.backgroundKey);
/*     */       int $i$a$-let-TerminalBlockCornersRenderer$paint$1 = 0;
/*     */       g2d.setPaint(paint);
/*     */       g2d.fill(topCornerPath);
/*     */       g2d.fill(bottomCornerPath);
/*     */       TerminalBlockBackgroundRendererKt.getBlockBackgroundPaint(editor, g2d, (int)width, this.gradientCache, this.backgroundKey);
/*     */       if (strokePath != null) {
/*     */         g2d.setPaint(strokeBackground);
/*     */         g2d.fill(strokePath);
/*     */       } 
/*     */     } finally {
/*     */       g2d.dispose();
/*     */     } 
/*     */     this.separatorRenderer.paint(editor, highlighter, g); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\ui\TerminalBlockCornersRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */