/*     */ package androidx.collection;
/*     */ 
/*     */ import androidx.collection.internal.ContainerHelpersKt;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.JvmField;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\000\n\002\020\032\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\000\n\002\020\026\n\002\b\002\n\002\020\021\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\020\t\n\002\b \n\002\020\016\n\002\b\003\b\026\030\000*\004\b\000\020\0012\0020\002B\021\b\007\022\b\b\002\020\003\032\0020\004¢\006\002\020\005J\035\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0028\000H\026¢\006\002\020\024J\b\020\025\032\0020\020H\026J\016\020\026\032\b\022\004\022\0028\0000\000H\026J\020\020\027\032\0020\0072\006\020\021\032\0020\022H\026J\025\020\030\032\0020\0072\006\020\023\032\0028\000H\026¢\006\002\020\031J\020\020\032\032\0020\0202\006\020\021\032\0020\022H\027J\030\020\033\032\004\030\0018\0002\006\020\021\032\0020\022H\002¢\006\002\020\034J\035\020\033\032\0028\0002\006\020\021\032\0020\0222\006\020\035\032\0028\000H\026¢\006\002\020\036J\020\020\037\032\0020\0042\006\020\021\032\0020\022H\026J\025\020 \032\0020\0042\006\020\023\032\0028\000H\026¢\006\002\020!J\b\020\"\032\0020\007H\026J\020\020#\032\0020\0222\006\020$\032\0020\004H\026J\035\020%\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0028\000H\026¢\006\002\020\024J\030\020&\032\0020\0202\016\020'\032\n\022\006\b\001\022\0028\0000\000H\026J\037\020(\032\004\030\0018\0002\006\020\021\032\0020\0222\006\020\023\032\0028\000H\026¢\006\002\020\036J\020\020)\032\0020\0202\006\020\021\032\0020\022H\026J\035\020)\032\0020\0072\006\020\021\032\0020\0222\006\020\023\032\0028\000H\026¢\006\002\020*J\020\020+\032\0020\0202\006\020$\032\0020\004H\026J\037\020,\032\004\030\0018\0002\006\020\021\032\0020\0222\006\020\023\032\0028\000H\026¢\006\002\020\036J%\020,\032\0020\0072\006\020\021\032\0020\0222\006\020-\032\0028\0002\006\020.\032\0028\000H\026¢\006\002\020/J\035\0200\032\0020\0202\006\020$\032\0020\0042\006\020\023\032\0028\000H\026¢\006\002\0201J\b\020\n\032\0020\004H\026J\b\0202\032\00203H\026J\025\0204\032\0028\0002\006\020$\032\0020\004H\026¢\006\002\0205R\022\020\006\032\0020\0078\000@\000X\016¢\006\002\n\000R\022\020\b\032\0020\t8\000@\000X\016¢\006\002\n\000R\022\020\n\032\0020\0048\000@\000X\016¢\006\002\n\000R\034\020\013\032\n\022\006\022\004\030\0010\r0\f8\000@\000X\016¢\006\004\n\002\020\016¨\0066"}, d2 = {"Landroidx/collection/LongSparseArray;", "E", "", "initialCapacity", "", "(I)V", "garbage", "", "keys", "", "size", "values", "", "", "[Ljava/lang/Object;", "append", "", "key", "", "value", "(JLjava/lang/Object;)V", "clear", "clone", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "delete", "get", "(J)Ljava/lang/Object;", "defaultValue", "(JLjava/lang/Object;)Ljava/lang/Object;", "indexOfKey", "indexOfValue", "(Ljava/lang/Object;)I", "isEmpty", "keyAt", "index", "put", "putAll", "other", "putIfAbsent", "remove", "(JLjava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(JLjava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)V", "toString", "", "valueAt", "(I)Ljava/lang/Object;", "collection"})
/*     */ @SourceDebugExtension({"SMAP\nLongSparseArray.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n+ 2 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,255:1\n243#2:256\n256#2,6:257\n248#2,14:263\n267#2,8:277\n267#2,8:285\n278#2,9:293\n291#2,5:302\n299#2,8:307\n315#2,9:315\n349#2,12:324\n328#2,18:336\n363#2,26:354\n392#2,5:380\n400#2,5:385\n409#2,2:390\n328#2,18:392\n412#2:410\n416#2:411\n420#2,6:412\n328#2,18:418\n427#2:436\n432#2,6:437\n328#2,18:443\n441#2:461\n446#2,6:462\n328#2,18:468\n453#2,2:486\n458#2,2:488\n328#2,18:490\n461#2:508\n466#2,2:509\n328#2,18:511\n469#2,6:529\n479#2:535\n484#2:536\n489#2,8:537\n500#2,6:545\n328#2,18:551\n507#2,10:569\n520#2,21:579\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n*L\n93#1:256\n93#1:257,6\n100#1:263,14\n106#1:277,8\n111#1:285,8\n120#1:293,9\n125#1:302,5\n134#1:307,8\n145#1:315,9\n151#1:324,12\n151#1:336,18\n151#1:354,26\n157#1:380,5\n168#1:385,5\n173#1:390,2\n173#1:392,18\n173#1:410\n180#1:411\n192#1:412,6\n192#1:418,18\n192#1:436\n204#1:437,6\n204#1:443,18\n204#1:461\n212#1:462,6\n212#1:468,18\n212#1:486,2\n219#1:488,2\n219#1:490,18\n219#1:508\n228#1:509,2\n228#1:511,18\n228#1:529,6\n231#1:535\n234#1:536\n239#1:537,8\n245#1:545,6\n245#1:551,18\n245#1:569,10\n253#1:579,21\n*E\n"})
/*     */ public class LongSparseArray<E>
/*     */   implements Cloneable
/*     */ {
/*     */   @JvmOverloads
/*     */   public LongSparseArray(int initialCapacity) {
/*  72 */     if (initialCapacity == 0) {
/*  73 */       this.keys = ContainerHelpersKt.EMPTY_LONGS;
/*  74 */       this.values = ContainerHelpersKt.EMPTY_OBJECTS;
/*     */     } else {
/*  76 */       int idealCapacity = ContainerHelpersKt.idealLongArraySize(initialCapacity);
/*  77 */       this.keys = new long[idealCapacity];
/*  78 */       this.values = new Object[idealCapacity];
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public LongSparseArray<E> clone() {
/*  84 */     Intrinsics.checkNotNull(super.clone(), "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>"); LongSparseArray<E> clone = (LongSparseArray)super.clone();
/*  85 */     clone.keys = (long[])this.keys.clone();
/*  86 */     clone.values = (Object[])this.values.clone();
/*  87 */     return clone;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public E get(long key) {
/*  93 */     LongSparseArray $this$commonGet$iv = this; int $i$f$commonGet = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 256 */     LongSparseArray longSparseArray1 = $this$commonGet$iv; Object defaultValue$iv$iv = null; int $i$f$commonGetInternal = 0;
/* 257 */     int i$iv$iv = ContainerHelpersKt.binarySearch(longSparseArray1.keys, longSparseArray1.size, key);
/* 258 */     return (i$iv$iv < 0 || longSparseArray1.values[i$iv$iv] == LongSparseArrayKt.access$getDELETED$p()) ? 
/* 259 */       (E)defaultValue$iv$iv : 
/*     */ 
/*     */       
/* 262 */       (E)longSparseArray1.values[i$iv$iv]; } public E get(long key, Object defaultValue) { LongSparseArray $this$commonGet$iv = this; int $i$f$commonGet = 0;
/* 263 */     LongSparseArray $this$commonGetInternal$iv$iv = $this$commonGet$iv; int $i$f$commonGetInternal = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 271 */     int i$iv$iv = ContainerHelpersKt.binarySearch($this$commonGetInternal$iv$iv.keys, $this$commonGetInternal$iv$iv.size, key);
/* 272 */     return (i$iv$iv < 0 || $this$commonGetInternal$iv$iv.values[i$iv$iv] == LongSparseArrayKt.access$getDELETED$p()) ? 
/* 273 */       (E)defaultValue : 
/*     */ 
/*     */       
/* 276 */       (E)$this$commonGetInternal$iv$iv.values[i$iv$iv]; } @Deprecated(message = "Alias for `remove(key)`.", replaceWith = @ReplaceWith(expression = "remove(key)", imports = {})) public void delete(long key) { LongSparseArray $this$commonRemove$iv = this; int $i$f$commonRemove = 0;
/* 277 */     int i$iv = ContainerHelpersKt.binarySearch($this$commonRemove$iv.keys, $this$commonRemove$iv.size, key);
/* 278 */     if (i$iv >= 0 && 
/* 279 */       $this$commonRemove$iv.values[i$iv] != LongSparseArrayKt.access$getDELETED$p()) {
/* 280 */       $this$commonRemove$iv.values[i$iv] = LongSparseArrayKt.access$getDELETED$p();
/* 281 */       $this$commonRemove$iv.garbage = true;
/*     */     }  }
/*     */   public void remove(long key) { LongSparseArray $this$commonRemove$iv = this;
/*     */     int $i$f$commonRemove = 0;
/* 285 */     int i$iv = ContainerHelpersKt.binarySearch($this$commonRemove$iv.keys, $this$commonRemove$iv.size, key);
/* 286 */     if (i$iv >= 0 && 
/* 287 */       $this$commonRemove$iv.values[i$iv] != LongSparseArrayKt.access$getDELETED$p()) {
/* 288 */       $this$commonRemove$iv.values[i$iv] = LongSparseArrayKt.access$getDELETED$p();
/* 289 */       $this$commonRemove$iv.garbage = true;
/*     */     }  }
/*     */   public boolean remove(long key, Object value) { LongSparseArray $this$commonRemove$iv = this;
/*     */     int $i$f$commonRemove = 0;
/* 293 */     int index$iv = $this$commonRemove$iv.indexOfKey(key);
/* 294 */     if (index$iv >= 0) {
/* 295 */       Object mapValue$iv = $this$commonRemove$iv.valueAt(index$iv);
/* 296 */       if (Intrinsics.areEqual(value, mapValue$iv))
/* 297 */         $this$commonRemove$iv.removeAt(index$iv); 
/*     */     } 
/*     */     return false; }
/*     */   public void removeAt(int index) { LongSparseArray $this$commonRemoveAt$iv = this;
/*     */     int $i$f$commonRemoveAt = 0;
/* 302 */     if ($this$commonRemoveAt$iv.values[index] != LongSparseArrayKt.access$getDELETED$p()) {
/* 303 */       $this$commonRemoveAt$iv.values[index] = LongSparseArrayKt.access$getDELETED$p();
/* 304 */       $this$commonRemoveAt$iv.garbage = true;
/*     */     }  } @Nullable public E replace(long key, Object value) { LongSparseArray $this$commonReplace$iv = this;
/*     */     int $i$f$commonReplace = 0;
/* 307 */     int index$iv = $this$commonReplace$iv.indexOfKey(key);
/*     */ 
/*     */     
/* 310 */     Object oldValue$iv = $this$commonReplace$iv.values[index$iv];
/* 311 */     $this$commonReplace$iv.values[index$iv] = value;
/* 312 */     return (index$iv >= 0) ? (E)oldValue$iv : 
/*     */       
/* 314 */       null; } public boolean replace(long key, Object oldValue, Object newValue) { LongSparseArray $this$commonReplace$iv = this; int $i$f$commonReplace = 0;
/* 315 */     int index$iv = $this$commonReplace$iv.indexOfKey(key);
/* 316 */     if (index$iv >= 0) {
/* 317 */       Object mapValue$iv = $this$commonReplace$iv.values[index$iv];
/* 318 */       if (Intrinsics.areEqual(mapValue$iv, oldValue))
/* 319 */         $this$commonReplace$iv.values[index$iv] = newValue; 
/*     */     } 
/*     */     return false; }
/*     */   public void put(long key, Object value) { LongSparseArray $this$commonPut$iv = this;
/*     */     int $i$f$commonPut = 0;
/* 324 */     int index$iv = ContainerHelpersKt.binarySearch($this$commonPut$iv.keys, $this$commonPut$iv.size, key);
/* 325 */     if (index$iv >= 0) {
/* 326 */       $this$commonPut$iv.values[index$iv] = value;
/*     */     } else {
/* 328 */       index$iv ^= 0xFFFFFFFF;
/* 329 */       if (index$iv < $this$commonPut$iv.size && $this$commonPut$iv.values[index$iv] == LongSparseArrayKt.access$getDELETED$p()) {
/* 330 */         $this$commonPut$iv.keys[index$iv] = key;
/* 331 */         $this$commonPut$iv.values[index$iv] = value;
/*     */       } else {
/*     */         
/* 334 */         if ($this$commonPut$iv.garbage && $this$commonPut$iv.size >= $this$commonPut$iv.keys.length) {
/* 335 */           LongSparseArray $this$commonGc$iv$iv = $this$commonPut$iv; int $i$f$commonGc = 0;
/* 336 */           int n$iv$iv = $this$commonGc$iv$iv.size;
/* 337 */           int newSize$iv$iv = 0;
/* 338 */           long[] keys$iv$iv = $this$commonGc$iv$iv.keys;
/* 339 */           Object[] values$iv$iv = $this$commonGc$iv$iv.values;
/* 340 */           for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
/* 341 */             Object value$iv$iv = values$iv$iv[i$iv$iv];
/* 342 */             if (value$iv$iv != LongSparseArrayKt.access$getDELETED$p()) {
/* 343 */               if (i$iv$iv != newSize$iv$iv) {
/* 344 */                 keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
/* 345 */                 values$iv$iv[newSize$iv$iv] = value$iv$iv;
/* 346 */                 values$iv$iv[i$iv$iv] = null;
/*     */               } 
/* 348 */               newSize$iv$iv++;
/*     */             } 
/*     */           } 
/* 351 */           $this$commonGc$iv$iv.garbage = false;
/* 352 */           $this$commonGc$iv$iv.size = newSize$iv$iv;
/*     */           
/* 354 */           index$iv = ContainerHelpersKt.binarySearch($this$commonPut$iv.keys, $this$commonPut$iv.size, key) ^ 0xFFFFFFFF;
/*     */         } 
/* 356 */         if ($this$commonPut$iv.size >= $this$commonPut$iv.keys.length) {
/* 357 */           int newSize$iv = ContainerHelpersKt.idealLongArraySize($this$commonPut$iv.size + 1);
/* 358 */           Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonPut$iv.keys, newSize$iv), "copyOf(this, newSize)"); $this$commonPut$iv.keys = Arrays.copyOf($this$commonPut$iv.keys, newSize$iv);
/* 359 */           Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonPut$iv.values, newSize$iv), "copyOf(this, newSize)"); $this$commonPut$iv.values = Arrays.copyOf($this$commonPut$iv.values, newSize$iv);
/*     */         } 
/* 361 */         if ($this$commonPut$iv.size - index$iv != 0) {
/* 362 */           ArraysKt.copyInto($this$commonPut$iv.keys, 
/* 363 */               $this$commonPut$iv.keys, 
/* 364 */               index$iv + 1, 
/* 365 */               index$iv, 
/* 366 */               $this$commonPut$iv.size);
/*     */           
/* 368 */           ArraysKt.copyInto($this$commonPut$iv.values, 
/* 369 */               $this$commonPut$iv.values, 
/* 370 */               index$iv + 1, 
/* 371 */               index$iv, 
/* 372 */               $this$commonPut$iv.size);
/*     */         } 
/*     */         
/* 375 */         $this$commonPut$iv.keys[index$iv] = key;
/* 376 */         $this$commonPut$iv.values[index$iv] = value;
/* 377 */         int i = $this$commonPut$iv.size; $this$commonPut$iv.size = i + 1;
/*     */       } 
/*     */       return;
/*     */     }  }
/*     */   public void putAll(@NotNull LongSparseArray other) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'other'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: astore_2
/*     */     //   8: iconst_0
/*     */     //   9: istore_3
/*     */     //   10: aload_1
/*     */     //   11: invokevirtual size : ()I
/*     */     //   14: istore #4
/*     */     //   16: iconst_0
/*     */     //   17: istore #5
/*     */     //   19: iload #5
/*     */     //   21: iload #4
/*     */     //   23: if_icmpge -> 56
/*     */     //   26: iload #5
/*     */     //   28: istore #6
/*     */     //   30: iconst_0
/*     */     //   31: istore #7
/*     */     //   33: aload_2
/*     */     //   34: aload_1
/*     */     //   35: iload #6
/*     */     //   37: invokevirtual keyAt : (I)J
/*     */     //   40: aload_1
/*     */     //   41: iload #6
/*     */     //   43: invokevirtual valueAt : (I)Ljava/lang/Object;
/*     */     //   46: invokevirtual put : (JLjava/lang/Object;)V
/*     */     //   49: nop
/*     */     //   50: iinc #5, 1
/*     */     //   53: goto -> 19
/*     */     //   56: nop
/*     */     //   57: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #157	-> 6
/*     */     //   #380	-> 10
/*     */     //   #381	-> 16
/*     */     //   #382	-> 33
/*     */     //   #383	-> 49
/*     */     //   #381	-> 50
/*     */     //   #384	-> 56
/*     */     //   #157	-> 57
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   33	17	7	$i$a$-repeat-LongSparseArrayKt$commonPutAll$1$iv	I
/*     */     //   30	20	6	i$iv	I
/*     */     //   10	47	3	$i$f$commonPutAll	I
/*     */     //   16	41	4	size$iv	I
/*     */     //   8	49	2	$this$commonPutAll$iv	Landroidx/collection/LongSparseArray;
/*     */     //   0	58	0	this	Landroidx/collection/LongSparseArray;
/*     */     //   0	58	1	other	Landroidx/collection/LongSparseArray; }
/*     */   @Nullable
/*     */   public E putIfAbsent(long key, Object value) { LongSparseArray<Object> $this$commonPutIfAbsent$iv = this;
/*     */     int $i$f$commonPutIfAbsent = 0;
/* 385 */     Object mapValue$iv = $this$commonPutIfAbsent$iv.get(key);
/* 386 */     if (mapValue$iv == null) {
/* 387 */       $this$commonPutIfAbsent$iv.put(key, value);
/*     */     }
/* 389 */     return (E)mapValue$iv; } public int size() { LongSparseArray $this$commonSize$iv = this; int $i$f$commonSize = 0;
/* 390 */     if ($this$commonSize$iv.garbage) {
/* 391 */       LongSparseArray $this$commonGc$iv$iv = $this$commonSize$iv; int $i$f$commonGc = 0;
/* 392 */       int n$iv$iv = $this$commonGc$iv$iv.size;
/* 393 */       int newSize$iv$iv = 0;
/* 394 */       long[] keys$iv$iv = $this$commonGc$iv$iv.keys;
/* 395 */       Object[] values$iv$iv = $this$commonGc$iv$iv.values;
/* 396 */       for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
/* 397 */         Object value$iv$iv = values$iv$iv[i$iv$iv];
/* 398 */         if (value$iv$iv != LongSparseArrayKt.access$getDELETED$p()) {
/* 399 */           if (i$iv$iv != newSize$iv$iv) {
/* 400 */             keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
/* 401 */             values$iv$iv[newSize$iv$iv] = value$iv$iv;
/* 402 */             values$iv$iv[i$iv$iv] = null;
/*     */           } 
/* 404 */           newSize$iv$iv++;
/*     */         } 
/*     */       } 
/* 407 */       $this$commonGc$iv$iv.garbage = false;
/* 408 */       $this$commonGc$iv$iv.size = newSize$iv$iv;
/*     */     } 
/* 410 */     return $this$commonSize$iv.size; } public boolean isEmpty() { LongSparseArray $this$commonIsEmpty$iv = this; int $i$f$commonIsEmpty = 0;
/* 411 */     return ($this$commonIsEmpty$iv.size() == 0); } public long keyAt(int index) { LongSparseArray $this$commonKeyAt$iv = this; int $i$f$commonKeyAt = 0;
/* 412 */     if (!((0 <= index) ? ((index < $this$commonKeyAt$iv.size) ? 1 : 0) : 0)) { int $i$a$-require-LongSparseArrayKt$commonKeyAt$1$iv = 0; String str = 
/* 413 */         "Expected index to be within 0..size()-1, but was " + index;
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/* 416 */     if ($this$commonKeyAt$iv.garbage) {
/* 417 */       LongSparseArray $this$commonGc$iv$iv = $this$commonKeyAt$iv; int $i$f$commonGc = 0;
/* 418 */       int n$iv$iv = $this$commonGc$iv$iv.size;
/* 419 */       int newSize$iv$iv = 0;
/* 420 */       long[] keys$iv$iv = $this$commonGc$iv$iv.keys;
/* 421 */       Object[] values$iv$iv = $this$commonGc$iv$iv.values;
/* 422 */       for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
/* 423 */         Object value$iv$iv = values$iv$iv[i$iv$iv];
/* 424 */         if (value$iv$iv != LongSparseArrayKt.access$getDELETED$p()) {
/* 425 */           if (i$iv$iv != newSize$iv$iv) {
/* 426 */             keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
/* 427 */             values$iv$iv[newSize$iv$iv] = value$iv$iv;
/* 428 */             values$iv$iv[i$iv$iv] = null;
/*     */           } 
/* 430 */           newSize$iv$iv++;
/*     */         } 
/*     */       } 
/* 433 */       $this$commonGc$iv$iv.garbage = false;
/* 434 */       $this$commonGc$iv$iv.size = newSize$iv$iv;
/*     */     } 
/* 436 */     return $this$commonKeyAt$iv.keys[index]; } public E valueAt(int index) { LongSparseArray $this$commonValueAt$iv = this; int $i$f$commonValueAt = 0;
/* 437 */     if (!((0 <= index) ? ((index < $this$commonValueAt$iv.size) ? 1 : 0) : 0)) { int $i$a$-require-LongSparseArrayKt$commonValueAt$1$iv = 0; String str = 
/* 438 */         "Expected index to be within 0..size()-1, but was " + index;
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/* 441 */     if ($this$commonValueAt$iv.garbage) {
/* 442 */       LongSparseArray $this$commonGc$iv$iv = $this$commonValueAt$iv; int $i$f$commonGc = 0;
/* 443 */       int n$iv$iv = $this$commonGc$iv$iv.size;
/* 444 */       int newSize$iv$iv = 0;
/* 445 */       long[] keys$iv$iv = $this$commonGc$iv$iv.keys;
/* 446 */       Object[] values$iv$iv = $this$commonGc$iv$iv.values;
/* 447 */       for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
/* 448 */         Object value$iv$iv = values$iv$iv[i$iv$iv];
/* 449 */         if (value$iv$iv != LongSparseArrayKt.access$getDELETED$p()) {
/* 450 */           if (i$iv$iv != newSize$iv$iv) {
/* 451 */             keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
/* 452 */             values$iv$iv[newSize$iv$iv] = value$iv$iv;
/* 453 */             values$iv$iv[i$iv$iv] = null;
/*     */           } 
/* 455 */           newSize$iv$iv++;
/*     */         } 
/*     */       } 
/* 458 */       $this$commonGc$iv$iv.garbage = false;
/* 459 */       $this$commonGc$iv$iv.size = newSize$iv$iv;
/*     */     } 
/* 461 */     return (E)$this$commonValueAt$iv.values[index]; } public void setValueAt(int index, Object value) { LongSparseArray $this$commonSetValueAt$iv = this; int $i$f$commonSetValueAt = 0;
/* 462 */     if (!((0 <= index) ? ((index < $this$commonSetValueAt$iv.size) ? 1 : 0) : 0)) { int $i$a$-require-LongSparseArrayKt$commonSetValueAt$1$iv = 0; String str = 
/* 463 */         "Expected index to be within 0..size()-1, but was " + index;
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/* 466 */     if ($this$commonSetValueAt$iv.garbage) {
/* 467 */       LongSparseArray $this$commonGc$iv$iv = $this$commonSetValueAt$iv; int $i$f$commonGc = 0;
/* 468 */       int n$iv$iv = $this$commonGc$iv$iv.size;
/* 469 */       int newSize$iv$iv = 0;
/* 470 */       long[] keys$iv$iv = $this$commonGc$iv$iv.keys;
/* 471 */       Object[] values$iv$iv = $this$commonGc$iv$iv.values;
/* 472 */       for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
/* 473 */         Object value$iv$iv = values$iv$iv[i$iv$iv];
/* 474 */         if (value$iv$iv != LongSparseArrayKt.access$getDELETED$p()) {
/* 475 */           if (i$iv$iv != newSize$iv$iv) {
/* 476 */             keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
/* 477 */             values$iv$iv[newSize$iv$iv] = value$iv$iv;
/* 478 */             values$iv$iv[i$iv$iv] = null;
/*     */           } 
/* 480 */           newSize$iv$iv++;
/*     */         } 
/*     */       } 
/* 483 */       $this$commonGc$iv$iv.garbage = false;
/* 484 */       $this$commonGc$iv$iv.size = newSize$iv$iv;
/*     */     } 
/* 486 */     $this$commonSetValueAt$iv.values[index] = value; } public int indexOfKey(long key) { LongSparseArray $this$commonIndexOfKey$iv = this;
/*     */     int $i$f$commonIndexOfKey = 0;
/* 488 */     if ($this$commonIndexOfKey$iv.garbage) {
/* 489 */       LongSparseArray $this$commonGc$iv$iv = $this$commonIndexOfKey$iv; int $i$f$commonGc = 0;
/* 490 */       int n$iv$iv = $this$commonGc$iv$iv.size;
/* 491 */       int newSize$iv$iv = 0;
/* 492 */       long[] keys$iv$iv = $this$commonGc$iv$iv.keys;
/* 493 */       Object[] values$iv$iv = $this$commonGc$iv$iv.values;
/* 494 */       for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
/* 495 */         Object value$iv$iv = values$iv$iv[i$iv$iv];
/* 496 */         if (value$iv$iv != LongSparseArrayKt.access$getDELETED$p()) {
/* 497 */           if (i$iv$iv != newSize$iv$iv) {
/* 498 */             keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
/* 499 */             values$iv$iv[newSize$iv$iv] = value$iv$iv;
/* 500 */             values$iv$iv[i$iv$iv] = null;
/*     */           } 
/* 502 */           newSize$iv$iv++;
/*     */         } 
/*     */       } 
/* 505 */       $this$commonGc$iv$iv.garbage = false;
/* 506 */       $this$commonGc$iv$iv.size = newSize$iv$iv;
/*     */     } 
/* 508 */     return ContainerHelpersKt.binarySearch($this$commonIndexOfKey$iv.keys, $this$commonIndexOfKey$iv.size, key); } public int indexOfValue(Object value) { LongSparseArray $this$commonIndexOfValue$iv = this; int $i$f$commonIndexOfValue = 0;
/* 509 */     if ($this$commonIndexOfValue$iv.garbage) {
/* 510 */       LongSparseArray $this$commonGc$iv$iv = $this$commonIndexOfValue$iv; int $i$f$commonGc = 0;
/* 511 */       int n$iv$iv = $this$commonGc$iv$iv.size;
/* 512 */       int newSize$iv$iv = 0;
/* 513 */       long[] keys$iv$iv = $this$commonGc$iv$iv.keys;
/* 514 */       Object[] values$iv$iv = $this$commonGc$iv$iv.values;
/* 515 */       for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
/* 516 */         Object value$iv$iv = values$iv$iv[i$iv$iv];
/* 517 */         if (value$iv$iv != LongSparseArrayKt.access$getDELETED$p()) {
/* 518 */           if (i$iv$iv != newSize$iv$iv) {
/* 519 */             keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
/* 520 */             values$iv$iv[newSize$iv$iv] = value$iv$iv;
/* 521 */             values$iv$iv[i$iv$iv] = null;
/*     */           } 
/* 523 */           newSize$iv$iv++;
/*     */         } 
/*     */       } 
/* 526 */       $this$commonGc$iv$iv.garbage = false;
/* 527 */       $this$commonGc$iv$iv.size = newSize$iv$iv;
/*     */     } 
/* 529 */     int i = $this$commonIndexOfValue$iv.size; byte b = 0; if (b < i) { int i$iv = b, $i$a$-repeat-LongSparseArrayKt$commonIndexOfValue$1$iv = 0;
/* 530 */       if ($this$commonIndexOfValue$iv.values[i$iv] == value) {  }
/*     */       else { b++; }
/*     */        }
/*     */     else {  }
/* 534 */      return -1; } public boolean containsKey(long key) { LongSparseArray $this$commonContainsKey$iv = this; int $i$f$commonContainsKey = 0;
/* 535 */     return ($this$commonContainsKey$iv.indexOfKey(key) >= 0); } public boolean containsValue(Object value) { LongSparseArray<Object> $this$commonContainsValue$iv = this; int $i$f$commonContainsValue = 0;
/* 536 */     return ($this$commonContainsValue$iv.indexOfValue(value) >= 0); } public void clear() { LongSparseArray $this$commonClear$iv = this; int $i$f$commonClear = 0;
/* 537 */     int n$iv = $this$commonClear$iv.size;
/* 538 */     Object[] values$iv = $this$commonClear$iv.values;
/* 539 */     for (int i$iv = 0; i$iv < n$iv; i$iv++) {
/* 540 */       values$iv[i$iv] = null;
/*     */     }
/* 542 */     $this$commonClear$iv.size = 0;
/* 543 */     $this$commonClear$iv.garbage = false; } public void append(long key, Object value) { LongSparseArray<Object> $this$commonAppend$iv = this;
/*     */     int $i$f$commonAppend = 0;
/* 545 */     if ($this$commonAppend$iv.size != 0 && key <= $this$commonAppend$iv.keys[$this$commonAppend$iv.size - 1]) {
/* 546 */       $this$commonAppend$iv.put(key, value);
/*     */     } else {
/*     */       
/* 549 */       if ($this$commonAppend$iv.garbage && $this$commonAppend$iv.size >= $this$commonAppend$iv.keys.length) {
/* 550 */         LongSparseArray<Object> $this$commonGc$iv$iv = $this$commonAppend$iv; int $i$f$commonGc = 0;
/* 551 */         int n$iv$iv = $this$commonGc$iv$iv.size;
/* 552 */         int newSize$iv$iv = 0;
/* 553 */         long[] keys$iv$iv = $this$commonGc$iv$iv.keys;
/* 554 */         Object[] values$iv$iv = $this$commonGc$iv$iv.values;
/* 555 */         for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
/* 556 */           Object value$iv$iv = values$iv$iv[i$iv$iv];
/* 557 */           if (value$iv$iv != LongSparseArrayKt.access$getDELETED$p()) {
/* 558 */             if (i$iv$iv != newSize$iv$iv) {
/* 559 */               keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
/* 560 */               values$iv$iv[newSize$iv$iv] = value$iv$iv;
/* 561 */               values$iv$iv[i$iv$iv] = null;
/*     */             } 
/* 563 */             newSize$iv$iv++;
/*     */           } 
/*     */         } 
/* 566 */         $this$commonGc$iv$iv.garbage = false;
/* 567 */         $this$commonGc$iv$iv.size = newSize$iv$iv;
/*     */       } 
/* 569 */       int pos$iv = $this$commonAppend$iv.size;
/* 570 */       if (pos$iv >= $this$commonAppend$iv.keys.length) {
/* 571 */         int newSize$iv = ContainerHelpersKt.idealLongArraySize(pos$iv + 1);
/* 572 */         Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonAppend$iv.keys, newSize$iv), "copyOf(this, newSize)"); $this$commonAppend$iv.keys = Arrays.copyOf($this$commonAppend$iv.keys, newSize$iv);
/* 573 */         Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonAppend$iv.values, newSize$iv), "copyOf(this, newSize)"); $this$commonAppend$iv.values = Arrays.copyOf($this$commonAppend$iv.values, newSize$iv);
/*     */       } 
/* 575 */       $this$commonAppend$iv.keys[pos$iv] = key;
/* 576 */       $this$commonAppend$iv.values[pos$iv] = value;
/* 577 */       $this$commonAppend$iv.size = pos$iv + 1;
/*     */     }  } @NotNull
/*     */   public String toString() {
/*     */     LongSparseArray $this$commonToString$iv = this;
/*     */     int $i$f$commonToString = 0;
/* 582 */     int i = $this$commonToString$iv.size * 28; StringBuilder stringBuilder1 = new StringBuilder(i), $this$commonToString_u24lambda_u245$iv = stringBuilder1; int $i$a$-buildString-LongSparseArrayKt$commonToString$1$iv = 0;
/* 583 */     $this$commonToString_u24lambda_u245$iv.append('{');
/* 584 */     for (int i$iv = 0, j = $this$commonToString$iv.size; i$iv < j; i$iv++) {
/* 585 */       if (i$iv > 0) {
/* 586 */         $this$commonToString_u24lambda_u245$iv.append(", ");
/*     */       }
/* 588 */       long key$iv = $this$commonToString$iv.keyAt(i$iv);
/* 589 */       $this$commonToString_u24lambda_u245$iv.append(key$iv);
/* 590 */       $this$commonToString_u24lambda_u245$iv.append('=');
/* 591 */       Object value$iv = $this$commonToString$iv.valueAt(i$iv);
/* 592 */       if (value$iv != $this$commonToString_u24lambda_u245$iv) {
/* 593 */         $this$commonToString_u24lambda_u245$iv.append(value$iv);
/*     */       } else {
/* 595 */         $this$commonToString_u24lambda_u245$iv.append("(this Map)");
/*     */       } 
/*     */     } 
/* 598 */     $this$commonToString_u24lambda_u245$iv.append('}');
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder(capacity).…builderAction).toString()");
/*     */     return ($this$commonToString$iv.size() <= 0) ? "{}" : stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   @JvmOverloads
/*     */   public LongSparseArray() {
/*     */     this(0, 1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\LongSparseArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */