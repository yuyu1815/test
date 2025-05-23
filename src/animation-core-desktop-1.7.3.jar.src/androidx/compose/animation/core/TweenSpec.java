/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\007\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B#\022\b\b\002\020\003\032\0020\004\022\b\b\002\020\005\032\0020\004\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\004H\026J,\020\023\032\b\022\004\022\002H\0250\024\"\b\b\001\020\025*\0020\0262\022\020\027\032\016\022\004\022\0028\000\022\004\022\002H\0250\030H\026R\021\020\005\032\0020\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\013\020\nR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\r¨\006\031"}, d2 = {"Landroidx/compose/animation/core/TweenSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "durationMillis", "", "delay", "easing", "Landroidx/compose/animation/core/Easing;", "(IILandroidx/compose/animation/core/Easing;)V", "getDelay", "()I", "getDurationMillis", "getEasing", "()Landroidx/compose/animation/core/Easing;", "equals", "", "other", "", "hashCode", "vectorize", "Landroidx/compose/animation/core/VectorizedTweenSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core"})
/*     */ @Immutable
/*     */ public final class TweenSpec<T>
/*     */   implements DurationBasedAnimationSpec<T>
/*     */ {
/*     */   private final int durationMillis;
/*     */   private final int delay;
/*     */   @NotNull
/*     */   private final Easing easing;
/*     */   public static final int $stable;
/*     */   
/*     */   public TweenSpec(int durationMillis, int delay, @NotNull Easing easing) {
/* 102 */     this.durationMillis = durationMillis;
/* 103 */     this.delay = delay;
/* 104 */     this.easing = easing; } public final int getDurationMillis() { return this.durationMillis; } @NotNull public final Easing getEasing() { return this.easing; } public final int getDelay() {
/*     */     return this.delay;
/*     */   } @NotNull
/*     */   public <V extends AnimationVector> VectorizedTweenSpec<V> vectorize(@NotNull TwoWayConverter converter) {
/* 108 */     Intrinsics.checkNotNullParameter(converter, "converter"); return new VectorizedTweenSpec<>(this.durationMillis, this.delay, this.easing);
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/* 111 */     return (other instanceof TweenSpec) ? (
/* 112 */       (((TweenSpec)other).durationMillis == this.durationMillis && 
/* 113 */       ((TweenSpec)other).delay == this.delay && 
/* 114 */       Intrinsics.areEqual(((TweenSpec)other).easing, this.easing))) : false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 120 */     return (this.durationMillis * 31 + this.easing.hashCode()) * 31 + this.delay;
/*     */   }
/*     */   
/*     */   public TweenSpec() {
/*     */     this(0, 0, null, 7, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\TweenSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */