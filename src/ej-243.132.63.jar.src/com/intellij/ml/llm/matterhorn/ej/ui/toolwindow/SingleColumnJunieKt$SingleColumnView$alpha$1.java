/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.toolwindow;
/*    */ 
/*    */ import androidx.compose.animation.core.AnimationSpecKt;
/*    */ import androidx.compose.animation.core.EasingKt;
/*    */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*    */ import androidx.compose.animation.core.Transition;
/*    */ import androidx.compose.animation.core.TweenSpec;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class SingleColumnJunieKt$SingleColumnView$alpha$1
/*    */   implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>
/*    */ {
/*    */   public static final SingleColumnJunieKt$SingleColumnView$alpha$1 INSTANCE = new SingleColumnJunieKt$SingleColumnView$alpha$1();
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final FiniteAnimationSpec<Float> invoke(Transition.Segment $this$animateFloat, Composer $composer, int $changed) {
/* 48 */     Intrinsics.checkNotNullParameter($this$animateFloat, "$this$animateFloat"); $composer.startReplaceGroup(1313508906); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1313508906, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.SingleColumnView.<anonymous> (SingleColumnJunie.kt:47)");  TweenSpec tweenSpec = AnimationSpecKt.tween$default(750, 0, EasingKt.getLinearEasing(), 2, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (FiniteAnimationSpec<Float>)tweenSpec;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\SingleColumnJunieKt$SingleColumnView$alpha$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */