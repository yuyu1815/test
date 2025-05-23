/*    */ package ai.grazie.utils.cache;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\b\f\b\000\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\016\022\004\022\002H\001\022\004\022\002H\0030\004B=\b\000\022\030\020\005\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\006\022\032\b\002\020\b\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\t¢\006\002\020\nJ\027\020\r\032\004\030\0018\0012\006\020\016\032\0028\000H\026¢\006\002\020\017J!\020\020\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\016\032\0028\000H\026¢\006\002\020\021J)\020\022\032\016\022\004\022\0028\000\022\004\022\0028\0010\0042\006\020\016\032\0028\0002\006\020\023\032\0028\001H\026¢\006\002\020\024R#\020\005\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\006¢\006\b\n\000\032\004\b\013\020\fR \020\b\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\tX\004¢\006\002\n\000¨\006\025"}, d2 = {"Lai/grazie/utils/cache/StandardImmutableCache;", "Key", "", "Value", "Lai/grazie/utils/cache/ImmutableCache;", "condition", "Lai/grazie/utils/cache/CacheCondition;", "Lai/grazie/utils/cache/CacheValue$WithTime;", "data", "", "(Lai/grazie/utils/cache/CacheCondition;Ljava/util/Map;)V", "getCondition", "()Lai/grazie/utils/cache/CacheCondition;", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "invalidate", "(Ljava/lang/Object;)Lai/grazie/utils/cache/StandardImmutableCache;", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Lai/grazie/utils/cache/ImmutableCache;", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nStandardImmutableCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardImmutableCache.kt\nai/grazie/utils/cache/StandardImmutableCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,23:1\n535#2:24\n520#2,6:25\n487#2,7:31\n*S KotlinDebug\n*F\n+ 1 StandardImmutableCache.kt\nai/grazie/utils/cache/StandardImmutableCache\n*L\n14#1:24\n14#1:25,6\n20#1:31,7\n*E\n"})
/*    */ public final class StandardImmutableCache<Key, Value> implements ImmutableCache<Key, Value> { @NotNull
/*  5 */   private final CacheCondition<Key, CacheValue.WithTime<Value>> condition; public StandardImmutableCache(@NotNull CacheCondition<Key, CacheValue.WithTime<Value>> condition, @NotNull Map<Key, CacheValue.WithTime<Value>> data) { this.condition = condition; this.data = data; } @NotNull private final Map<Key, CacheValue.WithTime<Value>> data; @NotNull public final CacheCondition<Key, CacheValue.WithTime<Value>> getCondition() { return this.condition; }
/*    */   
/*    */   @Nullable
/*    */   public Value get(@NotNull Object key) {
/*  9 */     Intrinsics.checkNotNullParameter(key, "key"); (CacheValue.WithTime<Value>)this.data.get(key); return ((CacheValue.WithTime<Value>)this.data.get(key) != null) ? ((CacheValue.WithTime<Value>)this.data.get(key)).getValue() : null;
/*    */   }
/*    */   
/*    */   @NotNull
/* 13 */   public ImmutableCache<Key, Value> put(@NotNull Object key, @NotNull Object value) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); Set<Key> toRemove = this.condition.toFilterOut(this.data, SetsKt.emptySet());
/* 14 */     Map<Key, CacheValue.WithTime<Value>> $this$filter$iv = this.data; int $i$f$filter = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 24 */     Map<Key, CacheValue.WithTime<Value>> map1 = $this$filter$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(); int $i$f$filterTo = 0;
/* 25 */     for (Map.Entry<Key, CacheValue.WithTime<Value>> element$iv$iv : map1.entrySet()) {
/* 26 */       Map.Entry<Key, CacheValue.WithTime<Value>> it = element$iv$iv; int $i$a$-filter-StandardImmutableCache$put$copy$1 = 0; if (!toRemove.contains(it.getKey())) {
/* 27 */         destination$iv$iv.put(element$iv$iv.getKey(), element$iv$iv.getValue());
/*    */       }
/*    */     } 
/* 30 */     Map<Key, ? extends CacheValue.WithTime<Value>> copy = MapsKt.plus(destination$iv$iv, MapsKt.mapOf(TuplesKt.to(key, new CacheValue.WithTime.Default(value, 0L, 2, null)))); return new StandardImmutableCache(this.condition, copy); } @NotNull public StandardImmutableCache<Key, Value> invalidate(@NotNull Object key) { Intrinsics.checkNotNullParameter(key, "key"); Map<Key, CacheValue.WithTime<Value>> map = this.data; CacheCondition<Key, CacheValue.WithTime<Value>> cacheCondition1 = this.condition; int $i$f$filterKeys = 0;
/* 31 */     LinkedHashMap<Object, Object> result$iv = new LinkedHashMap<>();
/* 32 */     for (Map.Entry<Key, CacheValue.WithTime<Value>> entry$iv : map.entrySet()) {
/* 33 */       Object it = entry$iv.getKey(); int $i$a$-filterKeys-StandardImmutableCache$invalidate$1 = 0; if (!Intrinsics.areEqual(it, key)) {
/* 34 */         result$iv.put(entry$iv.getKey(), entry$iv.getValue());
/*    */       }
/*    */     } 
/* 37 */     LinkedHashMap<Object, Object> linkedHashMap1 = result$iv; CacheCondition<Key, CacheValue.WithTime<Value>> cacheCondition2 = cacheCondition1;
/*    */     return new StandardImmutableCache(cacheCondition2, (Map)linkedHashMap1); }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\StandardImmutableCache.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */