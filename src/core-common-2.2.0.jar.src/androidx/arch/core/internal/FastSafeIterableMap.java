/*    */ package androidx.arch.core.internal;
/*    */ 
/*    */ import androidx.annotation.NonNull;
/*    */ import androidx.annotation.Nullable;
/*    */ import androidx.annotation.RestrictTo;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
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
/*    */ 
/*    */ @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/*    */ public class FastSafeIterableMap<K, V>
/*    */   extends SafeIterableMap<K, V>
/*    */ {
/* 38 */   private final HashMap<K, SafeIterableMap.Entry<K, V>> mHashMap = new HashMap<>();
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected SafeIterableMap.Entry<K, V> get(K k) {
/* 44 */     return this.mHashMap.get(k);
/*    */   }
/*    */ 
/*    */   
/*    */   public V putIfAbsent(@NonNull K key, @NonNull V v) {
/* 49 */     SafeIterableMap.Entry<K, V> current = get(key);
/* 50 */     if (current != null) {
/* 51 */       return current.mValue;
/*    */     }
/* 53 */     this.mHashMap.put(key, put(key, v));
/* 54 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public V remove(@NonNull K key) {
/* 59 */     V removed = super.remove(key);
/* 60 */     this.mHashMap.remove(key);
/* 61 */     return removed;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean contains(K key) {
/* 69 */     return this.mHashMap.containsKey(key);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Map.Entry<K, V> ceil(K k) {
/* 79 */     if (contains(k)) {
/* 80 */       return ((SafeIterableMap.Entry)this.mHashMap.get(k)).mPrevious;
/*    */     }
/* 82 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-common-2.2.0.jar!\androidx\arch\core\internal\FastSafeIterableMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */