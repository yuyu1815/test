/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.animation.AnimatedVisibilityScope;
/*    */ import androidx.compose.foundation.ScrollState;
/*    */ import androidx.compose.foundation.gestures.ScrollableState;
/*    */ import androidx.compose.foundation.layout.SizeKt;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle;
/*    */ import org.jetbrains.jewel.ui.component.styling.TabStyle;
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
/*    */ final class TabStripKt$TabStrip$4$3
/*    */   implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
/* 69 */     Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-933514091, $changed, -1, "org.jetbrains.jewel.ui.component.TabStrip.<anonymous>.<anonymous> (TabStrip.kt:68)");  ScrollbarStyle scrollbarStyle = this.$style.getScrollbarStyle(); Modifier modifier = SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null); ScrollbarKt.HorizontalScrollbar((ScrollableState)this.$scrollState, modifier, false, false, null, scrollbarStyle, false, $composer, 48, 92); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd(); 
/*    */   }
/*    */   
/*    */   TabStripKt$TabStrip$4$3(TabStyle $style, ScrollState $scrollState) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TabStripKt$TabStrip$4$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */