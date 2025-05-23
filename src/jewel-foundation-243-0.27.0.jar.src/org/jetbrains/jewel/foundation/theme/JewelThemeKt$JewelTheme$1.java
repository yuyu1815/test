/*    */ package org.jetbrains.jewel.foundation.theme;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
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
/*    */ final class JewelThemeKt$JewelTheme$1
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   JewelThemeKt$JewelTheme$1(ThemeDefinition $theme, Function2<Composer, Integer, Unit> $content) {}
/*    */   
/*    */   @Composable
/*    */   public final void invoke(Composer $composer, int $changed) {
/* 52 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(101291278, $changed, -1, "org.jetbrains.jewel.foundation.theme.JewelTheme.<anonymous> (JewelTheme.kt:51)");  JewelThemeKt.JewelTheme(this.$theme, this.$content, $composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\theme\JewelThemeKt$JewelTheme$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */