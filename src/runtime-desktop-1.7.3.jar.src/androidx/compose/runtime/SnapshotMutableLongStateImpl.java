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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\t\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\020\002\n\002\b\006\n\002\020\016\n\002\b\002\b\020\030\0002\0020\0012\0020\0022\b\022\004\022\0020\0040\003:\001!B\r\022\006\020\005\032\0020\004¢\006\002\020\006J\016\020\025\032\0020\004H\002¢\006\002\020\026J\025\020\027\032\016\022\004\022\0020\004\022\004\022\0020\0310\030H\002J\"\020\032\032\004\030\0010\b2\006\020\033\032\0020\b2\006\020\034\032\0020\b2\006\020\035\032\0020\bH\026J\020\020\036\032\0020\0312\006\020\005\032\0020\bH\026J\b\020\037\032\0020 H\026R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\nR$\020\013\032\0020\0042\006\020\005\032\0020\0048V@VX\016¢\006\f\032\004\b\f\020\r\"\004\b\016\020\006R\016\020\017\032\0020\020X\016¢\006\002\n\000R\032\020\021\032\b\022\004\022\0020\0040\0228VX\004¢\006\006\032\004\b\023\020\024¨\006\""}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "value", "(J)V", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "longValue", "getLongValue", "()J", "setLongValue", "next", "Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "component1", "()Ljava/lang/Long;", "component2", "Lkotlin/Function1;", "", "mergeRecords", "previous", "current", "applied", "prependStateRecord", "toString", "", "LongStateStateRecord", "runtime"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nSnapshotLongState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,191:1\n2421#2:192\n2342#2,2:193\n1844#2:195\n2344#2,5:197\n2421#2:202\n26#3:196\n*S KotlinDebug\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n*L\n144#1:192\n146#1:193,2\n146#1:195\n146#1:197,5\n177#1:202\n146#1:196\n*E\n"})
/*     */ public class SnapshotMutableLongStateImpl
/*     */   extends StateObjectImpl
/*     */   implements MutableLongState, SnapshotMutableState<Long>
/*     */ {
/*     */   @NotNull
/*     */   private LongStateStateRecord next;
/*     */   public static final int $stable;
/*     */   
/*     */   public SnapshotMutableLongStateImpl(long value) {
/* 131 */     LongStateStateRecord longStateStateRecord1 = new LongStateStateRecord(value), longStateStateRecord2 = longStateStateRecord1; SnapshotMutableLongStateImpl snapshotMutableLongStateImpl = this; int $i$a$-also-SnapshotMutableLongStateImpl$next$1 = 0;
/* 132 */     if (Snapshot.Companion.isInSnapshot()) {
/* 133 */       LongStateStateRecord longStateStateRecord3 = new LongStateStateRecord(value), longStateStateRecord4 = longStateStateRecord3, longStateStateRecord5 = longStateStateRecord2; int $i$a$-also-SnapshotMutableLongStateImpl$next$1$1 = 0;
/* 134 */       longStateStateRecord4.setSnapshotId$runtime(1);
/* 135 */       longStateStateRecord5.setNext$runtime(longStateStateRecord3);
/*     */     } 
/* 137 */     snapshotMutableLongStateImpl.next = longStateStateRecord1;
/*     */   } @NotNull
/*     */   public StateRecord getFirstStateRecord() {
/* 140 */     return this.next;
/*     */   }
/*     */   
/* 143 */   public long getLongValue() { return ((LongStateStateRecord)SnapshotKt.readable(this.next, (StateObject)this)).getValue(); }
/* 144 */   public void setLongValue(long value) { StateRecord $this$withCurrent$iv = this.next; int $i$f$withCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 192 */     LongStateStateRecord it = (LongStateStateRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-SnapshotMutableLongStateImpl$longValue$1 = 0; if (it.getValue() != value) {
/* 193 */       StateRecord $this$overwritable$iv = this.next; int $i$f$overwritable = 0; Object snapshot$iv = null; snapshot$iv = SnapshotKt.getSnapshotInitializer();
/* 194 */       int $i$f$sync = 0;
/* 195 */       SynchronizedObject lock$iv$iv$iv = SnapshotKt.getLock(); int $i$f$synchronized = 0;
/* 196 */       synchronized (lock$iv$iv$iv) { int $i$a$-sync-SnapshotKt$overwritable$1$iv = 0;
/* 197 */         snapshot$iv = Snapshot.Companion.getCurrent();
/* 198 */         LongStateStateRecord $this$_set_longValue__u24lambda_u243_u24lambda_u242 = (LongStateStateRecord)SnapshotKt.overwritableRecord($this$overwritable$iv, (StateObject)this, (Snapshot)snapshot$iv, it); int $i$a$-overwritable-SnapshotMutableLongStateImpl$longValue$1$1 = 0; $this$_set_longValue__u24lambda_u243_u24lambda_u242.setValue(value); Unit unit1 = Unit.INSTANCE; }
/* 199 */        Unit unit = unit1; Object it$iv = unit; int $i$a$-also-SnapshotKt$overwritable$2$iv = 0;
/* 200 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv, (StateObject)this);
/*     */     }  } @NotNull public String toString() { StateRecord $this$withCurrent$iv = this.next; int $i$f$withCurrent = 0;
/* 202 */     LongStateStateRecord it = (LongStateStateRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-SnapshotMutableLongStateImpl$toString$1 = 0;
/*     */     return "MutableLongState(value=" + it.getValue() + ")@" + hashCode(); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public SnapshotMutationPolicy<Long> getPolicy() {
/*     */     return SnapshotStateKt.structuralEqualityPolicy();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Long component1() {
/*     */     return Long.valueOf(getLongValue());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Function1<Long, Unit> component2() {
/*     */     return new SnapshotMutableLongStateImpl$component2$1();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\t\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*     */   static final class SnapshotMutableLongStateImpl$component2$1 extends Lambda implements Function1<Long, Unit> {
/*     */     SnapshotMutableLongStateImpl$component2$1() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     public final void invoke(long it) {
/*     */       SnapshotMutableLongStateImpl.this.setLongValue(it);
/*     */     }
/*     */   }
/*     */   
/*     */   public void prependStateRecord(@NotNull StateRecord value) {
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     this.next = (LongStateStateRecord)value;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public StateRecord mergeRecords(@NotNull StateRecord previous, @NotNull StateRecord current, @NotNull StateRecord applied) {
/*     */     Intrinsics.checkNotNullParameter(previous, "previous");
/*     */     Intrinsics.checkNotNullParameter(current, "current");
/*     */     Intrinsics.checkNotNullParameter(applied, "applied");
/*     */     LongStateStateRecord currentRecord = (LongStateStateRecord)current;
/*     */     LongStateStateRecord appliedRecord = (LongStateStateRecord)applied;
/*     */     return (currentRecord.getValue() == appliedRecord.getValue()) ? current : null;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\t\n\002\b\005\n\002\020\002\n\002\b\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\b\032\0020\t2\006\020\002\032\0020\001H\026J\b\020\n\032\0020\001H\026R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\004¨\006\013"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "(J)V", "getValue", "()J", "setValue", "assign", "", "create", "runtime"})
/*     */   private static final class LongStateStateRecord extends StateRecord {
/*     */     private long value;
/*     */     
/*     */     public final long getValue() {
/*     */       return this.value;
/*     */     }
/*     */     
/*     */     public final void setValue(long <set-?>) {
/*     */       this.value = <set-?>;
/*     */     }
/*     */     
/*     */     public LongStateStateRecord(long value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     public void assign(@NotNull StateRecord value) {
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       this.value = ((LongStateStateRecord)value).value;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public StateRecord create() {
/*     */       return new LongStateStateRecord(this.value);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\SnapshotMutableLongStateImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */