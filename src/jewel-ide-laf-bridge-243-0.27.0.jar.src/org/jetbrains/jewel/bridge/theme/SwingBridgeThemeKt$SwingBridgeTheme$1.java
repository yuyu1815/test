/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocal;
/*    */ import androidx.compose.runtime.CompositionLocalKt;
/*    */ import androidx.compose.runtime.ProvidedValue;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*    */ import androidx.compose.ui.platform.CompositionLocalsKt;
/*    */ import androidx.compose.ui.unit.Density;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.jewel.bridge.BridgePainterHintsProvider;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ import org.jetbrains.jewel.bridge.SwingBridgeService;
/*    */ import org.jetbrains.jewel.bridge.icon.BridgeNewUiChecker;
/*    */ import org.jetbrains.jewel.ui.icon.NewUiCheckerKt;
/*    */ import org.jetbrains.jewel.ui.painter.PainterHintsProviderKt;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nSwingBridgeTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwingBridgeTheme.kt\norg/jetbrains/jewel/bridge/theme/SwingBridgeThemeKt$SwingBridgeTheme$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,39:1\n77#2:40\n*S KotlinDebug\n*F\n+ 1 SwingBridgeTheme.kt\norg/jetbrains/jewel/bridge/theme/SwingBridgeThemeKt$SwingBridgeTheme$1\n*L\n33#1:40\n*E\n"})
/*    */ final class SwingBridgeThemeKt$SwingBridgeTheme$1
/*    */   implements Function2<Composer, Integer, Unit> {
/*    */   @Composable
/*    */   public final void invoke(Composer $composer, int $changed) {
/* 30 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-403644589, $changed, -1, "org.jetbrains.jewel.bridge.theme.SwingBridgeTheme.<anonymous> (SwingBridgeTheme.kt:29)"); 
/* 31 */       ProvidedValue[] arrayOfProvidedValue = new ProvidedValue[3]; arrayOfProvidedValue[0] = PainterHintsProviderKt.getLocalPainterHintsProvider().provides(BridgePainterHintsProvider.Companion.invoke(SwingBridgeThemeKt.access$SwingBridgeTheme$lambda$1(this.$themeData$delegate).getThemeDefinition().isDark())); arrayOfProvidedValue[1] = 
/* 32 */         NewUiCheckerKt.getLocalNewUiChecker().provides(BridgeNewUiChecker.INSTANCE);
/* 33 */       CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalDensity(); int $changed$iv = 0, $i$f$getCurrent = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 40 */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); arrayOfProvidedValue[2] = CompositionLocalsKt.getLocalDensity().provides(BridgeUtilsKt.scaleDensityWithIdeScale((Density)object));
/*    */       CompositionLocalKt.CompositionLocalProvider(arrayOfProvidedValue, (Function2)ComposableLambdaKt.rememberComposableLambda(1920246803, true, new Function2<Composer, Integer, Unit>(this.$content) {
/*    */               @Composable
/*    */               public final void invoke(Composer $composer, int $changed) {
/*    */                 if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*    */                   if (ComposerKt.isTraceInProgress())
/*    */                     ComposerKt.traceEventStart(1920246803, $changed, -1, "org.jetbrains.jewel.bridge.theme.SwingBridgeTheme.<anonymous>.<anonymous> (SwingBridgeTheme.kt:34)"); 
/*    */                   this.$content.invoke($composer, Integer.valueOf(0));
/*    */                   if (ComposerKt.isTraceInProgress())
/*    */                     ComposerKt.traceEventEnd(); 
/*    */                 } else {
/*    */                   $composer.skipToGroupEnd();
/*    */                 } 
/*    */               }
/*    */             }$composer, 54), $composer, 0x30 | ProvidedValue.$stable);
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd();  }
/*    */     else
/*    */     { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   SwingBridgeThemeKt$SwingBridgeTheme$1(State<SwingBridgeService.BridgeThemeData> $themeData$delegate, Function2<Composer, Integer, Unit> $content) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\SwingBridgeThemeKt$SwingBridgeTheme$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */