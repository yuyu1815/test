/*    */ package androidx.compose.animation;
/*    */ 
/*    */ import androidx.compose.animation.core.FloatDecayAnimationSpec;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.unit.Density;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\t\n\002\b\007\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\013\032\0020\0062\006\020\f\032\0020\006H\002J\030\020\r\032\0020\0162\006\020\017\032\0020\0062\006\020\020\032\0020\006H\026J\030\020\021\032\0020\0062\006\020\017\032\0020\0062\006\020\020\032\0020\006H\026J \020\022\032\0020\0062\006\020\023\032\0020\0162\006\020\017\032\0020\0062\006\020\020\032\0020\006H\026J \020\024\032\0020\0062\006\020\023\032\0020\0162\006\020\017\032\0020\0062\006\020\020\032\0020\006H\026R\024\020\005\032\0020\0068VX\004¢\006\006\032\004\b\007\020\bR\016\020\t\032\0020\nX\004¢\006\002\n\000¨\006\025"}, d2 = {"Landroidx/compose/animation/SplineBasedFloatDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "absVelocityThreshold", "", "getAbsVelocityThreshold", "()F", "flingCalculator", "Landroidx/compose/animation/FlingCalculator;", "flingDistance", "startVelocity", "getDurationNanos", "", "initialValue", "initialVelocity", "getTargetValue", "getValueFromNanos", "playTimeNanos", "getVelocityFromNanos", "animation"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class SplineBasedFloatDecayAnimationSpec
/*    */   implements FloatDecayAnimationSpec
/*    */ {
/*    */   @NotNull
/*    */   private final FlingCalculator flingCalculator;
/*    */   public static final int $stable;
/*    */   
/*    */   public SplineBasedFloatDecayAnimationSpec(@NotNull Density density) {
/* 31 */     this.flingCalculator = new FlingCalculator(
/* 32 */         SplineBasedDecayAnimationSpec_desktopKt.getPlatformFlingScrollFriction(), 
/* 33 */         density);
/*    */   }
/*    */   public float getAbsVelocityThreshold() {
/* 36 */     return 0.0F;
/*    */   }
/*    */   private final float flingDistance(float startVelocity) {
/* 39 */     return this.flingCalculator.flingDistance(startVelocity) * Math.signum(startVelocity);
/*    */   }
/*    */   public float getTargetValue(float initialValue, float initialVelocity) {
/* 42 */     return initialValue + flingDistance(initialVelocity);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getValueFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
/* 50 */     long playTimeMillis = playTimeNanos / 1000000L;
/* 51 */     return initialValue + this.flingCalculator.flingInfo(initialVelocity).position(playTimeMillis);
/*    */   }
/*    */ 
/*    */   
/*    */   public long getDurationNanos(float initialValue, float initialVelocity) {
/* 56 */     return this.flingCalculator.flingDuration(initialVelocity) * 1000000L;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float getVelocityFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
/* 64 */     long playTimeMillis = playTimeNanos / 1000000L;
/* 65 */     return this.flingCalculator.flingInfo(initialVelocity).velocity(playTimeMillis);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SplineBasedFloatDecayAnimationSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */