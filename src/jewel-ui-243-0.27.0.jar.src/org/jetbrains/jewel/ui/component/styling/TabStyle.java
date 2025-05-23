/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\016\b\007\030\000 \0302\0020\001:\001\030B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\004\b\f\020\rR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\022\020\023R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\024\020\025R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\026\020\027¨\006\031"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TabStyle;", "", "colors", "Lorg/jetbrains/jewel/ui/component/styling/TabColors;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;", "icons", "Lorg/jetbrains/jewel/ui/component/styling/TabIcons;", "contentAlpha", "Lorg/jetbrains/jewel/ui/component/styling/TabContentAlpha;", "scrollbarStyle", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;", "<init>", "(Lorg/jetbrains/jewel/ui/component/styling/TabColors;Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;Lorg/jetbrains/jewel/ui/component/styling/TabIcons;Lorg/jetbrains/jewel/ui/component/styling/TabContentAlpha;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;)V", "getColors", "()Lorg/jetbrains/jewel/ui/component/styling/TabColors;", "getMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;", "getIcons", "()Lorg/jetbrains/jewel/ui/component/styling/TabIcons;", "getContentAlpha", "()Lorg/jetbrains/jewel/ui/component/styling/TabContentAlpha;", "getScrollbarStyle", "()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class TabStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final TabColors colors;
/*    */   @NotNull
/*    */   private final TabMetrics metrics;
/*    */   
/* 20 */   public TabStyle(@NotNull TabColors colors, @NotNull TabMetrics metrics, @NotNull TabIcons icons, @NotNull TabContentAlpha contentAlpha, @NotNull ScrollbarStyle scrollbarStyle) { this.colors = colors;
/* 21 */     this.metrics = metrics;
/* 22 */     this.icons = icons;
/* 23 */     this.contentAlpha = contentAlpha;
/* 24 */     this.scrollbarStyle = scrollbarStyle; } @NotNull private final TabIcons icons; @NotNull private final TabContentAlpha contentAlpha; @NotNull private final ScrollbarStyle scrollbarStyle; public static final int $stable; @NotNull public final TabColors getColors() { return this.colors; } @NotNull public final ScrollbarStyle getScrollbarStyle() { return this.scrollbarStyle; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TabMetrics getMetrics() {
/*    */     return this.metrics;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TabIcons getIcons() {
/*    */     return this.icons;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TabContentAlpha getContentAlpha() {
/*    */     return this.contentAlpha;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TabStyle))
/*    */       return false; 
/*    */     TabStyle tabStyle = (TabStyle)other;
/*    */     return !Intrinsics.areEqual(this.colors, tabStyle.colors) ? false : (!Intrinsics.areEqual(this.metrics, tabStyle.metrics) ? false : (!Intrinsics.areEqual(this.icons, tabStyle.icons) ? false : (!Intrinsics.areEqual(this.contentAlpha, tabStyle.contentAlpha) ? false : (!!Intrinsics.areEqual(this.scrollbarStyle, tabStyle.scrollbarStyle)))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.colors.hashCode();
/*    */     result = result * 31 + this.metrics.hashCode();
/*    */     result = result * 31 + this.icons.hashCode();
/*    */     result = result * 31 + this.contentAlpha.hashCode();
/*    */     return result * 31 + this.scrollbarStyle.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TabStyle(colors=" + this.colors + ", metrics=" + this.metrics + ", icons=" + this.icons + ", contentAlpha=" + this.contentAlpha + ", scrollbarStyle=" + this.scrollbarStyle + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TabStyle$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\TabStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */