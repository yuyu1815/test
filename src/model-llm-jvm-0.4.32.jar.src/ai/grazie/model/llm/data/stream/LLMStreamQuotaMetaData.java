/*    */ package ai.grazie.model.llm.data.stream;
/*    */ 
/*    */ import ai.grazie.utils.mpp.money.Credit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\026"}, d2 = {"Lai/grazie/model/llm/data/stream/LLMStreamQuotaMetaData;", "Lai/grazie/model/llm/data/stream/LLMStreamMetaData;", "updated", "Lai/grazie/quota/Quota;", "spent", "Lai/grazie/utils/mpp/money/Credit;", "(Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;)V", "getSpent", "()Lai/grazie/utils/mpp/money/Credit;", "getUpdated", "()Lai/grazie/quota/Quota;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model-llm"})
/*    */ public final class LLMStreamQuotaMetaData extends LLMStreamMetaData {
/*    */   @NotNull
/*    */   private final Quota updated;
/*    */   
/* 11 */   public LLMStreamQuotaMetaData(@NotNull Quota updated, @NotNull Credit spent) { super(null); this.updated = updated; this.spent = spent; } @NotNull private final Credit spent; @NotNull public final Quota getUpdated() { return this.updated; } @NotNull public final Credit getSpent() { return this.spent; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Quota component1() {
/*    */     return this.updated;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Credit component2() {
/*    */     return this.spent;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMStreamQuotaMetaData copy(@NotNull Quota updated, @NotNull Credit spent) {
/*    */     Intrinsics.checkNotNullParameter(updated, "updated");
/*    */     Intrinsics.checkNotNullParameter(spent, "spent");
/*    */     return new LLMStreamQuotaMetaData(updated, spent);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LLMStreamQuotaMetaData(updated=" + this.updated + ", spent=" + this.spent + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.updated.hashCode();
/*    */     return result * 31 + this.spent.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LLMStreamQuotaMetaData))
/*    */       return false; 
/*    */     LLMStreamQuotaMetaData lLMStreamQuotaMetaData = (LLMStreamQuotaMetaData)other;
/*    */     return !Intrinsics.areEqual(this.updated, lLMStreamQuotaMetaData.updated) ? false : (!!Intrinsics.areEqual(this.spent, lLMStreamQuotaMetaData.spent));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\data\stream\LLMStreamQuotaMetaData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */