/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login.states;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\007\n\002\020\016\n\002\b\004\b\007\030\0002\0020\001:\001\021B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\r\032\0020\0168F¢\006\006\032\004\b\017\020\020¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "reason", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked$Reason;", "onRefresh", "Lkotlin/Function0;", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked$Reason;Lkotlin/jvm/functions/Function0;)V", "getReason", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked$Reason;", "getOnRefresh", "()Lkotlin/jvm/functions/Function0;", "reasonText", "", "getReasonText", "()Ljava/lang/String;", "Reason", "ej-ui"}) @StabilityInferred(parameters = 1)
/*    */ public final class AIPBlocked implements GrazieActivationState { @NotNull
/*  3 */   private final Reason reason; public AIPBlocked(@NotNull Reason reason, @NotNull Function0<Unit> onRefresh) { this.reason = reason; this.onRefresh = onRefresh; } @NotNull private final Function0<Unit> onRefresh; public static final int $stable; @NotNull public final Reason getReason() { return this.reason; } @NotNull public final Function0<Unit> getOnRefresh() { return this.onRefresh; } @NotNull
/*    */   public final String getReasonText() {
/*  5 */     switch (WhenMappings.$EnumSwitchMapping$0[this.reason.ordinal()]) { case 1: case 2:  }  throw new NoWhenBranchMatchedException();
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked$Reason;", "", "<init>", "(Ljava/lang/String;I)V", "RegionalSettings", "ProhibitedInOrganization", "ej-ui"})
/*    */   public enum Reason
/*    */   {
/* 11 */     RegionalSettings,
/* 12 */     ProhibitedInOrganization; @NotNull
/* 13 */     public static EnumEntries<Reason> getEntries() { return $ENTRIES; }
/*    */   
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\AIPBlocked.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */