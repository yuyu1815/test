/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ 
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\016\n\002\b\n\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\021\032\0020\003HÆ\003J\023\020\022\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\tHÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\0020\tX\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\rR\032\020\016\032\0020\003X\016¢\006\016\n\000\032\004\b\017\020\007\"\004\b\020\020\005¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultContent;", "", "startLine", "", "<init>", "(I)V", "getStartLine", "()I", "lineText", "", "getLineText", "()Ljava/lang/String;", "setLineText", "(Ljava/lang/String;)V", "weight", "getWeight", "setWeight", "component1", "copy", "equals", "", "other", "hashCode", "toString", "ej-core"})
/*    */ public final class SearchResultContent
/*    */ {
/*    */   private final int startLine;
/*    */   @NotNull
/*    */   private String lineText;
/*    */   private int weight;
/*    */   
/*    */   public final int getStartLine() {
/*    */     return this.startLine;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getLineText() {
/*    */     return this.lineText;
/*    */   }
/*    */   
/*    */   public final void setLineText(@NotNull String <set-?>) {
/*    */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */     this.lineText = <set-?>;
/*    */   }
/*    */   
/*    */   public SearchResultContent(int startLine) {
/* 46 */     this.startLine = startLine;
/* 47 */     this.lineText = "";
/* 48 */     this.weight = 1; } public final int getWeight() { return this.weight; } public final void setWeight(int <set-?>) { this.weight = <set-?>; }
/*    */ 
/*    */   
/*    */   public final int component1() {
/*    */     return this.startLine;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SearchResultContent copy(int startLine) {
/*    */     return new SearchResultContent(startLine);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SearchResultContent(startLine=" + this.startLine + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return Integer.hashCode(this.startLine);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SearchResultContent))
/*    */       return false; 
/*    */     SearchResultContent searchResultContent = (SearchResultContent)other;
/*    */     return !(this.startLine != searchResultContent.startLine);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\SearchResultContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */