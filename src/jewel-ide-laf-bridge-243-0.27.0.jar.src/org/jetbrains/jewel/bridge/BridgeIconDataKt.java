/*    */ package org.jetbrains.jewel.bridge;
/*    */ import com.intellij.ide.ui.laf.UIThemeExportableBean;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002¨\006\003"}, d2 = {"readFromLaF", "Lorg/jetbrains/jewel/foundation/theme/ThemeIconData;", "Lorg/jetbrains/jewel/foundation/theme/ThemeIconData$Companion;", "ide-laf-bridge"})
/*    */ public final class BridgeIconDataKt {
/*    */   @NotNull
/*    */   public static final ThemeIconData readFromLaF(@NotNull ThemeIconData.Companion $this$readFromLaF) {
/*  8 */     Intrinsics.checkNotNullParameter($this$readFromLaF, "<this>"); UIThemeLookAndFeelInfo uiTheme = UiThemeExtensionsKt.currentUiThemeOrNull();
/*  9 */     UIThemeExportableBean bean = (uiTheme != null) ? uiTheme.describe() : null;
/* 10 */     if (((bean != null) ? bean.getIcons() : null) == null) (bean != null) ? bean.getIcons() : null;  Map iconMap = MapsKt.emptyMap();
/* 11 */     if (((bean != null) ? bean.getIconColorsOnSelection() : null) == null) (bean != null) ? bean.getIconColorsOnSelection() : null;  Map selectedIconColorPalette = MapsKt.emptyMap();
/*    */     
/* 13 */     Map colorPalette = UITheme.Companion.getColorPalette();
/* 14 */     return new ThemeIconData(iconMap, colorPalette, selectedIconColorPalette);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\BridgeIconDataKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */