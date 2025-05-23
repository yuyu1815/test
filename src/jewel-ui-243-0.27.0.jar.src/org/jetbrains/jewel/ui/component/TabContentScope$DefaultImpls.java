/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.draw.AlphaKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.theme.JewelTheme;
/*    */ import org.jetbrains.jewel.ui.theme.JewelThemeKt;
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
/*    */ public final class DefaultImpls
/*    */ {
/*    */   @Composable
/*    */   @NotNull
/*    */   public static Modifier tabContentAlpha-A_ZS63w(@NotNull TabContentScope $this, @NotNull Modifier $receiver, long state, @Nullable Composer $composer, int $changed) {
/* 55 */     Intrinsics.checkNotNullParameter($receiver, "$receiver"); $composer.startReplaceGroup(-2132746608); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2132746608, $changed, -1, "org.jetbrains.jewel.ui.component.TabContentScope.tabContentAlpha (Tabs.kt:54)");  Modifier modifier = AlphaKt.alpha($receiver, ((Number)JewelThemeKt.getEditorTabStyle(JewelTheme.Companion, $composer, 6).getContentAlpha().contentFor-UXw_FYk(state, $composer, 0xE & $changed >> 3).getValue()).floatValue()); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return modifier;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TabContentScope$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */