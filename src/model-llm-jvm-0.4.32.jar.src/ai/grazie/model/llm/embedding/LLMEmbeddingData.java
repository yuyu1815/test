/*   */ package ai.grazie.model.llm.embedding;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\006\030\0002\0020\001B\033\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\006¢\006\002\020\007R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lai/grazie/model/llm/embedding/LLMEmbeddingData;", "", "embeddings", "", "Lai/grazie/emb/DoubleTextEmbedding;", "tokens", "Lai/grazie/model/llm/embedding/LLMEmbeddingTokensData;", "(Ljava/util/List;Lai/grazie/model/llm/embedding/LLMEmbeddingTokensData;)V", "getEmbeddings", "()Ljava/util/List;", "getTokens", "()Lai/grazie/model/llm/embedding/LLMEmbeddingTokensData;", "model-llm"})
/*   */ public final class LLMEmbeddingData { @NotNull
/*   */   private final List<DoubleTextEmbedding> embeddings;
/*   */   
/* 6 */   public LLMEmbeddingData(@NotNull List<DoubleTextEmbedding> embeddings, @NotNull LLMEmbeddingTokensData tokens) { this.embeddings = embeddings;
/* 7 */     this.tokens = tokens; } @NotNull private final LLMEmbeddingTokensData tokens; @NotNull public final List<DoubleTextEmbedding> getEmbeddings() { return this.embeddings; } @NotNull public final LLMEmbeddingTokensData getTokens() { return this.tokens; }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\embedding\LLMEmbeddingData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */