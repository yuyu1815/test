/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.annotation.FloatRange;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.FloatCompanionObject;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\032&\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\b\b\003\020\003\032\0020\0042\b\b\003\020\005\032\0020\004\032I\020\006\032\002H\002\"\004\b\000\020\002\"\b\b\001\020\007*\0020\b*\b\022\004\022\002H\0020\0012\022\020\t\032\016\022\004\022\002H\002\022\004\022\002H\0070\n2\006\020\013\032\002H\0022\006\020\f\032\002H\002¢\006\002\020\r\032 \020\006\032\0020\004*\b\022\004\022\0020\0040\0012\006\020\013\032\0020\0042\006\020\f\032\0020\004\032\026\020\016\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\0020\017¨\006\020"}, d2 = {"exponentialDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "T", "frictionMultiplier", "", "absVelocityThreshold", "calculateTargetValue", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "initialVelocity", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "generateDecayAnimationSpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animation-core"})
/*     */ public final class DecayAnimationSpecKt
/*     */ {
/*     */   public static final <T, V extends AnimationVector> T calculateTargetValue(@NotNull DecayAnimationSpec $this$calculateTargetValue, @NotNull TwoWayConverter<T, V> typeConverter, Object initialValue, Object initialVelocity) {
/*  63 */     Intrinsics.checkNotNullParameter($this$calculateTargetValue, "<this>"); Intrinsics.checkNotNullParameter(typeConverter, "typeConverter"); VectorizedDecayAnimationSpec<AnimationVector> vectorizedSpec = $this$calculateTargetValue.vectorize(typeConverter);
/*  64 */     AnimationVector targetVector = vectorizedSpec.getTargetValue(
/*  65 */         (AnimationVector)typeConverter.getConvertToVector().invoke(initialValue), 
/*  66 */         (AnimationVector)typeConverter.getConvertToVector().invoke(initialVelocity));
/*     */     
/*  68 */     return (T)typeConverter.getConvertFromVector().invoke(targetVector);
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
/*     */   public static final float calculateTargetValue(@NotNull DecayAnimationSpec<Float> $this$calculateTargetValue, float initialValue, float initialVelocity) {
/*  81 */     Intrinsics.checkNotNullParameter($this$calculateTargetValue, "<this>"); VectorizedDecayAnimationSpec<AnimationVector1D> vectorizedSpec = $this$calculateTargetValue.vectorize(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE));
/*  82 */     AnimationVector1D targetVector = vectorizedSpec.getTargetValue(
/*  83 */         AnimationVectorsKt.AnimationVector(initialValue), 
/*  84 */         AnimationVectorsKt.AnimationVector(initialVelocity));
/*     */     
/*  86 */     return targetVector.getValue();
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
/*     */   public static final <T> DecayAnimationSpec<T> exponentialDecay(@FloatRange(from = 0.0D, fromInclusive = false) float frictionMultiplier, @FloatRange(from = 0.0D, fromInclusive = false) float absVelocityThreshold) {
/* 114 */     return generateDecayAnimationSpec(new FloatExponentialDecaySpec(frictionMultiplier, absVelocityThreshold));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <T> DecayAnimationSpec<T> generateDecayAnimationSpec(@NotNull FloatDecayAnimationSpec $this$generateDecayAnimationSpec) {
/* 121 */     Intrinsics.checkNotNullParameter($this$generateDecayAnimationSpec, "<this>"); return new DecayAnimationSpecImpl<>($this$generateDecayAnimationSpec);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\DecayAnimationSpecKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */