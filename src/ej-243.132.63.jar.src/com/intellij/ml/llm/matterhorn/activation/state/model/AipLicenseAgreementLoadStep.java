/*   */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\001\n\000\n\002\030\002\n\002\b\016\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B/\022\022\020\004\032\016\022\n\022\b\022\004\022\0020\0070\0060\005\022\022\020\b\032\016\022\004\022\0020\002\022\004\022\0020\0030\t¢\006\004\b\n\020\013J\025\020\021\032\016\022\n\022\b\022\004\022\0020\0070\0060\005HÆ\003J\034\020\022\032\016\022\004\022\0020\002\022\004\022\0020\0030\tHÆ\003¢\006\004\b\023\020\017J<\020\024\032\0020\0002\024\b\002\020\004\032\016\022\n\022\b\022\004\022\0020\0070\0060\0052\024\b\002\020\b\032\016\022\004\022\0020\002\022\004\022\0020\0030\tHÆ\001¢\006\004\b\025\020\026J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\032HÖ\003J\t\020\033\032\0020\034HÖ\001J\t\020\035\032\0020\036HÖ\001R\035\020\004\032\016\022\n\022\b\022\004\022\0020\0070\0060\005¢\006\b\n\000\032\004\b\f\020\rR\"\020\b\032\016\022\004\022\0020\002\022\004\022\0020\0030\tX\004¢\006\n\n\002\020\020\032\004\b\016\020\017¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadPending;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;", "onLoadRequested", "Lkotlin/Function0;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;", "", "outcome", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome;", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOnLoadRequested", "()Lkotlin/jvm/functions/Function0;", "getOutcome-07x5Wys", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component2-07x5Wys", "copy", "copy-9rsLeOw", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*   */ public final class AipLicenseAgreementLoadStep implements Journey<AipLicenseAgreementLoadPending, AipLicenseAgreement> {
/*   */   @NotNull
/*   */   private final Function0<OpHandle> onLoadRequested;
/*   */   
/* 7 */   private AipLicenseAgreementLoadStep(Function0<OpHandle> onLoadRequested, Object outcome) { this.onLoadRequested = onLoadRequested;
/* 8 */     this.outcome = outcome; } @NotNull private final Object outcome; @NotNull public final Function0<OpHandle> getOnLoadRequested() { return this.onLoadRequested; } @NotNull public Object getOutcome-07x5Wys() { return this.outcome; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final Function0<OpHandle> component1() {
/*   */     return this.onLoadRequested;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final Object component2-07x5Wys() {
/*   */     return this.outcome;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final AipLicenseAgreementLoadStep copy-9rsLeOw(@NotNull Function0 onLoadRequested, @NotNull Object outcome) {
/*   */     Intrinsics.checkNotNullParameter(onLoadRequested, "onLoadRequested");
/*   */     return new AipLicenseAgreementLoadStep(onLoadRequested, outcome, null);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "AipLicenseAgreementLoadStep(onLoadRequested=" + this.onLoadRequested + ", outcome=" + Outcome.toString-impl(this.outcome) + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.onLoadRequested.hashCode();
/*   */     return result * 31 + Outcome.hashCode-impl(this.outcome);
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof AipLicenseAgreementLoadStep))
/*   */       return false; 
/*   */     AipLicenseAgreementLoadStep aipLicenseAgreementLoadStep = (AipLicenseAgreementLoadStep)other;
/*   */     return !Intrinsics.areEqual(this.onLoadRequested, aipLicenseAgreementLoadStep.onLoadRequested) ? false : (!!Outcome.equals-impl0(this.outcome, aipLicenseAgreementLoadStep.outcome));
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AipLicenseAgreementLoadStep.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */