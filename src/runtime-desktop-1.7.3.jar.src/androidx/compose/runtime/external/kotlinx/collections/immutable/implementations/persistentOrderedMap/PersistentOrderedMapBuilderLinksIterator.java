/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\b\002\n\002\020)\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\013\n\002\020\013\n\000\n\002\020\002\n\002\b\006\b\020\030\000*\004\b\000\020\001*\004\b\001\020\0022\016\022\n\022\b\022\004\022\002H\0020\0040\003B#\022\b\020\005\032\004\030\0010\006\022\022\020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\b¢\006\002\020\tJ\b\020\032\032\0020\033H\002J\b\020\034\032\0020\033H\002J\b\020\035\032\0020\033H\002J\t\020\036\032\0020\031H\002J\017\020\037\032\b\022\004\022\0028\0010\004H\002J\b\020 \032\0020\033H\026R \020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\bX\004¢\006\b\n\000\032\004\b\n\020\013R\016\020\f\032\0020\rX\016¢\006\002\n\000R\032\020\016\032\0020\rX\016¢\006\016\n\000\032\004\b\017\020\020\"\004\b\021\020\022R\034\020\023\032\004\030\0010\006X\016¢\006\016\n\000\032\004\b\024\020\025\"\004\b\026\020\027R\020\020\005\032\004\030\0010\006X\016¢\006\002\n\000R\016\020\030\032\0020\031X\016¢\006\002\n\000¨\006!"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "nextKey", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "getBuilder$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "expectedModCount", "", "index", "getIndex$runtime", "()I", "setIndex$runtime", "(I)V", "lastIteratedKey", "getLastIteratedKey$runtime", "()Ljava/lang/Object;", "setLastIteratedKey$runtime", "(Ljava/lang/Object;)V", "nextWasInvoked", "", "checkForComodification", "", "checkHasNext", "checkNextWasInvoked", "hasNext", "next", "remove", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMutableIterator {
/*    */   @Nullable
/*    */   private Object nextKey;
/*    */   @NotNull
/*    */   private final PersistentOrderedMapBuilder<K, V> builder;
/*    */   @Nullable
/*    */   private Object lastIteratedKey;
/*    */   
/* 12 */   public PersistentOrderedMapBuilderLinksIterator(@Nullable Object nextKey, @NotNull PersistentOrderedMapBuilder<K, V> builder) { this.nextKey = nextKey;
/* 13 */     this.builder = builder;
/*    */ 
/*    */     
/* 16 */     this.lastIteratedKey = EndOfChain.INSTANCE;
/*    */     
/* 18 */     this.expectedModCount = this.builder.getHashMapBuilder$runtime().getModCount$runtime(); }
/* 19 */   private boolean nextWasInvoked; private int expectedModCount; private int index; public static final int $stable = 8; @NotNull public final PersistentOrderedMapBuilder<K, V> getBuilder$runtime() { return this.builder; } @Nullable public final Object getLastIteratedKey$runtime() { return this.lastIteratedKey; } public final void setLastIteratedKey$runtime(@Nullable Object <set-?>) { this.lastIteratedKey = <set-?>; } public final int getIndex$runtime() { return this.index; } public final void setIndex$runtime(int <set-?>) { this.index = <set-?>; }
/*    */   
/*    */   public boolean hasNext() {
/* 22 */     return (this.index < this.builder.size());
/*    */   }
/*    */   @NotNull
/*    */   public LinkedValue<V> next() {
/* 26 */     checkForComodification();
/* 27 */     checkHasNext();
/* 28 */     this.lastIteratedKey = this.nextKey;
/* 29 */     this.nextWasInvoked = true;
/* 30 */     int i = this.index; this.index = i + 1;
/*    */     
/* 32 */     Map map = (Map)this.builder.getHashMapBuilder$runtime(); if (map.get(this.nextKey) == null) { map.get(this.nextKey); int $i$a$-getOrElse-PersistentOrderedMapBuilderLinksIterator$next$result$1 = 0; throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map."); }  LinkedValue<V> result = (LinkedValue)map.get(this.nextKey);
/*    */ 
/*    */     
/* 35 */     this.nextKey = result.getNext();
/* 36 */     return result;
/*    */   }
/*    */   
/*    */   public void remove() {
/* 40 */     checkNextWasInvoked();
/* 41 */     Map map = (Map)this.builder; Object object = this.lastIteratedKey; TypeIntrinsics.asMutableMap(map).remove(object);
/* 42 */     this.lastIteratedKey = null;
/* 43 */     this.nextWasInvoked = false;
/* 44 */     this.expectedModCount = this.builder.getHashMapBuilder$runtime().getModCount$runtime();
/* 45 */     int i = this.index; this.index = i + -1;
/*    */   }
/*    */   
/*    */   private final void checkHasNext() {
/* 49 */     if (!hasNext())
/* 50 */       throw new NoSuchElementException(); 
/*    */   }
/*    */   
/*    */   private final void checkNextWasInvoked() {
/* 54 */     if (!this.nextWasInvoked)
/* 55 */       throw new IllegalStateException(); 
/*    */   }
/*    */   
/*    */   private final void checkForComodification() {
/* 59 */     if (this.builder.getHashMapBuilder$runtime().getModCount$runtime() != this.expectedModCount)
/* 60 */       throw new ConcurrentModificationException(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\PersistentOrderedMapBuilderLinksIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */