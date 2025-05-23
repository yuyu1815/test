/*     */ package org.jetbrains.jewel.bridge.theme;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.time.DurationKt;
/*     */ import kotlin.time.DurationUnit;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.ScrollbarColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility;
/*     */ import org.jetbrains.skiko.OsArch_jvmKt;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000^\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\000\032\020\020\004\032\0020\0052\006\020\002\032\0020\003H\002\032\020\020\006\032\0020\0052\006\020\002\032\0020\003H\002\032\020\020\007\032\0020\0052\006\020\002\032\0020\003H\002\032\b\020\b\032\0020\tH\002\032\b\020\n\032\0020\013H\002\032\b\020\f\032\0020\rH\002\032\n\020\016\032\0020\017*\0020\020\032a\020\021\032\0020\017*\0020\0202\b\b\002\020\022\032\0020\0232\b\b\002\020\024\032\0020\0232\b\b\002\020\025\032\0020\0262\b\b\002\020\027\032\0020\0262\b\b\002\020\030\032\0020\0312\b\b\002\020\032\032\0020\0312\b\b\002\020\033\032\0020\0312\b\b\002\020\034\032\0020\031¢\006\004\b\035\020\036\032a\020\037\032\0020\017*\0020\0202\b\b\002\020\022\032\0020\0232\b\b\002\020\024\032\0020\0232\b\b\002\020\025\032\0020\0262\b\b\002\020\027\032\0020\0262\b\b\002\020\030\032\0020\0312\b\b\002\020\032\032\0020\0312\b\b\002\020\033\032\0020\0312\b\b\002\020\034\032\0020\031¢\006\004\b \020\036\032\n\020\016\032\0020!*\0020\"\032C\020\021\032\0020!*\0020\"2\b\b\002\020\022\032\0020\0232\b\b\002\020\025\032\0020\0262\b\b\002\020\033\032\0020\0312\b\b\002\020#\032\0020$2\b\b\002\020%\032\0020$¢\006\004\b&\020'\0329\020\037\032\0020!*\0020\"2\b\b\002\020\022\032\0020\0232\b\b\002\020\025\032\0020\0262\b\b\002\020\033\032\0020\0312\b\b\002\020\030\032\0020\031¢\006\004\b(\020)¨\006*"}, d2 = {"readScrollbarStyle", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;", "isDark", "", "readScrollbarColors", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarColors;", "readScrollbarMacColors", "readScrollbarWindowsAndLinuxColors", "readScrollbarMetrics", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarMetrics;", "readTrackClickBehavior", "Lorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;", "readScrollbarVisibility", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;", "default", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$WhenScrolling;", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$WhenScrolling$Companion;", "macOs", "trackThickness", "Landroidx/compose/ui/unit/Dp;", "trackThicknessExpanded", "trackPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "trackPaddingWithBorder", "trackColorAnimationDuration", "Lkotlin/time/Duration;", "expandAnimationDuration", "thumbColorAnimationDuration", "lingerDuration", "macOs-TZvXluI", "(Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$WhenScrolling$Companion;FFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;JJJJ)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$WhenScrolling;", "windowsAndLinux", "windowsAndLinux-TZvXluI", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$AlwaysVisible;", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$AlwaysVisible$Companion;", "scrollbarBackgroundColorLight", "Landroidx/compose/ui/graphics/Color;", "scrollbarBackgroundColorDark", "macOs-fYp4AQw", "(Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$AlwaysVisible$Companion;FLandroidx/compose/foundation/layout/PaddingValues;JJJ)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$AlwaysVisible;", "windowsAndLinux-tYhzLtE", "(Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$AlwaysVisible$Companion;FLandroidx/compose/foundation/layout/PaddingValues;JJ)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$AlwaysVisible;", "ide-laf-bridge"})
/*     */ @SourceDebugExtension({"SMAP\nScrollbarBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollbarBridge.kt\norg/jetbrains/jewel/bridge/theme/ScrollbarBridgeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,319:1\n149#2:320\n149#2:321\n149#2:322\n149#2:323\n149#2:324\n149#2:325\n149#2:326\n149#2:327\n149#2:328\n149#2:329\n149#2:330\n159#2:331\n*S KotlinDebug\n*F\n+ 1 ScrollbarBridge.kt\norg/jetbrains/jewel/bridge/theme/ScrollbarBridgeKt\n*L\n212#1:320\n214#1:321\n239#1:322\n240#1:323\n241#1:324\n242#1:325\n260#1:326\n261#1:327\n288#1:328\n289#1:329\n305#1:330\n306#1:331\n*E\n"})
/*     */ public final class ScrollbarBridgeKt {
/*     */   @NotNull
/*     */   public static final ScrollbarStyle readScrollbarStyle(boolean isDark) {
/*  20 */     return new ScrollbarStyle(
/*  21 */         readScrollbarColors(isDark), 
/*  22 */         readScrollbarMetrics(), 
/*  23 */         readTrackClickBehavior(), 
/*  24 */         readScrollbarVisibility());
/*     */   }
/*     */   
/*     */   private static final ScrollbarColors readScrollbarColors(boolean isDark) {
/*  28 */     return OsArch_jvmKt.getHostOs().isMacOS() ? 
/*  29 */       readScrollbarMacColors(isDark) : 
/*     */       
/*  31 */       readScrollbarWindowsAndLinuxColors(isDark);
/*     */   }
/*     */   
/*     */   private static final ScrollbarColors readScrollbarMacColors(boolean isDark) {
/*  35 */     return new ScrollbarColors(
/*     */         
/*  37 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/*  38 */           "ScrollBar.Mac.Transparent.thumbColor", 
/*  39 */           isDark, 
/*  40 */           ColorKt.Color(0), 
/*  41 */           ColorKt.Color(8421504)), 
/*     */ 
/*     */         
/*  44 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/*  45 */           "ScrollBar.Mac.Transparent.hoverThumbColor", 
/*  46 */           isDark, 
/*  47 */           ColorKt.Color(2147483648L), 
/*  48 */           ColorKt.Color(2357231744L)), 
/*     */ 
/*     */         
/*  51 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/*  52 */           "ScrollBar.Mac.thumbColor", 
/*  53 */           isDark, 
/*  54 */           ColorKt.Color(855638016), 
/*  55 */           ColorKt.Color(1501593728)), 
/*     */ 
/*     */         
/*  58 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/*  59 */           "ScrollBar.Mac.hoverThumbColor", 
/*  60 */           isDark, 
/*  61 */           ColorKt.Color(2147483648L), 
/*  62 */           ColorKt.Color(2357231744L)), 
/*     */ 
/*     */         
/*  65 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/*  66 */           "ScrollBar.Mac.Transparent.thumbBorderColor", 
/*  67 */           isDark, 
/*  68 */           ColorKt.Color(0), 
/*  69 */           ColorKt.Color(2500134)), 
/*     */ 
/*     */         
/*  72 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/*  73 */           "ScrollBar.Mac.Transparent.hoverThumbBorderColor", 
/*  74 */           isDark, 
/*  75 */           ColorKt.Color(2147483648L), 
/*  76 */           ColorKt.Color(2351310374L)), 
/*     */ 
/*     */         
/*  79 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/*  80 */           "ScrollBar.Mac.thumbBorderColor", 
/*  81 */           isDark, 
/*  82 */           ColorKt.Color(855638016), 
/*  83 */           ColorKt.Color(1495672358)), 
/*     */ 
/*     */         
/*  86 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/*  87 */           "ScrollBar.Mac.hoverThumbBorderColor", 
/*  88 */           isDark, 
/*  89 */           ColorKt.Color(2147483648L), 
/*  90 */           ColorKt.Color(2351310374L)), 
/*     */ 
/*     */         
/*  93 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/*  94 */           "ScrollBar.Mac.Transparent.trackColor", 
/*  95 */           isDark, 
/*  96 */           ColorKt.Color(8421504), 
/*  97 */           ColorKt.Color(8421504)), 
/*     */ 
/*     */         
/* 100 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 101 */           "ScrollBar.Mac.Transparent.hoverTrackColor", 
/* 102 */           isDark, 
/* 103 */           ColorKt.Color(444629120), 
/* 104 */           ColorKt.Color(444629120)), 
/*     */ 
/*     */         
/* 107 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 108 */           "ScrollBar.Mac.trackColor", 
/* 109 */           isDark, 
/* 110 */           ColorKt.Color(8421504), 
/* 111 */           ColorKt.Color(8421504)), 
/*     */ 
/*     */         
/* 114 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 115 */           "ScrollBar.Mac.hoverTrackColor", 
/* 116 */           isDark, 
/* 117 */           ColorKt.Color(8421504), 
/* 118 */           ColorKt.Color(8421504)), null);
/*     */   }
/*     */ 
/*     */   
/*     */   private static final ScrollbarColors readScrollbarWindowsAndLinuxColors(boolean isDark) {
/* 123 */     return new ScrollbarColors(
/*     */         
/* 125 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 126 */           "ScrollBar.Transparent.thumbColor", 
/* 127 */           isDark, 
/* 128 */           ColorKt.Color(863204211), 
/* 129 */           ColorKt.Color(1202103974)), 
/*     */ 
/*     */         
/* 132 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 133 */           "ScrollBar.Transparent.hoverThumbColor", 
/* 134 */           isDark, 
/* 135 */           ColorKt.Color(1198748531), 
/* 136 */           ColorKt.Color(1504093862)), 
/*     */ 
/*     */         
/* 139 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 140 */           "ScrollBar.thumbColor", 
/* 141 */           isDark, 
/* 142 */           ColorKt.Color(863204211), 
/* 143 */           ColorKt.Color(1202103974)), 
/*     */ 
/*     */         
/* 146 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 147 */           "ScrollBar.hoverThumbColor", 
/* 148 */           isDark, 
/* 149 */           ColorKt.Color(1198748531), 
/* 150 */           ColorKt.Color(1504093862)), 
/*     */ 
/*     */         
/* 153 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 154 */           "ScrollBar.Transparent.thumbBorderColor", 
/* 155 */           isDark, 
/* 156 */           ColorKt.Color(861493593), 
/* 157 */           ColorKt.Color(1194866744)), 
/*     */ 
/*     */         
/* 160 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 161 */           "ScrollBar.Transparent.hoverThumbBorderColor", 
/* 162 */           isDark, 
/* 163 */           ColorKt.Color(1197037913), 
/* 164 */           ColorKt.Color(1496856632)), 
/*     */ 
/*     */         
/* 167 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 168 */           "ScrollBar.thumbBorderColor", 
/* 169 */           isDark, 
/* 170 */           ColorKt.Color(861493593), 
/* 171 */           ColorKt.Color(1194866744)), 
/*     */ 
/*     */         
/* 174 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 175 */           "ScrollBar.hoverThumbBorderColor", 
/* 176 */           isDark, 
/* 177 */           ColorKt.Color(1197037913), 
/* 178 */           ColorKt.Color(1496856632)), 
/*     */ 
/*     */         
/* 181 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 182 */           "ScrollBar.Transparent.trackColor", 
/* 183 */           isDark, 
/* 184 */           ColorKt.Color(8421504), 
/* 185 */           ColorKt.Color(8421504)), 
/*     */ 
/*     */         
/* 188 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 189 */           "ScrollBar.Transparent.hoverTrackColor", 
/* 190 */           isDark, 
/* 191 */           ColorKt.Color(444629120), 
/* 192 */           ColorKt.Color(444629120)), 
/*     */ 
/*     */         
/* 195 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 196 */           "ScrollBar.trackColor", 
/* 197 */           isDark, 
/* 198 */           ColorKt.Color(8421504), 
/* 199 */           ColorKt.Color(8421504)), 
/*     */ 
/*     */         
/* 202 */         BridgeUtilsKt.retrieveColor-0YGnOg8(
/* 203 */           "ScrollBar.hoverTrackColor", 
/* 204 */           isDark, 
/* 205 */           ColorKt.Color(8421504), 
/* 206 */           ColorKt.Color(8421504)), null);
/*     */   }
/*     */ 
/*     */   
/*     */   private static final ScrollbarMetrics readScrollbarMetrics() {
/* 211 */     if (OsArch_jvmKt.getHostOs().isMacOS())
/* 212 */     { int $this$dp$iv = 24, $i$f$getDp = 0; }
/*     */     else
/* 214 */     { int $this$dp$iv = 24, $i$f$getDp = 0; }  return new ScrollbarMetrics(CornerSizeKt.CornerSize(0), 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 321 */         Dp.constructor-impl($this$dp$iv), null);
/*     */   }
/*     */   
/*     */   private static final TrackClickBehavior readTrackClickBehavior() {
/*     */     return OsArch_jvmKt.getHostOs().isMacOS() ? (TrackClickBehavior)ScrollbarHelper.Companion.getInstance().getTrackClickBehaviorFlow().getValue() : TrackClickBehavior.JumpToSpot;
/*     */   }
/*     */   
/*     */   private static final ScrollbarVisibility readScrollbarVisibility() {
/*     */     return OsArch_jvmKt.getHostOs().isMacOS() ? (ScrollbarVisibility)ScrollbarHelper.Companion.getInstance().getScrollbarVisibilityStyleFlow().getValue() : (ScrollbarVisibility)windowsAndLinux-tYhzLtE$default(ScrollbarVisibility.AlwaysVisible.Companion, 0.0F, null, 0L, 0L, 15, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ScrollbarVisibility.WhenScrolling default(@NotNull ScrollbarVisibility.WhenScrolling.Companion $this$default) {
/*     */     Intrinsics.checkNotNullParameter($this$default, "<this>");
/*     */     return OsArch_jvmKt.getHostOs().isMacOS() ? macOs-TZvXluI$default(ScrollbarVisibility.WhenScrolling.Companion, 0.0F, 0.0F, null, null, 0L, 0L, 0L, 0L, 255, null) : windowsAndLinux-TZvXluI$default(ScrollbarVisibility.WhenScrolling.Companion, 0.0F, 0.0F, null, null, 0L, 0L, 0L, 0L, 255, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ScrollbarVisibility.WhenScrolling macOs-TZvXluI(@NotNull ScrollbarVisibility.WhenScrolling.Companion $this$macOs_u2dTZvXluI, float trackThickness, float trackThicknessExpanded, @NotNull PaddingValues trackPadding, @NotNull PaddingValues trackPaddingWithBorder, long trackColorAnimationDuration, long expandAnimationDuration, long thumbColorAnimationDuration, long lingerDuration) {
/*     */     Intrinsics.checkNotNullParameter($this$macOs_u2dTZvXluI, "$this$macOs");
/*     */     Intrinsics.checkNotNullParameter(trackPadding, "trackPadding");
/*     */     Intrinsics.checkNotNullParameter(trackPaddingWithBorder, "trackPaddingWithBorder");
/*     */     return new ScrollbarVisibility.WhenScrolling(trackThickness, trackThicknessExpanded, trackPadding, trackPaddingWithBorder, trackColorAnimationDuration, expandAnimationDuration, thumbColorAnimationDuration, lingerDuration, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ScrollbarVisibility.WhenScrolling windowsAndLinux-TZvXluI(@NotNull ScrollbarVisibility.WhenScrolling.Companion $this$windowsAndLinux_u2dTZvXluI, float trackThickness, float trackThicknessExpanded, @NotNull PaddingValues trackPadding, @NotNull PaddingValues trackPaddingWithBorder, long trackColorAnimationDuration, long expandAnimationDuration, long thumbColorAnimationDuration, long lingerDuration) {
/*     */     Intrinsics.checkNotNullParameter($this$windowsAndLinux_u2dTZvXluI, "$this$windowsAndLinux");
/*     */     Intrinsics.checkNotNullParameter(trackPadding, "trackPadding");
/*     */     Intrinsics.checkNotNullParameter(trackPaddingWithBorder, "trackPaddingWithBorder");
/*     */     return new ScrollbarVisibility.WhenScrolling(trackThickness, trackThicknessExpanded, trackPadding, trackPaddingWithBorder, trackColorAnimationDuration, expandAnimationDuration, thumbColorAnimationDuration, lingerDuration, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ScrollbarVisibility.AlwaysVisible default(@NotNull ScrollbarVisibility.AlwaysVisible.Companion $this$default) {
/*     */     Intrinsics.checkNotNullParameter($this$default, "<this>");
/*     */     return OsArch_jvmKt.getHostOs().isMacOS() ? macOs-fYp4AQw$default(ScrollbarVisibility.AlwaysVisible.Companion, 0.0F, null, 0L, 0L, 0L, 31, null) : windowsAndLinux-tYhzLtE$default(ScrollbarVisibility.AlwaysVisible.Companion, 0.0F, null, 0L, 0L, 15, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ScrollbarVisibility.AlwaysVisible macOs-fYp4AQw(@NotNull ScrollbarVisibility.AlwaysVisible.Companion $this$macOs_u2dfYp4AQw, float trackThickness, @NotNull PaddingValues trackPadding, long thumbColorAnimationDuration, long scrollbarBackgroundColorLight, long scrollbarBackgroundColorDark) {
/*     */     Intrinsics.checkNotNullParameter($this$macOs_u2dfYp4AQw, "$this$macOs");
/*     */     Intrinsics.checkNotNullParameter(trackPadding, "trackPadding");
/*     */     return new ScrollbarVisibility.AlwaysVisible(trackThickness, trackPadding, trackPadding, thumbColorAnimationDuration, DurationKt.toDuration(0, DurationUnit.MILLISECONDS), scrollbarBackgroundColorLight, scrollbarBackgroundColorDark, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ScrollbarVisibility.AlwaysVisible windowsAndLinux-tYhzLtE(@NotNull ScrollbarVisibility.AlwaysVisible.Companion $this$windowsAndLinux_u2dtYhzLtE, float trackThickness, @NotNull PaddingValues trackPadding, long thumbColorAnimationDuration, long trackColorAnimationDuration) {
/*     */     Intrinsics.checkNotNullParameter($this$windowsAndLinux_u2dtYhzLtE, "$this$windowsAndLinux");
/*     */     Intrinsics.checkNotNullParameter(trackPadding, "trackPadding");
/*     */     return new ScrollbarVisibility.AlwaysVisible(trackThickness, trackPadding, trackPadding, thumbColorAnimationDuration, trackColorAnimationDuration, Color.Companion.getUnspecified-0d7_KjU(), Color.Companion.getUnspecified-0d7_KjU(), null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\ScrollbarBridgeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */