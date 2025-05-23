/*    */ package ai.grazie.utils;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\006\n\002\020\002\n\002\b\003\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003B\005¢\006\002\020\004J\026\020\007\032\0020\b2\006\020\t\032\0028\000H\002¢\006\002\020\nJ\023\020\013\032\0020\b2\006\020\t\032\0028\000¢\006\002\020\nJ\030\020\f\032\004\030\0018\0012\006\020\t\032\0028\000H\002¢\006\002\020\rJ\036\020\016\032\0020\0172\006\020\t\032\0028\0002\006\020\020\032\0028\001H\002¢\006\002\020\021R\032\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lai/grazie/utils/WeakHashMap;", "Key", "Value", "", "()V", "impl", "Lai/grazie/utils/WeakIdentityHashMap;", "contains", "", "key", "(Ljava/lang/Object;)Z", "delete", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "utils-common"})
/*    */ public final class WeakHashMap<Key, Value> {
/*    */   @NotNull
/*  4 */   private final WeakIdentityHashMap<Key, Value> impl = new WeakIdentityHashMap<>();
/*    */   
/*  6 */   public final boolean contains(Object key) { return this.impl.containsKey(key); } @Nullable
/*    */   public final Value get(Object key) {
/*  8 */     return this.impl.get(key);
/*    */   }
/*    */   public final void set(Object key, Object value) {
/* 11 */     this.impl.put((Key)key, (Value)value);
/*    */   }
/*    */   public final boolean delete(Object key) {
/* 14 */     return (this.impl.remove(key) != null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\WeakHashMap.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */