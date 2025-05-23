/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;
/*    */ 
/*    */ import java.util.NoSuchElementException;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\000\n\002\020\b\n\002\b\007\b\000\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\002B#\022\f\020\003\032\b\022\004\022\0028\0000\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\006¢\006\002\020\bJ\016\020\n\032\0028\000H\002¢\006\002\020\013J\r\020\f\032\0028\000H\026¢\006\002\020\013R\026\020\003\032\b\022\004\022\0028\0000\004X\004¢\006\004\n\002\020\t¨\006\r"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/BufferIterator;", "T", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "buffer", "", "index", "", "size", "([Ljava/lang/Object;II)V", "[Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "previous", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class BufferIterator<T> extends AbstractListIterator<T> {
/*    */   @NotNull
/*    */   private final T[] buffer;
/*    */   
/* 12 */   public BufferIterator(@NotNull Object[] buffer, int index, int size) { super(index, size);
/*    */     this.buffer = (T[])buffer; } public static final int $stable = 8; public T next() {
/* 14 */     if (!hasNext()) {
/* 15 */       throw new NoSuchElementException();
/*    */     }
/* 17 */     int i = getIndex(); setIndex(i + 1); return this.buffer[i];
/*    */   }
/*    */   
/*    */   public T previous() {
/* 21 */     if (!hasPrevious()) {
/* 22 */       throw new NoSuchElementException();
/*    */     }
/* 24 */     setIndex(getIndex() + -1); return this.buffer[getIndex()];
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableList\BufferIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */