/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\0012\0020\002:\002\003\004\001\002\005\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieRestricted;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep$AieAllowancePending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthPending;", "AieAuthRequired", "AieFailure", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieRestricted$AieAuthRequired;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieRestricted$AieFailure;", "state.model"})
/*    */ public interface AieRestricted
/*    */   extends AieAllowanceStep.AieAllowancePending, AieAuthStep.AieAuthPending
/*    */ {
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\0012\0020\002B\t\b\002¢\006\004\b\003\020\004J\023\020\005\032\0020\0062\b\020\007\032\004\030\0010\bHÖ\003J\t\020\t\032\0020\nHÖ\001J\t\020\013\032\0020\fHÖ\001¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieRestricted$AieAuthRequired;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieRestricted;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */   public static final class AieAuthRequired
/*    */     extends AiaActivationRoadblocked
/*    */     implements AieRestricted
/*    */   {
/*    */     @NotNull
/*    */     public static final AieAuthRequired INSTANCE = new AieAuthRequired();
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "AieAuthRequired";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return 1609345624;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof AieAuthRequired))
/*    */         return false; 
/*    */       (AieAuthRequired)other;
/*    */       return true;
/*    */     }
/*    */     
/*    */     private AieAuthRequired() {
/* 51 */       super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\0012\0020\002B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J\t\020\t\032\0020\004HÆ\003J\023\020\n\032\0020\0002\b\b\002\020\003\032\0020\004HÆ\001J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\016HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\004HÖ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\007\020\b¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieRestricted$AieFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieRestricted;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationStalled;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "state.model"})
/* 52 */   public static final class AieFailure extends AiaActivationStalled implements AieRestricted { public AieFailure(@NotNull String errorMessage) { super(null); this.errorMessage = errorMessage; } @NotNull private final String errorMessage; @NotNull public final String getErrorMessage() { return this.errorMessage; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.errorMessage;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final AieFailure copy(@NotNull String errorMessage) {
/*    */       Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
/*    */       return new AieFailure(errorMessage);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "AieFailure(errorMessage=" + this.errorMessage + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.errorMessage.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof AieFailure))
/*    */         return false; 
/*    */       AieFailure aieFailure = (AieFailure)other;
/*    */       return !!Intrinsics.areEqual(this.errorMessage, aieFailure.errorMessage);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AieRestricted.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */