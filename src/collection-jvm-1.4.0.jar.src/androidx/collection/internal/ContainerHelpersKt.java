/*    */ package androidx.collection.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\020\025\n\000\n\002\020\026\n\000\n\002\020\021\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\t\n\000\n\002\020\013\n\002\b\007\032 \020\b\032\0020\t2\006\020\n\032\0020\0012\006\020\013\032\0020\t2\006\020\f\032\0020\tH\000\032 \020\b\032\0020\t2\006\020\n\032\0020\0032\006\020\013\032\0020\t2\006\020\f\032\0020\rH\000\032\034\020\016\032\0020\0172\b\020\020\032\004\030\0010\0062\b\020\021\032\004\030\0010\006H\000\032\020\020\022\032\0020\t2\006\020\023\032\0020\tH\000\032\020\020\024\032\0020\t2\006\020\023\032\0020\tH\000\032\020\020\025\032\0020\t2\006\020\023\032\0020\tH\000\"\020\020\000\032\0020\0018\000X\004¢\006\002\n\000\"\020\020\002\032\0020\0038\000X\004¢\006\002\n\000\"\032\020\004\032\n\022\006\022\004\030\0010\0060\0058\000X\004¢\006\004\n\002\020\007¨\006\026"}, d2 = {"EMPTY_INTS", "", "EMPTY_LONGS", "", "EMPTY_OBJECTS", "", "", "[Ljava/lang/Object;", "binarySearch", "", "array", "size", "value", "", "equal", "", "a", "b", "idealByteArraySize", "need", "idealIntArraySize", "idealLongArraySize", "collection"})
/*    */ public final class ContainerHelpersKt
/*    */ {
/*    */   @JvmField
/*    */   @NotNull
/* 22 */   public static final int[] EMPTY_INTS = new int[0];
/*    */   @JvmField
/*    */   @NotNull
/* 25 */   public static final long[] EMPTY_LONGS = new long[0];
/*    */   @JvmField
/*    */   @NotNull
/* 28 */   public static final Object[] EMPTY_OBJECTS = new Object[0];
/*    */   
/*    */   public static final int idealIntArraySize(int need) {
/* 31 */     return idealByteArraySize(need * 4) / 4;
/*    */   }
/*    */   
/*    */   public static final int idealLongArraySize(int need) {
/* 35 */     return idealByteArraySize(need * 8) / 8;
/*    */   }
/*    */   
/*    */   public static final int idealByteArraySize(int need) {
/* 39 */     for (int i = 4; i < 32; i++) {
/* 40 */       if (need <= (1 << i) - 12) {
/* 41 */         return (1 << i) - 12;
/*    */       }
/*    */     } 
/* 44 */     return need;
/*    */   }
/*    */ 
/*    */   
/*    */   public static final boolean equal(@Nullable Object a, @Nullable Object b) {
/* 49 */     return Intrinsics.areEqual(a, b);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final int binarySearch(@NotNull int[] array, int size, int value) {
/* 56 */     Intrinsics.checkNotNullParameter(array, "array"); int lo = 0;
/* 57 */     int hi = size - 1;
/* 58 */     while (lo <= hi) {
/* 59 */       int mid = lo + hi >>> 1;
/* 60 */       int midVal = array[mid];
/* 61 */       if (midVal < value) {
/* 62 */         lo = mid + 1; continue;
/* 63 */       }  if (midVal > value) {
/* 64 */         hi = mid - 1; continue;
/*    */       } 
/* 66 */       return mid;
/*    */     } 
/*    */     
/* 69 */     return lo ^ 0xFFFFFFFF;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static final int binarySearch(@NotNull long[] array, int size, long value) {
/* 75 */     Intrinsics.checkNotNullParameter(array, "array"); int lo = 0;
/* 76 */     int hi = size - 1;
/* 77 */     while (lo <= hi) {
/* 78 */       int mid = lo + hi >>> 1;
/* 79 */       long midVal = array[mid];
/* 80 */       if (midVal < value) {
/* 81 */         lo = mid + 1; continue;
/* 82 */       }  if (midVal > value) {
/* 83 */         hi = mid - 1; continue;
/*    */       } 
/* 85 */       return mid;
/*    */     } 
/*    */     
/* 88 */     return lo ^ 0xFFFFFFFF;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\internal\ContainerHelpersKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */