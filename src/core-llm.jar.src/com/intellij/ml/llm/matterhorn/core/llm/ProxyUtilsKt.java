/*    */ package com.intellij.ml.llm.matterhorn.core.llm;@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\032\006\020\000\032\0020\001\032\006\020\002\032\0020\001\032\006\020\003\032\0020\004¨\006\005"}, d2 = {"getDefaultDelayStrategy", "Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy;", "getDefaultDelayStrategyForRateLimit", "isOnTeamcity", "", "core-llm"})
/*    */ public final class ProxyUtilsKt {
/*    */   @NotNull
/*    */   public static final DelayStrategy getDefaultDelayStrategy() {
/*  5 */     return 
/*  6 */       isOnTeamcity() ? new DelayStrategy.Constant(4, 5000) : 
/*  7 */       new DelayStrategy.RandomExponential(3, 500, 2.0D);
/*    */   } @NotNull
/*    */   public static final DelayStrategy getDefaultDelayStrategyForRateLimit() {
/* 10 */     return 
/* 11 */       isOnTeamcity() ? new DelayStrategy.Constant(1000, 5000) : 
/* 12 */       new DelayStrategy.RandomExponential(16, 500, Math.sqrt(2.0D));
/*    */   }
/*    */   public static final boolean isOnTeamcity() {
/* 15 */     return (System.getenv("TEAMCITY_VERSION") != null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\ProxyUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */