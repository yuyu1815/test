/*     */ package org.jetbrains.jewel.ui.theme;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.CompositionLocalKt;
/*     */ import androidx.compose.runtime.ProvidedValue;
/*     */ import androidx.compose.runtime.ReadOnlyComposable;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.theme.JewelTheme;
/*     */ import org.jetbrains.jewel.foundation.theme.ThemeColorPalette;
/*     */ import org.jetbrains.jewel.foundation.theme.ThemeDefinition;
/*     */ import org.jetbrains.jewel.foundation.theme.ThemeIconData;
/*     */ import org.jetbrains.jewel.ui.ComponentStyling;
/*     */ import org.jetbrains.jewel.ui.component.styling.ButtonStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.ButtonStylingKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.CheckboxStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.CheckboxStylingKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.ChipStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.CircularProgressStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.ComboBoxStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.DefaultBannerStyles;
/*     */ import org.jetbrains.jewel.ui.component.styling.DividerStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.DropdownStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.DropdownStylingKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.GroupHeaderStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.GroupHeaderStylingKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.HorizontalProgressBarStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.HorizontalProgressBarStylingKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.IconButtonStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.LazyTreeStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.LinkStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuStylingKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.PopupContainerStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.RadioButtonStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.SegmentedControlStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.SelectableLazyColumnStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.SimpleListItemStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.SimpleListItemStyleKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.SliderStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TabStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TabStylingKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextAreaStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextAreaStylingKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextFieldStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextFieldStylingKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.TooltipStyle;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\0320\020u\032\0020v2\006\020w\032\0020x2\006\020y\032\0020z2\021\020{\032\r\022\004\022\0020v0|¢\006\002\b}H\007¢\006\002\020~\032<\020u\032\0020v2\006\020w\032\0020x2\006\020y\032\0020z2\t\b\002\020\032\0030\0012\021\020{\032\r\022\004\022\0020v0|¢\006\002\b}H\007¢\006\003\020\001\"\025\020\000\032\0020\001*\0020\0028G¢\006\006\032\004\b\003\020\004\"\025\020\005\032\0020\006*\0020\0028G¢\006\006\032\004\b\007\020\b\"\025\020\t\032\0020\n*\0020\0028G¢\006\006\032\004\b\013\020\f\"\025\020\r\032\0020\016*\0020\0028G¢\006\006\032\004\b\017\020\020\"\025\020\021\032\0020\016*\0020\0028G¢\006\006\032\004\b\022\020\020\"\025\020\023\032\0020\024*\0020\0028G¢\006\006\032\004\b\025\020\026\"\025\020\027\032\0020\030*\0020\0028G¢\006\006\032\004\b\031\020\032\"\025\020\033\032\0020\034*\0020\0028G¢\006\006\032\004\b\035\020\036\"\025\020\037\032\0020 *\0020\0028G¢\006\006\032\004\b!\020\"\"\025\020#\032\0020$*\0020\0028G¢\006\006\032\004\b%\020&\"\025\020'\032\0020(*\0020\0028G¢\006\006\032\004\b)\020*\"\025\020+\032\0020,*\0020\0028G¢\006\006\032\004\b-\020.\"\025\020/\032\00200*\0020\0028G¢\006\006\032\004\b1\0202\"\025\0203\032\00204*\0020\0028G¢\006\006\032\004\b5\0206\"\025\0207\032\00208*\0020\0028G¢\006\006\032\004\b9\020:\"\025\020;\032\0020<*\0020\0028G¢\006\006\032\004\b=\020>\"\025\020?\032\0020@*\0020\0028G¢\006\006\032\004\bA\020B\"\025\020C\032\0020D*\0020\0028G¢\006\006\032\004\bE\020F\"\025\020G\032\0020H*\0020\0028G¢\006\006\032\004\bI\020J\"\025\020K\032\0020L*\0020\0028G¢\006\006\032\004\bM\020N\"\025\020O\032\0020P*\0020\0028G¢\006\006\032\004\bQ\020R\"\025\020S\032\0020T*\0020\0028G¢\006\006\032\004\bU\020V\"\025\020W\032\0020X*\0020\0028G¢\006\006\032\004\bY\020Z\"\025\020[\032\0020\\*\0020\0028G¢\006\006\032\004\b]\020^\"\025\020_\032\0020`*\0020\0028G¢\006\006\032\004\ba\020b\"\025\020c\032\0020`*\0020\0028G¢\006\006\032\004\bd\020b\"\025\020e\032\0020f*\0020\0028G¢\006\006\032\004\bg\020h\"\025\020i\032\0020j*\0020\0028G¢\006\006\032\004\bk\020l\"\025\020m\032\0020n*\0020\0028G¢\006\006\032\004\bo\020p\"\025\020q\032\0020r*\0020\0028G¢\006\006\032\004\bs\020t¨\006\001"}, d2 = {"colorPalette", "Lorg/jetbrains/jewel/foundation/theme/ThemeColorPalette;", "Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;", "getColorPalette", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/foundation/theme/ThemeColorPalette;", "iconData", "Lorg/jetbrains/jewel/foundation/theme/ThemeIconData;", "getIconData", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/foundation/theme/ThemeIconData;", "defaultBannerStyle", "Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyles;", "getDefaultBannerStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyles;", "defaultButtonStyle", "Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;", "getDefaultButtonStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;", "outlinedButtonStyle", "getOutlinedButtonStyle", "checkboxStyle", "Lorg/jetbrains/jewel/ui/component/styling/CheckboxStyle;", "getCheckboxStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/CheckboxStyle;", "chipStyle", "Lorg/jetbrains/jewel/ui/component/styling/ChipStyle;", "getChipStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ChipStyle;", "dividerStyle", "Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;", "getDividerStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;", "dropdownStyle", "Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;", "getDropdownStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;", "comboBoxStyle", "Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;", "getComboBoxStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;", "groupHeaderStyle", "Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderStyle;", "getGroupHeaderStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderStyle;", "linkStyle", "Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;", "getLinkStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;", "menuStyle", "Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;", "getMenuStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;", "popupContainerStyle", "Lorg/jetbrains/jewel/ui/component/styling/PopupContainerStyle;", "getPopupContainerStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/PopupContainerStyle;", "horizontalProgressBarStyle", "Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;", "getHorizontalProgressBarStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;", "radioButtonStyle", "Lorg/jetbrains/jewel/ui/component/styling/RadioButtonStyle;", "getRadioButtonStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/RadioButtonStyle;", "scrollbarStyle", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;", "getScrollbarStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;", "selectableLazyColumnStyle", "Lorg/jetbrains/jewel/ui/component/styling/SelectableLazyColumnStyle;", "getSelectableLazyColumnStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/SelectableLazyColumnStyle;", "segmentedControlButtonStyle", "Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;", "getSegmentedControlButtonStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;", "segmentedControlStyle", "Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlStyle;", "getSegmentedControlStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlStyle;", "simpleListItemStyle", "Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemStyle;", "getSimpleListItemStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemStyle;", "textAreaStyle", "Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;", "getTextAreaStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;", "textFieldStyle", "Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;", "getTextFieldStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;", "treeStyle", "Lorg/jetbrains/jewel/ui/component/styling/LazyTreeStyle;", "getTreeStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/LazyTreeStyle;", "defaultTabStyle", "Lorg/jetbrains/jewel/ui/component/styling/TabStyle;", "getDefaultTabStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TabStyle;", "editorTabStyle", "getEditorTabStyle", "circularProgressStyle", "Lorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;", "getCircularProgressStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;", "tooltipStyle", "Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;", "getTooltipStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;", "iconButtonStyle", "Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;", "getIconButtonStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;", "sliderStyle", "Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;", "getSliderStyle", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;", "BaseJewelTheme", "", "theme", "Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;", "styling", "Lorg/jetbrains/jewel/ui/ComponentStyling;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;Lorg/jetbrains/jewel/ui/ComponentStyling;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "swingCompatMode", "", "(Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;Lorg/jetbrains/jewel/ui/ComponentStyling;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui"})
/*     */ @SourceDebugExtension({"SMAP\nJewelTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JewelTheme.kt\norg/jetbrains/jewel/ui/theme/JewelThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,180:1\n77#2:181\n77#2:182\n77#2:183\n77#2:184\n77#2:185\n77#2:186\n77#2:187\n77#2:188\n77#2:189\n77#2:190\n77#2:191\n77#2:192\n77#2:193\n77#2:194\n77#2:195\n77#2:196\n77#2:197\n77#2:198\n77#2:199\n77#2:200\n77#2:201\n77#2:202\n77#2:203\n77#2:204\n77#2:205\n77#2:206\n77#2:207\n77#2:208\n77#2:209\n77#2:210\n*S KotlinDebug\n*F\n+ 1 JewelTheme.kt\norg/jetbrains/jewel/ui/theme/JewelThemeKt\n*L\n69#1:181\n72#1:182\n79#1:183\n82#1:184\n85#1:185\n88#1:186\n91#1:187\n94#1:188\n97#1:189\n100#1:190\n103#1:191\n106#1:192\n109#1:193\n112#1:194\n115#1:195\n118#1:196\n121#1:197\n124#1:198\n127#1:199\n130#1:200\n133#1:201\n136#1:202\n139#1:203\n142#1:204\n145#1:205\n148#1:206\n151#1:207\n154#1:208\n157#1:209\n160#1:210\n*E\n"})
/*     */ public final class JewelThemeKt {
/*     */   @Composable
/*     */   @ReadOnlyComposable
/*     */   @JvmName(name = "getColorPalette")
/*     */   @NotNull
/*  69 */   public static final ThemeColorPalette getColorPalette(@NotNull JewelTheme.Companion $this$colorPalette, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$colorPalette, "<this>"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1697886448, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-colorPalette> (JewelTheme.kt:68)");  CompositionLocal compositionLocal = (CompositionLocal)org.jetbrains.jewel.foundation.theme.JewelThemeKt.getLocalColorPalette(); int $changed$iv = 0, $i$f$getCurrent = 0;
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
/* 181 */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ThemeColorPalette themeColorPalette = (ThemeColorPalette)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return themeColorPalette; } @Composable @ReadOnlyComposable @JvmName(name = "getIconData") @NotNull public static final ThemeIconData getIconData(@NotNull JewelTheme.Companion $this$iconData, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$iconData, "<this>"); if (ComposerKt.isTraceInProgress())
/* 182 */       ComposerKt.traceEventStart(-1498438523, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-iconData> (JewelTheme.kt:71)");  CompositionLocal compositionLocal = (CompositionLocal)org.jetbrains.jewel.foundation.theme.JewelThemeKt.getLocalIconData(); int $changed$iv = 0, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ThemeIconData themeIconData = (ThemeIconData)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return themeIconData; } @Composable @ReadOnlyComposable @JvmName(name = "getDefaultBannerStyle") @NotNull public static final DefaultBannerStyles getDefaultBannerStyle(@NotNull JewelTheme.Companion $this$defaultBannerStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$defaultBannerStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 183 */       ComposerKt.traceEventStart(1728702114, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-defaultBannerStyle> (JewelTheme.kt:78)");  CompositionLocal compositionLocal = (CompositionLocal)BannerStylingKt.getLocalDefaultBannerStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); DefaultBannerStyles defaultBannerStyles = (DefaultBannerStyles)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return defaultBannerStyles; } @Composable @ReadOnlyComposable @JvmName(name = "getDefaultButtonStyle") @NotNull public static final ButtonStyle getDefaultButtonStyle(@NotNull JewelTheme.Companion $this$defaultButtonStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$defaultButtonStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 184 */       ComposerKt.traceEventStart(-292113838, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-defaultButtonStyle> (JewelTheme.kt:81)");  CompositionLocal compositionLocal = (CompositionLocal)ButtonStylingKt.getLocalDefaultButtonStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ButtonStyle buttonStyle = (ButtonStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return buttonStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getOutlinedButtonStyle") @NotNull public static final ButtonStyle getOutlinedButtonStyle(@NotNull JewelTheme.Companion $this$outlinedButtonStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$outlinedButtonStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 185 */       ComposerKt.traceEventStart(-1561550056, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-outlinedButtonStyle> (JewelTheme.kt:84)");  CompositionLocal compositionLocal = (CompositionLocal)ButtonStylingKt.getLocalOutlinedButtonStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ButtonStyle buttonStyle = (ButtonStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return buttonStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getCheckboxStyle") @NotNull public static final CheckboxStyle getCheckboxStyle(@NotNull JewelTheme.Companion $this$checkboxStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$checkboxStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 186 */       ComposerKt.traceEventStart(-1966795063, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-checkboxStyle> (JewelTheme.kt:87)");  CompositionLocal compositionLocal = (CompositionLocal)CheckboxStylingKt.getLocalCheckboxStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); CheckboxStyle checkboxStyle = (CheckboxStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return checkboxStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getChipStyle") @NotNull public static final ChipStyle getChipStyle(@NotNull JewelTheme.Companion $this$chipStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$chipStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 187 */       ComposerKt.traceEventStart(-576798450, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-chipStyle> (JewelTheme.kt:90)");  CompositionLocal compositionLocal = (CompositionLocal)ChipStylingKt.getLocalChipStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ChipStyle chipStyle = (ChipStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return chipStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getDividerStyle") @NotNull public static final DividerStyle getDividerStyle(@NotNull JewelTheme.Companion $this$dividerStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$dividerStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 188 */       ComposerKt.traceEventStart(1182375605, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-dividerStyle> (JewelTheme.kt:93)");  CompositionLocal compositionLocal = (CompositionLocal)DividerStylingKt.getLocalDividerStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); DividerStyle dividerStyle = (DividerStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return dividerStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getDropdownStyle") @NotNull public static final DropdownStyle getDropdownStyle(@NotNull JewelTheme.Companion $this$dropdownStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$dropdownStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 189 */       ComposerKt.traceEventStart(487365151, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-dropdownStyle> (JewelTheme.kt:96)");  CompositionLocal compositionLocal = (CompositionLocal)DropdownStylingKt.getLocalDefaultDropdownStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); DropdownStyle dropdownStyle = (DropdownStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return dropdownStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getComboBoxStyle") @NotNull public static final ComboBoxStyle getComboBoxStyle(@NotNull JewelTheme.Companion $this$comboBoxStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$comboBoxStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 190 */       ComposerKt.traceEventStart(1995830459, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-comboBoxStyle> (JewelTheme.kt:99)");  CompositionLocal compositionLocal = (CompositionLocal)ComboBoxStylingKt.getLocalDefaultComboBoxStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ComboBoxStyle comboBoxStyle = (ComboBoxStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return comboBoxStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getGroupHeaderStyle") @NotNull public static final GroupHeaderStyle getGroupHeaderStyle(@NotNull JewelTheme.Companion $this$groupHeaderStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$groupHeaderStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 191 */       ComposerKt.traceEventStart(-1924184350, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-groupHeaderStyle> (JewelTheme.kt:102)");  CompositionLocal compositionLocal = (CompositionLocal)GroupHeaderStylingKt.getLocalGroupHeaderStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); GroupHeaderStyle groupHeaderStyle = (GroupHeaderStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return groupHeaderStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getLinkStyle") @NotNull public static final LinkStyle getLinkStyle(@NotNull JewelTheme.Companion $this$linkStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$linkStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 192 */       ComposerKt.traceEventStart(-393893564, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-linkStyle> (JewelTheme.kt:105)");  CompositionLocal compositionLocal = (CompositionLocal)LinkStylingKt.getLocalLinkStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); LinkStyle linkStyle = (LinkStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return linkStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getMenuStyle") @NotNull public static final MenuStyle getMenuStyle(@NotNull JewelTheme.Companion $this$menuStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$menuStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 193 */       ComposerKt.traceEventStart(36726261, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-menuStyle> (JewelTheme.kt:108)");  CompositionLocal compositionLocal = (CompositionLocal)MenuStylingKt.getLocalMenuStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); MenuStyle menuStyle = (MenuStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return menuStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getPopupContainerStyle") @NotNull public static final PopupContainerStyle getPopupContainerStyle(@NotNull JewelTheme.Companion $this$popupContainerStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$popupContainerStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 194 */       ComposerKt.traceEventStart(-771888525, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-popupContainerStyle> (JewelTheme.kt:111)");  CompositionLocal compositionLocal = (CompositionLocal)PopupContainerStyleKt.getLocalPopupContainerStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); PopupContainerStyle popupContainerStyle = (PopupContainerStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return popupContainerStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getHorizontalProgressBarStyle") @NotNull public static final HorizontalProgressBarStyle getHorizontalProgressBarStyle(@NotNull JewelTheme.Companion $this$horizontalProgressBarStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$horizontalProgressBarStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 195 */       ComposerKt.traceEventStart(-1190103700, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-horizontalProgressBarStyle> (JewelTheme.kt:114)");  CompositionLocal compositionLocal = (CompositionLocal)HorizontalProgressBarStylingKt.getLocalHorizontalProgressBarStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); HorizontalProgressBarStyle horizontalProgressBarStyle = (HorizontalProgressBarStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return horizontalProgressBarStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getRadioButtonStyle") @NotNull public static final RadioButtonStyle getRadioButtonStyle(@NotNull JewelTheme.Companion $this$radioButtonStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$radioButtonStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 196 */       ComposerKt.traceEventStart(6371137, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-radioButtonStyle> (JewelTheme.kt:117)");  CompositionLocal compositionLocal = (CompositionLocal)RadioButtonStylingKt.getLocalRadioButtonStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); RadioButtonStyle radioButtonStyle = (RadioButtonStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return radioButtonStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getScrollbarStyle") @NotNull public static final ScrollbarStyle getScrollbarStyle(@NotNull JewelTheme.Companion $this$scrollbarStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$scrollbarStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 197 */       ComposerKt.traceEventStart(753286952, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-scrollbarStyle> (JewelTheme.kt:120)");  CompositionLocal compositionLocal = (CompositionLocal)ScrollbarStylingKt.getLocalScrollbarStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ScrollbarStyle scrollbarStyle = (ScrollbarStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return scrollbarStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getSelectableLazyColumnStyle") @NotNull public static final SelectableLazyColumnStyle getSelectableLazyColumnStyle(@NotNull JewelTheme.Companion $this$selectableLazyColumnStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$selectableLazyColumnStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 198 */       ComposerKt.traceEventStart(-424499502, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-selectableLazyColumnStyle> (JewelTheme.kt:123)");  CompositionLocal compositionLocal = (CompositionLocal)SelectableLazyColumnStyleKt.getLocalSelectableLazyColumnStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); SelectableLazyColumnStyle selectableLazyColumnStyle = (SelectableLazyColumnStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return selectableLazyColumnStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getSegmentedControlButtonStyle") @NotNull public static final SegmentedControlButtonStyle getSegmentedControlButtonStyle(@NotNull JewelTheme.Companion $this$segmentedControlButtonStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$segmentedControlButtonStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 199 */       ComposerKt.traceEventStart(-1857326309, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-segmentedControlButtonStyle> (JewelTheme.kt:126)");  CompositionLocal compositionLocal = (CompositionLocal)SegmentedControlButtonStylingKt.getLocalSegmentedControlButtonStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); SegmentedControlButtonStyle segmentedControlButtonStyle = (SegmentedControlButtonStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return segmentedControlButtonStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getSegmentedControlStyle") @NotNull public static final SegmentedControlStyle getSegmentedControlStyle(@NotNull JewelTheme.Companion $this$segmentedControlStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$segmentedControlStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 200 */       ComposerKt.traceEventStart(86703185, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-segmentedControlStyle> (JewelTheme.kt:129)");  CompositionLocal compositionLocal = (CompositionLocal)SegmentedControlStylingKt.getLocalSegmentedControlStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); SegmentedControlStyle segmentedControlStyle = (SegmentedControlStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return segmentedControlStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getSimpleListItemStyle") @NotNull public static final SimpleListItemStyle getSimpleListItemStyle(@NotNull JewelTheme.Companion $this$simpleListItemStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$simpleListItemStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 201 */       ComposerKt.traceEventStart(-1962648599, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-simpleListItemStyle> (JewelTheme.kt:132)");  CompositionLocal compositionLocal = (CompositionLocal)SimpleListItemStyleKt.getLocalSimpleListItemStyleStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); SimpleListItemStyle simpleListItemStyle = (SimpleListItemStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return simpleListItemStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getTextAreaStyle") @NotNull public static final TextAreaStyle getTextAreaStyle(@NotNull JewelTheme.Companion $this$textAreaStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$textAreaStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 202 */       ComposerKt.traceEventStart(-1427724252, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-textAreaStyle> (JewelTheme.kt:135)");  CompositionLocal compositionLocal = (CompositionLocal)TextAreaStylingKt.getLocalTextAreaStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); TextAreaStyle textAreaStyle = (TextAreaStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return textAreaStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getTextFieldStyle") @NotNull public static final TextFieldStyle getTextFieldStyle(@NotNull JewelTheme.Companion $this$textFieldStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$textFieldStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 203 */       ComposerKt.traceEventStart(-2010268095, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-textFieldStyle> (JewelTheme.kt:138)");  CompositionLocal compositionLocal = (CompositionLocal)TextFieldStylingKt.getLocalTextFieldStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); TextFieldStyle textFieldStyle = (TextFieldStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return textFieldStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getTreeStyle") @NotNull public static final LazyTreeStyle getTreeStyle(@NotNull JewelTheme.Companion $this$treeStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$treeStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 204 */       ComposerKt.traceEventStart(739384388, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-treeStyle> (JewelTheme.kt:141)");  CompositionLocal compositionLocal = (CompositionLocal)LazyTreeStylingKt.getLocalLazyTreeStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); LazyTreeStyle lazyTreeStyle = (LazyTreeStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return lazyTreeStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getDefaultTabStyle") @NotNull public static final TabStyle getDefaultTabStyle(@NotNull JewelTheme.Companion $this$defaultTabStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$defaultTabStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 205 */       ComposerKt.traceEventStart(-952949157, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-defaultTabStyle> (JewelTheme.kt:144)");  CompositionLocal compositionLocal = (CompositionLocal)TabStylingKt.getLocalDefaultTabStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); TabStyle tabStyle = (TabStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return tabStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getEditorTabStyle") @NotNull public static final TabStyle getEditorTabStyle(@NotNull JewelTheme.Companion $this$editorTabStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$editorTabStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 206 */       ComposerKt.traceEventStart(303501011, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-editorTabStyle> (JewelTheme.kt:147)");  CompositionLocal compositionLocal = (CompositionLocal)TabStylingKt.getLocalEditorTabStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); TabStyle tabStyle = (TabStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return tabStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getCircularProgressStyle") @NotNull public static final CircularProgressStyle getCircularProgressStyle(@NotNull JewelTheme.Companion $this$circularProgressStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$circularProgressStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 207 */       ComposerKt.traceEventStart(345032750, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-circularProgressStyle> (JewelTheme.kt:150)");  CompositionLocal compositionLocal = (CompositionLocal)CircularProgressStyleKt.getLocalCircularProgressStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); CircularProgressStyle circularProgressStyle = (CircularProgressStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return circularProgressStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getTooltipStyle") @NotNull public static final TooltipStyle getTooltipStyle(@NotNull JewelTheme.Companion $this$tooltipStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$tooltipStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 208 */       ComposerKt.traceEventStart(-1945435189, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-tooltipStyle> (JewelTheme.kt:153)");  CompositionLocal compositionLocal = (CompositionLocal)TooltipStylingKt.getLocalTooltipStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); TooltipStyle tooltipStyle = (TooltipStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return tooltipStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getIconButtonStyle") @NotNull public static final IconButtonStyle getIconButtonStyle(@NotNull JewelTheme.Companion $this$iconButtonStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$iconButtonStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 209 */       ComposerKt.traceEventStart(-1360528079, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-iconButtonStyle> (JewelTheme.kt:156)");  CompositionLocal compositionLocal = (CompositionLocal)IconButtonStylingKt.getLocalIconButtonStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); IconButtonStyle iconButtonStyle = (IconButtonStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return iconButtonStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getSliderStyle") @NotNull public static final SliderStyle getSliderStyle(@NotNull JewelTheme.Companion $this$sliderStyle, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$sliderStyle, "<this>"); if (ComposerKt.isTraceInProgress())
/* 210 */       ComposerKt.traceEventStart(-1552518673, $changed, -1, "org.jetbrains.jewel.ui.theme.<get-sliderStyle> (JewelTheme.kt:159)");  CompositionLocal compositionLocal = (CompositionLocal)SliderStylingKt.getLocalSliderStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); SliderStyle sliderStyle = (SliderStyle)object;
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     return sliderStyle; }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0][0]]")
/*     */   public static final void BaseJewelTheme(@NotNull ThemeDefinition theme, @NotNull ComponentStyling styling, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'theme'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'styling'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_2
/*     */     //   15: ldc_w 'content'
/*     */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: aload_3
/*     */     //   22: ldc_w 993635341
/*     */     //   25: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   30: astore_3
/*     */     //   31: iload #4
/*     */     //   33: istore #5
/*     */     //   35: iload #4
/*     */     //   37: bipush #6
/*     */     //   39: iand
/*     */     //   40: ifne -> 63
/*     */     //   43: iload #5
/*     */     //   45: aload_3
/*     */     //   46: aload_0
/*     */     //   47: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   52: ifeq -> 59
/*     */     //   55: iconst_4
/*     */     //   56: goto -> 60
/*     */     //   59: iconst_2
/*     */     //   60: ior
/*     */     //   61: istore #5
/*     */     //   63: iload #4
/*     */     //   65: bipush #48
/*     */     //   67: iand
/*     */     //   68: ifne -> 111
/*     */     //   71: iload #5
/*     */     //   73: iload #4
/*     */     //   75: bipush #64
/*     */     //   77: iand
/*     */     //   78: ifne -> 91
/*     */     //   81: aload_3
/*     */     //   82: aload_1
/*     */     //   83: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   88: goto -> 98
/*     */     //   91: aload_3
/*     */     //   92: aload_1
/*     */     //   93: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   98: ifeq -> 106
/*     */     //   101: bipush #32
/*     */     //   103: goto -> 108
/*     */     //   106: bipush #16
/*     */     //   108: ior
/*     */     //   109: istore #5
/*     */     //   111: iload #4
/*     */     //   113: sipush #384
/*     */     //   116: iand
/*     */     //   117: ifne -> 144
/*     */     //   120: iload #5
/*     */     //   122: aload_3
/*     */     //   123: aload_2
/*     */     //   124: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   129: ifeq -> 138
/*     */     //   132: sipush #256
/*     */     //   135: goto -> 141
/*     */     //   138: sipush #128
/*     */     //   141: ior
/*     */     //   142: istore #5
/*     */     //   144: iload #5
/*     */     //   146: sipush #147
/*     */     //   149: iand
/*     */     //   150: sipush #146
/*     */     //   153: if_icmpne -> 165
/*     */     //   156: aload_3
/*     */     //   157: invokeinterface getSkipping : ()Z
/*     */     //   162: ifne -> 228
/*     */     //   165: invokestatic isTraceInProgress : ()Z
/*     */     //   168: ifeq -> 183
/*     */     //   171: ldc_w 993635341
/*     */     //   174: iload #5
/*     */     //   176: iconst_m1
/*     */     //   177: ldc_w 'org.jetbrains.jewel.ui.theme.BaseJewelTheme (JewelTheme.kt:162)'
/*     */     //   180: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   183: aload_0
/*     */     //   184: aload_1
/*     */     //   185: iconst_0
/*     */     //   186: aload_2
/*     */     //   187: aload_3
/*     */     //   188: sipush #384
/*     */     //   191: bipush #14
/*     */     //   193: iload #5
/*     */     //   195: iand
/*     */     //   196: ior
/*     */     //   197: bipush #112
/*     */     //   199: iload #5
/*     */     //   201: iand
/*     */     //   202: ior
/*     */     //   203: sipush #7168
/*     */     //   206: iload #5
/*     */     //   208: iconst_3
/*     */     //   209: ishl
/*     */     //   210: iand
/*     */     //   211: ior
/*     */     //   212: iconst_0
/*     */     //   213: invokestatic BaseJewelTheme : (Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;Lorg/jetbrains/jewel/ui/ComponentStyling;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   216: invokestatic isTraceInProgress : ()Z
/*     */     //   219: ifeq -> 234
/*     */     //   222: invokestatic traceEventEnd : ()V
/*     */     //   225: goto -> 234
/*     */     //   228: aload_3
/*     */     //   229: invokeinterface skipToGroupEnd : ()V
/*     */     //   234: aload_3
/*     */     //   235: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   240: dup
/*     */     //   241: ifnull -> 262
/*     */     //   244: aload_0
/*     */     //   245: aload_1
/*     */     //   246: aload_2
/*     */     //   247: iload #4
/*     */     //   249: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;Lorg/jetbrains/jewel/ui/ComponentStyling;Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*     */     //   254: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   259: goto -> 263
/*     */     //   262: pop
/*     */     //   263: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #163	-> 21
/*     */     //   #164	-> 183
/*     */     //   #165	-> 228
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   35	229	5	$dirty	I
/*     */     //   0	264	0	theme	Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;
/*     */     //   0	264	1	styling	Lorg/jetbrains/jewel/ui/ComponentStyling;
/*     */     //   0	264	2	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	264	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	264	4	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0][0]]")
/*     */   public static final void BaseJewelTheme(@NotNull ThemeDefinition theme, @NotNull ComponentStyling styling, boolean swingCompatMode, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'theme'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'styling'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_3
/*     */     //   15: ldc_w 'content'
/*     */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: aload #4
/*     */     //   23: ldc_w -1083618511
/*     */     //   26: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   31: astore #4
/*     */     //   33: iload #5
/*     */     //   35: istore #7
/*     */     //   37: iload #6
/*     */     //   39: iconst_1
/*     */     //   40: iand
/*     */     //   41: ifeq -> 54
/*     */     //   44: iload #7
/*     */     //   46: bipush #6
/*     */     //   48: ior
/*     */     //   49: istore #7
/*     */     //   51: goto -> 83
/*     */     //   54: iload #5
/*     */     //   56: bipush #6
/*     */     //   58: iand
/*     */     //   59: ifne -> 83
/*     */     //   62: iload #7
/*     */     //   64: aload #4
/*     */     //   66: aload_0
/*     */     //   67: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   72: ifeq -> 79
/*     */     //   75: iconst_4
/*     */     //   76: goto -> 80
/*     */     //   79: iconst_2
/*     */     //   80: ior
/*     */     //   81: istore #7
/*     */     //   83: iload #6
/*     */     //   85: iconst_2
/*     */     //   86: iand
/*     */     //   87: ifeq -> 100
/*     */     //   90: iload #7
/*     */     //   92: bipush #48
/*     */     //   94: ior
/*     */     //   95: istore #7
/*     */     //   97: goto -> 150
/*     */     //   100: iload #5
/*     */     //   102: bipush #48
/*     */     //   104: iand
/*     */     //   105: ifne -> 150
/*     */     //   108: iload #7
/*     */     //   110: iload #5
/*     */     //   112: bipush #64
/*     */     //   114: iand
/*     */     //   115: ifne -> 129
/*     */     //   118: aload #4
/*     */     //   120: aload_1
/*     */     //   121: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   126: goto -> 137
/*     */     //   129: aload #4
/*     */     //   131: aload_1
/*     */     //   132: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   137: ifeq -> 145
/*     */     //   140: bipush #32
/*     */     //   142: goto -> 147
/*     */     //   145: bipush #16
/*     */     //   147: ior
/*     */     //   148: istore #7
/*     */     //   150: iload #6
/*     */     //   152: iconst_4
/*     */     //   153: iand
/*     */     //   154: ifeq -> 168
/*     */     //   157: iload #7
/*     */     //   159: sipush #384
/*     */     //   162: ior
/*     */     //   163: istore #7
/*     */     //   165: goto -> 202
/*     */     //   168: iload #5
/*     */     //   170: sipush #384
/*     */     //   173: iand
/*     */     //   174: ifne -> 202
/*     */     //   177: iload #7
/*     */     //   179: aload #4
/*     */     //   181: iload_2
/*     */     //   182: invokeinterface changed : (Z)Z
/*     */     //   187: ifeq -> 196
/*     */     //   190: sipush #256
/*     */     //   193: goto -> 199
/*     */     //   196: sipush #128
/*     */     //   199: ior
/*     */     //   200: istore #7
/*     */     //   202: iload #6
/*     */     //   204: bipush #8
/*     */     //   206: iand
/*     */     //   207: ifeq -> 221
/*     */     //   210: iload #7
/*     */     //   212: sipush #3072
/*     */     //   215: ior
/*     */     //   216: istore #7
/*     */     //   218: goto -> 255
/*     */     //   221: iload #5
/*     */     //   223: sipush #3072
/*     */     //   226: iand
/*     */     //   227: ifne -> 255
/*     */     //   230: iload #7
/*     */     //   232: aload #4
/*     */     //   234: aload_3
/*     */     //   235: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   240: ifeq -> 249
/*     */     //   243: sipush #2048
/*     */     //   246: goto -> 252
/*     */     //   249: sipush #1024
/*     */     //   252: ior
/*     */     //   253: istore #7
/*     */     //   255: iload #7
/*     */     //   257: sipush #1171
/*     */     //   260: iand
/*     */     //   261: sipush #1170
/*     */     //   264: if_icmpne -> 277
/*     */     //   267: aload #4
/*     */     //   269: invokeinterface getSkipping : ()Z
/*     */     //   274: ifne -> 364
/*     */     //   277: iload #6
/*     */     //   279: iconst_4
/*     */     //   280: iand
/*     */     //   281: ifeq -> 286
/*     */     //   284: iconst_0
/*     */     //   285: istore_2
/*     */     //   286: invokestatic isTraceInProgress : ()Z
/*     */     //   289: ifeq -> 304
/*     */     //   292: ldc_w -1083618511
/*     */     //   295: iload #7
/*     */     //   297: iconst_m1
/*     */     //   298: ldc_w 'org.jetbrains.jewel.ui.theme.BaseJewelTheme (JewelTheme.kt:172)'
/*     */     //   301: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   304: aload_0
/*     */     //   305: iload_2
/*     */     //   306: ldc_w -1235086596
/*     */     //   309: iconst_1
/*     */     //   310: new org/jetbrains/jewel/ui/theme/JewelThemeKt$BaseJewelTheme$2
/*     */     //   313: dup
/*     */     //   314: aload_0
/*     */     //   315: aload_1
/*     */     //   316: aload_3
/*     */     //   317: invokespecial <init> : (Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;Lorg/jetbrains/jewel/ui/ComponentStyling;Lkotlin/jvm/functions/Function2;)V
/*     */     //   320: aload #4
/*     */     //   322: bipush #54
/*     */     //   324: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   327: checkcast kotlin/jvm/functions/Function2
/*     */     //   330: aload #4
/*     */     //   332: sipush #384
/*     */     //   335: bipush #14
/*     */     //   337: iload #7
/*     */     //   339: iand
/*     */     //   340: ior
/*     */     //   341: bipush #112
/*     */     //   343: iload #7
/*     */     //   345: iconst_3
/*     */     //   346: ishr
/*     */     //   347: iand
/*     */     //   348: ior
/*     */     //   349: invokestatic JewelTheme : (Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   352: invokestatic isTraceInProgress : ()Z
/*     */     //   355: ifeq -> 371
/*     */     //   358: invokestatic traceEventEnd : ()V
/*     */     //   361: goto -> 371
/*     */     //   364: aload #4
/*     */     //   366: invokeinterface skipToGroupEnd : ()V
/*     */     //   371: aload #4
/*     */     //   373: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   378: dup
/*     */     //   379: ifnull -> 403
/*     */     //   382: aload_0
/*     */     //   383: aload_1
/*     */     //   384: iload_2
/*     */     //   385: aload_3
/*     */     //   386: iload #5
/*     */     //   388: iload #6
/*     */     //   390: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;Lorg/jetbrains/jewel/ui/ComponentStyling;ZLkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*     */     //   395: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   400: goto -> 404
/*     */     //   403: pop
/*     */     //   404: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #173	-> 21
/*     */     //   #171	-> 284
/*     */     //   #173	-> 301
/*     */     //   #174	-> 304
/*     */     //   #179	-> 364
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   37	368	7	$dirty	I
/*     */     //   0	405	0	theme	Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;
/*     */     //   0	405	1	styling	Lorg/jetbrains/jewel/ui/ComponentStyling;
/*     */     //   0	405	2	swingCompatMode	Z
/*     */     //   0	405	3	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	405	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	405	5	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit BaseJewelTheme$lambda$0(ThemeDefinition $theme, ComponentStyling $styling, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*     */     BaseJewelTheme($theme, $styling, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit BaseJewelTheme$lambda$1(ThemeDefinition $theme, ComponentStyling $styling, boolean $swingCompatMode, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     BaseJewelTheme($theme, $styling, $swingCompatMode, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class JewelThemeKt$BaseJewelTheme$2 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(-1235086596, $changed, -1, "org.jetbrains.jewel.ui.theme.BaseJewelTheme.<anonymous> (JewelTheme.kt:174)"); 
/*     */         ProvidedValue[] arrayOfProvidedValue = new ProvidedValue[2];
/*     */         arrayOfProvidedValue[0] = org.jetbrains.jewel.foundation.theme.JewelThemeKt.getLocalColorPalette().provides(this.$theme.getColorPalette());
/*     */         arrayOfProvidedValue[1] = org.jetbrains.jewel.foundation.theme.JewelThemeKt.getLocalIconData().provides(this.$theme.getIconData());
/*     */         CompositionLocalKt.CompositionLocalProvider(arrayOfProvidedValue, (Function2)ComposableLambdaKt.rememberComposableLambda(-1142872516, true, new Function2<Composer, Integer, Unit>(this.$styling, this.$content) {
/*     */                 @Composable
/*     */                 public final void invoke(Composer $composer, int $changed) {
/*     */                   if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */                     if (ComposerKt.isTraceInProgress())
/*     */                       ComposerKt.traceEventStart(-1142872516, $changed, -1, "org.jetbrains.jewel.ui.theme.BaseJewelTheme.<anonymous>.<anonymous> (JewelTheme.kt:175)"); 
/*     */                     ProvidedValue[] arrayOfProvidedValue = this.$styling.styles($composer, 0);
/*     */                     CompositionLocalKt.CompositionLocalProvider(Arrays.<ProvidedValue>copyOf(arrayOfProvidedValue, arrayOfProvidedValue.length), this.$content, $composer, ProvidedValue.$stable);
/*     */                     if (ComposerKt.isTraceInProgress())
/*     */                       ComposerKt.traceEventEnd(); 
/*     */                   } else {
/*     */                     $composer.skipToGroupEnd();
/*     */                   } 
/*     */                 }
/*     */               }$composer, 54), $composer, 0x30 | ProvidedValue.$stable);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     JewelThemeKt$BaseJewelTheme$2(ThemeDefinition $theme, ComponentStyling $styling, Function2<Composer, Integer, Unit> $content) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\theme\JewelThemeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */