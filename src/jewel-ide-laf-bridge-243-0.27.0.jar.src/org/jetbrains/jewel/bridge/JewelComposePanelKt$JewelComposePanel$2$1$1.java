/*    */ package org.jetbrains.jewel.bridge;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocalKt;
/*    */ import androidx.compose.runtime.ProvidedValue;
/*    */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*    */ import androidx.compose.ui.awt.ComposePanel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import org.jetbrains.jewel.bridge.actionSystem.ComponentDataProviderBridgeKt;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class null
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(Composer $composer, int $changed) {
/* 30 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(51221343, $changed, -1, "org.jetbrains.jewel.bridge.JewelComposePanel.<anonymous>.<anonymous>.<anonymous> (JewelComposePanel.kt:29)");  CompositionLocalKt.CompositionLocalProvider(JewelComposePanelKt.getLocalComponent().provides(this.$this_createJewelComposePanel), (Function2)ComposableLambdaKt.rememberComposableLambda(83879583, true, new Function2<Composer, Integer, Unit>(this.$jewelPanel, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 31 */               public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(83879583, $changed, -1, "org.jetbrains.jewel.bridge.JewelComposePanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JewelComposePanel.kt:30)");  ComponentDataProviderBridgeKt.ComponentDataProviderBridge(this.$jewelPanel, null, this.$content, $composer, 0, 2); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }$composer, 54), $composer, 0x30 | ProvidedValue.$stable); if (ComposerKt.isTraceInProgress())
/* 32 */         ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   null(ComposePanel $this_createJewelComposePanel, JewelComposePanel $jewelPanel, Function2<Composer, Integer, Unit> $content) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\JewelComposePanelKt$JewelComposePanel$2$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */