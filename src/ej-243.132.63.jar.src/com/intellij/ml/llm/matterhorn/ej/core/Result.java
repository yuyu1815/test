/*   */ package com.intellij.ml.llm.matterhorn.ej.core;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b6\030\000*\006\b\000\020\001 \001*\006\b\001\020\002 \0012\0020\003:\002\006\007B\t\b\004¢\006\004\b\004\020\005\001\002\b\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "V", "E", "", "<init>", "()V", "Ok", "Err", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Ok;", "ej-core"})
/*   */ public abstract class Result<V, E> { private Result() {}
/*   */   
/*   */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\030\002\n\002\020\001\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\002\020\0012\016\022\004\022\002H\001\022\004\022\0020\0030\002B\017\022\006\020\004\032\0028\002¢\006\004\b\005\020\006J\016\020\n\032\0028\002HÆ\003¢\006\002\020\bJ\036\020\013\032\b\022\004\022\0028\0020\0002\b\b\002\020\004\032\0028\002HÆ\001¢\006\002\020\fJ\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\020HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\024HÖ\001R\023\020\004\032\0028\002¢\006\n\n\002\020\t\032\004\b\007\020\b¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Ok;", "V", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Ok;", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-core"})
/*   */   public static final class Ok<V> extends Result { private final V value;
/*   */     
/* 7 */     public Ok(Object value) { super(null); this.value = (V)value; } public final V getValue() { return this.value; } public final V component1() { return this.value; } @NotNull public final Ok<V> copy(Object value) { return new Ok((V)value); } @NotNull public String toString() { return "Ok(value=" + this.value + ")"; } public int hashCode() { return (this.value == null) ? 0 : this.value.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Ok)) return false;  Ok ok = (Ok)other; return !!Intrinsics.areEqual(this.value, ok.value); } }
/* 8 */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\000\n\002\030\002\n\002\020\001\n\002\b\002\n\002\020\016\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\000*\004\b\002\020\0012\016\022\004\022\0020\003\022\004\022\002H\0010\002B\027\022\006\020\004\032\0028\002\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\016\020\016\032\0028\002HÆ\003¢\006\002\020\nJ\t\020\017\032\0020\006HÆ\003J(\020\020\032\b\022\004\022\0028\0020\0002\b\b\002\020\004\032\0028\0022\b\b\002\020\005\032\0020\006HÆ\001¢\006\002\020\021J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\025HÖ\003J\t\020\026\032\0020\027HÖ\001J\t\020\030\032\0020\006HÖ\001R\023\020\004\032\0028\002¢\006\n\n\002\020\013\032\004\b\t\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\f\020\r¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;", "E", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "", "error", "message", "", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "getError", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;", "equals", "", "other", "", "hashCode", "", "toString", "ej-core"}) public static final class Err<E> extends Result { private final E error; public Err(Object error, @NotNull String message) { super(null); this.error = (E)error; this.message = message; } @NotNull private final String message; public final E getError() { return this.error; } @NotNull public final String getMessage() { return this.message; }
/*   */ 
/*   */     
/*   */     public final E component1() {
/*   */       return this.error;
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public final String component2() {
/*   */       return this.message;
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public final Err<E> copy(Object error, @NotNull String message) {
/*   */       Intrinsics.checkNotNullParameter(message, "message");
/*   */       return new Err((E)error, message);
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public String toString() {
/*   */       return "Err(error=" + this.error + ", message=" + this.message + ")";
/*   */     }
/*   */     
/*   */     public int hashCode() {
/*   */       result = (this.error == null) ? 0 : this.error.hashCode();
/*   */       return result * 31 + this.message.hashCode();
/*   */     }
/*   */     
/*   */     public boolean equals(@Nullable Object other) {
/*   */       if (this == other)
/*   */         return true; 
/*   */       if (!(other instanceof Err))
/*   */         return false; 
/*   */       Err err = (Err)other;
/*   */       return !Intrinsics.areEqual(this.error, err.error) ? false : (!!Intrinsics.areEqual(this.message, err.message));
/*   */     } }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\Result.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */