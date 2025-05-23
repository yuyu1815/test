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
/*    */ import org.jetbrains.jewel.bridge.theme.SwingBridgeThemeKt;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class JewelComposePanelKt$JewelToolWindowComposePanel$2$1
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(Composer $composer, int $changed) {
/* 45 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2146110070, $changed, -1, "org.jetbrains.jewel.bridge.JewelToolWindowComposePanel.<anonymous>.<anonymous> (JewelComposePanel.kt:44)");  JewelComposePanelKt.access$Compose17IJSizeBugWorkaround((Function2)ComposableLambdaKt.rememberComposableLambda(29922865, true, new Function2<Composer, Integer, Unit>(this.$this_createJewelComposePanel, this.$jewelPanel, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 46 */               public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(29922865, $changed, -1, "org.jetbrains.jewel.bridge.JewelToolWindowComposePanel.<anonymous>.<anonymous>.<anonymous> (JewelComposePanel.kt:45)");  SwingBridgeThemeKt.SwingBridgeTheme((Function2)ComposableLambdaKt.rememberComposableLambda(1452848738, true, new Function2<Composer, Integer, Unit>(this.$this_createJewelComposePanel, this.$jewelPanel, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 47 */                           public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1452848738, $changed, -1, "org.jetbrains.jewel.bridge.JewelToolWindowComposePanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JewelComposePanel.kt:46)");  CompositionLocalKt.CompositionLocalProvider(JewelComposePanelKt.getLocalComponent().provides(this.$this_createJewelComposePanel), (Function2)ComposableLambdaKt.rememberComposableLambda(1432996258, true, new Function2<Composer, Integer, Unit>(this.$jewelPanel, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 48 */                                       public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1432996258, $changed, -1, "org.jetbrains.jewel.bridge.JewelToolWindowComposePanel.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JewelComposePanel.kt:47)");  ComponentDataProviderBridgeKt.ComponentDataProviderBridge(this.$jewelPanel, null, this.$content, $composer, 0, 2); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }$composer, 54), $composer, 0x30 | ProvidedValue.$stable); if (ComposerKt.isTraceInProgress())
/* 49 */                                 ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }$composer, 54), $composer, 6); if (ComposerKt.isTraceInProgress())
/* 50 */                     ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }$composer, 54), $composer, 6); if (ComposerKt.isTraceInProgress())
/* 51 */         ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   JewelComposePanelKt$JewelToolWindowComposePanel$2$1(ComposePanel $this_createJewelComposePanel, JewelComposePanel $jewelPanel, Function2<Composer, Integer, Unit> $content) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\JewelComposePanelKt$JewelToolWindowComposePanel$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */