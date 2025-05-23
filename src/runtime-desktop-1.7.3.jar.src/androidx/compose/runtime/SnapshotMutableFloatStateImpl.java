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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\020\002\n\002\b\006\n\002\020\016\n\002\b\002\b\020\030\0002\0020\0012\0020\0022\b\022\004\022\0020\0040\003:\001!B\r\022\006\020\005\032\0020\004¢\006\002\020\006J\016\020\025\032\0020\004H\002¢\006\002\020\026J\025\020\027\032\016\022\004\022\0020\004\022\004\022\0020\0310\030H\002J\"\020\032\032\004\030\0010\b2\006\020\033\032\0020\b2\006\020\034\032\0020\b2\006\020\035\032\0020\bH\026J\020\020\036\032\0020\0312\006\020\005\032\0020\bH\026J\b\020\037\032\0020 H\026R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\nR$\020\013\032\0020\0042\006\020\005\032\0020\0048V@VX\016¢\006\f\032\004\b\f\020\r\"\004\b\016\020\006R\016\020\017\032\0020\020X\016¢\006\002\n\000R\032\020\021\032\b\022\004\022\0020\0040\0228VX\004¢\006\006\032\004\b\023\020\024¨\006\""}, d2 = {"Landroidx/compose/runtime/SnapshotMutableFloatStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableFloatState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "value", "(F)V", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "floatValue", "getFloatValue", "()F", "setFloatValue", "next", "Landroidx/compose/runtime/SnapshotMutableFloatStateImpl$FloatStateStateRecord;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "component1", "()Ljava/lang/Float;", "component2", "Lkotlin/Function1;", "", "mergeRecords", "previous", "current", "applied", "prependStateRecord", "toString", "", "FloatStateStateRecord", "runtime"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nSnapshotFloatState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFloatState.kt\nandroidx/compose/runtime/SnapshotMutableFloatStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 FloatingPointEquality.jb.kt\nandroidx/compose/runtime/internal/FloatingPointEquality_jbKt\n+ 4 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,192:1\n2421#2:193\n2342#2,2:195\n1844#2:197\n2344#2,5:199\n2421#2:205\n21#3:194\n21#3:204\n26#4:198\n*S KotlinDebug\n*F\n+ 1 SnapshotFloatState.kt\nandroidx/compose/runtime/SnapshotMutableFloatStateImpl\n*L\n145#1:193\n147#1:195,2\n147#1:197\n147#1:199,5\n178#1:205\n146#1:194\n171#1:204\n147#1:198\n*E\n"})
/*     */ public class SnapshotMutableFloatStateImpl
/*     */   extends StateObjectImpl
/*     */   implements MutableFloatState, SnapshotMutableState<Float>
/*     */ {
/*     */   @NotNull
/*     */   private FloatStateStateRecord next;
/*     */   public static final int $stable;
/*     */   
/*     */   public SnapshotMutableFloatStateImpl(float value) {
/* 132 */     FloatStateStateRecord floatStateStateRecord1 = new FloatStateStateRecord(value), floatStateStateRecord2 = floatStateStateRecord1; SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = this; int $i$a$-also-SnapshotMutableFloatStateImpl$next$1 = 0;
/* 133 */     if (Snapshot.Companion.isInSnapshot()) {
/* 134 */       FloatStateStateRecord floatStateStateRecord3 = new FloatStateStateRecord(value), floatStateStateRecord4 = floatStateStateRecord3, floatStateStateRecord5 = floatStateStateRecord2; int $i$a$-also-SnapshotMutableFloatStateImpl$next$1$1 = 0;
/* 135 */       floatStateStateRecord4.setSnapshotId$runtime(1);
/* 136 */       floatStateStateRecord5.setNext$runtime(floatStateStateRecord3);
/*     */     } 
/* 138 */     snapshotMutableFloatStateImpl.next = floatStateStateRecord1;
/*     */   } @NotNull
/*     */   public StateRecord getFirstStateRecord() {
/* 141 */     return this.next;
/*     */   }
/*     */   
/* 144 */   public float getFloatValue() { return ((FloatStateStateRecord)SnapshotKt.readable(this.next, (StateObject)this)).getValue(); }
/* 145 */   @NotNull public SnapshotMutationPolicy<Float> getPolicy() { return SnapshotStateKt.structuralEqualityPolicy(); } @NotNull public Float component1() { return Float.valueOf(getFloatValue()); } @NotNull public Function1<Float, Unit> component2() { return new SnapshotMutableFloatStateImpl$component2$1(); } public void setFloatValue(float value) { StateRecord $this$withCurrent$iv = this.next; int $i$f$withCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 193 */     FloatStateStateRecord it = (FloatStateStateRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-SnapshotMutableFloatStateImpl$floatValue$1 = 0; float $this$equalsWithNanFix$iv = it.getValue(); int $i$f$equalsWithNanFix = 0;
/* 194 */     if (!(($this$equalsWithNanFix$iv == value) ? 1 : 0))
/* 195 */     { StateRecord $this$overwritable$iv = this.next; int $i$f$overwritable = 0; Object snapshot$iv = null; snapshot$iv = SnapshotKt.getSnapshotInitializer();
/* 196 */       int $i$f$sync = 0;
/* 197 */       SynchronizedObject lock$iv$iv$iv = SnapshotKt.getLock(); int $i$f$synchronized = 0;
/* 198 */       synchronized (lock$iv$iv$iv) { int $i$a$-sync-SnapshotKt$overwritable$1$iv = 0;
/* 199 */         snapshot$iv = Snapshot.Companion.getCurrent();
/* 200 */         FloatStateStateRecord $this$_set_floatValue__u24lambda_u243_u24lambda_u242 = (FloatStateStateRecord)SnapshotKt.overwritableRecord($this$overwritable$iv, (StateObject)this, (Snapshot)snapshot$iv, it); int $i$a$-overwritable-SnapshotMutableFloatStateImpl$floatValue$1$1 = 0; $this$_set_floatValue__u24lambda_u243_u24lambda_u242.setValue(value); Unit unit1 = Unit.INSTANCE; }
/* 201 */        Unit unit = unit1; Object it$iv = unit; int $i$a$-also-SnapshotKt$overwritable$2$iv = 0;
/* 202 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv, (StateObject)this); }  }
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\007\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}) static final class SnapshotMutableFloatStateImpl$component2$1 extends Lambda implements Function1<Float, Unit> {
/* 204 */     SnapshotMutableFloatStateImpl$component2$1() { super(1); } public final void invoke(float it) { SnapshotMutableFloatStateImpl.this.setFloatValue(it); } } public void prependStateRecord(@NotNull StateRecord value) { Intrinsics.checkNotNullParameter(value, "value"); this.next = (FloatStateStateRecord)value; } @Nullable public StateRecord mergeRecords(@NotNull StateRecord previous, @NotNull StateRecord current, @NotNull StateRecord applied) { Intrinsics.checkNotNullParameter(previous, "previous"); Intrinsics.checkNotNullParameter(current, "current"); Intrinsics.checkNotNullParameter(applied, "applied"); FloatStateStateRecord currentRecord = (FloatStateStateRecord)current; FloatStateStateRecord appliedRecord = (FloatStateStateRecord)applied; float f1 = currentRecord.getValue(), other$iv = appliedRecord.getValue(); int $i$f$equalsWithNanFix = 0; return ((f1 == other$iv)) ? current : null; } @NotNull public String toString() { StateRecord $this$withCurrent$iv = this.next; int $i$f$withCurrent = 0;
/* 205 */     FloatStateStateRecord it = (FloatStateStateRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-SnapshotMutableFloatStateImpl$toString$1 = 0;
/*     */     return "MutableFloatState(value=" + it.getValue() + ")@" + hashCode(); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\005\n\002\020\002\n\002\b\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\b\032\0020\t2\006\020\002\032\0020\001H\026J\b\020\n\032\0020\001H\026R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\004¨\006\013"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableFloatStateImpl$FloatStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "(F)V", "getValue", "()F", "setValue", "assign", "", "create", "runtime"})
/*     */   private static final class FloatStateStateRecord extends StateRecord {
/*     */     private float value;
/*     */     
/*     */     public final float getValue() {
/*     */       return this.value;
/*     */     }
/*     */     
/*     */     public final void setValue(float <set-?>) {
/*     */       this.value = <set-?>;
/*     */     }
/*     */     
/*     */     public FloatStateStateRecord(float value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     public void assign(@NotNull StateRecord value) {
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       this.value = ((FloatStateStateRecord)value).value;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public StateRecord create() {
/*     */       return new FloatStateStateRecord(this.value);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\SnapshotMutableFloatStateImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */