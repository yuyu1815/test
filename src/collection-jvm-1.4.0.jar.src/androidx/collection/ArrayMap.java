/*     */ package androidx.collection;
/*     */ 
/*     */ import androidx.annotation.NonNull;
/*     */ import androidx.annotation.Nullable;
/*     */ import androidx.collection.internal.ContainerHelpersKt;
/*     */ import java.lang.reflect.Array;
/*     */ import java.util.AbstractSet;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.NoSuchElementException;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ArrayMap<K, V>
/*     */   extends SimpleArrayMap<K, V>
/*     */   implements Map<K, V>
/*     */ {
/*     */   @Nullable
/*     */   EntrySet mEntrySet;
/*     */   @Nullable
/*     */   KeySet mKeySet;
/*     */   @Nullable
/*     */   ValueCollection mValues;
/*     */   
/*     */   public ArrayMap() {}
/*     */   
/*     */   public ArrayMap(int capacity) {
/*  79 */     super(capacity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayMap(@Nullable SimpleArrayMap<? extends K, ? extends V> map) {
/*  87 */     super(map);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean containsAll(@NonNull Collection<?> collection) {
/*  98 */     for (Object o : collection) {
/*  99 */       if (!containsKey(o)) {
/* 100 */         return false;
/*     */       }
/*     */     } 
/* 103 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean containsKey(@Nullable Object key) {
/* 115 */     return super.containsKey((K)key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean containsValue(@Nullable Object value) {
/* 128 */     return super.containsValue((V)value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public V get(@Nullable Object key) {
/* 141 */     return super.get((K)key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public V remove(@Nullable Object key) {
/* 154 */     return super.remove((K)key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void putAll(@NonNull Map<? extends K, ? extends V> map) {
/* 164 */     ensureCapacity(size() + map.size());
/* 165 */     for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
/* 166 */       put(entry.getKey(), entry.getValue());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeAll(@NonNull Collection<?> collection) {
/* 177 */     int oldSize = size();
/* 178 */     for (Object o : collection) {
/* 179 */       remove(o);
/*     */     }
/* 181 */     return (oldSize != size());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean retainAll(@NonNull Collection<?> collection) {
/* 192 */     int oldSize = size();
/* 193 */     for (int i = size() - 1; i >= 0; i--) {
/* 194 */       if (!collection.contains(keyAt(i))) {
/* 195 */         removeAt(i);
/*     */       }
/*     */     } 
/* 198 */     return (oldSize != size());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NonNull
/*     */   public Set<Map.Entry<K, V>> entrySet() {
/* 217 */     Set<Map.Entry<K, V>> entrySet = this.mEntrySet;
/* 218 */     if (entrySet == null) {
/* 219 */       entrySet = this.mEntrySet = new EntrySet();
/*     */     }
/* 221 */     return entrySet;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NonNull
/*     */   public Set<K> keySet() {
/* 234 */     Set<K> keySet = this.mKeySet;
/* 235 */     if (keySet == null) {
/* 236 */       keySet = this.mKeySet = new KeySet();
/*     */     }
/* 238 */     return keySet;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NonNull
/*     */   public Collection<V> values() {
/* 251 */     Collection<V> values = this.mValues;
/* 252 */     if (values == null) {
/* 253 */       values = this.mValues = new ValueCollection();
/*     */     }
/* 255 */     return values;
/*     */   }
/*     */   
/*     */   final class EntrySet
/*     */     extends AbstractSet<Map.Entry<K, V>> {
/*     */     @NonNull
/*     */     public Iterator<Map.Entry<K, V>> iterator() {
/* 262 */       return new ArrayMap.MapIterator();
/*     */     }
/*     */ 
/*     */     
/*     */     public int size() {
/* 267 */       return ArrayMap.this.size();
/*     */     }
/*     */   }
/*     */   
/*     */   final class KeySet
/*     */     implements Set<K> {
/*     */     public boolean add(K object) {
/* 274 */       throw new UnsupportedOperationException();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean addAll(@NonNull Collection<? extends K> collection) {
/* 279 */       throw new UnsupportedOperationException();
/*     */     }
/*     */ 
/*     */     
/*     */     public void clear() {
/* 284 */       ArrayMap.this.clear();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean contains(Object object) {
/* 289 */       return ArrayMap.this.containsKey(object);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean containsAll(@NonNull Collection<?> collection) {
/* 294 */       return ArrayMap.this.containsAll(collection);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isEmpty() {
/* 299 */       return ArrayMap.this.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     @NonNull
/*     */     public Iterator<K> iterator() {
/* 305 */       return new ArrayMap.KeyIterator();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean remove(Object object) {
/* 311 */       int index = ArrayMap.this.indexOfKey(object);
/* 312 */       if (index >= 0) {
/* 313 */         ArrayMap.this.removeAt(index);
/* 314 */         return true;
/*     */       } 
/* 316 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean removeAll(@NonNull Collection<?> collection) {
/* 321 */       return ArrayMap.this.removeAll(collection);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean retainAll(@NonNull Collection<?> collection) {
/* 326 */       return ArrayMap.this.retainAll(collection);
/*     */     }
/*     */ 
/*     */     
/*     */     public int size() {
/* 331 */       return ArrayMap.this.size();
/*     */     }
/*     */ 
/*     */     
/*     */     @NonNull
/*     */     public Object[] toArray() {
/* 337 */       int N = ArrayMap.this.size();
/* 338 */       Object[] result = new Object[N];
/* 339 */       for (int i = 0; i < N; i++) {
/* 340 */         result[i] = ArrayMap.this.keyAt(i);
/*     */       }
/* 342 */       return result;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @NonNull
/*     */     public <T> T[] toArray(@NonNull T[] array) {
/* 349 */       int mySize = size();
/* 350 */       if (array.length < mySize) {
/* 351 */         array = (T[])Array.newInstance(array.getClass().getComponentType(), mySize);
/*     */       }
/* 353 */       for (int i = 0; i < mySize; i++) {
/* 354 */         array[i] = (T)ArrayMap.this.keyAt(i);
/*     */       }
/* 356 */       if (array.length > mySize) {
/* 357 */         array[mySize] = null;
/*     */       }
/* 359 */       return array;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object object) {
/* 364 */       return ArrayMap.equalsSetHelper(this, object);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 369 */       int result = 0;
/* 370 */       for (int i = ArrayMap.this.size() - 1; i >= 0; i--) {
/* 371 */         K obj = (K)ArrayMap.this.keyAt(i);
/* 372 */         result += (obj == null) ? 0 : obj.hashCode();
/*     */       } 
/* 374 */       return result;
/*     */     }
/*     */   }
/*     */   
/*     */   final class ValueCollection
/*     */     implements Collection<V> {
/*     */     public boolean add(V object) {
/* 381 */       throw new UnsupportedOperationException();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean addAll(@NonNull Collection<? extends V> collection) {
/* 386 */       throw new UnsupportedOperationException();
/*     */     }
/*     */ 
/*     */     
/*     */     public void clear() {
/* 391 */       ArrayMap.this.clear();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean contains(Object object) {
/* 397 */       return (ArrayMap.this.__restricted$indexOfValue(object) >= 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean containsAll(Collection<?> collection) {
/* 402 */       for (Object o : collection) {
/* 403 */         if (!contains(o)) {
/* 404 */           return false;
/*     */         }
/*     */       } 
/* 407 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isEmpty() {
/* 412 */       return ArrayMap.this.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     @NonNull
/*     */     public Iterator<V> iterator() {
/* 418 */       return new ArrayMap.ValueIterator();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean remove(Object object) {
/* 424 */       int index = ArrayMap.this.__restricted$indexOfValue(object);
/* 425 */       if (index >= 0) {
/* 426 */         ArrayMap.this.removeAt(index);
/* 427 */         return true;
/*     */       } 
/* 429 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean removeAll(@NonNull Collection<?> collection) {
/* 434 */       int N = ArrayMap.this.size();
/* 435 */       boolean changed = false;
/* 436 */       for (int i = 0; i < N; i++) {
/* 437 */         V cur = (V)ArrayMap.this.valueAt(i);
/* 438 */         if (collection.contains(cur)) {
/* 439 */           ArrayMap.this.removeAt(i);
/* 440 */           i--;
/* 441 */           N--;
/* 442 */           changed = true;
/*     */         } 
/*     */       } 
/* 445 */       return changed;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean retainAll(@NonNull Collection<?> collection) {
/* 450 */       int N = ArrayMap.this.size();
/* 451 */       boolean changed = false;
/* 452 */       for (int i = 0; i < N; i++) {
/* 453 */         V cur = (V)ArrayMap.this.valueAt(i);
/* 454 */         if (!collection.contains(cur)) {
/* 455 */           ArrayMap.this.removeAt(i);
/* 456 */           i--;
/* 457 */           N--;
/* 458 */           changed = true;
/*     */         } 
/*     */       } 
/* 461 */       return changed;
/*     */     }
/*     */ 
/*     */     
/*     */     public int size() {
/* 466 */       return ArrayMap.this.size();
/*     */     }
/*     */ 
/*     */     
/*     */     @NonNull
/*     */     public Object[] toArray() {
/* 472 */       int N = ArrayMap.this.size();
/* 473 */       Object[] result = new Object[N];
/* 474 */       for (int i = 0; i < N; i++) {
/* 475 */         result[i] = ArrayMap.this.valueAt(i);
/*     */       }
/* 477 */       return result;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @NonNull
/*     */     public <T> T[] toArray(@NonNull T[] array) {
/* 484 */       int mySize = size();
/* 485 */       if (array.length < mySize) {
/* 486 */         array = (T[])Array.newInstance(array.getClass().getComponentType(), mySize);
/*     */       }
/* 488 */       for (int i = 0; i < mySize; i++) {
/* 489 */         array[i] = (T)ArrayMap.this.valueAt(i);
/*     */       }
/* 491 */       if (array.length > mySize) {
/* 492 */         array[mySize] = null;
/*     */       }
/* 494 */       return array;
/*     */     }
/*     */   }
/*     */   
/*     */   final class KeyIterator
/*     */     extends IndexBasedArrayIterator<K> {
/*     */     KeyIterator() {
/* 501 */       super(ArrayMap.this.size());
/*     */     }
/*     */ 
/*     */     
/*     */     protected K elementAt(int index) {
/* 506 */       return (K)ArrayMap.this.keyAt(index);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void removeAt(int index) {
/* 511 */       ArrayMap.this.removeAt(index);
/*     */     }
/*     */   }
/*     */   
/*     */   final class ValueIterator
/*     */     extends IndexBasedArrayIterator<V> {
/*     */     ValueIterator() {
/* 518 */       super(ArrayMap.this.size());
/*     */     }
/*     */ 
/*     */     
/*     */     protected V elementAt(int index) {
/* 523 */       return (V)ArrayMap.this.valueAt(index);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void removeAt(int index) {
/* 528 */       ArrayMap.this.removeAt(index);
/*     */     }
/*     */   }
/*     */   
/*     */   final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
/*     */     int mEnd;
/*     */     int mIndex;
/*     */     boolean mEntryValid;
/*     */     
/*     */     MapIterator() {
/* 538 */       this.mEnd = ArrayMap.this.size() - 1;
/* 539 */       this.mIndex = -1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean hasNext() {
/* 544 */       return (this.mIndex < this.mEnd);
/*     */     }
/*     */ 
/*     */     
/*     */     public Map.Entry<K, V> next() {
/* 549 */       if (!hasNext()) throw new NoSuchElementException(); 
/* 550 */       this.mIndex++;
/* 551 */       this.mEntryValid = true;
/* 552 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public void remove() {
/* 557 */       if (!this.mEntryValid) {
/* 558 */         throw new IllegalStateException();
/*     */       }
/* 560 */       ArrayMap.this.removeAt(this.mIndex);
/* 561 */       this.mIndex--;
/* 562 */       this.mEnd--;
/* 563 */       this.mEntryValid = false;
/*     */     }
/*     */ 
/*     */     
/*     */     public K getKey() {
/* 568 */       if (!this.mEntryValid) {
/* 569 */         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
/*     */       }
/*     */       
/* 572 */       return (K)ArrayMap.this.keyAt(this.mIndex);
/*     */     }
/*     */ 
/*     */     
/*     */     public V getValue() {
/* 577 */       if (!this.mEntryValid) {
/* 578 */         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
/*     */       }
/*     */       
/* 581 */       return (V)ArrayMap.this.valueAt(this.mIndex);
/*     */     }
/*     */ 
/*     */     
/*     */     public V setValue(V object) {
/* 586 */       if (!this.mEntryValid) {
/* 587 */         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
/*     */       }
/*     */       
/* 590 */       return (V)ArrayMap.this.setValueAt(this.mIndex, object);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object o) {
/* 595 */       if (!this.mEntryValid) {
/* 596 */         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
/*     */       }
/*     */       
/* 599 */       if (!(o instanceof Map.Entry)) {
/* 600 */         return false;
/*     */       }
/* 602 */       Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/* 603 */       return (ContainerHelpersKt.equal(e.getKey(), ArrayMap.this.keyAt(this.mIndex)) && 
/* 604 */         ContainerHelpersKt.equal(e.getValue(), ArrayMap.this.valueAt(this.mIndex)));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 609 */       if (!this.mEntryValid) {
/* 610 */         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
/*     */       }
/*     */       
/* 613 */       K key = (K)ArrayMap.this.keyAt(this.mIndex);
/* 614 */       V value = (V)ArrayMap.this.valueAt(this.mIndex);
/* 615 */       return ((key == null) ? 0 : key.hashCode()) ^ (
/* 616 */         (value == null) ? 0 : value.hashCode());
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 621 */       return (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
/*     */     }
/*     */   }
/*     */   
/*     */   static <T> boolean equalsSetHelper(Set<T> set, Object object) {
/* 626 */     if (set == object) {
/* 627 */       return true;
/*     */     }
/* 629 */     if (object instanceof Set) {
/* 630 */       Set<?> s = (Set)object;
/*     */       
/*     */       try {
/* 633 */         return (set.size() == s.size() && set.containsAll(s));
/* 634 */       } catch (NullPointerException|ClassCastException nullPointerException) {}
/*     */     } 
/*     */     
/* 637 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\ArrayMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */