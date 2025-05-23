/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\000\n\002\030\002\n\002\b\b\n\002\020\t\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\002\b\000\030\0002\0020\001:\001\023B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\020\020\n\032\0020\0032\006\020\004\032\0020\005H\002J\016\020\013\032\0020\0032\006\020\f\032\0020\003J\016\020\r\032\0020\0162\006\020\f\032\0020\003J\016\020\017\032\0020\0202\006\020\f\032\0020\003J\020\020\021\032\0020\0222\006\020\f\032\0020\003H\002R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\t\032\0020\003X\004¢\006\002\n\000¨\006\024"}, d2 = {"Landroidx/compose/animation/FlingCalculator;", "", "friction", "", "density", "Landroidx/compose/ui/unit/Density;", "(FLandroidx/compose/ui/unit/Density;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "magicPhysicalCoefficient", "computeDeceleration", "flingDistance", "velocity", "flingDuration", "", "flingInfo", "Landroidx/compose/animation/FlingCalculator$FlingInfo;", "getSplineDeceleration", "", "FlingInfo", "animation"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class FlingCalculator
/*     */ {
/*     */   private final float friction;
/*     */   @NotNull
/*     */   private final Density density;
/*     */   private final float magicPhysicalCoefficient;
/*     */   public static final int $stable;
/*     */   
/*     */   public FlingCalculator(float friction, @NotNull Density density) {
/*  50 */     this.friction = friction;
/*  51 */     this.density = density;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  57 */     this.magicPhysicalCoefficient = computeDeceleration(this.density);
/*     */   }
/*     */   @NotNull
/*     */   public final Density getDensity() {
/*     */     return this.density;
/*     */   }
/*     */   private final float computeDeceleration(Density density) {
/*  64 */     return FlingCalculatorKt.access$computeDeceleration(0.84F, density.getDensity());
/*     */   } private final double getSplineDeceleration(float velocity) {
/*  66 */     return AndroidFlingSpline.INSTANCE.deceleration(
/*  67 */         velocity, 
/*  68 */         this.friction * this.magicPhysicalCoefficient);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final long flingDuration(float velocity) {
/*  75 */     double l = getSplineDeceleration(velocity);
/*  76 */     double decelMinusOne = FlingCalculatorKt.access$getDecelerationRate$p() - 1.0D;
/*  77 */     return (long)(1000.0D * Math.exp(l / decelMinusOne));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float flingDistance(float velocity) {
/*  84 */     double l = getSplineDeceleration(velocity);
/*  85 */     double decelMinusOne = FlingCalculatorKt.access$getDecelerationRate$p() - 1.0D;
/*  86 */     return 
/*     */ 
/*     */       
/*  89 */       (float)((this.friction * this.magicPhysicalCoefficient) * Math.exp(FlingCalculatorKt.access$getDecelerationRate$p() / decelMinusOne * l));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final FlingInfo flingInfo(float velocity) {
/*  96 */     double l = getSplineDeceleration(velocity);
/*  97 */     double decelMinusOne = FlingCalculatorKt.access$getDecelerationRate$p() - 1.0D;
/*  98 */     return new FlingInfo(
/*  99 */         velocity, 
/*     */ 
/*     */ 
/*     */         
/* 103 */         (float)((this.friction * this.magicPhysicalCoefficient) * Math.exp(FlingCalculatorKt.access$getDecelerationRate$p() / decelMinusOne * l)), 
/* 104 */         (long)(1000.0D * Math.exp(l / decelMinusOne)));
/*     */   }
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\002\n\002\020\t\n\002\b\013\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\002\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\007J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\006HÆ\003J'\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\025HÖ\001J\016\020\026\032\0020\0032\006\020\027\032\0020\006J\t\020\030\032\0020\031HÖ\001J\016\020\032\032\0020\0032\006\020\027\032\0020\006R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\t¨\006\033"}, d2 = {"Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "initialVelocity", "", "distance", "duration", "", "(FFJ)V", "getDistance", "()F", "getDuration", "()J", "getInitialVelocity", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "position", "time", "toString", "", "velocity", "animation"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class FlingInfo { private final float initialVelocity;
/*     */     private final float distance;
/*     */     private final long duration;
/*     */     public static final int $stable;
/*     */     
/* 113 */     public FlingInfo(float initialVelocity, float distance, long duration) { this.initialVelocity = initialVelocity;
/* 114 */       this.distance = distance;
/* 115 */       this.duration = duration; } public final float getInitialVelocity() { return this.initialVelocity; } public final long getDuration() { return this.duration; } public final float getDistance() {
/*     */       return this.distance;
/*     */     } public final float position(long time) {
/* 118 */       float splinePos = (this.duration > 0L) ? ((float)time / (float)this.duration) : 1.0F;
/* 119 */       return this.distance * Math.signum(this.initialVelocity) * 
/* 120 */         AndroidFlingSpline.INSTANCE.flingPosition(splinePos).getDistanceCoefficient();
/*     */     }
/*     */     
/*     */     public final float velocity(long time) {
/* 124 */       float splinePos = (this.duration > 0L) ? ((float)time / (float)this.duration) : 1.0F;
/* 125 */       return AndroidFlingSpline.INSTANCE.flingPosition(splinePos).getVelocityCoefficient() * 
/* 126 */         Math.signum(this.initialVelocity) * this.distance / (float)this.duration * 1000.0F;
/*     */     }
/*     */     
/*     */     public final float component1() {
/*     */       return this.initialVelocity;
/*     */     }
/*     */     
/*     */     public final float component2() {
/*     */       return this.distance;
/*     */     }
/*     */     
/*     */     public final long component3() {
/*     */       return this.duration;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final FlingInfo copy(float initialVelocity, float distance, long duration) {
/*     */       return new FlingInfo(initialVelocity, distance, duration);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = Float.hashCode(this.initialVelocity);
/*     */       result = result * 31 + Float.hashCode(this.distance);
/*     */       return result * 31 + Long.hashCode(this.duration);
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof FlingInfo))
/*     */         return false; 
/*     */       FlingInfo flingInfo = (FlingInfo)other;
/*     */       return (Float.compare(this.initialVelocity, flingInfo.initialVelocity) != 0) ? false : ((Float.compare(this.distance, flingInfo.distance) != 0) ? false : (!(this.duration != flingInfo.duration)));
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\FlingCalculator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */