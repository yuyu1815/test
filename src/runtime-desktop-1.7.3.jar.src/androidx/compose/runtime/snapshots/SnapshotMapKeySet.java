/*     */ package androidx.compose.runtime.snapshots;
/*     */ 
/*     */ import androidx.compose.runtime.SynchronizedObject;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\001\n\002\b\004\n\002\020\036\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\004\b\002\030\000*\004\b\000\020\001*\004\b\001\020\0022\024\022\004\022\002H\001\022\004\022\002H\002\022\004\022\002H\0010\003B\031\022\022\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005¢\006\002\020\006J\025\020\007\032\0020\b2\006\020\t\032\0028\000H\026¢\006\002\020\nJ\026\020\013\032\0020\b2\f\020\f\032\b\022\004\022\0028\0000\rH\026J\026\020\016\032\0020\0172\006\020\t\032\0028\000H\002¢\006\002\020\020J\026\020\021\032\0020\0172\f\020\f\032\b\022\004\022\0028\0000\rH\026J\025\020\022\032\016\022\004\022\0028\000\022\004\022\0028\0010\023H\002J\025\020\024\032\0020\0172\006\020\t\032\0028\000H\026¢\006\002\020\020J\026\020\025\032\0020\0172\f\020\f\032\b\022\004\022\0028\0000\rH\026J\026\020\026\032\0020\0172\f\020\f\032\b\022\004\022\0028\0000\rH\026¨\006\027"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapKeySet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "add", "", "element", "(Ljava/lang/Object;)Ljava/lang/Void;", "addAll", "elements", "", "contains", "", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "Landroidx/compose/runtime/snapshots/StateMapMutableKeysIterator;", "remove", "removeAll", "retainAll", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,373:1\n1855#2,2:374\n1726#2,3:420\n97#3,2:376\n141#3,5:378\n146#3:384\n134#3:385\n147#3,5:387\n99#3,7:392\n152#3,2:399\n138#3:401\n154#3,6:407\n162#3,3:416\n106#3:419\n26#4:383\n2421#5:386\n2314#5,2:402\n1844#5:404\n2316#5,2:405\n2318#5,3:413\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n*L\n240#1:374,2\n250#1:420,3\n247#1:376,2\n247#1:378,5\n247#1:384\n247#1:385\n247#1:387,5\n247#1:392,7\n247#1:399,2\n247#1:401\n247#1:407,6\n247#1:416,3\n247#1:419\n247#1:383\n247#1:386\n247#1:402,2\n247#1:404\n247#1:405,2\n247#1:413,3\n*E\n"})
/*     */ final class SnapshotMapKeySet<K, V>
/*     */   extends SnapshotMapSet<K, V, K>
/*     */ {
/*     */   public SnapshotMapKeySet(@NotNull SnapshotStateMap<K, V> map) {
/* 233 */     super(map); } @NotNull
/* 234 */   public Void add(Object element) { SnapshotStateMapKt.unsupported(); throw new KotlinNothingValueException(); } @NotNull
/* 235 */   public Void addAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); SnapshotStateMapKt.unsupported(); throw new KotlinNothingValueException(); } @NotNull
/* 236 */   public StateMapMutableKeysIterator<K, V> iterator() { return new StateMapMutableKeysIterator<>(getMap(), ((ImmutableSet)getMap().getReadable$runtime().getMap$runtime().entrySet()).iterator()); } public boolean remove(Object element) {
/* 237 */     return (getMap().remove(element) != null);
/*     */   }
/* 239 */   public boolean removeAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); boolean removed = false;
/* 240 */     Iterable $this$forEach$iv = elements; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 374 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), it = element$iv; int $i$a$-forEach-SnapshotMapKeySet$removeAll$1 = 0; }
/*     */      return removed; } public boolean retainAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Set set = CollectionsKt.toSet(elements); SnapshotStateMap<K, V> this_$iv = getMap(); int $i$f$removeIf$runtime = 0;
/* 376 */     boolean removed$iv = false;
/* 377 */     SnapshotStateMap<K, V> this_$iv$iv = this_$iv; int $i$f$mutate = 0;
/* 378 */     Object result$iv$iv = null;
/*     */     while (true) {
/* 380 */       Object oldMap$iv$iv = null;
/* 381 */       int currentModification$iv$iv = 0;
/* 382 */       SynchronizedObject lock$iv$iv$iv = SnapshotStateMapKt.access$getSync$p(); int $i$f$synchronized = 0;
/* 383 */       synchronized (lock$iv$iv$iv) { int $i$a$-synchronized-SnapshotStateMap$mutate$1$iv$iv = 0;
/* 384 */         SnapshotStateMap<K, V> this_$iv$iv$iv = this_$iv$iv; int $i$f$withCurrent = 0;
/* 385 */         Intrinsics.checkNotNull(this_$iv$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"); StateRecord $this$withCurrent$iv$iv$iv$iv = this_$iv$iv$iv.getFirstStateRecord(); int i = 0;
/* 386 */         SnapshotStateMap.StateMapStateRecord $this$mutate_u24lambda_u2413_u24lambda_u2412$iv$iv = (SnapshotStateMap.StateMapStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateMap$mutate$1$current$1$iv$iv = 0; SnapshotStateMap.StateMapStateRecord current$iv$iv = $this$mutate_u24lambda_u2413_u24lambda_u2412$iv$iv;
/* 387 */         oldMap$iv$iv = current$iv$iv.getMap$runtime();
/* 388 */         currentModification$iv$iv = current$iv$iv.getModification$runtime();
/* 389 */         Unit unit = Unit.INSTANCE; }
/* 390 */        Intrinsics.checkNotNull(oldMap$iv$iv); PersistentMap.Builder builder$iv$iv = oldMap$iv$iv.builder();
/* 391 */       Map it$iv = (Map)builder$iv$iv; int $i$a$-mutate-SnapshotStateMap$removeIf$1$iv = 0;
/* 392 */       for (Map.Entry<K, V> entry$iv : this_$iv.entrySet()) {
/* 393 */         Map.Entry<K, V> it = entry$iv; int $i$a$-removeIf$runtime-SnapshotMapKeySet$retainAll$1 = 0; if (!set.contains(it.getKey())) {
/* 394 */           it$iv.remove(entry$iv.getKey());
/* 395 */           removed$iv = true;
/*     */         } 
/*     */       } 
/* 398 */       result$iv$iv = Unit.INSTANCE;
/* 399 */       PersistentMap newMap$iv$iv = builder$iv$iv.build();
/* 400 */       if (!Intrinsics.areEqual(newMap$iv$iv, oldMap$iv$iv)) { SnapshotStateMap<K, V> this_$iv$iv$iv = this_$iv$iv; int $i$f$writable = 0;
/* 401 */         Intrinsics.checkNotNull(this_$iv$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"); StateRecord $this$writable$iv$iv$iv$iv = this_$iv$iv$iv.getFirstStateRecord(); int i = 0;
/* 402 */         Object snapshot$iv$iv$iv$iv = null; snapshot$iv$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/* 403 */         int $i$f$sync = 0;
/* 404 */         SynchronizedObject lock$iv$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int j = 0;
/*     */ 
/*     */ 
/*     */         
/*     */         SynchronizedObject synchronizedObject1 = lock$iv$iv$iv$iv$iv$iv;
/*     */ 
/*     */         
/*     */         /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ }
/*     */ 
/*     */ 
/*     */       
/*     */       break;
/*     */     } 
/*     */ 
/*     */     
/* 419 */     return removed$iv; }
/*     */ 
/*     */   
/*     */   public boolean contains(Object element) {
/*     */     return getMap().containsKey(element);
/*     */   }
/*     */   
/*     */   public boolean containsAll(@NotNull Collection elements) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'elements'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: checkcast java/lang/Iterable
/*     */     //   10: astore_2
/*     */     //   11: iconst_0
/*     */     //   12: istore_3
/*     */     //   13: aload_2
/*     */     //   14: checkcast java/util/Collection
/*     */     //   17: invokeinterface isEmpty : ()Z
/*     */     //   22: ifeq -> 29
/*     */     //   25: iconst_1
/*     */     //   26: goto -> 86
/*     */     //   29: aload_2
/*     */     //   30: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   35: astore #4
/*     */     //   37: aload #4
/*     */     //   39: invokeinterface hasNext : ()Z
/*     */     //   44: ifeq -> 85
/*     */     //   47: aload #4
/*     */     //   49: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   54: astore #5
/*     */     //   56: aload #5
/*     */     //   58: astore #6
/*     */     //   60: iconst_0
/*     */     //   61: istore #7
/*     */     //   63: aload_0
/*     */     //   64: invokevirtual getMap : ()Landroidx/compose/runtime/snapshots/SnapshotStateMap;
/*     */     //   67: checkcast java/util/Map
/*     */     //   70: aload #6
/*     */     //   72: invokeinterface containsKey : (Ljava/lang/Object;)Z
/*     */     //   77: nop
/*     */     //   78: ifne -> 37
/*     */     //   81: iconst_0
/*     */     //   82: goto -> 86
/*     */     //   85: iconst_1
/*     */     //   86: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #250	-> 6
/*     */     //   #420	-> 13
/*     */     //   #421	-> 29
/*     */     //   #250	-> 63
/*     */     //   #250	-> 77
/*     */     //   #421	-> 78
/*     */     //   #422	-> 85
/*     */     //   #250	-> 86
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   63	15	7	$i$a$-all-SnapshotMapKeySet$containsAll$1	I
/*     */     //   60	18	6	it	Ljava/lang/Object;
/*     */     //   56	29	5	element$iv	Ljava/lang/Object;
/*     */     //   13	73	3	$i$f$all	I
/*     */     //   11	75	2	$this$all$iv	Ljava/lang/Iterable;
/*     */     //   0	87	0	this	Landroidx/compose/runtime/snapshots/SnapshotMapKeySet;
/*     */     //   0	87	1	elements	Ljava/util/Collection;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SnapshotMapKeySet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */