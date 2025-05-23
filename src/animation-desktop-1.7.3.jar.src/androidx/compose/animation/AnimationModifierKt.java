/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.animation.core.AnimationSpecKt;
/*     */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*     */ import androidx.compose.animation.core.VisibilityThresholdsKt;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.draw.ClipKt;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import androidx.compose.ui.unit.IntSizeKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\032V\020\t\032\0020\n*\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\0010\f2:\b\002\020\r\0324\022\023\022\0210\001¢\006\f\b\017\022\b\b\020\022\004\b\b(\021\022\023\022\0210\001¢\006\f\b\017\022\b\b\020\022\004\b\b(\022\022\004\022\0020\023\030\0010\016\032`\020\t\032\0020\n*\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\0010\f2\b\b\002\020\024\032\0020\0252:\b\002\020\r\0324\022\023\022\0210\001¢\006\f\b\017\022\b\b\020\022\004\b\b(\021\022\023\022\0210\001¢\006\f\b\017\022\b\b\020\022\004\b\b(\022\022\004\022\0020\023\030\0010\016\"\026\020\000\032\0020\001X\004¢\006\n\n\002\020\004\032\004\b\002\020\003\"\030\020\005\032\0020\006*\0020\0018@X\004¢\006\006\032\004\b\007\020\b¨\006\026"}, d2 = {"InvalidSize", "Landroidx/compose/ui/unit/IntSize;", "getInvalidSize", "()J", "J", "isValid", "", "isValid-ozmzZPI", "(J)Z", "animateContentSize", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "finishedListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "initialValue", "targetValue", "", "alignment", "Landroidx/compose/ui/Alignment;", "animation"})
/*     */ public final class AnimationModifierKt
/*     */ {
/*     */   @NotNull
/*     */   public static final Modifier animateContentSize(@NotNull Modifier $this$animateContentSize, @NotNull FiniteAnimationSpec<IntSize> animationSpec, @Nullable Function2<? super IntSize, ? super IntSize, Unit> finishedListener) {
/*  77 */     Intrinsics.checkNotNullParameter($this$animateContentSize, "<this>"); Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); return ClipKt.clipToBounds($this$animateContentSize).then(
/*  78 */         (Modifier)new SizeAnimationModifierElement(animationSpec, Alignment.Companion.getTopStart(), finishedListener));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Modifier animateContentSize(@NotNull Modifier $this$animateContentSize, @NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment alignment, @Nullable Function2<? super IntSize, ? super IntSize, Unit> finishedListener) {
/* 112 */     Intrinsics.checkNotNullParameter($this$animateContentSize, "<this>"); Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(alignment, "alignment"); return ClipKt.clipToBounds($this$animateContentSize).then(
/* 113 */         (Modifier)new SizeAnimationModifierElement(animationSpec, alignment, finishedListener));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 137 */   private static final long InvalidSize = IntSizeKt.IntSize(-2147483648, -2147483648); public static final long getInvalidSize() { return InvalidSize; }
/*     */    public static final boolean isValid-ozmzZPI(long $this$isValid) {
/* 139 */     return !IntSize.equals-impl0($this$isValid, InvalidSize);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\AnimationModifierKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */