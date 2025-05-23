/*    */ package androidx.collection;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\t\n\000\n\002\020\007\n\002\b\002\n\002\020\b\n\000\032\031\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\003H\b\032\031\020\005\032\0020\0012\006\020\002\032\0020\0062\006\020\004\032\0020\006H\b¨\006\007"}, d2 = {"packFloats", "", "val1", "", "val2", "packInts", "", "collection"})
/*    */ public final class PackingUtilsKt
/*    */ {
/*    */   public static final long packFloats(float val1, float val2) {
/* 24 */     int $i$f$packFloats = 0; long v1 = Float.floatToRawIntBits(val1);
/* 25 */     long v2 = Float.floatToRawIntBits(val2);
/* 26 */     return v1 << 32L | v2 & 0xFFFFFFFFL;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final long packInts(int val1, int val2) {
/* 33 */     int $i$f$packInts = 0; return val1 << 32L | val2 & 0xFFFFFFFFL;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\PackingUtilsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */