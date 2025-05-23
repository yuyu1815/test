/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Stable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\013\b\007\030\000 \0232\0020\001:\001\023B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\017\020\020R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\021\020\022¨\006\024"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;", "", "isDark", "", "colors", "Lorg/jetbrains/jewel/ui/component/styling/MenuColors;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;", "icons", "Lorg/jetbrains/jewel/ui/component/styling/MenuIcons;", "<init>", "(ZLorg/jetbrains/jewel/ui/component/styling/MenuColors;Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;Lorg/jetbrains/jewel/ui/component/styling/MenuIcons;)V", "()Z", "getColors", "()Lorg/jetbrains/jewel/ui/component/styling/MenuColors;", "getMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;", "getIcons", "()Lorg/jetbrains/jewel/ui/component/styling/MenuIcons;", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class MenuStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final boolean isDark;
/*    */   @NotNull
/*    */   private final MenuColors colors;
/*    */   
/*    */   public MenuStyle(boolean isDark, @NotNull MenuColors colors, @NotNull MenuMetrics metrics, @NotNull MenuIcons icons) {
/* 22 */     this.isDark = isDark;
/* 23 */     this.colors = colors;
/* 24 */     this.metrics = metrics;
/* 25 */     this.icons = icons; } @NotNull private final MenuMetrics metrics; @NotNull private final MenuIcons icons; public static final int $stable; @NotNull public final MenuIcons getIcons() { return this.icons; }
/*    */ 
/*    */   
/*    */   public final boolean isDark() {
/*    */     return this.isDark;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MenuColors getColors() {
/*    */     return this.colors;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MenuMetrics getMetrics() {
/*    */     return this.metrics;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof MenuStyle))
/*    */       return false; 
/*    */     MenuStyle menuStyle = (MenuStyle)other;
/*    */     return (this.isDark != menuStyle.isDark) ? false : (!Intrinsics.areEqual(this.colors, menuStyle.colors) ? false : (!Intrinsics.areEqual(this.metrics, menuStyle.metrics) ? false : (!!Intrinsics.areEqual(this.icons, menuStyle.icons))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Boolean.hashCode(this.isDark);
/*    */     result = result * 31 + this.colors.hashCode();
/*    */     result = result * 31 + this.metrics.hashCode();
/*    */     return result * 31 + this.icons.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "MenuStyle(isDark=" + this.isDark + ", colors=" + this.colors + ", metrics=" + this.metrics + ", icons=" + this.icons + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/MenuStyle$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\MenuStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */