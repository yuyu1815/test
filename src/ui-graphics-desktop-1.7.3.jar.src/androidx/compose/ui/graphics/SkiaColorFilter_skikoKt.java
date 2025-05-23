/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.ColorFilter;
/*    */ import org.jetbrains.skia.ColorMatrix;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\032\036\020\000\032\0060\001j\002`\0022\006\020\003\032\0020\004H\000ø\001\000¢\006\004\b\005\020\006\032\031\020\007\032\0020\0042\n\020\b\032\0060\001j\002`\002H\000¢\006\002\020\t\032&\020\n\032\0060\001j\002`\0022\006\020\013\032\0020\f2\006\020\r\032\0020\fH\000ø\001\000¢\006\004\b\016\020\017\032&\020\020\032\0060\001j\002`\0022\006\020\021\032\0020\f2\006\020\022\032\0020\023H\000ø\001\000¢\006\004\b\024\020\025\032\n\020\026\032\0020\027*\0020\001\032\n\020\030\032\0020\001*\0020\027*\n\020\031\"\0020\0012\0020\001\002\007\n\005\b¡\0360\001¨\006\032"}, d2 = {"actualColorMatrixColorFilter", "Lorg/jetbrains/skia/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "colorMatrix", "Landroidx/compose/ui/graphics/ColorMatrix;", "actualColorMatrixColorFilter-jHG-Opc", "([F)Lorg/jetbrains/skia/ColorFilter;", "actualColorMatrixFromFilter", "filter", "(Lorg/jetbrains/skia/ColorFilter;)[F", "actualLightingColorFilter", "multiply", "Landroidx/compose/ui/graphics/Color;", "add", "actualLightingColorFilter--OWjLjI", "(JJ)Lorg/jetbrains/skia/ColorFilter;", "actualTintColorFilter", "color", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "actualTintColorFilter-xETnrds", "(JI)Lorg/jetbrains/skia/ColorFilter;", "asComposeColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "asSkiaColorFilter", "NativeColorFilter", "ui-graphics"})
/*    */ public final class SkiaColorFilter_skikoKt
/*    */ {
/*    */   @NotNull
/*    */   public static final ColorFilter asSkiaColorFilter(@NotNull ColorFilter $this$asSkiaColorFilter) {
/* 26 */     Intrinsics.checkNotNullParameter($this$asSkiaColorFilter, "<this>"); return $this$asSkiaColorFilter.getNativeColorFilter$ui_graphics();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final ColorFilter asComposeColorFilter(@NotNull ColorFilter $this$asComposeColorFilter) {
/* 31 */     Intrinsics.checkNotNullParameter($this$asComposeColorFilter, "<this>"); return new ColorFilter($this$asComposeColorFilter);
/*    */   } @NotNull
/*    */   public static final ColorFilter actualTintColorFilter-xETnrds(long color, int blendMode) {
/* 34 */     return ColorFilter.Companion.makeBlend(ColorKt.toArgb-8_81llA(color), BlendMode_skikoKt.toSkia-s9anfk8(blendMode));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final ColorFilter actualColorMatrixColorFilter-jHG-Opc(@NotNull float[] colorMatrix) {
/* 41 */     Intrinsics.checkNotNullParameter(colorMatrix, "colorMatrix"); Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(colorMatrix, colorMatrix.length), "copyOf(...)"); float[] remappedValues = Arrays.copyOf(colorMatrix, colorMatrix.length);
/* 42 */     remappedValues[4] = remappedValues[4] * 0.003921569F;
/* 43 */     remappedValues[9] = remappedValues[9] * 0.003921569F;
/* 44 */     remappedValues[14] = remappedValues[14] * 0.003921569F;
/* 45 */     remappedValues[19] = remappedValues[19] * 0.003921569F;
/*    */     
/* 47 */     return ColorFilter.Companion.makeMatrix(
/* 48 */         new ColorMatrix(Arrays.copyOf(remappedValues, remappedValues.length)));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final ColorFilter actualLightingColorFilter--OWjLjI(long multiply, long add) {
/* 53 */     return ColorFilter.Companion.makeLighting(ColorKt.toArgb-8_81llA(multiply), ColorKt.toArgb-8_81llA(add));
/*    */   }
/*    */   @NotNull
/*    */   public static final float[] actualColorMatrixFromFilter(@NotNull ColorFilter filter) {
/* 57 */     Intrinsics.checkNotNullParameter(filter, "filter"); return ColorMatrix.constructor-impl$default(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaColorFilter_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */