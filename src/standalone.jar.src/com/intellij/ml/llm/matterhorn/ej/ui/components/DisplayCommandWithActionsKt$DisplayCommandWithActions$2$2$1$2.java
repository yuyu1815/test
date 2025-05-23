/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import org.jetbrains.jewel.ui.component.TextKt;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class DisplayCommandWithActionsKt$DisplayCommandWithActions$2$2$1$2
/*    */   implements Function3<Integer, Composer, Integer, Unit>
/*    */ {
/*    */   DisplayCommandWithActionsKt$DisplayCommandWithActions$2$2$1$2(List<String> $actionNames) {}
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(int index, Composer $composer, int $changed) {
/* 64 */     int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= $composer.changed(index) ? 4 : 2;  if (($dirty & 0x13) != 18 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-428148419, $dirty, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.DisplayCommandWithActions.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DisplayCommandWithActions.kt:63)");  TextKt.Text-bAzTDeA(this.$actionNames.get(index), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65534); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\DisplayCommandWithActionsKt$DisplayCommandWithActions$2$2$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */