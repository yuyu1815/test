/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\"\n\002\030\002\n\000\n\002\030\002\n\002\b\016\b\007\030\000 52\0020\001:\0015B\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\003\022\006\020\n\032\0020\003\022\006\020\013\032\0020\003\022\006\020\f\032\0020\003\022\006\020\r\032\0020\003\022\006\020\016\032\0020\003\022\006\020\017\032\0020\003\022\006\020\020\032\0020\003\022\006\020\021\032\0020\003¢\006\004\b\022\020\023J\035\020%\032\b\022\004\022\0020\0030&2\006\020'\032\0020(H\007¢\006\004\b)\020*J\035\020+\032\b\022\004\022\0020\0030&2\006\020'\032\0020(H\007¢\006\004\b,\020*J;\020-\032\0020\003*\0020(2\006\020.\032\0020\0032\006\020/\032\0020\0032\006\0200\032\0020\0032\006\0201\032\0020\0032\006\0202\032\0020\003H\003¢\006\004\b3\0204R\023\020\002\032\0020\003¢\006\n\n\002\020\026\032\004\b\024\020\025R\023\020\004\032\0020\003¢\006\n\n\002\020\026\032\004\b\027\020\025R\023\020\005\032\0020\003¢\006\n\n\002\020\026\032\004\b\030\020\025R\023\020\006\032\0020\003¢\006\n\n\002\020\026\032\004\b\031\020\025R\023\020\007\032\0020\003¢\006\n\n\002\020\026\032\004\b\032\020\025R\023\020\b\032\0020\003¢\006\n\n\002\020\026\032\004\b\033\020\025R\023\020\t\032\0020\003¢\006\n\n\002\020\026\032\004\b\034\020\025R\023\020\n\032\0020\003¢\006\n\n\002\020\026\032\004\b\035\020\025R\023\020\013\032\0020\003¢\006\n\n\002\020\026\032\004\b\036\020\025R\023\020\f\032\0020\003¢\006\n\n\002\020\026\032\004\b\037\020\025R\023\020\r\032\0020\003¢\006\n\n\002\020\026\032\004\b \020\025R\023\020\016\032\0020\003¢\006\n\n\002\020\026\032\004\b!\020\025R\023\020\017\032\0020\003¢\006\n\n\002\020\026\032\004\b\"\020\025R\023\020\020\032\0020\003¢\006\n\n\002\020\026\032\004\b#\020\025R\023\020\021\032\0020\003¢\006\n\n\002\020\026\032\004\b$\020\025¨\0066"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SliderColors;", "", "track", "Landroidx/compose/ui/graphics/Color;", "trackFilled", "trackDisabled", "trackFilledDisabled", "stepMarker", "thumbFill", "thumbFillDisabled", "thumbFillFocused", "thumbFillPressed", "thumbFillHovered", "thumbBorder", "thumbBorderFocused", "thumbBorderDisabled", "thumbBorderPressed", "thumbBorderHovered", "<init>", "(JJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTrack-0d7_KjU", "()J", "J", "getTrackFilled-0d7_KjU", "getTrackDisabled-0d7_KjU", "getTrackFilledDisabled-0d7_KjU", "getStepMarker-0d7_KjU", "getThumbFill-0d7_KjU", "getThumbFillDisabled-0d7_KjU", "getThumbFillFocused-0d7_KjU", "getThumbFillPressed-0d7_KjU", "getThumbFillHovered-0d7_KjU", "getThumbBorder-0d7_KjU", "getThumbBorderFocused-0d7_KjU", "getThumbBorderDisabled-0d7_KjU", "getThumbBorderPressed-0d7_KjU", "getThumbBorderHovered-0d7_KjU", "thumbFillFor", "Landroidx/compose/runtime/State;", "state", "Lorg/jetbrains/jewel/ui/component/SliderState;", "thumbFillFor-p6gmeQ4", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "thumbBorderFor", "thumbBorderFor-p6gmeQ4", "chooseColor", "normal", "disabled", "pressed", "hovered", "focused", "chooseColor-JfECPKU", "(JJJJJJLandroidx/compose/runtime/Composer;I)J", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class SliderColors {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long track;
/*    */   private final long trackFilled;
/*    */   private final long trackDisabled;
/*    */   private final long trackFilledDisabled;
/*    */   private final long stepMarker;
/*    */   private final long thumbFill;
/*    */   private final long thumbFillDisabled;
/*    */   private final long thumbFillFocused;
/*    */   private final long thumbFillPressed;
/*    */   private final long thumbFillHovered;
/*    */   private final long thumbBorder;
/*    */   private final long thumbBorderFocused;
/*    */   private final long thumbBorderDisabled;
/*    */   private final long thumbBorderPressed;
/*    */   private final long thumbBorderHovered;
/*    */   public static final int $stable;
/*    */   
/* 31 */   private SliderColors(long track, long trackFilled, long trackDisabled, long trackFilledDisabled, long stepMarker, long thumbFill, long thumbFillDisabled, long thumbFillFocused, long thumbFillPressed, long thumbFillHovered, long thumbBorder, long thumbBorderFocused, long thumbBorderDisabled, long thumbBorderPressed, long thumbBorderHovered) { this.track = track;
/* 32 */     this.trackFilled = trackFilled;
/* 33 */     this.trackDisabled = trackDisabled;
/* 34 */     this.trackFilledDisabled = trackFilledDisabled;
/* 35 */     this.stepMarker = stepMarker;
/* 36 */     this.thumbFill = thumbFill;
/* 37 */     this.thumbFillDisabled = thumbFillDisabled;
/* 38 */     this.thumbFillFocused = thumbFillFocused;
/* 39 */     this.thumbFillPressed = thumbFillPressed;
/* 40 */     this.thumbFillHovered = thumbFillHovered;
/* 41 */     this.thumbBorder = thumbBorder;
/* 42 */     this.thumbBorderFocused = thumbBorderFocused;
/* 43 */     this.thumbBorderDisabled = thumbBorderDisabled;
/* 44 */     this.thumbBorderPressed = thumbBorderPressed;
/* 45 */     this.thumbBorderHovered = thumbBorderHovered; } public final long getTrack-0d7_KjU() { return this.track; } public final long getTrackFilled-0d7_KjU() { return this.trackFilled; } public final long getTrackDisabled-0d7_KjU() { return this.trackDisabled; } public final long getTrackFilledDisabled-0d7_KjU() { return this.trackFilledDisabled; } public final long getStepMarker-0d7_KjU() { return this.stepMarker; } public final long getThumbFill-0d7_KjU() { return this.thumbFill; } public final long getThumbFillDisabled-0d7_KjU() { return this.thumbFillDisabled; } public final long getThumbBorderHovered-0d7_KjU() { return this.thumbBorderHovered; }
/*    */   public final long getThumbFillFocused-0d7_KjU() { return this.thumbFillFocused; }
/*    */   public final long getThumbFillPressed-0d7_KjU() { return this.thumbFillPressed; }
/*    */   public final long getThumbFillHovered-0d7_KjU() { return this.thumbFillHovered; }
/* 49 */   public final long getThumbBorder-0d7_KjU() { return this.thumbBorder; } public final long getThumbBorderFocused-0d7_KjU() { return this.thumbBorderFocused; } public final long getThumbBorderDisabled-0d7_KjU() { return this.thumbBorderDisabled; } public final long getThumbBorderPressed-0d7_KjU() { return this.thumbBorderPressed; } @Composable @NotNull public final State<Color> thumbFillFor-p6gmeQ4(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-2024739291); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2024739291, $changed, -1, "org.jetbrains.jewel.ui.component.styling.SliderColors.thumbFillFor (SliderStyling.kt:48)");
/*    */     
/* 51 */     long l1 = this.thumbFill;
/* 52 */     long l2 = this.thumbFillDisabled;
/* 53 */     long l3 = this.thumbFillFocused;
/* 54 */     long l4 = this.thumbFillPressed;
/* 55 */     long l5 = this.thumbFillHovered; State<Color> state1 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(chooseColor-JfECPKU(state, l1, l2, l4, l5, l3, $composer, 0xE & $changed | 0x380000 & $changed << 15)), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; } @Composable
/*    */   @NotNull
/* 61 */   public final State<Color> thumbBorderFor-p6gmeQ4(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-267275812); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-267275812, $changed, -1, "org.jetbrains.jewel.ui.component.styling.SliderColors.thumbBorderFor (SliderStyling.kt:60)");
/*    */     
/* 63 */     long l1 = this.thumbBorder;
/* 64 */     long l2 = this.thumbBorderDisabled;
/* 65 */     long l3 = this.thumbBorderFocused;
/* 66 */     long l4 = this.thumbBorderPressed;
/* 67 */     long l5 = this.thumbBorderHovered; State<Color> state1 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(chooseColor-JfECPKU(state, l1, l2, l4, l5, l3, $composer, 0xE & $changed | 0x380000 & $changed << 15)), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress()) {
/*    */       ComposerKt.traceEventEnd();
/*    */     }
/*    */     $composer.endReplaceGroup();
/*    */     return state1; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Composable
/*    */   private final long chooseColor-JfECPKU(long $this$chooseColor_u2dJfECPKU, long normal, long disabled, long pressed, long hovered, long focused, Composer $composer, int $changed) {
/* 79 */     $composer.startReplaceGroup(925875528); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(925875528, $changed, -1, "org.jetbrains.jewel.ui.component.styling.SliderColors.chooseColor (SliderStyling.kt:78)");
/*    */ 
/*    */     
/* 82 */     $composer.startReplaceGroup(873857387); boolean bool = (SliderState.isPressed-impl($this$chooseColor_u2dJfECPKU) && !JewelTheme.Companion.isSwingCompatMode($composer, 6)) ? true : false; $composer.endReplaceGroup();
/* 83 */     $composer.startReplaceGroup(873922859); bool = (SliderState.isHovered-impl($this$chooseColor_u2dJfECPKU) && !JewelTheme.Companion.isSwingCompatMode($composer, 6)) ? true : false; $composer.endReplaceGroup(); long l = !SliderState.isEnabled-impl($this$chooseColor_u2dJfECPKU) ? disabled : (SliderState.isFocused-impl($this$chooseColor_u2dJfECPKU) ? focused : (bool ? pressed : (bool ? hovered : 
/* 84 */       normal)));
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return l;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SliderColors))
/*    */       return false; 
/*    */     SliderColors sliderColors = (SliderColors)other;
/*    */     return !Color.equals-impl0(this.track, sliderColors.track) ? false : (!Color.equals-impl0(this.trackFilled, sliderColors.trackFilled) ? false : (!Color.equals-impl0(this.trackDisabled, sliderColors.trackDisabled) ? false : (!Color.equals-impl0(this.trackFilledDisabled, sliderColors.trackFilledDisabled) ? false : (!Color.equals-impl0(this.stepMarker, sliderColors.stepMarker) ? false : (!Color.equals-impl0(this.thumbFill, sliderColors.thumbFill) ? false : (!Color.equals-impl0(this.thumbFillDisabled, sliderColors.thumbFillDisabled) ? false : (!Color.equals-impl0(this.thumbFillFocused, sliderColors.thumbFillFocused) ? false : (!Color.equals-impl0(this.thumbFillPressed, sliderColors.thumbFillPressed) ? false : (!Color.equals-impl0(this.thumbFillHovered, sliderColors.thumbFillHovered) ? false : (!Color.equals-impl0(this.thumbBorder, sliderColors.thumbBorder) ? false : (!Color.equals-impl0(this.thumbBorderFocused, sliderColors.thumbBorderFocused) ? false : (!Color.equals-impl0(this.thumbBorderDisabled, sliderColors.thumbBorderDisabled) ? false : (!Color.equals-impl0(this.thumbBorderPressed, sliderColors.thumbBorderPressed) ? false : (!!Color.equals-impl0(this.thumbBorderHovered, sliderColors.thumbBorderHovered)))))))))))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.track);
/*    */     result = result * 31 + Color.hashCode-impl(this.trackFilled);
/*    */     result = result * 31 + Color.hashCode-impl(this.trackDisabled);
/*    */     result = result * 31 + Color.hashCode-impl(this.trackFilledDisabled);
/*    */     result = result * 31 + Color.hashCode-impl(this.stepMarker);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbFill);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbFillDisabled);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbFillFocused);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbFillPressed);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbFillHovered);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbBorder);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbBorderFocused);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbBorderDisabled);
/*    */     result = result * 31 + Color.hashCode-impl(this.thumbBorderPressed);
/*    */     return result * 31 + Color.hashCode-impl(this.thumbBorderHovered);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SliderColors(track=" + Color.toString-impl(this.track) + ", trackFilled=" + Color.toString-impl(this.trackFilled) + ", trackDisabled=" + Color.toString-impl(this.trackDisabled) + ", trackFilledDisabled=" + Color.toString-impl(this.trackFilledDisabled) + ", stepMarker=" + Color.toString-impl(this.stepMarker) + ", thumbFill=" + Color.toString-impl(this.thumbFill) + ", thumbFillDisabled=" + Color.toString-impl(this.thumbFillDisabled) + ", thumbFillFocused=" + Color.toString-impl(this.thumbFillFocused) + ", thumbFillPressed=" + Color.toString-impl(this.thumbFillPressed) + ", thumbFillHovered=" + Color.toString-impl(this.thumbFillHovered) + ", thumbBorder=" + Color.toString-impl(this.thumbBorder) + ", thumbBorderFocused=" + Color.toString-impl(this.thumbBorderFocused) + ", thumbBorderDisabled=" + Color.toString-impl(this.thumbBorderDisabled) + ", thumbBorderPressed=" + Color.toString-impl(this.thumbBorderPressed) + ", thumbBorderHovered=" + Color.toString-impl(this.thumbBorderHovered) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SliderColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\SliderColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */