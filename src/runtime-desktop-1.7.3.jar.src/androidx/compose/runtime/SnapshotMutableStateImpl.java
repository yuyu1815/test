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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\b\n\002\030\002\n\002\020\002\n\002\b\006\n\002\020\016\n\002\b\002\b\020\030\000*\004\b\000\020\0012\0020\0022\b\022\004\022\002H\0010\003:\001$B\033\022\006\020\004\032\0028\000\022\f\020\005\032\b\022\004\022\0028\0000\006¢\006\002\020\007J\016\020\031\032\0028\000H\002¢\006\002\020\fJ\025\020\032\032\016\022\004\022\0028\000\022\004\022\0020\0340\033H\002J\"\020\035\032\004\030\0010\0162\006\020\036\032\0020\0162\006\020\037\032\0020\0162\006\020 \032\0020\016H\026J\020\020!\032\0020\0342\006\020\004\032\0020\016H\026J\b\020\"\032\0020#H\026R\027\020\b\032\0028\0008G¢\006\f\022\004\b\t\020\n\032\004\b\013\020\fR\024\020\r\032\0020\0168VX\004¢\006\006\032\004\b\017\020\020R\024\020\021\032\b\022\004\022\0028\0000\022X\016¢\006\002\n\000R\032\020\005\032\b\022\004\022\0028\0000\006X\004¢\006\b\n\000\032\004\b\023\020\024R*\020\004\032\0028\0002\006\020\004\032\0028\0008V@VX\016¢\006\022\022\004\b\025\020\n\032\004\b\026\020\f\"\004\b\027\020\030¨\006%"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl;", "T", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "value", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "()V", "getDebuggerDisplayValue", "()Ljava/lang/Object;", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "next", "Landroidx/compose/runtime/SnapshotMutableStateImpl$StateStateRecord;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "getValue$annotations", "getValue", "setValue", "(Ljava/lang/Object;)V", "component1", "component2", "Lkotlin/Function1;", "", "mergeRecords", "previous", "current", "applied", "prependStateRecord", "toString", "", "StateStateRecord", "runtime"})
/*     */ @StabilityInferred(parameters = 2)
/*     */ @SourceDebugExtension({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,313:1\n2421#2:314\n2342#2,2:315\n1844#2:317\n2344#2,5:319\n2421#2:324\n2421#2:325\n26#3:318\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n*L\n136#1:314\n138#1:315,2\n138#1:317\n138#1:319,5\n185#1:324\n221#1:325\n138#1:318\n*E\n"})
/*     */ public class SnapshotMutableStateImpl<T>
/*     */   extends StateObjectImpl
/*     */   implements SnapshotMutableState<T>
/*     */ {
/*     */   @NotNull
/*     */   private final SnapshotMutationPolicy<T> policy;
/*     */   @NotNull
/*     */   private StateStateRecord<T> next;
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   public SnapshotMutationPolicy<T> getPolicy() {
/* 131 */     return this.policy; } public SnapshotMutableStateImpl(Object value, @NotNull SnapshotMutationPolicy<T> policy) { this.policy = policy;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 142 */     StateStateRecord<T> stateStateRecord1 = new StateStateRecord(value), stateStateRecord2 = stateStateRecord1; SnapshotMutableStateImpl snapshotMutableStateImpl = this; int $i$a$-also-SnapshotMutableStateImpl$next$1 = 0;
/* 143 */     if (Snapshot.Companion.isInSnapshot()) {
/* 144 */       StateStateRecord stateStateRecord3 = new StateStateRecord(value), stateStateRecord4 = stateStateRecord3; StateStateRecord<T> stateStateRecord = stateStateRecord2; int $i$a$-also-SnapshotMutableStateImpl$next$1$1 = 0;
/* 145 */       stateStateRecord4.setSnapshotId$runtime(1);
/* 146 */       stateStateRecord.setNext$runtime(stateStateRecord3);
/*     */     } 
/* 148 */     snapshotMutableStateImpl.next = stateStateRecord1; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public T getValue() {
/*     */     return ((StateStateRecord<T>)SnapshotKt.readable(this.next, (StateObject)this)).getValue();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public StateRecord getFirstStateRecord() {
/*     */     return this.next;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void prependStateRecord(@NotNull StateRecord value) {
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     this.next = (StateStateRecord<T>)value;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public StateRecord mergeRecords(@NotNull StateRecord previous, @NotNull StateRecord current, @NotNull StateRecord applied) {
/*     */     Intrinsics.checkNotNullParameter(previous, "previous");
/*     */     Intrinsics.checkNotNullParameter(current, "current");
/*     */     Intrinsics.checkNotNullParameter(applied, "applied");
/*     */     StateStateRecord<T> previousRecord = (StateStateRecord)previous;
/*     */     StateStateRecord<T> currentRecord = (StateStateRecord)current;
/*     */     StateStateRecord<T> appliedRecord = (StateStateRecord)applied;
/*     */     Object merged = getPolicy().merge(previousRecord.getValue(), currentRecord.getValue(), appliedRecord.getValue());
/*     */     StateRecord stateRecord1 = appliedRecord.create(), it = stateRecord1;
/*     */     int $i$a$-also-SnapshotMutableStateImpl$mergeRecords$1 = 0;
/*     */     Intrinsics.checkNotNull(it, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$4>");
/*     */     ((StateStateRecord<Object>)it).setValue(merged);
/*     */     return getPolicy().equivalent(currentRecord.getValue(), appliedRecord.getValue()) ? current : ((merged != null) ? stateRecord1 : null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValue(Object value) {
/*     */     StateRecord<T> $this$withCurrent$iv = this.next;
/*     */     int $i$f$withCurrent = 0;
/* 314 */     StateStateRecord<T> it = (StateStateRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-SnapshotMutableStateImpl$value$1 = 0; if (!getPolicy().equivalent(it.getValue(), (T)value)) {
/* 315 */       StateRecord<T> $this$overwritable$iv = this.next; int $i$f$overwritable = 0; Object snapshot$iv = null; snapshot$iv = SnapshotKt.getSnapshotInitializer();
/* 316 */       int $i$f$sync = 0;
/* 317 */       SynchronizedObject lock$iv$iv$iv = SnapshotKt.getLock(); int $i$f$synchronized = 0;
/* 318 */       synchronized (lock$iv$iv$iv) { int $i$a$-sync-SnapshotKt$overwritable$1$iv = 0;
/* 319 */         snapshot$iv = Snapshot.Companion.getCurrent();
/* 320 */         StateStateRecord<Object> $this$_set_value__u24lambda_u241_u24lambda_u240 = (StateStateRecord)SnapshotKt.overwritableRecord($this$overwritable$iv, (StateObject)this, (Snapshot)snapshot$iv, it); int $i$a$-overwritable-SnapshotMutableStateImpl$value$1$1 = 0; $this$_set_value__u24lambda_u241_u24lambda_u240.setValue(value); Unit unit1 = Unit.INSTANCE; }
/* 321 */        Unit unit = unit1; Object it$iv = unit; int $i$a$-also-SnapshotKt$overwritable$2$iv = 0;
/* 322 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv, (StateObject)this);
/*     */     }  } @NotNull public String toString() { StateRecord<T> $this$withCurrent$iv = this.next; int $i$f$withCurrent = 0;
/* 324 */     StateStateRecord<String> it = (StateStateRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-SnapshotMutableStateImpl$toString$1 = 0; return "MutableState(value=" + it.getValue() + ")@" + hashCode(); } @JvmName(name = "getDebuggerDisplayValue") public final T getDebuggerDisplayValue() { StateRecord<T> $this$withCurrent$iv = this.next; int $i$f$withCurrent = 0;
/* 325 */     StateStateRecord<T> it = (StateStateRecord)SnapshotKt.current($this$withCurrent$iv); int $i$a$-withCurrent-SnapshotMutableStateImpl$debuggerDisplayValue$1 = 0;
/*     */     return it.getValue(); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\020\002\n\002\b\002\b\002\030\000*\004\b\001\020\0012\0020\002B\r\022\006\020\003\032\0028\001¢\006\002\020\004J\020\020\n\032\0020\0132\006\020\005\032\0020\002H\026J\b\020\f\032\0020\002H\026R\034\020\005\032\0028\001X\016¢\006\020\n\002\020\t\032\004\b\006\020\007\"\004\b\b\020\004¨\006\r"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl$StateStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "myValue", "(Ljava/lang/Object;)V", "value", "getValue", "()Ljava/lang/Object;", "setValue", "Ljava/lang/Object;", "assign", "", "create", "runtime"})
/*     */   private static final class StateStateRecord<T> extends StateRecord {
/*     */     private T value;
/*     */     
/*     */     public StateStateRecord(Object myValue) {
/*     */       this.value = (T)myValue;
/*     */     }
/*     */     
/*     */     public void assign(@NotNull StateRecord value) {
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       this.value = ((StateStateRecord)value).value;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public StateRecord create() {
/*     */       return new StateStateRecord(this.value);
/*     */     }
/*     */     
/*     */     public final T getValue() {
/*     */       return this.value;
/*     */     }
/*     */     
/*     */     public final void setValue(Object <set-?>) {
/*     */       this.value = (T)<set-?>;
/*     */     }
/*     */   }
/*     */   
/*     */   public T component1() {
/*     */     return getValue();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Function1<T, Unit> component2() {
/*     */     return new SnapshotMutableStateImpl$component2$1();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)V"})
/*     */   static final class SnapshotMutableStateImpl$component2$1 extends Lambda implements Function1<T, Unit> {
/*     */     SnapshotMutableStateImpl$component2$1() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     public final void invoke(Object it) {
/*     */       SnapshotMutableStateImpl.this.setValue((T)it);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\SnapshotMutableStateImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */