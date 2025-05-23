/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ import org.jetbrains.jewel.foundation.Stroke;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\b\007\030\000 \0202\0020\001:\001\020B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\021"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;", "", "colors", "Lorg/jetbrains/jewel/ui/component/styling/ButtonColors;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/ButtonMetrics;", "focusOutlineAlignment", "Lorg/jetbrains/jewel/foundation/Stroke$Alignment;", "<init>", "(Lorg/jetbrains/jewel/ui/component/styling/ButtonColors;Lorg/jetbrains/jewel/ui/component/styling/ButtonMetrics;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;)V", "getColors", "()Lorg/jetbrains/jewel/ui/component/styling/ButtonColors;", "getMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/ButtonMetrics;", "getFocusOutlineAlignment", "()Lorg/jetbrains/jewel/foundation/Stroke$Alignment;", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class ButtonStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final ButtonColors colors;
/*    */   @NotNull
/*    */   private final ButtonMetrics metrics;
/*    */   @NotNull
/*    */   private final Stroke.Alignment focusOutlineAlignment;
/*    */   public static final int $stable;
/*    */   
/* 24 */   public ButtonStyle(@NotNull ButtonColors colors, @NotNull ButtonMetrics metrics, @NotNull Stroke.Alignment focusOutlineAlignment) { this.colors = colors;
/* 25 */     this.metrics = metrics;
/* 26 */     this.focusOutlineAlignment = focusOutlineAlignment; } @NotNull public final Stroke.Alignment getFocusOutlineAlignment() { return this.focusOutlineAlignment; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ButtonColors getColors() {
/*    */     return this.colors;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ButtonMetrics getMetrics() {
/*    */     return this.metrics;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ButtonStyle))
/*    */       return false; 
/*    */     ButtonStyle buttonStyle = (ButtonStyle)other;
/*    */     return !Intrinsics.areEqual(this.colors, buttonStyle.colors) ? false : (!Intrinsics.areEqual(this.metrics, buttonStyle.metrics) ? false : (!(this.focusOutlineAlignment != buttonStyle.focusOutlineAlignment)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.colors.hashCode();
/*    */     result = result * 31 + this.metrics.hashCode();
/*    */     return result * 31 + this.focusOutlineAlignment.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ButtonStyle(colors=" + this.colors + ", metrics=" + this.metrics + ", focusOutlineAlignment=" + this.focusOutlineAlignment + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\ButtonStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */