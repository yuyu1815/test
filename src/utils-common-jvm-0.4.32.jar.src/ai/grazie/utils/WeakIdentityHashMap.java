/*     */ package ai.grazie.utils;
/*     */ 
/*     */ import java.lang.ref.ReferenceQueue;
/*     */ import java.lang.ref.WeakReference;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.markers.KMutableMap;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\b\002\n\002\020%\n\002\b\002\n\002\030\002\n\000\n\002\020#\n\002\020'\n\002\b\005\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\037\n\002\b\003\n\002\020\002\n\000\n\002\020\013\n\002\b\006\n\002\020\000\n\002\b\b\n\002\020$\n\002\b\004\030\000*\004\b\000\020\001*\004\b\001\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\003:\001.B\005¢\006\002\020\004J\b\020\030\032\0020\031H\026J\025\020\032\032\0020\0332\006\020\034\032\0028\000H\026¢\006\002\020\035J\025\020\036\032\0020\0332\006\020\037\032\0028\001H\026¢\006\002\020\035J\023\020 \032\0020\0332\b\020!\032\004\030\0010\"H\002J\030\020#\032\004\030\0018\0012\006\020\034\032\0028\000H\002¢\006\002\020$J\b\020%\032\0020\021H\026J\b\020&\032\0020\033H\026J\037\020'\032\004\030\0018\0012\006\020\034\032\0028\0002\006\020\037\032\0028\001H\026¢\006\002\020(J\036\020)\032\0020\0312\024\020*\032\020\022\006\b\001\022\0028\000\022\004\022\0028\0010+H\026J\b\020,\032\0020\031H\002J\027\020-\032\004\030\0018\0012\006\020\034\032\0028\000H\026¢\006\002\020$R*\020\005\032\036\022\024\022\0220\006R\016\022\004\022\0028\000\022\004\022\0028\0010\000\022\004\022\0028\0010\003X\004¢\006\002\n\000R&\020\007\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\t0\b8VX\004¢\006\006\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0028\0000\b8VX\004¢\006\006\032\004\b\r\020\013R\024\020\016\032\b\022\004\022\0028\0000\017X\004¢\006\002\n\000R\024\020\020\032\0020\0218VX\004¢\006\006\032\004\b\022\020\023R\032\020\024\032\b\022\004\022\0028\0010\0258VX\004¢\006\006\032\004\b\026\020\027¨\006/"}, d2 = {"Lai/grazie/utils/WeakIdentityHashMap;", "K", "V", "", "()V", "backingStore", "Lai/grazie/utils/WeakIdentityHashMap$IdentityWeakReference;", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "queue", "Ljava/lang/ref/ReferenceQueue;", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", "o", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "isEmpty", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "reap", "remove", "IdentityWeakReference", "utils-common"})
/*     */ public final class WeakIdentityHashMap<K, V>
/*     */   implements Map<K, V>, KMutableMap
/*     */ {
/*     */   @NotNull
/*  37 */   private final ReferenceQueue<K> queue = new ReferenceQueue<>(); @NotNull
/*  38 */   private final Map<IdentityWeakReference, V> backingStore = new HashMap<>();
/*     */   public void clear() {
/*  40 */     this.backingStore.clear();
/*  41 */     reap();
/*     */   }
/*     */   
/*     */   public boolean containsKey(Object key) {
/*  45 */     reap();
/*  46 */     return this.backingStore.containsKey(new IdentityWeakReference((K)key));
/*     */   }
/*     */   
/*     */   public boolean containsValue(Object value) {
/*  50 */     reap();
/*  51 */     return this.backingStore.containsValue(value);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Set<Map.Entry<K, V>> getEntries()
/*     */   {
/*  57 */     reap();
/*  58 */     Set<WeakIdentityHashMap$entries$entry$1> ret = new HashSet();
/*  59 */     for (Map.Entry<IdentityWeakReference, V> entry1 : this.backingStore.entrySet()) { IdentityWeakReference key1 = (IdentityWeakReference)entry1.getKey(); Object value1 = entry1.getValue();
/*  60 */       Intrinsics.checkNotNull(key1.get()); Object key = key1.get();
/*  61 */       WeakIdentityHashMap$entries$entry$1 entry = new WeakIdentityHashMap$entries$entry$1((K)key, (V)value1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  70 */       ret.add(entry); }
/*     */ 
/*     */     
/*  73 */     return (Set)ret;
/*     */   }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\r\n\000\n\002\020'\n\002\b\f*\001\000\b\n\030\0002\016\022\004\022\0028\000\022\004\022\0028\0010\001J\025\020\n\032\0028\0012\006\020\013\032\0028\001H\026¢\006\002\020\fR\034\020\002\032\0028\000X\016¢\006\020\n\002\020\007\032\004\b\003\020\004\"\004\b\005\020\006R\034\020\b\032\0028\001X\016¢\006\020\n\002\020\007\032\004\b\t\020\004\"\004\b\n\020\006¨\006\r"}, d2 = {"ai/grazie/utils/WeakIdentityHashMap$entries$entry$1", "", "key", "getKey", "()Ljava/lang/Object;", "setKey", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "value", "getValue", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "utils-common"}) public static final class WeakIdentityHashMap$entries$entry$1 implements Map.Entry<K, V>, KMutableMap.Entry {
/*     */     private K key;
/*     */     private V value;
/*  78 */     WeakIdentityHashMap$entries$entry$1(Object $key, Object $value1) { this.key = (K)$key; this.value = (V)$value1; } public K getKey() { return this.key; } public void setKey(Object <set-?>) { this.key = (K)<set-?>; } public V getValue() { return this.value; } public void setValue(Object <set-?>) { this.value = (V)<set-?>; } public V setValue(Object newValue) { setValue((V)newValue); return (V)newValue; } } @NotNull public Set<K> getKeys() { reap();
/*  79 */     Set<K> ret = new HashSet();
/*  80 */     for (IdentityWeakReference ref : this.backingStore.keySet()) {
/*  81 */       Intrinsics.checkNotNull(ref.get()); ret.add(ref.get());
/*     */     } 
/*     */     
/*  84 */     return ret; }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object o) {
/*  88 */     return !(o instanceof WeakIdentityHashMap) ? false : 
/*     */       
/*  90 */       Intrinsics.areEqual(this.backingStore, ((WeakIdentityHashMap)o).backingStore);
/*     */   }
/*     */   @Nullable
/*     */   public V get(Object key) {
/*  94 */     reap();
/*  95 */     return this.backingStore.get(new IdentityWeakReference((K)key));
/*     */   }
/*     */   @Nullable
/*     */   public V put(Object key, Object value) {
/*  99 */     reap();
/* 100 */     return this.backingStore.put(new IdentityWeakReference((K)key), (V)value);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 104 */     reap();
/* 105 */     return this.backingStore.hashCode();
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/* 109 */     reap();
/* 110 */     return this.backingStore.isEmpty();
/*     */   }
/*     */   
/*     */   public void putAll(@NotNull Map from) {
/* 114 */     Intrinsics.checkNotNullParameter(from, "from"); throw new UnsupportedOperationException();
/*     */   }
/*     */   @Nullable
/*     */   public V remove(Object key) {
/* 118 */     reap();
/* 119 */     return this.backingStore.remove(new IdentityWeakReference((K)key));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getSize() {
/* 124 */     reap();
/* 125 */     return this.backingStore.size();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Collection<V> getValues() {
/* 130 */     reap();
/* 131 */     return this.backingStore.values();
/*     */   }
/*     */ 
/*     */   
/*     */   private final synchronized void reap() {
/* 136 */     Object<? extends K> zombie = (Object<? extends K>)this.queue.poll();
/* 137 */     while (zombie != null) {
/* 138 */       IdentityWeakReference victim = (IdentityWeakReference)zombie;
/* 139 */       this.backingStore.remove(victim);
/* 140 */       zombie = (Object<? extends K>)this.queue.poll();
/*     */     } 
/*     */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\002\b\002\b\004\030\0002\b\022\004\022\0028\0000\001B\r\022\006\020\002\032\0028\000¢\006\002\020\003J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rH\002J\b\020\016\032\0020\005H\026R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\t¨\006\017"}, d2 = {"Lai/grazie/utils/WeakIdentityHashMap$IdentityWeakReference;", "Ljava/lang/ref/WeakReference;", "obj", "(Lai/grazie/utils/WeakIdentityHashMap;Ljava/lang/Object;)V", "hash", "", "getHash", "()I", "setHash", "(I)V", "equals", "", "other", "", "hashCode", "utils-common"})
/*     */   public final class IdentityWeakReference extends WeakReference<K> { private int hash;
/* 144 */     public IdentityWeakReference(Object obj) { super((K)obj, WeakIdentityHashMap.this.queue);
/*     */ 
/*     */ 
/*     */       
/* 148 */       this.hash = System.identityHashCode(obj); } public final int getHash() { return this.hash; } public final void setHash(int <set-?>) {
/*     */       this.hash = <set-?>;
/*     */     }
/*     */     public int hashCode() {
/* 152 */       return this.hash;
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/* 156 */       if (this == other) {
/* 157 */         return true;
/*     */       }
/* 159 */       if (!(other instanceof IdentityWeakReference)) {
/* 160 */         return false;
/*     */       }
/* 162 */       return (get() == ((IdentityWeakReference)other).get());
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\WeakIdentityHashMap.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */