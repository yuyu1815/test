/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\002\002\003\001\002\004\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieCloudUrlPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiProJbaPending;", "GrazieUrlResolveInProgress", "GrazieUrlResolveFailure", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieCloudUrlPending$GrazieUrlResolveFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieCloudUrlPending$GrazieUrlResolveInProgress;", "state.model"})
/*    */ public interface GrazieCloudUrlPending extends AiProJbaPending { @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\0012\0020\002B\t\b\002¢\006\004\b\003\020\004J\023\020\005\032\0020\0062\b\020\007\032\004\030\0010\bHÖ\003J\t\020\t\032\0020\nHÖ\001J\t\020\013\032\0020\fHÖ\001¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieCloudUrlPending$GrazieUrlResolveInProgress;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieCloudUrlPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */   public static final class GrazieUrlResolveInProgress extends AiaActivationProgressing implements GrazieCloudUrlPending {
/*    */     @NotNull
/*    */     public static final GrazieUrlResolveInProgress INSTANCE = new GrazieUrlResolveInProgress(); @NotNull
/*    */     public String toString() {
/*    */       return "GrazieUrlResolveInProgress";
/*    */     }
/*    */     public int hashCode() {
/*    */       return -646170474;
/*    */     }
/* 12 */     private GrazieUrlResolveInProgress() { super(null); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof GrazieUrlResolveInProgress)) return false;  (GrazieUrlResolveInProgress)other; return true; }
/* 13 */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\0012\0020\002B\t\b\002¢\006\004\b\003\020\004J\023\020\005\032\0020\0062\b\020\007\032\004\030\0010\bHÖ\003J\t\020\t\032\0020\nHÖ\001J\t\020\013\032\0020\fHÖ\001¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieCloudUrlPending$GrazieUrlResolveFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieCloudUrlPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationStalled;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"}) public static final class GrazieUrlResolveFailure extends AiaActivationStalled implements GrazieCloudUrlPending { private GrazieUrlResolveFailure() { super(null); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public static final GrazieUrlResolveFailure INSTANCE = new GrazieUrlResolveFailure();
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "GrazieUrlResolveFailure";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return 256969190;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof GrazieUrlResolveFailure))
/*    */         return false; 
/*    */       (GrazieUrlResolveFailure)other;
/*    */       return true;
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\GrazieCloudUrlPending.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */