/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\b\007\030\000 \0242\0020\001:\001\024B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\022\020\023¨\006\025"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;", "", "colors", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarColors;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarMetrics;", "trackClickBehavior", "Lorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;", "scrollbarVisibility", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;", "<init>", "(Lorg/jetbrains/jewel/ui/component/styling/ScrollbarColors;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarMetrics;Lorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;)V", "getColors", "()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarColors;", "getMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarMetrics;", "getTrackClickBehavior", "()Lorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;", "getScrollbarVisibility", "()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class ScrollbarStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final ScrollbarColors colors;
/*    */   @NotNull
/*    */   private final ScrollbarMetrics metrics;
/*    */   
/* 18 */   public ScrollbarStyle(@NotNull ScrollbarColors colors, @NotNull ScrollbarMetrics metrics, @NotNull TrackClickBehavior trackClickBehavior, @NotNull ScrollbarVisibility scrollbarVisibility) { this.colors = colors;
/* 19 */     this.metrics = metrics;
/* 20 */     this.trackClickBehavior = trackClickBehavior;
/* 21 */     this.scrollbarVisibility = scrollbarVisibility; } @NotNull private final TrackClickBehavior trackClickBehavior; @NotNull private final ScrollbarVisibility scrollbarVisibility; public static final int $stable; @NotNull public final ScrollbarColors getColors() { return this.colors; } @NotNull public final ScrollbarVisibility getScrollbarVisibility() { return this.scrollbarVisibility; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ScrollbarMetrics getMetrics() {
/*    */     return this.metrics;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TrackClickBehavior getTrackClickBehavior() {
/*    */     return this.trackClickBehavior;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ScrollbarStyle))
/*    */       return false; 
/*    */     ScrollbarStyle scrollbarStyle = (ScrollbarStyle)other;
/*    */     return !Intrinsics.areEqual(this.colors, scrollbarStyle.colors) ? false : (!Intrinsics.areEqual(this.metrics, scrollbarStyle.metrics) ? false : ((this.trackClickBehavior != scrollbarStyle.trackClickBehavior) ? false : (!!Intrinsics.areEqual(this.scrollbarVisibility, scrollbarStyle.scrollbarVisibility))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.colors.hashCode();
/*    */     result = result * 31 + this.metrics.hashCode();
/*    */     result = result * 31 + this.trackClickBehavior.hashCode();
/*    */     return result * 31 + this.scrollbarVisibility.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ScrollbarStyle(colors=" + this.colors + ", metrics=" + this.metrics + ", trackClickBehavior=" + this.trackClickBehavior + ", scrollbarVisibility=" + this.scrollbarVisibility + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\ScrollbarStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */