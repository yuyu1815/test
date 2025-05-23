/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.compose.ui.geometry.Offset;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.skia.Bitmap;
/*    */ import org.jetbrains.skia.GradientStyle;
/*    */ import org.jetbrains.skia.Shader;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000B\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\020\007\n\002\b\f\n\002\020\002\n\000\n\002\020\025\n\002\b\002\032.\020\000\032\0060\001j\002`\0022\006\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\006H\000ø\001\000¢\006\004\b\b\020\t\032L\020\n\032\0060\001j\002`\0022\006\020\013\032\0020\f2\006\020\r\032\0020\f2\f\020\016\032\b\022\004\022\0020\0200\0172\016\020\021\032\n\022\004\022\0020\022\030\0010\0172\006\020\023\032\0020\006H\000ø\001\000¢\006\004\b\024\020\025\032L\020\026\032\0060\001j\002`\0022\006\020\027\032\0020\f2\006\020\030\032\0020\0222\f\020\016\032\b\022\004\022\0020\0200\0172\016\020\021\032\n\022\004\022\0020\022\030\0010\0172\006\020\023\032\0020\006H\000ø\001\000¢\006\004\b\031\020\032\032<\020\033\032\0060\001j\002`\0022\006\020\027\032\0020\f2\f\020\016\032\b\022\004\022\0020\0200\0172\016\020\021\032\n\022\004\022\0020\022\030\0010\017H\000ø\001\000¢\006\004\b\034\020\035\032&\020\036\032\0020\0372\f\020\016\032\b\022\004\022\0020\0200\0172\016\020\021\032\n\022\004\022\0020\022\030\0010\017H\002\032\022\020 \032\0020!*\b\022\004\022\0020\0200\017H\002*\n\020\"\"\0020\0012\0020\001\002\007\n\005\b¡\0360\001¨\006#"}, d2 = {"ActualImageShader", "Lorg/jetbrains/skia/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Lorg/jetbrains/skia/Shader;", "ActualLinearGradientShader", "from", "Landroidx/compose/ui/geometry/Offset;", "to", "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Lorg/jetbrains/skia/Shader;", "ActualRadialGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Lorg/jetbrains/skia/Shader;", "ActualSweepGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Lorg/jetbrains/skia/Shader;", "validateColorStops", "", "toIntArray", "", "Shader", "ui-graphics"})
/*    */ public final class SkiaShader_skikoKt
/*    */ {
/*    */   @NotNull
/*    */   public static final Shader ActualLinearGradientShader-VjE6UOU(long from, long to, @NotNull List<Color> colors, @Nullable List<Float> colorStops, int tileMode) {
/* 31 */     Intrinsics.checkNotNullParameter(colors, "colors"); validateColorStops(colors, colorStops);
/* 32 */     return Shader.Companion.makeLinearGradient(
/* 33 */         Offset.getX-impl(from), Offset.getY-impl(from), Offset.getX-impl(to), Offset.getY-impl(to), toIntArray(colors), (colorStops != null) ? CollectionsKt.toFloatArray(colorStops) : null, 
/* 34 */         new GradientStyle(SkiaTileMode_skikoKt.toSkiaTileMode-0vamqd0(tileMode), true, Matrices_skikoKt.identityMatrix33()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Shader ActualRadialGradientShader-8uybcMk(long center, float radius, @NotNull List<Color> colors, @Nullable List<Float> colorStops, int tileMode) {
/* 45 */     Intrinsics.checkNotNullParameter(colors, "colors"); validateColorStops(colors, colorStops);
/* 46 */     return Shader.Companion.makeRadialGradient(
/* 47 */         Offset.getX-impl(center), 
/* 48 */         Offset.getY-impl(center), 
/* 49 */         radius, 
/* 50 */         toIntArray(colors), 
/* 51 */         (colorStops != null) ? CollectionsKt.toFloatArray(colorStops) : null, 
/* 52 */         new GradientStyle(SkiaTileMode_skikoKt.toSkiaTileMode-0vamqd0(tileMode), true, Matrices_skikoKt.identityMatrix33()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Shader ActualSweepGradientShader-9KIMszo(long center, @NotNull List<Color> colors, @Nullable List<Float> colorStops) {
/* 61 */     Intrinsics.checkNotNullParameter(colors, "colors"); validateColorStops(colors, colorStops);
/* 62 */     return Shader.Companion.makeSweepGradient(
/* 63 */         Offset.getX-impl(center), 
/* 64 */         Offset.getY-impl(center), 
/* 65 */         toIntArray(colors), 
/* 66 */         (colorStops != null) ? CollectionsKt.toFloatArray(colorStops) : null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Shader ActualImageShader-F49vj9s(@NotNull ImageBitmap image, int tileModeX, int tileModeY) {
/* 75 */     Intrinsics.checkNotNullParameter(image, "image"); return Bitmap.makeShader$default(SkiaImageAsset_skikoKt.asSkiaBitmap(image), 
/* 76 */         SkiaTileMode_skikoKt.toSkiaTileMode-0vamqd0(tileModeX), 
/* 77 */         SkiaTileMode_skikoKt.toSkiaTileMode-0vamqd0(tileModeY), null, null, 12, null);
/*    */   } private static final int[] toIntArray(List $this$toIntArray) {
/*    */     byte b;
/*    */     int i;
/*    */     int[] arrayOfInt;
/* 82 */     for (b = 0, i = $this$toIntArray.size(), arrayOfInt = new int[i]; b < i; ) { byte b1 = b; arrayOfInt[b1] = ColorKt.toArgb-8_81llA(((Color)$this$toIntArray.get(b1)).unbox-impl()); b++; }  return arrayOfInt;
/*    */   }
/*    */   private static final void validateColorStops(List colors, List colorStops) {
/* 85 */     if (colorStops == null) {
/* 86 */       if (colors.size() < 2) {
/* 87 */         throw new IllegalArgumentException(
/* 88 */             "colors must have length of at least 2 if colorStops is omitted.");
/*    */       
/*    */       }
/*    */     }
/* 92 */     else if (colors.size() != colorStops.size()) {
/* 93 */       throw new IllegalArgumentException(
/* 94 */           "colors and colorStops arguments must have equal length.");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaShader_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */