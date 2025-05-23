/*    */ package androidx.collection;
/*    */ 
/*    */ import java.lang.reflect.Array;
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
/*    */ class ArraySetJvmUtil
/*    */ {
/*    */   static <T> T[] resizeForToArray(T[] destination, int size) {
/* 30 */     if (destination.length < size) {
/* 31 */       return (T[])Array.newInstance(destination.getClass().getComponentType(), size);
/*    */     }
/* 33 */     if (destination.length > size) {
/* 34 */       destination[size] = null;
/*    */     }
/* 36 */     return destination;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\ArraySetJvmUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */