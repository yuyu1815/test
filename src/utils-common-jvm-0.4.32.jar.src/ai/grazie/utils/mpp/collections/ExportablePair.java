/*    */ package ai.grazie.utils.mpp.collections;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\007\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003B'\b\000\022\006\020\004\032\0028\000\022\006\020\005\032\0028\001\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007¢\006\002\020\tJ\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\003H\002J\b\020\021\032\0020\022H\026J\b\020\023\032\0020\024H\026R\023\020\004\032\0028\000¢\006\n\n\002\020\f\032\004\b\n\020\013R\023\020\005\032\0028\001¢\006\n\n\002\020\f\032\004\b\r\020\013¨\006\025"}, d2 = {"Lai/grazie/utils/mpp/collections/ExportablePair;", "K", "V", "", "first", "second", "firstType", "Lai/grazie/utils/mpp/collections/ExportableType;", "secondType", "(Ljava/lang/Object;Ljava/lang/Object;Lai/grazie/utils/mpp/collections/ExportableType;Lai/grazie/utils/mpp/collections/ExportableType;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "equals", "", "other", "hashCode", "", "toString", "", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nExportablePair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportablePair.kt\nai/grazie/utils/mpp/collections/ExportablePair\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
/*    */ public final class ExportablePair<K, V> {
/*    */   public ExportablePair(Object first, Object second, @NotNull ExportableType firstType, @NotNull ExportableType secondType) {
/*  7 */     this.first = (K)first;
/*  8 */     this.second = (V)second;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 13 */     if (this.first != null) { Object it = this.first;
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
/* 56 */       int $i$a$-let-ExportablePair$1 = 0; ExportableTypeKt.requireIsInstance(firstType, it); } else {  }  if (this.second != null) { Object it = this.second; int $i$a$-let-ExportablePair$2 = 0;
/*    */       ExportableTypeKt.requireIsInstance(secondType, it); }
/*    */     else
/*    */     {  }
/*    */   
/*    */   }
/*    */   
/*    */   private final K first;
/*    */   private final V second;
/*    */   
/*    */   public final K getFirst() {
/*    */     return this.first;
/*    */   }
/*    */   
/*    */   public final V getSecond() {
/*    */     return this.second;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (other == null || getClass() != other.getClass())
/*    */       return false; 
/*    */     (ExportablePair)other;
/*    */     if (!Intrinsics.areEqual(this.first, ((ExportablePair)other).first))
/*    */       return false; 
/*    */     if (!Intrinsics.areEqual(this.second, ((ExportablePair)other).second))
/*    */       return false; 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     int result = (this.first != null) ? this.first.hashCode() : 0;
/*    */     result = 31 * result + ((this.second != null) ? this.second.hashCode() : 0);
/*    */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ExportablePair(" + this.first + ", " + this.second + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\collections\ExportablePair.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */