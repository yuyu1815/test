/*    */ package org.jetbrains.jewel.foundation.theme;
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\025\b\007\030\0002\0020\001BW\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\006\020\f\032\0020\013\022\006\020\r\032\0020\013\022\006\020\016\032\0020\017\022\006\020\020\032\0020\021\022\006\020\022\032\0020\023¢\006\004\b\024\020\025R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\026\020\027R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\004\020\030R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\031\020\032R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\033\020\034R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\035\020\036R\021\020\f\032\0020\013¢\006\b\n\000\032\004\b\037\020\036R\021\020\r\032\0020\013¢\006\b\n\000\032\004\b \020\036R\023\020\016\032\0020\017¢\006\n\n\002\020#\032\004\b!\020\"R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b$\020%R\021\020\022\032\0020\023¢\006\b\n\000\032\004\b&\020'¨\006("}, d2 = {"Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;", "", "name", "", "isDark", "", "globalColors", "Lorg/jetbrains/jewel/foundation/GlobalColors;", "globalMetrics", "Lorg/jetbrains/jewel/foundation/GlobalMetrics;", "defaultTextStyle", "Landroidx/compose/ui/text/TextStyle;", "editorTextStyle", "consoleTextStyle", "contentColor", "Landroidx/compose/ui/graphics/Color;", "colorPalette", "Lorg/jetbrains/jewel/foundation/theme/ThemeColorPalette;", "iconData", "Lorg/jetbrains/jewel/foundation/theme/ThemeIconData;", "<init>", "(Ljava/lang/String;ZLorg/jetbrains/jewel/foundation/GlobalColors;Lorg/jetbrains/jewel/foundation/GlobalMetrics;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;JLorg/jetbrains/jewel/foundation/theme/ThemeColorPalette;Lorg/jetbrains/jewel/foundation/theme/ThemeIconData;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getName", "()Ljava/lang/String;", "()Z", "getGlobalColors", "()Lorg/jetbrains/jewel/foundation/GlobalColors;", "getGlobalMetrics", "()Lorg/jetbrains/jewel/foundation/GlobalMetrics;", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "getEditorTextStyle", "getConsoleTextStyle", "getContentColor-0d7_KjU", "()J", "J", "getColorPalette", "()Lorg/jetbrains/jewel/foundation/theme/ThemeColorPalette;", "getIconData", "()Lorg/jetbrains/jewel/foundation/theme/ThemeIconData;", "foundation"})
/*    */ @Immutable
/*    */ public final class ThemeDefinition { @NotNull
/*    */   private final String name; private final boolean isDark; @NotNull
/*    */   private final GlobalColors globalColors;
/*    */   @NotNull
/*    */   private final GlobalMetrics globalMetrics;
/*    */   @NotNull
/*    */   private final TextStyle defaultTextStyle;
/*    */   
/* 13 */   private ThemeDefinition(String name, boolean isDark, GlobalColors globalColors, GlobalMetrics globalMetrics, TextStyle defaultTextStyle, TextStyle editorTextStyle, TextStyle consoleTextStyle, long contentColor, ThemeColorPalette colorPalette, ThemeIconData iconData) { this.name = name;
/* 14 */     this.isDark = isDark;
/* 15 */     this.globalColors = globalColors;
/* 16 */     this.globalMetrics = globalMetrics;
/* 17 */     this.defaultTextStyle = defaultTextStyle;
/* 18 */     this.editorTextStyle = editorTextStyle;
/* 19 */     this.consoleTextStyle = consoleTextStyle;
/* 20 */     this.contentColor = contentColor;
/* 21 */     this.colorPalette = colorPalette;
/* 22 */     this.iconData = iconData; } @NotNull private final TextStyle editorTextStyle; @NotNull private final TextStyle consoleTextStyle; private final long contentColor; @NotNull private final ThemeColorPalette colorPalette; @NotNull private final ThemeIconData iconData; public static final int $stable; @NotNull public final String getName() { return this.name; } public final boolean isDark() { return this.isDark; } @NotNull public final GlobalColors getGlobalColors() { return this.globalColors; } @NotNull public final GlobalMetrics getGlobalMetrics() { return this.globalMetrics; } @NotNull public final ThemeIconData getIconData() { return this.iconData; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TextStyle getDefaultTextStyle() {
/*    */     return this.defaultTextStyle;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextStyle getEditorTextStyle() {
/*    */     return this.editorTextStyle;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextStyle getConsoleTextStyle() {
/*    */     return this.consoleTextStyle;
/*    */   }
/*    */   
/*    */   public final long getContentColor-0d7_KjU() {
/*    */     return this.contentColor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ThemeColorPalette getColorPalette() {
/*    */     return this.colorPalette;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ThemeDefinition))
/*    */       return false; 
/*    */     ThemeDefinition themeDefinition = (ThemeDefinition)other;
/*    */     return !Intrinsics.areEqual(this.name, themeDefinition.name) ? false : ((this.isDark != themeDefinition.isDark) ? false : (!Intrinsics.areEqual(this.globalColors, themeDefinition.globalColors) ? false : (!Intrinsics.areEqual(this.globalMetrics, themeDefinition.globalMetrics) ? false : (!Intrinsics.areEqual(this.defaultTextStyle, themeDefinition.defaultTextStyle) ? false : (!Intrinsics.areEqual(this.editorTextStyle, themeDefinition.editorTextStyle) ? false : (!Intrinsics.areEqual(this.consoleTextStyle, themeDefinition.consoleTextStyle) ? false : (!Color.equals-impl0(this.contentColor, themeDefinition.contentColor) ? false : (!Intrinsics.areEqual(this.colorPalette, themeDefinition.colorPalette) ? false : (!!Intrinsics.areEqual(this.iconData, themeDefinition.iconData))))))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + Boolean.hashCode(this.isDark);
/*    */     result = result * 31 + this.globalColors.hashCode();
/*    */     result = result * 31 + this.globalMetrics.hashCode();
/*    */     result = result * 31 + this.defaultTextStyle.hashCode();
/*    */     result = result * 31 + this.editorTextStyle.hashCode();
/*    */     result = result * 31 + this.consoleTextStyle.hashCode();
/*    */     result = result * 31 + Color.hashCode-impl(this.contentColor);
/*    */     result = result * 31 + this.colorPalette.hashCode();
/*    */     return result * 31 + this.iconData.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ThemeDefinition(name=" + this.name + ", isDark=" + this.isDark + ", globalColors=" + this.globalColors + ", globalMetrics=" + this.globalMetrics + ", defaultTextStyle=" + this.defaultTextStyle + ", editorTextStyle=" + this.editorTextStyle + ", consoleTextStyle=" + this.consoleTextStyle + ", contentColor=" + Color.toString-impl(this.contentColor) + ", colorPalette=" + this.colorPalette + ", iconData=" + this.iconData + ")";
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\theme\ThemeDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */