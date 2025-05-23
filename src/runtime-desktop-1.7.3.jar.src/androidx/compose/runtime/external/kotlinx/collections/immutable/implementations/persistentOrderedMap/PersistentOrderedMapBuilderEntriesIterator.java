/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.markers.KMutableIterator;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\b\002\n\002\020)\n\002\020'\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\002\n\000\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\024\022\020\022\016\022\004\022\002H\001\022\004\022\002H\0020\0040\003B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J\t\020\n\032\0020\013H\002J\025\020\f\032\016\022\004\022\0028\000\022\004\022\0028\0010\004H\002J\b\020\r\032\0020\016H\026R\032\020\b\032\016\022\004\022\0028\000\022\004\022\0028\0010\tX\004¢\006\002\n\000¨\006\017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderEntriesIterator;", "K", "V", "", "", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "internal", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "hasNext", "", "next", "remove", "", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class PersistentOrderedMapBuilderEntriesIterator<K, V>
/*    */   implements Iterator<Map.Entry<K, V>>, KMutableIterator
/*    */ {
/*    */   @NotNull
/*    */   private final PersistentOrderedMapBuilderLinksIterator<K, V> internal;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public PersistentOrderedMapBuilderEntriesIterator(@NotNull PersistentOrderedMapBuilder<K, V> map) {
/* 65 */     this.internal = new PersistentOrderedMapBuilderLinksIterator<>(map.getFirstKey$runtime(), map);
/*    */   }
/*    */   public boolean hasNext() {
/* 68 */     return this.internal.hasNext();
/*    */   }
/*    */   @NotNull
/*    */   public Map.Entry<K, V> next() {
/* 72 */     LinkedValue<V> links = this.internal.next();
/*    */     
/* 74 */     return new MutableMapEntry<>((Map<K, LinkedValue<V>>)this.internal.getBuilder$runtime().getHashMapBuilder$runtime(), (K)this.internal.getLastIteratedKey$runtime(), links);
/*    */   }
/*    */   
/*    */   public void remove() {
/* 78 */     this.internal.remove();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\PersistentOrderedMapBuilderEntriesIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */