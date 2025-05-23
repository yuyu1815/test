/*    */ package ai.grazie.nlc;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\006\n\002\b\026\n\002\020\013\n\002\b\003\n\002\020\016\n\002\b\002\b\b\030\000 #2\0020\001:\001#B=\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007\022\006\020\t\032\0020\003\022\006\020\n\032\0020\007¢\006\002\020\013J\t\020\025\032\0020\003HÆ\003J\t\020\026\032\0020\003HÆ\003J\t\020\027\032\0020\003HÆ\003J\t\020\030\032\0020\007HÆ\003J\t\020\031\032\0020\007HÆ\003J\t\020\032\032\0020\003HÆ\003J\t\020\033\032\0020\007HÆ\003JO\020\034\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\0032\b\b\002\020\n\032\0020\007HÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020\003HÖ\001J\t\020!\032\0020\"HÖ\001R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\t\032\0020\003¢\006\b\n\000\032\004\b\016\020\rR\021\020\b\032\0020\007¢\006\b\n\000\032\004\b\017\020\020R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\021\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\022\020\020R\021\020\n\032\0020\007¢\006\b\n\000\032\004\b\023\020\020R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\024\020\r¨\006$"}, d2 = {"Lai/grazie/nlc/CompletionServiceConfig;", "", "minLen", "", "maxLen", "totalNum", "minProb", "", "minAvgLogProb", "minAdditionLen", "rankScoreTH", "(IIIDDID)V", "getMaxLen", "()I", "getMinAdditionLen", "getMinAvgLogProb", "()D", "getMinLen", "getMinProb", "getRankScoreTH", "getTotalNum", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "model-nlc"})
/*    */ public final class CompletionServiceConfig {
/*  4 */   public CompletionServiceConfig(int minLen, int maxLen, int totalNum, double minProb, double minAvgLogProb, int minAdditionLen, double rankScoreTH) { this.minLen = minLen;
/*  5 */     this.maxLen = maxLen;
/*  6 */     this.totalNum = totalNum;
/*  7 */     this.minProb = minProb;
/*  8 */     this.minAvgLogProb = minAvgLogProb;
/*  9 */     this.minAdditionLen = minAdditionLen;
/* 10 */     this.rankScoreTH = rankScoreTH; } public final int getMinLen() { return this.minLen; } public final int getMaxLen() { return this.maxLen; } public final int getTotalNum() { return this.totalNum; } public final double getRankScoreTH() { return this.rankScoreTH; }
/*    */   public final double getMinProb() { return this.minProb; } public final double getMinAvgLogProb() { return this.minAvgLogProb; } public final int getMinAdditionLen() { return this.minAdditionLen; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\013\032\0020\0042\006\020\f\032\0020\rR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\016"}, d2 = {"Lai/grazie/nlc/CompletionServiceConfig$Companion;", "", "()V", "always", "Lai/grazie/nlc/CompletionServiceConfig;", "getAlways", "()Lai/grazie/nlc/CompletionServiceConfig;", "default", "getDefault", "moderate", "getModerate", "forProfile", "profile", "", "model-nlc"}) public static final class Companion
/*    */   {
/* 13 */     private Companion() {} @NotNull public final CompletionServiceConfig getAlways() { return CompletionServiceConfig.always; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final CompletionServiceConfig getModerate() {
/* 22 */       return CompletionServiceConfig.moderate;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final CompletionServiceConfig getDefault() {
/* 32 */       return CompletionServiceConfig.default;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final CompletionServiceConfig forProfile(@NotNull String profile) {
/* 43 */       Intrinsics.checkNotNullParameter(profile, "profile"); return Intrinsics.areEqual(profile, "Moderate") ? getModerate() : getAlways();
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final int minLen;
/*    */   private final int maxLen;
/*    */   private final int totalNum;
/*    */   private final double minProb;
/*    */   private final double minAvgLogProb;
/*    */   private final int minAdditionLen;
/*    */   private final double rankScoreTH;
/*    */   @NotNull
/*    */   private static final CompletionServiceConfig always = new CompletionServiceConfig(1, 5, 3, 0.0D, 0.0D, 6, -10.0D);
/*    */   @NotNull
/*    */   private static final CompletionServiceConfig moderate = new CompletionServiceConfig(1, 7, 5, 0.0D, 0.0D, 10, -1.8D);
/*    */   @NotNull
/*    */   private static final CompletionServiceConfig default = new CompletionServiceConfig(1, 3, 5, 0.0D, -100.0D, 5, -10.0D);
/*    */   
/*    */   public final int component1() {
/*    */     return this.minLen;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.maxLen;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.totalNum;
/*    */   }
/*    */   
/*    */   public final double component4() {
/*    */     return this.minProb;
/*    */   }
/*    */   
/*    */   public final double component5() {
/*    */     return this.minAvgLogProb;
/*    */   }
/*    */   
/*    */   public final int component6() {
/*    */     return this.minAdditionLen;
/*    */   }
/*    */   
/*    */   public final double component7() {
/*    */     return this.rankScoreTH;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CompletionServiceConfig copy(int minLen, int maxLen, int totalNum, double minProb, double minAvgLogProb, int minAdditionLen, double rankScoreTH) {
/*    */     return new CompletionServiceConfig(minLen, maxLen, totalNum, minProb, minAvgLogProb, minAdditionLen, rankScoreTH);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CompletionServiceConfig(minLen=" + this.minLen + ", maxLen=" + this.maxLen + ", totalNum=" + this.totalNum + ", minProb=" + this.minProb + ", minAvgLogProb=" + this.minAvgLogProb + ", minAdditionLen=" + this.minAdditionLen + ", rankScoreTH=" + this.rankScoreTH + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.minLen);
/*    */     result = result * 31 + Integer.hashCode(this.maxLen);
/*    */     result = result * 31 + Integer.hashCode(this.totalNum);
/*    */     result = result * 31 + Double.hashCode(this.minProb);
/*    */     result = result * 31 + Double.hashCode(this.minAvgLogProb);
/*    */     result = result * 31 + Integer.hashCode(this.minAdditionLen);
/*    */     return result * 31 + Double.hashCode(this.rankScoreTH);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CompletionServiceConfig))
/*    */       return false; 
/*    */     CompletionServiceConfig completionServiceConfig = (CompletionServiceConfig)other;
/*    */     return (this.minLen != completionServiceConfig.minLen) ? false : ((this.maxLen != completionServiceConfig.maxLen) ? false : ((this.totalNum != completionServiceConfig.totalNum) ? false : ((Double.compare(this.minProb, completionServiceConfig.minProb) != 0) ? false : ((Double.compare(this.minAvgLogProb, completionServiceConfig.minAvgLogProb) != 0) ? false : ((this.minAdditionLen != completionServiceConfig.minAdditionLen) ? false : (!(Double.compare(this.rankScoreTH, completionServiceConfig.rankScoreTH) != 0)))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-nlc-jvm-0.4.32.jar!\ai\grazie\nlc\CompletionServiceConfig.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */