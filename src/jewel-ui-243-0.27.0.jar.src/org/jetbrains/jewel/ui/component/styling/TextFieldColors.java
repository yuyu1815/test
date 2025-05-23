/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b/\b\007\030\000 12\0020\001:\0011B¯\001\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\003\022\006\020\n\032\0020\003\022\006\020\013\032\0020\003\022\006\020\f\032\0020\003\022\006\020\r\032\0020\003\022\006\020\016\032\0020\003\022\006\020\017\032\0020\003\022\006\020\020\032\0020\003\022\006\020\021\032\0020\003\022\006\020\022\032\0020\003\022\006\020\023\032\0020\003\022\006\020\024\032\0020\003\022\006\020\025\032\0020\003\022\006\020\026\032\0020\003\022\006\020\027\032\0020\003¢\006\004\b\030\020\031R\026\020\002\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b\032\020\033R\026\020\004\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b\035\020\033R\026\020\005\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b\036\020\033R\026\020\006\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b\037\020\033R\026\020\007\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b \020\033R\026\020\b\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b!\020\033R\026\020\t\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b\"\020\033R\026\020\n\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b#\020\033R\026\020\013\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b$\020\033R\026\020\f\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b%\020\033R\026\020\r\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b&\020\033R\026\020\016\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b'\020\033R\026\020\017\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b(\020\033R\026\020\020\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b)\020\033R\026\020\021\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b*\020\033R\026\020\022\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b+\020\033R\026\020\023\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b,\020\033R\026\020\024\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b-\020\033R\026\020\025\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b.\020\033R\026\020\026\032\0020\003X\004¢\006\n\n\002\020\034\032\004\b/\020\033R\023\020\027\032\0020\003¢\006\n\n\002\020\034\032\004\b0\020\033¨\0062"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TextFieldColors;", "Lorg/jetbrains/jewel/ui/component/styling/InputFieldColors;", "background", "Landroidx/compose/ui/graphics/Color;", "backgroundDisabled", "backgroundFocused", "backgroundPressed", "backgroundHovered", "content", "contentDisabled", "contentFocused", "contentPressed", "contentHovered", "border", "borderDisabled", "borderFocused", "borderPressed", "borderHovered", "caret", "caretDisabled", "caretFocused", "caretPressed", "caretHovered", "placeholder", "<init>", "(JJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getBackgroundDisabled-0d7_KjU", "getBackgroundFocused-0d7_KjU", "getBackgroundPressed-0d7_KjU", "getBackgroundHovered-0d7_KjU", "getContent-0d7_KjU", "getContentDisabled-0d7_KjU", "getContentFocused-0d7_KjU", "getContentPressed-0d7_KjU", "getContentHovered-0d7_KjU", "getBorder-0d7_KjU", "getBorderDisabled-0d7_KjU", "getBorderFocused-0d7_KjU", "getBorderPressed-0d7_KjU", "getBorderHovered-0d7_KjU", "getCaret-0d7_KjU", "getCaretDisabled-0d7_KjU", "getCaretFocused-0d7_KjU", "getCaretPressed-0d7_KjU", "getCaretHovered-0d7_KjU", "getPlaceholder-0d7_KjU", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class TextFieldColors implements InputFieldColors {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long background;
/*    */   private final long backgroundDisabled;
/*    */   private final long backgroundFocused;
/*    */   private final long backgroundPressed;
/*    */   private final long backgroundHovered;
/*    */   private final long content;
/*    */   private final long contentDisabled;
/*    */   private final long contentFocused;
/*    */   private final long contentPressed;
/*    */   private final long contentHovered;
/*    */   
/*    */   @Composable
/*    */   @NotNull
/* 21 */   public State<Color> backgroundFor-xB6EZ8U(long state, @Nullable Composer $composer, int $changed) { return InputFieldColors.DefaultImpls.backgroundFor-xB6EZ8U(this, state, $composer, $changed); } private final long border; private final long borderDisabled; private final long borderFocused; private final long borderPressed; private final long borderHovered; private final long caret; private final long caretDisabled; private final long caretFocused; private final long caretPressed; private final long caretHovered; private final long placeholder; public static final int $stable; @Composable @NotNull public State<Color> contentFor-xB6EZ8U(long state, @Nullable Composer $composer, int $changed) { return InputFieldColors.DefaultImpls.contentFor-xB6EZ8U(this, state, $composer, $changed); } @Composable @NotNull public State<Color> borderFor-xB6EZ8U(long state, @Nullable Composer $composer, int $changed) { return InputFieldColors.DefaultImpls.borderFor-xB6EZ8U(this, state, $composer, $changed); } @Composable @NotNull public State<Color> caretFor-xB6EZ8U(long state, @Nullable Composer $composer, int $changed) { return InputFieldColors.DefaultImpls.caretFor-xB6EZ8U(this, state, $composer, $changed); }
/*    */ 
/*    */   
/* 24 */   private TextFieldColors(long background, long backgroundDisabled, long backgroundFocused, long backgroundPressed, long backgroundHovered, long content, long contentDisabled, long contentFocused, long contentPressed, long contentHovered, long border, long borderDisabled, long borderFocused, long borderPressed, long borderHovered, long caret, long caretDisabled, long caretFocused, long caretPressed, long caretHovered, long placeholder) { this.background = background;
/* 25 */     this.backgroundDisabled = backgroundDisabled;
/* 26 */     this.backgroundFocused = backgroundFocused;
/* 27 */     this.backgroundPressed = backgroundPressed;
/* 28 */     this.backgroundHovered = backgroundHovered;
/* 29 */     this.content = content;
/* 30 */     this.contentDisabled = contentDisabled;
/* 31 */     this.contentFocused = contentFocused;
/* 32 */     this.contentPressed = contentPressed;
/* 33 */     this.contentHovered = contentHovered;
/* 34 */     this.border = border;
/* 35 */     this.borderDisabled = borderDisabled;
/* 36 */     this.borderFocused = borderFocused;
/* 37 */     this.borderPressed = borderPressed;
/* 38 */     this.borderHovered = borderHovered;
/* 39 */     this.caret = caret;
/* 40 */     this.caretDisabled = caretDisabled;
/* 41 */     this.caretFocused = caretFocused;
/* 42 */     this.caretPressed = caretPressed;
/* 43 */     this.caretHovered = caretHovered;
/* 44 */     this.placeholder = placeholder; } public long getBackground-0d7_KjU() { return this.background; } public long getBackgroundDisabled-0d7_KjU() { return this.backgroundDisabled; } public long getBackgroundFocused-0d7_KjU() { return this.backgroundFocused; } public long getBackgroundPressed-0d7_KjU() { return this.backgroundPressed; } public long getBackgroundHovered-0d7_KjU() { return this.backgroundHovered; } public final long getPlaceholder-0d7_KjU() { return this.placeholder; }
/*    */ 
/*    */   
/*    */   public long getContent-0d7_KjU() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   public long getContentDisabled-0d7_KjU() {
/*    */     return this.contentDisabled;
/*    */   }
/*    */   
/*    */   public long getContentFocused-0d7_KjU() {
/*    */     return this.contentFocused;
/*    */   }
/*    */   
/*    */   public long getContentPressed-0d7_KjU() {
/*    */     return this.contentPressed;
/*    */   }
/*    */   
/*    */   public long getContentHovered-0d7_KjU() {
/*    */     return this.contentHovered;
/*    */   }
/*    */   
/*    */   public long getBorder-0d7_KjU() {
/*    */     return this.border;
/*    */   }
/*    */   
/*    */   public long getBorderDisabled-0d7_KjU() {
/*    */     return this.borderDisabled;
/*    */   }
/*    */   
/*    */   public long getBorderFocused-0d7_KjU() {
/*    */     return this.borderFocused;
/*    */   }
/*    */   
/*    */   public long getBorderPressed-0d7_KjU() {
/*    */     return this.borderPressed;
/*    */   }
/*    */   
/*    */   public long getBorderHovered-0d7_KjU() {
/*    */     return this.borderHovered;
/*    */   }
/*    */   
/*    */   public long getCaret-0d7_KjU() {
/*    */     return this.caret;
/*    */   }
/*    */   
/*    */   public long getCaretDisabled-0d7_KjU() {
/*    */     return this.caretDisabled;
/*    */   }
/*    */   
/*    */   public long getCaretFocused-0d7_KjU() {
/*    */     return this.caretFocused;
/*    */   }
/*    */   
/*    */   public long getCaretPressed-0d7_KjU() {
/*    */     return this.caretPressed;
/*    */   }
/*    */   
/*    */   public long getCaretHovered-0d7_KjU() {
/*    */     return this.caretHovered;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TextFieldColors))
/*    */       return false; 
/*    */     TextFieldColors textFieldColors = (TextFieldColors)other;
/*    */     return !Color.equals-impl0(this.background, textFieldColors.background) ? false : (!Color.equals-impl0(this.backgroundDisabled, textFieldColors.backgroundDisabled) ? false : (!Color.equals-impl0(this.backgroundFocused, textFieldColors.backgroundFocused) ? false : (!Color.equals-impl0(this.backgroundPressed, textFieldColors.backgroundPressed) ? false : (!Color.equals-impl0(this.backgroundHovered, textFieldColors.backgroundHovered) ? false : (!Color.equals-impl0(this.content, textFieldColors.content) ? false : (!Color.equals-impl0(this.contentDisabled, textFieldColors.contentDisabled) ? false : (!Color.equals-impl0(this.contentFocused, textFieldColors.contentFocused) ? false : (!Color.equals-impl0(this.contentPressed, textFieldColors.contentPressed) ? false : (!Color.equals-impl0(this.contentHovered, textFieldColors.contentHovered) ? false : (!Color.equals-impl0(this.border, textFieldColors.border) ? false : (!Color.equals-impl0(this.borderDisabled, textFieldColors.borderDisabled) ? false : (!Color.equals-impl0(this.borderFocused, textFieldColors.borderFocused) ? false : (!Color.equals-impl0(this.borderPressed, textFieldColors.borderPressed) ? false : (!Color.equals-impl0(this.borderHovered, textFieldColors.borderHovered) ? false : (!Color.equals-impl0(this.caret, textFieldColors.caret) ? false : (!Color.equals-impl0(this.caretDisabled, textFieldColors.caretDisabled) ? false : (!Color.equals-impl0(this.caretFocused, textFieldColors.caretFocused) ? false : (!Color.equals-impl0(this.caretPressed, textFieldColors.caretPressed) ? false : (!Color.equals-impl0(this.caretHovered, textFieldColors.caretHovered) ? false : (!!Color.equals-impl0(this.placeholder, textFieldColors.placeholder)))))))))))))))))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.background);
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
/*    */     result = result * 31 + Color.hashCode-impl(this.borderHovered);
/*    */     result = result * 31 + Color.hashCode-impl(this.caret);
/*    */     result = result * 31 + Color.hashCode-impl(this.caretDisabled);
/*    */     result = result * 31 + Color.hashCode-impl(this.caretFocused);
/*    */     result = result * 31 + Color.hashCode-impl(this.caretPressed);
/*    */     result = result * 31 + Color.hashCode-impl(this.caretHovered);
/*    */     return result * 31 + Color.hashCode-impl(this.placeholder);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TextFieldColors(background=" + Color.toString-impl(this.background) + ", backgroundDisabled=" + Color.toString-impl(this.backgroundDisabled) + ", backgroundFocused=" + Color.toString-impl(this.backgroundFocused) + ", backgroundPressed=" + Color.toString-impl(this.backgroundPressed) + ", backgroundHovered=" + Color.toString-impl(this.backgroundHovered) + ", content=" + Color.toString-impl(this.content) + ", contentDisabled=" + Color.toString-impl(this.contentDisabled) + ", contentFocused=" + Color.toString-impl(this.contentFocused) + ", contentPressed=" + Color.toString-impl(this.contentPressed) + ", contentHovered=" + Color.toString-impl(this.contentHovered) + ", border=" + Color.toString-impl(this.border) + ", borderDisabled=" + Color.toString-impl(this.borderDisabled) + ", borderFocused=" + Color.toString-impl(this.borderFocused) + ", borderPressed=" + Color.toString-impl(this.borderPressed) + ", borderHovered=" + Color.toString-impl(this.borderHovered) + ", caret=" + Color.toString-impl(this.caret) + ", caretDisabled=" + Color.toString-impl(this.caretDisabled) + ", caretFocused=" + Color.toString-impl(this.caretFocused) + ", caretPressed=" + Color.toString-impl(this.caretPressed) + ", caretHovered=" + Color.toString-impl(this.caretHovered) + ", placeholder=" + Color.toString-impl(this.placeholder) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TextFieldColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\TextFieldColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */