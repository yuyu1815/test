/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\025\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B)\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J\020\020\024\032\0020\003HÆ\003¢\006\004\b\025\020\rJ\t\020\026\032\0020\005HÆ\003J\013\020\027\032\004\030\0010\007HÆ\003J\t\020\030\032\0020\tHÆ\003J:\020\031\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\b\b\002\020\b\032\0020\tHÆ\001¢\006\004\b\032\020\033J\023\020\034\032\0020\t2\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\037HÖ\001J\t\020 \032\0020!HÖ\001R\023\020\002\032\0020\003¢\006\n\n\002\020\016\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\021\020\022R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\b\020\023¨\006\""}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext;", "", "apiUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;", "authData", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "productType", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "isEnterprise", "", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getApiUrl-vI_bMBc", "()Ljava/lang/String;", "Ljava/lang/String;", "getAuthData", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "getProductType", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "()Z", "component1", "component1-vI_bMBc", "component2", "component3", "component4", "copy", "copy-wZDqZQU", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Z)Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext;", "equals", "other", "hashCode", "", "toString", "", "state.model"})
/*    */ public final class GrazieAuthContext {
/*    */   @NotNull
/*    */   private final String apiUrl;
/*    */   @NotNull
/*    */   private final GrazieAuthData authData;
/*    */   
/* 11 */   private GrazieAuthContext(String apiUrl, GrazieAuthData authData, AipLicenseProductType productType, boolean isEnterprise) { this.apiUrl = apiUrl;
/* 12 */     this.authData = authData;
/* 13 */     this.productType = productType;
/* 14 */     this.isEnterprise = isEnterprise; } @Nullable private final AipLicenseProductType productType; private final boolean isEnterprise; @NotNull public final String getApiUrl-vI_bMBc() { return this.apiUrl; } public final boolean isEnterprise() { return this.isEnterprise; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final GrazieAuthData getAuthData() {
/*    */     return this.authData;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AipLicenseProductType getProductType() {
/*    */     return this.productType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1-vI_bMBc() {
/*    */     return this.apiUrl;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final GrazieAuthData component2() {
/*    */     return this.authData;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AipLicenseProductType component3() {
/*    */     return this.productType;
/*    */   }
/*    */   
/*    */   public final boolean component4() {
/*    */     return this.isEnterprise;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final GrazieAuthContext copy-wZDqZQU(@NotNull String apiUrl, @NotNull GrazieAuthData authData, @Nullable AipLicenseProductType productType, boolean isEnterprise) {
/*    */     Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
/*    */     Intrinsics.checkNotNullParameter(authData, "authData");
/*    */     return new GrazieAuthContext(apiUrl, authData, productType, isEnterprise, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "GrazieAuthContext(apiUrl=" + GrazieApiUrl.toString-impl(this.apiUrl) + ", authData=" + this.authData + ", productType=" + this.productType + ", isEnterprise=" + this.isEnterprise + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = GrazieApiUrl.hashCode-impl(this.apiUrl);
/*    */     result = result * 31 + this.authData.hashCode();
/*    */     result = result * 31 + ((this.productType == null) ? 0 : this.productType.hashCode());
/*    */     return result * 31 + Boolean.hashCode(this.isEnterprise);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof GrazieAuthContext))
/*    */       return false; 
/*    */     GrazieAuthContext grazieAuthContext = (GrazieAuthContext)other;
/*    */     return !GrazieApiUrl.equals-impl0(this.apiUrl, grazieAuthContext.apiUrl) ? false : (!Intrinsics.areEqual(this.authData, grazieAuthContext.authData) ? false : ((this.productType != grazieAuthContext.productType) ? false : (!(this.isEnterprise != grazieAuthContext.isEnterprise))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\GrazieAuthContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */