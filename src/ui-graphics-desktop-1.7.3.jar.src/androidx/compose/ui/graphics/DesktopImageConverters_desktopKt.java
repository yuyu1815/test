/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.ui.graphics.painter.Painter;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import java.awt.Image;
/*     */ import java.awt.Point;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.ColorModel;
/*     */ import java.awt.image.DataBufferInt;
/*     */ import java.awt.image.Raster;
/*     */ import java.awt.image.SinglePixelPackedSampleModel;
/*     */ import java.awt.image.WritableRaster;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.skia.Bitmap;
/*     */ import org.jetbrains.skia.ColorAlphaType;
/*     */ import org.jetbrains.skia.ImageInfo;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\032\f\020\000\032\0020\001*\0020\002H\007\0320\020\000\032\0020\003*\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\nH\007ø\001\000¢\006\004\b\013\020\f\032\f\020\r\032\0020\004*\0020\001H\007\032\n\020\016\032\0020\001*\0020\002\032.\020\016\032\0020\003*\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\nø\001\000¢\006\004\b\017\020\f\032\f\020\020\032\0020\002*\0020\001H\007\032\n\020\021\032\0020\002*\0020\001\032\n\020\022\032\0020\004*\0020\001\002\007\n\005\b¡\0360\001¨\006\023"}, d2 = {"asAwtImage", "Ljava/awt/image/BufferedImage;", "Landroidx/compose/ui/graphics/ImageBitmap;", "Ljava/awt/Image;", "Landroidx/compose/ui/graphics/painter/Painter;", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "asAwtImage-Ug5Nnss", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;J)Ljava/awt/Image;", "asPainter", "toAwtImage", "toAwtImage-Ug5Nnss", "toComposeBitmap", "toComposeImageBitmap", "toPainter", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nDesktopImageConverters.desktop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DesktopImageConverters.desktop.kt\nandroidx/compose/ui/graphics/DesktopImageConverters_desktopKt\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,266:1\n198#2:267\n*S KotlinDebug\n*F\n+ 1 DesktopImageConverters.desktop.kt\nandroidx/compose/ui/graphics/DesktopImageConverters_desktopKt\n*L\n120#1:267\n*E\n"})
/*     */ public final class DesktopImageConverters_desktopKt
/*     */ {
/*     */   @Deprecated(message = "Use toPainter", replaceWith = @ReplaceWith(expression = "toPainter()", imports = {}))
/*     */   @NotNull
/*     */   public static final Painter asPainter(@NotNull BufferedImage $this$asPainter) {
/*  52 */     Intrinsics.checkNotNullParameter($this$asPainter, "<this>"); return new BufferedImagePainter($this$asPainter);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Painter toPainter(@NotNull BufferedImage $this$toPainter) {
/*  59 */     Intrinsics.checkNotNullParameter($this$toPainter, "<this>"); return new BufferedImagePainter($this$toPainter);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated(message = "Use toAwtImage", replaceWith = @ReplaceWith(expression = "toAwtImage(density, layoutDirection, size)", imports = {}))
/*     */   @NotNull
/*     */   public static final Image asAwtImage-Ug5Nnss(@NotNull Painter $this$asAwtImage_u2dUg5Nnss, @NotNull Density density, @NotNull LayoutDirection layoutDirection, long size) {
/*  98 */     Intrinsics.checkNotNullParameter($this$asAwtImage_u2dUg5Nnss, "$this$asAwtImage"); Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); return toAwtImage-Ug5Nnss($this$asAwtImage_u2dUg5Nnss, density, layoutDirection, size);
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
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Image toAwtImage-Ug5Nnss(@NotNull Painter $this$toAwtImage_u2dUg5Nnss, @NotNull Density density, @NotNull LayoutDirection layoutDirection, long size) {
/* 120 */     Intrinsics.checkNotNullParameter($this$toAwtImage_u2dUg5Nnss, "$this$toAwtImage"); Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); long $this$isSpecified$iv = size; int $i$f$isSpecified-uvyYCjk = 0; if (!(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 267 */       ($this$isSpecified$iv != 9205357640488583168L) ? 1 : 0)) {
/*     */       int $i$a$-require-DesktopImageConverters_desktopKt$toAwtImage$1 = 0;
/*     */       String str = "Cannot convert Painter with unspecified size. Please set size explicitly.";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     return new PainterImage($this$toAwtImage_u2dUg5Nnss, density, layoutDirection, size, null);
/*     */   }
/*     */   
/*     */   @Deprecated(message = "use toAwtImage", replaceWith = @ReplaceWith(expression = "toAwtImage", imports = {}))
/*     */   @NotNull
/*     */   public static final BufferedImage asAwtImage(@NotNull ImageBitmap $this$asAwtImage) {
/*     */     Intrinsics.checkNotNullParameter($this$asAwtImage, "<this>");
/*     */     return toAwtImage($this$asAwtImage);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final BufferedImage toAwtImage(@NotNull ImageBitmap $this$toAwtImage) {
/*     */     Intrinsics.checkNotNullParameter($this$toAwtImage, "<this>");
/*     */     int[] pixels = new int[$this$toAwtImage.getWidth() * $this$toAwtImage.getHeight()];
/*     */     ImageBitmap.readPixels$default($this$toAwtImage, pixels, 0, 0, 0, 0, 0, 0, 126, null);
/*     */     int a = -16777216;
/*     */     int r = 16711680;
/*     */     int g = 65280;
/*     */     int b = 255;
/*     */     int[] arrayOfInt1 = new int[4];
/*     */     arrayOfInt1[0] = r;
/*     */     arrayOfInt1[1] = g;
/*     */     arrayOfInt1[2] = b;
/*     */     arrayOfInt1[3] = a;
/*     */     int[] bitMasks = arrayOfInt1;
/*     */     SinglePixelPackedSampleModel sm = new SinglePixelPackedSampleModel(3, $this$toAwtImage.getWidth(), $this$toAwtImage.getHeight(), bitMasks);
/*     */     DataBufferInt db = new DataBufferInt(pixels, pixels.length);
/*     */     WritableRaster wr = Raster.createWritableRaster(sm, db, new Point());
/*     */     return new BufferedImage(ColorModel.getRGBdefault(), wr, false, null);
/*     */   }
/*     */   
/*     */   @Deprecated(message = "use toComposeImageBitmap()", replaceWith = @ReplaceWith(expression = "toComposeImageBitmap()", imports = {}))
/*     */   @NotNull
/*     */   public static final ImageBitmap toComposeBitmap(@NotNull BufferedImage $this$toComposeBitmap) {
/*     */     Intrinsics.checkNotNullParameter($this$toComposeBitmap, "<this>");
/*     */     return toComposeImageBitmap($this$toComposeBitmap);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ImageBitmap toComposeImageBitmap(@NotNull BufferedImage $this$toComposeImageBitmap) {
/*     */     Intrinsics.checkNotNullParameter($this$toComposeImageBitmap, "<this>");
/*     */     int bytesPerPixel = 4;
/*     */     byte[] pixels = new byte[$this$toComposeImageBitmap.getWidth() * $this$toComposeImageBitmap.getHeight() * bytesPerPixel];
/*     */     int k = 0;
/*     */     for (int y = 0, i = $this$toComposeImageBitmap.getHeight(); y < i; y++) {
/*     */       for (int x = 0, j = $this$toComposeImageBitmap.getWidth(); x < j; x++) {
/*     */         int argb = $this$toComposeImageBitmap.getRGB(x, y);
/*     */         int a = argb >> 24 & 0xFF;
/*     */         int r = argb >> 16 & 0xFF;
/*     */         int g = argb >> 8 & 0xFF;
/*     */         int b = argb >> 0 & 0xFF;
/*     */         pixels[k++] = (byte)b;
/*     */         pixels[k++] = (byte)g;
/*     */         pixels[k++] = (byte)r;
/*     */         pixels[k++] = (byte)a;
/*     */       } 
/*     */     } 
/*     */     Bitmap bitmap = new Bitmap();
/*     */     bitmap.allocPixels(ImageInfo.Companion.makeS32($this$toComposeImageBitmap.getWidth(), $this$toComposeImageBitmap.getHeight(), ColorAlphaType.UNPREMUL));
/*     */     bitmap.installPixels(pixels);
/*     */     return SkiaImageAsset_skikoKt.asComposeImageBitmap(bitmap);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\DesktopImageConverters_desktopKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */