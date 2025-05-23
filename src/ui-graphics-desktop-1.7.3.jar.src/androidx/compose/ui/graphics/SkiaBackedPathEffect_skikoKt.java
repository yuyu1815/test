/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.PathEffect;
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
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000:\n\000\n\002\030\002\n\002\b\004\n\002\020\007\n\002\b\002\n\002\020\024\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\032\030\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\001H\000\032\020\020\004\032\0020\0012\006\020\005\032\0020\006H\000\032\030\020\007\032\0020\0012\006\020\b\032\0020\t2\006\020\n\032\0020\006H\000\0322\020\013\032\0020\0012\006\020\f\032\0020\r2\006\020\016\032\0020\0062\006\020\n\032\0020\0062\006\020\017\032\0020\020H\000ø\001\000¢\006\004\b\021\020\022\032\n\020\023\032\0020\001*\0020\024\032\n\020\025\032\0020\024*\0020\001\032\026\020\026\032\0020\027*\0020\020H\000ø\001\000¢\006\004\b\030\020\031\002\007\n\005\b¡\0360\001¨\006\032"}, d2 = {"actualChainPathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "outer", "inner", "actualCornerPathEffect", "radius", "", "actualDashPathEffect", "intervals", "", "phase", "actualStampedPathEffect", "shape", "Landroidx/compose/ui/graphics/Path;", "advance", "style", "Landroidx/compose/ui/graphics/StampedPathEffectStyle;", "actualStampedPathEffect-7aD1DOk", "(Landroidx/compose/ui/graphics/Path;FFI)Landroidx/compose/ui/graphics/PathEffect;", "asComposePathEffect", "Lorg/jetbrains/skia/PathEffect;", "asSkiaPathEffect", "toSkiaStampedPathEffectStyle", "Lorg/jetbrains/skia/PathEffect$Style;", "toSkiaStampedPathEffectStyle-oQv6xUo", "(I)Lorg/jetbrains/skia/PathEffect$Style;", "ui-graphics"})
/*    */ public final class SkiaBackedPathEffect_skikoKt
/*    */ {
/*    */   @NotNull
/*    */   public static final PathEffect asComposePathEffect(@NotNull PathEffect $this$asComposePathEffect) {
/* 26 */     Intrinsics.checkNotNullParameter($this$asComposePathEffect, "<this>"); return new SkiaBackedPathEffect($this$asComposePathEffect);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final PathEffect asSkiaPathEffect(@NotNull PathEffect $this$asSkiaPathEffect) {
/* 32 */     Intrinsics.checkNotNullParameter($this$asSkiaPathEffect, "<this>"); return ((SkiaBackedPathEffect)$this$asSkiaPathEffect).getNativePathEffect();
/*    */   } @NotNull
/*    */   public static final PathEffect actualCornerPathEffect(float radius) {
/* 35 */     return new SkiaBackedPathEffect(PathEffect.Companion.makeCorner(radius));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final PathEffect actualDashPathEffect(@NotNull float[] intervals, float phase) {
/* 40 */     Intrinsics.checkNotNullParameter(intervals, "intervals"); return new SkiaBackedPathEffect(PathEffect.Companion.makeDash(intervals, phase));
/*    */   } @NotNull
/*    */   public static final PathEffect actualChainPathEffect(@NotNull PathEffect outer, @NotNull PathEffect inner) {
/* 43 */     Intrinsics.checkNotNullParameter(outer, "outer"); Intrinsics.checkNotNullParameter(inner, "inner"); return new SkiaBackedPathEffect(asSkiaPathEffect(outer).makeCompose(asSkiaPathEffect(inner)));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final PathEffect actualStampedPathEffect-7aD1DOk(@NotNull Path shape, float advance, float phase, int style) {
/* 51 */     Intrinsics.checkNotNullParameter(shape, "shape"); return new SkiaBackedPathEffect(
/* 52 */         PathEffect.Companion.makePath1D(
/* 53 */           SkiaBackedPath_skikoKt.asSkiaPath(shape), 
/* 54 */           advance, 
/* 55 */           phase, 
/* 56 */           toSkiaStampedPathEffectStyle-oQv6xUo(style)));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final PathEffect.Style toSkiaStampedPathEffectStyle-oQv6xUo(int $this$toSkiaStampedPathEffectStyle_u2doQv6xUo) {
/* 61 */     int i = $this$toSkiaStampedPathEffectStyle_u2doQv6xUo;
/* 62 */     return StampedPathEffectStyle.equals-impl0(i, StampedPathEffectStyle.Companion.getMorph-Ypspkwk()) ? PathEffect.Style.MORPH : (
/* 63 */       StampedPathEffectStyle.equals-impl0(i, StampedPathEffectStyle.Companion.getRotate-Ypspkwk()) ? PathEffect.Style.ROTATE : (
/* 64 */       StampedPathEffectStyle.equals-impl0(i, StampedPathEffectStyle.Companion.getTranslate-Ypspkwk()) ? PathEffect.Style.TRANSLATE : 
/* 65 */       PathEffect.Style.TRANSLATE));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaBackedPathEffect_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */