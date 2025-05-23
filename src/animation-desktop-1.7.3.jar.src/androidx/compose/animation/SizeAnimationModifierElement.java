/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.animation.core.AnimationSpec;
/*     */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.node.ModifierNodeElement;
/*     */ import androidx.compose.ui.platform.InspectorInfo;
/*     */ import androidx.compose.ui.unit.IntSize;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\r\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\b\b\030\0002\b\022\004\022\0020\0020\001BU\022\f\020\003\032\b\022\004\022\0020\0050\004\022\006\020\006\032\0020\007\0228\020\b\0324\022\023\022\0210\005¢\006\f\b\n\022\b\b\013\022\004\b\b(\f\022\023\022\0210\005¢\006\f\b\n\022\b\b\013\022\004\b\b(\r\022\004\022\0020\016\030\0010\t¢\006\002\020\017J\017\020\026\032\b\022\004\022\0020\0050\004HÆ\003J\t\020\027\032\0020\007HÆ\003J;\020\030\0324\022\023\022\0210\005¢\006\f\b\n\022\b\b\013\022\004\b\b(\f\022\023\022\0210\005¢\006\f\b\n\022\b\b\013\022\004\b\b(\r\022\004\022\0020\016\030\0010\tHÆ\003J_\020\031\032\0020\0002\016\b\002\020\003\032\b\022\004\022\0020\0050\0042\b\b\002\020\006\032\0020\0072:\b\002\020\b\0324\022\023\022\0210\005¢\006\f\b\n\022\b\b\013\022\004\b\b(\f\022\023\022\0210\005¢\006\f\b\n\022\b\b\013\022\004\b\b(\r\022\004\022\0020\016\030\0010\tHÆ\001J\b\020\032\032\0020\002H\026J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\036HÖ\003J\t\020\037\032\0020 HÖ\001J\t\020!\032\0020\"HÖ\001J\020\020#\032\0020\0162\006\020$\032\0020\002H\026J\f\020%\032\0020\016*\0020&H\026R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\022\020\023RC\020\b\0324\022\023\022\0210\005¢\006\f\b\n\022\b\b\013\022\004\b\b(\f\022\023\022\0210\005¢\006\f\b\n\022\b\b\013\022\004\b\b(\r\022\004\022\0020\016\030\0010\t¢\006\b\n\000\032\004\b\024\020\025¨\006'"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/SizeAnimationModifierNode;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "alignment", "Landroidx/compose/ui/Alignment;", "finishedListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "initialValue", "targetValue", "", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function2;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "getFinishedListener", "()Lkotlin/jvm/functions/Function2;", "component1", "component2", "component3", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "animation"})
/*     */ final class SizeAnimationModifierElement
/*     */   extends ModifierNodeElement<SizeAnimationModifierNode>
/*     */ {
/*     */   @NotNull
/*     */   private final FiniteAnimationSpec<IntSize> animationSpec;
/*     */   @NotNull
/*     */   private final Alignment alignment;
/*     */   @Nullable
/*     */   private final Function2<IntSize, IntSize, Unit> finishedListener;
/*     */   
/*     */   @NotNull
/*     */   public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
/* 116 */     return this.animationSpec; } @NotNull
/* 117 */   public final Alignment getAlignment() { return this.alignment; } @Nullable
/* 118 */   public final Function2<IntSize, IntSize, Unit> getFinishedListener() { return this.finishedListener; } public SizeAnimationModifierElement(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment alignment, @Nullable Function2<IntSize, IntSize, Unit> finishedListener) { this.animationSpec = animationSpec; this.alignment = alignment; this.finishedListener = finishedListener; }
/*     */    @NotNull
/*     */   public SizeAnimationModifierNode create() {
/* 121 */     return new SizeAnimationModifierNode((AnimationSpec<IntSize>)this.animationSpec, this.alignment, this.finishedListener);
/*     */   }
/*     */   public void update(@NotNull SizeAnimationModifierNode node) {
/* 124 */     Intrinsics.checkNotNullParameter(node, "node"); node.setAnimationSpec((AnimationSpec<IntSize>)this.animationSpec);
/* 125 */     node.setListener(this.finishedListener);
/* 126 */     node.setAlignment(this.alignment);
/*     */   }
/*     */   
/*     */   public void inspectableProperties(@NotNull InspectorInfo $this$inspectableProperties) {
/* 130 */     Intrinsics.checkNotNullParameter($this$inspectableProperties, "<this>"); $this$inspectableProperties.setName("animateContentSize");
/* 131 */     $this$inspectableProperties.getProperties().set("animationSpec", this.animationSpec);
/* 132 */     $this$inspectableProperties.getProperties().set("alignment", this.alignment);
/* 133 */     $this$inspectableProperties.getProperties().set("finishedListener", this.finishedListener);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FiniteAnimationSpec<IntSize> component1() {
/*     */     return this.animationSpec;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Alignment component2() {
/*     */     return this.alignment;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Function2<IntSize, IntSize, Unit> component3() {
/*     */     return this.finishedListener;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SizeAnimationModifierElement copy(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment alignment, @Nullable Function2<? super IntSize, ? super IntSize, Unit> finishedListener) {
/*     */     Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
/*     */     Intrinsics.checkNotNullParameter(alignment, "alignment");
/*     */     return new SizeAnimationModifierElement(animationSpec, alignment, finishedListener);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "SizeAnimationModifierElement(animationSpec=" + this.animationSpec + ", alignment=" + this.alignment + ", finishedListener=" + this.finishedListener + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.animationSpec.hashCode();
/*     */     result = result * 31 + this.alignment.hashCode();
/*     */     return result * 31 + ((this.finishedListener == null) ? 0 : this.finishedListener.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof SizeAnimationModifierElement))
/*     */       return false; 
/*     */     SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement)other;
/*     */     return !Intrinsics.areEqual(this.animationSpec, sizeAnimationModifierElement.animationSpec) ? false : (!Intrinsics.areEqual(this.alignment, sizeAnimationModifierElement.alignment) ? false : (!!Intrinsics.areEqual(this.finishedListener, sizeAnimationModifierElement.finishedListener)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SizeAnimationModifierElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */