/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import kotlin.time.Duration;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\013\b\007\030\000 \0212\0020\001:\001\021B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\023\020\006\032\0020\007¢\006\n\n\002\020\020\032\004\b\016\020\017¨\006\022"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;", "", "colors", "Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarColors;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarMetrics;", "indeterminateCycleDuration", "Lkotlin/time/Duration;", "<init>", "(Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarColors;Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarMetrics;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColors", "()Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarColors;", "getMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarMetrics;", "getIndeterminateCycleDuration-UwyO8pc", "()J", "J", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class HorizontalProgressBarStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final HorizontalProgressBarColors colors;
/*    */   
/* 15 */   private HorizontalProgressBarStyle(HorizontalProgressBarColors colors, HorizontalProgressBarMetrics metrics, long indeterminateCycleDuration) { this.colors = colors;
/* 16 */     this.metrics = metrics;
/* 17 */     this.indeterminateCycleDuration = indeterminateCycleDuration; } @NotNull private final HorizontalProgressBarMetrics metrics; private final long indeterminateCycleDuration; public static final int $stable; @NotNull public final HorizontalProgressBarColors getColors() { return this.colors; } public final long getIndeterminateCycleDuration-UwyO8pc() { return this.indeterminateCycleDuration; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final HorizontalProgressBarMetrics getMetrics() {
/*    */     return this.metrics;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof HorizontalProgressBarStyle))
/*    */       return false; 
/*    */     HorizontalProgressBarStyle horizontalProgressBarStyle = (HorizontalProgressBarStyle)other;
/*    */     return !Intrinsics.areEqual(this.colors, horizontalProgressBarStyle.colors) ? false : (!Intrinsics.areEqual(this.metrics, horizontalProgressBarStyle.metrics) ? false : (!!Duration.equals-impl0(this.indeterminateCycleDuration, horizontalProgressBarStyle.indeterminateCycleDuration)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.colors.hashCode();
/*    */     result = result * 31 + this.metrics.hashCode();
/*    */     return result * 31 + Duration.hashCode-impl(this.indeterminateCycleDuration);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "HorizontalProgressBarStyle(colors=" + this.colors + ", metrics=" + this.metrics + ", indeterminateCycleDuration=" + Duration.toString-impl(this.indeterminateCycleDuration) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\HorizontalProgressBarStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */