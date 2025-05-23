/*    */ package org.jetbrains.compose.resources;
/*    */ 
/*    */ import androidx.compose.ui.geometry.Size;
/*    */ import androidx.compose.ui.graphics.ColorFilter;
/*    */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*    */ import androidx.compose.ui.unit.Density;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.svg.SVGLengthUnit;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\002\n\002\030\002\n\002\b\005\b\000\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\020\020\026\032\0020\0272\006\020\007\032\0020\bH\024J\022\020\030\032\0020\0272\b\020\t\032\004\030\0010\nH\024J\036\020\031\032\0020\032*\0020\0332\006\020\034\032\0020\fH\002ø\001\000¢\006\004\b\035\020\036J\f\020\037\032\0020\032*\0020\033H\024R\016\020\007\032\0020\bX\016¢\006\002\n\000R\020\020\t\032\004\030\0010\nX\016¢\006\002\n\000R\026\020\013\032\0020\fX\004ø\001\000ø\001\001¢\006\004\n\002\020\rR\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\016\032\0020\017X\004¢\006\002\n\000R\032\020\020\032\0020\f8VX\004ø\001\000ø\001\001¢\006\006\032\004\b\021\020\022R\026\020\023\032\0020\fX\016ø\001\000ø\001\001¢\006\004\n\002\020\rR\020\020\024\032\004\030\0010\025X\004¢\006\002\n\000\002\013\n\005\b¡\0360\001\n\002\b!¨\006 "}, d2 = {"Lorg/jetbrains/compose/resources/SvgPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "dom", "Lorg/jetbrains/skia/svg/SVGDOM;", "density", "Landroidx/compose/ui/unit/Density;", "(Lorg/jetbrains/skia/svg/SVGDOM;Landroidx/compose/ui/unit/Density;)V", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "defaultSizePx", "Landroidx/compose/ui/geometry/Size;", "J", "drawCache", "Lorg/jetbrains/compose/resources/DrawCache;", "intrinsicSize", "getIntrinsicSize-NH-jbRc", "()J", "previousDrawSize", "root", "Lorg/jetbrains/skia/svg/SVGSVG;", "applyAlpha", "", "applyColorFilter", "drawSvg", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "size", "drawSvg-d16Qtg0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", "onDraw", "library"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nSvgPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SvgPainter.kt\norg/jetbrains/compose/resources/SvgPainter\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,91:1\n198#2:92\n198#2:93\n256#3:94\n*S KotlinDebug\n*F\n+ 1 SvgPainter.kt\norg/jetbrains/compose/resources/SvgPainter\n*L\n38#1:92\n44#1:93\n84#1:94\n*E\n"})
/*    */ public final class SvgPainter extends Painter {
/*    */   @NotNull
/*    */   private final SVGDOM dom;
/*    */   @NotNull
/*    */   private final Density density;
/*    */   @Nullable
/*    */   private final SVGSVG root;
/*    */   private final long defaultSizePx;
/*    */   
/* 22 */   public SvgPainter(@NotNull SVGDOM dom, @NotNull Density density) { this.dom = dom;
/* 23 */     this.density = density;
/*    */     
/* 25 */     this.root = this.dom.getRoot();
/*    */     
/* 27 */     SvgPainter svgPainter1 = this, svgPainter2 = this; int $i$a$-run-SvgPainter$defaultSizePx$1 = 0;
/* 28 */     svgPainter1.root.getWidth().withUnit(SVGLengthUnit.PX); float width = (svgPainter1.root != null && svgPainter1.root.getWidth() != null && svgPainter1.root.getWidth().withUnit(SVGLengthUnit.PX) != null) ? svgPainter1.root.getWidth().withUnit(SVGLengthUnit.PX).getValue() : 0.0F;
/* 29 */     svgPainter1.root.getHeight().withUnit(SVGLengthUnit.PX); float height = (svgPainter1.root != null && svgPainter1.root.getHeight() != null && svgPainter1.root.getHeight().withUnit(SVGLengthUnit.PX) != null) ? svgPainter1.root.getHeight().withUnit(SVGLengthUnit.PX).getValue() : 0.0F;
/* 30 */     long l = (((width == 0.0F)) && ((height == 0.0F))) ? 
/* 31 */       Size.Companion.getUnspecified-NH-jbRc() : 
/*    */       
/* 33 */       SizeKt.Size(width, height);
/*    */ 
/*    */     
/*    */     svgPainter2.defaultSizePx = l;
/*    */     
/* 38 */     if (((this.root != null) ? this.root.getViewBox() : null) == null) { long $this$isSpecified$iv = this.defaultSizePx; int $i$f$isSpecified-uvyYCjk = 0;
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
/* 92 */       if (($this$isSpecified$iv != 9205357640488583168L))
/* 93 */         if (this.root == null) {  } else { this.root.setViewBox(Rect.Companion.makeXYWH(0.0F, 0.0F, Size.getWidth-impl(this.defaultSizePx), Size.getHeight-impl(this.defaultSizePx))); }   }  this.previousDrawSize = Size.Companion.getUnspecified-NH-jbRc(); this.alpha = 1.0F; this.drawCache = new DrawCache(); } private long previousDrawSize; private float alpha; @Nullable private ColorFilter colorFilter; @NotNull private final DrawCache drawCache; public static final int $stable = 8; public long getIntrinsicSize-NH-jbRc() { long $this$isSpecified$iv = this.defaultSizePx; int $i$f$isSpecified-uvyYCjk = 0; return (($this$isSpecified$iv != 9205357640488583168L)) ? Size.times-7Ah8Wj8(this.defaultSizePx, this.density.getDensity()) : Size.Companion.getUnspecified-NH-jbRc(); } protected boolean applyAlpha(float alpha) { this.alpha = alpha; return true; } protected boolean applyColorFilter(@Nullable ColorFilter colorFilter) { this.colorFilter = colorFilter; return true; }
/* 94 */   private final void drawSvg-d16Qtg0(DrawScope $this$drawSvg_u2dd16Qtg0, long size) { DrawScope $this$drawIntoCanvas$iv = $this$drawSvg_u2dd16Qtg0; int $i$f$drawIntoCanvas = 0; Canvas canvas = $this$drawIntoCanvas$iv.getDrawContext().getCanvas(); int $i$a$-drawIntoCanvas-SvgPainter$drawSvg$1 = 0;
/*    */     if (this.root == null) {
/*    */     
/*    */     } else {
/*    */       this.root.setWidth(new SVGLength(Size.getWidth-impl(size), SVGLengthUnit.PX));
/*    */     } 
/*    */     if (this.root == null) {
/*    */     
/*    */     } else {
/*    */       this.root.setHeight(new SVGLength(Size.getHeight-impl(size), SVGLengthUnit.PX));
/*    */     } 
/*    */     if (this.root == null) {
/*    */     
/*    */     } else {
/*    */       this.root.setPreserveAspectRatio(new SVGPreserveAspectRatio(SVGPreserveAspectRatioAlign.NONE));
/*    */     } 
/*    */     this.dom.render(SkiaBackedCanvas_skikoKt.getNativeCanvas(canvas)); }
/*    */ 
/*    */   
/*    */   protected void onDraw(@NotNull DrawScope $this$onDraw) {
/*    */     Intrinsics.checkNotNullParameter($this$onDraw, "<this>");
/*    */     if (!Size.equals-impl0(this.previousDrawSize, $this$onDraw.getSize-NH-jbRc()))
/*    */       this.drawCache.drawCachedImage-FqjB98A(ImageBitmapConfig.Companion.getArgb8888-_sVssgQ(), IntSizeKt.IntSize((int)(float)Math.ceil(Size.getWidth-impl($this$onDraw.getSize-NH-jbRc())), (int)(float)Math.ceil(Size.getHeight-impl($this$onDraw.getSize-NH-jbRc()))), (Density)$this$onDraw, $this$onDraw.getLayoutDirection(), new SvgPainter$onDraw$1()); 
/*    */     this.drawCache.drawInto($this$onDraw, this.alpha, this.colorFilter);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"})
/*    */   static final class SvgPainter$onDraw$1 extends Lambda implements Function1<DrawScope, Unit> {
/*    */     public final void invoke(@NotNull DrawScope $this$drawCachedImage) {
/*    */       Intrinsics.checkNotNullParameter($this$drawCachedImage, "$this$drawCachedImage");
/*    */       SvgPainter.this.drawSvg-d16Qtg0($this$drawCachedImage, $this$drawCachedImage.getSize-NH-jbRc());
/*    */     }
/*    */     
/*    */     SvgPainter$onDraw$1() {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\SvgPainter.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */