/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.foundation.layout.PaddingValues;
/*    */ import androidx.compose.foundation.shape.CornerSize;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import androidx.compose.ui.unit.DpOffset;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\021\b\007\030\000 \0322\0020\001:\001\032B7\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\n¢\006\004\b\f\020\rR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\022\020\021R\023\020\007\032\0020\b¢\006\n\n\002\020\025\032\004\b\023\020\024R\023\020\t\032\0020\n¢\006\n\n\002\020\030\032\004\b\026\020\027R\023\020\013\032\0020\n¢\006\n\n\002\020\030\032\004\b\031\020\027¨\006\033"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/PopupContainerMetrics;", "", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "menuMargin", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "offset", "Landroidx/compose/ui/unit/DpOffset;", "shadowSize", "Landroidx/compose/ui/unit/Dp;", "borderWidth", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;JFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getMenuMargin", "()Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "getOffset-RKDOV3M", "()J", "J", "getShadowSize-D9Ej5fM", "()F", "F", "getBorderWidth-D9Ej5fM", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class PopupContainerMetrics {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final CornerSize cornerSize;
/*    */   @NotNull
/*    */   private final PaddingValues menuMargin;
/*    */   @NotNull
/*    */   private final PaddingValues contentPadding;
/*    */   private final long offset;
/*    */   private final float shadowSize;
/*    */   private final float borderWidth;
/*    */   public static final int $stable;
/*    */   
/*    */   private PopupContainerMetrics(CornerSize cornerSize, PaddingValues menuMargin, PaddingValues contentPadding, long offset, float shadowSize, float borderWidth) {
/* 33 */     this.cornerSize = cornerSize;
/* 34 */     this.menuMargin = menuMargin;
/* 35 */     this.contentPadding = contentPadding;
/* 36 */     this.offset = offset;
/* 37 */     this.shadowSize = shadowSize;
/* 38 */     this.borderWidth = borderWidth; } public final float getBorderWidth-D9Ej5fM() { return this.borderWidth; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final CornerSize getCornerSize() {
/*    */     return this.cornerSize;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PaddingValues getMenuMargin() {
/*    */     return this.menuMargin;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PaddingValues getContentPadding() {
/*    */     return this.contentPadding;
/*    */   }
/*    */   
/*    */   public final long getOffset-RKDOV3M() {
/*    */     return this.offset;
/*    */   }
/*    */   
/*    */   public final float getShadowSize-D9Ej5fM() {
/*    */     return this.shadowSize;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof PopupContainerMetrics))
/*    */       return false; 
/*    */     PopupContainerMetrics popupContainerMetrics = (PopupContainerMetrics)other;
/*    */     return !Intrinsics.areEqual(this.cornerSize, popupContainerMetrics.cornerSize) ? false : (!Intrinsics.areEqual(this.menuMargin, popupContainerMetrics.menuMargin) ? false : (!Intrinsics.areEqual(this.contentPadding, popupContainerMetrics.contentPadding) ? false : (!DpOffset.equals-impl0(this.offset, popupContainerMetrics.offset) ? false : (!Dp.equals-impl0(this.shadowSize, popupContainerMetrics.shadowSize) ? false : (!!Dp.equals-impl0(this.borderWidth, popupContainerMetrics.borderWidth))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.cornerSize.hashCode();
/*    */     result = result * 31 + this.menuMargin.hashCode();
/*    */     result = result * 31 + this.contentPadding.hashCode();
/*    */     result = result * 31 + DpOffset.hashCode-impl(this.offset);
/*    */     result = result * 31 + Dp.hashCode-impl(this.shadowSize);
/*    */     return result * 31 + Dp.hashCode-impl(this.borderWidth);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "PopupContainerMetrics(cornerSize=" + this.cornerSize + ", menuMargin=" + this.menuMargin + ", contentPadding=" + this.contentPadding + ", offset=" + DpOffset.toString-impl(this.offset) + ", shadowSize=" + Dp.toString-impl(this.shadowSize) + ", borderWidth=" + Dp.toString-impl(this.borderWidth) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/PopupContainerMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\PopupContainerMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */