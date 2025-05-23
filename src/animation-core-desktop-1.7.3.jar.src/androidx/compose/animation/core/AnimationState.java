/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\t\n\002\b\002\n\002\020\013\n\002\b\035\n\002\020\016\n\000\b\007\030\000*\004\b\000\020\001*\b\b\001\020\002*\0020\0032\b\022\004\022\002H\0010\004BK\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006\022\006\020\007\032\0028\000\022\n\b\002\020\b\032\004\030\0018\001\022\b\b\002\020\t\032\0020\n\022\b\b\002\020\013\032\0020\n\022\b\b\002\020\f\032\0020\r¢\006\002\020\016J\b\020*\032\0020+H\026R&\020\013\032\0020\n2\006\020\017\032\0020\n8F@@X\016¢\006\016\n\000\032\004\b\020\020\021\"\004\b\022\020\023R$\020\f\032\0020\r2\006\020\017\032\0020\r@@X\016¢\006\016\n\000\032\004\b\f\020\024\"\004\b\025\020\026R&\020\t\032\0020\n2\006\020\017\032\0020\n8F@@X\016¢\006\016\n\000\032\004\b\027\020\021\"\004\b\030\020\023R\035\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\b\n\000\032\004\b\031\020\032R+\020\033\032\0028\0002\006\020\017\032\0028\0008V@PX\002¢\006\022\n\004\b \020!\032\004\b\034\020\035\"\004\b\036\020\037R\021\020\"\032\0028\0008F¢\006\006\032\004\b#\020\035R&\020$\032\0028\0012\006\020\017\032\0028\001@@X\016¢\006\020\n\002\020)\032\004\b%\020&\"\004\b'\020(¨\006,"}, d2 = {"Landroidx/compose/animation/core/AnimationState;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/State;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "initialVelocityVector", "lastFrameTimeNanos", "", "finishedTimeNanos", "isRunning", "", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)V", "<set-?>", "getFinishedTimeNanos", "()J", "setFinishedTimeNanos$animation_core", "(J)V", "()Z", "setRunning$animation_core", "(Z)V", "getLastFrameTimeNanos", "setLastFrameTimeNanos$animation_core", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "value", "getValue", "()Ljava/lang/Object;", "setValue$animation_core", "(Ljava/lang/Object;)V", "value$delegate", "Landroidx/compose/runtime/MutableState;", "velocity", "getVelocity", "velocityVector", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "setVelocityVector$animation_core", "(Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/AnimationVector;", "toString", "", "animation-core"})
/*     */ @StabilityInferred(parameters = 4)
/*     */ @SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n*L\n53#1:344\n53#1:345,2\n*E\n"})
/*     */ public final class AnimationState<T, V extends AnimationVector>
/*     */   implements State<T>
/*     */ {
/*     */   @NotNull
/*     */   private final TwoWayConverter<T, V> typeConverter;
/*     */   @NotNull
/*     */   private final MutableState value$delegate;
/*     */   @NotNull
/*     */   private V velocityVector;
/*     */   private long lastFrameTimeNanos;
/*     */   private long finishedTimeNanos;
/*     */   private boolean isRunning;
/*     */   public static final int $stable;
/*     */   
/*     */   public AnimationState(@NotNull TwoWayConverter<T, V> typeConverter, Object initialValue, @Nullable AnimationVector initialVelocityVector, long lastFrameTimeNanos, long finishedTimeNanos, boolean isRunning) {
/*  43 */     this.typeConverter = typeConverter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  53 */     this.value$delegate = SnapshotStateKt.mutableStateOf$default(initialValue, null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  60 */     if (initialVelocityVector == null || AnimationVectorsKt.copy(initialVelocityVector) == null) AnimationVectorsKt.copy(initialVelocityVector);  ((AnimationState)AnimationVectorsKt.copy(initialVelocityVector)).velocityVector = AnimationStateKt.createZeroVectorFrom(this.typeConverter, (T)initialValue);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  73 */     this.lastFrameTimeNanos = lastFrameTimeNanos;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     this.finishedTimeNanos = finishedTimeNanos;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  90 */     this.isRunning = isRunning;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */     State state = (State)this.value$delegate;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 344 */     return (T)state.getValue(); } public void setValue$animation_core(Object <set-?>) { MutableState mutableState = this.value$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 345 */     mutableState.setValue(<set-?>); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final V getVelocityVector() {
/*     */     return this.velocityVector;
/*     */   }
/*     */   
/*     */   public final void setVelocityVector$animation_core(@NotNull AnimationVector <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.velocityVector = (V)<set-?>;
/*     */   }
/*     */   
/*     */   public final long getLastFrameTimeNanos() {
/*     */     return this.lastFrameTimeNanos;
/*     */   }
/*     */   
/*     */   public final void setLastFrameTimeNanos$animation_core(long <set-?>) {
/*     */     this.lastFrameTimeNanos = <set-?>;
/*     */   }
/*     */   
/*     */   public final long getFinishedTimeNanos() {
/*     */     return this.finishedTimeNanos;
/*     */   }
/*     */   
/*     */   public final void setFinishedTimeNanos$animation_core(long <set-?>) {
/*     */     this.finishedTimeNanos = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean isRunning() {
/*     */     return this.isRunning;
/*     */   }
/*     */   
/*     */   public final void setRunning$animation_core(boolean <set-?>) {
/*     */     this.isRunning = <set-?>;
/*     */   }
/*     */   
/*     */   public final T getVelocity() {
/*     */     return (T)this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "AnimationState(value=" + getValue() + ", velocity=" + getVelocity() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\AnimationState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */