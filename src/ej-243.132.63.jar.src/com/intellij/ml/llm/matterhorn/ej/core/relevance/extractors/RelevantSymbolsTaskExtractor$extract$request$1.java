/*    */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
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
/*    */ @DebugMetadata(f = "RelevantSymbolsTaskExtractor.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.RelevantSymbolsTaskExtractor$extract$request$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0020\001H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "<unused var>", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "optionsToRank"})
/*    */ final class RelevantSymbolsTaskExtractor$extract$request$1
/*    */   extends SuspendLambda
/*    */   implements Function3<ExecutionContext, List<? extends MatterhornChatElement>, Continuation<? super List<? extends MatterhornChatElement>>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   RelevantSymbolsTaskExtractor$extract$request$1(Continuation $completion) {
/*    */     super(3, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     List<? extends MatterhornChatElement> optionsToRank;
/* 53 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); optionsToRank = (List)this.L$0;
/*    */         
/* 55 */         return CollectionsKt.listOf(ExtractorUtilsKt.combineMultipleResponse(optionsToRank)); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Object invoke(ExecutionContext p1, List p2, Continuation<? super RelevantSymbolsTaskExtractor$extract$request$1> p3) {
/*    */     RelevantSymbolsTaskExtractor$extract$request$1 relevantSymbolsTaskExtractor$extract$request$1 = new RelevantSymbolsTaskExtractor$extract$request$1(p3);
/*    */     relevantSymbolsTaskExtractor$extract$request$1.L$0 = p2;
/*    */     return relevantSymbolsTaskExtractor$extract$request$1.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\RelevantSymbolsTaskExtractor$extract$request$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */