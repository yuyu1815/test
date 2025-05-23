/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.ListIterator;
/*    */ import java.util.function.UnaryOperator;
/*    */ import kotlin.jvm.internal.CollectionToArray;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.markers.KMappedMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\b\003\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\004\n\002\020\036\n\002\b\002\n\002\020\000\n\002\b\b\n\002\020(\n\002\b\002\n\002\020*\n\002\b\004\n\002\020\016\n\000\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\023\022\f\020\004\032\b\022\004\022\0028\0000\003¢\006\002\020\005J\026\020\n\032\0020\0132\006\020\f\032\0028\000H\003¢\006\002\020\rJ\027\020\016\032\0020\0132\f\020\017\032\b\022\004\022\0028\0000\020H\001J\023\020\021\032\0020\0132\b\020\022\032\004\030\0010\023H\002J\026\020\024\032\0028\0002\006\020\025\032\0020\007H\003¢\006\002\020\026J\b\020\027\032\0020\007H\026J\026\020\030\032\0020\0072\006\020\f\032\0028\000H\001¢\006\002\020\031J\t\020\032\032\0020\013H\001J\017\020\033\032\b\022\004\022\0028\0000\034H\003J\026\020\035\032\0020\0072\006\020\f\032\0028\000H\001¢\006\002\020\031J\017\020\036\032\b\022\004\022\0028\0000\037H\001J\027\020\036\032\b\022\004\022\0028\0000\0372\006\020\025\032\0020\007H\001J\036\020 \032\b\022\004\022\0028\0000\0022\006\020!\032\0020\0072\006\020\"\032\0020\007H\026J\b\020#\032\0020$H\026R\024\020\004\032\b\022\004\022\0028\0000\003X\004¢\006\002\n\000R\022\020\006\032\0020\007X\005¢\006\006\032\004\b\b\020\t¨\006%"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableListAdapter;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "impl", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "equals", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class ImmutableListAdapter<E> implements ImmutableList<E>, List<E>, KMappedMarker {
/*    */   @NotNull
/*    */   private final List<E> impl;
/*    */   public static final int $stable = 8;
/*    */   
/* 23 */   public ImmutableListAdapter(@NotNull List<E> impl) { this.impl = impl; } @NotNull
/*    */   public ImmutableList<E> subList(int fromIndex, int toIndex) {
/* 25 */     return new ImmutableListAdapter(this.impl.subList(fromIndex, toIndex));
/*    */   }
/* 27 */   public boolean equals(@Nullable Object other) { return this.impl.equals(other); }
/* 28 */   public int hashCode() { return this.impl.hashCode(); } @NotNull
/* 29 */   public String toString() { return this.impl.toString(); }
/*    */ 
/*    */   
/*    */   public int getSize() {
/*    */     return this.impl.size();
/*    */   }
/*    */   
/*    */   public boolean contains(Object element) {
/*    */     return this.impl.contains(element);
/*    */   }
/*    */   
/*    */   public boolean containsAll(@NotNull Collection<?> elements) {
/*    */     Intrinsics.checkNotNullParameter(elements, "elements");
/*    */     return this.impl.containsAll(elements);
/*    */   }
/*    */   
/*    */   public E get(int index) {
/*    */     return this.impl.get(index);
/*    */   }
/*    */   
/*    */   public int indexOf(Object element) {
/*    */     return this.impl.indexOf(element);
/*    */   }
/*    */   
/*    */   public boolean isEmpty() {
/*    */     return this.impl.isEmpty();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Iterator<E> iterator() {
/*    */     return this.impl.iterator();
/*    */   }
/*    */   
/*    */   public int lastIndexOf(Object element) {
/*    */     return this.impl.lastIndexOf(element);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public ListIterator<E> listIterator() {
/*    */     return this.impl.listIterator();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public ListIterator<E> listIterator(int index) {
/*    */     return this.impl.listIterator(index);
/*    */   }
/*    */   
/*    */   public boolean add(Object element) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public void add(int index, Object element) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean addAll(int index, Collection elements) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean addAll(Collection elements) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public void clear() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean remove(Object element) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean removeAll(Collection elements) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public E remove(int index) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public void replaceAll(UnaryOperator p0) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean retainAll(Collection elements) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public E set(int index, Object element) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public void sort(Comparator p0) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public <T> T[] toArray(Object[] array) {
/*    */     Intrinsics.checkNotNullParameter(array, "array");
/*    */     return (T[])CollectionToArray.toArray(this, array);
/*    */   }
/*    */   
/*    */   public Object[] toArray() {
/*    */     return CollectionToArray.toArray(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\adapters\ImmutableListAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */