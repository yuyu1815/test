/*     */ package androidx.compose.ui.text.caches;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.Arrays;
/*     */ import java.util.ConcurrentModificationException;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.JvmOverloads;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020\b\n\002\b\b\n\002\020\025\n\000\n\002\020\021\n\002\b\005\n\002\020\002\n\000\n\002\020\013\n\002\b'\n\002\020\016\n\002\b\002\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003B\021\b\027\022\b\b\002\020\004\032\0020\005¢\006\002\020\006B\035\b\026\022\024\020\007\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\000¢\006\002\020\bJ\006\020\025\032\0020\026J\023\020\027\032\0020\0302\006\020\031\032\0028\000¢\006\002\020\032J\023\020\033\032\0020\0302\006\020\034\032\0028\001¢\006\002\020\032J\016\020\035\032\0020\0262\006\020\036\032\0020\005J\023\020\037\032\0020\0302\b\020 \032\004\030\0010\003H\002J\030\020!\032\004\030\0018\0012\006\020\031\032\0028\000H\002¢\006\002\020\"J\033\020#\032\0028\0012\006\020\031\032\0028\0002\006\020$\032\0028\001¢\006\002\020%J\b\020&\032\0020\005H\026J\030\020'\032\0020\0052\006\020\031\032\0020\0032\006\020(\032\0020\005H\004J\020\020)\032\0020\0052\b\020\031\032\004\030\0010\003J\b\020*\032\0020\005H\004J\027\020+\032\0020\0052\006\020\034\032\0028\001H\000¢\006\004\b,\020-J\006\020.\032\0020\030J\023\020/\032\0028\0002\006\0200\032\0020\005¢\006\002\0201J\035\0202\032\004\030\0018\0012\006\020\031\032\0028\0002\006\020\034\032\0028\001¢\006\002\020%J\036\0203\032\0020\0262\026\0204\032\022\022\006\b\001\022\0028\000\022\006\b\001\022\0028\0010\000J\035\0205\032\004\030\0018\0012\006\020\031\032\0028\0002\006\020\034\032\0028\001¢\006\002\020%J\025\0206\032\004\030\0018\0012\006\020\031\032\0028\000¢\006\002\020\"J\033\0206\032\0020\0302\006\020\031\032\0028\0002\006\020\034\032\0028\001¢\006\002\0207J\025\0208\032\004\030\0018\0012\006\0200\032\0020\005¢\006\002\0201J\035\0209\032\004\030\0018\0012\006\020\031\032\0028\0002\006\020\034\032\0028\001¢\006\002\020%J#\0209\032\0020\0302\006\020\031\032\0028\0002\006\020:\032\0028\0012\006\020;\032\0028\001¢\006\002\020<J\033\020=\032\0028\0012\006\0200\032\0020\0052\006\020\034\032\0028\001¢\006\002\020>J\b\020?\032\0020@H\026J\023\020A\032\0028\0012\006\0200\032\0020\005¢\006\002\0201R\032\020\t\032\0020\005X\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\006R\016\020\r\032\0020\016X\016¢\006\002\n\000R\030\020\017\032\n\022\006\022\004\030\0010\0030\020X\016¢\006\004\n\002\020\021R\027\020\022\032\0020\0058G¢\006\f\022\004\b\023\020\024\032\004\b\022\020\013¨\006B"}, d2 = {"Landroidx/compose/ui/text/caches/SimpleArrayMap;", "K", "V", "", "capacity", "", "(I)V", "map", "(Landroidx/compose/ui/text/caches/SimpleArrayMap;)V", "_size", "get_size", "()I", "set_size", "hashes", "", "keyValues", "", "[Ljava/lang/Object;", "size", "size$annotations", "()V", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "ensureCapacity", "minimumCapacity", "equals", "other", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "indexOf", "hash", "indexOfKey", "indexOfNull", "indexOfValue", "indexOfValue$ui_text", "(Ljava/lang/Object;)I", "isEmpty", "keyAt", "index", "(I)Ljava/lang/Object;", "put", "putAll", "array", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "toString", "", "valueAt", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class SimpleArrayMap<K, V>
/*     */ {
/*     */   @NotNull
/*     */   private int[] hashes;
/*     */   @NotNull
/*     */   private Object[] keyValues;
/*     */   private int _size;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   protected final int get_size() {
/*  47 */     return this._size; } protected final void set_size(int <set-?>) { this._size = <set-?>; }
/*     */ 
/*     */   
/*     */   @JvmName(name = "size")
/*     */   public final int size() {
/*  52 */     return this._size;
/*     */   }
/*     */   protected final int indexOf(@NotNull Object key, int hash) {
/*  55 */     Intrinsics.checkNotNullParameter(key, "key"); int N = this._size;
/*     */ 
/*     */     
/*  58 */     if (N == 0) {
/*  59 */       return -1;
/*     */     }
/*  61 */     int index = ContainerHelpersKt.binarySearchInternal(this.hashes, N, hash);
/*     */ 
/*     */     
/*  64 */     if (index < 0) {
/*  65 */       return index;
/*     */     }
/*     */ 
/*     */     
/*  69 */     if (Intrinsics.areEqual(key, this.keyValues[index << 1])) {
/*  70 */       return index;
/*     */     }
/*     */ 
/*     */     
/*  74 */     int end = 0;
/*  75 */     end = index + 1;
/*  76 */     while (end < N && this.hashes[end] == hash) {
/*  77 */       if (Intrinsics.areEqual(key, this.keyValues[end << 1])) return end; 
/*  78 */       end++;
/*     */     } 
/*     */ 
/*     */     
/*  82 */     int i = index - 1;
/*  83 */     while (i >= 0 && this.hashes[i] == hash) {
/*  84 */       if (Intrinsics.areEqual(key, this.keyValues[i << 1])) return i; 
/*  85 */       i--;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     return end ^ 0xFFFFFFFF;
/*     */   }
/*     */   
/*     */   protected final int indexOfNull() {
/*  96 */     int N = this._size;
/*     */ 
/*     */     
/*  99 */     if (N == 0) {
/* 100 */       return -1;
/*     */     }
/* 102 */     int index = ContainerHelpersKt.binarySearchInternal(this.hashes, N, 0);
/*     */ 
/*     */     
/* 105 */     if (index < 0) {
/* 106 */       return index;
/*     */     }
/*     */ 
/*     */     
/* 110 */     if (this.keyValues[index << 1] == null) {
/* 111 */       return index;
/*     */     }
/*     */ 
/*     */     
/* 115 */     int end = 0;
/* 116 */     end = index + 1;
/* 117 */     while (end < N && this.hashes[end] == 0) {
/* 118 */       if (this.keyValues[end << 1] == null) return end; 
/* 119 */       end++;
/*     */     } 
/*     */ 
/*     */     
/* 123 */     int i = index - 1;
/* 124 */     while (i >= 0 && this.hashes[i] == 0) {
/* 125 */       if (this.keyValues[i << 1] == null) return i; 
/* 126 */       i--;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 133 */     return end ^ 0xFFFFFFFF;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @JvmOverloads
/*     */   public SimpleArrayMap(int capacity) {
/* 141 */     if (capacity == 0) {
/* 142 */       this.hashes = ContainerHelpersKt.EMPTY_INTS;
/* 143 */       this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
/*     */     } else {
/* 145 */       this.hashes = new int[capacity];
/* 146 */       this.keyValues = new Object[capacity << 1];
/*     */     } 
/* 148 */     this._size = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SimpleArrayMap(@Nullable SimpleArrayMap<? extends K, ? extends V> map) {
/* 154 */     this(0, 1, null);
/* 155 */     if (map != null) {
/* 156 */       putAll(map);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void clear() {
/* 166 */     if (this._size > 0) {
/* 167 */       this.hashes = ContainerHelpersKt.EMPTY_INTS;
/* 168 */       this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
/* 169 */       this._size = 0;
/*     */     } 
/* 171 */     if (this._size > 0) {
/* 172 */       throw new ConcurrentModificationException();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void ensureCapacity(int minimumCapacity) {
/* 183 */     int osize = this._size;
/* 184 */     if (this.hashes.length < minimumCapacity) {
/* 185 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.hashes, minimumCapacity), "copyOf(...)"); this.hashes = Arrays.copyOf(this.hashes, minimumCapacity);
/* 186 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.keyValues, minimumCapacity << 1), "copyOf(...)"); this.keyValues = Arrays.copyOf(this.keyValues, minimumCapacity << 1);
/*     */     } 
/* 188 */     if (this._size != osize) {
/* 189 */       throw new ConcurrentModificationException();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean containsKey(Object key) {
/* 199 */     return (indexOfKey(key) >= 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int indexOfKey(@Nullable Object key) {
/* 208 */     return (key == null) ? indexOfNull() : indexOf(key, key.hashCode());
/*     */   }
/*     */   public final int indexOfValue$ui_text(Object value) {
/* 211 */     int N = this._size << 1;
/* 212 */     Object[] array = this.keyValues;
/* 213 */     if (value == null) {
/* 214 */       int i = 1;
/* 215 */       while (i < N) {
/* 216 */         if (array[i] == null)
/* 217 */           return i >> 1;  i += 2;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 222 */       int i = 1;
/* 223 */       while (i < N) {
/* 224 */         if (Intrinsics.areEqual(value, array[i]))
/* 225 */           return i >> 1;  i += 2;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 230 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean containsValue(Object value) {
/* 240 */     return (indexOfValue$ui_text((V)value) >= 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final V get(Object key) {
/* 251 */     int index = indexOfKey(key);
/* 252 */     return (index >= 0) ? (V)this.keyValues[(index << 1) + 1] : null;
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
/*     */   public final V getOrDefault(Object key, Object defaultValue) {
/* 264 */     int index = indexOfKey(key);
/* 265 */     return (index >= 0) ? (V)this.keyValues[(index << 1) + 1] : (V)defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final K keyAt(int index) {
/* 274 */     return (K)this.keyValues[index << 1];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final V valueAt(int index) {
/* 282 */     return (V)this.keyValues[(index << 1) + 1];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final V setValueAt(int index, Object value) {
/* 292 */     int actualIndex = (index << 1) + 1;
/* 293 */     Object old = this.keyValues[actualIndex];
/* 294 */     this.keyValues[actualIndex] = value;
/* 295 */     return (V)old;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean isEmpty() {
/* 301 */     return (this._size <= 0);
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
/*     */   @Nullable
/*     */   public final V put(Object key, Object value) {
/* 314 */     int osize = this._size;
/* 315 */     int hash = 0;
/* 316 */     int index = 0;
/*     */     
/* 318 */     if (key == null) {
/* 319 */       hash = 0;
/* 320 */       index = indexOfNull();
/*     */     } else {
/* 322 */       hash = key.hashCode();
/* 323 */       index = indexOf(key, hash);
/*     */     } 
/* 325 */     if (index >= 0) {
/* 326 */       index = (index << 1) + 1;
/* 327 */       Object old = this.keyValues[index];
/* 328 */       this.keyValues[index] = value;
/* 329 */       return (V)old;
/*     */     } 
/*     */     
/* 332 */     index ^= 0xFFFFFFFF;
/* 333 */     if (osize >= this.hashes.length) {
/* 334 */       int n = 
/* 335 */         (osize >= 8) ? (osize + (osize >> 1)) : (
/* 336 */         (osize >= 4) ? 8 : 
/* 337 */         4);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 342 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.hashes, n), "copyOf(...)"); this.hashes = Arrays.copyOf(this.hashes, n);
/* 343 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.keyValues, n << 1), "copyOf(...)"); this.keyValues = Arrays.copyOf(this.keyValues, n << 1);
/*     */       
/* 345 */       if (osize != this._size) {
/* 346 */         throw new ConcurrentModificationException();
/*     */       }
/*     */     } 
/*     */     
/* 350 */     if (index < osize) {
/*     */ 
/*     */ 
/*     */       
/* 354 */       ArraysKt.copyInto(this.hashes, this.hashes, index + 1, index, osize);
/* 355 */       ArraysKt.copyInto(this.keyValues, this.keyValues, index + 1 << 1, index << 1, this._size << 1);
/*     */     } 
/*     */ 
/*     */     
/* 359 */     if (osize != this._size || index >= this.hashes.length) {
/* 360 */       throw new ConcurrentModificationException();
/*     */     }
/*     */ 
/*     */     
/* 364 */     this.hashes[index] = hash;
/* 365 */     this.keyValues[index << 1] = key;
/* 366 */     this.keyValues[(index << 1) + 1] = value;
/* 367 */     int i = this._size; this._size = i + 1;
/* 368 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void putAll(@NotNull SimpleArrayMap array) {
/* 376 */     Intrinsics.checkNotNullParameter(array, "array"); int N = array._size;
/* 377 */     ensureCapacity(this._size + N);
/* 378 */     if (this._size == 0) {
/* 379 */       if (N > 0) {
/* 380 */         ArraysKt.copyInto(array.hashes, this.hashes, 0, 0, N);
/* 381 */         ArraysKt.copyInto(array.keyValues, this.keyValues, 0, 0, N << 1);
/* 382 */         this._size = N;
/*     */       } 
/*     */     } else {
/* 385 */       for (int i = 0; i < N; i++) {
/* 386 */         put((K)array.keyAt(i), (V)array.valueAt(i));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final V putIfAbsent(Object key, Object value) {
/* 400 */     Object mapValue = get((K)key);
/* 401 */     if (mapValue == null) {
/* 402 */       mapValue = put((K)key, (V)value);
/*     */     }
/* 404 */     return (V)mapValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final V remove(Object key) {
/* 414 */     int index = indexOfKey(key);
/* 415 */     return (index >= 0) ? removeAt(index) : null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean remove(Object key, Object value) {
/* 425 */     int index = indexOfKey(key);
/* 426 */     if (index >= 0) {
/* 427 */       Object mapValue = valueAt(index);
/* 428 */       if (Intrinsics.areEqual(value, mapValue)) {
/* 429 */         removeAt(index);
/* 430 */         return true;
/*     */       } 
/*     */     } 
/* 433 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final V removeAt(int index) {
/* 444 */     Object old = this.keyValues[(index << 1) + 1];
/* 445 */     int osize = this._size;
/* 446 */     if (osize <= 1) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 451 */       clear();
/*     */     } else {
/* 453 */       int nsize = osize - 1;
/* 454 */       if (this.hashes.length > 8 && osize < this.hashes.length / 3) {
/*     */ 
/*     */ 
/*     */         
/* 458 */         int n = 
/* 459 */           (osize > 8) ? (osize + (osize >> 1)) : 8;
/*     */ 
/*     */ 
/*     */         
/* 463 */         int[] ohashes = this.hashes;
/* 464 */         Object[] oarray = this.keyValues;
/*     */         
/* 466 */         this.hashes = new int[n];
/* 467 */         this.keyValues = new Object[n << 1];
/*     */         
/* 469 */         if (osize != this._size) {
/* 470 */           throw new ConcurrentModificationException();
/*     */         }
/* 472 */         if (index > 0) {
/*     */ 
/*     */ 
/*     */           
/* 476 */           ArraysKt.copyInto(ohashes, this.hashes, 0, 0, index);
/* 477 */           ArraysKt.copyInto(oarray, this.keyValues, 0, 0, index << 1);
/*     */         } 
/* 479 */         if (index < nsize) {
/*     */ 
/*     */ 
/*     */           
/* 483 */           ArraysKt.copyInto(ohashes, this.hashes, index, index + 1, nsize + 1);
/* 484 */           ArraysKt.copyInto(oarray, this.keyValues, index << 1, index + 1 << 1, nsize + 1 << 1);
/*     */         } 
/*     */       } else {
/* 487 */         if (index < nsize) {
/*     */           
/* 489 */           ArraysKt.copyInto(this.hashes, this.hashes, index, index + 1, nsize + 1);
/* 490 */           ArraysKt.copyInto(this.keyValues, this.keyValues, index << 1, index + 1 << 1, nsize + 1 << 1);
/*     */         } 
/* 492 */         this.keyValues[nsize << 1] = null;
/* 493 */         this.keyValues[(nsize << 1) + 1] = null;
/*     */       } 
/* 495 */       if (osize != this._size) {
/* 496 */         throw new ConcurrentModificationException();
/*     */       }
/* 498 */       this._size = nsize;
/*     */     } 
/* 500 */     return (V)old;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final V replace(Object key, Object value) {
/* 510 */     int index = indexOfKey(key);
/* 511 */     return (index >= 0) ? setValueAt(index, (V)value) : null;
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
/*     */   public final boolean replace(Object key, Object oldValue, Object newValue) {
/* 523 */     int index = indexOfKey(key);
/* 524 */     if (index >= 0) {
/* 525 */       Object mapValue = valueAt(index);
/* 526 */       if (mapValue == oldValue) {
/* 527 */         setValueAt(index, (V)newValue);
/* 528 */         return true;
/*     */       } 
/*     */     } 
/* 531 */     return false;
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
/*     */   public boolean equals(@Nullable Object other) {
/* 544 */     if (this == other) {
/* 545 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 549 */     try { if (other instanceof SimpleArrayMap) {
/* 550 */         SimpleArrayMap map = (SimpleArrayMap)other;
/* 551 */         if (this._size != map._size) {
/* 552 */           return false;
/*     */         }
/*     */         
/* 555 */         for (int i = 0, j = this._size; i < j; i++) {
/* 556 */           Object key = keyAt(i);
/* 557 */           Object mine = valueAt(i);
/*     */           
/* 559 */           Object theirs = map.get(key);
/* 560 */           if (mine == null) {
/* 561 */             if (theirs != null || !map.containsKey(key)) {
/* 562 */               return false;
/*     */             }
/* 564 */           } else if (!Intrinsics.areEqual(mine, theirs)) {
/* 565 */             return false;
/*     */           } 
/*     */         } 
/* 568 */         return true;
/* 569 */       }  if (other instanceof Map) {
/* 570 */         Object map = other;
/* 571 */         if (this._size != ((Map)map).size()) {
/* 572 */           return false;
/*     */         }
/* 574 */         for (int i = 0, j = this._size; i < j; i++) {
/* 575 */           Object key = keyAt(i);
/* 576 */           Object mine = valueAt(i);
/* 577 */           Object theirs = ((Map)map).get(key);
/* 578 */           if (mine == null) {
/* 579 */             if (theirs != null || !((Map)map).containsKey(key)) {
/* 580 */               return false;
/*     */             }
/* 582 */           } else if (!Intrinsics.areEqual(mine, theirs)) {
/* 583 */             return false;
/*     */           } 
/*     */         } 
/* 586 */         return true;
/*     */       }  }
/* 588 */     catch (NullPointerException nullPointerException) {  }
/* 589 */     catch (ClassCastException classCastException) {}
/*     */     
/* 591 */     return false;
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
/*     */   public int hashCode() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield hashes : [I
/*     */     //   4: astore_1
/*     */     //   5: aload_0
/*     */     //   6: getfield keyValues : [Ljava/lang/Object;
/*     */     //   9: astore_2
/*     */     //   10: iconst_0
/*     */     //   11: istore_3
/*     */     //   12: iconst_0
/*     */     //   13: istore #4
/*     */     //   15: iconst_1
/*     */     //   16: istore #5
/*     */     //   18: aload_0
/*     */     //   19: getfield _size : I
/*     */     //   22: istore #6
/*     */     //   24: iload #4
/*     */     //   26: iload #6
/*     */     //   28: if_icmpge -> 69
/*     */     //   31: aload_2
/*     */     //   32: iload #5
/*     */     //   34: aaload
/*     */     //   35: astore #7
/*     */     //   37: iload_3
/*     */     //   38: aload_1
/*     */     //   39: iload #4
/*     */     //   41: iaload
/*     */     //   42: aload #7
/*     */     //   44: dup
/*     */     //   45: ifnull -> 54
/*     */     //   48: invokevirtual hashCode : ()I
/*     */     //   51: goto -> 56
/*     */     //   54: pop
/*     */     //   55: iconst_0
/*     */     //   56: ixor
/*     */     //   57: iadd
/*     */     //   58: istore_3
/*     */     //   59: iinc #4, 1
/*     */     //   62: iinc #5, 2
/*     */     //   65: nop
/*     */     //   66: goto -> 24
/*     */     //   69: iload_3
/*     */     //   70: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #598	-> 0
/*     */     //   #599	-> 5
/*     */     //   #600	-> 10
/*     */     //   #601	-> 12
/*     */     //   #602	-> 15
/*     */     //   #603	-> 18
/*     */     //   #604	-> 24
/*     */     //   #605	-> 31
/*     */     //   #606	-> 37
/*     */     //   #607	-> 59
/*     */     //   #608	-> 65
/*     */     //   #610	-> 69
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   37	29	7	value	Ljava/lang/Object;
/*     */     //   5	66	1	hashes	[I
/*     */     //   10	61	2	array	[Ljava/lang/Object;
/*     */     //   12	59	3	result	I
/*     */     //   15	56	4	i	I
/*     */     //   18	53	5	v	I
/*     */     //   24	47	6	s	I
/*     */     //   0	71	0	this	Landroidx/compose/ui/text/caches/SimpleArrayMap;
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
/*     */   @NotNull
/*     */   public String toString() {
/* 621 */     if (isEmpty()) {
/* 622 */       return "{}";
/*     */     }
/*     */     
/* 625 */     StringBuilder buffer = new StringBuilder(this._size * 28);
/* 626 */     buffer.append('{');
/* 627 */     for (int i = 0, j = this._size; i < j; i++) {
/* 628 */       if (i > 0) {
/* 629 */         buffer.append(", ");
/*     */       }
/* 631 */       Object key = keyAt(i);
/* 632 */       if (key != this) {
/* 633 */         buffer.append(key);
/*     */       } else {
/* 635 */         buffer.append("(this Map)");
/*     */       } 
/* 637 */       buffer.append('=');
/* 638 */       Object value = valueAt(i);
/* 639 */       if (value != this) {
/* 640 */         buffer.append(value);
/*     */       } else {
/* 642 */         buffer.append("(this Map)");
/*     */       } 
/*     */     } 
/* 645 */     buffer.append('}');
/* 646 */     Intrinsics.checkNotNullExpressionValue(buffer.toString(), "toString(...)"); return buffer.toString();
/*     */   }
/*     */   
/*     */   @JvmOverloads
/*     */   public SimpleArrayMap() {
/*     */     this(0, 1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\caches\SimpleArrayMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */