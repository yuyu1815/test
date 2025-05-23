/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\024\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\0012\016\022\004\022\0020\003\022\004\022\0020\0040\002B7\022\006\020\005\032\0020\006\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\n\022\022\020\013\032\016\022\004\022\0020\003\022\004\022\0020\0040\f¢\006\004\b\r\020\016J\t\020\030\032\0020\006HÆ\003J\013\020\031\032\004\030\0010\bHÆ\003J\013\020\032\032\004\030\0010\nHÆ\003J\034\020\033\032\016\022\004\022\0020\003\022\004\022\0020\0040\fHÆ\003¢\006\004\b\034\020\026JH\020\035\032\0020\0002\b\b\002\020\005\032\0020\0062\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\n2\024\b\002\020\013\032\016\022\004\022\0020\003\022\004\022\0020\0040\fHÆ\001¢\006\004\b\036\020\037J\023\020 \032\0020!2\b\020\"\032\004\030\0010#HÖ\003J\t\020$\032\0020%HÖ\001J\t\020&\032\0020'HÖ\001R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\017\020\020R\023\020\007\032\004\030\0010\b¢\006\b\n\000\032\004\b\021\020\022R\023\020\t\032\004\030\0010\n¢\006\b\n\000\032\004\b\023\020\024R\"\020\013\032\016\022\004\022\0020\003\022\004\022\0020\0040\fX\004¢\006\n\n\002\020\027\032\004\b\025\020\026¨\006("}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiEnterpriseActivation;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiEnterprisePending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext;", "allowanceStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep;", "authStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep;", "compatibilityCheckStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;", "outcome", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAllowanceStep", "()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep;", "getAuthStep", "()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep;", "getCompatibilityCheckStep", "()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;", "getOutcome-07x5Wys", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component4-07x5Wys", "copy", "copy-fvnEhao", "(Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiEnterpriseActivation;", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */ public final class AiEnterpriseActivation implements AiaActivation, Journey<AiEnterprisePending, GrazieAuthContext> {
/*    */   @NotNull
/*    */   private final AieAllowanceStep allowanceStep;
/*    */   @Nullable
/*    */   private final AieAuthStep authStep;
/*    */   
/* 11 */   private AiEnterpriseActivation(AieAllowanceStep allowanceStep, AieAuthStep authStep, AieFetchCapabilitiesStep compatibilityCheckStep, Object outcome) { this.allowanceStep = allowanceStep;
/* 12 */     this.authStep = authStep;
/* 13 */     this.compatibilityCheckStep = compatibilityCheckStep;
/* 14 */     this.outcome = outcome; } @Nullable private final AieFetchCapabilitiesStep compatibilityCheckStep; @NotNull private final Object outcome; @NotNull public final AieAllowanceStep getAllowanceStep() { return this.allowanceStep; } @NotNull public Object getOutcome-07x5Wys() { return this.outcome; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final AieAuthStep getAuthStep() {
/*    */     return this.authStep;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AieFetchCapabilitiesStep getCompatibilityCheckStep() {
/*    */     return this.compatibilityCheckStep;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AieAllowanceStep component1() {
/*    */     return this.allowanceStep;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AieAuthStep component2() {
/*    */     return this.authStep;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AieFetchCapabilitiesStep component3() {
/*    */     return this.compatibilityCheckStep;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Object component4-07x5Wys() {
/*    */     return this.outcome;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AiEnterpriseActivation copy-fvnEhao(@NotNull AieAllowanceStep allowanceStep, @Nullable AieAuthStep authStep, @Nullable AieFetchCapabilitiesStep compatibilityCheckStep, @NotNull Object outcome) {
/*    */     Intrinsics.checkNotNullParameter(allowanceStep, "allowanceStep");
/*    */     return new AiEnterpriseActivation(allowanceStep, authStep, compatibilityCheckStep, outcome, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AiEnterpriseActivation(allowanceStep=" + this.allowanceStep + ", authStep=" + this.authStep + ", compatibilityCheckStep=" + this.compatibilityCheckStep + ", outcome=" + Outcome.toString-impl(this.outcome) + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.allowanceStep.hashCode();
/*    */     result = result * 31 + ((this.authStep == null) ? 0 : this.authStep.hashCode());
/*    */     result = result * 31 + ((this.compatibilityCheckStep == null) ? 0 : this.compatibilityCheckStep.hashCode());
/*    */     return result * 31 + Outcome.hashCode-impl(this.outcome);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AiEnterpriseActivation))
/*    */       return false; 
/*    */     AiEnterpriseActivation aiEnterpriseActivation = (AiEnterpriseActivation)other;
/*    */     return !Intrinsics.areEqual(this.allowanceStep, aiEnterpriseActivation.allowanceStep) ? false : (!Intrinsics.areEqual(this.authStep, aiEnterpriseActivation.authStep) ? false : (!Intrinsics.areEqual(this.compatibilityCheckStep, aiEnterpriseActivation.compatibilityCheckStep) ? false : (!!Outcome.equals-impl0(this.outcome, aiEnterpriseActivation.outcome))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AiEnterpriseActivation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */