/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.animation.core.AnimationVector4D;
/*     */ import androidx.compose.animation.core.TwoWayConverter;
/*     */ import androidx.compose.animation.core.VectorConvertersKt;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import androidx.compose.ui.graphics.colorspace.ColorSpace;
/*     */ import androidx.compose.ui.graphics.colorspace.ColorSpaces;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\"5\020\000\032)\022\023\022\0210\002¢\006\f\b\003\022\b\b\004\022\004\b\b(\005\022\020\022\016\022\004\022\0020\007\022\004\022\0020\b0\0060\001X\004¢\006\002\n\000\"<\020\t\032)\022\023\022\0210\002¢\006\f\b\003\022\b\b\004\022\004\b\b(\005\022\020\022\016\022\004\022\0020\007\022\004\022\0020\b0\0060\001*\0020\n8F¢\006\006\032\004\b\013\020\f¨\006\r"}, d2 = {"ColorToVector", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Lkotlin/ParameterName;", "name", "colorSpace", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "VectorConverter", "Landroidx/compose/ui/graphics/Color$Companion;", "getVectorConverter", "(Landroidx/compose/ui/graphics/Color$Companion;)Lkotlin/jvm/functions/Function1;", "animation"})
/*     */ public final class ColorVectorConverterKt
/*     */ {
/*     */   @NotNull
/*  32 */   private static final Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> ColorToVector = ColorVectorConverterKt$ColorToVector$1.INSTANCE; @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\0012\006\020\004\032\0020\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "invoke"}) static final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> { @NotNull
/*  33 */     public final TwoWayConverter<Color, AnimationVector4D> invoke(@NotNull ColorSpace colorSpace) { Intrinsics.checkNotNullParameter(colorSpace, "colorSpace"); return VectorConvertersKt.TwoWayConverter(null.INSTANCE, new Function1<AnimationVector4D, Color>(colorSpace)
/*     */           {
/*     */ 
/*     */ 
/*     */             
/*     */             public final long invoke-vNxB06k(@NotNull AnimationVector4D vector)
/*     */             {
/*  40 */               Intrinsics.checkNotNullParameter(vector, "vector"); float f1 = vector.getV2(), f2 = 0.0F, maximumValue$iv = 1.0F; int $i$f$fastCoerceIn = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  59 */               float f8 = f1; int i1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  66 */               float f7 = (f8 < f2) ? f2 : f8;
/*     */               
/*     */               int n = 0;
/*     */               
/*     */               float $this$fastCoerceIn$iv = vector.getV3(), minimumValue$iv = -0.5F;
/*     */               
/*     */               maximumValue$iv = 0.5F;
/*     */               
/*     */               $i$f$fastCoerceIn = 0;
/*  75 */               float f6 = $this$fastCoerceIn$iv; int m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  82 */               float f5 = (f6 < minimumValue$iv) ? minimumValue$iv : f6;
/*     */               
/*     */               int k = 0;
/*     */               
/*     */               $this$fastCoerceIn$iv = vector.getV4();
/*     */               
/*     */               minimumValue$iv = -0.5F;
/*     */               maximumValue$iv = 0.5F;
/*     */               $i$f$fastCoerceIn = 0;
/*  91 */               float f4 = $this$fastCoerceIn$iv; int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  98 */               float f3 = (f4 < minimumValue$iv) ? minimumValue$iv : f4;
/*     */               
/*     */               int i = 0;
/*     */               
/*     */               $this$fastCoerceIn$iv = vector.getV1();
/*     */               
/*     */               minimumValue$iv = 0.0F;
/*     */               maximumValue$iv = 1.0F;
/*     */               $i$f$fastCoerceIn = 0;
/* 107 */               float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 114 */               float $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < minimumValue$iv) ? minimumValue$iv : $this$fastCoerceAtLeast$iv$iv;
/*     */ 
/*     */ 
/*     */               
/*     */               int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */               
/* 122 */               return Color.convert-vNxB06k(ColorKt.Color((f7 > maximumValue$iv) ? maximumValue$iv : f7, (f5 > maximumValue$iv) ? maximumValue$iv : f5, (f3 > maximumValue$iv) ? maximumValue$iv : f3, ($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv, ColorSpaces.INSTANCE.getOklab()), this.$colorSpace);
/*     */             }
/*     */           }); }
/*     */ 
/*     */     
/*     */     public static final ColorVectorConverterKt$ColorToVector$1 INSTANCE = new ColorVectorConverterKt$ColorToVector$1();
/*     */     
/*     */     ColorVectorConverterKt$ColorToVector$1() {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> getVectorConverter(@NotNull Color.Companion $this$VectorConverter) {
/*     */     Intrinsics.checkNotNullParameter($this$VectorConverter, "<this>");
/*     */     return ColorToVector;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\ColorVectorConverterKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */