/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\004\b\000\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\002B;\022\016\020\003\032\n\022\006\022\004\030\0010\0050\004\022\f\020\006\032\b\022\004\022\0028\0000\004\022\006\020\007\032\0020\b\022\006\020\t\032\0020\b\022\006\020\n\032\0020\b¢\006\002\020\013J\016\020\017\032\0028\000H\002¢\006\002\020\020J\r\020\021\032\0028\000H\026¢\006\002\020\020R\026\020\006\032\b\022\004\022\0028\0000\004X\004¢\006\004\n\002\020\fR\024\020\r\032\b\022\004\022\0028\0000\016X\004¢\006\002\n\000¨\006\022"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorIterator;", "T", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "root", "", "", "tail", "index", "", "size", "trieHeight", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "[Ljava/lang/Object;", "trieIterator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "next", "()Ljava/lang/Object;", "previous", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {
/*    */   @NotNull
/*    */   private final T[] tail;
/*    */   
/*    */   public PersistentVectorIterator(@NotNull Object[] root, @NotNull Object[] tail, int index, int size, int trieHeight) {
/* 12 */     super(index, size);
/*    */     
/*    */     this.tail = (T[])tail;
/*    */     
/* 16 */     int trieSize = UtilsKt.rootSize(size);
/* 17 */     int trieIndex = RangesKt.coerceAtMost(index, trieSize);
/* 18 */     this.trieIterator = new TrieIterator<>(root, trieIndex, trieSize, trieHeight);
/*    */   } @NotNull
/*    */   private final TrieIterator<T> trieIterator; public static final int $stable = 8;
/*    */   public T next() {
/* 22 */     checkHasNext$runtime();
/* 23 */     if (this.trieIterator.hasNext()) {
/* 24 */       int j = getIndex(); setIndex(j + 1);
/* 25 */       return this.trieIterator.next();
/*    */     } 
/* 27 */     int i = getIndex(); setIndex(i + 1); return this.tail[i - this.trieIterator.getSize()];
/*    */   }
/*    */   
/*    */   public T previous() {
/* 31 */     checkHasPrevious$runtime();
/* 32 */     if (getIndex() > this.trieIterator.getSize()) {
/* 33 */       setIndex(getIndex() + -1); return this.tail[getIndex() - this.trieIterator.getSize()];
/*    */     } 
/* 35 */     int i = getIndex(); setIndex(i + -1);
/* 36 */     return this.trieIterator.previous();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableList\PersistentVectorIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */