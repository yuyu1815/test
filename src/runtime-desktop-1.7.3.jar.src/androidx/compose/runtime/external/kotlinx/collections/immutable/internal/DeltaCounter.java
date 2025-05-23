/*   */ package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;
/*   */ 
/*   */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\001HÖ\003J\t\020\r\032\0020\003HÖ\001J\021\020\016\032\0020\0172\006\020\020\032\0020\003H\002J\t\020\021\032\0020\022HÖ\001R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\004¨\006\023"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "", "count", "", "(I)V", "getCount", "()I", "setCount", "component1", "copy", "equals", "", "other", "hashCode", "plusAssign", "", "that", "toString", "", "runtime"})
/*   */ @StabilityInferred(parameters = 0)
/*   */ public final class DeltaCounter {
/*   */   private int count;
/*   */   
/* 8 */   public DeltaCounter(int count) { this.count = count; } public static final int $stable = 8; public final int getCount() { return this.count; } public final void setCount(int <set-?>) { this.count = <set-?>; } public final void plusAssign(int that) {
/* 9 */     this.count += that;
/*   */   }
/*   */   
/*   */   public final int component1() {
/*   */     return this.count;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final DeltaCounter copy(int count) {
/*   */     return new DeltaCounter(count);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "DeltaCounter(count=" + this.count + ')';
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return Integer.hashCode(this.count);
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof DeltaCounter))
/*   */       return false; 
/*   */     DeltaCounter deltaCounter = (DeltaCounter)other;
/*   */     return !(this.count != deltaCounter.count);
/*   */   }
/*   */   
/*   */   public DeltaCounter() {
/*   */     this(0, 1, null);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\internal\DeltaCounter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */