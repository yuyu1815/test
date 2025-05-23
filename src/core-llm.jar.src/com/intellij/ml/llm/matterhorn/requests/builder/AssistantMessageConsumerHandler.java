/*    */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\007\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J&\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageConsumerHandler;", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageHandler;", "applyToFailed", "", "consumer", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageConsumer;", "<init>", "(ZLcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageConsumer;)V", "getApplyToFailed", "()Z", "getConsumer", "()Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageConsumer;", "handle", "", "context", "Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;", "assistantAnswer", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;", "reviewResult", "Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;", "(Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*  3 */ public final class AssistantMessageConsumerHandler implements AssistantMessageHandler { private final boolean applyToFailed; public AssistantMessageConsumerHandler(boolean applyToFailed, @NotNull AssistantMessageConsumer consumer) { this.applyToFailed = applyToFailed; this.consumer = consumer; } @NotNull private final AssistantMessageConsumer consumer; public final boolean getApplyToFailed() { return this.applyToFailed; } @NotNull public final AssistantMessageConsumer getConsumer() { return this.consumer; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object handle(@NotNull RequestExecutionContext context, @NotNull AssistantAnswer assistantAnswer, @NotNull CombinedReviewResult reviewResult, @NotNull Continuation<? super Unit> $completion) {
/*  9 */     if (reviewResult.isReviewFailed() && !this.applyToFailed) {
/* 10 */       return Unit.INSTANCE;
/*    */     }
/* 12 */     if (this.consumer.consume(assistantAnswer.getMessage(), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.consumer.consume(assistantAnswer.getMessage(), $completion);  this.consumer.consume(assistantAnswer.getMessage(), $completion); return Unit.INSTANCE;
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\builder\AssistantMessageConsumerHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */