/*    */ package ai.grazie.utils.cache;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\bg\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\0020\002J\b\020\004\032\0020\005H&J\025\020\006\032\0020\0072\006\020\b\032\0028\000H\026¢\006\002\020\tJ\035\020\n\032\n\022\004\022\0028\001\030\0010\0132\006\020\b\032\0028\000H&¢\006\002\020\fJ+\020\r\032\b\022\004\022\0028\0010\0132\006\020\b\032\0028\0002\016\020\016\032\n\022\006\022\004\030\0018\0010\017H&¢\006\002\020\020J\025\020\021\032\0020\0052\006\020\b\032\0028\000H&¢\006\002\020\022J\037\020\023\032\0020\0052\006\020\b\032\0028\0002\b\020\024\032\004\030\0018\001H&¢\006\002\020\025ø\001\000\002\006\n\004\b!0\001¨\006\026À\006\001"}, d2 = {"Lai/grazie/utils/cache/CacheWithNulls;", "Key", "", "Value", "clear", "", "exists", "", "key", "(Ljava/lang/Object;)Z", "get", "Lai/grazie/utils/cache/Wrapper;", "(Ljava/lang/Object;)Lai/grazie/utils/cache/Wrapper;", "getOrPut", "loader", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lai/grazie/utils/cache/Wrapper;", "invalidate", "(Ljava/lang/Object;)V", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "utils-common"})
/*    */ public interface CacheWithNulls<Key, Value>
/*    */ {
/*    */   default boolean exists(@NotNull Object key) {
/* 37 */     Intrinsics.checkNotNullParameter(key, "key"); return (get((Key)key) != null);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   Wrapper<Value> get(@NotNull Key paramKey);
/*    */   
/*    */   void put(@NotNull Key paramKey, @Nullable Value paramValue);
/*    */   
/*    */   void invalidate(@NotNull Key paramKey);
/*    */   
/*    */   void clear();
/*    */   
/*    */   @NotNull
/*    */   Wrapper<Value> getOrPut(@NotNull Key paramKey, @NotNull Function0<? extends Value> paramFunction0);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\CacheWithNulls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */