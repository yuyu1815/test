/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\007\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B'\b\027\022\006\020\003\032\0020\004\022\f\020\005\032\b\022\004\022\0028\0000\006\022\b\b\002\020\007\032\0020\b¢\006\002\020\tB/\022\006\020\003\032\0020\004\022\f\020\005\032\b\022\004\022\0028\0000\006\022\b\b\002\020\007\032\0020\b\022\b\b\002\020\n\032\0020\013¢\006\002\020\fJ\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\031H\002J\b\020\032\032\0020\004H\026J,\020\033\032\b\022\004\022\002H\0350\034\"\b\b\001\020\035*\0020\0362\022\020\037\032\016\022\004\022\0028\000\022\004\022\002H\0350 H\026R\027\020\005\032\b\022\004\022\0028\0000\006¢\006\b\n\000\032\004\b\r\020\016R\031\020\n\032\0020\013ø\001\000ø\001\001¢\006\n\n\002\020\021\032\004\b\017\020\020R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\022\020\023R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\024\020\025\002\013\n\005\b¡\0360\001\n\002\b!¨\006!"}, d2 = {"Landroidx/compose/animation/core/RepeatableSpec;", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "iterations", "", "animation", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "initialStartOffset", "Landroidx/compose/animation/core/StartOffset;", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnimation", "()Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "getInitialStartOffset-Rmkjzm4", "()J", "J", "getIterations", "()I", "getRepeatMode", "()Landroidx/compose/animation/core/RepeatMode;", "equals", "", "other", "", "hashCode", "vectorize", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core"})
/*     */ @Immutable
/*     */ public final class RepeatableSpec<T>
/*     */   implements FiniteAnimationSpec<T>
/*     */ {
/*     */   private final int iterations;
/*     */   @NotNull
/*     */   private final DurationBasedAnimationSpec<T> animation;
/*     */   @NotNull
/*     */   private final RepeatMode repeatMode;
/*     */   private final long initialStartOffset;
/*     */   public static final int $stable;
/*     */   
/*     */   private RepeatableSpec(int iterations, DurationBasedAnimationSpec<T> animation, RepeatMode repeatMode, long initialStartOffset) {
/* 334 */     this.iterations = iterations;
/* 335 */     this.animation = animation;
/* 336 */     this.repeatMode = repeatMode;
/* 337 */     this.initialStartOffset = initialStartOffset; } public final long getInitialStartOffset-Rmkjzm4() { return this.initialStartOffset; }
/*     */   
/*     */   public final int getIterations() {
/*     */     return this.iterations;
/*     */   }
/*     */   @NotNull
/*     */   public final DurationBasedAnimationSpec<T> getAnimation() {
/*     */     return this.animation;
/*     */   }
/*     */   @NotNull
/*     */   public final RepeatMode getRepeatMode() {
/*     */     return this.repeatMode;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public <V extends AnimationVector> VectorizedFiniteAnimationSpec<V> vectorize(@NotNull TwoWayConverter<T, AnimationVector> converter) {
/* 353 */     Intrinsics.checkNotNullParameter(converter, "converter"); return new VectorizedRepeatableSpec<>(
/* 354 */         this.iterations, this.animation.vectorize(converter), this.repeatMode, this.initialStartOffset, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 359 */     return (other instanceof RepeatableSpec) ? (
/* 360 */       (((RepeatableSpec)other).iterations == this.iterations && 
/* 361 */       Intrinsics.areEqual(((RepeatableSpec)other).animation, this.animation) && 
/* 362 */       ((RepeatableSpec)other).repeatMode == this.repeatMode && 
/* 363 */       StartOffset.equals-impl0(((RepeatableSpec)other).initialStartOffset, this.initialStartOffset))) : false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 369 */     return ((this.iterations * 31 + this.animation.hashCode()) * 31 + this.repeatMode.hashCode()) * 31 + 
/* 370 */       StartOffset.hashCode-impl(this.initialStartOffset);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\RepeatableSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */