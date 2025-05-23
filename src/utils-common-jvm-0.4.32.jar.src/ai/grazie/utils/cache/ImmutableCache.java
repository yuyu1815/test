/*    */ package ai.grazie.utils.cache;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\013\n\002\b\n\bg\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\0020\002J\025\020\004\032\0020\0052\006\020\006\032\0028\000H\026¢\006\002\020\007J\027\020\b\032\004\030\0018\0012\006\020\006\032\0028\000H&¢\006\002\020\tJ!\020\n\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\006\032\0028\000H&¢\006\002\020\013J)\020\f\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\006\032\0028\0002\006\020\r\032\0028\001H&¢\006\002\020\016ø\001\000\002\006\n\004\b!0\001¨\006\017À\006\001"}, d2 = {"Lai/grazie/utils/cache/ImmutableCache;", "Key", "", "Value", "exists", "", "key", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "invalidate", "(Ljava/lang/Object;)Lai/grazie/utils/cache/ImmutableCache;", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Lai/grazie/utils/cache/ImmutableCache;", "utils-common"})
/*    */ public interface ImmutableCache<Key, Value>
/*    */ {
/*    */   default boolean exists(@NotNull Object key) {
/* 26 */     Intrinsics.checkNotNullParameter(key, "key"); return (get((Key)key) != null);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   Value get(@NotNull Key paramKey);
/*    */   
/*    */   @NotNull
/*    */   ImmutableCache<Key, Value> put(@NotNull Key paramKey, @NotNull Value paramValue);
/*    */   
/*    */   @NotNull
/*    */   ImmutableCache<Key, Value> invalidate(@NotNull Key paramKey);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\ImmutableCache.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */