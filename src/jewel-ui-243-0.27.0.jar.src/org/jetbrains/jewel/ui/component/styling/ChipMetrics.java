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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\b\007\030\000 \0232\0020\001:\001\023B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007¢\006\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\023\020\006\032\0020\007¢\006\n\n\002\020\021\032\004\b\017\020\020R\023\020\b\032\0020\007¢\006\n\n\002\020\021\032\004\b\022\020\020¨\006\024"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ChipMetrics;", "", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "padding", "Landroidx/compose/foundation/layout/PaddingValues;", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "borderWidthSelected", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getBorderWidth-D9Ej5fM", "()F", "F", "getBorderWidthSelected-D9Ej5fM", "Companion", "ui"})
/*     */ @Stable
/*     */ public final class ChipMetrics
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final CornerSize cornerSize;
/*     */   @NotNull
/*     */   private final PaddingValues padding;
/*     */   private final float borderWidth;
/*     */   private final float borderWidthSelected;
/*     */   public static final int $stable;
/*     */   
/*     */   private ChipMetrics(CornerSize cornerSize, PaddingValues padding, float borderWidth, float borderWidthSelected) {
/* 131 */     this.cornerSize = cornerSize;
/* 132 */     this.padding = padding;
/* 133 */     this.borderWidth = borderWidth;
/* 134 */     this.borderWidthSelected = borderWidthSelected; } public final float getBorderWidthSelected-D9Ej5fM() { return this.borderWidthSelected; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final CornerSize getCornerSize() {
/*     */     return this.cornerSize;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues getPadding() {
/*     */     return this.padding;
/*     */   }
/*     */   
/*     */   public final float getBorderWidth-D9Ej5fM() {
/*     */     return this.borderWidth;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ChipMetrics))
/*     */       return false; 
/*     */     ChipMetrics chipMetrics = (ChipMetrics)other;
/*     */     return !Intrinsics.areEqual(this.cornerSize, chipMetrics.cornerSize) ? false : (!Intrinsics.areEqual(this.padding, chipMetrics.padding) ? false : (!Dp.equals-impl0(this.borderWidth, chipMetrics.borderWidth) ? false : (!!Dp.equals-impl0(this.borderWidthSelected, chipMetrics.borderWidthSelected))));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.cornerSize.hashCode();
/*     */     result = result * 31 + this.padding.hashCode();
/*     */     result = result * 31 + Dp.hashCode-impl(this.borderWidth);
/*     */     return result * 31 + Dp.hashCode-impl(this.borderWidthSelected);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ChipMetrics(cornerSize=" + this.cornerSize + ", padding=" + this.padding + ", borderWidth=" + Dp.toString-impl(this.borderWidth) + ", borderWidthSelected=" + Dp.toString-impl(this.borderWidthSelected) + ")";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ChipMetrics$Companion;", "", "<init>", "()V", "ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\ChipMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */