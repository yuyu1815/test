/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.AbstractMutableCollection;
/*    */ import kotlin.jvm.internal.markers.KMutableCollection;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\b\002\n\002\020\037\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\020)\n\000\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\b\022\004\022\002H\0020\0032\b\022\004\022\002H\0020\004B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J\025\020\f\032\0020\r2\006\020\016\032\0028\001H\026¢\006\002\020\017J\b\020\020\032\0020\021H\026J\026\020\022\032\0020\r2\006\020\016\032\0028\001H\002¢\006\002\020\017J\017\020\023\032\b\022\004\022\0028\0010\024H\002R\032\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\004¢\006\002\n\000R\024\020\b\032\0020\t8VX\004¢\006\006\032\004\b\n\020\013¨\006\025"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderValues;", "K", "V", "", "Lkotlin/collections/AbstractMutableCollection;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "clear", "", "contains", "iterator", "", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class PersistentOrderedMapBuilderValues<K, V>
/*    */   extends AbstractMutableCollection<V>
/*    */   implements Collection<V>, KMutableCollection
/*    */ {
/*    */   @NotNull
/*    */   private final PersistentOrderedMapBuilder<K, V> builder;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public PersistentOrderedMapBuilderValues(@NotNull PersistentOrderedMapBuilder<K, V> builder) {
/* 66 */     this.builder = builder;
/*    */   } public int getSize() {
/* 68 */     return this.builder.size();
/*    */   }
/*    */   public boolean contains(Object element) {
/* 71 */     return this.builder.containsValue(element);
/*    */   }
/*    */   
/*    */   public boolean add(Object element) {
/* 75 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public void clear() {
/* 79 */     this.builder.clear();
/*    */   }
/*    */   @NotNull
/*    */   public Iterator<V> iterator() {
/* 83 */     return new PersistentOrderedMapBuilderValuesIterator<>(this.builder);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\PersistentOrderedMapBuilderValues.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */