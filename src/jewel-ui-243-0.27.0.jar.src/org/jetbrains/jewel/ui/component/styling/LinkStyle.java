/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\b\007\030\000 \0242\0020\001:\001\024B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\022\020\023¨\006\025"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;", "", "colors", "Lorg/jetbrains/jewel/ui/component/styling/LinkColors;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/LinkMetrics;", "icons", "Lorg/jetbrains/jewel/ui/component/styling/LinkIcons;", "underlineBehavior", "Lorg/jetbrains/jewel/ui/component/styling/LinkUnderlineBehavior;", "<init>", "(Lorg/jetbrains/jewel/ui/component/styling/LinkColors;Lorg/jetbrains/jewel/ui/component/styling/LinkMetrics;Lorg/jetbrains/jewel/ui/component/styling/LinkIcons;Lorg/jetbrains/jewel/ui/component/styling/LinkUnderlineBehavior;)V", "getColors", "()Lorg/jetbrains/jewel/ui/component/styling/LinkColors;", "getMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/LinkMetrics;", "getIcons", "()Lorg/jetbrains/jewel/ui/component/styling/LinkIcons;", "getUnderlineBehavior", "()Lorg/jetbrains/jewel/ui/component/styling/LinkUnderlineBehavior;", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class LinkStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final LinkColors colors;
/*    */   @NotNull
/*    */   private final LinkMetrics metrics;
/*    */   
/* 20 */   public LinkStyle(@NotNull LinkColors colors, @NotNull LinkMetrics metrics, @NotNull LinkIcons icons, @NotNull LinkUnderlineBehavior underlineBehavior) { this.colors = colors;
/* 21 */     this.metrics = metrics;
/* 22 */     this.icons = icons;
/* 23 */     this.underlineBehavior = underlineBehavior; } @NotNull private final LinkIcons icons; @NotNull private final LinkUnderlineBehavior underlineBehavior; public static final int $stable; @NotNull public final LinkUnderlineBehavior getUnderlineBehavior() { return this.underlineBehavior; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final LinkColors getColors() {
/*    */     return this.colors;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LinkMetrics getMetrics() {
/*    */     return this.metrics;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LinkIcons getIcons() {
/*    */     return this.icons;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LinkStyle))
/*    */       return false; 
/*    */     LinkStyle linkStyle = (LinkStyle)other;
/*    */     return !Intrinsics.areEqual(this.colors, linkStyle.colors) ? false : (!Intrinsics.areEqual(this.metrics, linkStyle.metrics) ? false : (!Intrinsics.areEqual(this.icons, linkStyle.icons) ? false : (!(this.underlineBehavior != linkStyle.underlineBehavior))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.colors.hashCode();
/*    */     result = result * 31 + this.metrics.hashCode();
/*    */     result = result * 31 + this.icons.hashCode();
/*    */     return result * 31 + this.underlineBehavior.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LinkStyle(colors=" + this.colors + ", metrics=" + this.metrics + ", icons=" + this.icons + ", underlineBehavior=" + this.underlineBehavior + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/LinkStyle$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\LinkStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */