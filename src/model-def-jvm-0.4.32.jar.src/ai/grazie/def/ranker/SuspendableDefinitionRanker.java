/*    */ package ai.grazie.def.ranker;
/*    */ 
/*    */ import ai.grazie.def.WordDefinition;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\0002\0020\001:\001\fJ2\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\n0\003H¦@¢\006\002\020\013ø\001\000\002\006\n\004\b!0\001¨\006\rÀ\006\001"}, d2 = {"Lai/grazie/def/ranker/SuspendableDefinitionRanker;", "", "rank", "", "Lai/grazie/def/ranker/SuspendableDefinitionRanker$ScoredDefinition;", "text", "", "interval", "Lai/grazie/text/TextRange;", "definitions", "Lai/grazie/def/WordDefinition$Definition;", "(Ljava/lang/String;Lai/grazie/text/TextRange;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ScoredDefinition", "model-def"})
/*    */ public interface SuspendableDefinitionRanker {
/*    */   @Nullable
/*    */   Object rank(@NotNull String paramString, @NotNull TextRange paramTextRange, @NotNull List<WordDefinition.Definition> paramList, @NotNull Continuation<? super List<ScoredDefinition>> paramContinuation);
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\024HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\025"}, d2 = {"Lai/grazie/def/ranker/SuspendableDefinitionRanker$ScoredDefinition;", "", "definition", "Lai/grazie/def/WordDefinition$Definition;", "score", "", "(Lai/grazie/def/WordDefinition$Definition;D)V", "getDefinition", "()Lai/grazie/def/WordDefinition$Definition;", "getScore", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model-def"})
/*    */   public static final class ScoredDefinition {
/*    */     @NotNull
/*    */     private final WordDefinition.Definition definition;
/*    */     
/* 15 */     public ScoredDefinition(@NotNull WordDefinition.Definition definition, double score) { this.definition = definition;
/* 16 */       this.score = score; } private final double score; @NotNull public final WordDefinition.Definition getDefinition() { return this.definition; } public final double getScore() { return this.score; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final WordDefinition.Definition component1() {
/*    */       return this.definition;
/*    */     }
/*    */     
/*    */     public final double component2() {
/*    */       return this.score;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ScoredDefinition copy(@NotNull WordDefinition.Definition definition, double score) {
/*    */       Intrinsics.checkNotNullParameter(definition, "definition");
/*    */       return new ScoredDefinition(definition, score);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "ScoredDefinition(definition=" + this.definition + ", score=" + this.score + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.definition.hashCode();
/*    */       return result * 31 + Double.hashCode(this.score);
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof ScoredDefinition))
/*    */         return false; 
/*    */       ScoredDefinition scoredDefinition = (ScoredDefinition)other;
/*    */       return !Intrinsics.areEqual(this.definition, scoredDefinition.definition) ? false : (!(Double.compare(this.score, scoredDefinition.score) != 0));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-def-jvm-0.4.32.jar!\ai\grazie\def\ranker\SuspendableDefinitionRanker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */