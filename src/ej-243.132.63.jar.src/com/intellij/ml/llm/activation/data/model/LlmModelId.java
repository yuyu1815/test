/*   */ package com.intellij.ml.llm.activation.data.model;@JvmInline
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\005\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\005\b@\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\b\032\0020\t2\b\020\n\032\004\030\0010\001HÖ\003¢\006\004\b\013\020\fJ\020\020\r\032\0020\016HÖ\001¢\006\004\b\017\020\020J\020\020\021\032\0020\003HÖ\001¢\006\004\b\022\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007\001\002¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/activation/data/model/LlmModelId;", "", "grazieModelName", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getGrazieModelName", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "data.model"})
/*   */ public final class LlmModelId { @NotNull
/* 4 */   public final String getGrazieModelName() { return this.grazieModelName; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   private final String grazieModelName;
/*   */   
/*   */   public static String toString-impl(String arg0) {
/*   */     return "LlmModelId(grazieModelName=" + arg0 + ")";
/*   */   }
/*   */   
/*   */   public String toString() {
/*   */     return toString-impl(this.grazieModelName);
/*   */   }
/*   */   
/*   */   public static int hashCode-impl(String arg0) {
/*   */     return arg0.hashCode();
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return hashCode-impl(this.grazieModelName);
/*   */   }
/*   */   
/*   */   public static boolean equals-impl(String arg0, Object other) {
/*   */     return !(other instanceof LlmModelId) ? false : (!!Intrinsics.areEqual(arg0, ((LlmModelId)other).unbox-impl()));
/*   */   }
/*   */   
/*   */   public boolean equals(Object other) {
/*   */     return equals-impl(this.grazieModelName, other);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public static String constructor-impl(@NotNull String grazieModelName) {
/*   */     Intrinsics.checkNotNullParameter(grazieModelName, "grazieModelName");
/*   */     return grazieModelName;
/*   */   }
/*   */   
/*   */   public static final boolean equals-impl0(String p1, String p2) {
/*   */     return Intrinsics.areEqual(p1, p2);
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\activation\data\model\LlmModelId.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */