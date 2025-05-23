/*     */ package org.jetbrains.jewel.bridge.theme;
/*     */ 
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.DpKt;
/*     */ import androidx.compose.ui.unit.DpSize;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.SliderColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.SliderMetrics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\023\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\032§\001\020\000\032\0020\001*\0020\0022\b\b\002\020\003\032\0020\0042\b\b\002\020\005\032\0020\0042\b\b\002\020\006\032\0020\0042\b\b\002\020\007\032\0020\0042\b\b\002\020\b\032\0020\0042\b\b\002\020\t\032\0020\0042\b\b\002\020\n\032\0020\0042\b\b\002\020\013\032\0020\0042\b\b\002\020\f\032\0020\0042\b\b\002\020\r\032\0020\0042\b\b\002\020\016\032\0020\0042\b\b\002\020\017\032\0020\0042\b\b\002\020\020\032\0020\0042\b\b\002\020\021\032\0020\0042\b\b\002\020\022\032\0020\004¢\006\004\b\023\020\024\032§\001\020\025\032\0020\001*\0020\0022\b\b\002\020\003\032\0020\0042\b\b\002\020\005\032\0020\0042\b\b\002\020\006\032\0020\0042\b\b\002\020\007\032\0020\0042\b\b\002\020\b\032\0020\0042\b\b\002\020\t\032\0020\0042\b\b\002\020\n\032\0020\0042\b\b\002\020\013\032\0020\0042\b\b\002\020\f\032\0020\0042\b\b\002\020\r\032\0020\0042\b\b\002\020\016\032\0020\0042\b\b\002\020\017\032\0020\0042\b\b\002\020\020\032\0020\0042\b\b\002\020\021\032\0020\0042\b\b\002\020\022\032\0020\004¢\006\004\b\026\020\024\032M\020\027\032\0020\030*\0020\0312\b\b\002\020\032\032\0020\0332\b\b\002\020\034\032\0020\0352\b\b\002\020\036\032\0020\0332\b\b\002\020\037\032\0020\0332\b\b\002\020 \032\0020\0332\b\b\002\020!\032\0020\033¢\006\004\b\"\020#¨\006$"}, d2 = {"light", "Lorg/jetbrains/jewel/ui/component/styling/SliderColors;", "Lorg/jetbrains/jewel/ui/component/styling/SliderColors$Companion;", "track", "Landroidx/compose/ui/graphics/Color;", "trackFilled", "trackDisabled", "trackFilledDisabled", "stepMarker", "thumbFill", "thumbFillDisabled", "thumbFillFocused", "thumbFillPressed", "thumbFillHovered", "thumbBorder", "thumbBorderFocused", "thumbBorderDisabled", "thumbBorderPressed", "thumbBorderHovered", "light-7HESe_I", "(Lorg/jetbrains/jewel/ui/component/styling/SliderColors$Companion;JJJJJJJJJJJJJJJ)Lorg/jetbrains/jewel/ui/component/styling/SliderColors;", "dark", "dark-7HESe_I", "defaults", "Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;", "Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics$Companion;", "trackHeight", "Landroidx/compose/ui/unit/Dp;", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "thumbBorderWidth", "stepLineHeight", "stepLineWidth", "trackToStepSpacing", "defaults-IDSuZpE", "(Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics$Companion;FJFFFF)Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;", "ide-laf-bridge"})
/*     */ @SourceDebugExtension({"SMAP\nBridgeSliderStyling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeSliderStyling.kt\norg/jetbrains/jewel/bridge/theme/BridgeSliderStylingKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,91:1\n708#2:92\n696#2:93\n708#2:94\n696#2:95\n708#2:96\n696#2:97\n708#2:98\n696#2:99\n708#2:100\n696#2:101\n708#2:102\n696#2:103\n708#2:104\n696#2:105\n708#2:106\n696#2:107\n708#2:108\n696#2:109\n708#2:110\n696#2:111\n708#2:112\n696#2:113\n708#2:114\n696#2:115\n708#2:116\n696#2:117\n708#2:118\n696#2:119\n708#2:120\n696#2:121\n708#2:122\n696#2:123\n708#2:124\n696#2:125\n708#2:126\n696#2:127\n708#2:128\n696#2:129\n708#2:130\n696#2:131\n708#2:132\n696#2:133\n149#3:134\n149#3:135\n149#3:136\n149#3:137\n149#3:138\n149#3:140\n72#4:139\n51#4:141\n*S KotlinDebug\n*F\n+ 1 BridgeSliderStyling.kt\norg/jetbrains/jewel/bridge/theme/BridgeSliderStylingKt\n*L\n13#1:92\n13#1:93\n14#1:94\n14#1:95\n15#1:96\n15#1:97\n16#1:98\n16#1:99\n18#1:100\n18#1:101\n23#1:102\n23#1:103\n24#1:104\n24#1:105\n25#1:106\n25#1:107\n26#1:108\n26#1:109\n27#1:110\n27#1:111\n48#1:112\n48#1:113\n49#1:114\n49#1:115\n50#1:116\n50#1:117\n51#1:118\n51#1:119\n53#1:120\n53#1:121\n54#1:122\n54#1:123\n58#1:124\n58#1:125\n59#1:126\n59#1:127\n60#1:128\n60#1:129\n61#1:130\n61#1:131\n62#1:132\n62#1:133\n83#1:134\n84#1:135\n85#1:136\n86#1:137\n87#1:138\n88#1:140\n88#1:139\n88#1:141\n*E\n"})
/*     */ public final class BridgeSliderStylingKt
/*     */ {
/*     */   @NotNull
/*     */   public static final SliderColors light-7HESe_I(@NotNull SliderColors.Companion $this$light_u2d7HESe_I, long track, long trackFilled, long trackDisabled, long trackFilledDisabled, long stepMarker, long thumbFill, long thumbFillDisabled, long thumbFillFocused, long thumbFillPressed, long thumbFillHovered, long thumbBorder, long thumbBorderFocused, long thumbBorderDisabled, long thumbBorderPressed, long thumbBorderHovered) {
/*  29 */     Intrinsics.checkNotNullParameter($this$light_u2d7HESe_I, "$this$light"); return new SliderColors(
/*  30 */         track, 
/*  31 */         trackFilled, 
/*  32 */         trackDisabled, 
/*  33 */         trackFilledDisabled, 
/*  34 */         stepMarker, 
/*  35 */         thumbFill, 
/*  36 */         thumbFillDisabled, 
/*  37 */         thumbFillFocused, 
/*  38 */         thumbFillPressed, 
/*  39 */         thumbFillHovered, 
/*  40 */         thumbBorder, 
/*  41 */         thumbBorderFocused, 
/*  42 */         thumbBorderDisabled, 
/*  43 */         thumbBorderPressed, 
/*  44 */         thumbBorderHovered, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final SliderColors dark-7HESe_I(@NotNull SliderColors.Companion $this$dark_u2d7HESe_I, long track, long trackFilled, long trackDisabled, long trackFilledDisabled, long stepMarker, long thumbFill, long thumbFillDisabled, long thumbFillFocused, long thumbFillPressed, long thumbFillHovered, long thumbBorder, long thumbBorderFocused, long thumbBorderDisabled, long thumbBorderPressed, long thumbBorderHovered) {
/*  64 */     Intrinsics.checkNotNullParameter($this$dark_u2d7HESe_I, "$this$dark"); return new SliderColors(
/*  65 */         track, 
/*  66 */         trackFilled, 
/*  67 */         trackDisabled, 
/*  68 */         trackFilledDisabled, 
/*  69 */         stepMarker, 
/*  70 */         thumbFill, 
/*  71 */         thumbFillDisabled, 
/*  72 */         thumbFillFocused, 
/*  73 */         thumbFillPressed, 
/*  74 */         thumbFillHovered, 
/*  75 */         thumbBorder, 
/*  76 */         thumbBorderFocused, 
/*  77 */         thumbBorderDisabled, 
/*  78 */         thumbBorderPressed, 
/*  79 */         thumbBorderHovered, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final SliderMetrics defaults-IDSuZpE(@NotNull SliderMetrics.Companion $this$defaults_u2dIDSuZpE, float trackHeight, long thumbSize, float thumbBorderWidth, float stepLineHeight, float stepLineWidth, float trackToStepSpacing) {
/*  90 */     Intrinsics.checkNotNullParameter($this$defaults_u2dIDSuZpE, "$this$defaults"); return new SliderMetrics(trackHeight, thumbSize, thumbBorderWidth, stepLineHeight, stepLineWidth, trackToStepSpacing, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\BridgeSliderStylingKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */