/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.graphics.Shape;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\b\007\030\000 \0202\0020\001:\001\020B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\021"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;", "", "colors", "Lorg/jetbrains/jewel/ui/component/styling/SliderColors;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;", "thumbShape", "Landroidx/compose/ui/graphics/Shape;", "<init>", "(Lorg/jetbrains/jewel/ui/component/styling/SliderColors;Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;Landroidx/compose/ui/graphics/Shape;)V", "getColors", "()Lorg/jetbrains/jewel/ui/component/styling/SliderColors;", "getMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;", "getThumbShape", "()Landroidx/compose/ui/graphics/Shape;", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class SliderStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final SliderColors colors;
/*    */   
/* 21 */   public SliderStyle(@NotNull SliderColors colors, @NotNull SliderMetrics metrics, @NotNull Shape thumbShape) { this.colors = colors;
/* 22 */     this.metrics = metrics;
/* 23 */     this.thumbShape = thumbShape; } @NotNull private final SliderMetrics metrics; @NotNull private final Shape thumbShape; public static final int $stable; @NotNull public final Shape getThumbShape() { return this.thumbShape; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final SliderColors getColors() {
/*    */     return this.colors;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SliderMetrics getMetrics() {
/*    */     return this.metrics;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SliderStyle))
/*    */       return false; 
/*    */     SliderStyle sliderStyle = (SliderStyle)other;
/*    */     return !Intrinsics.areEqual(this.colors, sliderStyle.colors) ? false : (!Intrinsics.areEqual(this.metrics, sliderStyle.metrics) ? false : (!!Intrinsics.areEqual(this.thumbShape, sliderStyle.thumbShape)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.colors.hashCode();
/*    */     result = result * 31 + this.metrics.hashCode();
/*    */     return result * 31 + this.thumbShape.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SliderStyle(colors=" + this.colors + ", metrics=" + this.metrics + ", thumbShape=" + this.thumbShape + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SliderStyle$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\SliderStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */