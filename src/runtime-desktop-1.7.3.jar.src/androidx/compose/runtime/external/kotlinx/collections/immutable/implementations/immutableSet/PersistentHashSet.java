/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
/*    */ import java.util.Collection;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\n\n\002\020\036\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020(\n\002\b\003\n\002\030\002\n\002\b\003\b\000\030\000 !*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003:\001!B\033\022\f\020\004\032\b\022\004\022\0028\0000\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\033\020\r\032\b\022\004\022\0028\0000\0032\006\020\016\032\0028\000H\026¢\006\002\020\017J\034\020\020\032\b\022\004\022\0028\0000\0032\f\020\021\032\b\022\004\022\0028\0000\022H\026J\016\020\023\032\b\022\004\022\0028\0000\024H\026J\016\020\025\032\b\022\004\022\0028\0000\003H\026J\026\020\026\032\0020\0272\006\020\016\032\0028\000H\002¢\006\002\020\030J\026\020\031\032\0020\0272\f\020\021\032\b\022\004\022\0028\0000\022H\026J\017\020\032\032\b\022\004\022\0028\0000\033H\002J\033\020\034\032\b\022\004\022\0028\0000\0032\006\020\016\032\0028\000H\026¢\006\002\020\017J\"\020\035\032\b\022\004\022\0028\0000\0032\022\020\036\032\016\022\004\022\0028\000\022\004\022\0020\0270\037H\026J\034\020\035\032\b\022\004\022\0028\0000\0032\f\020\021\032\b\022\004\022\0028\0000\022H\026J\034\020 \032\b\022\004\022\0028\0000\0032\f\020\021\032\b\022\004\022\0028\0000\022H\026R\032\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\013\020\f¨\006\""}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "E", "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "size", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)V", "getNode$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "addAll", "elements", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "clear", "contains", "", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "", "remove", "removeAll", "predicate", "Lkotlin/Function1;", "retainAll", "Companion", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nPersistentHashSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,72:1\n31#2:73\n31#2:74\n31#2:75\n31#2:76\n*S KotlinDebug\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n*L\n24#1:73\n34#1:74\n38#1:75\n42#1:76\n*E\n"})
/*    */ public final class PersistentHashSet<E> extends AbstractSet<E> implements PersistentSet<E> {
/*    */   @NotNull
/* 11 */   public final TrieNode<E> getNode$runtime() { return this.node; } public PersistentHashSet(@NotNull TrieNode<E> node, int size) { this.node = node;
/* 12 */     this.size = size; } public int getSize() { return this.size; }
/*    */    public boolean contains(Object element) {
/* 14 */     return this.node.contains((element != null) ? element.hashCode() : 0, (E)element, 0);
/*    */   }
/*    */   
/*    */   @NotNull
/* 18 */   public PersistentSet<E> add(Object element) { TrieNode<E> newNode = this.node.add((element != null) ? element.hashCode() : 0, (E)element, 0);
/* 19 */     if (this.node == newNode) return this; 
/* 20 */     return new PersistentHashSet(newNode, size() + 1); }
/*    */   @NotNull public PersistentSet<E> remove(Object element) { TrieNode<E> newNode = this.node.remove((element != null) ? element.hashCode() : 0, (E)element, 0);
/*    */     if (this.node == newNode)
/*    */       return this; 
/* 24 */     return new PersistentHashSet(newNode, size() - 1); } @NotNull public PersistentSet<E> addAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); PersistentSet $this$mutate$iv = this; int $i$f$mutate = 0;
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
/* 73 */     PersistentSet.Builder builder = $this$mutate$iv.builder(); Set it = (Set)builder; int $i$a$-mutate-PersistentHashSet$addAll$1 = 0; it.addAll(elements); return builder.build(); } @NotNull public PersistentSet<E> removeAll(@NotNull Collection<?> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); PersistentSet $this$mutate$iv = this; int $i$f$mutate = 0;
/* 74 */     PersistentSet.Builder builder = $this$mutate$iv.builder(); Set it = (Set)builder; int $i$a$-mutate-PersistentHashSet$removeAll$1 = 0; it.removeAll(elements); return builder.build(); } @NotNull public PersistentSet<E> removeAll(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); PersistentSet $this$mutate$iv = this; int $i$f$mutate = 0;
/* 75 */     PersistentSet.Builder builder = $this$mutate$iv.builder(); Set it = (Set)builder; int $i$a$-mutate-PersistentHashSet$removeAll$2 = 0; CollectionsKt.removeAll(it, predicate); return builder.build(); } @NotNull public PersistentSet<E> retainAll(@NotNull Collection<?> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); PersistentSet $this$mutate$iv = this; int $i$f$mutate = 0;
/* 76 */     PersistentSet.Builder builder = $this$mutate$iv.builder(); Set it = (Set)builder; int $i$a$-mutate-PersistentHashSet$retainAll$1 = 0; it.retainAll(elements); return builder.build(); }
/*    */ 
/*    */   
/*    */   public boolean containsAll(@NotNull Collection elements) {
/*    */     Intrinsics.checkNotNullParameter(elements, "elements");
/*    */     if (elements instanceof PersistentHashSet)
/*    */       return this.node.containsAll(((PersistentHashSet)elements).node, 0); 
/*    */     if (elements instanceof PersistentHashSetBuilder)
/*    */       return this.node.containsAll(((PersistentHashSetBuilder<E>)elements).getNode$runtime(), 0); 
/*    */     return super.containsAll(elements);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PersistentSet<E> clear() {
/*    */     return Companion.emptyOf$runtime();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Iterator<E> iterator() {
/*    */     return new PersistentHashSetIterator<>(this.node);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PersistentSet.Builder<E> builder() {
/*    */     return new PersistentHashSetBuilder<>(this);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\001\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\031\020\006\032\b\022\004\022\002H\b0\007\"\004\b\001\020\bH\000¢\006\002\b\tR\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "", "emptyOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "E", "emptyOf$runtime", "runtime"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final <E> PersistentSet<E> emptyOf$runtime() {
/*    */       return PersistentHashSet.EMPTY;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final TrieNode<E> node;
/*    */   private final int size;
/*    */   public static final int $stable = 8;
/*    */   @NotNull
/*    */   private static final PersistentHashSet EMPTY = new PersistentHashSet(TrieNode.Companion.getEMPTY$runtime(), 0);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableSet\PersistentHashSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */