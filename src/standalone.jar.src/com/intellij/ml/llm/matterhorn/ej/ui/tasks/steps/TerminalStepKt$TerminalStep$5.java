/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.steps;
/*     */ 
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.ButtonKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ final class TerminalStepKt$TerminalStep$5
/*     */   implements Function3<RowScope, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/*  99 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1807387853, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.steps.TerminalStep.<anonymous> (TerminalStep.kt:98)");  $composer.startReplaceGroup(-861704843); if (this.$onApproveActionClick != null) ButtonKt.RunCommandButton(null, this.$onApproveActionClick, $composer, 0, 1);  $composer.endReplaceGroup();
/* 100 */       if (this.$onSkipActionClick != null) ButtonKt.SkipButton(null, this.$onSkipActionClick, $composer, 0, 1);  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   TerminalStepKt$TerminalStep$5(Function0<Unit> $onApproveActionClick, Function0<Unit> $onSkipActionClick) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\steps\TerminalStepKt$TerminalStep$5.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */