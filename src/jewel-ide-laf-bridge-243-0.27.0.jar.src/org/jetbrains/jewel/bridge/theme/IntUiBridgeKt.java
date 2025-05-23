/*     */ package org.jetbrains.jewel.bridge.theme;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import com.intellij.ui.JBColor;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*     */ import org.jetbrains.jewel.foundation.theme.ThemeDefinition;
/*     */ import org.jetbrains.jewel.ui.component.styling.ButtonStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.CheckboxStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.ChipStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.ComboBoxStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.DropdownStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TabStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextFieldStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TooltipStyle;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000>\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\032\b\020\013\032\0020\fH\000\032 \020\013\032\0020\f2\006\020\020\032\0020\0212\006\020\022\032\0020\0212\006\020\023\032\0020\021H\000\032\020\020\024\032\0020\0252\006\020\026\032\0020\fH\000\"\016\020\000\032\0020\001X\004¢\006\002\n\000\"\034\020\002\032\n \004*\004\030\0010\0030\0038@X\004¢\006\006\032\004\b\005\020\006\"\024\020\007\032\0020\b8@X\004¢\006\006\032\004\b\t\020\n\"\024\020\r\032\0020\0168@X\004¢\006\006\032\004\b\r\020\017\"\024\020\027\032\0020\0308@X\004¢\006\006\032\004\b\031\020\032¨\006\033"}, d2 = {"logger", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "uiDefaults", "Ljavax/swing/UIDefaults;", "kotlin.jvm.PlatformType", "getUiDefaults", "()Ljavax/swing/UIDefaults;", "iconsBasePath", "", "getIconsBasePath", "()Ljava/lang/String;", "createBridgeThemeDefinition", "Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;", "isDark", "", "()Z", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "editorTextStyle", "consoleTextStyle", "createBridgeComponentStyling", "Lorg/jetbrains/jewel/ui/ComponentStyling;", "theme", "componentArc", "Landroidx/compose/foundation/shape/CornerSize;", "getComponentArc", "()Landroidx/compose/foundation/shape/CornerSize;", "ide-laf-bridge"})
/*     */ @SourceDebugExtension({"SMAP\nIntUiBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridge.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,102:1\n72#2:103\n*S KotlinDebug\n*F\n+ 1 IntUiBridge.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeKt\n*L\n101#1:103\n*E\n"})
/*     */ public final class IntUiBridgeKt {
/*     */   @NotNull
/*  22 */   private static final JewelLogger logger = JewelLogger.Companion.getInstance("JewelIntUiBridge");
/*     */   
/*     */   public static final UIDefaults getUiDefaults() {
/*  25 */     return UIManager.getDefaults();
/*     */   } @NotNull
/*     */   public static final String getIconsBasePath() {
/*  28 */     return (new DirProvider()).dir();
/*     */   } @NotNull
/*     */   public static final ThemeDefinition createBridgeThemeDefinition() {
/*  31 */     TextStyle textStyle = IntUiBridgeTextKt.retrieveDefaultTextStyle();
/*  32 */     TextStyle editorTextStyle = IntUiBridgeTextKt.retrieveEditorTextStyle();
/*  33 */     TextStyle consoleTextStyle = IntUiBridgeTextKt.retrieveConsoleTextStyle();
/*  34 */     return createBridgeThemeDefinition(textStyle, editorTextStyle, consoleTextStyle);
/*     */   }
/*     */   
/*     */   public static final boolean isDark() {
/*  38 */     return !JBColor.isBright();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final ThemeDefinition createBridgeThemeDefinition(@NotNull TextStyle textStyle, @NotNull TextStyle editorTextStyle, @NotNull TextStyle consoleTextStyle) {
/*  45 */     Intrinsics.checkNotNullParameter(textStyle, "textStyle"); Intrinsics.checkNotNullParameter(editorTextStyle, "editorTextStyle"); Intrinsics.checkNotNullParameter(consoleTextStyle, "consoleTextStyle"); logger.debug("Obtaining theme definition from Swing...");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  55 */     Intrinsics.checkNotNullExpressionValue(JBColor.foreground(), "foreground(...)"); return new ThemeDefinition(BridgeUtilsKt.lafName(), isDark(), BridgeGlobalColorsKt.readFromLaF(GlobalColors.Companion), BridgeGlobalMetricsKt.readFromLaF(GlobalMetrics.Companion), textStyle, editorTextStyle, consoleTextStyle, BridgeUtilsKt.toComposeColor(JBColor.foreground()), 
/*  56 */         BridgeThemeColorPaletteKt.readFromLaF(ThemeColorPalette.Companion), 
/*  57 */         BridgeIconDataKt.readFromLaF(ThemeIconData.Companion), null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ComponentStyling createBridgeComponentStyling(@NotNull ThemeDefinition theme) {
/*  62 */     Intrinsics.checkNotNullParameter(theme, "theme"); logger.debug("Obtaining Int UI component styling from Swing...");
/*     */     
/*  64 */     TextFieldStyle textFieldStyle = IntUiBridgeTextFieldKt.readTextFieldStyle();
/*  65 */     MenuStyle menuStyle = IntUiBridgeMenuKt.readMenuStyle();
/*     */ 
/*     */     
/*  68 */     CheckboxStyle checkboxStyle = IntUiBridgeCheckboxKt.readCheckboxStyle();
/*  69 */     ChipStyle chipStyle = IntUiBridgeChipKt.readChipStyle();
/*  70 */     CircularProgressStyle circularProgressStyle = IntUiBridgeProgressKt.readCircularProgressStyle(theme.isDark());
/*  71 */     ComboBoxStyle comboBoxStyle = IntUiBridgeComboBoxKt.readDefaultComboBoxStyle();
/*  72 */     DefaultBannerStyles defaultBannerStyles = IntUiBridgeBannerKt.readDefaultBannerStyle();
/*  73 */     ButtonStyle buttonStyle1 = IntUiBridgeButtonKt.readDefaultButtonStyle();
/*  74 */     DropdownStyle dropdownStyle1 = IntUiBridgeDropdownKt.readDefaultDropdownStyle(menuStyle);
/*  75 */     TabStyle tabStyle1 = IntUiBridgeTabKt.readDefaultTabStyle();
/*  76 */     DividerStyle dividerStyle = IntUiBridgeDividerKt.readDividerStyle();
/*  77 */     TabStyle tabStyle2 = IntUiBridgeTabKt.readEditorTabStyle();
/*  78 */     GroupHeaderStyle groupHeaderStyle = IntUiBridgeGroupHeaderKt.readGroupHeaderStyle();
/*  79 */     HorizontalProgressBarStyle horizontalProgressBarStyle = IntUiBridgeProgressKt.readHorizontalProgressBarStyle();
/*  80 */     IconButtonStyle iconButtonStyle = IntUiBridgeButtonKt.readIconButtonStyle();
/*  81 */     LazyTreeStyle lazyTreeStyle = IntUiBridgeLazyTreeKt.readLazyTreeStyle();
/*  82 */     LinkStyle linkStyle = IntUiBridgeLinkKt.readLinkStyle();
/*     */     
/*  84 */     ButtonStyle buttonStyle2 = IntUiBridgeButtonKt.readOutlinedButtonStyle();
/*  85 */     PopupContainerStyle popupContainerStyle = IntUiBridgePopupContainerKt.readPopupContainerStyle();
/*  86 */     RadioButtonStyle radioButtonStyle = IntUiBridgeRadioButtonKt.readRadioButtonStyle();
/*  87 */     ScrollbarStyle scrollbarStyle = ScrollbarBridgeKt.readScrollbarStyle(theme.isDark());
/*  88 */     SegmentedControlButtonStyle segmentedControlButtonStyle = IntUiBridgeButtonKt.readSegmentedControlButtonStyle();
/*  89 */     SegmentedControlStyle segmentedControlStyle = IntUiBridgeSegmentedControlKt.readSegmentedControlStyle();
/*  90 */     SelectableLazyColumnStyle selectableLazyColumnStyle = IntUiBridgeSelectableLazyColumnKt.readSelectableLazyColumnStyle();
/*  91 */     SimpleListItemStyle simpleListItemStyle = IntUiBridgeSimpleListItemKt.readSimpleListItemStyle();
/*  92 */     SliderStyle sliderStyle = IntUiBridgeSliderKt.readSliderStyle(theme.isDark());
/*  93 */     TextAreaStyle textAreaStyle = IntUiBridgeTextAreaKt.readTextAreaStyle(textFieldStyle.getMetrics());
/*     */     
/*  95 */     TooltipStyle tooltipStyle = IntUiBridgeTooltipKt.readTooltipStyle();
/*  96 */     DropdownStyle dropdownStyle2 = IntUiBridgeDropdownKt.readUndecoratedDropdownStyle(menuStyle); return (ComponentStyling)new DefaultComponentStyling(checkboxStyle, chipStyle, circularProgressStyle, defaultBannerStyles, comboBoxStyle, buttonStyle1, dropdownStyle1, tabStyle1, dividerStyle, tabStyle2, groupHeaderStyle, horizontalProgressBarStyle, iconButtonStyle, lazyTreeStyle, linkStyle, menuStyle, buttonStyle2, popupContainerStyle, radioButtonStyle, scrollbarStyle, segmentedControlButtonStyle, segmentedControlStyle, selectableLazyColumnStyle, simpleListItemStyle, sliderStyle, textAreaStyle, textFieldStyle, tooltipStyle, dropdownStyle2);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final CornerSize getComponentArc() {
/* 101 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.COMPONENT_ARC, "COMPONENT_ARC"); float f = BridgeUtilsKt.getDp(DarculaUIUtil.COMPONENT_ARC); int other$iv = 2, $i$f$div-u2uoSUM = 0; return CornerSizeKt.CornerSize-0680j_4(
/*     */         
/* 103 */         Dp.constructor-impl(f / other$iv));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */