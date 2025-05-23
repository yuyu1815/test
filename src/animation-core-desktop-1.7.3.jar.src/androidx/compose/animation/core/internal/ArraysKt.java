/*    */ package androidx.compose.animation.core.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\020\002\n\000\n\002\020\b\n\002\b\003\n\002\020\024\n\000\n\002\020\007\n\000\032 \020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\005\032\0020\003H\002\032(\020\006\032\0020\003*\0020\0072\006\020\b\032\0020\t2\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003H\000¨\006\n"}, d2 = {"rangeCheck", "", "size", "", "fromIndex", "toIndex", "binarySearch", "", "element", "", "animation-core"})
/*    */ public final class ArraysKt
/*    */ {
/*    */   public static final int binarySearch(@NotNull float[] $this$binarySearch, float element, int fromIndex, int toIndex) {
/* 21 */     Intrinsics.checkNotNullParameter($this$binarySearch, "<this>"); rangeCheck($this$binarySearch.length, fromIndex, toIndex);
/*    */     
/* 23 */     int low = fromIndex;
/* 24 */     int high = toIndex - 1;
/*    */     
/* 26 */     while (low <= high) {
/* 27 */       int mid = low + high >>> 1;
/* 28 */       float midVal = $this$binarySearch[mid];
/* 29 */       int cmp = Float.compare(midVal, element);
/*    */       
/* 31 */       if (cmp < 0) {
/* 32 */         low = mid + 1; continue;
/* 33 */       }  if (cmp > 0) {
/* 34 */         high = mid - 1; continue;
/*    */       } 
/* 36 */       return mid;
/*    */     } 
/* 38 */     return -(low + 1);
/*    */   }
/*    */ 
/*    */   
/*    */   private static final void rangeCheck(int size, int fromIndex, int toIndex) {
/* 43 */     if (fromIndex > toIndex) throw new IllegalArgumentException("fromIndex (" + fromIndex + ") is greater than toIndex (" + toIndex + ")."); 
/* 44 */     if (fromIndex < 0) throw new IndexOutOfBoundsException("fromIndex (" + fromIndex + ") is less than zero."); 
/* 45 */     if (toIndex > size) throw new IndexOutOfBoundsException("toIndex (" + toIndex + ") is greater than size (" + size + ")."); 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\internal\ArraysKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */