/*   */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\033\022\022\020\004\032\016\022\004\022\0020\002\022\004\022\0020\0030\005¢\006\004\b\006\020\007J\034\020\013\032\016\022\004\022\0020\002\022\004\022\0020\0030\005HÆ\003¢\006\004\b\f\020\tJ&\020\r\032\0020\0002\024\b\002\020\004\032\016\022\004\022\0020\002\022\004\022\0020\0030\005HÆ\001¢\006\004\b\016\020\017J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\027HÖ\001R\"\020\004\032\016\022\004\022\0020\002\022\004\022\0020\0030\005X\004¢\006\n\n\002\020\n\032\004\b\b\020\t¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/RegionCheckStep;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/JunieRegionCheckProhibited;", "", "outcome", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome;", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOutcome-07x5Wys", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component1-07x5Wys", "copy", "copy-8BOIT_k", "(Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/RegionCheckStep;", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*   */ public final class RegionCheckStep implements Journey<JunieRegionCheckProhibited, Unit> {
/* 4 */   private RegionCheckStep(Object outcome) { this.outcome = outcome; } @NotNull private final Object outcome; @NotNull public Object getOutcome-07x5Wys() { return this.outcome; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final Object component1-07x5Wys() {
/*   */     return this.outcome;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final RegionCheckStep copy-8BOIT_k(@NotNull Object outcome) {
/*   */     return new RegionCheckStep(outcome, null);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "RegionCheckStep(outcome=" + Outcome.toString-impl(this.outcome) + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return Outcome.hashCode-impl(this.outcome);
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof RegionCheckStep))
/*   */       return false; 
/*   */     RegionCheckStep regionCheckStep = (RegionCheckStep)other;
/*   */     return !!Outcome.equals-impl0(this.outcome, regionCheckStep.outcome);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\RegionCheckStep.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */