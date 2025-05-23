/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\b\007\030\000 \r2\0020\001:\001\rB\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\023\020\002\032\0020\003¢\006\n\n\002\020\n\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\f¨\006\016"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;", "", "color", "Landroidx/compose/ui/graphics/Color;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/DividerMetrics;", "<init>", "(JLorg/jetbrains/jewel/ui/component/styling/DividerMetrics;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/DividerMetrics;", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class DividerStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long color;
/*    */   
/* 13 */   private DividerStyle(long color, DividerMetrics metrics) { this.color = color; this.metrics = metrics; } @NotNull private final DividerMetrics metrics; public static final int $stable; public final long getColor-0d7_KjU() { return this.color; } @NotNull public final DividerMetrics getMetrics() { return this.metrics; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof DividerStyle))
/*    */       return false; 
/*    */     DividerStyle dividerStyle = (DividerStyle)other;
/*    */     return !Color.equals-impl0(this.color, dividerStyle.color) ? false : (!!Intrinsics.areEqual(this.metrics, dividerStyle.metrics));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.color);
/*    */     return result * 31 + this.metrics.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DividerStyle(color=" + Color.toString-impl(this.color) + ", metrics=" + this.metrics + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/DividerStyle$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\DividerStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */