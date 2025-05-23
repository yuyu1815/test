/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.toolwindow;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.login.GrazieActivationVm;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.login.states.GrazieActivationState;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.vm.ViewModel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
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
/*    */ @DebugMetadata(f = "JuniorToolWindowViewModel.kt", l = {82}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel$initialize$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "state", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;"})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function2<GrazieActivationState, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(GrazieActivationVm $activationVm, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     GrazieActivationState state;
/*    */     ViewModel newPage;
/* 77 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); state = (GrazieActivationState)this.L$0;
/* 78 */         newPage = 
/* 79 */           (state instanceof GrazieActivationState.Ready) ? (ViewModel)JuniorToolWindowViewModel.this.createNewTaskPage$ej_ui(JuniorToolWindowViewModel.this.getPromptMode()) : 
/* 80 */           (ViewModel)JuniorToolWindowViewModel.access$createGrazieActivationPageVm(JuniorToolWindowViewModel.this, this.$activationVm);
/*    */         
/* 82 */         this.label = 1; if (JuniorToolWindowViewModel.this.switchToPage$ej_ui(newPage, (Continuation<? super Unit>)this) == object) return object;  JuniorToolWindowViewModel.this.switchToPage$ej_ui(newPage, (Continuation<? super Unit>)this);
/* 83 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */     Object object = new Object(JuniorToolWindowViewModel.this, this.$activationVm, $completion);
/*    */     object.L$0 = value;
/*    */     return (Continuation<Unit>)object;
/*    */   }
/*    */   
/*    */   public final Object invoke(GrazieActivationState p1, Continuation<?> p2) {
/*    */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\JuniorToolWindowViewModel$initialize$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */