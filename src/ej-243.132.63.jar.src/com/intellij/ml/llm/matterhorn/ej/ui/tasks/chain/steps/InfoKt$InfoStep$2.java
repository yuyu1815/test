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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Info.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/InfoKt$InfoStep$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,46:1\n149#2:47\n*S KotlinDebug\n*F\n+ 1 Info.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/InfoKt$InfoStep$2\n*L\n32#1:47\n*E\n"})
/*    */ final class InfoKt$InfoStep$2
/*    */   implements Function3<ColumnScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(ColumnScope $this$StepCard, Composer $composer, int $changed) {
/* 30 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1777822476, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.InfoStep.<anonymous> (Info.kt:29)");  TextContainerKt.TextContainer(this.$info.getDescription(), $composer, 0);
/* 31 */       if (this.$info.getActionApprovalRequestData() != null) {
/* 32 */         int $this$dp$iv = 8, $i$f$getDp = 0; SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, 
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
/* 47 */               Dp.constructor-impl($this$dp$iv)), $composer, 6);
/*    */       } 
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd();  }
/*    */     else
/*    */     { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   InfoKt$InfoStep$2(TaskStep.Info $info) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\InfoKt$InfoStep$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */