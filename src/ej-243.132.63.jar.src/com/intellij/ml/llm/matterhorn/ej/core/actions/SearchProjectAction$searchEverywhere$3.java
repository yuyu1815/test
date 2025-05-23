/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.ProjectSearchEverywhereService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchQuery;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchResultItem;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchResultsFilter;
/*     */ import java.nio.file.Path;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.AwaitKt;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Deferred;
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
/*     */ @DebugMetadata(f = "SearchProjectAction.kt", l = {149, 149}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.SearchProjectAction$searchEverywhere$3")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nSearchProjectAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchProjectAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$searchEverywhere$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,275:1\n1557#2:276\n1628#2,3:277\n*S KotlinDebug\n*F\n+ 1 SearchProjectAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$searchEverywhere$3\n*L\n142#1:276\n142#1:277,3\n*E\n"})
/*     */ final class SearchProjectAction$searchEverywhere$3
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super String>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   SearchProjectAction$searchEverywhere$3(ProjectSearchEverywhereService $searchEverywhere, SearchQuery $query, String $searchTerm, SearchResultsFilter $filter, Function2<Path, Continuation<? super Boolean>, Object> $mustIgnore, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     CoroutineScope $this$coroutineScope;
/*     */     Iterable $this$map$iv;
/*     */     ProjectSearchEverywhereService projectSearchEverywhereService;
/*     */     SearchQuery searchQuery;
/*     */     int $i$f$map;
/*     */     Iterable iterable1;
/*     */     Collection<Deferred> destination$iv$iv;
/*     */     int $i$f$mapTo;
/*     */     SearchProjectAction searchProjectAction;
/* 140 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$coroutineScope = (CoroutineScope)this.L$0;
/* 141 */         searchProjectAction = SearchProjectAction.this; $this$map$iv = this.$searchEverywhere.detectSearchTypes(this.$query);
/* 142 */         projectSearchEverywhereService = this.$searchEverywhere; searchQuery = this.$query; $i$f$map = 0;
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
/* 276 */         iterable1 = $this$map$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0;
/* 277 */         for (Object item$iv$iv : iterable1) {
/* 278 */           ProjectSearchEverywhereService.SearchType searchType = (ProjectSearchEverywhereService.SearchType)item$iv$iv; Collection<Deferred> collection = destination$iv$iv; int $i$a$-map-SearchProjectAction$searchEverywhere$3$1 = 0; collection.add(BuildersKt.async$default($this$coroutineScope, null, null, new SearchProjectAction$searchEverywhere$3$1$1(searchType, projectSearchEverywhereService, searchQuery, null), 3, null));
/* 279 */         }  this.L$0 = searchProjectAction; this.label = 1; if (AwaitKt.awaitAll(destination$iv$iv, (Continuation)this) == object) return object;  this.L$0 = null; this.label = 2; if (SearchProjectAction.access$toFilteredResultGroup(searchProjectAction, (List)AwaitKt.awaitAll(destination$iv$iv, (Continuation)this), this.$searchTerm, this.$filter, this.$mustIgnore, (Continuation)this) == object) return object;  return SearchProjectAction.access$toFilteredResultGroup(searchProjectAction, (List)AwaitKt.awaitAll(destination$iv$iv, (Continuation)this), this.$searchTerm, this.$filter, this.$mustIgnore, (Continuation)this);
/*     */       case 1:
/*     */         searchProjectAction = (SearchProjectAction)this.L$0;
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         this.L$0 = null;
/*     */         this.label = 2;
/*     */         if (SearchProjectAction.access$toFilteredResultGroup(searchProjectAction, (List)SYNTHETIC_LOCAL_VARIABLE_1, this.$searchTerm, this.$filter, this.$mustIgnore, (Continuation)this) == object)
/*     */           return object; 
/*     */         return SearchProjectAction.access$toFilteredResultGroup(searchProjectAction, (List)SYNTHETIC_LOCAL_VARIABLE_1, this.$searchTerm, this.$filter, this.$mustIgnore, (Continuation)this);
/*     */       case 2:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super SearchProjectAction$searchEverywhere$3> $completion) {
/*     */     SearchProjectAction$searchEverywhere$3 searchProjectAction$searchEverywhere$3 = new SearchProjectAction$searchEverywhere$3(this.$searchEverywhere, this.$query, this.$searchTerm, this.$filter, this.$mustIgnore, $completion);
/*     */     searchProjectAction$searchEverywhere$3.L$0 = value;
/*     */     return (Continuation<Unit>)searchProjectAction$searchEverywhere$3;
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((SearchProjectAction$searchEverywhere$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\SearchProjectAction$searchEverywhere$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */