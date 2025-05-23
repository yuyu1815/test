/*    */ package ai.grazie.utils.cache;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\005\n\002\030\002\n\002\b\007\b\000\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\016\022\004\022\002H\001\022\004\022\002H\0030\004B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J\b\020\b\032\0020\tH\026J\027\020\n\032\004\030\0018\0012\006\020\013\032\0028\000H\026¢\006\002\020\fJ#\020\r\032\0028\0012\006\020\013\032\0028\0002\f\020\016\032\b\022\004\022\0028\0010\017H\026¢\006\002\020\020J\025\020\021\032\0020\t2\006\020\013\032\0028\000H\026¢\006\002\020\022J\035\020\023\032\0020\t2\006\020\013\032\0028\0002\006\020\024\032\0028\001H\026¢\006\002\020\025R\032\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\004¢\006\002\n\000¨\006\026"}, d2 = {"Lai/grazie/utils/cache/CacheWithNullsAdapter;", "Key", "", "Value", "Lai/grazie/utils/cache/Cache;", "cache", "Lai/grazie/utils/cache/CacheWithNulls;", "(Lai/grazie/utils/cache/CacheWithNulls;)V", "clear", "", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrPut", "loader", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "invalidate", "(Ljava/lang/Object;)V", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "utils-common"})
/*    */ public final class CacheWithNullsAdapter<Key, Value> implements Cache<Key, Value> {
/*    */   public CacheWithNullsAdapter(@NotNull CacheWithNulls<Key, Value> cache) {
/*  4 */     this.cache = cache;
/*    */   } @NotNull
/*    */   private final CacheWithNulls<Key, Value> cache;
/*    */   public void put(@NotNull Object key, @NotNull Object value) {
/*  8 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); this.cache.put((Key)key, (Value)value);
/*    */   }
/*    */   
/*    */   public void invalidate(@NotNull Object key) {
/* 12 */     Intrinsics.checkNotNullParameter(key, "key"); this.cache.invalidate((Key)key);
/*    */   }
/*    */   
/*    */   public void clear() {
/* 16 */     this.cache.clear();
/*    */   }
/*    */   @Nullable
/*    */   public Value get(@NotNull Object key) {
/* 20 */     Intrinsics.checkNotNullParameter(key, "key"); this.cache.get((Key)key); return (this.cache.get((Key)key) != null) ? this.cache.get((Key)key).getValue() : null;
/*    */   }
/*    */   @NotNull
/*    */   public Value getOrPut(@NotNull Object key, @NotNull Function0<? extends Value> loader) {
/* 24 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(loader, "loader"); Intrinsics.checkNotNull(this.cache.getOrPut((Key)key, loader).getValue()); return (Value)this.cache.getOrPut((Key)key, loader).getValue();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\CacheWithNullsAdapter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */