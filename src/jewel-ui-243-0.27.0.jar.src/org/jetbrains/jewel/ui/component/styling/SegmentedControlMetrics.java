/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.foundation.shape.CornerSize;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.unit.Dp;
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
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\b\007\030\000 \r2\0020\001:\001\rB\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\0020\005¢\006\n\n\002\020\f\032\004\b\n\020\013¨\006\016"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlMetrics;", "", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getBorderWidth-D9Ej5fM", "()F", "F", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class SegmentedControlMetrics
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final CornerSize cornerSize;
/*    */   private final float borderWidth;
/*    */   public static final int $stable;
/*    */   
/*    */   private SegmentedControlMetrics(CornerSize cornerSize, float borderWidth) {
/* 55 */     this.cornerSize = cornerSize; this.borderWidth = borderWidth; } @NotNull public final CornerSize getCornerSize() { return this.cornerSize; } public final float getBorderWidth-D9Ej5fM() { return this.borderWidth; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SegmentedControlMetrics))
/*    */       return false; 
/*    */     SegmentedControlMetrics segmentedControlMetrics = (SegmentedControlMetrics)other;
/*    */     return !Intrinsics.areEqual(this.cornerSize, segmentedControlMetrics.cornerSize) ? false : (!!Dp.equals-impl0(this.borderWidth, segmentedControlMetrics.borderWidth));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.cornerSize.hashCode();
/*    */     return result * 31 + Dp.hashCode-impl(this.borderWidth);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SegmentedControlMetrics(cornerSize=" + this.cornerSize + ", borderWidth=" + Dp.toString-impl(this.borderWidth) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\SegmentedControlMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */