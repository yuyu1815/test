/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\b\002\n\002\020(\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\003\b\000\030\000*\006\b\000\020\001 \001*\006\b\001\020\002 \0012\b\022\004\022\002H\0020\003B\031\022\022\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005¢\006\002\020\006J\t\020\t\032\0020\nH\002J\016\020\013\032\0028\001H\002¢\006\002\020\fR\032\020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\bX\004¢\006\002\n\000¨\006\r"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapValuesIterator;", "K", "V", "", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "internal", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class PersistentOrderedMapValuesIterator<K, V>
/*    */   implements Iterator<V>, KMappedMarker
/*    */ {
/*    */   @NotNull
/*    */   private final PersistentOrderedMapLinksIterator<K, V> internal;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public PersistentOrderedMapValuesIterator(@NotNull PersistentOrderedMap map) {
/* 66 */     this.internal = new PersistentOrderedMapLinksIterator<>(map.getFirstKey$runtime(), (Map<K, LinkedValue<V>>)map.getHashMap$runtime());
/*    */   }
/*    */   public boolean hasNext() {
/* 69 */     return this.internal.hasNext();
/*    */   }
/*    */   
/*    */   public V next() {
/* 73 */     return this.internal.next().getValue();
/*    */   }
/*    */   
/*    */   public void remove() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\PersistentOrderedMapValuesIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */