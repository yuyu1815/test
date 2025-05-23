/*   */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\001\002\001\002\003\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;", "", "Success", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult$Success;", "data.model"})
/*   */ public interface AipLicenseResult {
/*   */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\017\020\t\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\n\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\016HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\022HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\b¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult$Success;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;", "licenses", "", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;", "<init>", "(Ljava/util/List;)V", "getLicenses", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"})
/*   */   public static final class Success implements AipLicenseResult {
/* 7 */     public Success(@NotNull List<AipLicense> licenses) { this.licenses = licenses; } @NotNull private final List<AipLicense> licenses; @NotNull public final List<AipLicense> getLicenses() { return this.licenses; }
/*   */ 
/*   */     
/*   */     @NotNull
/*   */     public final List<AipLicense> component1() {
/*   */       return this.licenses;
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public final Success copy(@NotNull List<AipLicense> licenses) {
/*   */       Intrinsics.checkNotNullParameter(licenses, "licenses");
/*   */       return new Success(licenses);
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public String toString() {
/*   */       return "Success(licenses=" + this.licenses + ")";
/*   */     }
/*   */     
/*   */     public int hashCode() {
/*   */       return this.licenses.hashCode();
/*   */     }
/*   */     
/*   */     public boolean equals(@Nullable Object other) {
/*   */       if (this == other)
/*   */         return true; 
/*   */       if (!(other instanceof Success))
/*   */         return false; 
/*   */       Success success = (Success)other;
/*   */       return !!Intrinsics.areEqual(this.licenses, success.licenses);
/*   */     }
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\AipLicenseResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */