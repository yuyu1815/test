/*    */ package com.intellij.ml.llm.matterhorn.requests;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 176)
/*    */ @SourceDebugExtension({"SMAP\nGrazieRequestBuilderEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieRequestBuilderEx.kt\ncom/intellij/ml/llm/matterhorn/requests/GrazieRequestBuilderExKt$addSimpleReviewer$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
/*    */ public final class GrazieRequestBuilderExKt$addSimpleReviewer$1 implements AssistantMessageReviewer {
/*    */   public GrazieRequestBuilderExKt$addSimpleReviewer$1(Function1<String, String> $reviewer) {}
/*    */   
/* 11 */   public final Object review(String message, Continuation $completion) { String it = (String)this.$reviewer.invoke(message);
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
/* 28 */     int $i$a$-let-GrazieRequestBuilderExKt$addSimpleReviewer$1$1 = 0; (String)this.$reviewer.invoke(message); return ((String)this.$reviewer.invoke(message) != null) ? new ReviewResult.Error(it) : ReviewResult.Companion.getSuccess(); } public final Object review$$forInline(String message, Continuation<? super GrazieRequestBuilderExKt$addSimpleReviewer$1$review$1> $completion) { InlineMarker.mark(4); InlineMarker.mark(5); new GrazieRequestBuilderExKt$addSimpleReviewer$1$review$1($completion); String str = (String)this.$reviewer.invoke(message); if (str != null) { String str1 = str, it = str1; int $i$a$-let-GrazieRequestBuilderExKt$addSimpleReviewer$1$1 = 0; }
/*    */     
/*    */     return ReviewResult.Companion.getSuccess(); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 176)
/*    */   public static final class GrazieRequestBuilderExKt$addSimpleReviewer$1$review$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     public GrazieRequestBuilderExKt$addSimpleReviewer$1$review$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GrazieRequestBuilderExKt$addSimpleReviewer$1.this.review(null, (Continuation<? super ReviewResult>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\GrazieRequestBuilderExKt$addSimpleReviewer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */