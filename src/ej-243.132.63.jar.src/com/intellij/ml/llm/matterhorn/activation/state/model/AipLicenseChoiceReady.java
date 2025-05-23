/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicense;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\001HÖ\003J\t\020\r\032\0020\016HÖ\001J\t\020\017\032\0020\020HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceReady;", "", "activeLicense", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;)V", "getActiveLicense", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "state.model"})
/*    */ public final class AipLicenseChoiceReady {
/*    */   @NotNull
/*    */   private final AipLicense activeLicense;
/*    */   
/* 12 */   public AipLicenseChoiceReady(@NotNull AipLicense activeLicense) { this.activeLicense = activeLicense; } @NotNull public final AipLicense getActiveLicense() { return this.activeLicense; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final AipLicense component1() {
/*    */     return this.activeLicense;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AipLicenseChoiceReady copy(@NotNull AipLicense activeLicense) {
/*    */     Intrinsics.checkNotNullParameter(activeLicense, "activeLicense");
/*    */     return new AipLicenseChoiceReady(activeLicense);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AipLicenseChoiceReady(activeLicense=" + this.activeLicense + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.activeLicense.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AipLicenseChoiceReady))
/*    */       return false; 
/*    */     AipLicenseChoiceReady aipLicenseChoiceReady = (AipLicenseChoiceReady)other;
/*    */     return !!Intrinsics.areEqual(this.activeLicense, aipLicenseChoiceReady.activeLicense);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AipLicenseChoiceReady.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */