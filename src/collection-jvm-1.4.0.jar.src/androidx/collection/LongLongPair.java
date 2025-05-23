/*    */ package androidx.collection;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\b\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\t\020\t\032\0020\003H\nJ\t\020\n\032\0020\003H\nJ\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\001H\002J\b\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\b\020\007¨\006\022"}, d2 = {"Landroidx/collection/LongLongPair;", "", "first", "", "second", "(JJ)V", "getFirst", "()J", "getSecond", "component1", "component2", "equals", "", "other", "hashCode", "", "toString", "", "collection"})
/*    */ public final class LongLongPair
/*    */ {
/*    */   private final long first;
/*    */   private final long second;
/*    */   
/*    */   public LongLongPair(long first, long second) {
/* 26 */     this.first = first; this.second = second; } public final long getFirst() { return this.first; } public final long getSecond() { return this.second; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final long component1() {
/* 37 */     int $i$f$component1 = 0; return getFirst();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final long component2() {
/* 49 */     int $i$f$component2 = 0; return getSecond();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 58 */     if (!(other instanceof LongLongPair)) {
/* 59 */       return false;
/*    */     }
/* 61 */     return (((LongLongPair)other).first == this.first && ((LongLongPair)other).second == this.second);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 70 */     return Long.hashCode(this.first) ^ Long.hashCode(this.second);
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 74 */     return '(' + this.first + ", " + this.second + ')';
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\LongLongPair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */