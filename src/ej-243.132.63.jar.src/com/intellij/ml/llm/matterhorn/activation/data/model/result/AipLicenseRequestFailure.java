/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;import org.jetbrains.annotations.NotNull;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\003\002\003\004\001\003\005\006\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;", "LicenseDenied", "ErrorResponse", "AuthRequired", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$AuthRequired;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$ErrorResponse;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$LicenseDenied;", "data.model"})
/*    */ public interface AipLicenseRequestFailure extends AipLicenseResult {
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\013\020\f\032\004\030\0010\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\037\020\016\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\005HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$LicenseDenied;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;", "reason", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseDeniedReason;", "message", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseDeniedReason;Ljava/lang/String;)V", "getReason", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseDeniedReason;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data.model"})
/*    */   public static final class LicenseDenied implements AipLicenseRequestFailure {
/*    */     @Nullable
/*    */     private final AipLicenseDeniedReason reason;
/*    */     @NotNull
/*    */     private final String message;
/*    */     
/* 11 */     public LicenseDenied(@Nullable AipLicenseDeniedReason reason, @NotNull String message) { this.reason = reason; this.message = message; } @Nullable public final AipLicenseDeniedReason getReason() { return this.reason; } @NotNull public final String getMessage() { return this.message; } @Nullable public final AipLicenseDeniedReason component1() { return this.reason; } @NotNull public final String component2() { return this.message; } @NotNull public final LicenseDenied copy(@Nullable AipLicenseDeniedReason reason, @NotNull String message) { Intrinsics.checkNotNullParameter(message, "message"); return new LicenseDenied(reason, message); } @NotNull public String toString() { return "LicenseDenied(reason=" + this.reason + ", message=" + this.message + ")"; } public int hashCode() { result = (this.reason == null) ? 0 : this.reason.hashCode(); return result * 31 + this.message.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof LicenseDenied)) return false;  LicenseDenied licenseDenied = (LicenseDenied)other; return (this.reason != licenseDenied.reason) ? false : (!!Intrinsics.areEqual(this.message, licenseDenied.message)); }
/* 12 */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$ErrorResponse;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data.model"}) public static final class ErrorResponse implements AipLicenseRequestFailure { public ErrorResponse(@NotNull String errorMessage) { this.errorMessage = errorMessage; } @NotNull private final String errorMessage; @NotNull public final String getErrorMessage() { return this.errorMessage; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.errorMessage;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ErrorResponse copy(@NotNull String errorMessage) {
/*    */       Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
/*    */       return new ErrorResponse(errorMessage);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "ErrorResponse(errorMessage=" + this.errorMessage + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.errorMessage.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof ErrorResponse))
/*    */         return false; 
/*    */       ErrorResponse errorResponse = (ErrorResponse)other;
/*    */       return !!Intrinsics.areEqual(this.errorMessage, errorResponse.errorMessage);
/*    */     } }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$AuthRequired;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"})
/*    */   public static final class AuthRequired implements AipLicenseRequestFailure {
/*    */     @NotNull
/*    */     public static final AuthRequired INSTANCE = new AuthRequired();
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "AuthRequired";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return -277646619;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof AuthRequired))
/*    */         return false; 
/*    */       (AuthRequired)other;
/*    */       return true;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\AipLicenseRequestFailure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */