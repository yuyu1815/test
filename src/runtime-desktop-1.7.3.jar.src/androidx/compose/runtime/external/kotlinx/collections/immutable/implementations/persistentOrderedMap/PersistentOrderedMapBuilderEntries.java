/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020'\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\002\n\000\n\002\020&\n\000\n\002\020)\n\002\b\002\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022 \022\020\022\016\022\004\022\002H\001\022\004\022\002H\0020\004\022\004\022\002H\001\022\004\022\002H\0020\003B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J\034\020\f\032\0020\r2\022\020\016\032\016\022\004\022\0028\000\022\004\022\0028\0010\004H\026J\b\020\017\032\0020\020H\026J\034\020\021\032\0020\r2\022\020\016\032\016\022\004\022\0028\000\022\004\022\0028\0010\022H\026J\033\020\023\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0040\024H\002J\034\020\025\032\0020\r2\022\020\016\032\016\022\004\022\0028\000\022\004\022\0028\0010\022H\026R\032\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\004¢\006\002\n\000R\024\020\b\032\0020\t8VX\004¢\006\006\032\004\b\n\020\013¨\006\026"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderEntries;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/AbstractMapBuilderEntries;", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "size", "", "getSize", "()I", "add", "", "element", "clear", "", "containsEntry", "", "iterator", "", "removeEntry", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nPersistentOrderedMapBuilderContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMapBuilderContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
/*    */ public final class PersistentOrderedMapBuilderEntries<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {
/*    */   @NotNull
/*    */   private final PersistentOrderedMapBuilder<K, V> builder;
/*    */   
/*    */   public PersistentOrderedMapBuilderEntries(@NotNull PersistentOrderedMapBuilder<K, V> builder) {
/* 10 */     this.builder = builder;
/*    */   } public static final int $stable = 8;
/*    */   public boolean add(@NotNull Map.Entry element) {
/* 13 */     Intrinsics.checkNotNullParameter(element, "element"); throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public void clear() {
/* 17 */     this.builder.clear();
/*    */   }
/*    */   @NotNull
/*    */   public Iterator<Map.Entry<K, V>> iterator() {
/* 21 */     return new PersistentOrderedMapBuilderEntriesIterator<>(this.builder);
/*    */   }
/*    */   
/*    */   public boolean removeEntry(@NotNull Map.Entry element) {
/* 25 */     Intrinsics.checkNotNullParameter(element, "element"); return this.builder.remove(element.getKey(), element.getValue());
/*    */   }
/*    */   
/*    */   public int getSize() {
/* 29 */     return this.builder.size();
/*    */   }
/*    */   public boolean containsEntry(@NotNull Map.Entry element) {
/* 32 */     Intrinsics.checkNotNullParameter(element, "element"); Object candidate = this.builder.get(element.getKey());
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 86 */     int $i$a$-let-PersistentOrderedMapBuilderEntries$containsEntry$1 = 0;
/*    */     this.builder.get(element.getKey());
/*    */     return (this.builder.get(element.getKey()) != null) ? Intrinsics.areEqual(candidate, element.getValue()) : ((element.getValue() == null && this.builder.containsKey(element.getKey())));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\PersistentOrderedMapBuilderEntries.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */