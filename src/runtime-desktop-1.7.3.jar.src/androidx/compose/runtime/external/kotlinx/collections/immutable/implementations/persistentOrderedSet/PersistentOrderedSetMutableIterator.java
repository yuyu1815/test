/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\000\n\002\030\002\n\002\020)\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\002\b\005\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\023\022\f\020\004\032\b\022\004\022\0028\0000\005¢\006\002\020\006J\b\020\r\032\0020\016H\002J\b\020\017\032\0020\016H\002J\016\020\020\032\0028\000H\002¢\006\002\020\021J\b\020\022\032\0020\016H\026R\024\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\002\n\000R\016\020\007\032\0020\bX\016¢\006\002\n\000R\022\020\t\032\004\030\0018\000X\016¢\006\004\n\002\020\nR\016\020\013\032\0020\fX\016¢\006\002\n\000¨\006\023"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetMutableIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;)V", "expectedModCount", "", "lastIteratedElement", "Ljava/lang/Object;", "nextWasInvoked", "", "checkForComodification", "", "checkNextWasInvoked", "next", "()Ljava/lang/Object;", "remove", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class PersistentOrderedSetMutableIterator<E> extends PersistentOrderedSetIterator<E> implements Iterator<E>, KMutableIterator { @NotNull
/*    */   private final PersistentOrderedSetBuilder<E> builder;
/*    */   @Nullable
/*    */   private E lastIteratedElement;
/*    */   
/*    */   public PersistentOrderedSetMutableIterator(@NotNull PersistentOrderedSetBuilder<E> builder) {
/*  9 */     super(builder.getFirstElement$runtime(), (Map<E, Links>)builder.getHashMapBuilder$runtime());
/*    */     
/*    */     this.builder = builder;
/*    */     
/* 13 */     this.expectedModCount = this.builder.getHashMapBuilder$runtime().getModCount$runtime();
/*    */   } private boolean nextWasInvoked; private int expectedModCount; public static final int $stable = 8;
/*    */   public E next() {
/* 16 */     checkForComodification();
/* 17 */     Object next = super.next();
/* 18 */     this.lastIteratedElement = (E)next;
/* 19 */     this.nextWasInvoked = true;
/* 20 */     return (E)next;
/*    */   }
/*    */   
/*    */   public void remove() {
/* 24 */     checkNextWasInvoked();
/* 25 */     Collection collection = (Collection)this.builder; E e = this.lastIteratedElement; TypeIntrinsics.asMutableCollection(collection).remove(e);
/* 26 */     this.lastIteratedElement = null;
/* 27 */     this.nextWasInvoked = false;
/* 28 */     this.expectedModCount = this.builder.getHashMapBuilder$runtime().getModCount$runtime();
/* 29 */     int i = getIndex$runtime(); setIndex$runtime(i + -1);
/*    */   }
/*    */   
/*    */   private final void checkNextWasInvoked() {
/* 33 */     if (!this.nextWasInvoked)
/* 34 */       throw new IllegalStateException(); 
/*    */   }
/*    */   
/*    */   private final void checkForComodification() {
/* 38 */     if (this.builder.getHashMapBuilder$runtime().getModCount$runtime() != this.expectedModCount)
/* 39 */       throw new ConcurrentModificationException(); 
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedSet\PersistentOrderedSetMutableIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */