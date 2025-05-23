/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.AbstractList;
/*    */ import kotlin.jvm.internal.markers.KMappedMarker;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\b`\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003:\001\bJ\036\020\004\032\b\022\004\022\0028\0000\0002\006\020\005\032\0020\0062\006\020\007\032\0020\006H\026ø\001\000\002\006\n\004\b!0\001¨\006\tÀ\006\001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "subList", "fromIndex", "", "toIndex", "SubList", "runtime"})
/*    */ public interface ImmutableList<E>
/*    */   extends List<E>, ImmutableCollection<E>, KMappedMarker
/*    */ {
/*    */   @NotNull
/*    */   default ImmutableList<E> subList(int fromIndex, int toIndex) {
/* 30 */     return new SubList<>(this, fromIndex, toIndex); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\013\b\002\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B#\022\f\020\004\032\b\022\004\022\0028\0010\002\022\006\020\005\032\0020\006\022\006\020\007\032\0020\006¢\006\002\020\bJ\026\020\r\032\0028\0012\006\020\016\032\0020\006H\002¢\006\002\020\017J\036\020\020\032\b\022\004\022\0028\0010\0022\006\020\005\032\0020\0062\006\020\007\032\0020\006H\026R\016\020\t\032\0020\006X\016¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\024\020\n\032\0020\0068VX\004¢\006\006\032\004\b\013\020\fR\024\020\004\032\b\022\004\022\0028\0010\002X\004¢\006\002\n\000R\016\020\007\032\0020\006X\004¢\006\002\n\000¨\006\021"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList$SubList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Lkotlin/collections/AbstractList;", "source", "fromIndex", "", "toIndex", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;II)V", "_size", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "subList", "runtime"})
/*    */   private static final class SubList<E> extends AbstractList<E> implements ImmutableList<E> { @NotNull
/* 32 */     private final ImmutableList<E> source; private final int fromIndex; public SubList(@NotNull ImmutableList<E> source, int fromIndex, int toIndex) { this.source = source; this.fromIndex = fromIndex; this.toIndex = toIndex;
/*    */ 
/*    */ 
/*    */       
/* 36 */       ListImplementation.checkRangeIndexes$runtime(this.fromIndex, this.toIndex, this.source.size());
/* 37 */       this._size = this.toIndex - this.fromIndex; }
/*    */     
/*    */     private final int toIndex; private int _size;
/*    */     public E get(int index) {
/* 41 */       ListImplementation.checkElementIndex$runtime(index, this._size);
/*    */       
/* 43 */       return this.source.get(this.fromIndex + index);
/*    */     }
/*    */     public int getSize() {
/* 46 */       return this._size;
/*    */     } @NotNull
/*    */     public ImmutableList<E> subList(int fromIndex, int toIndex) {
/* 49 */       ListImplementation.checkRangeIndexes$runtime(fromIndex, toIndex, this._size);
/* 50 */       return new SubList(this.source, this.fromIndex + fromIndex, this.fromIndex + toIndex);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\ImmutableList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */