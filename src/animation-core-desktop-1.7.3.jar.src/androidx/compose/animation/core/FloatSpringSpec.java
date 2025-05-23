/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\006\n\002\030\002\n\002\b\002\n\002\020\t\n\002\b\b\b\007\030\0002\0020\001B#\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\003¢\006\002\020\006J \020\f\032\0020\r2\006\020\016\032\0020\0032\006\020\017\032\0020\0032\006\020\020\032\0020\003H\026J \020\021\032\0020\0032\006\020\016\032\0020\0032\006\020\017\032\0020\0032\006\020\020\032\0020\003H\026J(\020\022\032\0020\0032\006\020\023\032\0020\r2\006\020\016\032\0020\0032\006\020\017\032\0020\0032\006\020\020\032\0020\003H\026J(\020\024\032\0020\0032\006\020\023\032\0020\r2\006\020\016\032\0020\0032\006\020\017\032\0020\0032\006\020\020\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\016\020\t\032\0020\nX\004¢\006\002\n\000R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\013\020\bR\016\020\005\032\0020\003X\004¢\006\002\n\000¨\006\025"}, d2 = {"Landroidx/compose/animation/core/FloatSpringSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "dampingRatio", "", "stiffness", "visibilityThreshold", "(FFF)V", "getDampingRatio", "()F", "spring", "Landroidx/compose/animation/core/SpringSimulation;", "getStiffness", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "getEndVelocity", "getValueFromNanos", "playTimeNanos", "getVelocityFromNanos", "animation-core"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class FloatSpringSpec
/*     */   implements FloatAnimationSpec
/*     */ {
/*     */   private final float dampingRatio;
/*     */   private final float stiffness;
/*     */   private final float visibilityThreshold;
/*     */   @NotNull
/*     */   private final SpringSimulation spring;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public FloatSpringSpec(float dampingRatio, float stiffness, float visibilityThreshold) {
/* 133 */     this.dampingRatio = dampingRatio;
/* 134 */     this.stiffness = stiffness;
/* 135 */     this.visibilityThreshold = visibilityThreshold;
/*     */ 
/*     */     
/* 138 */     SpringSimulation springSimulation1 = new SpringSimulation(1.0F), springSimulation2 = springSimulation1; FloatSpringSpec floatSpringSpec = this; int $i$a$-also-FloatSpringSpec$spring$1 = 0;
/* 139 */     springSimulation2.setDampingRatio(this.dampingRatio);
/* 140 */     springSimulation2.setStiffness(this.stiffness);
/* 141 */     floatSpringSpec.spring = springSimulation1;
/*     */   }
/*     */ 
/*     */   
/*     */   public final float getDampingRatio() {
/*     */     return this.dampingRatio;
/*     */   }
/*     */   
/*     */   public float getValueFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
/* 150 */     long playTimeMillis = playTimeNanos / 1000000L;
/* 151 */     this.spring.setFinalPosition(targetValue);
/* 152 */     float value = Motion.getValue-impl(this.spring.updateValues-IJZedt4$animation_core(initialValue, initialVelocity, playTimeMillis));
/* 153 */     return value;
/*     */   }
/*     */ 
/*     */   
/*     */   public final float getStiffness() {
/*     */     return this.stiffness;
/*     */   }
/*     */ 
/*     */   
/*     */   public float getVelocityFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
/* 163 */     long playTimeMillis = playTimeNanos / 1000000L;
/* 164 */     this.spring.setFinalPosition(targetValue);
/* 165 */     float velocity = Motion.getVelocity-impl(this.spring.updateValues-IJZedt4$animation_core(initialValue, initialVelocity, playTimeMillis));
/* 166 */     return velocity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getEndVelocity(float initialValue, float targetValue, float initialVelocity) {
/* 173 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getDurationNanos(float initialValue, float targetValue, float initialVelocity) {
/* 182 */     float f1 = this.spring.getStiffness();
/* 183 */     float f2 = this.spring.getDampingRatio();
/* 184 */     float f3 = (initialValue - targetValue) / this.visibilityThreshold;
/* 185 */     float f4 = initialVelocity / this.visibilityThreshold; return SpringEstimationKt.estimateAnimationDurationMillis(f1, f2, f4, f3, 
/* 186 */         1.0F) * 
/* 187 */       1000000L;
/*     */   }
/*     */   
/*     */   public FloatSpringSpec() {
/*     */     this(0.0F, 0.0F, 0.0F, 7, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\FloatSpringSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */