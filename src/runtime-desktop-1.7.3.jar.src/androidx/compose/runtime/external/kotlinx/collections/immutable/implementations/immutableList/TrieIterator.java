/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\020\000\n\000\n\002\020\b\n\002\b\004\n\002\020\013\n\002\b\005\n\002\020\002\n\002\b\b\b\000\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\002B-\022\016\020\003\032\n\022\006\022\004\030\0010\0050\004\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007\022\006\020\t\032\0020\007¢\006\002\020\nJ\r\020\017\032\0028\000H\002¢\006\002\020\020J\030\020\021\032\0020\0222\006\020\006\032\0020\0072\006\020\023\032\0020\007H\002J\020\020\024\032\0020\0222\006\020\025\032\0020\007H\002J\016\020\026\032\0028\000H\002¢\006\002\020\020J\r\020\027\032\0028\000H\026¢\006\002\020\020J7\020\030\032\0020\0222\016\020\003\032\n\022\006\022\004\030\0010\0050\0042\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007H\000¢\006\004\b\031\020\nR\016\020\t\032\0020\007X\016¢\006\002\n\000R\016\020\013\032\0020\fX\016¢\006\002\n\000R\030\020\r\032\n\022\006\022\004\030\0010\0050\004X\016¢\006\004\n\002\020\016¨\006\032"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "root", "", "", "index", "", "size", "height", "([Ljava/lang/Object;III)V", "isInRightEdge", "", "path", "[Ljava/lang/Object;", "elementAtCurrentIndex", "()Ljava/lang/Object;", "fillPath", "", "startLevel", "fillPathIfNeeded", "indexPredicate", "next", "previous", "reset", "reset$runtime", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class TrieIterator<E> extends AbstractListIterator<E> {
/*    */   private int height;
/*    */   @NotNull
/*    */   private Object[] path;
/*    */   
/*    */   public TrieIterator(@NotNull Object[] root, int index, int size, int height) {
/* 11 */     super(index, size); this.height = height;
/* 12 */     this.path = new Object[this.height];
/* 13 */     this.isInRightEdge = (index == size);
/*    */ 
/*    */     
/* 16 */     this.path[0] = root;
/* 17 */     fillPath(index - (this.isInRightEdge ? 1 : 0), 1);
/*    */   }
/*    */   private boolean isInRightEdge; public static final int $stable = 8;
/*    */   public final void reset$runtime(@NotNull Object[] root, int index, int size, int height) {
/* 21 */     Intrinsics.checkNotNullParameter(root, "root"); setIndex(index);
/* 22 */     setSize(size);
/* 23 */     this.height = height;
/* 24 */     if (this.path.length < height) this.path = new Object[height]; 
/* 25 */     this.path[0] = root;
/* 26 */     this.isInRightEdge = (index == size);
/*    */     
/* 28 */     fillPath(index - (this.isInRightEdge ? 1 : 0), 1);
/*    */   }
/*    */   
/*    */   private final void fillPath(int index, int startLevel) {
/* 32 */     int shift = (this.height - startLevel) * 5;
/* 33 */     int i = startLevel;
/* 34 */     while (i < this.height) {
/*    */       
/* 36 */       Intrinsics.checkNotNull(this.path[i - 1], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"); this.path[i] = ((Object[])this.path[i - 1])[UtilsKt.indexSegment(index, shift)]; shift -= 5;
/* 37 */       i++;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private final void fillPathIfNeeded(int indexPredicate) {
/* 44 */     int shift = 0;
/* 45 */     for (; UtilsKt.indexSegment(getIndex(), shift) == indexPredicate; shift += 5);
/*    */ 
/*    */ 
/*    */     
/* 49 */     if (shift > 0) {
/* 50 */       int level = this.height - 1 - shift / 5;
/* 51 */       fillPath(getIndex(), level + 1);
/*    */     } 
/*    */   }
/*    */   
/*    */   private final E elementAtCurrentIndex() {
/* 56 */     int leafBufferIndex = getIndex() & 0x1F;
/*    */     
/* 58 */     Intrinsics.checkNotNull(this.path[this.height - 1], "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>"); return (E)((Object[])this.path[this.height - 1])[leafBufferIndex];
/*    */   }
/*    */   
/*    */   public E next() {
/* 62 */     if (!hasNext()) {
/* 63 */       throw new NoSuchElementException();
/*    */     }
/*    */     
/* 66 */     Object result = elementAtCurrentIndex();
/* 67 */     setIndex(getIndex() + 1);
/*    */     
/* 69 */     if (getIndex() == getSize()) {
/* 70 */       this.isInRightEdge = true;
/* 71 */       return (E)result;
/*    */     } 
/*    */     
/* 74 */     fillPathIfNeeded(0);
/*    */     
/* 76 */     return (E)result;
/*    */   }
/*    */   
/*    */   public E previous() {
/* 80 */     if (!hasPrevious()) {
/* 81 */       throw new NoSuchElementException();
/*    */     }
/*    */     
/* 84 */     setIndex(getIndex() - 1);
/*    */     
/* 86 */     if (this.isInRightEdge) {
/* 87 */       this.isInRightEdge = false;
/* 88 */       return elementAtCurrentIndex();
/*    */     } 
/*    */     
/* 91 */     fillPathIfNeeded(31);
/*    */     
/* 93 */     return elementAtCurrentIndex();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableList\TrieIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */