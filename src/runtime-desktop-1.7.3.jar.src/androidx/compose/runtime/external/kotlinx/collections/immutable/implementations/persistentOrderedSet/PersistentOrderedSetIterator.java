/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\000\n\002\020(\n\000\n\002\020\000\n\000\n\002\020$\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\007\n\002\020\002\n\000\n\002\020\013\n\002\b\003\b\020\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B#\022\b\020\003\032\004\030\0010\004\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0020\0070\006¢\006\002\020\bJ\b\020\021\032\0020\022H\002J\t\020\023\032\0020\024H\002J\016\020\025\032\0028\000H\002¢\006\002\020\026R\032\020\t\032\0020\nX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R \020\005\032\016\022\004\022\0028\000\022\004\022\0020\0070\006X\004¢\006\b\n\000\032\004\b\017\020\020R\020\020\003\032\004\030\0010\004X\016¢\006\002\n\000¨\006\027"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "E", "", "nextElement", "", "map", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "(Ljava/lang/Object;Ljava/util/Map;)V", "index", "", "getIndex$runtime", "()I", "setIndex$runtime", "(I)V", "getMap$runtime", "()Ljava/util/Map;", "checkHasNext", "", "hasNext", "", "next", "()Ljava/lang/Object;", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public class PersistentOrderedSetIterator<E> implements Iterator<E>, KMappedMarker { @Nullable
/*    */   private Object nextElement; @NotNull
/*    */   private final Map<E, Links> map;
/*    */   
/*  8 */   public PersistentOrderedSetIterator(@Nullable Object nextElement, @NotNull Map<E, Links> map) { this.nextElement = nextElement;
/*  9 */     this.map = map; } private int index; public static final int $stable = 8; @NotNull public final Map<E, Links> getMap$runtime() { return this.map; }
/* 10 */   public final int getIndex$runtime() { return this.index; } public final void setIndex$runtime(int <set-?>) { this.index = <set-?>; }
/*    */   
/*    */   public boolean hasNext() {
/* 13 */     return (this.index < this.map.size());
/*    */   }
/*    */   
/*    */   public E next() {
/* 17 */     checkHasNext();
/*    */ 
/*    */     
/* 20 */     Object result = this.nextElement;
/* 21 */     int i = this.index; this.index = i + 1;
/* 22 */     if (this.map.get(result) == null) { this.map.get(result); this.map.get(result); int $i$a$-getOrElse-PersistentOrderedSetIterator$next$1 = 0; throw new ConcurrentModificationException("Hash code of an element (" + result + ") has changed after it was added to the persistent set."); }  ((PersistentOrderedSetIterator)this.map.get(result)).nextElement = this.map.get(result)
/*    */       
/* 24 */       .getNext();
/* 25 */     return (E)result;
/*    */   }
/*    */   
/*    */   private final void checkHasNext() {
/* 29 */     if (!hasNext())
/* 30 */       throw new NoSuchElementException(); 
/*    */   }
/*    */   
/*    */   public void remove() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedSet\PersistentOrderedSetIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */