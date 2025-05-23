/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchQuery;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Service({Service.Level.PROJECT})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\b\007\030\000 \0242\0020\001:\002\023\024B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J$\020\b\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\f2\006\020\r\032\0020\016H@¢\006\002\020\017J\024\020\020\032\b\022\004\022\0020\0160\t2\006\020\013\032\0020\fJ\b\020\021\032\0020\022H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService;", "Lcom/intellij/openapi/Disposable;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "search", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "query", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;", "searchType", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectSearchTypes", "dispose", "", "SearchType", "Companion", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nProjectSearchEverywhereService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectSearchEverywhereService.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n774#2:47\n865#2,2:48\n1#3:50\n*S KotlinDebug\n*F\n+ 1 ProjectSearchEverywhereService.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService\n*L\n41#1:47\n41#1:48,2\n*E\n"})
/*    */ public final class ProjectSearchEverywhereService implements Disposable {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 15 */   public ProjectSearchEverywhereService(@NotNull Project project) { this.project = project; } @NotNull private final Project project; @NotNull public final Project getProject() { return this.project; }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\b\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;", "", "<init>", "(Ljava/lang/String;I)V", "FILES", "FILES_OR_DIRECTORIES", "CLASSES", "SYMBOLS", "TEXT", "ej-core"})
/* 18 */   public enum SearchType { FILES,
/* 19 */     FILES_OR_DIRECTORIES,
/* 20 */     CLASSES,
/* 21 */     SYMBOLS,
/* 22 */     TEXT; @NotNull
/* 23 */     public static EnumEntries<SearchType> getEntries() { return $ENTRIES; }
/*    */      } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\002¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$Companion;", "", "<init>", "()V", "getSearcher", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractProjectSearcher;", "project", "Lcom/intellij/openapi/project/Project;", "searchType", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;", "ej-core"})
/*    */   public static final class Companion { private Companion() {} private final AbstractProjectSearcher getSearcher(Project project, ProjectSearchEverywhereService.SearchType searchType) {
/* 26 */       switch (WhenMappings.$EnumSwitchMapping$0[searchType.ordinal()]) { case 1: case 2: case 3: case 4: case 5:  }  throw new NoWhenBranchMatchedException();
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final Object search(@NotNull SearchQuery query, @NotNull SearchType searchType, @NotNull Continuation $completion) {
/* 36 */     AbstractProjectSearcher searcher = Companion.getSearcher(this.project, searchType);
/* 37 */     return searcher.search(query, this, $completion);
/*    */   }
/*    */   @NotNull
/*    */   public final List<SearchType> detectSearchTypes(@NotNull SearchQuery query) {
/* 41 */     Intrinsics.checkNotNullParameter(query, "query"); Iterable $this$filter$iv = (Iterable)SearchType.getEntries(); int $i$f$filter = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 47 */     Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 48 */     for (Object element$iv$iv : iterable1) { SearchType it = (SearchType)element$iv$iv; int $i$a$-filter-ProjectSearchEverywhereService$detectSearchTypes$filteredTypes$1 = 0; if (Companion.getSearcher(this.project, it).detectSearchQuery(query)) destination$iv$iv.add(element$iv$iv);  }
/* 49 */      List filteredTypes = (List)destination$iv$iv; $this$filter$iv = filteredTypes;
/* 50 */     int $i$a$-ifEmpty-ProjectSearchEverywhereService$detectSearchTypes$1 = 0;
/*    */     SearchType[] arrayOfSearchType = new SearchType[4];
/*    */     arrayOfSearchType[0] = SearchType.FILES;
/*    */     arrayOfSearchType[1] = SearchType.CLASSES;
/*    */     arrayOfSearchType[2] = SearchType.SYMBOLS;
/*    */     arrayOfSearchType[3] = SearchType.TEXT;
/*    */     return $this$filter$iv.isEmpty() ? CollectionsKt.listOf((Object[])arrayOfSearchType) : (List<SearchType>)$this$filter$iv;
/*    */   }
/*    */   
/*    */   public void dispose() {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\ProjectSearchEverywhereService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */