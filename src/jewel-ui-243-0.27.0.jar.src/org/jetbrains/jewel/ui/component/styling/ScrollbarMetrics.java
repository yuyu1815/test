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
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\b\007\030\000 \r2\0020\001:\001\rB\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\0020\005¢\006\n\n\002\020\f\032\004\b\n\020\013¨\006\016"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ScrollbarMetrics;", "", "thumbCornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "minThumbLength", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getThumbCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getMinThumbLength-D9Ej5fM", "()F", "F", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class ScrollbarMetrics
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final CornerSize thumbCornerSize;
/*    */   private final float minThumbLength;
/*    */   public static final int $stable;
/*    */   
/*    */   private ScrollbarMetrics(CornerSize thumbCornerSize, float minThumbLength) {
/* 47 */     this.thumbCornerSize = thumbCornerSize; this.minThumbLength = minThumbLength; } @NotNull public final CornerSize getThumbCornerSize() { return this.thumbCornerSize; } public final float getMinThumbLength-D9Ej5fM() { return this.minThumbLength; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ScrollbarMetrics))
/*    */       return false; 
/*    */     ScrollbarMetrics scrollbarMetrics = (ScrollbarMetrics)other;
/*    */     return !Intrinsics.areEqual(this.thumbCornerSize, scrollbarMetrics.thumbCornerSize) ? false : (!!Dp.equals-impl0(this.minThumbLength, scrollbarMetrics.minThumbLength));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.thumbCornerSize.hashCode();
/*    */     return result * 31 + Dp.hashCode-impl(this.minThumbLength);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ScrollbarMetrics(thumbCornerSize=" + this.thumbCornerSize + ", minThumbLength=" + Dp.toString-impl(this.minThumbLength) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ScrollbarMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\ScrollbarMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */