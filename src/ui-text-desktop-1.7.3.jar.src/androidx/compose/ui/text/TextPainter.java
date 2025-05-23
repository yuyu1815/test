/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.geometry.RectKt;
/*     */ import androidx.compose.ui.geometry.SizeKt;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Canvas;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.Shadow;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*     */ import androidx.compose.ui.graphics.drawscope.Fill;
/*     */ import androidx.compose.ui.text.style.TextDecoration;
/*     */ import androidx.compose.ui.text.style.TextForegroundStyle;
/*     */ import androidx.compose.ui.text.style.TextOverflow;
/*     */ import androidx.compose.ui.unit.IntSize;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b¨\006\t"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class TextPainter
/*     */ {
/*     */   @NotNull
/*     */   public static final TextPainter INSTANCE = new TextPainter();
/*     */   public static final int $stable;
/*     */   
/*     */   public final void paint(@NotNull Canvas canvas, @NotNull TextLayoutResult textLayoutResult) {
/*  53 */     Intrinsics.checkNotNullParameter(canvas, "canvas"); Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult"); boolean needClipping = (textLayoutResult.getHasVisualOverflow() && 
/*  54 */       !TextOverflow.equals-impl0(textLayoutResult.getLayoutInput().getOverflow-gIe3tQ8(), TextOverflow.Companion.getVisible-gIe3tQ8()));
/*  55 */     if (needClipping) {
/*  56 */       float width = IntSize.getWidth-impl(textLayoutResult.getSize-YbymL2g());
/*  57 */       float height = IntSize.getHeight-impl(textLayoutResult.getSize-YbymL2g());
/*  58 */       Rect bounds = RectKt.Rect-tz77jQw(Offset.Companion.getZero-F1C5BW0(), SizeKt.Size(width, height));
/*  59 */       canvas.save();
/*  60 */       Canvas.clipRect-mtrdD-E$default(canvas, bounds, 0, 2, null);
/*     */     } 
/*     */ 
/*     */     
/*  64 */     SpanStyle style = textLayoutResult.getLayoutInput().getStyle().getSpanStyle$ui_text();
/*  65 */     if (style.getTextDecoration() == null) style.getTextDecoration();  TextDecoration textDecoration = TextDecoration.Companion.getNone();
/*  66 */     if (style.getShadow() == null) style.getShadow();  Shadow shadow = Shadow.Companion.getNone();
/*  67 */     if (style.getDrawStyle() == null) style.getDrawStyle();  DrawStyle drawStyle = (DrawStyle)Fill.INSTANCE;
/*     */     try {
/*  69 */       Brush brush = style.getBrush();
/*  70 */       if (brush != null) {
/*  71 */         float alpha = (style.getTextForegroundStyle$ui_text() != TextForegroundStyle.Unspecified.INSTANCE) ? 
/*  72 */           style.getTextForegroundStyle$ui_text().getAlpha() : 
/*     */           
/*  74 */           1.0F;
/*     */         
/*  76 */         MultiParagraph.paint-hn5TExg$default(textLayoutResult.getMultiParagraph(), 
/*  77 */             canvas, 
/*  78 */             brush, 
/*  79 */             alpha, 
/*  80 */             shadow, 
/*  81 */             textDecoration, 
/*  82 */             drawStyle, 0, 64, null);
/*     */       } else {
/*     */         
/*  85 */         long color = (style.getTextForegroundStyle$ui_text() != TextForegroundStyle.Unspecified.INSTANCE) ? 
/*  86 */           style.getTextForegroundStyle$ui_text().getColor-0d7_KjU() : 
/*     */           
/*  88 */           Color.Companion.getBlack-0d7_KjU();
/*     */         
/*  90 */         MultiParagraph.paint-LG529CI$default(textLayoutResult.getMultiParagraph(), 
/*  91 */             canvas, 
/*  92 */             color, 
/*  93 */             shadow, 
/*  94 */             textDecoration, 
/*  95 */             drawStyle, 0, 32, null);
/*     */       } 
/*     */     } finally {
/*     */       
/*  99 */       if (needClipping)
/* 100 */         canvas.restore(); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\TextPainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */