/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.compose.ui.geometry.CornerRadius;
/*    */ import androidx.compose.ui.geometry.Rect;
/*    */ import androidx.compose.ui.geometry.RoundRect;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.RRect;
/*    */ import org.jetbrains.skia.Rect;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\032\n\020\000\032\0020\001*\0020\002\032\n\020\003\032\0020\004*\0020\005\032\n\020\006\032\0020\002*\0020\001¨\006\007"}, d2 = {"toComposeRect", "Landroidx/compose/ui/geometry/Rect;", "Lorg/jetbrains/skia/Rect;", "toSkiaRRect", "Lorg/jetbrains/skia/RRect;", "Landroidx/compose/ui/geometry/RoundRect;", "toSkiaRect", "ui-graphics"})
/*    */ public final class Rects_skikoKt
/*    */ {
/*    */   @NotNull
/*    */   public static final Rect toSkiaRect(@NotNull Rect $this$toSkiaRect) {
/* 22 */     Intrinsics.checkNotNullParameter($this$toSkiaRect, "<this>"); return Rect.Companion.makeLTRB(
/* 23 */         $this$toSkiaRect.getLeft(), 
/* 24 */         $this$toSkiaRect.getTop(), 
/* 25 */         $this$toSkiaRect.getRight(), 
/* 26 */         $this$toSkiaRect.getBottom());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Rect toComposeRect(@NotNull Rect $this$toComposeRect) {
/* 31 */     Intrinsics.checkNotNullParameter($this$toComposeRect, "<this>"); return new Rect($this$toComposeRect.getLeft(), $this$toComposeRect.getTop(), $this$toComposeRect.getRight(), $this$toComposeRect.getBottom());
/*    */   } @NotNull
/*    */   public static final RRect toSkiaRRect(@NotNull RoundRect $this$toSkiaRRect) {
/* 34 */     Intrinsics.checkNotNullParameter($this$toSkiaRRect, "<this>"); float[] radii = new float[8];
/*    */     
/* 36 */     radii[0] = CornerRadius.getX-impl($this$toSkiaRRect.getTopLeftCornerRadius-kKHJgLs());
/* 37 */     radii[1] = CornerRadius.getY-impl($this$toSkiaRRect.getTopLeftCornerRadius-kKHJgLs());
/*    */     
/* 39 */     radii[2] = CornerRadius.getX-impl($this$toSkiaRRect.getTopRightCornerRadius-kKHJgLs());
/* 40 */     radii[3] = CornerRadius.getY-impl($this$toSkiaRRect.getTopRightCornerRadius-kKHJgLs());
/*    */     
/* 42 */     radii[4] = CornerRadius.getX-impl($this$toSkiaRRect.getBottomRightCornerRadius-kKHJgLs());
/* 43 */     radii[5] = CornerRadius.getY-impl($this$toSkiaRRect.getBottomRightCornerRadius-kKHJgLs());
/*    */     
/* 45 */     radii[6] = CornerRadius.getX-impl($this$toSkiaRRect.getBottomLeftCornerRadius-kKHJgLs());
/* 46 */     radii[7] = CornerRadius.getY-impl($this$toSkiaRRect.getBottomLeftCornerRadius-kKHJgLs());
/*    */     
/* 48 */     return RRect.Companion.makeComplexLTRB($this$toSkiaRRect.getLeft(), $this$toSkiaRRect.getTop(), $this$toSkiaRRect.getRight(), $this$toSkiaRRect.getBottom(), radii);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Rects_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */