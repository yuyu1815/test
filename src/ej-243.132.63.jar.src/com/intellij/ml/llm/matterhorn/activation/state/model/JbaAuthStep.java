/*   */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\016\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B+\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\022\020\007\032\016\022\004\022\0020\002\022\004\022\0020\0030\b¢\006\004\b\t\020\nJ\021\020\020\032\n\022\004\022\0020\006\030\0010\005HÆ\003J\034\020\021\032\016\022\004\022\0020\002\022\004\022\0020\0030\bHÆ\003¢\006\004\b\022\020\016J8\020\023\032\0020\0002\020\b\002\020\004\032\n\022\004\022\0020\006\030\0010\0052\024\b\002\020\007\032\016\022\004\022\0020\002\022\004\022\0020\0030\bHÆ\001¢\006\004\b\024\020\025J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\031HÖ\003J\t\020\032\032\0020\033HÖ\001J\t\020\034\032\0020\035HÖ\001R\031\020\004\032\n\022\004\022\0020\006\030\0010\005¢\006\b\n\000\032\004\b\013\020\fR\"\020\007\032\016\022\004\022\0020\002\022\004\022\0020\0030\bX\004¢\006\n\n\002\020\017\032\004\b\r\020\016¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthStep;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;", "onAuthRejected", "Lkotlin/Function0;", "", "outcome", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome;", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOnAuthRejected", "()Lkotlin/jvm/functions/Function0;", "getOutcome-07x5Wys", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component2-07x5Wys", "copy", "copy-9rsLeOw", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthStep;", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*   */ public final class JbaAuthStep implements Journey<JbaAuthPending, JbaAuthData> { @Nullable
/*   */   private final Function0<Unit> onAuthRejected;
/*   */   
/* 6 */   private JbaAuthStep(Function0<Unit> onAuthRejected, Object outcome) { this.onAuthRejected = onAuthRejected;
/* 7 */     this.outcome = outcome; } @NotNull private final Object outcome; @Nullable public final Function0<Unit> getOnAuthRejected() { return this.onAuthRejected; } @NotNull public Object getOutcome-07x5Wys() { return this.outcome; }
/*   */ 
/*   */   
/*   */   @Nullable
/*   */   public final Function0<Unit> component1() {
/*   */     return this.onAuthRejected;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final Object component2-07x5Wys() {
/*   */     return this.outcome;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final JbaAuthStep copy-9rsLeOw(@Nullable Function0 onAuthRejected, @NotNull Object outcome) {
/*   */     return new JbaAuthStep(onAuthRejected, outcome, null);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "JbaAuthStep(onAuthRejected=" + this.onAuthRejected + ", outcome=" + Outcome.toString-impl(this.outcome) + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = (this.onAuthRejected == null) ? 0 : this.onAuthRejected.hashCode();
/*   */     return result * 31 + Outcome.hashCode-impl(this.outcome);
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof JbaAuthStep))
/*   */       return false; 
/*   */     JbaAuthStep jbaAuthStep = (JbaAuthStep)other;
/*   */     return !Intrinsics.areEqual(this.onAuthRejected, jbaAuthStep.onAuthRejected) ? false : (!!Outcome.equals-impl0(this.outcome, jbaAuthStep.outcome));
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\JbaAuthStep.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */