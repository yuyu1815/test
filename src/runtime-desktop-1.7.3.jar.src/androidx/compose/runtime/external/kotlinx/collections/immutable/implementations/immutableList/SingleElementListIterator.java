/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\006\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\025\022\006\020\003\032\0028\000\022\006\020\004\032\0020\005¢\006\002\020\006J\016\020\b\032\0028\000H\002¢\006\002\020\tJ\r\020\n\032\0028\000H\026¢\006\002\020\tR\020\020\003\032\0028\000X\004¢\006\004\n\002\020\007¨\006\013"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SingleElementListIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "element", "index", "", "(Ljava/lang/Object;I)V", "Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "previous", "runtime"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class SingleElementListIterator<E>
/*    */   extends AbstractListIterator<E>
/*    */ {
/*    */   private final E element;
/*    */   public static final int $stable;
/*    */   
/*    */   public SingleElementListIterator(Object element, int index) {
/* 37 */     super(index, 1); this.element = (E)element;
/*    */   } public E next() {
/* 39 */     checkHasNext$runtime();
/* 40 */     int i = getIndex(); setIndex(i + 1);
/* 41 */     return this.element;
/*    */   }
/*    */   
/*    */   public E previous() {
/* 45 */     checkHasPrevious$runtime();
/* 46 */     int i = getIndex(); setIndex(i + -1);
/* 47 */     return this.element;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableList\SingleElementListIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */