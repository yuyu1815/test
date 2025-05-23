/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\003\002\003\004\001\003\005\006\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthResult;", "AieLoginRequired", "AieServiceUnavailable", "AieAuthGenericError", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthFailure$AieAuthGenericError;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthFailure$AieLoginRequired;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthFailure$AieServiceUnavailable;", "data.model"}) public interface AieAuthFailure extends AieAuthResult { @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthFailure$AieLoginRequired;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthFailure;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"}) public static final class AieLoginRequired implements AieAuthFailure {
/*    */     @NotNull public static final AieLoginRequired INSTANCE = new AieLoginRequired(); @NotNull public String toString() { return "AieLoginRequired"; } public int hashCode() { return 1549338744; } public boolean equals(@Nullable Object other) { if (this == other)
/*    */         return true;  if (!(other instanceof AieLoginRequired))
/*    */         return false;  (AieLoginRequired)other; return true; }
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthFailure$AieServiceUnavailable;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthFailure;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"}) public static final class AieServiceUnavailable implements AieAuthFailure { @NotNull public static final AieServiceUnavailable INSTANCE = new AieServiceUnavailable(); @NotNull public String toString() { return "AieServiceUnavailable"; } public int hashCode() { return 274585099; } public boolean equals(@Nullable Object other) { if (this == other)
/*    */         return true;  if (!(other instanceof AieServiceUnavailable))
/*    */         return false;  (AieServiceUnavailable)other;
/* 14 */       return true; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthFailure$AieAuthGenericError;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthFailure;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data.model"}) public static final class AieAuthGenericError implements AieAuthFailure { public AieAuthGenericError(@NotNull String errorMessage) { this.errorMessage = errorMessage; } @NotNull private final String errorMessage; @NotNull public final String getErrorMessage() { return this.errorMessage; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.errorMessage;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final AieAuthGenericError copy(@NotNull String errorMessage) {
/*    */       Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
/*    */       return new AieAuthGenericError(errorMessage);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "AieAuthGenericError(errorMessage=" + this.errorMessage + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.errorMessage.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof AieAuthGenericError))
/*    */         return false; 
/*    */       AieAuthGenericError aieAuthGenericError = (AieAuthGenericError)other;
/*    */       return !!Intrinsics.areEqual(this.errorMessage, aieAuthGenericError.errorMessage);
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\AieAuthFailure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */