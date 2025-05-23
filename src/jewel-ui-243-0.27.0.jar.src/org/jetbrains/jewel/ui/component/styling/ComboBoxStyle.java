/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\b\007\030\000 \0202\0020\001:\001\020B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\021"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;", "", "colors", "Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;", "icons", "Lorg/jetbrains/jewel/ui/component/styling/ComboBoxIcons;", "<init>", "(Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;Lorg/jetbrains/jewel/ui/component/styling/ComboBoxIcons;)V", "getColors", "()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;", "getMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;", "getIcons", "()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxIcons;", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class ComboBoxStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final ComboBoxColors colors;
/*    */   @NotNull
/*    */   private final ComboBoxMetrics metrics;
/*    */   @NotNull
/*    */   private final ComboBoxIcons icons;
/*    */   public static final int $stable;
/*    */   
/* 22 */   public ComboBoxStyle(@NotNull ComboBoxColors colors, @NotNull ComboBoxMetrics metrics, @NotNull ComboBoxIcons icons) { this.colors = colors;
/* 23 */     this.metrics = metrics;
/* 24 */     this.icons = icons; } @NotNull public final ComboBoxIcons getIcons() { return this.icons; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ComboBoxColors getColors() {
/*    */     return this.colors;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ComboBoxMetrics getMetrics() {
/*    */     return this.metrics;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ComboBoxStyle))
/*    */       return false; 
/*    */     ComboBoxStyle comboBoxStyle = (ComboBoxStyle)other;
/*    */     return !Intrinsics.areEqual(this.colors, comboBoxStyle.colors) ? false : (!Intrinsics.areEqual(this.metrics, comboBoxStyle.metrics) ? false : (!!Intrinsics.areEqual(this.icons, comboBoxStyle.icons)));
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
/*    */     return "ComboBoxStyle(colors=" + this.colors + ", metrics=" + this.metrics + ", icons=" + this.icons + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\ComboBoxStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */