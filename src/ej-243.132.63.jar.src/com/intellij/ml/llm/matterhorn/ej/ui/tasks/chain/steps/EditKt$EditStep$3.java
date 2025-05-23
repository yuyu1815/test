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
/*    */ final class EditKt$EditStep$3
/*    */   implements Function3<RowScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/* 52 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { Function0 approveAction; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-913840353, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.EditStep.<anonymous> (Edit.kt:51)");  this.$edit.getEditApproval(); Function0 function01 = (this.$edit.getEditApproval() != null) ? this.$edit.getEditApproval().getApproveEditAction() : null; $composer.startReplaceGroup(1659200527); int $i$a$-let-EditKt$EditStep$3$1 = 0;
/* 53 */       ButtonKt.ApproveEditButton(null, approveAction, $composer, 0, 1);
/*    */       Unit unit = (function01 == null) ? null : Unit.INSTANCE;
/*    */       $composer.endReplaceGroup();
/* 56 */       this.$edit.getEditApproval(); if (((this.$edit.getEditApproval() != null) ? this.$edit.getEditApproval().getDeclineEditAction() : null) == null) { (this.$edit.getEditApproval() != null) ? this.$edit.getEditApproval().getDeclineEditAction() : null; } else { Object object; int $i$a$-let-EditKt$EditStep$3$2 = 0;
/* 57 */         ButtonKt.DeclineEditButton(null, (Function0)object, $composer, 0, 1); }  if (ComposerKt.isTraceInProgress())
/* 58 */         ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   EditKt$EditStep$3(TaskStep.Edit $edit) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\EditKt$EditStep$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */