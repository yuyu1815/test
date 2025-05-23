/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\001\002\001\004\003\004\005\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiEnterprisePending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending;", "AieProvisionStatusUnknown", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiEnterprisePending$AieProvisionStatusUnknown;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep$AieAllowancePending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending;", "state.model"})
/*    */ public interface AiEnterprisePending
/*    */   extends AiaActivationPending
/*    */ {
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\0012\0020\002B\t\b\002¢\006\004\b\003\020\004J\023\020\005\032\0020\0062\b\020\007\032\004\030\0010\bHÖ\003J\t\020\t\032\0020\nHÖ\001J\t\020\013\032\0020\fHÖ\001¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiEnterprisePending$AieProvisionStatusUnknown;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiEnterprisePending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */   public static final class AieProvisionStatusUnknown
/*    */     extends AiaActivationProgressing
/*    */     implements AiEnterprisePending {
/*    */     @NotNull
/*    */     public static final AieProvisionStatusUnknown INSTANCE = new AieProvisionStatusUnknown();
/*    */     
/*    */     private AieProvisionStatusUnknown() {
/* 19 */       super(null);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "AieProvisionStatusUnknown";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return -172201974;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof AieProvisionStatusUnknown))
/*    */         return false; 
/*    */       (AieProvisionStatusUnknown)other;
/*    */       return true;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AiEnterprisePending.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */