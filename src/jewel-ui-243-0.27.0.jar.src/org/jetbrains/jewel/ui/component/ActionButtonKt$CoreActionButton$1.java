/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function4;
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
/*    */ final class ActionButtonKt$CoreActionButton$1
/*    */   implements Function4<BoxScope, IconButtonState, Composer, Integer, Unit>
/*    */ {
/*    */   ActionButtonKt$CoreActionButton$1(Function2<Composer, Integer, Unit> $content) {}
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke-KMTpdl8(BoxScope $this$IconButton, long it, Composer $composer, int $changed) {
/* 87 */     Intrinsics.checkNotNullParameter($this$IconButton, "$this$IconButton"); if (($changed & 0x81) != 128 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(981470731, $changed, -1, "org.jetbrains.jewel.ui.component.CoreActionButton.<anonymous> (ActionButton.kt:86)");  this.$content.invoke($composer, Integer.valueOf(0)); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ActionButtonKt$CoreActionButton$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */