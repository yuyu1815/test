/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.runtime.snapshots.Snapshot;
/*     */ import androidx.compose.runtime.snapshots.SnapshotKt;
/*     */ import androidx.compose.runtime.snapshots.SnapshotMutableState;
/*     */ import androidx.compose.runtime.snapshots.StateObject;
/*     */ import androidx.compose.runtime.snapshots.StateObjectImpl;
/*     */ import androidx.compose.runtime.snapshots.StateRecord;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\b\n\002\b\b\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\020\002\n\002\b\006\n\002\020\016\n\002\b\002\b\020\030\0002\0020\0012\0020\0022\b\022\004\022\0020\0040\003:\001%B\r\022\006\020\005\032\0020\004¢\006\002\020\006J\016\020\031\032\0020\004H\002¢\006\002\020\032J\025\020\033\032\016\022\004\022\0020\004\022\004\022\0020\0350\034H\002J\"\020\036\032\004\030\0010\r2\006\020\037\032\0020\r2\006\020 \032\0020\r2\006\020!\032\0020\rH\026J\020\020\"\032\0020\0352\006\020\005\032\0020\rH\026J\b\020#\032\0020$H\026R\032\020\007\032\0020\0048GX\004¢\006\f\022\004\b\b\020\t\032\004\b\n\020\013R\024\020\f\032\0020\r8VX\004¢\006\006\032\004\b\016\020\017R$\020\020\032\0020\0042\006\020\005\032\0020\0048V@VX\016¢\006\f\032\004\b\021\020\013\"\004\b\022\020\006R\016\020\023\032\0020\024X\016¢\006\002\n\000R\032\020\025\032\b\022\004\022\0020\0040\0268VX\004¢\006\006\032\004\b\027\020\030¨\006&"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableIntStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "value", "(I)V", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "()V", "getDebuggerDisplayValue", "()I", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "intValue", "getIntValue", "setIntValue", "next", "Landroidx/compose/runtime/SnapshotMutableIntStateImpl$IntStateStateRecord;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "component1", "()Ljava/lang/Integer;", "component2", "Lkotlin/Function1;", "", "mergeRecords", "previous", "current", "applied", "prependStateRecord", "toString", "", "IntStateStateRecord", "runtime"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nSnapshotIntState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotMutableIntStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,200:1\n2421#2:201\n2342#2,2:202\n1844#2:204\n2344#2,5:206\n2421#2:211\n2421#2:212\n26#3:205\n*S KotlinDebug\n*F\n+ 1 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotMutableIntStateImpl\n*L\n148#1:201\n150#1:202,2\n150#1:204\n150#1:206,5\n181#1:211\n188#1:212\n150#1:205\n*E\n"})
/*     */ public class SnapshotMutableIntStateImpl
/*     */   extends StateObjectImpl
/*     */   implements MutableIntState, SnapshotMutableState<Integer>
/*     */ {
/*     */   @NotNull
/*     */   private IntStateStateRecord next;
/*     */   public static final int $stable;
/*     */   
/*     */   public SnapshotMutableIntStateImpl(int value) {
/* 135 */     IntStateStateRecord intStateStateRecord1 = new IntStateStateRecord(value), intStateStateRecord2 = intStateStateRecord1; SnapshotMutableIntStateImpl snapshotMutableIntStateImpl = this; int $i$a$-also-SnapshotMutableIntStateImpl$next$1 = 0;
/* 136 */     if (Snapshot.Companion.isInSnapshot()) {
/* 137 */       IntStateStateRecord intStateStateRecord3 = new IntStateStateRecord(value), intStateStateRecord4 = intStateStateRecord3, intStateStateRecord5 = intStateStateRecord2; int $i$a$-also-SnapshotMutableIntStateImpl$next$1$1 = 0;
/* 138 */       intStateStateRecord4.setSnapshotId$runtime(1);
/* 139 */       intStateStateRecord5.setNext$runtime(intStateStateRecord3);
/*     */     } 
/* 141 */     snapshotMutableIntStateImpl.next = intStateStateRecord1;
/*     */   } @NotNull
/*     */   public StateRecord getFirstStateRecord() {
/* 144 */     return this.next;
/*     */   }
/*     */   
/* 147 */   public int getIntValue() { return ((IntStateStateRecord)SnapshotKt.readable(this.next, (StateObject)this)).getValue(); }
/* 148 */   @NotNull public SnapshotMutationPolicy<Integer> getPolicy() { return SnapshotStateKt.structuralEqualityPolicy(); } @NotNull public Integer component1() { return Integer.valueOf(getIntValue()); } @NotNull public Function1<Integer, Unit> component2() { return new SnapshotMutableIntStateImpl$component2$1(); } public void setIntValue(int value) { StateRecord $this$withCurrent$iv = this.next; int $i$f$withCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 201 */     IntStateStateRecord it = (IntStateStateRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-SnapshotMutableIntStateImpl$intValue$1 = 0; if (it.getValue() != value)
/* 202 */     { StateRecord $this$overwritable$iv = this.next; int $i$f$overwritable = 0; Object snapshot$iv = null; snapshot$iv = SnapshotKt.getSnapshotInitializer();
/* 203 */       int $i$f$sync = 0;
/* 204 */       SynchronizedObject lock$iv$iv$iv = SnapshotKt.getLock(); int $i$f$synchronized = 0;
/* 205 */       synchronized (lock$iv$iv$iv) { int $i$a$-sync-SnapshotKt$overwritable$1$iv = 0;
/* 206 */         snapshot$iv = Snapshot.Companion.getCurrent();
/* 207 */         IntStateStateRecord $this$_set_intValue__u24lambda_u243_u24lambda_u242 = (IntStateStateRecord)SnapshotKt.overwritableRecord($this$overwritable$iv, (StateObject)this, (Snapshot)snapshot$iv, it); int $i$a$-overwritable-SnapshotMutableIntStateImpl$intValue$1$1 = 0; $this$_set_intValue__u24lambda_u243_u24lambda_u242.setValue(value); Unit unit1 = Unit.INSTANCE; }
/* 208 */        Unit unit = unit1; Object it$iv = unit; int $i$a$-also-SnapshotKt$overwritable$2$iv = 0;
/* 209 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv, (StateObject)this); }  }
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\b\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}) static final class SnapshotMutableIntStateImpl$component2$1 extends Lambda implements Function1<Integer, Unit> {
/* 211 */     SnapshotMutableIntStateImpl$component2$1() { super(1); } public final void invoke(int it) { SnapshotMutableIntStateImpl.this.setIntValue(it); } } public void prependStateRecord(@NotNull StateRecord value) { Intrinsics.checkNotNullParameter(value, "value"); this.next = (IntStateStateRecord)value; } @Nullable public StateRecord mergeRecords(@NotNull StateRecord previous, @NotNull StateRecord current, @NotNull StateRecord applied) { Intrinsics.checkNotNullParameter(previous, "previous"); Intrinsics.checkNotNullParameter(current, "current"); Intrinsics.checkNotNullParameter(applied, "applied"); IntStateStateRecord currentRecord = (IntStateStateRecord)current; IntStateStateRecord appliedRecord = (IntStateStateRecord)applied; return (currentRecord.getValue() == appliedRecord.getValue()) ? current : null; } @NotNull public String toString() { StateRecord $this$withCurrent$iv = this.next; int $i$f$withCurrent = 0; IntStateStateRecord it = (IntStateStateRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-SnapshotMutableIntStateImpl$toString$1 = 0; return "MutableIntState(value=" + it.getValue() + ")@" + hashCode(); } @JvmName(name = "getDebuggerDisplayValue") public final int getDebuggerDisplayValue() { StateRecord $this$withCurrent$iv = this.next; int $i$f$withCurrent = 0;
/* 212 */     IntStateStateRecord it = (IntStateStateRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-SnapshotMutableIntStateImpl$debuggerDisplayValue$1 = 0;
/*     */     return it.getValue(); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\002\n\002\b\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\b\032\0020\t2\006\020\002\032\0020\001H\026J\b\020\n\032\0020\001H\026R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\004¨\006\013"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableIntStateImpl$IntStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "(I)V", "getValue", "()I", "setValue", "assign", "", "create", "runtime"})
/*     */   private static final class IntStateStateRecord extends StateRecord {
/*     */     private int value;
/*     */     
/*     */     public final int getValue() {
/*     */       return this.value;
/*     */     }
/*     */     
/*     */     public final void setValue(int <set-?>) {
/*     */       this.value = <set-?>;
/*     */     }
/*     */     
/*     */     public IntStateStateRecord(int value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     public void assign(@NotNull StateRecord value) {
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       this.value = ((IntStateStateRecord)value).value;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public StateRecord create() {
/*     */       return new IntStateStateRecord(this.value);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\SnapshotMutableIntStateImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */