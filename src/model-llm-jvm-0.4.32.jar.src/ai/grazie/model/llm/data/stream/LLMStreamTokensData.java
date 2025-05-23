/*    */ package ai.grazie.model.llm.data.stream;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\022\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\n\b\002\020\005\032\004\030\0010\003\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007J\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\003HÆ\003J\020\020\021\032\004\030\0010\003HÆ\003¢\006\002\020\tJ\020\020\022\032\004\030\0010\003HÆ\003¢\006\002\020\tJ:\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\n\b\002\020\005\032\004\030\0010\0032\n\b\002\020\006\032\004\030\0010\003HÆ\001¢\006\002\020\024J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\030HÖ\003J\t\020\031\032\0020\003HÖ\001J\021\020\032\032\0020\0002\006\020\027\032\0020\000H\002J\t\020\033\032\0020\034HÖ\001R\025\020\005\032\004\030\0010\003¢\006\n\n\002\020\n\032\004\b\b\020\tR\025\020\006\032\004\030\0010\003¢\006\n\n\002\020\n\032\004\b\013\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\r¨\006\035"}, d2 = {"Lai/grazie/model/llm/data/stream/LLMStreamTokensData;", "Lai/grazie/model/llm/data/stream/LLMStreamMetaData;", "outputTokens", "", "inputTokens", "cacheReadInputTokens", "cacheWriteInputTokens", "(IILjava/lang/Integer;Ljava/lang/Integer;)V", "getCacheReadInputTokens", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCacheWriteInputTokens", "getInputTokens", "()I", "getOutputTokens", "component1", "component2", "component3", "component4", "copy", "(IILjava/lang/Integer;Ljava/lang/Integer;)Lai/grazie/model/llm/data/stream/LLMStreamTokensData;", "equals", "", "other", "", "hashCode", "plus", "toString", "", "model-llm"})
/*    */ public final class LLMStreamTokensData extends LLMStreamMetaData {
/*    */   private final int outputTokens;
/*    */   private final int inputTokens;
/*    */   
/* 14 */   public LLMStreamTokensData(int outputTokens, int inputTokens, @Nullable Integer cacheReadInputTokens, @Nullable Integer cacheWriteInputTokens) { super(null); this.outputTokens = outputTokens; this.inputTokens = inputTokens; this.cacheReadInputTokens = cacheReadInputTokens; this.cacheWriteInputTokens = cacheWriteInputTokens; } @Nullable private final Integer cacheReadInputTokens; @Nullable private final Integer cacheWriteInputTokens; public final int getOutputTokens() { return this.outputTokens; } public final int getInputTokens() { return this.inputTokens; } @Nullable public final Integer getCacheReadInputTokens() { return this.cacheReadInputTokens; } @Nullable public final Integer getCacheWriteInputTokens() { return this.cacheWriteInputTokens; } @NotNull
/* 15 */   public final LLMStreamTokensData plus(@NotNull LLMStreamTokensData other) { Intrinsics.checkNotNullParameter(other, "other"); return new LLMStreamTokensData(
/* 16 */         this.outputTokens + other.outputTokens, 
/* 17 */         this.inputTokens + other.inputTokens, 
/* 18 */         Integer.valueOf(((this.cacheReadInputTokens != null) ? this.cacheReadInputTokens.intValue() : 0) + ((other.cacheReadInputTokens != null) ? other.cacheReadInputTokens.intValue() : 0)), 
/* 19 */         Integer.valueOf(((this.cacheWriteInputTokens != null) ? this.cacheWriteInputTokens.intValue() : 0) + ((other.cacheWriteInputTokens != null) ? other.cacheWriteInputTokens.intValue() : 0))); }
/*    */ 
/*    */   
/*    */   public final int component1() {
/*    */     return this.outputTokens;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.inputTokens;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component3() {
/*    */     return this.cacheReadInputTokens;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component4() {
/*    */     return this.cacheWriteInputTokens;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMStreamTokensData copy(int outputTokens, int inputTokens, @Nullable Integer cacheReadInputTokens, @Nullable Integer cacheWriteInputTokens) {
/*    */     return new LLMStreamTokensData(outputTokens, inputTokens, cacheReadInputTokens, cacheWriteInputTokens);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LLMStreamTokensData(outputTokens=" + this.outputTokens + ", inputTokens=" + this.inputTokens + ", cacheReadInputTokens=" + this.cacheReadInputTokens + ", cacheWriteInputTokens=" + this.cacheWriteInputTokens + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.outputTokens);
/*    */     result = result * 31 + Integer.hashCode(this.inputTokens);
/*    */     result = result * 31 + ((this.cacheReadInputTokens == null) ? 0 : this.cacheReadInputTokens.hashCode());
/*    */     return result * 31 + ((this.cacheWriteInputTokens == null) ? 0 : this.cacheWriteInputTokens.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LLMStreamTokensData))
/*    */       return false; 
/*    */     LLMStreamTokensData lLMStreamTokensData = (LLMStreamTokensData)other;
/*    */     return (this.outputTokens != lLMStreamTokensData.outputTokens) ? false : ((this.inputTokens != lLMStreamTokensData.inputTokens) ? false : (!Intrinsics.areEqual(this.cacheReadInputTokens, lLMStreamTokensData.cacheReadInputTokens) ? false : (!!Intrinsics.areEqual(this.cacheWriteInputTokens, lLMStreamTokensData.cacheWriteInputTokens))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\data\stream\LLMStreamTokensData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */