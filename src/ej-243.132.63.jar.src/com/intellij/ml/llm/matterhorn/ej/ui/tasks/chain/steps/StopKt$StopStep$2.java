/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.foundation.layout.RowScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.components.ButtonKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class StopKt$StopStep$2
/*    */   implements Function3<RowScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/* 23 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-365489369, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.StopStep.<anonymous> (Stop.kt:22)");  if (this.$stop.getStartNewTaskAction() != null) {
/*    */         
/* 25 */         String str = this.$stop.getStartNewTaskAction().getName();
/* 26 */         Function0 function0 = this.$stop.getStartNewTaskAction().getAction();
/* 27 */         ButtonKt.Button(str, null, false, function0, ComposableSingletons$StopKt.INSTANCE.getLambda-2$ej_ui(), $composer, 24960, 2);
/*    */       }  if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd();  }
/* 30 */     else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   StopKt$StopStep$2(TaskStep.Stop $stop) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\StopKt$StopStep$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */