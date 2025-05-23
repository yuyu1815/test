/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*    */ 
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\f\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B+\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0040\003\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\017\020\017\032\b\022\004\022\0020\0040\003HÆ\003J\017\020\020\032\b\022\004\022\0020\0040\003HÆ\003J\t\020\021\032\0020\007HÆ\003J3\020\022\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\016\b\002\020\005\032\b\022\004\022\0020\0040\0032\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\007HÖ\001J\t\020\027\032\0020\004HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\n\020\013R\027\020\005\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\f\020\013R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\r\020\016¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult;", "", "searchText", "", "", "replaceText", "matchIdx", "", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "getSearchText", "()Ljava/util/List;", "getReplaceText", "getMatchIdx", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ej-core"})
/*    */ public final class MatchedResult
/*    */ {
/*    */   @NotNull
/*    */   private final List<String> searchText;
/*    */   @NotNull
/*    */   private final List<String> replaceText;
/*    */   private final int matchIdx;
/*    */   
/*    */   public MatchedResult(@NotNull List<String> searchText, @NotNull List<String> replaceText, int matchIdx) {
/* 41 */     this.searchText = searchText;
/* 42 */     this.replaceText = replaceText;
/* 43 */     this.matchIdx = matchIdx; } public final int getMatchIdx() { return this.matchIdx; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final List<String> getSearchText() {
/*    */     return this.searchText;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> getReplaceText() {
/*    */     return this.replaceText;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component1() {
/*    */     return this.searchText;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component2() {
/*    */     return this.replaceText;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.matchIdx;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MatchedResult copy(@NotNull List<String> searchText, @NotNull List<String> replaceText, int matchIdx) {
/*    */     Intrinsics.checkNotNullParameter(searchText, "searchText");
/*    */     Intrinsics.checkNotNullParameter(replaceText, "replaceText");
/*    */     return new MatchedResult(searchText, replaceText, matchIdx);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "MatchedResult(searchText=" + this.searchText + ", replaceText=" + this.replaceText + ", matchIdx=" + this.matchIdx + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.searchText.hashCode();
/*    */     result = result * 31 + this.replaceText.hashCode();
/*    */     return result * 31 + Integer.hashCode(this.matchIdx);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof MatchedResult))
/*    */       return false; 
/*    */     MatchedResult matchedResult = (MatchedResult)other;
/*    */     return !Intrinsics.areEqual(this.searchText, matchedResult.searchText) ? false : (!Intrinsics.areEqual(this.replaceText, matchedResult.replaceText) ? false : (!(this.matchIdx != matchedResult.matchIdx)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\MatchedResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */