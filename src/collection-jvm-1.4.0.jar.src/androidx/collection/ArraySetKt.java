/*     */ package androidx.collection;
/*     */ 
/*     */ import androidx.collection.internal.ContainerHelpersKt;
/*     */ import java.util.Collection;
/*     */ import java.util.ConcurrentModificationException;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000>\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\020\021\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\013\n\000\n\002\020\036\n\002\b\016\n\002\020\000\n\002\b\r\n\002\020\016\n\002\b\002\032\025\020\002\032\b\022\004\022\002H\0040\003\"\004\b\000\020\004H\b\032+\020\002\032\b\022\004\022\002H\0040\003\"\004\b\000\020\0042\022\020\005\032\n\022\006\b\001\022\002H\0040\006\"\002H\004¢\006\002\020\007\032)\020\b\032\0020\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\016\020\013\032\n\022\006\b\001\022\002H\n0\003H\b\032'\020\b\032\0020\f\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\f\020\r\032\b\022\004\022\002H\n0\016H\b\032&\020\017\032\0020\f\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\006\020\020\032\002H\nH\b¢\006\002\020\021\032 \020\022\032\0020\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\006\020\023\032\0020\001H\000\032 \020\024\032\0020\001\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\006\020\025\032\0020\001H\000\032\031\020\026\032\0020\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\003H\b\032'\020\027\032\0020\f\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\f\020\r\032\b\022\004\022\002H\n0\016H\b\032&\020\030\032\0020\f\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\006\020\020\032\002H\nH\b¢\006\002\020\021\032!\020\031\032\0020\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\006\020\032\032\0020\001H\b\032#\020\033\032\0020\f\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\b\020\034\032\004\030\0010\035H\b\032\031\020\036\032\0020\001\"\004\b\000\020\n*\b\022\004\022\002H\n0\003H\b\032*\020\037\032\0020\001\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\b\020 \032\004\030\0010\0352\006\020\025\032\0020\001H\000\032#\020!\032\0020\001\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\b\020 \032\004\030\0010\035H\b\032\030\020\"\032\0020\001\"\004\b\000\020\n*\b\022\004\022\002H\n0\003H\000\032\031\020#\032\0020\f\"\004\b\000\020\n*\b\022\004\022\002H\n0\003H\b\032)\020$\032\0020\f\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\016\020\013\032\n\022\006\b\001\022\002H\n0\003H\b\032'\020$\032\0020\f\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\f\020\r\032\b\022\004\022\002H\n0\016H\b\032&\020%\032\002H\n\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\006\020&\032\0020\001H\b¢\006\002\020'\032&\020(\032\0020\f\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\006\020\020\032\002H\nH\b¢\006\002\020\021\032'\020)\032\0020\f\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\f\020\r\032\b\022\004\022\002H\n0\016H\b\032\031\020*\032\0020+\"\004\b\000\020\n*\b\022\004\022\002H\n0\003H\b\032&\020,\032\002H\n\"\004\b\000\020\n*\b\022\004\022\002H\n0\0032\006\020&\032\0020\001H\b¢\006\002\020'\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006-"}, d2 = {"ARRAY_SET_BASE_SIZE", "", "arraySetOf", "Landroidx/collection/ArraySet;", "T", "values", "", "([Ljava/lang/Object;)Landroidx/collection/ArraySet;", "addAllInternal", "", "E", "array", "", "elements", "", "addInternal", "element", "(Landroidx/collection/ArraySet;Ljava/lang/Object;)Z", "allocArrays", "size", "binarySearchInternal", "hash", "clearInternal", "containsAllInternal", "containsInternal", "ensureCapacityInternal", "minimumCapacity", "equalsInternal", "other", "", "hashCodeInternal", "indexOf", "key", "indexOfInternal", "indexOfNull", "isEmptyInternal", "removeAllInternal", "removeAtInternal", "index", "(Landroidx/collection/ArraySet;I)Ljava/lang/Object;", "removeInternal", "retainAllInternal", "toStringInternal", "", "valueAtInternal", "collection"})
/*     */ public final class ArraySetKt
/*     */ {
/*     */   public static final int ARRAY_SET_BASE_SIZE = 4;
/*     */   
/*     */   @NotNull
/*     */   public static final <T> ArraySet<T> arraySetOf() {
/*  26 */     int $i$f$arraySetOf = 0; return new ArraySet<>(0, 1, null);
/*     */   }
/*     */   @NotNull
/*     */   public static final <T> ArraySet<T> arraySetOf(@NotNull Object... values) {
/*  30 */     Intrinsics.checkNotNullParameter(values, "values"); ArraySet<Object> set = new ArraySet(values.length); byte b;
/*     */     int i;
/*  32 */     for (b = 0, i = values.length; b < i; ) { Object value = values[b];
/*  33 */       set.add(value); b++; }
/*     */     
/*  35 */     return (ArraySet)set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final <E> int binarySearchInternal(@NotNull ArraySet $this$binarySearchInternal, int hash) {
/*     */     int i;
/* 245 */     Intrinsics.checkNotNullParameter($this$binarySearchInternal, "<this>"); 
/* 246 */     try { i = ContainerHelpersKt.binarySearch($this$binarySearchInternal.getHashes$collection(), $this$binarySearchInternal.get_size$collection(), hash); }
/* 247 */     catch (IndexOutOfBoundsException e)
/* 248 */     { throw new ConcurrentModificationException(); }  return i;
/*     */   }
/*     */   
/*     */   public static final <E> int indexOf(@NotNull ArraySet<?> $this$indexOf, @Nullable Object key, int hash) {
/* 252 */     Intrinsics.checkNotNullParameter($this$indexOf, "<this>"); int n = $this$indexOf.get_size$collection();
/*     */ 
/*     */     
/* 255 */     if (n == 0) {
/* 256 */       return -1;
/*     */     }
/* 258 */     int index = binarySearchInternal($this$indexOf, hash);
/*     */ 
/*     */     
/* 261 */     if (index < 0) {
/* 262 */       return index;
/*     */     }
/*     */ 
/*     */     
/* 266 */     if (Intrinsics.areEqual(key, $this$indexOf.getArray$collection()[index])) {
/* 267 */       return index;
/*     */     }
/*     */ 
/*     */     
/* 271 */     int end = index + 1;
/* 272 */     while (end < n && $this$indexOf.getHashes$collection()[end] == hash) {
/* 273 */       if (Intrinsics.areEqual(key, $this$indexOf.getArray$collection()[end])) {
/* 274 */         return end;
/*     */       }
/* 276 */       end++;
/*     */     } 
/*     */ 
/*     */     
/* 280 */     int i = index - 1;
/* 281 */     while (i >= 0 && $this$indexOf.getHashes$collection()[i] == hash) {
/* 282 */       if (Intrinsics.areEqual(key, $this$indexOf.getArray$collection()[i])) {
/* 283 */         return i;
/*     */       }
/* 285 */       i--;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 292 */     return end ^ 0xFFFFFFFF;
/*     */   }
/*     */   public static final <E> int indexOfNull(@NotNull ArraySet<?> $this$indexOfNull) {
/* 295 */     Intrinsics.checkNotNullParameter($this$indexOfNull, "<this>"); return indexOf($this$indexOfNull, null, 0);
/*     */   }
/*     */   public static final <E> void allocArrays(@NotNull ArraySet $this$allocArrays, int size) {
/* 298 */     Intrinsics.checkNotNullParameter($this$allocArrays, "<this>"); $this$allocArrays.setHashes$collection(new int[size]);
/* 299 */     $this$allocArrays.setArray$collection(new Object[size]);
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> void clearInternal(@NotNull ArraySet $this$clearInternal) {
/* 304 */     Intrinsics.checkNotNullParameter($this$clearInternal, "<this>"); int $i$f$clearInternal = 0; if ($this$clearInternal.get_size$collection() != 0) {
/* 305 */       $this$clearInternal.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
/* 306 */       $this$clearInternal.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
/* 307 */       $this$clearInternal.set_size$collection(0);
/*     */     } 
/*     */     
/* 310 */     if ($this$clearInternal.get_size$collection() != 0) {
/* 311 */       throw new ConcurrentModificationException();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> void ensureCapacityInternal(@NotNull ArraySet<?> $this$ensureCapacityInternal, int minimumCapacity) {
/* 317 */     Intrinsics.checkNotNullParameter($this$ensureCapacityInternal, "<this>"); int $i$f$ensureCapacityInternal = 0, oSize = $this$ensureCapacityInternal.get_size$collection();
/* 318 */     if (($this$ensureCapacityInternal.getHashes$collection()).length < minimumCapacity) {
/* 319 */       int[] ohashes = $this$ensureCapacityInternal.getHashes$collection();
/* 320 */       Object[] oarray = $this$ensureCapacityInternal.getArray$collection();
/* 321 */       allocArrays($this$ensureCapacityInternal, minimumCapacity);
/* 322 */       if ($this$ensureCapacityInternal.get_size$collection() > 0) {
/* 323 */         ArraysKt.copyInto$default(ohashes, $this$ensureCapacityInternal.getHashes$collection(), 0, 0, $this$ensureCapacityInternal.get_size$collection(), 6, null);
/* 324 */         ArraysKt.copyInto$default(oarray, $this$ensureCapacityInternal.getArray$collection(), 0, 0, $this$ensureCapacityInternal.get_size$collection(), 6, null);
/*     */       } 
/*     */     } 
/* 327 */     if ($this$ensureCapacityInternal.get_size$collection() != oSize) {
/* 328 */       throw new ConcurrentModificationException();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> boolean containsInternal(@NotNull ArraySet $this$containsInternal, Object element) {
/* 334 */     Intrinsics.checkNotNullParameter($this$containsInternal, "<this>"); int $i$f$containsInternal = 0; return ($this$containsInternal.indexOf(element) >= 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> int indexOfInternal(@NotNull ArraySet<?> $this$indexOfInternal, @Nullable Object key) {
/* 339 */     Intrinsics.checkNotNullParameter($this$indexOfInternal, "<this>"); int $i$f$indexOfInternal = 0; return (key == null) ? indexOfNull($this$indexOfInternal) : indexOf($this$indexOfInternal, key, key.hashCode());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final <E> E valueAtInternal(@NotNull ArraySet $this$valueAtInternal, int index) {
/* 345 */     Intrinsics.checkNotNullParameter($this$valueAtInternal, "<this>"); int $i$f$valueAtInternal = 0; return (E)$this$valueAtInternal.getArray$collection()[index];
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> boolean isEmptyInternal(@NotNull ArraySet $this$isEmptyInternal) {
/* 350 */     Intrinsics.checkNotNullParameter($this$isEmptyInternal, "<this>"); int $i$f$isEmptyInternal = 0; return ($this$isEmptyInternal.get_size$collection() <= 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> boolean addInternal(@NotNull ArraySet<?> $this$addInternal, Object element) {
/* 355 */     Intrinsics.checkNotNullParameter($this$addInternal, "<this>"); int $i$f$addInternal = 0, oSize = $this$addInternal.get_size$collection();
/* 356 */     int hash = 0;
/* 357 */     int index = 0;
/* 358 */     if (element == null) {
/* 359 */       hash = 0;
/* 360 */       index = indexOfNull($this$addInternal);
/*     */     } else {
/* 362 */       hash = element.hashCode();
/* 363 */       index = indexOf($this$addInternal, element, hash);
/*     */     } 
/*     */     
/* 366 */     if (index >= 0) {
/* 367 */       return false;
/*     */     }
/*     */     
/* 370 */     index ^= 0xFFFFFFFF;
/* 371 */     if (oSize >= ($this$addInternal.getHashes$collection()).length) {
/* 372 */       int n = 
/*     */         
/* 374 */         (oSize >= 8) ? (oSize + (oSize >> 1)) : (
/* 375 */         (oSize >= 4) ? 8 : 
/* 376 */         4);
/*     */ 
/*     */       
/* 379 */       int[] ohashes = $this$addInternal.getHashes$collection();
/* 380 */       Object[] oarray = $this$addInternal.getArray$collection();
/* 381 */       allocArrays($this$addInternal, n);
/*     */       
/* 383 */       if (oSize != $this$addInternal.get_size$collection()) {
/* 384 */         throw new ConcurrentModificationException();
/*     */       }
/*     */       
/* 387 */       if (!((($this$addInternal.getHashes$collection()).length == 0) ? 1 : 0)) {
/* 388 */         ArraysKt.copyInto$default(ohashes, $this$addInternal.getHashes$collection(), 0, 0, ohashes.length, 6, null);
/* 389 */         ArraysKt.copyInto$default(oarray, $this$addInternal.getArray$collection(), 0, 0, oarray.length, 6, null);
/*     */       } 
/*     */     } 
/*     */     
/* 393 */     if (index < oSize) {
/* 394 */       ArraysKt.copyInto($this$addInternal.getHashes$collection(), 
/* 395 */           $this$addInternal.getHashes$collection(), 
/* 396 */           index + 1, 
/* 397 */           index, 
/* 398 */           oSize);
/*     */       
/* 400 */       ArraysKt.copyInto($this$addInternal.getArray$collection(), 
/* 401 */           $this$addInternal.getArray$collection(), 
/* 402 */           index + 1, 
/* 403 */           index, 
/* 404 */           oSize);
/*     */     } 
/*     */ 
/*     */     
/* 408 */     if (oSize != $this$addInternal.get_size$collection() || index >= ($this$addInternal.getHashes$collection()).length) {
/* 409 */       throw new ConcurrentModificationException();
/*     */     }
/*     */     
/* 412 */     $this$addInternal.getHashes$collection()[index] = hash;
/* 413 */     $this$addInternal.getArray$collection()[index] = element;
/* 414 */     int i = $this$addInternal.get_size$collection(); $this$addInternal.set_size$collection(i + 1);
/* 415 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> void addAllInternal(@NotNull ArraySet $this$addAllInternal, @NotNull ArraySet array) {
/* 420 */     Intrinsics.checkNotNullParameter($this$addAllInternal, "<this>"); Intrinsics.checkNotNullParameter(array, "array"); int $i$f$addAllInternal = 0, n = array.get_size$collection();
/* 421 */     $this$addAllInternal.ensureCapacity($this$addAllInternal.get_size$collection() + n);
/* 422 */     if ($this$addAllInternal.get_size$collection() == 0) {
/* 423 */       if (n > 0) {
/* 424 */         ArraysKt.copyInto$default(array.getHashes$collection(), $this$addAllInternal.getHashes$collection(), 0, 0, n, 6, null);
/* 425 */         ArraysKt.copyInto$default(array.getArray$collection(), $this$addAllInternal.getArray$collection(), 0, 0, n, 6, null);
/* 426 */         if ($this$addAllInternal.get_size$collection() != 0) {
/* 427 */           throw new ConcurrentModificationException();
/*     */         }
/* 429 */         $this$addAllInternal.set_size$collection(n);
/*     */       } 
/*     */     } else {
/* 432 */       for (int i = 0; i < n; i++) {
/* 433 */         $this$addAllInternal.add(array.valueAt(i));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> boolean removeInternal(@NotNull ArraySet $this$removeInternal, Object element) {
/* 440 */     Intrinsics.checkNotNullParameter($this$removeInternal, "<this>"); int $i$f$removeInternal = 0, index = $this$removeInternal.indexOf(element);
/* 441 */     if (index >= 0) {
/* 442 */       $this$removeInternal.removeAt(index);
/* 443 */       return true;
/*     */     } 
/* 445 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> E removeAtInternal(@NotNull ArraySet<?> $this$removeAtInternal, int index) {
/* 450 */     Intrinsics.checkNotNullParameter($this$removeAtInternal, "<this>"); int $i$f$removeAtInternal = 0, oSize = $this$removeAtInternal.get_size$collection();
/* 451 */     Object old = $this$removeAtInternal.getArray$collection()[index];
/* 452 */     if (oSize <= 1) {
/*     */       
/* 454 */       $this$removeAtInternal.clear();
/*     */     } else {
/* 456 */       int nSize = oSize - 1;
/* 457 */       if (($this$removeAtInternal.getHashes$collection()).length > 8 && $this$removeAtInternal.get_size$collection() < ($this$removeAtInternal.getHashes$collection()).length / 3) {
/*     */ 
/*     */ 
/*     */         
/* 461 */         int n = 
/* 462 */           ($this$removeAtInternal.get_size$collection() > 8) ? ($this$removeAtInternal.get_size$collection() + ($this$removeAtInternal.get_size$collection() >> 1)) : 
/* 463 */           8;
/*     */         
/* 465 */         int[] ohashes = $this$removeAtInternal.getHashes$collection();
/* 466 */         Object[] oarray = $this$removeAtInternal.getArray$collection();
/* 467 */         allocArrays($this$removeAtInternal, n);
/* 468 */         if (index > 0) {
/* 469 */           ArraysKt.copyInto$default(ohashes, $this$removeAtInternal.getHashes$collection(), 0, 0, index, 6, null);
/* 470 */           ArraysKt.copyInto$default(oarray, $this$removeAtInternal.getArray$collection(), 0, 0, index, 6, null);
/*     */         } 
/* 472 */         if (index < nSize) {
/* 473 */           ArraysKt.copyInto(ohashes, 
/* 474 */               $this$removeAtInternal.getHashes$collection(), 
/* 475 */               index, 
/* 476 */               index + 1, 
/* 477 */               nSize + 1);
/*     */           
/* 479 */           ArraysKt.copyInto(oarray, 
/* 480 */               $this$removeAtInternal.getArray$collection(), 
/* 481 */               index, 
/* 482 */               index + 1, 
/* 483 */               nSize + 1);
/*     */         } 
/*     */       } else {
/*     */         
/* 487 */         if (index < nSize) {
/* 488 */           ArraysKt.copyInto($this$removeAtInternal.getHashes$collection(), 
/* 489 */               $this$removeAtInternal.getHashes$collection(), 
/* 490 */               index, 
/* 491 */               index + 1, 
/* 492 */               nSize + 1);
/*     */           
/* 494 */           ArraysKt.copyInto($this$removeAtInternal.getArray$collection(), 
/* 495 */               $this$removeAtInternal.getArray$collection(), 
/* 496 */               index, 
/* 497 */               index + 1, 
/* 498 */               nSize + 1);
/*     */         } 
/*     */         
/* 501 */         $this$removeAtInternal.getArray$collection()[nSize] = null;
/*     */       } 
/* 503 */       if (oSize != $this$removeAtInternal.get_size$collection()) {
/* 504 */         throw new ConcurrentModificationException();
/*     */       }
/* 506 */       $this$removeAtInternal.set_size$collection(nSize);
/*     */     } 
/*     */     
/* 509 */     return (E)old;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final <E> boolean removeAllInternal(@NotNull ArraySet $this$removeAllInternal, @NotNull ArraySet array) {
/* 518 */     Intrinsics.checkNotNullParameter($this$removeAllInternal, "<this>"); Intrinsics.checkNotNullParameter(array, "array"); int $i$f$removeAllInternal = 0, n = array.get_size$collection();
/*     */ 
/*     */ 
/*     */     
/* 522 */     int originalSize = $this$removeAllInternal.get_size$collection();
/* 523 */     for (int i = 0; i < n; i++) {
/* 524 */       $this$removeAllInternal.remove(array.valueAt(i));
/*     */     }
/* 526 */     return (originalSize != $this$removeAllInternal.get_size$collection());
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> boolean equalsInternal(@NotNull ArraySet $this$equalsInternal, @Nullable Object other) {
/* 531 */     Intrinsics.checkNotNullParameter($this$equalsInternal, "<this>"); int $i$f$equalsInternal = 0; if ($this$equalsInternal == other) {
/* 532 */       return true;
/*     */     }
/* 534 */     if (other instanceof Set) {
/* 535 */       if ($this$equalsInternal.size() != ((Set)other).size()) {
/* 536 */         return false;
/*     */       }
/*     */       try {
/* 539 */         for (int i = 0, j = $this$equalsInternal.get_size$collection(); i < j; i++) {
/* 540 */           Object mine = $this$equalsInternal.valueAt(i);
/* 541 */           if (!((Set)other).contains(mine)) {
/* 542 */             return false;
/*     */           }
/*     */         } 
/* 545 */       } catch (NullPointerException ignored) {
/* 546 */         return false;
/* 547 */       } catch (ClassCastException ignored) {
/* 548 */         return false;
/*     */       } 
/* 550 */       return true;
/*     */     } 
/* 552 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> int hashCodeInternal(@NotNull ArraySet $this$hashCodeInternal) {
/* 557 */     Intrinsics.checkNotNullParameter($this$hashCodeInternal, "<this>"); int $i$f$hashCodeInternal = 0, hashes[] = $this$hashCodeInternal.getHashes$collection();
/* 558 */     int s = $this$hashCodeInternal.get_size$collection();
/* 559 */     int result = 0;
/* 560 */     for (int i = 0; i < s; i++) {
/* 561 */       result += hashes[i];
/*     */     }
/* 563 */     return result;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <E> String toStringInternal(@NotNull ArraySet $this$toStringInternal) {
/* 568 */     Intrinsics.checkNotNullParameter($this$toStringInternal, "<this>"); int $i$f$toStringInternal = 0; if ($this$toStringInternal.isEmpty()) {
/* 569 */       return "{}";
/*     */     }
/*     */     
/* 572 */     int j = $this$toStringInternal.get_size$collection() * 14; StringBuilder stringBuilder1 = new StringBuilder(j), $this$toStringInternal_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-ArraySetKt$toStringInternal$1 = 0;
/* 573 */     $this$toStringInternal_u24lambda_u240.append('{');
/* 574 */     for (int i = 0, k = $this$toStringInternal.get_size$collection(); i < k; i++) {
/* 575 */       if (i > 0) {
/* 576 */         $this$toStringInternal_u24lambda_u240.append(", ");
/*     */       }
/* 578 */       Object value = $this$toStringInternal.valueAt(i);
/* 579 */       if (value != $this$toStringInternal) {
/* 580 */         $this$toStringInternal_u24lambda_u240.append(value);
/*     */       } else {
/* 582 */         $this$toStringInternal_u24lambda_u240.append("(this Set)");
/*     */       } 
/*     */     } 
/* 585 */     $this$toStringInternal_u24lambda_u240.append('}');
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder(capacity).…builderAction).toString()");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   public static final <E> boolean containsAllInternal(@NotNull ArraySet $this$containsAllInternal, @NotNull Collection elements) {
/* 591 */     Intrinsics.checkNotNullParameter($this$containsAllInternal, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); int $i$f$containsAllInternal = 0; for (Object item : elements) {
/* 592 */       if (!$this$containsAllInternal.contains(item)) {
/* 593 */         return false;
/*     */       }
/*     */     } 
/* 596 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> boolean addAllInternal(@NotNull ArraySet<Object> $this$addAllInternal, @NotNull Collection elements) {
/* 601 */     Intrinsics.checkNotNullParameter($this$addAllInternal, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); int $i$f$addAllInternal = 0; $this$addAllInternal.ensureCapacity($this$addAllInternal.get_size$collection() + elements.size());
/* 602 */     boolean added = false;
/* 603 */     for (Object value : elements) {
/* 604 */       added = $this$addAllInternal.add(value) | added;
/*     */     }
/* 606 */     return added;
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> boolean removeAllInternal(@NotNull ArraySet $this$removeAllInternal, @NotNull Collection elements) {
/* 611 */     Intrinsics.checkNotNullParameter($this$removeAllInternal, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); int $i$f$removeAllInternal = 0; boolean removed = false;
/* 612 */     for (Object value : elements) {
/* 613 */       removed |= $this$removeAllInternal.remove(value);
/*     */     }
/* 615 */     return removed;
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <E> boolean retainAllInternal(@NotNull ArraySet $this$retainAllInternal, @NotNull Collection elements) {
/* 620 */     Intrinsics.checkNotNullParameter($this$retainAllInternal, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); int $i$f$retainAllInternal = 0; boolean removed = false;
/* 621 */     for (int i = $this$retainAllInternal.get_size$collection() - 1; -1 < i; i--) {
/* 622 */       if (!CollectionsKt.contains(elements, $this$retainAllInternal.getArray$collection()[i])) {
/* 623 */         $this$retainAllInternal.removeAt(i);
/* 624 */         removed = true;
/*     */       } 
/*     */     } 
/* 627 */     return removed;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\ArraySetKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */