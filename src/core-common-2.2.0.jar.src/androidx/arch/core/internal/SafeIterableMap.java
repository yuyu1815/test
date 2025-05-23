/*     */ package androidx.arch.core.internal;
/*     */ 
/*     */ import androidx.annotation.NonNull;
/*     */ import androidx.annotation.Nullable;
/*     */ import androidx.annotation.RestrictTo;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.WeakHashMap;
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
/*     */ @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/*     */ public class SafeIterableMap<K, V>
/*     */   implements Iterable<Map.Entry<K, V>>
/*     */ {
/*     */   Entry<K, V> mStart;
/*     */   private Entry<K, V> mEnd;
/*  43 */   private final WeakHashMap<SupportRemove<K, V>, Boolean> mIterators = new WeakHashMap<>();
/*  44 */   private int mSize = 0;
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected Entry<K, V> get(K k) {
/*  49 */     Entry<K, V> currentNode = this.mStart;
/*  50 */     while (currentNode != null && 
/*  51 */       !currentNode.mKey.equals(k))
/*     */     {
/*     */       
/*  54 */       currentNode = currentNode.mNext;
/*     */     }
/*  56 */     return currentNode;
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
/*     */   public V putIfAbsent(@NonNull K key, @NonNull V v) {
/*  69 */     Entry<K, V> entry = get(key);
/*  70 */     if (entry != null) {
/*  71 */       return entry.mValue;
/*     */     }
/*  73 */     put(key, v);
/*  74 */     return null;
/*     */   }
/*     */   
/*     */   Entry<K, V> put(@NonNull K key, @NonNull V v) {
/*  78 */     Entry<K, V> newEntry = new Entry<>(key, v);
/*  79 */     this.mSize++;
/*  80 */     if (this.mEnd == null) {
/*  81 */       this.mStart = newEntry;
/*  82 */       this.mEnd = this.mStart;
/*  83 */       return newEntry;
/*     */     } 
/*     */     
/*  86 */     this.mEnd.mNext = newEntry;
/*  87 */     newEntry.mPrevious = this.mEnd;
/*  88 */     this.mEnd = newEntry;
/*  89 */     return newEntry;
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
/*     */   public V remove(@NonNull K key) {
/* 101 */     Entry<K, V> toRemove = get(key);
/* 102 */     if (toRemove == null) {
/* 103 */       return null;
/*     */     }
/* 105 */     this.mSize--;
/* 106 */     if (!this.mIterators.isEmpty()) {
/* 107 */       for (SupportRemove<K, V> iter : this.mIterators.keySet()) {
/* 108 */         iter.supportRemove(toRemove);
/*     */       }
/*     */     }
/*     */     
/* 112 */     if (toRemove.mPrevious != null) {
/* 113 */       toRemove.mPrevious.mNext = toRemove.mNext;
/*     */     } else {
/* 115 */       this.mStart = toRemove.mNext;
/*     */     } 
/*     */     
/* 118 */     if (toRemove.mNext != null) {
/* 119 */       toRemove.mNext.mPrevious = toRemove.mPrevious;
/*     */     } else {
/* 121 */       this.mEnd = toRemove.mPrevious;
/*     */     } 
/*     */     
/* 124 */     toRemove.mNext = null;
/* 125 */     toRemove.mPrevious = null;
/* 126 */     return toRemove.mValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int size() {
/* 133 */     return this.mSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NonNull
/*     */   public Iterator<Map.Entry<K, V>> iterator() {
/* 143 */     ListIterator<K, V> iterator = new AscendingIterator<>(this.mStart, this.mEnd);
/* 144 */     this.mIterators.put(iterator, Boolean.valueOf(false));
/* 145 */     return iterator;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NonNull
/*     */   public Iterator<Map.Entry<K, V>> descendingIterator() {
/* 154 */     DescendingIterator<K, V> iterator = new DescendingIterator<>(this.mEnd, this.mStart);
/* 155 */     this.mIterators.put(iterator, Boolean.valueOf(false));
/* 156 */     return iterator;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NonNull
/*     */   public IteratorWithAdditions iteratorWithAdditions() {
/* 164 */     IteratorWithAdditions iterator = new IteratorWithAdditions();
/* 165 */     this.mIterators.put(iterator, Boolean.valueOf(false));
/* 166 */     return iterator;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Map.Entry<K, V> eldest() {
/* 174 */     return this.mStart;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Map.Entry<K, V> newest() {
/* 182 */     return this.mEnd;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/* 188 */     if (obj == this) {
/* 189 */       return true;
/*     */     }
/* 191 */     if (!(obj instanceof SafeIterableMap)) {
/* 192 */       return false;
/*     */     }
/* 194 */     SafeIterableMap map = (SafeIterableMap)obj;
/* 195 */     if (size() != map.size()) {
/* 196 */       return false;
/*     */     }
/* 198 */     Iterator<Map.Entry<K, V>> iterator1 = iterator();
/* 199 */     Iterator iterator2 = map.iterator();
/* 200 */     while (iterator1.hasNext() && iterator2.hasNext()) {
/* 201 */       Map.Entry<K, V> next1 = iterator1.next();
/* 202 */       Object next2 = iterator2.next();
/* 203 */       if ((next1 == null && next2 != null) || (next1 != null && 
/* 204 */         !next1.equals(next2))) {
/* 205 */         return false;
/*     */       }
/*     */     } 
/* 208 */     return (!iterator1.hasNext() && !iterator2.hasNext());
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 213 */     int h = 0;
/* 214 */     for (Map.Entry<K, V> kvEntry : this) {
/* 215 */       h += kvEntry.hashCode();
/*     */     }
/* 217 */     return h;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 222 */     StringBuilder builder = new StringBuilder();
/* 223 */     builder.append("[");
/* 224 */     Iterator<Map.Entry<K, V>> iterator = iterator();
/* 225 */     while (iterator.hasNext()) {
/* 226 */       builder.append(((Map.Entry)iterator.next()).toString());
/* 227 */       if (iterator.hasNext()) {
/* 228 */         builder.append(", ");
/*     */       }
/*     */     } 
/* 231 */     builder.append("]");
/* 232 */     return builder.toString();
/*     */   }
/*     */   
/*     */   private static abstract class ListIterator<K, V>
/*     */     extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {
/*     */     SafeIterableMap.Entry<K, V> mExpectedEnd;
/*     */     SafeIterableMap.Entry<K, V> mNext;
/*     */     
/*     */     ListIterator(SafeIterableMap.Entry<K, V> start, SafeIterableMap.Entry<K, V> expectedEnd) {
/* 241 */       this.mExpectedEnd = expectedEnd;
/* 242 */       this.mNext = start;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean hasNext() {
/* 247 */       return (this.mNext != null);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void supportRemove(@NonNull SafeIterableMap.Entry<K, V> entry) {
/* 253 */       if (this.mExpectedEnd == entry && entry == this.mNext) {
/* 254 */         this.mNext = null;
/* 255 */         this.mExpectedEnd = null;
/*     */       } 
/*     */       
/* 258 */       if (this.mExpectedEnd == entry) {
/* 259 */         this.mExpectedEnd = backward(this.mExpectedEnd);
/*     */       }
/*     */       
/* 262 */       if (this.mNext == entry) {
/* 263 */         this.mNext = nextNode();
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     private SafeIterableMap.Entry<K, V> nextNode() {
/* 269 */       if (this.mNext == this.mExpectedEnd || this.mExpectedEnd == null) {
/* 270 */         return null;
/*     */       }
/* 272 */       return forward(this.mNext);
/*     */     }
/*     */ 
/*     */     
/*     */     public Map.Entry<K, V> next() {
/* 277 */       Map.Entry<K, V> result = this.mNext;
/* 278 */       this.mNext = nextNode();
/* 279 */       return result;
/*     */     }
/*     */     
/*     */     abstract SafeIterableMap.Entry<K, V> forward(SafeIterableMap.Entry<K, V> param1Entry);
/*     */     
/*     */     abstract SafeIterableMap.Entry<K, V> backward(SafeIterableMap.Entry<K, V> param1Entry);
/*     */   }
/*     */   
/*     */   static class AscendingIterator<K, V> extends ListIterator<K, V> {
/*     */     AscendingIterator(SafeIterableMap.Entry<K, V> start, SafeIterableMap.Entry<K, V> expectedEnd) {
/* 289 */       super(start, expectedEnd);
/*     */     }
/*     */ 
/*     */     
/*     */     SafeIterableMap.Entry<K, V> forward(SafeIterableMap.Entry<K, V> entry) {
/* 294 */       return entry.mNext;
/*     */     }
/*     */ 
/*     */     
/*     */     SafeIterableMap.Entry<K, V> backward(SafeIterableMap.Entry<K, V> entry) {
/* 299 */       return entry.mPrevious;
/*     */     }
/*     */   }
/*     */   
/*     */   private static class DescendingIterator<K, V>
/*     */     extends ListIterator<K, V> {
/*     */     DescendingIterator(SafeIterableMap.Entry<K, V> start, SafeIterableMap.Entry<K, V> expectedEnd) {
/* 306 */       super(start, expectedEnd);
/*     */     }
/*     */ 
/*     */     
/*     */     SafeIterableMap.Entry<K, V> forward(SafeIterableMap.Entry<K, V> entry) {
/* 311 */       return entry.mPrevious;
/*     */     }
/*     */ 
/*     */     
/*     */     SafeIterableMap.Entry<K, V> backward(SafeIterableMap.Entry<K, V> entry) {
/* 316 */       return entry.mNext;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/*     */   public class IteratorWithAdditions
/*     */     extends SupportRemove<K, V>
/*     */     implements Iterator<Map.Entry<K, V>>
/*     */   {
/*     */     private SafeIterableMap.Entry<K, V> mCurrent;
/*     */ 
/*     */     
/*     */     private boolean mBeforeStart = true;
/*     */ 
/*     */ 
/*     */     
/*     */     void supportRemove(@NonNull SafeIterableMap.Entry<K, V> entry) {
/* 335 */       if (entry == this.mCurrent) {
/* 336 */         this.mCurrent = this.mCurrent.mPrevious;
/* 337 */         this.mBeforeStart = (this.mCurrent == null);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean hasNext() {
/* 343 */       if (this.mBeforeStart) {
/* 344 */         return (SafeIterableMap.this.mStart != null);
/*     */       }
/* 346 */       return (this.mCurrent != null && this.mCurrent.mNext != null);
/*     */     }
/*     */ 
/*     */     
/*     */     public Map.Entry<K, V> next() {
/* 351 */       if (this.mBeforeStart) {
/* 352 */         this.mBeforeStart = false;
/* 353 */         this.mCurrent = SafeIterableMap.this.mStart;
/*     */       } else {
/* 355 */         this.mCurrent = (this.mCurrent != null) ? this.mCurrent.mNext : null;
/*     */       } 
/* 357 */       return this.mCurrent;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/*     */   public static abstract class SupportRemove<K, V>
/*     */   {
/*     */     abstract void supportRemove(@NonNull SafeIterableMap.Entry<K, V> param1Entry);
/*     */   }
/*     */ 
/*     */   
/*     */   static class Entry<K, V>
/*     */     implements Map.Entry<K, V>
/*     */   {
/*     */     @NonNull
/*     */     final K mKey;
/*     */     
/*     */     @NonNull
/*     */     final V mValue;
/*     */     Entry<K, V> mNext;
/*     */     Entry<K, V> mPrevious;
/*     */     
/*     */     Entry(@NonNull K key, @NonNull V value) {
/* 381 */       this.mKey = key;
/* 382 */       this.mValue = value;
/*     */     }
/*     */ 
/*     */     
/*     */     @NonNull
/*     */     public K getKey() {
/* 388 */       return this.mKey;
/*     */     }
/*     */ 
/*     */     
/*     */     @NonNull
/*     */     public V getValue() {
/* 394 */       return this.mValue;
/*     */     }
/*     */ 
/*     */     
/*     */     public V setValue(V value) {
/* 399 */       throw new UnsupportedOperationException("An entry modification is not supported");
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 404 */       return (new StringBuilder()).append(this.mKey).append("=").append(this.mValue).toString();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj) {
/* 410 */       if (obj == this) {
/* 411 */         return true;
/*     */       }
/* 413 */       if (!(obj instanceof Entry)) {
/* 414 */         return false;
/*     */       }
/* 416 */       Entry entry = (Entry)obj;
/* 417 */       return (this.mKey.equals(entry.mKey) && this.mValue.equals(entry.mValue));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 422 */       return this.mKey.hashCode() ^ this.mValue.hashCode();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-common-2.2.0.jar!\androidx\arch\core\internal\SafeIterableMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */