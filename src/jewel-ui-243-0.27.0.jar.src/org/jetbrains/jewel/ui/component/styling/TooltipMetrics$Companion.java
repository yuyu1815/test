/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.foundation.TooltipPlacement;
/*    */ import androidx.compose.foundation.layout.PaddingKt;
/*    */ import androidx.compose.foundation.layout.PaddingValues;
/*    */ import androidx.compose.foundation.shape.CornerSize;
/*    */ import androidx.compose.foundation.shape.CornerSizeKt;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import androidx.compose.ui.unit.DpKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.time.DurationKt;
/*    */ import kotlin.time.DurationUnit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.component.FixedCursorPoint;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003JI\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\r2\b\b\002\020\017\032\0020\020¢\006\004\b\021\020\022¨\006\023"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TooltipMetrics$Companion;", "", "<init>", "()V", "defaults", "Lorg/jetbrains/jewel/ui/component/styling/TooltipMetrics;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "showDelay", "Lkotlin/time/Duration;", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "shadowSize", "placement", "Landroidx/compose/foundation/TooltipPlacement;", "defaults-8qf-r9M", "(Landroidx/compose/foundation/layout/PaddingValues;JLandroidx/compose/foundation/shape/CornerSize;FFLandroidx/compose/foundation/TooltipPlacement;)Lorg/jetbrains/jewel/ui/component/styling/TooltipMetrics;", "ui"})
/*    */ @SourceDebugExtension({"SMAP\nTooltipStyling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TooltipStyling.kt\norg/jetbrains/jewel/ui/component/styling/TooltipMetrics$Companion\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,60:1\n149#2:61\n149#2:62\n149#2:63\n149#2:64\n149#2:65\n*S KotlinDebug\n*F\n+ 1 TooltipStyling.kt\norg/jetbrains/jewel/ui/component/styling/TooltipMetrics$Companion\n*L\n47#1:61\n49#1:62\n50#1:63\n51#1:64\n52#1:65\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final TooltipMetrics defaults-8qf-r9M(@NotNull PaddingValues contentPadding, long showDelay, @NotNull CornerSize cornerSize, float borderWidth, float shadowSize, @NotNull TooltipPlacement placement) {
/* 53 */     Intrinsics.checkNotNullParameter(contentPadding, "contentPadding"); Intrinsics.checkNotNullParameter(cornerSize, "cornerSize"); Intrinsics.checkNotNullParameter(placement, "placement"); return new TooltipMetrics(contentPadding, showDelay, cornerSize, borderWidth, shadowSize, placement, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\TooltipMetrics$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */