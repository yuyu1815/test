/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\t\n\002\b\004\n\002\020\013\n\002\b\020\b\007\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003B\037\b\027\022\f\020\004\032\b\022\004\022\0028\0000\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bB'\022\f\020\004\032\b\022\004\022\0028\0000\005\022\b\b\002\020\006\032\0020\007\022\b\b\002\020\t\032\0020\n¢\006\002\020\013J%\020\024\032\0020\r2\006\020\025\032\0028\0002\006\020\026\032\0028\0002\006\020\027\032\0028\000H\026¢\006\002\020\030J-\020\031\032\0028\0002\006\020\032\032\0020\r2\006\020\025\032\0028\0002\006\020\026\032\0028\0002\006\020\027\032\0028\000H\026¢\006\002\020\033J-\020\034\032\0028\0002\006\020\032\032\0020\r2\006\020\025\032\0028\0002\006\020\026\032\0028\0002\006\020\027\032\0028\000H\026¢\006\002\020\033J\020\020\035\032\0020\r2\006\020\032\032\0020\rH\002J-\020\036\032\0028\0002\006\020\032\032\0020\r2\006\020\037\032\0028\0002\006\020 \032\0028\0002\006\020!\032\0028\000H\002¢\006\002\020\033R\024\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\002\n\000R\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017R\016\020\020\032\0020\rX\004¢\006\002\n\000R\024\020\021\032\0020\0228VX\004¢\006\006\032\004\b\021\020\023R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\""}, d2 = {"Landroidx/compose/animation/core/VectorizedInfiniteRepeatableSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animation", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "initialStartOffset", "Landroidx/compose/animation/core/StartOffset;", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "durationNanos", "", "getDurationNanos$animation_core", "()J", "initialOffsetNanos", "isInfinite", "", "()Z", "getDurationNanos", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "repetitionPlayTimeNanos", "repetitionStartVelocity", "start", "startVelocity", "end", "animation-core"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector>
/*     */   implements VectorizedAnimationSpec<V>
/*     */ {
/*     */   @NotNull
/*     */   private final VectorizedDurationBasedAnimationSpec<V> animation;
/*     */   @NotNull
/*     */   private final RepeatMode repeatMode;
/*     */   
/*     */   private VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec<V> animation, RepeatMode repeatMode, long initialStartOffset) {
/* 633 */     this.animation = animation;
/* 634 */     this.repeatMode = repeatMode;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 653 */     this.durationNanos = (this.animation.getDelayMillis() + this.animation.getDurationMillis()) * 1000000L;
/*     */     
/* 655 */     this.initialOffsetNanos = initialStartOffset * 1000000L;
/*     */   } private final long durationNanos; private final long initialOffsetNanos; public static final int $stable = 8;
/*     */   private final long repetitionPlayTimeNanos(long playTimeNanos) {
/* 658 */     if (playTimeNanos + this.initialOffsetNanos <= 0L) {
/* 659 */       return 0L;
/*     */     }
/* 661 */     long postOffsetPlayTimeNanos = playTimeNanos + this.initialOffsetNanos;
/* 662 */     long repeatsCount = postOffsetPlayTimeNanos / this.durationNanos;
/* 663 */     if (this.repeatMode == RepeatMode.Restart || repeatsCount % 2L == 0L) {
/* 664 */       return postOffsetPlayTimeNanos - repeatsCount * this.durationNanos;
/*     */     }
/* 666 */     return (repeatsCount + 1L) * this.durationNanos - postOffsetPlayTimeNanos;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isInfinite() {
/*     */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private final V repetitionStartVelocity(long playTimeNanos, AnimationVector start, AnimationVector startVelocity, AnimationVector end) {
/* 676 */     return (playTimeNanos + this.initialOffsetNanos > this.durationNanos) ? 
/*     */ 
/*     */       
/* 679 */       this.animation.getVelocityFromNanos(
/* 680 */         this.durationNanos - this.initialOffsetNanos, 
/* 681 */         (V)start, 
/* 682 */         (V)end, 
/* 683 */         (V)startVelocity) : 
/*     */ 
/*     */       
/* 686 */       (V)startVelocity;
/*     */   }
/*     */   
/*     */   public final long getDurationNanos$animation_core() {
/*     */     return this.durationNanos;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public V getValueFromNanos(long playTimeNanos, @NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
/* 695 */     Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(targetValue, "targetValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); return this.animation.getValueFromNanos(
/* 696 */         repetitionPlayTimeNanos(playTimeNanos), 
/* 697 */         (V)initialValue, 
/* 698 */         (V)targetValue, 
/* 699 */         repetitionStartVelocity(playTimeNanos, (V)initialValue, (V)initialVelocity, (V)targetValue));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public V getVelocityFromNanos(long playTimeNanos, @NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
/* 709 */     Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(targetValue, "targetValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); return this.animation.getVelocityFromNanos(
/* 710 */         repetitionPlayTimeNanos(playTimeNanos), 
/* 711 */         (V)initialValue, 
/* 712 */         (V)targetValue, 
/* 713 */         repetitionStartVelocity(playTimeNanos, (V)initialValue, (V)initialVelocity, (V)targetValue));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long getDurationNanos(@NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
/* 719 */     Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(targetValue, "targetValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); return Long.MAX_VALUE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\VectorizedInfiniteRepeatableSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */