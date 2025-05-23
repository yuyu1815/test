/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\025\b\007\030\000 \0272\0020\001:\001\027BI\022\b\b\002\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\003\022\006\020\n\032\0020\003¢\006\004\b\013\020\fR\023\020\002\032\0020\003¢\006\n\n\002\020\017\032\004\b\r\020\016R\023\020\004\032\0020\003¢\006\n\n\002\020\017\032\004\b\020\020\016R\023\020\005\032\0020\003¢\006\n\n\002\020\017\032\004\b\021\020\016R\023\020\006\032\0020\003¢\006\n\n\002\020\017\032\004\b\022\020\016R\023\020\007\032\0020\003¢\006\n\n\002\020\017\032\004\b\023\020\016R\023\020\b\032\0020\003¢\006\n\n\002\020\017\032\004\b\024\020\016R\023\020\t\032\0020\003¢\006\n\n\002\020\017\032\004\b\025\020\016R\023\020\n\032\0020\003¢\006\n\n\002\020\017\032\004\b\026\020\016¨\006\030"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemColors;", "", "background", "Landroidx/compose/ui/graphics/Color;", "backgroundFocused", "backgroundSelected", "backgroundSelectedFocused", "content", "contentFocused", "contentSelected", "contentSelectedFocused", "<init>", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getBackgroundFocused-0d7_KjU", "getBackgroundSelected-0d7_KjU", "getBackgroundSelectedFocused-0d7_KjU", "getContent-0d7_KjU", "getContentFocused-0d7_KjU", "getContentSelected-0d7_KjU", "getContentSelectedFocused-0d7_KjU", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class SimpleListItemColors {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long background;
/*    */   private final long backgroundFocused;
/*    */   private final long backgroundSelected;
/*    */   private final long backgroundSelectedFocused;
/*    */   
/* 19 */   private SimpleListItemColors(long background, long backgroundFocused, long backgroundSelected, long backgroundSelectedFocused, long content, long contentFocused, long contentSelected, long contentSelectedFocused) { this.background = background;
/* 20 */     this.backgroundFocused = backgroundFocused;
/* 21 */     this.backgroundSelected = backgroundSelected;
/* 22 */     this.backgroundSelectedFocused = backgroundSelectedFocused;
/* 23 */     this.content = content;
/* 24 */     this.contentFocused = contentFocused;
/* 25 */     this.contentSelected = contentSelected;
/* 26 */     this.contentSelectedFocused = contentSelectedFocused; } private final long content; private final long contentFocused; private final long contentSelected; private final long contentSelectedFocused; public static final int $stable; public final long getBackground-0d7_KjU() { return this.background; } public final long getContentSelectedFocused-0d7_KjU() { return this.contentSelectedFocused; }
/*    */ 
/*    */   
/*    */   public final long getBackgroundFocused-0d7_KjU() {
/*    */     return this.backgroundFocused;
/*    */   }
/*    */   
/*    */   public final long getBackgroundSelected-0d7_KjU() {
/*    */     return this.backgroundSelected;
/*    */   }
/*    */   
/*    */   public final long getBackgroundSelectedFocused-0d7_KjU() {
/*    */     return this.backgroundSelectedFocused;
/*    */   }
/*    */   
/*    */   public final long getContent-0d7_KjU() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   public final long getContentFocused-0d7_KjU() {
/*    */     return this.contentFocused;
/*    */   }
/*    */   
/*    */   public final long getContentSelected-0d7_KjU() {
/*    */     return this.contentSelected;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SimpleListItemColors))
/*    */       return false; 
/*    */     SimpleListItemColors simpleListItemColors = (SimpleListItemColors)other;
/*    */     return !Color.equals-impl0(this.background, simpleListItemColors.background) ? false : (!Color.equals-impl0(this.backgroundFocused, simpleListItemColors.backgroundFocused) ? false : (!Color.equals-impl0(this.backgroundSelected, simpleListItemColors.backgroundSelected) ? false : (!Color.equals-impl0(this.backgroundSelectedFocused, simpleListItemColors.backgroundSelectedFocused) ? false : (!Color.equals-impl0(this.content, simpleListItemColors.content) ? false : (!Color.equals-impl0(this.contentFocused, simpleListItemColors.contentFocused) ? false : (!Color.equals-impl0(this.contentSelected, simpleListItemColors.contentSelected) ? false : (!!Color.equals-impl0(this.contentSelectedFocused, simpleListItemColors.contentSelectedFocused))))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.background);
/*    */     result = result * 31 + Color.hashCode-impl(this.backgroundFocused);
/*    */     result = result * 31 + Color.hashCode-impl(this.backgroundSelected);
/*    */     result = result * 31 + Color.hashCode-impl(this.backgroundSelectedFocused);
/*    */     result = result * 31 + Color.hashCode-impl(this.content);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentFocused);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentSelected);
/*    */     return result * 31 + Color.hashCode-impl(this.contentSelectedFocused);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SimpleListItemColors(background=" + Color.toString-impl(this.background) + ", backgroundFocused=" + Color.toString-impl(this.backgroundFocused) + ", backgroundSelected=" + Color.toString-impl(this.backgroundSelected) + ", backgroundSelectedFocused=" + Color.toString-impl(this.backgroundSelectedFocused) + ", content=" + Color.toString-impl(this.content) + ", contentFocused=" + Color.toString-impl(this.contentFocused) + ", contentSelected=" + Color.toString-impl(this.contentSelected) + ", contentSelectedFocused=" + Color.toString-impl(this.contentSelectedFocused) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\SimpleListItemColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */