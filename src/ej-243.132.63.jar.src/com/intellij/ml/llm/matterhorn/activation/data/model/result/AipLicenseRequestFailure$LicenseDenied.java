/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\013\020\f\032\004\030\0010\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\037\020\016\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\005HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$LicenseDenied;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;", "reason", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseDeniedReason;", "message", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseDeniedReason;Ljava/lang/String;)V", "getReason", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseDeniedReason;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data.model"})
/*    */ public final class LicenseDenied implements AipLicenseRequestFailure {
/*    */   @Nullable
/*    */   private final AipLicenseDeniedReason reason;
/*    */   
/* 11 */   public LicenseDenied(@Nullable AipLicenseDeniedReason reason, @NotNull String message) { this.reason = reason; this.message = message; } @NotNull private final String message; @Nullable public final AipLicenseDeniedReason getReason() { return this.reason; } @NotNull public final String getMessage() { return this.message; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final AipLicenseDeniedReason component1() {
/*    */     return this.reason;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.message;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LicenseDenied copy(@Nullable AipLicenseDeniedReason reason, @NotNull String message) {
/*    */     Intrinsics.checkNotNullParameter(message, "message");
/*    */     return new LicenseDenied(reason, message);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LicenseDenied(reason=" + this.reason + ", message=" + this.message + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.reason == null) ? 0 : this.reason.hashCode();
/*    */     return result * 31 + this.message.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LicenseDenied))
/*    */       return false; 
/*    */     LicenseDenied licenseDenied = (LicenseDenied)other;
/*    */     return (this.reason != licenseDenied.reason) ? false : (!!Intrinsics.areEqual(this.message, licenseDenied.message));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\AipLicenseRequestFailure$LicenseDenied.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */