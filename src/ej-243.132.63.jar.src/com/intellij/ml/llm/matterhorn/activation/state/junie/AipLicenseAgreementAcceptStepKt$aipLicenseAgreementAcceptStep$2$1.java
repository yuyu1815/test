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
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ @DebugMetadata(f = "aipLicenseAgreementAcceptStep.kt", l = {66, 69, 72}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   Object L$0;
/*    */   Object L$1;
/*    */   int label;
/*    */   
/*    */   AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1(boolean $licenseAgreementAutoAccept, AipLicenseAgreement $agreement, MutableState<Boolean> $localAgreementAcceptPerformed$delegate, MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> $outcome$delegate, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     Object object1;
/*    */     MutableState mutableState1, mutableState2;
/* 62 */     Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 63 */         if (this.$licenseAgreementAutoAccept)
/* 64 */         { Object object; AipLicenseAgreementAcceptStepKt.access$getLOG$p().info("Auto-accepting license agreement: " + this.$agreement.getName());
/* 65 */           MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> mutableState = this.$outcome$delegate; try { MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> mutableState3 = mutableState;
/* 66 */             this.L$0 = mutableState; this.L$1 = mutableState3; this.label = 1; if (AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$doAccept(this.$agreement, this.$localAgreementAcceptPerformed$delegate, (Continuation)this) == object2) return object2;  object = AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$doAccept(this.$agreement, this.$localAgreementAcceptPerformed$delegate, (Continuation)this); }
/* 67 */           catch (Throwable throwable)
/* 68 */           { AipLicenseAgreementAcceptStepKt.access$getLOG$p().warn("Failed to auto-accept license agreement: " + this.$agreement.getName(), throwable); mutableState = mutableState;
/* 69 */             this.L$0 = mutableState; this.L$1 = null; this.label = 2; if (AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this) == object2) return object2;  object = AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this); }  } else { MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> mutableState = this.$outcome$delegate;
/*    */ 
/*    */           
/* 72 */           this.L$0 = mutableState; this.label = 3; if (AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this) == object2) return object2;  }  AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$lambda$7(mutableState, AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this));
/*    */         
/* 74 */         return Unit.INSTANCE;
/*    */       case 1:
/*    */         mutableState2 = (MutableState)this.L$1;
/*    */         mutableState1 = (MutableState)this.L$0;
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         object1 = ((Outcome)SYNTHETIC_LOCAL_VARIABLE_1).unbox-impl();
/*    */       case 2:
/*    */         mutableState1 = (MutableState)this.L$0;
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         object1 = ((Outcome)SYNTHETIC_LOCAL_VARIABLE_1).unbox-impl();
/*    */       case 3:
/*    */         mutableState1 = (MutableState)this.L$0;
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1> $completion) {
/*    */     return (Continuation<Unit>)new AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1(this.$licenseAgreementAutoAccept, this.$agreement, this.$localAgreementAcceptPerformed$delegate, this.$outcome$delegate, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */