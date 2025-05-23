/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\000\n\002\020(\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020!\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\007\n\002\020\002\n\002\b\004\b\020\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\002\020\005J\r\020\025\032\0028\000H\004¢\006\002\020\026J\b\020\027\032\0020\030H\002J\t\020\006\032\0020\007H\002J\020\020\031\032\0020\0202\006\020\032\032\0020\020H\002J\016\020\033\032\0028\000H\002¢\006\002\020\026R\030\020\006\032\0020\0078\002@\002X\016¢\006\b\n\000\022\004\b\b\020\tR \020\n\032\016\022\n\022\b\022\004\022\0028\0000\f0\013X\004¢\006\b\n\000\032\004\b\r\020\016R\032\020\017\032\0020\020X\016¢\006\016\n\000\032\004\b\021\020\022\"\004\b\023\020\024¨\006\034"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "E", "", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)V", "hasNext", "", "getHasNext$annotations", "()V", "path", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", "getPath", "()Ljava/util/List;", "pathLastIndex", "", "getPathLastIndex", "()I", "setPathLastIndex", "(I)V", "currentElement", "()Ljava/lang/Object;", "ensureNextElementIsReady", "", "moveToNextNodeWithData", "pathIndex", "next", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public class PersistentHashSetIterator<E> implements Iterator<E>, KMappedMarker {
/*    */   @NotNull
/*    */   private final List<TrieNodeIterator<E>> path;
/*    */   private int pathLastIndex;
/*    */   private boolean hasNext;
/*    */   public static final int $stable = 8;
/*    */   
/* 11 */   public PersistentHashSetIterator(@NotNull TrieNode node) { TrieNodeIterator[] arrayOfTrieNodeIterator = new TrieNodeIterator[1]; arrayOfTrieNodeIterator[0] = new TrieNodeIterator(); this.path = CollectionsKt.mutableListOf((Object[])arrayOfTrieNodeIterator);
/*    */ 
/*    */ 
/*    */     
/* 15 */     this.hasNext = true;
/*    */ 
/*    */     
/* 18 */     TrieNodeIterator.reset$default(this.path.get(0), node.getBuffer(), 0, 2, null);
/* 19 */     this.pathLastIndex = 0;
/* 20 */     ensureNextElementIsReady(); }
/*    */   @NotNull
/*    */   protected final List<TrieNodeIterator<E>> getPath() {
/*    */     return this.path;
/* 24 */   } private final int moveToNextNodeWithData(int pathIndex) { if (((TrieNodeIterator)this.path.get(pathIndex)).hasNextElement()) {
/* 25 */       return pathIndex;
/*    */     }
/* 27 */     if (((TrieNodeIterator)this.path.get(pathIndex)).hasNextNode()) {
/* 28 */       TrieNode node = ((TrieNodeIterator)this.path.get(pathIndex)).currentNode();
/*    */       
/* 30 */       if (pathIndex + 1 == this.path.size()) {
/* 31 */         this.path.add(new TrieNodeIterator<>());
/*    */       }
/* 33 */       TrieNodeIterator.reset$default(this.path.get(pathIndex + 1), node.getBuffer(), 0, 2, null);
/* 34 */       return moveToNextNodeWithData(pathIndex + 1);
/*    */     } 
/* 36 */     return -1; }
/*    */   protected final int getPathLastIndex() { return this.pathLastIndex; } protected final void setPathLastIndex(int <set-?>) {
/*    */     this.pathLastIndex = <set-?>;
/*    */   } private final void ensureNextElementIsReady() {
/* 40 */     if (((TrieNodeIterator)this.path.get(this.pathLastIndex)).hasNextElement()) {
/*    */       return;
/*    */     }
/* 43 */     for (int i = this.pathLastIndex; -1 < i; i--) {
/* 44 */       int result = moveToNextNodeWithData(i);
/*    */       
/* 46 */       if (result == -1 && ((TrieNodeIterator)this.path.get(i)).hasNextCell()) {
/* 47 */         ((TrieNodeIterator)this.path.get(i)).moveToNextCell();
/* 48 */         result = moveToNextNodeWithData(i);
/*    */       } 
/* 50 */       if (result != -1) {
/* 51 */         this.pathLastIndex = result;
/*    */         return;
/*    */       } 
/* 54 */       if (i > 0) {
/* 55 */         ((TrieNodeIterator)this.path.get(i - 1)).moveToNextCell();
/*    */       }
/* 57 */       ((TrieNodeIterator)this.path.get(i)).reset(TrieNode.Companion.getEMPTY$runtime().getBuffer(), 0);
/*    */     } 
/* 59 */     this.hasNext = false;
/*    */   }
/*    */   
/*    */   public boolean hasNext() {
/* 63 */     return this.hasNext;
/*    */   }
/*    */   
/*    */   public E next() {
/* 67 */     if (!this.hasNext) {
/* 68 */       throw new NoSuchElementException();
/*    */     }
/* 70 */     Object result = ((TrieNodeIterator)this.path.get(this.pathLastIndex)).nextElement();
/* 71 */     ensureNextElementIsReady();
/* 72 */     return (E)result;
/*    */   }
/*    */   
/*    */   protected final E currentElement() {
/* 76 */     CommonFunctionsKt.assert(hasNext());
/* 77 */     return ((TrieNodeIterator<E>)this.path.get(this.pathLastIndex)).currentElement();
/*    */   }
/*    */   
/*    */   public void remove() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableSet\PersistentHashSetIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */