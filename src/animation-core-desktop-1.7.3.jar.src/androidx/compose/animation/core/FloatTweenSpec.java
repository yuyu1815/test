/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\t\n\002\b\006\n\002\020\007\n\002\b\005\b\007\030\0002\0020\001B#\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\006¢\006\002\020\007J\020\020\016\032\0020\0132\006\020\017\032\0020\013H\002J \020\020\032\0020\0132\006\020\021\032\0020\0222\006\020\023\032\0020\0222\006\020\024\032\0020\022H\026J(\020\025\032\0020\0222\006\020\017\032\0020\0132\006\020\021\032\0020\0222\006\020\023\032\0020\0222\006\020\024\032\0020\022H\026J(\020\026\032\0020\0222\006\020\017\032\0020\0132\006\020\021\032\0020\0222\006\020\023\032\0020\0222\006\020\024\032\0020\022H\026R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\016\020\n\032\0020\013X\004¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\tR\016\020\r\032\0020\013X\004¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\027"}, d2 = {"Landroidx/compose/animation/core/FloatTweenSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "duration", "", "delay", "easing", "Landroidx/compose/animation/core/Easing;", "(IILandroidx/compose/animation/core/Easing;)V", "getDelay", "()I", "delayNanos", "", "getDuration", "durationNanos", "clampPlayTimeNanos", "playTimeNanos", "getDurationNanos", "initialValue", "", "targetValue", "initialVelocity", "getValueFromNanos", "getVelocityFromNanos", "animation-core"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nFloatAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,265:1\n71#2,16:266\n*S KotlinDebug\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n*L\n218#1:266,16\n*E\n"})
/*     */ public final class FloatTweenSpec
/*     */   implements FloatAnimationSpec
/*     */ {
/*     */   private final int duration;
/*     */   private final int delay;
/*     */   @NotNull
/*     */   private final Easing easing;
/*     */   private final long durationNanos;
/*     */   private final long delayNanos;
/*     */   public static final int $stable;
/*     */   
/*     */   public FloatTweenSpec(int duration, int delay, @NotNull Easing easing) {
/* 202 */     this.duration = duration;
/* 203 */     this.delay = delay;
/* 204 */     this.easing = easing;
/*     */     
/* 206 */     this.durationNanos = this.duration * 1000000L;
/*     */     
/* 208 */     this.delayNanos = this.delay * 1000000L;
/*     */   }
/*     */   
/*     */   public final int getDuration() {
/*     */     return this.duration;
/*     */   }
/*     */   
/*     */   public float getValueFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
/* 216 */     long clampedPlayTimeNanos = clampPlayTimeNanos(playTimeNanos);
/* 217 */     float rawFraction = (this.duration == 0) ? 1.0F : ((float)clampedPlayTimeNanos / (float)this.durationNanos);
/* 218 */     float f1 = rawFraction, f2 = 0.0F, maximumValue$iv = 1.0F; int $i$f$fastCoerceIn = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 266 */     float $this$fastCoerceAtLeast$iv$iv = f1; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 273 */     float $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < f2) ? f2 : $this$fastCoerceAtLeast$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 281 */     float fraction = this.easing.transform(($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv);
/*     */     return VectorConvertersKt.lerp(initialValue, targetValue, fraction);
/*     */   }
/*     */   
/*     */   public final int getDelay() {
/*     */     return this.delay;
/*     */   }
/*     */   
/*     */   private final long clampPlayTimeNanos(long playTimeNanos) {
/*     */     return RangesKt.coerceIn(playTimeNanos - this.delayNanos, 0L, this.durationNanos);
/*     */   }
/*     */   
/*     */   public long getDurationNanos(float initialValue, float targetValue, float initialVelocity) {
/*     */     return (this.delay + this.duration) * 1000000L;
/*     */   }
/*     */   
/*     */   public float getVelocityFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
/*     */     long clampedPlayTimeNanos = clampPlayTimeNanos(playTimeNanos);
/*     */     if (clampedPlayTimeNanos < 0L)
/*     */       return 0.0F; 
/*     */     if (clampedPlayTimeNanos == 0L)
/*     */       return initialVelocity; 
/*     */     float startNum = getValueFromNanos(clampedPlayTimeNanos - 1000000L, initialValue, targetValue, initialVelocity);
/*     */     float endNum = getValueFromNanos(clampedPlayTimeNanos, initialValue, targetValue, initialVelocity);
/*     */     return (endNum - startNum) * 1000.0F;
/*     */   }
/*     */   
/*     */   public FloatTweenSpec() {
/*     */     this(0, 0, null, 7, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\FloatTweenSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */