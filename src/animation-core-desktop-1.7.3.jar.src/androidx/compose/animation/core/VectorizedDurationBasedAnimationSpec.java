/*     */ package androidx.compose.animation.core;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\t\n\002\b\005\bf\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003J%\020\n\032\0020\0132\006\020\f\032\0028\0002\006\020\r\032\0028\0002\006\020\016\032\0028\000H\026¢\006\002\020\017R\022\020\004\032\0020\005X¦\004¢\006\006\032\004\b\006\020\007R\022\020\b\032\0020\005X¦\004¢\006\006\032\004\b\t\020\007ø\001\000\002\006\n\004\b!0\001¨\006\020À\006\003"}, d2 = {"Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "delayMillis", "", "getDelayMillis", "()I", "durationMillis", "getDurationMillis", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "animation-core"})
/*     */ public interface VectorizedDurationBasedAnimationSpec<V extends AnimationVector>
/*     */   extends VectorizedFiniteAnimationSpec<V>
/*     */ {
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls
/*     */   {
/*     */     @Deprecated
/*     */     @NotNull
/*     */     public static <V extends AnimationVector> V getEndVelocity(@NotNull VectorizedDurationBasedAnimationSpec $this, @NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
/* 176 */       Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(targetValue, "targetValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); return $this.getEndVelocity((V)initialValue, (V)targetValue, (V)initialVelocity); } @Deprecated public static <V extends AnimationVector> boolean isInfinite(@NotNull VectorizedDurationBasedAnimationSpec $this) { return $this.isInfinite(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     public static <V extends AnimationVector> long getDurationNanos(@NotNull VectorizedDurationBasedAnimationSpec $this, @NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
/* 189 */       Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(targetValue, "targetValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); return $this.getDurationNanos((V)initialValue, (V)targetValue, (V)initialVelocity); } } default long getDurationNanos(@NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
/* 190 */     Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(targetValue, "targetValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); return (getDelayMillis() + getDurationMillis()) * 1000000L;
/*     */   }
/*     */   
/*     */   int getDelayMillis();
/*     */   
/*     */   int getDurationMillis();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\VectorizedDurationBasedAnimationSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */