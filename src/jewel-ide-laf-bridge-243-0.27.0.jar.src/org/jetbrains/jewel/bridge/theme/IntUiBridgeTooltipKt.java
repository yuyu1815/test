/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import androidx.compose.foundation.shape.CornerSizeKt;
/*    */ import com.intellij.openapi.util.registry.Registry;
/*    */ import com.intellij.util.ui.JBUI;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.time.DurationKt;
/*    */ import kotlin.time.DurationUnit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.TooltipColors;
/*    */ import org.jetbrains.jewel.ui.component.styling.TooltipMetrics;
/*    */ import org.jetbrains.jewel.ui.component.styling.TooltipStyle;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readTooltipStyle", "Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;", "ide-laf-bridge"})
/*    */ public final class IntUiBridgeTooltipKt {
/*    */   @NotNull
/*    */   public static final TooltipStyle readTooltipStyle() {
/* 19 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.HelpTooltip.smallTextBorderInsets(), "smallTextBorderInsets(...)");
/*    */     
/* 21 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Tooltip.CORNER_RADIUS, "CORNER_RADIUS"); TooltipMetrics tooltipMetrics = TooltipMetrics.Companion.defaults-8qf-r9M$default(TooltipMetrics.Companion, BridgeUtilsKt.toPaddingValues(JBUI.CurrentTheme.HelpTooltip.smallTextBorderInsets()), DurationKt.toDuration(Registry.Companion.intValue("ide.tooltip.initialDelay"), DurationUnit.MILLISECONDS), CornerSizeKt.CornerSize-0680j_4(BridgeUtilsKt.getDp(JBUI.CurrentTheme.Tooltip.CORNER_RADIUS)), 0.0F, 0.0F, null, 56, null);
/*    */ 
/*    */ 
/*    */     
/* 25 */     long l1 = BridgeUtilsKt.retrieveColorOrUnspecified("ToolTip.foreground");
/* 26 */     long l2 = BridgeUtilsKt.retrieveColorOrUnspecified("ToolTip.background");
/* 27 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Tooltip.borderColor(), "borderColor(...)"); long l3 = BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Tooltip.borderColor());
/* 28 */     long l4 = BridgeUtilsKt.retrieveColorOrUnspecified("Notification.Shadow.bottom1Color"); TooltipColors tooltipColors = new TooltipColors(l2, l1, l3, l4, null);
/*    */     return new TooltipStyle(tooltipColors, tooltipMetrics);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeTooltipKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */