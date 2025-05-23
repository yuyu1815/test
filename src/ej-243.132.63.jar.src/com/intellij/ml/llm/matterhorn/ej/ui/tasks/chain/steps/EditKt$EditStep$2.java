/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.foundation.layout.ColumnScope;
/*    */ import androidx.compose.foundation.layout.SizeKt;
/*    */ import androidx.compose.foundation.layout.SpacerKt;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.components.TextContainerKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @SourceDebugExtension({"SMAP\nEdit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Edit.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/EditKt$EditStep$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,61:1\n149#2:62\n*S KotlinDebug\n*F\n+ 1 Edit.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/EditKt$EditStep$2\n*L\n48#1:62\n*E\n"})
/*    */ final class EditKt$EditStep$2
/*    */   implements Function3<ColumnScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(ColumnScope $this$StepCard, Composer $composer, int $changed) {
/* 46 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1816733336, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.EditStep.<anonymous> (Edit.kt:45)");  TextContainerKt.TextContainer(this.$edit.getDescription(), $composer, 0);
/* 47 */       if (this.$edit.getEditApproval() != null) {
/* 48 */         int $this$dp$iv = 8, $i$f$getDp = 0; SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, 
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
/* 62 */               Dp.constructor-impl($this$dp$iv)), $composer, 6);
/*    */       } 
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd();  }
/*    */     else
/*    */     { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   EditKt$EditStep$2(TaskStep.Edit $edit) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\EditKt$EditStep$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */