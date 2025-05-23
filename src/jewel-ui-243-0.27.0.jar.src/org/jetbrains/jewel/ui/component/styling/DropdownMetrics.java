/*     */ package org.jetbrains.jewel.ui.component.styling;
/*     */ 
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.foundation.shape.CornerSize;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.DpSize;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @GenerateDataFunctions
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\017\b\007\030\000 \0302\0020\001:\001\030B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\004\b\013\020\fR\023\020\002\032\0020\003¢\006\n\n\002\020\017\032\004\b\r\020\016R\023\020\004\032\0020\003¢\006\n\n\002\020\017\032\004\b\020\020\016R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\021\020\022R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\023\020\024R\023\020\t\032\0020\n¢\006\n\n\002\020\027\032\004\b\025\020\026¨\006\031"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/DropdownMetrics;", "", "arrowMinSize", "Landroidx/compose/ui/unit/DpSize;", "minSize", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "<init>", "(JJLandroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArrowMinSize-MYxV2XQ", "()J", "J", "getMinSize-MYxV2XQ", "getCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getBorderWidth-D9Ej5fM", "()F", "F", "Companion", "ui"})
/*     */ @Stable
/*     */ public final class DropdownMetrics
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long arrowMinSize;
/*     */   private final long minSize;
/*     */   @NotNull
/*     */   private final CornerSize cornerSize;
/*     */   @NotNull
/*     */   private final PaddingValues contentPadding;
/*     */   private final float borderWidth;
/*     */   public static final int $stable;
/*     */   
/*     */   private DropdownMetrics(long arrowMinSize, long minSize, CornerSize cornerSize, PaddingValues contentPadding, float borderWidth) {
/* 112 */     this.arrowMinSize = arrowMinSize;
/* 113 */     this.minSize = minSize;
/* 114 */     this.cornerSize = cornerSize;
/* 115 */     this.contentPadding = contentPadding;
/* 116 */     this.borderWidth = borderWidth; } public final float getBorderWidth-D9Ej5fM() { return this.borderWidth; }
/*     */ 
/*     */   
/*     */   public final long getArrowMinSize-MYxV2XQ() {
/*     */     return this.arrowMinSize;
/*     */   }
/*     */   
/*     */   public final long getMinSize-MYxV2XQ() {
/*     */     return this.minSize;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CornerSize getCornerSize() {
/*     */     return this.cornerSize;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues getContentPadding() {
/*     */     return this.contentPadding;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof DropdownMetrics))
/*     */       return false; 
/*     */     DropdownMetrics dropdownMetrics = (DropdownMetrics)other;
/*     */     return !DpSize.equals-impl0(this.arrowMinSize, dropdownMetrics.arrowMinSize) ? false : (!DpSize.equals-impl0(this.minSize, dropdownMetrics.minSize) ? false : (!Intrinsics.areEqual(this.cornerSize, dropdownMetrics.cornerSize) ? false : (!Intrinsics.areEqual(this.contentPadding, dropdownMetrics.contentPadding) ? false : (!!Dp.equals-impl0(this.borderWidth, dropdownMetrics.borderWidth)))));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = DpSize.hashCode-impl(this.arrowMinSize);
/*     */     result = result * 31 + DpSize.hashCode-impl(this.minSize);
/*     */     result = result * 31 + this.cornerSize.hashCode();
/*     */     result = result * 31 + this.contentPadding.hashCode();
/*     */     return result * 31 + Dp.hashCode-impl(this.borderWidth);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "DropdownMetrics(arrowMinSize=" + DpSize.toString-impl(this.arrowMinSize) + ", minSize=" + DpSize.toString-impl(this.minSize) + ", cornerSize=" + this.cornerSize + ", contentPadding=" + this.contentPadding + ", borderWidth=" + Dp.toString-impl(this.borderWidth) + ")";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/DropdownMetrics$Companion;", "", "<init>", "()V", "ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\DropdownMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */