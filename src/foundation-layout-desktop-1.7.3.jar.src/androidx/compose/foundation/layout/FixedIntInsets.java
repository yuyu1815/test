/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\016\n\000\b\003\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003¢\006\002\020\007J\023\020\b\032\0020\t2\b\020\n\032\004\030\0010\013H\002J\020\020\f\032\0020\0032\006\020\r\032\0020\016H\026J\030\020\017\032\0020\0032\006\020\r\032\0020\0162\006\020\020\032\0020\021H\026J\030\020\022\032\0020\0032\006\020\r\032\0020\0162\006\020\020\032\0020\021H\026J\020\020\023\032\0020\0032\006\020\r\032\0020\016H\026J\b\020\024\032\0020\003H\026J\b\020\025\032\0020\026H\026R\016\020\006\032\0020\003X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\005\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\003X\004¢\006\002\n\000¨\006\027"}, d2 = {"Landroidx/compose/foundation/layout/FixedIntInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "leftVal", "", "topVal", "rightVal", "bottomVal", "(IIII)V", "equals", "", "other", "", "getBottom", "density", "Landroidx/compose/ui/unit/Density;", "getLeft", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getRight", "getTop", "hashCode", "toString", "", "foundation-layout"})
/*     */ @Immutable
/*     */ final class FixedIntInsets
/*     */   implements WindowInsets
/*     */ {
/*     */   private final int leftVal;
/*     */   private final int topVal;
/*     */   private final int rightVal;
/*     */   private final int bottomVal;
/*     */   
/*     */   public FixedIntInsets(int leftVal, int topVal, int rightVal, int bottomVal) {
/* 286 */     this.leftVal = leftVal;
/* 287 */     this.topVal = topVal;
/* 288 */     this.rightVal = rightVal;
/* 289 */     this.bottomVal = bottomVal;
/*     */   }
/* 291 */   public int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) { Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); return this.leftVal; }
/* 292 */   public int getTop(@NotNull Density density) { Intrinsics.checkNotNullParameter(density, "density"); return this.topVal; }
/* 293 */   public int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) { Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); return this.rightVal; } public int getBottom(@NotNull Density density) {
/* 294 */     Intrinsics.checkNotNullParameter(density, "density"); return this.bottomVal;
/*     */   } @NotNull
/*     */   public String toString() {
/* 297 */     return "Insets(left=" + this.leftVal + ", top=" + this.topVal + ", right=" + this.rightVal + ", bottom=" + this.bottomVal + ')';
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 301 */     if (this == other) {
/* 302 */       return true;
/*     */     }
/* 304 */     if (!(other instanceof FixedIntInsets)) {
/* 305 */       return false;
/*     */     }
/*     */     
/* 308 */     return (this.leftVal == ((FixedIntInsets)other).leftVal && this.topVal == ((FixedIntInsets)other).topVal && 
/* 309 */       this.rightVal == ((FixedIntInsets)other).rightVal && this.bottomVal == ((FixedIntInsets)other).bottomVal);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 313 */     int result = this.leftVal;
/* 314 */     result = 31 * result + this.topVal;
/* 315 */     result = 31 * result + this.rightVal;
/* 316 */     result = 31 * result + this.bottomVal;
/* 317 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\FixedIntInsets.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */