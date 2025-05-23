/*   */ package ai.grazie.code.indexing.model.index;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\000\n\002\020 \n\002\020\016\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\007J\t\020\f\032\0020\003HÆ\003J\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J#\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\006HÖ\001R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lai/grazie/code/indexing/model/index/StoredIndex;", "", "vectorFetchingTime", "", "chunkSample", "", "", "(JLjava/util/List;)V", "getChunkSample", "()Ljava/util/List;", "getVectorFetchingTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model-indexing"})
/* 3 */ public final class StoredIndex { private final long vectorFetchingTime; public StoredIndex(long vectorFetchingTime, @NotNull List<String> chunkSample) { this.vectorFetchingTime = vectorFetchingTime; this.chunkSample = chunkSample; } @NotNull private final List<String> chunkSample; public final long getVectorFetchingTime() { return this.vectorFetchingTime; } @NotNull public final List<String> getChunkSample() { return this.chunkSample; }
/*   */ 
/*   */   
/*   */   public final long component1() {
/*   */     return this.vectorFetchingTime;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final List<String> component2() {
/*   */     return this.chunkSample;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final StoredIndex copy(long vectorFetchingTime, @NotNull List<String> chunkSample) {
/*   */     Intrinsics.checkNotNullParameter(chunkSample, "chunkSample");
/*   */     return new StoredIndex(vectorFetchingTime, chunkSample);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "StoredIndex(vectorFetchingTime=" + this.vectorFetchingTime + ", chunkSample=" + this.chunkSample + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = Long.hashCode(this.vectorFetchingTime);
/*   */     return result * 31 + this.chunkSample.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof StoredIndex))
/*   */       return false; 
/*   */     StoredIndex storedIndex = (StoredIndex)other;
/*   */     return (this.vectorFetchingTime != storedIndex.vectorFetchingTime) ? false : (!!Intrinsics.areEqual(this.chunkSample, storedIndex.chunkSample));
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\index\StoredIndex.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */