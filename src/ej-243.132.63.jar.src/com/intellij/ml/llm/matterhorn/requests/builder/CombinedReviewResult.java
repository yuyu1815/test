/*    */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*    */ import com.intellij.ml.llm.matterhorn.requests.GrazieRequest;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\004\n\002\020\013\n\002\b\004\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\016\020\021\032\0020\0002\006\020\022\032\0020\006R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\036\020\013\032\0020\n2\006\020\t\032\0020\n@BX\016¢\006\b\n\000\032\004\b\f\020\rR\021\020\016\032\0020\0178F¢\006\006\032\004\b\016\020\020¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;", "", "<init>", "()V", "contents", "Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;", "getContents", "()Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;", "value", "", "failedReviewsCount", "getFailedReviewsCount", "()I", "isReviewFailed", "", "()Z", "addFailedReviewContent", "content", "core"})
/*    */ public final class CombinedReviewResult {
/*    */   @NotNull
/*  7 */   private final AddOnlyList<GrazieRequest.Content> contents = new AddOnlyList(); private int failedReviewsCount; @NotNull public final AddOnlyList<GrazieRequest.Content> getContents() { return this.contents; } public final int getFailedReviewsCount() {
/*  8 */     return this.failedReviewsCount;
/*    */   }
/* 10 */   public final boolean isReviewFailed() { return (this.failedReviewsCount > 0); } @NotNull
/*    */   public final CombinedReviewResult addFailedReviewContent(@NotNull GrazieRequest.Content content) {
/* 12 */     Intrinsics.checkNotNullParameter(content, "content"); CombinedReviewResult combinedReviewResult1 = this, $this$addFailedReviewContent_u24lambda_u240 = combinedReviewResult1; int $i$a$-apply-CombinedReviewResult$addFailedReviewContent$1 = 0;
/* 13 */     $this$addFailedReviewContent_u24lambda_u240.contents.add(content);
/* 14 */     $this$addFailedReviewContent_u24lambda_u240.failedReviewsCount++;
/*    */     return combinedReviewResult1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\builder\CombinedReviewResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */