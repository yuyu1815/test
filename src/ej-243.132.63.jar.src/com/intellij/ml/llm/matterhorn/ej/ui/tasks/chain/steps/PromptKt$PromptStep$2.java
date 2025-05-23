/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.foundation.layout.ColumnScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class PromptKt$PromptStep$2
/*    */   implements Function3<ColumnScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(ColumnScope $this$StepCard, Composer $composer, int $changed) {
/* 29 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-807121282, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.PromptStep.<anonymous> (Prompt.kt:28)");  List attachedFiles = (List)this.$prompt.getAttachedFilesVm().getAttachedFiles().getValue();
/* 30 */       if (!attachedFiles.isEmpty())
/* 31 */         PromptKt.access$showFileAttachments(attachedFiles, $composer, 0);  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/* 32 */     else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   PromptKt$PromptStep$2(TaskStep.Prompt $prompt) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\PromptKt$PromptStep$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */