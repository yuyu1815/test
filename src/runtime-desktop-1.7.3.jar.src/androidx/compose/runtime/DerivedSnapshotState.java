/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import androidx.collection.MutableObjectIntMap;
/*     */ import androidx.collection.ObjectIntMap;
/*     */ import androidx.collection.ObjectIntMapKt;
/*     */ import androidx.compose.runtime.collection.MutableVector;
/*     */ import androidx.compose.runtime.internal.IntRef;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.runtime.snapshots.Snapshot;
/*     */ import androidx.compose.runtime.snapshots.SnapshotKt;
/*     */ import androidx.compose.runtime.snapshots.StateObject;
/*     */ import androidx.compose.runtime.snapshots.StateObjectImpl;
/*     */ import androidx.compose.runtime.snapshots.StateRecord;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\016\n\000\n\002\020\002\n\002\b\003\b\002\030\000*\004\b\000\020\0012\0020\0022\b\022\004\022\002H\0010\003:\001'B#\022\f\020\004\032\b\022\004\022\0028\0000\005\022\016\020\006\032\n\022\004\022\0028\000\030\0010\007¢\006\002\020\bJ\016\020\034\032\0020\0252\006\020\035\032\0020\036J:\020\t\032\b\022\004\022\0028\0000\0232\f\020\037\032\b\022\004\022\0028\0000\0232\006\020\035\032\0020\0362\006\020 \032\0020!2\f\020\004\032\b\022\004\022\0028\0000\005H\002J\b\020\"\032\0020#H\002J\020\020$\032\0020%2\006\020\032\032\0020\025H\026J\b\020&\032\0020#H\026R\024\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\002\n\000R\032\020\t\032\b\022\004\022\0028\0000\n8VX\004¢\006\006\032\004\b\013\020\fR\031\020\r\032\004\030\0018\0008G¢\006\f\022\004\b\016\020\017\032\004\b\020\020\021R\024\020\022\032\b\022\004\022\0028\0000\023X\016¢\006\002\n\000R\024\020\024\032\0020\0258VX\004¢\006\006\032\004\b\026\020\027R\034\020\006\032\n\022\004\022\0028\000\030\0010\007X\004¢\006\b\n\000\032\004\b\030\020\031R\024\020\032\032\0028\0008VX\004¢\006\006\032\004\b\033\020\021¨\006("}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", "T", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/DerivedState;", "calculation", "Lkotlin/Function0;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "currentRecord", "Landroidx/compose/runtime/DerivedState$Record;", "getCurrentRecord", "()Landroidx/compose/runtime/DerivedState$Record;", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "()V", "getDebuggerDisplayValue", "()Ljava/lang/Object;", "first", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "value", "getValue", "current", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "readable", "forceDependencyReads", "", "displayValue", "", "prependStateRecord", "", "toString", "ResultRecord", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n+ 2 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 7 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,401:1\n373#2,2:402\n375#2,2:415\n75#2,4:417\n378#2,2:447\n75#2,4:449\n373#2,2:453\n375#2,5:466\n460#3,11:404\n460#3,11:455\n401#4,4:421\n373#4,6:425\n383#4,3:432\n386#4,2:436\n406#4,2:438\n389#4,6:440\n408#4:446\n1810#5:431\n1672#5:435\n1844#6:471\n1844#6:473\n2421#6:475\n2421#6:476\n2421#6:477\n26#7:472\n26#7:474\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n*L\n180#1:402,2\n180#1:415,2\n182#1:417,4\n180#1:447,2\n196#1:449,4\n198#1:453,2\n198#1:466,5\n180#1:404,11\n198#1:455,11\n184#1:421,4\n184#1:425,6\n184#1:432,3\n184#1:436,2\n184#1:438,2\n184#1:440,6\n184#1:446\n184#1:431\n184#1:435\n221#1:471\n244#1:473\n283#1:475\n294#1:476\n302#1:477\n221#1:472\n244#1:474\n*E\n"})
/*     */ final class DerivedSnapshotState<T>
/*     */   extends StateObjectImpl
/*     */   implements DerivedState<T>
/*     */ {
/*     */   @NotNull
/*     */   private final Function0<T> calculation;
/*     */   @Nullable
/*     */   private final SnapshotMutationPolicy<T> policy;
/*     */   @NotNull
/*     */   private ResultRecord<T> first;
/*     */   
/*     */   @Nullable
/*     */   public SnapshotMutationPolicy<T> getPolicy() {
/*  83 */     return this.policy; } public DerivedSnapshotState(@NotNull Function0<T> calculation, @Nullable SnapshotMutationPolicy<T> policy) { this.calculation = calculation; this.policy = policy;
/*     */     
/*  85 */     this.first = new ResultRecord<>(); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\000\n\002\b\004\n\002\020\b\n\002\b\013\n\002\020\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\007\030\000 +*\004\b\001\020\0012\0020\0022\b\022\004\022\002H\0010\003:\001+B\005¢\006\002\020\004J\020\020 \032\0020!2\006\020\"\032\0020\002H\026J\b\020#\032\0020\002H\026J\032\020$\032\0020%2\n\020&\032\006\022\002\b\0030'2\006\020(\032\0020)J\032\020*\032\0020\0252\n\020&\032\006\022\002\b\0030'2\006\020(\032\0020)R\024\020\005\032\0028\0018VX\004¢\006\006\032\004\b\006\020\007R \020\b\032\b\022\004\022\0020\n0\tX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R\034\020\017\032\004\030\0010\020X\016¢\006\016\n\000\032\004\b\021\020\007\"\004\b\022\020\023R\032\020\024\032\0020\025X\016¢\006\016\n\000\032\004\b\026\020\027\"\004\b\030\020\031R\032\020\032\032\0020\025X\016¢\006\016\n\000\032\004\b\033\020\027\"\004\b\034\020\031R\032\020\035\032\0020\025X\016¢\006\016\n\000\032\004\b\036\020\027\"\004\b\037\020\031¨\006,"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", "()V", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "dependencies", "Landroidx/collection/ObjectIntMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "getDependencies", "()Landroidx/collection/ObjectIntMap;", "setDependencies", "(Landroidx/collection/ObjectIntMap;)V", "result", "", "getResult", "setResult", "(Ljava/lang/Object;)V", "resultHash", "", "getResultHash", "()I", "setResultHash", "(I)V", "validSnapshotId", "getValidSnapshotId", "setValidSnapshotId", "validSnapshotWriteCount", "getValidSnapshotWriteCount", "setValidSnapshotWriteCount", "assign", "", "value", "create", "isValid", "", "derivedState", "Landroidx/compose/runtime/DerivedState;", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "readableHash", "Companion", "runtime"}) @StabilityInferred(parameters = 0)
/*     */   @SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,401:1\n1844#2:402\n1844#2:404\n1844#2:406\n26#3:403\n26#3:405\n26#3:407\n373#4,2:408\n375#4,2:421\n378#4,2:449\n460#5,11:410\n401#6,4:423\n373#6,6:427\n383#6,3:434\n386#6,2:438\n406#6,2:440\n389#6,6:442\n408#6:448\n1810#7:433\n1672#7:437\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n110#1:402\n117#1:404\n129#1:406\n110#1:403\n117#1:405\n129#1:407\n131#1:408,2\n131#1:421,2\n131#1:449,2\n131#1:410,11\n132#1:423,4\n132#1:427,6\n132#1:434,3\n132#1:438,2\n132#1:440,2\n132#1:442,6\n132#1:448\n132#1:433\n132#1:437\n*E\n"})
/*     */   public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> { @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\001¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "()V", "Unset", "getUnset", "()Ljava/lang/Object;", "runtime"})
/*     */     public static final class Companion { private Companion() {} @NotNull
/*  89 */       public final Object getUnset() { return DerivedSnapshotState.ResultRecord.Unset; } } @NotNull public static final Companion Companion = new Companion(null); public static final int $stable = 8; @NotNull private static final Object Unset = new Object();
/*     */     
/*     */     public final int getValidSnapshotId() {
/*  92 */       return this.validSnapshotId; } public final void setValidSnapshotId(int <set-?>) { this.validSnapshotId = <set-?>; }
/*  93 */     public final int getValidSnapshotWriteCount() { return this.validSnapshotWriteCount; } public final void setValidSnapshotWriteCount(int <set-?>) { this.validSnapshotWriteCount = <set-?>; }
/*     */      @NotNull
/*  95 */     private ObjectIntMap<StateObject> dependencies = ObjectIntMapKt.emptyObjectIntMap(); @NotNull public ObjectIntMap<StateObject> getDependencies() { return this.dependencies; } public void setDependencies(@NotNull ObjectIntMap<StateObject> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.dependencies = <set-?>; } @Nullable
/*  96 */     private Object result = Unset; private int validSnapshotId; private int validSnapshotWriteCount; private int resultHash; @Nullable public final Object getResult() { return this.result; } public final void setResult(@Nullable Object <set-?>) { this.result = <set-?>; }
/*  97 */     public final int getResultHash() { return this.resultHash; } public final void setResultHash(int <set-?>) { this.resultHash = <set-?>; }
/*     */ 
/*     */     
/*     */     public void assign(@NotNull StateRecord value) {
/* 101 */       Intrinsics.checkNotNullParameter(value, "value"); ResultRecord other = (ResultRecord)value;
/* 102 */       setDependencies(other.getDependencies());
/* 103 */       this.result = other.result;
/* 104 */       this.resultHash = other.resultHash;
/*     */     } @NotNull
/*     */     public StateRecord create() {
/* 107 */       return new ResultRecord();
/*     */     }
/*     */     
/* 110 */     public final boolean isValid(@NotNull DerivedState<?> derivedState, @NotNull Snapshot snapshot) { Intrinsics.checkNotNullParameter(derivedState, "derivedState"); Intrinsics.checkNotNullParameter(snapshot, "snapshot"); int $i$f$sync = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 402 */       SynchronizedObject lock$iv$iv = SnapshotKt.getLock(); int $i$f$synchronized = 0;
/* 403 */       synchronized (lock$iv$iv) { int $i$a$-sync-DerivedSnapshotState$ResultRecord$isValid$snapshotChanged$1 = 0; boolean bool = (this.validSnapshotId != snapshot.getId() || this.validSnapshotWriteCount != snapshot.getWriteCount$runtime()) ? true : false; }  boolean snapshotChanged = bool; boolean isValid = (this.result != Unset && (!snapshotChanged || this.resultHash == readableHash(derivedState, snapshot))); if (isValid && snapshotChanged) {
/* 404 */         int i = 0; SynchronizedObject synchronizedObject = SnapshotKt.getLock(); int j = 0;
/* 405 */         synchronized (synchronizedObject) { int $i$a$-sync-DerivedSnapshotState$ResultRecord$isValid$1 = 0; this.validSnapshotId = snapshot.getId(); this.validSnapshotWriteCount = snapshot.getWriteCount$runtime(); Unit unit = Unit.INSTANCE; } 
/* 406 */       }  return isValid; } public final int readableHash(@NotNull DerivedState<?> derivedState, @NotNull Snapshot snapshot) { Intrinsics.checkNotNullParameter(derivedState, "derivedState"); Intrinsics.checkNotNullParameter(snapshot, "snapshot"); int hash = 0; hash = 7; int $i$f$sync = 0; SynchronizedObject lock$iv$iv = SnapshotKt.getLock(); int $i$f$synchronized = 0;
/* 407 */       synchronized (lock$iv$iv) { int $i$a$-sync-DerivedSnapshotState$ResultRecord$readableHash$dependencies$1 = 0; ObjectIntMap<StateObject> objectIntMap = getDependencies(); }  ObjectIntMap<StateObject> dependencies = objectIntMap; if (dependencies.isNotEmpty()) {
/* 408 */         int $i$f$forEach, size$iv$iv, $i$f$notifyObservers = 0; MutableVector<DerivedStateObserver> observers$iv = SnapshotStateKt.derivedStateObservers();
/* 409 */         MutableVector<DerivedStateObserver> this_$iv$iv = observers$iv;
/*     */       } 
/*     */       return hash; }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public T getCurrentValue() {
/*     */       return (T)this.result;
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\001¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "()V", "Unset", "getUnset", "()Ljava/lang/Object;", "runtime"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Object getUnset() {
/*     */       return DerivedSnapshotState.ResultRecord.Unset;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final StateRecord current(@NotNull Snapshot snapshot) {
/*     */     Intrinsics.checkNotNullParameter(snapshot, "snapshot");
/*     */     return currentRecord((ResultRecord<T>)SnapshotKt.current(this.first, snapshot), snapshot, false, this.calculation);
/*     */   }
/*     */ 
/*     */   
/*     */   private final ResultRecord<T> currentRecord(ResultRecord readable, Snapshot snapshot, boolean forceDependencyReads, Function0 calculation) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: aload_0
/*     */     //   2: checkcast androidx/compose/runtime/DerivedState
/*     */     //   5: aload_2
/*     */     //   6: invokevirtual isValid : (Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)Z
/*     */     //   9: ifeq -> 566
/*     */     //   12: iload_3
/*     */     //   13: ifeq -> 564
/*     */     //   16: iconst_0
/*     */     //   17: istore #5
/*     */     //   19: invokestatic derivedStateObservers : ()Landroidx/compose/runtime/collection/MutableVector;
/*     */     //   22: astore #6
/*     */     //   24: aload #6
/*     */     //   26: astore #7
/*     */     //   28: iconst_0
/*     */     //   29: istore #8
/*     */     //   31: nop
/*     */     //   32: aload #7
/*     */     //   34: invokevirtual getSize : ()I
/*     */     //   37: istore #9
/*     */     //   39: iload #9
/*     */     //   41: ifle -> 89
/*     */     //   44: iconst_0
/*     */     //   45: istore #10
/*     */     //   47: aload #7
/*     */     //   49: invokevirtual getContent : ()[Ljava/lang/Object;
/*     */     //   52: astore #11
/*     */     //   54: aload #11
/*     */     //   56: iload #10
/*     */     //   58: aaload
/*     */     //   59: checkcast androidx/compose/runtime/DerivedStateObserver
/*     */     //   62: astore #12
/*     */     //   64: iconst_0
/*     */     //   65: istore #13
/*     */     //   67: aload #12
/*     */     //   69: aload_0
/*     */     //   70: checkcast androidx/compose/runtime/DerivedState
/*     */     //   73: invokeinterface start : (Landroidx/compose/runtime/DerivedState;)V
/*     */     //   78: nop
/*     */     //   79: iinc #10, 1
/*     */     //   82: iload #10
/*     */     //   84: iload #9
/*     */     //   86: if_icmplt -> 54
/*     */     //   89: nop
/*     */     //   90: nop
/*     */     //   91: iconst_0
/*     */     //   92: istore #14
/*     */     //   94: aload_1
/*     */     //   95: invokevirtual getDependencies : ()Landroidx/collection/ObjectIntMap;
/*     */     //   98: astore #15
/*     */     //   100: iconst_0
/*     */     //   101: istore #16
/*     */     //   103: invokestatic access$getCalculationBlockNestedLevel$p : ()Landroidx/compose/runtime/SnapshotThreadLocal;
/*     */     //   106: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   109: checkcast androidx/compose/runtime/internal/IntRef
/*     */     //   112: dup
/*     */     //   113: ifnonnull -> 145
/*     */     //   116: pop
/*     */     //   117: new androidx/compose/runtime/internal/IntRef
/*     */     //   120: dup
/*     */     //   121: iconst_0
/*     */     //   122: invokespecial <init> : (I)V
/*     */     //   125: astore #17
/*     */     //   127: aload #17
/*     */     //   129: astore #18
/*     */     //   131: iconst_0
/*     */     //   132: istore #19
/*     */     //   134: invokestatic access$getCalculationBlockNestedLevel$p : ()Landroidx/compose/runtime/SnapshotThreadLocal;
/*     */     //   137: aload #18
/*     */     //   139: invokevirtual set : (Ljava/lang/Object;)V
/*     */     //   142: nop
/*     */     //   143: aload #17
/*     */     //   145: astore #20
/*     */     //   147: aload #20
/*     */     //   149: astore #21
/*     */     //   151: iconst_0
/*     */     //   152: istore #22
/*     */     //   154: aload #21
/*     */     //   156: invokevirtual getElement : ()I
/*     */     //   159: istore #23
/*     */     //   161: aload #15
/*     */     //   163: astore #24
/*     */     //   165: iconst_0
/*     */     //   166: istore #25
/*     */     //   168: aload #24
/*     */     //   170: getfield keys : [Ljava/lang/Object;
/*     */     //   173: astore #26
/*     */     //   175: aload #24
/*     */     //   177: getfield values : [I
/*     */     //   180: astore #27
/*     */     //   182: aload #24
/*     */     //   184: astore #28
/*     */     //   186: iconst_0
/*     */     //   187: istore #29
/*     */     //   189: aload #28
/*     */     //   191: getfield metadata : [J
/*     */     //   194: astore #30
/*     */     //   196: aload #30
/*     */     //   198: arraylength
/*     */     //   199: iconst_2
/*     */     //   200: isub
/*     */     //   201: istore #31
/*     */     //   203: iconst_0
/*     */     //   204: istore #32
/*     */     //   206: iload #32
/*     */     //   208: iload #31
/*     */     //   210: if_icmpgt -> 406
/*     */     //   213: aload #30
/*     */     //   215: iload #32
/*     */     //   217: laload
/*     */     //   218: lstore #33
/*     */     //   220: lload #33
/*     */     //   222: lstore #35
/*     */     //   224: iconst_0
/*     */     //   225: istore #37
/*     */     //   227: lload #35
/*     */     //   229: lload #35
/*     */     //   231: ldc2_w -1
/*     */     //   234: lxor
/*     */     //   235: bipush #7
/*     */     //   237: lshl
/*     */     //   238: land
/*     */     //   239: ldc2_w -9187201950435737472
/*     */     //   242: land
/*     */     //   243: ldc2_w -9187201950435737472
/*     */     //   246: lcmp
/*     */     //   247: ifeq -> 393
/*     */     //   250: bipush #8
/*     */     //   252: iload #32
/*     */     //   254: iload #31
/*     */     //   256: isub
/*     */     //   257: iconst_m1
/*     */     //   258: ixor
/*     */     //   259: bipush #31
/*     */     //   261: iushr
/*     */     //   262: isub
/*     */     //   263: istore #38
/*     */     //   265: iconst_0
/*     */     //   266: istore #39
/*     */     //   268: iload #39
/*     */     //   270: iload #38
/*     */     //   272: if_icmpge -> 386
/*     */     //   275: lload #33
/*     */     //   277: ldc2_w 255
/*     */     //   280: land
/*     */     //   281: lstore #40
/*     */     //   283: iconst_0
/*     */     //   284: istore #42
/*     */     //   286: lload #40
/*     */     //   288: ldc2_w 128
/*     */     //   291: lcmp
/*     */     //   292: ifge -> 299
/*     */     //   295: iconst_1
/*     */     //   296: goto -> 300
/*     */     //   299: iconst_0
/*     */     //   300: ifeq -> 373
/*     */     //   303: iload #32
/*     */     //   305: iconst_3
/*     */     //   306: ishl
/*     */     //   307: iload #39
/*     */     //   309: iadd
/*     */     //   310: istore #37
/*     */     //   312: iload #37
/*     */     //   314: istore #43
/*     */     //   316: iconst_0
/*     */     //   317: istore #44
/*     */     //   319: aload #26
/*     */     //   321: iload #43
/*     */     //   323: aaload
/*     */     //   324: aload #27
/*     */     //   326: iload #43
/*     */     //   328: iaload
/*     */     //   329: istore #45
/*     */     //   331: checkcast androidx/compose/runtime/snapshots/StateObject
/*     */     //   334: astore #46
/*     */     //   336: iconst_0
/*     */     //   337: istore #47
/*     */     //   339: aload #21
/*     */     //   341: iload #23
/*     */     //   343: iload #45
/*     */     //   345: iadd
/*     */     //   346: invokevirtual setElement : (I)V
/*     */     //   349: aload_2
/*     */     //   350: invokevirtual getReadObserver : ()Lkotlin/jvm/functions/Function1;
/*     */     //   353: dup
/*     */     //   354: ifnull -> 368
/*     */     //   357: aload #46
/*     */     //   359: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   364: pop
/*     */     //   365: goto -> 369
/*     */     //   368: pop
/*     */     //   369: nop
/*     */     //   370: nop
/*     */     //   371: nop
/*     */     //   372: nop
/*     */     //   373: lload #33
/*     */     //   375: bipush #8
/*     */     //   377: lshr
/*     */     //   378: lstore #33
/*     */     //   380: iinc #39, 1
/*     */     //   383: goto -> 268
/*     */     //   386: iload #38
/*     */     //   388: bipush #8
/*     */     //   390: if_icmpne -> 407
/*     */     //   393: iload #32
/*     */     //   395: iload #31
/*     */     //   397: if_icmpeq -> 406
/*     */     //   400: iinc #32, 1
/*     */     //   403: goto -> 213
/*     */     //   406: nop
/*     */     //   407: nop
/*     */     //   408: aload #21
/*     */     //   410: iload #23
/*     */     //   412: invokevirtual setElement : (I)V
/*     */     //   415: nop
/*     */     //   416: nop
/*     */     //   417: nop
/*     */     //   418: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   421: astore #7
/*     */     //   423: aload #6
/*     */     //   425: astore #8
/*     */     //   427: iconst_0
/*     */     //   428: istore #9
/*     */     //   430: nop
/*     */     //   431: aload #8
/*     */     //   433: invokevirtual getSize : ()I
/*     */     //   436: istore #10
/*     */     //   438: iload #10
/*     */     //   440: ifle -> 488
/*     */     //   443: iconst_0
/*     */     //   444: istore #11
/*     */     //   446: aload #8
/*     */     //   448: invokevirtual getContent : ()[Ljava/lang/Object;
/*     */     //   451: astore #12
/*     */     //   453: aload #12
/*     */     //   455: iload #11
/*     */     //   457: aaload
/*     */     //   458: checkcast androidx/compose/runtime/DerivedStateObserver
/*     */     //   461: astore #13
/*     */     //   463: iconst_0
/*     */     //   464: istore #48
/*     */     //   466: aload #13
/*     */     //   468: aload_0
/*     */     //   469: checkcast androidx/compose/runtime/DerivedState
/*     */     //   472: invokeinterface done : (Landroidx/compose/runtime/DerivedState;)V
/*     */     //   477: nop
/*     */     //   478: iinc #11, 1
/*     */     //   481: iload #11
/*     */     //   483: iload #10
/*     */     //   485: if_icmplt -> 453
/*     */     //   488: nop
/*     */     //   489: goto -> 563
/*     */     //   492: astore #8
/*     */     //   494: aload #6
/*     */     //   496: astore #9
/*     */     //   498: iconst_0
/*     */     //   499: istore #10
/*     */     //   501: nop
/*     */     //   502: aload #9
/*     */     //   504: invokevirtual getSize : ()I
/*     */     //   507: istore #11
/*     */     //   509: iload #11
/*     */     //   511: ifle -> 559
/*     */     //   514: iconst_0
/*     */     //   515: istore #12
/*     */     //   517: aload #9
/*     */     //   519: invokevirtual getContent : ()[Ljava/lang/Object;
/*     */     //   522: astore #13
/*     */     //   524: aload #13
/*     */     //   526: iload #12
/*     */     //   528: aaload
/*     */     //   529: checkcast androidx/compose/runtime/DerivedStateObserver
/*     */     //   532: astore #48
/*     */     //   534: iconst_0
/*     */     //   535: istore #49
/*     */     //   537: aload #48
/*     */     //   539: aload_0
/*     */     //   540: checkcast androidx/compose/runtime/DerivedState
/*     */     //   543: invokeinterface done : (Landroidx/compose/runtime/DerivedState;)V
/*     */     //   548: nop
/*     */     //   549: iinc #12, 1
/*     */     //   552: iload #12
/*     */     //   554: iload #11
/*     */     //   556: if_icmplt -> 524
/*     */     //   559: nop
/*     */     //   560: aload #8
/*     */     //   562: athrow
/*     */     //   563: nop
/*     */     //   564: aload_1
/*     */     //   565: areturn
/*     */     //   566: new androidx/collection/MutableObjectIntMap
/*     */     //   569: dup
/*     */     //   570: iconst_0
/*     */     //   571: iconst_1
/*     */     //   572: aconst_null
/*     */     //   573: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   576: astore #5
/*     */     //   578: iconst_0
/*     */     //   579: istore #7
/*     */     //   581: invokestatic access$getCalculationBlockNestedLevel$p : ()Landroidx/compose/runtime/SnapshotThreadLocal;
/*     */     //   584: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   587: checkcast androidx/compose/runtime/internal/IntRef
/*     */     //   590: dup
/*     */     //   591: ifnonnull -> 623
/*     */     //   594: pop
/*     */     //   595: new androidx/compose/runtime/internal/IntRef
/*     */     //   598: dup
/*     */     //   599: iconst_0
/*     */     //   600: invokespecial <init> : (I)V
/*     */     //   603: astore #8
/*     */     //   605: aload #8
/*     */     //   607: astore #9
/*     */     //   609: iconst_0
/*     */     //   610: istore #10
/*     */     //   612: invokestatic access$getCalculationBlockNestedLevel$p : ()Landroidx/compose/runtime/SnapshotThreadLocal;
/*     */     //   615: aload #9
/*     */     //   617: invokevirtual set : (Ljava/lang/Object;)V
/*     */     //   620: nop
/*     */     //   621: aload #8
/*     */     //   623: astore #11
/*     */     //   625: aload #11
/*     */     //   627: astore #12
/*     */     //   629: iconst_0
/*     */     //   630: istore #13
/*     */     //   632: aload #12
/*     */     //   634: invokevirtual getElement : ()I
/*     */     //   637: istore #14
/*     */     //   639: iconst_0
/*     */     //   640: istore #15
/*     */     //   642: invokestatic derivedStateObservers : ()Landroidx/compose/runtime/collection/MutableVector;
/*     */     //   645: astore #16
/*     */     //   647: aload #16
/*     */     //   649: astore #17
/*     */     //   651: iconst_0
/*     */     //   652: istore #18
/*     */     //   654: nop
/*     */     //   655: aload #17
/*     */     //   657: invokevirtual getSize : ()I
/*     */     //   660: istore #19
/*     */     //   662: iload #19
/*     */     //   664: ifle -> 712
/*     */     //   667: iconst_0
/*     */     //   668: istore #20
/*     */     //   670: aload #17
/*     */     //   672: invokevirtual getContent : ()[Ljava/lang/Object;
/*     */     //   675: astore #21
/*     */     //   677: aload #21
/*     */     //   679: iload #20
/*     */     //   681: aaload
/*     */     //   682: checkcast androidx/compose/runtime/DerivedStateObserver
/*     */     //   685: astore #22
/*     */     //   687: iconst_0
/*     */     //   688: istore #23
/*     */     //   690: aload #22
/*     */     //   692: aload_0
/*     */     //   693: checkcast androidx/compose/runtime/DerivedState
/*     */     //   696: invokeinterface start : (Landroidx/compose/runtime/DerivedState;)V
/*     */     //   701: nop
/*     */     //   702: iinc #20, 1
/*     */     //   705: iload #20
/*     */     //   707: iload #19
/*     */     //   709: if_icmplt -> 677
/*     */     //   712: nop
/*     */     //   713: nop
/*     */     //   714: iconst_0
/*     */     //   715: istore #24
/*     */     //   717: aload #12
/*     */     //   719: iload #14
/*     */     //   721: iconst_1
/*     */     //   722: iadd
/*     */     //   723: invokevirtual setElement : (I)V
/*     */     //   726: getstatic androidx/compose/runtime/snapshots/Snapshot.Companion : Landroidx/compose/runtime/snapshots/Snapshot$Companion;
/*     */     //   729: new androidx/compose/runtime/DerivedSnapshotState$currentRecord$result$1$1$result$1
/*     */     //   732: dup
/*     */     //   733: aload_0
/*     */     //   734: aload #12
/*     */     //   736: aload #5
/*     */     //   738: iload #14
/*     */     //   740: invokespecial <init> : (Landroidx/compose/runtime/DerivedSnapshotState;Landroidx/compose/runtime/internal/IntRef;Landroidx/collection/MutableObjectIntMap;I)V
/*     */     //   743: checkcast kotlin/jvm/functions/Function1
/*     */     //   746: aconst_null
/*     */     //   747: aload #4
/*     */     //   749: invokevirtual observe : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*     */     //   752: astore #25
/*     */     //   754: aload #12
/*     */     //   756: iload #14
/*     */     //   758: invokevirtual setElement : (I)V
/*     */     //   761: aload #25
/*     */     //   763: astore #17
/*     */     //   765: aload #16
/*     */     //   767: astore #18
/*     */     //   769: iconst_0
/*     */     //   770: istore #19
/*     */     //   772: nop
/*     */     //   773: aload #18
/*     */     //   775: invokevirtual getSize : ()I
/*     */     //   778: istore #20
/*     */     //   780: iload #20
/*     */     //   782: ifle -> 830
/*     */     //   785: iconst_0
/*     */     //   786: istore #21
/*     */     //   788: aload #18
/*     */     //   790: invokevirtual getContent : ()[Ljava/lang/Object;
/*     */     //   793: astore #22
/*     */     //   795: aload #22
/*     */     //   797: iload #21
/*     */     //   799: aaload
/*     */     //   800: checkcast androidx/compose/runtime/DerivedStateObserver
/*     */     //   803: astore #23
/*     */     //   805: iconst_0
/*     */     //   806: istore #26
/*     */     //   808: aload #23
/*     */     //   810: aload_0
/*     */     //   811: checkcast androidx/compose/runtime/DerivedState
/*     */     //   814: invokeinterface done : (Landroidx/compose/runtime/DerivedState;)V
/*     */     //   819: nop
/*     */     //   820: iinc #21, 1
/*     */     //   823: iload #21
/*     */     //   825: iload #20
/*     */     //   827: if_icmplt -> 795
/*     */     //   830: nop
/*     */     //   831: goto -> 905
/*     */     //   834: astore #18
/*     */     //   836: aload #16
/*     */     //   838: astore #19
/*     */     //   840: iconst_0
/*     */     //   841: istore #20
/*     */     //   843: nop
/*     */     //   844: aload #19
/*     */     //   846: invokevirtual getSize : ()I
/*     */     //   849: istore #21
/*     */     //   851: iload #21
/*     */     //   853: ifle -> 901
/*     */     //   856: iconst_0
/*     */     //   857: istore #22
/*     */     //   859: aload #19
/*     */     //   861: invokevirtual getContent : ()[Ljava/lang/Object;
/*     */     //   864: astore #23
/*     */     //   866: aload #23
/*     */     //   868: iload #22
/*     */     //   870: aaload
/*     */     //   871: checkcast androidx/compose/runtime/DerivedStateObserver
/*     */     //   874: astore #26
/*     */     //   876: iconst_0
/*     */     //   877: istore #27
/*     */     //   879: aload #26
/*     */     //   881: aload_0
/*     */     //   882: checkcast androidx/compose/runtime/DerivedState
/*     */     //   885: invokeinterface done : (Landroidx/compose/runtime/DerivedState;)V
/*     */     //   890: nop
/*     */     //   891: iinc #22, 1
/*     */     //   894: iload #22
/*     */     //   896: iload #21
/*     */     //   898: if_icmplt -> 866
/*     */     //   901: nop
/*     */     //   902: aload #18
/*     */     //   904: athrow
/*     */     //   905: aload #17
/*     */     //   907: nop
/*     */     //   908: nop
/*     */     //   909: nop
/*     */     //   910: astore #6
/*     */     //   912: iconst_0
/*     */     //   913: istore #8
/*     */     //   915: invokestatic getLock : ()Landroidx/compose/runtime/SynchronizedObject;
/*     */     //   918: astore #9
/*     */     //   920: iconst_0
/*     */     //   921: istore #10
/*     */     //   923: aload #9
/*     */     //   925: astore #11
/*     */     //   927: aload #11
/*     */     //   929: monitorenter
/*     */     //   930: nop
/*     */     //   931: iconst_0
/*     */     //   932: istore #12
/*     */     //   934: getstatic androidx/compose/runtime/snapshots/Snapshot.Companion : Landroidx/compose/runtime/snapshots/Snapshot$Companion;
/*     */     //   937: invokevirtual getCurrent : ()Landroidx/compose/runtime/snapshots/Snapshot;
/*     */     //   940: astore #13
/*     */     //   942: aload_1
/*     */     //   943: invokevirtual getResult : ()Ljava/lang/Object;
/*     */     //   946: getstatic androidx/compose/runtime/DerivedSnapshotState$ResultRecord.Companion : Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;
/*     */     //   949: invokevirtual getUnset : ()Ljava/lang/Object;
/*     */     //   952: if_acmpeq -> 1018
/*     */     //   955: aload_0
/*     */     //   956: invokevirtual getPolicy : ()Landroidx/compose/runtime/SnapshotMutationPolicy;
/*     */     //   959: dup
/*     */     //   960: ifnull -> 986
/*     */     //   963: aload #6
/*     */     //   965: aload_1
/*     */     //   966: invokevirtual getResult : ()Ljava/lang/Object;
/*     */     //   969: invokeinterface equivalent : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   974: iconst_1
/*     */     //   975: if_icmpne -> 982
/*     */     //   978: iconst_1
/*     */     //   979: goto -> 988
/*     */     //   982: iconst_0
/*     */     //   983: goto -> 988
/*     */     //   986: pop
/*     */     //   987: iconst_0
/*     */     //   988: ifeq -> 1018
/*     */     //   991: aload_1
/*     */     //   992: aload #5
/*     */     //   994: checkcast androidx/collection/ObjectIntMap
/*     */     //   997: invokevirtual setDependencies : (Landroidx/collection/ObjectIntMap;)V
/*     */     //   1000: aload_1
/*     */     //   1001: aload_1
/*     */     //   1002: aload_0
/*     */     //   1003: checkcast androidx/compose/runtime/DerivedState
/*     */     //   1006: aload #13
/*     */     //   1008: invokevirtual readableHash : (Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)I
/*     */     //   1011: invokevirtual setResultHash : (I)V
/*     */     //   1014: aload_1
/*     */     //   1015: goto -> 1074
/*     */     //   1018: aload_0
/*     */     //   1019: getfield first : Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;
/*     */     //   1022: checkcast androidx/compose/runtime/snapshots/StateRecord
/*     */     //   1025: aload_0
/*     */     //   1026: checkcast androidx/compose/runtime/snapshots/StateObject
/*     */     //   1029: aload #13
/*     */     //   1031: invokestatic newWritableRecord : (Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;
/*     */     //   1034: checkcast androidx/compose/runtime/DerivedSnapshotState$ResultRecord
/*     */     //   1037: astore #14
/*     */     //   1039: aload #14
/*     */     //   1041: aload #5
/*     */     //   1043: checkcast androidx/collection/ObjectIntMap
/*     */     //   1046: invokevirtual setDependencies : (Landroidx/collection/ObjectIntMap;)V
/*     */     //   1049: aload #14
/*     */     //   1051: aload #14
/*     */     //   1053: aload_0
/*     */     //   1054: checkcast androidx/compose/runtime/DerivedState
/*     */     //   1057: aload #13
/*     */     //   1059: invokevirtual readableHash : (Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)I
/*     */     //   1062: invokevirtual setResultHash : (I)V
/*     */     //   1065: aload #14
/*     */     //   1067: aload #6
/*     */     //   1069: invokevirtual setResult : (Ljava/lang/Object;)V
/*     */     //   1072: aload #14
/*     */     //   1074: nop
/*     */     //   1075: astore #15
/*     */     //   1077: aload #11
/*     */     //   1079: monitorexit
/*     */     //   1080: aload #15
/*     */     //   1082: goto -> 1093
/*     */     //   1085: astore #15
/*     */     //   1087: aload #11
/*     */     //   1089: monitorexit
/*     */     //   1090: aload #15
/*     */     //   1092: athrow
/*     */     //   1093: nop
/*     */     //   1094: nop
/*     */     //   1095: astore #7
/*     */     //   1097: invokestatic access$getCalculationBlockNestedLevel$p : ()Landroidx/compose/runtime/SnapshotThreadLocal;
/*     */     //   1100: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1103: checkcast androidx/compose/runtime/internal/IntRef
/*     */     //   1106: dup
/*     */     //   1107: ifnull -> 1124
/*     */     //   1110: invokevirtual getElement : ()I
/*     */     //   1113: ifne -> 1120
/*     */     //   1116: iconst_1
/*     */     //   1117: goto -> 1126
/*     */     //   1120: iconst_0
/*     */     //   1121: goto -> 1126
/*     */     //   1124: pop
/*     */     //   1125: iconst_0
/*     */     //   1126: ifeq -> 1207
/*     */     //   1129: getstatic androidx/compose/runtime/snapshots/Snapshot.Companion : Landroidx/compose/runtime/snapshots/Snapshot$Companion;
/*     */     //   1132: invokevirtual notifyObjectsInitialized : ()V
/*     */     //   1135: iconst_0
/*     */     //   1136: istore #8
/*     */     //   1138: invokestatic getLock : ()Landroidx/compose/runtime/SynchronizedObject;
/*     */     //   1141: astore #9
/*     */     //   1143: iconst_0
/*     */     //   1144: istore #10
/*     */     //   1146: aload #9
/*     */     //   1148: astore #11
/*     */     //   1150: aload #11
/*     */     //   1152: monitorenter
/*     */     //   1153: nop
/*     */     //   1154: iconst_0
/*     */     //   1155: istore #12
/*     */     //   1157: getstatic androidx/compose/runtime/snapshots/Snapshot.Companion : Landroidx/compose/runtime/snapshots/Snapshot$Companion;
/*     */     //   1160: invokevirtual getCurrent : ()Landroidx/compose/runtime/snapshots/Snapshot;
/*     */     //   1163: astore #13
/*     */     //   1165: aload #7
/*     */     //   1167: aload #13
/*     */     //   1169: invokevirtual getId : ()I
/*     */     //   1172: invokevirtual setValidSnapshotId : (I)V
/*     */     //   1175: aload #7
/*     */     //   1177: aload #13
/*     */     //   1179: invokevirtual getWriteCount$runtime : ()I
/*     */     //   1182: invokevirtual setValidSnapshotWriteCount : (I)V
/*     */     //   1185: nop
/*     */     //   1186: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1189: astore #12
/*     */     //   1191: aload #11
/*     */     //   1193: monitorexit
/*     */     //   1194: goto -> 1205
/*     */     //   1197: astore #12
/*     */     //   1199: aload #11
/*     */     //   1201: monitorexit
/*     */     //   1202: aload #12
/*     */     //   1204: athrow
/*     */     //   1205: nop
/*     */     //   1206: nop
/*     */     //   1207: aload #7
/*     */     //   1209: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #176	-> 0
/*     */     //   #179	-> 12
/*     */     //   #180	-> 16
/*     */     //   #402	-> 19
/*     */     //   #403	-> 24
/*     */     //   #404	-> 31
/*     */     //   #405	-> 32
/*     */     //   #406	-> 39
/*     */     //   #407	-> 44
/*     */     //   #408	-> 47
/*     */     //   #410	-> 54
/*     */     //   #403	-> 67
/*     */     //   #410	-> 78
/*     */     //   #411	-> 79
/*     */     //   #412	-> 82
/*     */     //   #414	-> 89
/*     */     //   #415	-> 90
/*     */     //   #416	-> 91
/*     */     //   #181	-> 94
/*     */     //   #182	-> 100
/*     */     //   #417	-> 103
/*     */     //   #418	-> 134
/*     */     //   #419	-> 142
/*     */     //   #417	-> 143
/*     */     //   #417	-> 145
/*     */     //   #420	-> 147
/*     */     //   #183	-> 154
/*     */     //   #184	-> 161
/*     */     //   #421	-> 168
/*     */     //   #422	-> 175
/*     */     //   #424	-> 182
/*     */     //   #425	-> 189
/*     */     //   #426	-> 196
/*     */     //   #428	-> 203
/*     */     //   #429	-> 213
/*     */     //   #430	-> 220
/*     */     //   #431	-> 227
/*     */     //   #430	-> 243
/*     */     //   #432	-> 250
/*     */     //   #433	-> 265
/*     */     //   #434	-> 275
/*     */     //   #435	-> 286
/*     */     //   #434	-> 300
/*     */     //   #436	-> 303
/*     */     //   #437	-> 312
/*     */     //   #438	-> 319
/*     */     //   #185	-> 339
/*     */     //   #186	-> 349
/*     */     //   #187	-> 369
/*     */     //   #438	-> 370
/*     */     //   #439	-> 371
/*     */     //   #437	-> 372
/*     */     //   #440	-> 373
/*     */     //   #433	-> 380
/*     */     //   #442	-> 386
/*     */     //   #428	-> 393
/*     */     //   #445	-> 406
/*     */     //   #446	-> 407
/*     */     //   #188	-> 408
/*     */     //   #189	-> 415
/*     */     //   #420	-> 416
/*     */     //   #190	-> 417
/*     */     //   #416	-> 421
/*     */     //   #447	-> 423
/*     */     //   #404	-> 430
/*     */     //   #405	-> 431
/*     */     //   #406	-> 438
/*     */     //   #407	-> 443
/*     */     //   #408	-> 446
/*     */     //   #410	-> 453
/*     */     //   #447	-> 466
/*     */     //   #410	-> 477
/*     */     //   #411	-> 478
/*     */     //   #412	-> 481
/*     */     //   #414	-> 488
/*     */     //   #448	-> 489
/*     */     //   #447	-> 492
/*     */     //   #404	-> 501
/*     */     //   #405	-> 502
/*     */     //   #406	-> 509
/*     */     //   #407	-> 514
/*     */     //   #408	-> 517
/*     */     //   #410	-> 524
/*     */     //   #447	-> 537
/*     */     //   #410	-> 548
/*     */     //   #411	-> 549
/*     */     //   #412	-> 552
/*     */     //   #414	-> 559
/*     */     //   #415	-> 563
/*     */     //   #192	-> 564
/*     */     //   #195	-> 566
/*     */     //   #196	-> 578
/*     */     //   #449	-> 581
/*     */     //   #450	-> 612
/*     */     //   #451	-> 620
/*     */     //   #449	-> 621
/*     */     //   #449	-> 623
/*     */     //   #452	-> 625
/*     */     //   #197	-> 632
/*     */     //   #198	-> 639
/*     */     //   #453	-> 642
/*     */     //   #454	-> 647
/*     */     //   #455	-> 654
/*     */     //   #456	-> 655
/*     */     //   #457	-> 662
/*     */     //   #458	-> 667
/*     */     //   #459	-> 670
/*     */     //   #461	-> 677
/*     */     //   #454	-> 690
/*     */     //   #461	-> 701
/*     */     //   #462	-> 702
/*     */     //   #463	-> 705
/*     */     //   #465	-> 712
/*     */     //   #466	-> 713
/*     */     //   #467	-> 714
/*     */     //   #199	-> 717
/*     */     //   #201	-> 726
/*     */     //   #213	-> 746
/*     */     //   #201	-> 749
/*     */     //   #216	-> 754
/*     */     //   #217	-> 761
/*     */     //   #467	-> 763
/*     */     //   #469	-> 765
/*     */     //   #455	-> 772
/*     */     //   #456	-> 773
/*     */     //   #457	-> 780
/*     */     //   #458	-> 785
/*     */     //   #459	-> 788
/*     */     //   #461	-> 795
/*     */     //   #469	-> 808
/*     */     //   #461	-> 819
/*     */     //   #462	-> 820
/*     */     //   #463	-> 823
/*     */     //   #465	-> 830
/*     */     //   #470	-> 831
/*     */     //   #469	-> 834
/*     */     //   #455	-> 843
/*     */     //   #456	-> 844
/*     */     //   #457	-> 851
/*     */     //   #458	-> 856
/*     */     //   #459	-> 859
/*     */     //   #461	-> 866
/*     */     //   #469	-> 879
/*     */     //   #461	-> 890
/*     */     //   #462	-> 891
/*     */     //   #463	-> 894
/*     */     //   #465	-> 901
/*     */     //   #466	-> 907
/*     */     //   #198	-> 908
/*     */     //   #452	-> 909
/*     */     //   #196	-> 910
/*     */     //   #221	-> 912
/*     */     //   #471	-> 915
/*     */     //   #472	-> 923
/*     */     //   #222	-> 934
/*     */     //   #224	-> 942
/*     */     //   #225	-> 942
/*     */     //   #227	-> 955
/*     */     //   #226	-> 987
/*     */     //   #229	-> 991
/*     */     //   #230	-> 1000
/*     */     //   #231	-> 1014
/*     */     //   #233	-> 1018
/*     */     //   #234	-> 1039
/*     */     //   #235	-> 1049
/*     */     //   #236	-> 1065
/*     */     //   #237	-> 1072
/*     */     //   #224	-> 1074
/*     */     //   #472	-> 1075
/*     */     //   #472	-> 1093
/*     */     //   #471	-> 1094
/*     */     //   #221	-> 1095
/*     */     //   #241	-> 1097
/*     */     //   #242	-> 1129
/*     */     //   #244	-> 1135
/*     */     //   #473	-> 1138
/*     */     //   #474	-> 1146
/*     */     //   #245	-> 1157
/*     */     //   #246	-> 1165
/*     */     //   #247	-> 1175
/*     */     //   #248	-> 1185
/*     */     //   #474	-> 1189
/*     */     //   #474	-> 1205
/*     */     //   #473	-> 1206
/*     */     //   #251	-> 1207
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   339	31	47	$i$a$-forEach-DerivedSnapshotState$currentRecord$1$1$1	I
/*     */     //   336	34	46	dependency	Landroidx/compose/runtime/snapshots/StateObject;
/*     */     //   336	34	45	nestedLevel	I
/*     */     //   319	53	44	$i$a$-forEachIndexed-ObjectIntMap$forEach$1$iv	I
/*     */     //   316	56	43	index$iv	I
/*     */     //   227	16	37	$i$f$maskEmptyOrDeleted	I
/*     */     //   224	19	35	$this$maskEmptyOrDeleted$iv$iv$iv	J
/*     */     //   286	14	42	$i$f$isFull	I
/*     */     //   283	17	40	value$iv$iv$iv	J
/*     */     //   312	61	37	index$iv$iv	I
/*     */     //   268	118	39	j$iv$iv	I
/*     */     //   265	128	38	bitCount$iv$iv	I
/*     */     //   220	173	33	slot$iv$iv	J
/*     */     //   206	200	32	i$iv$iv	I
/*     */     //   189	218	29	$i$f$forEachIndexed	I
/*     */     //   196	211	30	m$iv$iv	[J
/*     */     //   203	204	31	lastIndex$iv$iv	I
/*     */     //   186	221	28	this_$iv$iv	Landroidx/collection/ObjectIntMap;
/*     */     //   168	240	25	$i$f$forEach	I
/*     */     //   175	233	26	k$iv	[Ljava/lang/Object;
/*     */     //   182	226	27	v$iv	[I
/*     */     //   165	243	24	this_$iv	Landroidx/collection/ObjectIntMap;
/*     */     //   154	262	22	$i$a$-withCalculationNestedLevel-DerivedSnapshotState$currentRecord$1$1	I
/*     */     //   161	255	23	invalidationNestedLevel	I
/*     */     //   151	265	21	calculationLevelRef	Landroidx/compose/runtime/internal/IntRef;
/*     */     //   134	9	19	$i$a$-also-SnapshotStateKt__DerivedStateKt$withCalculationNestedLevel$ref$1$iv	I
/*     */     //   131	12	18	it$iv	Landroidx/compose/runtime/internal/IntRef;
/*     */     //   103	314	16	$i$f$withCalculationNestedLevel	I
/*     */     //   147	270	20	ref$iv	Landroidx/compose/runtime/internal/IntRef;
/*     */     //   94	324	14	$i$a$-notifyObservers-DerivedSnapshotState$currentRecord$1	I
/*     */     //   100	318	15	dependencies	Landroidx/collection/ObjectIntMap;
/*     */     //   67	11	13	$i$a$-forEach-SnapshotStateKt__DerivedStateKt$notifyObservers$1$iv	I
/*     */     //   64	14	12	it$iv	Landroidx/compose/runtime/DerivedStateObserver;
/*     */     //   47	42	10	i$iv$iv	I
/*     */     //   54	35	11	content$iv$iv	[Ljava/lang/Object;
/*     */     //   31	59	8	$i$f$forEach	I
/*     */     //   39	51	9	size$iv$iv	I
/*     */     //   28	62	7	this_$iv$iv	Landroidx/compose/runtime/collection/MutableVector;
/*     */     //   466	11	48	$i$a$-forEach-SnapshotStateKt__DerivedStateKt$notifyObservers$2$iv	I
/*     */     //   463	14	13	it$iv	Landroidx/compose/runtime/DerivedStateObserver;
/*     */     //   446	42	11	i$iv$iv	I
/*     */     //   453	35	12	content$iv$iv	[Ljava/lang/Object;
/*     */     //   430	59	9	$i$f$forEach	I
/*     */     //   438	51	10	size$iv$iv	I
/*     */     //   427	62	8	this_$iv$iv	Landroidx/compose/runtime/collection/MutableVector;
/*     */     //   537	11	49	$i$a$-forEach-SnapshotStateKt__DerivedStateKt$notifyObservers$2$iv	I
/*     */     //   534	14	48	it$iv	Landroidx/compose/runtime/DerivedStateObserver;
/*     */     //   517	42	12	i$iv$iv	I
/*     */     //   524	35	13	content$iv$iv	[Ljava/lang/Object;
/*     */     //   501	59	10	$i$f$forEach	I
/*     */     //   509	51	11	size$iv$iv	I
/*     */     //   498	62	9	this_$iv$iv	Landroidx/compose/runtime/collection/MutableVector;
/*     */     //   19	545	5	$i$f$notifyObservers	I
/*     */     //   24	540	6	observers$iv	Landroidx/compose/runtime/collection/MutableVector;
/*     */     //   717	46	24	$i$a$-notifyObservers-DerivedSnapshotState$currentRecord$result$1$1	I
/*     */     //   754	9	25	result	Ljava/lang/Object;
/*     */     //   690	11	23	$i$a$-forEach-SnapshotStateKt__DerivedStateKt$notifyObservers$1$iv	I
/*     */     //   687	14	22	it$iv	Landroidx/compose/runtime/DerivedStateObserver;
/*     */     //   670	42	20	i$iv$iv	I
/*     */     //   677	35	21	content$iv$iv	[Ljava/lang/Object;
/*     */     //   654	59	18	$i$f$forEach	I
/*     */     //   662	51	19	size$iv$iv	I
/*     */     //   651	62	17	this_$iv$iv	Landroidx/compose/runtime/collection/MutableVector;
/*     */     //   808	11	26	$i$a$-forEach-SnapshotStateKt__DerivedStateKt$notifyObservers$2$iv	I
/*     */     //   805	14	23	it$iv	Landroidx/compose/runtime/DerivedStateObserver;
/*     */     //   788	42	21	i$iv$iv	I
/*     */     //   795	35	22	content$iv$iv	[Ljava/lang/Object;
/*     */     //   772	59	19	$i$f$forEach	I
/*     */     //   780	51	20	size$iv$iv	I
/*     */     //   769	62	18	this_$iv$iv	Landroidx/compose/runtime/collection/MutableVector;
/*     */     //   879	11	27	$i$a$-forEach-SnapshotStateKt__DerivedStateKt$notifyObservers$2$iv	I
/*     */     //   876	14	26	it$iv	Landroidx/compose/runtime/DerivedStateObserver;
/*     */     //   859	42	22	i$iv$iv	I
/*     */     //   866	35	23	content$iv$iv	[Ljava/lang/Object;
/*     */     //   843	59	20	$i$f$forEach	I
/*     */     //   851	51	21	size$iv$iv	I
/*     */     //   840	62	19	this_$iv$iv	Landroidx/compose/runtime/collection/MutableVector;
/*     */     //   642	266	15	$i$f$notifyObservers	I
/*     */     //   647	261	16	observers$iv	Landroidx/compose/runtime/collection/MutableVector;
/*     */     //   632	277	13	$i$a$-withCalculationNestedLevel-DerivedSnapshotState$currentRecord$result$1	I
/*     */     //   639	270	14	nestedCalculationLevel	I
/*     */     //   629	280	12	calculationLevelRef	Landroidx/compose/runtime/internal/IntRef;
/*     */     //   612	9	10	$i$a$-also-SnapshotStateKt__DerivedStateKt$withCalculationNestedLevel$ref$1$iv	I
/*     */     //   609	12	9	it$iv	Landroidx/compose/runtime/internal/IntRef;
/*     */     //   581	329	7	$i$f$withCalculationNestedLevel	I
/*     */     //   625	285	11	ref$iv	Landroidx/compose/runtime/internal/IntRef;
/*     */     //   1039	35	14	writable	Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;
/*     */     //   934	141	12	$i$a$-sync-DerivedSnapshotState$currentRecord$record$1	I
/*     */     //   942	133	13	currentSnapshot	Landroidx/compose/runtime/snapshots/Snapshot;
/*     */     //   923	171	10	$i$f$synchronized	I
/*     */     //   920	174	9	lock$iv$iv	Landroidx/compose/runtime/SynchronizedObject;
/*     */     //   915	180	8	$i$f$sync	I
/*     */     //   1157	29	12	$i$a$-sync-DerivedSnapshotState$currentRecord$2	I
/*     */     //   1165	21	13	currentSnapshot	Landroidx/compose/runtime/snapshots/Snapshot;
/*     */     //   1146	60	10	$i$f$synchronized	I
/*     */     //   1143	63	9	lock$iv$iv	Landroidx/compose/runtime/SynchronizedObject;
/*     */     //   1138	69	8	$i$f$sync	I
/*     */     //   578	632	5	newDependencies	Landroidx/collection/MutableObjectIntMap;
/*     */     //   912	298	6	result	Ljava/lang/Object;
/*     */     //   1097	113	7	record	Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;
/*     */     //   0	1210	0	this	Landroidx/compose/runtime/DerivedSnapshotState;
/*     */     //   0	1210	1	readable	Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;
/*     */     //   0	1210	2	snapshot	Landroidx/compose/runtime/snapshots/Snapshot;
/*     */     //   0	1210	3	forceDependencyReads	Z
/*     */     //   0	1210	4	calculation	Lkotlin/jvm/functions/Function0;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   90	423	492	finally
/*     */     //   492	494	492	finally
/*     */     //   713	765	834	finally
/*     */     //   834	836	834	finally
/*     */     //   930	1077	1085	finally
/*     */     //   1085	1087	1085	finally
/*     */     //   1153	1191	1197	finally
/*     */     //   1197	1199	1197	finally
/*     */   }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\b\002\n\002\020\000\n\000\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"})
/*     */   static final class DerivedSnapshotState$currentRecord$result$1$1$result$1
/*     */     extends Lambda
/*     */     implements Function1<Object, Unit>
/*     */   {
/*     */     public final void invoke(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       if (it == DerivedSnapshotState.this) {
/*     */         throw new IllegalStateException("A derived state calculation cannot read itself".toString());
/*     */       }
/*     */       if (it instanceof StateObject) {
/*     */         int readNestedLevel = this.$calculationLevelRef.getElement();
/*     */         this.$newDependencies.set(it, Math.min(readNestedLevel - this.$nestedCalculationLevel, this.$newDependencies.getOrDefault(it, 2147483647)));
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     DerivedSnapshotState$currentRecord$result$1$1$result$1(IntRef $calculationLevelRef, MutableObjectIntMap<StateObject> $newDependencies, int $nestedCalculationLevel) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     StateRecord<T> $this$withCurrent$iv = this.first;
/*     */     int $i$f$withCurrent = 0;
/* 475 */     ResultRecord it = (ResultRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-DerivedSnapshotState$toString$1 = 0; return "DerivedState(value=" + displayValue() + ")@" + hashCode();
/* 476 */   } @NotNull public StateRecord getFirstStateRecord() { return this.first; } public void prependStateRecord(@NotNull StateRecord value) { Intrinsics.checkNotNullParameter(value, "value"); this.first = (ResultRecord<T>)value; } public T getValue() { if (Snapshot.Companion.getCurrent().getReadObserver() != null) { Snapshot.Companion.getCurrent().getReadObserver().invoke(this); } else { Snapshot.Companion.getCurrent().getReadObserver(); }  Snapshot snapshot = Snapshot.Companion.getCurrent(); ResultRecord<T> record = (ResultRecord)SnapshotKt.current(this.first, snapshot); return (T)currentRecord(record, snapshot, true, this.calculation).getResult(); } @NotNull public DerivedState.Record<T> getCurrentRecord() { Snapshot snapshot = Snapshot.Companion.getCurrent(); ResultRecord<T> record = (ResultRecord)SnapshotKt.current(this.first, snapshot); return currentRecord(record, snapshot, false, this.calculation); } @JvmName(name = "getDebuggerDisplayValue") @Nullable public final T getDebuggerDisplayValue() { StateRecord<T> $this$withCurrent$iv = this.first; int $i$f$withCurrent = 0; ResultRecord it = (ResultRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-DerivedSnapshotState$debuggerDisplayValue$1 = 0; return it.isValid(this, Snapshot.Companion.getCurrent()) ? (T)it.getResult() : null; } private final String displayValue() { StateRecord<T> $this$withCurrent$iv = this.first; int $i$f$withCurrent = 0;
/* 477 */     ResultRecord it = (ResultRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-DerivedSnapshotState$displayValue$1 = 0;
/*     */     if (it.isValid(this, Snapshot.Companion.getCurrent()))
/*     */       return String.valueOf(it.getResult()); 
/*     */     return "<Not calculated>"; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\DerivedSnapshotState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */