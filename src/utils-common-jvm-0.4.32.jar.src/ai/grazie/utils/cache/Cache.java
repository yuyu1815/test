/*   */ package ai.grazie.utils.cache;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\020\013\n\002\b\006\n\002\030\002\n\002\b\007\bg\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\0020\002J\b\020\004\032\0020\005H&J\025\020\006\032\0020\0072\006\020\b\032\0028\000H\026¢\006\002\020\tJ\027\020\n\032\004\030\0018\0012\006\020\b\032\0028\000H&¢\006\002\020\013J#\020\f\032\0028\0012\006\020\b\032\0028\0002\f\020\r\032\b\022\004\022\0028\0010\016H&¢\006\002\020\017J\025\020\020\032\0020\0052\006\020\b\032\0028\000H&¢\006\002\020\021J\035\020\022\032\0020\0052\006\020\b\032\0028\0002\006\020\023\032\0028\001H&¢\006\002\020\024ø\001\000\002\006\n\004\b!0\001¨\006\025À\006\001"}, d2 = {"Lai/grazie/utils/cache/Cache;", "Key", "", "Value", "clear", "", "exists", "", "key", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrPut", "loader", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "invalidate", "(Ljava/lang/Object;)V", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "utils-common"})
/*   */ public interface Cache<Key, Value> {
/*   */   default boolean exists(@NotNull Object key) {
/* 7 */     Intrinsics.checkNotNullParameter(key, "key"); return (get((Key)key) != null);
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   Value get(@NotNull Key paramKey);
/*   */   
/*   */   void put(@NotNull Key paramKey, @NotNull Value paramValue);
/*   */   
/*   */   void invalidate(@NotNull Key paramKey);
/*   */   
/*   */   void clear();
/*   */   
/*   */   @NotNull
/*   */   Value getOrPut(@NotNull Key paramKey, @NotNull Function0<? extends Value> paramFunction0);
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\Cache.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */