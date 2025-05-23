/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\002\bf\030\000 \0022\0020\001:\001\002ø\001\000\002\006\n\004\b!0\001¨\006\003À\006\001"}, d2 = {"Landroidx/compose/ui/graphics/PathEffect;", "", "Companion", "ui-graphics"})
/*    */ public interface PathEffect
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\007\n\002\b\002\n\002\020\024\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\004J\016\020\007\032\0020\0042\006\020\b\032\0020\tJ\030\020\n\032\0020\0042\006\020\013\032\0020\f2\b\b\002\020\r\032\0020\tJ0\020\016\032\0020\0042\006\020\017\032\0020\0202\006\020\021\032\0020\t2\006\020\r\032\0020\t2\006\020\022\032\0020\023ø\001\000¢\006\004\b\024\020\025\002\007\n\005\b¡\0360\001¨\006\026"}, d2 = {"Landroidx/compose/ui/graphics/PathEffect$Companion;", "", "()V", "chainPathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "outer", "inner", "cornerPathEffect", "radius", "", "dashPathEffect", "intervals", "", "phase", "stampedPathEffect", "shape", "Landroidx/compose/ui/graphics/Path;", "advance", "style", "Landroidx/compose/ui/graphics/StampedPathEffectStyle;", "stampedPathEffect-7aD1DOk", "(Landroidx/compose/ui/graphics/Path;FFI)Landroidx/compose/ui/graphics/PathEffect;", "ui-graphics"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/*    */     public final PathEffect cornerPathEffect(float radius) {
/* 34 */       return SkiaBackedPathEffect_skikoKt.actualCornerPathEffect(radius);
/*    */     }
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
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final PathEffect dashPathEffect(@NotNull float[] intervals, float phase) {
/* 54 */       Intrinsics.checkNotNullParameter(intervals, "intervals"); return SkiaBackedPathEffect_skikoKt.actualDashPathEffect(intervals, phase);
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final PathEffect chainPathEffect(@NotNull PathEffect outer, @NotNull PathEffect inner) {
/* 61 */       Intrinsics.checkNotNullParameter(outer, "outer"); Intrinsics.checkNotNullParameter(inner, "inner"); return SkiaBackedPathEffect_skikoKt.actualChainPathEffect(outer, inner);
/*    */     }
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
/*    */     @NotNull
/*    */     public final PathEffect stampedPathEffect-7aD1DOk(@NotNull Path shape, float advance, float phase, int style) {
/* 78 */       Intrinsics.checkNotNullParameter(shape, "shape"); return SkiaBackedPathEffect_skikoKt.actualStampedPathEffect-7aD1DOk(shape, advance, phase, style);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\PathEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */