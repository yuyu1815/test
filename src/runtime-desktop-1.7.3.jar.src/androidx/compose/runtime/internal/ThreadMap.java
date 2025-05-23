/*     */ package androidx.compose.runtime.internal;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\026\n\000\n\002\020\021\n\002\b\004\n\002\020\t\n\002\b\004\n\002\020\013\n\000\b\000\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\016\020\006\032\n\022\006\022\004\030\0010\0010\007¢\006\002\020\bJ\020\020\n\032\0020\0032\006\020\013\032\0020\fH\002J\020\020\r\032\004\030\0010\0012\006\020\013\032\0020\fJ\030\020\016\032\0020\0002\006\020\013\032\0020\f2\b\020\017\032\004\030\0010\001J\030\020\020\032\0020\0212\006\020\013\032\0020\f2\b\020\017\032\004\030\0010\001R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\030\020\006\032\n\022\006\022\004\030\0010\0010\007X\004¢\006\004\n\002\020\t¨\006\022"}, d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "size", "", "keys", "", "values", "", "(I[J[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "find", "key", "", "get", "newWith", "value", "trySet", "", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nThreadMap.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n12634#2,3:113\n*S KotlinDebug\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n42#1:113,3\n*E\n"})
/*     */ public final class ThreadMap {
/*     */   private final int size;
/*     */   @NotNull
/*     */   private final long[] keys;
/*     */   @NotNull
/*     */   private final Object[] values;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public ThreadMap(int size, @NotNull long[] keys, @NotNull Object[] values) {
/*  20 */     this.size = size;
/*  21 */     this.keys = keys;
/*  22 */     this.values = values;
/*     */   } @Nullable
/*     */   public final Object get(long key) {
/*  25 */     int index = find(key);
/*  26 */     return (index >= 0) ? this.values[index] : null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean trySet(long key, @Nullable Object value) {
/*  34 */     int index = find(key);
/*  35 */     if (index < 0) return false; 
/*  36 */     this.values[index] = value;
/*  37 */     return true;
/*     */   }
/*     */   @NotNull
/*     */   public final ThreadMap newWith(long key, @Nullable Object value) {
/*  41 */     int size = this.size;
/*  42 */     Object[] $this$count$iv = this.values; int $i$f$count = 0;
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
/* 113 */     int count$iv = 0; byte b; int i;
/* 114 */     for (b = 0, i = $this$count$iv.length; b < i; ) { Object element$iv = $this$count$iv[b], it = element$iv; int $i$a$-count-ThreadMap$newWith$newSize$1 = 0; if ((it != null)) count$iv++;  b++; }
/* 115 */      int newSize = count$iv + 1;
/*     */     long[] newKeys = new long[newSize];
/*     */     Object[] newValues = new Object[newSize];
/*     */     if (newSize > 1) {
/*     */       int dest = 0;
/*     */       int source = 0;
/*     */       while (dest < newSize && source < size) {
/*     */         long oldKey = this.keys[source];
/*     */         Object oldValue = this.values[source];
/*     */         if (oldKey > key) {
/*     */           newKeys[dest] = key;
/*     */           newValues[dest] = value;
/*     */           dest++;
/*     */           break;
/*     */         } 
/*     */         if (oldValue != null) {
/*     */           newKeys[dest] = oldKey;
/*     */           newValues[dest] = oldValue;
/*     */           dest++;
/*     */         } 
/*     */         source++;
/*     */       } 
/*     */       if (source == size) {
/*     */         newKeys[newSize - 1] = key;
/*     */         newValues[newSize - 1] = value;
/*     */       } else {
/*     */         while (dest < newSize) {
/*     */           long oldKey = this.keys[source];
/*     */           Object oldValue = this.values[source];
/*     */           if (oldValue != null) {
/*     */             newKeys[dest] = oldKey;
/*     */             newValues[dest] = oldValue;
/*     */             dest++;
/*     */           } 
/*     */           source++;
/*     */         } 
/*     */       } 
/*     */     } else {
/*     */       newKeys[0] = key;
/*     */       newValues[0] = value;
/*     */     } 
/*     */     return new ThreadMap(newSize, newKeys, newValues);
/*     */   }
/*     */   
/*     */   private final int find(long key) {
/*     */     int high = this.size - 1;
/*     */     switch (high) {
/*     */       case -1:
/*     */         return -1;
/*     */       case 0:
/*     */         return (this.keys[0] == key) ? 0 : ((this.keys[0] > key) ? -2 : -1);
/*     */     } 
/*     */     int low = 0;
/*     */     while (low <= high) {
/*     */       int mid = low + high >>> 1;
/*     */       long midVal = this.keys[mid];
/*     */       long comparison = midVal - key;
/*     */       if (comparison < 0L) {
/*     */         low = mid + 1;
/*     */         continue;
/*     */       } 
/*     */       if (comparison > 0L) {
/*     */         high = mid - 1;
/*     */         continue;
/*     */       } 
/*     */       return mid;
/*     */     } 
/*     */     return -(low + 1);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\internal\ThreadMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */