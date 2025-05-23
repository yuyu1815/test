/*     */ package androidx.compose.ui.text.caches;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.SynchronizationKt;
/*     */ import androidx.compose.ui.text.SynchronizedObject;
/*     */ import java.util.HashMap;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.InlineMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.TypeIntrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\b\n\002\020\002\n\000\n\002\020\013\n\002\b\016\n\002\020$\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\b\020\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003B\017\b\026\022\006\020\004\032\0020\005¢\006\002\020\006J\027\020\027\032\004\030\0018\0012\006\020\030\032\0028\000H\024¢\006\002\020\031J\006\020\007\032\0020\005J/\020\032\032\0020\0332\006\020\034\032\0020\0352\006\020\030\032\0028\0002\006\020\036\032\0028\0012\b\020\037\032\004\030\0018\001H\024¢\006\002\020 J\006\020!\032\0020\033J\006\020\b\032\0020\005J\025\020\"\032\004\030\0018\0012\006\020\030\032\0028\000¢\006\002\020\031J\006\020\t\032\0020\005J\006\020\004\032\0020\005J\006\020\020\032\0020\005J\035\020#\032\004\030\0018\0012\006\020\030\032\0028\0002\006\020$\032\0028\001¢\006\002\020%J\006\020\023\032\0020\005J\025\020&\032\004\030\0018\0012\006\020\030\032\0028\000¢\006\002\020\031J\020\020'\032\0020\0332\006\020\004\032\0020\005H\026J\035\020(\032\0020\0052\006\020\030\032\0028\0002\006\020$\032\0028\001H\002¢\006\002\020)J\035\020*\032\0020\0052\006\020\030\032\0028\0002\006\020$\032\0028\001H\024¢\006\002\020)J\022\020+\032\016\022\004\022\0028\000\022\004\022\0028\0010,J'\020-\032\002H.\"\004\b\002\020.2\f\020/\032\b\022\004\022\002H.00H\bø\001\000¢\006\004\b1\0202J\b\0203\032\00204H\026J\020\0205\032\0020\0332\006\020\004\032\0020\005H\026R\016\020\007\032\0020\005X\016¢\006\002\n\000R\016\020\b\032\0020\005X\016¢\006\002\n\000R\016\020\t\032\0020\005X\016¢\006\002\n\000R\036\020\n\032\022\022\004\022\0028\0000\013j\b\022\004\022\0028\000`\fX\004¢\006\002\n\000R*\020\r\032\036\022\004\022\0028\000\022\004\022\0028\0010\016j\016\022\004\022\0028\000\022\004\022\0028\001`\017X\004¢\006\002\n\000R\016\020\004\032\0020\005X\016¢\006\002\n\000R\016\020\020\032\0020\005X\016¢\006\002\n\000R\016\020\021\032\0020\022X\004¢\006\002\n\000R\016\020\023\032\0020\005X\016¢\006\002\n\000R \020\025\032\0020\0052\006\020\024\032\0020\0058G@BX\016¢\006\b\n\000\032\004\b\025\020\026\002\007\n\005\b20\001¨\0066"}, d2 = {"Landroidx/compose/ui/text/caches/LruCache;", "K", "V", "", "maxSize", "", "(I)V", "createCount", "evictionCount", "hitCount", "keySet", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "map", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "missCount", "monitor", "Landroidx/compose/ui/text/SynchronizedObject;", "putCount", "<set-?>", "size", "()I", "create", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "evictAll", "get", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "resize", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "sizeOf", "snapshot", "", "synchronizedValue", "R", "block", "Lkotlin/Function0;", "synchronizedValue$ui_text", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "toString", "", "trimToSize", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n+ 2 Synchronization.kt\nandroidx/compose/ui/text/SynchronizationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n350#1:354\n350#1:363\n350#1:365\n350#1:367\n350#1:369\n350#1:371\n350#1:373\n33#2:355\n33#2:357\n33#2:358\n33#2:359\n33#2:360\n33#2:361\n33#2:362\n33#2:364\n33#2:366\n33#2:368\n33#2:370\n33#2:372\n33#2:374\n33#2:375\n33#2:376\n33#2:377\n1#3:356\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n*L\n40#1:354\n297#1:363\n303#1:365\n309#1:367\n314#1:369\n319#1:371\n324#1:373\n40#1:355\n71#1:357\n86#1:358\n104#1:359\n142#1:360\n176#1:361\n218#1:362\n297#1:364\n303#1:366\n309#1:368\n314#1:370\n319#1:372\n324#1:374\n331#1:375\n341#1:376\n350#1:377\n*E\n"})
/*     */ public class LruCache<K, V>
/*     */ {
/*     */   @NotNull
/*  28 */   private final SynchronizedObject monitor = SynchronizationKt.createSynchronizedObject(); @NotNull
/*     */   private final HashMap<K, V> map; @NotNull
/*     */   private final LinkedHashSet<K> keySet; private int size;
/*     */   private int maxSize;
/*     */   private int putCount;
/*     */   private int createCount;
/*     */   private int evictionCount;
/*     */   private int hitCount;
/*     */   private int missCount;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @JvmName(name = "size")
/*  40 */   public final int size() { LruCache this_$iv = this; int $i$f$synchronizedValue$ui_text = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 354 */     SynchronizedObject lock$iv$iv = access$getMonitor$p(this_$iv); int $i$f$synchronized = 0;
/* 355 */     synchronized (lock$iv$iv) { int $i$a$-synchronizedValue$ui_text-LruCache$size$1 = 0; return this.size; }
/* 356 */      } public LruCache(int maxSize) { if (!((maxSize > 0) ? 1 : 0)) { int $i$a$-require-LruCache$1 = 0; String str = "maxSize <= 0"; throw new IllegalArgumentException(str.toString()); }  this.maxSize = maxSize; this.map = new HashMap<>(0, 0.75F); this.keySet = new LinkedHashSet<>(); } public void resize(int maxSize) { if (!((maxSize > 0) ? 1 : 0)) { int $i$a$-require-LruCache$resize$1 = 0; String str = "maxSize <= 0"; throw new IllegalArgumentException(str.toString()); }
/* 357 */      SynchronizedObject lock$iv = this.monitor; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-LruCache$resize$2 = 0; this.maxSize = maxSize; Unit unit = Unit.INSTANCE; }
/* 358 */      trimToSize(maxSize); } @Nullable public final V get(Object key) { Object mapValue = null; SynchronizedObject lock$iv = this.monitor; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-LruCache$get$1 = 0; mapValue = this.map.get(key); if (mapValue != null) { this.keySet.remove(key); this.keySet.add((K)key); int m = this.hitCount; this.hitCount = m + 1; return (V)mapValue; }  int j = this.missCount; this.missCount = j + 1; int k = j; }  Object createdValue = create((K)key); if (createdValue == null)
/* 359 */       return null;  SynchronizedObject synchronizedObject1 = this.monitor; int i = 0; synchronized (synchronizedObject1) { int $i$a$-synchronized-LruCache$get$2 = 0; int j = this.createCount; this.createCount = j + 1; Object previousValue = this.map.put((K)key, (V)createdValue); this.keySet.remove(key); this.keySet.add((K)key); if (previousValue != null) { this.map.put((K)key, (V)previousValue); mapValue = previousValue; } else { this.size = size() + safeSizeOf((K)key, (V)createdValue); }  Unit unit = Unit.INSTANCE; }  if (mapValue != null) { entryRemoved(false, (K)key, (V)createdValue, (V)mapValue); return (V)mapValue; }  trimToSize(this.maxSize); return (V)createdValue; } @Nullable public final V put(Object key, Object value) { if (key == null || value == null)
/* 360 */       throw new NullPointerException();  Object previous = null; SynchronizedObject lock$iv = this.monitor; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-LruCache$put$1 = 0; int i = this.putCount; this.putCount = i + 1; this.size = size() + safeSizeOf((K)key, (V)value); previous = this.map.put((K)key, (V)value); if (previous != null) this.size = size() - safeSizeOf((K)key, (V)previous);  if (this.keySet.contains(key)) this.keySet.remove(key);  boolean bool = this.keySet.add((K)key); }  if (previous != null)
/* 361 */       entryRemoved(false, (K)key, (V)previous, (V)value);  trimToSize(this.maxSize); return (V)previous; } public void trimToSize(int maxSize) { while (true) { Object key = null; Object value = null; SynchronizedObject lock$iv = this.monitor; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-LruCache$trimToSize$1 = 0; if (size() < 0 || (this.map.isEmpty() && size() != 0) || this.map.isEmpty() != this.keySet.isEmpty()) throw new IllegalStateException("map/keySet size inconsistency");  if (size() > maxSize && !this.map.isEmpty()) { key = CollectionsKt.first(this.keySet); if (this.map.get(key) == null) { this.map.get(key); throw new IllegalStateException("inconsistent state"); }  HashMap<K, V> hashMap = this.map; Object object = key; TypeIntrinsics.asMutableMap(hashMap).remove(object); LinkedHashSet<K> linkedHashSet = this.keySet; object = key; TypeIntrinsics.asMutableCollection(linkedHashSet).remove(object); Intrinsics.checkNotNull(key); Intrinsics.checkNotNull(value); this.size = size() - safeSizeOf((K)key, (V)value); int i = this.evictionCount; this.evictionCount = i + 1; }  Unit unit = Unit.INSTANCE; }  if (key == null && value == null) break;  Intrinsics.checkNotNull(key); Intrinsics.checkNotNull(value); entryRemoved(true, (K)key, (V)value, null); }  } @Nullable public final V remove(Object key) { if (key == null)
/* 362 */       throw new NullPointerException();  Object previous = null; SynchronizedObject lock$iv = this.monitor; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-LruCache$remove$1 = 0; previous = this.map.remove(key); this.keySet.remove(key); if (previous != null) this.size = size() - safeSizeOf((K)key, (V)previous);  Unit unit = Unit.INSTANCE; }  if (previous != null) entryRemoved(false, (K)key, (V)previous, null);  return (V)previous; }
/* 363 */   protected void entryRemoved(boolean evicted, Object key, Object oldValue, @Nullable Object newValue) {} @Nullable protected V create(Object key) { return null; } public final int maxSize() { LruCache this_$iv = this; int $i$f$synchronizedValue$ui_text = 0; SynchronizedObject lock$iv$iv = access$getMonitor$p(this_$iv); int $i$f$synchronized = 0;
/* 364 */     synchronized (lock$iv$iv) { int $i$a$-synchronizedValue$ui_text-LruCache$maxSize$1 = 0; $i$a$-synchronizedValue$ui_text-LruCache$maxSize$1 = this.maxSize; }  return $i$a$-synchronizedValue$ui_text-LruCache$maxSize$1; }
/* 365 */   private final int safeSizeOf(Object key, Object value) { int result = sizeOf((K)key, (V)value); if (!((result >= 0) ? 1 : 0)) { int $i$a$-check-LruCache$safeSizeOf$1 = 0; String str = "Negative size: " + key + '=' + value; throw new IllegalStateException(str.toString()); }  return result; } protected int sizeOf(Object key, Object value) { return 1; } public final void evictAll() { trimToSize(-1); } public final int hitCount() { LruCache this_$iv = this; int $i$f$synchronizedValue$ui_text = 0; SynchronizedObject lock$iv$iv = access$getMonitor$p(this_$iv); int $i$f$synchronized = 0;
/* 366 */     synchronized (lock$iv$iv) { int $i$a$-synchronizedValue$ui_text-LruCache$hitCount$1 = 0; $i$a$-synchronizedValue$ui_text-LruCache$hitCount$1 = this.hitCount; }  return $i$a$-synchronizedValue$ui_text-LruCache$hitCount$1; } public final int missCount() { LruCache this_$iv = this; int $i$f$synchronizedValue$ui_text = 0;
/* 367 */     SynchronizedObject lock$iv$iv = access$getMonitor$p(this_$iv); int $i$f$synchronized = 0;
/* 368 */     synchronized (lock$iv$iv) { int $i$a$-synchronizedValue$ui_text-LruCache$missCount$1 = 0; $i$a$-synchronizedValue$ui_text-LruCache$missCount$1 = this.missCount; }  return $i$a$-synchronizedValue$ui_text-LruCache$missCount$1; } public final int createCount() { LruCache this_$iv = this; int $i$f$synchronizedValue$ui_text = 0;
/* 369 */     SynchronizedObject lock$iv$iv = access$getMonitor$p(this_$iv); int $i$f$synchronized = 0;
/* 370 */     synchronized (lock$iv$iv) { int $i$a$-synchronizedValue$ui_text-LruCache$createCount$1 = 0; $i$a$-synchronizedValue$ui_text-LruCache$createCount$1 = this.createCount; }  return $i$a$-synchronizedValue$ui_text-LruCache$createCount$1; } public final int putCount() { LruCache this_$iv = this; int $i$f$synchronizedValue$ui_text = 0;
/* 371 */     SynchronizedObject lock$iv$iv = access$getMonitor$p(this_$iv); int $i$f$synchronized = 0;
/* 372 */     synchronized (lock$iv$iv) { int $i$a$-synchronizedValue$ui_text-LruCache$putCount$1 = 0; $i$a$-synchronizedValue$ui_text-LruCache$putCount$1 = this.putCount; }  return $i$a$-synchronizedValue$ui_text-LruCache$putCount$1; } public final int evictionCount() { LruCache this_$iv = this; int $i$f$synchronizedValue$ui_text = 0;
/* 373 */     SynchronizedObject lock$iv$iv = access$getMonitor$p(this_$iv); int $i$f$synchronized = 0;
/* 374 */     synchronized (lock$iv$iv) { int $i$a$-synchronizedValue$ui_text-LruCache$evictionCount$1 = 0; $i$a$-synchronizedValue$ui_text-LruCache$evictionCount$1 = this.evictionCount; }  return $i$a$-synchronizedValue$ui_text-LruCache$evictionCount$1; } @NotNull public final Map<K, V> snapshot() { SynchronizedObject lock$iv = this.monitor; int $i$f$synchronized = 0;
/* 375 */     synchronized (lock$iv) { int $i$a$-synchronized-LruCache$snapshot$1 = 0; LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>(); for (K key : this.keySet) { Intrinsics.checkNotNull(this.map.get(key)); linkedHashMap.put(key, this.map.get(key)); }  return (Map)linkedHashMap; }
/* 376 */      } @NotNull public String toString() { SynchronizedObject lock$iv = this.monitor; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-LruCache$toString$1 = 0; int accesses = this.hitCount + this.missCount; int hitPercent = (accesses != 0) ? (100 * this.hitCount / accesses) : 0; return "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + hitPercent + "%]"; }
/* 377 */      } public final <R> R synchronizedValue$ui_text(@NotNull Function0 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$synchronizedValue$ui_text = 0; SynchronizedObject lock$iv = access$getMonitor$p(this); int $i$f$synchronized = 0; SynchronizedObject synchronizedObject1 = lock$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/ui/text/SynchronizedObject}, name=null} */ try { Object object = block.invoke(); } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/ui/text/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }  return (R)object; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\caches\LruCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */