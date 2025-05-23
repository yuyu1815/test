/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import androidx.compose.runtime.snapshots.SnapshotMutableState;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000V\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\006\n\000\n\002\030\002\n\002\020\007\n\000\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\020\t\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\003\n\000\032\020\020\006\032\0020\0072\006\020\b\032\0020\tH\000\032\020\020\n\032\0020\0132\006\020\b\032\0020\fH\000\032\020\020\r\032\0020\0162\006\020\b\032\0020\017H\000\032\020\020\020\032\0020\0212\006\020\b\032\0020\022H\000\032/\020\023\032\b\022\004\022\002H\0250\024\"\004\b\000\020\0252\006\020\b\032\002H\0252\f\020\026\032\b\022\004\022\002H\0250\027H\000¢\006\002\020\030\032\030\020\031\032\0020\0322\006\020\033\032\0020\0342\006\020\035\032\0020\036H\000\"\032\020\000\032\0020\0018FX\004¢\006\f\022\004\b\002\020\003\032\004\b\004\020\005¨\006\037"}, d2 = {"DefaultMonotonicFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "getDefaultMonotonicFrameClock$annotations", "()V", "getDefaultMonotonicFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "createSnapshotMutableDoubleState", "Landroidx/compose/runtime/MutableDoubleState;", "value", "", "createSnapshotMutableFloatState", "Landroidx/compose/runtime/MutableFloatState;", "", "createSnapshotMutableIntState", "Landroidx/compose/runtime/MutableIntState;", "", "createSnapshotMutableLongState", "Landroidx/compose/runtime/MutableLongState;", "", "createSnapshotMutableState", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "T", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "logError", "", "message", "", "e", "", "runtime"})
/*     */ public final class ActualDesktop_desktopKt
/*     */ {
/*     */   @NotNull
/*     */   public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
/*  67 */     return SixtyFpsMonotonicFrameClock.INSTANCE;
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
/*     */   @NotNull
/*     */   public static final <T> SnapshotMutableState<T> createSnapshotMutableState(Object value, @NotNull SnapshotMutationPolicy<T> policy) {
/*  83 */     Intrinsics.checkNotNullParameter(policy, "policy"); return new SnapshotMutableStateImpl<>((T)value, policy);
/*     */   }
/*     */   @NotNull
/*     */   public static final MutableIntState createSnapshotMutableIntState(int value) {
/*  87 */     return new SnapshotMutableIntStateImpl(value);
/*     */   }
/*     */   @NotNull
/*     */   public static final MutableLongState createSnapshotMutableLongState(long value) {
/*  91 */     return new SnapshotMutableLongStateImpl(value);
/*     */   }
/*     */   @NotNull
/*     */   public static final MutableFloatState createSnapshotMutableFloatState(float value) {
/*  95 */     return new SnapshotMutableFloatStateImpl(value);
/*     */   }
/*     */   @NotNull
/*     */   public static final MutableDoubleState createSnapshotMutableDoubleState(double value) {
/*  99 */     return new SnapshotMutableDoubleStateImpl(value);
/*     */   }
/*     */   public static final void logError(@NotNull String message, @NotNull Throwable e) {
/* 102 */     Intrinsics.checkNotNullParameter(message, "message"); Intrinsics.checkNotNullParameter(e, "e"); System.err.println(message);
/* 103 */     e.printStackTrace(System.err);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ActualDesktop_desktopKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */