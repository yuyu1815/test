/*    */ package ai.grazie.utils.cache;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\000\n\002\020\000\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\b\b\000\020\001*\0020\0022\0020\002B\017\022\b\020\003\032\004\030\0018\000¢\006\002\020\004J\020\020\b\032\004\030\0018\000HÆ\003¢\006\002\020\006J \020\t\032\b\022\004\022\0028\0000\0002\n\b\002\020\003\032\004\030\0018\000HÆ\001¢\006\002\020\nJ\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\002HÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\025\020\003\032\004\030\0018\000¢\006\n\n\002\020\007\032\004\b\005\020\006¨\006\022"}, d2 = {"Lai/grazie/utils/cache/Wrapper;", "Value", "", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lai/grazie/utils/cache/Wrapper;", "equals", "", "other", "hashCode", "", "toString", "", "utils-common"})
/*    */ public final class Wrapper<Value>
/*    */ {
/*    */   @Nullable
/*    */   private final Value value;
/*    */   
/*    */   public Wrapper(@Nullable Object value) {
/* 46 */     this.value = (Value)value; } @Nullable public final Value getValue() { return this.value; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final Value component1() {
/*    */     return this.value;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Wrapper<Value> copy(@Nullable Object value) {
/*    */     return new Wrapper((Value)value);
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\Wrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */