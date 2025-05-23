/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020#\n\002\020'\n\002\b\005\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\n\n\002\020\037\n\002\b\004\n\002\020\002\n\000\n\002\020\013\n\002\b\b\n\002\020$\n\002\b\003\b\020\030\000*\004\b\000\020\001*\004\b\001\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J\024\0200\032\016\022\004\022\0028\000\022\004\022\0028\0010\006H\026J\b\0201\032\00202H\026J\025\0203\032\002042\006\0205\032\0028\000H\026¢\006\002\0206J\030\0207\032\004\030\0018\0012\006\0205\032\0028\000H\002¢\006\002\0208J\037\0209\032\004\030\0018\0012\006\0205\032\0028\0002\006\020(\032\0028\001H\026¢\006\002\020:J\036\020;\032\002022\024\020<\032\020\022\006\b\001\022\0028\000\022\004\022\0028\0010=H\026J\027\020>\032\004\030\0018\0012\006\0205\032\0028\000H\026¢\006\002\0208J\033\020>\032\002042\006\0205\032\0028\0002\006\020(\032\0028\001¢\006\002\020?R&\020\b\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\n0\t8VX\004¢\006\006\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0028\0000\t8VX\004¢\006\006\032\004\b\016\020\fR\032\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\016¢\006\002\n\000R\032\020\017\032\0020\020X\016¢\006\016\n\000\032\004\b\021\020\022\"\004\b\023\020\024R&\020\025\032\016\022\004\022\0028\000\022\004\022\0028\0010\026X\016¢\006\016\n\000\032\004\b\027\020\030\"\004\b\031\020\032R\036\020\033\032\004\030\0018\001X\016¢\006\020\n\002\020 \032\004\b\034\020\035\"\004\b\036\020\037R$\020#\032\0020\"2\006\020!\032\0020\"@DX\016¢\006\016\n\000\032\004\b$\020%\"\004\b&\020'R$\020)\032\0020\0202\006\020(\032\0020\020@VX\016¢\006\016\n\000\032\004\b*\020\022\"\004\b+\020\024R\032\020,\032\b\022\004\022\0028\0010-8VX\004¢\006\006\032\004\b.\020/¨\006@"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Lkotlin/collections/AbstractMutableMap;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "modCount", "", "getModCount$runtime", "()I", "setModCount$runtime", "(I)V", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode$runtime", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "operationResult", "getOperationResult$runtime", "()Ljava/lang/Object;", "setOperationResult$runtime", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "<set-?>", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "getOwnership", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnership", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "value", "size", "getSize", "setSize", "values", "", "getValues", "()Ljava/util/Collection;", "build", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public class PersistentHashMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> { @NotNull
/*    */   private PersistentHashMap<K, V> map; @NotNull
/*    */   private MutabilityOwnership ownership; @NotNull
/*    */   private TrieNode<K, V> node; @Nullable
/*    */   private V operationResult;
/*    */   private int modCount;
/*    */   private int size;
/*    */   public static final int $stable = 8;
/*    */   
/* 12 */   public PersistentHashMapBuilder(@NotNull PersistentHashMap<K, V> map) { this.map = map;
/* 13 */     this.ownership = new MutabilityOwnership();
/*    */     
/* 15 */     this.node = this.map.getNode$runtime();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 20 */     this.size = this.map.size(); } @NotNull public final MutabilityOwnership getOwnership() { return this.ownership; } protected final void setOwnership(@NotNull MutabilityOwnership <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.ownership = <set-?>; } @NotNull public final TrieNode<K, V> getNode$runtime() { return this.node; } public final void setNode$runtime(@NotNull TrieNode<K, V> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.node = <set-?>; } public int getSize() { return this.size; }
/*    */   @Nullable public final V getOperationResult$runtime() { return this.operationResult; }
/* 22 */   public final void setOperationResult$runtime(@Nullable Object <set-?>) { this.operationResult = (V)<set-?>; } public final int getModCount$runtime() { return this.modCount; } public final void setModCount$runtime(int <set-?>) { this.modCount = <set-?>; } public void setSize(int value) { this.size = value;
/* 23 */     int i = this.modCount; this.modCount = i + 1; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public PersistentHashMap<K, V> build() {
/* 30 */     this.ownership = new MutabilityOwnership();
/* 31 */     this.map = (this.node == this.map.getNode$runtime()) ? this.map : new PersistentHashMap<>(this.node, size());
/*    */     
/* 33 */     return this.map;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Set<Map.Entry<K, V>> getEntries() {
/* 38 */     return (Set<Map.Entry<K, V>>)new PersistentHashMapBuilderEntries<>(this);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Set<K> getKeys() {
/* 43 */     return new PersistentHashMapBuilderKeys<>(this);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Collection<V> getValues() {
/* 48 */     return new PersistentHashMapBuilderValues<>(this);
/*    */   }
/*    */   
/*    */   public boolean containsKey(Object key) {
/* 52 */     return this.node.containsKey((key != null) ? key.hashCode() : 0, (K)key, 0);
/*    */   }
/*    */   @Nullable
/*    */   public V get(Object key) {
/* 56 */     return this.node.get((key != null) ? key.hashCode() : 0, (K)key, 0);
/*    */   }
/*    */   @Nullable
/*    */   public V put(Object key, Object value) {
/* 60 */     this.operationResult = null;
/* 61 */     this.node = this.node.mutablePut((key != null) ? key.hashCode() : 0, (K)key, (V)value, 0, this);
/* 62 */     return this.operationResult;
/*    */   }
/*    */   
/*    */   public void putAll(@NotNull Map from) {
/* 66 */     Intrinsics.checkNotNullParameter(from, "from"); if (((from instanceof PersistentHashMap) ? from : null) == null) { (from instanceof PersistentHashMap) ? from : null; (from instanceof PersistentHashMapBuilder) ? (Object<K, V>)from : null; }  PersistentHashMap<K, V> map = (((from instanceof PersistentHashMapBuilder) ? (Object<K, V>)from : null) != null) ? ((from instanceof PersistentHashMapBuilder) ? (Object<K, V>)from : null).build() : null;
/* 67 */     if (map != null) {
/* 68 */       DeltaCounter intersectionCounter = new DeltaCounter(0, 1, null);
/* 69 */       int oldSize = size();
/* 70 */       Intrinsics.checkNotNull(map.getNode$runtime(), "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"); this.node = this.node.mutablePutAll(map.getNode$runtime(), 0, intersectionCounter, this);
/* 71 */       int newSize = oldSize + map.size() - intersectionCounter.getCount();
/* 72 */       if (oldSize != newSize) setSize(newSize); 
/*    */     } else {
/* 74 */       super.putAll(from);
/*    */     } 
/*    */   } @Nullable
/*    */   public V remove(Object key) {
/* 78 */     this.operationResult = null;
/*    */     
/* 80 */     if (this.node.mutableRemove((key != null) ? key.hashCode() : 0, (K)key, 0, this) == null) { this.node.mutableRemove((key != null) ? key.hashCode() : 0, (K)key, 0, this); Intrinsics.checkNotNull(TrieNode.Companion.getEMPTY$runtime(), "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"); }  ((PersistentHashMapBuilder)this.node.mutableRemove((key != null) ? key.hashCode() : 0, (K)key, 0, this)).node = TrieNode.Companion.getEMPTY$runtime();
/* 81 */     return this.operationResult;
/*    */   }
/*    */   
/*    */   public final boolean remove(Object key, Object value) {
/* 85 */     int oldSize = size();
/*    */     
/* 87 */     if (this.node.mutableRemove((key != null) ? key.hashCode() : 0, (K)key, (V)value, 0, this) == null) { this.node.mutableRemove((key != null) ? key.hashCode() : 0, (K)key, (V)value, 0, this); Intrinsics.checkNotNull(TrieNode.Companion.getEMPTY$runtime(), "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"); }  ((PersistentHashMapBuilder)this.node.mutableRemove((key != null) ? key.hashCode() : 0, (K)key, (V)value, 0, this)).node = TrieNode.Companion.getEMPTY$runtime();
/* 88 */     return (oldSize != size());
/*    */   }
/*    */ 
/*    */   
/*    */   public void clear() {
/* 93 */     Intrinsics.checkNotNull(TrieNode.Companion.getEMPTY$runtime(), "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"); this.node = TrieNode.Companion.getEMPTY$runtime();
/* 94 */     setSize(0);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\PersistentHashMapBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */