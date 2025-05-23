/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ranges.RangesKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\000\n\002\020\024\n\002\b\002\n\002\020\006\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\002\b\003\bÀ\002\030\0002\0020\001:\001\020B\007\b\002¢\006\002\020\002J\026\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\013J\016\020\r\032\0020\0162\006\020\017\032\0020\013R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\007\032\0020\006X\004¢\006\002\n\000¨\006\021"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline;", "", "()V", "NbSamples", "", "SplinePositions", "", "SplineTimes", "deceleration", "", "velocity", "", "friction", "flingPosition", "Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "time", "FlingResult", "animation"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class AndroidFlingSpline
/*     */ {
/*     */   @NotNull
/*  75 */   public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline(); private static final int NbSamples = 100; @NotNull private static final float[] SplinePositions = new float[101]; @NotNull
/*  76 */   private static final float[] SplineTimes = new float[101];
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*  81 */     SplineBasedDecayKt.access$computeSplineInfo(SplinePositions, SplineTimes, 100);
/*  82 */   } public static final int $stable = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final FlingResult flingPosition(float time) {
/*  92 */     float clampedTime = RangesKt.coerceIn(time, 0.0F, 1.0F);
/*  93 */     int index = (int)(100 * clampedTime);
/*  94 */     float distanceCoef = 1.0F;
/*  95 */     float velocityCoef = 0.0F;
/*  96 */     if (index < 100) {
/*  97 */       float tInf = index / 100;
/*  98 */       float tSup = (index + 1) / 100;
/*  99 */       float dInf = SplinePositions[index];
/* 100 */       float dSup = SplinePositions[index + 1];
/* 101 */       velocityCoef = (dSup - dInf) / (tSup - tInf);
/* 102 */       distanceCoef = dInf + (clampedTime - tInf) * velocityCoef;
/*     */     } 
/* 104 */     return new FlingResult(
/* 105 */         distanceCoef, 
/* 106 */         velocityCoef);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final double deceleration(float velocity, float friction) {
/* 114 */     return Math.log((0.35F * Math.abs(velocity)) / friction);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\t\020\t\032\0020\003HÆ\003J\t\020\n\032\0020\003HÆ\003J\035\020\013\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\001HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\022HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\b\020\007¨\006\023"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "", "distanceCoefficient", "", "velocityCoefficient", "(FF)V", "getDistanceCoefficient", "()F", "getVelocityCoefficient", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "animation"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class FlingResult {
/*     */     private final float distanceCoefficient;
/*     */     private final float velocityCoefficient;
/*     */     public static final int $stable;
/*     */     
/* 124 */     public FlingResult(float distanceCoefficient, float velocityCoefficient) { this.distanceCoefficient = distanceCoefficient;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 129 */       this.velocityCoefficient = velocityCoefficient; } public final float getVelocityCoefficient() { return this.velocityCoefficient; }
/*     */ 
/*     */     
/*     */     public final float getDistanceCoefficient() {
/*     */       return this.distanceCoefficient;
/*     */     }
/*     */     
/*     */     public final float component1() {
/*     */       return this.distanceCoefficient;
/*     */     }
/*     */     
/*     */     public final float component2() {
/*     */       return this.velocityCoefficient;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final FlingResult copy(float distanceCoefficient, float velocityCoefficient) {
/*     */       return new FlingResult(distanceCoefficient, velocityCoefficient);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "FlingResult(distanceCoefficient=" + this.distanceCoefficient + ", velocityCoefficient=" + this.velocityCoefficient + ')';
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = Float.hashCode(this.distanceCoefficient);
/*     */       return result * 31 + Float.hashCode(this.velocityCoefficient);
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof FlingResult))
/*     */         return false; 
/*     */       FlingResult flingResult = (FlingResult)other;
/*     */       return (Float.compare(this.distanceCoefficient, flingResult.distanceCoefficient) != 0) ? false : (!(Float.compare(this.velocityCoefficient, flingResult.velocityCoefficient) != 0));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\AndroidFlingSpline.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */