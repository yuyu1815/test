/*   */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B\017\022\006\020\003\032\0028\001¢\006\004\b\004\020\005J\016\020\t\032\0028\001HÆ\003¢\006\002\020\007J\036\020\n\032\b\022\004\022\0028\0010\0002\b\b\002\020\003\032\0028\001HÆ\001¢\006\002\020\013J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\017HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\023HÖ\001R\023\020\003\032\0028\001¢\006\n\n\002\020\b\032\004\b\006\020\007¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess;", "T", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess;", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"})
/*   */ public final class GrazieSuccess<T> implements GrazieResult<T> {
/* 5 */   public GrazieSuccess(Object value) { this.value = (T)value; } private final T value; public final T getValue() { return this.value; }
/*   */ 
/*   */   
/*   */   public final T component1() {
/*   */     return this.value;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final GrazieSuccess<T> copy(Object value) {
/*   */     return new GrazieSuccess((T)value);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "GrazieSuccess(value=" + this.value + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return (this.value == null) ? 0 : this.value.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof GrazieSuccess))
/*   */       return false; 
/*   */     GrazieSuccess grazieSuccess = (GrazieSuccess)other;
/*   */     return !!Intrinsics.areEqual(this.value, grazieSuccess.value);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\GrazieResult$GrazieSuccess.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */