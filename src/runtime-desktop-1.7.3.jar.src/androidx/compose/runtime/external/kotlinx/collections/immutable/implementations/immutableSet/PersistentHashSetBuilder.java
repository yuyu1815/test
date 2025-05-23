/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\004\n\002\020\036\n\002\b\002\n\002\020\002\n\002\b\003\n\002\020)\n\002\b\004\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\023\022\f\020\004\032\b\022\004\022\0028\0000\005¢\006\002\020\006J\025\020\031\032\0020\0322\006\020\033\032\0028\000H\026¢\006\002\020\034J\026\020\035\032\0020\0322\f\020\036\032\b\022\004\022\0028\0000\037H\026J\016\020 \032\b\022\004\022\0028\0000\005H\026J\b\020!\032\0020\"H\026J\026\020#\032\0020\0322\006\020\033\032\0028\000H\002¢\006\002\020\034J\026\020$\032\0020\0322\f\020\036\032\b\022\004\022\0028\0000\037H\026J\017\020%\032\b\022\004\022\0028\0000&H\002J\025\020'\032\0020\0322\006\020\033\032\0028\000H\026¢\006\002\020\034J\026\020(\032\0020\0322\f\020\036\032\b\022\004\022\0028\0000\037H\026J\026\020)\032\0020\0322\f\020\036\032\b\022\004\022\0028\0000\037H\026R\036\020\t\032\0020\b2\006\020\007\032\0020\b@BX\016¢\006\b\n\000\032\004\b\n\020\013R*\020\r\032\b\022\004\022\0028\0000\f2\f\020\007\032\b\022\004\022\0028\0000\f@BX\016¢\006\b\n\000\032\004\b\016\020\017R\036\020\021\032\0020\0202\006\020\007\032\0020\020@BX\016¢\006\b\n\000\032\004\b\022\020\023R\024\020\004\032\b\022\004\022\0028\0000\005X\016¢\006\002\n\000R$\020\025\032\0020\b2\006\020\024\032\0020\b@VX\016¢\006\016\n\000\032\004\b\026\020\013\"\004\b\027\020\030¨\006*"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "E", "Lkotlin/collections/AbstractMutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "set", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;)V", "<set-?>", "", "modCount", "getModCount$runtime", "()I", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "getNode$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "getOwnership$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "value", "size", "getSize", "setSize", "(I)V", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "build", "clear", "", "contains", "containsAll", "iterator", "", "remove", "removeAll", "retainAll", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class PersistentHashSetBuilder<E> extends AbstractMutableSet<E> implements PersistentSet.Builder<E> { @NotNull
/*     */   private PersistentHashSet<E> set; @NotNull
/*     */   private MutabilityOwnership ownership;
/*     */   @NotNull
/*     */   private TrieNode<E> node;
/*     */   private int modCount;
/*     */   private int size;
/*     */   public static final int $stable = 8;
/*     */   
/*  12 */   public PersistentHashSetBuilder(@NotNull PersistentHashSet<E> set) { this.set = set;
/*  13 */     this.ownership = new MutabilityOwnership();
/*     */     
/*  15 */     this.node = this.set.getNode$runtime();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  21 */     this.size = this.set.size(); } @NotNull public final MutabilityOwnership getOwnership$runtime() { return this.ownership; } public int getSize() { return this.size; }
/*     */   @NotNull public final TrieNode<E> getNode$runtime() { return this.node; }
/*  23 */   public final int getModCount$runtime() { return this.modCount; } public void setSize(int value) { this.size = value;
/*  24 */     int i = this.modCount; this.modCount = i + 1; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public PersistentHashSet<E> build() {
/*  31 */     this.ownership = new MutabilityOwnership();
/*  32 */     this.set = (this.node == this.set.getNode$runtime()) ? this.set : new PersistentHashSet<>(this.node, size());
/*     */     
/*  34 */     return this.set;
/*     */   }
/*     */   
/*     */   public boolean contains(Object element) {
/*  38 */     return this.node.contains((element != null) ? element.hashCode() : 0, (E)element, 0);
/*     */   }
/*     */   
/*     */   public boolean add(Object element) {
/*  42 */     int size = size();
/*  43 */     this.node = this.node.mutableAdd((element != null) ? element.hashCode() : 0, (E)element, 0, this);
/*  44 */     return (size != size());
/*     */   }
/*     */   
/*     */   public boolean addAll(@NotNull Collection elements) {
/*  48 */     Intrinsics.checkNotNullParameter(elements, "elements"); if (((elements instanceof PersistentHashSet) ? elements : null) == null) { (elements instanceof PersistentHashSet) ? elements : null; (elements instanceof PersistentHashSetBuilder) ? (Object<E>)elements : null; }  PersistentHashSet<E> set = (((elements instanceof PersistentHashSetBuilder) ? (Object<E>)elements : null) != null) ? ((elements instanceof PersistentHashSetBuilder) ? (Object<E>)elements : null).build() : null;
/*  49 */     if (set != null) {
/*  50 */       DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
/*  51 */       int size = size();
/*  52 */       TrieNode<E> result = this.node.mutableAddAll(set.getNode$runtime(), 0, deltaCounter, this);
/*  53 */       int newSize = size + elements.size() - deltaCounter.getCount();
/*  54 */       if (size != newSize) {
/*  55 */         this.node = result;
/*  56 */         setSize(newSize);
/*     */       } 
/*  58 */       return (size != size());
/*     */     } 
/*  60 */     return super.addAll(elements);
/*     */   }
/*     */   
/*     */   public boolean retainAll(@NotNull Collection elements) {
/*  64 */     Intrinsics.checkNotNullParameter(elements, "elements"); if (((elements instanceof PersistentHashSet) ? elements : null) == null) { (elements instanceof PersistentHashSet) ? elements : null; (elements instanceof PersistentHashSetBuilder) ? (Object<E>)elements : null; }  PersistentHashSet<E> set = (((elements instanceof PersistentHashSetBuilder) ? (Object<E>)elements : null) != null) ? ((elements instanceof PersistentHashSetBuilder) ? (Object<E>)elements : null).build() : null;
/*  65 */     if (set != null) {
/*  66 */       DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
/*  67 */       int size = size();
/*  68 */       Object result = this.node.mutableRetainAll(set.getNode$runtime(), 0, deltaCounter, this);
/*  69 */       int newSize = deltaCounter.getCount();
/*  70 */       if (newSize == 0) { clear(); }
/*  71 */       else if (newSize != size)
/*     */       
/*     */       { 
/*  74 */         Intrinsics.checkNotNull(result, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>"); this.node = (TrieNode<E>)result;
/*  75 */         setSize(newSize); }
/*     */ 
/*     */       
/*  78 */       return (size != size());
/*     */     } 
/*  80 */     return super.retainAll(elements);
/*     */   }
/*     */   
/*     */   public boolean removeAll(@NotNull Collection elements) {
/*  84 */     Intrinsics.checkNotNullParameter(elements, "elements"); if (((elements instanceof PersistentHashSet) ? elements : null) == null) { (elements instanceof PersistentHashSet) ? elements : null; (elements instanceof PersistentHashSetBuilder) ? (Object<E>)elements : null; }  PersistentHashSet<E> set = (((elements instanceof PersistentHashSetBuilder) ? (Object<E>)elements : null) != null) ? ((elements instanceof PersistentHashSetBuilder) ? (Object<E>)elements : null).build() : null;
/*  85 */     if (set != null) {
/*  86 */       DeltaCounter counter = new DeltaCounter(0, 1, null);
/*  87 */       int size = size();
/*  88 */       Object result = this.node.mutableRemoveAll(set.getNode$runtime(), 0, counter, this);
/*     */       
/*  90 */       int newSize = size - counter.getCount();
/*  91 */       if (newSize == 0) { clear(); }
/*  92 */       else if (newSize != size)
/*     */       
/*     */       { 
/*  95 */         Intrinsics.checkNotNull(result, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>"); this.node = (TrieNode<E>)result;
/*  96 */         setSize(newSize); }
/*     */ 
/*     */       
/*  99 */       return (size != size());
/*     */     } 
/* 101 */     return super.removeAll(elements);
/*     */   }
/*     */   
/*     */   public boolean containsAll(@NotNull Collection elements) {
/* 105 */     Intrinsics.checkNotNullParameter(elements, "elements"); if (elements instanceof PersistentHashSet) {
/* 106 */       return this.node.containsAll(((PersistentHashSet<E>)elements).getNode$runtime(), 0);
/*     */     }
/* 108 */     if (elements instanceof PersistentHashSetBuilder) {
/* 109 */       return this.node.containsAll(((PersistentHashSetBuilder)elements).node, 0);
/*     */     }
/* 111 */     return super.containsAll(elements);
/*     */   }
/*     */   
/*     */   public boolean remove(Object element) {
/* 115 */     int size = size();
/*     */     
/* 117 */     this.node = this.node.mutableRemove((element != null) ? element.hashCode() : 0, (E)element, 0, this);
/* 118 */     return (size != size());
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 123 */     Intrinsics.checkNotNull(TrieNode.Companion.getEMPTY$runtime(), "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>"); this.node = TrieNode.Companion.getEMPTY$runtime();
/* 124 */     setSize(0);
/*     */   }
/*     */   @NotNull
/*     */   public Iterator<E> iterator() {
/* 128 */     return new PersistentHashSetMutableIterator<>(this);
/*     */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableSet\PersistentHashSetBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */