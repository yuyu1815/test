/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import androidx.compose.ui.graphics.Brush;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import androidx.compose.ui.graphics.SolidColor;
/*    */ import com.intellij.ide.ui.laf.darcula.DarculaUIUtil;
/*    */ import com.intellij.util.ui.JBUI;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.SegmentedControlColors;
/*    */ import org.jetbrains.jewel.ui.component.styling.SegmentedControlStyle;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readSegmentedControlStyle", "Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlStyle;", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nIntUiBridgeSegmentedControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeSegmentedControl.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeSegmentedControlKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,40:1\n72#2:41\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeSegmentedControl.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeSegmentedControlKt\n*L\n35#1:41\n*E\n"})
/*    */ public final class IntUiBridgeSegmentedControlKt {
/*    */   @NotNull
/*    */   public static final SegmentedControlStyle readSegmentedControlStyle() {
/* 17 */     Color[] arrayOfColor = new Color[2]; Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.buttonOutlineColorStart(false), "buttonOutlineColorStart(...)"); arrayOfColor[0] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.buttonOutlineColorStart(false)));
/* 18 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.buttonOutlineColorEnd(false), "buttonOutlineColorEnd(...)"); arrayOfColor[1] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.buttonOutlineColorEnd(false)));
/*    */     
/* 20 */     Brush normalBorder = BridgeUtilsKt.createVerticalBrush-8A-3gB4$default(CollectionsKt.listOf((Object[])arrayOfColor), 0.0F, 0.0F, 0, 7, null);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.disabledOutlineColor(), "disabledOutlineColor(...)");
/*    */ 
/*    */     
/* 28 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.focusBorderColor(false), "focusBorderColor(...)"); SegmentedControlColors colors = new SegmentedControlColors(normalBorder, (Brush)new SolidColor(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.disabledOutlineColor()), null), normalBorder, normalBorder, (Brush)new SolidColor(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.focusBorderColor(false)), null));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 35 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.BUTTON_ARC, "BUTTON_ARC"); float f = BridgeUtilsKt.getDp(DarculaUIUtil.BUTTON_ARC); int other$iv = 2, $i$f$div-u2uoSUM = 0;
/* 36 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.LW, "LW");
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     return new SegmentedControlStyle(colors, new SegmentedControlMetrics(CornerSizeKt.CornerSize-0680j_4(Dp.constructor-impl(f / other$iv)), BridgeUtilsKt.getDp(DarculaUIUtil.LW), null));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeSegmentedControlKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */