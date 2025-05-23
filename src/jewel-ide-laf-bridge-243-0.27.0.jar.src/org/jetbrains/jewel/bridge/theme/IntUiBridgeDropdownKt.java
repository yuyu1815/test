/*     */ package org.jetbrains.jewel.bridge.theme;
/*     */ 
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.DpKt;
/*     */ import androidx.compose.ui.unit.DpSize;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.DropdownColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.DropdownIcons;
/*     */ import org.jetbrains.jewel.ui.component.styling.DropdownMetrics;
/*     */ import org.jetbrains.jewel.ui.component.styling.DropdownStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuStyle;
/*     */ import org.jetbrains.jewel.ui.icons.AllIconsKeys;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\000\032\020\020\004\032\0020\0012\006\020\002\032\0020\003H\000¨\006\005"}, d2 = {"readDefaultDropdownStyle", "Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;", "menuStyle", "Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;", "readUndecoratedDropdownStyle", "ide-laf-bridge"})
/*     */ @SourceDebugExtension({"SMAP\nIntUiBridgeDropdown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeDropdown.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeDropdownKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,115:1\n51#2:116\n51#2:117\n149#3:118\n149#3:119\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeDropdown.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeDropdownKt\n*L\n58#1:116\n105#1:117\n107#1:118\n109#1:119\n*E\n"})
/*     */ public final class IntUiBridgeDropdownKt {
/*     */   @NotNull
/*  22 */   public static final DropdownStyle readDefaultDropdownStyle(@NotNull MenuStyle menuStyle) { Intrinsics.checkNotNullParameter(menuStyle, "menuStyle"); long normalBackground = BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.background");
/*  23 */     long normalContent = BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.foreground");
/*  24 */     long normalBorder = BridgeUtilsKt.retrieveColorOrUnspecified("Component.borderColor");
/*  25 */     long focusedBorder = BridgeUtilsKt.retrieveColorOrUnspecified("Component.focusedBorderColor");
/*     */     
/*  27 */     DropdownColors colors = 
/*  28 */       new DropdownColors(
/*  29 */         normalBackground, 
/*  30 */         BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.disabledBackground"), 
/*  31 */         normalBackground, 
/*  32 */         normalBackground, 
/*  33 */         normalBackground, 
/*  34 */         normalContent, 
/*  35 */         BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.disabledForeground"), 
/*  36 */         normalContent, 
/*  37 */         normalContent, 
/*  38 */         normalContent, 
/*  39 */         normalBorder, 
/*  40 */         BridgeUtilsKt.retrieveColorOrUnspecified("Component.disabledBorderColor"), 
/*  41 */         focusedBorder, 
/*  42 */         focusedBorder, 
/*  43 */         normalBorder, 
/*  44 */         Color.Companion.getUnspecified-0d7_KjU(), 
/*  45 */         Color.Companion.getUnspecified-0d7_KjU(), 
/*  46 */         Color.Companion.getUnspecified-0d7_KjU(), 
/*  47 */         Color.Companion.getUnspecified-0d7_KjU(), 
/*  48 */         Color.Companion.getUnspecified-0d7_KjU(), null);
/*     */ 
/*     */     
/*  51 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.ComboBox.minimumSize(), "minimumSize(...)"); long minimumSize = BridgeUtilsKt.toDpSize(JBUI.CurrentTheme.ComboBox.minimumSize());
/*  52 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Component.ARROW_AREA_WIDTH, "ARROW_AREA_WIDTH"); float arrowWidth = BridgeUtilsKt.getDp(JBUI.CurrentTheme.Component.ARROW_AREA_WIDTH);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  58 */     float arg0$iv = DpSize.getWidth-D9Ej5fM(minimumSize); int $i$f$plus-5rwHm24 = 0;
/*     */ 
/*     */     
/*  61 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.LW, "LW");
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
/* 116 */     return new DropdownStyle(colors, new DropdownMetrics(DpKt.DpSize-YgX7TsA(arrowWidth, DpSize.getHeight-D9Ej5fM(minimumSize)), DpKt.DpSize-YgX7TsA(Dp.constructor-impl(arg0$iv + arrowWidth), DpSize.getHeight-D9Ej5fM(minimumSize)), IntUiBridgeKt.getComponentArc(), BridgeUtilsKt.retrieveInsetsAsPaddingValues$default("ComboBox.padding", null, 2, null), BridgeUtilsKt.getDp(DarculaUIUtil.LW), null), new DropdownIcons((IconKey)AllIconsKeys.General.INSTANCE.getChevronDown()), menuStyle); } @NotNull public static final DropdownStyle readUndecoratedDropdownStyle(@NotNull MenuStyle menuStyle) { Intrinsics.checkNotNullParameter(menuStyle, "menuStyle"); long normalBackground = BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.background"); long hoverBackground = BridgeUtilsKt.retrieveColorOrUnspecified("MainToolbar.Dropdown.transparentHoverBackground"); long normalContent = BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.foreground"); DropdownColors colors = new DropdownColors(normalBackground, BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.disabledBackground"), normalBackground, normalBackground, hoverBackground, normalContent, BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.disabledForeground"), normalContent, normalContent, normalContent, Color.Companion.getUnspecified-0d7_KjU(), Color.Companion.getUnspecified-0d7_KjU(), Color.Companion.getUnspecified-0d7_KjU(), Color.Companion.getUnspecified-0d7_KjU(), Color.Companion.getUnspecified-0d7_KjU(), Color.Companion.getUnspecified-0d7_KjU(), Color.Companion.getUnspecified-0d7_KjU(), Color.Companion.getUnspecified-0d7_KjU(), Color.Companion.getUnspecified-0d7_KjU(), Color.Companion.getUnspecified-0d7_KjU(), null); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Component.ARROW_AREA_WIDTH, "ARROW_AREA_WIDTH"); float arrowWidth = BridgeUtilsKt.getDp(JBUI.CurrentTheme.Component.ARROW_AREA_WIDTH); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Button.minimumSize(), "minimumSize(...)"); long minimumSize = BridgeUtilsKt.toDpSize(JBUI.CurrentTheme.Button.minimumSize()); float arg0$iv = DpSize.getWidth-D9Ej5fM(minimumSize); int $i$f$plus-5rwHm24 = 0; Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.MainToolbar.Dropdown.hoverArc(), "hoverArc(...)"); int $this$dp$iv = 3, $i$f$getDp = 0; $this$dp$iv = 0; $i$f$getDp = 0;
/* 117 */     return new DropdownStyle(colors, new DropdownMetrics(DpKt.DpSize-YgX7TsA(arrowWidth, DpSize.getHeight-D9Ej5fM(minimumSize)), DpKt.DpSize-YgX7TsA(Dp.constructor-impl(arg0$iv + arrowWidth), DpSize.getHeight-D9Ej5fM(minimumSize)), CornerSizeKt.CornerSize-0680j_4(BridgeUtilsKt.getDp(JBUI.CurrentTheme.MainToolbar.Dropdown.hoverArc())), PaddingKt.PaddingValues-0680j_4(
/* 118 */             Dp.constructor-impl($this$dp$iv)), 
/* 119 */           Dp.constructor-impl($this$dp$iv), null), new DropdownIcons((IconKey)AllIconsKeys.General.INSTANCE.getChevronDown()), menuStyle); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeDropdownKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */