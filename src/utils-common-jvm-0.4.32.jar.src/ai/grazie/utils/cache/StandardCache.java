/*     */ package ai.grazie.utils.cache;
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\007\b\000\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\016\022\004\022\002H\001\022\004\022\002H\0030\004B\037\022\030\020\005\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\006¢\006\002\020\bJ\b\020\013\032\0020\fH\026J\035\020\r\032\n\022\004\022\0028\001\030\0010\0162\006\020\017\032\0028\000H\026¢\006\002\020\020J+\020\021\032\b\022\004\022\0028\0010\0162\006\020\017\032\0028\0002\016\020\022\032\n\022\006\022\004\030\0018\0010\023H\026¢\006\002\020\024J\025\020\025\032\0020\f2\006\020\017\032\0028\000H\026¢\006\002\020\026J\037\020\027\032\0020\f2\006\020\017\032\0028\0002\b\020\030\032\004\030\0018\001H\026¢\006\002\020\031R \020\005\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\006X\004¢\006\002\n\000R \020\t\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\nX\004¢\006\002\n\000¨\006\032"}, d2 = {"Lai/grazie/utils/cache/StandardCache;", "Key", "", "Value", "Lai/grazie/utils/cache/CacheWithNulls;", "condition", "Lai/grazie/utils/cache/CacheCondition;", "Lai/grazie/utils/cache/CacheValue$WithTime;", "(Lai/grazie/utils/cache/CacheCondition;)V", "data", "Ljava/util/concurrent/ConcurrentHashMap;", "clear", "", "get", "Lai/grazie/utils/cache/Wrapper;", "key", "(Ljava/lang/Object;)Lai/grazie/utils/cache/Wrapper;", "getOrPut", "loader", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lai/grazie/utils/cache/Wrapper;", "invalidate", "(Ljava/lang/Object;)V", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "utils-common"})
/*     */ @SourceDebugExtension({"SMAP\nStandardCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardCache.kt\nai/grazie/utils/cache/StandardCache\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1863#2,2:110\n*S KotlinDebug\n*F\n+ 1 StandardCache.kt\nai/grazie/utils/cache/StandardCache\n*L\n22#1:110,2\n*E\n"})
/*     */ public final class StandardCache<Key, Value> implements CacheWithNulls<Key, Value> {
/*     */   @NotNull
/*     */   private final CacheCondition<Key, CacheValue.WithTime<Value>> condition;
/*     */   
/*   8 */   public StandardCache(@NotNull CacheCondition<Key, CacheValue.WithTime<Value>> condition) { this.condition = condition;
/*     */     
/*  10 */     this.data = new ConcurrentHashMap<>(); } @NotNull
/*     */   private final ConcurrentHashMap<Key, CacheValue.WithTime<Value>> data; @Nullable
/*     */   public Wrapper<Value> get(@NotNull Object key) {
/*  13 */     Intrinsics.checkNotNullParameter(key, "key"); synchronized (this) { int $i$a$-synchronized-StandardCache$get$1 = 0;
/*  14 */       CacheValue.WithTime<Value> withTime = this.data.get(key); Intrinsics.checkNotNullExpressionValue(withTime, "data[key]"); Wrapper<Value> wrapper = (withTime != null) ? CacheValueKt.<Value>toWrapper(withTime) : null; }
/*     */     
/*     */     return wrapper;
/*     */   }
/*     */   public void put(@NotNull Object key, @Nullable Object value) {
/*  19 */     Intrinsics.checkNotNullParameter(key, "key"); synchronized (this) { int $i$a$-synchronized-StandardCache$put$1 = 0;
/*  20 */       this.data.put((Key)key, new CacheValue.WithTime.Default<>(value, 0L, 2, null));
/*  21 */       Set<Key> toRemove = this.condition.toFilterOut(this.data, SetsKt.emptySet());
/*  22 */       Iterable<Key> $this$forEach$iv = toRemove; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 110 */       Iterator<Key> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), it = element$iv; int $i$a$-forEach-StandardCache$put$1$1 = 0;
/*     */         this.data.remove(it); }
/*     */       
/*     */       Unit unit = Unit.INSTANCE; }
/*     */   
/*     */   }
/*     */   
/*     */   public void invalidate(@NotNull Object key) {
/*     */     Intrinsics.checkNotNullParameter(key, "key");
/*     */     synchronized (this) {
/*     */       int $i$a$-synchronized-StandardCache$invalidate$1 = 0;
/*     */       CacheValue.WithTime withTime = this.data.remove(key);
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Wrapper<Value> getOrPut(@NotNull Object key, @NotNull Function0 loader) {
/*     */     Intrinsics.checkNotNullParameter(key, "key");
/*     */     Intrinsics.checkNotNullParameter(loader, "loader");
/*     */     synchronized (this) {
/*     */       int $i$a$-synchronized-StandardCache$getOrPut$1 = 0;
/*     */       Wrapper<Value> value = get((Key)key);
/*     */       if (value == null)
/*     */         put((Key)key, (Value)loader.invoke()); 
/*     */       Intrinsics.checkNotNull(get((Key)key));
/*     */       Wrapper<Value> wrapper1 = get((Key)key);
/*     */     } 
/*     */     return wrapper1;
/*     */   }
/*     */   
/*     */   public void clear() {
/*     */     synchronized (this) {
/*     */       int $i$a$-synchronized-StandardCache$clear$1 = 0;
/*     */       this.data.clear();
/*     */       Unit unit = Unit.INSTANCE;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\StandardCache.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */