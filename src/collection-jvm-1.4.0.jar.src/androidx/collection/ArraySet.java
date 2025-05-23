/*     */ package androidx.collection;
/*     */ 
/*     */ import androidx.collection.internal.ContainerHelpersKt;
/*     */ import java.util.Collection;
/*     */ import java.util.ConcurrentModificationException;
/*     */ import java.util.Iterator;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmOverloads;
/*     */ import kotlin.jvm.internal.ArrayIteratorKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.markers.KMutableCollection;
/*     */ import kotlin.jvm.internal.markers.KMutableSet;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\000\n\002\020\037\n\002\020#\n\002\b\002\n\002\020\036\n\002\b\002\n\002\020\021\n\002\b\002\n\002\020\b\n\002\b\005\n\002\020\000\n\002\b\005\n\002\020\025\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\r\n\002\020)\n\002\b\n\n\002\020\016\n\002\b\003\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003:\001?B\031\b\026\022\020\020\004\032\f\022\006\b\001\022\0028\000\030\0010\000¢\006\002\020\005B\027\b\026\022\016\020\004\032\n\022\004\022\0028\000\030\0010\006¢\006\002\020\007B\031\b\026\022\020\020\b\032\f\022\006\b\001\022\0028\000\030\0010\t¢\006\002\020\nB\021\b\007\022\b\b\002\020\013\032\0020\f¢\006\002\020\rJ\025\020\037\032\0020 2\006\020!\032\0028\000H\026¢\006\002\020\"J\026\020#\032\0020$2\016\020\b\032\n\022\006\b\001\022\0028\0000\000J\026\020#\032\0020 2\f\020%\032\b\022\004\022\0028\0000\006H\026J\b\020&\032\0020$H\026J\026\020'\032\0020 2\006\020!\032\0028\000H\002¢\006\002\020\"J\026\020(\032\0020 2\f\020%\032\b\022\004\022\0028\0000\006H\026J\016\020)\032\0020$2\006\020*\032\0020\fJ\023\020+\032\0020 2\b\020,\032\004\030\0010\022H\002J\b\020-\032\0020\fH\026J\020\020.\032\0020\f2\b\020/\032\004\030\0010\022J\b\0200\032\0020 H\026J\017\0201\032\b\022\004\022\0028\00002H\002J\025\0203\032\0020 2\006\020!\032\0028\000H\026¢\006\002\020\"J\026\0204\032\0020 2\016\020\b\032\n\022\006\b\001\022\0028\0000\000J\026\0204\032\0020 2\f\020%\032\b\022\004\022\0028\0000\006H\026J\023\0205\032\0028\0002\006\0206\032\0020\f¢\006\002\0207J\026\0208\032\0020 2\f\020%\032\b\022\004\022\0028\0000\006H\026J\023\0209\032\n\022\006\022\004\030\0010\0220\t¢\006\002\020\024J%\0209\032\b\022\004\022\002H:0\t\"\004\b\001\020:2\f\020\b\032\b\022\004\022\002H:0\t¢\006\002\020;J\b\020<\032\0020=H\026J\023\020>\032\0028\0002\006\0206\032\0020\f¢\006\002\0207R\032\020\016\032\0020\fX\016¢\006\016\n\000\032\004\b\017\020\020\"\004\b\021\020\rR$\020\b\032\n\022\006\022\004\030\0010\0220\tX\016¢\006\020\n\002\020\026\032\004\b\023\020\024\"\004\b\025\020\nR\032\020\027\032\0020\030X\016¢\006\016\n\000\032\004\b\031\020\032\"\004\b\033\020\034R\024\020\035\032\0020\f8VX\004¢\006\006\032\004\b\036\020\020¨\006@"}, d2 = {"Landroidx/collection/ArraySet;", "E", "", "", "set", "(Landroidx/collection/ArraySet;)V", "", "(Ljava/util/Collection;)V", "array", "", "([Ljava/lang/Object;)V", "capacity", "", "(I)V", "_size", "get_size$collection", "()I", "set_size$collection", "", "getArray$collection", "()[Ljava/lang/Object;", "setArray$collection", "[Ljava/lang/Object;", "hashes", "", "getHashes$collection", "()[I", "setHashes$collection", "([I)V", "size", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "", "elements", "clear", "contains", "containsAll", "ensureCapacity", "minimumCapacity", "equals", "other", "hashCode", "indexOf", "key", "isEmpty", "iterator", "", "remove", "removeAll", "removeAt", "index", "(I)Ljava/lang/Object;", "retainAll", "toArray", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "valueAt", "ElementIterator", "collection"})
/*     */ @SourceDebugExtension({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,300:1\n304#2,10:301\n317#2,14:311\n334#2:325\n339#2:326\n345#2:327\n350#2:328\n355#2,61:329\n420#2,17:390\n440#2,6:407\n450#2,60:413\n518#2,9:473\n531#2,22:482\n557#2,7:504\n568#2,19:511\n591#2,6:530\n601#2,6:536\n611#2,5:542\n620#2,8:547\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n98#1:301,10\n108#1:311,14\n118#1:325\n128#1:326\n138#1:327\n145#1:328\n157#1:329,61\n167#1:390,17\n177#1:407,6\n188#1:413,60\n197#1:473,9\n224#1:482,22\n231#1:504,7\n240#1:511,19\n267#1:530,6\n276#1:536,6\n286#1:542,5\n297#1:547,8\n*E\n"})
/*     */ public final class ArraySet<E>
/*     */   implements Collection<E>, Set<E>, KMutableCollection, KMutableSet
/*     */ {
/*     */   @NotNull
/*  50 */   private int[] hashes = ContainerHelpersKt.EMPTY_INTS; @NotNull public final int[] getHashes$collection() { return this.hashes; } public final void setHashes$collection(@NotNull int[] <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.hashes = <set-?>; } @NotNull
/*  51 */   private Object[] array = ContainerHelpersKt.EMPTY_OBJECTS; private int _size; @NotNull public final Object[] getArray$collection() { return this.array; } public final void setArray$collection(@NotNull Object[] <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.array = <set-?>; }
/*     */   
/*  53 */   public final int get_size$collection() { return this._size; } public final void set_size$collection(int <set-?>) { this._size = <set-?>; }
/*     */    public int getSize() {
/*  55 */     return this._size;
/*     */   }
/*     */ 
/*     */   
/*     */   public ArraySet(@Nullable ArraySet<? extends E> set) {
/*  60 */     this(0);
/*  61 */     if (set != null) {
/*  62 */       addAll(set);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ArraySet(@Nullable Collection<? extends E> set) {
/*  69 */     this(0);
/*  70 */     if (set != null) {
/*  71 */       addAll(set);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ArraySet(@Nullable Object[] array) {
/*  78 */     this(0);
/*  79 */     if (array != null)
/*  80 */       for (Iterator iterator = ArrayIteratorKt.iterator(array); iterator.hasNext(); ) { Object value = iterator.next();
/*  81 */         add((E)value); }
/*     */        
/*     */   }
/*     */   
/*     */   @JvmOverloads
/*     */   public ArraySet(int capacity) {
/*  87 */     if (capacity > 0) {
/*  88 */       ArraySetKt.allocArrays(this, capacity);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void clear() {
/*  98 */     ArraySet $this$clearInternal$iv = this; int $i$f$clearInternal = 0;
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
/* 301 */     if ($this$clearInternal$iv.get_size$collection() != 0) {
/* 302 */       $this$clearInternal$iv.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
/* 303 */       $this$clearInternal$iv.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
/* 304 */       $this$clearInternal$iv.set_size$collection(0);
/*     */     } 
/*     */     
/* 307 */     if ($this$clearInternal$iv.get_size$collection() != 0)
/* 308 */       throw new ConcurrentModificationException(); 
/*     */   } public final void ensureCapacity(int minimumCapacity) { ArraySet<?> $this$ensureCapacityInternal$iv = this;
/*     */     int $i$f$ensureCapacityInternal = 0;
/* 311 */     int oSize$iv = $this$ensureCapacityInternal$iv.get_size$collection();
/* 312 */     if (($this$ensureCapacityInternal$iv.getHashes$collection()).length < minimumCapacity) {
/* 313 */       int[] ohashes$iv = $this$ensureCapacityInternal$iv.getHashes$collection();
/* 314 */       Object[] oarray$iv = $this$ensureCapacityInternal$iv.getArray$collection();
/* 315 */       ArraySetKt.allocArrays($this$ensureCapacityInternal$iv, minimumCapacity);
/* 316 */       if ($this$ensureCapacityInternal$iv.get_size$collection() > 0) {
/* 317 */         ArraysKt.copyInto$default(ohashes$iv, $this$ensureCapacityInternal$iv.getHashes$collection(), 0, 0, $this$ensureCapacityInternal$iv.get_size$collection(), 6, null);
/* 318 */         ArraysKt.copyInto$default(oarray$iv, $this$ensureCapacityInternal$iv.getArray$collection(), 0, 0, $this$ensureCapacityInternal$iv.get_size$collection(), 6, null);
/*     */       } 
/*     */     } 
/* 321 */     if ($this$ensureCapacityInternal$iv.get_size$collection() != oSize$iv)
/* 322 */       throw new ConcurrentModificationException();  }
/*     */   public boolean contains(Object element) { ArraySet $this$containsInternal$iv = this;
/*     */     int $i$f$containsInternal = 0;
/* 325 */     return ($this$containsInternal$iv.indexOf(element) >= 0); } public final int indexOf(@Nullable Object key) { ArraySet<?> $this$indexOfInternal$iv = this; int $i$f$indexOfInternal = 0;
/* 326 */     return (key == null) ? ArraySetKt.indexOfNull($this$indexOfInternal$iv) : ArraySetKt.indexOf($this$indexOfInternal$iv, key, key.hashCode()); } public final E valueAt(int index) { ArraySet $this$valueAtInternal$iv = this; int $i$f$valueAtInternal = 0;
/* 327 */     return (E)$this$valueAtInternal$iv.getArray$collection()[index]; } public boolean isEmpty() { ArraySet $this$isEmptyInternal$iv = this; int $i$f$isEmptyInternal = 0;
/* 328 */     return ($this$isEmptyInternal$iv.get_size$collection() <= 0); } public boolean add(Object element) { ArraySet<?> $this$addInternal$iv = this; int $i$f$addInternal = 0;
/* 329 */     int oSize$iv = $this$addInternal$iv.get_size$collection();
/* 330 */     int hash$iv = 0;
/* 331 */     int index$iv = 0;
/* 332 */     if (element == null) {
/* 333 */       hash$iv = 0;
/* 334 */       index$iv = ArraySetKt.indexOfNull($this$addInternal$iv);
/*     */     } else {
/* 336 */       hash$iv = element.hashCode();
/* 337 */       index$iv = ArraySetKt.indexOf($this$addInternal$iv, element, hash$iv);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 344 */     index$iv ^= 0xFFFFFFFF;
/* 345 */     if (oSize$iv >= ($this$addInternal$iv.getHashes$collection()).length) {
/* 346 */       int n$iv = 
/*     */         
/* 348 */         (oSize$iv >= 8) ? (oSize$iv + (oSize$iv >> 1)) : (
/* 349 */         (oSize$iv >= 4) ? 8 : 
/* 350 */         4);
/*     */ 
/*     */       
/* 353 */       int[] ohashes$iv = $this$addInternal$iv.getHashes$collection();
/* 354 */       Object[] oarray$iv = $this$addInternal$iv.getArray$collection();
/* 355 */       ArraySetKt.allocArrays($this$addInternal$iv, n$iv);
/*     */       
/* 357 */       if (oSize$iv != $this$addInternal$iv.get_size$collection()) {
/* 358 */         throw new ConcurrentModificationException();
/*     */       }
/*     */       
/* 361 */       if (!((($this$addInternal$iv.getHashes$collection()).length == 0) ? 1 : 0)) {
/* 362 */         ArraysKt.copyInto$default(ohashes$iv, $this$addInternal$iv.getHashes$collection(), 0, 0, ohashes$iv.length, 6, null);
/* 363 */         ArraysKt.copyInto$default(oarray$iv, $this$addInternal$iv.getArray$collection(), 0, 0, oarray$iv.length, 6, null);
/*     */       } 
/*     */     } 
/*     */     
/* 367 */     if (index$iv < oSize$iv) {
/* 368 */       ArraysKt.copyInto($this$addInternal$iv.getHashes$collection(), 
/* 369 */           $this$addInternal$iv.getHashes$collection(), 
/* 370 */           index$iv + 1, 
/* 371 */           index$iv, 
/* 372 */           oSize$iv);
/*     */       
/* 374 */       ArraysKt.copyInto($this$addInternal$iv.getArray$collection(), 
/* 375 */           $this$addInternal$iv.getArray$collection(), 
/* 376 */           index$iv + 1, 
/* 377 */           index$iv, 
/* 378 */           oSize$iv);
/*     */     } 
/*     */ 
/*     */     
/* 382 */     if (oSize$iv != $this$addInternal$iv.get_size$collection() || index$iv >= ($this$addInternal$iv.getHashes$collection()).length) {
/* 383 */       throw new ConcurrentModificationException();
/*     */     }
/*     */     
/* 386 */     $this$addInternal$iv.getHashes$collection()[index$iv] = hash$iv;
/* 387 */     $this$addInternal$iv.getArray$collection()[index$iv] = element;
/* 388 */     int i = $this$addInternal$iv.get_size$collection(); $this$addInternal$iv.set_size$collection(i + 1); return !(index$iv >= 0); } public final void addAll(@NotNull ArraySet array) { Intrinsics.checkNotNullParameter(array, "array"); ArraySet $this$addAllInternal$iv = this;
/*     */     int $i$f$addAllInternal = 0;
/* 390 */     int n$iv = array.get_size$collection();
/* 391 */     $this$addAllInternal$iv.ensureCapacity($this$addAllInternal$iv.get_size$collection() + n$iv);
/* 392 */     if ($this$addAllInternal$iv.get_size$collection() == 0) {
/* 393 */       if (n$iv > 0) {
/* 394 */         ArraysKt.copyInto$default(array.getHashes$collection(), $this$addAllInternal$iv.getHashes$collection(), 0, 0, n$iv, 6, null);
/* 395 */         ArraysKt.copyInto$default(array.getArray$collection(), $this$addAllInternal$iv.getArray$collection(), 0, 0, n$iv, 6, null);
/* 396 */         if ($this$addAllInternal$iv.get_size$collection() != 0) {
/* 397 */           throw new ConcurrentModificationException();
/*     */         }
/* 399 */         $this$addAllInternal$iv.set_size$collection(n$iv);
/*     */       } 
/*     */     } else {
/* 402 */       for (int i$iv = 0; i$iv < n$iv; i$iv++)
/* 403 */         $this$addAllInternal$iv.add(array.valueAt(i$iv)); 
/*     */     }  }
/*     */   public boolean remove(Object element) { ArraySet $this$removeInternal$iv = this;
/*     */     int $i$f$removeInternal = 0;
/* 407 */     int index$iv = $this$removeInternal$iv.indexOf(element);
/*     */     
/* 409 */     $this$removeInternal$iv.removeAt(index$iv);
/*     */     return (index$iv >= 0); }
/*     */   public final E removeAt(int index) { ArraySet<?> $this$removeAtInternal$iv = this;
/*     */     int $i$f$removeAtInternal = 0;
/* 413 */     int oSize$iv = $this$removeAtInternal$iv.get_size$collection();
/* 414 */     Object old$iv = $this$removeAtInternal$iv.getArray$collection()[index];
/* 415 */     if (oSize$iv <= 1) {
/*     */       
/* 417 */       $this$removeAtInternal$iv.clear();
/*     */     } else {
/* 419 */       int nSize$iv = oSize$iv - 1;
/* 420 */       if (($this$removeAtInternal$iv.getHashes$collection()).length > 8 && $this$removeAtInternal$iv.get_size$collection() < ($this$removeAtInternal$iv.getHashes$collection()).length / 3) {
/*     */ 
/*     */ 
/*     */         
/* 424 */         int n$iv = 
/* 425 */           ($this$removeAtInternal$iv.get_size$collection() > 8) ? ($this$removeAtInternal$iv.get_size$collection() + ($this$removeAtInternal$iv.get_size$collection() >> 1)) : 
/* 426 */           8;
/*     */         
/* 428 */         int[] ohashes$iv = $this$removeAtInternal$iv.getHashes$collection();
/* 429 */         Object[] oarray$iv = $this$removeAtInternal$iv.getArray$collection();
/* 430 */         ArraySetKt.allocArrays($this$removeAtInternal$iv, n$iv);
/* 431 */         if (index > 0) {
/* 432 */           ArraysKt.copyInto$default(ohashes$iv, $this$removeAtInternal$iv.getHashes$collection(), 0, 0, index, 6, null);
/* 433 */           ArraysKt.copyInto$default(oarray$iv, $this$removeAtInternal$iv.getArray$collection(), 0, 0, index, 6, null);
/*     */         } 
/* 435 */         if (index < nSize$iv) {
/* 436 */           ArraysKt.copyInto(ohashes$iv, 
/* 437 */               $this$removeAtInternal$iv.getHashes$collection(), 
/* 438 */               index, 
/* 439 */               index + 1, 
/* 440 */               nSize$iv + 1);
/*     */           
/* 442 */           ArraysKt.copyInto(oarray$iv, 
/* 443 */               $this$removeAtInternal$iv.getArray$collection(), 
/* 444 */               index, 
/* 445 */               index + 1, 
/* 446 */               nSize$iv + 1);
/*     */         } 
/*     */       } else {
/*     */         
/* 450 */         if (index < nSize$iv) {
/* 451 */           ArraysKt.copyInto($this$removeAtInternal$iv.getHashes$collection(), 
/* 452 */               $this$removeAtInternal$iv.getHashes$collection(), 
/* 453 */               index, 
/* 454 */               index + 1, 
/* 455 */               nSize$iv + 1);
/*     */           
/* 457 */           ArraysKt.copyInto($this$removeAtInternal$iv.getArray$collection(), 
/* 458 */               $this$removeAtInternal$iv.getArray$collection(), 
/* 459 */               index, 
/* 460 */               index + 1, 
/* 461 */               nSize$iv + 1);
/*     */         } 
/*     */         
/* 464 */         $this$removeAtInternal$iv.getArray$collection()[nSize$iv] = null;
/*     */       } 
/* 466 */       if (oSize$iv != $this$removeAtInternal$iv.get_size$collection()) {
/* 467 */         throw new ConcurrentModificationException();
/*     */       }
/* 469 */       $this$removeAtInternal$iv.set_size$collection(nSize$iv);
/*     */     } 
/*     */     
/* 472 */     return (E)old$iv; } public final boolean removeAll(@NotNull ArraySet array) { Intrinsics.checkNotNullParameter(array, "array"); ArraySet $this$removeAllInternal$iv = this; int $i$f$removeAllInternal = 0;
/* 473 */     int n$iv = array.get_size$collection();
/*     */ 
/*     */ 
/*     */     
/* 477 */     int originalSize$iv = $this$removeAllInternal$iv.get_size$collection();
/* 478 */     for (int i$iv = 0; i$iv < n$iv; i$iv++) {
/* 479 */       $this$removeAllInternal$iv.remove(array.valueAt(i$iv));
/*     */     }
/* 481 */     return (originalSize$iv != $this$removeAllInternal$iv.get_size$collection()); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Object[] toArray() {
/*     */     Object[] arrayOfObject = this.array;
/*     */     boolean bool = false;
/*     */     int i = this._size;
/*     */     return ArraysKt.copyOfRange(arrayOfObject, bool, i);
/*     */   }
/*     */   @NotNull
/*     */   public final <T> T[] toArray(@NotNull Object[] array) {
/*     */     Intrinsics.checkNotNullParameter(array, "array");
/*     */     Object[] result = ArraySetJvmUtil.resizeForToArray(array, this._size);
/*     */     ArraysKt.copyInto(this.array, result, 0, 0, this._size);
/*     */     Intrinsics.checkNotNullExpressionValue(result, "result");
/*     */     return (T[])result;
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: astore_2
/*     */     //   2: iconst_0
/*     */     //   3: istore_3
/*     */     //   4: aload_2
/*     */     //   5: aload_1
/*     */     //   6: if_acmpne -> 13
/*     */     //   9: iconst_1
/*     */     //   10: goto -> 106
/*     */     //   13: aload_1
/*     */     //   14: instanceof java/util/Set
/*     */     //   17: ifeq -> 105
/*     */     //   20: aload_2
/*     */     //   21: invokevirtual size : ()I
/*     */     //   24: aload_1
/*     */     //   25: checkcast java/util/Set
/*     */     //   28: invokeinterface size : ()I
/*     */     //   33: if_icmpeq -> 40
/*     */     //   36: iconst_0
/*     */     //   37: goto -> 106
/*     */     //   40: nop
/*     */     //   41: iconst_0
/*     */     //   42: istore #4
/*     */     //   44: aload_2
/*     */     //   45: invokevirtual get_size$collection : ()I
/*     */     //   48: istore #5
/*     */     //   50: iload #4
/*     */     //   52: iload #5
/*     */     //   54: if_icmpge -> 101
/*     */     //   57: aload_2
/*     */     //   58: iload #4
/*     */     //   60: invokevirtual valueAt : (I)Ljava/lang/Object;
/*     */     //   63: astore #6
/*     */     //   65: aload_1
/*     */     //   66: checkcast java/util/Set
/*     */     //   69: aload #6
/*     */     //   71: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   76: ifne -> 83
/*     */     //   79: iconst_0
/*     */     //   80: goto -> 106
/*     */     //   83: iinc #4, 1
/*     */     //   86: goto -> 50
/*     */     //   89: astore #4
/*     */     //   91: iconst_0
/*     */     //   92: goto -> 106
/*     */     //   95: astore #4
/*     */     //   97: iconst_0
/*     */     //   98: goto -> 106
/*     */     //   101: iconst_1
/*     */     //   102: goto -> 106
/*     */     //   105: iconst_0
/*     */     //   106: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #224	-> 0
/*     */     //   #482	-> 4
/*     */     //   #483	-> 9
/*     */     //   #485	-> 13
/*     */     //   #486	-> 20
/*     */     //   #487	-> 36
/*     */     //   #489	-> 40
/*     */     //   #490	-> 41
/*     */     //   #491	-> 57
/*     */     //   #492	-> 65
/*     */     //   #493	-> 79
/*     */     //   #490	-> 83
/*     */     //   #496	-> 89
/*     */     //   #497	-> 91
/*     */     //   #498	-> 95
/*     */     //   #499	-> 97
/*     */     //   #501	-> 101
/*     */     //   #503	-> 105
/*     */     //   #224	-> 106
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   65	18	6	mine$iv	Ljava/lang/Object;
/*     */     //   44	45	4	i$iv	I
/*     */     //   91	4	4	ignored$iv	Ljava/lang/NullPointerException;
/*     */     //   97	4	4	ignored$iv	Ljava/lang/ClassCastException;
/*     */     //   4	102	3	$i$f$equalsInternal	I
/*     */     //   2	104	2	$this$equalsInternal$iv	Landroidx/collection/ArraySet;
/*     */     //   0	107	0	this	Landroidx/collection/ArraySet;
/*     */     //   0	107	1	other	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   40	89	89	java/lang/NullPointerException
/*     */     //   40	89	95	java/lang/ClassCastException
/*     */   }
/*     */   public int hashCode() { ArraySet $this$hashCodeInternal$iv = this;
/*     */     int $i$f$hashCodeInternal = 0;
/* 504 */     int[] hashes$iv = $this$hashCodeInternal$iv.getHashes$collection();
/* 505 */     int s$iv = $this$hashCodeInternal$iv.get_size$collection();
/* 506 */     int result$iv = 0;
/* 507 */     for (int i$iv = 0; i$iv < s$iv; i$iv++) {
/* 508 */       result$iv += hashes$iv[i$iv];
/*     */     }
/* 510 */     return result$iv; }
/*     */   @NotNull public Iterator<E> iterator() { return new ElementIterator(); }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\002\n\000\b\004\030\0002\b\022\004\022\0028\0000\001B\005¢\006\002\020\002J\025\020\003\032\0028\0002\006\020\004\032\0020\005H\024¢\006\002\020\006J\020\020\007\032\0020\b2\006\020\004\032\0020\005H\024¨\006\t"}, d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "(Landroidx/collection/ArraySet;)V", "elementAt", "index", "", "(I)Ljava/lang/Object;", "removeAt", "", "collection"}) private final class ElementIterator extends IndexBasedArrayIterator<E> {
/*     */     public ElementIterator() { super(ArraySet.this.get_size$collection()); }
/*     */     protected E elementAt(int index) { return ArraySet.this.valueAt(index); }
/* 515 */     protected void removeAt(int index) { ArraySet.this.removeAt(index); } } @NotNull public String toString() { ArraySet $this$toStringInternal$iv = this; int $i$f$toStringInternal = 0; int i = $this$toStringInternal$iv.get_size$collection() * 14; StringBuilder stringBuilder1 = new StringBuilder(i), $this$toStringInternal_u24lambda_u240$iv = stringBuilder1; int $i$a$-buildString-ArraySetKt$toStringInternal$1$iv = 0;
/* 516 */     $this$toStringInternal_u24lambda_u240$iv.append('{');
/* 517 */     for (int i$iv = 0, j = $this$toStringInternal$iv.get_size$collection(); i$iv < j; i$iv++) {
/* 518 */       if (i$iv > 0) {
/* 519 */         $this$toStringInternal_u24lambda_u240$iv.append(", ");
/*     */       }
/* 521 */       Object value$iv = $this$toStringInternal$iv.valueAt(i$iv);
/* 522 */       if (value$iv != $this$toStringInternal$iv) {
/* 523 */         $this$toStringInternal_u24lambda_u240$iv.append(value$iv);
/*     */       } else {
/* 525 */         $this$toStringInternal_u24lambda_u240$iv.append("(this Set)");
/*     */       } 
/*     */     } 
/* 528 */     $this$toStringInternal_u24lambda_u240$iv.append('}');
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder(capacity).…builderAction).toString()");
/*     */     return $this$toStringInternal$iv.isEmpty() ? "{}" : stringBuilder1.toString(); } public boolean containsAll(@NotNull Collection elements) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'elements'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: astore_2
/*     */     //   9: iconst_0
/*     */     //   10: istore_3
/*     */     //   11: aload_1
/*     */     //   12: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   17: astore #4
/*     */     //   19: aload #4
/*     */     //   21: invokeinterface hasNext : ()Z
/*     */     //   26: ifeq -> 51
/*     */     //   29: aload #4
/*     */     //   31: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   36: astore #5
/*     */     //   38: aload_2
/*     */     //   39: aload #5
/*     */     //   41: invokevirtual contains : (Ljava/lang/Object;)Z
/*     */     //   44: ifne -> 19
/*     */     //   47: iconst_0
/*     */     //   48: goto -> 52
/*     */     //   51: iconst_1
/*     */     //   52: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #267	-> 7
/*     */     //   #530	-> 11
/*     */     //   #531	-> 38
/*     */     //   #532	-> 47
/*     */     //   #535	-> 51
/*     */     //   #267	-> 52
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   38	13	5	item$iv	Ljava/lang/Object;
/*     */     //   11	41	3	$i$f$containsAllInternal	I
/*     */     //   9	43	2	$this$containsAllInternal$iv	Landroidx/collection/ArraySet;
/*     */     //   0	53	0	this	Landroidx/collection/ArraySet;
/*     */     //   0	53	1	elements	Ljava/util/Collection;
/*     */   } public boolean addAll(@NotNull Collection elements) {
/*     */     Intrinsics.checkNotNullParameter(elements, "elements");
/*     */     ArraySet<Object> $this$addAllInternal$iv = this;
/*     */     int $i$f$addAllInternal = 0;
/* 536 */     $this$addAllInternal$iv.ensureCapacity($this$addAllInternal$iv.get_size$collection() + elements.size());
/* 537 */     boolean added$iv = false;
/* 538 */     for (Object value$iv : elements) {
/* 539 */       added$iv = $this$addAllInternal$iv.add(value$iv) | added$iv;
/*     */     }
/* 541 */     return added$iv; } public boolean removeAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); ArraySet $this$removeAllInternal$iv = this; int $i$f$removeAllInternal = 0;
/* 542 */     boolean removed$iv = false;
/* 543 */     for (Object value$iv : elements) {
/* 544 */       removed$iv |= $this$removeAllInternal$iv.remove(value$iv);
/*     */     }
/* 546 */     return removed$iv; } public boolean retainAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); ArraySet $this$retainAllInternal$iv = this; int $i$f$retainAllInternal = 0;
/* 547 */     boolean removed$iv = false;
/* 548 */     for (int i$iv = $this$retainAllInternal$iv.get_size$collection() - 1; -1 < i$iv; i$iv--) {
/* 549 */       if (!CollectionsKt.contains(elements, $this$retainAllInternal$iv.getArray$collection()[i$iv])) {
/* 550 */         $this$retainAllInternal$iv.removeAt(i$iv);
/* 551 */         removed$iv = true;
/*     */       } 
/*     */     } 
/* 554 */     return removed$iv; }
/*     */ 
/*     */   
/*     */   @JvmOverloads
/*     */   public ArraySet() {
/*     */     this(0, 1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\ArraySet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */