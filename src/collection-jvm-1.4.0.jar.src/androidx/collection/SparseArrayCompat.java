/*     */ package androidx.collection;
/*     */ 
/*     */ import androidx.collection.internal.ContainerHelpersKt;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.JvmOverloads;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\000\n\002\020\032\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\004\n\002\020\025\n\002\b\002\n\002\020\021\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\037\n\002\020\016\n\002\b\002\b\026\030\000*\004\b\000\020\0012\0020\002B\021\b\007\022\b\b\002\020\003\032\0020\004¢\006\002\020\005J\035\020\022\032\0020\0232\006\020\024\032\0020\0042\006\020\025\032\0028\000H\026¢\006\002\020\026J\b\020\027\032\0020\023H\026J\016\020\030\032\b\022\004\022\0028\0000\000H\026J\020\020\031\032\0020\0072\006\020\024\032\0020\004H\026J\025\020\032\032\0020\0072\006\020\025\032\0028\000H\026¢\006\002\020\033J\020\020\034\032\0020\0232\006\020\024\032\0020\004H\027J\030\020\035\032\004\030\0018\0002\006\020\024\032\0020\004H\002¢\006\002\020\036J\035\020\035\032\0028\0002\006\020\024\032\0020\0042\006\020\037\032\0028\000H\026¢\006\002\020 J\020\020!\032\0020\0042\006\020\024\032\0020\004H\026J\025\020\"\032\0020\0042\006\020\025\032\0028\000H\026¢\006\002\020#J\b\020\b\032\0020\007H\026J\020\020$\032\0020\0042\006\020%\032\0020\004H\026J\035\020&\032\0020\0232\006\020\024\032\0020\0042\006\020\025\032\0028\000H\026¢\006\002\020\026J\030\020'\032\0020\0232\016\020(\032\n\022\006\b\001\022\0028\0000\000H\026J\037\020)\032\004\030\0018\0002\006\020\024\032\0020\0042\006\020\025\032\0028\000H\026¢\006\002\020 J\020\020*\032\0020\0232\006\020\024\032\0020\004H\026J\032\020*\032\0020\0072\006\020\024\032\0020\0042\b\020\025\032\004\030\0010\020H\026J\020\020+\032\0020\0232\006\020%\032\0020\004H\026J\030\020,\032\0020\0232\006\020%\032\0020\0042\006\020\r\032\0020\004H\026J\037\020-\032\004\030\0018\0002\006\020\024\032\0020\0042\006\020\025\032\0028\000H\026¢\006\002\020 J%\020-\032\0020\0072\006\020\024\032\0020\0042\006\020.\032\0028\0002\006\020/\032\0028\000H\026¢\006\002\0200J\035\0201\032\0020\0232\006\020%\032\0020\0042\006\020\025\032\0028\000H\026¢\006\002\020\026J\b\020\r\032\0020\004H\026J\b\0202\032\00203H\026J\025\0204\032\0028\0002\006\020%\032\0020\004H\026¢\006\002\020\036R\022\020\006\032\0020\0078\000@\000X\016¢\006\002\n\000R\021\020\b\032\0020\0078G¢\006\006\032\004\b\t\020\nR\022\020\013\032\0020\f8\000@\000X\016¢\006\002\n\000R\022\020\r\032\0020\0048\000@\000X\016¢\006\002\n\000R\034\020\016\032\n\022\006\022\004\030\0010\0200\0178\000@\000X\016¢\006\004\n\002\020\021¨\0065"}, d2 = {"Landroidx/collection/SparseArrayCompat;", "E", "", "initialCapacity", "", "(I)V", "garbage", "", "isEmpty", "getIsEmpty", "()Z", "keys", "", "size", "values", "", "", "[Ljava/lang/Object;", "append", "", "key", "value", "(ILjava/lang/Object;)V", "clear", "clone", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "delete", "get", "(I)Ljava/lang/Object;", "defaultValue", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOfKey", "indexOfValue", "(Ljava/lang/Object;)I", "keyAt", "index", "put", "putAll", "other", "putIfAbsent", "remove", "removeAt", "removeAtRange", "replace", "oldValue", "newValue", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "toString", "", "valueAt", "collection"})
/*     */ @SourceDebugExtension({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,273:1\n275#2,9:274\n288#2,5:283\n296#2,5:288\n304#2,8:293\n320#2,9:301\n353#2,40:310\n396#2,2:350\n353#2,47:352\n403#2,3:399\n353#2,40:402\n407#2:442\n412#2,4:443\n419#2:447\n423#2,4:448\n431#2,8:452\n443#2,5:460\n451#2,4:465\n459#2,9:469\n472#2:478\n477#2:479\n459#2,9:480\n482#2,8:489\n493#2,17:497\n513#2,21:514\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n130#1:274,9\n135#1:283,5\n144#1:288,5\n152#1:293,8\n163#1:301,9\n169#1:310,40\n176#1:350,2\n176#1:352,47\n186#1:399,3\n186#1:402,40\n186#1:442\n191#1:443,4\n205#1:447\n212#1:448,4\n218#1:452,8\n224#1:460,5\n234#1:465,4\n246#1:469,9\n249#1:478\n252#1:479\n252#1:480,9\n257#1:489,8\n263#1:497,17\n271#1:514,21\n*E\n"})
/*     */ public class SparseArrayCompat<E>
/*     */   implements Cloneable
/*     */ {
/*     */   @JvmOverloads
/*     */   public SparseArrayCompat(int initialCapacity) {
/*  81 */     if (initialCapacity == 0) {
/*  82 */       this.keys = ContainerHelpersKt.EMPTY_INTS;
/*  83 */       this.values = ContainerHelpersKt.EMPTY_OBJECTS;
/*     */     } else {
/*  85 */       int capacity = ContainerHelpersKt.idealIntArraySize(initialCapacity);
/*  86 */       this.keys = new int[capacity];
/*  87 */       this.values = new Object[capacity];
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public SparseArrayCompat<E> clone() {
/*  93 */     Intrinsics.checkNotNull(super.clone(), "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>"); SparseArrayCompat<E> clone = (SparseArrayCompat)super.clone();
/*  94 */     clone.keys = (int[])this.keys.clone();
/*  95 */     clone.values = (Object[])this.values.clone();
/*  96 */     return clone;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public E get(int key) {
/* 102 */     return SparseArrayCompatKt.commonGet(this, key);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public E get(int key, Object defaultValue) {
/* 108 */     return SparseArrayCompatKt.commonGet(this, key, (E)defaultValue);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated(message = "Alias for remove(int).", replaceWith = @ReplaceWith(expression = "remove(key)", imports = {}))
/*     */   public void delete(int key) {
/* 115 */     remove(key);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void remove(int key) {
/* 121 */     SparseArrayCompatKt.commonRemove(this, key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean remove(int key, @Nullable Object value) {
/* 130 */     SparseArrayCompat $this$commonRemove$iv = this; int $i$f$commonRemove = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 274 */     int index$iv = $this$commonRemove$iv.indexOfKey(key);
/* 275 */     if (index$iv >= 0) {
/* 276 */       Object mapValue$iv = $this$commonRemove$iv.valueAt(index$iv);
/* 277 */       if (Intrinsics.areEqual(value, mapValue$iv))
/* 278 */         $this$commonRemove$iv.removeAt(index$iv); 
/*     */     } 
/*     */     return false;
/*     */   } public void removeAt(int index) { SparseArrayCompat $this$commonRemoveAt$iv = this;
/*     */     int $i$f$commonRemoveAt = 0;
/* 283 */     if ($this$commonRemoveAt$iv.values[index] != SparseArrayCompatKt.access$getDELETED$p()) {
/* 284 */       $this$commonRemoveAt$iv.values[index] = SparseArrayCompatKt.access$getDELETED$p();
/* 285 */       $this$commonRemoveAt$iv.garbage = true;
/*     */     }  } public void removeAtRange(int index, int size) { SparseArrayCompat $this$commonRemoveAtRange$iv = this;
/*     */     int $i$f$commonRemoveAtRange = 0;
/* 288 */     int end$iv = Math.min(size, index + size);
/* 289 */     for (int i$iv = index; i$iv < end$iv; i$iv++)
/* 290 */       $this$commonRemoveAtRange$iv.removeAt(i$iv);  } @Nullable
/*     */   public E replace(int key, Object value) { SparseArrayCompat $this$commonReplace$iv = this;
/*     */     int $i$f$commonReplace = 0;
/* 293 */     int index$iv = $this$commonReplace$iv.indexOfKey(key);
/*     */ 
/*     */     
/* 296 */     Object oldValue$iv = $this$commonReplace$iv.values[index$iv];
/* 297 */     $this$commonReplace$iv.values[index$iv] = value;
/* 298 */     return (index$iv >= 0) ? (E)oldValue$iv : 
/*     */       
/* 300 */       null; } public boolean replace(int key, Object oldValue, Object newValue) { SparseArrayCompat $this$commonReplace$iv = this; int $i$f$commonReplace = 0;
/* 301 */     int index$iv = $this$commonReplace$iv.indexOfKey(key);
/* 302 */     if (index$iv >= 0) {
/* 303 */       Object mapValue$iv = $this$commonReplace$iv.values[index$iv];
/* 304 */       if (Intrinsics.areEqual(mapValue$iv, oldValue))
/* 305 */         $this$commonReplace$iv.values[index$iv] = newValue; 
/*     */     } 
/*     */     return false; }
/*     */   public void put(int key, Object value) { SparseArrayCompat $this$commonPut$iv = this;
/*     */     int $i$f$commonPut = 0;
/* 310 */     int i$iv = ContainerHelpersKt.binarySearch($this$commonPut$iv.keys, $this$commonPut$iv.size, key);
/* 311 */     if (i$iv >= 0) {
/* 312 */       $this$commonPut$iv.values[i$iv] = value;
/*     */     } else {
/* 314 */       i$iv ^= 0xFFFFFFFF;
/* 315 */       if (i$iv < $this$commonPut$iv.size && $this$commonPut$iv.values[i$iv] == SparseArrayCompatKt.access$getDELETED$p()) {
/* 316 */         $this$commonPut$iv.keys[i$iv] = key;
/* 317 */         $this$commonPut$iv.values[i$iv] = value;
/*     */       } else {
/*     */         
/* 320 */         if ($this$commonPut$iv.garbage && $this$commonPut$iv.size >= $this$commonPut$iv.keys.length) {
/* 321 */           SparseArrayCompatKt.access$gc($this$commonPut$iv);
/*     */ 
/*     */           
/* 324 */           i$iv = ContainerHelpersKt.binarySearch($this$commonPut$iv.keys, $this$commonPut$iv.size, key) ^ 0xFFFFFFFF;
/*     */         } 
/* 326 */         if ($this$commonPut$iv.size >= $this$commonPut$iv.keys.length) {
/* 327 */           int n$iv = ContainerHelpersKt.idealIntArraySize($this$commonPut$iv.size + 1);
/* 328 */           Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonPut$iv.keys, n$iv), "copyOf(this, newSize)"); $this$commonPut$iv.keys = Arrays.copyOf($this$commonPut$iv.keys, n$iv);
/* 329 */           Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonPut$iv.values, n$iv), "copyOf(this, newSize)"); $this$commonPut$iv.values = Arrays.copyOf($this$commonPut$iv.values, n$iv);
/*     */         } 
/* 331 */         if ($this$commonPut$iv.size - i$iv != 0) {
/* 332 */           ArraysKt.copyInto($this$commonPut$iv.keys, 
/* 333 */               $this$commonPut$iv.keys, 
/* 334 */               i$iv + 1, 
/* 335 */               i$iv, 
/* 336 */               $this$commonPut$iv.size);
/*     */           
/* 338 */           ArraysKt.copyInto($this$commonPut$iv.values, 
/* 339 */               $this$commonPut$iv.values, 
/* 340 */               i$iv + 1, 
/* 341 */               i$iv, 
/* 342 */               $this$commonPut$iv.size);
/*     */         } 
/*     */         
/* 345 */         $this$commonPut$iv.keys[i$iv] = key;
/* 346 */         $this$commonPut$iv.values[i$iv] = value;
/* 347 */         int i = $this$commonPut$iv.size; $this$commonPut$iv.size = i + 1;
/*     */       }  return;
/*     */     }  } public void putAll(@NotNull SparseArrayCompat other) { Intrinsics.checkNotNullParameter(other, "other"); SparseArrayCompat $this$commonPutAll$iv = this; int $i$f$commonPutAll = 0;
/* 350 */     int i$iv = 0, i = other.size(); if (i$iv < i) {
/* 351 */       SparseArrayCompat sparseArrayCompat = $this$commonPutAll$iv; int j = other.keyAt(i$iv); Object value$iv$iv = other.valueAt(i$iv); int $i$f$commonPut = 0;
/* 352 */       int i$iv$iv = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, j);
/* 353 */       if (i$iv$iv >= 0) {
/* 354 */         sparseArrayCompat.values[i$iv$iv] = value$iv$iv;
/*     */       } else {
/* 356 */         i$iv$iv ^= 0xFFFFFFFF;
/* 357 */         if (i$iv$iv < sparseArrayCompat.size && sparseArrayCompat.values[i$iv$iv] == SparseArrayCompatKt.access$getDELETED$p()) {
/* 358 */           sparseArrayCompat.keys[i$iv$iv] = j;
/* 359 */           sparseArrayCompat.values[i$iv$iv] = value$iv$iv;
/*     */         } else {
/*     */           
/* 362 */           if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
/* 363 */             SparseArrayCompatKt.access$gc(sparseArrayCompat);
/*     */ 
/*     */             
/* 366 */             i$iv$iv = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, j) ^ 0xFFFFFFFF;
/*     */           } 
/* 368 */           if (sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
/* 369 */             int n$iv$iv = ContainerHelpersKt.idealIntArraySize(sparseArrayCompat.size + 1);
/* 370 */             Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(sparseArrayCompat.keys, n$iv$iv), "copyOf(this, newSize)"); sparseArrayCompat.keys = Arrays.copyOf(sparseArrayCompat.keys, n$iv$iv);
/* 371 */             Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(sparseArrayCompat.values, n$iv$iv), "copyOf(this, newSize)"); sparseArrayCompat.values = Arrays.copyOf(sparseArrayCompat.values, n$iv$iv);
/*     */           } 
/* 373 */           if (sparseArrayCompat.size - i$iv$iv != 0) {
/* 374 */             ArraysKt.copyInto(sparseArrayCompat.keys, 
/* 375 */                 sparseArrayCompat.keys, 
/* 376 */                 i$iv$iv + 1, 
/* 377 */                 i$iv$iv, 
/* 378 */                 sparseArrayCompat.size);
/*     */             
/* 380 */             ArraysKt.copyInto(sparseArrayCompat.values, 
/* 381 */                 sparseArrayCompat.values, 
/* 382 */                 i$iv$iv + 1, 
/* 383 */                 i$iv$iv, 
/* 384 */                 sparseArrayCompat.size);
/*     */           } 
/*     */           
/* 387 */           sparseArrayCompat.keys[i$iv$iv] = j;
/* 388 */           sparseArrayCompat.values[i$iv$iv] = value$iv$iv;
/* 389 */           int k = sparseArrayCompat.size; sparseArrayCompat.size = k + 1;
/*     */         } 
/*     */         i$iv++;
/*     */       } 
/*     */     } else {
/*     */       return;
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public E putIfAbsent(int key, Object value) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: astore_3
/*     */     //   2: iconst_0
/*     */     //   3: istore #4
/*     */     //   5: aload_3
/*     */     //   6: iload_1
/*     */     //   7: invokestatic commonGet : (Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;
/*     */     //   10: astore #5
/*     */     //   12: aload #5
/*     */     //   14: ifnonnull -> 316
/*     */     //   17: aload_3
/*     */     //   18: astore #6
/*     */     //   20: iconst_0
/*     */     //   21: istore #7
/*     */     //   23: aload #6
/*     */     //   25: getfield keys : [I
/*     */     //   28: aload #6
/*     */     //   30: getfield size : I
/*     */     //   33: iload_1
/*     */     //   34: invokestatic binarySearch : ([III)I
/*     */     //   37: istore #8
/*     */     //   39: iload #8
/*     */     //   41: iflt -> 56
/*     */     //   44: aload #6
/*     */     //   46: getfield values : [Ljava/lang/Object;
/*     */     //   49: iload #8
/*     */     //   51: aload_2
/*     */     //   52: aastore
/*     */     //   53: goto -> 315
/*     */     //   56: iload #8
/*     */     //   58: iconst_m1
/*     */     //   59: ixor
/*     */     //   60: istore #8
/*     */     //   62: iload #8
/*     */     //   64: aload #6
/*     */     //   66: getfield size : I
/*     */     //   69: if_icmpge -> 107
/*     */     //   72: aload #6
/*     */     //   74: getfield values : [Ljava/lang/Object;
/*     */     //   77: iload #8
/*     */     //   79: aaload
/*     */     //   80: invokestatic access$getDELETED$p : ()Ljava/lang/Object;
/*     */     //   83: if_acmpne -> 107
/*     */     //   86: aload #6
/*     */     //   88: getfield keys : [I
/*     */     //   91: iload #8
/*     */     //   93: iload_1
/*     */     //   94: iastore
/*     */     //   95: aload #6
/*     */     //   97: getfield values : [Ljava/lang/Object;
/*     */     //   100: iload #8
/*     */     //   102: aload_2
/*     */     //   103: aastore
/*     */     //   104: goto -> 316
/*     */     //   107: aload #6
/*     */     //   109: getfield garbage : Z
/*     */     //   112: ifeq -> 152
/*     */     //   115: aload #6
/*     */     //   117: getfield size : I
/*     */     //   120: aload #6
/*     */     //   122: getfield keys : [I
/*     */     //   125: arraylength
/*     */     //   126: if_icmplt -> 152
/*     */     //   129: aload #6
/*     */     //   131: invokestatic access$gc : (Landroidx/collection/SparseArrayCompat;)V
/*     */     //   134: aload #6
/*     */     //   136: getfield keys : [I
/*     */     //   139: aload #6
/*     */     //   141: getfield size : I
/*     */     //   144: iload_1
/*     */     //   145: invokestatic binarySearch : ([III)I
/*     */     //   148: iconst_m1
/*     */     //   149: ixor
/*     */     //   150: istore #8
/*     */     //   152: aload #6
/*     */     //   154: getfield size : I
/*     */     //   157: aload #6
/*     */     //   159: getfield keys : [I
/*     */     //   162: arraylength
/*     */     //   163: if_icmplt -> 220
/*     */     //   166: aload #6
/*     */     //   168: getfield size : I
/*     */     //   171: iconst_1
/*     */     //   172: iadd
/*     */     //   173: invokestatic idealIntArraySize : (I)I
/*     */     //   176: istore #9
/*     */     //   178: aload #6
/*     */     //   180: aload #6
/*     */     //   182: getfield keys : [I
/*     */     //   185: iload #9
/*     */     //   187: invokestatic copyOf : ([II)[I
/*     */     //   190: dup
/*     */     //   191: ldc 'copyOf(this, newSize)'
/*     */     //   193: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   196: putfield keys : [I
/*     */     //   199: aload #6
/*     */     //   201: aload #6
/*     */     //   203: getfield values : [Ljava/lang/Object;
/*     */     //   206: iload #9
/*     */     //   208: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   211: dup
/*     */     //   212: ldc 'copyOf(this, newSize)'
/*     */     //   214: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   217: putfield values : [Ljava/lang/Object;
/*     */     //   220: aload #6
/*     */     //   222: getfield size : I
/*     */     //   225: iload #8
/*     */     //   227: isub
/*     */     //   228: ifeq -> 281
/*     */     //   231: aload #6
/*     */     //   233: getfield keys : [I
/*     */     //   236: aload #6
/*     */     //   238: getfield keys : [I
/*     */     //   241: iload #8
/*     */     //   243: iconst_1
/*     */     //   244: iadd
/*     */     //   245: iload #8
/*     */     //   247: aload #6
/*     */     //   249: getfield size : I
/*     */     //   252: invokestatic copyInto : ([I[IIII)[I
/*     */     //   255: pop
/*     */     //   256: aload #6
/*     */     //   258: getfield values : [Ljava/lang/Object;
/*     */     //   261: aload #6
/*     */     //   263: getfield values : [Ljava/lang/Object;
/*     */     //   266: iload #8
/*     */     //   268: iconst_1
/*     */     //   269: iadd
/*     */     //   270: iload #8
/*     */     //   272: aload #6
/*     */     //   274: getfield size : I
/*     */     //   277: invokestatic copyInto : ([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;
/*     */     //   280: pop
/*     */     //   281: aload #6
/*     */     //   283: getfield keys : [I
/*     */     //   286: iload #8
/*     */     //   288: iload_1
/*     */     //   289: iastore
/*     */     //   290: aload #6
/*     */     //   292: getfield values : [Ljava/lang/Object;
/*     */     //   295: iload #8
/*     */     //   297: aload_2
/*     */     //   298: aastore
/*     */     //   299: aload #6
/*     */     //   301: getfield size : I
/*     */     //   304: istore #9
/*     */     //   306: aload #6
/*     */     //   308: iload #9
/*     */     //   310: iconst_1
/*     */     //   311: iadd
/*     */     //   312: putfield size : I
/*     */     //   315: nop
/*     */     //   316: aload #5
/*     */     //   318: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #186	-> 0
/*     */     //   #399	-> 5
/*     */     //   #400	-> 12
/*     */     //   #401	-> 17
/*     */     //   #402	-> 23
/*     */     //   #403	-> 39
/*     */     //   #404	-> 44
/*     */     //   #406	-> 56
/*     */     //   #407	-> 62
/*     */     //   #408	-> 86
/*     */     //   #409	-> 95
/*     */     //   #410	-> 104
/*     */     //   #412	-> 107
/*     */     //   #413	-> 129
/*     */     //   #416	-> 134
/*     */     //   #418	-> 152
/*     */     //   #419	-> 166
/*     */     //   #420	-> 178
/*     */     //   #420	-> 196
/*     */     //   #421	-> 199
/*     */     //   #421	-> 217
/*     */     //   #423	-> 220
/*     */     //   #424	-> 231
/*     */     //   #425	-> 236
/*     */     //   #426	-> 241
/*     */     //   #427	-> 245
/*     */     //   #428	-> 247
/*     */     //   #424	-> 252
/*     */     //   #430	-> 256
/*     */     //   #431	-> 261
/*     */     //   #432	-> 266
/*     */     //   #433	-> 270
/*     */     //   #434	-> 272
/*     */     //   #430	-> 277
/*     */     //   #437	-> 281
/*     */     //   #438	-> 290
/*     */     //   #439	-> 299
/*     */     //   #441	-> 315
/*     */     //   #442	-> 316
/*     */     //   #186	-> 318
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   178	42	9	n$iv$iv	I
/*     */     //   23	293	7	$i$f$commonPut	I
/*     */     //   39	277	8	i$iv$iv	I
/*     */     //   20	296	6	$this$commonPut$iv$iv	Landroidx/collection/SparseArrayCompat;
/*     */     //   5	313	4	$i$f$commonPutIfAbsent	I
/*     */     //   12	306	5	mapValue$iv	Ljava/lang/Object;
/*     */     //   2	316	3	$this$commonPutIfAbsent$iv	Landroidx/collection/SparseArrayCompat;
/*     */     //   0	319	0	this	Landroidx/collection/SparseArrayCompat;
/*     */     //   0	319	1	key	I
/*     */     //   0	319	2	value	Ljava/lang/Object;
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
/*     */   @JvmName(name = "getIsEmpty")
/*     */   public final boolean getIsEmpty() {
/*     */     return isEmpty();
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
/*     */   public int size() {
/*     */     SparseArrayCompat $this$commonSize$iv = this;
/*     */     int $i$f$commonSize = 0;
/* 443 */     if ($this$commonSize$iv.garbage) {
/* 444 */       SparseArrayCompatKt.access$gc($this$commonSize$iv);
/*     */     }
/* 446 */     return $this$commonSize$iv.size; } public boolean isEmpty() { SparseArrayCompat $this$commonIsEmpty$iv = this; int $i$f$commonIsEmpty = 0;
/* 447 */     return ($this$commonIsEmpty$iv.size() == 0); } public int keyAt(int index) { SparseArrayCompat $this$commonKeyAt$iv = this; int $i$f$commonKeyAt = 0;
/* 448 */     if ($this$commonKeyAt$iv.garbage) {
/* 449 */       SparseArrayCompatKt.access$gc($this$commonKeyAt$iv);
/*     */     }
/* 451 */     return $this$commonKeyAt$iv.keys[index]; } public E valueAt(int index) { SparseArrayCompat $this$commonValueAt$iv = this; int $i$f$commonValueAt = 0;
/* 452 */     if ($this$commonValueAt$iv.garbage) {
/* 453 */       SparseArrayCompatKt.access$gc($this$commonValueAt$iv);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 459 */     return (E)$this$commonValueAt$iv.values[index]; } public void setValueAt(int index, Object value) { SparseArrayCompat $this$commonSetValueAt$iv = this; int $i$f$commonSetValueAt = 0;
/* 460 */     if ($this$commonSetValueAt$iv.garbage) {
/* 461 */       SparseArrayCompatKt.access$gc($this$commonSetValueAt$iv);
/*     */     }
/* 463 */     $this$commonSetValueAt$iv.values[index] = value; } public int indexOfKey(int key) { SparseArrayCompat $this$commonIndexOfKey$iv = this;
/*     */     int $i$f$commonIndexOfKey = 0;
/* 465 */     if ($this$commonIndexOfKey$iv.garbage) {
/* 466 */       SparseArrayCompatKt.access$gc($this$commonIndexOfKey$iv);
/*     */     }
/* 468 */     return ContainerHelpersKt.binarySearch($this$commonIndexOfKey$iv.keys, $this$commonIndexOfKey$iv.size, key); }
/*     */ 
/*     */   
/*     */   public int indexOfValue(Object value) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: astore_2
/*     */     //   2: iconst_0
/*     */     //   3: istore_3
/*     */     //   4: aload_2
/*     */     //   5: getfield garbage : Z
/*     */     //   8: ifeq -> 15
/*     */     //   11: aload_2
/*     */     //   12: invokestatic access$gc : (Landroidx/collection/SparseArrayCompat;)V
/*     */     //   15: iconst_0
/*     */     //   16: istore #4
/*     */     //   18: aload_2
/*     */     //   19: getfield size : I
/*     */     //   22: istore #5
/*     */     //   24: iload #4
/*     */     //   26: iload #5
/*     */     //   28: if_icmpge -> 53
/*     */     //   31: aload_2
/*     */     //   32: getfield values : [Ljava/lang/Object;
/*     */     //   35: iload #4
/*     */     //   37: aaload
/*     */     //   38: aload_1
/*     */     //   39: if_acmpne -> 47
/*     */     //   42: iload #4
/*     */     //   44: goto -> 54
/*     */     //   47: iinc #4, 1
/*     */     //   50: goto -> 24
/*     */     //   53: iconst_m1
/*     */     //   54: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #246	-> 0
/*     */     //   #469	-> 4
/*     */     //   #470	-> 11
/*     */     //   #472	-> 15
/*     */     //   #473	-> 31
/*     */     //   #474	-> 42
/*     */     //   #472	-> 47
/*     */     //   #477	-> 53
/*     */     //   #246	-> 54
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   18	35	4	i$iv	I
/*     */     //   4	50	3	$i$f$commonIndexOfValue	I
/*     */     //   2	52	2	$this$commonIndexOfValue$iv	Landroidx/collection/SparseArrayCompat;
/*     */     //   0	55	0	this	Landroidx/collection/SparseArrayCompat;
/*     */     //   0	55	1	value	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public boolean containsKey(int key) {
/*     */     SparseArrayCompat $this$commonContainsKey$iv = this;
/*     */     int $i$f$commonContainsKey = 0;
/* 478 */     return ($this$commonContainsKey$iv.indexOfKey(key) >= 0);
/*     */   }
/*     */   
/*     */   public boolean containsValue(Object value) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: astore_2
/*     */     //   2: iconst_0
/*     */     //   3: istore_3
/*     */     //   4: aload_2
/*     */     //   5: astore #4
/*     */     //   7: iconst_0
/*     */     //   8: istore #5
/*     */     //   10: aload #4
/*     */     //   12: getfield garbage : Z
/*     */     //   15: ifeq -> 23
/*     */     //   18: aload #4
/*     */     //   20: invokestatic access$gc : (Landroidx/collection/SparseArrayCompat;)V
/*     */     //   23: iconst_0
/*     */     //   24: istore #6
/*     */     //   26: aload #4
/*     */     //   28: getfield size : I
/*     */     //   31: istore #7
/*     */     //   33: iload #6
/*     */     //   35: iload #7
/*     */     //   37: if_icmpge -> 63
/*     */     //   40: aload #4
/*     */     //   42: getfield values : [Ljava/lang/Object;
/*     */     //   45: iload #6
/*     */     //   47: aaload
/*     */     //   48: aload_1
/*     */     //   49: if_acmpne -> 57
/*     */     //   52: iload #6
/*     */     //   54: goto -> 64
/*     */     //   57: iinc #6, 1
/*     */     //   60: goto -> 33
/*     */     //   63: iconst_m1
/*     */     //   64: iflt -> 71
/*     */     //   67: iconst_1
/*     */     //   68: goto -> 72
/*     */     //   71: iconst_0
/*     */     //   72: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #252	-> 0
/*     */     //   #479	-> 4
/*     */     //   #480	-> 10
/*     */     //   #481	-> 18
/*     */     //   #483	-> 23
/*     */     //   #484	-> 40
/*     */     //   #485	-> 52
/*     */     //   #483	-> 57
/*     */     //   #488	-> 63
/*     */     //   #479	-> 64
/*     */     //   #252	-> 72
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   26	37	6	i$iv$iv	I
/*     */     //   10	54	5	$i$f$commonIndexOfValue	I
/*     */     //   7	57	4	$this$commonIndexOfValue$iv$iv	Landroidx/collection/SparseArrayCompat;
/*     */     //   4	68	3	$i$f$commonContainsValue	I
/*     */     //   2	70	2	$this$commonContainsValue$iv	Landroidx/collection/SparseArrayCompat;
/*     */     //   0	73	0	this	Landroidx/collection/SparseArrayCompat;
/*     */     //   0	73	1	value	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public void clear()
/*     */   {
/*     */     SparseArrayCompat $this$commonClear$iv = this;
/*     */     int $i$f$commonClear = 0;
/* 489 */     int n$iv = $this$commonClear$iv.size;
/* 490 */     Object[] values$iv = $this$commonClear$iv.values;
/* 491 */     for (int i$iv = 0; i$iv < n$iv; i$iv++) {
/* 492 */       values$iv[i$iv] = null;
/*     */     }
/* 494 */     $this$commonClear$iv.size = 0;
/* 495 */     $this$commonClear$iv.garbage = false; } public void append(int key, Object value) { SparseArrayCompat<Object> $this$commonAppend$iv = this;
/*     */     int $i$f$commonAppend = 0;
/* 497 */     if ($this$commonAppend$iv.size != 0 && key <= $this$commonAppend$iv.keys[$this$commonAppend$iv.size - 1]) {
/* 498 */       $this$commonAppend$iv.put(key, value);
/*     */     } else {
/*     */       
/* 501 */       if ($this$commonAppend$iv.garbage && $this$commonAppend$iv.size >= $this$commonAppend$iv.keys.length) {
/* 502 */         SparseArrayCompatKt.access$gc($this$commonAppend$iv);
/*     */       }
/* 504 */       int pos$iv = $this$commonAppend$iv.size;
/* 505 */       if (pos$iv >= $this$commonAppend$iv.keys.length) {
/* 506 */         int n$iv = ContainerHelpersKt.idealIntArraySize(pos$iv + 1);
/* 507 */         Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonAppend$iv.keys, n$iv), "copyOf(this, newSize)"); $this$commonAppend$iv.keys = Arrays.copyOf($this$commonAppend$iv.keys, n$iv);
/* 508 */         Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonAppend$iv.values, n$iv), "copyOf(this, newSize)"); $this$commonAppend$iv.values = Arrays.copyOf($this$commonAppend$iv.values, n$iv);
/*     */       } 
/* 510 */       $this$commonAppend$iv.keys[pos$iv] = key;
/* 511 */       $this$commonAppend$iv.values[pos$iv] = value;
/* 512 */       $this$commonAppend$iv.size = pos$iv + 1;
/*     */     }  } @NotNull
/*     */   public String toString() {
/*     */     SparseArrayCompat $this$commonToString$iv = this;
/*     */     int $i$f$commonToString = 0;
/* 517 */     StringBuilder buffer$iv = new StringBuilder($this$commonToString$iv.size * 28);
/* 518 */     buffer$iv.append('{');
/* 519 */     for (int i$iv = 0, i = $this$commonToString$iv.size; i$iv < i; i$iv++) {
/* 520 */       if (i$iv > 0) {
/* 521 */         buffer$iv.append(", ");
/*     */       }
/* 523 */       int key$iv = $this$commonToString$iv.keyAt(i$iv);
/* 524 */       buffer$iv.append(key$iv);
/* 525 */       buffer$iv.append('=');
/* 526 */       Object value$iv = $this$commonToString$iv.valueAt(i$iv);
/* 527 */       if (value$iv != $this$commonToString$iv) {
/* 528 */         buffer$iv.append(value$iv);
/*     */       } else {
/* 530 */         buffer$iv.append("(this Map)");
/*     */       } 
/*     */     } 
/* 533 */     buffer$iv.append('}');
/* 534 */     Intrinsics.checkNotNullExpressionValue(buffer$iv.toString(), "buffer.toString()"); return ($this$commonToString$iv.size() <= 0) ? "{}" : buffer$iv.toString();
/*     */   }
/*     */   
/*     */   @JvmOverloads
/*     */   public SparseArrayCompat() {
/*     */     this(0, 1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\SparseArrayCompat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */