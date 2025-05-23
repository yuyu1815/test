/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\027\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001BG\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\013\022\022\020\f\032\016\022\004\022\0020\002\022\004\022\0020\0030\r¢\006\004\b\016\020\017J\t\020\033\032\0020\005HÆ\003J\013\020\034\032\004\030\0010\007HÆ\003J\013\020\035\032\004\030\0010\tHÆ\003J\013\020\036\032\004\030\0010\013HÆ\003J\034\020\037\032\016\022\004\022\0020\002\022\004\022\0020\0030\rHÆ\003¢\006\004\b \020\031JT\020!\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\0132\024\b\002\020\f\032\016\022\004\022\0020\002\022\004\022\0020\0030\rHÆ\001¢\006\004\b\"\020#J\023\020$\032\0020%2\b\020&\032\004\030\0010'HÖ\003J\t\020(\032\0020)HÖ\001J\t\020*\032\0020+HÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\022\020\023R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\024\020\025R\023\020\n\032\004\030\0010\013¢\006\b\n\000\032\004\b\026\020\027R\"\020\f\032\016\022\004\022\0020\002\022\004\022\0020\0030\rX\004¢\006\n\n\002\020\032\032\004\b\030\020\031¨\006,"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseJourney;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicensePending;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;", "licenseFetchStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;", "licenseChoiceStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;", "agreementLoadStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;", "agreementAcceptStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;", "outcome", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLicenseFetchStep", "()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;", "getLicenseChoiceStep", "()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;", "getAgreementLoadStep", "()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;", "getAgreementAcceptStep", "()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;", "getOutcome-07x5Wys", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component5-07x5Wys", "copy", "copy-dCM9qhQ", "(Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseJourney;", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */ public final class AipLicenseJourney implements Journey<AipLicensePending, AipLicense> { @NotNull
/*    */   private final AipLicenseFetchStep licenseFetchStep; @Nullable
/*    */   private final AipLicenseChoiceStep licenseChoiceStep;
/*  6 */   private AipLicenseJourney(AipLicenseFetchStep licenseFetchStep, AipLicenseChoiceStep licenseChoiceStep, AipLicenseAgreementLoadStep agreementLoadStep, AipLicenseAgreementAcceptStep agreementAcceptStep, Object outcome) { this.licenseFetchStep = licenseFetchStep;
/*  7 */     this.licenseChoiceStep = licenseChoiceStep;
/*  8 */     this.agreementLoadStep = agreementLoadStep;
/*  9 */     this.agreementAcceptStep = agreementAcceptStep;
/*    */     
/* 11 */     this.outcome = outcome; } @Nullable private final AipLicenseAgreementLoadStep agreementLoadStep; @Nullable private final AipLicenseAgreementAcceptStep agreementAcceptStep; @NotNull private final Object outcome; @NotNull public final AipLicenseFetchStep getLicenseFetchStep() { return this.licenseFetchStep; } @Nullable public final AipLicenseChoiceStep getLicenseChoiceStep() { return this.licenseChoiceStep; } @NotNull public Object getOutcome-07x5Wys() { return this.outcome; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final AipLicenseAgreementLoadStep getAgreementLoadStep() {
/*    */     return this.agreementLoadStep;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AipLicenseAgreementAcceptStep getAgreementAcceptStep() {
/*    */     return this.agreementAcceptStep;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AipLicenseFetchStep component1() {
/*    */     return this.licenseFetchStep;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AipLicenseChoiceStep component2() {
/*    */     return this.licenseChoiceStep;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AipLicenseAgreementLoadStep component3() {
/*    */     return this.agreementLoadStep;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AipLicenseAgreementAcceptStep component4() {
/*    */     return this.agreementAcceptStep;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Object component5-07x5Wys() {
/*    */     return this.outcome;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AipLicenseJourney copy-dCM9qhQ(@NotNull AipLicenseFetchStep licenseFetchStep, @Nullable AipLicenseChoiceStep licenseChoiceStep, @Nullable AipLicenseAgreementLoadStep agreementLoadStep, @Nullable AipLicenseAgreementAcceptStep agreementAcceptStep, @NotNull Object outcome) {
/*    */     Intrinsics.checkNotNullParameter(licenseFetchStep, "licenseFetchStep");
/*    */     return new AipLicenseJourney(licenseFetchStep, licenseChoiceStep, agreementLoadStep, agreementAcceptStep, outcome, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AipLicenseJourney(licenseFetchStep=" + this.licenseFetchStep + ", licenseChoiceStep=" + this.licenseChoiceStep + ", agreementLoadStep=" + this.agreementLoadStep + ", agreementAcceptStep=" + this.agreementAcceptStep + ", outcome=" + Outcome.toString-impl(this.outcome) + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.licenseFetchStep.hashCode();
/*    */     result = result * 31 + ((this.licenseChoiceStep == null) ? 0 : this.licenseChoiceStep.hashCode());
/*    */     result = result * 31 + ((this.agreementLoadStep == null) ? 0 : this.agreementLoadStep.hashCode());
/*    */     result = result * 31 + ((this.agreementAcceptStep == null) ? 0 : this.agreementAcceptStep.hashCode());
/*    */     return result * 31 + Outcome.hashCode-impl(this.outcome);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AipLicenseJourney))
/*    */       return false; 
/*    */     AipLicenseJourney aipLicenseJourney = (AipLicenseJourney)other;
/*    */     return !Intrinsics.areEqual(this.licenseFetchStep, aipLicenseJourney.licenseFetchStep) ? false : (!Intrinsics.areEqual(this.licenseChoiceStep, aipLicenseJourney.licenseChoiceStep) ? false : (!Intrinsics.areEqual(this.agreementLoadStep, aipLicenseJourney.agreementLoadStep) ? false : (!Intrinsics.areEqual(this.agreementAcceptStep, aipLicenseJourney.agreementAcceptStep) ? false : (!!Outcome.equals-impl0(this.outcome, aipLicenseJourney.outcome)))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AipLicenseJourney.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */