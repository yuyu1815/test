/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.AieProvisionStatus;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep$AieAllowed;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep;", "activatedStatus", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieActivated;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieActivated;)V", "getActivatedStatus", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieActivated;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */ public final class AieAllowed
/*    */   implements AieAllowanceStep
/*    */ {
/*    */   @NotNull
/*    */   private final AieProvisionStatus.AieActivated activatedStatus;
/*    */   
/*    */   public AieAllowed(@NotNull AieProvisionStatus.AieActivated activatedStatus) {
/* 26 */     this.activatedStatus = activatedStatus; } @NotNull public final AieProvisionStatus.AieActivated getActivatedStatus() { return this.activatedStatus; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final AieProvisionStatus.AieActivated component1() {
/*    */     return this.activatedStatus;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AieAllowed copy(@NotNull AieProvisionStatus.AieActivated activatedStatus) {
/*    */     Intrinsics.checkNotNullParameter(activatedStatus, "activatedStatus");
/*    */     return new AieAllowed(activatedStatus);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AieAllowed(activatedStatus=" + this.activatedStatus + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.activatedStatus.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AieAllowed))
/*    */       return false; 
/*    */     AieAllowed aieAllowed = (AieAllowed)other;
/*    */     return !!Intrinsics.areEqual(this.activatedStatus, aieAllowed.activatedStatus);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AieAllowanceStep$AieAllowed.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */