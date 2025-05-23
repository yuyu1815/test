/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\033\n\002\020\b\n\002\b\003\b\b\030\000 ,2\0020\001:\001,B?\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f\022\006\020\r\032\0020\016¢\006\004\b\017\020\020J\020\020\033\032\0020\003HÆ\003¢\006\004\b\034\020\022J\020\020\035\032\0020\005HÆ\003¢\006\004\b\036\020\022J\t\020\037\032\0020\007HÆ\003J\t\020 \032\0020\007HÆ\003J\t\020!\032\0020\nHÆ\003J\t\020\"\032\0020\fHÆ\003J\t\020#\032\0020\016HÆ\003JV\020$\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\016HÆ\001¢\006\004\b%\020&J\023\020'\032\0020\0072\b\020(\032\004\030\0010\001HÖ\003J\t\020)\032\0020*HÖ\001J\t\020+\032\0020\fHÖ\001R\023\020\002\032\0020\003¢\006\n\n\002\020\023\032\004\b\021\020\022R\023\020\004\032\0020\005¢\006\n\n\002\020\023\032\004\b\024\020\022R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\006\020\025R\021\020\b\032\0020\007¢\006\b\n\000\032\004\b\b\020\025R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\026\020\027R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\030\020\022R\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\031\020\032¨\006-"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;", "", "licenseId", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseId;", "jbaUserId", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUserId;", "isTrial", "", "isIndividual", "productType", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "licensedTo", "", "expiresOn", "Lkotlinx/datetime/Instant;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Ljava/lang/String;Lkotlinx/datetime/Instant;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLicenseId-EIc-D0M", "()Ljava/lang/String;", "Ljava/lang/String;", "getJbaUserId-cfj0yrU", "()Z", "getProductType", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "getLicensedTo", "getExpiresOn", "()Lkotlinx/datetime/Instant;", "component1", "component1-EIc-D0M", "component2", "component2-cfj0yrU", "component3", "component4", "component5", "component6", "component7", "copy", "copy-zHtfVQ8", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Ljava/lang/String;Lkotlinx/datetime/Instant;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;", "equals", "other", "hashCode", "", "toString", "Companion", "data.model"})
/*    */ public final class AipLicense { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String licenseId;
/*    */   @NotNull
/*    */   private final String jbaUserId;
/*    */   private final boolean isTrial;
/*    */   
/* 11 */   private AipLicense(String licenseId, String jbaUserId, boolean isTrial, boolean isIndividual, AipLicenseProductType productType, String licensedTo, Instant expiresOn) { this.licenseId = licenseId;
/* 12 */     this.jbaUserId = jbaUserId;
/* 13 */     this.isTrial = isTrial;
/* 14 */     this.isIndividual = isIndividual;
/* 15 */     this.productType = productType;
/* 16 */     this.licensedTo = licensedTo;
/* 17 */     this.expiresOn = expiresOn; } private final boolean isIndividual; @NotNull private final AipLicenseProductType productType; @NotNull private final String licensedTo; @NotNull private final Instant expiresOn; @NotNull public final String getLicenseId-EIc-D0M() { return this.licenseId; } @NotNull public final Instant getExpiresOn() { return this.expiresOn; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getJbaUserId-cfj0yrU() {
/*    */     return this.jbaUserId;
/*    */   }
/*    */   
/*    */   public final boolean isTrial() {
/*    */     return this.isTrial;
/*    */   }
/*    */   
/*    */   public final boolean isIndividual() {
/*    */     return this.isIndividual;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AipLicenseProductType getProductType() {
/*    */     return this.productType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getLicensedTo() {
/*    */     return this.licensedTo;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1-EIc-D0M() {
/*    */     return this.licenseId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2-cfj0yrU() {
/*    */     return this.jbaUserId;
/*    */   }
/*    */   
/*    */   public final boolean component3() {
/*    */     return this.isTrial;
/*    */   }
/*    */   
/*    */   public final boolean component4() {
/*    */     return this.isIndividual;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AipLicenseProductType component5() {
/*    */     return this.productType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component6() {
/*    */     return this.licensedTo;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Instant component7() {
/*    */     return this.expiresOn;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AipLicense copy-zHtfVQ8(@NotNull String licenseId, @NotNull String jbaUserId, boolean isTrial, boolean isIndividual, @NotNull AipLicenseProductType productType, @NotNull String licensedTo, @NotNull Instant expiresOn) {
/*    */     Intrinsics.checkNotNullParameter(licenseId, "licenseId");
/*    */     Intrinsics.checkNotNullParameter(jbaUserId, "jbaUserId");
/*    */     Intrinsics.checkNotNullParameter(productType, "productType");
/*    */     Intrinsics.checkNotNullParameter(licensedTo, "licensedTo");
/*    */     Intrinsics.checkNotNullParameter(expiresOn, "expiresOn");
/*    */     return new AipLicense(licenseId, jbaUserId, isTrial, isIndividual, productType, licensedTo, expiresOn, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AipLicense(licenseId=" + AipLicenseId.toString-impl(this.licenseId) + ", jbaUserId=" + JbaUserId.toString-impl(this.jbaUserId) + ", isTrial=" + this.isTrial + ", isIndividual=" + this.isIndividual + ", productType=" + this.productType + ", licensedTo=" + this.licensedTo + ", expiresOn=" + this.expiresOn + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = AipLicenseId.hashCode-impl(this.licenseId);
/*    */     result = result * 31 + JbaUserId.hashCode-impl(this.jbaUserId);
/*    */     result = result * 31 + Boolean.hashCode(this.isTrial);
/*    */     result = result * 31 + Boolean.hashCode(this.isIndividual);
/*    */     result = result * 31 + this.productType.hashCode();
/*    */     result = result * 31 + this.licensedTo.hashCode();
/*    */     return result * 31 + this.expiresOn.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AipLicense))
/*    */       return false; 
/*    */     AipLicense aipLicense = (AipLicense)other;
/*    */     return !AipLicenseId.equals-impl0(this.licenseId, aipLicense.licenseId) ? false : (!JbaUserId.equals-impl0(this.jbaUserId, aipLicense.jbaUserId) ? false : ((this.isTrial != aipLicense.isTrial) ? false : ((this.isIndividual != aipLicense.isIndividual) ? false : ((this.productType != aipLicense.productType) ? false : (!Intrinsics.areEqual(this.licensedTo, aipLicense.licensedTo) ? false : (!!Intrinsics.areEqual(this.expiresOn, aipLicense.expiresOn)))))));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense$Companion;", "", "<init>", "()V", "data.model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\AipLicense.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */