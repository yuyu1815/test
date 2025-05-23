/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArrayDeque;
/*    */ import kotlin.jvm.internal.markers.KMappedMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\020(\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\003\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0000\002¢\006\002\020\004J\t\020\t\032\0020\nH\002J\016\020\013\032\0028\000H\002¢\006\002\020\fJ\023\020\r\032\0020\0162\006\020\017\032\0028\000¢\006\002\020\020R\024\020\005\032\b\022\004\022\0028\0000\006X\004¢\006\002\n\000R\027\020\003\032\b\022\004\022\0028\0000\002¢\006\b\n\000\032\004\b\007\020\b¨\006\021"}, d2 = {"Lai/grazie/utils/PrependableIterator;", "T", "", "source", "(Ljava/util/Iterator;)V", "prepended", "Lkotlin/collections/ArrayDeque;", "getSource", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "prepend", "", "element", "(Ljava/lang/Object;)V", "utils-common"})
/*    */ public final class PrependableIterator<T>
/*    */   implements Iterator<T>, KMappedMarker
/*    */ {
/*    */   @NotNull
/*    */   private final Iterator<T> source;
/*    */   @NotNull
/*    */   private final ArrayDeque<T> prepended;
/*    */   
/*    */   public PrependableIterator(@NotNull Iterator<T> source) {
/* 21 */     this.source = source;
/* 22 */     this.prepended = new ArrayDeque();
/*    */   }
/*    */   
/* 25 */   public boolean hasNext() { return ((!((Collection)this.prepended).isEmpty()) || this.source.hasNext()); } @NotNull
/*    */   public final Iterator<T> getSource() {
/*    */     return this.source;
/*    */   } public T next() {
/* 29 */     if (this.prepended.removeFirstOrNull() == null) this.prepended.removeFirstOrNull();  return this.source.next();
/*    */   }
/*    */   
/*    */   public final void prepend(Object element) {
/* 33 */     this.prepended.addFirst(element);
/*    */   }
/*    */   
/*    */   public void remove() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\PrependableIterator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */