/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.foundation.layout.PaddingValues;
/*    */ import androidx.compose.foundation.shape.CornerSize;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import androidx.compose.ui.unit.DpSize;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\016\b\007\030\000 \0262\0020\001:\001\026B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\023\020\006\032\0020\007¢\006\n\n\002\020\022\032\004\b\020\020\021R\023\020\b\032\0020\t¢\006\n\n\002\020\025\032\004\b\023\020\024¨\006\027"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonMetrics;", "", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "segmentedButtonPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "minSize", "Landroidx/compose/ui/unit/DpSize;", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;JFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getSegmentedButtonPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getMinSize-MYxV2XQ", "()J", "J", "getBorderWidth-D9Ej5fM", "()F", "F", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class SegmentedControlButtonMetrics
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final CornerSize cornerSize;
/*    */   @NotNull
/*    */   private final PaddingValues segmentedButtonPadding;
/*    */   private final long minSize;
/*    */   private final float borderWidth;
/*    */   public static final int $stable;
/*    */   
/*    */   private SegmentedControlButtonMetrics(CornerSize cornerSize, PaddingValues segmentedButtonPadding, long minSize, float borderWidth) {
/* 84 */     this.cornerSize = cornerSize;
/* 85 */     this.segmentedButtonPadding = segmentedButtonPadding;
/* 86 */     this.minSize = minSize;
/* 87 */     this.borderWidth = borderWidth; } public final float getBorderWidth-D9Ej5fM() { return this.borderWidth; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final CornerSize getCornerSize() {
/*    */     return this.cornerSize;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PaddingValues getSegmentedButtonPadding() {
/*    */     return this.segmentedButtonPadding;
/*    */   }
/*    */   
/*    */   public final long getMinSize-MYxV2XQ() {
/*    */     return this.minSize;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SegmentedControlButtonMetrics))
/*    */       return false; 
/*    */     SegmentedControlButtonMetrics segmentedControlButtonMetrics = (SegmentedControlButtonMetrics)other;
/*    */     return !Intrinsics.areEqual(this.cornerSize, segmentedControlButtonMetrics.cornerSize) ? false : (!Intrinsics.areEqual(this.segmentedButtonPadding, segmentedControlButtonMetrics.segmentedButtonPadding) ? false : (!DpSize.equals-impl0(this.minSize, segmentedControlButtonMetrics.minSize) ? false : (!!Dp.equals-impl0(this.borderWidth, segmentedControlButtonMetrics.borderWidth))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.cornerSize.hashCode();
/*    */     result = result * 31 + this.segmentedButtonPadding.hashCode();
/*    */     result = result * 31 + DpSize.hashCode-impl(this.minSize);
/*    */     return result * 31 + Dp.hashCode-impl(this.borderWidth);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SegmentedControlButtonMetrics(cornerSize=" + this.cornerSize + ", segmentedButtonPadding=" + this.segmentedButtonPadding + ", minSize=" + DpSize.toString-impl(this.minSize) + ", borderWidth=" + Dp.toString-impl(this.borderWidth) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\SegmentedControlButtonMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */