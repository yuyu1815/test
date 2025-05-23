/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\002\002\003\001\002\004\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicensePending;", "AipLicenseAgreementLoading", "AipLicenseAgreementLoadFailure", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadPending$AipLicenseAgreementLoadFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadPending$AipLicenseAgreementLoading;", "state.model"})
/*    */ public interface AipLicenseAgreementLoadPending extends AipLicensePending { @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\0012\0020\002B\t\b\002¢\006\004\b\003\020\004J\023\020\005\032\0020\0062\b\020\007\032\004\030\0010\bHÖ\003J\t\020\t\032\0020\nHÖ\001J\t\020\013\032\0020\fHÖ\001¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadPending$AipLicenseAgreementLoading;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */   public static final class AipLicenseAgreementLoading extends AiaActivationProgressing implements AipLicenseAgreementLoadPending {
/*    */     @NotNull
/*    */     public static final AipLicenseAgreementLoading INSTANCE = new AipLicenseAgreementLoading(); @NotNull
/*    */     public String toString() {
/*    */       return "AipLicenseAgreementLoading";
/*    */     }
/*    */     public int hashCode() {
/*    */       return -1569123741;
/*    */     }
/* 12 */     private AipLicenseAgreementLoading() { super(null); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof AipLicenseAgreementLoading)) return false;  (AipLicenseAgreementLoading)other; return true; }
/* 13 */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\0012\0020\002B\t\b\002¢\006\004\b\003\020\004J\023\020\005\032\0020\0062\b\020\007\032\004\030\0010\bHÖ\003J\t\020\t\032\0020\nHÖ\001J\t\020\013\032\0020\fHÖ\001¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadPending$AipLicenseAgreementLoadFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationStalled;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"}) public static final class AipLicenseAgreementLoadFailure extends AiaActivationStalled implements AipLicenseAgreementLoadPending { private AipLicenseAgreementLoadFailure() { super(null); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public static final AipLicenseAgreementLoadFailure INSTANCE = new AipLicenseAgreementLoadFailure();
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "AipLicenseAgreementLoadFailure";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return 1874402155;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof AipLicenseAgreementLoadFailure))
/*    */         return false; 
/*    */       (AipLicenseAgreementLoadFailure)other;
/*    */       return true;
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AipLicenseAgreementLoadPending.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */