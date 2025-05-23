/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\007\b\007\030\000 \t2\0020\001:\001\tB\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\023\020\002\032\0020\003¢\006\n\n\002\020\b\032\004\b\006\020\007¨\006\n"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/BannerMetrics;", "", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBorderWidth-D9Ej5fM", "()F", "F", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class BannerMetrics
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final float borderWidth;
/*    */   public static final int $stable;
/*    */   
/*    */   private BannerMetrics(float borderWidth) {
/* 36 */     this.borderWidth = borderWidth; } public final float getBorderWidth-D9Ej5fM() { return this.borderWidth; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof BannerMetrics))
/*    */       return false; 
/*    */     BannerMetrics bannerMetrics = (BannerMetrics)other;
/*    */     return !!Dp.equals-impl0(this.borderWidth, bannerMetrics.borderWidth);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return Dp.hashCode-impl(this.borderWidth);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "BannerMetrics(borderWidth=" + Dp.toString-impl(this.borderWidth) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/BannerMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\BannerMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */