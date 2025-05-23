/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\036\n\002\030\002\n\000\n\002\030\002\n\002\b\b\b\007\030\000 12\0020\001:\0011B\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\t\022\006\020\n\032\0020\t\022\006\020\013\032\0020\t\022\006\020\f\032\0020\t\022\006\020\r\032\0020\t\022\006\020\016\032\0020\003\022\006\020\017\032\0020\003\022\006\020\020\032\0020\003\022\006\020\021\032\0020\003\022\006\020\022\032\0020\003¢\006\004\b\023\020\024J\035\020'\032\b\022\004\022\0020\0030(2\006\020)\032\0020*H\007¢\006\004\b+\020,J\035\020-\032\b\022\004\022\0020\t0(2\006\020)\032\0020*H\007¢\006\004\b.\020,J\035\020/\032\b\022\004\022\0020\0030(2\006\020)\032\0020*H\007¢\006\004\b0\020,R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\025\020\026R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\027\020\026R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\030\020\026R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\031\020\026R\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\032\020\026R\023\020\b\032\0020\t¢\006\n\n\002\020\035\032\004\b\033\020\034R\023\020\n\032\0020\t¢\006\n\n\002\020\035\032\004\b\036\020\034R\023\020\013\032\0020\t¢\006\n\n\002\020\035\032\004\b\037\020\034R\023\020\f\032\0020\t¢\006\n\n\002\020\035\032\004\b \020\034R\023\020\r\032\0020\t¢\006\n\n\002\020\035\032\004\b!\020\034R\021\020\016\032\0020\003¢\006\b\n\000\032\004\b\"\020\026R\021\020\017\032\0020\003¢\006\b\n\000\032\004\b#\020\026R\021\020\020\032\0020\003¢\006\b\n\000\032\004\b$\020\026R\021\020\021\032\0020\003¢\006\b\n\000\032\004\b%\020\026R\021\020\022\032\0020\003¢\006\b\n\000\032\004\b&\020\026¨\0062"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ButtonColors;", "", "background", "Landroidx/compose/ui/graphics/Brush;", "backgroundDisabled", "backgroundFocused", "backgroundPressed", "backgroundHovered", "content", "Landroidx/compose/ui/graphics/Color;", "contentDisabled", "contentFocused", "contentPressed", "contentHovered", "border", "borderDisabled", "borderFocused", "borderPressed", "borderHovered", "<init>", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;JJJJJLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground", "()Landroidx/compose/ui/graphics/Brush;", "getBackgroundDisabled", "getBackgroundFocused", "getBackgroundPressed", "getBackgroundHovered", "getContent-0d7_KjU", "()J", "J", "getContentDisabled-0d7_KjU", "getContentFocused-0d7_KjU", "getContentPressed-0d7_KjU", "getContentHovered-0d7_KjU", "getBorder", "getBorderDisabled", "getBorderFocused", "getBorderPressed", "getBorderHovered", "backgroundFor", "Landroidx/compose/runtime/State;", "state", "Lorg/jetbrains/jewel/ui/component/ButtonState;", "backgroundFor-Wlap9Qs", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentFor", "contentFor-Wlap9Qs", "borderFor", "borderFor-Wlap9Qs", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class ButtonColors { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Brush background;
/*    */   @NotNull
/*    */   private final Brush backgroundDisabled;
/*    */   @NotNull
/*    */   private final Brush backgroundFocused;
/*    */   @NotNull
/*    */   private final Brush backgroundPressed;
/*    */   @NotNull
/*    */   private final Brush backgroundHovered;
/*    */   private final long content;
/*    */   private final long contentDisabled;
/*    */   private final long contentFocused;
/*    */   private final long contentPressed;
/*    */   private final long contentHovered;
/*    */   @NotNull
/*    */   private final Brush border;
/*    */   @NotNull
/*    */   private final Brush borderDisabled;
/*    */   @NotNull
/*    */   private final Brush borderFocused;
/*    */   @NotNull
/*    */   private final Brush borderPressed;
/*    */   @NotNull
/*    */   private final Brush borderHovered;
/*    */   public static final int $stable;
/*    */   
/* 34 */   private ButtonColors(Brush background, Brush backgroundDisabled, Brush backgroundFocused, Brush backgroundPressed, Brush backgroundHovered, long content, long contentDisabled, long contentFocused, long contentPressed, long contentHovered, Brush border, Brush borderDisabled, Brush borderFocused, Brush borderPressed, Brush borderHovered) { this.background = background;
/* 35 */     this.backgroundDisabled = backgroundDisabled;
/* 36 */     this.backgroundFocused = backgroundFocused;
/* 37 */     this.backgroundPressed = backgroundPressed;
/* 38 */     this.backgroundHovered = backgroundHovered;
/* 39 */     this.content = content;
/* 40 */     this.contentDisabled = contentDisabled;
/* 41 */     this.contentFocused = contentFocused;
/* 42 */     this.contentPressed = contentPressed;
/* 43 */     this.contentHovered = contentHovered;
/* 44 */     this.border = border;
/* 45 */     this.borderDisabled = borderDisabled;
/* 46 */     this.borderFocused = borderFocused;
/* 47 */     this.borderPressed = borderPressed;
/* 48 */     this.borderHovered = borderHovered; } @NotNull public final Brush getBackground() { return this.background; } @NotNull public final Brush getBackgroundDisabled() { return this.backgroundDisabled; } @NotNull public final Brush getBackgroundFocused() { return this.backgroundFocused; } @NotNull public final Brush getBackgroundPressed() { return this.backgroundPressed; } @NotNull public final Brush getBackgroundHovered() { return this.backgroundHovered; } public final long getContent-0d7_KjU() { return this.content; } public final long getContentDisabled-0d7_KjU() { return this.contentDisabled; } @NotNull public final Brush getBorderHovered() { return this.borderHovered; }
/*    */   public final long getContentFocused-0d7_KjU() { return this.contentFocused; }
/*    */   public final long getContentPressed-0d7_KjU() { return this.contentPressed; }
/*    */   public final long getContentHovered-0d7_KjU() { return this.contentHovered; }
/* 52 */   @NotNull public final Brush getBorder() { return this.border; } @NotNull public final Brush getBorderDisabled() { return this.borderDisabled; } @NotNull public final Brush getBorderFocused() { return this.borderFocused; } @NotNull public final Brush getBorderPressed() { return this.borderPressed; } @Composable @NotNull public final State<Brush> backgroundFor-Wlap9Qs(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-236360029); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-236360029, $changed, -1, "org.jetbrains.jewel.ui.component.styling.ButtonColors.backgroundFor (ButtonStyling.kt:51)");  State<Brush> state1 = SnapshotStateKt.rememberUpdatedState(
/* 53 */         ButtonState.chooseValue-impl(state, 
/* 54 */           this.background, 
/* 55 */           this.backgroundDisabled, 
/* 56 */           this.backgroundFocused, 
/* 57 */           this.backgroundPressed, 
/* 58 */           this.backgroundHovered, 
/* 59 */           this.background, $composer, 0x380000 & $changed << 18), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; } @Composable
/*    */   @NotNull
/* 65 */   public final State<Color> contentFor-Wlap9Qs(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-1515794604); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1515794604, $changed, -1, "org.jetbrains.jewel.ui.component.styling.ButtonColors.contentFor (ButtonStyling.kt:64)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/* 66 */         ButtonState.chooseValue-impl(state, 
/* 67 */           Color.box-impl(this.content), 
/* 68 */           Color.box-impl(this.contentDisabled), 
/* 69 */           Color.box-impl(this.contentFocused), 
/* 70 */           Color.box-impl(this.contentPressed), 
/* 71 */           Color.box-impl(this.contentHovered), 
/* 72 */           Color.box-impl(this.content), $composer, 0x380000 & $changed << 18), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; } @Composable
/*    */   @NotNull
/* 78 */   public final State<Brush> borderFor-Wlap9Qs(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(1688008165); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1688008165, $changed, -1, "org.jetbrains.jewel.ui.component.styling.ButtonColors.borderFor (ButtonStyling.kt:77)");  $composer.startReplaceGroup(-1273018356);
/* 79 */     Brush brush = JewelTheme.Companion.isSwingCompatMode($composer, 6) ? 
/* 80 */       (Brush)ButtonState.chooseValue-impl(state, 
/* 81 */         this.border, 
/* 82 */         this.borderDisabled, 
/* 83 */         this.borderFocused, 
/* 84 */         this.borderPressed, 
/* 85 */         this.borderHovered, 
/* 86 */         this.border, $composer, 0x380000 & $changed << 18) : (
/*    */ 
/*    */ 
/*    */       
/* 90 */       !ButtonState.isEnabled-impl(state) ? this.borderDisabled : (
/* 91 */       ButtonState.isFocused-impl(state) ? this.borderFocused : (
/* 92 */       ButtonState.isPressed-impl(state) ? this.borderPressed : (
/* 93 */       ButtonState.isHovered-impl(state) ? this.borderHovered : 
/* 94 */       this.border))));
/*    */     $composer.endReplaceGroup();
/*    */     State<Brush> state1 = SnapshotStateKt.rememberUpdatedState(brush, $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ButtonColors))
/*    */       return false; 
/*    */     ButtonColors buttonColors = (ButtonColors)other;
/*    */     return !Intrinsics.areEqual(this.background, buttonColors.background) ? false : (!Intrinsics.areEqual(this.backgroundDisabled, buttonColors.backgroundDisabled) ? false : (!Intrinsics.areEqual(this.backgroundFocused, buttonColors.backgroundFocused) ? false : (!Intrinsics.areEqual(this.backgroundPressed, buttonColors.backgroundPressed) ? false : (!Intrinsics.areEqual(this.backgroundHovered, buttonColors.backgroundHovered) ? false : (!Color.equals-impl0(this.content, buttonColors.content) ? false : (!Color.equals-impl0(this.contentDisabled, buttonColors.contentDisabled) ? false : (!Color.equals-impl0(this.contentFocused, buttonColors.contentFocused) ? false : (!Color.equals-impl0(this.contentPressed, buttonColors.contentPressed) ? false : (!Color.equals-impl0(this.contentHovered, buttonColors.contentHovered) ? false : (!Intrinsics.areEqual(this.border, buttonColors.border) ? false : (!Intrinsics.areEqual(this.borderDisabled, buttonColors.borderDisabled) ? false : (!Intrinsics.areEqual(this.borderFocused, buttonColors.borderFocused) ? false : (!Intrinsics.areEqual(this.borderPressed, buttonColors.borderPressed) ? false : (!!Intrinsics.areEqual(this.borderHovered, buttonColors.borderHovered)))))))))))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.background.hashCode();
/*    */     result = result * 31 + this.backgroundDisabled.hashCode();
/*    */     result = result * 31 + this.backgroundFocused.hashCode();
/*    */     result = result * 31 + this.backgroundPressed.hashCode();
/*    */     result = result * 31 + this.backgroundHovered.hashCode();
/*    */     result = result * 31 + Color.hashCode-impl(this.content);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentDisabled);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentFocused);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentPressed);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentHovered);
/*    */     result = result * 31 + this.border.hashCode();
/*    */     result = result * 31 + this.borderDisabled.hashCode();
/*    */     result = result * 31 + this.borderFocused.hashCode();
/*    */     result = result * 31 + this.borderPressed.hashCode();
/*    */     return result * 31 + this.borderHovered.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ButtonColors(background=" + this.background + ", backgroundDisabled=" + this.backgroundDisabled + ", backgroundFocused=" + this.backgroundFocused + ", backgroundPressed=" + this.backgroundPressed + ", backgroundHovered=" + this.backgroundHovered + ", content=" + Color.toString-impl(this.content) + ", contentDisabled=" + Color.toString-impl(this.contentDisabled) + ", contentFocused=" + Color.toString-impl(this.contentFocused) + ", contentPressed=" + Color.toString-impl(this.contentPressed) + ", contentHovered=" + Color.toString-impl(this.contentHovered) + ", border=" + this.border + ", borderDisabled=" + this.borderDisabled + ", borderFocused=" + this.borderFocused + ", borderPressed=" + this.borderPressed + ", borderHovered=" + this.borderHovered + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ButtonColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\ButtonColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */