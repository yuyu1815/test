/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.foundation.TooltipPlacement;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\021\b\007\030\000 \0342\0020\001:\001\034B7\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\t\022\006\020\013\032\0020\f¢\006\004\b\r\020\016R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\017\020\020R\023\020\004\032\0020\005¢\006\n\n\002\020\023\032\004\b\021\020\022R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025R\023\020\b\032\0020\t¢\006\n\n\002\020\030\032\004\b\026\020\027R\023\020\n\032\0020\t¢\006\n\n\002\020\030\032\004\b\031\020\027R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\032\020\033¨\006\035"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TooltipMetrics;", "", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "showDelay", "Lkotlin/time/Duration;", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "shadowSize", "placement", "Landroidx/compose/foundation/TooltipPlacement;", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;JLandroidx/compose/foundation/shape/CornerSize;FFLandroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getShowDelay-UwyO8pc", "()J", "J", "getCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getBorderWidth-D9Ej5fM", "()F", "F", "getShadowSize-D9Ej5fM", "getPlacement", "()Landroidx/compose/foundation/TooltipPlacement;", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class TooltipMetrics {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final PaddingValues contentPadding;
/*    */   private final long showDelay;
/*    */   @NotNull
/*    */   private final CornerSize cornerSize;
/*    */   private final float borderWidth;
/*    */   private final float shadowSize;
/*    */   @NotNull
/*    */   private final TooltipPlacement placement;
/*    */   public static final int $stable;
/*    */   
/*    */   @NotNull
/*    */   public final PaddingValues getContentPadding() {
/*    */     return this.contentPadding;
/*    */   }
/*    */   
/*    */   public final long getShowDelay-UwyO8pc() {
/*    */     return this.showDelay;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CornerSize getCornerSize() {
/*    */     return this.cornerSize;
/*    */   }
/*    */   
/* 38 */   private TooltipMetrics(PaddingValues contentPadding, long showDelay, CornerSize cornerSize, float borderWidth, float shadowSize, TooltipPlacement placement) { this.contentPadding = contentPadding;
/* 39 */     this.showDelay = showDelay;
/* 40 */     this.cornerSize = cornerSize;
/* 41 */     this.borderWidth = borderWidth;
/* 42 */     this.shadowSize = shadowSize;
/* 43 */     this.placement = placement; } public final float getBorderWidth-D9Ej5fM() { return this.borderWidth; } public final float getShadowSize-D9Ej5fM() { return this.shadowSize; } @NotNull public final TooltipPlacement getPlacement() { return this.placement; }
/*    */   public boolean equals(@Nullable Object other) { if (this == other)
/*    */       return true;  if (!(other instanceof TooltipMetrics))
/*    */       return false;  TooltipMetrics tooltipMetrics = (TooltipMetrics)other; return !Intrinsics.areEqual(this.contentPadding, tooltipMetrics.contentPadding) ? false : (!Duration.equals-impl0(this.showDelay, tooltipMetrics.showDelay) ? false : (!Intrinsics.areEqual(this.cornerSize, tooltipMetrics.cornerSize) ? false : (!Dp.equals-impl0(this.borderWidth, tooltipMetrics.borderWidth) ? false : (!Dp.equals-impl0(this.shadowSize, tooltipMetrics.shadowSize) ? false : (!!Intrinsics.areEqual(this.placement, tooltipMetrics.placement)))))); } public int hashCode() { result = this.contentPadding.hashCode();
/*    */     result = result * 31 + Duration.hashCode-impl(this.showDelay);
/*    */     result = result * 31 + this.cornerSize.hashCode();
/*    */     result = result * 31 + Dp.hashCode-impl(this.borderWidth);
/*    */     result = result * 31 + Dp.hashCode-impl(this.shadowSize);
/*    */     return result * 31 + this.placement.hashCode(); } @NotNull public String toString() { return "TooltipMetrics(contentPadding=" + this.contentPadding + ", showDelay=" + Duration.toString-impl(this.showDelay) + ", cornerSize=" + this.cornerSize + ", borderWidth=" + Dp.toString-impl(this.borderWidth) + ", shadowSize=" + Dp.toString-impl(this.shadowSize) + ", placement=" + this.placement + ")"; } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003JI\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\r2\b\b\002\020\017\032\0020\020¢\006\004\b\021\020\022¨\006\023"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TooltipMetrics$Companion;", "", "<init>", "()V", "defaults", "Lorg/jetbrains/jewel/ui/component/styling/TooltipMetrics;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "showDelay", "Lkotlin/time/Duration;", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "shadowSize", "placement", "Landroidx/compose/foundation/TooltipPlacement;", "defaults-8qf-r9M", "(Landroidx/compose/foundation/layout/PaddingValues;JLandroidx/compose/foundation/shape/CornerSize;FFLandroidx/compose/foundation/TooltipPlacement;)Lorg/jetbrains/jewel/ui/component/styling/TooltipMetrics;", "ui"}) @SourceDebugExtension({"SMAP\nTooltipStyling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TooltipStyling.kt\norg/jetbrains/jewel/ui/component/styling/TooltipMetrics$Companion\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,60:1\n149#2:61\n149#2:62\n149#2:63\n149#2:64\n149#2:65\n*S KotlinDebug\n*F\n+ 1 TooltipStyling.kt\norg/jetbrains/jewel/ui/component/styling/TooltipMetrics$Companion\n*L\n47#1:61\n49#1:62\n50#1:63\n51#1:64\n52#1:65\n*E\n"}) public static final class Companion
/*    */   {
/* 53 */     @NotNull public final TooltipMetrics defaults-8qf-r9M(@NotNull PaddingValues contentPadding, long showDelay, @NotNull CornerSize cornerSize, float borderWidth, float shadowSize, @NotNull TooltipPlacement placement) { Intrinsics.checkNotNullParameter(contentPadding, "contentPadding"); Intrinsics.checkNotNullParameter(cornerSize, "cornerSize"); Intrinsics.checkNotNullParameter(placement, "placement"); return new TooltipMetrics(contentPadding, showDelay, cornerSize, borderWidth, shadowSize, placement, null); }
/*    */ 
/*    */     
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\TooltipMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */