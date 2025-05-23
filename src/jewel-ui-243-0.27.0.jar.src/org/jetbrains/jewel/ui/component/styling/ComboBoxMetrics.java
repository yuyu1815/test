/*     */ package org.jetbrains.jewel.ui.component.styling;
/*     */ 
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.foundation.shape.CornerSize;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.DpSize;
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
/*     */ @GenerateDataFunctions
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\022\b\007\030\000 \0342\0020\001:\001\034B?\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\b\022\006\020\n\032\0020\013\022\006\020\f\032\0020\013¢\006\004\b\r\020\016R\023\020\002\032\0020\003¢\006\n\n\002\020\021\032\004\b\017\020\020R\023\020\004\032\0020\003¢\006\n\n\002\020\021\032\004\b\022\020\020R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\023\020\024R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\025\020\026R\021\020\t\032\0020\b¢\006\b\n\000\032\004\b\027\020\026R\023\020\n\032\0020\013¢\006\n\n\002\020\032\032\004\b\030\020\031R\023\020\f\032\0020\013¢\006\n\n\002\020\032\032\004\b\033\020\031¨\006\035"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;", "", "arrowAreaSize", "Landroidx/compose/ui/unit/DpSize;", "minSize", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "popupContentPadding", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "maxPopupHeight", "<init>", "(JJLandroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArrowAreaSize-MYxV2XQ", "()J", "J", "getMinSize-MYxV2XQ", "getCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getPopupContentPadding", "getBorderWidth-D9Ej5fM", "()F", "F", "getMaxPopupHeight-D9Ej5fM", "Companion", "ui"})
/*     */ @Stable
/*     */ public final class ComboBoxMetrics
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long arrowAreaSize;
/*     */   private final long minSize;
/*     */   @NotNull
/*     */   private final CornerSize cornerSize;
/*     */   @NotNull
/*     */   private final PaddingValues contentPadding;
/*     */   @NotNull
/*     */   private final PaddingValues popupContentPadding;
/*     */   private final float borderWidth;
/*     */   private final float maxPopupHeight;
/*     */   public static final int $stable;
/*     */   
/*     */   private ComboBoxMetrics(long arrowAreaSize, long minSize, CornerSize cornerSize, PaddingValues contentPadding, PaddingValues popupContentPadding, float borderWidth, float maxPopupHeight) {
/*  97 */     this.arrowAreaSize = arrowAreaSize;
/*  98 */     this.minSize = minSize;
/*  99 */     this.cornerSize = cornerSize;
/* 100 */     this.contentPadding = contentPadding;
/* 101 */     this.popupContentPadding = popupContentPadding;
/* 102 */     this.borderWidth = borderWidth;
/* 103 */     this.maxPopupHeight = maxPopupHeight; } public final float getMaxPopupHeight-D9Ej5fM() { return this.maxPopupHeight; }
/*     */ 
/*     */   
/*     */   public final long getArrowAreaSize-MYxV2XQ() {
/*     */     return this.arrowAreaSize;
/*     */   }
/*     */   
/*     */   public final long getMinSize-MYxV2XQ() {
/*     */     return this.minSize;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CornerSize getCornerSize() {
/*     */     return this.cornerSize;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues getContentPadding() {
/*     */     return this.contentPadding;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues getPopupContentPadding() {
/*     */     return this.popupContentPadding;
/*     */   }
/*     */   
/*     */   public final float getBorderWidth-D9Ej5fM() {
/*     */     return this.borderWidth;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ComboBoxMetrics))
/*     */       return false; 
/*     */     ComboBoxMetrics comboBoxMetrics = (ComboBoxMetrics)other;
/*     */     return !DpSize.equals-impl0(this.arrowAreaSize, comboBoxMetrics.arrowAreaSize) ? false : (!DpSize.equals-impl0(this.minSize, comboBoxMetrics.minSize) ? false : (!Intrinsics.areEqual(this.cornerSize, comboBoxMetrics.cornerSize) ? false : (!Intrinsics.areEqual(this.contentPadding, comboBoxMetrics.contentPadding) ? false : (!Intrinsics.areEqual(this.popupContentPadding, comboBoxMetrics.popupContentPadding) ? false : (!Dp.equals-impl0(this.borderWidth, comboBoxMetrics.borderWidth) ? false : (!!Dp.equals-impl0(this.maxPopupHeight, comboBoxMetrics.maxPopupHeight)))))));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = DpSize.hashCode-impl(this.arrowAreaSize);
/*     */     result = result * 31 + DpSize.hashCode-impl(this.minSize);
/*     */     result = result * 31 + this.cornerSize.hashCode();
/*     */     result = result * 31 + this.contentPadding.hashCode();
/*     */     result = result * 31 + this.popupContentPadding.hashCode();
/*     */     result = result * 31 + Dp.hashCode-impl(this.borderWidth);
/*     */     return result * 31 + Dp.hashCode-impl(this.maxPopupHeight);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ComboBoxMetrics(arrowAreaSize=" + DpSize.toString-impl(this.arrowAreaSize) + ", minSize=" + DpSize.toString-impl(this.minSize) + ", cornerSize=" + this.cornerSize + ", contentPadding=" + this.contentPadding + ", popupContentPadding=" + this.popupContentPadding + ", borderWidth=" + Dp.toString-impl(this.borderWidth) + ", maxPopupHeight=" + Dp.toString-impl(this.maxPopupHeight) + ")";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics$Companion;", "", "<init>", "()V", "ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\ComboBoxMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */