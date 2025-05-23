/*    */ package androidx.collection;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import java.util.NoSuchElementException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.jvm.internal.markers.KMutableIterator;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\000\n\002\020)\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\b\n\002\020\002\n\002\b\002\b \030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\025\020\n\032\0028\0002\006\020\b\032\0020\004H$¢\006\002\020\013J\t\020\f\032\0020\007H\002J\016\020\r\032\0028\000H\002¢\006\002\020\016J\b\020\017\032\0020\020H\026J\020\020\021\032\0020\0202\006\020\b\032\0020\004H$R\016\020\006\032\0020\007X\016¢\006\002\n\000R\016\020\b\032\0020\004X\016¢\006\002\n\000R\016\020\t\032\0020\004X\016¢\006\002\n\000¨\006\022"}, d2 = {"Landroidx/collection/IndexBasedArrayIterator;", "T", "", "startingSize", "", "(I)V", "canRemove", "", "index", "size", "elementAt", "(I)Ljava/lang/Object;", "hasNext", "next", "()Ljava/lang/Object;", "remove", "", "removeAt", "collection"})
/*    */ @SourceDebugExtension({"SMAP\nIndexBasedArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
/*    */ public abstract class IndexBasedArrayIterator<T>
/*    */   implements Iterator<T>, KMutableIterator {
/*    */   private int size;
/*    */   private int index;
/*    */   private boolean canRemove;
/*    */   
/*    */   protected abstract T elementAt(int paramInt);
/*    */   
/*    */   public IndexBasedArrayIterator(int startingSize) {
/* 20 */     this.size = startingSize;
/*    */   }
/*    */ 
/*    */   
/*    */   protected abstract void removeAt(int paramInt);
/*    */   
/*    */   public boolean hasNext() {
/* 27 */     return (this.index < this.size);
/*    */   }
/*    */   public T next() {
/* 30 */     if (!hasNext()) {
/* 31 */       throw new NoSuchElementException();
/*    */     }
/*    */     
/* 34 */     Object res = elementAt(this.index);
/* 35 */     int i = this.index; this.index = i + 1;
/* 36 */     this.canRemove = true;
/* 37 */     return (T)res;
/*    */   }
/*    */   
/*    */   public void remove() {
/* 41 */     if (!this.canRemove) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 49 */       int $i$a$-check-IndexBasedArrayIterator$remove$1 = 0;
/*    */       String str = "Call next() before removing an element.";
/*    */       throw new IllegalStateException(str.toString());
/*    */     } 
/*    */     this.index--;
/*    */     removeAt(this.index);
/*    */     int i = this.size;
/*    */     this.size = i + -1;
/*    */     this.canRemove = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\IndexBasedArrayIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */