/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthData;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\003\002\003\004\001\002\005\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep;", "", "AieAuthPending", "AieAuthInitializing", "AieAuthenticated", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthenticated;", "state.model"})
/*    */ public interface AieAuthStep {
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\0012\0020\002B\t\b\002¢\006\004\b\003\020\004J\023\020\005\032\0020\0062\b\020\007\032\004\030\0010\bHÖ\003J\t\020\t\032\0020\nHÖ\001J\t\020\013\032\0020\fHÖ\001¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthInitializing;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */   public static final class AieAuthInitializing extends AiaActivationProgressing implements AieAuthPending { @NotNull
/*    */     public static final AieAuthInitializing INSTANCE = new AieAuthInitializing();
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "AieAuthInitializing";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return -2106340865;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof AieAuthInitializing))
/*    */         return false; 
/*    */       (AieAuthInitializing)other;
/*    */       return true;
/*    */     }
/*    */     
/* 31 */     private AieAuthInitializing() { super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\0012\0020\002\001\002\003\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiEnterprisePending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthInitializing;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieRestricted;", "state.model"})
/*    */   public static interface AieAuthPending extends AieAuthStep, AiEnterprisePending {} @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthenticated;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep;", "authData", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;)V", "getAuthData", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/* 33 */   public static final class AieAuthenticated implements AieAuthStep { public AieAuthenticated(@NotNull GrazieAuthData authData) { this.authData = authData; } @NotNull private final GrazieAuthData authData; @NotNull public final GrazieAuthData getAuthData() { return this.authData; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final GrazieAuthData component1() {
/*    */       return this.authData;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final AieAuthenticated copy(@NotNull GrazieAuthData authData) {
/*    */       Intrinsics.checkNotNullParameter(authData, "authData");
/*    */       return new AieAuthenticated(authData);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "AieAuthenticated(authData=" + this.authData + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.authData.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof AieAuthenticated))
/*    */         return false; 
/*    */       AieAuthenticated aieAuthenticated = (AieAuthenticated)other;
/*    */       return !!Intrinsics.areEqual(this.authData, aieAuthenticated.authData);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AieAuthStep.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */