/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.annotation.RestrictTo;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.FloatCompanionObject;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.math.MathKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000R\n\000\n\002\020\t\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\007\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\006\n\002\b\004\n\002\030\002\n\002\b\005\032,\020\b\032\016\022\004\022\0020\n\022\004\022\0020\0130\t2\006\020\f\032\0020\r2\006\020\016\032\0020\n2\b\b\002\020\017\032\0020\n\032a\020\020\032\016\022\004\022\002H\022\022\004\022\002H\0230\021\"\004\b\000\020\022\"\b\b\001\020\023*\0020\0242\f\020\f\032\b\022\004\022\002H\0220\0252\022\020\026\032\016\022\004\022\002H\022\022\004\022\002H\0230\0272\006\020\016\032\002H\0222\006\020\030\032\002H\0222\006\020\017\032\002H\022¢\006\002\020\031\032\020\020\032\032\0020\0332\006\020\034\032\0020\001H\000\032\020\020\035\032\0020\0012\006\020\036\032\0020\nH\000\032E\020\037\032\016\022\004\022\002H\023\022\004\022\002H\0230\021\"\b\b\000\020\023*\0020\024*\b\022\004\022\002H\0230 2\006\020\016\032\002H\0232\006\020\030\032\002H\0232\006\020\017\032\002H\023H\007¢\006\002\020!\0323\020\"\032\002H\022\"\004\b\000\020\022\"\b\b\001\020\023*\0020\024*\016\022\004\022\002H\022\022\004\022\002H\0230\0052\006\020#\032\0020\001¢\006\002\020$\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\" \020\004\032\0020\001*\n\022\002\b\003\022\002\b\0030\0058@X\004¢\006\006\032\004\b\006\020\007¨\006%"}, d2 = {"MillisToNanos", "", "SecondsToMillis", "SecondsToNanos", "durationMillis", "Landroidx/compose/animation/core/Animation;", "getDurationMillis", "(Landroidx/compose/animation/core/Animation;)J", "DecayAnimation", "Landroidx/compose/animation/core/DecayAnimation;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animationSpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "initialValue", "initialVelocity", "TargetBasedAnimation", "Landroidx/compose/animation/core/TargetBasedAnimation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/AnimationSpec;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "targetValue", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/animation/core/TargetBasedAnimation;", "convertNanosToSeconds", "", "nanos", "convertSecondsToNanos", "seconds", "createAnimation", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/TargetBasedAnimation;", "getVelocityFromNanos", "playTimeNanos", "(Landroidx/compose/animation/core/Animation;J)Ljava/lang/Object;", "animation-core"})
/*     */ public final class AnimationKt
/*     */ {
/*     */   public static final long MillisToNanos = 1000000L;
/*     */   public static final long SecondsToNanos = 1000000000L;
/*     */   public static final long SecondsToMillis = 1000L;
/*     */   
/*     */   public static final long getDurationMillis(@NotNull Animation $this$durationMillis) {
/*  93 */     Intrinsics.checkNotNullParameter($this$durationMillis, "<this>"); return $this$durationMillis.getDurationNanos() / 1000000L;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long convertSecondsToNanos(float seconds) {
/*  99 */     return MathKt.roundToLong(seconds * 1000000000L);
/*     */   }
/*     */   public static final double convertNanosToSeconds(long nanos) {
/* 102 */     return nanos / 1000000000L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final <T, V extends AnimationVector> T getVelocityFromNanos(@NotNull Animation<T, V> $this$getVelocityFromNanos, long playTimeNanos) {
/* 112 */     Intrinsics.checkNotNullParameter($this$getVelocityFromNanos, "<this>"); return (T)$this$getVelocityFromNanos.getTypeConverter().getConvertFromVector().invoke($this$getVelocityFromNanos.getVelocityVectorFromNanos(playTimeNanos));
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
/*     */   @RestrictTo({RestrictTo.Scope.LIBRARY})
/*     */   @NotNull
/*     */   public static final <V extends AnimationVector> TargetBasedAnimation<V, V> createAnimation(@NotNull VectorizedAnimationSpec<V> $this$createAnimation, @NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity)
/*     */   {
/* 133 */     Intrinsics.checkNotNullParameter($this$createAnimation, "<this>"); Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(targetValue, "targetValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); TwoWayConverter<?, AnimationVector> twoWayConverter = VectorConvertersKt.TwoWayConverter(AnimationKt$createAnimation$1.INSTANCE, AnimationKt$createAnimation$2.INSTANCE); return (TargetBasedAnimation)new TargetBasedAnimation<>($this$createAnimation, (TwoWayConverter)twoWayConverter, initialValue, targetValue, (V)initialVelocity); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\002\b\002\n\002\030\002\n\002\b\003\020\000\032\002H\001\"\b\b\000\020\001*\0020\0022\006\020\003\032\002H\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "V", "Landroidx/compose/animation/core/AnimationVector;", "it", "invoke", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;"}) static final class AnimationKt$createAnimation$1 extends Lambda implements Function1<V, V> { public static final AnimationKt$createAnimation$1 INSTANCE = new AnimationKt$createAnimation$1(); @NotNull public final V invoke(@NotNull AnimationVector it) { Intrinsics.checkNotNullParameter(it, "it"); return (V)it; } AnimationKt$createAnimation$1() { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\002\b\002\n\002\030\002\n\002\b\003\020\000\032\002H\001\"\b\b\000\020\001*\0020\0022\006\020\003\032\002H\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "V", "Landroidx/compose/animation/core/AnimationVector;", "it", "invoke", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;"}) static final class AnimationKt$createAnimation$2 extends Lambda implements Function1<V, V> { public static final AnimationKt$createAnimation$2 INSTANCE = new AnimationKt$createAnimation$2(); @NotNull public final V invoke(@NotNull AnimationVector it) { Intrinsics.checkNotNullParameter(it, "it"); return (V)it; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimationKt$createAnimation$2() {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public static final <T, V extends AnimationVector> TargetBasedAnimation<T, V> TargetBasedAnimation(@NotNull AnimationSpec<T> animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, Object initialValue, Object targetValue, Object initialVelocity) {
/* 163 */     Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(typeConverter, "typeConverter"); return new TargetBasedAnimation<>(
/* 164 */         animationSpec, 
/* 165 */         typeConverter, 
/* 166 */         (T)initialValue, 
/* 167 */         (T)targetValue, 
/* 168 */         (V)typeConverter.getConvertToVector().invoke(initialVelocity));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public static final DecayAnimation<Float, AnimationVector1D> DecayAnimation(@NotNull FloatDecayAnimationSpec animationSpec, float initialValue, float initialVelocity) {
/* 493 */     Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); return new DecayAnimation<>(
/* 494 */         DecayAnimationSpecKt.generateDecayAnimationSpec(animationSpec), 
/* 495 */         VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), 
/* 496 */         Float.valueOf(initialValue), 
/* 497 */         AnimationVectorsKt.AnimationVector(initialVelocity));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\AnimationKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */