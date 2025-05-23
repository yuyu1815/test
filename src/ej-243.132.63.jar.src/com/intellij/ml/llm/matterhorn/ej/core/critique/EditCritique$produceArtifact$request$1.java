/*    */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*    */ import com.intellij.ml.llm.matterhorn.requests.ReviewerResponse;
/*    */ import java.util.List;
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
/*    */ @DebugMetadata(f = "EditCritique.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.EditCritique$produceArtifact$request$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "answer", "", "attempt", ""})
/*    */ final class EditCritique$produceArtifact$request$1
/*    */   extends SuspendLambda
/*    */   implements Function3<String, Integer, Continuation<? super ReviewerResponse>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   EditCritique$produceArtifact$request$1(List<MatterhornChatElement> $actionsToRank, Continuation $completion) {
/*    */     super(3, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     String answer;
/*    */     EditCritiqueResponseParseResult parseRes;
/* 73 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); answer = (String)this.L$0;
/* 74 */         parseRes = EditCritique.access$parseBestAction(EditCritique.this, answer, this.$actionsToRank);
/* 75 */         if (parseRes instanceof EditCritiqueResponseParseResult.Error) {
/* 76 */           return ReviewerResponse.Companion.error$default(ReviewerResponse.Companion, ((EditCritiqueResponseParseResult.Error)parseRes).getMessage(), null, 2, null);
/*    */         }
/* 78 */         return ReviewerResponse.Companion.ok(); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Object invoke(String p1, int p2, Continuation<? super EditCritique$produceArtifact$request$1> p3) {
/*    */     EditCritique$produceArtifact$request$1 editCritique$produceArtifact$request$1 = new EditCritique$produceArtifact$request$1(this.$actionsToRank, p3);
/*    */     editCritique$produceArtifact$request$1.L$0 = p1;
/*    */     return editCritique$produceArtifact$request$1.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\EditCritique$produceArtifact$request$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */