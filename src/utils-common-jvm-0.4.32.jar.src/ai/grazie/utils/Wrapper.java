/*    */ package ai.grazie.utils;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\000\n\002\020\000\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\000\020\0012\0020\002B\r\022\006\020\003\032\0028\000¢\006\002\020\004J\016\020\b\032\0028\000HÆ\003¢\006\002\020\006J\036\020\t\032\b\022\004\022\0028\0000\0002\b\b\002\020\003\032\0028\000HÆ\001¢\006\002\020\nJ\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\002HÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\023\020\003\032\0028\000¢\006\n\n\002\020\007\032\004\b\005\020\006¨\006\022"}, d2 = {"Lai/grazie/utils/Wrapper;", "T", "", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lai/grazie/utils/Wrapper;", "equals", "", "other", "hashCode", "", "toString", "", "utils-common"})
/*    */ final class Wrapper<T>
/*    */ {
/*    */   private final T value;
/*    */   
/*    */   public Wrapper(Object value) {
/* 29 */     this.value = (T)value; } public final T getValue() { return this.value; }
/*    */ 
/*    */   
/*    */   public final T component1() {
/*    */     return this.value;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Wrapper<T> copy(Object value) {
/*    */     return new Wrapper((T)value);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Wrapper(value=" + this.value + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return (this.value == null) ? 0 : this.value.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Wrapper))
/*    */       return false; 
/*    */     Wrapper wrapper = (Wrapper)other;
/*    */     return !!Intrinsics.areEqual(this.value, wrapper.value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\Wrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */