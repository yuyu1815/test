/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\001\n\002\b\003\n\002\030\002\n\002\b\025\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001BS\022\006\020\004\032\0020\005\022\022\020\006\032\016\022\n\022\b\022\004\022\0020\t0\b0\007\022\f\020\n\032\b\022\004\022\0020\0030\007\022\f\020\013\032\b\022\004\022\0020\0030\007\022\022\020\f\032\016\022\004\022\0020\002\022\004\022\0020\0030\r¢\006\004\b\016\020\017J\t\020\031\032\0020\005HÆ\003J\025\020\032\032\016\022\n\022\b\022\004\022\0020\t0\b0\007HÆ\003J\017\020\033\032\b\022\004\022\0020\0030\007HÆ\003J\017\020\034\032\b\022\004\022\0020\0030\007HÆ\003J\034\020\035\032\016\022\004\022\0020\002\022\004\022\0020\0030\rHÆ\003¢\006\004\b\036\020\027Jf\020\037\032\0020\0002\b\b\002\020\004\032\0020\0052\024\b\002\020\006\032\016\022\n\022\b\022\004\022\0020\t0\b0\0072\016\b\002\020\n\032\b\022\004\022\0020\0030\0072\016\b\002\020\013\032\b\022\004\022\0020\0030\0072\024\b\002\020\f\032\016\022\004\022\0020\002\022\004\022\0020\0030\rHÆ\001¢\006\004\b \020!J\023\020\"\032\0020#2\b\020$\032\004\030\0010%HÖ\003J\t\020&\032\0020'HÖ\001J\t\020(\032\0020)HÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\035\020\006\032\016\022\n\022\b\022\004\022\0020\t0\b0\007¢\006\b\n\000\032\004\b\022\020\023R\027\020\n\032\b\022\004\022\0020\0030\007¢\006\b\n\000\032\004\b\024\020\023R\027\020\013\032\b\022\004\022\0020\0030\007¢\006\b\n\000\032\004\b\025\020\023R\"\020\f\032\016\022\004\022\0020\002\022\004\022\0020\0030\rX\004¢\006\n\n\002\020\030\032\004\b\026\020\027¨\006*"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending;", "", "agreement", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;", "onAccepted", "Lkotlin/Function0;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;", "", "onAgreementRequired", "onResetToInitial", "outcome", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAgreement", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;", "getOnAccepted", "()Lkotlin/jvm/functions/Function0;", "getOnAgreementRequired", "getOnResetToInitial", "getOutcome-07x5Wys", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component5-07x5Wys", "copy", "copy-dCM9qhQ", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */ public final class AipLicenseAgreementAcceptStep implements Journey<AipLicenseAgreementAcceptPending, Unit> { @NotNull
/*    */   private final AipLicenseAgreement agreement; @NotNull
/*    */   private final Function0<OpHandle> onAccepted;
/*  6 */   private AipLicenseAgreementAcceptStep(AipLicenseAgreement agreement, Function0<OpHandle> onAccepted, Function0<Unit> onAgreementRequired, Function0<Unit> onResetToInitial, Object outcome) { this.agreement = agreement;
/*  7 */     this.onAccepted = onAccepted;
/*  8 */     this.onAgreementRequired = onAgreementRequired;
/*  9 */     this.onResetToInitial = onResetToInitial;
/* 10 */     this.outcome = outcome; } @NotNull private final Function0<Unit> onAgreementRequired; @NotNull private final Function0<Unit> onResetToInitial; @NotNull private final Object outcome; @NotNull public final AipLicenseAgreement getAgreement() { return this.agreement; } @NotNull public final Function0<OpHandle> getOnAccepted() { return this.onAccepted; } @NotNull public Object getOutcome-07x5Wys() { return this.outcome; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Function0<Unit> getOnAgreementRequired() {
/*    */     return this.onAgreementRequired;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function0<Unit> getOnResetToInitial() {
/*    */     return this.onResetToInitial;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AipLicenseAgreement component1() {
/*    */     return this.agreement;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function0<OpHandle> component2() {
/*    */     return this.onAccepted;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function0<Unit> component3() {
/*    */     return this.onAgreementRequired;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function0<Unit> component4() {
/*    */     return this.onResetToInitial;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Object component5-07x5Wys() {
/*    */     return this.outcome;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AipLicenseAgreementAcceptStep copy-dCM9qhQ(@NotNull AipLicenseAgreement agreement, @NotNull Function0 onAccepted, @NotNull Function0 onAgreementRequired, @NotNull Function0 onResetToInitial, @NotNull Object outcome) {
/*    */     Intrinsics.checkNotNullParameter(agreement, "agreement");
/*    */     Intrinsics.checkNotNullParameter(onAccepted, "onAccepted");
/*    */     Intrinsics.checkNotNullParameter(onAgreementRequired, "onAgreementRequired");
/*    */     Intrinsics.checkNotNullParameter(onResetToInitial, "onResetToInitial");
/*    */     return new AipLicenseAgreementAcceptStep(agreement, onAccepted, onAgreementRequired, onResetToInitial, outcome, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AipLicenseAgreementAcceptStep(agreement=" + this.agreement + ", onAccepted=" + this.onAccepted + ", onAgreementRequired=" + this.onAgreementRequired + ", onResetToInitial=" + this.onResetToInitial + ", outcome=" + Outcome.toString-impl(this.outcome) + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.agreement.hashCode();
/*    */     result = result * 31 + this.onAccepted.hashCode();
/*    */     result = result * 31 + this.onAgreementRequired.hashCode();
/*    */     result = result * 31 + this.onResetToInitial.hashCode();
/*    */     return result * 31 + Outcome.hashCode-impl(this.outcome);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AipLicenseAgreementAcceptStep))
/*    */       return false; 
/*    */     AipLicenseAgreementAcceptStep aipLicenseAgreementAcceptStep = (AipLicenseAgreementAcceptStep)other;
/*    */     return !Intrinsics.areEqual(this.agreement, aipLicenseAgreementAcceptStep.agreement) ? false : (!Intrinsics.areEqual(this.onAccepted, aipLicenseAgreementAcceptStep.onAccepted) ? false : (!Intrinsics.areEqual(this.onAgreementRequired, aipLicenseAgreementAcceptStep.onAgreementRequired) ? false : (!Intrinsics.areEqual(this.onResetToInitial, aipLicenseAgreementAcceptStep.onResetToInitial) ? false : (!!Outcome.equals-impl0(this.outcome, aipLicenseAgreementAcceptStep.outcome)))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AipLicenseAgreementAcceptStep.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */