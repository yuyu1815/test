/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.AbstractCollection;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020(\n\000\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\b\022\004\022\002H\0020\0032\b\022\004\022\002H\0020\004B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J\026\020\f\032\0020\r2\006\020\016\032\0028\001H\002¢\006\002\020\017J\017\020\020\032\b\022\004\022\0028\0010\021H\002R\032\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\004¢\006\002\n\000R\024\020\b\032\0020\t8VX\004¢\006\006\032\004\b\n\020\013¨\006\022"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapValues;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "Lkotlin/collections/AbstractCollection;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class PersistentOrderedMapValues<K, V>
/*    */   extends AbstractCollection<V>
/*    */   implements ImmutableCollection<V>
/*    */ {
/*    */   @NotNull
/*    */   private final PersistentOrderedMap<K, V> map;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public PersistentOrderedMapValues(@NotNull PersistentOrderedMap<K, V> map) {
/* 40 */     this.map = map;
/*    */   } public int getSize() {
/* 42 */     return this.map.size();
/*    */   }
/*    */   public boolean contains(Object element) {
/* 45 */     return this.map.containsValue(element);
/*    */   }
/*    */   @NotNull
/*    */   public Iterator<V> iterator() {
/* 49 */     return new PersistentOrderedMapValuesIterator<>(this.map);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\PersistentOrderedMapValues.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */