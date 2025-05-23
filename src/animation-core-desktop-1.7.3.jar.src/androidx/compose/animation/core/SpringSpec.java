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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\007\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B%\022\b\b\002\020\003\032\0020\004\022\b\b\002\020\005\032\0020\004\022\n\b\002\020\006\032\004\030\0018\000¢\006\002\020\007J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\023H\026J,\020\024\032\b\022\004\022\002H\0260\025\"\b\b\001\020\026*\0020\0272\022\020\030\032\016\022\004\022\0028\000\022\004\022\002H\0260\031H\026R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\b\020\tR\021\020\005\032\0020\004¢\006\b\n\000\032\004\b\n\020\tR\025\020\006\032\004\030\0018\000¢\006\n\n\002\020\r\032\004\b\013\020\f¨\006\032"}, d2 = {"Landroidx/compose/animation/core/SpringSpec;", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "dampingRatio", "", "stiffness", "visibilityThreshold", "(FFLjava/lang/Object;)V", "getDampingRatio", "()F", "getStiffness", "getVisibilityThreshold", "()Ljava/lang/Object;", "Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "", "vectorize", "Landroidx/compose/animation/core/VectorizedSpringSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core"})
/*     */ @Immutable
/*     */ public final class SpringSpec<T>
/*     */   implements FiniteAnimationSpec<T>
/*     */ {
/*     */   private final float dampingRatio;
/*     */   private final float stiffness;
/*     */   @Nullable
/*     */   private final T visibilityThreshold;
/*     */   public static final int $stable;
/*     */   
/*     */   public SpringSpec(float dampingRatio, float stiffness, @Nullable Object visibilityThreshold) {
/* 146 */     this.dampingRatio = dampingRatio;
/* 147 */     this.stiffness = stiffness;
/* 148 */     this.visibilityThreshold = (T)visibilityThreshold; } public final float getDampingRatio() { return this.dampingRatio; } @Nullable public final T getVisibilityThreshold() { return this.visibilityThreshold; } public final float getStiffness() {
/*     */     return this.stiffness;
/*     */   } @NotNull
/*     */   public <V extends AnimationVector> VectorizedSpringSpec<V> vectorize(@NotNull TwoWayConverter converter) {
/* 152 */     Intrinsics.checkNotNullParameter(converter, "converter"); return new VectorizedSpringSpec<>(this.dampingRatio, this.stiffness, (V)AnimationSpecKt.access$convert(converter, this.visibilityThreshold));
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/* 155 */     return (other instanceof SpringSpec) ? (
/* 156 */       (((((SpringSpec)other).dampingRatio == this.dampingRatio)) && (
/* 157 */       (((SpringSpec)other).stiffness == this.stiffness)) && 
/* 158 */       Intrinsics.areEqual(((SpringSpec)other).visibilityThreshold, this.visibilityThreshold))) : false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 164 */     return (((this.visibilityThreshold != null) ? this.visibilityThreshold.hashCode() : 0) * 31 + Float.hashCode(this.dampingRatio)) * 31 + Float.hashCode(this.stiffness);
/*     */   }
/*     */   
/*     */   public SpringSpec() {
/*     */     this(0.0F, 0.0F, null, 7, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\SpringSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */