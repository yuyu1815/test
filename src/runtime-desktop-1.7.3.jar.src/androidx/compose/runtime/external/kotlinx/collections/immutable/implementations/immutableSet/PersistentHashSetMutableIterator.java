/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\000\n\002\030\002\n\002\020)\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\t\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\023\022\f\020\004\032\b\022\004\022\0028\0000\005¢\006\002\020\006J\b\020\r\032\0020\016H\002J\b\020\017\032\0020\016H\002J\024\020\020\032\0020\f2\n\020\021\032\006\022\002\b\0030\022H\002J\016\020\023\032\0028\000H\002¢\006\002\020\024J\b\020\025\032\0020\016H\026J1\020\026\032\0020\0162\006\020\027\032\0020\b2\n\020\021\032\006\022\002\b\0030\0222\006\020\030\032\0028\0002\006\020\031\032\0020\bH\002¢\006\002\020\032R\024\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\002\n\000R\016\020\007\032\0020\bX\016¢\006\002\n\000R\022\020\t\032\004\030\0018\000X\016¢\006\004\n\002\020\nR\016\020\013\032\0020\fX\016¢\006\002\n\000¨\006\033"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetMutableIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)V", "expectedModCount", "", "lastIteratedElement", "Ljava/lang/Object;", "nextWasInvoked", "", "checkForComodification", "", "checkNextWasInvoked", "isCollision", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "next", "()Ljava/lang/Object;", "remove", "resetPath", "hashCode", "element", "pathIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Ljava/lang/Object;I)V", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements Iterator<E>, KMutableIterator {
/*    */   @NotNull
/*    */   private final PersistentHashSetBuilder<E> builder;
/*    */   @Nullable
/*    */   private E lastIteratedElement;
/*    */   
/*    */   public PersistentHashSetMutableIterator(@NotNull PersistentHashSetBuilder<E> builder) {
/* 11 */     super(builder.getNode$runtime());
/*    */     
/*    */     this.builder = builder;
/* 14 */     this.expectedModCount = this.builder.getModCount$runtime();
/*    */   } private boolean nextWasInvoked; private int expectedModCount; public static final int $stable = 8;
/*    */   public E next() {
/* 17 */     checkForComodification();
/* 18 */     Object next = super.next();
/* 19 */     this.lastIteratedElement = (E)next;
/* 20 */     this.nextWasInvoked = true;
/* 21 */     return (E)next;
/*    */   }
/*    */   
/*    */   public void remove() {
/* 25 */     checkNextWasInvoked();
/* 26 */     if (hasNext()) {
/* 27 */       Object currentElement = currentElement();
/*    */       
/* 29 */       Collection collection = (Collection)this.builder; E e = this.lastIteratedElement; TypeIntrinsics.asMutableCollection(collection).remove(e);
/* 30 */       resetPath((currentElement != null) ? currentElement.hashCode() : 0, this.builder.getNode$runtime(), (E)currentElement, 0);
/*    */     } else {
/* 32 */       Collection collection = (Collection)this.builder; E e = this.lastIteratedElement; TypeIntrinsics.asMutableCollection(collection).remove(e);
/*    */     } 
/*    */     
/* 35 */     this.lastIteratedElement = null;
/* 36 */     this.nextWasInvoked = false;
/* 37 */     this.expectedModCount = this.builder.getModCount$runtime();
/*    */   }
/*    */   
/*    */   private final void resetPath(int hashCode, TrieNode<?> node, Object element, int pathIndex) {
/* 41 */     if (isCollision(node)) {
/* 42 */       int i = ArraysKt.indexOf(node.getBuffer(), element);
/* 43 */       CommonFunctionsKt.assert((i != -1));
/* 44 */       ((TrieNodeIterator)getPath().get(pathIndex)).reset(node.getBuffer(), i);
/* 45 */       setPathLastIndex(pathIndex);
/*    */       
/*    */       return;
/*    */     } 
/* 49 */     int position = 1 << TrieNodeKt.indexSegment(hashCode, pathIndex * 5);
/* 50 */     int index = node.indexOfCellAt$runtime(position);
/*    */     
/* 52 */     ((TrieNodeIterator)getPath().get(pathIndex)).reset(node.getBuffer(), index);
/*    */     
/* 54 */     Object cell = node.getBuffer()[index];
/* 55 */     if (cell instanceof TrieNode) {
/* 56 */       resetPath(hashCode, (TrieNode)cell, (E)element, pathIndex + 1);
/*    */     } else {
/*    */       
/* 59 */       setPathLastIndex(pathIndex);
/*    */     } 
/*    */   }
/*    */   
/*    */   private final boolean isCollision(TrieNode node) {
/* 64 */     return (node.getBitmap() == 0);
/*    */   }
/*    */   
/*    */   private final void checkNextWasInvoked() {
/* 68 */     if (!this.nextWasInvoked)
/* 69 */       throw new IllegalStateException(); 
/*    */   }
/*    */   
/*    */   private final void checkForComodification() {
/* 73 */     if (this.builder.getModCount$runtime() != this.expectedModCount)
/* 74 */       throw new ConcurrentModificationException(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableSet\PersistentHashSetMutableIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */