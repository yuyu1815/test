/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020$\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\020\n\002\020%\n\002\b\006\b'\030\0002\0020\001BQ\022\006\020\002\032\0020\003\022\024\020\004\032\020\022\004\022\0020\006\022\006\022\004\030\0010\0060\005\022\024\020\007\032\020\022\004\022\0020\006\022\006\022\004\030\0010\0060\005\022\024\020\b\032\020\022\004\022\0020\006\022\006\022\004\030\0010\t0\005¢\006\004\b\n\020\013J\027\020\033\032\004\030\0010\t2\006\020\034\032\0020\006H\004¢\006\002\b\035J5\020\036\032\004\030\0010\t2\006\020\037\032\0020\0062\024\020 \032\020\022\004\022\0020\006\022\006\022\004\030\0010\0060\0052\006\020\002\032\0020\003H\004¢\006\002\b!JZ\020\"\032\020\022\004\022\0020\t\022\004\022\0020\t\030\0010#2\006\020\037\032\0020\0062\022\020$\032\016\022\004\022\0020\t\022\004\022\0020\t0#2\022\020%\032\016\022\004\022\0020\t\022\004\022\0020\t0#2\022\020&\032\016\022\004\022\0020\t\022\004\022\0020\t0#H\004J\030\020'\032\0020\0222\006\020(\032\0020\0062\006\020)\032\0020\003H\004R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\002\020\fR\"\020\004\032\020\022\004\022\0020\006\022\006\022\004\030\0010\0060\005X\004¢\006\b\n\000\032\004\b\r\020\016R\"\020\007\032\020\022\004\022\0020\006\022\006\022\004\030\0010\0060\005X\004¢\006\b\n\000\032\004\b\017\020\016R\"\020\b\032\020\022\004\022\0020\006\022\006\022\004\030\0010\t0\005X\004¢\006\b\n\000\032\004\b\020\020\016R\022\020\021\032\0020\022X¤\004¢\006\006\032\004\b\023\020\024R\022\020\025\032\0020\022X¤\004¢\006\006\032\004\b\026\020\024R\022\020\027\032\0020\022X¤\004¢\006\006\032\004\b\030\020\024R\022\020\031\032\0020\022X¤\004¢\006\006\032\004\b\032\020\024¨\006&"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/PalettePainterHintsProvider;", "Lorg/jetbrains/jewel/ui/painter/PainterHintsProvider;", "isDark", "", "intellijIconPalette", "", "", "themeIconPalette", "themeColorPalette", "Landroidx/compose/ui/graphics/Color;", "<init>", "(ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "()Z", "getIntellijIconPalette", "()Ljava/util/Map;", "getThemeIconPalette", "getThemeColorPalette", "checkBoxByKeyPaletteHint", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "getCheckBoxByKeyPaletteHint", "()Lorg/jetbrains/jewel/ui/painter/PainterHint;", "checkBoxByColorPaletteHint", "getCheckBoxByColorPaletteHint", "treePaletteHint", "getTreePaletteHint", "uiPaletteHint", "getUiPaletteHint", "resolveColor", "value", "resolveColor-ijrfgN4", "resolveKeyColor", "key", "keyPalette", "resolveKeyColor-8tov2TA", "selectMap", "", "checkboxes", "trees", "ui", "getPaletteHint", "path", "isNewUi"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public abstract class PalettePainterHintsProvider implements PainterHintsProvider { private final boolean isDark;
/*    */   @NotNull
/*    */   private final Map<String, String> intellijIconPalette;
/*    */   
/*  8 */   public PalettePainterHintsProvider(boolean isDark, @NotNull Map<String, String> intellijIconPalette, @NotNull Map<String, String> themeIconPalette, @NotNull Map<String, Color> themeColorPalette) { this.isDark = isDark;
/*  9 */     this.intellijIconPalette = intellijIconPalette;
/* 10 */     this.themeIconPalette = themeIconPalette;
/* 11 */     this.themeColorPalette = themeColorPalette; } @NotNull private final Map<String, String> themeIconPalette; @NotNull private final Map<String, Color> themeColorPalette; public static final int $stable; @Composable @NotNull public List<PainterHint> priorityHints(@NotNull String path, @Nullable Composer $composer, int $changed) { return PainterHintsProvider.DefaultImpls.priorityHints(this, path, $composer, $changed); } protected final boolean isDark() { return this.isDark; } @NotNull protected final Map<String, Color> getThemeColorPalette() { return this.themeColorPalette; }
/*    */    @NotNull
/*    */   protected final Map<String, String> getIntellijIconPalette() {
/*    */     return this.intellijIconPalette;
/*    */   } @NotNull
/*    */   protected final Map<String, String> getThemeIconPalette() {
/*    */     return this.themeIconPalette;
/*    */   } @Nullable
/*    */   protected final Color resolveColor-ijrfgN4(@NotNull String value) {
/* 20 */     Intrinsics.checkNotNullParameter(value, "value"); Color namedColor = this.themeColorPalette.get(value);
/* 21 */     if (namedColor == null); return ColorExtensionsKt.fromRGBAHexStringOrNull(Color.Companion, value);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected final Color resolveKeyColor-8tov2TA(@NotNull String key, @NotNull Map keyPalette, boolean isDark) {
/* 26 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(keyPalette, "keyPalette"); String darkKey = key + ".Dark";
/* 27 */     String resolvedKey = (isDark && keyPalette.containsKey(darkKey)) ? darkKey : key;
/* 28 */     if ((Color.Companion)keyPalette.get(resolvedKey) == null) { (Color.Companion)keyPalette.get(resolvedKey); return null; }  return ColorExtensionsKt.fromRGBAHexStringOrNull((Color.Companion)keyPalette.get(resolvedKey), (Color.Companion)keyPalette.get(resolvedKey));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected final Map<Color, Color> selectMap(@NotNull String key, @NotNull Map<Color, Color> checkboxes, @NotNull Map<Color, Color> trees, @NotNull Map<Color, Color> ui) {
/* 37 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(checkboxes, "checkboxes"); Intrinsics.checkNotNullParameter(trees, "trees"); Intrinsics.checkNotNullParameter(ui, "ui"); return 
/* 38 */       StringsKt.startsWith$default(key, "Checkbox.", false, 2, null) ? checkboxes : (
/* 39 */       StringsKt.startsWith$default(key, "Tree.iconColor.", false, 2, null) ? trees : (
/* 40 */       (StringsKt.startsWith$default(key, "Objects.", false, 2, null) || StringsKt.startsWith$default(key, "Actions.", false, 2, null) || StringsKt.startsWith$default(key, "#", false, 2, null)) ? ui : 
/* 41 */       null));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   protected final PainterHint getPaletteHint(@NotNull String path, boolean isNewUi) {
/* 51 */     Intrinsics.checkNotNullParameter(path, "path"); if (!StringsKt.contains$default(path, "com/intellij/ide/ui/laf/icons/", false, 2, null) && !StringsKt.contains$default(path, "themes/expUI/icons/dark/", false, 2, null)) {
/* 52 */       return getUiPaletteHint();
/*    */     }
/* 54 */     String file = StringsKt.substringAfterLast$default(path, '/', null, 2, null);
/*    */ 
/*    */ 
/*    */     
/* 58 */     boolean isCheckboxScope = (StringsKt.startsWith$default(file, "check", false, 2, null) || StringsKt.startsWith$default(file, "radio", false, 2, null));
/*    */     
/* 60 */     return (
/* 61 */       Intrinsics.areEqual(file, "treeCollapsed.svg") || Intrinsics.areEqual(file, "treeExpanded.svg")) ? getTreePaletteHint() : (
/* 62 */       (isNewUi && isCheckboxScope) ? getCheckBoxByKeyPaletteHint() : (
/* 63 */       (!isNewUi && isCheckboxScope) ? getCheckBoxByColorPaletteHint() : 
/* 64 */       PainterHint.None));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected abstract PainterHint getCheckBoxByKeyPaletteHint();
/*    */   
/*    */   @NotNull
/*    */   protected abstract PainterHint getCheckBoxByColorPaletteHint();
/*    */   
/*    */   @NotNull
/*    */   protected abstract PainterHint getTreePaletteHint();
/*    */   
/*    */   @NotNull
/*    */   protected abstract PainterHint getUiPaletteHint(); }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\PalettePainterHintsProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */