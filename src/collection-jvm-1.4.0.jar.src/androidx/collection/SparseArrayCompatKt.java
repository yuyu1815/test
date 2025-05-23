/*     */ package androidx.collection;
/*     */ 
/*     */ import androidx.collection.internal.ContainerHelpersKt;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\013\n\002\b\033\n\002\020\016\n\002\b\005\032.\020\002\032\0020\003\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\006\032\0020\0072\006\020\b\032\002H\004H\b¢\006\002\020\t\032\031\020\n\032\0020\003\"\004\b\000\020\004*\b\022\004\022\002H\0040\005H\b\032!\020\013\032\0020\f\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\006\032\0020\007H\b\032&\020\r\032\0020\f\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\b\032\002H\004H\b¢\006\002\020\016\032'\020\017\032\004\030\001H\004\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\006\032\0020\007H\000¢\006\002\020\020\032-\020\017\032\002H\004\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\006\032\0020\0072\006\020\021\032\002H\004H\000¢\006\002\020\022\032!\020\023\032\0020\007\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\006\032\0020\007H\b\032&\020\024\032\0020\007\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\b\032\002H\004H\b¢\006\002\020\025\032\031\020\026\032\0020\f\"\004\b\000\020\004*\b\022\004\022\002H\0040\005H\b\032!\020\027\032\0020\007\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\030\032\0020\007H\b\032.\020\031\032\0020\003\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\006\032\0020\0072\006\020\b\032\002H\004H\b¢\006\002\020\t\032)\020\032\032\0020\003\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\016\020\033\032\n\022\006\b\001\022\002H\0040\005H\b\0320\020\034\032\004\030\001H\004\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\006\032\0020\0072\006\020\b\032\002H\004H\b¢\006\002\020\022\032 \020\035\032\0020\003\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\006\032\0020\007H\000\032+\020\035\032\0020\f\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\001H\b\032!\020\036\032\0020\003\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\030\032\0020\007H\b\032)\020\037\032\0020\003\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\030\032\0020\0072\006\020 \032\0020\007H\b\0320\020!\032\004\030\001H\004\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\006\032\0020\0072\006\020\b\032\002H\004H\b¢\006\002\020\022\0326\020!\032\0020\f\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\006\032\0020\0072\006\020\"\032\002H\0042\006\020#\032\002H\004H\b¢\006\002\020$\032.\020%\032\0020\003\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\030\032\0020\0072\006\020\b\032\002H\004H\b¢\006\002\020\t\032\031\020&\032\0020\007\"\004\b\000\020\004*\b\022\004\022\002H\0040\005H\b\032\031\020'\032\0020(\"\004\b\000\020\004*\b\022\004\022\002H\0040\005H\b\032&\020)\032\002H\004\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\030\032\0020\007H\b¢\006\002\020\020\032\030\020*\032\0020\003\"\004\b\000\020\004*\b\022\004\022\002H\0040\005H\002\032:\020+\032\002H,\"\004\b\000\020\004\"\n\b\001\020,*\004\030\001H\004*\b\022\004\022\002H\0040\0052\006\020\006\032\0020\0072\006\020\021\032\002H,H\b¢\006\002\020\022\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006-"}, d2 = {"DELETED", "", "commonAppend", "", "E", "Landroidx/collection/SparseArrayCompat;", "key", "", "value", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "commonClear", "commonContainsKey", "", "commonContainsValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)Z", "commonGet", "(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)I", "commonIsEmpty", "commonKeyAt", "index", "commonPut", "commonPutAll", "other", "commonPutIfAbsent", "commonRemove", "commonRemoveAt", "commonRemoveAtRange", "size", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;Ljava/lang/Object;)Z", "commonSetValueAt", "commonSize", "commonToString", "", "commonValueAt", "gc", "internalGet", "T", "collection"})
/*     */ @SourceDebugExtension({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,535:1\n244#1,6:536\n244#1,6:542\n353#1,40:548\n353#1,40:588\n459#1,9:628\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n255#1:536,6\n260#1:542,6\n397#1:548,40\n405#1:588,40\n477#1:628,9\n*E\n"})
/*     */ public final class SparseArrayCompatKt
/*     */ {
/*     */   @NotNull
/*  26 */   private static final Object DELETED = new Object();
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
/*     */   private static final <E, T extends E> T internalGet(SparseArrayCompat $this$internalGet, int key, Object defaultValue) {
/* 244 */     int $i$f$internalGet = 0, i = ContainerHelpersKt.binarySearch($this$internalGet.keys, $this$internalGet.size, key);
/* 245 */     return (i < 0 || $this$internalGet.values[i] == DELETED) ? 
/* 246 */       (T)defaultValue : 
/*     */ 
/*     */       
/* 249 */       (T)$this$internalGet.values[i];
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final <E> E commonGet(@NotNull SparseArrayCompat $this$commonGet, int key)
/*     */   {
/* 255 */     Intrinsics.checkNotNullParameter($this$commonGet, "<this>"); SparseArrayCompat sparseArrayCompat = $this$commonGet; Object defaultValue$iv = null; int $i$f$internalGet = 0;
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
/* 536 */     int i$iv = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, key);
/* 537 */     return (i$iv < 0 || sparseArrayCompat.values[i$iv] == DELETED) ? 
/* 538 */       (E)defaultValue$iv : 
/*     */ 
/*     */       
/* 541 */       (E)sparseArrayCompat.values[i$iv]; }
/* 542 */   public static final <E> void commonRemove(@NotNull SparseArrayCompat $this$commonRemove, int key) { Intrinsics.checkNotNullParameter($this$commonRemove, "<this>"); int i = ContainerHelpersKt.binarySearch($this$commonRemove.keys, $this$commonRemove.size, key); if (i >= 0 && $this$commonRemove.values[i] != DELETED) { $this$commonRemove.values[i] = DELETED; $this$commonRemove.garbage = true; }  } public static final <E> boolean commonRemove(@NotNull SparseArrayCompat $this$commonRemove, int key, @Nullable Object value) { Intrinsics.checkNotNullParameter($this$commonRemove, "<this>"); int $i$f$commonRemove = 0, index = $this$commonRemove.indexOfKey(key); if (index >= 0) { Object mapValue = $this$commonRemove.valueAt(index); if (Intrinsics.areEqual(value, mapValue)) { $this$commonRemove.removeAt(index); return true; }  }  return false; } public static final <E> void commonRemoveAt(@NotNull SparseArrayCompat $this$commonRemoveAt, int index) { Intrinsics.checkNotNullParameter($this$commonRemoveAt, "<this>"); int $i$f$commonRemoveAt = 0; if ($this$commonRemoveAt.values[index] != access$getDELETED$p()) { $this$commonRemoveAt.values[index] = access$getDELETED$p(); $this$commonRemoveAt.garbage = true; }  } public static final <E> void commonRemoveAtRange(@NotNull SparseArrayCompat $this$commonRemoveAtRange, int index, int size) { Intrinsics.checkNotNullParameter($this$commonRemoveAtRange, "<this>"); int $i$f$commonRemoveAtRange = 0, end = Math.min(size, index + size); for (int i = index; i < end; i++) $this$commonRemoveAtRange.removeAt(i);  } public static final <E> E commonGet(@NotNull SparseArrayCompat $this$commonGet, int key, Object defaultValue) { Intrinsics.checkNotNullParameter($this$commonGet, "<this>"); SparseArrayCompat $this$internalGet$iv = $this$commonGet; int $i$f$internalGet = 0; int i$iv = ContainerHelpersKt.binarySearch($this$internalGet$iv.keys, $this$internalGet$iv.size, key);
/* 543 */     return (i$iv < 0 || $this$internalGet$iv.values[i$iv] == DELETED) ? 
/* 544 */       (E)defaultValue : 
/*     */ 
/*     */       
/* 547 */       (E)$this$internalGet$iv.values[i$iv]; }
/* 548 */   @Nullable public static final <E> E commonReplace(@NotNull SparseArrayCompat $this$commonReplace, int key, Object value) { Intrinsics.checkNotNullParameter($this$commonReplace, "<this>"); int $i$f$commonReplace = 0, index = $this$commonReplace.indexOfKey(key); if (index >= 0) { Object oldValue = $this$commonReplace.values[index]; $this$commonReplace.values[index] = value; return (E)oldValue; }  return null; } public static final <E> boolean commonReplace(@NotNull SparseArrayCompat $this$commonReplace, int key, Object oldValue, Object newValue) { Intrinsics.checkNotNullParameter($this$commonReplace, "<this>"); int $i$f$commonReplace = 0, index = $this$commonReplace.indexOfKey(key); if (index >= 0) { Object mapValue = $this$commonReplace.values[index]; if (Intrinsics.areEqual(mapValue, oldValue)) { $this$commonReplace.values[index] = newValue; return true; }  }  return false; } private static final <E> void gc(SparseArrayCompat $this$gc) { int n = $this$gc.size; int o = 0; int[] keys = $this$gc.keys; Object[] values = $this$gc.values; for (int i = 0; i < n; i++) { Object value = values[i]; if (value != DELETED) { if (i != o) { keys[o] = keys[i]; values[o] = value; values[i] = null; }  o++; }  }  $this$gc.garbage = false; $this$gc.size = o; } public static final <E> void commonPut(@NotNull SparseArrayCompat $this$commonPut, int key, Object value) { Intrinsics.checkNotNullParameter($this$commonPut, "<this>"); int $i$f$commonPut = 0, i = ContainerHelpersKt.binarySearch($this$commonPut.keys, $this$commonPut.size, key); if (i >= 0) { $this$commonPut.values[i] = value; } else { i ^= 0xFFFFFFFF; if (i < $this$commonPut.size && $this$commonPut.values[i] == access$getDELETED$p()) { $this$commonPut.keys[i] = key; $this$commonPut.values[i] = value; return; }  if ($this$commonPut.garbage && $this$commonPut.size >= $this$commonPut.keys.length) { access$gc($this$commonPut); i = ContainerHelpersKt.binarySearch($this$commonPut.keys, $this$commonPut.size, key) ^ 0xFFFFFFFF; }  if ($this$commonPut.size >= $this$commonPut.keys.length) { int n = ContainerHelpersKt.idealIntArraySize($this$commonPut.size + 1); Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonPut.keys, n), "copyOf(this, newSize)"); $this$commonPut.keys = Arrays.copyOf($this$commonPut.keys, n); Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonPut.values, n), "copyOf(this, newSize)"); $this$commonPut.values = Arrays.copyOf($this$commonPut.values, n); }  if ($this$commonPut.size - i != 0) { ArraysKt.copyInto($this$commonPut.keys, $this$commonPut.keys, i + 1, i, $this$commonPut.size); ArraysKt.copyInto($this$commonPut.values, $this$commonPut.values, i + 1, i, $this$commonPut.size); }  $this$commonPut.keys[i] = key; $this$commonPut.values[i] = value; int j = $this$commonPut.size; $this$commonPut.size = j + 1; }  } public static final <E> void commonPutAll(@NotNull SparseArrayCompat $this$commonPutAll, @NotNull SparseArrayCompat other) { Intrinsics.checkNotNullParameter($this$commonPutAll, "<this>"); Intrinsics.checkNotNullParameter(other, "other"); int $i$f$commonPutAll = 0, i = 0, j = other.size(); if (i < j) { SparseArrayCompat sparseArrayCompat = $this$commonPutAll; int k = other.keyAt(i); Object value$iv = other.valueAt(i); int $i$f$commonPut = 0; int i$iv = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, k);
/* 549 */       if (i$iv >= 0) {
/* 550 */         sparseArrayCompat.values[i$iv] = value$iv;
/*     */       } else {
/* 552 */         i$iv ^= 0xFFFFFFFF;
/* 553 */         if (i$iv < sparseArrayCompat.size && sparseArrayCompat.values[i$iv] == access$getDELETED$p())
/* 554 */         { sparseArrayCompat.keys[i$iv] = k;
/* 555 */           sparseArrayCompat.values[i$iv] = value$iv; }
/*     */         else
/*     */         
/* 558 */         { if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
/* 559 */             access$gc(sparseArrayCompat);
/*     */ 
/*     */             
/* 562 */             i$iv = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, k) ^ 0xFFFFFFFF;
/*     */           } 
/* 564 */           if (sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
/* 565 */             int n$iv = ContainerHelpersKt.idealIntArraySize(sparseArrayCompat.size + 1);
/* 566 */             Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(sparseArrayCompat.keys, n$iv), "copyOf(this, newSize)"); sparseArrayCompat.keys = Arrays.copyOf(sparseArrayCompat.keys, n$iv);
/* 567 */             Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(sparseArrayCompat.values, n$iv), "copyOf(this, newSize)"); sparseArrayCompat.values = Arrays.copyOf(sparseArrayCompat.values, n$iv);
/*     */           } 
/* 569 */           if (sparseArrayCompat.size - i$iv != 0) {
/* 570 */             ArraysKt.copyInto(sparseArrayCompat.keys, 
/* 571 */                 sparseArrayCompat.keys, 
/* 572 */                 i$iv + 1, 
/* 573 */                 i$iv, 
/* 574 */                 sparseArrayCompat.size);
/*     */             
/* 576 */             ArraysKt.copyInto(sparseArrayCompat.values, 
/* 577 */                 sparseArrayCompat.values, 
/* 578 */                 i$iv + 1, 
/* 579 */                 i$iv, 
/* 580 */                 sparseArrayCompat.size);
/*     */           } 
/*     */           
/* 583 */           sparseArrayCompat.keys[i$iv] = k;
/* 584 */           sparseArrayCompat.values[i$iv] = value$iv;
/* 585 */           int m = sparseArrayCompat.size; sparseArrayCompat.size = m + 1; }  i++;
/*     */       }  }
/*     */     else { return; }
/* 588 */      } @Nullable public static final <E> E commonPutIfAbsent(@NotNull SparseArrayCompat<?> $this$commonPutIfAbsent, int key, Object value) { Intrinsics.checkNotNullParameter($this$commonPutIfAbsent, "<this>"); int $i$f$commonPutIfAbsent = 0; Object mapValue = commonGet($this$commonPutIfAbsent, key); if (mapValue == null) { SparseArrayCompat<?> $this$commonPut$iv = $this$commonPutIfAbsent; int $i$f$commonPut = 0; int i$iv = ContainerHelpersKt.binarySearch($this$commonPut$iv.keys, $this$commonPut$iv.size, key);
/* 589 */       if (i$iv >= 0) {
/* 590 */         $this$commonPut$iv.values[i$iv] = value;
/*     */       } else {
/* 592 */         i$iv ^= 0xFFFFFFFF;
/* 593 */         if (i$iv < $this$commonPut$iv.size && $this$commonPut$iv.values[i$iv] == access$getDELETED$p()) {
/* 594 */           $this$commonPut$iv.keys[i$iv] = key;
/* 595 */           $this$commonPut$iv.values[i$iv] = value;
/*     */         } else {
/*     */           
/* 598 */           if ($this$commonPut$iv.garbage && $this$commonPut$iv.size >= $this$commonPut$iv.keys.length) {
/* 599 */             access$gc($this$commonPut$iv);
/*     */ 
/*     */             
/* 602 */             i$iv = ContainerHelpersKt.binarySearch($this$commonPut$iv.keys, $this$commonPut$iv.size, key) ^ 0xFFFFFFFF;
/*     */           } 
/* 604 */           if ($this$commonPut$iv.size >= $this$commonPut$iv.keys.length) {
/* 605 */             int n$iv = ContainerHelpersKt.idealIntArraySize($this$commonPut$iv.size + 1);
/* 606 */             Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonPut$iv.keys, n$iv), "copyOf(this, newSize)"); $this$commonPut$iv.keys = Arrays.copyOf($this$commonPut$iv.keys, n$iv);
/* 607 */             Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonPut$iv.values, n$iv), "copyOf(this, newSize)"); $this$commonPut$iv.values = Arrays.copyOf($this$commonPut$iv.values, n$iv);
/*     */           } 
/* 609 */           if ($this$commonPut$iv.size - i$iv != 0) {
/* 610 */             ArraysKt.copyInto($this$commonPut$iv.keys, 
/* 611 */                 $this$commonPut$iv.keys, 
/* 612 */                 i$iv + 1, 
/* 613 */                 i$iv, 
/* 614 */                 $this$commonPut$iv.size);
/*     */             
/* 616 */             ArraysKt.copyInto($this$commonPut$iv.values, 
/* 617 */                 $this$commonPut$iv.values, 
/* 618 */                 i$iv + 1, 
/* 619 */                 i$iv, 
/* 620 */                 $this$commonPut$iv.size);
/*     */           } 
/*     */           
/* 623 */           $this$commonPut$iv.keys[i$iv] = key;
/* 624 */           $this$commonPut$iv.values[i$iv] = value;
/* 625 */           int i = $this$commonPut$iv.size; $this$commonPut$iv.size = i + 1;
/*     */         } 
/*     */         return (E)mapValue;
/*     */       }  }
/*     */     else
/*     */     { return (E)mapValue; }
/*     */      }
/*     */ 
/*     */   
/*     */   public static final <E> int commonSize(@NotNull SparseArrayCompat $this$commonSize) {
/*     */     Intrinsics.checkNotNullParameter($this$commonSize, "<this>");
/*     */     int $i$f$commonSize = 0;
/*     */     if ($this$commonSize.garbage)
/*     */       access$gc($this$commonSize); 
/*     */     return $this$commonSize.size;
/*     */   }
/*     */   
/*     */   public static final <E> boolean commonIsEmpty(@NotNull SparseArrayCompat $this$commonIsEmpty) {
/*     */     Intrinsics.checkNotNullParameter($this$commonIsEmpty, "<this>");
/*     */     int $i$f$commonIsEmpty = 0;
/*     */     return ($this$commonIsEmpty.size() == 0);
/*     */   }
/*     */   
/*     */   public static final <E> int commonKeyAt(@NotNull SparseArrayCompat $this$commonKeyAt, int index) {
/*     */     Intrinsics.checkNotNullParameter($this$commonKeyAt, "<this>");
/*     */     int $i$f$commonKeyAt = 0;
/*     */     if ($this$commonKeyAt.garbage)
/*     */       access$gc($this$commonKeyAt); 
/*     */     return $this$commonKeyAt.keys[index];
/*     */   }
/*     */   
/*     */   public static final <E> E commonValueAt(@NotNull SparseArrayCompat $this$commonValueAt, int index) {
/*     */     Intrinsics.checkNotNullParameter($this$commonValueAt, "<this>");
/*     */     int $i$f$commonValueAt = 0;
/*     */     if ($this$commonValueAt.garbage)
/*     */       access$gc($this$commonValueAt); 
/*     */     return (E)$this$commonValueAt.values[index];
/*     */   }
/*     */   
/*     */   public static final <E> void commonSetValueAt(@NotNull SparseArrayCompat $this$commonSetValueAt, int index, Object value) {
/*     */     Intrinsics.checkNotNullParameter($this$commonSetValueAt, "<this>");
/*     */     int $i$f$commonSetValueAt = 0;
/*     */     if ($this$commonSetValueAt.garbage)
/*     */       access$gc($this$commonSetValueAt); 
/*     */     $this$commonSetValueAt.values[index] = value;
/*     */   }
/*     */   
/*     */   public static final <E> int commonIndexOfKey(@NotNull SparseArrayCompat $this$commonIndexOfKey, int key) {
/*     */     Intrinsics.checkNotNullParameter($this$commonIndexOfKey, "<this>");
/*     */     int $i$f$commonIndexOfKey = 0;
/*     */     if ($this$commonIndexOfKey.garbage)
/*     */       access$gc($this$commonIndexOfKey); 
/*     */     return ContainerHelpersKt.binarySearch($this$commonIndexOfKey.keys, $this$commonIndexOfKey.size, key);
/*     */   }
/*     */   
/*     */   public static final <E> int commonIndexOfValue(@NotNull SparseArrayCompat $this$commonIndexOfValue, Object value) {
/*     */     Intrinsics.checkNotNullParameter($this$commonIndexOfValue, "<this>");
/*     */     int $i$f$commonIndexOfValue = 0;
/*     */     if ($this$commonIndexOfValue.garbage)
/*     */       access$gc($this$commonIndexOfValue); 
/*     */     for (int i = 0, j = $this$commonIndexOfValue.size; i < j; i++) {
/*     */       if ($this$commonIndexOfValue.values[i] == value)
/*     */         return i; 
/*     */     } 
/*     */     return -1;
/*     */   }
/*     */   
/*     */   public static final <E> boolean commonContainsKey(@NotNull SparseArrayCompat $this$commonContainsKey, int key) {
/*     */     Intrinsics.checkNotNullParameter($this$commonContainsKey, "<this>");
/*     */     int $i$f$commonContainsKey = 0;
/*     */     return ($this$commonContainsKey.indexOfKey(key) >= 0);
/*     */   }
/*     */   
/*     */   public static final <E> boolean commonContainsValue(@NotNull SparseArrayCompat $this$commonContainsValue, Object value) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: iconst_0
/*     */     //   7: istore_2
/*     */     //   8: aload_0
/*     */     //   9: astore_3
/*     */     //   10: iconst_0
/*     */     //   11: istore #4
/*     */     //   13: aload_3
/*     */     //   14: getfield garbage : Z
/*     */     //   17: ifeq -> 24
/*     */     //   20: aload_3
/*     */     //   21: invokestatic access$gc : (Landroidx/collection/SparseArrayCompat;)V
/*     */     //   24: iconst_0
/*     */     //   25: istore #5
/*     */     //   27: aload_3
/*     */     //   28: getfield size : I
/*     */     //   31: istore #6
/*     */     //   33: iload #5
/*     */     //   35: iload #6
/*     */     //   37: if_icmpge -> 62
/*     */     //   40: aload_3
/*     */     //   41: getfield values : [Ljava/lang/Object;
/*     */     //   44: iload #5
/*     */     //   46: aaload
/*     */     //   47: aload_1
/*     */     //   48: if_acmpne -> 56
/*     */     //   51: iload #5
/*     */     //   53: goto -> 63
/*     */     //   56: iinc #5, 1
/*     */     //   59: goto -> 33
/*     */     //   62: iconst_m1
/*     */     //   63: iflt -> 70
/*     */     //   66: iconst_1
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_0
/*     */     //   71: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #477	-> 8
/*     */     //   #628	-> 13
/*     */     //   #629	-> 20
/*     */     //   #631	-> 24
/*     */     //   #632	-> 40
/*     */     //   #633	-> 51
/*     */     //   #631	-> 56
/*     */     //   #636	-> 62
/*     */     //   #477	-> 63
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   27	35	5	i$iv	I
/*     */     //   13	50	4	$i$f$commonIndexOfValue	I
/*     */     //   10	53	3	$this$commonIndexOfValue$iv	Landroidx/collection/SparseArrayCompat;
/*     */     //   8	64	2	$i$f$commonContainsValue	I
/*     */     //   0	72	0	$this$commonContainsValue	Landroidx/collection/SparseArrayCompat;
/*     */     //   0	72	1	value	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public static final <E> void commonClear(@NotNull SparseArrayCompat $this$commonClear) {
/*     */     Intrinsics.checkNotNullParameter($this$commonClear, "<this>");
/*     */     int $i$f$commonClear = 0, n = $this$commonClear.size;
/*     */     Object[] values = $this$commonClear.values;
/*     */     for (int i = 0; i < n; i++)
/*     */       values[i] = null; 
/*     */     $this$commonClear.size = 0;
/*     */     $this$commonClear.garbage = false;
/*     */   }
/*     */   
/*     */   public static final <E> void commonAppend(@NotNull SparseArrayCompat<Object> $this$commonAppend, int key, Object value) {
/*     */     Intrinsics.checkNotNullParameter($this$commonAppend, "<this>");
/*     */     int $i$f$commonAppend = 0;
/*     */     if ($this$commonAppend.size != 0 && key <= $this$commonAppend.keys[$this$commonAppend.size - 1]) {
/*     */       $this$commonAppend.put(key, value);
/*     */       return;
/*     */     } 
/*     */     if ($this$commonAppend.garbage && $this$commonAppend.size >= $this$commonAppend.keys.length)
/*     */       access$gc($this$commonAppend); 
/*     */     int pos = $this$commonAppend.size;
/*     */     if (pos >= $this$commonAppend.keys.length) {
/*     */       int n = ContainerHelpersKt.idealIntArraySize(pos + 1);
/*     */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonAppend.keys, n), "copyOf(this, newSize)");
/*     */       $this$commonAppend.keys = Arrays.copyOf($this$commonAppend.keys, n);
/*     */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonAppend.values, n), "copyOf(this, newSize)");
/*     */       $this$commonAppend.values = Arrays.copyOf($this$commonAppend.values, n);
/*     */     } 
/*     */     $this$commonAppend.keys[pos] = key;
/*     */     $this$commonAppend.values[pos] = value;
/*     */     $this$commonAppend.size = pos + 1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <E> String commonToString(@NotNull SparseArrayCompat $this$commonToString) {
/*     */     Intrinsics.checkNotNullParameter($this$commonToString, "<this>");
/*     */     int $i$f$commonToString = 0;
/*     */     if ($this$commonToString.size() <= 0)
/*     */       return "{}"; 
/*     */     StringBuilder buffer = new StringBuilder($this$commonToString.size * 28);
/*     */     buffer.append('{');
/*     */     for (int i = 0, j = $this$commonToString.size; i < j; i++) {
/*     */       if (i > 0)
/*     */         buffer.append(", "); 
/*     */       int key = $this$commonToString.keyAt(i);
/*     */       buffer.append(key);
/*     */       buffer.append('=');
/*     */       Object value = $this$commonToString.valueAt(i);
/*     */       if (value != $this$commonToString) {
/*     */         buffer.append(value);
/*     */       } else {
/*     */         buffer.append("(this Map)");
/*     */       } 
/*     */     } 
/*     */     buffer.append('}');
/*     */     Intrinsics.checkNotNullExpressionValue(buffer.toString(), "buffer.toString()");
/*     */     return buffer.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\SparseArrayCompatKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */