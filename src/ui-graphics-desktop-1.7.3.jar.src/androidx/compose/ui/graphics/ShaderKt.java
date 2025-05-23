/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.Shader;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0004\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\020\007\n\002\b\f\0320\020\000\032\0060\001j\002`\0022\006\020\003\032\0020\0042\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\006ø\001\000¢\006\004\b\b\020\t\032N\020\n\032\0060\001j\002`\0022\006\020\013\032\0020\f2\006\020\r\032\0020\f2\f\020\016\032\b\022\004\022\0020\0200\0172\020\b\002\020\021\032\n\022\004\022\0020\022\030\0010\0172\b\b\002\020\023\032\0020\006ø\001\000¢\006\004\b\024\020\025\032N\020\026\032\0060\001j\002`\0022\006\020\027\032\0020\f2\006\020\030\032\0020\0222\f\020\016\032\b\022\004\022\0020\0200\0172\020\b\002\020\021\032\n\022\004\022\0020\022\030\0010\0172\b\b\002\020\023\032\0020\006ø\001\000¢\006\004\b\031\020\032\032<\020\033\032\0060\001j\002`\0022\006\020\027\032\0020\f2\f\020\016\032\b\022\004\022\0020\0200\0172\020\b\002\020\021\032\n\022\004\022\0020\022\030\0010\017ø\001\000¢\006\004\b\034\020\035\002\007\n\005\b¡\0360\001¨\006\036"}, d2 = {"ImageShader", "Lorg/jetbrains/skia/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Lorg/jetbrains/skia/Shader;", "LinearGradientShader", "from", "Landroidx/compose/ui/geometry/Offset;", "to", "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "LinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Lorg/jetbrains/skia/Shader;", "RadialGradientShader", "center", "radius", "RadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Lorg/jetbrains/skia/Shader;", "SweepGradientShader", "SweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Lorg/jetbrains/skia/Shader;", "ui-graphics"})
/*     */ public final class ShaderKt
/*     */ {
/*     */   @NotNull
/*     */   public static final Shader LinearGradientShader-VjE6UOU(long from, long to, @NotNull List<Color> colors, @Nullable List<Float> colorStops, int tileMode) {
/*  45 */     Intrinsics.checkNotNullParameter(colors, "colors"); return SkiaShader_skikoKt.ActualLinearGradientShader-VjE6UOU(from, 
/*  46 */         to, 
/*  47 */         colors, 
/*  48 */         colorStops, 
/*  49 */         tileMode);
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
/*     */   @NotNull
/*     */   public static final Shader RadialGradientShader-8uybcMk(long center, float radius, @NotNull List<Color> colors, @Nullable List<Float> colorStops, int tileMode) {
/*  81 */     Intrinsics.checkNotNullParameter(colors, "colors"); return SkiaShader_skikoKt.ActualRadialGradientShader-8uybcMk(center, radius, colors, colorStops, tileMode);
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
/*     */   @NotNull
/*     */   public static final Shader SweepGradientShader-9KIMszo(long center, @NotNull List<Color> colors, @Nullable List<Float> colorStops) {
/* 107 */     Intrinsics.checkNotNullParameter(colors, "colors"); return SkiaShader_skikoKt.ActualSweepGradientShader-9KIMszo(center, colors, colorStops);
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
/*     */   @NotNull
/*     */   public static final Shader ImageShader-F49vj9s(@NotNull ImageBitmap image, int tileModeX, int tileModeY) {
/* 124 */     Intrinsics.checkNotNullParameter(image, "image"); return SkiaShader_skikoKt.ActualImageShader-F49vj9s(image, tileModeX, tileModeY);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\ShaderKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */