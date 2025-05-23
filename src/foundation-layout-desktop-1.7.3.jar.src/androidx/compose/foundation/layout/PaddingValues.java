/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\b\bg\030\0002\0020\001:\001\017J\025\020\002\032\0020\003H&ø\001\000ø\001\001¢\006\004\b\004\020\005J\035\020\006\032\0020\0032\006\020\007\032\0020\bH&ø\001\000ø\001\001¢\006\004\b\t\020\nJ\035\020\013\032\0020\0032\006\020\007\032\0020\bH&ø\001\000ø\001\001¢\006\004\b\f\020\nJ\025\020\r\032\0020\003H&ø\001\000ø\001\001¢\006\004\b\016\020\005ø\001\002\002\021\n\002\b!\n\005\b¡\0360\001\n\004\b!0\001¨\006\020À\006\001"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues;", "", "calculateBottomPadding", "Landroidx/compose/ui/unit/Dp;", "calculateBottomPadding-D9Ej5fM", "()F", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "Absolute", "foundation-layout"})
/*     */ @Stable
/*     */ public interface PaddingValues
/*     */ {
/*     */   float calculateLeftPadding-u2uoSUM(@NotNull LayoutDirection paramLayoutDirection);
/*     */   
/*     */   float calculateTopPadding-D9Ej5fM();
/*     */   
/*     */   float calculateRightPadding-u2uoSUM(@NotNull LayoutDirection paramLayoutDirection);
/*     */   
/*     */   float calculateBottomPadding-D9Ej5fM();
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\017\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\007\030\0002\0020\001B-\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\003\022\b\b\002\020\006\032\0020\003¢\006\002\020\007J\025\020\016\032\0020\003H\026ø\001\001ø\001\000¢\006\004\b\017\020\020J\035\020\021\032\0020\0032\006\020\022\032\0020\023H\026ø\001\001ø\001\000¢\006\004\b\024\020\025J\035\020\026\032\0020\0032\006\020\022\032\0020\023H\026ø\001\001ø\001\000¢\006\004\b\027\020\025J\025\020\030\032\0020\003H\026ø\001\001ø\001\000¢\006\004\b\031\020\020J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\035H\002J\b\020\036\032\0020\037H\026J\b\020 \032\0020!H\026R\036\020\006\032\0020\0038\002X\004ø\001\000ø\001\001¢\006\n\n\002\020\n\022\004\b\b\020\tR\036\020\002\032\0020\0038\002X\004ø\001\000ø\001\001¢\006\n\n\002\020\n\022\004\b\013\020\tR\036\020\005\032\0020\0038\002X\004ø\001\000ø\001\001¢\006\n\n\002\020\n\022\004\b\f\020\tR\036\020\004\032\0020\0038\002X\004ø\001\000ø\001\001¢\006\n\n\002\020\n\022\004\b\r\020\t\002\013\n\005\b¡\0360\001\n\002\b!¨\006\""}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues$Absolute;", "Landroidx/compose/foundation/layout/PaddingValues;", "left", "Landroidx/compose/ui/unit/Dp;", "top", "right", "bottom", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM$annotations", "()V", "F", "getLeft-D9Ej5fM$annotations", "getRight-D9Ej5fM$annotations", "getTop-D9Ej5fM$annotations", "calculateBottomPadding", "calculateBottomPadding-D9Ej5fM", "()F", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "equals", "", "other", "", "hashCode", "", "toString", "", "foundation-layout"})
/*     */   @Immutable
/*     */   @SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n1#2:485\n149#3:486\n149#3:487\n149#3:488\n149#3:489\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n*L\n208#1:486\n210#1:487\n212#1:488\n214#1:489\n*E\n"})
/*     */   public static final class Absolute
/*     */     implements PaddingValues
/*     */   {
/*     */     private final float left;
/*     */     private final float top;
/*     */     private final float right;
/*     */     private final float bottom;
/*     */     public static final int $stable;
/*     */     
/*     */     private Absolute(float left, float top, float right, float bottom) {
/* 207 */       this.left = left;
/*     */       
/* 209 */       this.top = top;
/*     */       
/* 211 */       this.right = right;
/*     */       
/* 213 */       this.bottom = bottom;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 218 */       if (!((this.left >= 0.0F) ? 1 : 0))
/*     */       
/*     */       { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 485 */         int $i$a$-require-PaddingValues$Absolute$1 = 0; String str = "Left padding must be non-negative"; throw new IllegalArgumentException(str.toString()); }  if (!((this.top >= 0.0F) ? 1 : 0)) { int $i$a$-require-PaddingValues$Absolute$2 = 0; String str = "Top padding must be non-negative"; throw new IllegalArgumentException(str.toString()); }  if (!((this.right >= 0.0F) ? 1 : 0)) { int $i$a$-require-PaddingValues$Absolute$3 = 0; String str = "Right padding must be non-negative"; throw new IllegalArgumentException(str.toString()); }  if (!((this.bottom >= 0.0F) ? 1 : 0)) { int $i$a$-require-PaddingValues$Absolute$4 = 0;
/*     */         String str = "Bottom padding must be non-negative";
/*     */         throw new IllegalArgumentException(str.toString()); }
/*     */     
/*     */     }
/*     */     
/*     */     public float calculateLeftPadding-u2uoSUM(@NotNull LayoutDirection layoutDirection) {
/*     */       Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */       return this.left;
/*     */     }
/*     */     
/*     */     public float calculateTopPadding-D9Ej5fM() {
/*     */       return this.top;
/*     */     }
/*     */     
/*     */     public float calculateRightPadding-u2uoSUM(@NotNull LayoutDirection layoutDirection) {
/*     */       Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */       return this.right;
/*     */     }
/*     */     
/*     */     public float calculateBottomPadding-D9Ej5fM() {
/*     */       return this.bottom;
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (!(other instanceof Absolute))
/*     */         return false; 
/*     */       return (Dp.equals-impl0(this.left, ((Absolute)other).left) && Dp.equals-impl0(this.top, ((Absolute)other).top) && Dp.equals-impl0(this.right, ((Absolute)other).right) && Dp.equals-impl0(this.bottom, ((Absolute)other).bottom));
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return ((Dp.hashCode-impl(this.left) * 31 + Dp.hashCode-impl(this.top)) * 31 + Dp.hashCode-impl(this.right)) * 31 + Dp.hashCode-impl(this.bottom);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "PaddingValues.Absolute(left=" + Dp.toString-impl(this.left) + ", top=" + Dp.toString-impl(this.top) + ", right=" + Dp.toString-impl(this.right) + ", bottom=" + Dp.toString-impl(this.bottom) + ')';
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\PaddingValues.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */