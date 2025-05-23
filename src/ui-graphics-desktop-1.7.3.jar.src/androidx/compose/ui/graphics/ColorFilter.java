/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\005\b\027\030\000 \b2\0020\001:\001\bB\023\b\000\022\n\020\002\032\0060\003j\002`\004¢\006\002\020\005R\030\020\002\032\0060\003j\002`\004X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\t"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "", "nativeColorFilter", "Lorg/jetbrains/skia/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "(Lorg/jetbrains/skia/ColorFilter;)V", "getNativeColorFilter$ui_graphics", "()Lorg/jetbrains/skia/ColorFilter;", "Companion", "ui-graphics"})
/*    */ @Immutable
/*    */ public class ColorFilter
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final org.jetbrains.skia.ColorFilter nativeColorFilter;
/*    */   
/*    */   public ColorFilter(@NotNull org.jetbrains.skia.ColorFilter nativeColorFilter) {
/* 29 */     this.nativeColorFilter = nativeColorFilter; } @NotNull public final org.jetbrains.skia.ColorFilter getNativeColorFilter$ui_graphics() { return this.nativeColorFilter; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\003\032\0020\0042\006\020\003\032\0020\005H\007ø\001\000¢\006\004\b\006\020\007J\"\020\b\032\0020\0042\006\020\t\032\0020\n2\006\020\013\032\0020\nH\007ø\001\000¢\006\004\b\f\020\rJ$\020\016\032\0020\0042\006\020\017\032\0020\n2\b\b\002\020\020\032\0020\021H\007ø\001\000¢\006\004\b\022\020\023\002\007\n\005\b¡\0360\001¨\006\024"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter$Companion;", "", "()V", "colorMatrix", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/ColorMatrix;", "colorMatrix-jHG-Opc", "([F)Landroidx/compose/ui/graphics/ColorFilter;", "lighting", "multiply", "Landroidx/compose/ui/graphics/Color;", "add", "lighting--OWjLjI", "(JJ)Landroidx/compose/ui/graphics/ColorFilter;", "tint", "color", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "tint-xETnrds", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "ui-graphics"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @Stable
/*    */     @NotNull
/*    */     public final ColorFilter tint-xETnrds(long color, int blendMode) {
/* 46 */       return new BlendModeColorFilter(color, blendMode, null);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @Stable
/*    */     @NotNull
/*    */     public final ColorFilter colorMatrix-jHG-Opc(@NotNull float[] colorMatrix) {
/* 56 */       Intrinsics.checkNotNullParameter(colorMatrix, "colorMatrix"); return new ColorMatrixColorFilter(colorMatrix, null);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @Stable
/*    */     @NotNull
/*    */     public final ColorFilter lighting--OWjLjI(long multiply, long add) {
/* 68 */       return new LightingColorFilter(multiply, add, null);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\ColorFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */