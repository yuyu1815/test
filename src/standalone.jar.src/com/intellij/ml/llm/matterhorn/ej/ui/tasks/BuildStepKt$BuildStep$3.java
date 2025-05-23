/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*    */ 
/*    */ import androidx.compose.foundation.layout.ColumnScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.components.DisplayCommandWithActionsKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.components.TextContainerKt;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class BuildStepKt$BuildStep$3
/*    */   implements Function3<ColumnScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(ColumnScope $this$StepCard, Composer $composer, int $changed) {
/* 52 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1807230960, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.BuildStep.<anonymous> (BuildStep.kt:51)");  $composer.startReplaceGroup(913175751); if (!this.$actionNames.isEmpty()) {
/* 53 */         DisplayCommandWithActionsKt.DisplayCommandWithActions(
/* 54 */             this.$command, null, 
/* 55 */             this.$actionNames, 
/* 56 */             this.$onActionClick, $composer, 0, 2);
/*    */       }
/*    */       $composer.endReplaceGroup();
/* 59 */       TextContainerKt.TextContainer(this.$description, $composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   BuildStepKt$BuildStep$3(List<String> $actionNames, String $command, Function1<Integer, Unit> $onActionClick, String $description) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\BuildStepKt$BuildStep$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */