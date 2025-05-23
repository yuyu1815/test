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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\016\b\007\030\000 \0262\0020\001:\001\026B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\023\020\004\032\0020\005¢\006\n\n\002\020\020\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\021\020\022R\023\020\b\032\0020\t¢\006\n\n\002\020\025\032\004\b\023\020\024¨\006\027"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;", "", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "padding", "Landroidx/compose/foundation/layout/PaddingValues;", "minSize", "Landroidx/compose/ui/unit/DpSize;", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;FLandroidx/compose/foundation/layout/PaddingValues;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getBorderWidth-D9Ej5fM", "()F", "F", "getPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getMinSize-MYxV2XQ", "()J", "J", "Companion", "ui"})
/*     */ @Stable
/*     */ public final class IconButtonMetrics
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final CornerSize cornerSize;
/*     */   private final float borderWidth;
/*     */   @NotNull
/*     */   private final PaddingValues padding;
/*     */   private final long minSize;
/*     */   public static final int $stable;
/*     */   
/*     */   private IconButtonMetrics(CornerSize cornerSize, float borderWidth, PaddingValues padding, long minSize) {
/* 150 */     this.cornerSize = cornerSize;
/* 151 */     this.borderWidth = borderWidth;
/* 152 */     this.padding = padding;
/* 153 */     this.minSize = minSize; } public final long getMinSize-MYxV2XQ() { return this.minSize; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final CornerSize getCornerSize() {
/*     */     return this.cornerSize;
/*     */   }
/*     */   
/*     */   public final float getBorderWidth-D9Ej5fM() {
/*     */     return this.borderWidth;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues getPadding() {
/*     */     return this.padding;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof IconButtonMetrics))
/*     */       return false; 
/*     */     IconButtonMetrics iconButtonMetrics = (IconButtonMetrics)other;
/*     */     return !Intrinsics.areEqual(this.cornerSize, iconButtonMetrics.cornerSize) ? false : (!Dp.equals-impl0(this.borderWidth, iconButtonMetrics.borderWidth) ? false : (!Intrinsics.areEqual(this.padding, iconButtonMetrics.padding) ? false : (!!DpSize.equals-impl0(this.minSize, iconButtonMetrics.minSize))));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.cornerSize.hashCode();
/*     */     result = result * 31 + Dp.hashCode-impl(this.borderWidth);
/*     */     result = result * 31 + this.padding.hashCode();
/*     */     return result * 31 + DpSize.hashCode-impl(this.minSize);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "IconButtonMetrics(cornerSize=" + this.cornerSize + ", borderWidth=" + Dp.toString-impl(this.borderWidth) + ", padding=" + this.padding + ", minSize=" + DpSize.toString-impl(this.minSize) + ")";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics$Companion;", "", "<init>", "()V", "ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\IconButtonMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */