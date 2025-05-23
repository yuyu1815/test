/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\t\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\020\002\n\002\b#\n\002\030\002\n\000\b\007\030\000*\004\b\000\020\001*\b\b\001\020\002*\0020\0032\0020\004BY\b\000\022\006\020\005\032\0028\000\022\022\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007\022\006\020\b\032\0028\001\022\006\020\t\032\0020\n\022\006\020\013\032\0028\000\022\006\020\f\032\0020\n\022\006\020\r\032\0020\016\022\f\020\017\032\b\022\004\022\0020\0210\020¢\006\002\020\022J\006\0203\032\0020\021J\022\0204\032\016\022\004\022\0028\000\022\004\022\0028\00105R&\020\024\032\0020\n2\006\020\023\032\0020\n8F@@X\016¢\006\016\n\000\032\004\b\025\020\026\"\004\b\027\020\030R+\020\r\032\0020\0162\006\020\023\032\0020\0168F@@X\002¢\006\022\n\004\b\034\020\035\032\004\b\r\020\031\"\004\b\032\020\033R&\020\t\032\0020\n2\006\020\023\032\0020\n8F@@X\016¢\006\016\n\000\032\004\b\036\020\026\"\004\b\037\020\030R\024\020\017\032\b\022\004\022\0020\0210\020X\004¢\006\002\n\000R\021\020\f\032\0020\n¢\006\b\n\000\032\004\b \020\026R\023\020\013\032\0028\000¢\006\n\n\002\020#\032\004\b!\020\"R\035\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007¢\006\b\n\000\032\004\b$\020%R+\020&\032\0028\0002\006\020\023\032\0028\0008F@@X\002¢\006\022\n\004\b*\020\035\032\004\b'\020\"\"\004\b(\020)R\021\020+\032\0028\0008F¢\006\006\032\004\b,\020\"R&\020-\032\0028\0012\006\020\023\032\0028\001@@X\016¢\006\020\n\002\0202\032\004\b.\020/\"\004\b0\0201¨\0066"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "initialValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialVelocityVector", "lastFrameTimeNanos", "", "targetValue", "startTimeNanos", "isRunning", "", "onCancel", "Lkotlin/Function0;", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationVector;JLjava/lang/Object;JZLkotlin/jvm/functions/Function0;)V", "<set-?>", "finishedTimeNanos", "getFinishedTimeNanos", "()J", "setFinishedTimeNanos$animation_core", "(J)V", "()Z", "setRunning$animation_core", "(Z)V", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "getLastFrameTimeNanos", "setLastFrameTimeNanos$animation_core", "getStartTimeNanos", "getTargetValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "value", "getValue", "setValue$animation_core", "(Ljava/lang/Object;)V", "value$delegate", "velocity", "getVelocity", "velocityVector", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "setVelocityVector$animation_core", "(Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/AnimationVector;", "cancelAnimation", "toAnimationState", "Landroidx/compose/animation/core/AnimationState;", "animation-core"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n81#2:347\n107#2,2:348\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n*L\n147#1:344\n147#1:345,2\n181#1:347\n181#1:348,2\n*E\n"})
/*     */ public final class AnimationScope<T, V extends AnimationVector>
/*     */ {
/*     */   @NotNull
/*     */   private final TwoWayConverter<T, V> typeConverter;
/*     */   private final T targetValue;
/*     */   private final long startTimeNanos;
/*     */   @NotNull
/*     */   private final Function0<Unit> onCancel;
/*     */   @NotNull
/*     */   private final MutableState value$delegate;
/*     */   @NotNull
/*     */   private V velocityVector;
/*     */   private long lastFrameTimeNanos;
/*     */   private long finishedTimeNanos;
/*     */   @NotNull
/*     */   private final MutableState isRunning$delegate;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public AnimationScope(Object initialValue, @NotNull TwoWayConverter<T, V> typeConverter, @NotNull AnimationVector initialVelocityVector, long lastFrameTimeNanos, Object targetValue, long startTimeNanos, boolean isRunning, @NotNull Function0<Unit> onCancel) {
/* 128 */     this.typeConverter = typeConverter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     this.targetValue = (T)targetValue;
/*     */ 
/*     */ 
/*     */     
/* 138 */     this.startTimeNanos = startTimeNanos;
/*     */ 
/*     */     
/* 141 */     this.onCancel = onCancel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 147 */     this.value$delegate = SnapshotStateKt.mutableStateOf$default(initialValue, null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 152 */     this.velocityVector = AnimationVectorsKt.copy((V)initialVelocityVector);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 165 */     this.lastFrameTimeNanos = lastFrameTimeNanos;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 176 */     this.finishedTimeNanos = Long.MIN_VALUE;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 181 */     this.isRunning$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(isRunning), null, 2, null);
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
/*     */   @NotNull
/*     */   public final TwoWayConverter<T, V> getTypeConverter() {
/*     */     return this.typeConverter;
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
/*     */   public final T getTargetValue() {
/*     */     return this.targetValue;
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
/*     */   public final long getStartTimeNanos() {
/*     */     return this.startTimeNanos;
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
/*     */   @NotNull
/*     */   public final V getVelocityVector() {
/*     */     return this.velocityVector;
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
/*     */   public final void setVelocityVector$animation_core(@NotNull AnimationVector <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.velocityVector = (V)<set-?>;
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
/*     */   public final T getValue() {
/*     */     State state = (State)this.value$delegate;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 344 */     return (T)state.getValue();
/* 345 */   } public final long getLastFrameTimeNanos() { return this.lastFrameTimeNanos; } public final void setValue$animation_core(Object <set-?>) { MutableState mutableState = this.value$delegate; KProperty property$iv = null; int $i$f$setValue = 0; mutableState.setValue(<set-?>); }
/*     */   public final void setLastFrameTimeNanos$animation_core(long <set-?>) { this.lastFrameTimeNanos = <set-?>; } public final boolean isRunning() { State state = (State)this.isRunning$delegate; KProperty property$iv = null; int $i$f$getValue = 0;
/* 347 */     return ((Boolean)state.getValue()).booleanValue(); }
/* 348 */   public final long getFinishedTimeNanos() { return this.finishedTimeNanos; } public final void setFinishedTimeNanos$animation_core(long <set-?>) { this.finishedTimeNanos = <set-?>; } public final void setRunning$animation_core(boolean <set-?>) { MutableState mutableState = this.isRunning$delegate; Object object = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   public final T getVelocity() {
/*     */     return (T)this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
/*     */   }
/*     */   
/*     */   public final void cancelAnimation() {
/*     */     setRunning$animation_core(false);
/*     */     this.onCancel.invoke();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AnimationState<T, V> toAnimationState() {
/*     */     return new AnimationState<>(this.typeConverter, getValue(), this.velocityVector, this.lastFrameTimeNanos, this.finishedTimeNanos, isRunning());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\AnimationScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */