/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b$\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\t\b\007\030\000 42\0020\001:\0014B\001\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\003\022\006\020\n\032\0020\003\022\006\020\013\032\0020\003\022\006\020\f\032\0020\003\022\006\020\r\032\0020\003\022\006\020\016\032\0020\003\022\006\020\017\032\0020\003\022\006\020\020\032\0020\003\022\006\020\021\032\0020\003\022\006\020\022\032\0020\003¢\006\004\b\023\020\024J%\020'\032\b\022\004\022\0020\0030(2\006\020)\032\0020*2\006\020+\032\0020,H\007¢\006\004\b-\020.J\035\020/\032\b\022\004\022\0020\0030(2\006\020)\032\0020*H\007¢\006\004\b0\0201J\035\0202\032\b\022\004\022\0020\0030(2\006\020)\032\0020*H\007¢\006\004\b3\0201R\023\020\002\032\0020\003¢\006\n\n\002\020\027\032\004\b\025\020\026R\023\020\004\032\0020\003¢\006\n\n\002\020\027\032\004\b\030\020\026R\023\020\005\032\0020\003¢\006\n\n\002\020\027\032\004\b\031\020\026R\023\020\006\032\0020\003¢\006\n\n\002\020\027\032\004\b\032\020\026R\023\020\007\032\0020\003¢\006\n\n\002\020\027\032\004\b\033\020\026R\023\020\b\032\0020\003¢\006\n\n\002\020\027\032\004\b\034\020\026R\023\020\t\032\0020\003¢\006\n\n\002\020\027\032\004\b\035\020\026R\023\020\n\032\0020\003¢\006\n\n\002\020\027\032\004\b\036\020\026R\023\020\013\032\0020\003¢\006\n\n\002\020\027\032\004\b\037\020\026R\023\020\f\032\0020\003¢\006\n\n\002\020\027\032\004\b \020\026R\023\020\r\032\0020\003¢\006\n\n\002\020\027\032\004\b!\020\026R\023\020\016\032\0020\003¢\006\n\n\002\020\027\032\004\b\"\020\026R\023\020\017\032\0020\003¢\006\n\n\002\020\027\032\004\b#\020\026R\023\020\020\032\0020\003¢\006\n\n\002\020\027\032\004\b$\020\026R\023\020\021\032\0020\003¢\006\n\n\002\020\027\032\004\b%\020\026R\023\020\022\032\0020\003¢\006\n\n\002\020\027\032\004\b&\020\026¨\0065"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;", "", "background", "Landroidx/compose/ui/graphics/Color;", "nonEditableBackground", "backgroundDisabled", "backgroundFocused", "backgroundPressed", "backgroundHovered", "content", "contentDisabled", "contentFocused", "contentPressed", "contentHovered", "border", "borderDisabled", "borderFocused", "borderPressed", "borderHovered", "<init>", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getNonEditableBackground-0d7_KjU", "getBackgroundDisabled-0d7_KjU", "getBackgroundFocused-0d7_KjU", "getBackgroundPressed-0d7_KjU", "getBackgroundHovered-0d7_KjU", "getContent-0d7_KjU", "getContentDisabled-0d7_KjU", "getContentFocused-0d7_KjU", "getContentPressed-0d7_KjU", "getContentHovered-0d7_KjU", "getBorder-0d7_KjU", "getBorderDisabled-0d7_KjU", "getBorderFocused-0d7_KjU", "getBorderPressed-0d7_KjU", "getBorderHovered-0d7_KjU", "backgroundFor", "Landroidx/compose/runtime/State;", "state", "Lorg/jetbrains/jewel/ui/component/ComboBoxState;", "isEditable", "", "backgroundFor-8sYwEIk", "(JZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentFor", "contentFor-zWq4Sqo", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "borderFor", "borderFor-zWq4Sqo", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class ComboBoxColors {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long background;
/*    */   private final long nonEditableBackground;
/*    */   private final long backgroundDisabled;
/*    */   private final long backgroundFocused;
/*    */   private final long backgroundPressed;
/*    */   private final long backgroundHovered;
/*    */   private final long content;
/*    */   private final long contentDisabled;
/*    */   private final long contentFocused;
/*    */   private final long contentPressed;
/*    */   private final long contentHovered;
/*    */   private final long border;
/*    */   private final long borderDisabled;
/*    */   private final long borderFocused;
/*    */   private final long borderPressed;
/*    */   private final long borderHovered;
/*    */   public static final int $stable;
/*    */   
/* 32 */   private ComboBoxColors(long background, long nonEditableBackground, long backgroundDisabled, long backgroundFocused, long backgroundPressed, long backgroundHovered, long content, long contentDisabled, long contentFocused, long contentPressed, long contentHovered, long border, long borderDisabled, long borderFocused, long borderPressed, long borderHovered) { this.background = background;
/* 33 */     this.nonEditableBackground = nonEditableBackground;
/* 34 */     this.backgroundDisabled = backgroundDisabled;
/* 35 */     this.backgroundFocused = backgroundFocused;
/* 36 */     this.backgroundPressed = backgroundPressed;
/* 37 */     this.backgroundHovered = backgroundHovered;
/* 38 */     this.content = content;
/* 39 */     this.contentDisabled = contentDisabled;
/* 40 */     this.contentFocused = contentFocused;
/* 41 */     this.contentPressed = contentPressed;
/* 42 */     this.contentHovered = contentHovered;
/* 43 */     this.border = border;
/* 44 */     this.borderDisabled = borderDisabled;
/* 45 */     this.borderFocused = borderFocused;
/* 46 */     this.borderPressed = borderPressed;
/* 47 */     this.borderHovered = borderHovered; } public final long getBackground-0d7_KjU() { return this.background; } public final long getNonEditableBackground-0d7_KjU() { return this.nonEditableBackground; } public final long getBackgroundDisabled-0d7_KjU() { return this.backgroundDisabled; } public final long getBackgroundFocused-0d7_KjU() { return this.backgroundFocused; } public final long getBackgroundPressed-0d7_KjU() { return this.backgroundPressed; } public final long getBackgroundHovered-0d7_KjU() { return this.backgroundHovered; } public final long getContent-0d7_KjU() { return this.content; } public final long getBorderHovered-0d7_KjU() { return this.borderHovered; }
/*    */   public final long getContentDisabled-0d7_KjU() { return this.contentDisabled; }
/*    */   public final long getContentFocused-0d7_KjU() { return this.contentFocused; }
/*    */   public final long getContentPressed-0d7_KjU() { return this.contentPressed; }
/* 51 */   public final long getContentHovered-0d7_KjU() { return this.contentHovered; } public final long getBorder-0d7_KjU() { return this.border; } public final long getBorderDisabled-0d7_KjU() { return this.borderDisabled; } public final long getBorderFocused-0d7_KjU() { return this.borderFocused; } public final long getBorderPressed-0d7_KjU() { return this.borderPressed; } @Composable @NotNull public final State<Color> backgroundFor-8sYwEIk(long state, boolean isEditable, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-1970851628); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1970851628, $changed, -1, "org.jetbrains.jewel.ui.component.styling.ComboBoxColors.backgroundFor (ComboBoxStyling.kt:50)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 61 */         Color.box-impl((!isEditable && ComboBoxState.isEnabled-impl(state)) ? this.nonEditableBackground : ((!isEditable && !ComboBoxState.isEnabled-impl(state)) ? this.backgroundDisabled : ((ComboBoxState.isFocused-impl(state) && isEditable) ? this.backgroundFocused : ((ComboBoxState.isActive-impl(state) && isEditable) ? this.background : (ComboBoxState.isPressed-impl(state) ? this.backgroundPressed : (ComboBoxState.isHovered-impl(state) ? this.backgroundHovered : ((isEditable && !ComboBoxState.isEnabled-impl(state)) ? this.backgroundDisabled : (isEditable ? this.background : this.background)))))))), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; } @Composable
/*    */   @NotNull
/* 67 */   public final State<Color> contentFor-zWq4Sqo(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-166049943); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-166049943, $changed, -1, "org.jetbrains.jewel.ui.component.styling.ComboBoxColors.contentFor (ComboBoxStyling.kt:66)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/* 68 */         ComboBoxState.chooseValue-impl(state, 
/* 69 */           Color.box-impl(this.content), 
/* 70 */           Color.box-impl(this.contentDisabled), 
/* 71 */           Color.box-impl(this.contentFocused), 
/* 72 */           Color.box-impl(this.contentPressed), 
/* 73 */           Color.box-impl(this.contentHovered), 
/* 74 */           Color.box-impl(this.content), $composer, 0x380000 & $changed << 18), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; } @Composable
/*    */   @NotNull
/* 80 */   public final State<Color> borderFor-zWq4Sqo(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(1203993914); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1203993914, $changed, -1, "org.jetbrains.jewel.ui.component.styling.ComboBoxColors.borderFor (ComboBoxStyling.kt:79)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/* 81 */         ComboBoxState.chooseValue-impl(state, 
/* 82 */           Color.box-impl(this.border), 
/* 83 */           Color.box-impl(this.borderDisabled), 
/* 84 */           Color.box-impl(this.borderFocused), 
/* 85 */           Color.box-impl(this.borderPressed), 
/* 86 */           Color.box-impl(this.borderHovered), 
/* 87 */           Color.box-impl(this.border), $composer, 0x380000 & $changed << 18), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ComboBoxColors))
/*    */       return false; 
/*    */     ComboBoxColors comboBoxColors = (ComboBoxColors)other;
/*    */     return !Color.equals-impl0(this.background, comboBoxColors.background) ? false : (!Color.equals-impl0(this.nonEditableBackground, comboBoxColors.nonEditableBackground) ? false : (!Color.equals-impl0(this.backgroundDisabled, comboBoxColors.backgroundDisabled) ? false : (!Color.equals-impl0(this.backgroundFocused, comboBoxColors.backgroundFocused) ? false : (!Color.equals-impl0(this.backgroundPressed, comboBoxColors.backgroundPressed) ? false : (!Color.equals-impl0(this.backgroundHovered, comboBoxColors.backgroundHovered) ? false : (!Color.equals-impl0(this.content, comboBoxColors.content) ? false : (!Color.equals-impl0(this.contentDisabled, comboBoxColors.contentDisabled) ? false : (!Color.equals-impl0(this.contentFocused, comboBoxColors.contentFocused) ? false : (!Color.equals-impl0(this.contentPressed, comboBoxColors.contentPressed) ? false : (!Color.equals-impl0(this.contentHovered, comboBoxColors.contentHovered) ? false : (!Color.equals-impl0(this.border, comboBoxColors.border) ? false : (!Color.equals-impl0(this.borderDisabled, comboBoxColors.borderDisabled) ? false : (!Color.equals-impl0(this.borderFocused, comboBoxColors.borderFocused) ? false : (!Color.equals-impl0(this.borderPressed, comboBoxColors.borderPressed) ? false : (!!Color.equals-impl0(this.borderHovered, comboBoxColors.borderHovered))))))))))))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.background);
/*    */     result = result * 31 + Color.hashCode-impl(this.nonEditableBackground);
/*    */     result = result * 31 + Color.hashCode-impl(this.backgroundDisabled);
/*    */     result = result * 31 + Color.hashCode-impl(this.backgroundFocused);
/*    */     result = result * 31 + Color.hashCode-impl(this.backgroundPressed);
/*    */     result = result * 31 + Color.hashCode-impl(this.backgroundHovered);
/*    */     result = result * 31 + Color.hashCode-impl(this.content);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentDisabled);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentFocused);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentPressed);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentHovered);
/*    */     result = result * 31 + Color.hashCode-impl(this.border);
/*    */     result = result * 31 + Color.hashCode-impl(this.borderDisabled);
/*    */     result = result * 31 + Color.hashCode-impl(this.borderFocused);
/*    */     result = result * 31 + Color.hashCode-impl(this.borderPressed);
/*    */     return result * 31 + Color.hashCode-impl(this.borderHovered);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ComboBoxColors(background=" + Color.toString-impl(this.background) + ", nonEditableBackground=" + Color.toString-impl(this.nonEditableBackground) + ", backgroundDisabled=" + Color.toString-impl(this.backgroundDisabled) + ", backgroundFocused=" + Color.toString-impl(this.backgroundFocused) + ", backgroundPressed=" + Color.toString-impl(this.backgroundPressed) + ", backgroundHovered=" + Color.toString-impl(this.backgroundHovered) + ", content=" + Color.toString-impl(this.content) + ", contentDisabled=" + Color.toString-impl(this.contentDisabled) + ", contentFocused=" + Color.toString-impl(this.contentFocused) + ", contentPressed=" + Color.toString-impl(this.contentPressed) + ", contentHovered=" + Color.toString-impl(this.contentHovered) + ", border=" + Color.toString-impl(this.border) + ", borderDisabled=" + Color.toString-impl(this.borderDisabled) + ", borderFocused=" + Color.toString-impl(this.borderFocused) + ", borderPressed=" + Color.toString-impl(this.borderPressed) + ", borderHovered=" + Color.toString-impl(this.borderHovered) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\ComboBoxColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */