/*     */ package androidx.compose.runtime.snapshots;
/*     */ 
/*     */ import androidx.compose.runtime.SynchronizedObject;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.TypeIntrinsics;
/*     */ import kotlin.ranges.RangesKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020'\n\000\n\002\030\002\n\002\b\002\n\002\020\001\n\002\b\003\n\002\020\036\n\000\n\002\020\013\n\002\b\002\n\002\020)\n\002\b\004\b\002\030\000*\004\b\000\020\001*\004\b\001\020\0022 \022\004\022\002H\001\022\004\022\002H\002\022\020\022\016\022\004\022\002H\001\022\004\022\002H\0020\0040\003B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J\034\020\b\032\0020\t2\022\020\n\032\016\022\004\022\0028\000\022\004\022\0028\0010\004H\026J\"\020\013\032\0020\t2\030\020\f\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0040\rH\026J\035\020\016\032\0020\0172\022\020\n\032\016\022\004\022\0028\000\022\004\022\0028\0010\004H\002J\"\020\020\032\0020\0172\030\020\f\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0040\rH\026J\033\020\021\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0040\022H\002J\034\020\023\032\0020\0172\022\020\n\032\016\022\004\022\0028\000\022\004\022\0028\0010\004H\026J\"\020\024\032\0020\0172\030\020\f\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0040\rH\026J\"\020\025\032\0020\0172\030\020\f\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0040\rH\026¨\006\026"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapEntrySet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "add", "", "element", "addAll", "elements", "", "contains", "", "containsAll", "iterator", "", "remove", "removeAll", "retainAll", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,373:1\n1179#2,2:374\n1253#2,4:376\n1726#2,3:424\n97#3,2:380\n141#3,5:382\n146#3:388\n134#3:389\n147#3,5:391\n99#3,7:396\n152#3,2:403\n138#3:405\n154#3,6:411\n162#3,3:420\n106#3:423\n26#4:387\n2421#5:390\n2314#5,2:406\n1844#5:408\n2316#5,2:409\n2318#5,3:417\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n*L\n222#1:374,2\n222#1:376,4\n229#1:424,3\n223#1:380,2\n223#1:382,5\n223#1:388\n223#1:389\n223#1:391,5\n223#1:396,7\n223#1:403,2\n223#1:405\n223#1:411,6\n223#1:420,3\n223#1:423\n223#1:387\n223#1:390\n223#1:406,2\n223#1:408\n223#1:409,2\n223#1:417,3\n*E\n"})
/*     */ final class SnapshotMapEntrySet<K, V>
/*     */   extends SnapshotMapSet<K, V, Map.Entry<K, V>>
/*     */ {
/*     */   public SnapshotMapEntrySet(@NotNull SnapshotStateMap<K, V> map) {
/* 207 */     super(map); } @NotNull
/* 208 */   public Void add(@NotNull Map.Entry element) { Intrinsics.checkNotNullParameter(element, "element"); SnapshotStateMapKt.unsupported(); throw new KotlinNothingValueException(); } @NotNull
/* 209 */   public Void addAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); SnapshotStateMapKt.unsupported(); throw new KotlinNothingValueException(); } @NotNull
/*     */   public Iterator<Map.Entry<K, V>> iterator() {
/* 211 */     return new StateMapMutableEntriesIterator<>(getMap(), ((ImmutableSet)getMap().getReadable$runtime().getMap$runtime().entrySet()).iterator());
/*     */   } public boolean remove(@NotNull Map.Entry element) {
/* 213 */     Intrinsics.checkNotNullParameter(element, "element"); return (getMap().remove(element.getKey()) != null);
/*     */   } public boolean removeAll(@NotNull Collection elements) {
/* 215 */     Intrinsics.checkNotNullParameter(elements, "elements"); boolean removed = false;
/* 216 */     for (Map.Entry element : elements) {
/* 217 */       removed = (getMap().remove(element.getKey()) != null || removed);
/*     */     }
/* 219 */     return removed;
/*     */   }
/*     */   public boolean retainAll(@NotNull Collection elements) {
/* 222 */     Intrinsics.checkNotNullParameter(elements, "elements"); Iterable $this$associate$iv = elements; int $i$f$associate = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 374 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
/* 375 */     Iterable iterable1 = $this$associate$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateTo = 0;
/* 376 */     for (Object element$iv$iv : iterable1) {
/* 377 */       Map<Object, Object> map = destination$iv$iv; Map.Entry it = (Map.Entry)element$iv$iv; int $i$a$-associate-SnapshotMapEntrySet$retainAll$entries$1 = 0; Pair pair = TuplesKt.to(it.getKey(), it.getValue()); map.put(pair.getFirst(), pair.getSecond());
/*     */     } 
/* 379 */     Map<Object, Object> entries = destination$iv$iv; SnapshotStateMap<K, V> this_$iv = getMap(); int $i$f$removeIf$runtime = 0;
/* 380 */     boolean removed$iv = false;
/* 381 */     SnapshotStateMap<K, V> this_$iv$iv = this_$iv; int $i$f$mutate = 0;
/* 382 */     Object result$iv$iv = null;
/*     */     while (true) {
/* 384 */       Object oldMap$iv$iv = null;
/* 385 */       int currentModification$iv$iv = 0;
/* 386 */       SynchronizedObject lock$iv$iv$iv = SnapshotStateMapKt.access$getSync$p(); int $i$f$synchronized = 0;
/* 387 */       synchronized (lock$iv$iv$iv) { int $i$a$-synchronized-SnapshotStateMap$mutate$1$iv$iv = 0;
/* 388 */         SnapshotStateMap<K, V> this_$iv$iv$iv = this_$iv$iv; int $i$f$withCurrent = 0;
/* 389 */         Intrinsics.checkNotNull(this_$iv$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"); StateRecord $this$withCurrent$iv$iv$iv$iv = this_$iv$iv$iv.getFirstStateRecord(); int i = 0;
/* 390 */         SnapshotStateMap.StateMapStateRecord $this$mutate_u24lambda_u2413_u24lambda_u2412$iv$iv = (SnapshotStateMap.StateMapStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateMap$mutate$1$current$1$iv$iv = 0; SnapshotStateMap.StateMapStateRecord current$iv$iv = $this$mutate_u24lambda_u2413_u24lambda_u2412$iv$iv;
/* 391 */         oldMap$iv$iv = current$iv$iv.getMap$runtime();
/* 392 */         currentModification$iv$iv = current$iv$iv.getModification$runtime();
/* 393 */         Unit unit = Unit.INSTANCE; }
/* 394 */        Intrinsics.checkNotNull(oldMap$iv$iv); PersistentMap.Builder builder$iv$iv = oldMap$iv$iv.builder();
/* 395 */       Map it$iv = (Map)builder$iv$iv; int $i$a$-mutate-SnapshotStateMap$removeIf$1$iv = 0;
/* 396 */       for (Map.Entry<K, V> entry$iv : this_$iv.entrySet()) {
/* 397 */         Map.Entry<K, V> it = entry$iv; int $i$a$-removeIf$runtime-SnapshotMapEntrySet$retainAll$1 = 0; if ((!entries.containsKey(it.getKey()) || !Intrinsics.areEqual(entries.get(it.getKey()), it.getValue()))) {
/* 398 */           it$iv.remove(entry$iv.getKey());
/* 399 */           removed$iv = true;
/*     */         } 
/*     */       } 
/* 402 */       result$iv$iv = Unit.INSTANCE;
/* 403 */       PersistentMap newMap$iv$iv = builder$iv$iv.build();
/* 404 */       if (!Intrinsics.areEqual(newMap$iv$iv, oldMap$iv$iv)) { SnapshotStateMap<K, V> this_$iv$iv$iv = this_$iv$iv; int $i$f$writable = 0;
/* 405 */         Intrinsics.checkNotNull(this_$iv$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"); StateRecord $this$writable$iv$iv$iv$iv = this_$iv$iv$iv.getFirstStateRecord(); int i = 0;
/* 406 */         Object snapshot$iv$iv$iv$iv = null; snapshot$iv$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/* 407 */         int $i$f$sync = 0;
/* 408 */         SynchronizedObject lock$iv$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int j = 0;
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
/* 423 */     return removed$iv;
/*     */   }
/*     */   
/*     */   public boolean contains(@NotNull Map.Entry element) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     return Intrinsics.areEqual(getMap().get(element.getKey()), element.getValue());
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
/*     */     //   58: checkcast java/util/Map$Entry
/*     */     //   61: astore #6
/*     */     //   63: iconst_0
/*     */     //   64: istore #7
/*     */     //   66: aload_0
/*     */     //   67: aload #6
/*     */     //   69: invokevirtual contains : (Ljava/lang/Object;)Z
/*     */     //   72: ifne -> 37
/*     */     //   75: iconst_0
/*     */     //   76: goto -> 80
/*     */     //   79: iconst_1
/*     */     //   80: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #229	-> 6
/*     */     //   #424	-> 13
/*     */     //   #425	-> 29
/*     */     //   #229	-> 66
/*     */     //   #425	-> 72
/*     */     //   #426	-> 79
/*     */     //   #229	-> 80
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   66	6	7	$i$a$-all-SnapshotMapEntrySet$containsAll$1	I
/*     */     //   63	9	6	it	Ljava/util/Map$Entry;
/*     */     //   56	23	5	element$iv	Ljava/lang/Object;
/*     */     //   13	67	3	$i$f$all	I
/*     */     //   11	69	2	$this$all$iv	Ljava/lang/Iterable;
/*     */     //   0	81	0	this	Landroidx/compose/runtime/snapshots/SnapshotMapEntrySet;
/*     */     //   0	81	1	elements	Ljava/util/Collection;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SnapshotMapEntrySet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */