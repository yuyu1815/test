/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\000\n\002\020\t\n\000\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B+\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\t¢\006\004\b\n\020\013J\t\020\024\032\0020\003HÆ\003J\t\020\025\032\0020\005HÆ\003J\t\020\026\032\0020\007HÆ\003J\013\020\027\032\004\030\0010\tHÆ\003J3\020\030\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\tHÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\001HÖ\003J\t\020\034\032\0020\005HÖ\001J\t\020\035\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\022\020\023¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;", "", "query", "", "queryLimit", "", "timeoutMs", "", "filter", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;", "<init>", "(Ljava/lang/String;IJLcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;)V", "getQuery", "()Ljava/lang/String;", "getQueryLimit", "()I", "getTimeoutMs", "()J", "getFilter", "()Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ej-core"})
/*    */ public final class SearchQuery
/*    */ {
/*    */   @NotNull
/*    */   private final String query;
/*    */   private final int queryLimit;
/*    */   private final long timeoutMs;
/*    */   @Nullable
/*    */   private final SearchResultsFilter filter;
/*    */   
/*    */   public SearchQuery(@NotNull String query, int queryLimit, long timeoutMs, @Nullable SearchResultsFilter filter) {
/* 33 */     this.query = query;
/* 34 */     this.queryLimit = queryLimit;
/*    */     
/* 36 */     this.timeoutMs = timeoutMs;
/* 37 */     this.filter = filter; } @Nullable public final SearchResultsFilter getFilter() { return this.filter; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getQuery() {
/*    */     return this.query;
/*    */   }
/*    */   
/*    */   public final int getQueryLimit() {
/*    */     return this.queryLimit;
/*    */   }
/*    */   
/*    */   public final long getTimeoutMs() {
/*    */     return this.timeoutMs;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.query;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.queryLimit;
/*    */   }
/*    */   
/*    */   public final long component3() {
/*    */     return this.timeoutMs;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final SearchResultsFilter component4() {
/*    */     return this.filter;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SearchQuery copy(@NotNull String query, int queryLimit, long timeoutMs, @Nullable SearchResultsFilter filter) {
/*    */     Intrinsics.checkNotNullParameter(query, "query");
/*    */     return new SearchQuery(query, queryLimit, timeoutMs, filter);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SearchQuery(query=" + this.query + ", queryLimit=" + this.queryLimit + ", timeoutMs=" + this.timeoutMs + ", filter=" + this.filter + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.query.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.queryLimit);
/*    */     result = result * 31 + Long.hashCode(this.timeoutMs);
/*    */     return result * 31 + ((this.filter == null) ? 0 : this.filter.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SearchQuery))
/*    */       return false; 
/*    */     SearchQuery searchQuery = (SearchQuery)other;
/*    */     return !Intrinsics.areEqual(this.query, searchQuery.query) ? false : ((this.queryLimit != searchQuery.queryLimit) ? false : ((this.timeoutMs != searchQuery.timeoutMs) ? false : (!!Intrinsics.areEqual(this.filter, searchQuery.filter))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\SearchQuery.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */