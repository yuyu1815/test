/*     */ package androidx.compose.runtime.collection;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\020\b\n\002\020\025\n\002\b\003\n\002\020\021\n\002\020\000\n\002\b\004\032\034\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0012\006\020\004\032\0020\001H\002\032;\020\005\032\n\022\006\022\004\030\0010\0070\006*\n\022\006\022\004\030\0010\0070\0062\006\020\b\032\0020\0012\006\020\t\032\0020\0012\b\020\004\032\004\030\0010\007H\002¢\006\002\020\n\032$\020\005\032\0020\002*\0020\0022\006\020\b\032\0020\0012\006\020\t\032\0020\0012\006\020\004\032\0020\001H\002¨\006\013"}, d2 = {"binarySearch", "", "", "size", "value", "insert", "", "", "currentSize", "index", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "runtime"})
/*     */ public final class ActualIntMap_desktopKt
/*     */ {
/*     */   private static final int binarySearch(int[] $this$binarySearch, int size, int value) {
/*  84 */     int min = 0;
/*  85 */     int max = size - 1;
/*  86 */     while (min <= max) {
/*  87 */       int mid = (min + max) / 2;
/*  88 */       int midValue = $this$binarySearch[mid];
/*  89 */       if (midValue < value) {
/*  90 */         min = mid + 1; continue;
/*  91 */       }  if (midValue > value) {
/*  92 */         max = mid - 1; continue;
/*     */       } 
/*  94 */       return mid;
/*     */     } 
/*     */     
/*  97 */     return -(min + 1);
/*     */   }
/*     */   
/*     */   private static final int[] insert(int[] $this$insert, int currentSize, int index, int value) {
/* 101 */     if (currentSize + 1 <= $this$insert.length) {
/* 102 */       if (index < currentSize) {
/* 103 */         System.arraycopy($this$insert, index, $this$insert, index + 1, currentSize - index);
/*     */       }
/* 105 */       $this$insert[index] = value;
/* 106 */       return $this$insert;
/*     */     } 
/*     */     
/* 109 */     int[] result = new int[$this$insert.length * 2];
/* 110 */     System.arraycopy($this$insert, 0, result, 0, index);
/* 111 */     result[index] = value;
/* 112 */     System.arraycopy($this$insert, index, result, index + 1, $this$insert.length - index);
/* 113 */     return result;
/*     */   }
/*     */   
/*     */   private static final Object[] insert(Object[] $this$insert, int currentSize, int index, Object value) {
/* 117 */     if (currentSize + 1 <= $this$insert.length) {
/* 118 */       if (index < currentSize) {
/* 119 */         System.arraycopy($this$insert, index, $this$insert, index + 1, currentSize - index);
/*     */       }
/* 121 */       $this$insert[index] = value;
/* 122 */       return $this$insert;
/*     */     }  byte b; int i;
/*     */     Object[] arrayOfObject1;
/* 125 */     for (b = 0, i = $this$insert.length * 2, arrayOfObject1 = new Object[i]; b < i; ) { byte b1 = b; arrayOfObject1[b1] = null; b++; }  Object[] result = arrayOfObject1;
/* 126 */     System.arraycopy($this$insert, 0, result, 0, index);
/* 127 */     result[index] = value;
/* 128 */     System.arraycopy($this$insert, index, result, index + 1, $this$insert.length - index);
/* 129 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\collection\ActualIntMap_desktopKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */