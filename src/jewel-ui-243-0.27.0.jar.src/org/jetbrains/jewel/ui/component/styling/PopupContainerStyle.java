/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\b\007\030\000 \0172\0020\001:\001\017B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\r\020\016¨\006\020"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/PopupContainerStyle;", "", "isDark", "", "colors", "Lorg/jetbrains/jewel/ui/component/styling/PopupContainerColors;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/PopupContainerMetrics;", "<init>", "(ZLorg/jetbrains/jewel/ui/component/styling/PopupContainerColors;Lorg/jetbrains/jewel/ui/component/styling/PopupContainerMetrics;)V", "()Z", "getColors", "()Lorg/jetbrains/jewel/ui/component/styling/PopupContainerColors;", "getMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/PopupContainerMetrics;", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class PopupContainerStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final boolean isDark;
/*    */   
/* 17 */   public PopupContainerStyle(boolean isDark, @NotNull PopupContainerColors colors, @NotNull PopupContainerMetrics metrics) { this.isDark = isDark;
/* 18 */     this.colors = colors;
/* 19 */     this.metrics = metrics; } @NotNull private final PopupContainerColors colors; @NotNull private final PopupContainerMetrics metrics; public static final int $stable; @NotNull public final PopupContainerMetrics getMetrics() { return this.metrics; }
/*    */ 
/*    */   
/*    */   public final boolean isDark() {
/*    */     return this.isDark;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PopupContainerColors getColors() {
/*    */     return this.colors;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof PopupContainerStyle))
/*    */       return false; 
/*    */     PopupContainerStyle popupContainerStyle = (PopupContainerStyle)other;
/*    */     return (this.isDark != popupContainerStyle.isDark) ? false : (!Intrinsics.areEqual(this.colors, popupContainerStyle.colors) ? false : (!!Intrinsics.areEqual(this.metrics, popupContainerStyle.metrics)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Boolean.hashCode(this.isDark);
/*    */     result = result * 31 + this.colors.hashCode();
/*    */     return result * 31 + this.metrics.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "PopupContainerStyle(isDark=" + this.isDark + ", colors=" + this.colors + ", metrics=" + this.metrics + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/PopupContainerStyle$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\PopupContainerStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */