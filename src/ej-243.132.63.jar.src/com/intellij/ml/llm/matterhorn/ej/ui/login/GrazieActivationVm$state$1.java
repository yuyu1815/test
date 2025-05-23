/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.TuplesKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.Boxing;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function4;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "GrazieActivationVm.kt", l = {41}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.GrazieActivationVm$state$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\032\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\b\002\020\000\032\0020\001*\024\022\020\022\016\022\004\022\0020\004\022\004\022\0020\0050\0030\0022\006\020\006\032\0020\0042\006\020\007\032\0020\005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;", "", "activation", "optimisticState"})
/*    */ final class GrazieActivationVm$state$1
/*    */   extends SuspendLambda
/*    */   implements Function4<FlowCollector<? super Pair<? extends AiaActivation, ? extends Boolean>>, AiaActivation, Boolean, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   GrazieActivationVm$state$1(Continuation $completion) {
/*    */     super(4, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     FlowCollector $this$combineTransform;
/*    */     AiaActivation activation;
/*    */     boolean optimisticState;
/* 40 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$combineTransform = (FlowCollector)this.L$0; activation = (AiaActivation)this.L$1; optimisticState = this.Z$0;
/* 41 */         this.L$0 = null; this.label = 1; if ($this$combineTransform.emit(TuplesKt.to(activation, Boxing.boxBoolean(optimisticState)), (Continuation)this) == object) return object;  $this$combineTransform.emit(TuplesKt.to(activation, Boxing.boxBoolean(optimisticState)), (Continuation)this);
/* 42 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Object invoke(FlowCollector p1, AiaActivation p2, boolean p3, Continuation<? super GrazieActivationVm$state$1> p4) {
/*    */     GrazieActivationVm$state$1 grazieActivationVm$state$1 = new GrazieActivationVm$state$1(p4);
/*    */     grazieActivationVm$state$1.L$0 = p1;
/*    */     grazieActivationVm$state$1.L$1 = p2;
/*    */     grazieActivationVm$state$1.Z$0 = p3;
/*    */     return grazieActivationVm$state$1.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\GrazieActivationVm$state$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */