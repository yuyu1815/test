/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020#\n\002\020'\n\002\b\003\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\b\n\002\b\003\n\002\020\037\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\002\b\n\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J\024\020\"\032\016\022\004\022\0028\000\022\004\022\0028\0010#H\026J\b\020$\032\0020%H\026J\025\020&\032\0020'2\006\020(\032\0028\000H\026¢\006\002\020)J\030\020*\032\004\030\0018\0012\006\020(\032\0028\000H\002¢\006\002\020+J\037\020,\032\004\030\0018\0012\006\020(\032\0028\0002\006\020-\032\0028\001H\026¢\006\002\020.J\027\020/\032\004\030\0018\0012\006\020(\032\0028\000H\026¢\006\002\020+J\033\020/\032\0020'2\006\020(\032\0028\0002\006\020-\032\0028\001¢\006\002\0200R&\020\b\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\n0\t8VX\004¢\006\006\032\004\b\013\020\fR\"\020\017\032\004\030\0010\0162\b\020\r\032\004\030\0010\016@BX\016¢\006\b\n\000\032\004\b\020\020\021R&\020\022\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0240\023X\004¢\006\b\n\000\032\004\b\025\020\026R\032\020\027\032\b\022\004\022\0028\0000\t8VX\004¢\006\006\032\004\b\030\020\fR\020\020\031\032\004\030\0010\016X\016¢\006\002\n\000R\032\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\016¢\006\002\n\000R\024\020\032\032\0020\0338VX\004¢\006\006\032\004\b\034\020\035R\032\020\036\032\b\022\004\022\0028\0010\0378VX\004¢\006\006\032\004\b \020!¨\0061"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "K", "V", "Lkotlin/collections/AbstractMutableMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "<set-?>", "", "firstKey", "getFirstKey$runtime", "()Ljava/lang/Object;", "hashMapBuilder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "getHashMapBuilder$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "keys", "getKeys", "lastKey", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "build", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class PersistentOrderedMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {
/*     */   @NotNull
/*     */   private PersistentOrderedMap<K, V> map;
/*     */   @Nullable
/*     */   private Object firstKey;
/*     */   
/*  12 */   public PersistentOrderedMapBuilder(@NotNull PersistentOrderedMap<K, V> map) { this.map = map;
/*  13 */     this.firstKey = this.map.getFirstKey$runtime();
/*     */ 
/*     */     
/*  16 */     this.lastKey = this.map.getLastKey$runtime();
/*     */     
/*  18 */     this.hashMapBuilder = this.map.getHashMap$runtime().builder(); } @Nullable private Object lastKey; @NotNull private final PersistentHashMapBuilder<K, LinkedValue<V>> hashMapBuilder; public static final int $stable = 8; @Nullable public final Object getFirstKey$runtime() { return this.firstKey; } @NotNull public final PersistentHashMapBuilder<K, LinkedValue<V>> getHashMapBuilder$runtime() { return this.hashMapBuilder; }
/*     */    public int getSize() {
/*  20 */     return this.hashMapBuilder.size();
/*     */   } @NotNull
/*     */   public PersistentMap<K, V> build() {
/*  23 */     PersistentHashMap<K, LinkedValue<V>> newHashMap = this.hashMapBuilder.build();
/*     */     
/*  25 */     CommonFunctionsKt.assert((this.firstKey == this.map.getFirstKey$runtime()));
/*  26 */     CommonFunctionsKt.assert((this.lastKey == this.map.getLastKey$runtime()));
/*  27 */     this.map = (newHashMap == this.map.getHashMap$runtime()) ? this.map : 
/*     */       
/*  29 */       new PersistentOrderedMap<>(this.firstKey, this.lastKey, newHashMap);
/*     */     
/*  31 */     return this.map;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Set<Map.Entry<K, V>> getEntries() {
/*  36 */     return (Set<Map.Entry<K, V>>)new PersistentOrderedMapBuilderEntries<>(this);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Set<K> getKeys() {
/*  41 */     return new PersistentOrderedMapBuilderKeys<>(this);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Collection<V> getValues() {
/*  46 */     return new PersistentOrderedMapBuilderValues<>(this);
/*     */   }
/*     */   
/*  49 */   public boolean containsKey(Object key) { return this.hashMapBuilder.containsKey(key); } @Nullable
/*     */   public V get(Object key) {
/*  51 */     (LinkedValue<V>)this.hashMapBuilder.get(key); return ((LinkedValue<V>)this.hashMapBuilder.get(key) != null) ? ((LinkedValue<V>)this.hashMapBuilder.get(key)).getValue() : null;
/*     */   } @Nullable
/*     */   public V put(Object key, Object value) {
/*  54 */     LinkedValue<Object> links = (LinkedValue)this.hashMapBuilder.get(key);
/*  55 */     if (links != null) {
/*  56 */       if (links.getValue() == value) {
/*  57 */         return (V)value;
/*     */       }
/*  59 */       ((Map)this.hashMapBuilder).put(key, links.withValue(value));
/*  60 */       return (V)links.getValue();
/*     */     } 
/*     */     
/*  63 */     if (isEmpty()) {
/*  64 */       this.firstKey = key;
/*  65 */       this.lastKey = key;
/*  66 */       ((Map)this.hashMapBuilder).put(key, new LinkedValue(value));
/*  67 */       return null;
/*     */     } 
/*     */     
/*  70 */     Object lastKey = this.lastKey;
/*  71 */     Intrinsics.checkNotNull(this.hashMapBuilder.get(lastKey)); LinkedValue lastLinks = (LinkedValue)this.hashMapBuilder.get(lastKey);
/*  72 */     CommonFunctionsKt.assert(!lastLinks.getHasNext());
/*     */     
/*  74 */     ((Map)this.hashMapBuilder).put(lastKey, lastLinks.withNext(key));
/*  75 */     ((Map)this.hashMapBuilder).put(key, new LinkedValue(value, lastKey));
/*  76 */     this.lastKey = key;
/*  77 */     return null;
/*     */   } @Nullable
/*     */   public V remove(Object key) {
/*     */     LinkedValue<V> links;
/*  81 */     if ((LinkedValue)this.hashMapBuilder.remove(key) == null) { (LinkedValue)this.hashMapBuilder.remove(key); return null; }
/*     */     
/*  83 */     if (links.getHasPrevious()) {
/*  84 */       Intrinsics.checkNotNull(((Map)this.hashMapBuilder).get(links.getPrevious())); LinkedValue previousLinks = (LinkedValue)((Map)this.hashMapBuilder).get(links.getPrevious());
/*     */ 
/*     */       
/*  87 */       ((Map)this.hashMapBuilder).put(links.getPrevious(), previousLinks.withNext(links.getNext()));
/*     */     } else {
/*  89 */       this.firstKey = links.getNext();
/*     */     } 
/*  91 */     if (links.getHasNext()) {
/*  92 */       Intrinsics.checkNotNull(((Map)this.hashMapBuilder).get(links.getNext())); LinkedValue nextLinks = (LinkedValue)((Map)this.hashMapBuilder).get(links.getNext());
/*     */ 
/*     */       
/*  95 */       ((Map)this.hashMapBuilder).put(links.getNext(), nextLinks.withPrevious(links.getPrevious()));
/*     */     } else {
/*  97 */       this.lastKey = links.getPrevious();
/*     */     } 
/*     */     
/* 100 */     return links.getValue();
/*     */   }
/*     */   public final boolean remove(Object key, Object value) {
/*     */     LinkedValue links;
/* 104 */     if ((LinkedValue)this.hashMapBuilder.get(key) == null) { (LinkedValue)this.hashMapBuilder.get(key); return false; }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 109 */     remove(key);
/*     */     return !!Intrinsics.areEqual(links.getValue(), value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 115 */     this.hashMapBuilder.clear();
/* 116 */     this.firstKey = EndOfChain.INSTANCE;
/* 117 */     this.lastKey = EndOfChain.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\PersistentOrderedMapBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */