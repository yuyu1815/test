/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.ui.graphics.colorspace.ColorSpace;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.skia.Bitmap;
/*     */ import org.jetbrains.skia.ColorAlphaType;
/*     */ import org.jetbrains.skia.ColorInfo;
/*     */ import org.jetbrains.skia.ColorSpace;
/*     */ import org.jetbrains.skia.ColorType;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\004\n\002\020\002\n\002\b\002\n\002\020\025\n\002\b\005\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\031\032\0020\032H\026J@\020\033\032\0020\0322\006\020\034\032\0020\0352\006\020\036\032\0020\0252\006\020\037\032\0020\0252\006\020\027\032\0020\0252\006\020\024\032\0020\0252\006\020 \032\0020\0252\006\020!\032\0020\025H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\034\020\013\032\0020\fX\004ø\001\000ø\001\001¢\006\n\n\002\020\017\032\004\b\r\020\016R\024\020\020\032\0020\021X\004¢\006\b\n\000\032\004\b\022\020\023R\024\020\024\032\0020\0258VX\004¢\006\006\032\004\b\026\020\016R\024\020\027\032\0020\0258VX\004¢\006\006\032\004\b\030\020\016\002\013\n\005\b¡\0360\001\n\002\b!¨\006\""}, d2 = {"Landroidx/compose/ui/graphics/SkiaBackedImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "bitmap", "Lorg/jetbrains/skia/Bitmap;", "(Lorg/jetbrains/skia/Bitmap;)V", "getBitmap", "()Lorg/jetbrains/skia/Bitmap;", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getConfig-_sVssgQ", "()I", "I", "hasAlpha", "", "getHasAlpha", "()Z", "height", "", "getHeight", "width", "getWidth", "prepareToDraw", "", "readPixels", "buffer", "", "startX", "startY", "bufferOffset", "stride", "ui-graphics"})
/*     */ final class SkiaBackedImageBitmap
/*     */   implements ImageBitmap
/*     */ {
/*     */   @NotNull
/*     */   private final Bitmap bitmap;
/*     */   @NotNull
/*     */   private final ColorSpace colorSpace;
/*     */   private final int config;
/*     */   private final boolean hasAlpha;
/*     */   
/*     */   @NotNull
/*     */   public final Bitmap getBitmap() {
/*     */     return this.bitmap;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ColorSpace getColorSpace() {
/*     */     return this.colorSpace;
/*     */   }
/*     */   
/*     */   public int getConfig-_sVssgQ() {
/*     */     return this.config;
/*     */   }
/*     */   
/*     */   public SkiaBackedImageBitmap(@NotNull Bitmap bitmap) {
/*  74 */     this.bitmap = bitmap;
/*  75 */     this.colorSpace = SkiaImageAsset_skikoKt.access$toComposeColorSpace(this.bitmap.getColorSpace());
/*  76 */     this.config = SkiaImageAsset_skikoKt.access$toComposeConfig(this.bitmap.getColorType());
/*  77 */     this.hasAlpha = !this.bitmap.isOpaque(); } public boolean getHasAlpha() { return this.hasAlpha; }
/*  78 */   public int getHeight() { return this.bitmap.getHeight(); } public int getWidth() {
/*  79 */     return this.bitmap.getWidth();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void prepareToDraw() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void readPixels(@NotNull int[] buffer, int startX, int startY, int width, int height, int bufferOffset, int stride) {
/*  92 */     Intrinsics.checkNotNullParameter(buffer, "buffer"); int lastScanline = bufferOffset + (height - 1) * stride;
/*  93 */     if (!((startX >= 0 && startY >= 0) ? 1 : 0)) { String str = "Failed requirement."; throw new IllegalArgumentException(str.toString()); }
/*  94 */      if (!((width > 0 && startX + width <= getWidth()) ? 1 : 0)) { String str = "Failed requirement."; throw new IllegalArgumentException(str.toString()); }
/*  95 */      if (!((height > 0 && startY + height <= getHeight()) ? 1 : 0)) { String str = "Failed requirement."; throw new IllegalArgumentException(str.toString()); }
/*  96 */      if (!((Math.abs(stride) >= width) ? 1 : 0)) { String str = "Failed requirement."; throw new IllegalArgumentException(str.toString()); }
/*  97 */      if (!((bufferOffset >= 0 && bufferOffset + width <= buffer.length) ? 1 : 0)) { String str = "Failed requirement."; throw new IllegalArgumentException(str.toString()); }
/*  98 */      if (!((lastScanline >= 0 && lastScanline + width <= buffer.length) ? 1 : 0)) { String str = "Failed requirement."; throw new IllegalArgumentException(str.toString()); }
/*     */ 
/*     */     
/* 101 */     ColorInfo colorInfo = new ColorInfo(
/* 102 */         ColorType.BGRA_8888, 
/* 103 */         ColorAlphaType.UNPREMUL, 
/* 104 */         ColorSpace.Companion.getSRGB());
/*     */     
/* 106 */     ImageInfo imageInfo = new ImageInfo(colorInfo, width, height);
/* 107 */     int bytesPerPixel = 4;
/* 108 */     Intrinsics.checkNotNull(this.bitmap.readPixels(imageInfo, stride * bytesPerPixel, startX, startY)); byte[] bytes = this.bitmap.readPixels(imageInfo, stride * bytesPerPixel, startX, startY);
/* 109 */     DesktopImageAsset_desktopKt.putBytesInto(bytes, buffer, bufferOffset, bytes.length / bytesPerPixel);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaBackedImageBitmap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */