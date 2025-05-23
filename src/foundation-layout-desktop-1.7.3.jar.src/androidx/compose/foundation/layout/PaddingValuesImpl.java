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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\023\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\001\030\0002\0020\001B-\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\003\022\b\b\002\020\006\032\0020\003¢\006\002\020\007J\025\020\023\032\0020\003H\026ø\001\001ø\001\000¢\006\004\b\024\020\013J\035\020\025\032\0020\0032\006\020\026\032\0020\027H\026ø\001\001ø\001\000¢\006\004\b\030\020\031J\035\020\032\032\0020\0032\006\020\026\032\0020\027H\026ø\001\001ø\001\000¢\006\004\b\033\020\031J\025\020\034\032\0020\003H\026ø\001\001ø\001\000¢\006\004\b\035\020\013J\023\020\036\032\0020\0372\b\020 \032\004\030\0010!H\002J\b\020\"\032\0020#H\026J\b\020$\032\0020%H\026R$\020\006\032\0020\0038\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\f\022\004\b\b\020\t\032\004\b\n\020\013R$\020\005\032\0020\0038\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\f\022\004\b\r\020\t\032\004\b\016\020\013R$\020\002\032\0020\0038\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\f\022\004\b\017\020\t\032\004\b\020\020\013R$\020\004\032\0020\0038\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\f\022\004\b\021\020\t\032\004\b\022\020\013\002\013\n\005\b¡\0360\001\n\002\b!¨\006&"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesImpl;", "Landroidx/compose/foundation/layout/PaddingValues;", "start", "Landroidx/compose/ui/unit/Dp;", "top", "end", "bottom", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM$annotations", "()V", "getBottom-D9Ej5fM", "()F", "F", "getEnd-D9Ej5fM$annotations", "getEnd-D9Ej5fM", "getStart-D9Ej5fM$annotations", "getStart-D9Ej5fM", "getTop-D9Ej5fM$annotations", "getTop-D9Ej5fM", "calculateBottomPadding", "calculateBottomPadding-D9Ej5fM", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "equals", "", "other", "", "hashCode", "", "toString", "", "foundation-layout"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n1#2:485\n149#3:486\n149#3:487\n149#3:488\n149#3:489\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n*L\n303#1:486\n305#1:487\n307#1:488\n309#1:489\n*E\n"})
/*     */ public final class PaddingValuesImpl
/*     */   implements PaddingValues
/*     */ {
/*     */   private final float start;
/*     */   private final float top;
/*     */   private final float end;
/*     */   private final float bottom;
/*     */   public static final int $stable;
/*     */   
/*     */   private PaddingValuesImpl(float start, float top, float end, float bottom) {
/* 302 */     this.start = start;
/*     */     
/* 304 */     this.top = top;
/*     */     
/* 306 */     this.end = end;
/*     */     
/* 308 */     this.bottom = bottom;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 313 */     if (!((this.start >= 0.0F) ? 1 : 0))
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 485 */       int $i$a$-require-PaddingValuesImpl$1 = 0; String str = "Start padding must be non-negative"; throw new IllegalArgumentException(str.toString()); }  if (!((this.top >= 0.0F) ? 1 : 0)) { int $i$a$-require-PaddingValuesImpl$2 = 0; String str = "Top padding must be non-negative"; throw new IllegalArgumentException(str.toString()); }  if (!((this.end >= 0.0F) ? 1 : 0)) { int $i$a$-require-PaddingValuesImpl$3 = 0; String str = "End padding must be non-negative"; throw new IllegalArgumentException(str.toString()); }  if (!((this.bottom >= 0.0F) ? 1 : 0)) { int $i$a$-require-PaddingValuesImpl$4 = 0;
/*     */       String str = "Bottom padding must be non-negative";
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */   
/*     */   }
/*     */   
/*     */   public final float getStart-D9Ej5fM() {
/*     */     return this.start;
/*     */   }
/*     */   
/*     */   public final float getTop-D9Ej5fM() {
/*     */     return this.top;
/*     */   }
/*     */   
/*     */   public final float getEnd-D9Ej5fM() {
/*     */     return this.end;
/*     */   }
/*     */   
/*     */   public final float getBottom-D9Ej5fM() {
/*     */     return this.bottom;
/*     */   }
/*     */   
/*     */   public float calculateLeftPadding-u2uoSUM(@NotNull LayoutDirection layoutDirection) {
/*     */     Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */     return (layoutDirection == LayoutDirection.Ltr) ? this.start : this.end;
/*     */   }
/*     */   
/*     */   public float calculateTopPadding-D9Ej5fM() {
/*     */     return this.top;
/*     */   }
/*     */   
/*     */   public float calculateRightPadding-u2uoSUM(@NotNull LayoutDirection layoutDirection) {
/*     */     Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */     return (layoutDirection == LayoutDirection.Ltr) ? this.end : this.start;
/*     */   }
/*     */   
/*     */   public float calculateBottomPadding-D9Ej5fM() {
/*     */     return this.bottom;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (!(other instanceof PaddingValuesImpl))
/*     */       return false; 
/*     */     return (Dp.equals-impl0(this.start, ((PaddingValuesImpl)other).start) && Dp.equals-impl0(this.top, ((PaddingValuesImpl)other).top) && Dp.equals-impl0(this.end, ((PaddingValuesImpl)other).end) && Dp.equals-impl0(this.bottom, ((PaddingValuesImpl)other).bottom));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return ((Dp.hashCode-impl(this.start) * 31 + Dp.hashCode-impl(this.top)) * 31 + Dp.hashCode-impl(this.end)) * 31 + Dp.hashCode-impl(this.bottom);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "PaddingValues(start=" + Dp.toString-impl(this.start) + ", top=" + Dp.toString-impl(this.top) + ", end=" + Dp.toString-impl(this.end) + ", bottom=" + Dp.toString-impl(this.bottom) + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\PaddingValuesImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */