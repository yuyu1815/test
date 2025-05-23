/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import androidx.compose.ui.unit.DpSize;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\022\b\007\030\000 \0262\0020\001:\001\026B7\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\003¢\006\004\b\n\020\013R\023\020\002\032\0020\003¢\006\n\n\002\020\016\032\004\b\f\020\rR\023\020\004\032\0020\005¢\006\n\n\002\020\021\032\004\b\017\020\020R\023\020\006\032\0020\003¢\006\n\n\002\020\016\032\004\b\022\020\rR\023\020\007\032\0020\003¢\006\n\n\002\020\016\032\004\b\023\020\rR\023\020\b\032\0020\003¢\006\n\n\002\020\016\032\004\b\024\020\rR\023\020\t\032\0020\003¢\006\n\n\002\020\016\032\004\b\025\020\r¨\006\027"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;", "", "trackHeight", "Landroidx/compose/ui/unit/Dp;", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "thumbBorderWidth", "stepLineHeight", "stepLineWidth", "trackToStepSpacing", "<init>", "(FJFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTrackHeight-D9Ej5fM", "()F", "F", "getThumbSize-MYxV2XQ", "()J", "J", "getThumbBorderWidth-D9Ej5fM", "getStepLineHeight-D9Ej5fM", "getStepLineWidth-D9Ej5fM", "getTrackToStepSpacing-D9Ej5fM", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class SliderMetrics
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final float trackHeight;
/*    */   private final long thumbSize;
/*    */   private final float thumbBorderWidth;
/*    */   private final float stepLineHeight;
/*    */   private final float stepLineWidth;
/*    */   private final float trackToStepSpacing;
/*    */   public static final int $stable;
/*    */   
/*    */   private SliderMetrics(float trackHeight, long thumbSize, float thumbBorderWidth, float stepLineHeight, float stepLineWidth, float trackToStepSpacing) {
/* 93 */     this.trackHeight = trackHeight;
/* 94 */     this.thumbSize = thumbSize;
/* 95 */     this.thumbBorderWidth = thumbBorderWidth;
/* 96 */     this.stepLineHeight = stepLineHeight;
/* 97 */     this.stepLineWidth = stepLineWidth;
/* 98 */     this.trackToStepSpacing = trackToStepSpacing; } public final float getTrackToStepSpacing-D9Ej5fM() { return this.trackToStepSpacing; }
/*    */ 
/*    */   
/*    */   public final float getTrackHeight-D9Ej5fM() {
/*    */     return this.trackHeight;
/*    */   }
/*    */   
/*    */   public final long getThumbSize-MYxV2XQ() {
/*    */     return this.thumbSize;
/*    */   }
/*    */   
/*    */   public final float getThumbBorderWidth-D9Ej5fM() {
/*    */     return this.thumbBorderWidth;
/*    */   }
/*    */   
/*    */   public final float getStepLineHeight-D9Ej5fM() {
/*    */     return this.stepLineHeight;
/*    */   }
/*    */   
/*    */   public final float getStepLineWidth-D9Ej5fM() {
/*    */     return this.stepLineWidth;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SliderMetrics))
/*    */       return false; 
/*    */     SliderMetrics sliderMetrics = (SliderMetrics)other;
/*    */     return !Dp.equals-impl0(this.trackHeight, sliderMetrics.trackHeight) ? false : (!DpSize.equals-impl0(this.thumbSize, sliderMetrics.thumbSize) ? false : (!Dp.equals-impl0(this.thumbBorderWidth, sliderMetrics.thumbBorderWidth) ? false : (!Dp.equals-impl0(this.stepLineHeight, sliderMetrics.stepLineHeight) ? false : (!Dp.equals-impl0(this.stepLineWidth, sliderMetrics.stepLineWidth) ? false : (!!Dp.equals-impl0(this.trackToStepSpacing, sliderMetrics.trackToStepSpacing))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Dp.hashCode-impl(this.trackHeight);
/*    */     result = result * 31 + DpSize.hashCode-impl(this.thumbSize);
/*    */     result = result * 31 + Dp.hashCode-impl(this.thumbBorderWidth);
/*    */     result = result * 31 + Dp.hashCode-impl(this.stepLineHeight);
/*    */     result = result * 31 + Dp.hashCode-impl(this.stepLineWidth);
/*    */     return result * 31 + Dp.hashCode-impl(this.trackToStepSpacing);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SliderMetrics(trackHeight=" + Dp.toString-impl(this.trackHeight) + ", thumbSize=" + DpSize.toString-impl(this.thumbSize) + ", thumbBorderWidth=" + Dp.toString-impl(this.thumbBorderWidth) + ", stepLineHeight=" + Dp.toString-impl(this.stepLineHeight) + ", stepLineWidth=" + Dp.toString-impl(this.stepLineWidth) + ", trackToStepSpacing=" + Dp.toString-impl(this.trackToStepSpacing) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\SliderMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */