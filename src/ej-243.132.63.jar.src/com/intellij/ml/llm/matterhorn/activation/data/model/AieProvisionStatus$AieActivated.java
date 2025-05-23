/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\020\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\004\b\007\020\bJ\020\020\r\032\0020\003HÆ\003¢\006\004\b\016\020\nJ\t\020\017\032\0020\005HÆ\003J\t\020\020\032\0020\005HÆ\003J.\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001¢\006\004\b\022\020\023J\023\020\024\032\0020\0052\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\030HÖ\001J\t\020\031\032\0020\032HÖ\001R\023\020\002\032\0020\003¢\006\n\n\002\020\013\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\004\020\fR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\006\020\f¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieActivated;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieProvisioned;", "apiUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;", "isDataSharingAllowed", "", "isThirdPartyProvidersAllowed", "<init>", "(Ljava/lang/String;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getApiUrl-vI_bMBc", "()Ljava/lang/String;", "Ljava/lang/String;", "()Z", "component1", "component1-vI_bMBc", "component2", "component3", "copy", "copy-1CSWKTE", "(Ljava/lang/String;ZZ)Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieActivated;", "equals", "other", "", "hashCode", "", "toString", "", "data.model"})
/*    */ public final class AieActivated
/*    */   implements AieProvisionStatus.AieProvisioned
/*    */ {
/*    */   @NotNull
/*    */   private final String apiUrl;
/*    */   private final boolean isDataSharingAllowed;
/*    */   private final boolean isThirdPartyProvidersAllowed;
/*    */   
/*    */   private AieActivated(String apiUrl, boolean isDataSharingAllowed, boolean isThirdPartyProvidersAllowed) {
/* 21 */     this.apiUrl = apiUrl;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 26 */     this.isDataSharingAllowed = isDataSharingAllowed;
/*    */ 
/*    */ 
/*    */     
/* 30 */     this.isThirdPartyProvidersAllowed = isThirdPartyProvidersAllowed; } public final boolean isThirdPartyProvidersAllowed() { return this.isThirdPartyProvidersAllowed; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getApiUrl-vI_bMBc() {
/*    */     return this.apiUrl;
/*    */   }
/*    */   
/*    */   public final boolean isDataSharingAllowed() {
/*    */     return this.isDataSharingAllowed;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1-vI_bMBc() {
/*    */     return this.apiUrl;
/*    */   }
/*    */   
/*    */   public final boolean component2() {
/*    */     return this.isDataSharingAllowed;
/*    */   }
/*    */   
/*    */   public final boolean component3() {
/*    */     return this.isThirdPartyProvidersAllowed;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AieActivated copy-1CSWKTE(@NotNull String apiUrl, boolean isDataSharingAllowed, boolean isThirdPartyProvidersAllowed) {
/*    */     Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
/*    */     return new AieActivated(apiUrl, isDataSharingAllowed, isThirdPartyProvidersAllowed, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AieActivated(apiUrl=" + GrazieApiUrl.toString-impl(this.apiUrl) + ", isDataSharingAllowed=" + this.isDataSharingAllowed + ", isThirdPartyProvidersAllowed=" + this.isThirdPartyProvidersAllowed + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = GrazieApiUrl.hashCode-impl(this.apiUrl);
/*    */     result = result * 31 + Boolean.hashCode(this.isDataSharingAllowed);
/*    */     return result * 31 + Boolean.hashCode(this.isThirdPartyProvidersAllowed);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AieActivated))
/*    */       return false; 
/*    */     AieActivated aieActivated = (AieActivated)other;
/*    */     return !GrazieApiUrl.equals-impl0(this.apiUrl, aieActivated.apiUrl) ? false : ((this.isDataSharingAllowed != aieActivated.isDataSharingAllowed) ? false : (!(this.isThirdPartyProvidersAllowed != aieActivated.isThirdPartyProvidersAllowed)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\AieProvisionStatus$AieActivated.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */