/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.FloatCompanionObject;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\020\013\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\t\n\002\b\003\n\002\020\007\n\002\030\002\n\002\b\b\032i\020\004\032\016\022\004\022\002H\005\022\004\022\002H\0060\002\"\004\b\000\020\005\"\b\b\001\020\006*\0020\0072\022\020\b\032\016\022\004\022\002H\005\022\004\022\002H\0060\t2\006\020\n\032\002H\0052\006\020\013\032\002H\0052\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\r2\b\b\002\020\017\032\0020\001¢\006\002\020\020\032B\020\004\032\016\022\004\022\0020\021\022\004\022\0020\0220\0022\006\020\n\032\0020\0212\b\b\002\020\013\032\0020\0212\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\r2\b\b\002\020\017\032\0020\001\032k\020\023\032\016\022\004\022\002H\005\022\004\022\002H\0060\002\"\004\b\000\020\005\"\b\b\001\020\006*\0020\007*\016\022\004\022\002H\005\022\004\022\002H\0060\0022\b\b\002\020\024\032\002H\0052\n\b\002\020\025\032\004\030\001H\0062\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\r2\b\b\002\020\017\032\0020\001¢\006\002\020\026\032T\020\023\032\016\022\004\022\0020\021\022\004\022\0020\0220\002*\016\022\004\022\0020\021\022\004\022\0020\0220\0022\b\b\002\020\024\032\0020\0212\b\b\002\020\027\032\0020\0212\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\r2\b\b\002\020\017\032\0020\001\0323\020\030\032\002H\006\"\004\b\000\020\005\"\b\b\001\020\006*\0020\007*\016\022\004\022\002H\005\022\004\022\002H\0060\t2\006\020\024\032\002H\005¢\006\002\020\031\"\035\020\000\032\0020\001*\n\022\002\b\003\022\002\b\0030\0028F¢\006\006\032\004\b\000\020\003¨\006\032"}, d2 = {"isFinished", "", "Landroidx/compose/animation/core/AnimationState;", "(Landroidx/compose/animation/core/AnimationState;)Z", "AnimationState", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "initialVelocity", "lastFrameTimeNanos", "", "finishedTimeNanos", "isRunning", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;JJZ)Landroidx/compose/animation/core/AnimationState;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "copy", "value", "velocityVector", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)Landroidx/compose/animation/core/AnimationState;", "velocity", "createZeroVectorFrom", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "animation-core"})
/*     */ @SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
/*     */ public final class AnimationStateKt
/*     */ {
/*     */   public static final boolean isFinished(@NotNull AnimationState $this$isFinished) {
/* 115 */     Intrinsics.checkNotNullParameter($this$isFinished, "<this>"); return ($this$isFinished.getFinishedTimeNanos() != Long.MIN_VALUE);
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
/*     */   @NotNull
/*     */   public static final <T, V extends AnimationVector> AnimationState<T, V> copy(@NotNull AnimationState<T, V> $this$copy, Object value, @Nullable AnimationVector velocityVector, long lastFrameTimeNanos, long finishedTimeNanos, boolean isRunning) {
/* 234 */     Intrinsics.checkNotNullParameter($this$copy, "<this>"); return new AnimationState<>(
/* 235 */         $this$copy.getTypeConverter(), (T)value, (V)velocityVector, lastFrameTimeNanos, finishedTimeNanos, isRunning);
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
/*     */   public static final AnimationState<Float, AnimationVector1D> copy(@NotNull AnimationState<Float, AnimationVector1D> $this$copy, float value, float velocity, long lastFrameTimeNanos, long finishedTimeNanos, boolean isRunning) {
/* 263 */     Intrinsics.checkNotNullParameter($this$copy, "<this>"); return new AnimationState<>(
/* 264 */         $this$copy.getTypeConverter(), 
/* 265 */         Float.valueOf(value), 
/* 266 */         AnimationVectorsKt.AnimationVector(velocity), 
/* 267 */         lastFrameTimeNanos, 
/* 268 */         finishedTimeNanos, 
/* 269 */         isRunning);
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
/*     */   @NotNull
/*     */   public static final AnimationState<Float, AnimationVector1D> AnimationState(float initialValue, float initialVelocity, long lastFrameTimeNanos, long finishedTimeNanos, boolean isRunning) {
/* 293 */     return new AnimationState<>(
/* 294 */         VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), 
/* 295 */         Float.valueOf(initialValue), 
/* 296 */         AnimationVectorsKt.AnimationVector(initialVelocity), 
/* 297 */         lastFrameTimeNanos, 
/* 298 */         finishedTimeNanos, 
/* 299 */         isRunning);
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
/*     */   @NotNull
/*     */   public static final <T, V extends AnimationVector> AnimationState<T, V> AnimationState(@NotNull TwoWayConverter<T, V> typeConverter, Object initialValue, Object initialVelocity, long lastFrameTimeNanos, long finishedTimeNanos, boolean isRunning) {
/* 325 */     Intrinsics.checkNotNullParameter(typeConverter, "typeConverter"); return new AnimationState<>(
/* 326 */         typeConverter, 
/* 327 */         (T)initialValue, 
/* 328 */         (V)typeConverter.getConvertToVector().invoke(initialVelocity), 
/* 329 */         lastFrameTimeNanos, 
/* 330 */         finishedTimeNanos, 
/* 331 */         isRunning);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <T, V extends AnimationVector> V createZeroVectorFrom(@NotNull TwoWayConverter<T, V> $this$createZeroVectorFrom, Object value) {
/* 342 */     Intrinsics.checkNotNullParameter($this$createZeroVectorFrom, "<this>"); Object object = $this$createZeroVectorFrom.getConvertToVector().invoke(value); AnimationVector it = (AnimationVector)object;
/*     */     
/* 344 */     int $i$a$-also-AnimationStateKt$createZeroVectorFrom$1 = 0;
/*     */     it.reset$animation_core();
/*     */     return (V)object;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\AnimationStateKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */