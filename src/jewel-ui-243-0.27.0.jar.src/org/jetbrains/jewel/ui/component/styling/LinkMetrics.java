/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.foundation.shape.CornerSize;
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import androidx.compose.ui.unit.DpSize;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\b\007\030\000 \0222\0020\001:\001\022B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\023\020\004\032\0020\005¢\006\n\n\002\020\016\032\004\b\f\020\rR\023\020\006\032\0020\007¢\006\n\n\002\020\021\032\004\b\017\020\020¨\006\023"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/LinkMetrics;", "", "focusHaloCornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "textIconGap", "Landroidx/compose/ui/unit/Dp;", "iconSize", "Landroidx/compose/ui/unit/DpSize;", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;FJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFocusHaloCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getTextIconGap-D9Ej5fM", "()F", "F", "getIconSize-MYxV2XQ", "()J", "J", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class LinkMetrics
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final CornerSize focusHaloCornerSize;
/*    */   private final float textIconGap;
/*    */   private final long iconSize;
/*    */   public static final int $stable;
/*    */   
/*    */   private LinkMetrics(CornerSize focusHaloCornerSize, float textIconGap, long iconSize) {
/* 58 */     this.focusHaloCornerSize = focusHaloCornerSize;
/* 59 */     this.textIconGap = textIconGap;
/* 60 */     this.iconSize = iconSize; } public final long getIconSize-MYxV2XQ() { return this.iconSize; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final CornerSize getFocusHaloCornerSize() {
/*    */     return this.focusHaloCornerSize;
/*    */   }
/*    */   
/*    */   public final float getTextIconGap-D9Ej5fM() {
/*    */     return this.textIconGap;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LinkMetrics))
/*    */       return false; 
/*    */     LinkMetrics linkMetrics = (LinkMetrics)other;
/*    */     return !Intrinsics.areEqual(this.focusHaloCornerSize, linkMetrics.focusHaloCornerSize) ? false : (!Dp.equals-impl0(this.textIconGap, linkMetrics.textIconGap) ? false : (!!DpSize.equals-impl0(this.iconSize, linkMetrics.iconSize)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.focusHaloCornerSize.hashCode();
/*    */     result = result * 31 + Dp.hashCode-impl(this.textIconGap);
/*    */     return result * 31 + DpSize.hashCode-impl(this.iconSize);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LinkMetrics(focusHaloCornerSize=" + this.focusHaloCornerSize + ", textIconGap=" + Dp.toString-impl(this.textIconGap) + ", iconSize=" + DpSize.toString-impl(this.iconSize) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/LinkMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\LinkMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */