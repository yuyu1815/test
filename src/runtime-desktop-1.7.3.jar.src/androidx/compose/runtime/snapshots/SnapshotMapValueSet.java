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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\001\n\002\b\004\n\002\020\036\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\004\b\002\030\000*\004\b\000\020\001*\004\b\001\020\0022\024\022\004\022\002H\001\022\004\022\002H\002\022\004\022\002H\0020\003B\031\022\022\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005¢\006\002\020\006J\025\020\007\032\0020\b2\006\020\t\032\0028\001H\026¢\006\002\020\nJ\026\020\013\032\0020\b2\f\020\f\032\b\022\004\022\0028\0010\rH\026J\026\020\016\032\0020\0172\006\020\t\032\0028\001H\002¢\006\002\020\020J\026\020\021\032\0020\0172\f\020\f\032\b\022\004\022\0028\0010\rH\026J\025\020\022\032\016\022\004\022\0028\000\022\004\022\0028\0010\023H\002J\025\020\024\032\0020\0172\006\020\t\032\0028\001H\026¢\006\002\020\020J\026\020\025\032\0020\0172\f\020\f\032\b\022\004\022\0028\0010\rH\026J\026\020\026\032\0020\0172\f\020\f\032\b\022\004\022\0028\0010\rH\026¨\006\027"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapValueSet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "add", "", "element", "(Ljava/lang/Object;)Ljava/lang/Void;", "addAll", "elements", "", "contains", "", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "Landroidx/compose/runtime/snapshots/StateMapMutableValuesIterator;", "remove", "removeAll", "retainAll", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 3 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,373:1\n97#2,2:374\n141#2,5:376\n146#2:382\n134#2:383\n147#2,5:385\n99#2,7:390\n152#2,2:397\n138#2:399\n154#2,6:405\n162#2,3:414\n106#2:417\n97#2,2:418\n141#2,5:420\n146#2:426\n134#2:427\n147#2,5:429\n99#2,7:434\n152#2,2:441\n138#2:443\n154#2,6:449\n162#2,3:458\n106#2:461\n26#3:381\n26#3:425\n2421#4:384\n2314#4,2:400\n1844#4:402\n2316#4,2:403\n2318#4,3:411\n2421#4:428\n2314#4,2:444\n1844#4:446\n2316#4,2:447\n2318#4,3:455\n1726#5,3:462\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n*L\n263#1:374,2\n263#1:376,5\n263#1:382\n263#1:383\n263#1:385,5\n263#1:390,7\n263#1:397,2\n263#1:399\n263#1:405,6\n263#1:414,3\n263#1:417\n267#1:418,2\n267#1:420,5\n267#1:426\n267#1:427\n267#1:429,5\n267#1:434,7\n267#1:441,2\n267#1:443\n267#1:449,6\n267#1:458,3\n267#1:461\n263#1:381\n267#1:425\n263#1:384\n263#1:400,2\n263#1:402\n263#1:403,2\n263#1:411,3\n267#1:428\n267#1:444,2\n267#1:446\n267#1:447,2\n267#1:455,3\n271#1:462,3\n*E\n"})
/*     */ final class SnapshotMapValueSet<K, V>
/*     */   extends SnapshotMapSet<K, V, V>
/*     */ {
/*     */   public SnapshotMapValueSet(@NotNull SnapshotStateMap<K, V> map) {
/* 255 */     super(map); } @NotNull
/* 256 */   public Void add(Object element) { SnapshotStateMapKt.unsupported(); throw new KotlinNothingValueException(); } @NotNull
/* 257 */   public Void addAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); SnapshotStateMapKt.unsupported(); throw new KotlinNothingValueException(); }
/*     */   @NotNull
/* 259 */   public StateMapMutableValuesIterator<K, V> iterator() { return new StateMapMutableValuesIterator<>(getMap(), ((ImmutableSet)getMap().getReadable$runtime().getMap$runtime().entrySet()).iterator()); } public boolean remove(Object element) {
/* 260 */     return getMap().removeValue$runtime((V)element);
/*     */   }
/* 262 */   public boolean removeAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Set set = CollectionsKt.toSet(elements);
/* 263 */     SnapshotStateMap<K, V> this_$iv = getMap(); int $i$f$removeIf$runtime = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 374 */     boolean removed$iv = false;
/* 375 */     SnapshotStateMap<K, V> this_$iv$iv = this_$iv; int $i$f$mutate = 0;
/* 376 */     Object result$iv$iv = null;
/*     */     while (true) {
/* 378 */       Object oldMap$iv$iv = null;
/* 379 */       int currentModification$iv$iv = 0;
/* 380 */       SynchronizedObject lock$iv$iv$iv = SnapshotStateMapKt.access$getSync$p(); int $i$f$synchronized = 0;
/* 381 */       synchronized (lock$iv$iv$iv) { int $i$a$-synchronized-SnapshotStateMap$mutate$1$iv$iv = 0;
/* 382 */         SnapshotStateMap<K, V> this_$iv$iv$iv = this_$iv$iv; int $i$f$withCurrent = 0;
/* 383 */         Intrinsics.checkNotNull(this_$iv$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"); StateRecord $this$withCurrent$iv$iv$iv$iv = this_$iv$iv$iv.getFirstStateRecord(); int i = 0;
/* 384 */         SnapshotStateMap.StateMapStateRecord $this$mutate_u24lambda_u2413_u24lambda_u2412$iv$iv = (SnapshotStateMap.StateMapStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateMap$mutate$1$current$1$iv$iv = 0; SnapshotStateMap.StateMapStateRecord current$iv$iv = $this$mutate_u24lambda_u2413_u24lambda_u2412$iv$iv;
/* 385 */         oldMap$iv$iv = current$iv$iv.getMap$runtime();
/* 386 */         currentModification$iv$iv = current$iv$iv.getModification$runtime();
/* 387 */         Unit unit = Unit.INSTANCE; }
/* 388 */        Intrinsics.checkNotNull(oldMap$iv$iv); PersistentMap.Builder builder$iv$iv = oldMap$iv$iv.builder();
/* 389 */       Map it$iv = (Map)builder$iv$iv; int $i$a$-mutate-SnapshotStateMap$removeIf$1$iv = 0;
/* 390 */       for (Map.Entry<K, V> entry$iv : this_$iv.entrySet()) {
/* 391 */         Map.Entry<K, V> it = entry$iv; int $i$a$-removeIf$runtime-SnapshotMapValueSet$removeAll$1 = 0; if (set.contains(it.getValue())) {
/* 392 */           it$iv.remove(entry$iv.getKey());
/* 393 */           removed$iv = true;
/*     */         } 
/*     */       } 
/* 396 */       result$iv$iv = Unit.INSTANCE;
/* 397 */       PersistentMap newMap$iv$iv = builder$iv$iv.build();
/* 398 */       if (!Intrinsics.areEqual(newMap$iv$iv, oldMap$iv$iv)) { SnapshotStateMap<K, V> this_$iv$iv$iv = this_$iv$iv; int $i$f$writable = 0;
/* 399 */         Intrinsics.checkNotNull(this_$iv$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"); StateRecord $this$writable$iv$iv$iv$iv = this_$iv$iv$iv.getFirstStateRecord(); int i = 0;
/* 400 */         Object snapshot$iv$iv$iv$iv = null; snapshot$iv$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/* 401 */         int $i$f$sync = 0;
/* 402 */         SynchronizedObject lock$iv$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int j = 0;
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
/* 417 */     return removed$iv; } public boolean retainAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Set set = CollectionsKt.toSet(elements); SnapshotStateMap<K, V> this_$iv = getMap(); int $i$f$removeIf$runtime = 0;
/* 418 */     boolean removed$iv = false;
/* 419 */     SnapshotStateMap<K, V> this_$iv$iv = this_$iv; int $i$f$mutate = 0;
/* 420 */     Object result$iv$iv = null;
/*     */     while (true) {
/* 422 */       Object oldMap$iv$iv = null;
/* 423 */       int currentModification$iv$iv = 0;
/* 424 */       SynchronizedObject lock$iv$iv$iv = SnapshotStateMapKt.access$getSync$p(); int $i$f$synchronized = 0;
/* 425 */       synchronized (lock$iv$iv$iv) { int $i$a$-synchronized-SnapshotStateMap$mutate$1$iv$iv = 0;
/* 426 */         SnapshotStateMap<K, V> this_$iv$iv$iv = this_$iv$iv; int $i$f$withCurrent = 0;
/* 427 */         Intrinsics.checkNotNull(this_$iv$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"); StateRecord $this$withCurrent$iv$iv$iv$iv = this_$iv$iv$iv.getFirstStateRecord(); int i = 0;
/* 428 */         SnapshotStateMap.StateMapStateRecord $this$mutate_u24lambda_u2413_u24lambda_u2412$iv$iv = (SnapshotStateMap.StateMapStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateMap$mutate$1$current$1$iv$iv = 0; SnapshotStateMap.StateMapStateRecord current$iv$iv = $this$mutate_u24lambda_u2413_u24lambda_u2412$iv$iv;
/* 429 */         oldMap$iv$iv = current$iv$iv.getMap$runtime();
/* 430 */         currentModification$iv$iv = current$iv$iv.getModification$runtime();
/* 431 */         Unit unit = Unit.INSTANCE; }
/* 432 */        Intrinsics.checkNotNull(oldMap$iv$iv); PersistentMap.Builder builder$iv$iv = oldMap$iv$iv.builder();
/* 433 */       Map it$iv = (Map)builder$iv$iv; int $i$a$-mutate-SnapshotStateMap$removeIf$1$iv = 0;
/* 434 */       for (Map.Entry<K, V> entry$iv : this_$iv.entrySet()) {
/* 435 */         Map.Entry<K, V> it = entry$iv; int $i$a$-removeIf$runtime-SnapshotMapValueSet$retainAll$1 = 0; if (!set.contains(it.getValue())) {
/* 436 */           it$iv.remove(entry$iv.getKey());
/* 437 */           removed$iv = true;
/*     */         } 
/*     */       } 
/* 440 */       result$iv$iv = Unit.INSTANCE;
/* 441 */       PersistentMap newMap$iv$iv = builder$iv$iv.build();
/* 442 */       if (!Intrinsics.areEqual(newMap$iv$iv, oldMap$iv$iv)) { SnapshotStateMap<K, V> this_$iv$iv$iv = this_$iv$iv; int $i$f$writable = 0;
/* 443 */         Intrinsics.checkNotNull(this_$iv$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"); StateRecord $this$writable$iv$iv$iv$iv = this_$iv$iv$iv.getFirstStateRecord(); int i = 0;
/* 444 */         Object snapshot$iv$iv$iv$iv = null; snapshot$iv$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/* 445 */         int $i$f$sync = 0;
/* 446 */         SynchronizedObject lock$iv$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int j = 0;
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
/* 461 */     return removed$iv; }
/*     */ 
/*     */   
/*     */   public boolean contains(Object element) {
/*     */     return getMap().containsValue(element);
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
/*     */     //   26: goto -> 80
/*     */     //   29: aload_2
/*     */     //   30: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   35: astore #4
/*     */     //   37: aload #4
/*     */     //   39: invokeinterface hasNext : ()Z
/*     */     //   44: ifeq -> 79
/*     */     //   47: aload #4
/*     */     //   49: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   54: astore #5
/*     */     //   56: aload #5
/*     */     //   58: astore #6
/*     */     //   60: iconst_0
/*     */     //   61: istore #7
/*     */     //   63: aload_0
/*     */     //   64: invokevirtual getMap : ()Landroidx/compose/runtime/snapshots/SnapshotStateMap;
/*     */     //   67: aload #6
/*     */     //   69: invokevirtual containsValue : (Ljava/lang/Object;)Z
/*     */     //   72: ifne -> 37
/*     */     //   75: iconst_0
/*     */     //   76: goto -> 80
/*     */     //   79: iconst_1
/*     */     //   80: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #271	-> 6
/*     */     //   #462	-> 13
/*     */     //   #463	-> 29
/*     */     //   #271	-> 63
/*     */     //   #463	-> 72
/*     */     //   #464	-> 79
/*     */     //   #271	-> 80
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   63	9	7	$i$a$-all-SnapshotMapValueSet$containsAll$1	I
/*     */     //   60	12	6	it	Ljava/lang/Object;
/*     */     //   56	23	5	element$iv	Ljava/lang/Object;
/*     */     //   13	67	3	$i$f$all	I
/*     */     //   11	69	2	$this$all$iv	Ljava/lang/Iterable;
/*     */     //   0	81	0	this	Landroidx/compose/runtime/snapshots/SnapshotMapValueSet;
/*     */     //   0	81	1	elements	Ljava/util/Collection;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SnapshotMapValueSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */