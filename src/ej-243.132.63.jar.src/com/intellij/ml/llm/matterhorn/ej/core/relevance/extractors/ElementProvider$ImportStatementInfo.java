/*    */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*    */ 
/*    */ import kotlin.Pair;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\020\b\n\002\b\n\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0060\005¢\006\004\b\007\020\bJ\t\020\r\032\0020\003HÆ\003J\025\020\016\032\016\022\004\022\0020\006\022\004\022\0020\0060\005HÆ\003J)\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\024\b\002\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0060\005HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\006HÖ\001J\t\020\024\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\035\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "", "text", "", "range", "Lkotlin/Pair;", "", "<init>", "(Ljava/lang/String;Lkotlin/Pair;)V", "getText", "()Ljava/lang/String;", "getRange", "()Lkotlin/Pair;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "ej-core"})
/*    */ public final class ImportStatementInfo {
/*    */   @NotNull
/*    */   private final String text;
/*    */   @NotNull
/*    */   private final Pair<Integer, Integer> range;
/*    */   
/* 13 */   public ImportStatementInfo(@NotNull String text, @NotNull Pair<Integer, Integer> range) { this.text = text;
/* 14 */     this.range = range; } @NotNull public final Pair<Integer, Integer> getRange() { return this.range; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getText() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Pair<Integer, Integer> component2() {
/*    */     return this.range;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ImportStatementInfo copy(@NotNull String text, @NotNull Pair<Integer, Integer> range) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(range, "range");
/*    */     return new ImportStatementInfo(text, range);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ImportStatementInfo(text=" + this.text + ", range=" + this.range + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.text.hashCode();
/*    */     return result * 31 + this.range.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ImportStatementInfo))
/*    */       return false; 
/*    */     ImportStatementInfo importStatementInfo = (ImportStatementInfo)other;
/*    */     return !Intrinsics.areEqual(this.text, importStatementInfo.text) ? false : (!!Intrinsics.areEqual(this.range, importStatementInfo.range));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\ElementProvider$ImportStatementInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */