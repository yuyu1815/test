/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Iterator;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.AbstractMutableSet;
/*    */ import kotlin.jvm.internal.markers.KMutableSet;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\b\002\n\002\020#\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\020)\n\002\b\002\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\b\022\004\022\002H\0010\0032\b\022\004\022\002H\0010\004B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J\025\020\f\032\0020\r2\006\020\016\032\0028\000H\026¢\006\002\020\017J\b\020\020\032\0020\021H\026J\026\020\022\032\0020\r2\006\020\016\032\0028\000H\002¢\006\002\020\017J\017\020\023\032\b\022\004\022\0028\0000\024H\002J\025\020\025\032\0020\r2\006\020\016\032\0028\000H\026¢\006\002\020\017R\032\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\004¢\006\002\n\000R\024\020\b\032\0020\t8VX\004¢\006\006\032\004\b\n\020\013¨\006\026"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderKeys;", "K", "V", "", "Lkotlin/collections/AbstractMutableSet;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "clear", "", "contains", "iterator", "", "remove", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class PersistentHashMapBuilderKeys<K, V>
/*    */   extends AbstractMutableSet<K>
/*    */   implements Set<K>, KMutableSet
/*    */ {
/*    */   @NotNull
/*    */   private final PersistentHashMapBuilder<K, V> builder;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public PersistentHashMapBuilderKeys(@NotNull PersistentHashMapBuilder<K, V> builder) {
/* 54 */     this.builder = builder;
/*    */   } public boolean add(Object element) {
/* 56 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public void clear() {
/* 60 */     this.builder.clear();
/*    */   }
/*    */   @NotNull
/*    */   public Iterator<K> iterator() {
/* 64 */     return new PersistentHashMapBuilderKeysIterator<>(this.builder);
/*    */   }
/*    */   
/*    */   public boolean remove(Object element) {
/* 68 */     if (this.builder.containsKey((K)element)) {
/* 69 */       this.builder.remove((K)element);
/* 70 */       return true;
/*    */     } 
/* 72 */     return false;
/*    */   }
/*    */   
/*    */   public int getSize() {
/* 76 */     return this.builder.size();
/*    */   }
/*    */   public boolean contains(Object element) {
/* 79 */     return this.builder.containsKey((K)element);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\PersistentHashMapBuilderKeys.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */