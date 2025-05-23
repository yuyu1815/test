/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.steps;
/*    */ 
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.components.JunieCircularProgressIndicatorKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.jewel.ui.component.IconKt;
/*    */ import org.jetbrains.jewel.ui.icon.IconKey;
/*    */ import org.jetbrains.jewel.ui.icon.PathIconKey;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class TerminalStepKt$TerminalStep$2
/*    */   implements Function3<BoxScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(BoxScope $this$StepCard, Composer $composer, int $changed) {
/* 46 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1375339330, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.steps.TerminalStep.<anonymous> (TerminalStep.kt:45)"); 
/* 47 */       if (this.$isRunning) { $composer.startReplaceGroup(-861750333); JunieCircularProgressIndicatorKt.JunieCircularProgressIndicator-3IgeMak(null, 0L, null, $composer, 0, 7); $composer.endReplaceGroup(); }
/*    */       else
/* 49 */       { $composer.startReplaceGroup(-861748266);
/* 50 */         $composer.startReplaceGroup(-861746351); PathIconKey pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getPauseStateIcon(); $composer.endReplaceGroup(); $composer.startReplaceGroup(-861745201); pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getTerminalIcon(); $composer.endReplaceGroup(); IconKt.Icon-FHprtrg(this.$isWaitingForApproval ? (IconKey)pathIconKey : (IconKey)pathIconKey, 
/* 51 */             this.$isWaitingForApproval ? "Pause" : "Terminal", null, null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, PathIconKey.$stable, 28); $composer.endReplaceGroup(); }  if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd();  }
/* 53 */     else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   TerminalStepKt$TerminalStep$2(boolean $isRunning, boolean $isWaitingForApproval) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\steps\TerminalStepKt$TerminalStep$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */