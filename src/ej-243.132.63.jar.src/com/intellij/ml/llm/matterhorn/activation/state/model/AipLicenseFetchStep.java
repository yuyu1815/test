/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ 
/*    */ import kotlin.jvm.functions.Function0;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\020\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\0030\001BI\022\022\020\005\032\016\022\n\022\b\022\004\022\0020\b0\0070\006\022\022\020\t\032\016\022\n\022\b\022\004\022\0020\b0\0070\006\022\030\020\n\032\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\0030\013¢\006\004\b\f\020\rJ\025\020\024\032\016\022\n\022\b\022\004\022\0020\b0\0070\006HÆ\003J\025\020\025\032\016\022\n\022\b\022\004\022\0020\b0\0070\006HÆ\003J\"\020\026\032\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\0030\013HÆ\003¢\006\004\b\027\020\022JX\020\030\032\0020\0002\024\b\002\020\005\032\016\022\n\022\b\022\004\022\0020\b0\0070\0062\024\b\002\020\t\032\016\022\n\022\b\022\004\022\0020\b0\0070\0062\032\b\002\020\n\032\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\0030\013HÆ\001¢\006\004\b\031\020\032J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\036HÖ\003J\t\020\037\032\0020 HÖ\001J\t\020!\032\0020\"HÖ\001R\035\020\005\032\016\022\n\022\b\022\004\022\0020\b0\0070\006¢\006\b\n\000\032\004\b\016\020\017R\035\020\t\032\016\022\n\022\b\022\004\022\0020\b0\0070\006¢\006\b\n\000\032\004\b\020\020\017R(\020\n\032\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\0030\013X\004¢\006\n\n\002\020\023\032\004\b\021\020\022¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchPending;", "", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;", "onFetchRequested", "Lkotlin/Function0;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;", "onTrialRequested", "outcome", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOnFetchRequested", "()Lkotlin/jvm/functions/Function0;", "getOnTrialRequested", "getOutcome-07x5Wys", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component3-07x5Wys", "copy", "copy-HQWU59w", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */ public final class AipLicenseFetchStep implements Journey<AipLicenseFetchPending, List<? extends AipLicense>> {
/*    */   @NotNull
/*    */   private final Function0<OpHandle<AipLicenseRequestFailure>> onFetchRequested;
/*    */   
/* 10 */   private AipLicenseFetchStep(Function0<OpHandle<AipLicenseRequestFailure>> onFetchRequested, Function0<OpHandle<AipLicenseRequestFailure>> onTrialRequested, Object outcome) { this.onFetchRequested = onFetchRequested;
/* 11 */     this.onTrialRequested = onTrialRequested;
/* 12 */     this.outcome = outcome; } @NotNull private final Function0<OpHandle<AipLicenseRequestFailure>> onTrialRequested; @NotNull private final Object outcome; @NotNull public final Function0<OpHandle<AipLicenseRequestFailure>> getOnFetchRequested() { return this.onFetchRequested; } @NotNull public Object getOutcome-07x5Wys() { return this.outcome; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Function0<OpHandle<AipLicenseRequestFailure>> getOnTrialRequested() {
/*    */     return this.onTrialRequested;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function0<OpHandle<AipLicenseRequestFailure>> component1() {
/*    */     return this.onFetchRequested;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function0<OpHandle<AipLicenseRequestFailure>> component2() {
/*    */     return this.onTrialRequested;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Object component3-07x5Wys() {
/*    */     return this.outcome;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AipLicenseFetchStep copy-HQWU59w(@NotNull Function0 onFetchRequested, @NotNull Function0 onTrialRequested, @NotNull Object outcome) {
/*    */     Intrinsics.checkNotNullParameter(onFetchRequested, "onFetchRequested");
/*    */     Intrinsics.checkNotNullParameter(onTrialRequested, "onTrialRequested");
/*    */     return new AipLicenseFetchStep(onFetchRequested, onTrialRequested, outcome, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AipLicenseFetchStep(onFetchRequested=" + this.onFetchRequested + ", onTrialRequested=" + this.onTrialRequested + ", outcome=" + Outcome.toString-impl(this.outcome) + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.onFetchRequested.hashCode();
/*    */     result = result * 31 + this.onTrialRequested.hashCode();
/*    */     return result * 31 + Outcome.hashCode-impl(this.outcome);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AipLicenseFetchStep))
/*    */       return false; 
/*    */     AipLicenseFetchStep aipLicenseFetchStep = (AipLicenseFetchStep)other;
/*    */     return !Intrinsics.areEqual(this.onFetchRequested, aipLicenseFetchStep.onFetchRequested) ? false : (!Intrinsics.areEqual(this.onTrialRequested, aipLicenseFetchStep.onTrialRequested) ? false : (!!Outcome.equals-impl0(this.outcome, aipLicenseFetchStep.outcome)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AipLicenseFetchStep.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */