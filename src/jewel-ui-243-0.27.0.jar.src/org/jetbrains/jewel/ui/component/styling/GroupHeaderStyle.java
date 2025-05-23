/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\b\007\030\000 \f2\0020\001:\001\fB\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\r"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderStyle;", "", "colors", "Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderColors;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderMetrics;", "<init>", "(Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderColors;Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderMetrics;)V", "getColors", "()Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderColors;", "getMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderMetrics;", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class GroupHeaderStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final GroupHeaderColors colors;
/*    */   
/* 12 */   public GroupHeaderStyle(@NotNull GroupHeaderColors colors, @NotNull GroupHeaderMetrics metrics) { this.colors = colors; this.metrics = metrics; } @NotNull private final GroupHeaderMetrics metrics; public static final int $stable; @NotNull public final GroupHeaderColors getColors() { return this.colors; } @NotNull public final GroupHeaderMetrics getMetrics() { return this.metrics; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof GroupHeaderStyle))
/*    */       return false; 
/*    */     GroupHeaderStyle groupHeaderStyle = (GroupHeaderStyle)other;
/*    */     return !Intrinsics.areEqual(this.colors, groupHeaderStyle.colors) ? false : (!!Intrinsics.areEqual(this.metrics, groupHeaderStyle.metrics));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.colors.hashCode();
/*    */     return result * 31 + this.metrics.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "GroupHeaderStyle(colors=" + this.colors + ", metrics=" + this.metrics + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderStyle$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\GroupHeaderStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */