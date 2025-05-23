/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\000\n\002\020*\n\000\n\002\020\b\n\002\b\t\n\002\020\002\n\002\b\004\n\002\020\013\n\002\b\004\b \030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\002B\025\022\006\020\003\032\0020\004\022\006\020\005\032\0020\004¢\006\002\020\006J\r\020\r\032\0020\016H\000¢\006\002\b\017J\r\020\020\032\0020\016H\000¢\006\002\b\021J\t\020\022\032\0020\023H\002J\b\020\024\032\0020\023H\026J\b\020\025\032\0020\004H\026J\b\020\026\032\0020\004H\026R\032\020\003\032\0020\004X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\nR\032\020\005\032\0020\004X\016¢\006\016\n\000\032\004\b\013\020\b\"\004\b\f\020\n¨\006\027"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "E", "", "index", "", "size", "(II)V", "getIndex", "()I", "setIndex", "(I)V", "getSize", "setSize", "checkHasNext", "", "checkHasNext$runtime", "checkHasPrevious", "checkHasPrevious$runtime", "hasNext", "", "hasPrevious", "nextIndex", "previousIndex", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public abstract class AbstractListIterator<E> implements ListIterator<E>, KMappedMarker {
/*    */   private int index;
/*    */   
/*  8 */   public AbstractListIterator(int index, int size) { this.index = index; this.size = size; } private int size; public static final int $stable = 8; public final int getIndex() { return this.index; } public final void setIndex(int <set-?>) { this.index = <set-?>; } public final int getSize() { return this.size; } public final void setSize(int <set-?>) { this.size = <set-?>; }
/*    */    public boolean hasNext() {
/* 10 */     return (this.index < this.size);
/*    */   }
/*    */   
/*    */   public boolean hasPrevious() {
/* 14 */     return (this.index > 0);
/*    */   }
/*    */   
/*    */   public int nextIndex() {
/* 18 */     return this.index;
/*    */   }
/*    */   
/*    */   public int previousIndex() {
/* 22 */     return this.index - 1;
/*    */   }
/*    */   
/*    */   public final void checkHasNext$runtime() {
/* 26 */     if (!hasNext())
/* 27 */       throw new NoSuchElementException(); 
/*    */   }
/*    */   
/*    */   public final void checkHasPrevious$runtime() {
/* 31 */     if (!hasPrevious())
/* 32 */       throw new NoSuchElementException(); 
/*    */   }
/*    */   
/*    */   public void add(Object element) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public E next() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public void remove() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public void set(Object element) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableList\AbstractListIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */