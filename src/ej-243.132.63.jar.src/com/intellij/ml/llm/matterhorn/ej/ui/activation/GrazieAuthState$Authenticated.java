/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\026HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthState$Authenticated;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthState;", "authContext", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext;", "plan", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/AiSubscriptionPlan;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/AiSubscriptionPlan;)V", "getAuthContext", "()Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext;", "getPlan", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/AiSubscriptionPlan;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class Authenticated implements GrazieAuthState {
/*    */   @NotNull
/*    */   private final GrazieAuthContext authContext;
/*    */   
/*  9 */   public Authenticated(@NotNull GrazieAuthContext authContext, @NotNull AiSubscriptionPlan plan) { this.authContext = authContext;
/* 10 */     this.plan = plan; } @NotNull private final AiSubscriptionPlan plan; public static final int $stable = 8; @NotNull public final GrazieAuthContext getAuthContext() { return this.authContext; } @NotNull public final AiSubscriptionPlan getPlan() { return this.plan; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final GrazieAuthContext component1() {
/*    */     return this.authContext;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AiSubscriptionPlan component2() {
/*    */     return this.plan;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Authenticated copy(@NotNull GrazieAuthContext authContext, @NotNull AiSubscriptionPlan plan) {
/*    */     Intrinsics.checkNotNullParameter(authContext, "authContext");
/*    */     Intrinsics.checkNotNullParameter(plan, "plan");
/*    */     return new Authenticated(authContext, plan);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Authenticated(authContext=" + this.authContext + ", plan=" + this.plan + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.authContext.hashCode();
/*    */     return result * 31 + this.plan.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Authenticated))
/*    */       return false; 
/*    */     Authenticated authenticated = (Authenticated)other;
/*    */     return !Intrinsics.areEqual(this.authContext, authenticated.authContext) ? false : (!(this.plan != authenticated.plan));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\GrazieAuthState$Authenticated.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */