/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;
/*     */ 
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.jewel.ui.component.IconButtonState;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ final class ChainRecapKt$PlanIndexButton$1
/*     */   implements Function4<BoxScope, IconButtonState, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke-KMTpdl8(BoxScope $this$IconButton, long it, Composer $composer, int $changed) {
/* 126 */     Intrinsics.checkNotNullParameter($this$IconButton, "$this$IconButton"); if (($changed & 0x81) != 128 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2120813355, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.PlanIndexButton.<anonymous> (ChainRecap.kt:125)");  $composer.startReplaceGroup(177166624); long l1 = this.$selected ? MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getOnboardingDotsColor-0d7_KjU() : Color.Companion.getUnspecified-0d7_KjU(); $composer.endReplaceGroup(); long color = l1;
/* 127 */       TextKt.Text-bAzTDeA(String.valueOf(this.$taskIndex + 1), null, color, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65530); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   ChainRecapKt$PlanIndexButton$1(boolean $selected, int $taskIndex) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\ChainRecapKt$PlanIndexButton$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */