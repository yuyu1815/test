/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\b\002\n\002\020(\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020$\n\002\b\002\n\002\020\b\n\002\b\t\n\002\020\013\n\002\b\002\b\020\030\000*\004\b\000\020\001*\004\b\001\020\0022\016\022\n\022\b\022\004\022\002H\0020\0040\003B)\022\b\020\005\032\004\030\0010\006\022\030\020\007\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0040\b¢\006\002\020\tJ\t\020\024\032\0020\025H\002J\017\020\026\032\b\022\004\022\0028\0010\004H\002R \020\007\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0040\bX\004¢\006\002\n\000R\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017R\034\020\005\032\004\030\0010\006X\016¢\006\016\n\000\032\004\b\020\020\021\"\004\b\022\020\023¨\006\027"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "nextKey", "", "hashMap", "", "(Ljava/lang/Object;Ljava/util/Map;)V", "index", "", "getIndex$runtime", "()I", "setIndex$runtime", "(I)V", "getNextKey$runtime", "()Ljava/lang/Object;", "setNextKey$runtime", "(Ljava/lang/Object;)V", "hasNext", "", "next", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMappedMarker {
/*    */   @Nullable
/*    */   private Object nextKey;
/*    */   @NotNull
/*    */   private final Map<K, LinkedValue<V>> hashMap;
/*    */   
/* 11 */   public PersistentOrderedMapLinksIterator(@Nullable Object nextKey, @NotNull Map<K, LinkedValue<V>> hashMap) { this.nextKey = nextKey;
/* 12 */     this.hashMap = hashMap; }
/*    */   private int index;
/* 14 */   public static final int $stable = 8; @Nullable public final Object getNextKey$runtime() { return this.nextKey; } public final void setNextKey$runtime(@Nullable Object <set-?>) { this.nextKey = <set-?>; } public final int getIndex$runtime() { return this.index; } public final void setIndex$runtime(int <set-?>) { this.index = <set-?>; }
/*    */   
/*    */   public boolean hasNext() {
/* 17 */     return (this.index < this.hashMap.size());
/*    */   } @NotNull
/*    */   public LinkedValue<V> next() {
/*    */     LinkedValue<LinkedValue<LinkedValue<V>>> result;
/* 21 */     if (!hasNext()) {
/* 22 */       throw new NoSuchElementException();
/*    */     }
/*    */     
/* 25 */     Map<K, LinkedValue<V>> map = this.hashMap; if (map.get(this.nextKey) == null) { map.get(this.nextKey); int $i$a$-getOrElse-PersistentOrderedMapLinksIterator$next$result$1 = 0;
/* 26 */       throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map."); }
/*    */     
/* 28 */     int i = this.index; this.index = i + 1;
/* 29 */     this.nextKey = result.getNext();
/* 30 */     return (LinkedValue)result;
/*    */   }
/*    */   
/*    */   public void remove() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\PersistentOrderedMapLinksIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */