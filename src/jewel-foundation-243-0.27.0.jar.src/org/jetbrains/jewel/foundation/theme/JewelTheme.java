/*     */ package org.jetbrains.jewel.foundation.theme;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\002\bf\030\000 \0022\0020\001:\001\002¨\006\003"}, d2 = {"Lorg/jetbrains/jewel/foundation/theme/JewelTheme;", "", "Companion", "foundation"})
/*     */ public interface JewelTheme {
/*     */   @NotNull
/*     */   public static final Companion Companion = Companion.$$INSTANCE;
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\0058G¢\006\006\032\004\b\006\020\007R\021\020\b\032\0020\t8G¢\006\006\032\004\b\n\020\013R\021\020\f\032\0020\r8G¢\006\006\032\004\b\016\020\017R\032\020\020\032\0020\0218GX\004¢\006\f\022\004\b\022\020\003\032\004\b\023\020\024R\021\020\025\032\0020\0218G¢\006\006\032\004\b\026\020\024R\021\020\027\032\0020\0218G¢\006\006\032\004\b\030\020\024R\021\020\031\032\0020\0218G¢\006\006\032\004\b\032\020\024R\021\020\033\032\0020\0348G¢\006\006\032\004\b\035\020\036R\021\020\037\032\0020 8G¢\006\006\032\004\b\037\020!R\021\020\"\032\0020 8G¢\006\006\032\004\b\"\020!¨\006#"}, d2 = {"Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;", "", "<init>", "()V", "name", "", "getName", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "globalColors", "Lorg/jetbrains/jewel/foundation/GlobalColors;", "getGlobalColors", "(Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/foundation/GlobalColors;", "globalMetrics", "Lorg/jetbrains/jewel/foundation/GlobalMetrics;", "getGlobalMetrics", "(Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/foundation/GlobalMetrics;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle$annotations", "getTextStyle", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "defaultTextStyle", "getDefaultTextStyle", "editorTextStyle", "getEditorTextStyle", "consoleTextStyle", "getConsoleTextStyle", "contentColor", "Landroidx/compose/ui/graphics/Color;", "getContentColor", "(Landroidx/compose/runtime/Composer;I)J", "isDark", "", "(Landroidx/compose/runtime/Composer;I)Z", "isSwingCompatMode", "foundation"})
/*     */   @SourceDebugExtension({"SMAP\nJewelTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JewelTheme.kt\norg/jetbrains/jewel/foundation/theme/JewelTheme$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,124:1\n77#2:125\n77#2:126\n77#2:127\n77#2:128\n77#2:129\n77#2:130\n77#2:131\n77#2:132\n77#2:133\n*S KotlinDebug\n*F\n+ 1 JewelTheme.kt\norg/jetbrains/jewel/foundation/theme/JewelTheme$Companion\n*L\n18#1:125\n21#1:126\n24#1:127\n31#1:128\n34#1:129\n37#1:130\n40#1:131\n43#1:132\n46#1:133\n*E\n"})
/*     */   public static final class Companion {
/*     */     @Composable
/*     */     @ReadOnlyComposable
/*     */     @JvmName(name = "getName")
/*     */     @NotNull
/*  18 */     public final String getName(@Nullable Composer $composer, int $changed) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(523555685, $changed, -1, "org.jetbrains.jewel.foundation.theme.JewelTheme.Companion.<get-name> (JewelTheme.kt:17)");  CompositionLocal compositionLocal = (CompositionLocal)JewelThemeKt.getLocalThemeName(); int $changed$iv = 6, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 125 */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); String str = (String)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return str; } @Composable @ReadOnlyComposable @JvmName(name = "getGlobalColors") @NotNull public final GlobalColors getGlobalColors(@Nullable Composer $composer, int $changed) { if (ComposerKt.isTraceInProgress())
/* 126 */         ComposerKt.traceEventStart(1090396215, $changed, -1, "org.jetbrains.jewel.foundation.theme.JewelTheme.Companion.<get-globalColors> (JewelTheme.kt:20)");  CompositionLocal compositionLocal = (CompositionLocal)GlobalColorsKt.getLocalGlobalColors(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); GlobalColors globalColors = (GlobalColors)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return globalColors; } @Composable @ReadOnlyComposable @JvmName(name = "getGlobalMetrics") @NotNull public final GlobalMetrics getGlobalMetrics(@Nullable Composer $composer, int $changed) { if (ComposerKt.isTraceInProgress())
/* 127 */         ComposerKt.traceEventStart(-1848078676, $changed, -1, "org.jetbrains.jewel.foundation.theme.JewelTheme.Companion.<get-globalMetrics> (JewelTheme.kt:23)");  CompositionLocal compositionLocal = (CompositionLocal)GlobalMetricsKt.getLocalGlobalMetrics(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); GlobalMetrics globalMetrics = (GlobalMetrics)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return globalMetrics; } @Composable @ReadOnlyComposable @JvmName(name = "getDefaultTextStyle") @NotNull public final TextStyle getDefaultTextStyle(@Nullable Composer $composer, int $changed) { if (ComposerKt.isTraceInProgress())
/* 128 */         ComposerKt.traceEventStart(1530713950, $changed, -1, "org.jetbrains.jewel.foundation.theme.JewelTheme.Companion.<get-defaultTextStyle> (JewelTheme.kt:30)");  CompositionLocal compositionLocal = (CompositionLocal)JewelThemeKt.getLocalTextStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); TextStyle textStyle = (TextStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return textStyle; }
/* 129 */     @Composable @ReadOnlyComposable @JvmName(name = "getTextStyle") @NotNull public final TextStyle getTextStyle(@Nullable Composer $composer, int $changed) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(245666304, $changed, -1, "org.jetbrains.jewel.foundation.theme.JewelTheme.Companion.<get-textStyle> (JewelTheme.kt:27)");  TextStyle textStyle = getDefaultTextStyle($composer, 0xE & $changed); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return textStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getEditorTextStyle") @NotNull public final TextStyle getEditorTextStyle(@Nullable Composer $composer, int $changed) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(801882842, $changed, -1, "org.jetbrains.jewel.foundation.theme.JewelTheme.Companion.<get-editorTextStyle> (JewelTheme.kt:33)");  CompositionLocal compositionLocal = (CompositionLocal)JewelThemeKt.getLocalEditorTextStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); TextStyle textStyle = (TextStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return textStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getConsoleTextStyle") @NotNull public final TextStyle getConsoleTextStyle(@Nullable Composer $composer, int $changed) { if (ComposerKt.isTraceInProgress())
/* 130 */         ComposerKt.traceEventStart(-1807262434, $changed, -1, "org.jetbrains.jewel.foundation.theme.JewelTheme.Companion.<get-consoleTextStyle> (JewelTheme.kt:36)");  CompositionLocal compositionLocal = (CompositionLocal)JewelThemeKt.getLocalConsoleTextStyle(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); TextStyle textStyle = (TextStyle)object; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return textStyle; } @Composable @ReadOnlyComposable @JvmName(name = "getContentColor") public final long getContentColor(@Nullable Composer $composer, int $changed) { if (ComposerKt.isTraceInProgress())
/* 131 */         ComposerKt.traceEventStart(1164702877, $changed, -1, "org.jetbrains.jewel.foundation.theme.JewelTheme.Companion.<get-contentColor> (JewelTheme.kt:39)");  CompositionLocal compositionLocal = (CompositionLocal)JewelThemeKt.getLocalContentColor(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); long l = ((Color)object).unbox-impl(); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return l; } @Composable @ReadOnlyComposable @JvmName(name = "isDark") public final boolean isDark(@Nullable Composer $composer, int $changed) { if (ComposerKt.isTraceInProgress())
/* 132 */         ComposerKt.traceEventStart(-1007894750, $changed, -1, "org.jetbrains.jewel.foundation.theme.JewelTheme.Companion.<get-isDark> (JewelTheme.kt:42)");  CompositionLocal compositionLocal = (CompositionLocal)JewelThemeKt.getLocalIsDarkTheme(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); boolean bool = ((Boolean)object).booleanValue(); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  return bool; } @Composable @ReadOnlyComposable @JvmName(name = "isSwingCompatMode") public final boolean isSwingCompatMode(@Nullable Composer $composer, int $changed) { if (ComposerKt.isTraceInProgress())
/* 133 */         ComposerKt.traceEventStart(483777394, $changed, -1, "org.jetbrains.jewel.foundation.theme.JewelTheme.Companion.<get-isSwingCompatMode> (JewelTheme.kt:45)");  CompositionLocal compositionLocal = (CompositionLocal)JewelThemeKt.getLocalSwingCompatMode(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); boolean bool = ((Boolean)object).booleanValue();
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */       return bool; }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\theme\JewelTheme.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */