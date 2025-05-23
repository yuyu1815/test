/*   */ package org.jetbrains.jewel.ui.component.styling;
/*   */ @GenerateDataFunctions
/*   */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\b\007\030\000 \r2\0020\001:\001\rB\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\023\020\002\032\0020\003¢\006\n\n\002\020\n\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\f¨\006\016"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SelectableLazyColumnStyle;", "", "itemHeight", "Landroidx/compose/ui/unit/Dp;", "simpleListItemStyle", "Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemStyle;", "<init>", "(FLorg/jetbrains/jewel/ui/component/styling/SimpleListItemStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getItemHeight-D9Ej5fM", "()F", "F", "getSimpleListItemStyle", "()Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemStyle;", "Companion", "ui"})
/*   */ @StabilityInferred(parameters = 1)
/*   */ public final class SelectableLazyColumnStyle { @NotNull
/*   */   public static final Companion Companion = new Companion(null);
/*   */   private final float itemHeight;
/*   */   
/* 9 */   private SelectableLazyColumnStyle(float itemHeight, SimpleListItemStyle simpleListItemStyle) { this.itemHeight = itemHeight; this.simpleListItemStyle = simpleListItemStyle; } @NotNull private final SimpleListItemStyle simpleListItemStyle; public static final int $stable; public final float getItemHeight-D9Ej5fM() { return this.itemHeight; } @NotNull public final SimpleListItemStyle getSimpleListItemStyle() { return this.simpleListItemStyle; }
/*   */ 
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof SelectableLazyColumnStyle))
/*   */       return false; 
/*   */     SelectableLazyColumnStyle selectableLazyColumnStyle = (SelectableLazyColumnStyle)other;
/*   */     return !Dp.equals-impl0(this.itemHeight, selectableLazyColumnStyle.itemHeight) ? false : (!!Intrinsics.areEqual(this.simpleListItemStyle, selectableLazyColumnStyle.simpleListItemStyle));
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = Dp.hashCode-impl(this.itemHeight);
/*   */     return result * 31 + this.simpleListItemStyle.hashCode();
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "SelectableLazyColumnStyle(itemHeight=" + Dp.toString-impl(this.itemHeight) + ", simpleListItemStyle=" + this.simpleListItemStyle + ")";
/*   */   }
/*   */   
/*   */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SelectableLazyColumnStyle$Companion;", "", "<init>", "()V", "ui"})
/*   */   public static final class Companion {
/*   */     private Companion() {}
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\SelectableLazyColumnStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */