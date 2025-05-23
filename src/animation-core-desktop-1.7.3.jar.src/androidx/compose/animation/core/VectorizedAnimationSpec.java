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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\002\n\002\020\t\n\002\b\013\bf\030\000*\b\b\000\020\001*\0020\0022\0020\003J%\020\007\032\0020\b2\006\020\t\032\0028\0002\006\020\n\032\0028\0002\006\020\013\032\0028\000H&¢\006\002\020\fJ%\020\r\032\0028\0002\006\020\t\032\0028\0002\006\020\n\032\0028\0002\006\020\013\032\0028\000H\026¢\006\002\020\016J-\020\017\032\0028\0002\006\020\020\032\0020\b2\006\020\t\032\0028\0002\006\020\n\032\0028\0002\006\020\013\032\0028\000H&¢\006\002\020\021J-\020\022\032\0028\0002\006\020\020\032\0020\b2\006\020\t\032\0028\0002\006\020\n\032\0028\0002\006\020\013\032\0028\000H&¢\006\002\020\021R\022\020\004\032\0020\005X¦\004¢\006\006\032\004\b\004\020\006ø\001\000\002\006\n\004\b!0\001¨\006\023À\006\003"}, d2 = {"Landroidx/compose/animation/core/VectorizedAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "isInfinite", "", "()Z", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "animation-core"})
/*     */ public interface VectorizedAnimationSpec<V extends AnimationVector>
/*     */ {
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls
/*     */   {
/*     */     @Deprecated
/*     */     @NotNull
/*     */     public static <V extends AnimationVector> V getEndVelocity(@NotNull VectorizedAnimationSpec $this, @NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
/* 116 */       Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(targetValue, "targetValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); return $this.getEndVelocity((V)initialValue, (V)targetValue, (V)initialVelocity);
/*     */     } }
/*     */   @NotNull
/*     */   default V getEndVelocity(@NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
/* 120 */     Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(targetValue, "targetValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); return getVelocityFromNanos(
/* 121 */         getDurationNanos((V)initialValue, (V)targetValue, (V)initialVelocity), 
/* 122 */         (V)initialValue, 
/* 123 */         (V)targetValue, 
/* 124 */         (V)initialVelocity);
/*     */   }
/*     */   
/*     */   long getDurationNanos(@NotNull V paramV1, @NotNull V paramV2, @NotNull V paramV3);
/*     */   
/*     */   @NotNull
/*     */   V getVelocityFromNanos(long paramLong, @NotNull V paramV1, @NotNull V paramV2, @NotNull V paramV3);
/*     */   
/*     */   @NotNull
/*     */   V getValueFromNanos(long paramLong, @NotNull V paramV1, @NotNull V paramV2, @NotNull V paramV3);
/*     */   
/*     */   boolean isInfinite();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\VectorizedAnimationSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */