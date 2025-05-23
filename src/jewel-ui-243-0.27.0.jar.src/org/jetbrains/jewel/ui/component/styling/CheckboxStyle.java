/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\b\007\030\000 \0202\0020\001:\001\020B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\021"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/CheckboxStyle;", "", "colors", "Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;", "icons", "Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;", "<init>", "(Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;)V", "getColors", "()Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;", "getMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;", "getIcons", "()Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class CheckboxStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final CheckboxColors colors;
/*    */   
/*    */   public CheckboxStyle(@NotNull CheckboxColors colors, @NotNull CheckboxMetrics metrics, @NotNull CheckboxIcons icons) {
/* 21 */     this.colors = colors;
/* 22 */     this.metrics = metrics;
/* 23 */     this.icons = icons; } @NotNull private final CheckboxMetrics metrics; @NotNull private final CheckboxIcons icons; public static final int $stable; @NotNull public final CheckboxIcons getIcons() { return this.icons; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final CheckboxColors getColors() {
/*    */     return this.colors;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CheckboxMetrics getMetrics() {
/*    */     return this.metrics;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CheckboxStyle))
/*    */       return false; 
/*    */     CheckboxStyle checkboxStyle = (CheckboxStyle)other;
/*    */     return !Intrinsics.areEqual(this.colors, checkboxStyle.colors) ? false : (!Intrinsics.areEqual(this.metrics, checkboxStyle.metrics) ? false : (!!Intrinsics.areEqual(this.icons, checkboxStyle.icons)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.colors.hashCode();
/*    */     result = result * 31 + this.metrics.hashCode();
/*    */     return result * 31 + this.icons.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CheckboxStyle(colors=" + this.colors + ", metrics=" + this.metrics + ", icons=" + this.icons + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/CheckboxStyle$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\CheckboxStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */