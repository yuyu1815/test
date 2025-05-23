/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.foundation.layout.PaddingValues;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.unit.Dp;
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
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\017\b\007\030\000 \0232\0020\001:\001\023B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003¢\006\004\b\t\020\nR\023\020\002\032\0020\003¢\006\n\n\002\020\r\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\023\020\006\032\0020\003¢\006\n\n\002\020\r\032\004\b\020\020\fR\023\020\007\032\0020\003¢\006\n\n\002\020\r\032\004\b\021\020\fR\023\020\b\032\0020\003¢\006\n\n\002\020\r\032\004\b\022\020\f¨\006\024"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;", "", "underlineThickness", "Landroidx/compose/ui/unit/Dp;", "tabPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "tabHeight", "tabContentSpacing", "closeContentGap", "<init>", "(FLandroidx/compose/foundation/layout/PaddingValues;FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getUnderlineThickness-D9Ej5fM", "()F", "F", "getTabPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getTabHeight-D9Ej5fM", "getTabContentSpacing-D9Ej5fM", "getCloseContentGap-D9Ej5fM", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class TabMetrics
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final float underlineThickness;
/*    */   @NotNull
/*    */   private final PaddingValues tabPadding;
/*    */   private final float tabHeight;
/*    */   private final float tabContentSpacing;
/*    */   private final float closeContentGap;
/*    */   public static final int $stable;
/*    */   
/*    */   private TabMetrics(float underlineThickness, PaddingValues tabPadding, float tabHeight, float tabContentSpacing, float closeContentGap) {
/* 32 */     this.underlineThickness = underlineThickness;
/* 33 */     this.tabPadding = tabPadding;
/* 34 */     this.tabHeight = tabHeight;
/* 35 */     this.tabContentSpacing = tabContentSpacing;
/* 36 */     this.closeContentGap = closeContentGap; } public final float getCloseContentGap-D9Ej5fM() { return this.closeContentGap; }
/*    */ 
/*    */   
/*    */   public final float getUnderlineThickness-D9Ej5fM() {
/*    */     return this.underlineThickness;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PaddingValues getTabPadding() {
/*    */     return this.tabPadding;
/*    */   }
/*    */   
/*    */   public final float getTabHeight-D9Ej5fM() {
/*    */     return this.tabHeight;
/*    */   }
/*    */   
/*    */   public final float getTabContentSpacing-D9Ej5fM() {
/*    */     return this.tabContentSpacing;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TabMetrics))
/*    */       return false; 
/*    */     TabMetrics tabMetrics = (TabMetrics)other;
/*    */     return !Dp.equals-impl0(this.underlineThickness, tabMetrics.underlineThickness) ? false : (!Intrinsics.areEqual(this.tabPadding, tabMetrics.tabPadding) ? false : (!Dp.equals-impl0(this.tabHeight, tabMetrics.tabHeight) ? false : (!Dp.equals-impl0(this.tabContentSpacing, tabMetrics.tabContentSpacing) ? false : (!!Dp.equals-impl0(this.closeContentGap, tabMetrics.closeContentGap)))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Dp.hashCode-impl(this.underlineThickness);
/*    */     result = result * 31 + this.tabPadding.hashCode();
/*    */     result = result * 31 + Dp.hashCode-impl(this.tabHeight);
/*    */     result = result * 31 + Dp.hashCode-impl(this.tabContentSpacing);
/*    */     return result * 31 + Dp.hashCode-impl(this.closeContentGap);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TabMetrics(underlineThickness=" + Dp.toString-impl(this.underlineThickness) + ", tabPadding=" + this.tabPadding + ", tabHeight=" + Dp.toString-impl(this.tabHeight) + ", tabContentSpacing=" + Dp.toString-impl(this.tabContentSpacing) + ", closeContentGap=" + Dp.toString-impl(this.closeContentGap) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TabMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\TabMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */