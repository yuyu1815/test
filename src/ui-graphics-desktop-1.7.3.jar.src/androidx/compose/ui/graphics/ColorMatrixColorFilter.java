/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.ColorFilter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\004\n\002\020\016\n\000\b\007\030\0002\0020\001B\017\b\026\022\006\020\002\032\0020\003¢\006\002\020\004B\035\b\000\022\b\020\002\032\004\030\0010\003\022\n\020\005\032\0060\006j\002`\007¢\006\002\020\bJ\032\020\n\032\0020\0032\b\b\002\020\013\032\0020\003ø\001\000¢\006\004\b\f\020\rJ\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\023H\026J\025\020\024\032\0020\003H\002ø\001\001ø\001\000¢\006\004\b\025\020\026J\b\020\027\032\0020\030H\026R\030\020\002\032\004\030\0010\003X\016ø\001\000ø\001\001¢\006\004\n\002\020\t\002\013\n\005\b¡\0360\001\n\002\b!¨\006\031"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrixColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "colorMatrix", "Landroidx/compose/ui/graphics/ColorMatrix;", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "nativeColorFilter", "Lorg/jetbrains/skia/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "([FLorg/jetbrains/skia/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "[F", "copyColorMatrix", "targetColorMatrix", "copyColorMatrix-gBh15pI", "([F)[F", "equals", "", "other", "", "hashCode", "", "obtainColorMatrix", "obtainColorMatrix-p10-uLo", "()[F", "toString", "", "ui-graphics"})
/*     */ @Immutable
/*     */ public final class ColorMatrixColorFilter
/*     */   extends ColorFilter
/*     */ {
/*     */   @Nullable
/*     */   private float[] colorMatrix;
/*     */   
/*     */   private ColorMatrixColorFilter(float[] colorMatrix, ColorFilter nativeColorFilter) {
/* 125 */     super(nativeColorFilter);
/*     */     this.colorMatrix = colorMatrix;
/*     */   }
/*     */   private ColorMatrixColorFilter(float[] colorMatrix) {
/* 129 */     this(colorMatrix, SkiaColorFilter_skikoKt.actualColorMatrixColorFilter-jHG-Opc(colorMatrix), null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final float[] copyColorMatrix-gBh15pI(@NotNull float[] targetColorMatrix) {
/* 141 */     Intrinsics.checkNotNullParameter(targetColorMatrix, "targetColorMatrix"); float[] curMatrix = obtainColorMatrix-p10-uLo();
/* 142 */     ArraysKt.copyInto$default(curMatrix, targetColorMatrix, 0, 0, 0, 14, null);
/* 143 */     return targetColorMatrix;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 147 */     if (this == other) return true; 
/* 148 */     if (!(other instanceof ColorMatrixColorFilter)) return false;
/*     */     
/* 150 */     float[] colorMatrix = obtainColorMatrix-p10-uLo();
/* 151 */     float[] otherColorMatrix = ((ColorMatrixColorFilter)other).obtainColorMatrix-p10-uLo();
/* 152 */     if (!Arrays.equals(colorMatrix, otherColorMatrix)) return false;
/*     */     
/* 154 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final float[] obtainColorMatrix-p10-uLo() {
/* 161 */     if (this.colorMatrix == null) { float[] arrayOfFloat1 = SkiaColorFilter_skikoKt.actualColorMatrixFromFilter(getNativeColorFilter$ui_graphics()), it = arrayOfFloat1; int $i$a$-also-ColorMatrixColorFilter$obtainColorMatrix$1 = 0;
/* 162 */       this.colorMatrix = it; }
/*     */     
/*     */     return arrayOfFloat1;
/*     */   } public int hashCode() {
/* 166 */     return (this.colorMatrix != null) ? ColorMatrix.hashCode-impl(this.colorMatrix) : 0;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 170 */     return this.colorMatrix.append((this.colorMatrix == null) ? "null" : ColorMatrix.toString-impl(this.colorMatrix)).append(')').toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\ColorMatrixColorFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */