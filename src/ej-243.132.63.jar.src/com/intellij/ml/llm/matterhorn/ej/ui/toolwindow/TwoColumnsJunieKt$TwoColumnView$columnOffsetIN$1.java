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
/*    */ import androidx.compose.ui.unit.Dp;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class TwoColumnsJunieKt$TwoColumnView$columnOffsetIN$1
/*    */   implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Dp>>
/*    */ {
/*    */   public static final TwoColumnsJunieKt$TwoColumnView$columnOffsetIN$1 INSTANCE = new TwoColumnsJunieKt$TwoColumnView$columnOffsetIN$1();
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final FiniteAnimationSpec<Dp> invoke(Transition.Segment $this$animateDp, Composer $composer, int $changed) {
/* 53 */     Intrinsics.checkNotNullParameter($this$animateDp, "$this$animateDp"); $composer.startReplaceGroup(685331199); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(685331199, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.TwoColumnView.<anonymous> (TwoColumnsJunie.kt:52)");  TweenSpec tweenSpec = AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), 2, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (FiniteAnimationSpec<Dp>)tweenSpec;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\TwoColumnsJunieKt$TwoColumnView$columnOffsetIN$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */