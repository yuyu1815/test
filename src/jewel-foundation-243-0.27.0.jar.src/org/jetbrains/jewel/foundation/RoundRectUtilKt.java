/*    */ package org.jetbrains.jewel.foundation;
/*    */ import androidx.compose.ui.geometry.RoundRect;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\002\n\002\020\013\n\000\032\024\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\003H\000\032\024\020\004\032\0020\001*\0020\0012\006\020\002\032\0020\003H\000\032\f\020\005\032\0020\006*\0020\001H\000¨\006\007"}, d2 = {"grow", "Landroidx/compose/ui/geometry/RoundRect;", "delta", "", "shrink", "hasAtLeastOneNonRoundedCorner", "", "foundation"})
/*    */ public final class RoundRectUtilKt {
/*    */   @NotNull
/*    */   public static final RoundRect grow(@NotNull RoundRect $this$grow, float delta) {
/*  8 */     Intrinsics.checkNotNullParameter($this$grow, "<this>"); float f1 = $this$grow.getLeft() - delta;
/*  9 */     float f2 = $this$grow.getTop() - delta;
/* 10 */     float f3 = $this$grow.getRight() + delta;
/* 11 */     float f4 = $this$grow.getBottom() + delta;
/* 12 */     long l1 = CornerRadiusKt.CornerRadius(CornerRadius.getX-impl($this$grow.getTopLeftCornerRadius-kKHJgLs()) + delta, CornerRadius.getY-impl($this$grow.getTopLeftCornerRadius-kKHJgLs()) + delta);
/* 13 */     long l2 = CornerRadiusKt.CornerRadius(CornerRadius.getX-impl($this$grow.getTopRightCornerRadius-kKHJgLs()) + delta, CornerRadius.getY-impl($this$grow.getTopRightCornerRadius-kKHJgLs()) + delta);
/* 14 */     long l3 = CornerRadiusKt.CornerRadius(CornerRadius.getX-impl($this$grow.getBottomLeftCornerRadius-kKHJgLs()) + delta, CornerRadius.getY-impl($this$grow.getBottomLeftCornerRadius-kKHJgLs()) + delta);
/* 15 */     long l4 = CornerRadiusKt.CornerRadius(CornerRadius.getX-impl($this$grow.getBottomRightCornerRadius-kKHJgLs()) + delta, CornerRadius.getY-impl($this$grow.getBottomRightCornerRadius-kKHJgLs()) + delta); return new RoundRect(f1, f2, f3, f4, l1, l2, l4, l3, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final RoundRect shrink(@NotNull RoundRect $this$shrink, float delta) {
/* 20 */     Intrinsics.checkNotNullParameter($this$shrink, "<this>"); float f1 = $this$shrink.getLeft() + delta;
/* 21 */     float f2 = $this$shrink.getTop() + delta;
/* 22 */     float f3 = $this$shrink.getRight() - delta;
/* 23 */     float f4 = $this$shrink.getBottom() - delta;
/* 24 */     long l1 = CornerRadiusKt.CornerRadius(CornerRadius.getX-impl($this$shrink.getTopLeftCornerRadius-kKHJgLs()) - delta, CornerRadius.getY-impl($this$shrink.getTopLeftCornerRadius-kKHJgLs()) - delta);
/* 25 */     long l2 = CornerRadiusKt.CornerRadius(CornerRadius.getX-impl($this$shrink.getTopRightCornerRadius-kKHJgLs()) - delta, CornerRadius.getY-impl($this$shrink.getTopRightCornerRadius-kKHJgLs()) - delta);
/* 26 */     long l3 = CornerRadiusKt.CornerRadius(CornerRadius.getX-impl($this$shrink.getBottomLeftCornerRadius-kKHJgLs()) - delta, CornerRadius.getY-impl($this$shrink.getBottomLeftCornerRadius-kKHJgLs()) - delta);
/* 27 */     long l4 = CornerRadiusKt.CornerRadius(CornerRadius.getX-impl($this$shrink.getBottomRightCornerRadius-kKHJgLs()) - delta, CornerRadius.getY-impl($this$shrink.getBottomRightCornerRadius-kKHJgLs()) - delta); return new RoundRect(f1, f2, f3, f4, l1, l2, l4, l3, null);
/*    */   }
/*    */   
/*    */   public static final boolean hasAtLeastOneNonRoundedCorner(@NotNull RoundRect $this$hasAtLeastOneNonRoundedCorner) {
/* 31 */     Intrinsics.checkNotNullParameter($this$hasAtLeastOneNonRoundedCorner, "<this>"); return ((((CornerRadius.getX-impl($this$hasAtLeastOneNonRoundedCorner.getTopLeftCornerRadius-kKHJgLs()) == 0.0F)) && ((CornerRadius.getY-impl($this$hasAtLeastOneNonRoundedCorner.getTopLeftCornerRadius-kKHJgLs()) == 0.0F))) || ((
/* 32 */       (CornerRadius.getX-impl($this$hasAtLeastOneNonRoundedCorner.getTopRightCornerRadius-kKHJgLs()) == 0.0F)) && ((CornerRadius.getY-impl($this$hasAtLeastOneNonRoundedCorner.getTopRightCornerRadius-kKHJgLs()) == 0.0F))) || ((
/* 33 */       (CornerRadius.getX-impl($this$hasAtLeastOneNonRoundedCorner.getBottomLeftCornerRadius-kKHJgLs()) == 0.0F)) && ((CornerRadius.getY-impl($this$hasAtLeastOneNonRoundedCorner.getBottomLeftCornerRadius-kKHJgLs()) == 0.0F))) || ((
/* 34 */       (CornerRadius.getX-impl($this$hasAtLeastOneNonRoundedCorner.getBottomRightCornerRadius-kKHJgLs()) == 0.0F)) && ((CornerRadius.getY-impl($this$hasAtLeastOneNonRoundedCorner.getBottomRightCornerRadius-kKHJgLs()) == 0.0F))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\RoundRectUtilKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */