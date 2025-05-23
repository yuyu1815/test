/*   */ package com.intellij.ml.llm.matterhorn.ej.core;
/*   */ 
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\030\002\n\002\020\001\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\002\020\0012\016\022\004\022\002H\001\022\004\022\0020\0030\002B\017\022\006\020\004\032\0028\002¢\006\004\b\005\020\006J\016\020\n\032\0028\002HÆ\003¢\006\002\020\bJ\036\020\013\032\b\022\004\022\0028\0020\0002\b\b\002\020\004\032\0028\002HÆ\001¢\006\002\020\fJ\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\020HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\024HÖ\001R\023\020\004\032\0028\002¢\006\n\n\002\020\t\032\004\b\007\020\b¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Ok;", "V", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Ok;", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-core"})
/*   */ public final class Ok<V> extends Result {
/* 7 */   public Ok(Object value) { super(null); this.value = (V)value; } private final V value; public final V getValue() { return this.value; }
/*   */ 
/*   */   
/*   */   public final V component1() {
/*   */     return this.value;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final Ok<V> copy(Object value) {
/*   */     return new Ok((V)value);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "Ok(value=" + this.value + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return (this.value == null) ? 0 : this.value.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof Ok))
/*   */       return false; 
/*   */     Ok ok = (Ok)other;
/*   */     return !!Intrinsics.areEqual(this.value, ok.value);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\Result$Ok.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */