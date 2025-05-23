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
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J,\020\006\032\b\022\004\022\002H\b0\007\"\b\b\001\020\b*\0020\t2\022\020\n\032\016\022\004\022\0028\000\022\004\022\002H\b0\013H\026R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\f"}, d2 = {"Landroidx/compose/animation/core/DecayAnimationSpecImpl;", "T", "Landroidx/compose/animation/core/DecayAnimationSpec;", "floatDecaySpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;)V", "vectorize", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core"})
/*     */ final class DecayAnimationSpecImpl<T>
/*     */   implements DecayAnimationSpec<T>
/*     */ {
/*     */   @NotNull
/*     */   private final FloatDecayAnimationSpec floatDecaySpec;
/*     */   
/*     */   public DecayAnimationSpecImpl(@NotNull FloatDecayAnimationSpec floatDecaySpec) {
/* 125 */     this.floatDecaySpec = floatDecaySpec;
/*     */   }
/*     */   @NotNull
/*     */   public <V extends AnimationVector> VectorizedDecayAnimationSpec<V> vectorize(@NotNull TwoWayConverter typeConverter) {
/* 129 */     Intrinsics.checkNotNullParameter(typeConverter, "typeConverter"); return new VectorizedFloatDecaySpec<>(this.floatDecaySpec);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\DecayAnimationSpecImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */