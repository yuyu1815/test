/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login.states;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\b\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\006\004\005\006\007\b\tB\t\b\004¢\006\004\b\002\020\003\001\006\n\013\f\r\016\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason;", "", "<init>", "()V", "FailedToLoadAgreement", "FailedToFetchLicense", "FailedToResolveCloudURL", "FailedToFetchModelProfiles", "AuthFailed", "GenericError", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$AuthFailed;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToFetchLicense;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToFetchModelProfiles;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToLoadAgreement;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToResolveCloudURL;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$GenericError;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public abstract class Reason { public static final int $stable; private Reason() {}
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÇ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToLoadAgreement;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static final class FailedToLoadAgreement extends Reason {
/*    */     @NotNull
/*    */     public static final FailedToLoadAgreement INSTANCE = new FailedToLoadAgreement(); public static final int $stable;
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "FailedToLoadAgreement";
/*    */     }
/*    */     public int hashCode() {
/*    */       return -2086491596;
/*    */     }
/* 16 */     private FailedToLoadAgreement() { super(null); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof FailedToLoadAgreement)) return false;  (FailedToLoadAgreement)other; return true; }
/* 17 */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÇ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToFetchLicense;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class FailedToFetchLicense extends Reason { @NotNull public static final FailedToFetchLicense INSTANCE = new FailedToFetchLicense(); public static final int $stable; private FailedToFetchLicense() { super(null); } @NotNull public String toString() { return "FailedToFetchLicense"; } public int hashCode() { return -903542857; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof FailedToFetchLicense)) return false;  (FailedToFetchLicense)other; return true; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÇ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToResolveCloudURL;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class FailedToResolveCloudURL extends Reason { @NotNull public static final FailedToResolveCloudURL INSTANCE = new FailedToResolveCloudURL(); public static final int $stable;
/* 18 */     private FailedToResolveCloudURL() { super(null); } @NotNull public String toString() { return "FailedToResolveCloudURL"; } public int hashCode() { return -35914890; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof FailedToResolveCloudURL)) return false;  (FailedToResolveCloudURL)other; return true; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÇ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToFetchModelProfiles;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class FailedToFetchModelProfiles extends Reason { @NotNull public static final FailedToFetchModelProfiles INSTANCE = new FailedToFetchModelProfiles(); public static final int $stable;
/* 19 */     private FailedToFetchModelProfiles() { super(null); } @NotNull public String toString() { return "FailedToFetchModelProfiles"; } public int hashCode() { return -1094621911; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof FailedToFetchModelProfiles)) return false;  (FailedToFetchModelProfiles)other; return true; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÇ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$AuthFailed;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class AuthFailed extends Reason { @NotNull public static final AuthFailed INSTANCE = new AuthFailed(); public static final int $stable;
/* 20 */     private AuthFailed() { super(null); } @NotNull public String toString() { return "AuthFailed"; } public int hashCode() { return 1161089501; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof AuthFailed)) return false;  (AuthFailed)other; return true; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$GenericError;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class GenericError extends Reason { @NotNull private final String message; public static final int $stable;
/* 21 */     public GenericError(@NotNull String message) { super(null); this.message = message; } @NotNull public final String getMessage() { return this.message; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.message;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final GenericError copy(@NotNull String message) {
/*    */       Intrinsics.checkNotNullParameter(message, "message");
/*    */       return new GenericError(message);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "GenericError(message=" + this.message + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.message.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof GenericError))
/*    */         return false; 
/*    */       GenericError genericError = (GenericError)other;
/*    */       return !!Intrinsics.areEqual(this.message, genericError.message);
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\StepFail$Reason.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */