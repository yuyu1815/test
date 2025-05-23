/*     */ package org.jetbrains.jewel.bridge.theme;
/*     */ 
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.shape.CornerSizeKt;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.SolidColor;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.DpKt;
/*     */ import androidx.compose.ui.unit.DpSize;
/*     */ import com.intellij.ide.ui.laf.darcula.DarculaUIUtil;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*     */ import org.jetbrains.jewel.foundation.Stroke;
/*     */ import org.jetbrains.jewel.ui.component.styling.ButtonColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.ButtonMetrics;
/*     */ import org.jetbrains.jewel.ui.component.styling.ButtonStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.IconButtonColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.IconButtonMetrics;
/*     */ import org.jetbrains.jewel.ui.component.styling.IconButtonStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonMetrics;
/*     */ import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonStyle;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000\032\b\020\002\032\0020\001H\000\032\b\020\003\032\0020\004H\000\032\b\020\005\032\0020\006H\000¨\006\007"}, d2 = {"readDefaultButtonStyle", "Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;", "readOutlinedButtonStyle", "readSegmentedControlButtonStyle", "Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;", "readIconButtonStyle", "Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;", "ide-laf-bridge"})
/*     */ @SourceDebugExtension({"SMAP\nIntUiBridgeButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeButton.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,205:1\n149#2:206\n149#2:207\n159#2:208\n149#2:210\n149#2:212\n149#2:214\n149#2:215\n149#2:216\n72#3:209\n72#3:211\n72#3:213\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeButton.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeButtonKt\n*L\n71#1:206\n73#1:207\n74#1:208\n122#1:210\n170#1:212\n182#1:214\n183#1:215\n184#1:216\n121#1:209\n169#1:211\n181#1:213\n*E\n"})
/*     */ public final class IntUiBridgeButtonKt {
/*     */   @NotNull
/*  32 */   public static final ButtonStyle readDefaultButtonStyle() { Color[] arrayOfColor1 = new Color[2]; Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.defaultButtonColorStart(), "defaultButtonColorStart(...)"); arrayOfColor1[0] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.defaultButtonColorStart()));
/*  33 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.defaultButtonColorEnd(), "defaultButtonColorEnd(...)"); arrayOfColor1[1] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.defaultButtonColorEnd()));
/*     */     
/*  35 */     Brush normalBackground = BridgeUtilsKt.createVerticalBrush-8A-3gB4$default(CollectionsKt.listOf((Object[])arrayOfColor1), 0.0F, 0.0F, 0, 7, null);
/*     */     
/*  37 */     long normalContent = BridgeUtilsKt.retrieveColorOrUnspecified("Button.default.foreground");
/*     */ 
/*     */ 
/*     */     
/*  41 */     Color[] arrayOfColor2 = new Color[2]; Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.buttonOutlineColorStart(true), "buttonOutlineColorStart(...)"); arrayOfColor2[0] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.buttonOutlineColorStart(true)));
/*  42 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.buttonOutlineColorEnd(true), "buttonOutlineColorEnd(...)"); arrayOfColor2[1] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.buttonOutlineColorEnd(true)));
/*     */     
/*  44 */     Brush normalBorder = BridgeUtilsKt.createVerticalBrush-8A-3gB4$default(CollectionsKt.listOf((Object[])arrayOfColor2), 0.0F, 0.0F, 0, 7, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  59 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.disabledOutlineColor(), "disabledOutlineColor(...)"); ButtonColors colors = new ButtonColors(normalBackground, (Brush)new SolidColor(Color.Companion.getTransparent-0d7_KjU(), null), normalBackground, normalBackground, normalBackground, normalContent, BridgeUtilsKt.retrieveColorOrUnspecified("Button.disabledText"), normalContent, normalContent, normalContent, normalBorder, (Brush)new SolidColor(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.disabledOutlineColor()), null), 
/*  60 */         (Brush)new SolidColor(BridgeUtilsKt.retrieveColorOrUnspecified("Button.default.focusedBorderColor"), null), 
/*  61 */         normalBorder, 
/*  62 */         normalBorder, null);
/*     */ 
/*     */     
/*  65 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.minimumSize(), "minimumSize(...)"); long minimumSize = BridgeUtilsKt.toDpSize(JBUI.CurrentTheme.Button.minimumSize());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  70 */     String[] arrayOfString = new String[2]; arrayOfString[0] = "Button.default.arc"; arrayOfString[1] = "Button.arc";
/*  71 */     int i = 14, $i$f$getDp = 0;
/*     */     
/*  73 */     i = 1; $i$f$getDp = 0;
/*  74 */     double $this$dp$iv = 1.5D; int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 206 */     return new ButtonStyle(colors, new ButtonMetrics(BridgeUtilsKt.retrieveArcAsCornerSizeWithFallbacks(arrayOfString), PaddingKt.PaddingValues-YgX7TsA$default(Dp.constructor-impl(i), 0.0F, 2, null), DpKt.DpSize-YgX7TsA(DpSize.getWidth-D9Ej5fM(minimumSize), DpSize.getHeight-D9Ej5fM(minimumSize)), 
/* 207 */           Dp.constructor-impl(i), 
/* 208 */           Dp.constructor-impl((float)$this$dp$iv), null), Stroke.Alignment.Center); } @NotNull public static final ButtonStyle readOutlinedButtonStyle() { Color[] arrayOfColor1 = new Color[2]; Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.buttonColorStart(), "buttonColorStart(...)"); arrayOfColor1[0] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.buttonColorStart())); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.buttonColorEnd(), "buttonColorEnd(...)"); arrayOfColor1[1] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.buttonColorEnd())); Brush normalBackground = BridgeUtilsKt.createVerticalBrush-8A-3gB4$default(CollectionsKt.listOf((Object[])arrayOfColor1), 0.0F, 0.0F, 0, 7, null); long normalContent = BridgeUtilsKt.retrieveColorOrUnspecified("Button.foreground"); Color[] arrayOfColor2 = new Color[2]; Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.buttonOutlineColorStart(false), "buttonOutlineColorStart(...)"); arrayOfColor2[0] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.buttonOutlineColorStart(false))); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.buttonOutlineColorEnd(false), "buttonOutlineColorEnd(...)"); arrayOfColor2[1] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.buttonOutlineColorEnd(false))); Brush normalBorder = BridgeUtilsKt.createVerticalBrush-8A-3gB4$default(CollectionsKt.listOf((Object[])arrayOfColor2), 0.0F, 0.0F, 0, 7, null); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.disabledOutlineColor(), "disabledOutlineColor(...)"); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.focusBorderColor(false), "focusBorderColor(...)"); ButtonColors colors = new ButtonColors(normalBackground, (Brush)new SolidColor(Color.Companion.getTransparent-0d7_KjU(), null), normalBackground, normalBackground, normalBackground, normalContent, BridgeUtilsKt.retrieveColorOrUnspecified("Button.disabledText"), normalContent, normalContent, normalContent, normalBorder, (Brush)new SolidColor(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.disabledOutlineColor()), null), (Brush)new SolidColor(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.focusBorderColor(false)), null), normalBorder, normalBorder, null); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.minimumSize(), "minimumSize(...)"); long minimumSize = BridgeUtilsKt.toDpSize(JBUI.CurrentTheme.Button.minimumSize()); Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.BUTTON_ARC, "BUTTON_ARC"); float f = BridgeUtilsKt.getDp(DarculaUIUtil.BUTTON_ARC); int other$iv = 2, $i$f$div-u2uoSUM = 0; int $this$dp$iv = 14, $i$f$getDp = 0; Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.LW, "LW");
/* 209 */     return new ButtonStyle(colors, new ButtonMetrics(CornerSizeKt.CornerSize-0680j_4(Dp.constructor-impl(f / other$iv)), PaddingKt.PaddingValues-YgX7TsA$default(
/* 210 */             Dp.constructor-impl($this$dp$iv), 0.0F, 2, null), DpKt.DpSize-YgX7TsA(DpSize.getWidth-D9Ej5fM(minimumSize), DpSize.getHeight-D9Ej5fM(minimumSize)), BridgeUtilsKt.getDp(DarculaUIUtil.LW), Dp.Companion.getUnspecified-D9Ej5fM(), null), Stroke.Alignment.Center); } @NotNull public static final SegmentedControlButtonStyle readSegmentedControlButtonStyle() { Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.SegmentedButton.SELECTED_BUTTON_COLOR, "SELECTED_BUTTON_COLOR"); SolidColor selectedBackground = new SolidColor(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.SegmentedButton.SELECTED_BUTTON_COLOR), null); Color[] arrayOfColor1 = new Color[2]; Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.SegmentedButton.SELECTED_START_BORDER_COLOR, "SELECTED_START_BORDER_COLOR"); arrayOfColor1[0] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.SegmentedButton.SELECTED_START_BORDER_COLOR)); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.SegmentedButton.SELECTED_END_BORDER_COLOR, "SELECTED_END_BORDER_COLOR"); arrayOfColor1[1] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.SegmentedButton.SELECTED_END_BORDER_COLOR)); Brush normalBorder = BridgeUtilsKt.createVerticalBrush-8A-3gB4$default(CollectionsKt.listOf((Object[])arrayOfColor1), 0.0F, 0.0F, 0, 7, null); Color[] arrayOfColor2 = new Color[2]; Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.buttonOutlineColorStart(false), "buttonOutlineColorStart(...)"); arrayOfColor2[0] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.buttonOutlineColorStart(false))); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.buttonOutlineColorEnd(false), "buttonOutlineColorEnd(...)"); arrayOfColor2[1] = Color.box-impl(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.buttonOutlineColorEnd(false))); Brush selectedDisabledBorder = BridgeUtilsKt.createVerticalBrush-8A-3gB4$default(CollectionsKt.listOf((Object[])arrayOfColor2), 0.0F, 0.0F, 0, 7, null); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.ActionButton.hoverBackground(), "hoverBackground(...)"); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.SegmentedButton.FOCUSED_SELECTED_BUTTON_COLOR, "FOCUSED_SELECTED_BUTTON_COLOR"); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.focusBorderColor(false), "focusBorderColor(...)"); SegmentedControlButtonColors colors = new SegmentedControlButtonColors((Brush)new SolidColor(Color.Companion.getTransparent-0d7_KjU(), null), (Brush)selectedBackground, (Brush)new SolidColor(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.ActionButton.hoverBackground()), null), (Brush)selectedBackground, (Brush)new SolidColor(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.SegmentedButton.FOCUSED_SELECTED_BUTTON_COLOR), null), BridgeUtilsKt.retrieveColorOrUnspecified("Button.foreground"), BridgeUtilsKt.retrieveColorOrUnspecified("Label.disabledForeground"), normalBorder, normalBorder, selectedDisabledBorder, (Brush)new SolidColor(BridgeUtilsKt.toComposeColor(JBUI.CurrentTheme.Button.focusBorderColor(false)), null), null); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.minimumSize(), "minimumSize(...)"); long minimumSize = BridgeUtilsKt.toDpSize(JBUI.CurrentTheme.Button.minimumSize()); Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.BUTTON_ARC, "BUTTON_ARC"); float f = BridgeUtilsKt.getDp(DarculaUIUtil.BUTTON_ARC); int other$iv = 2, $i$f$div-u2uoSUM = 0; int $this$dp$iv = 14, $i$f$getDp = 0; Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.LW, "LW");
/* 211 */     return new SegmentedControlButtonStyle(colors, new SegmentedControlButtonMetrics(CornerSizeKt.CornerSize-0680j_4(Dp.constructor-impl(f / other$iv)), PaddingKt.PaddingValues-YgX7TsA$default(
/* 212 */             Dp.constructor-impl($this$dp$iv), 0.0F, 2, null), DpKt.DpSize-YgX7TsA(DpSize.getWidth-D9Ej5fM(minimumSize), DpSize.getHeight-D9Ej5fM(minimumSize)), BridgeUtilsKt.getDp(DarculaUIUtil.LW), null)); } @NotNull public static final IconButtonStyle readIconButtonStyle() { Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.BUTTON_ARC, "BUTTON_ARC"); float f = BridgeUtilsKt.getDp(DarculaUIUtil.BUTTON_ARC); int other$iv = 2, $i$f$div-u2uoSUM = 0; int $this$dp$iv = 1, $i$f$getDp = 0; $this$dp$iv = 0; $i$f$getDp = 0; $this$dp$iv = 24; $i$f$getDp = 0; $this$dp$iv = 24; $i$f$getDp = 0;
/* 213 */     IconButtonMetrics iconButtonMetrics = new IconButtonMetrics(CornerSizeKt.CornerSize-0680j_4(Dp.constructor-impl(f / other$iv)), 
/* 214 */         Dp.constructor-impl($this$dp$iv), PaddingKt.PaddingValues-0680j_4(
/* 215 */           Dp.constructor-impl($this$dp$iv)), DpKt.DpSize-YgX7TsA(
/* 216 */           Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv)), null);
/*     */     long l1 = BridgeUtilsKt.retrieveColorOrUnspecified("ToolWindow.Button.selectedForeground");
/*     */     long l2 = Color.Companion.getUnspecified-0d7_KjU();
/*     */     long l3 = Color.Companion.getUnspecified-0d7_KjU();
/*     */     long l4 = BridgeUtilsKt.retrieveColorOrUnspecified("ActionButton.pressedBackground");
/*     */     long l5 = BridgeUtilsKt.retrieveColorOrUnspecified("ToolWindow.Button.selectedBackground");
/*     */     long l6 = BridgeUtilsKt.retrieveColorOrUnspecified("ActionButton.pressedBackground");
/*     */     long l7 = BridgeUtilsKt.retrieveColorOrUnspecified("ActionButton.hoverBackground");
/*     */     long l8 = BridgeUtilsKt.retrieveColorOrUnspecified("ActionButton.hoverBackground");
/*     */     long l9 = Color.Companion.getUnspecified-0d7_KjU();
/*     */     long l10 = Color.Companion.getUnspecified-0d7_KjU();
/*     */     long l11 = BridgeUtilsKt.retrieveColorOrUnspecified("ActionButton.pressedBackground");
/*     */     long l12 = BridgeUtilsKt.retrieveColorOrUnspecified("ToolWindow.Button.selectedBackground");
/*     */     long l13 = Color.Companion.getUnspecified-0d7_KjU();
/*     */     long l14 = BridgeUtilsKt.retrieveColorOrUnspecified("ActionButton.pressedBorderColor");
/*     */     long l15 = BridgeUtilsKt.retrieveColorOrUnspecified("ActionButton.hoverBorderColor");
/*     */     IconButtonColors iconButtonColors = new IconButtonColors(l1, l2, l3, l4, l5, l8, l6, l7, l9, l10, l11, l12, l13, l14, l15, null);
/*     */     return new IconButtonStyle(iconButtonColors, iconButtonMetrics); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeButtonKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */