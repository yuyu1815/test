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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\000\032\"\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007¨\006\b"}, d2 = {"PathIterator", "Landroidx/compose/ui/graphics/PathIterator;", "path", "Landroidx/compose/ui/graphics/Path;", "conicEvaluation", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "tolerance", "", "ui-graphics"})
/*    */ public final class SkiaPathIterator_skikoKt
/*    */ {
/*    */   @NotNull
/*    */   public static final PathIterator PathIterator(@NotNull Path path, @NotNull PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
/* 25 */     Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation"); return new SkiaPathIterator(path, conicEvaluation, tolerance);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaPathIterator_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */