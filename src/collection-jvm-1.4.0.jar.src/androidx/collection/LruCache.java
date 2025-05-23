/*     */ package androidx.collection;
/*     */ 
/*     */ import androidx.annotation.IntRange;
/*     */ import androidx.collection.internal.Lock;
/*     */ import androidx.collection.internal.LruHashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\002\n\000\n\002\020\013\n\002\b\016\n\002\020%\n\000\n\002\020\016\n\002\b\002\b\026\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\0020\002B\017\022\b\b\001\020\004\032\0020\005¢\006\002\020\006J\027\020\021\032\004\030\0018\0012\006\020\022\032\0028\000H\024¢\006\002\020\023J\006\020\007\032\0020\005J/\020\024\032\0020\0252\006\020\026\032\0020\0272\006\020\022\032\0028\0002\006\020\030\032\0028\0012\b\020\031\032\004\030\0018\001H\024¢\006\002\020\032J\006\020\033\032\0020\025J\006\020\b\032\0020\005J\030\020\034\032\004\030\0018\0012\006\020\022\032\0028\000H\002¢\006\002\020\023J\006\020\t\032\0020\005J\006\020\004\032\0020\005J\006\020\016\032\0020\005J\035\020\035\032\004\030\0018\0012\006\020\022\032\0028\0002\006\020\036\032\0028\001¢\006\002\020\037J\006\020\017\032\0020\005J\025\020 \032\004\030\0018\0012\006\020\022\032\0028\000¢\006\002\020\023J\022\020!\032\0020\0252\b\b\001\020\004\032\0020\005H\026J\035\020\"\032\0020\0052\006\020\022\032\0028\0002\006\020\036\032\0028\001H\002¢\006\002\020#J\006\020\020\032\0020\005J\035\020$\032\0020\0052\006\020\022\032\0028\0002\006\020\036\032\0028\001H\024¢\006\002\020#J\022\020%\032\016\022\004\022\0028\000\022\004\022\0028\0010&J\b\020'\032\0020(H\026J\020\020)\032\0020\0252\006\020\004\032\0020\005H\026R\016\020\007\032\0020\005X\016¢\006\002\n\000R\016\020\b\032\0020\005X\016¢\006\002\n\000R\016\020\t\032\0020\005X\016¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\032\020\f\032\016\022\004\022\0028\000\022\004\022\0028\0010\rX\004¢\006\002\n\000R\016\020\004\032\0020\005X\016¢\006\002\n\000R\016\020\016\032\0020\005X\016¢\006\002\n\000R\016\020\017\032\0020\005X\016¢\006\002\n\000R\016\020\020\032\0020\005X\016¢\006\002\n\000¨\006*"}, d2 = {"Landroidx/collection/LruCache;", "K", "", "V", "maxSize", "", "(I)V", "createCount", "evictionCount", "hitCount", "lock", "Landroidx/collection/internal/Lock;", "map", "Landroidx/collection/internal/LruHashMap;", "missCount", "putCount", "size", "create", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "evictAll", "get", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "resize", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "sizeOf", "snapshot", "", "toString", "", "trimToSize", "collection"})
/*     */ @SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 4 Lock.jvm.kt\nandroidx/collection/internal/Lock\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,355:1\n1#2:356\n23#3,3:357\n23#3,3:361\n23#3,3:365\n23#3,3:369\n23#3,3:373\n23#3,3:377\n23#3,3:381\n23#3,3:385\n23#3,3:389\n23#3,3:393\n23#3,3:397\n23#3,3:401\n23#3,3:405\n23#3,3:409\n23#3,3:415\n26#4:360\n26#4:364\n26#4:368\n26#4:372\n26#4:376\n26#4:380\n26#4:384\n26#4:388\n26#4:392\n26#4:396\n26#4:400\n26#4:404\n26#4:408\n26#4:412\n26#4:418\n1855#5,2:413\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n*L\n65#1:357,3\n78#1:361,3\n95#1:365,3\n122#1:369,3\n151#1:373,3\n180#1:377,3\n255#1:381,3\n262#1:385,3\n268#1:389,3\n274#1:393,3\n279#1:397,3\n284#1:401,3\n289#1:405,3\n299#1:409,3\n308#1:415,3\n65#1:360\n78#1:364\n95#1:368\n122#1:372\n151#1:376\n180#1:380\n255#1:384\n262#1:388\n268#1:392\n274#1:396\n279#1:400\n284#1:404\n289#1:408\n299#1:412\n308#1:418\n300#1:413,2\n*E\n"})
/*     */ public class LruCache<K, V>
/*     */ {
/*     */   private int maxSize;
/*     */   @NotNull
/*     */   private final LruHashMap<K, V> map;
/*     */   @NotNull
/*     */   private final Lock lock;
/*     */   private int size;
/*     */   private int putCount;
/*     */   private int createCount;
/*     */   private int evictionCount;
/*     */   private int hitCount;
/*     */   private int missCount;
/*     */   
/*     */   public LruCache(@IntRange(from = 1L, to = 9223372036854775807L) int maxSize) {
/*  37 */     this.maxSize = maxSize;
/*     */ 
/*     */     
/*  40 */     if (!((this.maxSize > 0) ? 1 : 0))
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 356 */       int $i$a$-require-LruCache$1 = 0; String str = "maxSize <= 0"; throw new IllegalArgumentException(str.toString()); }  this.map = new LruHashMap(0, 0.75F); this.lock = new Lock(); } public void resize(@IntRange(from = 1L, to = 9223372036854775807L) int maxSize) { if (!((maxSize > 0) ? 1 : 0)) { int $i$a$-require-LruCache$resize$1 = 0; String str = "maxSize <= 0"; throw new IllegalArgumentException(str.toString()); }
/*     */      Lock $this$synchronized$iv = this.lock;
/*     */     int $i$f$synchronized = 0;
/* 359 */     Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 360 */     synchronized (this_$iv$iv) { int $i$a$-synchronized-LruCache$resize$2 = 0; this.maxSize = maxSize; Unit unit = Unit.INSTANCE; }
/*     */      trimToSize(maxSize); } @Nullable public final V get(@NotNull Object key) { Object createdValue; Intrinsics.checkNotNullParameter(key, "key"); Object mapValue = null; Lock $this$synchronized$iv = this.lock;
/*     */     int $i$f$synchronized = 0;
/* 363 */     Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 364 */     synchronized (this_$iv$iv) { int $i$a$-synchronized-LruCache$get$1 = 0; mapValue = this.map.get(key); if (mapValue != null) { int n = this.hitCount; this.hitCount = n + 1; return (V)mapValue; }  int k = this.missCount; this.missCount = k + 1; int m = k; }
/*     */      if (create((K)key) == null) {
/*     */       create((K)key); return null;
/* 367 */     }  Lock lock1 = this.lock; int i = 0; Lock lock2 = lock1; int j = 0;
/* 368 */     synchronized (lock2) { int $i$a$-synchronized-LruCache$get$2 = 0; int k = this.createCount; this.createCount = k + 1; mapValue = this.map.put(key, createdValue); this.size += safeSizeOf((K)key, (V)createdValue); Object object = (mapValue != null) ? this.map.put(key, mapValue) : Unit.INSTANCE; }
/*     */      entryRemoved(false, (K)key, (V)createdValue, (V)mapValue); trimToSize(this.maxSize); return (mapValue != null) ? (V)mapValue : (V)createdValue; } @Nullable public final V put(@NotNull Object key, @NotNull Object value) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); Object previous = null; Lock $this$synchronized$iv = this.lock;
/*     */     int $i$f$synchronized = 0;
/* 371 */     Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 372 */     synchronized (this_$iv$iv) { int $i$a$-synchronized-LruCache$put$1 = 0; int i = this.putCount; this.putCount = i + 1; this.size += safeSizeOf((K)key, (V)value); previous = this.map.put(key, value); if (previous != null) this.size -= safeSizeOf((K)key, (V)previous);  Unit unit = Unit.INSTANCE; }
/*     */      if (previous != null)
/*     */       entryRemoved(false, (K)key, (V)previous, (V)value);  trimToSize(this.maxSize); return (V)previous; } public void trimToSize(int maxSize) { while (true) {
/* 375 */       Object key = null; Object value = null; Lock $this$synchronized$iv = this.lock; int $i$f$synchronized = 0; Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 376 */       synchronized (this_$iv$iv) { Map.Entry toEvict; int $i$a$-synchronized-LruCache$trimToSize$1 = 0; if (!((this.size >= 0 && (!this.map.isEmpty() || this.size == 0)) ? 1 : 0)) { int $i$a$-check-LruCache$trimToSize$1$1 = 0; String str = "LruCache.sizeOf() is reporting inconsistent results!"; throw new IllegalStateException(str.toString()); }  if (this.size <= maxSize || this.map.isEmpty()) return;  if ((Map.Entry)CollectionsKt.firstOrNull(this.map.getEntries()) == null) { (Map.Entry)CollectionsKt.firstOrNull(this.map.getEntries()); return; }  key = toEvict.getKey(); value = toEvict.getValue(); this.map.remove(key); this.size -= safeSizeOf((K)key, (V)value); int i = this.evictionCount; this.evictionCount = i + 1; int j = i; }
/*     */        entryRemoved(true, (K)key, (V)value, null);
/*     */     }  } @Nullable public final V remove(@NotNull Object key) { Intrinsics.checkNotNullParameter(key, "key"); Object previous = null; Lock $this$synchronized$iv = this.lock; int $i$f$synchronized = 0;
/* 379 */     Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 380 */     synchronized (this_$iv$iv) { int $i$a$-synchronized-LruCache$remove$1 = 0; previous = this.map.remove(key); if (previous != null) this.size -= safeSizeOf((K)key, (V)previous);  Unit unit = Unit.INSTANCE; }  if (previous != null)
/*     */       entryRemoved(false, (K)key, (V)previous, null);  return (V)previous; }
/*     */   protected void entryRemoved(boolean evicted, @NotNull Object key, @NotNull Object oldValue, @Nullable Object newValue) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(oldValue, "oldValue"); }
/* 383 */   @Nullable protected V create(@NotNull Object key) { Intrinsics.checkNotNullParameter(key, "key"); return null; } public final int size() { Lock $this$synchronized$iv = this.lock; int $i$f$synchronized = 0; Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 384 */     synchronized (this_$iv$iv) { int $i$a$-synchronized-LruCache$size$1 = 0; $i$a$-synchronized-LruCache$size$1 = this.size; }  return $i$a$-synchronized-LruCache$size$1; }
/*     */   private final int safeSizeOf(Object key, Object value) { int result = sizeOf((K)key, (V)value); if (!((result >= 0) ? 1 : 0)) { int $i$a$-check-LruCache$safeSizeOf$1 = 0; String str = "Negative size: " + key + '=' + value; throw new IllegalStateException(str.toString()); }  return result; }
/*     */   protected int sizeOf(@NotNull Object key, @NotNull Object value) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); return 1; }
/* 387 */   public final void evictAll() { trimToSize(-1); } public final int maxSize() { Lock $this$synchronized$iv = this.lock; int $i$f$synchronized = 0; Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 388 */     synchronized (this_$iv$iv) { int $i$a$-synchronized-LruCache$maxSize$1 = 0; $i$a$-synchronized-LruCache$maxSize$1 = this.maxSize; }  return $i$a$-synchronized-LruCache$maxSize$1; }
/*     */   public final int hitCount() { Lock $this$synchronized$iv = this.lock;
/*     */     int $i$f$synchronized = 0;
/* 391 */     Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 392 */     synchronized (this_$iv$iv) { int $i$a$-synchronized-LruCache$hitCount$1 = 0; $i$a$-synchronized-LruCache$hitCount$1 = this.hitCount; }  return $i$a$-synchronized-LruCache$hitCount$1; }
/*     */   public final int missCount() { Lock $this$synchronized$iv = this.lock;
/*     */     int $i$f$synchronized = 0;
/* 395 */     Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 396 */     synchronized (this_$iv$iv) { int $i$a$-synchronized-LruCache$missCount$1 = 0; $i$a$-synchronized-LruCache$missCount$1 = this.missCount; }  return $i$a$-synchronized-LruCache$missCount$1; }
/*     */   public final int createCount() { Lock $this$synchronized$iv = this.lock;
/*     */     int $i$f$synchronized = 0;
/* 399 */     Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 400 */     synchronized (this_$iv$iv) { int $i$a$-synchronized-LruCache$createCount$1 = 0; $i$a$-synchronized-LruCache$createCount$1 = this.createCount; }  return $i$a$-synchronized-LruCache$createCount$1; }
/*     */   public final int putCount() { Lock $this$synchronized$iv = this.lock;
/*     */     int $i$f$synchronized = 0;
/* 403 */     Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 404 */     synchronized (this_$iv$iv) { int $i$a$-synchronized-LruCache$putCount$1 = 0; $i$a$-synchronized-LruCache$putCount$1 = this.putCount; }  return $i$a$-synchronized-LruCache$putCount$1; }
/*     */   public final int evictionCount() { Lock $this$synchronized$iv = this.lock;
/*     */     int $i$f$synchronized = 0;
/* 407 */     Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 408 */     synchronized (this_$iv$iv) { int $i$a$-synchronized-LruCache$evictionCount$1 = 0; $i$a$-synchronized-LruCache$evictionCount$1 = this.evictionCount; }  return $i$a$-synchronized-LruCache$evictionCount$1; } @NotNull public final Map<K, V> snapshot() { LinkedHashMap<Object, Object> copy = new LinkedHashMap<>();
/*     */     Lock $this$synchronized$iv = this.lock;
/*     */     int $i$f$synchronized = 0;
/* 411 */     Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 412 */     synchronized (this_$iv$iv) { int $i$a$-synchronized-LruCache$snapshot$1 = 0; Iterable $this$forEach$iv = this.map.getEntries(); int $i$f$forEach = 0;
/* 413 */       Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Map.Entry entry = (Map.Entry)element$iv; int $i$a$-forEach-LruCache$snapshot$1$1 = 0; Object key = entry.getKey(), value = entry.getValue(); copy.put(key, value); }
/*     */        Unit unit = Unit.INSTANCE; }
/*     */      return (Map)copy; } @NotNull public String toString() { Lock $this$synchronized$iv = this.lock;
/*     */     int $i$f$synchronized = 0;
/* 417 */     Lock this_$iv$iv = $this$synchronized$iv; int $i$f$synchronizedImpl = 0;
/* 418 */     synchronized (this_$iv$iv) { int $i$a$-synchronized-LruCache$toString$1 = 0;
/*     */       int accesses = this.hitCount + this.missCount;
/*     */       int hitPercent = (accesses != 0) ? (100 * this.hitCount / accesses) : 0;
/*     */       return "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + hitPercent + "%]"; }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\LruCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */