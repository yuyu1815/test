/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ import androidx.compose.ui.geometry.Offset;
/*    */ import androidx.compose.ui.geometry.Rect;
/*    */ import androidx.compose.ui.geometry.Size;
/*    */ import androidx.compose.ui.graphics.Canvas;
/*    */ import androidx.compose.ui.graphics.Outline;
/*    */ import androidx.compose.ui.graphics.OutlineKt;
/*    */ import androidx.compose.ui.graphics.Paint;
/*    */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*    */ import androidx.compose.ui.graphics.painter.Painter;
/*    */ import androidx.compose.ui.unit.DensityKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.painter.badge.BadgeShape;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\002\b\003\b\007\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\b\020\r\032\0020\fH\002J\f\020\016\032\0020\017*\0020\020H\002J\f\020\021\032\0020\017*\0020\020H\002J\f\020\022\032\0020\017*\0020\020H\024R\016\020\002\032\0020\003X\004¢\006\002\n\000R\020\020\004\032\0020\005X\004¢\006\004\n\002\020\nR\016\020\006\032\0020\007X\004¢\006\002\n\000R\020\020\013\032\004\030\0010\fX\016¢\006\002\n\000¨\006\023"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/BadgePainter;", "Lorg/jetbrains/jewel/ui/painter/DelegatePainter;", "source", "Landroidx/compose/ui/graphics/painter/Painter;", "color", "Landroidx/compose/ui/graphics/Color;", "shape", "Lorg/jetbrains/jewel/ui/painter/badge/BadgeShape;", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;JLorg/jetbrains/jewel/ui/painter/badge/BadgeShape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "layerPaint", "Landroidx/compose/ui/graphics/Paint;", "obtainPaint", "drawHole", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawBadge", "onDraw", "ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nBadgePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgePainter.kt\norg/jetbrains/jewel/ui/painter/BadgePainter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,64:1\n256#2:65\n111#3,7:66\n*S KotlinDebug\n*F\n+ 1 BadgePainter.kt\norg/jetbrains/jewel/ui/painter/BadgePainter\n*L\n55#1:65\n56#1:66,7\n*E\n"})
/*    */ public final class BadgePainter extends DelegatePainter {
/*    */   @NotNull
/*    */   private final Painter source;
/*    */   
/*    */   private BadgePainter(Painter source, long color, BadgeShape shape) {
/* 25 */     super(source);
/*    */     this.source = source;
/*    */     this.color = color;
/*    */     this.shape = shape;
/*    */   }
/*    */   private final long color; @NotNull
/*    */   private final BadgeShape shape; @Nullable
/*    */   private Paint layerPaint; public static final int $stable = 8;
/*    */   
/*    */   private final Paint obtainPaint() {
/* 35 */     Paint target = this.layerPaint;
/* 36 */     if (target == null) {
/* 37 */       target = SkiaBackedPaint_skikoKt.Paint();
/* 38 */       this.layerPaint = target;
/*    */     } 
/* 40 */     return target;
/*    */   }
/*    */   
/*    */   private final void drawHole(DrawScope $this$drawHole) {
/* 44 */     Outline badge = this.shape.createHoleOutline-Pq9zytI($this$drawHole.getSize-NH-jbRc(), $this$drawHole.getLayoutDirection(), DensityKt.Density$default($this$drawHole.getDensity(), 0.0F, 2, null));
/* 45 */     OutlineKt.drawOutline-wDX37Ww$default($this$drawHole, badge, Color.Companion.getWhite-0d7_KjU(), getAlpha(), null, null, BlendMode.Companion.getClear-0nO6VwU(), 24, null);
/*    */   }
/*    */   
/*    */   private final void drawBadge(DrawScope $this$drawBadge) {
/* 49 */     Outline badge = this.shape.createOutline-Pq9zytI($this$drawBadge.getSize-NH-jbRc(), $this$drawBadge.getLayoutDirection(), DensityKt.Density$default($this$drawBadge.getDensity(), 0.0F, 2, null));
/* 50 */     OutlineKt.drawOutline-wDX37Ww$default($this$drawBadge, badge, this.color, getAlpha(), null, null, 0, 56, null);
/*    */   }
/*    */   
/*    */   protected void onDraw(@NotNull DrawScope $this$onDraw) {
/* 54 */     Intrinsics.checkNotNullParameter($this$onDraw, "<this>"); Rect layerRect = RectKt.Rect-tz77jQw(Offset.Companion.getZero-F1C5BW0(), SizeKt.Size(Size.getWidth-impl($this$onDraw.getSize-NH-jbRc()), Size.getHeight-impl($this$onDraw.getSize-NH-jbRc())));
/* 55 */     DrawScope $this$drawIntoCanvas$iv = $this$onDraw; int $i$f$drawIntoCanvas = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 65 */     Canvas canvas = $this$drawIntoCanvas$iv.getDrawContext().getCanvas(); int $i$a$-drawIntoCanvas-BadgePainter$onDraw$1 = 0; Canvas canvas1 = canvas; Paint paint$iv = obtainPaint(); int $i$f$withSaveLayer = 0;
/*    */     try {
/* 67 */       canvas1.saveLayer(layerRect, paint$iv);
/* 68 */       int $i$a$-withSaveLayer-BadgePainter$onDraw$1$1 = 0; drawDelegate($this$onDraw); drawHole($this$onDraw); drawBadge($this$onDraw);
/*    */     } finally {
/* 70 */       canvas1.restore();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\BadgePainter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */