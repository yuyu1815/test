/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*    */ import java.util.Map;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020'\n\000\n\002\030\002\n\002\b\003\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022 \022\004\022\002H\001\022\004\022\002H\002\022\020\022\016\022\004\022\002H\001\022\004\022\002H\0020\0040\003B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J\025\020\b\032\016\022\004\022\0028\000\022\004\022\0028\0010\004H\002R\032\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\004¢\006\002\n\000¨\006\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeMutableEntriesIterator;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "", "parentIterator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntriesIterator;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntriesIterator;)V", "next", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class TrieNodeMutableEntriesIterator<K, V> extends TrieNodeBaseIterator<K, V, Map.Entry<K, V>> {
/*    */   @NotNull
/*    */   private final PersistentHashMapBuilderEntriesIterator<K, V> parentIterator;
/*    */   
/*    */   public TrieNodeMutableEntriesIterator(@NotNull PersistentHashMapBuilderEntriesIterator<K, V> parentIterator) {
/* 12 */     this.parentIterator = parentIterator;
/*    */   } public static final int $stable = 8;
/*    */   @NotNull
/*    */   public Map.Entry<K, V> next() {
/* 16 */     CommonFunctionsKt.assert(hasNextKey());
/* 17 */     setIndex(getIndex() + 2);
/*    */     
/* 19 */     return new MutableMapEntry<>(this.parentIterator, (K)getBuffer()[getIndex() - 2], (V)getBuffer()[getIndex() - 1]);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\TrieNodeMutableEntriesIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */