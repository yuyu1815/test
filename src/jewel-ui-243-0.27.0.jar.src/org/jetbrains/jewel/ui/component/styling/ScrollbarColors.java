/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\035\b\007\030\000 \0372\0020\001:\001\037Bg\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\003\022\006\020\n\032\0020\003\022\006\020\013\032\0020\003\022\006\020\f\032\0020\003\022\006\020\r\032\0020\003\022\006\020\016\032\0020\003¢\006\004\b\017\020\020R\023\020\002\032\0020\003¢\006\n\n\002\020\023\032\004\b\021\020\022R\023\020\004\032\0020\003¢\006\n\n\002\020\023\032\004\b\024\020\022R\023\020\005\032\0020\003¢\006\n\n\002\020\023\032\004\b\025\020\022R\023\020\006\032\0020\003¢\006\n\n\002\020\023\032\004\b\026\020\022R\023\020\007\032\0020\003¢\006\n\n\002\020\023\032\004\b\027\020\022R\023\020\b\032\0020\003¢\006\n\n\002\020\023\032\004\b\030\020\022R\023\020\t\032\0020\003¢\006\n\n\002\020\023\032\004\b\031\020\022R\023\020\n\032\0020\003¢\006\n\n\002\020\023\032\004\b\032\020\022R\023\020\013\032\0020\003¢\006\n\n\002\020\023\032\004\b\033\020\022R\023\020\f\032\0020\003¢\006\n\n\002\020\023\032\004\b\034\020\022R\023\020\r\032\0020\003¢\006\n\n\002\020\023\032\004\b\035\020\022R\023\020\016\032\0020\003¢\006\n\n\002\020\023\032\004\b\036\020\022¨\006 "}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ScrollbarColors;", "", "thumbBackground", "Landroidx/compose/ui/graphics/Color;", "thumbBackgroundActive", "thumbOpaqueBackground", "thumbOpaqueBackgroundHovered", "thumbBorder", "thumbBorderActive", "thumbOpaqueBorder", "thumbOpaqueBorderHovered", "trackBackground", "trackBackgroundExpanded", "trackOpaqueBackground", "trackOpaqueBackgroundHovered", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getThumbBackground-0d7_KjU", "()J", "J", "getThumbBackgroundActive-0d7_KjU", "getThumbOpaqueBackground-0d7_KjU", "getThumbOpaqueBackgroundHovered-0d7_KjU", "getThumbBorder-0d7_KjU", "getThumbBorderActive-0d7_KjU", "getThumbOpaqueBorder-0d7_KjU", "getThumbOpaqueBorderHovered-0d7_KjU", "getTrackBackground-0d7_KjU", "getTrackBackgroundExpanded-0d7_KjU", "getTrackOpaqueBackground-0d7_KjU", "getTrackOpaqueBackgroundHovered-0d7_KjU", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class ScrollbarColors {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long thumbBackground;
/*    */   private final long thumbBackgroundActive;
/*    */   private final long thumbOpaqueBackground;
/*    */   private final long thumbOpaqueBackgroundHovered;
/*    */   private final long thumbBorder;
/*    */   private final long thumbBorderActive;
/*    */   private final long thumbOpaqueBorder;
/*    */   private final long thumbOpaqueBorderHovered;
/*    */   private final long trackBackground;
/*    */   private final long trackBackgroundExpanded;
/*    */   private final long trackOpaqueBackground;
/*    */   private final long trackOpaqueBackgroundHovered;
/*    */   public static final int $stable;
/*    */   
/* 29 */   private ScrollbarColors(long thumbBackground, long thumbBackgroundActive, long thumbOpaqueBackground, long thumbOpaqueBackgroundHovered, long thumbBorder, long thumbBorderActive, long thumbOpaqueBorder, long thumbOpaqueBorderHovered, long trackBackground, long trackBackgroundExpanded, long trackOpaqueBackground, long trackOpaqueBackgroundHovered) { this.thumbBackground = thumbBackground;
/* 30 */     this.thumbBackgroundActive = thumbBackgroundActive;
/* 31 */     this.thumbOpaqueBackground = thumbOpaqueBackground;
/* 32 */     this.thumbOpaqueBackgroundHovered = thumbOpaqueBackgroundHovered;
/* 33 */     this.thumbBorder = thumbBorder;
/* 34 */     this.thumbBorderActive = thumbBorderActive;
/* 35 */     this.thumbOpaqueBorder = thumbOpaqueBorder;
/* 36 */     this.thumbOpaqueBorderHovered = thumbOpaqueBorderHovered;
/* 37 */     this.trackBackground = trackBackground;
/* 38 */     this.trackBackgroundExpanded = trackBackgroundExpanded;
/* 39 */     this.trackOpaqueBackground = trackOpaqueBackground;
/* 40 */     this.trackOpaqueBackgroundHovered = trackOpaqueBackgroundHovered; } public final long getTrackOpaqueBackgroundHovered-0d7_KjU() { return this.trackOpaqueBackgroundHovered; }
/*    */ 
/*    */   
/*    */   public final long getThumbBackground-0d7_KjU() {
/*    */     return this.thumbBackground;
/*    */   }
/*    */   
/*    */   public final long getThumbBackgroundActive-0d7_KjU() {
/*    */     return this.thumbBackgroundActive;
/*    */   }
/*    */   
/*    */   public final long getThumbOpaqueBackground-0d7_KjU() {
/*    */     return this.thumbOpaqueBackground;
/*    */   }
/*    */   
/*    */   public final long getThumbOpaqueBackgroundHovered-0d7_KjU() {
/*    */     return this.thumbOpaqueBackgroundHovered;
/*    */   }
/*    */   
/*    */   public final long getThumbBorder-0d7_KjU() {
/*    */     return this.thumbBorder;
/*    */   }
/*    */   
/*    */   public final long getThumbBorderActive-0d7_KjU() {
/*    */     return this.thumbBorderActive;
/*    */   }
/*    */   
/*    */   public final long getThumbOpaqueBorder-0d7_KjU() {
/*    */     return this.thumbOpaqueBorder;
/*    */   }
/*    */   
/*    */   public final long getThumbOpaqueBorderHovered-0d7_KjU() {
/*    */     return this.thumbOpaqueBorderHovered;
/*    */   }
/*    */   
/*    */   public final long getTrackBackground-0d7_KjU() {
/*    */     return this.trackBackground;
/*    */   }
/*    */   
/*    */   public final long getTrackBackgroundExpanded-0d7_KjU() {
/*    */     return this.trackBackgroundExpanded;
/*    */   }
/*    */   
/*    */   public final long getTrackOpaqueBackground-0d7_KjU() {
/*    */     return this.trackOpaqueBackground;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ScrollbarColors))
/*    */       return false; 
/*    */     ScrollbarColors scrollbarColors = (ScrollbarColors)other;
/*    */     return !Color.equals-impl0(this.thumbBackground, scrollbarColors.thumbBackground) ? false : (!Color.equals-impl0(this.thumbBackgroundActive, scrollbarColors.thumbBackgroundActive) ? false : (!Color.equals-impl0(this.thumbOpaqueBackground, scrollbarColors.thumbOpaqueBackground) ? false : (!Color.equals-impl0(this.thumbOpaqueBackgroundHovered, scrollbarColors.thumbOpaqueBackgroundHovered) ? false : (!Color.equals-impl0(this.thumbBorder, scrollbarColors.thumbBorder) ? false : (!Color.equals-impl0(this.thumbBorderActive, scrollbarColors.thumbBorderActive) ? false : (!Color.equals-impl0(this.thumbOpaqueBorder, scrollbarColors.thumbOpaqueBorder) ? false : (!Color.equals-impl0(this.thumbOpaqueBorderHovered, scrollbarColors.thumbOpaqueBorderHovered) ? false : (!Color.equals-impl0(this.trackBackground, scrollbarColors.trackBackground) ? false : (!Color.equals-impl0(this.trackBackgroundExpanded, scrollbarColors.trackBackgroundExpanded) ? false : (!Color.equals-impl0(this.trackOpaqueBackground, scrollbarColors.trackOpaqueBackground) ? false : (!!Color.equals-impl0(this.trackOpaqueBackgroundHovered, scrollbarColors.trackOpaqueBackgroundHovered))))))))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.thumbBackground);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbBackgroundActive);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbOpaqueBackground);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbOpaqueBackgroundHovered);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbBorder);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbBorderActive);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbOpaqueBorder);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbOpaqueBorderHovered);
/*    */     result = result * 31 + Color.hashCode-impl(this.trackBackground);
/*    */     result = result * 31 + Color.hashCode-impl(this.trackBackgroundExpanded);
/*    */     result = result * 31 + Color.hashCode-impl(this.trackOpaqueBackground);
/*    */     return result * 31 + Color.hashCode-impl(this.trackOpaqueBackgroundHovered);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ScrollbarColors(thumbBackground=" + Color.toString-impl(this.thumbBackground) + ", thumbBackgroundActive=" + Color.toString-impl(this.thumbBackgroundActive) + ", thumbOpaqueBackground=" + Color.toString-impl(this.thumbOpaqueBackground) + ", thumbOpaqueBackgroundHovered=" + Color.toString-impl(this.thumbOpaqueBackgroundHovered) + ", thumbBorder=" + Color.toString-impl(this.thumbBorder) + ", thumbBorderActive=" + Color.toString-impl(this.thumbBorderActive) + ", thumbOpaqueBorder=" + Color.toString-impl(this.thumbOpaqueBorder) + ", thumbOpaqueBorderHovered=" + Color.toString-impl(this.thumbOpaqueBorderHovered) + ", trackBackground=" + Color.toString-impl(this.trackBackground) + ", trackBackgroundExpanded=" + Color.toString-impl(this.trackBackgroundExpanded) + ", trackOpaqueBackground=" + Color.toString-impl(this.trackOpaqueBackground) + ", trackOpaqueBackgroundHovered=" + Color.toString-impl(this.trackOpaqueBackgroundHovered) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ScrollbarColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\ScrollbarColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */