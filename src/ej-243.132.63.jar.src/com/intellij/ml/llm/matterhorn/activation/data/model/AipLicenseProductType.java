/*   */ package com.intellij.ml.llm.matterhorn.activation.data.model;
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\n\b\002\030\0002\b\022\004\022\0020\0000\001B\031\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\bj\002\b\nj\002\b\013j\002\b\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "", "productCode", "", "presentableName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getProductCode", "()Ljava/lang/String;", "getPresentableName", "AIPU", "AIP", "AIF", "data.model"})
/*   */ public enum AipLicenseProductType {
/* 4 */   AIPU("AIPU", "JetBrains AI Ultimate"),
/* 5 */   AIP("AIP", "JetBrains AI Pro"),
/* 6 */   AIF("AIF", "JetBrains AI Free"); @NotNull private final String productCode; @NotNull
/* 7 */   public static EnumEntries<AipLicenseProductType> getEntries() { return $ENTRIES; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   private final String presentableName;
/*   */   
/*   */   AipLicenseProductType(String productCode, String presentableName) {
/*   */     this.productCode = productCode;
/*   */     this.presentableName = presentableName;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String getProductCode() {
/*   */     return this.productCode;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String getPresentableName() {
/*   */     return this.presentableName;
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\AipLicenseProductType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */