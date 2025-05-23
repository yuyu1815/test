/*     */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.ml.llm.matterhorn.requests.ReviewerResponse;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.SerializationException;
/*     */ import kotlinx.serialization.json.Json;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "RankingCritique.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.RankingCritique$produceArtifact$request$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "answer", "", "attempt", ""})
/*     */ @SourceDebugExtension({"SMAP\nRankingCritique.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankingCritique.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique$produceArtifact$request$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,169:1\n222#2:170\n*S KotlinDebug\n*F\n+ 1 RankingCritique.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique$produceArtifact$request$1\n*L\n63#1:170\n*E\n"})
/*     */ final class RankingCritique$produceArtifact$request$1
/*     */   extends SuspendLambda
/*     */   implements Function3<String, Integer, Continuation<? super ReviewerResponse>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   RankingCritique$produceArtifact$request$1(List<MatterhornChatElement> $actionsToRank, Continuation $completion) {
/*     */     super(3, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     String answer;
/*     */     RankingCritiqueModelResponse parsed;
/*  60 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); answer = (String)this.L$0;
/*     */         
/*     */         try {
/*  63 */           Json this_$iv = (Json)Json.Default; int $i$f$decodeFromString = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 170 */           this_$iv.getSerializersModule(); parsed = (RankingCritiqueModelResponse)this_$iv.decodeFromString((DeserializationStrategy)RankingCritiqueModelResponse.Companion.serializer(), answer);
/*     */         } catch (SerializationException e) {
/*     */           return ReviewerResponse.Companion.error$default(ReviewerResponse.Companion, "You should answer with a valid json. Please return only json object without any additional text or symbols. Failed to parse your response, error: " + e.getMessage(), null, 2, null);
/*     */         } 
/*     */         try {
/*     */           RankingCritique.this.getRanks(parsed, this.$actionsToRank);
/*     */         } catch (Exception e) {
/*     */           if (e.getMessage() == null)
/*     */             e.getMessage(); 
/*     */           return ReviewerResponse.Companion.error$default((ReviewerResponse.Companion)e.getMessage(), e.toString(), null, 2, null);
/*     */         } 
/*     */         return ReviewerResponse.Companion.ok(); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Object invoke(String p1, int p2, Continuation<? super RankingCritique$produceArtifact$request$1> p3) {
/*     */     RankingCritique$produceArtifact$request$1 rankingCritique$produceArtifact$request$1 = new RankingCritique$produceArtifact$request$1(this.$actionsToRank, p3);
/*     */     rankingCritique$produceArtifact$request$1.L$0 = p1;
/*     */     return rankingCritique$produceArtifact$request$1.invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\RankingCritique$produceArtifact$request$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */