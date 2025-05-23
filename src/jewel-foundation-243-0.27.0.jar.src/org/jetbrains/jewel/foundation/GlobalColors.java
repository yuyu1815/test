/*    */ package org.jetbrains.jewel.foundation;
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\b\007\030\000 \0252\0020\001:\001\025B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\023\020\b\032\0020\t¢\006\n\n\002\020\024\032\004\b\022\020\023¨\006\026"}, d2 = {"Lorg/jetbrains/jewel/foundation/GlobalColors;", "", "borders", "Lorg/jetbrains/jewel/foundation/BorderColors;", "outlines", "Lorg/jetbrains/jewel/foundation/OutlineColors;", "text", "Lorg/jetbrains/jewel/foundation/TextColors;", "panelBackground", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Lorg/jetbrains/jewel/foundation/BorderColors;Lorg/jetbrains/jewel/foundation/OutlineColors;Lorg/jetbrains/jewel/foundation/TextColors;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBorders", "()Lorg/jetbrains/jewel/foundation/BorderColors;", "getOutlines", "()Lorg/jetbrains/jewel/foundation/OutlineColors;", "getText", "()Lorg/jetbrains/jewel/foundation/TextColors;", "getPanelBackground-0d7_KjU", "()J", "J", "Companion", "foundation"})
/*    */ @Immutable
/*    */ public final class GlobalColors { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final BorderColors borders;
/*    */   @NotNull
/*    */   private final OutlineColors outlines;
/*    */   
/* 11 */   private GlobalColors(BorderColors borders, OutlineColors outlines, TextColors text, long panelBackground) { this.borders = borders;
/* 12 */     this.outlines = outlines;
/* 13 */     this.text = text;
/* 14 */     this.panelBackground = panelBackground; } @NotNull private final TextColors text; private final long panelBackground; public static final int $stable; @NotNull public final BorderColors getBorders() { return this.borders; } public final long getPanelBackground-0d7_KjU() { return this.panelBackground; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final OutlineColors getOutlines() {
/*    */     return this.outlines;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextColors getText() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof GlobalColors))
/*    */       return false; 
/*    */     GlobalColors globalColors = (GlobalColors)other;
/*    */     return !Intrinsics.areEqual(this.borders, globalColors.borders) ? false : (!Intrinsics.areEqual(this.outlines, globalColors.outlines) ? false : (!Intrinsics.areEqual(this.text, globalColors.text) ? false : (!!Color.equals-impl0(this.panelBackground, globalColors.panelBackground))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.borders.hashCode();
/*    */     result = result * 31 + this.outlines.hashCode();
/*    */     result = result * 31 + this.text.hashCode();
/*    */     return result * 31 + Color.hashCode-impl(this.panelBackground);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "GlobalColors(borders=" + this.borders + ", outlines=" + this.outlines + ", text=" + this.text + ", panelBackground=" + Color.toString-impl(this.panelBackground) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/foundation/GlobalColors$Companion;", "", "<init>", "()V", "foundation"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\GlobalColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */