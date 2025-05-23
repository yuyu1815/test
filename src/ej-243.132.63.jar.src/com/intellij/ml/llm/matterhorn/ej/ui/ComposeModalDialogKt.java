/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.lifecycle.Lifecycle;
/*    */ import androidx.lifecycle.LifecycleRegistry;
/*    */ import com.intellij.openapi.application.CoroutinesKt;
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
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Dispatchers;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\032H\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\034\020\007\032\030\022\004\022\0020\t\022\004\022\0020\0010\b¢\006\002\b\n¢\006\002\b\013H@¢\006\002\020\f\032\b\020\r\032\0020\001H\000¨\006\016"}, d2 = {"ComposeModalDialog", "", "project", "Lcom/intellij/openapi/project/Project;", "canBeParent", "", "resizable", "content", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ComposeDialogScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lcom/intellij/openapi/project/Project;ZZLkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeComposeMainDispatcherChecker", "ej-ui"})
/*    */ public final class ComposeModalDialogKt {
/*    */   @Nullable
/* 28 */   public static final Object ComposeModalDialog(@NotNull Project project, boolean canBeParent, boolean resizable, @NotNull Function3<? super ComposeDialogScope, ? super Composer, ? super Integer, Unit> content, @NotNull Continuation $completion) { if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new ComposeModalDialogKt$ComposeModalDialog$2(resizable, project, canBeParent, content, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new ComposeModalDialogKt$ComposeModalDialog$2(resizable, project, canBeParent, content, null), $completion);  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new ComposeModalDialogKt$ComposeModalDialog$2(resizable, project, canBeParent, content, null), $completion); return Unit.INSTANCE; } @DebugMetadata(f = "ComposeModalDialog.kt", l = {29}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.ComposeModalDialogKt$ComposeModalDialog$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class ComposeModalDialogKt$ComposeModalDialog$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; ComposeModalDialogKt$ComposeModalDialog$2(boolean $resizable, Project $project, boolean $canBeParent, Function3<ComposeDialogScope, Composer, Integer, Unit> $content, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { ComposeModalDialogKt$ComposeModalDialog$2$dialog$1 dialog; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 29 */           Intrinsics.checkNotNullExpressionValue(ModalityState.any(), "any(...)"); this.label = 1; if (BuildersKt.withContext(ModalityKt.asContextElement(ModalityState.any()), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>($completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 30 */                       ComposeModalDialogKt.initializeComposeMainDispatcherChecker();
/* 31 */                       return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation)this) == object) return object;  BuildersKt.withContext(ModalityKt.asContextElement(ModalityState.any()), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); ComposeModalDialogKt.initializeComposeMainDispatcherChecker(); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>($completion); }
/* 32 */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); dialog = new ComposeModalDialogKt$ComposeModalDialog$2$dialog$1(this.$project, this.$canBeParent, this.$content);
/*    */ 
/*    */ 
/*    */           
/* 36 */           dialog.setResizable(this.$resizable);
/* 37 */           dialog.show();
/* 38 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); dialog = new ComposeModalDialogKt$ComposeModalDialog$2$dialog$1(this.$project, this.$canBeParent, this.$content); dialog.setResizable(this.$resizable); dialog.show(); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super ComposeModalDialogKt$ComposeModalDialog$2> $completion) { return (Continuation<Unit>)new ComposeModalDialogKt$ComposeModalDialog$2(this.$resizable, this.$project, this.$canBeParent, this.$content, $completion); }
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((ComposeModalDialogKt$ComposeModalDialog$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); }
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\021\020\002\032\0020\003*\0020\004H\027¢\006\002\020\005¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/ComposeModalDialogKt$ComposeModalDialog$2$dialog$1", "Lcom/intellij/ml/llm/matterhorn/ej/ui/AbstractComposeModalDialog;", "setContent", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ComposeDialogScope;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/ComposeDialogScope;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*    */     public static final class ComposeModalDialogKt$ComposeModalDialog$2$dialog$1 extends AbstractComposeModalDialog {
/*    */       ComposeModalDialogKt$ComposeModalDialog$2$dialog$1(Project $project, boolean $canBeParent, Function3<ComposeDialogScope, Composer, Integer, Unit> $content) { super($project, $canBeParent); }
/*    */       @Composable
/*    */       public void setContent(ComposeDialogScope $this$setContent, Composer $composer, int $changed) {
/*    */         Intrinsics.checkNotNullParameter($this$setContent, "<this>");
/*    */         $composer.startReplaceGroup(-1532607238);
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventStart(-1532607238, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.ComposeModalDialog.<anonymous>.<no name provided>.setContent (ComposeModalDialog.kt:33)"); 
/*    */         this.$content.invoke($this$setContent, $composer, Integer.valueOf(0xE & $changed));
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventEnd(); 
/*    */         $composer.endReplaceGroup();
/*    */       } } }
/* 56 */   public static final void initializeComposeMainDispatcherChecker() { new ComposeModalDialogKt$initializeComposeMainDispatcherChecker$1(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\023\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/ComposeModalDialogKt$initializeComposeMainDispatcherChecker$1", "Landroidx/lifecycle/LifecycleOwner;", "lifecycle", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycle", "()Landroidx/lifecycle/LifecycleRegistry;", "ej-ui"})
/* 57 */   public static final class ComposeModalDialogKt$initializeComposeMainDispatcherChecker$1 implements LifecycleOwner { private final LifecycleRegistry lifecycle; ComposeModalDialogKt$initializeComposeMainDispatcherChecker$1() { this.lifecycle = new LifecycleRegistry(this);
/*    */ 
/*    */       
/* 60 */       getLifecycle().setCurrentState(Lifecycle.State.STARTED); }
/*    */ 
/*    */     
/*    */     public LifecycleRegistry getLifecycle() {
/*    */       return this.lifecycle;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ComposeModalDialogKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */