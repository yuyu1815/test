/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.ui.graphics.colorspace.ColorSpace;
/*     */ import androidx.compose.ui.graphics.colorspace.ColorSpaces;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.skia.Bitmap;
/*     */ import org.jetbrains.skia.ColorAlphaType;
/*     */ import org.jetbrains.skia.ColorInfo;
/*     */ import org.jetbrains.skia.ColorSpace;
/*     */ import org.jetbrains.skia.ColorType;
/*     */ import org.jetbrains.skia.Image;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000B\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\032:\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\000ø\001\000¢\006\004\b\013\020\f\032\n\020\r\032\0020\001*\0020\016\032\n\020\017\032\0020\016*\0020\001\032\016\020\020\032\0020\n*\004\030\0010\021H\002\032\021\020\022\032\0020\006*\0020\023H\002¢\006\002\020\024\032\n\020\025\032\0020\001*\0020\026\032\f\020\027\032\0020\021*\0020\nH\002\032\026\020\030\032\0020\023*\0020\006H\002ø\001\000¢\006\004\b\031\020\032\002\007\n\005\b¡\0360\001¨\006\033"}, d2 = {"ActualImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "asComposeImageBitmap", "Lorg/jetbrains/skia/Bitmap;", "asSkiaBitmap", "toComposeColorSpace", "Lorg/jetbrains/skia/ColorSpace;", "toComposeConfig", "Lorg/jetbrains/skia/ColorType;", "(Lorg/jetbrains/skia/ColorType;)I", "toComposeImageBitmap", "Lorg/jetbrains/skia/Image;", "toSkiaColorSpace", "toSkiaColorType", "toSkiaColorType-1JJdX4A", "(I)Lorg/jetbrains/skia/ColorType;", "ui-graphics"})
/*     */ public final class SkiaImageAsset_skikoKt
/*     */ {
/*     */   @NotNull
/*     */   public static final ImageBitmap asComposeImageBitmap(@NotNull Bitmap $this$asComposeImageBitmap) {
/*  34 */     Intrinsics.checkNotNullParameter($this$asComposeImageBitmap, "<this>"); return new SkiaBackedImageBitmap($this$asComposeImageBitmap);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ImageBitmap toComposeImageBitmap(@NotNull Image $this$toComposeImageBitmap) {
/*  39 */     Intrinsics.checkNotNullParameter($this$toComposeImageBitmap, "<this>"); return new SkiaBackedImageBitmap(Actuals_skikoExcludingWebKt.toBitmap($this$toComposeImageBitmap));
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
/*     */   @NotNull
/*     */   public static final ImageBitmap ActualImageBitmap-x__-hDU(int width, int height, int config, boolean hasAlpha, @NotNull ColorSpace colorSpace) {
/*  52 */     Intrinsics.checkNotNullParameter(colorSpace, "colorSpace"); ColorType colorType = toSkiaColorType-1JJdX4A(config);
/*  53 */     ColorAlphaType alphaType = hasAlpha ? ColorAlphaType.PREMUL : ColorAlphaType.OPAQUE;
/*  54 */     ColorSpace skiaColorSpace = toSkiaColorSpace(colorSpace);
/*  55 */     ColorInfo colorInfo = new ColorInfo(colorType, alphaType, skiaColorSpace);
/*  56 */     ImageInfo imageInfo = new ImageInfo(colorInfo, width, height);
/*  57 */     Bitmap bitmap = new Bitmap();
/*  58 */     bitmap.allocPixels(imageInfo);
/*  59 */     return new SkiaBackedImageBitmap(bitmap);
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
/*     */   @NotNull
/*     */   public static final Bitmap asSkiaBitmap(@NotNull ImageBitmap $this$asSkiaBitmap) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: instanceof androidx/compose/ui/graphics/SkiaBackedImageBitmap
/*     */     //   10: ifeq -> 23
/*     */     //   13: aload_0
/*     */     //   14: checkcast androidx/compose/ui/graphics/SkiaBackedImageBitmap
/*     */     //   17: invokevirtual getBitmap : ()Lorg/jetbrains/skia/Bitmap;
/*     */     //   20: goto -> 33
/*     */     //   23: new java/lang/UnsupportedOperationException
/*     */     //   26: dup
/*     */     //   27: ldc 'Unable to obtain org.jetbrains.skia.Image'
/*     */     //   29: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   32: athrow
/*     */     //   33: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #69	-> 6
/*     */     //   #70	-> 7
/*     */     //   #71	-> 23
/*     */     //   #72	-> 33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	34	0	$this$asSkiaBitmap	Landroidx/compose/ui/graphics/ImageBitmap;
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
/*     */   private static final ColorType toSkiaColorType-1JJdX4A(int $this$toSkiaColorType_u2d1JJdX4A) {
/* 120 */     int i = $this$toSkiaColorType_u2d1JJdX4A;
/* 121 */     return ImageBitmapConfig.equals-impl0(i, ImageBitmapConfig.Companion.getArgb8888-_sVssgQ()) ? ColorType.Companion.getN32() : (
/* 122 */       ImageBitmapConfig.equals-impl0(i, ImageBitmapConfig.Companion.getAlpha8-_sVssgQ()) ? ColorType.ALPHA_8 : (
/* 123 */       ImageBitmapConfig.equals-impl0(i, ImageBitmapConfig.Companion.getRgb565-_sVssgQ()) ? ColorType.RGB_565 : (
/* 124 */       ImageBitmapConfig.equals-impl0(i, ImageBitmapConfig.Companion.getF16-_sVssgQ()) ? ColorType.RGBA_F16 : 
/* 125 */       ColorType.Companion.getN32())));
/*     */   }
/*     */   private static final int toComposeConfig(ColorType $this$toComposeConfig) {
/* 128 */     ColorType colorType = $this$toComposeConfig;
/* 129 */     return (colorType == ColorType.Companion.getN32()) ? ImageBitmapConfig.Companion.getArgb8888-_sVssgQ() : (
/* 130 */       (colorType == ColorType.ALPHA_8) ? ImageBitmapConfig.Companion.getAlpha8-_sVssgQ() : (
/* 131 */       (colorType == ColorType.RGB_565) ? ImageBitmapConfig.Companion.getRgb565-_sVssgQ() : (
/* 132 */       (colorType == ColorType.RGBA_F16) ? ImageBitmapConfig.Companion.getF16-_sVssgQ() : 
/* 133 */       ImageBitmapConfig.Companion.getArgb8888-_sVssgQ())));
/*     */   }
/*     */   
/*     */   private static final ColorSpace toComposeColorSpace(ColorSpace $this$toComposeColorSpace) {
/* 137 */     ColorSpace colorSpace = $this$toComposeColorSpace; return 
/* 138 */       Intrinsics.areEqual(colorSpace, ColorSpace.Companion.getSRGB()) ? (ColorSpace)ColorSpaces.INSTANCE.getSrgb() : (
/* 139 */       Intrinsics.areEqual(colorSpace, ColorSpace.Companion.getSRGBLinear()) ? (ColorSpace)ColorSpaces.INSTANCE.getLinearSrgb() : (
/* 140 */       Intrinsics.areEqual(colorSpace, ColorSpace.Companion.getDisplayP3()) ? (ColorSpace)ColorSpaces.INSTANCE.getDisplayP3() : 
/* 141 */       (ColorSpace)ColorSpaces.INSTANCE.getSrgb()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final ColorSpace toSkiaColorSpace(ColorSpace $this$toSkiaColorSpace) {
/* 148 */     ColorSpace colorSpace = $this$toSkiaColorSpace; return 
/* 149 */       Intrinsics.areEqual(colorSpace, ColorSpaces.INSTANCE.getSrgb()) ? ColorSpace.Companion.getSRGB() : (
/* 150 */       Intrinsics.areEqual(colorSpace, ColorSpaces.INSTANCE.getLinearSrgb()) ? ColorSpace.Companion.getSRGBLinear() : (
/* 151 */       Intrinsics.areEqual(colorSpace, ColorSpaces.INSTANCE.getDisplayP3()) ? ColorSpace.Companion.getDisplayP3() : 
/* 152 */       ColorSpace.Companion.getSRGB()));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaImageAsset_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */