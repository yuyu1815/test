/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.openapi.application.ModalityKt;
/*    */ import com.intellij.openapi.application.ModalityState;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @DebugMetadata(f = "ComposeModalDialog.kt", l = {29}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.ComposeModalDialogKt$ComposeModalDialog$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class ComposeModalDialogKt$ComposeModalDialog$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   ComposeModalDialogKt$ComposeModalDialog$2(boolean $resizable, Project $project, boolean $canBeParent, Function3<ComposeDialogScope, Composer, Integer, Unit> $content, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     ComposeModalDialogKt$ComposeModalDialog$2$dialog$1 dialog;
/* 28 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 29 */         Intrinsics.checkNotNullExpressionValue(ModalityState.any(), "any(...)"); this.label = 1; if (BuildersKt.withContext(ModalityKt.asContextElement(ModalityState.any()), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>($completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 30 */                     ComposeModalDialogKt.initializeComposeMainDispatcherChecker();
/* 31 */                     return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation)this) == object) return object;  BuildersKt.withContext(ModalityKt.asContextElement(ModalityState.any()), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); ComposeModalDialogKt.initializeComposeMainDispatcherChecker(); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>($completion); }
/* 32 */               public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); dialog = new ComposeModalDialogKt$ComposeModalDialog$2$dialog$1(this.$project, this.$canBeParent, this.$content);
/*    */ 
/*    */ 
/*    */         
/* 36 */         dialog.setResizable(this.$resizable);
/* 37 */         dialog.show();
/* 38 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); dialog = new ComposeModalDialogKt$ComposeModalDialog$2$dialog$1(this.$project, this.$canBeParent, this.$content); dialog.setResizable(this.$resizable); dialog.show(); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super ComposeModalDialogKt$ComposeModalDialog$2> $completion) {
/*    */     return (Continuation<Unit>)new ComposeModalDialogKt$ComposeModalDialog$2(this.$resizable, this.$project, this.$canBeParent, this.$content, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((ComposeModalDialogKt$ComposeModalDialog$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\021\020\002\032\0020\003*\0020\004H\027¢\006\002\020\005¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/ComposeModalDialogKt$ComposeModalDialog$2$dialog$1", "Lcom/intellij/ml/llm/matterhorn/ej/ui/AbstractComposeModalDialog;", "setContent", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ComposeDialogScope;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/ComposeDialogScope;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*    */   public static final class ComposeModalDialogKt$ComposeModalDialog$2$dialog$1 extends AbstractComposeModalDialog {
/*    */     ComposeModalDialogKt$ComposeModalDialog$2$dialog$1(Project $project, boolean $canBeParent, Function3<ComposeDialogScope, Composer, Integer, Unit> $content) {
/*    */       super($project, $canBeParent);
/*    */     }
/*    */     
/*    */     @Composable
/*    */     public void setContent(ComposeDialogScope $this$setContent, Composer $composer, int $changed) {
/*    */       Intrinsics.checkNotNullParameter($this$setContent, "<this>");
/*    */       $composer.startReplaceGroup(-1532607238);
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventStart(-1532607238, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.ComposeModalDialog.<anonymous>.<no name provided>.setContent (ComposeModalDialog.kt:33)"); 
/*    */       this.$content.invoke($this$setContent, $composer, Integer.valueOf(0xE & $changed));
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd(); 
/*    */       $composer.endReplaceGroup();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ComposeModalDialogKt$ComposeModalDialog$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */