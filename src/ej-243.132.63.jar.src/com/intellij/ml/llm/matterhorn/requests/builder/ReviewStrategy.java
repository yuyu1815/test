/*    */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\002\b\013\030\000 \0212\0020\001:\002\020\021B%\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;", "", "execution", "Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy$Execution;", "maxReviews", "", "applyToFailed", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy$Execution;IZ)V", "getExecution", "()Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy$Execution;", "getMaxReviews", "()I", "getApplyToFailed", "()Z", "Execution", "Companion", "core"})
/*    */ public final class ReviewStrategy {
/*  5 */   public ReviewStrategy(@NotNull Execution execution, int maxReviews, boolean applyToFailed) { this.execution = execution;
/*    */     
/*  7 */     this.maxReviews = maxReviews;
/*    */     
/*  9 */     this.applyToFailed = applyToFailed; } @NotNull public final Execution getExecution() { return this.execution; } public final boolean getApplyToFailed() { return this.applyToFailed; } public final int getMaxReviews() {
/*    */     return this.maxReviews;
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy$Execution;", "", "<init>", "(Ljava/lang/String;I)V", "EVERY_TIME", "UNTIL_SUCCESS", "core"})
/* 12 */   public enum Execution { EVERY_TIME,
/* 13 */     UNTIL_SUCCESS; @NotNull
/* 14 */     public static EnumEntries<Execution> getEntries() { return $ENTRIES; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;", "getDEFAULT", "()Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;", "core"})
/*    */   public static final class Companion { private Companion() {}
/*    */     @NotNull
/* 17 */     public final ReviewStrategy getDEFAULT() { return ReviewStrategy.DEFAULT; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Execution execution; private final int maxReviews; private final boolean applyToFailed; @NotNull private static final ReviewStrategy DEFAULT = new ReviewStrategy(null, 0, false, 7, null);
/*    */   
/*    */   public ReviewStrategy() {
/*    */     this(null, 0, false, 7, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\builder\ReviewStrategy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */