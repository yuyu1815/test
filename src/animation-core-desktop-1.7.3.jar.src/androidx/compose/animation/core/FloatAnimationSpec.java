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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\020\007\n\000\n\002\020\t\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\0002\b\022\004\022\0020\0020\001J \020\003\032\0020\0042\006\020\005\032\0020\0022\006\020\006\032\0020\0022\006\020\007\032\0020\002H&J \020\b\032\0020\0022\006\020\005\032\0020\0022\006\020\006\032\0020\0022\006\020\007\032\0020\002H\026J(\020\t\032\0020\0022\006\020\n\032\0020\0042\006\020\005\032\0020\0022\006\020\006\032\0020\0022\006\020\007\032\0020\002H&J(\020\013\032\0020\0022\006\020\n\032\0020\0042\006\020\005\032\0020\0022\006\020\006\032\0020\0022\006\020\007\032\0020\002H&J,\020\f\032\b\022\004\022\002H\0160\r\"\b\b\000\020\016*\0020\0172\022\020\020\032\016\022\004\022\0020\002\022\004\022\002H\0160\021H\026ø\001\000\002\006\n\004\b!0\001¨\006\022À\006\003"}, d2 = {"Landroidx/compose/animation/core/FloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "getEndVelocity", "getValueFromNanos", "playTimeNanos", "getVelocityFromNanos", "vectorize", "Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core"})
/*     */ public interface FloatAnimationSpec
/*     */   extends AnimationSpec<Float>
/*     */ {
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls
/*     */   {
/*     */     @Deprecated
/*     */     public static float getEndVelocity(@NotNull FloatAnimationSpec $this, float initialValue, float targetValue, float initialVelocity) {
/*  81 */       return $this.getEndVelocity(initialValue, targetValue, initialVelocity);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */     @NotNull
/*     */     public static <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(@NotNull FloatAnimationSpec $this, @NotNull TwoWayConverter converter) {
/* 117 */       Intrinsics.checkNotNullParameter(converter, "converter"); return $this.vectorize(converter); } } @NotNull
/* 118 */   default <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(@NotNull TwoWayConverter converter) { Intrinsics.checkNotNullParameter(converter, "converter"); return new VectorizedFloatAnimationSpec<>(this); }
/*     */ 
/*     */   
/*     */   default float getEndVelocity(float initialValue, float targetValue, float initialVelocity) {
/*     */     return getVelocityFromNanos(getDurationNanos(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
/*     */   }
/*     */   
/*     */   float getValueFromNanos(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3);
/*     */   
/*     */   float getVelocityFromNanos(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3);
/*     */   
/*     */   long getDurationNanos(float paramFloat1, float paramFloat2, float paramFloat3);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\FloatAnimationSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */