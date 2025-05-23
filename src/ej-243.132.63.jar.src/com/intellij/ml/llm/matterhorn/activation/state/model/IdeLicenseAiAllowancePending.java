/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\002\002\003\001\002\004\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowancePending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiProJbaPending;", "IdeLicenseAiUnknown", "IdeLicenseAiProhibited", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowancePending$IdeLicenseAiProhibited;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowancePending$IdeLicenseAiUnknown;", "state.model"})
/*    */ public interface IdeLicenseAiAllowancePending extends AiProJbaPending { @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\0012\0020\002B\t\b\002¢\006\004\b\003\020\004J\023\020\005\032\0020\0062\b\020\007\032\004\030\0010\bHÖ\003J\t\020\t\032\0020\nHÖ\001J\t\020\013\032\0020\fHÖ\001¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowancePending$IdeLicenseAiUnknown;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowancePending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */   public static final class IdeLicenseAiUnknown extends AiaActivationProgressing implements IdeLicenseAiAllowancePending {
/*    */     @NotNull
/*    */     public static final IdeLicenseAiUnknown INSTANCE = new IdeLicenseAiUnknown(); @NotNull
/*    */     public String toString() {
/*    */       return "IdeLicenseAiUnknown";
/*    */     } public int hashCode() {
/*    */       return -1081314863;
/* 10 */     } private IdeLicenseAiUnknown() { super(null); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof IdeLicenseAiUnknown)) return false;  (IdeLicenseAiUnknown)other; return true; }
/* 11 */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\0012\0020\002B\t\b\002¢\006\004\b\003\020\004J\023\020\005\032\0020\0062\b\020\007\032\004\030\0010\bHÖ\003J\t\020\t\032\0020\nHÖ\001J\t\020\013\032\0020\fHÖ\001¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowancePending$IdeLicenseAiProhibited;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowancePending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"}) public static final class IdeLicenseAiProhibited extends AiaActivationRoadblocked implements IdeLicenseAiAllowancePending { private IdeLicenseAiProhibited() { super(null); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public static final IdeLicenseAiProhibited INSTANCE = new IdeLicenseAiProhibited();
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "IdeLicenseAiProhibited";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return -1693630505;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof IdeLicenseAiProhibited))
/*    */         return false; 
/*    */       (IdeLicenseAiProhibited)other;
/*    */       return true;
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\IdeLicenseAiAllowancePending.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */