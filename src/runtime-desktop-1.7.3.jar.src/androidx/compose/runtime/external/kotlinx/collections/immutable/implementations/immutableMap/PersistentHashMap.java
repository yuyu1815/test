/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
/*    */ import java.util.Map;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\020&\n\002\b\t\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\005\n\002\020\"\n\002\b\005\n\002\020$\n\002\b\004\b\020\030\000 ,*\004\b\000\020\001*\004\b\001\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004:\001,B!\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006\022\006\020\007\032\0020\b¢\006\002\020\tJ\024\020\031\032\016\022\004\022\0028\000\022\004\022\0028\0010\032H\026J\024\020\033\032\016\022\004\022\0028\000\022\004\022\0028\0010\004H\026J\025\020\034\032\0020\0352\006\020\036\032\0028\000H\026¢\006\002\020\037J\032\020 \032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\f0\013H\002J\030\020!\032\004\030\0018\0012\006\020\036\032\0028\000H\002¢\006\002\020\"J\032\020\r\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\f0#H\001J)\020$\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\036\032\0028\0002\006\020%\032\0028\001H\026¢\006\002\020&J*\020'\032\016\022\004\022\0028\000\022\004\022\0028\0010\0042\024\020(\032\020\022\006\b\001\022\0028\000\022\004\022\0028\0010)H\026J!\020*\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\036\032\0028\000H\026¢\006\002\020+J)\020*\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\036\032\0028\0002\006\020%\032\0028\001H\026¢\006\002\020&R&\020\n\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\f0\0138VX\004¢\006\006\032\004\b\r\020\016R\032\020\017\032\b\022\004\022\0028\0000\0138VX\004¢\006\006\032\004\b\020\020\016R \020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\023\020\024R\032\020\025\032\b\022\004\022\0028\0010\0268VX\004¢\006\006\032\004\b\027\020\030¨\006-"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "size", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "entries", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "keys", "getKeys", "getNode$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getSize", "()I", "values", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "clear", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "createEntries", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "putAll", "m", "", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Companion", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nPersistentHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,85:1\n53#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n*L\n69#1:86\n*E\n"})
/*    */ public class PersistentHashMap<K, V> extends AbstractMap<K, V> implements PersistentMap<K, V> {
/*    */   @NotNull
/* 13 */   public final TrieNode<K, V> getNode$runtime() { return this.node; } public PersistentHashMap(@NotNull TrieNode<K, V> node, int size) { this.node = node;
/* 14 */     this.size = size; } public int getSize() { return this.size; }
/*    */   
/*    */   @NotNull
/*    */   public ImmutableSet<K> getKeys() {
/* 18 */     return new PersistentHashMapKeys<>(this);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public ImmutableCollection<V> getValues() {
/* 23 */     return new PersistentHashMapValues<>(this);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public ImmutableSet<Map.Entry<K, V>> getEntries() {
/* 28 */     return createEntries();
/*    */   }
/*    */   
/*    */   private final ImmutableSet<Map.Entry<K, V>> createEntries() {
/* 32 */     return (ImmutableSet)new PersistentHashMapEntries<>(this);
/*    */   }
/*    */   
/*    */   @PublishedApi
/*    */   @NotNull
/*    */   public final Set<Map.Entry<K, V>> getEntries() {
/* 38 */     return (Set<Map.Entry<K, V>>)createEntries();
/*    */   }
/*    */   
/*    */   public boolean containsKey(Object key) {
/* 42 */     return this.node.containsKey((key != null) ? key.hashCode() : 0, (K)key, 0);
/*    */   }
/*    */   @Nullable
/*    */   public V get(Object key) {
/* 46 */     return this.node.get((key != null) ? key.hashCode() : 0, (K)key, 0);
/*    */   } @NotNull
/*    */   public PersistentHashMap<K, V> put(Object key, Object value) {
/*    */     TrieNode.ModificationResult<K, V> newNodeResult;
/* 50 */     if (this.node.put((key != null) ? key.hashCode() : 0, (K)key, (V)value, 0) == null) { this.node.put((key != null) ? key.hashCode() : 0, (K)key, (V)value, 0); return this; }
/* 51 */      return new PersistentHashMap(newNodeResult.getNode(), size() + newNodeResult.getSizeDelta());
/*    */   }
/*    */   @NotNull
/*    */   public PersistentHashMap<K, V> remove(Object key) {
/* 55 */     TrieNode<K, V> newNode = this.node.remove((key != null) ? key.hashCode() : 0, (K)key, 0);
/* 56 */     if (this.node == newNode) return this; 
/* 57 */     if (newNode == null) return Companion.emptyOf$runtime(); 
/* 58 */     return new PersistentHashMap(newNode, size() - 1);
/*    */   }
/*    */   @NotNull
/*    */   public PersistentHashMap<K, V> remove(Object key, Object value) {
/* 62 */     TrieNode<K, V> newNode = this.node.remove((key != null) ? key.hashCode() : 0, (K)key, (V)value, 0);
/* 63 */     if (this.node == newNode) return this; 
/* 64 */     if (newNode == null) return Companion.emptyOf$runtime(); 
/* 65 */     return new PersistentHashMap(newNode, size() - 1);
/*    */   }
/*    */   @NotNull
/*    */   public PersistentMap<K, V> putAll(@NotNull Map m) {
/* 69 */     Intrinsics.checkNotNullParameter(m, "m"); PersistentMap $this$mutate$iv = this; int $i$f$mutate = 0;
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
/* 86 */     Intrinsics.checkNotNull($this$mutate$iv, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>"); PersistentMap.Builder builder = $this$mutate$iv.builder(); Map it = (Map)builder; int $i$a$-mutate-PersistentHashMap$putAll$1 = 0; it.putAll(m); return builder.build();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PersistentMap<K, V> clear() {
/*    */     return Companion.emptyOf$runtime();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PersistentHashMapBuilder<K, V> builder() {
/*    */     return new PersistentHashMapBuilder<>(this);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\001\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J%\020\006\032\016\022\004\022\002H\007\022\004\022\002H\b0\004\"\004\b\002\020\007\"\004\b\003\020\bH\000¢\006\002\b\tR\032\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "emptyOf", "K", "V", "emptyOf$runtime", "runtime"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final <K, V> PersistentHashMap<K, V> emptyOf$runtime() {
/*    */       Intrinsics.checkNotNull(PersistentHashMap.EMPTY, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
/*    */       return PersistentHashMap.EMPTY;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final TrieNode<K, V> node;
/*    */   private final int size;
/*    */   public static final int $stable = 8;
/*    */   @NotNull
/*    */   private static final PersistentHashMap EMPTY = new PersistentHashMap(TrieNode.Companion.getEMPTY$runtime(), 0);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\PersistentHashMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */