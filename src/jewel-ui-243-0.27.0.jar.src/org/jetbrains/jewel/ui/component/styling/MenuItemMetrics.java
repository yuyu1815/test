/*     */ package org.jetbrains.jewel.ui.component.styling;
/*     */ 
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.foundation.shape.CornerSize;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @GenerateDataFunctions
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\024\b\007\030\000 \0352\0020\001:\001\035BO\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\006\020\b\032\0020\005\022\006\020\t\032\0020\n\022\006\020\013\032\0020\n\022\006\020\f\032\0020\n\022\006\020\r\032\0020\n¢\006\004\b\016\020\017R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\024\020\023R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\025\020\023R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\026\020\023R\023\020\t\032\0020\n¢\006\n\n\002\020\031\032\004\b\027\020\030R\023\020\013\032\0020\n¢\006\n\n\002\020\031\032\004\b\032\020\030R\023\020\f\032\0020\n¢\006\n\n\002\020\031\032\004\b\033\020\030R\023\020\r\032\0020\n¢\006\n\n\002\020\031\032\004\b\034\020\030¨\006\036"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;", "", "selectionCornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "outerPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "separatorPadding", "keybindingsPadding", "separatorThickness", "Landroidx/compose/ui/unit/Dp;", "separatorHeight", "iconSize", "minHeight", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSelectionCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getOuterPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "getSeparatorPadding", "getKeybindingsPadding", "getSeparatorThickness-D9Ej5fM", "()F", "F", "getSeparatorHeight-D9Ej5fM", "getIconSize-D9Ej5fM", "getMinHeight-D9Ej5fM", "Companion", "ui"})
/*     */ @Stable
/*     */ public final class MenuItemMetrics
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final CornerSize selectionCornerSize;
/*     */   @NotNull
/*     */   private final PaddingValues outerPadding;
/*     */   @NotNull
/*     */   private final PaddingValues contentPadding;
/*     */   @NotNull
/*     */   private final PaddingValues separatorPadding;
/*     */   @NotNull
/*     */   private final PaddingValues keybindingsPadding;
/*     */   private final float separatorThickness;
/*     */   private final float separatorHeight;
/*     */   private final float iconSize;
/*     */   private final float minHeight;
/*     */   public static final int $stable;
/*     */   
/*     */   private MenuItemMetrics(CornerSize selectionCornerSize, PaddingValues outerPadding, PaddingValues contentPadding, PaddingValues separatorPadding, PaddingValues keybindingsPadding, float separatorThickness, float separatorHeight, float iconSize, float minHeight) {
/* 139 */     this.selectionCornerSize = selectionCornerSize;
/* 140 */     this.outerPadding = outerPadding;
/* 141 */     this.contentPadding = contentPadding;
/* 142 */     this.separatorPadding = separatorPadding;
/* 143 */     this.keybindingsPadding = keybindingsPadding;
/* 144 */     this.separatorThickness = separatorThickness;
/* 145 */     this.separatorHeight = separatorHeight;
/* 146 */     this.iconSize = iconSize;
/* 147 */     this.minHeight = minHeight; } public final float getMinHeight-D9Ej5fM() { return this.minHeight; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final CornerSize getSelectionCornerSize() {
/*     */     return this.selectionCornerSize;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues getOuterPadding() {
/*     */     return this.outerPadding;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues getContentPadding() {
/*     */     return this.contentPadding;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues getSeparatorPadding() {
/*     */     return this.separatorPadding;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues getKeybindingsPadding() {
/*     */     return this.keybindingsPadding;
/*     */   }
/*     */   
/*     */   public final float getSeparatorThickness-D9Ej5fM() {
/*     */     return this.separatorThickness;
/*     */   }
/*     */   
/*     */   public final float getSeparatorHeight-D9Ej5fM() {
/*     */     return this.separatorHeight;
/*     */   }
/*     */   
/*     */   public final float getIconSize-D9Ej5fM() {
/*     */     return this.iconSize;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MenuItemMetrics))
/*     */       return false; 
/*     */     MenuItemMetrics menuItemMetrics = (MenuItemMetrics)other;
/*     */     return !Intrinsics.areEqual(this.selectionCornerSize, menuItemMetrics.selectionCornerSize) ? false : (!Intrinsics.areEqual(this.outerPadding, menuItemMetrics.outerPadding) ? false : (!Intrinsics.areEqual(this.contentPadding, menuItemMetrics.contentPadding) ? false : (!Intrinsics.areEqual(this.separatorPadding, menuItemMetrics.separatorPadding) ? false : (!Intrinsics.areEqual(this.keybindingsPadding, menuItemMetrics.keybindingsPadding) ? false : (!Dp.equals-impl0(this.separatorThickness, menuItemMetrics.separatorThickness) ? false : (!Dp.equals-impl0(this.separatorHeight, menuItemMetrics.separatorHeight) ? false : (!Dp.equals-impl0(this.iconSize, menuItemMetrics.iconSize) ? false : (!!Dp.equals-impl0(this.minHeight, menuItemMetrics.minHeight)))))))));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.selectionCornerSize.hashCode();
/*     */     result = result * 31 + this.outerPadding.hashCode();
/*     */     result = result * 31 + this.contentPadding.hashCode();
/*     */     result = result * 31 + this.separatorPadding.hashCode();
/*     */     result = result * 31 + this.keybindingsPadding.hashCode();
/*     */     result = result * 31 + Dp.hashCode-impl(this.separatorThickness);
/*     */     result = result * 31 + Dp.hashCode-impl(this.separatorHeight);
/*     */     result = result * 31 + Dp.hashCode-impl(this.iconSize);
/*     */     return result * 31 + Dp.hashCode-impl(this.minHeight);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "MenuItemMetrics(selectionCornerSize=" + this.selectionCornerSize + ", outerPadding=" + this.outerPadding + ", contentPadding=" + this.contentPadding + ", separatorPadding=" + this.separatorPadding + ", keybindingsPadding=" + this.keybindingsPadding + ", separatorThickness=" + Dp.toString-impl(this.separatorThickness) + ", separatorHeight=" + Dp.toString-impl(this.separatorHeight) + ", iconSize=" + Dp.toString-impl(this.iconSize) + ", minHeight=" + Dp.toString-impl(this.minHeight) + ")";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics$Companion;", "", "<init>", "()V", "ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\MenuItemMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */