/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ranges.RangesKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\t\n\002\b\013\n\002\020\013\n\002\b\013\b\007\030\000*\004\b\000\020\001*\b\b\001\020\002*\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004B9\b\026\022\f\020\005\032\b\022\004\022\0028\0000\006\022\022\020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\b\022\006\020\t\032\0028\000\022\006\020\n\032\0028\001¢\006\002\020\013B9\b\026\022\f\020\005\032\b\022\004\022\0028\0000\006\022\022\020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\b\022\006\020\t\032\0028\000\022\006\020\f\032\0028\000¢\006\002\020\rB7\022\f\020\005\032\b\022\004\022\0028\0010\016\022\022\020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\b\022\006\020\t\032\0028\000\022\006\020\n\032\0028\001¢\006\002\020\017J\025\020#\032\0028\0002\006\020$\032\0020\021H\026¢\006\002\020%J\025\020&\032\0028\0012\006\020$\032\0020\021H\026¢\006\002\020'R\024\020\005\032\b\022\004\022\0028\0010\016X\004¢\006\002\n\000R\026\020\020\032\0020\0218VX\004¢\006\b\n\000\032\004\b\022\020\023R\020\020\024\032\0028\001X\004¢\006\004\n\002\020\025R\023\020\t\032\0028\000¢\006\n\n\002\020\030\032\004\b\026\020\027R\020\020\031\032\0028\001X\004¢\006\004\n\002\020\025R\023\020\n\032\0028\001¢\006\n\n\002\020\025\032\004\b\032\020\033R\024\020\034\032\0020\035XD¢\006\b\n\000\032\004\b\034\020\036R\026\020\037\032\0028\000X\004¢\006\n\n\002\020\030\032\004\b \020\027R \020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\bX\004¢\006\b\n\000\032\004\b!\020\"¨\006("}, d2 = {"Landroidx/compose/animation/core/DecayAnimation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/Animation;", "animationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "initialVelocityVector", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "initialVelocity", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;)V", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "(Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "durationNanos", "", "getDurationNanos", "()J", "endVelocity", "Landroidx/compose/animation/core/AnimationVector;", "getInitialValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "initialValueVector", "getInitialVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "isInfinite", "", "()Z", "targetValue", "getTargetValue", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "getValueFromNanos", "playTimeNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "animation-core"})
/*     */ @StabilityInferred(parameters = 3)
/*     */ public final class DecayAnimation<T, V extends AnimationVector>
/*     */   implements Animation<T, V>
/*     */ {
/*     */   @NotNull
/*     */   private final VectorizedDecayAnimationSpec<V> animationSpec;
/*     */   @NotNull
/*     */   private final TwoWayConverter<T, V> typeConverter;
/*     */   private final T initialValue;
/*     */   @NotNull
/*     */   private final V initialValueVector;
/*     */   @NotNull
/*     */   private final V initialVelocityVector;
/*     */   @NotNull
/*     */   private final V endVelocity;
/*     */   private final T targetValue;
/*     */   private final long durationNanos;
/*     */   private final boolean isInfinite;
/*     */   public static final int $stable;
/*     */   
/*     */   public DecayAnimation(@NotNull VectorizedDecayAnimationSpec<V> animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, Object initialValue, @NotNull AnimationVector initialVelocityVector) {
/* 350 */     this.animationSpec = animationSpec;
/* 351 */     this.typeConverter = typeConverter;
/* 352 */     this.initialValue = (T)initialValue;
/*     */ 
/*     */     
/* 355 */     this.initialValueVector = (V)getTypeConverter().getConvertToVector().invoke(this.initialValue);
/* 356 */     this.initialVelocityVector = AnimationVectorsKt.copy((V)initialVelocityVector);
/*     */ 
/*     */     
/* 359 */     this.targetValue = (T)getTypeConverter().getConvertFromVector().invoke(
/* 360 */         this.animationSpec.getTargetValue(this.initialValueVector, (V)initialVelocityVector));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 431 */     this.durationNanos = this.animationSpec.getDurationNanos(
/* 432 */         this.initialValueVector, (V)initialVelocityVector);
/*     */     
/* 434 */     this.endVelocity = 
/*     */ 
/*     */ 
/*     */       
/* 438 */       AnimationVectorsKt.copy(this.animationSpec.getVelocityFromNanos(getDurationNanos(), this.initialValueVector, (V)initialVelocityVector));
/* 439 */     for (int i = 0, j = this.endVelocity.getSize$animation_core(); i < j; i++)
/* 440 */       this.endVelocity.set$animation_core(i, RangesKt.coerceIn(this.endVelocity.get$animation_core(i), 
/* 441 */             -this.animationSpec.getAbsVelocityThreshold(), 
/* 442 */             this.animationSpec.getAbsVelocityThreshold())); 
/*     */   }
/*     */   @NotNull
/*     */   public TwoWayConverter<T, V> getTypeConverter() { return this.typeConverter; }
/*     */   public final T getInitialValue() { return this.initialValue; }
/*     */   @NotNull
/* 448 */   public final V getInitialVelocityVector() { return this.initialVelocityVector; } public T getTargetValue() { return this.targetValue; } public T getValueFromNanos(long playTimeNanos) { if (!isFinishedFromNanos(playTimeNanos)) {
/* 449 */       return (T)getTypeConverter().getConvertFromVector().invoke(
/* 450 */           this.animationSpec.getValueFromNanos(
/* 451 */             playTimeNanos, 
/* 452 */             this.initialValueVector, 
/* 453 */             this.initialVelocityVector));
/*     */     }
/*     */ 
/*     */     
/* 457 */     return getTargetValue(); }
/*     */   public long getDurationNanos() { return this.durationNanos; }
/*     */   public boolean isInfinite() { return this.isInfinite; }
/*     */   public DecayAnimation(@NotNull DecayAnimationSpec animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, Object initialValue, @NotNull AnimationVector initialVelocityVector) { this(animationSpec.vectorize(typeConverter), typeConverter, (T)initialValue, (V)initialVelocityVector); }
/*     */   public DecayAnimation(@NotNull DecayAnimationSpec animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, Object initialValue, Object initialVelocity) { this(animationSpec.vectorize(typeConverter), typeConverter, (T)initialValue, (V)typeConverter.getConvertToVector().invoke(initialVelocity)); } @NotNull
/* 462 */   public V getVelocityVectorFromNanos(long playTimeNanos) { if (!isFinishedFromNanos(playTimeNanos)) {
/* 463 */       return this.animationSpec.getVelocityFromNanos(
/* 464 */           playTimeNanos, 
/* 465 */           this.initialValueVector, 
/* 466 */           this.initialVelocityVector);
/*     */     }
/*     */     
/* 469 */     return this.endVelocity; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\DecayAnimation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */