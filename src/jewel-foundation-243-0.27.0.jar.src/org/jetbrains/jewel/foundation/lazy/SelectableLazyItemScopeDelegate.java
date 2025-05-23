/*     */ package org.jetbrains.jewel.foundation.lazy;
/*     */ 
/*     */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*     */ import androidx.compose.foundation.ExperimentalFoundationApi;
/*     */ import androidx.compose.foundation.lazy.LazyItemScope;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\020\007\n\000\n\002\030\002\n\002\b\b\b\001\030\0002\0020\0012\0020\002B\037\022\006\020\003\032\0020\002\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\004\b\007\020\bJ=\020\n\032\0020\013*\0020\0132\016\020\f\032\n\022\004\022\0020\016\030\0010\r2\016\020\017\032\n\022\004\022\0020\020\030\0010\r2\016\020\021\032\n\022\004\022\0020\016\030\0010\rH\001J\033\020\022\032\0020\013*\0020\0132\f\020\023\032\b\022\004\022\0020\0200\rH\001J\025\020\024\032\0020\013*\0020\0132\006\020\025\032\0020\016H\001J\025\020\026\032\0020\013*\0020\0132\006\020\025\032\0020\016H\001J\025\020\027\032\0020\013*\0020\0132\006\020\025\032\0020\016H\001R\016\020\003\032\0020\002X\004¢\006\002\n\000R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\004\020\tR\024\020\006\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\t¨\006\030"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScopeDelegate;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "delegate", "isSelected", "", "isActive", "<init>", "(Landroidx/compose/foundation/lazy/LazyItemScope;ZZ)V", "()Z", "animateItem", "Landroidx/compose/ui/Modifier;", "fadeInSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "placementSpec", "Landroidx/compose/ui/unit/IntOffset;", "fadeOutSpec", "animateItemPlacement", "animationSpec", "fillParentMaxHeight", "fraction", "fillParentMaxSize", "fillParentMaxWidth", "foundation"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class SelectableLazyItemScopeDelegate
/*     */   implements SelectableLazyItemScope, LazyItemScope
/*     */ {
/*     */   @NotNull
/*     */   private final LazyItemScope delegate;
/*     */   private final boolean isSelected;
/*     */   private final boolean isActive;
/*     */   public static final int $stable;
/*     */   
/*     */   public SelectableLazyItemScopeDelegate(@NotNull LazyItemScope delegate, boolean isSelected, boolean isActive) {
/* 194 */     this.delegate = delegate;
/* 195 */     this.isSelected = isSelected;
/* 196 */     this.isActive = isActive; } public boolean isActive() { return this.isActive; }
/*     */ 
/*     */   
/*     */   public boolean isSelected() {
/*     */     return this.isSelected;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Modifier animateItem(@NotNull Modifier $this$animateItem, @Nullable FiniteAnimationSpec fadeInSpec, @Nullable FiniteAnimationSpec placementSpec, @Nullable FiniteAnimationSpec fadeOutSpec) {
/*     */     Intrinsics.checkNotNullParameter($this$animateItem, "<this>");
/*     */     return this.delegate.animateItem($this$animateItem, fadeInSpec, placementSpec, fadeOutSpec);
/*     */   }
/*     */   
/*     */   @Deprecated(message = "Use Modifier.animateItem() instead", replaceWith = @ReplaceWith(expression = "Modifier.animateItem(fadeInSpec = null, fadeOutSpec = null, placementSpec = animationSpec)", imports = {}))
/*     */   @ExperimentalFoundationApi
/*     */   @NotNull
/*     */   public Modifier animateItemPlacement(@NotNull Modifier $this$animateItemPlacement, @NotNull FiniteAnimationSpec animationSpec) {
/*     */     Intrinsics.checkNotNullParameter($this$animateItemPlacement, "<this>");
/*     */     Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
/*     */     return this.delegate.animateItemPlacement($this$animateItemPlacement, animationSpec);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Modifier fillParentMaxHeight(@NotNull Modifier $this$fillParentMaxHeight, float fraction) {
/*     */     Intrinsics.checkNotNullParameter($this$fillParentMaxHeight, "<this>");
/*     */     return this.delegate.fillParentMaxHeight($this$fillParentMaxHeight, fraction);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Modifier fillParentMaxSize(@NotNull Modifier $this$fillParentMaxSize, float fraction) {
/*     */     Intrinsics.checkNotNullParameter($this$fillParentMaxSize, "<this>");
/*     */     return this.delegate.fillParentMaxSize($this$fillParentMaxSize, fraction);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Modifier fillParentMaxWidth(@NotNull Modifier $this$fillParentMaxWidth, float fraction) {
/*     */     Intrinsics.checkNotNullParameter($this$fillParentMaxWidth, "<this>");
/*     */     return this.delegate.fillParentMaxWidth($this$fillParentMaxWidth, fraction);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyItemScopeDelegate.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */