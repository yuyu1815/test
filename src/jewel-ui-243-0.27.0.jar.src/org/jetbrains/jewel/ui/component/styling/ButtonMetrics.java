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
/*     */ 
/*     */ 
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\020\b\007\030\000 \0302\0020\001:\001\030B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\t¢\006\004\b\013\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020R\023\020\006\032\0020\007¢\006\n\n\002\020\023\032\004\b\021\020\022R\023\020\b\032\0020\t¢\006\n\n\002\020\026\032\004\b\024\020\025R\023\020\n\032\0020\t¢\006\n\n\002\020\026\032\004\b\027\020\025¨\006\031"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ButtonMetrics;", "", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "padding", "Landroidx/compose/foundation/layout/PaddingValues;", "minSize", "Landroidx/compose/ui/unit/DpSize;", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "focusOutlineExpand", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;JFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getMinSize-MYxV2XQ", "()J", "J", "getBorderWidth-D9Ej5fM", "()F", "F", "getFocusOutlineExpand-D9Ej5fM", "Companion", "ui"})
/*     */ @Stable
/*     */ public final class ButtonMetrics
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final CornerSize cornerSize;
/*     */   @NotNull
/*     */   private final PaddingValues padding;
/*     */   private final long minSize;
/*     */   private final float borderWidth;
/*     */   private final float focusOutlineExpand;
/*     */   public static final int $stable;
/*     */   
/*     */   private ButtonMetrics(CornerSize cornerSize, PaddingValues padding, long minSize, float borderWidth, float focusOutlineExpand) {
/* 105 */     this.cornerSize = cornerSize;
/* 106 */     this.padding = padding;
/* 107 */     this.minSize = minSize;
/* 108 */     this.borderWidth = borderWidth;
/* 109 */     this.focusOutlineExpand = focusOutlineExpand; } public final float getFocusOutlineExpand-D9Ej5fM() { return this.focusOutlineExpand; }
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
/*     */   public final long getMinSize-MYxV2XQ() {
/*     */     return this.minSize;
/*     */   }
/*     */   
/*     */   public final float getBorderWidth-D9Ej5fM() {
/*     */     return this.borderWidth;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ButtonMetrics))
/*     */       return false; 
/*     */     ButtonMetrics buttonMetrics = (ButtonMetrics)other;
/*     */     return !Intrinsics.areEqual(this.cornerSize, buttonMetrics.cornerSize) ? false : (!Intrinsics.areEqual(this.padding, buttonMetrics.padding) ? false : (!DpSize.equals-impl0(this.minSize, buttonMetrics.minSize) ? false : (!Dp.equals-impl0(this.borderWidth, buttonMetrics.borderWidth) ? false : (!!Dp.equals-impl0(this.focusOutlineExpand, buttonMetrics.focusOutlineExpand)))));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.cornerSize.hashCode();
/*     */     result = result * 31 + this.padding.hashCode();
/*     */     result = result * 31 + DpSize.hashCode-impl(this.minSize);
/*     */     result = result * 31 + Dp.hashCode-impl(this.borderWidth);
/*     */     return result * 31 + Dp.hashCode-impl(this.focusOutlineExpand);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ButtonMetrics(cornerSize=" + this.cornerSize + ", padding=" + this.padding + ", minSize=" + DpSize.toString-impl(this.minSize) + ", borderWidth=" + Dp.toString-impl(this.borderWidth) + ", focusOutlineExpand=" + Dp.toString-impl(this.focusOutlineExpand) + ")";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ButtonMetrics$Companion;", "", "<init>", "()V", "ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\ButtonMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */