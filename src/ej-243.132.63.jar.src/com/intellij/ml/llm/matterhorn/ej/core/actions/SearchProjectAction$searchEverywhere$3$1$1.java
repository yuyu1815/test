/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.ProjectSearchEverywhereService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchQuery;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchResultItem;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "SearchProjectAction.kt", l = {146}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.SearchProjectAction$searchEverywhere$3$1$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$SearchResultGroup;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class SearchProjectAction$searchEverywhere$3$1$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super SearchProjectAction.SearchResultGroup>, Object>
/*     */ {
/*     */   Object L$0;
/*     */   int label;
/*     */   
/*     */   SearchProjectAction$searchEverywhere$3$1$1(ProjectSearchEverywhereService.SearchType $it, ProjectSearchEverywhereService $searchEverywhere, SearchQuery $query, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     ProjectSearchEverywhereService.SearchType searchType1;
/*     */     List<SearchResultItem> list;
/*     */     ProjectSearchEverywhereService.SearchType searchType2;
/* 143 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         
/* 145 */         searchType1 = this.$it;
/* 146 */         this.L$0 = searchType1; this.label = 1; if (this.$searchEverywhere.search(this.$query, this.$it, (Continuation)this) == object) return object;  list = (List)this.$searchEverywhere.search(this.$query, this.$it, (Continuation)this);
/*     */         searchType2 = searchType1;
/*     */         return new SearchProjectAction.SearchResultGroup(searchType2, list);
/*     */       case 1:
/*     */         searchType1 = (ProjectSearchEverywhereService.SearchType)this.L$0;
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         list = (List<SearchResultItem>)SYNTHETIC_LOCAL_VARIABLE_1;
/*     */         searchType2 = searchType1;
/*     */         return new SearchProjectAction.SearchResultGroup(searchType2, list); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super SearchProjectAction$searchEverywhere$3$1$1> $completion) {
/*     */     return (Continuation<Unit>)new SearchProjectAction$searchEverywhere$3$1$1(this.$it, this.$searchEverywhere, this.$query, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((SearchProjectAction$searchEverywhere$3$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\SearchProjectAction$searchEverywhere$3$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */