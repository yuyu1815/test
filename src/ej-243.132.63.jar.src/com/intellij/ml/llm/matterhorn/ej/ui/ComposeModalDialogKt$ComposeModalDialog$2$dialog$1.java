/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.openapi.project.Project;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\021\020\002\032\0020\003*\0020\004H\027¢\006\002\020\005¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/ComposeModalDialogKt$ComposeModalDialog$2$dialog$1", "Lcom/intellij/ml/llm/matterhorn/ej/ui/AbstractComposeModalDialog;", "setContent", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ComposeDialogScope;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/ComposeDialogScope;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*    */ public final class ComposeModalDialogKt$ComposeModalDialog$2$dialog$1
/*    */   extends AbstractComposeModalDialog
/*    */ {
/*    */   ComposeModalDialogKt$ComposeModalDialog$2$dialog$1(Project $project, boolean $canBeParent, Function3<ComposeDialogScope, Composer, Integer, Unit> $content) {
/* 32 */     super($project, $canBeParent); } @Composable
/*    */   public void setContent(ComposeDialogScope $this$setContent, Composer $composer, int $changed) {
/* 34 */     Intrinsics.checkNotNullParameter($this$setContent, "<this>"); $composer.startReplaceGroup(-1532607238); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1532607238, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.ComposeModalDialog.<anonymous>.<no name provided>.setContent (ComposeModalDialog.kt:33)");  this.$content.invoke($this$setContent, $composer, Integer.valueOf(0xE & $changed)); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ComposeModalDialogKt$ComposeModalDialog$2$dialog$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */