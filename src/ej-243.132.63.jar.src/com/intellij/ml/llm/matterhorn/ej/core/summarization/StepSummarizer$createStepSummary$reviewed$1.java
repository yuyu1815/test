/*    */ package com.intellij.ml.llm.matterhorn.ej.core.summarization;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.requests.ReviewerResponse;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "StepSummarizer.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.summarization.StepSummarizer$createStepSummary$reviewed$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "answer", "", "attempt", ""})
/*    */ final class StepSummarizer$createStepSummary$reviewed$1
/*    */   extends SuspendLambda
/*    */   implements Function3<String, Integer, Continuation<? super ReviewerResponse>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   StepSummarizer$createStepSummary$reviewed$1(Continuation $completion) {
/*    */     super(3, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     String answer;
/*    */     int attempt;
/* 51 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); answer = (String)this.L$0; attempt = this.I$0;
/* 52 */         if (answer.length() < 260 || attempt > 2) {
/* 53 */           return ReviewerResponse.Companion.ok();
/*    */         }
/* 55 */         return ReviewerResponse.Companion.error$default(ReviewerResponse.Companion, "Your response is too long. Make it shorter, return only short summary without any additional text or symbols.", null, 2, null); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Object invoke(String p1, int p2, Continuation<? super StepSummarizer$createStepSummary$reviewed$1> p3) {
/*    */     StepSummarizer$createStepSummary$reviewed$1 stepSummarizer$createStepSummary$reviewed$1 = new StepSummarizer$createStepSummary$reviewed$1(p3);
/*    */     stepSummarizer$createStepSummary$reviewed$1.L$0 = p1;
/*    */     stepSummarizer$createStepSummary$reviewed$1.I$0 = p2;
/*    */     return stepSummarizer$createStepSummary$reviewed$1.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\summarization\StepSummarizer$createStepSummary$reviewed$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */