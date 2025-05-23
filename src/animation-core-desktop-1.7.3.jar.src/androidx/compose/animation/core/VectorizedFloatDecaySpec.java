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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\t\n\002\020\t\n\002\b\n\b\002\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003B\r\022\006\020\004\032\0020\005¢\006\002\020\006J\035\020\021\032\0020\0222\006\020\023\032\0028\0002\006\020\024\032\0028\000H\026¢\006\002\020\025J\035\020\026\032\0028\0002\006\020\023\032\0028\0002\006\020\024\032\0028\000H\026¢\006\002\020\027J%\020\030\032\0028\0002\006\020\031\032\0020\0222\006\020\023\032\0028\0002\006\020\024\032\0028\000H\026¢\006\002\020\032J%\020\033\032\0028\0002\006\020\031\032\0020\0222\006\020\023\032\0028\0002\006\020\024\032\0028\000H\026¢\006\002\020\032R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\020\020\r\032\0028\000X.¢\006\004\n\002\020\016R\020\020\017\032\0028\000X.¢\006\004\n\002\020\016R\020\020\020\032\0028\000X.¢\006\004\n\002\020\016¨\006\034"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatDecaySpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "floatDecaySpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;)V", "absVelocityThreshold", "", "getAbsVelocityThreshold", "()F", "getFloatDecaySpec", "()Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "targetVector", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector", "getDurationNanos", "", "initialValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getTargetValue", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "animation-core"})
/*     */ final class VectorizedFloatDecaySpec<V extends AnimationVector>
/*     */   implements VectorizedDecayAnimationSpec<V>
/*     */ {
/*     */   @NotNull
/*     */   private final FloatDecayAnimationSpec floatDecaySpec;
/*     */   private V valueVector;
/*     */   private V velocityVector;
/*     */   private V targetVector;
/*     */   private final float absVelocityThreshold;
/*     */   
/*     */   @NotNull
/*     */   public final FloatDecayAnimationSpec getFloatDecaySpec() {
/*     */     return this.floatDecaySpec;
/*     */   }
/*     */   
/*     */   public VectorizedFloatDecaySpec(@NotNull FloatDecayAnimationSpec floatDecaySpec) {
/* 133 */     this.floatDecaySpec = floatDecaySpec;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 138 */     this.absVelocityThreshold = this.floatDecaySpec.getAbsVelocityThreshold(); } public float getAbsVelocityThreshold() { return this.absVelocityThreshold; }
/*     */    @NotNull
/*     */   public V getValueFromNanos(long playTimeNanos, @NotNull AnimationVector initialValue, @NotNull AnimationVector initialVelocity) {
/* 141 */     Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); if (this.valueVector == null) {
/* 142 */       this.valueVector = AnimationVectorsKt.newInstance((V)initialValue);
/*     */     }
/* 144 */     int i = 0; if (this.valueVector == null) Intrinsics.throwUninitializedPropertyAccessException("valueVector");  for (int j = null.getSize$animation_core(); i < j; i++) {
/* 145 */       if (this.valueVector == null) Intrinsics.throwUninitializedPropertyAccessException("valueVector");  null.set$animation_core(i, this.floatDecaySpec.getValueFromNanos(
/* 146 */             playTimeNanos, 
/* 147 */             initialValue.get$animation_core(i), 
/* 148 */             initialVelocity.get$animation_core(i)));
/*     */     } 
/*     */     
/* 151 */     if (this.valueVector == null) Intrinsics.throwUninitializedPropertyAccessException("valueVector");  return null;
/*     */   }
/*     */   
/*     */   public long getDurationNanos(@NotNull AnimationVector initialValue, @NotNull AnimationVector initialVelocity) {
/* 155 */     Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); long maxDuration = 0L;
/* 156 */     if (this.velocityVector == null) {
/* 157 */       this.velocityVector = AnimationVectorsKt.newInstance((V)initialValue);
/*     */     }
/* 159 */     int i = 0; if (this.velocityVector == null) Intrinsics.throwUninitializedPropertyAccessException("velocityVector");  for (int j = null.getSize$animation_core(); i < j; i++) {
/* 160 */       maxDuration = 
/*     */         
/* 162 */         Math.max(maxDuration, this.floatDecaySpec.getDurationNanos(initialValue.get$animation_core(i), initialVelocity.get$animation_core(i)));
/*     */     }
/*     */     
/* 165 */     return maxDuration;
/*     */   }
/*     */   @NotNull
/*     */   public V getVelocityFromNanos(long playTimeNanos, @NotNull AnimationVector initialValue, @NotNull AnimationVector initialVelocity) {
/* 169 */     Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); if (this.velocityVector == null) {
/* 170 */       this.velocityVector = AnimationVectorsKt.newInstance((V)initialValue);
/*     */     }
/* 172 */     int i = 0; if (this.velocityVector == null) Intrinsics.throwUninitializedPropertyAccessException("velocityVector");  for (int j = null.getSize$animation_core(); i < j; i++) {
/* 173 */       if (this.velocityVector == null) Intrinsics.throwUninitializedPropertyAccessException("velocityVector");  null.set$animation_core(i, this.floatDecaySpec.getVelocityFromNanos(
/* 174 */             playTimeNanos, 
/* 175 */             initialValue.get$animation_core(i), 
/* 176 */             initialVelocity.get$animation_core(i)));
/*     */     } 
/*     */     
/* 179 */     if (this.velocityVector == null) Intrinsics.throwUninitializedPropertyAccessException("velocityVector");  return null;
/*     */   }
/*     */   @NotNull
/*     */   public V getTargetValue(@NotNull AnimationVector initialValue, @NotNull AnimationVector initialVelocity) {
/* 183 */     Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); if (this.targetVector == null) {
/* 184 */       this.targetVector = AnimationVectorsKt.newInstance((V)initialValue);
/*     */     }
/* 186 */     int i = 0; if (this.targetVector == null) Intrinsics.throwUninitializedPropertyAccessException("targetVector");  for (int j = null.getSize$animation_core(); i < j; i++) {
/* 187 */       if (this.targetVector == null) Intrinsics.throwUninitializedPropertyAccessException("targetVector");  null.set$animation_core(i, this.floatDecaySpec.getTargetValue(
/* 188 */             initialValue.get$animation_core(i), 
/* 189 */             initialVelocity.get$animation_core(i)));
/*     */     } 
/*     */     
/* 192 */     if (this.targetVector == null) Intrinsics.throwUninitializedPropertyAccessException("targetVector");  return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\VectorizedFloatDecaySpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */