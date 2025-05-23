/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b&\030\000 \0302\0020\001:\001\030B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J$\020\b\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\f2\006\020\r\032\0020\016H@¢\006\002\020\017J\020\020\020\032\0020\0212\006\020\013\032\0020\fH\026J$\020\022\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\f2\006\020\r\032\0020\016H¤@¢\006\002\020\017J\020\020\023\032\0020\f2\006\020\013\032\0020\fH\024J\026\020\024\032\0020\021*\004\030\0010\0252\006\020\026\032\0020\027H\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractProjectSearcher;", "", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "search", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "query", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;", "disposable", "Lcom/intellij/openapi/Disposable;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/openapi/Disposable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectSearchQuery", "", "searchProject", "enhanceSearchQuery", "checkFile", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;", "file", "Lcom/intellij/psi/PsiFile;", "Companion", "ej-core"})
/*    */ public abstract class AbstractProjectSearcher {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Project project;
/*    */   
/*  9 */   public AbstractProjectSearcher(@NotNull Project project) { this.project = project; } public static final int SEARCH_QUERY_LIMIT = 10; public static final int DEFAULT_WEIGHT = 1; @NotNull public final Project getProject() { return this.project; }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractProjectSearcher$Companion;", "", "<init>", "()V", "SEARCH_QUERY_LIMIT", "", "DEFAULT_WEIGHT", "ej-core"})
/*    */   public static final class Companion {
/*    */     private Companion() {} }
/*    */   
/*    */   @Nullable
/*    */   public final Object search(@NotNull SearchQuery query, @NotNull Disposable disposable, @NotNull Continuation<? super List<SearchResultItem>> $completion) {
/* 17 */     return searchProject(enhanceSearchQuery(query), disposable, $completion);
/*    */   }
/*    */   public boolean detectSearchQuery(@NotNull SearchQuery query) {
/* 20 */     Intrinsics.checkNotNullParameter(query, "query"); return false;
/*    */   } @Nullable
/*    */   protected abstract Object searchProject(@NotNull SearchQuery paramSearchQuery, @NotNull Disposable paramDisposable, @NotNull Continuation<? super List<SearchResultItem>> paramContinuation); @NotNull
/*    */   protected SearchQuery enhanceSearchQuery(@NotNull SearchQuery query) {
/* 24 */     Intrinsics.checkNotNullParameter(query, "query"); return query;
/*    */   } protected final boolean checkFile(@Nullable SearchResultsFilter $this$checkFile, @NotNull PsiFile file) {
/* 26 */     Intrinsics.checkNotNullParameter(file, "file"); return 
/* 27 */       ($this$checkFile == null) ? true : 
/* 28 */       $this$checkFile.checkFile(file);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\AbstractProjectSearcher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */