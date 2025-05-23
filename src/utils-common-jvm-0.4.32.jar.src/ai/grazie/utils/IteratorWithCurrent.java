/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\020(\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\005\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002:\001\021B\023\022\f\020\003\032\b\022\004\022\0028\0000\002¢\006\002\020\004J\006\020\t\032\0020\nJ\013\020\005\032\0028\000¢\006\002\020\013J\006\020\f\032\0020\rJ\006\020\016\032\0020\rJ\t\020\017\032\0020\rH\002J\016\020\020\032\0028\000H\002¢\006\002\020\013R\024\020\005\032\b\022\004\022\0028\0000\006X\016¢\006\002\n\000R\027\020\003\032\b\022\004\022\0028\0000\002¢\006\b\n\000\032\004\b\007\020\b¨\006\022"}, d2 = {"Lai/grazie/utils/IteratorWithCurrent;", "T", "", "source", "(Ljava/util/Iterator;)V", "current", "Lai/grazie/utils/IteratorWithCurrent$Item;", "getSource", "()Ljava/util/Iterator;", "advance", "", "()Ljava/lang/Object;", "done", "", "hasCurrent", "hasNext", "next", "Item", "utils-common"})
/*    */ public final class IteratorWithCurrent<T>
/*    */   implements Iterator<T>, KMappedMarker
/*    */ {
/*    */   @NotNull
/*    */   private final Iterator<T> source;
/*    */   @NotNull
/*    */   private Item<? extends T> current;
/*    */   
/*    */   public IteratorWithCurrent(@NotNull Iterator<T> source) {
/* 46 */     this.source = source;
/* 47 */     this.current = new Item.Absent<>();
/*    */   } @NotNull
/*    */   public final Iterator<T> getSource() { return this.source; } public final boolean hasCurrent() {
/* 50 */     return this.current instanceof Item.Present;
/*    */   }
/*    */   
/*    */   public boolean hasNext() {
/* 54 */     return this.source.hasNext();
/*    */   }
/*    */   
/*    */   public final boolean done() {
/* 58 */     return (!hasCurrent() && !hasNext());
/*    */   }
/*    */   
/*    */   public final T current() {
/* 62 */     Item<? extends T> current = this.current;
/* 63 */     if (!(current instanceof Item.Present)) throw new IllegalStateException("Check failed."); 
/* 64 */     return ((Item.Present)current).getItem();
/*    */   }
/*    */   
/*    */   public final void advance() {
/* 68 */     this.current = this.source.hasNext() ? 
/* 69 */       new Item.Present<>(this.source.next()) : 
/*    */       
/* 71 */       new Item.Absent<>();
/*    */   }
/*    */   
/*    */   public T next()
/*    */   {
/* 76 */     advance();
/* 77 */     return current();
/*    */   } public void remove() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\030\002\n\002\b\006\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\r\022\006\020\003\032\0028\002¢\006\002\020\004R\023\020\003\032\0028\002¢\006\n\n\002\020\007\032\004\b\005\020\006¨\006\b"}, d2 = {"Lai/grazie/utils/IteratorWithCurrent$Item$Present;", "T", "Lai/grazie/utils/IteratorWithCurrent$Item;", "item", "(Ljava/lang/Object;)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "utils-common"})
/* 81 */   public static final class Present<T> implements Item<T> { private final T item; public Present(Object item) { this.item = (T)item; } public final T getItem() { return this.item; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\005¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/utils/IteratorWithCurrent$Item$Absent;", "T", "Lai/grazie/utils/IteratorWithCurrent$Item;", "()V", "utils-common"}) public static final class Absent<T> implements Item<T> {} @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\br\030\000*\006\b\001\020\001 \0012\0020\002:\002\003\004\001\002\005\006ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lai/grazie/utils/IteratorWithCurrent$Item;", "T", "", "Absent", "Present", "Lai/grazie/utils/IteratorWithCurrent$Item$Absent;", "Lai/grazie/utils/IteratorWithCurrent$Item$Present;", "utils-common"}) private static interface Item<T> { @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\030\002\n\002\b\006\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\r\022\006\020\003\032\0028\002¢\006\002\020\004R\023\020\003\032\0028\002¢\006\n\n\002\020\007\032\004\b\005\020\006¨\006\b"}, d2 = {"Lai/grazie/utils/IteratorWithCurrent$Item$Present;", "T", "Lai/grazie/utils/IteratorWithCurrent$Item;", "item", "(Ljava/lang/Object;)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "utils-common"}) public static final class Present<T> implements Item<T> { public Present(Object item) { this.item = (T)item; } private final T item; public final T getItem() { return this.item; }
/*    */        }
/*    */ 
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\005¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/utils/IteratorWithCurrent$Item$Absent;", "T", "Lai/grazie/utils/IteratorWithCurrent$Item;", "()V", "utils-common"})
/*    */     public static final class Absent<T> implements Item<T> {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\IteratorWithCurrent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */