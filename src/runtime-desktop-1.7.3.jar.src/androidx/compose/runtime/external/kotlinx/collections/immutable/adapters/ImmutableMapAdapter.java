/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap;
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Function;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.markers.KMappedMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020$\n\002\b\003\n\002\030\002\n\002\020&\n\002\b\005\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\000\n\002\b\005\n\002\020\016\n\000\b\000\030\000*\004\b\000\020\001*\006\b\001\020\002 \0012\016\022\004\022\002H\001\022\004\022\002H\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\004¢\006\002\020\006J\026\020\026\032\0020\0272\006\020\030\032\0028\000H\001¢\006\002\020\031J\026\020\032\032\0020\0272\006\020\033\032\0028\001H\001¢\006\002\020\031J\023\020\034\032\0020\0272\b\020\035\032\004\030\0010\036H\002J\030\020\037\032\004\030\0018\0012\006\020\030\032\0028\000H\003¢\006\002\020 J\b\020!\032\0020\017H\026J\t\020\"\032\0020\027H\001J\b\020#\032\0020$H\026R&\020\007\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\t0\bX\004¢\006\b\n\000\032\004\b\n\020\013R\032\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\004X\004¢\006\002\n\000R\032\020\f\032\b\022\004\022\0028\0000\bX\004¢\006\b\n\000\032\004\b\r\020\013R\022\020\016\032\0020\017X\005¢\006\006\032\004\b\020\020\021R\032\020\022\032\b\022\004\022\0028\0010\023X\004¢\006\b\n\000\032\004\b\024\020\025¨\006%"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableMapAdapter;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "", "impl", "(Ljava/util/Map;)V", "entries", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "keys", "getKeys", "size", "", "getSize", "()I", "values", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "isEmpty", "toString", "", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class ImmutableMapAdapter<K, V>
/*    */   implements ImmutableMap<K, V>, Map<K, V>, KMappedMarker
/*    */ {
/*    */   @NotNull
/*    */   private final Map<K, V> impl;
/*    */   @NotNull
/*    */   private final ImmutableSet<K> keys;
/*    */   @NotNull
/*    */   private final ImmutableCollection<V> values;
/*    */   
/*    */   public ImmutableMapAdapter(@NotNull Map<K, V> impl) {
/* 36 */     this.impl = impl;
/*    */     
/* 38 */     this.keys = new ImmutableSetAdapter<>(this.impl.keySet());
/* 39 */     this.values = new ImmutableCollectionAdapter<>(this.impl.values());
/* 40 */     this.entries = new ImmutableSetAdapter<>(this.impl.entrySet()); } @NotNull private final ImmutableSet<Map.Entry<K, V>> entries; public static final int $stable = 8; @NotNull public ImmutableSet<K> getKeys() { return this.keys; } @NotNull public ImmutableCollection<V> getValues() { return this.values; } @NotNull public ImmutableSet<Map.Entry<K, V>> getEntries() { return this.entries; }
/*    */   
/* 42 */   public boolean equals(@Nullable Object other) { return this.impl.equals(other); }
/* 43 */   public int hashCode() { return this.impl.hashCode(); } @NotNull
/* 44 */   public String toString() { return this.impl.toString(); }
/*    */ 
/*    */   
/*    */   public int getSize() {
/*    */     return this.impl.size();
/*    */   }
/*    */   
/*    */   public boolean containsKey(Object key) {
/*    */     return this.impl.containsKey(key);
/*    */   }
/*    */   
/*    */   public boolean containsValue(Object value) {
/*    */     return this.impl.containsValue(value);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public V get(Object key) {
/*    */     return this.impl.get(key);
/*    */   }
/*    */   
/*    */   public boolean isEmpty() {
/*    */     return this.impl.isEmpty();
/*    */   }
/*    */   
/*    */   public void clear() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public V compute(Object p0, BiFunction p1) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public V computeIfAbsent(Object p0, Function p1) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public V computeIfPresent(Object p0, BiFunction p1) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public V merge(Object p0, Object p1, BiFunction p2) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public V put(Object key, Object value) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public void putAll(Map from) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public V putIfAbsent(Object p0, Object p1) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public V remove(Object key) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean remove(Object key, Object value) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean replace(Object p0, Object p1, Object p2) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public V replace(Object p0, Object p1) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public void replaceAll(BiFunction p0) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\adapters\ImmutableMapAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */