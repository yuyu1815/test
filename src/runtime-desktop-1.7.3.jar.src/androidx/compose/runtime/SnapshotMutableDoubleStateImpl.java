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
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\006\n\002\b\007\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\020\002\n\002\b\006\n\002\020\016\n\002\b\002\b\020\030\0002\0020\0012\0020\0022\b\022\004\022\0020\0040\003:\001!B\r\022\006\020\005\032\0020\004¢\006\002\020\006J\016\020\025\032\0020\004H\002¢\006\002\020\026J\025\020\027\032\016\022\004\022\0020\004\022\004\022\0020\0310\030H\002J\"\020\032\032\004\030\0010\f2\006\020\033\032\0020\f2\006\020\034\032\0020\f2\006\020\035\032\0020\fH\026J\020\020\036\032\0020\0312\006\020\005\032\0020\fH\026J\b\020\037\032\0020 H\026R$\020\007\032\0020\0042\006\020\005\032\0020\0048V@VX\016¢\006\f\032\004\b\b\020\t\"\004\b\n\020\006R\024\020\013\032\0020\f8VX\004¢\006\006\032\004\b\r\020\016R\016\020\017\032\0020\020X\016¢\006\002\n\000R\032\020\021\032\b\022\004\022\0020\0040\0228VX\004¢\006\006\032\004\b\023\020\024¨\006\""}, d2 = {"Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableDoubleState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "value", "(D)V", "doubleValue", "getDoubleValue", "()D", "setDoubleValue", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "next", "Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl$DoubleStateStateRecord;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "component1", "()Ljava/lang/Double;", "component2", "Lkotlin/Function1;", "", "mergeRecords", "previous", "current", "applied", "prependStateRecord", "toString", "", "DoubleStateStateRecord", "runtime"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nSnapshotDoubleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 FloatingPointEquality.jb.kt\nandroidx/compose/runtime/internal/FloatingPointEquality_jbKt\n+ 4 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,195:1\n2421#2:196\n2342#2,2:198\n1844#2:200\n2344#2,5:202\n2421#2:208\n25#3:197\n25#3:207\n26#4:201\n*S KotlinDebug\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n*L\n148#1:196\n150#1:198,2\n150#1:200\n150#1:202,5\n181#1:208\n149#1:197\n174#1:207\n150#1:201\n*E\n"})
/*     */ public class SnapshotMutableDoubleStateImpl
/*     */   extends StateObjectImpl
/*     */   implements MutableDoubleState, SnapshotMutableState<Double>
/*     */ {
/*     */   @NotNull
/*     */   private DoubleStateStateRecord next;
/*     */   public static final int $stable;
/*     */   
/*     */   public SnapshotMutableDoubleStateImpl(double value) {
/* 135 */     DoubleStateStateRecord doubleStateStateRecord1 = new DoubleStateStateRecord(value), doubleStateStateRecord2 = doubleStateStateRecord1; SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl = this; int $i$a$-also-SnapshotMutableDoubleStateImpl$next$1 = 0;
/* 136 */     if (Snapshot.Companion.isInSnapshot()) {
/* 137 */       DoubleStateStateRecord doubleStateStateRecord3 = new DoubleStateStateRecord(value), doubleStateStateRecord4 = doubleStateStateRecord3, doubleStateStateRecord5 = doubleStateStateRecord2; int $i$a$-also-SnapshotMutableDoubleStateImpl$next$1$1 = 0;
/* 138 */       doubleStateStateRecord4.setSnapshotId$runtime(1);
/* 139 */       doubleStateStateRecord5.setNext$runtime(doubleStateStateRecord3);
/*     */     } 
/* 141 */     snapshotMutableDoubleStateImpl.next = doubleStateStateRecord1;
/*     */   } @NotNull
/*     */   public StateRecord getFirstStateRecord() {
/* 144 */     return this.next;
/*     */   }
/*     */   
/* 147 */   public double getDoubleValue() { return ((DoubleStateStateRecord)SnapshotKt.readable(this.next, (StateObject)this)).getValue(); }
/* 148 */   @NotNull public SnapshotMutationPolicy<Double> getPolicy() { return SnapshotStateKt.structuralEqualityPolicy(); } @NotNull public Double component1() { return Double.valueOf(getDoubleValue()); } @NotNull public Function1<Double, Unit> component2() { return new SnapshotMutableDoubleStateImpl$component2$1(); } public void setDoubleValue(double value) { StateRecord $this$withCurrent$iv = this.next; int $i$f$withCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     DoubleStateStateRecord it = (DoubleStateStateRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-SnapshotMutableDoubleStateImpl$doubleValue$1 = 0; double $this$equalsWithNanFix$iv = it.getValue(); int $i$f$equalsWithNanFix = 0;
/* 197 */     if (!(($this$equalsWithNanFix$iv == value) ? 1 : 0))
/* 198 */     { StateRecord $this$overwritable$iv = this.next; int $i$f$overwritable = 0; Object snapshot$iv = null; snapshot$iv = SnapshotKt.getSnapshotInitializer();
/* 199 */       int $i$f$sync = 0;
/* 200 */       SynchronizedObject lock$iv$iv$iv = SnapshotKt.getLock(); int $i$f$synchronized = 0;
/* 201 */       synchronized (lock$iv$iv$iv) { int $i$a$-sync-SnapshotKt$overwritable$1$iv = 0;
/* 202 */         snapshot$iv = Snapshot.Companion.getCurrent();
/* 203 */         DoubleStateStateRecord $this$_set_doubleValue__u24lambda_u243_u24lambda_u242 = (DoubleStateStateRecord)SnapshotKt.overwritableRecord($this$overwritable$iv, (StateObject)this, (Snapshot)snapshot$iv, it); int $i$a$-overwritable-SnapshotMutableDoubleStateImpl$doubleValue$1$1 = 0; $this$_set_doubleValue__u24lambda_u243_u24lambda_u242.setValue(value); Unit unit1 = Unit.INSTANCE; }
/* 204 */        Unit unit = unit1; Object it$iv = unit; int $i$a$-also-SnapshotKt$overwritable$2$iv = 0;
/* 205 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv, (StateObject)this); }  }
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\006\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}) static final class SnapshotMutableDoubleStateImpl$component2$1 extends Lambda implements Function1<Double, Unit> {
/* 207 */     SnapshotMutableDoubleStateImpl$component2$1() { super(1); } public final void invoke(double it) { SnapshotMutableDoubleStateImpl.this.setDoubleValue(it); } } public void prependStateRecord(@NotNull StateRecord value) { Intrinsics.checkNotNullParameter(value, "value"); this.next = (DoubleStateStateRecord)value; } @Nullable public StateRecord mergeRecords(@NotNull StateRecord previous, @NotNull StateRecord current, @NotNull StateRecord applied) { Intrinsics.checkNotNullParameter(previous, "previous"); Intrinsics.checkNotNullParameter(current, "current"); Intrinsics.checkNotNullParameter(applied, "applied"); DoubleStateStateRecord currentRecord = (DoubleStateStateRecord)current; DoubleStateStateRecord appliedRecord = (DoubleStateStateRecord)applied; double d1 = currentRecord.getValue(), other$iv = appliedRecord.getValue(); int $i$f$equalsWithNanFix = 0; return ((d1 == other$iv)) ? current : null; } @NotNull public String toString() { StateRecord $this$withCurrent$iv = this.next; int $i$f$withCurrent = 0;
/* 208 */     DoubleStateStateRecord it = (DoubleStateStateRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-SnapshotMutableDoubleStateImpl$toString$1 = 0;
/*     */     return "MutableDoubleState(value=" + it.getValue() + ")@" + hashCode(); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\005\n\002\020\002\n\002\b\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\b\032\0020\t2\006\020\002\032\0020\001H\026J\b\020\n\032\0020\001H\026R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\004¨\006\013"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl$DoubleStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "(D)V", "getValue", "()D", "setValue", "assign", "", "create", "runtime"})
/*     */   private static final class DoubleStateStateRecord extends StateRecord {
/*     */     private double value;
/*     */     
/*     */     public final double getValue() {
/*     */       return this.value;
/*     */     }
/*     */     
/*     */     public final void setValue(double <set-?>) {
/*     */       this.value = <set-?>;
/*     */     }
/*     */     
/*     */     public DoubleStateStateRecord(double value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     public void assign(@NotNull StateRecord value) {
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       this.value = ((DoubleStateStateRecord)value).value;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public StateRecord create() {
/*     */       return new DoubleStateStateRecord(this.value);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\SnapshotMutableDoubleStateImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */