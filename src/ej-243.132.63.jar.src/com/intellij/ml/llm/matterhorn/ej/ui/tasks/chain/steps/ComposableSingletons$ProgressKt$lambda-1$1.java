/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.components.JunieCircularProgressIndicatorKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class ComposableSingletons$ProgressKt$lambda-1$1
/*    */   implements Function3<BoxScope, Composer, Integer, Unit> {
/*    */   public static final ComposableSingletons$ProgressKt$lambda-1$1 INSTANCE = new ComposableSingletons$ProgressKt$lambda-1$1();
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(BoxScope $this$StepCard, Composer $composer, int $changed) {
/* 22 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(25873393, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ComposableSingletons$ProgressKt.lambda-1.<anonymous> (Progress.kt:21)");  JunieCircularProgressIndicatorKt.JunieCircularProgressIndicator-3IgeMak(null, 0L, null, $composer, 0, 7); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\ComposableSingletons$ProgressKt$lambda-1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */