/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.services.ProjectSearchEverywhereService;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchResultItem;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bJ\t\020\r\032\0020\003HÆ\003J\017\020\016\032\b\022\004\022\0020\0060\005HÆ\003J#\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\026HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$SearchResultGroup;", "", "sourceType", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;", "results", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;Ljava/util/List;)V", "getSourceType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ej-core"})
/*    */ public final class SearchResultGroup
/*    */ {
/*    */   @NotNull
/*    */   private final ProjectSearchEverywhereService.SearchType sourceType;
/*    */   @NotNull
/*    */   private final List<SearchResultItem> results;
/*    */   
/*    */   public SearchResultGroup(@NotNull ProjectSearchEverywhereService.SearchType sourceType, @NotNull List<SearchResultItem> results) {
/* 94 */     this.sourceType = sourceType; this.results = results; } @NotNull public final ProjectSearchEverywhereService.SearchType getSourceType() { return this.sourceType; } @NotNull public final List<SearchResultItem> getResults() { return this.results; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ProjectSearchEverywhereService.SearchType component1() {
/*    */     return this.sourceType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<SearchResultItem> component2() {
/*    */     return this.results;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SearchResultGroup copy(@NotNull ProjectSearchEverywhereService.SearchType sourceType, @NotNull List<SearchResultItem> results) {
/*    */     Intrinsics.checkNotNullParameter(sourceType, "sourceType");
/*    */     Intrinsics.checkNotNullParameter(results, "results");
/*    */     return new SearchResultGroup(sourceType, results);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SearchResultGroup(sourceType=" + this.sourceType + ", results=" + this.results + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.sourceType.hashCode();
/*    */     return result * 31 + this.results.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SearchResultGroup))
/*    */       return false; 
/*    */     SearchResultGroup searchResultGroup = (SearchResultGroup)other;
/*    */     return (this.sourceType != searchResultGroup.sourceType) ? false : (!!Intrinsics.areEqual(this.results, searchResultGroup.results));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\SearchProjectAction$SearchResultGroup.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */