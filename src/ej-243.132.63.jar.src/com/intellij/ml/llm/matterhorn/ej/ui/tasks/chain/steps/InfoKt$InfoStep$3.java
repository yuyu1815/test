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
/*    */ final class InfoKt$InfoStep$3
/*    */   implements Function3<RowScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/* 37 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { Function0 runCommand; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-213428869, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.InfoStep.<anonymous> (Info.kt:36)");  this.$info.getActionApprovalRequestData(); Function0 function01 = (this.$info.getActionApprovalRequestData() != null) ? this.$info.getActionApprovalRequestData().getRunAction() : null; $composer.startReplaceGroup(1069298956); int $i$a$-let-InfoKt$InfoStep$3$1 = 0;
/* 38 */       ButtonKt.RunCommandButton(null, runCommand, $composer, 0, 1);
/*    */       Unit unit = (function01 == null) ? null : Unit.INSTANCE;
/*    */       $composer.endReplaceGroup();
/* 41 */       this.$info.getActionApprovalRequestData(); if (((this.$info.getActionApprovalRequestData() != null) ? this.$info.getActionApprovalRequestData().getSkipAction() : null) == null) { (this.$info.getActionApprovalRequestData() != null) ? this.$info.getActionApprovalRequestData().getSkipAction() : null; } else { Object object; int $i$a$-let-InfoKt$InfoStep$3$2 = 0;
/* 42 */         ButtonKt.SkipButton(null, (Function0)object, $composer, 0, 1); }  if (ComposerKt.isTraceInProgress())
/* 43 */         ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   InfoKt$InfoStep$3(TaskStep.Info $info) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\InfoKt$InfoStep$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */