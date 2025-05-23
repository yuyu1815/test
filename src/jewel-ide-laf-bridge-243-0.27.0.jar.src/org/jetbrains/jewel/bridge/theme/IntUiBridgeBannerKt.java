/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ 
/*    */ import com.intellij.ide.ui.laf.darcula.DarculaUIUtil;
/*    */ import com.intellij.util.ui.JBUI;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.BannerColors;
/*    */ import org.jetbrains.jewel.ui.component.styling.BannerMetrics;
/*    */ import org.jetbrains.jewel.ui.component.styling.DefaultBannerStyle;
/*    */ import org.jetbrains.jewel.ui.component.styling.DefaultBannerStyles;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readDefaultBannerStyle", "Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyles;", "ide-laf-bridge"})
/*    */ public final class IntUiBridgeBannerKt {
/*    */   @NotNull
/*    */   public static final DefaultBannerStyles readDefaultBannerStyle() {
/* 18 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Banner.INFO_BACKGROUND, "INFO_BACKGROUND");
/* 19 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Banner.INFO_BORDER_COLOR, "INFO_BORDER_COLOR");
/*    */     
/* 21 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.LW, "LW");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 27 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Banner.SUCCESS_BACKGROUND, "SUCCESS_BACKGROUND");
/* 28 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Banner.SUCCESS_BORDER_COLOR, "SUCCESS_BORDER_COLOR");
/*    */     
/* 30 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.LW, "LW");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 36 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Banner.WARNING_BACKGROUND, "WARNING_BACKGROUND");
/* 37 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Banner.WARNING_BORDER_COLOR, "WARNING_BORDER_COLOR");
/*    */     
/* 39 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.LW, "LW");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 45 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Banner.ERROR_BACKGROUND, "ERROR_BACKGROUND");
/* 46 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Banner.ERROR_BORDER_COLOR, "ERROR_BORDER_COLOR");
/*    */     
/* 48 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.LW, "LW"); return new DefaultBannerStyles(new DefaultBannerStyle(new BannerColors(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Banner.INFO_BACKGROUND), BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Banner.INFO_BORDER_COLOR), null), new BannerMetrics(BridgeUtilsKt.getDp(DarculaUIUtil.LW), null)), new DefaultBannerStyle(new BannerColors(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Banner.SUCCESS_BACKGROUND), BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Banner.SUCCESS_BORDER_COLOR), null), new BannerMetrics(BridgeUtilsKt.getDp(DarculaUIUtil.LW), null)), new DefaultBannerStyle(new BannerColors(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Banner.WARNING_BACKGROUND), BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Banner.WARNING_BORDER_COLOR), null), new BannerMetrics(BridgeUtilsKt.getDp(DarculaUIUtil.LW), null)), new DefaultBannerStyle(new BannerColors(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Banner.ERROR_BACKGROUND), BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Banner.ERROR_BORDER_COLOR), null), new BannerMetrics(BridgeUtilsKt.getDp(DarculaUIUtil.LW), null)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeBannerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */