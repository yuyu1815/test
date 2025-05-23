/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseAgreement;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AipLicenseAgreementAcceptPending;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.Outcome;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ @DebugMetadata(f = "aipLicenseAgreementAcceptStep.kt", l = {79}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*    */ final class AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1
/*    */   extends SuspendLambda
/*    */   implements Function1<Continuation<? super Unit>, Object>
/*    */ {
/*    */   Object L$0;
/*    */   int label;
/*    */   
/*    */   AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1(AipLicenseAgreement $agreement, MutableState<Boolean> $localAgreementAcceptPerformed$delegate, MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> $outcome$delegate, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> mutableState;
/* 78 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 79 */         this.L$0 = mutableState = this.$outcome$delegate; this.label = 1; if (AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$doAccept(this.$agreement, this.$localAgreementAcceptPerformed$delegate, (Continuation)this) == object) return object;  AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$lambda$7(mutableState, AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$doAccept(this.$agreement, this.$localAgreementAcceptPerformed$delegate, (Continuation)this));
/* 80 */         return Unit.INSTANCE;case 1: mutableState = (MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>>)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$lambda$7(mutableState, ((Outcome)SYNTHETIC_LOCAL_VARIABLE_1).unbox-impl()); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1> $completion) {
/*    */     return (Continuation<Unit>)new AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1(this.$agreement, this.$localAgreementAcceptPerformed$delegate, this.$outcome$delegate, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */