/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.geometry.SizeKt;
/*     */ import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.graphics.painter.Painter;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Image;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.ImageObserver;
/*     */ import java.awt.image.ImageProducer;
/*     */ import java.awt.image.MultiResolutionImage;
/*     */ import java.util.List;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.math.MathKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000p\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020\006\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\002\b\002\b\002\030\0002\0020\0012\0020\002B%\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013J\030\020\030\032\0020\0312\006\020\027\032\0020\0232\006\020\022\032\0020\023H\002J\b\020\032\032\0020\033H\026J\022\020\034\032\0020\0232\b\020\035\032\004\030\0010\036H\026J\032\020\037\032\0020 2\006\020!\032\0020\"2\b\020\035\032\004\030\0010\036H\026J\030\020#\032\0020\0012\006\020$\032\0020%2\006\020&\032\0020%H\026J\016\020'\032\b\022\004\022\0020\r0(H\026J\b\020)\032\0020*H\026J\022\020+\032\0020\0232\b\020\035\032\004\030\0010\036H\026R\033\020\f\032\0020\r8BX\002¢\006\f\n\004\b\020\020\021\032\004\b\016\020\017R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\022\032\0020\023X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R\016\020\003\032\0020\004X\004¢\006\002\n\000R\033\020\024\032\0020\r8BX\002¢\006\f\n\004\b\026\020\021\032\004\b\025\020\017R\016\020\027\032\0020\023X\004¢\006\002\n\000¨\006,"}, d2 = {"Landroidx/compose/ui/graphics/PainterImage;", "Ljava/awt/Image;", "Ljava/awt/image/MultiResolutionImage;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "defaultImage", "Ljava/awt/image/BufferedImage;", "getDefaultImage", "()Ljava/awt/image/BufferedImage;", "defaultImage$delegate", "Lkotlin/Lazy;", "height", "", "scaledImage", "getScaledImage", "scaledImage$delegate", "width", "asBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "getGraphics", "Ljava/awt/Graphics;", "getHeight", "observer", "Ljava/awt/image/ImageObserver;", "getProperty", "", "name", "", "getResolutionVariant", "destImageWidth", "", "destImageHeight", "getResolutionVariants", "", "getSource", "Ljava/awt/image/ImageProducer;", "getWidth", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nDesktopImageConverters.desktop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DesktopImageConverters.desktop.kt\nandroidx/compose/ui/graphics/PainterImage\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,266:1\n546#2,17:267\n*S KotlinDebug\n*F\n+ 1 DesktopImageConverters.desktop.kt\nandroidx/compose/ui/graphics/PainterImage\n*L\n164#1:267,17\n*E\n"})
/*     */ final class PainterImage
/*     */   extends Image
/*     */   implements MultiResolutionImage
/*     */ {
/*     */   @NotNull
/*     */   private final Painter painter;
/*     */   @NotNull
/*     */   private final Density density;
/*     */   @NotNull
/*     */   private final LayoutDirection layoutDirection;
/*     */   private final int width;
/*     */   private final int height;
/*     */   @NotNull
/*     */   private final Lazy defaultImage$delegate;
/*     */   @NotNull
/*     */   private final Lazy scaledImage$delegate;
/*     */   
/*     */   private PainterImage(Painter painter, Density density, LayoutDirection layoutDirection, long size) {
/* 132 */     this.painter = painter;
/* 133 */     this.density = density;
/* 134 */     this.layoutDirection = layoutDirection;
/*     */ 
/*     */     
/* 137 */     this.width = (int)Size.getWidth-impl(size);
/* 138 */     this.height = (int)Size.getHeight-impl(size);
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
/* 179 */     this.defaultImage$delegate = LazyKt.lazy(new PainterImage$defaultImage$2());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 187 */     this.scaledImage$delegate = LazyKt.lazy(new PainterImage$scaledImage$2());
/*     */   }
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
/*     */   public int getWidth(@Nullable ImageObserver observer) {
/*     */     return this.width;
/*     */   }
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
/*     */   public int getHeight(@Nullable ImageObserver observer) {
/*     */     return this.height;
/*     */   }
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
/*     */   @NotNull
/*     */   public Image getResolutionVariant(double destImageWidth, double destImageHeight) {
/*     */     int width = (int)destImageWidth;
/*     */     int height = (int)destImageHeight;
/*     */     return (this.painter instanceof BufferedImagePainter && ((BufferedImagePainter)this.painter).getImage().getWidth() == width && ((BufferedImagePainter)this.painter).getImage().getHeight() == height) ? ((BufferedImagePainter)this.painter).getImage() : DesktopImageConverters_desktopKt.toAwtImage(asBitmap(width, height));
/*     */   }
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
/*     */   private final ImageBitmap asBitmap(int width, int height) {
/*     */     ImageBitmap bitmap = ImageBitmapKt.ImageBitmap-x__-hDU$default(width, height, 0, false, null, 28, null);
/*     */     Canvas canvas = CanvasKt.Canvas(bitmap);
/*     */     long floatSize = SizeKt.Size(width, height);
/*     */     CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
/*     */     Density density1 = this.density;
/*     */     LayoutDirection layoutDirection1 = this.layoutDirection;
/*     */     int $i$f$draw-yzxVdVo = 0;
/* 267 */     CanvasDrawScope.DrawParams drawParams1 = canvasDrawScope.getDrawParams(); Density prevDensity$iv = drawParams1.component1(); LayoutDirection prevLayoutDirection$iv = drawParams1.component2(); Canvas prevCanvas$iv = drawParams1.component3(); long prevSize$iv = drawParams1.component4-NH-jbRc();
/* 268 */     CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams(), $this$draw_yzxVdVo_u24lambda_u240$iv = drawParams2; int $i$a$-apply-CanvasDrawScope$draw$1$iv = 0;
/* 269 */     $this$draw_yzxVdVo_u24lambda_u240$iv.setDensity(density1);
/* 270 */     $this$draw_yzxVdVo_u24lambda_u240$iv.setLayoutDirection(layoutDirection1);
/* 271 */     $this$draw_yzxVdVo_u24lambda_u240$iv.setCanvas(canvas);
/* 272 */     $this$draw_yzxVdVo_u24lambda_u240$iv.setSize-uvyYCjk(floatSize);
/*     */     
/* 274 */     canvas.save();
/* 275 */     DrawScope $this$asBitmap_u24lambda_u241 = (DrawScope)canvasDrawScope; int $i$a$-draw-yzxVdVo-PainterImage$asBitmap$1 = 0; Painter $this$asBitmap_u24lambda_u241_u24lambda_u240 = this.painter; int $i$a$-with-PainterImage$asBitmap$1$1 = 0; Painter.draw-x_KDEd0$default($this$asBitmap_u24lambda_u241_u24lambda_u240, $this$asBitmap_u24lambda_u241, floatSize, 0.0F, null, 6, null);
/* 276 */     canvas.restore();
/* 277 */     CanvasDrawScope.DrawParams $this$draw_yzxVdVo_u24lambda_u241$iv = drawParams2 = canvasDrawScope.getDrawParams(); int $i$a$-apply-CanvasDrawScope$draw$2$iv = 0;
/* 278 */     $this$draw_yzxVdVo_u24lambda_u241$iv.setDensity(prevDensity$iv);
/* 279 */     $this$draw_yzxVdVo_u24lambda_u241$iv.setLayoutDirection(prevLayoutDirection$iv);
/* 280 */     $this$draw_yzxVdVo_u24lambda_u241$iv.setCanvas(prevCanvas$iv);
/* 281 */     $this$draw_yzxVdVo_u24lambda_u241$iv.setSize-uvyYCjk(prevSize$iv);
/*     */     return bitmap;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Object getProperty(@NotNull String name, @Nullable ImageObserver observer) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     Intrinsics.checkNotNullExpressionValue(Image.UndefinedProperty, "UndefinedProperty");
/*     */     return Image.UndefinedProperty;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ImageProducer getSource() {
/*     */     Intrinsics.checkNotNullExpressionValue(getDefaultImage().getSource(), "getSource(...)");
/*     */     return getDefaultImage().getSource();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Graphics getGraphics() {
/*     */     Intrinsics.checkNotNullExpressionValue(getDefaultImage().getGraphics(), "getGraphics(...)");
/*     */     return getDefaultImage().getGraphics();
/*     */   }
/*     */   
/*     */   private final BufferedImage getDefaultImage() {
/*     */     Lazy lazy = this.defaultImage$delegate;
/*     */     return (BufferedImage)lazy.getValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Ljava/awt/image/BufferedImage;", "invoke"})
/*     */   static final class PainterImage$defaultImage$2 extends Lambda implements Function0<BufferedImage> {
/*     */     @NotNull
/*     */     public final BufferedImage invoke() {
/*     */       return (PainterImage.this.painter instanceof BufferedImagePainter) ? ((BufferedImagePainter)PainterImage.this.painter).getImage() : DesktopImageConverters_desktopKt.toAwtImage(PainterImage.this.asBitmap(PainterImage.this.width, PainterImage.this.height));
/*     */     }
/*     */     
/*     */     PainterImage$defaultImage$2() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   private final BufferedImage getScaledImage() {
/*     */     Lazy lazy = this.scaledImage$delegate;
/*     */     return (BufferedImage)lazy.getValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Ljava/awt/image/BufferedImage;", "invoke"})
/*     */   static final class PainterImage$scaledImage$2 extends Lambda implements Function0<BufferedImage> {
/*     */     @NotNull
/*     */     public final BufferedImage invoke() {
/*     */       return DesktopImageConverters_desktopKt.toAwtImage(PainterImage.this.asBitmap(MathKt.roundToInt(PainterImage.this.width * PainterImage.this.density.getDensity()), MathKt.roundToInt(PainterImage.this.height * PainterImage.this.density.getDensity())));
/*     */     }
/*     */     
/*     */     PainterImage$scaledImage$2() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public List<BufferedImage> getResolutionVariants() {
/*     */     Painter painter = this.painter;
/*     */     BufferedImage[] arrayOfBufferedImage = new BufferedImage[2];
/*     */     arrayOfBufferedImage[0] = getDefaultImage();
/*     */     arrayOfBufferedImage[1] = getScaledImage();
/*     */     return ((painter instanceof BufferedImagePainter) ? true : (painter instanceof androidx.compose.ui.graphics.painter.BitmapPainter)) ? CollectionsKt.listOf(getDefaultImage()) : CollectionsKt.listOf((Object[])arrayOfBufferedImage);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\PainterImage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */