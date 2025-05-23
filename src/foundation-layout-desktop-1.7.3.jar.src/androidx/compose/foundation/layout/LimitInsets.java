/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\016\n\000\b\003\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004¢\006\002\020\005J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\016H\002J\020\020\017\032\0020\0202\006\020\021\032\0020\022H\026J\030\020\023\032\0020\0202\006\020\021\032\0020\0222\006\020\024\032\0020\025H\026J\030\020\026\032\0020\0202\006\020\021\032\0020\0222\006\020\024\032\0020\025H\026J\020\020\027\032\0020\0202\006\020\021\032\0020\022H\026J\b\020\030\032\0020\020H\026J\b\020\031\032\0020\032H\026R\021\020\002\032\0020\001¢\006\b\n\000\032\004\b\006\020\007R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\n\032\004\b\b\020\t\002\013\n\005\b¡\0360\001\n\002\b!¨\006\033"}, d2 = {"Landroidx/compose/foundation/layout/LimitInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "sides", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "(Landroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "getSides-JoeWqyM", "()I", "I", "equals", "", "other", "", "getBottom", "", "density", "Landroidx/compose/ui/unit/Density;", "getLeft", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getRight", "getTop", "hashCode", "toString", "", "foundation-layout"})
/*     */ @Stable
/*     */ final class LimitInsets
/*     */   implements WindowInsets
/*     */ {
/*     */   @NotNull
/*     */   private final WindowInsets insets;
/*     */   private final int sides;
/*     */   
/*     */   private LimitInsets(WindowInsets insets, int sides) {
/* 578 */     this.insets = insets;
/* 579 */     this.sides = sides; } public final int getSides-JoeWqyM() { return this.sides; }
/*     */   @NotNull
/*     */   public final WindowInsets getInsets() { return this.insets; } public int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
/* 582 */     Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); int layoutDirectionSide = (layoutDirection == LayoutDirection.Ltr) ? 
/* 583 */       WindowInsetsSides.Companion.getAllowLeftInLtr-JoeWqyM$foundation_layout() : 
/*     */       
/* 585 */       WindowInsetsSides.Companion.getAllowLeftInRtl-JoeWqyM$foundation_layout();
/*     */     
/* 587 */     boolean allowLeft = WindowInsetsSides.hasAny-bkgdKaI$foundation_layout(this.sides, layoutDirectionSide);
/* 588 */     return allowLeft ? 
/* 589 */       this.insets.getLeft(density, layoutDirection) : 
/*     */       
/* 591 */       0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getTop(@NotNull Density density) {
/* 596 */     Intrinsics.checkNotNullParameter(density, "density"); return WindowInsetsSides.hasAny-bkgdKaI$foundation_layout(this.sides, WindowInsetsSides.Companion.getTop-JoeWqyM()) ? this.insets.getTop(density) : 0;
/*     */   }
/*     */   public int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
/* 599 */     Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); int layoutDirectionSide = (layoutDirection == LayoutDirection.Ltr) ? 
/* 600 */       WindowInsetsSides.Companion.getAllowRightInLtr-JoeWqyM$foundation_layout() : 
/*     */       
/* 602 */       WindowInsetsSides.Companion.getAllowRightInRtl-JoeWqyM$foundation_layout();
/*     */     
/* 604 */     boolean allowRight = WindowInsetsSides.hasAny-bkgdKaI$foundation_layout(this.sides, layoutDirectionSide);
/* 605 */     return allowRight ? 
/* 606 */       this.insets.getRight(density, layoutDirection) : 
/*     */       
/* 608 */       0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getBottom(@NotNull Density density) {
/* 613 */     Intrinsics.checkNotNullParameter(density, "density"); return WindowInsetsSides.hasAny-bkgdKaI$foundation_layout(this.sides, WindowInsetsSides.Companion.getBottom-JoeWqyM()) ? this.insets.getBottom(density) : 0;
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/* 616 */     if (this == other) {
/* 617 */       return true;
/*     */     }
/* 619 */     if (!(other instanceof LimitInsets)) {
/* 620 */       return false;
/*     */     }
/* 622 */     return (Intrinsics.areEqual(this.insets, ((LimitInsets)other).insets) && 
/* 623 */       WindowInsetsSides.equals-impl0(this.sides, ((LimitInsets)other).sides));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 627 */     int result = this.insets.hashCode();
/* 628 */     result = 31 * result + WindowInsetsSides.hashCode-impl(this.sides);
/* 629 */     return result;
/*     */   } @NotNull
/*     */   public String toString() {
/* 632 */     return '(' + this.insets + " only " + WindowInsetsSides.toString-impl(this.sides) + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\LimitInsets.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */