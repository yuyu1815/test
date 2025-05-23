/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseAgreement;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseAgreementRepository;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AipLicenseAgreementAcceptPending;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.Outcome;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.time.DurationKt;
/*    */ import kotlin.time.DurationUnit;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.DelayKt;
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
/*    */ @DebugMetadata(f = "aipLicenseAgreementAcceptStep.kt", l = {85, 86, 87, 88}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   Object L$0;
/*    */   int label;
/*    */   
/*    */   AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1(AipLicenseAgreement $agreement, MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> $outcome$delegate, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     JunieAipLicenseAgreementRepository repository;
/*    */     MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> mutableState;
/* 84 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 85 */         this.label = 1; if (JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this) == object) return object;  repository = (JunieAipLicenseAgreementRepository)JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this);
/* 86 */         this.label = 2; if (repository.updateAgreementDocument((Continuation)this) == object) return object;  repository.updateAgreementDocument((Continuation)this);
/* 87 */         this.label = 3; if (DelayKt.delay-VtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), (Continuation)this) == object) return object;  DelayKt.delay-VtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), (Continuation)this);
/* 88 */         this.L$0 = mutableState = this.$outcome$delegate; this.label = 4; if (AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this) == object) return object;  AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$lambda$7(mutableState, AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this));
/* 89 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); repository = (JunieAipLicenseAgreementRepository)SYNTHETIC_LOCAL_VARIABLE_1; this.label = 2; if (repository.updateAgreementDocument((Continuation)this) == object) return object;  repository.updateAgreementDocument((Continuation)this); this.label = 3; if (DelayKt.delay-VtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), (Continuation)this) == object) return object;  DelayKt.delay-VtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), (Continuation)this); this.L$0 = mutableState = this.$outcome$delegate; this.label = 4; if (AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this) == object) return object;  AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$lambda$7(mutableState, AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this)); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 3; if (DelayKt.delay-VtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), (Continuation)this) == object) return object;  DelayKt.delay-VtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), (Continuation)this); this.L$0 = mutableState = this.$outcome$delegate; this.label = 4; if (AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this) == object) return object;  AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$lambda$7(mutableState, AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this)); return Unit.INSTANCE;case 3: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.L$0 = mutableState = this.$outcome$delegate; this.label = 4; if (AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this) == object) return object;  AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$lambda$7(mutableState, AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this)); return Unit.INSTANCE;case 4: mutableState = (MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>>)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$lambda$7(mutableState, ((Outcome)SYNTHETIC_LOCAL_VARIABLE_1).unbox-impl()); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1> $completion) {
/*    */     return (Continuation<Unit>)new AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1(this.$agreement, this.$outcome$delegate, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */