/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.jewel.bridge.ToolWindowScope;
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
/*    */ final class DebugEventsToolWindowFactory$createToolWindowContent$1
/*    */   implements Function3<ToolWindowScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(ToolWindowScope $this$addComposeTab, Composer $composer, int $changed) {
/* 36 */     Intrinsics.checkNotNullParameter($this$addComposeTab, "$this$addComposeTab"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1709579362, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.debug.DebugEventsToolWindowFactory.createToolWindowContent.<anonymous> (DebugEventsToolwindow.kt:35)");  DebugEventsPageKt.EventLogScreen(this.$viewModel, $composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd(); 
/*    */   }
/*    */   
/*    */   DebugEventsToolWindowFactory$createToolWindowContent$1(EventLogViewModel $viewModel) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\DebugEventsToolWindowFactory$createToolWindowContent$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */