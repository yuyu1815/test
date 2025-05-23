/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020)\n\002\b\002\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\023\022\f\020\004\032\b\022\004\022\0028\0000\005¢\006\002\020\006J\025\020\027\032\0020\0302\006\020\031\032\0028\000H\026¢\006\002\020\032J\016\020\033\032\b\022\004\022\0028\0000\034H\026J\b\020\035\032\0020\036H\026J\026\020\037\032\0020\0302\006\020\031\032\0028\000H\002¢\006\002\020\032J\017\020 \032\b\022\004\022\0028\0000!H\002J\025\020\"\032\0020\0302\006\020\031\032\0028\000H\026¢\006\002\020\032R\034\020\007\032\004\030\0010\bX\016¢\006\016\n\000\032\004\b\t\020\n\"\004\b\013\020\fR \020\r\032\016\022\004\022\0028\000\022\004\022\0020\0170\016X\004¢\006\b\n\000\032\004\b\020\020\021R\020\020\022\032\004\030\0010\bX\016¢\006\002\n\000R\024\020\004\032\b\022\004\022\0028\0000\005X\016¢\006\002\n\000R\024\020\023\032\0020\0248VX\004¢\006\006\032\004\b\025\020\026¨\006#"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "E", "Lkotlin/collections/AbstractMutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "set", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;)V", "firstElement", "", "getFirstElement$runtime", "()Ljava/lang/Object;", "setFirstElement$runtime", "(Ljava/lang/Object;)V", "hashMapBuilder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "getHashMapBuilder$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "lastElement", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "build", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "clear", "", "contains", "iterator", "", "remove", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class PersistentOrderedSetBuilder<E> extends AbstractMutableSet<E> implements PersistentSet.Builder<E> {
/*    */   @NotNull
/*    */   private PersistentOrderedSet<E> set;
/*    */   @Nullable
/*    */   private Object firstElement;
/*    */   
/* 12 */   public PersistentOrderedSetBuilder(@NotNull PersistentOrderedSet<E> set) { this.set = set;
/* 13 */     this.firstElement = this.set.getFirstElement$runtime();
/* 14 */     this.lastElement = this.set.getLastElement$runtime();
/* 15 */     this.hashMapBuilder = this.set.getHashMap$runtime().builder(); } @Nullable private Object lastElement; @NotNull private final PersistentHashMapBuilder<E, Links> hashMapBuilder; public static final int $stable = 8; @Nullable public final Object getFirstElement$runtime() { return this.firstElement; } public final void setFirstElement$runtime(@Nullable Object <set-?>) { this.firstElement = <set-?>; } @NotNull public final PersistentHashMapBuilder<E, Links> getHashMapBuilder$runtime() { return this.hashMapBuilder; }
/*    */   
/*    */   public int getSize() {
/* 18 */     return this.hashMapBuilder.size();
/*    */   } @NotNull
/*    */   public PersistentSet<E> build() {
/* 21 */     PersistentHashMap<E, Links> newMap = this.hashMapBuilder.build();
/*    */     
/* 23 */     CommonFunctionsKt.assert((this.firstElement == this.set.getFirstElement$runtime()));
/* 24 */     CommonFunctionsKt.assert((this.lastElement == this.set.getLastElement$runtime()));
/* 25 */     this.set = (newMap == this.set.getHashMap$runtime()) ? this.set : 
/*    */       
/* 27 */       new PersistentOrderedSet<>(this.firstElement, this.lastElement, newMap);
/*    */     
/* 29 */     return this.set;
/*    */   }
/*    */   
/*    */   public boolean contains(Object element) {
/* 33 */     return this.hashMapBuilder.containsKey(element);
/*    */   }
/*    */   
/*    */   public boolean add(Object element) {
/* 37 */     if (this.hashMapBuilder.containsKey(element)) {
/* 38 */       return false;
/*    */     }
/* 40 */     if (isEmpty()) {
/* 41 */       this.firstElement = element;
/* 42 */       this.lastElement = element;
/* 43 */       ((Map)this.hashMapBuilder).put(element, new Links());
/* 44 */       return true;
/*    */     } 
/*    */     
/* 47 */     Intrinsics.checkNotNull(((Map)this.hashMapBuilder).get(this.lastElement)); Links lastLinks = (Links)((Map)this.hashMapBuilder).get(this.lastElement);
/*    */ 
/*    */     
/* 50 */     ((Map)this.hashMapBuilder).put(this.lastElement, lastLinks.withNext(element));
/* 51 */     ((Map)this.hashMapBuilder).put(element, new Links(this.lastElement));
/* 52 */     this.lastElement = element;
/*    */     
/* 54 */     return true;
/*    */   }
/*    */   public boolean remove(Object element) {
/*    */     Links links;
/* 58 */     if ((Links)this.hashMapBuilder.remove(element) == null) { (Links)this.hashMapBuilder.remove(element); return false; }
/*    */     
/* 60 */     if (links.getHasPrevious()) {
/* 61 */       Intrinsics.checkNotNull(((Map)this.hashMapBuilder).get(links.getPrevious())); Links previousLinks = (Links)((Map)this.hashMapBuilder).get(links.getPrevious());
/*    */ 
/*    */       
/* 64 */       ((Map)this.hashMapBuilder).put(links.getPrevious(), previousLinks.withNext(links.getNext()));
/*    */     } else {
/* 66 */       this.firstElement = links.getNext();
/*    */     } 
/* 68 */     if (links.getHasNext()) {
/* 69 */       Intrinsics.checkNotNull(((Map)this.hashMapBuilder).get(links.getNext())); Links nextLinks = (Links)((Map)this.hashMapBuilder).get(links.getNext());
/*    */ 
/*    */       
/* 72 */       ((Map)this.hashMapBuilder).put(links.getNext(), nextLinks.withPrevious(links.getPrevious()));
/*    */     } else {
/* 74 */       this.lastElement = links.getPrevious();
/*    */     } 
/*    */     
/* 77 */     return true;
/*    */   }
/*    */   
/*    */   public void clear() {
/* 81 */     this.hashMapBuilder.clear();
/* 82 */     this.firstElement = EndOfChain.INSTANCE;
/* 83 */     this.lastElement = EndOfChain.INSTANCE;
/*    */   }
/*    */   @NotNull
/*    */   public Iterator<E> iterator() {
/* 87 */     return new PersistentOrderedSetMutableIterator<>(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedSet\PersistentOrderedSetBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */