/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.annotation.FloatRange;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\006\n\002\020\t\n\002\b\007\b\007\030\0002\0020\001B\031\022\b\b\003\020\002\032\0020\003\022\b\b\003\020\004\032\0020\003¢\006\002\020\005J\030\020\t\032\0020\n2\006\020\013\032\0020\0032\006\020\f\032\0020\003H\026J\030\020\r\032\0020\0032\006\020\013\032\0020\0032\006\020\f\032\0020\003H\026J \020\016\032\0020\0032\006\020\017\032\0020\n2\006\020\013\032\0020\0032\006\020\f\032\0020\003H\026J \020\020\032\0020\0032\006\020\017\032\0020\n2\006\020\013\032\0020\0032\006\020\f\032\0020\003H\026R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007R\016\020\b\032\0020\003X\004¢\006\002\n\000¨\006\021"}, d2 = {"Landroidx/compose/animation/core/FloatExponentialDecaySpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "frictionMultiplier", "", "absVelocityThreshold", "(FF)V", "getAbsVelocityThreshold", "()F", "friction", "getDurationNanos", "", "initialValue", "initialVelocity", "getTargetValue", "getValueFromNanos", "playTimeNanos", "getVelocityFromNanos", "animation-core"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class FloatExponentialDecaySpec
/*     */   implements FloatDecayAnimationSpec
/*     */ {
/*     */   private final float absVelocityThreshold;
/*     */   private final float friction;
/*     */   public static final int $stable;
/*     */   
/*     */   public FloatExponentialDecaySpec(@FloatRange(from = 0.0D, fromInclusive = false) float frictionMultiplier, @FloatRange(from = 0.0D, fromInclusive = false) float absVelocityThreshold) {
/* 115 */     this.absVelocityThreshold = Math.max(1.0E-7F, Math.abs(absVelocityThreshold));
/* 116 */     this.friction = -4.2F * Math.max(1.0E-4F, frictionMultiplier);
/*     */   }
/*     */   
/*     */   public float getAbsVelocityThreshold() {
/*     */     return this.absVelocityThreshold;
/*     */   }
/*     */   
/*     */   public float getValueFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
/* 124 */     long playTimeMillis = playTimeNanos / 1000000L;
/* 125 */     return initialValue - initialVelocity / this.friction + 
/* 126 */       initialVelocity / this.friction * (float)Math.exp((this.friction * (float)playTimeMillis / 1000.0F));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getVelocityFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
/* 135 */     long playTimeMillis = playTimeNanos / 1000000L;
/* 136 */     return initialVelocity * (float)Math.exp(((float)playTimeMillis / 1000.0F * this.friction));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long getDurationNanos(float initialValue, float initialVelocity) {
/* 142 */     return 
/* 143 */       (long)(1000.0F * (float)Math.log((getAbsVelocityThreshold() / Math.abs(initialVelocity))) / this.friction) * 1000000L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getTargetValue(float initialValue, float initialVelocity) {
/* 150 */     if (Math.abs(initialVelocity) <= getAbsVelocityThreshold()) {
/* 151 */       return initialValue;
/*     */     }
/* 153 */     double duration = 
/* 154 */       Math.log(Math.abs(getAbsVelocityThreshold() / initialVelocity)) / this.friction * 'Ϩ';
/*     */     
/* 156 */     return initialValue - initialVelocity / this.friction + 
/* 157 */       initialVelocity / this.friction * (float)Math.exp(this.friction * duration / 1000.0F);
/*     */   }
/*     */   
/*     */   public FloatExponentialDecaySpec() {
/*     */     this(0.0F, 0.0F, 3, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\FloatExponentialDecaySpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */