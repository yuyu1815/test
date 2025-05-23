/*   */ package ai.grazie.quota;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\rHÖ\001J\t\020\016\032\0020\017HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Lai/grazie/quota/QuotaSpent;", "", "updated", "Lai/grazie/quota/Quota;", "(Lai/grazie/quota/Quota;)V", "getUpdated", "()Lai/grazie/quota/Quota;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model-quota"})
/*   */ public final class QuotaSpent {
/* 4 */   public QuotaSpent(@NotNull Quota updated) { this.updated = updated; } @NotNull private final Quota updated; @NotNull public final Quota getUpdated() { return this.updated; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final Quota component1() {
/*   */     return this.updated;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final QuotaSpent copy(@NotNull Quota updated) {
/*   */     Intrinsics.checkNotNullParameter(updated, "updated");
/*   */     return new QuotaSpent(updated);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "QuotaSpent(updated=" + this.updated + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return this.updated.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof QuotaSpent))
/*   */       return false; 
/*   */     QuotaSpent quotaSpent = (QuotaSpent)other;
/*   */     return !!Intrinsics.areEqual(this.updated, quotaSpent.updated);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-quota-jvm-0.4.32.jar!\ai\grazie\quota\QuotaSpent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */