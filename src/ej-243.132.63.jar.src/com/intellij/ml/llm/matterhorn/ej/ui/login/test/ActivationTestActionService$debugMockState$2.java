/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login.test;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseAgreement;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseAgreementRepository;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.login.states.GrazieActivationState;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "LoginTestAction.kt", l = {39, 41, 41, 42}, i = {1, 1, 2, 2}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"$this$transformLatest", "index", "$this$transformLatest", "index"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.test.ActivationTestActionService$debugMockState$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\034\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\030\002\n\000\n\002\020\b\020\000\032\0020\001*\026\022\022\022\020\022\004\022\0020\004\022\004\022\0020\005\030\0010\0030\0022\b\020\006\032\004\030\0010\007H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "index", ""})
/*    */ final class ActivationTestActionService$debugMockState$2
/*    */   extends SuspendLambda
/*    */   implements Function3<FlowCollector<? super Pair<? extends String, ? extends GrazieActivationState>>, Integer, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   ActivationTestActionService$debugMockState$2(Continuation $completion) {
/*    */     super(3, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     FlowCollector $this$transformLatest;
/*    */     Integer index;
/*    */     AipLicenseAgreement la;
/* 37 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$transformLatest = (FlowCollector)this.L$0; index = (Integer)this.L$1;
/* 38 */         if (index == null)
/* 39 */         { this.L$0 = null; this.label = 1; if ($this$transformLatest.emit(null, (Continuation)this) == object)
/*    */             return object;  }
/* 41 */         else { this.L$0 = $this$transformLatest; this.L$1 = index; this.label = 2; if (JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this) == object) return object;  this.L$0 = $this$transformLatest; this.L$1 = index; this.label = 3; if (((JunieAipLicenseAgreementRepository)JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this)).loadLocalAgreementDocument((Continuation)this) == object) return object;  }  ((JunieAipLicenseAgreementRepository)JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this)).loadLocalAgreementDocument((Continuation)this);
/*    */ 
/*    */         
/* 44 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE;case 2: index = (Integer)this.L$1; $this$transformLatest = (FlowCollector)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.L$0 = $this$transformLatest; this.L$1 = index; this.label = 3; if (((JunieAipLicenseAgreementRepository)SYNTHETIC_LOCAL_VARIABLE_1).loadLocalAgreementDocument((Continuation)this) == object) return object; case 3: index = (Integer)this.L$1; $this$transformLatest = (FlowCollector)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); la = (AipLicenseAgreement)SYNTHETIC_LOCAL_VARIABLE_1; this.L$0 = null; this.L$1 = null; this.label = 4; if ($this$transformLatest.emit(ActivationTestActionService.this.createVms(ActivationTestActionService.this.getScope(), index.intValue(), la), (Continuation)this) == object) return object;  $this$transformLatest.emit(ActivationTestActionService.this.createVms(ActivationTestActionService.this.getScope(), index.intValue(), la), (Continuation)this); return Unit.INSTANCE;case 4: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Object invoke(FlowCollector p1, Integer p2, Continuation<? super ActivationTestActionService$debugMockState$2> p3) {
/*    */     ActivationTestActionService$debugMockState$2 activationTestActionService$debugMockState$2 = new ActivationTestActionService$debugMockState$2(p3);
/*    */     activationTestActionService$debugMockState$2.L$0 = p1;
/*    */     activationTestActionService$debugMockState$2.L$1 = p2;
/*    */     return activationTestActionService$debugMockState$2.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\test\ActivationTestActionService$debugMockState$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */