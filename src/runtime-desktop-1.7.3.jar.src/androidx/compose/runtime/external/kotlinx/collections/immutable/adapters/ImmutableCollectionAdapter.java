/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Collection;
/*    */ import kotlin.jvm.internal.CollectionToArray;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\000\n\002\030\002\n\002\020\036\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\000\n\002\b\003\n\002\020(\n\000\n\002\020\016\n\000\b\020\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\023\022\f\020\004\032\b\022\004\022\0028\0000\003¢\006\002\020\005J\026\020\n\032\0020\0132\006\020\f\032\0028\000H\003¢\006\002\020\rJ\027\020\016\032\0020\0132\f\020\017\032\b\022\004\022\0028\0000\003H\001J\023\020\020\032\0020\0132\b\020\021\032\004\030\0010\022H\002J\b\020\023\032\0020\007H\026J\t\020\024\032\0020\013H\001J\017\020\025\032\b\022\004\022\0028\0000\026H\003J\b\020\027\032\0020\030H\026R\024\020\004\032\b\022\004\022\0028\0000\003X\004¢\006\002\n\000R\022\020\006\032\0020\007X\005¢\006\006\032\004\b\b\020\t¨\006\031"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableCollectionAdapter;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "", "impl", "(Ljava/util/Collection;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "equals", "other", "", "hashCode", "isEmpty", "iterator", "", "toString", "", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public class ImmutableCollectionAdapter<E> implements ImmutableCollection<E>, Collection<E>, KMappedMarker {
/*    */   @NotNull
/*    */   private final Collection<E> impl;
/*    */   
/* 16 */   public ImmutableCollectionAdapter(@NotNull Collection<E> impl) { this.impl = impl; } public static final int $stable = 8; public boolean equals(@Nullable Object other) {
/* 17 */     return this.impl.equals(other); }
/* 18 */   public int hashCode() { return this.impl.hashCode(); } @NotNull
/* 19 */   public String toString() { return this.impl.toString(); }
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
/*    */   public boolean isEmpty() {
/*    */     return this.impl.isEmpty();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Iterator<E> iterator() {
/*    */     return this.impl.iterator();
/*    */   }
/*    */   
/*    */   public boolean add(Object element) {
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
/*    */   public boolean removeIf(Predicate p0) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean retainAll(Collection elements) {
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\adapters\ImmutableCollectionAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */