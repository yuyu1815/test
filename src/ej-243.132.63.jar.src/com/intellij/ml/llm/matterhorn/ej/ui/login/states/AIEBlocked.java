/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login.states;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\004\b\007\030\0002\0020\001:\001\fB\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\t8F¢\006\006\032\004\b\n\020\013¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "reason", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked$Reason;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked$Reason;)V", "getReason", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked$Reason;", "reasonText", "", "getReasonText", "()Ljava/lang/String;", "Reason", "ej-ui"}) @StabilityInferred(parameters = 1)
/*    */ public final class AIEBlocked implements GrazieActivationState { @NotNull
/*  3 */   private final Reason reason; public AIEBlocked(@NotNull Reason reason) { this.reason = reason; } public static final int $stable; @NotNull public final Reason getReason() { return this.reason; } @NotNull
/*    */   public final String getReasonText() {
/*  5 */     switch (WhenMappings.$EnumSwitchMapping$0[this.reason.ordinal()]) { case 1: case 2: case 3:  }  throw new NoWhenBranchMatchedException();
/*    */   }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\006\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005j\002\b\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked$Reason;", "", "<init>", "(Ljava/lang/String;I)V", "DisabledByCompanyPolicy", "NotAuthenticated", "IncompatibleSetOfModels", "ej-ui"})
/*    */   public enum Reason
/*    */   {
/* 12 */     DisabledByCompanyPolicy,
/* 13 */     NotAuthenticated,
/* 14 */     IncompatibleSetOfModels; @NotNull
/* 15 */     public static EnumEntries<Reason> getEntries() { return $ENTRIES; }
/*    */   
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\AIEBlocked.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */