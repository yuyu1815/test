/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\026\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\006\b\007\030\000 ,2\0020\001:\001,B_\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\t\022\006\020\n\032\0020\t\022\006\020\013\032\0020\003\022\006\020\f\032\0020\003\022\006\020\r\032\0020\003\022\006\020\016\032\0020\003¢\006\004\b\017\020\020J\035\020\037\032\b\022\004\022\0020\t0 2\006\020!\032\0020\"H\007¢\006\004\b#\020$J%\020%\032\b\022\004\022\0020\0030 2\006\020!\032\0020\"2\006\020&\032\0020'H\007¢\006\004\b(\020)J%\020*\032\b\022\004\022\0020\0030 2\006\020!\032\0020\"2\006\020&\032\0020'H\007¢\006\004\b+\020)R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\021\020\022R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\023\020\022R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\024\020\022R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\025\020\022R\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\026\020\022R\023\020\b\032\0020\t¢\006\n\n\002\020\031\032\004\b\027\020\030R\023\020\n\032\0020\t¢\006\n\n\002\020\031\032\004\b\032\020\030R\021\020\013\032\0020\003¢\006\b\n\000\032\004\b\033\020\022R\021\020\f\032\0020\003¢\006\b\n\000\032\004\b\034\020\022R\021\020\r\032\0020\003¢\006\b\n\000\032\004\b\035\020\022R\021\020\016\032\0020\003¢\006\b\n\000\032\004\b\036\020\022¨\006-"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonColors;", "", "background", "Landroidx/compose/ui/graphics/Brush;", "backgroundPressed", "backgroundHovered", "backgroundSelected", "backgroundSelectedFocused", "content", "Landroidx/compose/ui/graphics/Color;", "contentDisabled", "border", "borderSelected", "borderSelectedDisabled", "borderSelectedFocused", "<init>", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;JJLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground", "()Landroidx/compose/ui/graphics/Brush;", "getBackgroundPressed", "getBackgroundHovered", "getBackgroundSelected", "getBackgroundSelectedFocused", "getContent-0d7_KjU", "()J", "J", "getContentDisabled-0d7_KjU", "getBorder", "getBorderSelected", "getBorderSelectedDisabled", "getBorderSelectedFocused", "contentFor", "Landroidx/compose/runtime/State;", "state", "Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonState;", "contentFor-OIjbplg", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "backgroundFor", "isFocused", "", "backgroundFor-6xSfq1s", "(JZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "borderFor", "borderFor-6xSfq1s", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class SegmentedControlButtonColors {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Brush background;
/*    */   @NotNull
/*    */   private final Brush backgroundPressed;
/*    */   @NotNull
/*    */   private final Brush backgroundHovered;
/*    */   @NotNull
/*    */   private final Brush backgroundSelected;
/*    */   @NotNull
/*    */   private final Brush backgroundSelectedFocused;
/*    */   private final long content;
/*    */   private final long contentDisabled;
/*    */   @NotNull
/*    */   private final Brush border;
/*    */   @NotNull
/*    */   private final Brush borderSelected;
/*    */   @NotNull
/*    */   private final Brush borderSelectedDisabled;
/*    */   @NotNull
/*    */   private final Brush borderSelectedFocused;
/*    */   public static final int $stable;
/*    */   
/* 32 */   private SegmentedControlButtonColors(Brush background, Brush backgroundPressed, Brush backgroundHovered, Brush backgroundSelected, Brush backgroundSelectedFocused, long content, long contentDisabled, Brush border, Brush borderSelected, Brush borderSelectedDisabled, Brush borderSelectedFocused) { this.background = background;
/* 33 */     this.backgroundPressed = backgroundPressed;
/* 34 */     this.backgroundHovered = backgroundHovered;
/* 35 */     this.backgroundSelected = backgroundSelected;
/* 36 */     this.backgroundSelectedFocused = backgroundSelectedFocused;
/* 37 */     this.content = content;
/* 38 */     this.contentDisabled = contentDisabled;
/* 39 */     this.border = border;
/* 40 */     this.borderSelected = borderSelected;
/* 41 */     this.borderSelectedDisabled = borderSelectedDisabled;
/* 42 */     this.borderSelectedFocused = borderSelectedFocused; } @NotNull public final Brush getBackground() { return this.background; } @NotNull public final Brush getBackgroundPressed() { return this.backgroundPressed; } @NotNull public final Brush getBackgroundHovered() { return this.backgroundHovered; } @NotNull public final Brush getBackgroundSelected() { return this.backgroundSelected; } @NotNull public final Brush getBackgroundSelectedFocused() { return this.backgroundSelectedFocused; } @NotNull public final Brush getBorderSelectedFocused() { return this.borderSelectedFocused; }
/*    */   public final long getContent-0d7_KjU() { return this.content; }
/*    */   public final long getContentDisabled-0d7_KjU() { return this.contentDisabled; }
/*    */   @NotNull public final Brush getBorder() { return this.border; }
/*    */   @NotNull public final Brush getBorderSelected() { return this.borderSelected; }
/* 47 */   @NotNull public final Brush getBorderSelectedDisabled() { return this.borderSelectedDisabled; } @Composable @NotNull public final State<Color> contentFor-OIjbplg(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(1123557257); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1123557257, $changed, -1, "org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonColors.contentFor (SegmentedControlButtonStyling.kt:46)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/*    */ 
/*    */         
/* 50 */         Color.box-impl(!SegmentedControlButtonState.isEnabled-impl(state) ? this.contentDisabled : this.content), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; } @Composable
/*    */   @NotNull
/* 56 */   public final State<Brush> backgroundFor-6xSfq1s(long state, boolean isFocused, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(564757556); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(564757556, $changed, -1, "org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonColors.backgroundFor (SegmentedControlButtonStyling.kt:55)");  State<Brush> state1 = SnapshotStateKt.rememberUpdatedState(
/*    */         
/* 58 */         !SegmentedControlButtonState.isEnabled-impl(state) ? this.background : (
/* 59 */         (SegmentedControlButtonState.isSelected-impl(state) && isFocused) ? this.backgroundSelectedFocused : (
/* 60 */         SegmentedControlButtonState.isSelected-impl(state) ? this.backgroundSelected : (
/* 61 */         SegmentedControlButtonState.isPressed-impl(state) ? this.backgroundPressed : (
/* 62 */         SegmentedControlButtonState.isHovered-impl(state) ? this.backgroundHovered : 
/* 63 */         this.background)))), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; } @Composable
/*    */   @NotNull
/* 69 */   public final State<Brush> borderFor-6xSfq1s(long state, boolean isFocused, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-1606001290); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1606001290, $changed, -1, "org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonColors.borderFor (SegmentedControlButtonStyling.kt:68)");  State<Brush> state1 = SnapshotStateKt.rememberUpdatedState(
/*    */         
/* 71 */         !SegmentedControlButtonState.isSelected-impl(state) ? this.border : (
/* 72 */         !SegmentedControlButtonState.isEnabled-impl(state) ? this.borderSelectedDisabled : (
/* 73 */         isFocused ? this.borderSelectedFocused : 
/* 74 */         this.borderSelected)), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SegmentedControlButtonColors))
/*    */       return false; 
/*    */     SegmentedControlButtonColors segmentedControlButtonColors = (SegmentedControlButtonColors)other;
/*    */     return !Intrinsics.areEqual(this.background, segmentedControlButtonColors.background) ? false : (!Intrinsics.areEqual(this.backgroundPressed, segmentedControlButtonColors.backgroundPressed) ? false : (!Intrinsics.areEqual(this.backgroundHovered, segmentedControlButtonColors.backgroundHovered) ? false : (!Intrinsics.areEqual(this.backgroundSelected, segmentedControlButtonColors.backgroundSelected) ? false : (!Intrinsics.areEqual(this.backgroundSelectedFocused, segmentedControlButtonColors.backgroundSelectedFocused) ? false : (!Color.equals-impl0(this.content, segmentedControlButtonColors.content) ? false : (!Color.equals-impl0(this.contentDisabled, segmentedControlButtonColors.contentDisabled) ? false : (!Intrinsics.areEqual(this.border, segmentedControlButtonColors.border) ? false : (!Intrinsics.areEqual(this.borderSelected, segmentedControlButtonColors.borderSelected) ? false : (!Intrinsics.areEqual(this.borderSelectedDisabled, segmentedControlButtonColors.borderSelectedDisabled) ? false : (!!Intrinsics.areEqual(this.borderSelectedFocused, segmentedControlButtonColors.borderSelectedFocused)))))))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.background.hashCode();
/*    */     result = result * 31 + this.backgroundPressed.hashCode();
/*    */     result = result * 31 + this.backgroundHovered.hashCode();
/*    */     result = result * 31 + this.backgroundSelected.hashCode();
/*    */     result = result * 31 + this.backgroundSelectedFocused.hashCode();
/*    */     result = result * 31 + Color.hashCode-impl(this.content);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentDisabled);
/*    */     result = result * 31 + this.border.hashCode();
/*    */     result = result * 31 + this.borderSelected.hashCode();
/*    */     result = result * 31 + this.borderSelectedDisabled.hashCode();
/*    */     return result * 31 + this.borderSelectedFocused.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SegmentedControlButtonColors(background=" + this.background + ", backgroundPressed=" + this.backgroundPressed + ", backgroundHovered=" + this.backgroundHovered + ", backgroundSelected=" + this.backgroundSelected + ", backgroundSelectedFocused=" + this.backgroundSelectedFocused + ", content=" + Color.toString-impl(this.content) + ", contentDisabled=" + Color.toString-impl(this.contentDisabled) + ", border=" + this.border + ", borderSelected=" + this.borderSelected + ", borderSelectedDisabled=" + this.borderSelectedDisabled + ", borderSelectedFocused=" + this.borderSelectedFocused + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\SegmentedControlButtonColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */