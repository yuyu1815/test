/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*    */ 
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class TestStepKt$TestStep$2
/*    */   implements Function3<BoxScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(BoxScope $this$StepCard, Composer $composer, int $changed) {
/* 33 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1269292445, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TestStep.<anonymous> (TestStep.kt:32)"); 
/* 34 */       $composer.startReplaceGroup(-411417568); PathIconKey pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getPauseStateIcon(); $composer.endReplaceGroup(); $composer.startReplaceGroup(-411416422); pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getShowIcon(); $composer.endReplaceGroup(); IconKt.Icon-FHprtrg(this.$isWaitingForApproval ? (IconKey)pathIconKey : (IconKey)pathIconKey, 
/* 35 */           this.$isWaitingForApproval ? "Waiting for approval" : "Tests", null, null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, PathIconKey.$stable, 28); if (ComposerKt.isTraceInProgress())
/* 36 */         ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   TestStepKt$TestStep$2(boolean $isWaitingForApproval) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\TestStepKt$TestStep$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */