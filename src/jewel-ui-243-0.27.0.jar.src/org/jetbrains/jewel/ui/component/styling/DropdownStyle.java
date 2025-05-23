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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\b\007\030\000 \0242\0020\001:\001\024B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\022\020\023¨\006\025"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;", "", "colors", "Lorg/jetbrains/jewel/ui/component/styling/DropdownColors;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/DropdownMetrics;", "icons", "Lorg/jetbrains/jewel/ui/component/styling/DropdownIcons;", "menuStyle", "Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;", "<init>", "(Lorg/jetbrains/jewel/ui/component/styling/DropdownColors;Lorg/jetbrains/jewel/ui/component/styling/DropdownMetrics;Lorg/jetbrains/jewel/ui/component/styling/DropdownIcons;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;)V", "getColors", "()Lorg/jetbrains/jewel/ui/component/styling/DropdownColors;", "getMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/DropdownMetrics;", "getIcons", "()Lorg/jetbrains/jewel/ui/component/styling/DropdownIcons;", "getMenuStyle", "()Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class DropdownStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final DropdownColors colors;
/*    */   @NotNull
/*    */   private final DropdownMetrics metrics;
/*    */   
/* 22 */   public DropdownStyle(@NotNull DropdownColors colors, @NotNull DropdownMetrics metrics, @NotNull DropdownIcons icons, @NotNull MenuStyle menuStyle) { this.colors = colors;
/* 23 */     this.metrics = metrics;
/* 24 */     this.icons = icons;
/* 25 */     this.menuStyle = menuStyle; } @NotNull private final DropdownIcons icons; @NotNull private final MenuStyle menuStyle; public static final int $stable; @NotNull public final MenuStyle getMenuStyle() { return this.menuStyle; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final DropdownColors getColors() {
/*    */     return this.colors;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DropdownMetrics getMetrics() {
/*    */     return this.metrics;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DropdownIcons getIcons() {
/*    */     return this.icons;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof DropdownStyle))
/*    */       return false; 
/*    */     DropdownStyle dropdownStyle = (DropdownStyle)other;
/*    */     return !Intrinsics.areEqual(this.colors, dropdownStyle.colors) ? false : (!Intrinsics.areEqual(this.metrics, dropdownStyle.metrics) ? false : (!Intrinsics.areEqual(this.icons, dropdownStyle.icons) ? false : (!!Intrinsics.areEqual(this.menuStyle, dropdownStyle.menuStyle))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.colors.hashCode();
/*    */     result = result * 31 + this.metrics.hashCode();
/*    */     result = result * 31 + this.icons.hashCode();
/*    */     return result * 31 + this.menuStyle.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DropdownStyle(colors=" + this.colors + ", metrics=" + this.metrics + ", icons=" + this.icons + ", menuStyle=" + this.menuStyle + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\DropdownStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */