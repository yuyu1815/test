/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.markers.KMutableIterator;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\b\002\n\002\020)\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020\002\n\000\b\000\030\000*\006\b\000\020\001 \001*\006\b\001\020\002 \0012\b\022\004\022\002H\0020\003B\031\022\022\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005¢\006\002\020\006J\t\020\t\032\0020\nH\002J\016\020\013\032\0028\001H\002¢\006\002\020\fJ\b\020\r\032\0020\016H\026R\032\020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\bX\004¢\006\002\n\000¨\006\017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderValuesIterator;", "K", "V", "", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "internal", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "remove", "", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class PersistentOrderedMapBuilderValuesIterator<K, V>
/*     */   implements Iterator<V>, KMutableIterator
/*     */ {
/*     */   @NotNull
/*     */   private final PersistentOrderedMapBuilderLinksIterator<K, V> internal;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public PersistentOrderedMapBuilderValuesIterator(@NotNull PersistentOrderedMapBuilder<K, V> map) {
/* 115 */     this.internal = new PersistentOrderedMapBuilderLinksIterator<>(map.getFirstKey$runtime(), map);
/*     */   }
/*     */   public boolean hasNext() {
/* 118 */     return this.internal.hasNext();
/*     */   }
/*     */   
/*     */   public V next() {
/* 122 */     return this.internal.next().getValue();
/*     */   }
/*     */   
/*     */   public void remove() {
/* 126 */     this.internal.remove();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\PersistentOrderedMapBuilderValuesIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */