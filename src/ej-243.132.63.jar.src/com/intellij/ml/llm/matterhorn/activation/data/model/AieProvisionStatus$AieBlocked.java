/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\004\002\003\004\005\001\004\006\007\b\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieProvisioned;", "AieServiceMisconfigured", "AieServiceProhibited", "AieProvisionerLoginRequired", "AieProvisioningError", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked$AieProvisionerLoginRequired;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked$AieProvisioningError;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked$AieServiceMisconfigured;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked$AieServiceProhibited;", "data.model"}) public interface AieBlocked extends AieProvisionStatus.AieProvisioned {
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked$AieServiceMisconfigured;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"}) public static final class AieServiceMisconfigured implements AieBlocked {
/*    */     @NotNull public static final AieServiceMisconfigured INSTANCE = new AieServiceMisconfigured(); @NotNull public String toString() { return "AieServiceMisconfigured"; } public int hashCode() { return 526312877; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof AieServiceMisconfigured)) return false;  (AieServiceMisconfigured)other; return true; }
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked$AieServiceProhibited;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"}) public static final class AieServiceProhibited implements AieBlocked {
/*    */     @NotNull public static final AieServiceProhibited INSTANCE = new AieServiceProhibited(); @NotNull public String toString() { return "AieServiceProhibited"; } public int hashCode() { return 252006374; } public boolean equals(@Nullable Object other) { if (this == other)
/*    */         return true;  if (!(other instanceof AieServiceProhibited))
/*    */         return false;  (AieServiceProhibited)other; return true; }
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked$AieProvisionerLoginRequired;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"}) public static final class AieProvisionerLoginRequired implements AieBlocked {
/*    */     @NotNull public static final AieProvisionerLoginRequired INSTANCE = new AieProvisionerLoginRequired(); @NotNull public String toString() { return "AieProvisionerLoginRequired"; } public int hashCode() { return -1076155117; } public boolean equals(@Nullable Object other) { if (this == other)
/*    */         return true;  if (!(other instanceof AieProvisionerLoginRequired))
/*    */         return false;  (AieProvisionerLoginRequired)other; return true; }
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked$AieProvisioningError;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data.model"}) public static final class AieProvisioningError implements AieBlocked {
/* 17 */     public AieProvisioningError(@NotNull String message) { this.message = message; } @NotNull private final String message; @NotNull public final String getMessage() { return this.message; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.message;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final AieProvisioningError copy(@NotNull String message) {
/*    */       Intrinsics.checkNotNullParameter(message, "message");
/*    */       return new AieProvisioningError(message);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "AieProvisioningError(message=" + this.message + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.message.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof AieProvisioningError))
/*    */         return false; 
/*    */       AieProvisioningError aieProvisioningError = (AieProvisioningError)other;
/*    */       return !!Intrinsics.areEqual(this.message, aieProvisioningError.message);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\AieProvisionStatus$AieBlocked.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */