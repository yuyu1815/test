/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\002\002\003\001\002\004\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiProJbaPending;", "JbaUnauthenticated", "JbaAuthRejected", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending$JbaAuthRejected;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending$JbaUnauthenticated;", "state.model"})
/*    */ public interface JbaAuthPending extends AiProJbaPending { @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\0012\0020\002B\t\b\002¢\006\004\b\003\020\004J\023\020\005\032\0020\0062\b\020\007\032\004\030\0010\bHÖ\003J\t\020\t\032\0020\nHÖ\001J\t\020\013\032\0020\fHÖ\001¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending$JbaUnauthenticated;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */   public static final class JbaUnauthenticated extends AiaActivationRoadblocked implements JbaAuthPending {
/*    */     @NotNull
/*    */     public static final JbaUnauthenticated INSTANCE = new JbaUnauthenticated(); @NotNull
/*    */     public String toString() {
/*    */       return "JbaUnauthenticated";
/*    */     } public int hashCode() {
/*    */       return -1481564769;
/*    */     }
/* 11 */     private JbaUnauthenticated() { super(null); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof JbaUnauthenticated)) return false;  (JbaUnauthenticated)other; return true; }
/* 12 */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\0012\0020\002B\t\b\002¢\006\004\b\003\020\004J\023\020\005\032\0020\0062\b\020\007\032\004\030\0010\bHÖ\003J\t\020\t\032\0020\nHÖ\001J\t\020\013\032\0020\fHÖ\001¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending$JbaAuthRejected;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"}) public static final class JbaAuthRejected extends AiaActivationRoadblocked implements JbaAuthPending { private JbaAuthRejected() { super(null); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public static final JbaAuthRejected INSTANCE = new JbaAuthRejected();
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "JbaAuthRejected";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return 915232637;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof JbaAuthRejected))
/*    */         return false; 
/*    */       (JbaAuthRejected)other;
/*    */       return true;
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\JbaAuthPending.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */