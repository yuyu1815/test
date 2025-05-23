/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020&\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020(\n\000\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\024\022\020\022\016\022\004\022\002H\001\022\004\022\002H\0020\0040\0032\024\022\020\022\016\022\004\022\002H\001\022\004\022\002H\0020\0040\005B\031\022\022\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007¢\006\002\020\bJ\035\020\r\032\0020\0162\022\020\017\032\016\022\004\022\0028\000\022\004\022\0028\0010\004H\002J\033\020\020\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0040\021H\002R\032\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007X\004¢\006\002\n\000R\024\020\t\032\0020\n8VX\004¢\006\006\032\004\b\013\020\f¨\006\022"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapEntries;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "Lkotlin/collections/AbstractSet;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "size", "", "getSize", "()I", "contains", "", "element", "iterator", "", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nPersistentOrderedMapContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMapContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
/*    */ public final class PersistentOrderedMapEntries<K, V> extends AbstractSet<Map.Entry<? extends K, ? extends V>> implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {
/*    */   @NotNull
/*    */   private final PersistentOrderedMap<K, V> map;
/*    */   
/* 11 */   public PersistentOrderedMapEntries(@NotNull PersistentOrderedMap<K, V> map) { this.map = map; } public static final int $stable = 8; public int getSize() {
/* 12 */     return this.map.size();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean contains(@NotNull Map.Entry element) {
/* 17 */     Intrinsics.checkNotNullParameter(element, "element");
/* 18 */     Object candidate = this.map.get(element.getKey());
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
/* 52 */     int $i$a$-let-PersistentOrderedMapEntries$contains$1 = 0;
/*    */     this.map.get(element.getKey());
/*    */     return (this.map.get(element.getKey()) != null) ? Intrinsics.areEqual(candidate, element.getValue()) : ((element.getValue() == null && this.map.containsKey(element.getKey())));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Iterator<Map.Entry<K, V>> iterator() {
/*    */     return (Iterator)new PersistentOrderedMapEntriesIterator<>(this.map);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\PersistentOrderedMapEntries.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */