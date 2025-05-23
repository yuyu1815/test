/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.foundation.shape.CornerSize;
/*    */ import androidx.compose.runtime.Immutable;
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
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\013\b\007\030\000 \0172\0020\001:\001\017B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\023\020\004\032\0020\005¢\006\n\n\002\020\r\032\004\b\013\020\fR\023\020\006\032\0020\005¢\006\n\n\002\020\r\032\004\b\016\020\f¨\006\020"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarMetrics;", "", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "minHeight", "Landroidx/compose/ui/unit/Dp;", "indeterminateHighlightWidth", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getMinHeight-D9Ej5fM", "()F", "F", "getIndeterminateHighlightWidth-D9Ej5fM", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class HorizontalProgressBarMetrics
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final CornerSize cornerSize;
/*    */   private final float minHeight;
/*    */   private final float indeterminateHighlightWidth;
/*    */   public static final int $stable;
/*    */   
/*    */   private HorizontalProgressBarMetrics(CornerSize cornerSize, float minHeight, float indeterminateHighlightWidth) {
/* 36 */     this.cornerSize = cornerSize;
/* 37 */     this.minHeight = minHeight;
/* 38 */     this.indeterminateHighlightWidth = indeterminateHighlightWidth; } public final float getIndeterminateHighlightWidth-D9Ej5fM() { return this.indeterminateHighlightWidth; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final CornerSize getCornerSize() {
/*    */     return this.cornerSize;
/*    */   }
/*    */   
/*    */   public final float getMinHeight-D9Ej5fM() {
/*    */     return this.minHeight;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof HorizontalProgressBarMetrics))
/*    */       return false; 
/*    */     HorizontalProgressBarMetrics horizontalProgressBarMetrics = (HorizontalProgressBarMetrics)other;
/*    */     return !Intrinsics.areEqual(this.cornerSize, horizontalProgressBarMetrics.cornerSize) ? false : (!Dp.equals-impl0(this.minHeight, horizontalProgressBarMetrics.minHeight) ? false : (!!Dp.equals-impl0(this.indeterminateHighlightWidth, horizontalProgressBarMetrics.indeterminateHighlightWidth)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.cornerSize.hashCode();
/*    */     result = result * 31 + Dp.hashCode-impl(this.minHeight);
/*    */     return result * 31 + Dp.hashCode-impl(this.indeterminateHighlightWidth);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "HorizontalProgressBarMetrics(cornerSize=" + this.cornerSize + ", minHeight=" + Dp.toString-impl(this.minHeight) + ", indeterminateHighlightWidth=" + Dp.toString-impl(this.indeterminateHighlightWidth) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\HorizontalProgressBarMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */