/*    */ package ai.grazie.utils.cache;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\004\bf\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002:\001\007R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Lai/grazie/utils/cache/CacheValue$WithTime;", "Value", "Lai/grazie/utils/cache/CacheValue;", "epoch", "", "getEpoch", "()J", "Default", "utils-common"})
/*    */ public interface WithTime<Value> extends CacheValue<Value> {
/*    */   long getEpoch();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\t\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\031\022\b\020\003\032\004\030\0018\002\022\b\b\002\020\004\032\0020\005¢\006\002\020\006J\020\020\f\032\004\030\0018\002HÆ\003¢\006\002\020\nJ\t\020\r\032\0020\005HÆ\003J*\020\016\032\b\022\004\022\0028\0020\0002\n\b\002\020\003\032\004\030\0018\0022\b\b\002\020\004\032\0020\005HÆ\001¢\006\002\020\017J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\027HÖ\001R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\007\020\bR\030\020\003\032\004\030\0018\002X\004¢\006\n\n\002\020\013\032\004\b\t\020\n¨\006\030"}, d2 = {"Lai/grazie/utils/cache/CacheValue$WithTime$Default;", "Value", "Lai/grazie/utils/cache/CacheValue$WithTime;", "value", "epoch", "", "(Ljava/lang/Object;J)V", "getEpoch", "()J", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;J)Lai/grazie/utils/cache/CacheValue$WithTime$Default;", "equals", "", "other", "", "hashCode", "", "toString", "", "utils-common"})
/*    */   public static final class Default<Value> implements WithTime<Value> {
/*    */     @Nullable
/*    */     private final Value value;
/*    */     
/* 11 */     public Default(@Nullable Object value, long epoch) { this.value = (Value)value; this.epoch = epoch; } private final long epoch; @Nullable public Value getValue() { return this.value; } public long getEpoch() { return this.epoch; }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public final Value component1() {
/*    */       return this.value;
/*    */     }
/*    */     
/*    */     public final long component2() {
/*    */       return this.epoch;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Default<Value> copy(@Nullable Object value, long epoch) {
/*    */       return new Default((Value)value, epoch);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Default(value=" + this.value + ", epoch=" + this.epoch + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = (this.value == null) ? 0 : this.value.hashCode();
/*    */       return result * 31 + Long.hashCode(this.epoch);
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Default))
/*    */         return false; 
/*    */       Default default_ = (Default)other;
/*    */       return !Intrinsics.areEqual(this.value, default_.value) ? false : (!(this.epoch != default_.epoch));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\CacheValue$WithTime.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */