/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\b\002\030\0002\0020\001BM\022\b\b\002\020\002\032\0020\003\022<\020\004\0328\022\023\022\0210\006¢\006\f\b\007\022\b\b\b\022\004\b\b(\t\022\023\022\0210\006¢\006\f\b\007\022\b\b\b\022\004\b\b(\n\022\n\022\b\022\004\022\0020\0060\0130\005¢\006\002\020\fJ(\020\021\032\b\022\004\022\0020\0060\0132\006\020\t\032\0020\0062\006\020\n\032\0020\006H\026ø\001\000¢\006\004\b\022\020\023R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\r\020\016RG\020\004\0328\022\023\022\0210\006¢\006\f\b\007\022\b\b\b\022\004\b\b(\t\022\023\022\0210\006¢\006\f\b\007\022\b\b\b\022\004\b\b(\n\022\n\022\b\022\004\022\0020\0060\0130\005¢\006\b\n\000\032\004\b\017\020\020\002\007\n\005\b¡\0360\001¨\006\024"}, d2 = {"Landroidx/compose/animation/SizeTransformImpl;", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "(ZLkotlin/jvm/functions/Function2;)V", "getClip", "()Z", "getSizeAnimationSpec", "()Lkotlin/jvm/functions/Function2;", "createAnimationSpec", "createAnimationSpec-TemP2vQ", "(JJ)Landroidx/compose/animation/core/FiniteAnimationSpec;", "animation"})
/*     */ final class SizeTransformImpl
/*     */   implements SizeTransform
/*     */ {
/*     */   private final boolean clip;
/*     */   @NotNull
/*     */   private final Function2<IntSize, IntSize, FiniteAnimationSpec<IntSize>> sizeAnimationSpec;
/*     */   
/*     */   public SizeTransformImpl(boolean clip, @NotNull Function2<IntSize, IntSize, FiniteAnimationSpec<IntSize>> sizeAnimationSpec) {
/* 257 */     this.clip = clip;
/* 258 */     this.sizeAnimationSpec = sizeAnimationSpec; } @NotNull public final Function2<IntSize, IntSize, FiniteAnimationSpec<IntSize>> getSizeAnimationSpec() { return this.sizeAnimationSpec; }
/*     */    public boolean getClip() {
/*     */     return this.clip;
/*     */   }
/*     */   @NotNull
/*     */   public FiniteAnimationSpec<IntSize> createAnimationSpec-TemP2vQ(long initialSize, long targetSize) {
/* 264 */     return (FiniteAnimationSpec<IntSize>)this.sizeAnimationSpec.invoke(IntSize.box-impl(initialSize), IntSize.box-impl(targetSize));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SizeTransformImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */