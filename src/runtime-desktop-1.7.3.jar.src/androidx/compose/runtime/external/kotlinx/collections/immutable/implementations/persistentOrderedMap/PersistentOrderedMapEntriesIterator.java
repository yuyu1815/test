/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.markers.KMappedMarker;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\b\002\n\002\020(\n\002\020&\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\b\000\030\000*\006\b\000\020\001 \001*\006\b\001\020\002 \0012\024\022\020\022\016\022\004\022\002H\001\022\004\022\002H\0020\0040\003B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J\t\020\n\032\0020\013H\002J\025\020\f\032\016\022\004\022\0028\000\022\004\022\0028\0010\004H\002R\032\020\b\032\016\022\004\022\0028\000\022\004\022\0028\0010\tX\004¢\006\002\n\000¨\006\r"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapEntriesIterator;", "K", "V", "", "", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "internal", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "hasNext", "", "next", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class PersistentOrderedMapEntriesIterator<K, V>
/*    */   implements Iterator<Map.Entry<? extends K, ? extends V>>, KMappedMarker
/*    */ {
/*    */   @NotNull
/*    */   private final PersistentOrderedMapLinksIterator<K, V> internal;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public PersistentOrderedMapEntriesIterator(@NotNull PersistentOrderedMap map) {
/* 36 */     this.internal = new PersistentOrderedMapLinksIterator<>(map.getFirstKey$runtime(), (Map<K, LinkedValue<V>>)map.getHashMap$runtime());
/*    */   }
/*    */   public boolean hasNext() {
/* 39 */     return this.internal.hasNext();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Map.Entry<K, V> next() {
/* 44 */     Object nextKey = this.internal.getNextKey$runtime();
/* 45 */     Object nextValue = this.internal.next().getValue();
/* 46 */     return (Map.Entry<K, V>)new MapEntry(nextKey, nextValue);
/*    */   }
/*    */   
/*    */   public void remove() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\PersistentOrderedMapEntriesIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */