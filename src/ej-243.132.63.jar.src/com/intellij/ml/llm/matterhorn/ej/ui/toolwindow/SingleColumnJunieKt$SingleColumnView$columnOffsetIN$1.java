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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class SingleColumnJunieKt$SingleColumnView$columnOffsetIN$1
/*    */   implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Dp>>
/*    */ {
/*    */   public static final SingleColumnJunieKt$SingleColumnView$columnOffsetIN$1 INSTANCE = new SingleColumnJunieKt$SingleColumnView$columnOffsetIN$1();
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final FiniteAnimationSpec<Dp> invoke(Transition.Segment $this$animateDp, Composer $composer, int $changed) {
/* 43 */     Intrinsics.checkNotNullParameter($this$animateDp, "$this$animateDp"); $composer.startReplaceGroup(882690348); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(882690348, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.SingleColumnView.<anonymous> (SingleColumnJunie.kt:42)");  TweenSpec tweenSpec = AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), 2, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (FiniteAnimationSpec<Dp>)tweenSpec;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\SingleColumnJunieKt$SingleColumnView$columnOffsetIN$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */