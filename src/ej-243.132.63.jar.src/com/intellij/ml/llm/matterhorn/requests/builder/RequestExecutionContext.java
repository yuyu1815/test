/*   */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\025\n\002\b\003\n\002\020\013\n\002\b\005\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\tR\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;", "", "reviewersCount", "", "<init>", "(I)V", "reviewCount", "", "getReviewCount", "()[I", "lastRetry", "", "getLastRetry", "()Z", "setLastRetry", "(Z)V", "core"})
/*   */ public final class RequestExecutionContext { @NotNull
/* 4 */   private final int[] reviewCount; public RequestExecutionContext(int reviewersCount) { this.reviewCount = new int[reviewersCount]; } private boolean lastRetry; @NotNull public final int[] getReviewCount() { return this.reviewCount; }
/* 5 */   public final boolean getLastRetry() { return this.lastRetry; } public final void setLastRetry(boolean <set-?>) { this.lastRetry = <set-?>; }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\builder\RequestExecutionContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */