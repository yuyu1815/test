/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\020\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0312\0020\001:\001\031B7\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003¢\006\004\b\t\020\nJ\035\020\023\032\b\022\004\022\0020\0030\0242\006\020\025\032\0020\026H\007¢\006\004\b\027\020\030R\023\020\002\032\0020\003¢\006\n\n\002\020\r\032\004\b\013\020\fR\023\020\004\032\0020\003¢\006\n\n\002\020\r\032\004\b\016\020\fR\023\020\005\032\0020\003¢\006\n\n\002\020\r\032\004\b\017\020\fR\023\020\006\032\0020\003¢\006\n\n\002\020\r\032\004\b\020\020\fR\023\020\007\032\0020\003¢\006\n\n\002\020\r\032\004\b\021\020\fR\023\020\b\032\0020\003¢\006\n\n\002\020\r\032\004\b\022\020\f¨\006\032"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/LinkColors;", "", "content", "Landroidx/compose/ui/graphics/Color;", "contentDisabled", "contentFocused", "contentPressed", "contentHovered", "contentVisited", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContent-0d7_KjU", "()J", "J", "getContentDisabled-0d7_KjU", "getContentFocused-0d7_KjU", "getContentPressed-0d7_KjU", "getContentHovered-0d7_KjU", "getContentVisited-0d7_KjU", "contentFor", "Landroidx/compose/runtime/State;", "state", "Lorg/jetbrains/jewel/ui/component/LinkState;", "contentFor-Qusrf_U", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class LinkColors {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long content;
/*    */   private final long contentDisabled;
/*    */   private final long contentFocused;
/*    */   private final long contentPressed;
/*    */   private final long contentHovered;
/*    */   private final long contentVisited;
/*    */   public static final int $stable;
/*    */   
/*    */   public final long getContent-0d7_KjU() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   public final long getContentDisabled-0d7_KjU() {
/*    */     return this.contentDisabled;
/*    */   }
/*    */   
/*    */   public final long getContentFocused-0d7_KjU() {
/*    */     return this.contentFocused;
/*    */   }
/*    */   
/* 31 */   private LinkColors(long content, long contentDisabled, long contentFocused, long contentPressed, long contentHovered, long contentVisited) { this.content = content;
/* 32 */     this.contentDisabled = contentDisabled;
/* 33 */     this.contentFocused = contentFocused;
/* 34 */     this.contentPressed = contentPressed;
/* 35 */     this.contentHovered = contentHovered;
/* 36 */     this.contentVisited = contentVisited; } public final long getContentPressed-0d7_KjU() { return this.contentPressed; } public final long getContentHovered-0d7_KjU() { return this.contentHovered; } public final long getContentVisited-0d7_KjU() { return this.contentVisited; }
/*    */    @Composable
/*    */   @NotNull
/*    */   public final State<Color> contentFor-Qusrf_U(long state, @Nullable Composer $composer, int $changed) {
/* 40 */     $composer.startReplaceGroup(-619910516); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-619910516, $changed, -1, "org.jetbrains.jewel.ui.component.styling.LinkColors.contentFor (LinkStyling.kt:39)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/* 41 */         LinkState.chooseValueWithVisited-impl(state, 
/* 42 */           Color.box-impl(this.content), 
/* 43 */           Color.box-impl(this.contentDisabled), 
/* 44 */           Color.box-impl(this.contentFocused), 
/* 45 */           Color.box-impl(this.contentPressed), 
/* 46 */           Color.box-impl(this.contentHovered), 
/* 47 */           Color.box-impl(this.contentVisited), 
/* 48 */           Color.box-impl(this.content), $composer, 0x1C00000 & $changed << 21), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LinkColors))
/*    */       return false; 
/*    */     LinkColors linkColors = (LinkColors)other;
/*    */     return !Color.equals-impl0(this.content, linkColors.content) ? false : (!Color.equals-impl0(this.contentDisabled, linkColors.contentDisabled) ? false : (!Color.equals-impl0(this.contentFocused, linkColors.contentFocused) ? false : (!Color.equals-impl0(this.contentPressed, linkColors.contentPressed) ? false : (!Color.equals-impl0(this.contentHovered, linkColors.contentHovered) ? false : (!!Color.equals-impl0(this.contentVisited, linkColors.contentVisited))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.content);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentDisabled);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentFocused);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentPressed);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentHovered);
/*    */     return result * 31 + Color.hashCode-impl(this.contentVisited);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LinkColors(content=" + Color.toString-impl(this.content) + ", contentDisabled=" + Color.toString-impl(this.contentDisabled) + ", contentFocused=" + Color.toString-impl(this.contentFocused) + ", contentPressed=" + Color.toString-impl(this.contentPressed) + ", contentHovered=" + Color.toString-impl(this.contentHovered) + ", contentVisited=" + Color.toString-impl(this.contentVisited) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/LinkColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\LinkColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */